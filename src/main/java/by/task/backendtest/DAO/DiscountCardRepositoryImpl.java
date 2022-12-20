package by.task.backendtest.DAO;

import by.task.backendtest.store.discountCard.DiscountCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Repository
public class DiscountCardRepositoryImpl implements DiscountCardRepository {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public DiscountCardRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<DiscountCard> findAll() {
        String query = "SELECT * FROM discount_card";
        return jdbcTemplate.query(query, new DiscountCardRowMapper());
    }

    @Override
    public DiscountCard findById(int id) {
        String query = "SELECT * FROM discount_card WHERE id=" + id;
        return jdbcTemplate.queryForObject(query, new DiscountCardRowMapper());
    }
}

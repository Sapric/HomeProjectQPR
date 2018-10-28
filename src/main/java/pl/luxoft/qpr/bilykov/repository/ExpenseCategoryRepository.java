package pl.luxoft.qpr.bilykov.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.luxoft.qpr.bilykov.model.ExpenseCategory;

import java.util.List;

/**
 * Repository for expense category
 *
 * @author Bondar Dmytro.
 */
public interface ExpenseCategoryRepository extends JpaRepository<ExpenseCategory, Integer> {

    List<ExpenseCategory> findByParentIdCategoryId(int id);

    List<ExpenseCategory> findByUserUserId(int id);
}

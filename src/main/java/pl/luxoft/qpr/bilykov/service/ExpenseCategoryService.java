package pl.luxoft.qpr.bilykov.service;

import pl.luxoft.qpr.bilykov.dto.ExpenseCategoryRequest;
import pl.luxoft.qpr.bilykov.model.ExpenseCategory;

import java.util.List;

/**
 * @author Bondar Dmytro
 */

public interface ExpenseCategoryService {

    List<ExpenseCategory> getCategories();

    ExpenseCategory getCategory(Integer id);

    void add(ExpenseCategoryRequest request);

    void delete (Integer id);

    void changeName(Integer id, String newName);

    void changeParent(Integer id, Integer newParent);

    List<ExpenseCategory> getUsersCategory(Integer id);

    List<ExpenseCategory> getChildesCategory(Integer id);

}

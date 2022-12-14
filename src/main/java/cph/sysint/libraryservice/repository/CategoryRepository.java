package cph.sysint.libraryservice.repository;

import cph.sysint.libraryservice.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends PagingAndSortingRepository<Category, Integer> {
    Category findCategoryByCategoryName(String category);
    Page<Category> findAll(Pageable pageable);

}

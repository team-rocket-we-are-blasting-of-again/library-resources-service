package cph.sysint.libraryservice.service;

import cph.sysint.libraryservice.dto.GetTitleListResponse;
import cph.sysint.libraryservice.dto.TitleDTO;
import org.springframework.data.domain.Pageable;

public interface ITitleService {

    GetTitleListResponse getByCategory(String category, Pageable pageable);
    GetTitleListResponse getByYear(int year, Pageable pageable);
    GetTitleListResponse getByPublisher(String publisher, Pageable pageable);
    GetTitleListResponse getByTitle(String title, Pageable pageable);
    GetTitleListResponse getByPriceRange(double min, double max, Pageable pageable);

    TitleDTO getById(int id);
}

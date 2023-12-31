
package com.novProject.domain.posts;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostsRepository extends JpaRepository<Posts, Long>{
    @Query("SELECT p FROM Posts p ORDER BY p.id DESC")
    Page<Posts> findAllDesc(Pageable pageable);

    Page<Posts> findByTitleContaining(String keyword_2, Pageable pageable); //검색 기능
    Page<Posts> findByCategoryAndTitleContaining(String Keyword_1, String Keyword_2, Pageable pageable); //다중 검색
}

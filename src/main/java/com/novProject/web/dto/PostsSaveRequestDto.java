// Controller Layer, Service Layer에서 사용할 Dto 클래스
// 등록

package com.novProject.web.dto;

import com.novProject.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {
    private String title;
    private String content;
    private String author;
    private String category;
    @Builder //빌더패턴 자동 생성 롬복
    public PostsSaveRequestDto(String title, String content, String author, String category){
        this.title = title;
        this.content = content;
        this.author = author;
        this.category = category;
    }

    public Posts toEntity(){
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .category(category)
                .build();
    }
}

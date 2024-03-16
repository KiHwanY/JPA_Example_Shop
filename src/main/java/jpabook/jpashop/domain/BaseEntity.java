package jpabook.jpashop.domain;

import jakarta.persistence.MappedSuperclass;

import java.time.LocalDateTime;

@MappedSuperclass // 맵핑 정보만 받는 슈퍼 클래스
public abstract class BaseEntity { // 추상 클래스


    private String createdBy;
    private LocalDateTime createdLocalDate;

    private String modifiedBy;
    private LocalDateTime modifiedLocalDate;

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getCreatedLocalDate() {
        return createdLocalDate;
    }

    public void setCreatedLocalDate(LocalDateTime createdLocalDate) {
        this.createdLocalDate = createdLocalDate;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public LocalDateTime getModifiedLocalDate() {
        return modifiedLocalDate;
    }

    public void setModifiedLocalDate(LocalDateTime modifiedLocalDate) {
        this.modifiedLocalDate = modifiedLocalDate;
    }
}

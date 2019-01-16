package com.aerothinker.plandb.service.dto;

import java.io.Serializable;
import java.util.Objects;
import io.github.jhipster.service.filter.BooleanFilter;
import io.github.jhipster.service.filter.DoubleFilter;
import io.github.jhipster.service.filter.Filter;
import io.github.jhipster.service.filter.FloatFilter;
import io.github.jhipster.service.filter.IntegerFilter;
import io.github.jhipster.service.filter.LongFilter;
import io.github.jhipster.service.filter.StringFilter;
import io.github.jhipster.service.filter.InstantFilter;

/**
 * Criteria class for the VerifyRec entity. This class is used in VerifyRecResource to
 * receive all the possible filtering options from the Http GET request parameters.
 * For example the following could be a valid requests:
 * <code> /verify-recs?id.greaterThan=5&amp;attr1.contains=something&amp;attr2.specified=false</code>
 * As Spring is unable to properly convert the types, unless specific {@link Filter} class are used, we need to use
 * fix type specific filters.
 */
public class VerifyRecCriteria implements Serializable {

    private static final long serialVersionUID = 1L;

    private LongFilter id;

    private StringFilter name;

    private StringFilter descString;

    private BooleanFilter verifyResult;

    private IntegerFilter verifyScore;

    private StringFilter remarks;

    private InstantFilter insertTime;

    private InstantFilter updateTime;

    private LongFilter creatorId;

    private LongFilter modifiedById;

    public LongFilter getId() {
        return id;
    }

    public void setId(LongFilter id) {
        this.id = id;
    }

    public StringFilter getName() {
        return name;
    }

    public void setName(StringFilter name) {
        this.name = name;
    }

    public StringFilter getDescString() {
        return descString;
    }

    public void setDescString(StringFilter descString) {
        this.descString = descString;
    }

    public BooleanFilter getVerifyResult() {
        return verifyResult;
    }

    public void setVerifyResult(BooleanFilter verifyResult) {
        this.verifyResult = verifyResult;
    }

    public IntegerFilter getVerifyScore() {
        return verifyScore;
    }

    public void setVerifyScore(IntegerFilter verifyScore) {
        this.verifyScore = verifyScore;
    }

    public StringFilter getRemarks() {
        return remarks;
    }

    public void setRemarks(StringFilter remarks) {
        this.remarks = remarks;
    }

    public InstantFilter getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(InstantFilter insertTime) {
        this.insertTime = insertTime;
    }

    public InstantFilter getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(InstantFilter updateTime) {
        this.updateTime = updateTime;
    }

    public LongFilter getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(LongFilter creatorId) {
        this.creatorId = creatorId;
    }

    public LongFilter getModifiedById() {
        return modifiedById;
    }

    public void setModifiedById(LongFilter modifiedById) {
        this.modifiedById = modifiedById;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final VerifyRecCriteria that = (VerifyRecCriteria) o;
        return
            Objects.equals(id, that.id) &&
            Objects.equals(name, that.name) &&
            Objects.equals(descString, that.descString) &&
            Objects.equals(verifyResult, that.verifyResult) &&
            Objects.equals(verifyScore, that.verifyScore) &&
            Objects.equals(remarks, that.remarks) &&
            Objects.equals(insertTime, that.insertTime) &&
            Objects.equals(updateTime, that.updateTime) &&
            Objects.equals(creatorId, that.creatorId) &&
            Objects.equals(modifiedById, that.modifiedById);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
        id,
        name,
        descString,
        verifyResult,
        verifyScore,
        remarks,
        insertTime,
        updateTime,
        creatorId,
        modifiedById
        );
    }

    @Override
    public String toString() {
        return "VerifyRecCriteria{" +
                (id != null ? "id=" + id + ", " : "") +
                (name != null ? "name=" + name + ", " : "") +
                (descString != null ? "descString=" + descString + ", " : "") +
                (verifyResult != null ? "verifyResult=" + verifyResult + ", " : "") +
                (verifyScore != null ? "verifyScore=" + verifyScore + ", " : "") +
                (remarks != null ? "remarks=" + remarks + ", " : "") +
                (insertTime != null ? "insertTime=" + insertTime + ", " : "") +
                (updateTime != null ? "updateTime=" + updateTime + ", " : "") +
                (creatorId != null ? "creatorId=" + creatorId + ", " : "") +
                (modifiedById != null ? "modifiedById=" + modifiedById + ", " : "") +
            "}";
    }

}

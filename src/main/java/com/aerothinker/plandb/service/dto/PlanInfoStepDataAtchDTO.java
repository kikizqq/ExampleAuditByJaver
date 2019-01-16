package com.aerothinker.plandb.service.dto;

import java.time.Instant;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Lob;
import com.aerothinker.plandb.domain.enumeration.ValidType;

/**
 * A DTO for the PlanInfoStepDataAtch entity.
 */
public class PlanInfoStepDataAtchDTO implements Serializable {

    private Long id;

    @NotNull
    @Size(max = 1000)
    private String name;

    @Size(max = 4000)
    private String storeDir;

    @Size(max = 4000)
    private String storeName;

    @Size(max = 10)
    private String sortString;

    @Size(max = 256)
    private String fileType;

    private Boolean deleteFlag;

    @Size(max = 256)
    private String storeType;

    @Size(max = 256)
    private String ver;

    @Size(max = 256)
    private String encryptedFlag;

    @Size(max = 256)
    private String encryptedType;

    @Size(max = 4000)
    private String jsonString;

    @Size(max = 4000)
    private String remarks;

    @Size(max = 4000)
    private String attachmentPath;

    @Lob
    private byte[] attachmentBlob;
    private String attachmentBlobContentType;

    @Size(max = 4000)
    private String attachmentName;

    @Lob
    private String textBlob;

    @Lob
    private byte[] imageBlob;
    private String imageBlobContentType;

    @Size(max = 4000)
    private String imageBlobName;

    private ValidType validType;

    private Instant validBegin;

    private Instant validEnd;

    private Instant insertTime;

    private Instant updateTime;

    private Long creatorId;

    private String creatorUserName;

    private Long modifiedById;

    private String modifiedByUserName;

    private Long planInfoStepAtchId;

    private String planInfoStepAtchName;

    private Long planInfoStepDataId;

    private String planInfoStepDataName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStoreDir() {
        return storeDir;
    }

    public void setStoreDir(String storeDir) {
        this.storeDir = storeDir;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getSortString() {
        return sortString;
    }

    public void setSortString(String sortString) {
        this.sortString = sortString;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public Boolean isDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getStoreType() {
        return storeType;
    }

    public void setStoreType(String storeType) {
        this.storeType = storeType;
    }

    public String getVer() {
        return ver;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }

    public String getEncryptedFlag() {
        return encryptedFlag;
    }

    public void setEncryptedFlag(String encryptedFlag) {
        this.encryptedFlag = encryptedFlag;
    }

    public String getEncryptedType() {
        return encryptedType;
    }

    public void setEncryptedType(String encryptedType) {
        this.encryptedType = encryptedType;
    }

    public String getJsonString() {
        return jsonString;
    }

    public void setJsonString(String jsonString) {
        this.jsonString = jsonString;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getAttachmentPath() {
        return attachmentPath;
    }

    public void setAttachmentPath(String attachmentPath) {
        this.attachmentPath = attachmentPath;
    }

    public byte[] getAttachmentBlob() {
        return attachmentBlob;
    }

    public void setAttachmentBlob(byte[] attachmentBlob) {
        this.attachmentBlob = attachmentBlob;
    }

    public String getAttachmentBlobContentType() {
        return attachmentBlobContentType;
    }

    public void setAttachmentBlobContentType(String attachmentBlobContentType) {
        this.attachmentBlobContentType = attachmentBlobContentType;
    }

    public String getAttachmentName() {
        return attachmentName;
    }

    public void setAttachmentName(String attachmentName) {
        this.attachmentName = attachmentName;
    }

    public String getTextBlob() {
        return textBlob;
    }

    public void setTextBlob(String textBlob) {
        this.textBlob = textBlob;
    }

    public byte[] getImageBlob() {
        return imageBlob;
    }

    public void setImageBlob(byte[] imageBlob) {
        this.imageBlob = imageBlob;
    }

    public String getImageBlobContentType() {
        return imageBlobContentType;
    }

    public void setImageBlobContentType(String imageBlobContentType) {
        this.imageBlobContentType = imageBlobContentType;
    }

    public String getImageBlobName() {
        return imageBlobName;
    }

    public void setImageBlobName(String imageBlobName) {
        this.imageBlobName = imageBlobName;
    }

    public ValidType getValidType() {
        return validType;
    }

    public void setValidType(ValidType validType) {
        this.validType = validType;
    }

    public Instant getValidBegin() {
        return validBegin;
    }

    public void setValidBegin(Instant validBegin) {
        this.validBegin = validBegin;
    }

    public Instant getValidEnd() {
        return validEnd;
    }

    public void setValidEnd(Instant validEnd) {
        this.validEnd = validEnd;
    }

    public Instant getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Instant insertTime) {
        this.insertTime = insertTime;
    }

    public Instant getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Instant updateTime) {
        this.updateTime = updateTime;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long rmsUserId) {
        this.creatorId = rmsUserId;
    }

    public String getCreatorUserName() {
        return creatorUserName;
    }

    public void setCreatorUserName(String rmsUserUserName) {
        this.creatorUserName = rmsUserUserName;
    }

    public Long getModifiedById() {
        return modifiedById;
    }

    public void setModifiedById(Long rmsUserId) {
        this.modifiedById = rmsUserId;
    }

    public String getModifiedByUserName() {
        return modifiedByUserName;
    }

    public void setModifiedByUserName(String rmsUserUserName) {
        this.modifiedByUserName = rmsUserUserName;
    }

    public Long getPlanInfoStepAtchId() {
        return planInfoStepAtchId;
    }

    public void setPlanInfoStepAtchId(Long planInfoStepAtchId) {
        this.planInfoStepAtchId = planInfoStepAtchId;
    }

    public String getPlanInfoStepAtchName() {
        return planInfoStepAtchName;
    }

    public void setPlanInfoStepAtchName(String planInfoStepAtchName) {
        this.planInfoStepAtchName = planInfoStepAtchName;
    }

    public Long getPlanInfoStepDataId() {
        return planInfoStepDataId;
    }

    public void setPlanInfoStepDataId(Long planInfoStepDataId) {
        this.planInfoStepDataId = planInfoStepDataId;
    }

    public String getPlanInfoStepDataName() {
        return planInfoStepDataName;
    }

    public void setPlanInfoStepDataName(String planInfoStepDataName) {
        this.planInfoStepDataName = planInfoStepDataName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        PlanInfoStepDataAtchDTO planInfoStepDataAtchDTO = (PlanInfoStepDataAtchDTO) o;
        if (planInfoStepDataAtchDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), planInfoStepDataAtchDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "PlanInfoStepDataAtchDTO{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", storeDir='" + getStoreDir() + "'" +
            ", storeName='" + getStoreName() + "'" +
            ", sortString='" + getSortString() + "'" +
            ", fileType='" + getFileType() + "'" +
            ", deleteFlag='" + isDeleteFlag() + "'" +
            ", storeType='" + getStoreType() + "'" +
            ", ver='" + getVer() + "'" +
            ", encryptedFlag='" + getEncryptedFlag() + "'" +
            ", encryptedType='" + getEncryptedType() + "'" +
            ", jsonString='" + getJsonString() + "'" +
            ", remarks='" + getRemarks() + "'" +
            ", attachmentPath='" + getAttachmentPath() + "'" +
            ", attachmentBlob='" + getAttachmentBlob() + "'" +
            ", attachmentName='" + getAttachmentName() + "'" +
            ", textBlob='" + getTextBlob() + "'" +
            ", imageBlob='" + getImageBlob() + "'" +
            ", imageBlobName='" + getImageBlobName() + "'" +
            ", validType='" + getValidType() + "'" +
            ", validBegin='" + getValidBegin() + "'" +
            ", validEnd='" + getValidEnd() + "'" +
            ", insertTime='" + getInsertTime() + "'" +
            ", updateTime='" + getUpdateTime() + "'" +
            ", creator=" + getCreatorId() +
            ", creator='" + getCreatorUserName() + "'" +
            ", modifiedBy=" + getModifiedById() +
            ", modifiedBy='" + getModifiedByUserName() + "'" +
            ", planInfoStepAtch=" + getPlanInfoStepAtchId() +
            ", planInfoStepAtch='" + getPlanInfoStepAtchName() + "'" +
            ", planInfoStepData=" + getPlanInfoStepDataId() +
            ", planInfoStepData='" + getPlanInfoStepDataName() + "'" +
            "}";
    }
}

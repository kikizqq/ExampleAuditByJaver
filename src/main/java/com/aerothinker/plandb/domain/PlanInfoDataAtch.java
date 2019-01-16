package com.aerothinker.plandb.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.*;

import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import com.aerothinker.plandb.domain.enumeration.ValidType;

/**
 * attachment 预案数据附件表
 * @author JungleYang
 */
@ApiModel(description = "attachment 预案数据附件表 @author JungleYang")
@Entity
@Table(name = "plan_info_data_atch")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Document(indexName = "planinfodataatch")
public class PlanInfoDataAtch implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    /**
     * 名称
     */
    @NotNull
    @Size(max = 1000)
    @ApiModelProperty(value = "名称", required = true)
    @Column(name = "name", length = 1000, nullable = false)
    private String name;

    /**
     * 存储路径
     */
    @Size(max = 4000)
    @ApiModelProperty(value = "存储路径")
    @Column(name = "store_dir", length = 4000)
    private String storeDir;

    /**
     * 存储名称
     */
    @Size(max = 4000)
    @ApiModelProperty(value = "存储名称")
    @Column(name = "store_name", length = 4000)
    private String storeName;

    /**
     * 序号
     */
    @Size(max = 10)
    @ApiModelProperty(value = "序号")
    @Column(name = "sort_string", length = 10)
    private String sortString;

    /**
     * 文件类型
     */
    @Size(max = 256)
    @ApiModelProperty(value = "文件类型")
    @Column(name = "file_type", length = 256)
    private String fileType;

    /**
     * 删除标志
     */
    @ApiModelProperty(value = "删除标志")
    @Column(name = "delete_flag")
    private Boolean deleteFlag;

    /**
     * 存储类型
     */
    @Size(max = 256)
    @ApiModelProperty(value = "存储类型")
    @Column(name = "store_type", length = 256)
    private String storeType;

    /**
     * 版本
     */
    @Size(max = 256)
    @ApiModelProperty(value = "版本")
    @Column(name = "ver", length = 256)
    private String ver;

    /**
     * 加密标志
     */
    @Size(max = 256)
    @ApiModelProperty(value = "加密标志")
    @Column(name = "encrypted_flag", length = 256)
    private String encryptedFlag;

    /**
     * 加密类型
     */
    @Size(max = 256)
    @ApiModelProperty(value = "加密类型")
    @Column(name = "encrypted_type", length = 256)
    private String encryptedType;

    /**
     * json格式数据
     */
    @Size(max = 4000)
    @ApiModelProperty(value = "json格式数据")
    @Column(name = "json_string", length = 4000)
    private String jsonString;

    /**
     * 备注
     */
    @Size(max = 4000)
    @ApiModelProperty(value = "备注")
    @Column(name = "remarks", length = 4000)
    private String remarks;

    /**
     * 附件路径
     */
    @Size(max = 4000)
    @ApiModelProperty(value = "附件路径")
    @Column(name = "attachment_path", length = 4000)
    private String attachmentPath;

    /**
     * 附件
     */
    @ApiModelProperty(value = "附件")
    @Lob
    @Column(name = "attachment_blob")
    private byte[] attachmentBlob;

    @Column(name = "attachment_blob_content_type")
    private String attachmentBlobContentType;

    /**
     * 附件名称
     */
    @Size(max = 4000)
    @ApiModelProperty(value = "附件名称")
    @Column(name = "attachment_name", length = 4000)
    private String attachmentName;

    /**
     * 文本附件
     */
    @ApiModelProperty(value = "文本附件")
    @Lob
    @Column(name = "text_blob")
    private String textBlob;

    /**
     * 图片附件
     */
    @ApiModelProperty(value = "图片附件")
    @Lob
    @Column(name = "image_blob")
    private byte[] imageBlob;

    @Column(name = "image_blob_content_type")
    private String imageBlobContentType;

    /**
     * 附件名称
     */
    @Size(max = 4000)
    @ApiModelProperty(value = "附件名称")
    @Column(name = "image_blob_name", length = 4000)
    private String imageBlobName;

    /**
     * 有效类型
     */
    @ApiModelProperty(value = "有效类型")
    @Enumerated(EnumType.STRING)
    @Column(name = "valid_type")
    private ValidType validType;

    /**
     * 生效开始时间
     */
    @ApiModelProperty(value = "生效开始时间")
    @Column(name = "valid_begin")
    private Instant validBegin;

    /**
     * 有效截止时间
     */
    @ApiModelProperty(value = "有效截止时间")
    @Column(name = "valid_end")
    private Instant validEnd;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    @Column(name = "insert_time")
    private Instant insertTime;

    /**
     * 最后修改时间
     */
    @ApiModelProperty(value = "最后修改时间")
    @Column(name = "update_time")
    private Instant updateTime;

    @ManyToOne
    @JsonIgnoreProperties("")
    private RmsUser creator;

    @ManyToOne
    @JsonIgnoreProperties("")
    private RmsUser modifiedBy;

    @ManyToOne
    @JsonIgnoreProperties("")
    private PlanInfoAtch planInfoAtch;

    @ManyToOne
    @JsonIgnoreProperties("")
    private PlanInfoData planInfoData;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public PlanInfoDataAtch name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStoreDir() {
        return storeDir;
    }

    public PlanInfoDataAtch storeDir(String storeDir) {
        this.storeDir = storeDir;
        return this;
    }

    public void setStoreDir(String storeDir) {
        this.storeDir = storeDir;
    }

    public String getStoreName() {
        return storeName;
    }

    public PlanInfoDataAtch storeName(String storeName) {
        this.storeName = storeName;
        return this;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getSortString() {
        return sortString;
    }

    public PlanInfoDataAtch sortString(String sortString) {
        this.sortString = sortString;
        return this;
    }

    public void setSortString(String sortString) {
        this.sortString = sortString;
    }

    public String getFileType() {
        return fileType;
    }

    public PlanInfoDataAtch fileType(String fileType) {
        this.fileType = fileType;
        return this;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public Boolean isDeleteFlag() {
        return deleteFlag;
    }

    public PlanInfoDataAtch deleteFlag(Boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
        return this;
    }

    public void setDeleteFlag(Boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getStoreType() {
        return storeType;
    }

    public PlanInfoDataAtch storeType(String storeType) {
        this.storeType = storeType;
        return this;
    }

    public void setStoreType(String storeType) {
        this.storeType = storeType;
    }

    public String getVer() {
        return ver;
    }

    public PlanInfoDataAtch ver(String ver) {
        this.ver = ver;
        return this;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }

    public String getEncryptedFlag() {
        return encryptedFlag;
    }

    public PlanInfoDataAtch encryptedFlag(String encryptedFlag) {
        this.encryptedFlag = encryptedFlag;
        return this;
    }

    public void setEncryptedFlag(String encryptedFlag) {
        this.encryptedFlag = encryptedFlag;
    }

    public String getEncryptedType() {
        return encryptedType;
    }

    public PlanInfoDataAtch encryptedType(String encryptedType) {
        this.encryptedType = encryptedType;
        return this;
    }

    public void setEncryptedType(String encryptedType) {
        this.encryptedType = encryptedType;
    }

    public String getJsonString() {
        return jsonString;
    }

    public PlanInfoDataAtch jsonString(String jsonString) {
        this.jsonString = jsonString;
        return this;
    }

    public void setJsonString(String jsonString) {
        this.jsonString = jsonString;
    }

    public String getRemarks() {
        return remarks;
    }

    public PlanInfoDataAtch remarks(String remarks) {
        this.remarks = remarks;
        return this;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getAttachmentPath() {
        return attachmentPath;
    }

    public PlanInfoDataAtch attachmentPath(String attachmentPath) {
        this.attachmentPath = attachmentPath;
        return this;
    }

    public void setAttachmentPath(String attachmentPath) {
        this.attachmentPath = attachmentPath;
    }

    public byte[] getAttachmentBlob() {
        return attachmentBlob;
    }

    public PlanInfoDataAtch attachmentBlob(byte[] attachmentBlob) {
        this.attachmentBlob = attachmentBlob;
        return this;
    }

    public void setAttachmentBlob(byte[] attachmentBlob) {
        this.attachmentBlob = attachmentBlob;
    }

    public String getAttachmentBlobContentType() {
        return attachmentBlobContentType;
    }

    public PlanInfoDataAtch attachmentBlobContentType(String attachmentBlobContentType) {
        this.attachmentBlobContentType = attachmentBlobContentType;
        return this;
    }

    public void setAttachmentBlobContentType(String attachmentBlobContentType) {
        this.attachmentBlobContentType = attachmentBlobContentType;
    }

    public String getAttachmentName() {
        return attachmentName;
    }

    public PlanInfoDataAtch attachmentName(String attachmentName) {
        this.attachmentName = attachmentName;
        return this;
    }

    public void setAttachmentName(String attachmentName) {
        this.attachmentName = attachmentName;
    }

    public String getTextBlob() {
        return textBlob;
    }

    public PlanInfoDataAtch textBlob(String textBlob) {
        this.textBlob = textBlob;
        return this;
    }

    public void setTextBlob(String textBlob) {
        this.textBlob = textBlob;
    }

    public byte[] getImageBlob() {
        return imageBlob;
    }

    public PlanInfoDataAtch imageBlob(byte[] imageBlob) {
        this.imageBlob = imageBlob;
        return this;
    }

    public void setImageBlob(byte[] imageBlob) {
        this.imageBlob = imageBlob;
    }

    public String getImageBlobContentType() {
        return imageBlobContentType;
    }

    public PlanInfoDataAtch imageBlobContentType(String imageBlobContentType) {
        this.imageBlobContentType = imageBlobContentType;
        return this;
    }

    public void setImageBlobContentType(String imageBlobContentType) {
        this.imageBlobContentType = imageBlobContentType;
    }

    public String getImageBlobName() {
        return imageBlobName;
    }

    public PlanInfoDataAtch imageBlobName(String imageBlobName) {
        this.imageBlobName = imageBlobName;
        return this;
    }

    public void setImageBlobName(String imageBlobName) {
        this.imageBlobName = imageBlobName;
    }

    public ValidType getValidType() {
        return validType;
    }

    public PlanInfoDataAtch validType(ValidType validType) {
        this.validType = validType;
        return this;
    }

    public void setValidType(ValidType validType) {
        this.validType = validType;
    }

    public Instant getValidBegin() {
        return validBegin;
    }

    public PlanInfoDataAtch validBegin(Instant validBegin) {
        this.validBegin = validBegin;
        return this;
    }

    public void setValidBegin(Instant validBegin) {
        this.validBegin = validBegin;
    }

    public Instant getValidEnd() {
        return validEnd;
    }

    public PlanInfoDataAtch validEnd(Instant validEnd) {
        this.validEnd = validEnd;
        return this;
    }

    public void setValidEnd(Instant validEnd) {
        this.validEnd = validEnd;
    }

    public Instant getInsertTime() {
        return insertTime;
    }

    public PlanInfoDataAtch insertTime(Instant insertTime) {
        this.insertTime = insertTime;
        return this;
    }

    public void setInsertTime(Instant insertTime) {
        this.insertTime = insertTime;
    }

    public Instant getUpdateTime() {
        return updateTime;
    }

    public PlanInfoDataAtch updateTime(Instant updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public void setUpdateTime(Instant updateTime) {
        this.updateTime = updateTime;
    }

    public RmsUser getCreator() {
        return creator;
    }

    public PlanInfoDataAtch creator(RmsUser rmsUser) {
        this.creator = rmsUser;
        return this;
    }

    public void setCreator(RmsUser rmsUser) {
        this.creator = rmsUser;
    }

    public RmsUser getModifiedBy() {
        return modifiedBy;
    }

    public PlanInfoDataAtch modifiedBy(RmsUser rmsUser) {
        this.modifiedBy = rmsUser;
        return this;
    }

    public void setModifiedBy(RmsUser rmsUser) {
        this.modifiedBy = rmsUser;
    }

    public PlanInfoAtch getPlanInfoAtch() {
        return planInfoAtch;
    }

    public PlanInfoDataAtch planInfoAtch(PlanInfoAtch planInfoAtch) {
        this.planInfoAtch = planInfoAtch;
        return this;
    }

    public void setPlanInfoAtch(PlanInfoAtch planInfoAtch) {
        this.planInfoAtch = planInfoAtch;
    }

    public PlanInfoData getPlanInfoData() {
        return planInfoData;
    }

    public PlanInfoDataAtch planInfoData(PlanInfoData planInfoData) {
        this.planInfoData = planInfoData;
        return this;
    }

    public void setPlanInfoData(PlanInfoData planInfoData) {
        this.planInfoData = planInfoData;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PlanInfoDataAtch planInfoDataAtch = (PlanInfoDataAtch) o;
        if (planInfoDataAtch.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), planInfoDataAtch.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "PlanInfoDataAtch{" +
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
            ", attachmentBlobContentType='" + getAttachmentBlobContentType() + "'" +
            ", attachmentName='" + getAttachmentName() + "'" +
            ", textBlob='" + getTextBlob() + "'" +
            ", imageBlob='" + getImageBlob() + "'" +
            ", imageBlobContentType='" + getImageBlobContentType() + "'" +
            ", imageBlobName='" + getImageBlobName() + "'" +
            ", validType='" + getValidType() + "'" +
            ", validBegin='" + getValidBegin() + "'" +
            ", validEnd='" + getValidEnd() + "'" +
            ", insertTime='" + getInsertTime() + "'" +
            ", updateTime='" + getUpdateTime() + "'" +
            "}";
    }
}

import { Moment } from 'moment';

export const enum ValidType {
    LONG = 'LONG',
    SCOPE = 'SCOPE'
}

export interface IPlanInfoStepAtchSdmSuffix {
    id?: number;
    name?: string;
    storeDir?: string;
    storeName?: string;
    sortString?: string;
    fileType?: string;
    deleteFlag?: boolean;
    storeType?: string;
    ver?: string;
    encryptedFlag?: string;
    encryptedType?: string;
    jsonString?: string;
    remarks?: string;
    attachmentPath?: string;
    attachmentBlobContentType?: string;
    attachmentBlob?: any;
    attachmentName?: string;
    textBlob?: any;
    imageBlobContentType?: string;
    imageBlob?: any;
    imageBlobName?: string;
    validType?: ValidType;
    validBegin?: Moment;
    validEnd?: Moment;
    insertTime?: Moment;
    updateTime?: Moment;
    creatorUserName?: string;
    creatorId?: number;
    modifiedByUserName?: string;
    modifiedById?: number;
    planInfoStepName?: string;
    planInfoStepId?: number;
}

export class PlanInfoStepAtchSdmSuffix implements IPlanInfoStepAtchSdmSuffix {
    constructor(
        public id?: number,
        public name?: string,
        public storeDir?: string,
        public storeName?: string,
        public sortString?: string,
        public fileType?: string,
        public deleteFlag?: boolean,
        public storeType?: string,
        public ver?: string,
        public encryptedFlag?: string,
        public encryptedType?: string,
        public jsonString?: string,
        public remarks?: string,
        public attachmentPath?: string,
        public attachmentBlobContentType?: string,
        public attachmentBlob?: any,
        public attachmentName?: string,
        public textBlob?: any,
        public imageBlobContentType?: string,
        public imageBlob?: any,
        public imageBlobName?: string,
        public validType?: ValidType,
        public validBegin?: Moment,
        public validEnd?: Moment,
        public insertTime?: Moment,
        public updateTime?: Moment,
        public creatorUserName?: string,
        public creatorId?: number,
        public modifiedByUserName?: string,
        public modifiedById?: number,
        public planInfoStepName?: string,
        public planInfoStepId?: number
    ) {
        this.deleteFlag = this.deleteFlag || false;
    }
}

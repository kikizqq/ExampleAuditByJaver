import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { JhiDataUtils } from 'ng-jhipster';

import { IPlanInfoDataAtchHisSdmSuffix } from 'app/shared/model/plan-info-data-atch-his-sdm-suffix.model';

@Component({
    selector: 'jhi-plan-info-data-atch-his-sdm-suffix-detail',
    templateUrl: './plan-info-data-atch-his-sdm-suffix-detail.component.html'
})
export class PlanInfoDataAtchHisSdmSuffixDetailComponent implements OnInit {
    planInfoDataAtchHis: IPlanInfoDataAtchHisSdmSuffix;

    constructor(protected dataUtils: JhiDataUtils, protected activatedRoute: ActivatedRoute) {}

    ngOnInit() {
        this.activatedRoute.data.subscribe(({ planInfoDataAtchHis }) => {
            this.planInfoDataAtchHis = planInfoDataAtchHis;
        });
    }

    byteSize(field) {
        return this.dataUtils.byteSize(field);
    }

    openFile(contentType, field) {
        return this.dataUtils.openFile(contentType, field);
    }
    previousState() {
        window.history.back();
    }
}

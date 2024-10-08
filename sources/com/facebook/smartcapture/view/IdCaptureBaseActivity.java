package com.facebook.smartcapture.view;

import X.0Yt;
import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass0fD;
import X.C13582Td8;
import X.C13722Tfo;
import X.C13857Tic;
import X.C13949TmA;
import X.C73912Pln;
import X.C8878RDv;
import X.C9866Rif;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.smartcapture.docauth.DocumentType;
import com.facebook.smartcapture.flow.IdCaptureConfig;
import com.facebook.smartcapture.logging.IdCaptureLogger;
import com.facebook.smartcapture.logging.IdCaptureStep;
import com.facebook.smartcapture.logging.SelfieCaptureLogger;
import com.facebook.smartcapture.ui.IdCaptureUi;
import java.util.Map;

public abstract class IdCaptureBaseActivity extends FragmentActivity implements C13722Tfo, C13949TmA {
    public Resources A00;
    public DocumentType A01 = DocumentType.ID1;
    public IdCaptureConfig A02;
    public IdCaptureLogger A03;
    public IdCaptureStep A04;
    public IdCaptureStep A05 = IdCaptureStep.INITIAL;
    public C13857Tic A06;
    public IdCaptureUi A07;
    public C9866Rif A08;
    public boolean A09;
    public final AnonymousClass0eM A0A = AnonymousClass0eN.A01(new C73912Pln(this, 26));

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.smartcapture.view.IdCaptureBaseActivity, android.app.Activity] */
    public void onBackPressed() {
        setResult(0);
        finish();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        IdCaptureBaseActivity.super.onSaveInstanceState(bundle);
        bundle.putBoolean(SelfieCaptureLogger.ARG_STEP_CHANGE_LOGGED, this.A09);
    }

    public final IdCaptureConfig A01() {
        IdCaptureConfig idCaptureConfig = this.A02;
        if (idCaptureConfig != null) {
            return idCaptureConfig;
        }
        0qQ.A0F("idCaptureConfig");
        throw AnonymousClass00P.createAndThrow();
    }

    public final IdCaptureLogger A02() {
        IdCaptureLogger idCaptureLogger = this.A03;
        if (idCaptureLogger != null) {
            return idCaptureLogger;
        }
        0qQ.A0F("mIdCaptureLogger");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.smartcapture.view.IdCaptureBaseActivity, android.app.Activity] */
    public final IdCaptureStep A03() {
        if (this instanceof PhotoReviewActivity) {
            if (getIntent().getSerializableExtra("capture_stage") == C8878RDv.ID_FRONT_SIDE) {
                return IdCaptureStep.FIRST_PHOTO_CONFIRMATION;
            }
            return IdCaptureStep.SECOND_PHOTO_CONFIRMATION;
        } else if (this instanceof PermissionsActivity) {
            return IdCaptureStep.PERMISSIONS;
        } else {
            if (this.A05 == IdCaptureStep.FIRST_PHOTO_CONFIRMATION) {
                return IdCaptureStep.SECOND_PHOTO_CAPTURE;
            }
            return IdCaptureStep.FIRST_PHOTO_CAPTURE;
        }
    }

    public final C13857Tic Az2() {
        return this.A06;
    }

    public final Map BEc() {
        IdCaptureUi idCaptureUi = this.A07;
        if (idCaptureUi != null) {
            return idCaptureUi.C1o();
        }
        return 0Yt.A0E();
    }

    public final C13582Td8 C1r() {
        return (C13582Td8) this.A0A.getValue();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.ContextThemeWrapper, com.facebook.smartcapture.view.IdCaptureBaseActivity] */
    public final Resources getResources() {
        Resources resources = this.A00;
        if (resources != null) {
            return resources;
        }
        Resources resources2 = IdCaptureBaseActivity.super.getResources();
        0qQ.A07(resources2);
        return resources2;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == 0) {
            this.A09 = false;
        }
        IdCaptureBaseActivity.super.onActivityResult(i, i2, intent);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: androidx.fragment.app.FragmentActivity} */
    /* JADX WARNING: type inference failed for: r0v10, types: [com.facebook.smartcapture.logging.IdCaptureLogger, com.facebook.smartcapture.logging.BaseLogger] */
    /* JADX WARNING: type inference failed for: r0v31, types: [X.Rif, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v32, types: [com.facebook.smartcapture.logging.IdCaptureLogger, com.facebook.smartcapture.logging.BaseLogger] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r19) {
        /*
            r18 = this;
            r0 = 767907818(0x2dc557ea, float:2.2435349E-11)
            int r2 = X.AnonymousClass0fD.A00(r0)
            r3 = r18
            boolean r0 = X.Pxj.A1V(r3)
            if (r0 != 0) goto L_0x0019
            r3.finish()
            r0 = -1430302424(0xffffffffaabf5128, float:-3.398473E-13)
        L_0x0015:
            X.AnonymousClass0fD.A07(r0, r2)
            return
        L_0x0019:
            android.content.Intent r1 = r3.getIntent()
            java.lang.String r0 = "id_capture_config"
            android.os.Parcelable r1 = r1.getParcelableExtra(r0)
            java.lang.String r10 = "Required value was null."
            if (r1 == 0) goto L_0x014e
            com.facebook.smartcapture.flow.IdCaptureConfig r1 = (com.facebook.smartcapture.flow.IdCaptureConfig) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r3.A02 = r1
            com.facebook.smartcapture.flow.IdCaptureConfig r0 = r3.A01()
            com.facebook.smartcapture.ui.IdCaptureUi r0 = r0.A0A
            r3.A07 = r0
            com.facebook.smartcapture.flow.IdCaptureConfig r0 = r3.A01()
            com.facebook.smartcapture.resources.ResourcesProvider r1 = r0.A09
            if (r1 == 0) goto L_0x004e
            r1.CN1(r3)
            android.content.res.Resources r0 = r1.Bng()
            r3.A00 = r0
            X.Tic r0 = r1.Az2()
            r3.A06 = r0
        L_0x004e:
            com.facebook.smartcapture.flow.IdCaptureConfig r0 = r3.A01()
            com.facebook.smartcapture.logging.SmartCaptureLoggerProvider r0 = r0.A08
            r4 = 0
            r1 = 0
            if (r0 == 0) goto L_0x0140
            com.facebook.smartcapture.logging.SmartCaptureLogger r5 = r0.get(r3)
            com.facebook.smartcapture.logging.IdCaptureLogger r0 = new com.facebook.smartcapture.logging.IdCaptureLogger
            r0.<init>(r5)
            r3.A03 = r0
            com.facebook.smartcapture.flow.IdCaptureConfig r0 = r3.A01()
            long r5 = r0.A02
            java.lang.Long r9 = java.lang.Long.valueOf(r5)
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0079
            if (r9 == 0) goto L_0x0079
            java.lang.String r1 = r9.toString()
        L_0x0079:
            com.facebook.smartcapture.logging.IdCaptureLogger r5 = r3.A02()
            android.os.Parcelable$Creator r0 = com.facebook.smartcapture.logging.CommonLoggingFields.CREATOR
            com.facebook.smartcapture.flow.IdCaptureConfig r0 = r3.A01()
            X.RF2 r12 = r0.A01()
            X.0qQ.A07(r12)
            com.facebook.smartcapture.flow.IdCaptureConfig r0 = r3.A01()
            boolean r0 = r0.A0I
            if (r0 == 0) goto L_0x013b
            java.lang.String r13 = "v1_cc"
        L_0x0095:
            com.facebook.smartcapture.flow.IdCaptureConfig r0 = r3.A01()
            java.lang.String r14 = r0.A0E
            X.0qQ.A07(r14)
            com.facebook.smartcapture.flow.IdCaptureConfig r0 = r3.A01()
            java.lang.String r15 = r0.A0D
            com.facebook.smartcapture.flow.IdCaptureConfig r0 = r3.A01()
            android.os.Bundle r0 = r0.A03
            com.facebook.smartcapture.logging.CommonLoggingFields r11 = new com.facebook.smartcapture.logging.CommonLoggingFields
            r17 = r1
            r16 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r5.setCommonFields(r11)
        L_0x00b6:
            com.facebook.smartcapture.logging.IdCaptureLogger r1 = r3.A02()
            com.facebook.smartcapture.logging.IdCaptureStep r0 = r3.A03()
            java.lang.String r0 = r0.getText()
            r1.setCurrentScreen(r0)
            com.facebook.smartcapture.flow.IdCaptureConfig r0 = r3.A01()
            com.facebook.smartcapture.experimentation.IdCaptureExperimentConfigProvider r0 = r0.A07
            if (r0 == 0) goto L_0x00d4
            X.Rif r0 = new X.Rif
            r0.<init>()
            r3.A08 = r0
        L_0x00d4:
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "preset_document_type"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L_0x00ef
            android.content.Intent r0 = r3.getIntent()
            java.io.Serializable r0 = r0.getSerializableExtra(r1)
            com.facebook.smartcapture.docauth.DocumentType r0 = (com.facebook.smartcapture.docauth.DocumentType) r0
            if (r0 == 0) goto L_0x0149
            r3.A01 = r0
        L_0x00ef:
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "previous_step"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L_0x0110
            android.content.Intent r0 = r3.getIntent()
            java.io.Serializable r1 = r0.getSerializableExtra(r1)
            boolean r0 = r1 instanceof com.facebook.smartcapture.logging.IdCaptureStep
            if (r0 == 0) goto L_0x010c
            com.facebook.smartcapture.logging.IdCaptureStep r1 = (com.facebook.smartcapture.logging.IdCaptureStep) r1
            if (r1 != 0) goto L_0x010e
        L_0x010c:
            com.facebook.smartcapture.logging.IdCaptureStep r1 = com.facebook.smartcapture.logging.IdCaptureStep.INITIAL
        L_0x010e:
            r3.A05 = r1
        L_0x0110:
            r1 = r19
            if (r19 == 0) goto L_0x011b
            java.lang.String r0 = "step_change_logged"
            boolean r4 = r1.getBoolean(r0)
        L_0x011b:
            r3.A09 = r4
            com.facebook.smartcapture.flow.IdCaptureConfig r0 = r3.A01()
            int r0 = r0.A00
            if (r0 == 0) goto L_0x0133
            r3.setTheme(r0)
            com.facebook.smartcapture.flow.IdCaptureConfig r0 = r3.A01()
            com.facebook.smartcapture.ui.IdCaptureUi r0 = r0.A0A
            if (r0 == 0) goto L_0x0133
            r0.AAp(r3)
        L_0x0133:
            com.facebook.smartcapture.view.IdCaptureBaseActivity.super.onCreate(r1)
            r0 = -1156466062(0xffffffffbb11ba72, float:-0.0022236374)
            goto L_0x0015
        L_0x013b:
            java.lang.String r13 = "v2_id"
            goto L_0x0095
        L_0x0140:
            com.facebook.smartcapture.logging.IdCaptureLogger r0 = new com.facebook.smartcapture.logging.IdCaptureLogger
            r0.<init>(r1)
            r3.A03 = r0
            goto L_0x00b6
        L_0x0149:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r10)
            throw r0
        L_0x014e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.smartcapture.view.IdCaptureBaseActivity.onCreate(android.os.Bundle):void");
    }

    public void onResume() {
        int A002 = AnonymousClass0fD.A00(1105477442);
        IdCaptureBaseActivity.super.onResume();
        if (!this.A09) {
            this.A09 = true;
            IdCaptureStep idCaptureStep = this.A04;
            IdCaptureLogger A022 = A02();
            if (idCaptureStep != null) {
                IdCaptureStep idCaptureStep2 = this.A04;
                0qQ.A0A(idCaptureStep2);
                A022.logStepChange(idCaptureStep2, A03());
                this.A04 = null;
            } else {
                A022.logStepChange(this.A05, A03());
            }
        }
        AnonymousClass0fD.A07(-597636205, A002);
    }
}

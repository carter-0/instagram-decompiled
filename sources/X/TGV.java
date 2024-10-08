package X;

import android.content.Intent;
import android.os.Parcelable;
import androidx.activity.ComponentActivity;
import com.facebook.smartcapture.docauth.DocumentType;
import com.facebook.smartcapture.flow.IdCaptureConfig;
import com.facebook.smartcapture.logging.IdCaptureStep;
import com.facebook.smartcapture.logging.SelfieCaptureLogger;
import com.facebook.smartcapture.view.IdCaptureActivity;
import com.facebook.smartcapture.view.PhotoReviewActivity;

public final class TGV implements Runnable {
    public final /* synthetic */ C8878RDv A00;
    public final /* synthetic */ IdCaptureActivity A01;

    public TGV(C8878RDv rDv, IdCaptureActivity idCaptureActivity) {
        this.A01 = idCaptureActivity;
        this.A00 = rDv;
    }

    public final void run() {
        IdCaptureStep idCaptureStep;
        IdCaptureStep idCaptureStep2;
        ComponentActivity componentActivity = this.A01;
        C8878RDv rDv = this.A00;
        int ordinal = rDv.ordinal();
        if (ordinal == 0) {
            idCaptureStep = IdCaptureStep.FIRST_PHOTO_CAPTURE;
            idCaptureStep2 = IdCaptureStep.FIRST_PHOTO_CONFIRMATION;
        } else if (ordinal == 1) {
            idCaptureStep = IdCaptureStep.SECOND_PHOTO_CAPTURE;
            idCaptureStep2 = IdCaptureStep.SECOND_PHOTO_CONFIRMATION;
        } else {
            IllegalArgumentException A0g = C51973G9u.A0g(rDv, "Unsupported stage: ", AnonymousClass7TE.A1A());
            componentActivity.A02().logError("Camera initialization error", A0g);
            throw A0g;
        }
        if (componentActivity.A06) {
            componentActivity.A04 = idCaptureStep2;
            componentActivity.A00 = JTQ.A09(C9583RdN.A00(rDv, componentActivity.A01()));
            C12166SoH soH = componentActivity.A03;
            if (soH == null) {
                0qQ.A0F("presenter");
                throw AnonymousClass00P.createAndThrow();
            } else {
                soH.A02();
            }
        } else {
            IdCaptureConfig A012 = componentActivity.A01();
            DocumentType documentType = componentActivity.A01;
            Boolean valueOf = Boolean.valueOf(componentActivity.A05);
            Intent A0A = C66580MXl.A0A(componentActivity, PhotoReviewActivity.class);
            A0A.putExtra("capture_stage", rDv);
            A0A.putExtra("id_capture_config", A012);
            A0A.putExtra("preset_document_type", documentType);
            A0A.putExtra(SelfieCaptureLogger.ARG_PREVIOUS_STEP, idCaptureStep);
            A0A.putExtra("skewed_crop_points", (Parcelable[]) null);
            A0A.putExtra("is_cancel_confirmation_action_sheet_enabled", valueOf);
            componentActivity.A04 = idCaptureStep2;
            componentActivity.startActivityForResult(A0A, 1);
        }
    }
}

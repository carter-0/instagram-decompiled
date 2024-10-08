package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.smartcapture.docauth.DocumentType;
import com.facebook.smartcapture.flow.IdCaptureConfig;
import com.facebook.smartcapture.logging.IdCaptureStep;
import com.facebook.smartcapture.logging.SelfieCaptureLogger;
import com.facebook.smartcapture.view.IdCaptureActivity;
import com.facebook.smartcapture.view.PermissionsActivity;

/* renamed from: X.Rzg  reason: case insensitive filesystem */
public final class C10880Rzg {
    public final Intent A00(Context context, DocumentType documentType, IdCaptureConfig idCaptureConfig, IdCaptureStep idCaptureStep) {
        Intent A0A;
        DbY.A1S(context, documentType);
        if (idCaptureConfig.A0K || 02K.A00(context, C9952Rk7.A00[0]) == 0) {
            A0A = C66580MXl.A0A(context, IdCaptureActivity.class);
            A0A.putExtra("preset_document_type", documentType);
            A0A.putExtra("id_capture_config", idCaptureConfig);
        } else {
            A0A = C66580MXl.A0A(context, PermissionsActivity.class);
            A0A.putExtra("id_capture_config", idCaptureConfig);
            A0A.putExtra("preset_document_type", documentType);
        }
        A0A.putExtra(SelfieCaptureLogger.ARG_PREVIOUS_STEP, idCaptureStep);
        return A0A;
    }
}

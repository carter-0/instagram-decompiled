package com.facebook.smartcapture.view;

import X.0qQ;
import X.0s1;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C13444TaX;
import X.C7916Qcn;
import X.C7925Qcw;
import X.C7926Qcx;
import X.C8878RDv;
import X.C9583RdN;
import X.DbW;
import X.Q9N;
import X.RE7;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.smartcapture.logging.IdCaptureLogger;
import com.facebook.smartcapture.ui.IdCaptureUi;
import com.instagram.android.R;

public final class PhotoReviewActivity extends IdCaptureBaseActivity implements C13444TaX {
    public C7916Qcn A00;
    public String A01;

    public final void onBackPressed() {
        C7916Qcn qcn = this.A00;
        if (qcn != null && !(qcn instanceof C7926Qcx)) {
            C7925Qcw qcw = (C7925Qcw) qcn;
            if (qcw.A0Y) {
                Q9N q9n = qcw.A0T;
                if (q9n != null) {
                    q9n.A00();
                    qcw.A0T = null;
                }
                qcw.A0Y = false;
                return;
            }
        }
        super.onBackPressed();
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [androidx.activity.ComponentActivity, com.facebook.smartcapture.view.PhotoReviewActivity, com.facebook.smartcapture.view.IdCaptureBaseActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0fD.A00(-32020218);
        super.onCreate(bundle);
        setContentView(R.layout.photo_review_activity);
        Intent intent = getIntent();
        C8878RDv rDv = (C8878RDv) intent.getSerializableExtra("capture_stage");
        if (rDv != null) {
            this.A01 = C9583RdN.A00(rDv, A01());
            Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("skewed_crop_points");
            if (this.A07 == null || this.A01 == null) {
                A02().logError("IdCaptureUi and/or file path is null", (Throwable) null);
                throw AnonymousClass7TE.A0z("IdCaptureUi must not be null");
            }
            boolean booleanExtra = intent.getBooleanExtra("is_cancel_confirmation_action_sheet_enabled", false);
            try {
                IdCaptureUi idCaptureUi = this.A07;
                0qQ.A0A(idCaptureUi);
                C7916Qcn qcn = (C7916Qcn) idCaptureUi.BcA().newInstance();
                RE7 A003 = A01().A00();
                String str = this.A01;
                0qQ.A0A(str);
                Bundle A0a = AnonymousClass7TE.A0a();
                A0a.putSerializable("capture_mode", A003);
                A0a.putSerializable("capture_stage", rDv);
                A0a.putString("photo_file_path", str);
                A0a.putParcelableArray("skewed_crop_points", parcelableArrayExtra);
                A0a.putString("sync_feedback_error", (String) null);
                A0a.putBoolean("is_cancel_confirmation_action_sheet_enabled", booleanExtra);
                qcn.setArguments(A0a);
                0s1 A0D = DbW.A0D(this);
                A0D.A0A(qcn, R.id.photo_review_container);
                A0D.A00();
                this.A00 = qcn;
            } catch (IllegalAccessException | InstantiationException e) {
                IdCaptureLogger A02 = A02();
                String message = e.getMessage();
                0qQ.A0A(message);
                A02.logError(message, e);
            }
            AnonymousClass0fD.A07(1100610643, A002);
            return;
        }
        throw AnonymousClass7TE.A0w("CaptureStage is required");
    }
}

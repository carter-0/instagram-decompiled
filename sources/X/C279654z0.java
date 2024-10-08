package X;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.ui.swipenavigation.PositionConfig;
import java.io.File;

/* renamed from: X.4z0  reason: invalid class name and case insensitive filesystem */
public final class C279654z0 implements AnonymousClass36P {
    public final Activity A00;
    public final UserSession A01;
    public final 2ZU A02;

    public final void Ctl(int i, int i2) {
    }

    public final void CJ6(Intent intent) {
        1Wj r1;
        0xI A002 = C59882Jb5.A00(AnonymousClass05K.A0u);
        Intent intent2 = intent;
        if (intent2.getStringExtra("CaptureFlowHelper.RESULT_KEY_POST_TYPE").equals("CaptureFlowHelper.RESULT_VALUE_MEDIA_POSTED")) {
            A002.A0C("return_to", "feed");
            UserSession userSession = this.A01;
            C60510iO.A00(userSession).EFq(A002);
            2ZU r12 = this.A02;
            C240073Jm.A00 = true;
            r12.Enh(1QK.A0C);
            r12.FLD(new PositionConfig((AnonymousClass57C) null, (CameraConfiguration) null, (AnonymousClass3QO) null, "return_from_main_camera_to_feed", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0.0f, 0, false));
            String stringExtra = intent2.getStringExtra("CaptureFlowHelper.RESULT_KEY_CAPTION_WARNING_SURVEY_ID");
            if (!TextUtils.isEmpty(stringExtra) && (r1 = 1Wj.A00) != null) {
                r1.A03(userSession, this.A00, stringExtra);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Camera activity action not handled");
    }

    public final void Ctk(int i, int i2) {
        if (i == 10004 && i2 == 2) {
            if (!182.A06(0Tu.A05, this.A01, 36323912811884129L)) {
                this.A00.finish();
            }
        }
    }

    public final void Ewk(File file, int i) {
        FFa.A02(this.A00, file, i);
    }

    public final void ExB(Intent intent, int i) {
        0kR.A07(this.A00, intent, i);
    }

    public C279654z0(Activity activity, UserSession userSession, 2ZU r3) {
        this.A00 = activity;
        this.A01 = userSession;
        this.A02 = r3;
    }
}

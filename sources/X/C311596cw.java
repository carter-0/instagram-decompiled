package X;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.modal.ModalActivity;
import com.instagram.ui.swipenavigation.PositionConfig;
import java.io.File;

/* renamed from: X.6cw  reason: invalid class name and case insensitive filesystem */
public final class C311596cw implements AnonymousClass36P {
    public final Activity A00;
    public final Fragment A01;
    public final UserSession A02;
    public final boolean A03;

    public C311596cw(UserSession userSession, Activity activity, Fragment fragment, boolean z) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = fragment;
        this.A00 = activity;
        this.A03 = z;
    }

    public final void CJ6(Intent intent) {
        2ZS r1;
        Intent intent2 = intent;
        0qQ.A0B(intent2, 0);
        2ZS A002 = C71172bH.A00();
        0xI A003 = C59882Jb5.A00(AnonymousClass05K.A0u);
        if (0qQ.A0K(intent2.getStringExtra("CaptureFlowHelper.RESULT_KEY_POST_TYPE"), "CaptureFlowHelper.RESULT_VALUE_MEDIA_POSTED")) {
            if (!this.A03) {
                A003.A0C("return_to", "feed");
                C60510iO.A00(this.A02).EFq(A003);
                2ZS r12 = this.A01.mParentFragment;
                if (r12 instanceof 2ZS) {
                    0qQ.A0C(r12, "null cannot be cast to non-null type com.instagram.mainactivity.delegate.IgNavigator");
                    r1 = r12;
                } else if (A002 != null) {
                    r1 = A002;
                }
                C240073Jm.A00 = true;
                r1.Enh(1QK.A0C);
                r1.FLD(new PositionConfig((AnonymousClass57C) null, (CameraConfiguration) null, (AnonymousClass3QO) null, "return_from_main_camera_to_inbox", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0.0f, 0, false));
            }
            Activity activity = this.A00;
            if (activity instanceof ModalActivity) {
                ((IgFragmentActivity) activity).onBackPressed();
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Camera activity action not handled");
    }

    public final /* synthetic */ void Ctk(int i, int i2) {
    }

    public final /* synthetic */ void Ctl(int i, int i2) {
    }

    public final void Ewk(File file, int i) {
        0qQ.A0B(file, 0);
        FFa.A02(this.A00, file, i);
    }

    public final void ExB(Intent intent, int i) {
        0qQ.A0B(intent, 0);
        0kR.A05(this.A01, intent, i);
    }
}

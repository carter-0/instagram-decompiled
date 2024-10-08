package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.base.ui.mediatabbar.Tab;
import com.instagram.creation.capture.MediaCaptureFragment;
import java.util.Map;

/* renamed from: X.Jb0  reason: case insensitive filesystem */
public final class C59877Jb0 implements C66502MUg {
    public final /* synthetic */ MediaCaptureFragment A00;

    public final void Dq9(float f, float f2) {
        float f3;
        MediaCaptureFragment mediaCaptureFragment;
        if (f <= 0.0f) {
            MediaCaptureFragment mediaCaptureFragment2 = this.A00;
            MediaCaptureFragment.A02(mediaCaptureFragment2, f2);
            mediaCaptureFragment2.mActionBar.setTranslationY(mediaCaptureFragment2.A00);
            mediaCaptureFragment2.mActionBarShadow.setTranslationY(mediaCaptureFragment2.A00);
            return;
        }
        if (f <= 1.0f) {
            mediaCaptureFragment = this.A00;
            MediaCaptureFragment.A02(mediaCaptureFragment, f2);
            f3 = (float) AnonymousClass37Q.A02((double) f, (double) mediaCaptureFragment.A00);
        } else {
            f3 = 0.0f;
            mediaCaptureFragment = this.A00;
            MediaCaptureFragment.A02(mediaCaptureFragment, AnonymousClass7TE.A02(mediaCaptureFragment.mActionBar));
        }
        mediaCaptureFragment.mActionBar.setTranslationY(f3);
        mediaCaptureFragment.mActionBarShadow.setTranslationY(f3);
    }

    public final /* synthetic */ void DqA(Tab tab, Tab tab2) {
    }

    public C59877Jb0(MediaCaptureFragment mediaCaptureFragment) {
        this.A00 = mediaCaptureFragment;
    }

    public final void DqB(Tab tab) {
        MediaCaptureFragment mediaCaptureFragment;
        String str;
        if (tab == JXL.A00) {
            Integer num = AnonymousClass05K.A0B;
            mediaCaptureFragment = this.A00;
            C59882Jb5.A01(mediaCaptureFragment.getSession(), num);
            str = "choose_from_library";
        } else if (tab == JXL.A01) {
            Integer num2 = AnonymousClass05K.A0D;
            mediaCaptureFragment = this.A00;
            C59882Jb5.A01(mediaCaptureFragment.getSession(), num2);
            str = "take_photo";
        } else if (tab == JXL.A02) {
            Integer num3 = AnonymousClass05K.A0E;
            mediaCaptureFragment = this.A00;
            C59882Jb5.A01(mediaCaptureFragment.getSession(), num3);
            str = "take_profile_video";
        } else {
            return;
        }
        if (AnonymousClass36O.A0B != null) {
            AnonymousClass36O.A0C = str;
            UserSession session = mediaCaptureFragment.getSession();
            AnonymousClass36X r2 = AnonymousClass36O.A0B;
            AnonymousClass7TG.A1N(session, r2);
            00y.A0n(10, session.A06);
            C46653DiY.A00(r2, session, "profile_picture_bottom_sheet_item_clicked", "photo_editing", str, (String) null, (Map) null);
        }
    }
}

package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Loh  reason: case insensitive filesystem */
public final class C65178Loh implements MVS {
    public final UserSession A00;
    public final AnonymousClass80P A01 = AnonymousClass80P.TEMP_CAMERA_TOOL;
    public final AnonymousClass4DH A02;
    public final boolean A03;

    public final /* synthetic */ void ADm() {
    }

    public final void CsQ() {
    }

    public final View ANH() {
        Integer num;
        AnonymousClass4DH r1 = this.A02;
        Context requireContext = r1.requireContext();
        if (this.A03) {
            num = Integer.valueOf(R.drawable.instagram_text_bg_pano_outline_24);
        } else {
            num = null;
        }
        KHY A012 = C64004LIk.A01(requireContext, AnonymousClass7TE.A0u(), r1.getString(2131952930), num, 2131952936);
        A012.setHideSwitchView(true);
        LYD.A02(A012, 10, this);
        return A012;
    }

    public final C62674Kka B1s() {
        return null;
    }

    public final AnonymousClass80P BHl() {
        return this.A01;
    }

    public C65178Loh(AnonymousClass4DH r2, UserSession userSession, boolean z) {
        AnonymousClass7TG.A1O(r2, userSession);
        this.A02 = r2;
        this.A00 = userSession;
        this.A03 = z;
    }
}

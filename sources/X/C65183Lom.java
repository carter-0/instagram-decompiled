package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lom  reason: case insensitive filesystem */
public final class C65183Lom implements MVS {
    public final C62674Kka A00 = C62674Kka.A0O;
    public final AnonymousClass80P A01 = AnonymousClass80P.UPLOAD_HIGHEST_QUALITY;
    public final UserSession A02;
    public final AnonymousClass4DH A03;
    public final boolean A04;
    public final boolean A05;

    public final /* synthetic */ void ADm() {
    }

    public final void CsQ() {
    }

    public final View ANH() {
        Integer num;
        1Av A002 = 1Au.A00(this.A02);
        AnonymousClass4DH r2 = this.A03;
        int i = 2131955489;
        if (this.A05) {
            i = 2131963400;
        }
        String A0m = DbU.A0m(r2, i);
        Context requireContext = r2.requireContext();
        if (this.A04) {
            num = Integer.valueOf(R.drawable.instagram_arrow_up_pano_outline_24);
        } else {
            num = null;
        }
        KHY A012 = C64004LIk.A01(requireContext, AnonymousClass7TE.A0v(), A0m, num, 2131963401);
        A012.setChecked(A002.A1z());
        A012.setOnToggleListener(new C65370LsB(3, A002, this));
        return A012;
    }

    public final C62674Kka B1s() {
        return this.A00;
    }

    public final AnonymousClass80P BHl() {
        return this.A01;
    }

    public C65183Lom(AnonymousClass4DH r2, UserSession userSession, boolean z, boolean z2) {
        AnonymousClass7TG.A1O(r2, userSession);
        this.A03 = r2;
        this.A02 = userSession;
        this.A04 = z;
        this.A05 = z2;
    }
}

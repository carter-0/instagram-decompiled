package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;

public final class LFW {
    public final Activity A00;
    public final View A01;
    public final AnonymousClass4DH A02;
    public final UserSession A03;
    public final C60063Jel A04;
    public final LE1 A05;
    public final KO3 A06;
    public final MXB A07;
    public final C367188qK A08;
    public final C347767xL A09;

    public LFW(Activity activity, View view, AnonymousClass4DH r17, UserSession userSession, C60063Jel jel, LE1 le1, KO3 ko3, MXB mxb, C367188qK r23) {
        String str;
        C62623Kiu kiu;
        String str2;
        String str3;
        UserSession userSession2 = userSession;
        C367188qK r1 = r23;
        DbW.A1O(userSession2, 4, r1);
        this.A00 = activity;
        this.A01 = view;
        AnonymousClass4DH r9 = r17;
        this.A02 = r9;
        this.A03 = userSession2;
        C60063Jel jel2 = jel;
        this.A04 = jel2;
        this.A08 = r1;
        MXB mxb2 = mxb;
        this.A07 = mxb2;
        this.A06 = ko3;
        LE1 le12 = le1;
        this.A05 = le12;
        C347767xL A002 = C347757xK.A00(userSession2);
        this.A09 = A002;
        le12.A00();
        C59912Jbb jbb = C59912Jbb.A00;
        C62623Kiu kiu2 = null;
        if (mxb != null) {
            str = mxb2.getUsername();
            kiu = mxb2.AXt();
        } else {
            str = null;
            kiu = null;
        }
        jbb.A04(activity, kiu, str);
        C60063Jel jel3 = this.A04;
        jel3.setListener(new C65369LsA(this, 5));
        LYB.A00(jel3, 64, this);
        if (this.A05.A04) {
            this.A01.getViewTreeObserver().addOnScrollChangedListener(new LZ5(this, 2));
        }
        A01(AnonymousClass7TF.A1Y(le12.A00, true));
        boolean z = !DbT.A1a(A002.A00, "PREFERENCE_SHARE_TO_BARCELONA_TOGGLE_SHOWN");
        if (mxb != null) {
            str2 = mxb2.getProfilePicUrl();
        } else {
            str2 = null;
        }
        SimpleImageUrl A0V = DbS.A0V(str2);
        if (mxb != null) {
            str3 = mxb2.getUsername();
            kiu2 = mxb2.AXt();
        } else {
            str3 = null;
        }
        jel2.A00(r9, A0V, str3, C59912Jbb.A03(activity, kiu2), z);
        A00();
    }

    public final void A00() {
        LE1 le1 = this.A05;
        LNP lnp = LNP.A00;
        UserSession userSession = this.A03;
        KO3 ko3 = this.A06;
        Integer A002 = lnp.A00(userSession, ko3.A04(), le1.A02, le1.A03, AnonymousClass7TF.A1V(ko3.A02().A08));
        0qQ.A0B(A002, 0);
        le1.A01 = A002;
        boolean A1W = AnonymousClass7TF.A1W(A002, AnonymousClass05K.A00);
        this.A04.setEnabledState(A1W);
        if (!A1W) {
            C63207KtE.A00(le1, this.A07, ko3.A04(), false);
        } else if (AnonymousClass7TF.A1Y(le1.A00, true)) {
            A01(true);
        }
    }

    public final void A01(boolean z) {
        boolean isChecked;
        C60063Jel jel = this.A04;
        boolean z2 = jel instanceof KNL;
        if (z2) {
            isChecked = false;
        } else {
            isChecked = ((KNM) jel).A03.isChecked();
        }
        if (!AnonymousClass7TF.A1Y(Boolean.valueOf(isChecked), z)) {
            if (!z2) {
                ((KNM) jel).A03.A00();
            }
            AnonymousClass3Q2 A042 = this.A06.A04();
            C63207KtE.A00(this.A05, this.A07, A042, z);
        }
    }
}

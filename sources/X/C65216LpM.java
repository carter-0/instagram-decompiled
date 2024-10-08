package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.LpM  reason: case insensitive filesystem */
public final class C65216LpM implements MVS {
    public final AnonymousClass80P A00 = AnonymousClass80P.ALLOW_GIFTS;
    public final AnonymousClass4DH A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final C66576MXh A04;
    public final String A05 = C2818159r.A01();
    public final AnonymousClass0eM A06 = AnonymousClass1YB.A00(C66296MMf.A00(this, 13));
    public final 0sP A07;
    public final boolean A08;
    public final boolean A09;

    public final /* synthetic */ void ADm() {
    }

    public final void CsQ() {
    }

    public final C62674Kka B1s() {
        return null;
    }

    public final AnonymousClass80P BHl() {
        return this.A00;
    }

    public C65216LpM(AnonymousClass4DH r2, AnonymousClass0iw r3, UserSession userSession, C66576MXh mXh, 0sP r6, boolean z, boolean z2) {
        C51974G9v.A1L(r2, userSession, r3);
        0qQ.A0B(mXh, 6);
        this.A01 = r2;
        this.A03 = userSession;
        this.A09 = z;
        this.A02 = r3;
        this.A08 = z2;
        this.A04 = mXh;
        this.A07 = r6;
    }

    public final View ANH() {
        Integer num;
        CharSequence charSequence;
        boolean z;
        AnonymousClass2BF.A00();
        UserSession userSession = this.A03;
        boolean A1W = AnonymousClass7TF.A1W(((C63581KzU) userSession.A01(C63581KzU.class, MJp.A00)).A00, AnonymousClass05K.A00);
        AnonymousClass4DH r8 = this.A01;
        Context requireContext = r8.requireContext();
        if (this.A09) {
            num = Integer.valueOf(R.drawable.instagram_gift_box_pano_outline_24);
        } else {
            num = null;
        }
        AnonymousClass2BF.A00();
        new C59774JXr(userSession);
        new C59775JXt(userSession);
        boolean A062 = 182.A06(0Tu.A05, userSession, 36330638730609361L);
        if (A1W) {
            int i = 2131956611;
            if (A062) {
                i = 2131956612;
            }
            charSequence = DbU.A0m(r8, i);
        } else {
            Context requireContext2 = r8.requireContext();
            String A0m = DbU.A0m(r8, 2131956608);
            int i2 = 2131956609;
            if (A062) {
                i2 = 2131956610;
            }
            SpannableStringBuilder A0E = DbY.A0E(r8, A0m, i2);
            AnonymousClass7AV.A05(A0E, new C62146Kaz(this, DbV.A02(requireContext2)), A0m);
            charSequence = A0E;
        }
        KHY A012 = C64004LIk.A01(requireContext, AnonymousClass7TE.A0v(), charSequence, num, 2131955484);
        if (A1W) {
            z = this.A08;
        } else {
            z = false;
        }
        A012.setChecked(z);
        A012.setEnableSwitchView(A1W);
        KHY.A02(A012, this, 15);
        return A012;
    }
}

package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.IUa  reason: case insensitive filesystem */
public final class C57239IUa implements JSw {
    public final AnonymousClass311 A00;
    public final C231332rR A01;
    public final Fragment A02;
    public final UserSession A03;
    public final C2363033f A04;

    public C57239IUa(Fragment fragment, UserSession userSession, AnonymousClass311 r4, C2363033f r5, C231332rR r6) {
        0qQ.A0B(r5, 4);
        this.A00 = r4;
        this.A03 = userSession;
        this.A02 = fragment;
        this.A04 = r5;
        this.A01 = r6;
    }

    public final void Ev9(1Xj r11, JOG jog, AnonymousClass3W1 r13, C16677UzD uzD, String str) {
        0qQ.A0B(uzD, 3);
        C2363033f r1 = this.A04;
        r1.A02(r11, uzD, new HH1(r1, r11, (C53157GjT) null, jog, r13), str, (String) null);
    }

    public final C2363233h C87() {
        return this.A00.C87();
    }

    public final void CLj(1Xj r24, AnonymousClass3W1 r25, String str, String str2, int i, boolean z, boolean z2) {
        int i2 = i;
        Context context = this.A02.getContext();
        if (context != null) {
            C231332rR r2 = this.A01;
            1Xj r5 = r24;
            int BJU = r2.BJU(r5.getId());
            if (BJU != -1) {
                Object EDl = r2.EDl(BJU);
                1sd.A00(this.A03).A02(r5, true);
                String str3 = str;
                if (str != null && EDl != null) {
                    C57266IVb iVb = new C57266IVb(this, r5, r25, EDl, BJU, 0);
                    if (i == 0) {
                        i2 = R.drawable.instagram_eye_off_pano_outline_24;
                    }
                    Drawable drawable = context.getDrawable(i2);
                    if (drawable != null) {
                        C56314HwR.A00(context, drawable, iVb, str3, str2, (String) null, 2Yu.A05(context), 5000, false);
                    }
                }
            }
        }
    }

    public final void E13(1Xj r2, JOG jog, AnonymousClass3W1 r4) {
        this.A04.A01(r2, jog, r4);
    }

    public final void EuI(1Xj r2, JOG jog, AnonymousClass3W1 r4) {
        this.A04.A00(r2, jog);
    }
}

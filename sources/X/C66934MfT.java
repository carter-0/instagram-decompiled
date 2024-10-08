package X;

import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.MfT  reason: case insensitive filesystem */
public final class C66934MfT {
    public 2dZ A00;
    public DdD A01;
    public boolean A02;
    public final AnonymousClass4DS A03;
    public final AnonymousClass4DH A04;
    public final C227252iu A05;
    public final 1wn A06 = C71932OtG.A00(this, 25);
    public final UserSession A07;
    public final C66935MfU A08;
    public final C62320sa A09;
    public final C62320sa A0A;

    public C66934MfT(AnonymousClass4DH r2, C227252iu r3, UserSession userSession, C66935MfU mfU, C62320sa r6, C62320sa r7, boolean z) {
        0qQ.A0B(userSession, 1);
        this.A07 = userSession;
        this.A04 = r2;
        this.A05 = r3;
        this.A08 = mfU;
        this.A09 = r6;
        this.A0A = r7;
        this.A03 = new C66932MfR(this, z);
    }

    public static final void A00(2da r3, C66934MfT mfT) {
        if (!mfT.A02) {
            AnonymousClass3JR A0K = DbS.A0K();
            A0K.A06 = R.drawable.instagram_compose_pano_outline_24;
            A0K.A05 = 2131968287;
            A0K.A0G = new C71395Oju(mfT, 41);
            A0K.A0N = true;
            mfT.A08.A07(C51970G9q.A0P(A0K, r3));
        }
    }

    public static final void A01(2da r5, C66934MfT mfT) {
        AnonymousClass4DH r1 = mfT.A04;
        if (r1.isAdded()) {
            DdD ddD = new DdD(r1, mfT.A07);
            mfT.A01 = ddD;
            ddD.A00 = r5;
            2dZ.A0K((2dZ) r5, DbU.A0n(ddD.A03, AnonymousClass0t1.A01), true, false);
            r5.Eoo(new DdT(ddD));
            r5.EuC(true);
            ddD.A00();
        }
    }
}

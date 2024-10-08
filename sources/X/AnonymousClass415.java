package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.415  reason: invalid class name */
public final class AnonymousClass415 implements AnonymousClass416 {
    public final Fragment A00;
    public final C234072ww A01;
    public final UserSession A02;
    public final AnonymousClass4D6 A03;
    public final AnonymousClass4DU A04;
    public final C231332rR A05;

    public AnonymousClass415(Fragment fragment, C234072ww r3, UserSession userSession, AnonymousClass4D6 r5, AnonymousClass4DU r6, C231332rR r7) {
        0qQ.A0B(r5, 3);
        0qQ.A0B(r3, 6);
        this.A02 = userSession;
        this.A00 = fragment;
        this.A03 = r5;
        this.A05 = r7;
        this.A04 = r6;
        this.A01 = r3;
    }

    public final void D4o(C247733gp r13, 1Xj r14, AnonymousClass3W1 r15) {
        1OC A012;
        0xI A002;
        String str;
        boolean z = r13.A0O;
        1Xj r5 = r14;
        UserSession userSession = this.A02;
        String str2 = r13.A0G;
        String moduleName = this.A04.getModuleName();
        boolean z2 = r15.A2V;
        int position = r15.getPosition();
        int i = r15.A03;
        if (z) {
            A012 = C56631I5k.A02(userSession, r5, str2, moduleName, position, i, z2, true);
        } else {
            A012 = C56631I5k.A01(userSession, r5, str2, moduleName, position, i, z2, true);
        }
        A012.A00 = new H4D(this, r13, r14);
        this.A03.schedule(A012);
        A00(this, r13, r14);
        C234072ww r1 = this.A01;
        int i2 = r15.A03;
        int position2 = r15.getPosition();
        if (z) {
            UserSession userSession2 = r1.A03;
            AnonymousClass4DU r2 = r1.A04;
            String A003 = AnonymousClass000.A00(2906);
            C254523sc A032 = C254513sb.A03(userSession2, r14, r2, A003);
            A032.A4o = r13.A0G;
            User user = r13.A08;
            if (user != null) {
                str = user.getId();
            } else {
                str = null;
            }
            A032.A4q = str;
            A032.A6k = r13.A0c;
            A032.A6J = r13.A0F;
            A032.A7t = r13.A0L;
            A032.A1e = Boolean.valueOf(r2.isOrganicEligible());
            if (!C271764jY.A00(userSession2, A032, r2, AnonymousClass05K.A01)) {
                A002 = C234072ww.A00(r1, r13, r14, A003);
                HWW.A00(A002, userSession2, r14.BPf(), i2, position2, AnonymousClass3WX.A02(r14, r2));
            } else {
                return;
            }
        } else {
            A002 = C234072ww.A00(r1, r13, r14, AnonymousClass000.A00(1203));
            1Xj BPf = r14.BPf();
            HWW.A00(A002, r1.A03, BPf, i2, position2, AnonymousClass3WX.A02(r14, r1.A04));
            String loggingInfoToken = BPf.A0C.getLoggingInfoToken();
            if (loggingInfoToken != null) {
                A002.A0C("ranking_info_token", loggingInfoToken);
            }
        }
        r1.A01.EFq(A002);
    }

    public static final void A00(AnonymousClass415 r3, C247733gp r4, 1Xj r5) {
        C3018960m.A00();
        UserSession userSession = r3.A02;
        if (r4.A0O) {
            I2X.A02(userSession, r4, r5);
            C247733gp A002 = I2X.A00(r4, r5);
            if (!(A002 == null || A002 == r4)) {
                I2X.A02(userSession, A002, r5);
            }
            C247733gp A003 = r5.A1X().A00(r4.A0G);
            if (!(A003 == null || A003 == r4)) {
                I2X.A02(userSession, A003, r5);
            }
        } else {
            I2X.A01(userSession, r4, r5);
            C247733gp A004 = I2X.A00(r4, r5);
            if (!(A004 == null || A004 == r4)) {
                I2X.A01(userSession, A004, r5);
            }
            C247733gp A005 = r5.A1X().A00(r4.A0G);
            if (!(A005 == null || A005 == r4)) {
                I2X.A01(userSession, A005, r5);
            }
        }
        if (r3.A00.isVisible()) {
            r3.A05.Cs9(r5);
        }
    }
}

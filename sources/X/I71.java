package X;

import android.app.Activity;
import com.instagram.api.schemas.ConfirmationStyle;
import com.instagram.api.schemas.MediaControlEventSourceEnum;
import com.instagram.api.schemas.MediaOptionStyle;
import com.instagram.common.session.UserSession;

public final class I71 {
    public static final I71 A00 = new Object();

    public static final boolean A05(1Xj r5, AnonymousClass3WA r6, AnonymousClass3W1 r7) {
        ConfirmationStyle Apx;
        int ordinal = r6.ordinal();
        if (ordinal != 15) {
            if (!(ordinal == 3 || ordinal == 16) || (r0 = A00(r5, r7)) == null) {
                return false;
            }
            Apx = r0.Apx();
        } else {
            AnonymousClass1eD r0 = r5.A0C.B5C();
            if (r0 == null) {
                Apx = null;
            }
            Apx = r0.Apx();
        }
        if (Apx != ConfirmationStyle.BOTTOMSHEET) {
            return false;
        }
        return true;
    }

    public static final AnonymousClass1eD A00(1Xj r2, AnonymousClass3W1 r3) {
        int ordinal = r3.A0o.ordinal();
        if (ordinal == 3) {
            return r2.A0C.B2u();
        }
        if (ordinal != 24) {
            return r2.A0C.B5S();
        }
        return r2.A0C.Anw();
    }

    public static final C246183eA A01(C54667HMy hMy, String str) {
        1eB r2;
        String str2 = hMy.A01;
        0qQ.A0B(str2, 0);
        C246183eA r22 = new C246183eA((1eB) null, (String) null, str2, (String) null, str, true);
        1eB r1 = r22.A00;
        String str3 = r22.A02;
        String str4 = r22.A04;
        String obj = MediaOptionStyle.A07.toString();
        if (r1 != null) {
            r2 = r1.F35();
        } else {
            r2 = null;
        }
        return new C246183eA(r2, (String) null, str3, obj, str4, true);
    }

    public static final void A02(Activity activity, AnonymousClass1eD r13, MediaControlEventSourceEnum mediaControlEventSourceEnum, AnonymousClass0iw r15, UserSession userSession, 1Xj r17, JSw jSw, AnonymousClass3W1 r19) {
        AnonymousClass3W1 r11 = r19;
        1sy r3 = r11.A0o;
        UserSession userSession2 = userSession;
        IUW iuw = new IUW(activity, mediaControlEventSourceEnum, r15, userSession2, r17, jSw, r11);
        0qQ.A0B(r13, 2);
        H0H h0h = new H0H();
        h0h.A01 = r13;
        h0h.A03 = new HBD(r13, h0h.A02);
        h0h.A04 = iuw;
        h0h.A05 = r3;
        C331127Pr A0W = DbS.A0W(userSession2);
        A0W.A1C = false;
        DbU.A0y(activity, h0h, A0W);
    }

    public static final void A03(1eB r2, 1Xj r3, AnonymousClass3W1 r4) {
        int ordinal = r4.A0o.ordinal();
        if (ordinal == 3) {
            r3.A0C.EVj(r2);
        } else if (ordinal != 24) {
            r3.A0C.EWd(r2);
        } else {
            r3.A0C.ERo(r2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
        if (r7 != null) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0041, code lost:
        if (r6 != null) goto L_0x0011;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.AnonymousClass1eD r6, X.C246193eB r7, com.instagram.api.schemas.MediaControlEventSourceEnum r8, X.1Xj r9, X.JSw r10, X.AnonymousClass3W1 r11) {
        /*
            com.instagram.api.schemas.MediaControlEventSourceEnum r0 = com.instagram.api.schemas.MediaControlEventSourceEnum.UFI
            if (r8 == r0) goto L_0x003a
            r1 = 0
            if (r6 == 0) goto L_0x0040
            java.lang.String r0 = r6.Apy()
            if (r0 == 0) goto L_0x0040
            java.lang.String r3 = r6.Apy()
        L_0x0011:
            java.lang.String r0 = r6.Apv()
            if (r0 == 0) goto L_0x0044
            java.lang.String r0 = r6.Apv()
        L_0x001b:
            r4 = r0
            if (r3 != 0) goto L_0x0020
            r4 = r1
            r3 = r0
        L_0x0020:
            if (r7 == 0) goto L_0x003b
            X.HMy r1 = X.C56315HwS.A00(r7)
            X.HMy r0 = X.C54667HMy.A0H
            if (r1 == r0) goto L_0x003b
            X.HMy r0 = X.C56315HwS.A00(r7)
            if (r0 == 0) goto L_0x003b
            int r5 = r0.A00
        L_0x0032:
            r6 = 1
        L_0x0033:
            r7 = 0
            r1 = r9
            r0 = r10
            r2 = r11
            r0.CLj(r1, r2, r3, r4, r5, r6, r7)
        L_0x003a:
            return
        L_0x003b:
            r5 = 0
            r6 = 0
            if (r7 == 0) goto L_0x0033
            goto L_0x0032
        L_0x0040:
            r3 = r1
            if (r6 == 0) goto L_0x0044
            goto L_0x0011
        L_0x0044:
            r0 = r1
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I71.A04(X.1eD, X.3eB, com.instagram.api.schemas.MediaControlEventSourceEnum, X.1Xj, X.JSw, X.3W1):void");
    }
}

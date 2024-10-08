package X;

import android.app.Activity;
import com.instagram.api.schemas.MediaControlEventSourceEnum;
import com.instagram.api.schemas.MediaOptionStyle;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class I65 {
    public static final I65 A00 = new Object();

    public static final void A01(Activity activity, MediaControlEventSourceEnum mediaControlEventSourceEnum, AnonymousClass0iw r20, UserSession userSession, 1Xj r22, JSw jSw, AnonymousClass3W1 r24, H3C h3c) {
        AnonymousClass1eD Anw;
        AnonymousClass3W1 r12 = r24;
        0qQ.A0B(r12, 3);
        int ordinal = r12.A0o.ordinal();
        1Xj r10 = r22;
        if (ordinal == 24) {
            Anw = r10.A0C.Anw();
        } else if (ordinal != 3) {
            Anw = r10.A0C.B5S();
        } else {
            Anw = r10.A0C.B2u();
        }
        if (Anw != null) {
            C45446CwZ AKC = Anw.AKC();
            List B73 = Anw.B73();
            Activity activity2 = activity;
            if (B73 == null) {
                B73 = 0sr.A1P(new C246193eB[]{A00(C54667HMy.A0C, AnonymousClass7TE.A16(activity2, 2131968510)), A00(C54667HMy.A0A, AnonymousClass7TE.A16(activity2, 2131968506)), A00(C54667HMy.A0B, DbY.A0c(activity2, C51975G9x.A0h(r10), 2131968507)), A00(C54667HMy.A0D, AnonymousClass7TE.A16(activity2, 2131968511)), A00(C54667HMy.A0E, AnonymousClass7TE.A16(activity2, 2131968509)), A00(C54667HMy.A0H, AnonymousClass7TE.A16(activity2, 2131968508))});
            }
            AKC.A04 = B73;
            1eB A002 = AKC.A00();
            if (r12.A0o.ordinal() == 24) {
                r10.A0C.ERo(A002);
            } else {
                r10.A0C.EWd(A002);
            }
            H3C h3c2 = h3c;
            if (h3c != null) {
                H3C.A01(h3c2, AnonymousClass05K.A0Y, r10.getId());
            }
            1sy r3 = r12.A0o;
            UserSession userSession2 = userSession;
            IUX iux = new IUX(activity2, mediaControlEventSourceEnum, r20, userSession2, r10, jSw, r12);
            H0H h0h = new H0H();
            h0h.A01 = Anw;
            h0h.A03 = new HBD(Anw, h0h.A02);
            h0h.A04 = iux;
            h0h.A05 = r3;
            C331127Pr A0W = DbS.A0W(userSession2);
            A0W.A1C = false;
            DbU.A0y(activity2, h0h, A0W);
        }
    }

    public static final C246183eA A00(C54667HMy hMy, String str) {
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
    public static final void A02(X.AnonymousClass1eD r6, X.C246193eB r7, com.instagram.api.schemas.MediaControlEventSourceEnum r8, X.1Xj r9, X.JSw r10, X.AnonymousClass3W1 r11) {
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
        throw new UnsupportedOperationException("Method not decompiled: X.I65.A02(X.1eD, X.3eB, com.instagram.api.schemas.MediaControlEventSourceEnum, X.1Xj, X.JSw, X.3W1):void");
    }
}

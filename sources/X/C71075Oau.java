package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.request.DirectThreadApi;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.pendingmedia.store.PendingMediaStoreSerializer;

/* renamed from: X.Oau  reason: case insensitive filesystem */
public final class C71075Oau {
    public static final C71075Oau A00 = new Object();

    public final void A02(0xF r15, UserSession userSession, C74551Pwk pwk, C49473EwE ewE, C65661fY r19, C66181kP r20, AnonymousClass0eM r21, AnonymousClass0eM r22) {
        String str;
        AnonymousClass0eM r4 = r21;
        0qQ.A0B(r4, 4);
        AnonymousClass0eM r2 = r22;
        0qQ.A0B(r2, 5);
        C66181kP r7 = r20;
        C74551Pwk pwk2 = pwk;
        if (AnonymousClass79B.A00(r7.A00).ordinal() == 0) {
            pwk2.DTM(C270214gN.A0T, (String) null);
            return;
        }
        UserSession userSession2 = userSession;
        if (r7.A04 != null) {
            String str2 = r7.A07().A00;
            String str3 = r7.A05;
            String str4 = r7.A03;
            int i = r7.A00;
            String str5 = r7.A04;
            if (str2 == null || str4 == null) {
                pwk2.DTM((C270214gN) null, (String) null);
                return;
            }
            EDL edl = new EDL(ewE, pwk2, str4, 5);
            1OC A0B = DirectThreadApi.A0B(userSession2, str2, str3, str4, (String) null, str5, i);
            A0B.A00 = edl;
            1ES.A03(A0B);
            return;
        }
        C300925yB r0 = r7.A01;
        if (r0 != null && (str = r0.A06) != null) {
            0xF r42 = r15;
            C65661fY r8 = r19;
            C64009LIw.A00(r42, userSession2, pwk2, r7, r8, r7.A07(), (PendingMediaStore) r4.getValue(), (PendingMediaStoreSerializer) r2.getValue(), str);
        }
    }

    public static final void A00(UserSession userSession, C74551Pwk pwk, AnonymousClass3Q2 r16, String str, String str2, String str3, int i) {
        String str4 = str;
        if (str != null) {
            UserSession userSession2 = userSession;
            String str5 = str2;
            String str6 = str3;
            int i2 = i;
            EC5 ec5 = new EC5(userSession, str4, str6, str5, i2);
            1OC A0B = DirectThreadApi.A0B(userSession2, str4, str5, str6, String.valueOf(r16.A2I), (String) null, i2);
            A0B.A00 = new C68426NHl(ec5, userSession2, pwk);
            1ES.A03(A0B);
            return;
        }
        pwk.DTM((C270214gN) null, (String) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        if (r3.A03 == null) goto L_0x001f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A01(X.C66181kP r3, X.C66161kJ r4) {
        /*
            int r0 = r3.A00
            com.instagram.direct.prompts.DirectPromptTypes r0 = X.AnonymousClass79B.A00(r0)
            int r2 = r0.ordinal()
            r1 = 0
            if (r2 == r1) goto L_0x0022
            r0 = 2
            if (r2 == r0) goto L_0x0023
            r0 = 6
            if (r2 == r0) goto L_0x0026
            X.5yB r0 = r3.A01
            if (r0 == 0) goto L_0x0022
            java.lang.String r0 = r0.A06
            if (r0 == 0) goto L_0x0022
            java.lang.String r0 = r3.A03
            if (r0 != 0) goto L_0x0021
        L_0x001f:
            if (r4 == 0) goto L_0x0022
        L_0x0021:
            r1 = 1
        L_0x0022:
            return r1
        L_0x0023:
            java.lang.String r0 = r3.A04
            goto L_0x002c
        L_0x0026:
            java.lang.String r0 = r3.A04
            if (r0 != 0) goto L_0x002e
            X.5yB r0 = r3.A01
        L_0x002c:
            if (r0 == 0) goto L_0x0022
        L_0x002e:
            java.lang.String r4 = r3.A03
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71075Oau.A01(X.1kP, X.1kJ):boolean");
    }
}

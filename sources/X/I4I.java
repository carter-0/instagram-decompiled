package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

public final class I4I {
    public final UserSession A00;
    public final C2363233h A01;

    public I4I(UserSession userSession, C2363233h r3) {
        0qQ.A0B(r3, 2);
        this.A00 = userSession;
        this.A01 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00da, code lost:
        if (r0 != null) goto L_0x00b3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C61079JwH A02(X.1Xj r21, X.AnonymousClass3W1 r22) {
        /*
            r20 = this;
            r0 = 1
            r3 = r22
            X.0qQ.A0B(r3, r0)
            r4 = r21
            r5 = r20
            if (r21 == 0) goto L_0x00e6
            com.instagram.common.session.UserSession r0 = r5.A00
            com.instagram.user.model.User r0 = r4.A2A(r0)
            if (r0 == 0) goto L_0x00e6
            java.lang.String r2 = r0.getUsername()
        L_0x0018:
            X.3WA r1 = r3.A0m
            X.3WA r0 = X.AnonymousClass3WA.ADS
            if (r1 != r0) goto L_0x0079
            X.IUJ r9 = X.IUJ.A00
        L_0x0020:
            X.JM8 r9 = (X.JM8) r9
            r0 = 39
            X.PqU r7 = new X.PqU
            r7.<init>((int) r0, (java.lang.Object) r3, (java.lang.Object) r4, (java.lang.Object) r5)
            r0 = 9
            X.Iw4 r10 = new X.Iw4
            r10.<init>((int) r0, (java.lang.Object) r4, (java.lang.Object) r5, (java.lang.Object) r3)
            r0 = 40
            X.PqU r6 = new X.PqU
            r6.<init>((int) r0, (java.lang.Object) r3, (java.lang.Object) r4, (java.lang.Object) r5)
            r0 = 10
            X.Iw4 r11 = new X.Iw4
            r11.<init>((int) r0, (java.lang.Object) r4, (java.lang.Object) r5, (java.lang.Object) r3)
            r8 = 11
            X.Iw4 r12 = new X.Iw4
            r12.<init>((int) r8, (java.lang.Object) r4, (java.lang.Object) r5, (java.lang.Object) r3)
            r0 = 32
            X.JG2 r1 = new X.JG2
            r1.<init>(r0, r4, r5)
            r0 = 12
            X.Iw4 r13 = new X.Iw4
            r13.<init>((int) r0, (java.lang.Object) r4, (java.lang.Object) r5, (java.lang.Object) r3)
            X.Inj r14 = new X.Inj
            r14.<init>(r4, r8)
            r0 = 13
            X.Iw4 r15 = new X.Iw4
            r15.<init>((int) r0, (java.lang.Object) r4, (java.lang.Object) r5, (java.lang.Object) r3)
            r8 = 8
            X.Iw4 r0 = new X.Iw4
            r0.<init>((int) r8, (java.lang.Object) r4, (java.lang.Object) r5, (java.lang.Object) r3)
            X.GTI r8 = new X.GTI
            r19 = r1
            r18 = r6
            r17 = r7
            r16 = r0
            r8.<init>((X.JM8) r9, (X.C62320sa) r10, (X.C62320sa) r11, (X.C62320sa) r12, (X.C62320sa) r13, (X.C62320sa) r14, (X.C62320sa) r15, (X.C62320sa) r16, (X.0sP) r17, (X.0sP) r18, (X.0sL) r19)
            X.JwH r0 = new X.JwH
            r0.<init>((X.GTI) r8, (X.1Xj) r4, (java.lang.String) r2)
            return r0
        L_0x0079:
            X.3WA r0 = X.AnonymousClass3WA.MAIN_FEED_AD_REPORT
            if (r1 != r0) goto L_0x0089
            r1 = 2131965809(0x7f133771, float:1.9568438E38)
            r0 = 2131965808(0x7f133770, float:1.9568436E38)
        L_0x0083:
            X.IUI r9 = new X.IUI
            r9.<init>(r1, r0)
            goto L_0x0020
        L_0x0089:
            X.3WA r0 = X.AnonymousClass3WA.MAIN_FEED_AD_HIDE
            if (r1 != r0) goto L_0x0094
            r1 = 2131965807(0x7f13376f, float:1.9568434E38)
            r0 = 2131965806(0x7f13376e, float:1.9568432E38)
            goto L_0x0083
        L_0x0094:
            if (r21 == 0) goto L_0x00dd
            com.instagram.common.session.UserSession r0 = r5.A00
            X.1wP r0 = X.1wN.A00(r0)
            X.3OA r0 = r0.A00(r4)
            if (r0 == 0) goto L_0x00d6
            java.util.List r1 = r0.A0m
            if (r1 == 0) goto L_0x00d1
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00d1
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r1)
        L_0x00b0:
            X.0qQ.A07(r0)
        L_0x00b3:
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r0.iterator()
        L_0x00bb:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00df
            java.lang.Object r0 = r1.next()
            X.3lB r0 = (X.C250273lB) r0
            java.lang.String r0 = r0.Bjz()
            if (r0 == 0) goto L_0x00bb
            r6.add(r0)
            goto L_0x00bb
        L_0x00d1:
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()
            goto L_0x00b0
        L_0x00d6:
            java.util.List r0 = r4.A3k()
            if (r0 == 0) goto L_0x00dd
            goto L_0x00b3
        L_0x00dd:
            X.0sn r6 = X.0sn.A00
        L_0x00df:
            X.IUH r9 = new X.IUH
            r9.<init>(r6)
            goto L_0x0020
        L_0x00e6:
            java.lang.String r2 = ""
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I4I.A02(X.1Xj, X.3W1):X.JwH");
    }

    public static final AnonymousClass1eD A00(AnonymousClass1eD r2, I4I i4i, String str, List list) {
        List list2;
        if (!(str == null || list == null)) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                C246193eB r1 = (C246193eB) it.next();
                if (!0qQ.A0K(r1.getId(), str) || r1.AwK() == null) {
                    AnonymousClass1eD AwK = r1.AwK();
                    if (AwK != null) {
                        list2 = AwK.B73();
                    } else {
                        list2 = null;
                    }
                    return A00(r2, i4i, str, list2);
                }
                r2 = r1.AwK();
                if (r2 == null) {
                    throw DbU.A0h();
                }
            }
        }
        return r2;
    }

    public static final AnonymousClass1eD A01(1Xj r2, AnonymousClass3W1 r3) {
        if (r2 == null) {
            return null;
        }
        if (r2.CcK()) {
            return r2.A0C.AZ0();
        }
        if (r3.A0o.ordinal() != 3) {
            return r2.A0C.B5S();
        }
        return r2.A0C.B2u();
    }
}

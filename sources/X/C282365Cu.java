package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5Cu  reason: invalid class name and case insensitive filesystem */
public final class C282365Cu implements 2Ag {
    public final UserSession A00;
    public final C282395Cx A01;
    public final C282375Cv A02;
    public final 2Dm A03;
    public final List A04 = 0sr.A1P(new Integer[]{1, 4, 13, 15});

    public C282365Cu(UserSession userSession, 2Dm r6) {
        0qQ.A0B(r6, 2);
        this.A00 = userSession;
        this.A03 = r6;
        C282375Cv A002 = C282375Cv.A00(userSession);
        0qQ.A07(A002);
        this.A02 = A002;
        this.A01 = new C282395Cx(userSession);
    }

    public final void D0Y(1OS r5) {
        0qQ.A0B(r5, 0);
        String A002 = A00(r5.A05);
        if (A002 != null) {
            C282375Cv.A03(A002, (List) null, 0, 7007, 0);
        }
    }

    public final void D5W(1OS r5) {
        0qQ.A0B(r5, 0);
        String A002 = A00(r5.A05);
        if (A002 != null) {
            C282375Cv.A03(A002, (List) null, 0, 7005, 0);
            C282375Cv.A03(A002, (List) null, 0, 203, 0);
            A02(r5, A002, true);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x023e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D9f(X.1OS r19, java.lang.String r20, boolean r21) {
        /*
            r18 = this;
            r5 = 0
            r6 = r19
            X.0qQ.A0B(r6, r5)
            java.lang.String r0 = r6.A05
            r7 = r18
            java.lang.String r4 = r7.A00(r0)
            if (r4 == 0) goto L_0x0268
            r11 = 5
            if (r21 == 0) goto L_0x0014
            r11 = 0
        L_0x0014:
            boolean r0 = r7.A03(r6)
            r2 = 1
            r10 = 0
            r15 = 1
            if (r0 == 0) goto L_0x0142
            com.instagram.common.session.UserSession r9 = r7.A00
            X.0Tu r8 = X.0Tu.A05
            r0 = 36323195553590267(0x810bc100142bfb, double:3.034273357634637E-306)
            boolean r0 = X.182.A06(r8, r9, r0)
            if (r0 == 0) goto L_0x0142
            X.1Ou r0 = X.1Ou.A01(r9)
            X.5DE r14 = r0.A0A
            monitor-enter(r14)
            java.util.Map r1 = r14.A04     // Catch:{ all -> 0x013f }
            java.lang.String r0 = r6.A05     // Catch:{ all -> 0x013f }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x013f }
            if (r1 == 0) goto L_0x0077
            java.util.Map r0 = r14.A02     // Catch:{ all -> 0x013f }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x013f }
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch:{ all -> 0x013f }
            if (r0 == 0) goto L_0x0077
            long r8 = r6.A01     // Catch:{ all -> 0x013f }
            com.google.common.collect.ImmutableList$Builder r13 = new com.google.common.collect.ImmutableList$Builder     // Catch:{ all -> 0x013f }
            r13.<init>()     // Catch:{ all -> 0x013f }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x013f }
            java.util.Iterator r17 = r0.iterator()     // Catch:{ all -> 0x013f }
        L_0x0057:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x013f }
            if (r0 == 0) goto L_0x007c
            java.lang.Object r12 = r17.next()     // Catch:{ all -> 0x013f }
            X.1OS r12 = (X.1OS) r12     // Catch:{ all -> 0x013f }
            java.lang.String r1 = r12.A05     // Catch:{ all -> 0x013f }
            java.lang.String r0 = r6.A05     // Catch:{ all -> 0x013f }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x013f }
            if (r0 != 0) goto L_0x0057
            long r0 = r12.A01     // Catch:{ all -> 0x013f }
            int r16 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r16 >= 0) goto L_0x0057
            r13.add(r12)     // Catch:{ all -> 0x013f }
            goto L_0x0057
        L_0x0077:
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x013f }
            goto L_0x0080
        L_0x007c:
            com.google.common.collect.ImmutableList r0 = r13.build()     // Catch:{ all -> 0x013f }
        L_0x0080:
            monitor-exit(r14)     // Catch:{ all -> 0x013f }
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r16 = r0.iterator()
        L_0x0099:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x00d1
            java.lang.Object r9 = r16.next()
            X.1OS r9 = (X.1OS) r9
            java.lang.String r1 = r9.A06
            java.lang.String r0 = "queued"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00bc
            r8.add(r9)
            boolean r0 = r7.A03(r9)
            if (r0 == 0) goto L_0x0099
            r13.add(r9)
            goto L_0x0099
        L_0x00bc:
            java.lang.String r0 = "executing"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0099
            r12.add(r6)
            boolean r0 = r7.A03(r9)
            if (r0 == 0) goto L_0x0099
            r14.add(r9)
            goto L_0x0099
        L_0x00d1:
            r1 = 10
            int r0 = X.0Yv.A1E(r8, r1)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r0)
            java.util.Iterator r8 = r8.iterator()
        L_0x00e0:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00ee
            java.lang.Object r0 = r8.next()
            r9.add(r0)
            goto L_0x00e0
        L_0x00ee:
            int r0 = X.0Yv.A1E(r13, r1)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r0)
            java.util.Iterator r13 = r13.iterator()
        L_0x00fb:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0109
            java.lang.Object r0 = r13.next()
            r8.add(r0)
            goto L_0x00fb
        L_0x0109:
            int r0 = X.0Yv.A1E(r12, r1)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>(r0)
            java.util.Iterator r12 = r12.iterator()
        L_0x0116:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0124
            java.lang.Object r0 = r12.next()
            r13.add(r0)
            goto L_0x0116
        L_0x0124:
            int r0 = X.0Yv.A1E(r14, r1)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r0)
            java.util.Iterator r1 = r14.iterator()
        L_0x0131:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0144
            java.lang.Object r0 = r1.next()
            r12.add(r0)
            goto L_0x0131
        L_0x013f:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x013f }
            throw r0
        L_0x0142:
            r1 = r10
            goto L_0x0178
        L_0x0144:
            r7.A01(r2, r4, r9)
            r0 = 2
            r7.A01(r0, r4, r13)
            int r0 = r9.size()
            long r0 = (long) r0
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
            int r0 = r8.size()
            long r0 = (long) r0
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            int r0 = r13.size()
            long r0 = (long) r0
            java.lang.Long r13 = java.lang.Long.valueOf(r0)
            int r0 = r12.size()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Long[] r0 = new java.lang.Long[]{r9, r8, r13, r0}
            java.util.List r1 = X.0sr.A1P(r0)
        L_0x0178:
            r9 = 0
            r0 = 7000(0x1b58, float:9.809E-42)
            X.C282375Cv.A03(r4, r1, r5, r0, r11)
            r1 = 7039(0x1b7f, float:9.864E-42)
            com.instagram.common.session.UserSession r8 = r7.A00
            X.0BQ r0 = X.AnonymousClass0BO.A00(r8)
            boolean r0 = r0.CKD()
            if (r0 != 0) goto L_0x018e
            r2 = 0
        L_0x018e:
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            X.C282375Cv.A03(r4, r0, r5, r1, r5)
            r2 = 7008(0x1b60, float:9.82E-42)
            int r0 = X.C395289zW.A00(r6)
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            X.C282375Cv.A03(r4, r0, r5, r2, r5)
            boolean r0 = r7.A03(r6)
            if (r0 == 0) goto L_0x01e6
            r0 = 1252(0x4e4, float:1.754E-42)
            X.C282375Cv.A03(r4, r10, r5, r0, r5)
            boolean r0 = r6 instanceof X.C66311lu
            if (r0 == 0) goto L_0x0252
            r0 = r6
            X.1lu r0 = (X.C66311lu) r0
            com.instagram.model.direct.DirectThreadKey r0 = r0.C6K()
        L_0x01c7:
            if (r0 == 0) goto L_0x01e6
            X.2Dm r1 = r7.A03
            X.2Dr r1 = (X.2Dr) r1
            X.3U9 r1 = X.2Dr.A03(r1, r0)
            if (r1 == 0) goto L_0x01e6
            boolean r0 = r1.CVb()
            if (r0 != r15) goto L_0x0245
            r0 = 134(0x86, float:1.88E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x01df:
            int r0 = r0.intValue()
            X.C282375Cv.A03(r4, r10, r5, r0, r5)
        L_0x01e6:
            X.MaY r0 = r6.A02
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x01f1
            r0 = 131(0x83, float:1.84E-43)
            X.C282375Cv.A03(r4, r10, r5, r0, r5)
        L_0x01f1:
            X.MaY r0 = r6.A02
            X.ODs r0 = r0.A00
            if (r0 == 0) goto L_0x01f9
            X.Nkj r10 = r0.A00
        L_0x01f9:
            X.Nkj r0 = X.C69405Nkj.DISAPPEARING_MESSAGE
            if (r10 != r0) goto L_0x0202
            r0 = 136(0x88, float:1.9E-43)
            X.C282375Cv.A03(r4, r9, r5, r0, r5)
        L_0x0202:
            X.5Cx r0 = r7.A01
            X.Maa r3 = r0.A00(r6)
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x0238
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x0238
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323195553393657(0x810bc100112bf9, double:3.0342733575103003E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            if (r0 == 0) goto L_0x0238
            r2 = 7043(0x1b83, float:9.87E-42)
            java.lang.Integer r0 = r3.A00
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x023e;
                case 1: goto L_0x0241;
                case 2: goto L_0x0243;
                default: goto L_0x0228;
            }
        L_0x0228:
            r0 = 1
        L_0x0229:
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            X.C282375Cv.A03(r4, r0, r5, r2, r5)
        L_0x0238:
            if (r21 != 0) goto L_0x0268
            r7.A02(r6, r4, r5)
            return
        L_0x023e:
            r0 = -99
            goto L_0x0229
        L_0x0241:
            r0 = -1
            goto L_0x0229
        L_0x0243:
            r0 = 0
            goto L_0x0229
        L_0x0245:
            boolean r0 = r1.CVZ(r8)
            if (r0 != r15) goto L_0x01e6
            r0 = 132(0x84, float:1.85E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x01df
        L_0x0252:
            boolean r0 = r6 instanceof X.1bp
            if (r0 == 0) goto L_0x01e6
            r0 = r6
            X.1bp r0 = (X.1bp) r0
            java.util.List r0 = r0.C6L()
            X.0qQ.A07(r0)
            java.lang.Object r0 = X.00k.A0J(r0)
            com.instagram.model.direct.DirectThreadKey r0 = (com.instagram.model.direct.DirectThreadKey) r0
            goto L_0x01c7
        L_0x0268:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C282365Cu.D9f(X.1OS, java.lang.String, boolean):void");
    }

    public final /* synthetic */ void D9g(1OS r1, boolean z) {
    }

    public final void DB7(1OS r5) {
        0qQ.A0B(r5, 0);
        String A002 = A00(r5.A05);
        if (A002 != null) {
            C282375Cv.A03(A002, (List) null, 0, 7006, 0);
        }
    }

    public final void DTK(0xF r5, 1OS r6, boolean z) {
        0qQ.A0B(r6, 0);
        String A002 = A00(r6.A05);
        if (A002 != null) {
            C282375Cv.A03(A002, (List) null, 0, 7001, 0);
        }
    }

    public final void DTL(0xF r6, 1OS r7, C270214gN r8, boolean z) {
        List list;
        0qQ.A0B(r7, 0);
        String A002 = A00(r7.A05);
        if (A002 != null) {
            if (r8 != null) {
                Long valueOf = Long.valueOf((long) r8.A01.A00);
                String str = r8.A03;
                0qQ.A0B(str, 0);
                list = 0sr.A1Q(new Long[]{valueOf, 00y.A0n(10, str)});
            } else {
                list = null;
            }
            C282375Cv.A03(A002, list, 0, 7003, 0);
            if (!z) {
                A02(r7, A002, false);
            }
        }
    }

    public final void DTP(0xF r5, 1OS r6) {
        0qQ.A0B(r6, 0);
        String A002 = A00(r6.A05);
        if (A002 != null) {
            C282375Cv.A03(A002, (List) null, 0, 7002, 0);
            C282375Cv.A03(A002, (List) null, 0, 203, 0);
            A02(r6, A002, true);
        }
    }

    public final /* synthetic */ void DYZ(String str, String str2, String str3) {
    }

    public final /* synthetic */ void DYd(1OS r1, String str, String str2) {
    }

    public final void Dfi(1OS r5, String str, boolean z) {
        0qQ.A0B(r5, 0);
        String A002 = A00(r5.A05);
        if (A002 != null) {
            C282375Cv.A03(A002, (List) null, 0, 7004, 0);
        }
    }

    private final String A00(String str) {
        return (String) C242173Sx.A06(C242173Sx.A0B(new C377619Mn(str, this, 4), 00k.A0o(this.A04)));
    }

    private final void A02(1OS r8, String str, boolean z) {
        long j;
        int i = 85;
        if (z) {
            i = 84;
        }
        if (A03(r8)) {
            UserSession userSession = this.A00;
            0Tu r2 = 0Tu.A05;
            if (z) {
                j = 36604670530557015L;
            } else {
                j = 36604670529246292L;
            }
            long A012 = 182.A01(r2, userSession, j);
            0qQ.A0A(Long.valueOf(A012));
            if (A012 > 0) {
                0no.A00().A01(new NSK(this, str, i), A012);
                return;
            }
        }
        C282375Cv.A03(str, (List) null, 0, i, 0);
    }

    private final boolean A03(1OS r2) {
        if (r2 instanceof C66311lu) {
            return ((C66311lu) r2).A06;
        }
        if (r2 instanceof 1bp) {
            return AnonymousClass796.A01(this.A00, (1bp) r2).A00();
        }
        return false;
    }

    private final void A01(long j, String str, List list) {
        if (!list.isEmpty()) {
            01N A1H = 0jo.A1H();
            A1H.add(Long.valueOf(j));
            int size = list.size();
            int i = 5;
            if (5 > size) {
                i = size;
            }
            List<1OS> subList = list.subList(0, i);
            ArrayList arrayList = new ArrayList();
            for (1OS r0 : subList) {
                Long A0n = 00y.A0n(10, r0.A05);
                if (A0n != null) {
                    arrayList.add(A0n);
                }
            }
            A1H.addAll(arrayList);
            C282375Cv.A03(str, 0jo.A1I(A1H), 0, 7046, 0);
        }
    }
}

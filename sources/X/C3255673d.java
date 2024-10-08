package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Set;

/* renamed from: X.73d  reason: invalid class name and case insensitive filesystem */
public final class C3255673d extends 1P0 {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ AnonymousClass7OP A01;
    public final /* synthetic */ HashMap A02;
    public final /* synthetic */ Set A03;

    public C3255673d(UserSession userSession, AnonymousClass7OP r2, HashMap hashMap, Set set) {
        this.A02 = hashMap;
        this.A01 = r2;
        this.A00 = userSession;
        this.A03 = set;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
        if (r1 != null) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0068, code lost:
        if (r0 != null) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006a, code lost:
        r13 = r0.A0t;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006c, code lost:
        r9 = X.17h.A00(r8.A00);
        r1 = X.0cp.A03(r1).getQueryParameter("recommender_igids");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007d, code lost:
        if (r1 == null) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007f, code lost:
        r0 = X.00l.A0R(r1, new java.lang.String[]{","}, 0);
        r15 = new java.util.ArrayList();
        r1 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0097, code lost:
        if (r1.hasNext() == false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0099, code lost:
        r0 = r9.A02((java.lang.String) r1.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a3, code lost:
        if (r0 == null) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a5, code lost:
        r15.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00af, code lost:
        if (r15.isEmpty() != false) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b1, code lost:
        r12 = com.instagram.api.schemas.SocialContextType.A04;
        r17 = r15.size();
        new X.1E9(new X.1hu((com.instagram.common.session.UserSession) null), 6, false);
        X.0qQ.A0B(r12, 5);
        new X.1E9(new X.1hu((com.instagram.common.session.UserSession) null), 6, false);
        r11 = new X.C258213ye(r12, r13, (java.util.List) null, r15, (java.util.List) null, r17);
        r0 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d8, code lost:
        if (r0 == null) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00da, code lost:
        r9 = r0.A0C;
        new X.1E9(new X.1hu((com.instagram.common.session.UserSession) null), 6, false);
        new X.1E9(new X.1hu((com.instagram.common.session.UserSession) null), 6, false);
        r0 = java.util.Collections.singletonList(new X.BDu(r11.F99(new X.1E9(new X.1hu((com.instagram.common.session.UserSession) null), 6, false)), (java.util.List) null));
        X.0qQ.A07(r0);
        r9.EPl(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r19) {
        /*
            r18 = this;
            r1 = r19
            r0 = -58715753(0xfffffffffc801197, float:-5.319766E36)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.5u7 r1 = (X.C298835u7) r1
            r0 = -769974400(0xffffffffd21b1f80, float:-1.66562103E11)
            int r6 = X.AnonymousClass0fD.A03(r0)
            r4 = 0
            X.0qQ.A0B(r1, r4)
            r7 = r18
            X.C3255673d.super.onSuccess(r1)
            java.util.List r0 = r1.Ao4()
            java.util.Iterator r10 = r0.iterator()
        L_0x0023:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0114
            java.lang.Object r3 = r10.next()
            X.4bN r3 = (X.C267324bN) r3
            X.1Xj r0 = r3.A02
            r13 = 0
            if (r0 == 0) goto L_0x0023
            java.lang.String r1 = r0.getId()
            if (r1 == 0) goto L_0x0023
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0023
            java.util.HashMap r0 = r7.A02
            java.lang.Object r2 = r0.get(r1)
            X.3su r2 = (X.C254703su) r2
            if (r2 == 0) goto L_0x0023
            int r1 = r2.A00
            r0 = 13
            if (r1 != r0) goto L_0x010d
            X.7OP r8 = r7.A01
            com.instagram.common.session.UserSession r0 = r7.A00
            java.util.List r0 = X.AnonymousClass7OP.A00(r0, r2)
            if (r0 == 0) goto L_0x00a9
            java.lang.Object r0 = X.00k.A0J(r0)
            X.3tC r0 = (X.C254873tC) r0
            if (r0 == 0) goto L_0x0066
            java.lang.String r1 = r0.A0u
            if (r1 != 0) goto L_0x006a
        L_0x0066:
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x006c
        L_0x006a:
            java.lang.String r13 = r0.A0t
        L_0x006c:
            com.instagram.common.session.UserSession r0 = r8.A00
            X.17i r9 = X.17h.A00(r0)
            r14 = 0
            android.net.Uri r1 = X.0cp.A03(r1)
            java.lang.String r0 = "recommender_igids"
            java.lang.String r1 = r1.getQueryParameter(r0)
            if (r1 == 0) goto L_0x010d
            java.lang.String r0 = ","
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r8 = 6
            java.util.List r0 = X.00l.A0R(r1, r0, r4)
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r1 = r0.iterator()
        L_0x0093:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ab
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            com.instagram.user.model.User r0 = r9.A02(r0)
            if (r0 == 0) goto L_0x0093
            r15.add(r0)
            goto L_0x0093
        L_0x00a9:
            r0 = r13
            goto L_0x0066
        L_0x00ab:
            boolean r0 = r15.isEmpty()
            if (r0 != 0) goto L_0x010d
            com.instagram.api.schemas.SocialContextType r12 = com.instagram.api.schemas.SocialContextType.BLEND_MEDIA_SUGGESTED_BY
            int r17 = r15.size()
            X.1hu r1 = new X.1hu
            r1.<init>(r14)
            X.1E9 r0 = new X.1E9
            r0.<init>(r1, r8, r4)
            r0 = 5
            X.0qQ.A0B(r12, r0)
            X.1hu r1 = new X.1hu
            r1.<init>(r14)
            X.1E9 r0 = new X.1E9
            r0.<init>(r1, r8, r4)
            X.3ye r11 = new X.3ye
            r16 = r14
            r11.<init>(r12, r13, r14, r15, r16, r17)
            X.1Xj r0 = r3.A02
            if (r0 == 0) goto L_0x010d
            X.1Xy r9 = r0.A0C
            X.1hu r1 = new X.1hu
            r1.<init>(r14)
            X.1E9 r0 = new X.1E9
            r0.<init>(r1, r8, r4)
            X.1hu r1 = new X.1hu
            r1.<init>(r14)
            X.1E9 r0 = new X.1E9
            r0.<init>(r1, r8, r4)
            X.1hu r1 = new X.1hu
            r1.<init>(r14)
            X.1E9 r0 = new X.1E9
            r0.<init>(r1, r8, r4)
            X.3ye r1 = r11.F99(r0)
            X.BDu r0 = new X.BDu
            r0.<init>(r1, r14)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            r9.EPl(r0)
        L_0x010d:
            X.1Xj r0 = r3.A02
            r2.A14(r0)
            goto L_0x0023
        L_0x0114:
            r0 = -2091032433(0xffffffff835d608f, float:-6.5056907E-37)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = -1895042853(0xffffffff8f0bf0db, float:-6.899616E-30)
            X.AnonymousClass0fD.A0A(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3255673d.onSuccess(java.lang.Object):void");
    }

    public final void onFail(C268654dm r5) {
        int A032 = AnonymousClass0fD.A03(-1840311091);
        0qQ.A0B(r5, 0);
        C3255673d.super.onFail(r5);
        0f9 AEf = 0wj.A01.AEf("bulk prefetch clip xma media", 817891009);
        Throwable A012 = r5.A01();
        if (A012 == null) {
            A012 = new RuntimeException("Bulk prefetch clip media failed");
        }
        AEf.ERJ(A012);
        AEf.report();
        AnonymousClass0fD.A0A(1299021537, A032);
    }

    public final void onFailInBackground(C268654dm r5) {
        int A032 = AnonymousClass0fD.A03(927420877);
        0qQ.A0B(r5, 0);
        C3255673d.super.onFailInBackground(r5);
        for (Object next : this.A03) {
            0qQ.A07(next);
            this.A01.A01.remove(next);
        }
        AnonymousClass0fD.A0A(833057983, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A032 = AnonymousClass0fD.A03(-206050227);
        int A033 = AnonymousClass0fD.A03(188458763);
        0qQ.A0B(obj, 0);
        C3255673d.super.onSuccessInBackground(obj);
        for (Object next : this.A03) {
            0qQ.A07(next);
            this.A01.A01.remove(next);
        }
        AnonymousClass0fD.A0A(1422532194, A033);
        AnonymousClass0fD.A0A(-1005635232, A032);
    }
}

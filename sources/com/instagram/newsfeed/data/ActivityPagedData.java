package com.instagram.newsfeed.data;

import X.AnonymousClass4HN;
import X.AnonymousClass7TG;
import X.AnonymousClass9JK;
import com.instagram.common.session.UserSession;
import com.instagram.repository.common.FeedPagedData;
import com.instagram.repository.common.MemoryCache;

public final class ActivityPagedData extends FeedPagedData {
    public final UserSession A00;
    public final AnonymousClass4HN A01;
    public final MemoryCache A02;
    public final boolean A03;
    public final boolean A04;

    /* JADX WARNING: type inference failed for: r12v1, types: [X.MDI, X.4D7] */
    /* JADX WARNING: type inference failed for: r15v2, types: [X.9JK] */
    /* JADX WARNING: type inference failed for: r12v5 */
    /* JADX WARNING: type inference failed for: r12v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006f, code lost:
        if (r1 != null) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0073, code lost:
        if (r1.A00 == null) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0075, code lost:
        r3 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0078, code lost:
        if (r1.A01 == false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007a, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007b, code lost:
        if (r1 == null) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007f, code lost:
        if (r1.A01 != true) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0081, code lost:
        ((X.C250653lq) r6.A02).A00.remove(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008a, code lost:
        r0 = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008c, code lost:
        if (r0 == null) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008e, code lost:
        r1 = X.C41845B3m.A0d(r0);
        r10 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a7, code lost:
        if (r1.A00 == null) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00aa, code lost:
        r12.A03 = r6;
        r12.A04 = r2;
        r12.A00 = r4;
        r12.A01 = r3;
        r12.A02 = 1;
        r1 = (X.C294645mn) r2.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ba, code lost:
        if ((r1 instanceof X.C294635mm) == false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00bc, code lost:
        r7 = r6.A01;
        r8 = r2.A05;
        r9 = ((X.C294635mm) r1).A00;
        r10 = r2.A03;
        r11 = r2.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c8, code lost:
        if (r8 != null) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ca, code lost:
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00cd, code lost:
        if (r6.A03 != false) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00cf, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d0, code lost:
        r1 = r7.A00(r8, r9, r10, r11, r12, false, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d4, code lost:
        if (r1 != r5) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d6, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d9, code lost:
        if ((r1 instanceof X.ENE) == false) goto L_0x0176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00db, code lost:
        r0 = r6.A01;
        r8 = ((X.ENE) r1).A00;
        r7 = r0.A00;
        r1 = X.AnonymousClass7TG.A0b(r7);
        r1.A0A("notifications/get_comments_by_comment_summary_id/");
        X.C51972G9s.A18(r1, r7, X.AnonymousClass5OR.class);
        r1 = X.DbT.A0T(r1, "summary_id", r8).A00(1780311179, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ff, code lost:
        r10 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x017a, code lost:
        throw X.AnonymousClass7TE.A1K();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(X.AnonymousClass9JK r22, X.AnonymousClass4D7 r23) {
        /*
            r21 = this;
            r2 = r22
            r7 = 1
            r4 = r23
            boolean r0 = r4 instanceof X.MDI
            r6 = r21
            if (r0 == 0) goto L_0x0102
            r12 = r4
            X.MDI r12 = (X.MDI) r12
            int r0 = r12.A06
            if (r0 != r7) goto L_0x0102
            int r3 = r12.A02
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x0102
            int r3 = r3 - r1
            r12.A02 = r3
        L_0x001d:
            java.lang.Object r1 = r12.A05
            X.1Hj r5 = X.1Hj.A02
            int r0 = r12.A02
            r15 = 0
            r13 = 0
            if (r0 == 0) goto L_0x005d
            if (r0 != r7) goto L_0x0171
            int r3 = r12.A01
            int r4 = r12.A00
            java.lang.Object r2 = r12.A04
            X.9JK r2 = (X.AnonymousClass9JK) r2
            java.lang.Object r10 = r12.A03
            com.instagram.newsfeed.data.ActivityPagedData r10 = (com.instagram.newsfeed.data.ActivityPagedData) r10
            X.0eS.A00(r1)
        L_0x0038:
            X.3Ii r1 = (X.C239803Ii) r1
        L_0x003a:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0109
            com.instagram.repository.common.MemoryCache r0 = r10.A02
            X.3lq r0 = (X.C250653lq) r0
            android.util.LruCache r0 = r0.A00
            r0.remove(r2)
            X.5sO r1 = (X.C297815sO) r1
            java.lang.Object r1 = r1.A00
            boolean r0 = r1 instanceof X.C268664dn
            if (r0 == 0) goto L_0x0055
            X.4dn r1 = (X.C268664dn) r1
            if (r1 == 0) goto L_0x0055
            java.lang.Throwable r15 = r1.A00
        L_0x0055:
            X.MOX r1 = X.MOX.A00
            X.JzO r0 = new X.JzO
            r0.<init>(r2, r15, r1)
            return r0
        L_0x005d:
            X.0eS.A00(r1)
            boolean r0 = r6.A04
            r1 = 0
            if (r0 == 0) goto L_0x0094
            com.instagram.repository.common.MemoryCache r0 = r6.A02
            X.3lq r0 = (X.C250653lq) r0
            android.util.LruCache r0 = r0.A00
            r0.evictAll()
        L_0x006e:
            r4 = 0
            if (r1 == 0) goto L_0x007a
        L_0x0071:
            java.lang.Object r0 = r1.A00
            if (r0 == 0) goto L_0x007a
            boolean r0 = r1.A01
            r3 = 1
            if (r0 == 0) goto L_0x007d
        L_0x007a:
            r3 = 0
            if (r1 == 0) goto L_0x00aa
        L_0x007d:
            boolean r0 = r1.A01
            if (r0 != r7) goto L_0x008a
            com.instagram.repository.common.MemoryCache r0 = r6.A02
            X.3lq r0 = (X.C250653lq) r0
            android.util.LruCache r0 = r0.A00
            r0.remove(r2)
        L_0x008a:
            java.lang.Object r0 = r1.A00
            if (r0 == 0) goto L_0x00aa
            X.3Ih r1 = X.C41845B3m.A0d(r0)
            r10 = r6
            goto L_0x003a
        L_0x0094:
            java.lang.Object r0 = r2.A01
            boolean r0 = r0 instanceof X.C294635mm
            if (r0 == 0) goto L_0x006e
            com.instagram.repository.common.MemoryCache r0 = r6.A02
            java.lang.Object r1 = r0.A00(r2)
            X.JwK r1 = (X.C61082JwK) r1
            if (r1 == 0) goto L_0x006e
            java.lang.Object r0 = r1.A00
            r4 = 1
            if (r0 != 0) goto L_0x0071
            goto L_0x006e
        L_0x00aa:
            r12.A03 = r6
            r12.A04 = r2
            r12.A00 = r4
            r12.A01 = r3
            r12.A02 = r7
            java.lang.Object r1 = r2.A01
            X.5mn r1 = (X.C294645mn) r1
            boolean r0 = r1 instanceof X.C294635mm
            if (r0 == 0) goto L_0x00d7
            X.4HN r7 = r6.A01
            java.lang.String r8 = r2.A05
            X.5mm r1 = (X.C294635mm) r1
            java.lang.String r9 = r1.A00
            java.lang.String r10 = r2.A03
            java.lang.String r11 = r2.A02
            if (r8 != 0) goto L_0x00cf
            boolean r0 = r6.A03
            r14 = 1
            if (r0 != 0) goto L_0x00d0
        L_0x00cf:
            r14 = 0
        L_0x00d0:
            java.lang.Object r1 = r7.A00(r8, r9, r10, r11, r12, r13, r14)
        L_0x00d4:
            if (r1 != r5) goto L_0x00ff
            return r5
        L_0x00d7:
            boolean r0 = r1 instanceof X.ENE
            if (r0 == 0) goto L_0x0176
            X.4HN r0 = r6.A01
            X.ENE r1 = (X.ENE) r1
            java.lang.String r8 = r1.A00
            com.instagram.common.session.UserSession r7 = r0.A00
            X.1NY r1 = X.AnonymousClass7TG.A0b(r7)
            java.lang.String r0 = "notifications/get_comments_by_comment_summary_id/"
            r1.A0A(r0)
            java.lang.Class<X.5OR> r0 = X.AnonymousClass5OR.class
            X.C51972G9s.A18(r1, r7, r0)
            java.lang.String r0 = "summary_id"
            X.1OC r1 = X.DbT.A0T(r1, r0, r8)
            r0 = 1780311179(0x6a1d648b, float:4.756904E25)
            java.lang.Object r1 = r1.A00(r0, r12)
            goto L_0x00d4
        L_0x00ff:
            r10 = r6
            goto L_0x0038
        L_0x0102:
            X.MDI r12 = new X.MDI
            r12.<init>(r6, r4, r7)
            goto L_0x001d
        L_0x0109:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x016c
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r11 = r1.A00
            X.5eW r11 = (X.C289955eW) r11
            java.util.List r0 = r11.A0L
            if (r0 == 0) goto L_0x011d
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0127
        L_0x011d:
            com.instagram.repository.common.MemoryCache r1 = r10.A02
            X.JwK r0 = new X.JwK
            r0.<init>((X.C289955eW) r11)
            r1.A01(r2, r0)
        L_0x0127:
            boolean r0 = r11.A0Q
            if (r0 != 0) goto L_0x014b
            java.lang.String r7 = r11.A0G
            if (r7 == 0) goto L_0x014b
            java.lang.String r6 = r11.A0F
            java.lang.String r5 = r11.A0E
            java.lang.Object r1 = r2.A01
            X.5mn r1 = (X.C294645mn) r1
            java.lang.String r0 = r2.A04
            X.AnonymousClass7TF.A1D(r1, r13, r0)
            X.9JK r15 = new X.9JK
            r18 = r6
            r19 = r5
            r20 = r0
            r16 = r1
            r17 = r7
            r15.<init>((X.C294645mn) r16, (java.lang.String) r17, (java.lang.String) r18, (java.lang.String) r19, (java.lang.String) r20)
        L_0x014b:
            com.instagram.common.session.UserSession r0 = r10.A00
            X.0xY r1 = X.AnonymousClass7TF.A0N(r0)
            java.lang.String r0 = "HAS_NEW_NOTIFICATION"
            r1.E5T(r0, r13)
            r1.apply()
            boolean r14 = X.AnonymousClass7TF.A1P(r4)
            if (r3 == 0) goto L_0x0160
            r13 = 1
        L_0x0160:
            r12 = 4
            X.Tth r9 = new X.Tth
            r9.<init>(r10, r11, r12, r13, r14)
            X.JZo r0 = new X.JZo
            r0.<init>(r9, r15)
            return r0
        L_0x016c:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0171:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0176:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.newsfeed.data.ActivityPagedData.A03(X.9JK, X.4D7):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityPagedData(AnonymousClass9JK r1, UserSession userSession, AnonymousClass4HN r3, MemoryCache memoryCache, boolean z, boolean z2) {
        super(r1);
        AnonymousClass7TG.A1Q(userSession, r3);
        this.A00 = userSession;
        this.A01 = r3;
        this.A02 = memoryCache;
        this.A04 = z;
        this.A03 = z2;
    }
}

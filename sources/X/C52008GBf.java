package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.GBf  reason: case insensitive filesystem */
public final class C52008GBf implements C74356PtW {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;

    public C52008GBf(Context context, AnonymousClass0iw r2, UserSession userSession) {
        this.A02 = userSession;
        this.A00 = context;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0191, code lost:
        if (r0 == false) goto L_0x0193;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.util.List AMf(android.content.Context r20, X.AnonymousClass0iw r21, X.C296995qz r22, com.instagram.common.session.UserSession r23, java.lang.Object r24) {
        /*
            r19 = this;
            r5 = r24
            X.4bN r5 = (X.C267324bN) r5
            r4 = 0
            r0 = 4
            X.0qQ.A0B(r5, r0)
            X.5o2 r1 = r5.A01
            X.5o2 r0 = X.C295365o2.MIDCARD
            r3 = 0
            r6 = r22
            if (r1 != r0) goto L_0x0092
            X.GmI r0 = r5.A01()
            java.util.List r0 = r0.A0H
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x021f
            X.GmI r0 = r5.A01()
            java.util.List r0 = r0.A0H
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r9 = r0.iterator()
        L_0x002c:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x006b
            java.lang.Object r0 = r9.next()
            X.4bN r0 = (X.C267324bN) r0
            X.1Xj r8 = r0.A02
            if (r8 == 0) goto L_0x002c
            java.lang.String r1 = r21.getModuleName()
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r7 = r20
            r2 = r23
            X.3Vo r7 = X.C242663Vj.A03(r7, r2, r8, r0, r1)
            int r0 = r6.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            android.util.Pair r2 = new android.util.Pair
            r2.<init>(r1, r0)
            java.lang.Integer r0 = r8.CBd()
            X.3Vp r1 = new X.3Vp
            r1.<init>(r2, r0)
            X.1yX r0 = new X.1yX
            r0.<init>(r7, r1)
            r3.add(r0)
            goto L_0x002c
        L_0x006b:
            X.GmI r0 = r5.A01()
            java.util.List r0 = r0.A0H
            int r2 = r0.size()
            X.GmI r0 = r5.A01()
            X.Gok r0 = r0.A06
            boolean r1 = X.AnonymousClass7TF.A1V(r0)
            r0 = 3
            if (r1 != 0) goto L_0x0085
            if (r2 <= r0) goto L_0x0085
            r2 = 3
        L_0x0085:
            java.util.List r2 = X.00k.A0d(r3, r2)
            int r1 = r6.A01
            X.9IN r0 = new X.9IN
            r0.<init>(r2, r1)
            goto L_0x021b
        L_0x0092:
            X.1Xj r14 = r5.A02
            if (r14 == 0) goto L_0x021f
            X.5o2 r0 = X.C295365o2.AD
            r2 = r19
            if (r1 != r0) goto L_0x0151
            X.3OA r0 = r5.A06()
            X.3y4 r0 = r0.A0I
            if (r0 == 0) goto L_0x0151
            X.XB5 r9 = r0.BUi()
            if (r9 == 0) goto L_0x0151
            com.instagram.common.session.UserSession r13 = r2.A02
            X.0Tu r3 = X.0Tu.A05
            r0 = 36320541262488133(0x81095700002245, double:3.0325947732536754E-306)
            boolean r0 = X.182.A06(r3, r13, r0)
            if (r0 == 0) goto L_0x0151
            android.content.Context r12 = r2.A00
            int r6 = r6.A01
            X.0iw r2 = r2.A01
            r0 = 2
            java.util.ArrayList r3 = X.DbS.A0v(r0)
            java.lang.String r0 = r2.getModuleName()
            java.lang.Integer r15 = X.AnonymousClass05K.A00
            X.3Vo r8 = X.C242663Vj.A03(r12, r13, r14, r15, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            android.util.Pair r5 = new android.util.Pair
            r5.<init>(r0, r7)
            java.lang.Integer r1 = r14.CBd()
            X.3Vp r0 = new X.3Vp
            r0.<init>(r5, r1)
            X.1yX r1 = new X.1yX
            r1.<init>(r8, r0)
            r8 = 1
            X.9IN r0 = new X.9IN
            r0.<init>(r1, r6, r4)
            r3.add(r0)
            int r5 = r6 + 1
            com.instagram.music.common.model.MusicDataSource r6 = X.C271584jF.A01(r9)
            java.lang.String r1 = X.C271584jF.A02(r13, r6)
            java.lang.String r16 = r2.getModuleName()
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            X.4im r2 = new X.4im
            r2.<init>(r0, r1)
            java.lang.String r0 = r6.A04
            r2.A08 = r0
            java.lang.String r0 = r6.A05
            r2.A0B = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r2.A07 = r0
            r0 = -1
            r2.A02 = r0
            X.3WR r2 = r2.A00()
            java.lang.String r1 = r14.getId()
            r17 = r4
            r18 = r4
            X.2iF r0 = X.C242663Vj.A00(r12, r13, r14, r15, r16, r17, r18)
            X.3Vo r6 = new X.3Vo
            r6.<init>(r0, r2, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            android.util.Pair r2 = new android.util.Pair
            r2.<init>(r0, r7)
            java.lang.Integer r1 = r14.CBd()
            X.3Vp r0 = new X.3Vp
            r0.<init>(r2, r1)
            X.1yX r1 = new X.1yX
            r1.<init>(r6, r0)
            X.9IN r0 = new X.9IN
            r0.<init>(r1, r5, r4)
            r3.add(r0)
        L_0x014d:
            X.0qQ.A0A(r3)
            return r3
        L_0x0151:
            boolean r0 = r14.A5D()
            if (r0 == 0) goto L_0x01da
            com.instagram.common.session.UserSession r9 = r2.A02
            X.0Tu r5 = X.0Tu.A05
            r0 = 36319776759750286(0x8108a500161e8e, double:3.0321112986438555E-306)
            boolean r0 = X.182.A06(r5, r9, r0)
            if (r0 == 0) goto L_0x01da
            android.content.Context r3 = r2.A00
            X.0iw r0 = r2.A01
            java.lang.String r2 = r0.getModuleName()
            int r8 = r6.A01
            int r10 = r14.A0o()
            java.lang.Integer r7 = r14.CBd()
            r6 = 1
            r0 = 2
            X.DbW.A1N(r2, r0, r7)
            X.1Bh r0 = X.1Bh.A00()
            boolean r0 = r0.A03()
            if (r0 != 0) goto L_0x0193
            r0 = 36319776759815823(0x8108a500171e8f, double:3.0321112986853013E-306)
            boolean r0 = X.182.A06(r5, r9, r0)
            r5 = 2
            if (r0 != 0) goto L_0x0194
        L_0x0193:
            r5 = 1
        L_0x0194:
            if (r5 <= r10) goto L_0x019a
            r5 = r10
            if (r10 >= r4) goto L_0x019a
            r5 = 0
        L_0x019a:
            X.2HY r0 = X.C229632nm.A0C(r4, r5)
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r13 = r0.iterator()
        L_0x01a6:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x01ec
            r0 = r13
            X.0sh r0 = (X.0sh) r0
            int r12 = r0.A00()
            X.1Xj r1 = r14.A1c(r12)
            if (r1 == 0) goto L_0x01a6
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.3Vo r10 = X.C242663Vj.A03(r3, r9, r1, r0, r2)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r4, r1)
            X.3Vp r1 = new X.3Vp
            r1.<init>(r0, r7)
            X.1yX r0 = new X.1yX
            r0.<init>(r10, r1)
            r11.add(r0)
            goto L_0x01a6
        L_0x01da:
            android.content.Context r4 = r2.A00
            com.instagram.common.session.UserSession r3 = r2.A02
            X.0iw r2 = r2.A01
            int r1 = r6.A01
            java.util.List r0 = X.AnonymousClass7TE.A1I(r14)
            java.util.ArrayList r3 = X.C242613Ve.A01(r4, r2, r3, r0, r1)
            goto L_0x014d
        L_0x01ec:
            java.util.ArrayList r4 = X.00k.A0U(r11)
            boolean r0 = r14.A4w()
            if (r0 == 0) goto L_0x0216
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.3Vo r3 = X.C242663Vj.A03(r3, r9, r14, r0, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r2, r1)
            X.3Vp r1 = new X.3Vp
            r1.<init>(r0, r7)
            X.1yX r0 = new X.1yX
            r0.<init>(r3, r1)
            r4.add(r0)
        L_0x0216:
            X.4FT r0 = new X.4FT
            r0.<init>(r4, r8, r6)
        L_0x021b:
            java.util.List r3 = X.AnonymousClass7TE.A1I(r0)
        L_0x021f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52008GBf.AMf(android.content.Context, X.0iw, X.5qz, com.instagram.common.session.UserSession, java.lang.Object):java.util.List");
    }
}

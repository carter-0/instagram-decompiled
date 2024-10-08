package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.OKr  reason: case insensitive filesystem */
public final class C70771OKr {
    public Context A00;
    public UserSession A01;
    public 2Dm A02;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: X.PBn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v4, resolved type: X.PBn} */
    /* JADX WARNING: type inference failed for: r14v2 */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        if (X.C272094k5.A03(r0.A01) != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r15.CKw() == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x018b, code lost:
        if (X.AnonymousClass7TE.A1b(r3) != false) goto L_0x018f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0103 A[LOOP:0: B:27:0x00fd->B:29:0x0103, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0171  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.OuA A00(X.C74516PwB r44, int r45, boolean r46, boolean r47) {
        /*
            r43 = this;
            r15 = r44
            long r33 = r15.BKe()
            boolean r0 = r15.isPending()
            if (r0 != 0) goto L_0x0014
            boolean r0 = r15.CKw()
            r21 = 1
            if (r0 != 0) goto L_0x0016
        L_0x0014:
            r21 = 0
        L_0x0016:
            boolean r1 = r15.CcG()
            r0 = r43
            if (r1 != 0) goto L_0x0024
            boolean r1 = r15.AqP()
            if (r1 == 0) goto L_0x002d
        L_0x0024:
            com.instagram.common.session.UserSession r1 = r0.A01
            boolean r1 = X.C272094k5.A03(r1)
            r8 = 0
            if (r1 == 0) goto L_0x015f
        L_0x002d:
            r8 = 1
            boolean r1 = r15.CKu()
            if (r1 != 0) goto L_0x003a
            boolean r1 = r15.CKt()
            if (r1 == 0) goto L_0x015f
        L_0x003a:
            r20 = 1
            int r18 = r15.BXL()
        L_0x0040:
            X.3sy r1 = r15.CBV()
            boolean r1 = X.C66647MaG.A0F(r1)
            r10 = 0
            if (r1 == 0) goto L_0x0114
            X.2Dm r2 = r0.A02
            X.3sy r1 = r15.CBV()
            X.3U9 r3 = X.C66647MaG.A02(r2, r1)
            if (r3 == 0) goto L_0x015a
            X.3su r25 = X.AnonymousClass48N.A01(r3)
            if (r25 == 0) goto L_0x0111
            android.content.Context r2 = r0.A00
            com.instagram.common.session.UserSession r1 = r0.A01
            X.48T r27 = X.C66708MbF.A00(r1, r3)
            X.MbE r14 = new X.MbE
            r22 = r14
            r23 = r2
            r24 = r1
            r26 = r3
            r22.<init>(r23, r24, r25, r26, r27)
        L_0x0072:
            X.Pwa r1 = X.C66608MYu.A01
            com.instagram.common.session.UserSession r12 = r0.A01
            X.MYu r2 = X.C66607MYt.A00(r12)
            X.3sy r1 = r15.CBV()
            X.3tH r1 = X.C66647MaG.A01(r1)
            X.Pwa r11 = r2.A00(r1)
            android.content.Context r9 = r0.A00
            X.Mi5 r13 = X.Mi4.A00(r12)
            java.util.List r17 = java.util.Collections.emptyList()
            X.0qQ.A07(r17)
            r19 = 0
            r15.CdF()
            r22 = 1
            r16 = r10
            r23 = r19
            r24 = r19
            X.Mb1 r23 = X.C66691May.A01(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            X.P3y r0 = X.C72385P3y.A00
            X.Nof r37 = X.C66697Mb4.A00(r12, r0, r14, r15)
            X.3sy r2 = r15.CBV()
            int r1 = r15.C6a()
            X.MbB r0 = new X.MbB
            r0.<init>(r2, r1)
            X.McM r22 = new X.McM
            r35 = r22
            r36 = r10
            r38 = r10
            r39 = r10
            r40 = r0
            r41 = r10
            r42 = r10
            r35.<init>(r36, r37, r38, r39, r40, r41, r42)
            java.lang.Integer r1 = r15.BMT()
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r31 = 1065353216(0x3f800000, float:1.0)
            r36 = 1
            if (r1 != r0) goto L_0x00db
            r31 = 1050253722(0x3e99999a, float:0.3)
            r36 = 0
        L_0x00db:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327799757224659(0x810ff100003ad3, double:3.037185074552667E-306)
            boolean r3 = X.182.A06(r2, r12, r0)
            r0 = r9
            r1 = r12
            r2 = r15
            r4 = r20
            r5 = r21
            X.Mb0 r24 = X.C66692Maz.A00(r0, r1, r2, r3, r4, r5)
            java.util.List r0 = r15.BkC()
            java.util.ArrayList r1 = X.C51970G9q.A0m(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x00fd:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0165
            java.lang.Object r0 = r2.next()
            X.17B r0 = (X.AnonymousClass17B) r0
            java.lang.String r0 = r0.getId()
            r1.add(r0)
            goto L_0x00fd
        L_0x0111:
            r14 = r10
            goto L_0x0072
        L_0x0114:
            X.3sy r1 = r15.CBV()
            boolean r1 = r1 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            if (r1 == 0) goto L_0x015a
            X.0eE r2 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r1 = r0.A01
            com.instagram.user.model.User r24 = r2.A01(r1)
            r1 = r15
            X.PBo r1 = (X.C72583PBo) r1
            java.lang.String r3 = r1.A08
            java.lang.String r2 = r1.A07
            java.lang.Long r7 = r1.A05
            X.2FW r6 = r1.A03
            if (r3 == 0) goto L_0x0158
            if (r2 == 0) goto L_0x0158
            if (r7 == 0) goto L_0x0158
            java.lang.String r5 = r1.A06
            int r4 = r1.A00
            long r30 = r7.longValue()
            X.0sn r28 = X.0sn.A00
            boolean r1 = r1.A0B
            X.PBn r14 = new X.PBn
            r22 = r14
            r23 = r6
            r25 = r3
            r26 = r5
            r27 = r2
            r29 = r4
            r32 = r1
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r32)
        L_0x0154:
            r25 = r10
            goto L_0x0072
        L_0x0158:
            r14 = 0
            goto L_0x0154
        L_0x015a:
            r14 = r10
            r25 = r10
            goto L_0x0072
        L_0x015f:
            r20 = 0
            r18 = 0
            goto L_0x0040
        L_0x0165:
            X.170 r0 = r15.BIs()
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.util.List r3 = r15.AxI()
            if (r0 == 0) goto L_0x017d
            X.4Cl r2 = r0.A03
            java.lang.Integer r38 = r2.B6v()
            X.4Cl r0 = r0.A03
            java.lang.String r39 = r0.Bgn()
        L_0x017d:
            boolean r0 = X.C66700Mb7.A02(r12)
            if (r0 == 0) goto L_0x018d
            if (r3 == 0) goto L_0x018d
            boolean r0 = X.AnonymousClass7TE.A1b(r3)
            r42 = 1
            if (r0 != 0) goto L_0x018f
        L_0x018d:
            r42 = 0
        L_0x018f:
            r40 = r47
            r37 = r9
            r41 = r19
            java.lang.String r29 = X.C70270O0a.A00(r37, r38, r39, r40, r41, r42)
            if (r8 == 0) goto L_0x01b2
            boolean r4 = r15.CKv()
            boolean r5 = r15.CVE()
            boolean r6 = r15.CV3()
            boolean r7 = r15.CeB()
            r2 = r9
            r3 = r20
            X.DcN r10 = X.C66696Mb3.A00(r2, r3, r4, r5, r6, r7)
        L_0x01b2:
            X.3sy r2 = r15.CBV()
            boolean r0 = r2 instanceof com.instagram.model.direct.DirectThreadKey
            if (r0 != 0) goto L_0x01d6
            boolean r0 = r2 instanceof com.instagram.model.direct.threadkey.impl.mixed.DirectMsysMixedThreadKey
            if (r0 != 0) goto L_0x01d6
            long r2 = X.C66647MaG.A00(r2)
            java.lang.String r28 = java.lang.String.valueOf(r2)
        L_0x01c6:
            X.OuA r21 = new X.OuA
            r32 = r45
            r35 = r46
            r26 = r15
            r27 = r10
            r30 = r1
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r35, r36)
            return r21
        L_0x01d6:
            com.instagram.model.direct.DirectThreadKey r0 = X.C66647MaG.A03(r2)
            java.lang.String r28 = r0.A01()
            X.0qQ.A07(r28)
            goto L_0x01c6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70771OKr.A00(X.PwB, int, boolean, boolean):X.OuA");
    }

    public C70771OKr(Context context, UserSession userSession) {
        AnonymousClass7TG.A1O(context, userSession);
        this.A01 = userSession;
        this.A00 = context;
        this.A02 = 1bJ.A00(userSession);
    }
}

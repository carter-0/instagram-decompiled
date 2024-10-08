package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.LmR  reason: case insensitive filesystem */
public final class C65047LmR implements MTY {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C53401GnY A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ LD4 A03;
    public final /* synthetic */ DirectShareTarget A04;
    public final /* synthetic */ C381779cJ A05;
    public final /* synthetic */ A6R A06;
    public final /* synthetic */ AnonymousClass3Q2 A07;
    public final /* synthetic */ C349307zv A08;
    public final /* synthetic */ Boolean A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ boolean A0D;

    public C65047LmR(Context context, C53401GnY gnY, UserSession userSession, LD4 ld4, DirectShareTarget directShareTarget, C381779cJ r6, A6R a6r, AnonymousClass3Q2 r8, C349307zv r9, Boolean bool, String str, String str2, String str3, boolean z) {
        this.A0D = z;
        this.A08 = r9;
        this.A02 = userSession;
        this.A00 = context;
        this.A04 = directShareTarget;
        this.A07 = r8;
        this.A0C = str;
        this.A05 = r6;
        this.A06 = a6r;
        this.A09 = bool;
        this.A01 = gnY;
        this.A03 = ld4;
        this.A0B = str2;
        this.A0A = str3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0077, code lost:
        if (r2.A07 == false) goto L_0x0079;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dvn(java.lang.Object r25) {
        /*
            r24 = this;
            r0 = r24
            boolean r1 = r0.A0D
            if (r1 == 0) goto L_0x00a1
            X.7zv r4 = r0.A08
            com.instagram.common.session.UserSession r3 = r0.A02
            android.content.Context r8 = r0.A00
            com.instagram.model.direct.DirectShareTarget r11 = r0.A04
            r11.getClass()
            X.3Q2 r13 = r0.A07
            java.lang.String r5 = r0.A0C
            X.9cJ r2 = r0.A05
            X.A6R r6 = r0.A06
            java.lang.Boolean r14 = r0.A09
            X.GnY r15 = r0.A01
            if (r6 == 0) goto L_0x005a
            if (r2 == 0) goto L_0x005a
            X.28D r0 = X.28D.A2T
            java.lang.String r0 = r0.toString()
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x005a
            X.0Tu r7 = X.0Tu.A05
            r0 = 36323625049861449(0x810c25000d2d49, double:3.0345449728059755E-306)
            boolean r0 = X.182.A06(r7, r3, r0)
            if (r0 == 0) goto L_0x005a
            X.1pL r14 = X.C66551pM.A00()
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.DIRECT_SHARE
            r5 = 0
            X.LD4 r1 = new X.LD4
            r1.<init>(r11, r5, r0)
            java.lang.String r0 = r4.A0k
            r16 = r3
            r17 = r5
            r18 = r1
            r19 = r2
            r20 = r6
            r21 = r13
            r22 = r0
            r14.EMy(r15, r16, r17, r18, r19, r20, r21, r22)
            return
        L_0x005a:
            com.instagram.pendingmedia.model.ClipInfo r12 = r13.A1N
            java.lang.String r6 = r4.A0h
            int r1 = r12.A09
            int r0 = r12.A06
            java.io.File r0 = X.C64188LSv.A00(r8, r12, r6, r1, r0)
            if (r0 == 0) goto L_0x0099
            X.7Z7 r7 = X.JTS.A0O(r3, r11)
            java.lang.String r15 = r0.getPath()
            r9 = 0
            if (r2 == 0) goto L_0x0079
            boolean r0 = r2.A07
            r21 = 1
            if (r0 != 0) goto L_0x007b
        L_0x0079:
            r21 = 0
        L_0x007b:
            r22 = 0
            java.lang.String r18 = r4.A07()
            if (r2 == 0) goto L_0x0097
            java.lang.String r0 = r2.A00
        L_0x0085:
            X.3tI r10 = X.C59797JYq.A00(r3, r2)
            r16 = r9
            r19 = r9
            r20 = r0
            r23 = r22
            r17 = r5
            r7.EN0(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return
        L_0x0097:
            r0 = 0
            goto L_0x0085
        L_0x0099:
            java.lang.String r1 = "StoryPendingMediaUtil"
            java.lang.String r0 = "Unable to create cover photo for video raven in InstagramCameraEntryPointTypes when calling VideoEditUtil.createCoverPhoto"
            X.0kD.A01(r1, r0)
            return
        L_0x00a1:
            X.3Q2 r10 = r0.A07
            boolean r1 = r10.A5w
            if (r1 != 0) goto L_0x00dd
            com.instagram.common.session.UserSession r7 = r0.A02
            com.instagram.model.direct.DirectShareTarget r5 = r0.A04
            boolean r1 = X.C59797JYq.A0G(r7, r5)
            if (r1 == 0) goto L_0x00dd
            r5.getClass()
            android.content.Context r1 = r0.A00
            X.1ua r4 = X.1ua.A00(r1, r7)
            X.0Tu r3 = X.0Tu.A05
            r1 = 36328753239965255(0x8110cf00003e47, double:3.0377880608771865E-306)
            boolean r1 = X.182.A06(r3, r7, r1)
            X.JTQ.A1J(r10, r4, r1)
            X.LD4 r8 = r0.A03
            X.9cJ r9 = r0.A05
            java.lang.String r11 = r0.A0B
            X.GnY r6 = r0.A01
            java.lang.String r12 = r0.A0A
            X.C59797JYq.A0A(r6, r7, r8, r9, r10, r11, r12)
            com.instagram.model.direct.DirectThreadKey r0 = r5.A00()
            X.C64008LIv.A00(r7, r0, r10, r4)
            return
        L_0x00dd:
            android.content.Context r1 = r0.A00
            com.instagram.common.session.UserSession r0 = r0.A02
            X.1ua r0 = X.1ua.A00(r1, r0)
            r0.A0B(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65047LmR.Dvn(java.lang.Object):void");
    }

    public final void Dvm() {
        throw AnonymousClass00P.createAndThrow();
    }
}

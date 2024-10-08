package com.instagram.share.facebook;

import X.0sL;
import X.2D6;
import X.AnonymousClass0iw;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60340gF;
import X.C62320sa;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.share.facebook.ReelsShareToFacebookUtils$toggleXarAllReels$1", f = "ReelsShareToFacebookUtils.kt", i = {}, l = {436, 438}, m = "invokeSuspend", n = {}, s = {})
public final class ReelsShareToFacebookUtils$toggleXarAllReels$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ 2D6 A03;
    public final /* synthetic */ C62320sa A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReelsShareToFacebookUtils$toggleXarAllReels$1(AnonymousClass0iw r2, UserSession userSession, 2D6 r4, AnonymousClass4D7 r5, C62320sa r6, boolean z, boolean z2) {
        super(2, r5);
        this.A05 = z;
        this.A02 = userSession;
        this.A01 = r2;
        this.A03 = r4;
        this.A06 = z2;
        this.A04 = r6;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4D7, com.instagram.share.facebook.ReelsShareToFacebookUtils$toggleXarAllReels$1] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r10) {
        boolean z = this.A05;
        UserSession userSession = this.A02;
        return new ReelsShareToFacebookUtils$toggleXarAllReels$1(this.A01, userSession, this.A03, r10, this.A04, z, this.A06);
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.4D7, com.instagram.share.facebook.ReelsShareToFacebookUtils$toggleXarAllReels$1] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.1Hj r1 = X.1Hj.A02
            int r0 = r10.A00
            r2 = 2
            r4 = 1
            if (r0 == 0) goto L_0x0010
            if (r0 == r4) goto L_0x0061
            X.0eS.A00(r11)
        L_0x000d:
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x0010:
            X.0eS.A00(r11)
            boolean r7 = r10.A05
            com.instagram.common.session.UserSession r3 = r10.A02
            X.0iw r0 = r10.A01
            if (r0 == 0) goto L_0x005f
            java.lang.String r6 = r0.getModuleName()
        L_0x001f:
            X.0qQ.A0B(r3, r4)
            X.1NY r5 = X.AnonymousClass7TG.A0a(r3)
            r0 = 2796(0xaec, float:3.918E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r5.A0A(r0)
            r0 = 2983(0xba7, float:4.18E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r5.A0H(r0, r7)
            java.lang.String r3 = "1"
            java.lang.String r0 = "sharing_mode"
            r5.A9m(r0, r3)
            java.lang.String r0 = "container_module"
            r5.A9m(r0, r6)
            r0 = 1305(0x519, float:1.829E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "true"
            X.DbX.A1M(r5, r3, r0)
            X.1OC r3 = X.DbT.A0U(r5, r4)
            r10.A00 = r4
            r0 = 1677891942(0x64029966, float:9.636521E21)
            java.lang.Object r11 = r3.A00(r0, r10)
            if (r11 != r1) goto L_0x0064
            return r1
        L_0x005f:
            r6 = 0
            goto L_0x001f
        L_0x0061:
            X.0eS.A00(r11)
        L_0x0064:
            X.2D6 r4 = r10.A03
            boolean r9 = r10.A06
            X.0sa r5 = r10.A04
            com.instagram.common.session.UserSession r6 = r10.A02
            boolean r0 = r11 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x000d
            boolean r0 = r11 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0088
            X.12T r0 = X.AnonymousClass12T.A00
            X.4CZ r0 = r0.A04
            r7 = 0
            r8 = 3
            X.MGG r3 = new X.MGG
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r10.A00 = r2
            java.lang.Object r0 = X.1Eo.A00(r10, r0, r3)
            if (r0 != r1) goto L_0x000d
            return r1
        L_0x0088:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.share.facebook.ReelsShareToFacebookUtils$toggleXarAllReels$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ReelsShareToFacebookUtils$toggleXarAllReels$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}

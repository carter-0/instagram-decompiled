package com.instagram.opal.impl.ui;

import X.0sL;
import X.AnonymousClass0iw;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass5b4;
import X.AnonymousClass7TE;
import X.C284945Oz;
import X.C60340gF;
import X.C62320sa;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.opal.impl.ui.OpalTeaseAnimationKt$OpalTeaseAnimation$1$1", f = "OpalTeaseAnimation.kt", i = {}, l = {46, 47, 54, 55}, m = "invokeSuspend", n = {}, s = {})
public final class OpalTeaseAnimationKt$OpalTeaseAnimation$1$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass5b4 A02;
    public final /* synthetic */ C284945Oz A03;
    public final /* synthetic */ AnonymousClass0iw A04;
    public final /* synthetic */ UserSession A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ C62320sa A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpalTeaseAnimationKt$OpalTeaseAnimation$1$1(AnonymousClass5b4 r2, C284945Oz r3, AnonymousClass0iw r4, UserSession userSession, String str, String str2, AnonymousClass4D7 r8, C62320sa r9, int i) {
        super(2, r8);
        this.A06 = str;
        this.A07 = str2;
        this.A05 = userSession;
        this.A04 = r4;
        this.A02 = r2;
        this.A01 = i;
        this.A08 = r9;
        this.A03 = r3;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.opal.impl.ui.OpalTeaseAnimationKt$OpalTeaseAnimation$1$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r12) {
        String str = this.A06;
        String str2 = this.A07;
        UserSession userSession = this.A05;
        AnonymousClass0iw r3 = this.A04;
        AnonymousClass5b4 r1 = this.A02;
        int i = this.A01;
        return new OpalTeaseAnimationKt$OpalTeaseAnimation$1$1(r1, this.A03, r3, userSession, str, str2, r12, this.A08, i);
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [com.instagram.opal.impl.ui.OpalTeaseAnimationKt$OpalTeaseAnimation$1$1, X.4D7] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0077 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0096 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b6 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            X.1Hj r4 = X.1Hj.A02
            int r0 = r14.A00
            r5 = 4
            r3 = 3
            r2 = 1
            r6 = 2
            r13 = 0
            if (r0 == 0) goto L_0x0022
            if (r0 == r2) goto L_0x0057
            if (r0 == r6) goto L_0x0078
            if (r0 == r3) goto L_0x0097
            X.0eS.A00(r15)
        L_0x0014:
            X.5Oz r1 = r14.A03
            r0 = 0
            X.C51967G9n.A16(r1, r0)
            X.0sa r0 = r14.A08
            r0.invoke()
        L_0x001f:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x0022:
            X.0eS.A00(r15)
            X.5Oz r0 = r14.A03
            boolean r0 = X.C51971G9r.A1W(r0)
            if (r0 == 0) goto L_0x001f
            java.lang.String r12 = r14.A06
            java.lang.String r11 = r14.A07
            com.instagram.common.session.UserSession r8 = r14.A05
            X.0iw r7 = r14.A04
            java.lang.String r9 = "impression"
            java.lang.String r10 = "pull_tease"
            X.C49049EoT.A00(r7, r8, r9, r10, r11, r12, r13)
            X.5b4 r8 = r14.A02
            r0 = 0
            java.lang.Float r7 = X.C51965G9l.A0q(r0)
            int r1 = r14.A01
            r0 = 0
            X.GQC r1 = X.GQC.A00(r1, r0)
            r14.A00 = r2
            java.lang.Object r0 = r8.A02()
            java.lang.Object r0 = r8.A03(r1, r7, r0, r14)
            if (r0 != r4) goto L_0x005a
            return r4
        L_0x0057:
            X.0eS.A00(r15)
        L_0x005a:
            X.5b4 r8 = r14.A02
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r7 = X.C51965G9l.A0q(r0)
            X.JNL r2 = X.C52518GVv.A03
            r1 = 1000(0x3e8, float:1.401E-42)
            r0 = 0
            X.GQC r1 = X.GQC.A01(r2, r1, r0)
            r14.A00 = r6
            java.lang.Object r0 = r8.A02()
            java.lang.Object r0 = r8.A03(r1, r7, r0, r14)
            if (r0 != r4) goto L_0x007b
            return r4
        L_0x0078:
            X.0eS.A00(r15)
        L_0x007b:
            X.5b4 r6 = r14.A02
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r2 = X.C51965G9l.A0q(r0)
            r1 = 500(0x1f4, float:7.0E-43)
            r0 = 0
            X.GQC r1 = X.GQC.A00(r1, r0)
            r14.A00 = r3
            java.lang.Object r0 = r6.A02()
            java.lang.Object r0 = r6.A03(r1, r2, r0, r14)
            if (r0 != r4) goto L_0x009a
            return r4
        L_0x0097:
            X.0eS.A00(r15)
        L_0x009a:
            X.5b4 r6 = r14.A02
            r0 = 0
            java.lang.Float r3 = X.C51965G9l.A0q(r0)
            X.JNL r2 = X.C52518GVv.A03
            r1 = 1000(0x3e8, float:1.401E-42)
            r0 = 0
            X.GQC r1 = X.GQC.A01(r2, r1, r0)
            r14.A00 = r5
            java.lang.Object r0 = r6.A02()
            java.lang.Object r0 = r6.A03(r1, r3, r0, r14)
            if (r0 != r4) goto L_0x0014
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.opal.impl.ui.OpalTeaseAnimationKt$OpalTeaseAnimation$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((OpalTeaseAnimationKt$OpalTeaseAnimation$1$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}

package com.instagram.direct.share.ui.mediacomposer.emuflash;

import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C329827Kj;
import X.C60340gF;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.share.ui.mediacomposer.emuflash.EmuFlashManager$fetchEmuFlashImageAsync$1", f = "EmuFlashManager.kt", i = {1}, l = {262, 272}, m = "invokeSuspend", n = {"qplMarkerId"}, s = {"I$0"})
public final class EmuFlashManager$fetchEmuFlashImageAsync$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public int A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C329827Kj A03;
    public final /* synthetic */ DirectThreadKey A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmuFlashManager$fetchEmuFlashImageAsync$1(UserSession userSession, C329827Kj r3, DirectThreadKey directThreadKey, String str, AnonymousClass4D7 r6, boolean z) {
        super(2, r6);
        this.A03 = r3;
        this.A05 = str;
        this.A02 = userSession;
        this.A04 = directThreadKey;
        this.A06 = z;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.direct.share.ui.mediacomposer.emuflash.EmuFlashManager$fetchEmuFlashImageAsync$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r9) {
        return new EmuFlashManager$fetchEmuFlashImageAsync$1(this.A02, this.A03, this.A04, this.A05, r9, this.A06);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.direct.share.ui.mediacomposer.emuflash.EmuFlashManager$fetchEmuFlashImageAsync$1, X.4D7] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0101  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r9 = r22
            X.1Hj r4 = X.1Hj.A02
            r3 = r21
            int r0 = r3.A01
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L_0x00e4
            if (r0 == r1) goto L_0x00f2
            int r7 = r3.A00
            X.0eS.A00(r9)
        L_0x0013:
            X.3Ii r9 = (X.C239803Ii) r9
            X.7Kj r6 = r3.A03
            java.lang.String r10 = r3.A05
            com.instagram.model.direct.DirectThreadKey r5 = r3.A04
            com.instagram.common.session.UserSession r13 = r3.A02
            boolean r4 = r3.A06
            boolean r0 = r9 instanceof X.C239793Ih
            r8 = 3
            if (r0 == 0) goto L_0x00a2
            java.lang.Object r0 = X.JTQ.A0Y(r9)
            X.C89 r0 = (X.C89) r0
            if (r0 == 0) goto L_0x0096
            X.Bvf r11 = r0.A0E()
            if (r11 == 0) goto L_0x0096
            java.lang.Class<X.Bvd> r9 = X.C43277Bvd.class
            java.lang.String r3 = "response"
            r0 = -1715466463(0xffffffff99c00f21, float:-1.9858445E-23)
            com.google.common.collect.ImmutableList r0 = r11.A06(r9, r3, r0)
            if (r0 == 0) goto L_0x0096
            java.lang.Object r11 = X.00k.A0J(r0)
            X.3lr r11 = (X.C250663lr) r11
            if (r11 == 0) goto L_0x0096
            java.lang.Class<X.Bvc> r9 = X.C43276Bvc.class
            r0 = 4418(0x1142, float:6.191E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r0)
            r0 = 1271466698(0x4bc90aca, float:2.6350996E7)
            X.3lr r12 = r11.reinterpretIfFulfillsType(r1, r3, r9, r0)
            if (r12 == 0) goto L_0x0096
            java.lang.Class<X.Bvb> r11 = X.C43275Bvb.class
            r9 = 0
            r0 = 3327(0xcff, float:4.662E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r0)
            r0 = -1876131165(0xffffffff902c82a3, float:-3.4021658E-29)
            X.3lr r3 = r12.getOptionalTreeField(r9, r3, r11, r0)
            if (r3 == 0) goto L_0x0096
            java.lang.String r0 = "uri"
            java.lang.String r3 = r3.getOptionalStringField(r9, r0)
            if (r3 == 0) goto L_0x0096
            X.0eM r0 = r6.A0H
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r0)
            X.02m r0 = (X.02m) r0
            r0.markerEnd(r7, r2)
            android.util.LruCache r0 = r6.A06
            r0.put(r10, r3)
            X.C329827Kj.A03(r6, r5, r3)
            X.Ob1 r12 = X.C71082Ob1.A00
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r9)
        L_0x008b:
            r17 = r4
            r14 = r5
            r16 = r1
            r12.A02(r13, r14, r15, r16, r17)
        L_0x0093:
            X.0gF r4 = X.C60340gF.A00
        L_0x0095:
            return r4
        L_0x0096:
            X.0eM r0 = r6.A0H
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r0)
            X.02m r0 = (X.02m) r0
            r0.markerEnd(r7, r8)
            goto L_0x0093
        L_0x00a2:
            boolean r0 = r9 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0186
            X.4dm r2 = X.JTP.A0N(r9)
            X.0eM r0 = r6.A0H
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r0)
            X.02m r0 = (X.02m) r0
            r0.markerEnd(r7, r8)
            java.lang.Throwable r2 = r2.A01()
            boolean r0 = r2 instanceof X.C62686Kkm
            if (r0 == 0) goto L_0x0093
            X.Kkm r2 = (X.C62686Kkm) r2
            X.XRM r3 = r2.A00
            X.XRM r0 = X.XRM.NOT_FLASH_TYPEAHEAD_CASE
            android.view.ViewGroup r2 = r6.A01
            if (r3 != r0) goto L_0x00d2
            if (r2 == 0) goto L_0x0093
            X.M4E r0 = new X.M4E
            r0.<init>(r6)
            r2.post(r0)
            goto L_0x0093
        L_0x00d2:
            if (r2 == 0) goto L_0x0093
            int r0 = r2.getVisibility()
            if (r0 != 0) goto L_0x0093
            X.C329827Kj.A01(r6)
            X.Ob1 r12 = X.C71082Ob1.A00
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r1)
            goto L_0x008b
        L_0x00e4:
            X.0eS.A00(r9)
            r5 = 200(0xc8, double:9.9E-322)
            r3.A01 = r1
            java.lang.Object r0 = X.C241603Pv.A01(r3, r5)
            if (r0 != r4) goto L_0x00f5
            return r4
        L_0x00f2:
            X.0eS.A00(r9)
        L_0x00f5:
            X.7Kj r6 = r3.A03
            java.lang.String r0 = r6.A0K
            java.lang.String r13 = r3.A05
            boolean r0 = X.0qQ.A0K(r0, r13)
            if (r0 == 0) goto L_0x0093
            com.instagram.common.session.UserSession r11 = r3.A02
            com.instagram.model.direct.DirectThreadKey r8 = r3.A04
            boolean r10 = r3.A06
            r9 = 0
            X.0qQ.A0B(r11, r9)
            X.0wc r5 = X.AnonymousClass0kN.A02(r11)
            java.lang.String r0 = "emu_flash_model_call"
            X.0Aj r7 = X.AnonymousClass7TE.A0e(r5, r0)
            boolean r0 = r7.isSampled()
            if (r0 == 0) goto L_0x014c
            r10 = r10 ^ 1
            r0 = 365(0x16d, float:5.11E-43)
            java.lang.String r5 = X.AnonymousClass000.A00(r0)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == r0) goto L_0x0181
            X.AnonymousClass7TE.A1W(r7, r5, r10)
        L_0x012a:
            X.XSV r5 = X.C71082Ob1.A00(r11, r8)
            r0 = 380(0x17c, float:5.32E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.A8M(r5, r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r9)
            java.lang.String r0 = "is_e2ee"
            r7.A7p(r0, r5)
            if (r8 == 0) goto L_0x017f
            java.lang.String r5 = r8.A01
        L_0x0144:
            java.lang.String r0 = "thread_id"
            r7.AAJ(r0, r5)
            r7.Cgf()
        L_0x014c:
            r5 = 528039445(0x1f793e15, float:5.2779154E-20)
            X.0eM r0 = r6.A0H
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r0)
            X.02m r0 = (X.02m) r0
            r0.markerStart(r5)
            com.instagram.genai.imageservice.api.GenAIImagineQueryGraphQLApi r10 = com.instagram.genai.imageservice.api.GenAIImagineQueryGraphQLApi.A00
            int r0 = r6.A00
            java.lang.Integer r12 = X.JTO.A0w(r0)
            r16 = 0
            r3.A00 = r5
            r3.A01 = r2
            java.lang.String r14 = "FLASH"
            java.lang.String r15 = "IG_DIRECT"
            r20 = 30
            r17 = r16
            r18 = r3
            r19 = r1
            java.lang.Object r9 = r10.A00(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            if (r9 == r4) goto L_0x0095
            r7 = 528039445(0x1f793e15, float:5.2779154E-20)
            goto L_0x0013
        L_0x017f:
            r5 = 0
            goto L_0x0144
        L_0x0181:
            r0 = 0
            r7.AAJ(r5, r0)
            goto L_0x012a
        L_0x0186:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.share.ui.mediacomposer.emuflash.EmuFlashManager$fetchEmuFlashImageAsync$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EmuFlashManager$fetchEmuFlashImageAsync$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}

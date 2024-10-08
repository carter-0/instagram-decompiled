package com.meta.metaai.imagine.creation.impl.launcher;

import X.0sK;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.C54556HIr;
import X.C60340gF;
import X.HQ3;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.meta.metaai.imagine.creation.impl.launcher.ImagineCreationLauncher$onScreenChanged$1$1", f = "ImagineCreationLauncher.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ImagineCreationLauncher$onScreenChanged$1$1 extends AnonymousClass1Ek implements 0sK {
    public /* synthetic */ Object A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ C54556HIr A02;
    public final /* synthetic */ HQ3 A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImagineCreationLauncher$onScreenChanged$1$1(C54556HIr hIr, HQ3 hq3, AnonymousClass4D7 r4) {
        super(3, r4);
        this.A02 = hIr;
        this.A03 = hq3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        ImagineCreationLauncher$onScreenChanged$1$1 imagineCreationLauncher$onScreenChanged$1$1 = new ImagineCreationLauncher$onScreenChanged$1$1(this.A02, this.A03, (AnonymousClass4D7) obj3);
        imagineCreationLauncher$onScreenChanged$1$1.A00 = obj;
        imagineCreationLauncher$onScreenChanged$1$1.A01 = obj2;
        return imagineCreationLauncher$onScreenChanged$1$1.invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008a, code lost:
        if (r9.A07 == false) goto L_0x008c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            r22 = this;
            X.0eS.A00(r23)
            r1 = r22
            java.lang.Object r6 = r1.A00
            java.lang.Object r9 = r1.A01
            X.HIE r9 = (X.HIE) r9
            X.HIr r0 = r1.A02
            X.HQ3 r2 = r1.A03
            X.HIH r2 = (X.HIH) r2
            X.HtY r1 = r2.A00
            boolean r5 = X.DbW.A1a(r1)
            boolean r12 = r2.A01
            java.lang.String r16 = X.C54556HIr.A00(r0, r12)
            boolean r1 = r6 instanceof X.C54520HHg
            r3 = 2131966298(0x7f13395a, float:1.956943E38)
            if (r1 == 0) goto L_0x0027
            r3 = 2131966333(0x7f13397d, float:1.9569501E38)
        L_0x0027:
            X.Htc r2 = r0.A0D
            java.lang.Integer r7 = r2.A08
            java.lang.Integer r10 = X.AnonymousClass05K.A01
            java.lang.String r4 = "null cannot be cast to non-null type com.meta.metaai.imagine.creation.impl.viewmodel.ImagineScreenNavigationState.EditScreen"
            if (r7 == r10) goto L_0x004b
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            if (r7 == r2) goto L_0x004b
            if (r1 != 0) goto L_0x004b
            r11 = 0
            r1 = 0
        L_0x0039:
            int r10 = r7.intValue()
            r8 = 1
            r2 = 0
            if (r10 == r2) goto L_0x00b9
            if (r10 == r8) goto L_0x0071
            r2 = 2
            if (r10 == r2) goto L_0x0071
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x004b:
            X.0qQ.A0C(r9, r4)
            boolean r8 = r9.A05
            r13 = 0
            r11 = 20
            X.J73 r2 = new X.J73
            r2.<init>(r11, r0, r12)
            if (r8 == 0) goto L_0x006d
            X.HNO r14 = X.HNO.A0W
            X.HNO r15 = X.HNO.A0O
        L_0x005e:
            X.HtV r11 = new X.HtV
            r18 = r16
            r19 = r2
            r20 = r8
            r17 = r10
            r12 = r11
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x0039
        L_0x006d:
            X.HNO r14 = X.HNO.A0B
            r15 = r14
            goto L_0x005e
        L_0x0071:
            X.HHg r2 = X.C54520HHg.A00
            boolean r2 = X.0qQ.A0K(r6, r2)
            if (r2 != 0) goto L_0x008c
            X.HHh r2 = X.C54521HHh.A00
            boolean r2 = X.0qQ.A0K(r6, r2)
            if (r2 == 0) goto L_0x00b4
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            if (r7 != r2) goto L_0x00b2
            X.0qQ.A0C(r9, r4)
            boolean r2 = r9.A07
            if (r2 != 0) goto L_0x00b2
        L_0x008c:
            android.content.Context r4 = r0.A00
            r2 = 2131966346(0x7f13398a, float:1.9569528E38)
            if (r8 == 0) goto L_0x0096
            r2 = 2131966347(0x7f13398b, float:1.956953E38)
        L_0x0096:
            java.lang.String r18 = r4.getString(r2)
            X.0qQ.A0A(r18)
            if (r8 == 0) goto L_0x00af
            X.HNN r13 = X.HNN.A0G
        L_0x00a1:
            r16 = 0
            r2 = 30
            X.Iwj r7 = new X.Iwj
            r7.<init>(r2, r0, r8)
            if (r8 == 0) goto L_0x00cd
            X.HNN r14 = X.HNN.A0G
            goto L_0x00cf
        L_0x00af:
            X.HNN r13 = X.HNN.A0E
            goto L_0x00a1
        L_0x00b2:
            r8 = 0
            goto L_0x008c
        L_0x00b4:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00b9:
            android.content.Context r4 = r0.A00
            r2 = 2131966346(0x7f13398a, float:1.9569528E38)
            java.lang.String r18 = X.AnonymousClass7TE.A16(r4, r2)
            X.HNN r13 = X.HNN.A0E
            r16 = 0
            r2 = 21
            X.GN2 r7 = new X.GN2
            r7.<init>(r2, r0, r6, r5)
        L_0x00cd:
            X.HNN r14 = X.HNN.A0F
        L_0x00cf:
            X.HNO r15 = X.HNO.A0W
            java.lang.Integer r17 = X.AnonymousClass05K.A00
            X.I1u r12 = new X.I1u
            r19 = r7
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            X.HtX r6 = r0.A0E
            java.lang.String r13 = X.AnonymousClass7TE.A16(r4, r3)
            java.lang.Integer r15 = r6.A08
            long r2 = r6.A00
            r20 = 1
            X.2WX r10 = r6.A02
            android.graphics.drawable.Drawable r9 = r6.A01
            java.lang.Integer r5 = r6.A07
            java.lang.CharSequence r14 = r6.A05
            boolean r4 = r6.A0A
            X.HtX r8 = new X.HtX
            r17 = r2
            r19 = r1
            r21 = r4
            r16 = r5
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r19, r20, r21)
            r0.A0G(r8)
            X.0gF r0 = X.C60340gF.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.imagine.creation.impl.launcher.ImagineCreationLauncher$onScreenChanged$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

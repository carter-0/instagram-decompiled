package com.meta.compose.material.bottomsheet;

import X.0sJ;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.meta.compose.material.bottomsheet.AnchoredDraggableKt$animateTo$2", f = "AnchoredDraggable.kt", i = {}, l = {664}, m = "invokeSuspend", n = {}, s = {})
public final class AnchoredDraggableKt$animateTo$2 extends AnonymousClass1Ek implements 0sJ {
    public int A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public /* synthetic */ Object A03;
    public final /* synthetic */ float A04;
    public final /* synthetic */ AnchoredDraggableState A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$animateTo$2(AnchoredDraggableState anchoredDraggableState, AnonymousClass4D7 r3, float f) {
        super(4, r3);
        this.A05 = anchoredDraggableState;
        this.A04 = f;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        AnchoredDraggableKt$animateTo$2 anchoredDraggableKt$animateTo$2 = new AnchoredDraggableKt$animateTo$2(this.A05, (AnonymousClass4D7) obj4, this.A04);
        anchoredDraggableKt$animateTo$2.A01 = obj;
        anchoredDraggableKt$animateTo$2.A02 = obj2;
        anchoredDraggableKt$animateTo$2.A03 = obj3;
        return anchoredDraggableKt$animateTo$2.invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.4D7] */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.0rh] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.1Hj r3 = X.1Hj.A02
            r7 = r12
            int r0 = r12.A00
            r4 = 1
            if (r0 == 0) goto L_0x000e
            X.0eS.A00(r13)
        L_0x000b:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x000e:
            X.0eS.A00(r13)
            java.lang.Object r5 = r12.A01
            java.lang.Object r1 = r12.A02
            X.Htm r1 = (X.C56158Htm) r1
            java.lang.Object r0 = r12.A03
            float r10 = r1.A00(r0)
            boolean r0 = java.lang.Float.isNaN(r10)
            if (r0 != 0) goto L_0x000b
            X.0rh r2 = new X.0rh
            r2.<init>()
            com.meta.compose.material.bottomsheet.AnchoredDraggableState r1 = r12.A05
            X.5PZ r0 = r1.A03
            float r9 = X.C51976G9y.A00(r0)
            r2.A00 = r9
            float r11 = r12.A04
            X.5b9 r6 = r1.A00
            r0 = 5
            X.JG0 r8 = new X.JG0
            r8.<init>(r0, r5, r2)
            r0 = 0
            r12.A01 = r0
            r12.A02 = r0
            r12.A00 = r4
            java.lang.Object r0 = androidx.compose.animation.core.SuspendAnimationKt.A03(r6, r7, r8, r9, r10, r11)
            if (r0 != r3) goto L_0x000b
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.compose.material.bottomsheet.AnchoredDraggableKt$animateTo$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

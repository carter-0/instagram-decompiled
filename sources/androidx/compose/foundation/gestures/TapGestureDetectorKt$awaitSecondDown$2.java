package androidx.compose.foundation.gestures;

import X.0sL;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C267894cP;
import X.C60340gF;
import X.GPU;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", f = "TapGestureDetector.kt", i = {0, 0}, l = {212}, m = "invokeSuspend", n = {"$this$withTimeoutOrNull", "minUptime"}, s = {"L$0", "J$0"})
public final class TapGestureDetectorKt$awaitSecondDown$2 extends C267894cP implements 0sL {
    public int A00;
    public long A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ GPU A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$awaitSecondDown$2(GPU gpu, AnonymousClass4D7 r3) {
        super(2, r3);
        this.A03 = gpu;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r4) {
        ? tapGestureDetectorKt$awaitSecondDown$2 = new TapGestureDetectorKt$awaitSecondDown$2(this.A03, r4);
        tapGestureDetectorKt$awaitSecondDown$2.A02 = obj;
        return tapGestureDetectorKt$awaitSecondDown$2;
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2, X.4D7] */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0017 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003a A[RETURN] */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.1Hj r8 = X.1Hj.A02
            int r0 = r9.A00
            r7 = 1
            if (r0 == 0) goto L_0x0018
            long r2 = r9.A01
            java.lang.Object r0 = r9.A02
            X.6GK r4 = X.C51965G9l.A0O(r0, r10)
        L_0x000f:
            X.GPU r10 = (X.GPU) r10
            long r5 = r10.A0A
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x002c
            return r10
        L_0x0018:
            X.0eS.A00(r10)
            java.lang.Object r4 = r9.A02
            X.6GK r4 = (X.AnonymousClass6GK) r4
            X.GPU r0 = r9.A03
            long r2 = r0.A0A
            X.5RG r0 = r4.CEf()
            long r0 = r0.Ayi()
            long r2 = r2 + r0
        L_0x002c:
            r9.A02 = r4
            r9.A01 = r2
            r9.A00 = r7
            X.GWN r0 = X.GWN.Main
            java.lang.Object r10 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A01(r4, r0, r9, r7)
            if (r10 != r8) goto L_0x000f
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((TapGestureDetectorKt$awaitSecondDown$2) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}

package androidx.compose.ui.input.pointer;

import X.19B;
import X.1Ey;
import X.1IW;
import X.1IX;
import X.AnonymousClass4D7;
import X.AnonymousClass5RG;
import X.AnonymousClass5WH;
import X.AnonymousClass6FP;
import X.AnonymousClass6GK;
import X.C262094Cc;
import X.C268024cd;
import X.C285045Pl;
import X.C288015bE;
import X.C288025bF;
import X.C289005cr;
import X.C289055cw;
import X.C291905i4;
import X.GWN;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine implements C268024cd, AnonymousClass4D7, AnonymousClass6GK {
    public GWN A00 = GWN.Main;
    public 1IX A01;
    public final AnonymousClass4D7 A02;
    public final C262094Cc A03 = 19B.A00;
    public final /* synthetic */ AnonymousClass6FP A04;
    public final /* synthetic */ AnonymousClass6FP A05;

    public final float AwL() {
        return this.A05.AwL();
    }

    public final float B77() {
        return this.A05.B77();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object FNY(X.AnonymousClass4D7 r13, X.0sL r14, long r15) {
        /*
            r12 = this;
            r3 = 3
            boolean r0 = X.AnonymousClass9JX.A00(r3, r13)
            r7 = r12
            if (r0 == 0) goto L_0x0026
            r4 = r13
            X.9JX r4 = (X.AnonymousClass9JX) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0026
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A02
            X.1Hj r5 = X.1Hj.A02
            int r0 = r4.A00
            r3 = 1
            if (r0 == 0) goto L_0x0038
            if (r0 != r3) goto L_0x0030
            java.lang.Object r2 = r4.A01
            X.4Co r2 = (X.C262204Co) r2
            goto L_0x002c
        L_0x0026:
            X.9JX r4 = new X.9JX
            r4.<init>(r12, r13, r3)
            goto L_0x0016
        L_0x002c:
            X.0eS.A00(r1)     // Catch:{ all -> 0x0085 }
            goto L_0x007f
        L_0x0030:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0038:
            X.0eS.A00(r1)
            r1 = 0
            r10 = r15
            int r0 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x005f
            X.1IX r2 = r12.A01
            if (r2 == 0) goto L_0x005f
            java.lang.String r1 = "Timed out waiting for "
            java.lang.String r0 = " ms"
            java.lang.String r0 = X.002.A0e(r1, r0, r10)
            X.TSe r1 = new X.TSe
            r1.<init>(r0)
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.0eQ r0 = new X.0eQ
            r0.<init>(r1)
            r2.resumeWith(r0)
        L_0x005f:
            X.6FP r0 = r12.A04
            X.4Cq r2 = r0.A05()
            r8 = 0
            r9 = 2
            X.9Jv r6 = new X.9Jv
            r6.<init>(r7, r8, r9, r10)
            X.19B r1 = X.19B.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.1Er r2 = X.1Eo.A03(r0, r1, r6, r2)
            r4.A01 = r2     // Catch:{ all -> 0x0085 }
            r4.A00 = r3     // Catch:{ all -> 0x0085 }
            java.lang.Object r1 = r14.invoke(r12, r4)     // Catch:{ all -> 0x0085 }
            if (r1 != r5) goto L_0x007f
            return r5
        L_0x007f:
            X.TSh r0 = X.C13266TSh.A00
            r2.AG7(r0)
            return r1
        L_0x0085:
            r1 = move-exception
            X.TSh r0 = X.C13266TSh.A00
            r2.AG7(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine.FNY(X.4D7, X.0sL, long):java.lang.Object");
    }

    public SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine(AnonymousClass6FP r2, AnonymousClass4D7 r3) {
        this.A04 = r2;
        this.A02 = r3;
        this.A05 = r2;
    }

    public final Object AD0(GWN gwn, AnonymousClass4D7 r5) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = 1IW.A02;
        1IW r0 = new 1IW(1, 1Ey.A02(r5));
        r0.A0I();
        this.A00 = gwn;
        this.A01 = r0;
        return r0.A0E();
    }

    public final long B36() {
        AnonymousClass6FP r2 = this.A04;
        long A042 = C289055cw.A04(r2, AnonymousClass5WH.A02(r2).A0B.BTR());
        long j = r2.A00;
        return C288015bE.A00(Math.max(0.0f, C288025bF.A02(A042) - ((float) ((int) (j >> 32)))) / 2.0f, Math.max(0.0f, C288025bF.A00(A042) - ((float) C289005cr.A00(j))) / 2.0f);
    }

    public final AnonymousClass5RG CEf() {
        return AnonymousClass5WH.A02(this.A04).A0B;
    }

    public final int EJS(float f) {
        return C289055cw.A01(this.A05, f);
    }

    public final float Ezu(long j) {
        return C291905i4.A00(this.A05, j);
    }

    public final float Ezv(float f) {
        return f / this.A05.AwL();
    }

    public final float Ezw(int i) {
        return ((float) i) / this.A05.AwL();
    }

    public final long Ezx(long j) {
        return C289055cw.A03(this.A05, j);
    }

    public final float F05(long j) {
        return C289055cw.A00(this.A05, j);
    }

    public final float F06(float f) {
        return f * this.A05.AwL();
    }

    public final long FH8(long j) {
        return C289055cw.A04(this.A05, j);
    }

    public final long FH9(float f) {
        return C291905i4.A01(this.A05, f);
    }

    public final long FHA(float f) {
        AnonymousClass6FP r1 = this.A05;
        return r1.FH9(r1.Ezv(f));
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MEC, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object FNZ(X.AnonymousClass4D7 r6, X.0sL r7, long r8) {
        /*
            r5 = this;
            r3 = 8
            boolean r0 = X.MEC.A03(r3, r6)
            if (r0 == 0) goto L_0x0022
            r4 = r6
            X.MEC r4 = (X.MEC) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0022
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A01
            X.1Hj r2 = X.1Hj.A02
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L_0x0036
            if (r1 != r0) goto L_0x002e
            goto L_0x002a
        L_0x0022:
            r0 = 42
            X.MEC r4 = new X.MEC
            r4.<init>(r5, r6, r3, r0)
            goto L_0x0016
        L_0x002a:
            X.0eS.A00(r3)     // Catch:{ TSe -> 0x0042 }
            return r3
        L_0x002e:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0036:
            X.0eS.A00(r3)
            r4.A00 = r0     // Catch:{ TSe -> 0x0042 }
            java.lang.Object r3 = r5.FNY(r4, r7, r8)     // Catch:{ TSe -> 0x0042 }
            if (r3 != r2) goto L_0x0043
            return r2
        L_0x0042:
            r3 = 0
        L_0x0043:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine.FNZ(X.4D7, X.0sL, long):java.lang.Object");
    }

    public final C262094Cc getContext() {
        return this.A03;
    }

    public final void resumeWith(Object obj) {
        C285045Pl r1 = this.A04.A07;
        synchronized (r1) {
            r1.A0B(this);
        }
        this.A02.resumeWith(obj);
    }
}

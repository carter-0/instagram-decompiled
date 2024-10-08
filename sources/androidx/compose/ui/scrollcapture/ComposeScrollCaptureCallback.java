package androidx.compose.ui.scrollcapture;

import X.19E;
import X.1Eo;
import X.1Er;
import X.AnonymousClass4D7;
import X.AnonymousClass5SX;
import X.C262224Cq;
import X.C290045ef;
import X.C290055eg;
import X.C51966G9m;
import X.C51967G9n;
import X.C56558I1m;
import X.C56874IFv;
import X.I9Q;
import X.J6M;
import X.MDE;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;

public final class ComposeScrollCaptureCallback implements ScrollCaptureCallback {
    public final RelativeScroller A00;
    public final AnonymousClass5SX A01;
    public final C290055eg A02;
    public final C56558I1m A03;
    public final C262224Cq A04;

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        Rect rect2 = rect;
        1Er A1L = C51966G9m.A1L(new ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1(rect2, scrollCaptureSession, this, consumer, (AnonymousClass4D7) null), this.A04);
        A1L.CO3(J6M.A00(cancellationSignal, 40));
        cancellationSignal.setOnCancelListener(new I9Q(A1L));
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r6v1, types: [X.Ikv, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ac A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ java.lang.Object A03(android.view.ScrollCaptureSession r12, androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback r13, X.C56558I1m r14, X.AnonymousClass4D7 r15) {
        /*
            boolean r0 = r15 instanceof X.C58063Ikv
            if (r0 == 0) goto L_0x00bc
            r6 = r15
            X.Ikv r6 = (X.C58063Ikv) r6
            int r2 = r6.A02
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00bc
            int r2 = r2 - r1
            r6.A02 = r2
        L_0x0012:
            java.lang.Object r2 = r6.A06
            X.1Hj r5 = X.1Hj.A02
            int r1 = r6.A02
            r7 = 2
            r0 = 1
            if (r1 == 0) goto L_0x006c
            if (r1 == r0) goto L_0x0058
            if (r1 != r7) goto L_0x0110
            int r3 = r6.A01
            int r4 = r6.A00
            java.lang.Object r14 = r6.A05
            X.I1m r14 = (X.C56558I1m) r14
            java.lang.Object r12 = r6.A04
            android.view.ScrollCaptureSession r12 = (android.view.ScrollCaptureSession) r12
            java.lang.Object r13 = r6.A03
            androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback r13 = (androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback) r13
            X.0eS.A00(r2)
        L_0x0033:
            androidx.compose.ui.scrollcapture.RelativeScroller r5 = r13.A00
            float r0 = r5.A00
            int r0 = X.AnonymousClass1GB.A01(r0)
            int r4 = r4 - r0
            int r2 = r5.A01
            r1 = 0
            int r4 = X.C229632nm.A03(r4, r1, r2)
            float r0 = r5.A00
            int r0 = X.AnonymousClass1GB.A01(r0)
            int r3 = r3 - r0
            int r6 = X.C229632nm.A03(r3, r1, r2)
            r9 = 0
            int r3 = r14.A01
            int r2 = r14.A02
            if (r4 != r6) goto L_0x00c3
            X.I1m r5 = X.C56558I1m.A04
            return r5
        L_0x0058:
            int r3 = r6.A01
            int r4 = r6.A00
            java.lang.Object r14 = r6.A05
            X.I1m r14 = (X.C56558I1m) r14
            java.lang.Object r12 = r6.A04
            android.view.ScrollCaptureSession r12 = (android.view.ScrollCaptureSession) r12
            java.lang.Object r13 = r6.A03
            androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback r13 = (androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback) r13
            X.0eS.A00(r2)
            goto L_0x0098
        L_0x006c:
            X.0eS.A00(r2)
            int r4 = r14.A03
            int r3 = r14.A00
            androidx.compose.ui.scrollcapture.RelativeScroller r9 = r13.A00
            r6.A03 = r13
            r6.A04 = r12
            r6.A05 = r14
            r6.A00 = r4
            r6.A01 = r3
            r6.A02 = r0
            r10 = r4
            if (r4 > r3) goto L_0x011e
            int r2 = r3 - r4
            int r8 = r9.A01
            if (r2 > r8) goto L_0x0115
            float r11 = (float) r4
            float r2 = r9.A00
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x00ad
            float r1 = (float) r3
            float r0 = (float) r8
            float r0 = r0 + r2
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x00ad
        L_0x0098:
            X.IzY r0 = X.C58909IzY.A00
            r6.A03 = r13
            r6.A04 = r12
            r6.A05 = r14
            r6.A00 = r4
            r6.A01 = r3
            r6.A02 = r7
            java.lang.Object r0 = X.C3026564t.A01(r6, r0)
            if (r0 != r5) goto L_0x0033
            return r5
        L_0x00ad:
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x00b3
            int r10 = r3 - r8
        L_0x00b3:
            float r0 = (float) r10
            float r0 = r0 - r2
            java.lang.Object r0 = androidx.compose.ui.scrollcapture.RelativeScroller.A00(r9, r6, r0)
            if (r0 != r5) goto L_0x0098
            return r5
        L_0x00bc:
            X.Ikv r6 = new X.Ikv
            r6.<init>(r13, r15)
            goto L_0x0012
        L_0x00c3:
            X.5SX r0 = r13.A01
            X.4cg r10 = r0.A05()
            if (r10 == 0) goto L_0x0109
            android.view.Surface r0 = r12.getSurface()
            android.graphics.Canvas r8 = r0.lockHardwareCanvas()
            android.graphics.BlendMode r0 = android.graphics.BlendMode.CLEAR     // Catch:{ all -> 0x0100 }
            r8.drawColor(r1, r0)     // Catch:{ all -> 0x0100 }
            android.graphics.Canvas r0 = X.AnonymousClass5R4.A00     // Catch:{ all -> 0x0100 }
            X.5R3 r7 = new X.5R3     // Catch:{ all -> 0x0100 }
            r7.<init>()     // Catch:{ all -> 0x0100 }
            r7.A00 = r8     // Catch:{ all -> 0x0100 }
            float r0 = (float) r3     // Catch:{ all -> 0x0100 }
            float r1 = -r0
            float r0 = (float) r4     // Catch:{ all -> 0x0100 }
            float r0 = -r0
            r7.FHv(r1, r0)     // Catch:{ all -> 0x0100 }
            r10.A0k(r7, r9)     // Catch:{ all -> 0x0100 }
            android.view.Surface r0 = r12.getSurface()
            r0.unlockCanvasAndPost(r8)
            float r0 = r5.A00
            int r0 = X.AnonymousClass1GB.A01(r0)
            int r4 = r4 + r0
            int r6 = r6 + r0
            X.I1m r5 = new X.I1m
            r5.<init>(r3, r4, r2, r6)
            return r5
        L_0x0100:
            r1 = move-exception
            android.view.Surface r0 = r12.getSurface()
            r0.unlockCanvasAndPost(r8)
            throw r1
        L_0x0109:
            java.lang.String r0 = "Could not find coordinator for semantics node."
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0110:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0115:
            java.lang.String r1 = "Expected range ("
            java.lang.String r0 = ") to be ≤ viewportSize="
            java.lang.IllegalArgumentException r0 = X.C51971G9r.A0l(r1, r0, r2, r8)
            throw r0
        L_0x011e:
            java.lang.String r1 = "Expected min="
            java.lang.String r0 = " ≤ max="
            java.lang.IllegalArgumentException r0 = X.C51971G9r.A0l(r1, r0, r4, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback.A03(android.view.ScrollCaptureSession, androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback, X.I1m, X.4D7):java.lang.Object");
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        1Eo.A05(MDE.A00, new ComposeScrollCaptureCallback$onScrollCaptureEnd$1(this, runnable, (AnonymousClass4D7) null), this.A04);
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        C56558I1m i1m = this.A03;
        consumer.accept(new Rect(i1m.A01, i1m.A03, i1m.A02, i1m.A00));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.A00.A00 = 0.0f;
        C51967G9n.A16(((C290045ef) this.A02).A00, true);
        runnable.run();
    }

    public ComposeScrollCaptureCallback(C290055eg r4, AnonymousClass5SX r5, C56558I1m i1m, C262224Cq r7) {
        this.A01 = r5;
        this.A03 = i1m;
        this.A02 = r4;
        this.A04 = 19E.A03(C56874IFv.A00, r7);
        this.A00 = new RelativeScroller(new ComposeScrollCaptureCallback$scrollTracker$1(this, (AnonymousClass4D7) null), i1m.A00 - i1m.A03);
    }
}

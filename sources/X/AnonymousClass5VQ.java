package X;

import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.5VQ  reason: invalid class name */
public final class AnonymousClass5VQ implements Runnable {
    public final /* synthetic */ AndroidComposeView A00;

    public AnonymousClass5VQ(AndroidComposeView androidComposeView) {
        this.A00 = androidComposeView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (r1 == 9) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            androidx.compose.ui.platform.AndroidComposeView r5 = r10.A00
            r5.removeCallbacks(r10)
            android.view.MotionEvent r4 = r5.A03
            if (r4 == 0) goto L_0x002e
            r9 = 0
            int r3 = r4.getToolType(r9)
            r1 = 3
            r2 = 1
            r0 = 0
            if (r3 != r1) goto L_0x0014
            r0 = 1
        L_0x0014:
            int r1 = r4.getActionMasked()
            if (r0 == 0) goto L_0x001e
            r0 = 10
            if (r1 == r0) goto L_0x002e
        L_0x001e:
            if (r1 == r2) goto L_0x002e
            r0 = 7
            if (r1 == r0) goto L_0x0028
            r0 = 9
            r6 = 2
            if (r1 != r0) goto L_0x0029
        L_0x0028:
            r6 = 7
        L_0x0029:
            long r7 = r5.A01
            androidx.compose.ui.platform.AndroidComposeView.A06(r4, r5, r6, r7, r9)
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5VQ.run():void");
    }
}

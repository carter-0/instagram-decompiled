package androidx.compose.ui.platform;

import X.C262094Cc;
import X.C262224Cq;
import X.C286205Ui;
import X.C290205ew;
import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

public final class AndroidPlatformTextInputSession implements C262224Cq, C290205ew {
    public final View A00;
    public final C286205Ui A01;
    public final AtomicReference A02 = new AtomicReference((Object) null);
    public final C262224Cq A03;

    public final C262094Cc ArX() {
        return this.A03.ArX();
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.9JU, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.1Hj Ex6(X.JLO r12, X.AnonymousClass4D7 r13) {
        /*
            r11 = this;
            r5 = 4
            boolean r0 = X.AnonymousClass9JU.A00(r5, r13)
            if (r0 == 0) goto L_0x0028
            r4 = r13
            X.9JU r4 = (X.AnonymousClass9JU) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0028
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r3 = r4.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x0030
            if (r0 == r1) goto L_0x0051
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0028:
            r0 = 42
            X.9JU r4 = new X.9JU
            r4.<init>(r11, r13, r5, r0)
            goto L_0x0015
        L_0x0030:
            X.0eS.A00(r3)
            java.util.concurrent.atomic.AtomicReference r7 = r11.A02
            r0 = 15
            X.9Ly r8 = new X.9Ly
            r8.<init>((int) r0, (java.lang.Object) r11, (java.lang.Object) r12)
            r9 = 0
            X.9KF r6 = new X.9KF
            r6.<init>(r11, r9, r5)
            r4.A00 = r1
            r10 = 5
            X.MHG r5 = new X.MHG
            r5.<init>((java.lang.Object) r6, (java.lang.Object) r7, (java.lang.Object) r8, (X.AnonymousClass4D7) r9, (int) r10)
            java.lang.Object r0 = X.19E.A00(r4, r5)
            if (r0 != r2) goto L_0x0054
            return r2
        L_0x0051:
            X.0eS.A00(r3)
        L_0x0054:
            X.MCr r0 = new X.MCr
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidPlatformTextInputSession.Ex6(X.JLO, X.4D7):X.1Hj");
    }

    public AndroidPlatformTextInputSession(View view, C286205Ui r4, C262224Cq r5) {
        this.A00 = view;
        this.A01 = r4;
        this.A03 = r5;
    }
}

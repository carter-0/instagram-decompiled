package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.4yZ  reason: invalid class name and case insensitive filesystem */
public final class C279394yZ implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ C2365134a A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    public C279394yZ(C2365134a r1, boolean z, boolean z2) {
        this.A00 = r1;
        this.A02 = z;
        this.A01 = z2;
    }

    public final void onGlobalLayout() {
        boolean z;
        C2365134a r2 = this.A00;
        boolean z2 = r2.A08;
        View view = r2.A00;
        if (view != null) {
            z = view.isShown();
        } else {
            z = false;
        }
        r2.A08 = z;
        if (z) {
            if (this.A02) {
                2LK A002 = 2LI.A00(r2.A0F);
                if (A002.A01) {
                    if (182.A06(0Tu.A05, 1NM.A00(A002.A03).A00, 36319115333671846L)) {
                        2LK.A00(A002, AnonymousClass05K.A02);
                        A002.A01 = false;
                    }
                }
            }
        } else if (this.A01 && z2) {
            r2.A0D(false);
        }
    }
}

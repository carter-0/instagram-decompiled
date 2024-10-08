package X;

import android.view.View;
import android.view.WindowManager;

/* renamed from: X.Ujm  reason: case insensitive filesystem */
public final class C15862Ujm extends 0ng {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass3E5 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15862Ujm(View view, AnonymousClass3E5 r5) {
        super(891571284, 1, false, false);
        this.A01 = r5;
        this.A00 = view;
    }

    public final void run() {
        try {
            WindowManager windowManager = this.A01.A07;
            if (windowManager != null) {
                windowManager.removeView(this.A00);
            }
        } catch (Throwable unused) {
        }
    }
}

package X;

import android.view.View;
import com.instagram.notifications.badging.ui.component.ToastingBadge;

/* renamed from: X.2qg  reason: invalid class name and case insensitive filesystem */
public final class C230982qg implements C71212bU {
    public final /* synthetic */ C230822qK A00;

    public C230982qg(C230822qK r1) {
        this.A00 = r1;
    }

    public final void DUQ() {
        C230822qK r2 = this.A00;
        r2.A01 = true;
        View A01 = C227802jw.A01(1QK.A0E, r2.A08.A00);
        if (r2.A02 && (A01 instanceof ToastingBadge)) {
            ((C226242fw) A01).A0A();
        }
    }
}

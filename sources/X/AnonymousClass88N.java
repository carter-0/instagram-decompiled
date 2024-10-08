package X;

import android.view.View;
import android.widget.FrameLayout;

/* renamed from: X.88N  reason: invalid class name */
public final class AnonymousClass88N implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass88K A00;

    public AnonymousClass88N(AnonymousClass88K r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1225267755);
        AnonymousClass88K r1 = this.A00;
        FrameLayout frameLayout = r1.A03;
        if (frameLayout == null || frameLayout.getVisibility() != 0) {
            r1.A05();
        } else {
            r1.A04();
        }
        AnonymousClass0fD.A0C(-267921456, A05);
    }
}

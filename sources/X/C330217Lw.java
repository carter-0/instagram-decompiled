package X;

import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.7Lw  reason: invalid class name and case insensitive filesystem */
public final class C330217Lw implements AnonymousClass574 {
    public final /* synthetic */ AnonymousClass7VP A00;

    public C330217Lw(AnonymousClass7VP r1) {
        this.A00 = r1;
    }

    public final void DG4(AnonymousClass4UE r5) {
        ViewGroup viewGroup;
        C392289uY r0;
        0qQ.A0B(r5, 0);
        AnonymousClass7VP r3 = this.A00;
        AnonymousClass7FA r2 = (AnonymousClass7FA) r3.A0C.invoke();
        if (r2 != null) {
            ViewGroup viewGroup2 = r2.A01;
            if ((viewGroup2 == null || viewGroup2.getVisibility() != 0 || (r0 = r2.A03) == null || !r0.A05()) && (viewGroup = (ViewGroup) r3.A01.requireView().findViewById(R.id.floating_banner_container)) != null) {
                ((C322106vG) r3.A09.getValue()).A01(viewGroup, r5, (2bu) r3.A0A.getValue());
            }
        }
    }
}

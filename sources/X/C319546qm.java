package X;

import android.view.View;

/* renamed from: X.6qm  reason: invalid class name and case insensitive filesystem */
public final class C319546qm implements View.OnClickListener {
    public final /* synthetic */ C322896wa A00;
    public final /* synthetic */ boolean A01;

    public C319546qm(C322896wa r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-370811697);
        C322896wa r0 = this.A00;
        boolean z = !this.A01;
        C322486vu r2 = r0.A02.A0P;
        0xY AR4 = 1Au.A00(r2.A0c).A01.AR4();
        AR4.E5T("collapse_profile_highlights_tray", z);
        AR4.apply();
        r2.A00();
        AnonymousClass0fD.A0C(669019954, A05);
    }
}

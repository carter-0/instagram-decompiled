package X;

import android.view.View;

/* renamed from: X.Tro  reason: case insensitive filesystem */
public final class C14209Tro implements C20963X6q {
    public final /* synthetic */ C310236ae A00;

    public C14209Tro(C310236ae r1) {
        this.A00 = r1;
    }

    public final void DbC() {
        View view;
        C310236ae r1 = this.A00;
        r1.A0F.EHd();
        C314676if r0 = r1.A01;
        if (r0 != null && (view = ((C14211Trq) r0.get()).A01) != null && view.getVisibility() == 0) {
            C14211Trq.A01((C14211Trq) r1.A01.get(), true);
        }
    }

    public final void DbD() {
        this.A00.A0F.EHY("tapped");
    }
}

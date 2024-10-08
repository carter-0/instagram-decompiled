package X;

import android.database.DataSetObserver;
import android.view.View;

/* renamed from: X.35A  reason: invalid class name */
public final class AnonymousClass35A extends DataSetObserver {
    public final /* synthetic */ C227802jw A00;

    public AnonymousClass35A(C227802jw r1) {
        this.A00 = r1;
    }

    public final void onChanged() {
        C238293Bh r0;
        C227802jw r3 = this.A00;
        View view = r3.mView;
        if (view != null) {
            C228062kj A0A = r3.A0A();
            1Pp r1 = A0A.A0c;
            if (r1 == null) {
                r1 = AnonymousClass1Po.A00;
                A0A.A0c = r1;
            }
            if (r3.A0A().A0J().B5I() == 0) {
                r0 = C238293Bh.ContentIsNotAvailable;
            } else {
                r0 = C238293Bh.ShowingData;
            }
            r1.A02(view, r0);
        }
    }
}

package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.9Pz  reason: invalid class name and case insensitive filesystem */
public final class C378489Pz implements C2365734g {
    public final /* synthetic */ C378479Py A00;

    public C378489Pz(C378479Py r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void DKS(View view) {
        0qQ.A0B(view, 0);
        C378479Py r1 = this.A00;
        r1.A01 = (TextView) view.requireViewById(R.id.month_text);
        r1.A00 = (TextView) view.requireViewById(R.id.day_text);
    }
}

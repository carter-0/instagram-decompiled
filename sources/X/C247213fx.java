package X;

import android.widget.TextView;
import java.util.List;

/* renamed from: X.3fx  reason: invalid class name and case insensitive filesystem */
public final class C247213fx implements C247233fz {
    public TextView A00;
    public final 05G A01;

    public final void setEnabled(boolean z) {
        Object value;
        boolean z2;
        List list;
        05G r4 = this.A01;
        do {
            value = r4.getValue();
            AnonymousClass9IQ r0 = (AnonymousClass9IQ) value;
            z2 = r0.A02;
            list = (List) r0.A00;
            0qQ.A0B(list, 2);
        } while (!r4.AIY(value, new AnonymousClass9IQ(list, false, z2)));
    }

    public final TextView C2f() {
        return this.A00;
    }

    public final void ETR(List list) {
        Object value;
        AnonymousClass9IQ r0;
        05G r4 = this.A01;
        do {
            value = r4.getValue();
            r0 = (AnonymousClass9IQ) value;
        } while (!r4.AIY(value, new AnonymousClass9IQ(list, r0.A01, r0.A02)));
    }

    public final void Eqk(boolean z) {
        Object value;
        boolean z2;
        List list;
        05G r4 = this.A01;
        do {
            value = r4.getValue();
            AnonymousClass9IQ r0 = (AnonymousClass9IQ) value;
            z2 = r0.A01;
            list = (List) r0.A00;
            0qQ.A0B(list, 2);
        } while (!r4.AIY(value, new AnonymousClass9IQ(list, z2, z)));
    }

    public C247213fx(boolean z) {
        this.A01 = new 02z(new AnonymousClass9IQ((List) 0sn.A00, z, false));
    }
}

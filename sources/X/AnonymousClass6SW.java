package X;

import android.database.DataSetObserver;
import java.util.List;

/* renamed from: X.6SW  reason: invalid class name */
public final class AnonymousClass6SW extends DataSetObserver {
    public final AnonymousClass6SV A00;
    public final C270414gh A01;

    public AnonymousClass6SW(AnonymousClass6SV r2, C270414gh r3) {
        0qQ.A0B(r2, 1);
        0qQ.A0B(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public final void onChanged() {
        AnonymousClass6SV r2 = this.A00;
        List list = ((C310566bG) this.A01).A0B.A02;
        List list2 = r2.A01;
        list2.clear();
        list2.addAll(list);
        r2.invalidateSelf();
    }

    public final void onInvalidated() {
        AnonymousClass6SV r2 = this.A00;
        List list = ((C310566bG) this.A01).A0B.A02;
        List list2 = r2.A01;
        list2.clear();
        list2.addAll(list);
        r2.invalidateSelf();
    }
}

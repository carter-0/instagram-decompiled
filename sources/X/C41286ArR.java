package X;

import android.text.Editable;
import java.util.Comparator;

/* renamed from: X.ArR  reason: case insensitive filesystem */
public final class C41286ArR implements Comparator {
    public final /* synthetic */ Editable A00;

    public C41286ArR(Editable editable) {
        this.A00 = editable;
    }

    public final int compare(Object obj, Object obj2) {
        Editable editable = this.A00;
        return 29b.A00(Integer.valueOf(editable.getSpanStart(obj)), Integer.valueOf(editable.getSpanStart(obj2)));
    }
}

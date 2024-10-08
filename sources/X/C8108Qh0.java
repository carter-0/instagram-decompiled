package X;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.Qh0  reason: case insensitive filesystem */
public final class C8108Qh0 extends C7465QEu {
    public final SparseArray A00;
    public final ViewGroup A01;
    public final List A02 = AnonymousClass7TE.A1C();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8108Qh0(View view, SparseArray sparseArray) {
        super(view);
        AnonymousClass7TG.A1O(view, sparseArray);
        this.A00 = sparseArray;
        this.A01 = DbX.A0I(view, R.id.container);
    }
}

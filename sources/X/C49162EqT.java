package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.EqT  reason: case insensitive filesystem */
public abstract class C49162EqT {
    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.EbF] */
    public static final View A00(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        0qQ.A0B(layoutInflater, 0);
        View A0A = DbU.A0A(layoutInflater, viewGroup, R.layout.row_no_results, false);
        0qQ.A0B(A0A, 1);
        ? obj = new Object();
        obj.A00 = A0A;
        obj.A01 = DbW.A0B(A0A, R.id.row_no_results_textview);
        A0A.setTag(obj);
        return A0A;
    }
}

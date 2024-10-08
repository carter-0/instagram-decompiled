package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.instagram.android.R;

/* renamed from: X.F7n  reason: case insensitive filesystem */
public abstract class C49801F7n {
    public static void A01(C67293MlS mlS, C46885Dn1 dn1) {
        int i = mlS.A02;
        Button button = dn1.A00;
        if (i != 0) {
            button.setText(i);
        } else {
            button.setText(mlS.A04);
        }
        AnonymousClass0fU.A00(mlS.A0A, button);
        DbT.A17(DbS.A07(dn1), button, mlS.A08);
        button.setAlpha(mlS.A07);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.3kE, java.lang.Object, X.Dn1] */
    public static C46885Dn1 A00(Context context, ViewGroup viewGroup) {
        View A0C = DbT.A0C(LayoutInflater.from(context), viewGroup, R.layout.row_button_item);
        ? r1 = new C249703kE(A0C);
        r1.A00 = (Button) A0C.requireViewById(R.id.button_item);
        A0C.setTag(r1);
        return r1;
    }
}

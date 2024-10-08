package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.E9j  reason: case insensitive filesystem */
public final class C47597E9j extends C231632rz {
    public final Context A00;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C47597E9j(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(1975038184);
        ((FGF) obj).A02(((C46886Dn2) DbT.A0o(view)).A00);
        AnonymousClass0fD.A0A(-2072076733, A03);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.3kE, java.lang.Object, X.Dn2] */
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(1278066319);
        View A0C = DbT.A0C(LayoutInflater.from(this.A00), viewGroup, R.layout.row_center_text);
        ? r1 = new C249703kE(A0C);
        r1.A00 = DbU.A0G(A0C, R.id.row_textview);
        A0C.setTag(r1);
        AnonymousClass0fD.A0A(1147551615, A03);
        return A0C;
    }
}

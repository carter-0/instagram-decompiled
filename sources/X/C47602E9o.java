package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.E9o  reason: case insensitive filesystem */
public final class C47602E9o extends C231632rz {
    public final Context A00;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C47602E9o(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(1792274475);
        C49429EvV evV = (C49429EvV) DbT.A0o(view);
        0qQ.A0B(evV, 0);
        evV.A00.setText((String) obj);
        AnonymousClass0fD.A0A(332493866, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(752891698);
        View A08 = DbU.A08(DbT.A0B(this.A00), R.layout.support_inbox_report_status_row);
        0qQ.A07(A08);
        A08.setTag(new C49429EvV(A08));
        AnonymousClass0fD.A0A(2024547897, A03);
        return A08;
    }
}

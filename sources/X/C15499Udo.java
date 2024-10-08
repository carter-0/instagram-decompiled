package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Udo  reason: case insensitive filesystem */
public final class C15499Udo extends C231632rz {
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r3, Object obj, Object obj2) {
        AnonymousClass7TF.A1H(r3, obj);
        r3.A7V(0, obj, 0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(723797583);
        AnonymousClass7TG.A1O(view, obj);
        VTS vts = (VTS) obj;
        0qQ.A0B(vts, 1);
        Object tag = view.getTag();
        if (tag != null) {
            VTU vtu = (VTU) tag;
            vtu.A01.setText(vts.A01);
            TextView textView = vtu.A00;
            CharSequence charSequence = vts.A00;
            textView.setText(charSequence);
            DbX.A1G(textView, charSequence);
            AnonymousClass0fD.A0A(-1191980627, A03);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, 2135529451);
        View A0A = DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.catalog_inline_title_layout, false);
        A0A.setTag(new VTU(A0A));
        AnonymousClass0fD.A0A(496505020, A04);
        return A0A;
    }
}

package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public final class E9X extends C231632rz {
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r3, Object obj, Object obj2) {
        AnonymousClass7TF.A1H(r3, obj);
        r3.A7V(0, obj, 0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-120826509);
        AnonymousClass7TG.A1O(view, obj);
        CharSequence charSequence = (CharSequence) obj;
        C49403Ev5 ev5 = (C49403Ev5) view.getTag();
        if (ev5 != null) {
            DbX.A1G(ev5.A00, charSequence);
        }
        AnonymousClass0fD.A0A(313963364, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, -1333272598);
        View inflate = DbV.A0D(viewGroup).inflate(R.layout.product_source_footer_layout, viewGroup, false);
        0qQ.A0C(inflate, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) inflate;
        textView.setTag(new C49403Ev5(textView));
        AnonymousClass0fD.A0A(-846410805, A04);
        return textView;
    }
}

package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import java.util.Iterator;

public final class E9Y extends C231632rz {
    public final int getViewTypeCount() {
        return 2;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r5, Object obj, Object obj2) {
        C49523Ex2 ex2 = (C49523Ex2) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, r5, ex2);
        r5.A7V(0, ex2.A00, 0);
        Iterator A0o = DbY.A0o(ex2.A01);
        while (A0o.hasNext()) {
            r5.A7V(A1U ? 1 : 0, ((BBV) A0o.next()).A00, 0);
        }
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        TextView textView;
        String str;
        int A03 = AnonymousClass0fD.A03(346894163);
        AnonymousClass7TF.A1B(view, 1, obj);
        Object tag = view.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.shippingandreturns.PurchaseProtectionSectionBinderGroup.Holder");
        C49405Ev7 ev7 = (C49405Ev7) tag;
        if (i == 0) {
            textView = ev7.A00;
            str = (String) obj;
        } else if (i == 1) {
            boolean A02 = 0mk.A02(view.getContext());
            textView = ev7.A00;
            StringBuilder A1A = AnonymousClass7TE.A1A();
            if (A02) {
                A1A.append(obj);
                A1A.append(" •");
            } else {
                A1A.append("• ");
                A1A.append(obj);
            }
            str = A1A.toString();
        } else {
            IllegalStateException A0b = DbW.A0b("Unknown view type while binding view: ", i);
            AnonymousClass0fD.A0A(181376055, A03);
            throw A0b;
        }
        textView.setText(str);
        AnonymousClass0fD.A0A(-990553354, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        TextView textView;
        int i2;
        int A03 = AnonymousClass0fD.A03(-1565344087);
        LayoutInflater A0F = DbX.A0F(viewGroup, 1);
        if (i == 0) {
            View inflate = A0F.inflate(R.layout.purchase_protection_header_row, viewGroup, false);
            0qQ.A0C(inflate, "null cannot be cast to non-null type android.widget.TextView");
            textView = (TextView) inflate;
            textView.setTag(new C49405Ev7(textView));
            i2 = -43692701;
        } else if (i == 1) {
            View inflate2 = A0F.inflate(R.layout.purchase_protection_bullet_row, viewGroup, false);
            0qQ.A0C(inflate2, "null cannot be cast to non-null type android.widget.TextView");
            textView = (TextView) inflate2;
            textView.setTag(new C49405Ev7(textView));
            i2 = -574333187;
        } else {
            IllegalStateException A0b = DbW.A0b("Unknown view type while creating view: ", i);
            AnonymousClass0fD.A0A(-1161626842, A03);
            throw A0b;
        }
        AnonymousClass0fD.A0A(i2, A03);
        return textView;
    }
}

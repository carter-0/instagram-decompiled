package X;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.EAf  reason: case insensitive filesystem */
public final class C47619EAf extends C231632rz {
    public final 0sL A00;

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        0qQ.A0B(obj, 1);
        return obj.hashCode();
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C47619EAf(0sL r1) {
        this.A00 = r1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-516606100);
        AnonymousClass7TG.A1O(view, obj);
        if (i == 0) {
            Object tag = view.getTag();
            0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.profile.bindergroup.MultipleLinksReorderingViewBinder.Holder");
            F0M f0m = (F0M) tag;
            EPF epf = (EPF) obj;
            boolean A1U = AnonymousClass7TF.A1U(0, f0m, epf);
            TextView textView = f0m.A03;
            textView.setText(epf.A03);
            boolean z = true;
            textView.setTypeface(Typeface.defaultFromStyle(A1U ? 1 : 0));
            String str = epf.A02;
            if (str.length() <= 0) {
                z = false;
            }
            TextView textView2 = f0m.A02;
            if (z) {
                textView2.setText(str);
                textView2.setVisibility(0);
            } else {
                textView2.setVisibility(8);
            }
            ImageView imageView = f0m.A01;
            DbU.A13(imageView.getContext(), imageView, epf.A00);
            f0m.A00.setVisibility(8);
        }
        AnonymousClass0fD.A0A(1273428713, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(1548859324);
        0qQ.A0B(viewGroup, 1);
        0sL r3 = this.A00;
        0qQ.A0B(r3, 1);
        View A0A = DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.layout_list_cell_multiple, false);
        A0A.setTag(new F0M(A0A));
        A0A.setOnTouchListener(new C50113FPd(r3, 2));
        AnonymousClass0fD.A0A(-518196751, A03);
        return A0A;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}

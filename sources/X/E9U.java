package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public final class E9U extends C231632rz {
    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-972129125);
        0qQ.A0B(view, 1);
        Object tag = view.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.SuggestedPinnablesSectionViewBinder.Holder");
        C49458Evz evz = (C49458Evz) tag;
        Object obj3 = null;
        if (obj instanceof Boolean) {
            obj3 = obj;
        }
        0qQ.A0B(evz, 0);
        TextView textView = evz.A01;
        Context context = textView.getContext();
        int i2 = 2131974337;
        if (0qQ.A0K(obj3, true)) {
            i2 = 2131974336;
        }
        DbT.A18(context, textView, i2);
        TextView textView2 = evz.A00;
        if (0qQ.A0K(obj3, true)) {
            textView2.setVisibility(0);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            Context context2 = textView2.getContext();
            gradientDrawable.setCornerRadius((float) context2.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material));
            gradientDrawable.setColor(AnonymousClass7TF.A03(context2, R.attr.igds_color_creation_tools_lavender));
            textView2.setBackground(gradientDrawable);
        }
        AnonymousClass0fD.A0A(521672491, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, 1349288791);
        View A0A = DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.layout_suggested_pinnables_section, false);
        A0A.setTag(new C49458Evz(A0A));
        AnonymousClass0fD.A0A(1533920633, A04);
        return A0A;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}

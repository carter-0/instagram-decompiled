package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.2t7  reason: invalid class name */
public final class AnonymousClass2t7 extends C231632rz {
    public final Context A00;

    public AnonymousClass2t7(Context context) {
        0qQ.A0B(context, 1);
        this.A00 = context;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        0qQ.A0B(r2, 0);
        r2.A7U(0);
    }

    public final String getBinderGroupName() {
        return "Separator";
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-1820013702);
        0qQ.A0B(view, 1);
        0qQ.A0B(obj, 2);
        0qQ.A0B(obj2, 3);
        DHH dhh = (DHH) obj;
        XTm xTm = (XTm) obj2;
        int A032 = AnonymousClass0fD.A03(486125628);
        Object tag = view.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.mainfeed.unconnectedcontent.SeparatorViewBinder.Holder");
        C49553Exo exo = (C49553Exo) tag;
        0qQ.A0B(exo, 0);
        0qQ.A0B(dhh, 1);
        0qQ.A0B(xTm, 2);
        boolean z = dhh.A01;
        int i2 = 0;
        ViewGroup viewGroup = exo.A01;
        Context context = viewGroup.getContext();
        if (z) {
            viewGroup.setBackgroundColor(context.getColor(R.color.design_dark_default_color_on_background));
            TextView textView = exo.A02;
            textView.setVisibility(0);
            textView.setText(((BGM) dhh.A00).A04);
        } else {
            viewGroup.setBackgroundColor(context.getColor(R.color.grey_0));
            0nA.A0O(exo.A02);
        }
        View view2 = exo.A00;
        if (xTm.A00) {
            i2 = 8;
        }
        view2.setVisibility(i2);
        AnonymousClass0fD.A0A(-813532593, A032);
        AnonymousClass0fD.A0A(584914041, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(347721589);
        0qQ.A0B(viewGroup, 1);
        int A032 = AnonymousClass0fD.A03(420320145);
        Context context = this.A00;
        0qQ.A0B(context, 0);
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_separator_header, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.separator);
        0qQ.A07(findViewById);
        View findViewById2 = inflate.findViewById(R.id.separator_top_divider);
        0qQ.A07(findViewById2);
        View findViewById3 = inflate.findViewById(R.id.separator_text);
        0qQ.A07(findViewById3);
        inflate.setTag(new C49553Exo(findViewById2, (ViewGroup) findViewById, (TextView) findViewById3));
        AnonymousClass0fD.A0A(859136850, A032);
        AnonymousClass0fD.A0A(1323250514, A03);
        return inflate;
    }
}

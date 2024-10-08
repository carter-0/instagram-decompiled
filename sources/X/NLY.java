package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public final class NLY extends C231632rz {
    public final Context A00;
    public final LayoutInflater A01;
    public final NKU A02;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public NLY(Context context, NKU nku) {
        this.A00 = context;
        this.A02 = nku;
        this.A01 = LayoutInflater.from(context);
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        Drawable A0E;
        int A03 = AnonymousClass0fD.A03(-2065049190);
        Context context = this.A00;
        NKU nku = this.A02;
        C70600OCx oCx = (C70600OCx) DbT.A0o(view);
        String str = (String) obj;
        OGX ogx = (OGX) obj2;
        Resources resources = context.getResources();
        View view2 = oCx.A00;
        int i2 = 0;
        view2.setPadding(0, resources.getDimensionPixelSize(C66582MXn.A07(ogx.A03)), 0, resources.getDimensionPixelSize(C66582MXn.A07(ogx.A00)));
        Integer num = ogx.A01;
        if (num != null) {
            oCx.A01.setTextSize(0, (float) C66581MXm.A03(resources, num));
        }
        Integer num2 = ogx.A02;
        if (!(num2 == null || (A0E = JTP.A0E(context, num2)) == null)) {
            TextView textView = oCx.A01;
            textView.measure(0, 0);
            A0E.setBounds(0, 0, textView.getMeasuredHeight(), textView.getMeasuredHeight());
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.igds_color_link, typedValue, true);
            A0E.setColorFilter(typedValue.data, PorterDuff.Mode.SRC_ATOP);
            textView.setCompoundDrawables((Drawable) null, (Drawable) null, A0E, (Drawable) null);
        }
        TextView textView2 = oCx.A01;
        textView2.setText(str);
        if (ogx.A04) {
            i2 = 17;
        }
        textView2.setGravity(i2);
        C71406Ok5.A00(view2, 13, nku);
        AnonymousClass0fD.A0A(442504701, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(480432179);
        View A08 = DbU.A08(this.A01, R.layout.reporting_guidelines_collapsible_button);
        A08.setTag(new C70600OCx(A08));
        AnonymousClass0fD.A0A(62299421, A03);
        return A08;
    }
}

package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.NLg  reason: case insensitive filesystem */
public final class C68509NLg extends C336937fQ {
    public final Context A00;
    public final NKU A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C68509NLg(Context context, NKU nku) {
        this.A00 = context;
        this.A01 = nku;
    }

    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(2056004866);
        if (view == null) {
            view = DbU.A08(LayoutInflater.from(this.A00), R.layout.reporting_report_tag_row);
            view.setTag(new C70631OEc(view));
        }
        C70631OEc oEc = (C70631OEc) DbT.A0o(view);
        OGY ogy = (OGY) obj;
        NKU nku = this.A01;
        TextView textView = oEc.A02;
        textView.setText(ogy.A01.A00);
        2eS.A01(textView);
        textView.setEnabled(true);
        View view2 = oEc.A00;
        C71409Ok8.A01(view2, 45, ogy, nku);
        int A0F = AnonymousClass7TE.A0F(view2.getResources());
        view2.setPadding(0, A0F, 0, A0F);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        layoutParams.height = -2;
        textView.setLayoutParams(layoutParams);
        int ordinal = ((C69334NjZ) obj2).ordinal();
        if (ordinal == 0 || ordinal == 1) {
            oEc.A01.setVisibility(8);
        } else if (ordinal == 2) {
            RadioButton radioButton = oEc.A01;
            radioButton.setVisibility(0);
            radioButton.setChecked(ogy.A04);
        }
        C71084Ob7 ob7 = nku.A09;
        ob7.getClass();
        ob7.A00.A05(2);
        AnonymousClass0fD.A0A(1246337017, A03);
        return view;
    }
}

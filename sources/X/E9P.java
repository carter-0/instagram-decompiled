package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.igds.components.checkbox.IgdsCheckBox;

public final class E9P extends C231632rz {
    public E3c A00;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-2089916208);
        C49558Ext ext = (C49558Ext) DbT.A0o(view);
        F3A f3a = (F3A) obj;
        Boolean bool = (Boolean) obj2;
        E3c e3c = this.A00;
        ext.A01.setText(f3a.A00);
        TextView textView = ext.A00;
        textView.setText(2131964884);
        FP0.A00(textView, 4, f3a);
        IgdsCheckBox igdsCheckBox = ext.A02;
        igdsCheckBox.setChecked(bool.booleanValue());
        FPH.A00(igdsCheckBox, e3c, f3a, bool, 37);
        AnonymousClass0fD.A0A(-1699334388, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-544403616);
        ViewGroup viewGroup2 = (ViewGroup) DbT.A0C(DbV.A0D(viewGroup), viewGroup, R.layout.row_text_with_link_checkbox);
        viewGroup2.setTag(new C49558Ext(viewGroup2));
        AnonymousClass0fD.A0A(-500243659, A03);
        return viewGroup2;
    }
}

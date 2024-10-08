package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.checkbox.IgdsCheckBox;

/* renamed from: X.E9c  reason: case insensitive filesystem */
public final class C47590E9c extends C231632rz {
    public final E3c A00;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C47590E9c(E3c e3c) {
        this.A00 = e3c;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-711131155);
        C49494EwZ ewZ = (C49494EwZ) DbT.A0o(view);
        Boolean bool = (Boolean) obj2;
        E3c e3c = this.A00;
        ewZ.A00.setText((String) obj);
        IgdsCheckBox igdsCheckBox = ewZ.A01;
        igdsCheckBox.setChecked(bool.booleanValue());
        FPG.A00(igdsCheckBox, 3, e3c, bool);
        AnonymousClass0fD.A0A(-783457709, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-1140171822);
        ViewGroup viewGroup2 = (ViewGroup) DbT.A0C(DbV.A0D(viewGroup), viewGroup, R.layout.row_text_with_checkbox);
        viewGroup2.setTag(new C49494EwZ(viewGroup2));
        AnonymousClass0fD.A0A(-2016491290, A03);
        return viewGroup2;
    }
}

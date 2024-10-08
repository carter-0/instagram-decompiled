package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.E9s  reason: case insensitive filesystem */
public final class C47606E9s extends C231632rz {
    public Context A00;
    public final E9E A01;

    public final int getViewTypeCount() {
        return 1;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r3, Object obj, Object obj2) {
        C47359Dvt dvt = (C47359Dvt) obj;
        if (!dvt.A01.equals(EWP.A07.A01) || dvt.A00 != null) {
            r3.A7U(0);
        }
    }

    public C47606E9s(Context context, E9E e9e) {
        this.A01 = e9e;
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        String str;
        C274664or r0;
        int A03 = AnonymousClass0fD.A03(42254090);
        C47359Dvt dvt = (C47359Dvt) obj;
        boolean A1V = AnonymousClass7TF.A1V(dvt.A00);
        ExM exM = (ExM) DbT.A0o(view);
        Context context = this.A00;
        boolean A1a = AnonymousClass7TE.A1a(obj2);
        E9E e9e = this.A01;
        DbY.A1S(exM, context);
        0qQ.A0B(e9e, 5);
        TextView textView = exM.A02;
        if (!0qQ.A0K(dvt.A01, EWP.A07.A01) || (r0 = dvt.A00) == null || (str = r0.A05) == null) {
            str = dvt.A02;
            0qQ.A07(str);
        }
        textView.setText(str);
        CheckBox checkBox = exM.A01;
        checkBox.setChecked(A1a);
        checkBox.setEnabled(A1V);
        View view2 = exM.A00;
        view2.setEnabled(A1V);
        if (A1V) {
            FPE.A01(view2, 21, e9e, dvt);
            FPE.A01(checkBox, 22, e9e, dvt);
        } else {
            DbY.A11(textView, context);
        }
        AnonymousClass0fD.A0A(1900094233, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-1225710440);
        View A09 = DbW.A09(DbX.A0F(viewGroup, 0), viewGroup, R.layout.row_service_partner_type, false);
        A09.setTag(new ExM(A09));
        AnonymousClass0fD.A0A(1903304620, A03);
        return A09;
    }
}

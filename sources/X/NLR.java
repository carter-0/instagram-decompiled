package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class NLR extends C231632rz {
    public final Context A00;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public NLR(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-1632894223);
        Mz1 mz1 = (Mz1) DbT.A0o(view);
        PR9 pr9 = (PR9) obj;
        AnonymousClass7TG.A1N(mz1, pr9);
        O31.A00((FAT) obj2, mz1, (C74279Ps7) null, pr9);
        AnonymousClass0fD.A0A(1152304681, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(1016398208);
        Context context = this.A00;
        AnonymousClass7TF.A1H(context, viewGroup);
        View A0A = DbU.A0A(LayoutInflater.from(context), viewGroup, R.layout.row_switch_item, false);
        Mz1 mz1 = new Mz1(A0A);
        A0A.setTag(mz1);
        C48947Eml.A00(A0A, mz1.A06);
        AnonymousClass0fD.A0A(-1261371611, A03);
        return A0A;
    }
}

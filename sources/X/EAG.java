package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class EAG extends C231632rz {
    public final Context A00;
    public final C49418EvK A01;

    public final int getViewTypeCount() {
        return 1;
    }

    public EAG(Context context, C49418EvK evK) {
        this.A00 = context;
        this.A01 = evK;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A04 = DbX.A04(view, 424763285);
        0qQ.A0B(obj, 2);
        Object tag = view.getTag();
        if (tag != null) {
            EyY eyY = (EyY) tag;
            C49529Ex9 ex9 = (C49529Ex9) obj;
            C49418EvK evK = this.A01;
            AnonymousClass7TG.A1N(eyY, ex9);
            0qQ.A0B(evK, 2);
            eyY.A02.setText(ex9.A01);
            eyY.A01.setText(ex9.A00);
            FP4.A01(eyY.A00, 41, evK);
            AnonymousClass0fD.A0A(-324784476, A04);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0A(-1724318030, A04);
        throw A0y;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, 1527739001);
        View A0A = DbU.A0A(DbT.A0B(this.A00), viewGroup, R.layout.row_hashtags_link_no_qty, false);
        A0A.setTag(new EyY(A0A));
        AnonymousClass0fD.A0A(-629872968, A04);
        return A0A;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}

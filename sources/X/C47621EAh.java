package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.EAh  reason: case insensitive filesystem */
public final class C47621EAh extends C231632rz {
    public boolean A00 = true;
    public final Context A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C47621EAh(Context context) {
        this.A01 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-1475737840);
        EtS etS = (EtS) view.getTag();
        if (etS != null) {
            etS.A00.setVisibility(DbW.A01(this.A00 ? 1 : 0));
        }
        AnonymousClass0fD.A0A(2099073307, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-1027185958);
        View A0C = DbT.A0C(LayoutInflater.from(this.A01), viewGroup, R.layout.suggest_business_loadmore_indicator);
        A0C.setTag(new EtS(A0C));
        AnonymousClass0fD.A0A(-1178305366, A03);
        return A0C;
    }

    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(1117662939);
        if (view == null) {
            view = DbT.A0C(LayoutInflater.from(this.A01), viewGroup, R.layout.suggest_business_loadmore_indicator);
            view.setTag(new EtS(view));
        }
        AnonymousClass0fD.A0A(-1658779055, A03);
        return view;
    }
}

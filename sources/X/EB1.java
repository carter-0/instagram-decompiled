package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class EB1 extends C336937fQ {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final C46430Der A02;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public EB1(Context context, AnonymousClass0iw r2, C46430Der der) {
        this.A00 = context;
        this.A01 = r2;
        this.A02 = der;
    }

    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-923959355);
        if (view == null) {
            view = DbU.A08(LayoutInflater.from(this.A00), R.layout.row_group_follow_request);
            view.setTag(new C49606EzP(view));
        }
        AnonymousClass0iw r4 = this.A01;
        C49606EzP ezP = (C49606EzP) DbT.A0o(view);
        G9S g9s = (G9S) obj;
        FP7.A00(ezP.A00, 11, this.A02, g9s);
        C49164EqV.A00(r4, ezP, g9s, true);
        AnonymousClass0fD.A0A(1456211665, A03);
        return view;
    }
}

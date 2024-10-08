package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.EAg  reason: case insensitive filesystem */
public final class C47620EAg extends C231632rz {
    public final Context A00;
    public final G5R A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C47620EAg(Context context, G5R g5r) {
        this.A00 = context;
        this.A01 = g5r;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        AnonymousClass0fD.A0A(-498159038, AnonymousClass0fD.A03(-2113265202));
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(2032474297);
        Context context = this.A00;
        G5R g5r = this.A01;
        View inflate = LayoutInflater.from(context).inflate(R.layout.create_page_row, viewGroup, false);
        FPB.A01(inflate, 12, g5r);
        2eS.A01(inflate);
        AnonymousClass0fD.A0A(-325348662, A03);
        return inflate;
    }

    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(611388344);
        if (view == null) {
            Context context = this.A00;
            G5R g5r = this.A01;
            view = LayoutInflater.from(context).inflate(R.layout.create_page_row, viewGroup, false);
            FPB.A01(view, 12, g5r);
            2eS.A01(view);
        }
        AnonymousClass0fD.A0A(-1372452845, A03);
        return view;
    }
}

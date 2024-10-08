package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.EAx  reason: case insensitive filesystem */
public final class C47637EAx extends C231632rz {
    public final Context A00;
    public final CharSequence A01;
    public final String A02;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C47637EAx(Context context, CharSequence charSequence, String str) {
        this.A00 = context;
        this.A02 = str;
        this.A01 = charSequence;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        AnonymousClass0fD.A0A(1194273579, AnonymousClass0fD.A03(-1731603856));
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(517910725);
        View A002 = C48731EjG.A00(this.A00, viewGroup, this.A01, this.A02);
        AnonymousClass0fD.A0A(172057248, A03);
        return A002;
    }

    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(818097147);
        if (view == null) {
            view = C48731EjG.A00(this.A00, viewGroup, this.A01, this.A02);
        }
        AnonymousClass0fD.A0A(-902283417, A03);
        return view;
    }

    public C47637EAx(Context context, String str, String str2) {
        this.A00 = context;
        this.A01 = str2;
        this.A02 = str;
    }
}

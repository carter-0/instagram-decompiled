package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class H44 extends C231632rz {
    public final int A00;
    public final 0sP A01;

    public final String getBinderGroupName() {
        return "Header";
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        return i;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public H44(int i, 0sP r2) {
        this.A00 = i;
        this.A01 = r2;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A04 = DbX.A04(view, -948243707);
        this.A01.invoke(view);
        AnonymousClass0fD.A0A(1988235742, A04);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-2118928333);
        LayoutInflater A0F = DbX.A0F(viewGroup, 1);
        if (i == 0) {
            View A0C = DbT.A0C(A0F, viewGroup, this.A00);
            0qQ.A0A(A0C);
            AnonymousClass0fD.A0A(877700257, A03);
            return A0C;
        }
        IllegalArgumentException A0a = DbW.A0a(AnonymousClass000.A00(964), i);
        AnonymousClass0fD.A0A(-1470697648, A03);
        throw A0a;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}

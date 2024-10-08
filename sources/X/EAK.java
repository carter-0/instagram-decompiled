package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class EAK extends C231632rz {
    public final Context A00;
    public final C51858G4q A01;
    public final AnonymousClass0iw A02;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public EAK(Context context, C51858G4q g4q, AnonymousClass0iw r3) {
        this.A00 = context;
        this.A02 = r3;
        this.A01 = g4q;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        AnonymousClass0fD.A03(-789990505);
        view.getTag().getClass();
        throw AnonymousClass7TE.A11("getProfilePicUri");
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-589075642);
        View A09 = DbW.A09(LayoutInflater.from(this.A00), viewGroup, R.layout.row_page, false);
        A09.setTag(new C49614EzX(A09));
        AnonymousClass0fD.A0A(-8086513, A03);
        return A09;
    }
}

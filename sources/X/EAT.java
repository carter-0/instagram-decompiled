package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class EAT extends C231632rz {
    public final Context A00;
    public final E9F A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public EAT(Context context, E9F e9f, AnonymousClass0iw r3, UserSession userSession) {
        this.A03 = userSession;
        this.A00 = context;
        this.A02 = r3;
        this.A01 = e9f;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A032 = AnonymousClass0fD.A03(-1284603776);
        if (view.getTag() == null) {
            AnonymousClass0fD.A0A(207675374, A032);
            return;
        }
        UserSession userSession = this.A03;
        view.getTag();
        if (userSession != null) {
            AnonymousClass0t1.A01.A01(userSession);
        }
        throw AnonymousClass7TE.A11("isPageLinkedToDifferentUser");
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A032 = AnonymousClass0fD.A03(1048192905);
        View A0C = DbT.A0C(LayoutInflater.from(this.A00), viewGroup, R.layout.page_row_with_preview);
        A0C.setTag(new F09(A0C));
        AnonymousClass0fD.A0A(-1715604948, A032);
        return A0C;
    }
}

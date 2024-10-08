package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class K9Q extends C231632rz {
    public final UserSession A00;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public K9Q(UserSession userSession) {
        this.A00 = userSession;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        AnonymousClass0fD.A0A(-1979513793, AnonymousClass0fD.A03(1344910698));
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-520523288);
        Context context = viewGroup.getContext();
        View A0C = DbT.A0C(LayoutInflater.from(context), viewGroup, R.layout.layout_header_with_action_text);
        DbT.A16(context, A0C, R.color.fds_transparent);
        DbU.A0G(A0C, R.id.header_text).setText(2131966214);
        AnonymousClass0fD.A0A(-1516454665, A03);
        return A0C;
    }
}

package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.K9a  reason: case insensitive filesystem */
public final class C61469K9a extends C231632rz {
    public final UserSession A00;
    public final L1O A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C61469K9a(UserSession userSession, L1O l1o) {
        this.A00 = userSession;
        this.A01 = l1o;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        String A0e;
        int A03 = AnonymousClass0fD.A03(-941462651);
        L4S l4s = (L4S) DbT.A0o(view);
        UserSession userSession = this.A00;
        Context context = view.getContext();
        LYE.A00(l4s.A00, 27, this.A01);
        0qQ.A0B(userSession, 0);
        List A1J = C51966G9m.A1J(LQZ.A00(userSession).A05);
        if (A1J.isEmpty()) {
            A0e = context.getResources().getString(2131971380);
        } else {
            A0e = AnonymousClass7TF.A0e(context.getResources(), 0mp.A05(", ", A1J), 2131971381);
        }
        l4s.A01.setText(A0e);
        AnonymousClass0fD.A0A(1130924216, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(1351082696);
        View A0C = DbT.A0C(DbV.A0D(viewGroup), viewGroup, R.layout.recipient_picker_add_to_highlights);
        A0C.setTag(new L4S(A0C));
        AnonymousClass0fD.A0A(233669716, A03);
        return A0C;
    }
}

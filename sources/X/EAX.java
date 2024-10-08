package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class EAX extends C231632rz {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C46430Der A03;

    public final int getViewTypeCount() {
        return 1;
    }

    public EAX(Context context, AnonymousClass0iw r2, UserSession userSession, C46430Der der) {
        this.A02 = userSession;
        this.A00 = context;
        this.A03 = der;
        this.A01 = r2;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A04 = DbX.A04(view, 1139975939);
        if (view.getTag() != null) {
            throw AnonymousClass7TE.A11("getFollowUpsellDataType");
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0A(-404988558, A04);
        throw A0y;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, -876291201);
        View A0A = DbU.A0A(DbT.A0B(this.A00), viewGroup, R.layout.row_follow_upsell, false);
        A0A.setTag(new EyU(A0A));
        AnonymousClass0fD.A0A(-403980384, A04);
        return A0A;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}

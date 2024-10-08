package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

public final class E9Q extends C231632rz {
    public Context A00;
    public AnonymousClass0iw A01;
    public UserSession A02;
    public C51960G9g A03;
    public C46432Det A04;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A032 = AnonymousClass0fD.A03(-878483092);
        C51960G9g g9g = this.A03;
        Context context = this.A00;
        AnonymousClass0iw r4 = this.A01;
        FFX.A02((Activity) null, context, r4, this.A02, (Reel) null, (User) obj, (C46443Df5) null, (FAU) null, g9g, (F1C) DbT.A0o(view), this.A04, false, false, false, false);
        AnonymousClass0fD.A0A(33580013, A032);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A032 = AnonymousClass0fD.A03(1078982866);
        View A002 = FFX.A00(viewGroup.getContext(), viewGroup);
        AnonymousClass0fD.A0A(-1388797242, A032);
        return A002;
    }
}

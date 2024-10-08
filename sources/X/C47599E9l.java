package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.E9l  reason: case insensitive filesystem */
public final class C47599E9l extends C231632rz {
    public final Context A00;

    public final int getViewTypeCount() {
        return 1;
    }

    public C47599E9l(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A04 = DbX.A04(view, 1617188504);
        Object tag = view.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.user.userlist.adapter.CloseFriendsDisclaimerViewBinder.Holder");
        C49412EvE evE = (C49412EvE) tag;
        0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.user.userlist.adapter.CloseFriendsDisclaimerBinderGroup.CloseFriendsDisclaimerModel");
        Context context = this.A00;
        AnonymousClass7TF.A1B(evE, 0, context);
        TextView textView = evE.A00;
        textView.setVisibility(0);
        DbX.A13(context, textView, (Object) null, 2131955590);
        AnonymousClass0fD.A0A(-1004056315, A04);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, -384868780);
        View A0A = DbU.A0A(DbT.A0B(this.A00), viewGroup, R.layout.close_friends_disclaimer_row, false);
        A0A.setTag(new C49412EvE(A0A));
        AnonymousClass0fD.A0A(856033914, A04);
        return A0A;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}

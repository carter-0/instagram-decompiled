package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public final class NLG extends C231632rz {
    public final Context A00;

    public final int getViewTypeCount() {
        return 1;
    }

    public NLG(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-489833358);
        AnonymousClass7TG.A1O(view, obj);
        Object tag = view.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.direct.e2ee.ui.menu.SecureMessageBannerItemViewBinder.Holder");
        C69887Ntp.A00((C68182N3x) obj, (C67888MwW) tag);
        AnonymousClass0fD.A0A(474392642, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, 489657562);
        View A09 = DbU.A09(DbT.A0B(this.A00), viewGroup, R.layout.layout_thread_detail_secure_message_learn_more, false);
        C67888MwW mwW = new C67888MwW(A09);
        A09.setTag(mwW);
        TextView textView = mwW.A00;
        AnonymousClass0fD.A0A(-877152216, A04);
        return textView;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}

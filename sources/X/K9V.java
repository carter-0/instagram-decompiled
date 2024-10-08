package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

public final class K9V extends C231632rz {
    public final UserSession A00;
    public final C65634LxB A01;

    public final int getViewTypeCount() {
        return 1;
    }

    public K9V(UserSession userSession, C65634LxB lxB) {
        this.A00 = userSession;
        this.A01 = lxB;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A04 = DbX.A04(view, -1607033080);
        Object tag = view.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.recipientpicker.AudienceListsRowViewBinder.Holder");
        C63811L7r l7r = (C63811L7r) tag;
        C65634LxB lxB = this.A01;
        0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.recipientpicker.AudienceListsRowViewModel");
        C64774Lhq lhq = (C64774Lhq) obj;
        DbZ.A0t(0, l7r, lxB, lhq);
        int i2 = lhq.A00;
        IgTextView igTextView = l7r.A01;
        if (i2 > 0) {
            igTextView.setText(DbY.A0d(l7r.A00.getResources(), i2, R.plurals.recipient_picker_audience_lists_count));
        } else {
            igTextView.setText(2131971382);
        }
        LY0.A00(l7r.A00, 62, lxB);
        AnonymousClass0fD.A0A(-1540328331, A04);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, 1424894495);
        0qQ.A0B(this.A00, 0);
        Context context = viewGroup.getContext();
        View A0A = DbU.A0A(LayoutInflater.from(context), viewGroup, R.layout.recipient_picker_audience_lists, false);
        0qQ.A07(context);
        A0A.setTag(new C63811L7r(context, A0A));
        AnonymousClass0fD.A0A(1793537881, A04);
        return A0A;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}

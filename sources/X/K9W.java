package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.common.session.UserSession;

public final class K9W extends C231632rz {
    public final UserSession A00;
    public final C65634LxB A01;

    public final int getViewTypeCount() {
        return 1;
    }

    public K9W(UserSession userSession, C65634LxB lxB) {
        this.A00 = userSession;
        this.A01 = lxB;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int i2;
        Integer C2R;
        int A03 = AnonymousClass0fD.A03(905925249);
        AnonymousClass7TG.A1O(view, obj);
        Object tag = view.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.recipientpicker.ExclusiveStoryRowViewBinder.Holder");
        C63812L7s l7s = (C63812L7s) tag;
        UserSession userSession = this.A00;
        boolean A1a = AnonymousClass7TE.A1a(obj);
        C65634LxB lxB = this.A01;
        C51974G9v.A1K(l7s, userSession, lxB);
        View view2 = l7s.A00;
        int i3 = 65;
        if (A1a) {
            i3 = 64;
        }
        LY0.A00(view2, i3, lxB);
        l7s.A02.setChecked(A1a);
        FanClubInfoDict B3v = DbX.A0m(userSession).B3v();
        if (B3v == null || (C2R = B3v.C2R()) == null) {
            i2 = 0;
        } else {
            i2 = C2R.intValue();
        }
        TextView textView = l7s.A01;
        textView.setText(DbY.A0d(view2.getResources(), i2, R.plurals.recipient_picker_close_friends_count));
        LY0.A00(textView, 66, lxB);
        AnonymousClass0fD.A0A(2084004665, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, -663297013);
        Context context = viewGroup.getContext();
        View A0A = DbU.A0A(LayoutInflater.from(context), viewGroup, R.layout.recipient_picker_add_to_exclusive_story, false);
        0qQ.A07(context);
        A0A.setTag(new C63812L7s(A0A, context));
        AnonymousClass0fD.A0A(-9977307, A04);
        return A0A;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}

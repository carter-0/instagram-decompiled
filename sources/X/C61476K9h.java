package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.K9h  reason: case insensitive filesystem */
public final class C61476K9h extends C231632rz {
    public final UserSession A00;
    public final C65634LxB A01;
    public final C351998Bg A02;
    public final C363008it A03;

    public final int getViewTypeCount() {
        return 1;
    }

    public C61476K9h(UserSession userSession, C65634LxB lxB, C351998Bg r3, C363008it r4) {
        this.A00 = userSession;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = lxB;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        View.OnClickListener ly0;
        int A04 = DbX.A04(view, -2005509291);
        0qQ.A0B(obj, 2);
        Object tag = view.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.recipientpicker.CloseFriendsStoryRowViewBinder.Holder");
        C63842L8x l8x = (C63842L8x) tag;
        UserSession userSession = this.A00;
        C64775Lhr lhr = (C64775Lhr) obj;
        this.A02.A00();
        C65634LxB lxB = this.A01;
        AnonymousClass7TG.A1N(l8x, userSession);
        AnonymousClass7TF.A1D(lhr, 2, lxB);
        boolean z = lhr.A01;
        View view2 = l8x.A00;
        if (z) {
            ly0 = new LY8(65, lxB, lhr);
        } else {
            ly0 = new LY0(lxB, 63);
        }
        AnonymousClass0fU.A00(ly0, view2);
        l8x.A02.setChecked(z);
        int A002 = C63112Krf.A00(userSession);
        TextView textView = l8x.A01;
        if (A002 > 0) {
            textView.setText(DbY.A0d(view2.getResources(), A002, R.plurals.recipient_picker_close_friends_count));
        } else {
            textView.setText(2131969778);
        }
        LY8.A00(textView, 66, lxB, lhr);
        AnonymousClass0fD.A0A(721609867, A04);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, -1697673870);
        Context context = viewGroup.getContext();
        View A0A = DbU.A0A(LayoutInflater.from(context), viewGroup, R.layout.recipient_picker_add_to_favorites_story, false);
        0qQ.A07(context);
        A0A.setTag(new C63842L8x(A0A, context));
        AnonymousClass0fD.A0A(1490891376, A04);
        return A0A;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}

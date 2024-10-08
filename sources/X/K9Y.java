package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

public final class K9Y extends C231632rz {
    public final UserSession A00;
    public final C65634LxB A01;

    public final int getViewTypeCount() {
        return 1;
    }

    public K9Y(UserSession userSession, C65634LxB lxB) {
        this.A00 = userSession;
        this.A01 = lxB;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-1280613626);
        0qQ.A0B(view, 1);
        Object tag = view.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.recipientpicker.ShareToMyWeekRowViewBinder.Holder");
        C63844L8z l8z = (C63844L8z) tag;
        C65634LxB lxB = this.A01;
        0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.recipientpicker.ShareToMyWeekRowViewModel");
        C64778Lhu lhu = (C64778Lhu) obj;
        DbZ.A0t(1, l8z, lxB, lhu);
        View view2 = l8z.A00;
        Context context = view2.getContext();
        LY8.A00(view2, 68, lxB, lhu);
        IgSimpleImageView igSimpleImageView = l8z.A01;
        igSimpleImageView.setImageResource(R.drawable.instagram_my_week_story_pano_outline_24);
        DbU.A14(context, igSimpleImageView, R.color.canvas_bottom_sheet_description_text_color);
        igSimpleImageView.setBackground(new C59973Jci(context, 0.0f, true, true));
        DbT.A18(context, l8z.A03, 2131971387);
        IgTextView igTextView = l8z.A02;
        igTextView.setVisibility(0);
        int i2 = 2131971386;
        if (lhu.A01) {
            i2 = 2131971388;
        }
        DbT.A18(context, igTextView, i2);
        l8z.A04.setChecked(lhu.A00);
        AnonymousClass0fD.A0A(601010418, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, -1079250667);
        View A0A = DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.recipient_picker_radio_selection, false);
        A0A.setTag(new C63844L8z(A0A));
        AnonymousClass0fD.A0A(826350503, A04);
        return A0A;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}

package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.E9w  reason: case insensitive filesystem */
public final class C47610E9w extends C231632rz {
    public final UserSession A00;
    public final C65634LxB A01;

    public final int getViewTypeCount() {
        return 1;
    }

    public C47610E9w(UserSession userSession, C65634LxB lxB) {
        this.A01 = lxB;
        this.A00 = userSession;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-892578557);
        0qQ.A0B(view, 1);
        Object tag = view.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.recipientpicker.CampfireRowViewBinder.Holder");
        C49582Eyr eyr = (C49582Eyr) tag;
        C65634LxB lxB = this.A01;
        UserSession userSession = this.A00;
        0qQ.A0B(eyr, 0);
        AnonymousClass7TF.A1B(lxB, 1, userSession);
        FPE.A01(eyr.A00, 30, lxB, userSession);
        eyr.A01.setImageResource(R.drawable.instagram_group_pano_filled_24);
        eyr.A02.setText(2131954713);
        if (AnonymousClass37B.A00(userSession) && AnonymousClass7TE.A0q(userSession).getInt("group_stories_badging_seen_count", 0) < 1) {
            IgTextView igTextView = eyr.A03;
            igTextView.setVisibility(0);
            Context A0S = AnonymousClass7TE.A0S(igTextView);
            igTextView.setTypeface(AnonymousClass0qo.A00(A0S).A02(0qm.A0T));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius((float) A0S.getResources().getDimensionPixelSize(R.dimen.button_text_size));
            gradientDrawable.setColor(AnonymousClass7TF.A03(A0S, R.attr.igds_color_creation_tools_blue));
            igTextView.setBackground(gradientDrawable);
        }
        AnonymousClass0fD.A0A(1216041978, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, -554025973);
        View A0A = DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.recipient_picker_share_to_destination_row, false);
        A0A.setTag(new C49582Eyr(A0A));
        AnonymousClass0fD.A0A(-1152604204, A04);
        return A0A;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}

package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Ddy  reason: case insensitive filesystem */
public abstract class C46381Ddy {
    public static void A01(Context context, UserSession userSession, C46382Ddz ddz, User user) {
        TextView textView;
        String A0b;
        Integer BPt = user.A03.BPt();
        if (user.A0N() == AnonymousClass05K.A0C) {
            ImageView imageView = ddz.A00;
            boolean A06 = 182.A06(0Tu.A05, userSession, 36329715312640280L);
            int i = R.drawable.empty_state_lock;
            if (A06) {
                i = R.drawable.instagram_lock_pano_outline_24;
            }
            DbU.A13(context, imageView, i);
            DbT.A18(context, ddz.A03, 2131975275);
            textView = ddz.A02;
            A0b = context.getString(2131962588);
        } else if (BPt != null && BPt.intValue() == 0) {
            DbU.A13(context, ddz.A00, R.drawable.empty_state_camera);
            DbT.A18(context, ddz.A03, 2131968412);
            textView = ddz.A02;
            A0b = DbY.A0b(context, user, 2131968413);
        } else {
            return;
        }
        textView.setText(A0b);
    }

    public static View A00(Context context, ViewGroup viewGroup, UserSession userSession) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.row_profile_header_empty_profile_notice, viewGroup, false);
        C46382Ddz ddz = new C46382Ddz(inflate, userSession);
        ImageView imageView = ddz.A00;
        DbX.A12(context, imageView, 2Yu.A0B(context));
        0Tu r7 = 0Tu.A05;
        if (182.A06(r7, userSession, 36329715312967964L)) {
            ddz.A01.setPadding(0, context.getResources().getDimensionPixelSize(R.dimen.add_account_icon_circle_radius), 0, AnonymousClass7TG.A02(context));
        }
        if (182.A06(r7, userSession, 36329715312640280L)) {
            TextView textView = ddz.A03;
            textView.setLetterSpacing(-0.0107f);
            TextView textView2 = ddz.A02;
            textView2.setLetterSpacing(-0.0107f);
            DbY.A12(textView2, context);
            int A0F = AnonymousClass7TE.A0F(context.getResources());
            ddz.A01.setPadding(0, A0F, 0, A0F);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.action_bar_item_spacing_left);
            ViewGroup.MarginLayoutParams A0D = DbS.A0D(textView);
            A0D.bottomMargin = dimensionPixelSize;
            textView.setLayoutParams(A0D);
            int A0F2 = AnonymousClass7TE.A0F(context.getResources());
            ViewGroup.MarginLayoutParams A0D2 = DbS.A0D(imageView);
            A0D2.setMarginEnd(A0F2);
            imageView.setLayoutParams(A0D2);
            if (C46380Ddx.A00(userSession)) {
                textView.setTextSize(0, context.getResources().getDimension(R.dimen.account_group_management_row_text_size));
                textView.setLineHeight(context.getResources().getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material));
                textView.setLetterSpacing(-0.02f);
                ViewGroup.MarginLayoutParams A0D3 = DbS.A0D(textView);
                A0D3.bottomMargin = AnonymousClass7TG.A03(context);
                A0D3.topMargin = context.getResources().getDimensionPixelSize(R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
                textView.setLayoutParams(A0D3);
                ViewGroup.MarginLayoutParams A0D4 = DbS.A0D(textView2);
                A0D4.bottomMargin = AnonymousClass7TF.A02(context, R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
                textView2.setLayoutParams(A0D4);
                int A07 = AnonymousClass7TG.A07(context);
                imageView.setPadding(0, A07, 0, A07);
            }
        }
        if (C46380Ddx.A00(userSession)) {
            int A02 = AnonymousClass7TG.A02(context);
            ddz.A01.setPadding(0, A02, 0, A02);
        }
        inflate.setTag(ddz);
        return inflate;
    }
}

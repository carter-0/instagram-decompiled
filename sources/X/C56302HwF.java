package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannedString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.model.fundraiser.FundraiserCampaignTypeEnum;

/* renamed from: X.HwF  reason: case insensitive filesystem */
public abstract class C56302HwF {
    public static final View A00(Context context, ViewGroup viewGroup) {
        View A09 = DbU.A09(LayoutInflater.from(context), viewGroup, R.layout.feed_fundraiser_banner_cta, false);
        A09.setTag(new C53144GjG(A09, AnonymousClass7TF.A0F(A09, R.id.fundraiser_banner_container), DbX.A0Z(A09, R.id.fundraiser_title), DbX.A0Z(A09, R.id.fundraiser_progress_text)));
        return A09;
    }

    public static final void A01(FragmentActivity fragmentActivity, C229382nI r12, C55806Hnm hnm, JM5 jm5, C53144GjG gjG) {
        CharSequence spannedString;
        HLE hle;
        int i;
        String[] strArr;
        String str;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        AnonymousClass7TG.A1Q(jm5, hnm);
        if (gjG == null) {
            return;
        }
        if (jm5 instanceof C57183IRw) {
            gjG.A01.setVisibility(8);
        } else if (jm5 instanceof C53541GqC) {
            View view = gjG.A01;
            view.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            C53541GqC gqC = (C53541GqC) jm5;
            0qQ.A0A(layoutParams);
            int i2 = 0;
            gjG.A06.setVisibility(0);
            Resources resources = view.getResources();
            if ((layoutParams instanceof LinearLayout.LayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.setMargins(resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right), resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material), resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right), resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material));
            }
            IgTextView igTextView = gjG.A04;
            Resources A05 = DbU.A05(view);
            0qQ.A07(A05);
            FundraiserCampaignTypeEnum fundraiserCampaignTypeEnum = gqC.A00;
            if (fundraiserCampaignTypeEnum != null) {
                int ordinal = fundraiserCampaignTypeEnum.ordinal();
                if (ordinal == 11) {
                    i = 2131962331;
                    if (AnonymousClass7TF.A1Y(gqC.A01, true)) {
                        i = 2131962380;
                    }
                    strArr = new String[1];
                    str = gqC.A05;
                } else if (ordinal == 9) {
                    i = 2131962314;
                    strArr = new String[1];
                    str = gqC.A02;
                }
                strArr[0] = str;
                spannedString = 0bC.A01(A05, strArr, i);
                0qQ.A0A(spannedString);
                igTextView.setText(spannedString);
                IgTextView igTextView2 = gjG.A02;
                String str2 = gqC.A04;
                igTextView2.setText(str2);
                igTextView2.setTextSize(0, (float) resources.getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size));
                igTextView2.setPadding(0, 0, 0, 0);
                gjG.A03.setVisibility(8);
                gjG.A00.setVisibility(0);
                gjG.A05.setVisibility(0);
                if (str2 == null || str2.length() == 0) {
                    i2 = 8;
                }
                igTextView2.setVisibility(i2);
                if (r12 != null || fragmentActivity == null) {
                    view.setOnClickListener((View.OnClickListener) null);
                }
                AnonymousClass0iw r5 = r12.A04;
                0qQ.A07(r5);
                String str3 = gqC.A06;
                if (str3 != null) {
                    UserSession userSession = hnm.A03;
                    String str4 = gqC.A03;
                    G9w.A1D(AnonymousClass7TE.A0e(C51967G9n.A0Z(r5, userSession, str4, 1), "ig_cg_feed_show_fundraser_metatext"), str4, str3);
                }
                ID0.A00(view, hnm, r12, jm5, 10);
                if (fundraiserCampaignTypeEnum == FundraiserCampaignTypeEnum.IG_CHARITY_BUSINESS_PROFILE) {
                    hle = HLE.FUNDRAISER_DONATE_BOTTOM_SHEET;
                } else {
                    hle = HLE.FUNDRAISER_PAGE;
                }
                0sJ r2 = hnm.A02;
                if (r2 != null) {
                    r2.invoke(gqC.A03, str3, gqC.A08, hle);
                    return;
                }
                return;
            }
            spannedString = new SpannedString("");
            igTextView.setText(spannedString);
            IgTextView igTextView22 = gjG.A02;
            String str22 = gqC.A04;
            igTextView22.setText(str22);
            igTextView22.setTextSize(0, (float) resources.getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size));
            igTextView22.setPadding(0, 0, 0, 0);
            gjG.A03.setVisibility(8);
            gjG.A00.setVisibility(0);
            gjG.A05.setVisibility(0);
            i2 = 8;
            igTextView22.setVisibility(i2);
            if (r12 != null) {
            }
            view.setOnClickListener((View.OnClickListener) null);
        } else {
            throw AnonymousClass7TE.A1K();
        }
    }
}

package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.api.schemas.AdsAPIInstagramPosition;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.util.List;

public abstract class VAG {
    public static final void A00(View view, FragmentActivity fragmentActivity, XIGIGBoostDestination xIGIGBoostDestination, X95 x95, AnonymousClass0iw r13, UserSession userSession, ImageUrl imageUrl, String str, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        int i;
        List list2 = list;
        C51972G9s.A1C(userSession, list2);
        WGU A00 = WGU.A00(userSession);
        0qQ.A07(A00);
        1Au.A00(userSession);
        AnonymousClass7TF.A0G(view, R.id.promote_preview_title_text).setVisibility(DbW.A00(z ? 1 : 0));
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.promote_preview_subtitle_text);
        A0R.setVisibility(DbW.A00(z));
        DbT.A18(fragmentActivity, A0R, 2131970683);
        Dbb.A0t(view, R.id.promote_preview_subtitle_divider, 8);
        XAI xai = (XAI) fragmentActivity;
        if (xai.Bhh().A0D()) {
            DbU.A0D(view, R.id.promote_preview_ab_banner_stub).inflate();
            if (imageUrl != null) {
                DbT.A0b(view, R.id.banner_thumbnail).setUrl(imageUrl, r13);
            }
            String str2 = str;
            if (str != null) {
                DbX.A1E(view, str2, R.id.banner_title);
            }
        }
        if (list2.contains(AdsAPIInstagramPosition.STREAM)) {
            WBH.A01(DbY.A0F(view, R.id.feed_button_stub), 39, x95, A00);
        }
        AdsAPIInstagramPosition adsAPIInstagramPosition = AdsAPIInstagramPosition.STORY;
        if (list2.contains(adsAPIInstagramPosition)) {
            WBH.A01(DbY.A0F(view, R.id.stories_button_stub), 41, x95, A00);
        }
        if (list2.contains(AdsAPIInstagramPosition.EXPLORE)) {
            WBH.A01(DbY.A0F(view, R.id.explore_button_stub), 38, x95, A00);
        }
        if (list2.contains(AdsAPIInstagramPosition.REELS)) {
            WBH.A01(DbY.A0F(view, R.id.reel_button_stub), 40, x95, A00);
        }
        JTS.A0y(view, R.id.post_uneditable_hint_divider);
        if (list2.contains(adsAPIInstagramPosition)) {
            View A0F = DbY.A0F(view, R.id.performance_disclaimer_stub);
            0qQ.A0C(A0F, "null cannot be cast to non-null type com.instagram.common.ui.base.IgTextView");
            Context A0S = AnonymousClass7TE.A0S(view);
            String A16 = AnonymousClass7TE.A16(A0S, 2131970679);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(DbY.A0c(A0S, A16, 2131970677));
            AnonymousClass7AV.A03(spannableStringBuilder, new UsT(x95, DbV.A02(A0S)), A16);
            DbX.A1G((TextView) A0F, spannableStringBuilder);
            if (W3E.A02(xIGIGBoostDestination, userSession, z2) && z3 && !z) {
                View A0F2 = DbY.A0F(view, R.id.fb_placement_disclaimer);
                0qQ.A0C(A0F2, "null cannot be cast to non-null type com.instagram.common.ui.base.IgTextView");
                TextView textView = (TextView) A0F2;
                if (xIGIGBoostDestination == XIGIGBoostDestination.LEAD_GENERATION) {
                    i = 2131970674;
                } else if (xIGIGBoostDestination == XIGIGBoostDestination.WHATSAPP_MESSAGE) {
                    i = 2131970658;
                }
                textView.setText(i);
                textView.setVisibility(0);
            }
        }
        DbX.A0H(AnonymousClass7TF.A0G(view, R.id.performance_disclaimer_divider)).setMargins(0, (int) 0nA.A04(fragmentActivity, 24), 0, 0);
        if (z4) {
            IgdsListCell igdsListCell = (IgdsListCell) AnonymousClass7TF.A0F(view, R.id.ads_creative_optimizations_row);
            igdsListCell.setVisibility(0);
            igdsListCell.A0G(C69349Njo.TYPE_SWITCH, true);
            Context context = igdsListCell.getContext();
            igdsListCell.A0I(AnonymousClass7TE.A16(context, 2131970648));
            C16300UsR usR = new C16300UsR(x95, DbV.A02(context));
            String A162 = AnonymousClass7TE.A16(context, 2131970645);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(DbY.A0c(context, A162, 2131970646));
            AnonymousClass7AV.A03(spannableStringBuilder2, usR, A162);
            igdsListCell.A0H(spannableStringBuilder2);
            MovementMethod instance = LinkMovementMethod.getInstance();
            0qQ.A07(instance);
            igdsListCell.A0B(instance);
            PromoteData Bhh = xai.Bhh();
            ((XA9) fragmentActivity).Bhj();
            C16664Uz0 uz0 = Bhh.A14;
            if (uz0 == null || !(uz0 == C16664Uz0.OPT_IN || uz0 == C16664Uz0.DEFAULT_OPT_IN)) {
                z5 = false;
            } else {
                z5 = true;
            }
            igdsListCell.setChecked(z5);
            igdsListCell.A0E(new WYO(0, A00, Bhh));
        }
    }
}

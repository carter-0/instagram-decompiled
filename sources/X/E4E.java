package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.user.model.User;
import java.util.Map;

public final class E4E extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "InviteStoryFragment";
    public BusinessFlowAnalyticsLogger A00;
    public UserSession A01;
    public String A02;
    public G8D A03;
    public BusinessNavBar A04;
    public User A05;
    public final 1wn A06 = FXZ.A00(this, 7);

    public final String getModuleName() {
        return "invite_story_fragment";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return this.A01;
    }

    public final boolean onBackPressed() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger == null) {
            return false;
        }
        businessFlowAnalyticsLogger.ChP(new C22030Xtl("invite_story", this.A02, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        return false;
    }

    public final void configureActionBar(2da r4) {
        r4.ErD(FPB.A00(this, 49), R.drawable.instagram_x_pano_outline_24).setColorFilter(AnonymousClass37O.A00(2Yu.A0F(requireContext(), R.attr.textColorPrimary)));
    }

    public final void onAttach(Context context) {
        E4E.super.onAttach(context);
        this.A03 = FG1.A01(this);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-283750803);
        E4E.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        String A0l = DbU.A0l(requireArguments, "ARG_TARGET_USER_ID");
        UserSession A0U = DbX.A0U(this);
        this.A01 = A0U;
        this.A05 = AnonymousClass0BO.A00(A0U).BNw(A0l);
        this.A02 = DbU.A0l(requireArguments, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        BusinessFlowAnalyticsLogger A002 = FG1.A00(this.A03, this, this.A01);
        this.A00 = A002;
        if (A002 != null) {
            A002.Cka(new C22030Xtl("invite_story", this.A02, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        AnonymousClass0fD.A09(1586457688, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-809956544);
        View inflate = layoutInflater.inflate(R.layout.stacked_value_props, viewGroup, false);
        TextView A07 = Dba.A07(inflate, R.id.title);
        UserSession userSession = this.A01;
        0eE r1 = AnonymousClass0t1.A01;
        DbX.A1F(A07, this, DbU.A0n(userSession, r1), 2131964500);
        TextView A072 = Dba.A07(inflate, R.id.subtitle);
        String A0n = DbU.A0n(this.A01, r1);
        User user = this.A05;
        user.getClass();
        A072.setText(getString(2131964499, new Object[]{A0n, user.getUsername()}));
        DbU.A0B(inflate, R.id.divider).setVisibility(8);
        ColorFilterAlphaImageView colorFilterAlphaImageView = (ColorFilterAlphaImageView) inflate.findViewById(R.id.title_icon);
        if (colorFilterAlphaImageView != null) {
            colorFilterAlphaImageView.A04(0, 0);
            int dimensionPixelSize = DbV.A05(this).getDimensionPixelSize(R.dimen.appreciation_reels_grid_item_width);
            colorFilterAlphaImageView.setImageResource(R.drawable.instagram_business_images_business_story);
            ViewGroup.LayoutParams layoutParams = colorFilterAlphaImageView.getLayoutParams();
            layoutParams.getClass();
            layoutParams.height = dimensionPixelSize;
            ViewGroup.LayoutParams layoutParams2 = colorFilterAlphaImageView.getLayoutParams();
            layoutParams2.getClass();
            layoutParams2.width = dimensionPixelSize;
            colorFilterAlphaImageView.setBackground((Drawable) null);
        }
        BusinessNavBar businessNavBar = (BusinessNavBar) inflate.requireViewById(R.id.navigation_bar);
        this.A04 = businessNavBar;
        businessNavBar.setPrimaryButtonText(2131964498);
        this.A04.setPrimaryButtonOnclickListeners(FPB.A00(this, 48));
        1xC.A01.A02(this.A06, AnonymousClass0KZ.class);
        AnonymousClass0fD.A09(-1904983961, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(618727077);
        super.onDestroyView();
        1xC.A01.A03(this.A06, AnonymousClass0KZ.class);
        AnonymousClass0fD.A09(-649485398, A022);
    }
}

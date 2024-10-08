package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout2;
import java.util.ArrayList;
import java.util.Iterator;

public final class K5x extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "PromoteMediaPickerFragment";
    public IgdsBottomButtonLayout A00;
    public LOA A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131965949);
    }

    public final String getModuleName() {
        return "promote_media_picker";
    }

    public final void onConfigurationChanged(Configuration configuration) {
        0qQ.A0B(configuration, 0);
        Dbc.A0q(this, 8);
        super.onConfigurationChanged(configuration);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putString("coupon_offer_id", A00().A02);
        bundle.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, A00().A03);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = DbT.A0c(view, R.id.action_button);
        ViewPager2 viewPager2 = (ViewPager2) AnonymousClass7TF.A0F(view, R.id.media_picker_view_pager);
        IgSegmentedTabLayout2 igSegmentedTabLayout2 = (IgSegmentedTabLayout2) AnonymousClass7TF.A0F(view, R.id.media_type_segmented_tab);
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1C.add(new C49627Ezk((Drawable) null, (CharSequence) null, (CharSequence) null, 2131965946, true));
        A1C.add(new C49627Ezk((Drawable) null, (CharSequence) null, (CharSequence) null, 2131965963, true));
        A1C.add(new C49627Ezk((Drawable) null, (CharSequence) null, (CharSequence) null, 2131965948, true));
        Iterator it = A1C.iterator();
        while (it.hasNext()) {
            C49627Ezk ezk = (C49627Ezk) it.next();
            0qQ.A0B(ezk, 0);
            igSegmentedTabLayout2.A02((View.OnClickListener) null, ezk);
        }
        AnonymousClass0eM r5 = this.A02;
        UserSession A0l = AnonymousClass7TE.A0l(r5);
        DbS.A1Z(A0l);
        viewPager2.setAdapter(new C60726JqF(this, A0l, A1C));
        igSegmentedTabLayout2.setViewPager(viewPager2);
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A00;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setPrimaryAction(getString(2131968361), new LY1(this, 30));
            IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A00;
            if (igdsBottomButtonLayout2 != null) {
                igdsBottomButtonLayout2.setPrimaryButtonEnabled(AnonymousClass7TF.A1V(A00().A01));
                JTU.A0D(r5).A0R(C16678UzE.MEDIA_PICKER.toString(), "start_media_selection_1");
                return;
            }
        }
        0qQ.A0F("bottomButtonLayout");
        throw AnonymousClass00P.createAndThrow();
    }

    public final LOA A00() {
        LOA loa = this.A01;
        if (loa != null) {
            return loa;
        }
        0qQ.A0F("mediaPickerState");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (intent != null) {
            super.onActivityResult(i, i2, intent);
        }
        if (i != 17) {
            return;
        }
        if (i2 == 1793 || i2 == 1797) {
            DbX.A0N(requireActivity(), this.A02).A06();
        }
    }

    public final boolean onBackPressed() {
        UserSession A0l = AnonymousClass7TE.A0l(this.A02);
        DbS.A1Z(A0l);
        String string = requireArguments().getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        if (string == null) {
            string = "promote_media_picker";
            0wb.A03(string, "Missing entry point when enter promote creation");
        }
        0qQ.A0B(A0l, 0);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(A0l), "promoted_posts_cancel");
        if (A0e.isSampled()) {
            JTS.A18(A0e, 1Q9.A01("boost_posts"));
            A0e.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, string);
            DbS.A1H(A0e, "media_selection");
            A0e.AAJ("fb_user_id", A0l.A06);
            A0e.Cgf();
        }
        return false;
    }

    public final void onCreate(Bundle bundle) {
        String A0o;
        String string;
        int A022 = AnonymousClass0fD.A02(-255536416);
        if (bundle != null) {
            A0o = JTP.A0m(bundle, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            string = bundle.getString("coupon_offer_id");
        } else {
            A0o = DbX.A0o(this);
            if (A0o == null) {
                A0o = "promote_media_picker";
                0wb.A03(A0o, "Missing entry point when enter promote creation");
            }
            string = requireArguments().getString("coupon_offer_id");
        }
        this.A01 = new LOA(A0o, string);
        JTR.A1T(this, A00().A04);
        K5x.super.onCreate(bundle);
        AnonymousClass0fD.A09(-2038448048, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(212073393);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.promote_media_picker_revamp_fragment, false);
        AnonymousClass0fD.A09(2078827268, A022);
        return A0D;
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1228150663);
        Dbc.A0q(this, 8);
        super.onResume();
        AnonymousClass0fD.A09(1558141655, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(843426313);
        K5x.super.onStop();
        Dbc.A0q(this, 0);
        AnonymousClass0fD.A09(1905639859, A022);
    }
}

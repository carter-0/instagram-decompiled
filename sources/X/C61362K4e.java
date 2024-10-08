package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.K4e  reason: case insensitive filesystem */
public final class C61362K4e extends AnonymousClass4DH {
    public static final CallerContext A08 = CallerContext.A01(__redex_internal_original_name);
    public static final String __redex_internal_original_name = "QuickCaptureAddToStoryDualDestinationFragment";
    public ImageView A00;
    public ImageView A01;
    public C63709L3t A02;
    public boolean A03;
    public boolean A04;
    public AnonymousClass1MK A05;
    public final AnonymousClass0eM A06 = AnonymousClass0eN.A00(0eO.A02, new C20699WxV(this, 7));
    public final AnonymousClass0eM A07 = C227642jf.A02(this);

    public static final void A00(View view, C61362K4e k4e) {
        03v.A0B(view, new U7D(3));
        boolean z = k4e.A04;
        Context context = view.getContext();
        int i = 2131961061;
        if (z) {
            i = 2131961060;
        }
        03v.A0G(view, context.getString(i));
    }

    public final String getModuleName() {
        return "quick_capture_add_to_story_dual_destination_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        this.A00 = DbU.A0F(view2, R.id.my_story_avatar);
        ((C3021461u) AnonymousClass7TF.A0F(view2, R.id.action_button)).setPrimaryActionOnClickListener(new C64273LXz(this, 44));
        03v.A0G(AnonymousClass7TF.A0G(view2, R.id.your_instagram_story_row), view2.getContext().getString(2131961059));
        View A0F = AnonymousClass7TF.A0F(view2, R.id.your_facebook_story_row);
        TextView A0R = AnonymousClass7TG.A0R(view2, R.id.add_to_story_dual_destination_share_sheet_fb_story_row_subtitle);
        this.A01 = DbU.A0F(view2, R.id.share_to_fb_check);
        A02(this);
        A00(A0F, this);
        if (this.A03) {
            C299935wF A002 = ((C363378jd) this.A06.getValue()).A00(A08);
            GradientSpinnerAvatarView A0j = DbX.A0j(view2, R.id.fb_profile_avatar);
            View A0F2 = AnonymousClass7TF.A0F(view2, R.id.fb_icon);
            TextView A0R2 = AnonymousClass7TG.A0R(view2, R.id.add_to_story_dual_destination_share_sheet_fb_story_row_title);
            TextView A0R3 = AnonymousClass7TG.A0R(view2, R.id.add_to_story_dual_destination_share_sheet_fb_story_row_subtitle);
            String str = A002.A04;
            String str2 = A002.A05;
            AnonymousClass0eM r13 = this.A07;
            String A003 = C367158qH.A00(getContext(), AnonymousClass7TE.A0l(r13), A002);
            boolean z = true;
            if (A003 == null || A003.length() == 0) {
                JTS.A1H(AnonymousClass818.IG_STORY_COMPOSER_YOUR_STORY_BUTTON, C368278sM.SUPPRESS, AnonymousClass819.BOTTOMSHEET_DUAL_DESTPICKER_STORIES, AnonymousClass7TE.A0l(r13), "empty_audience");
            }
            if (str == null || str.length() == 0) {
                JTS.A1H(AnonymousClass818.IG_STORY_COMPOSER_YOUR_STORY_BUTTON, C368278sM.SUPPRESS, AnonymousClass819.BOTTOMSHEET_DUAL_DESTPICKER_STORIES, AnonymousClass7TE.A0l(r13), "empty_name");
            } else {
                String str3 = null;
                if (182.A06(0Tu.A05, DbT.A0X(r13), 36329839866691937L)) {
                    String username = DbX.A0l(AnonymousClass0t1.A01, r13).getUsername();
                    if (username.length() != 0) {
                        AnonymousClass7TG.A0R(view2, R.id.add_to_story_dual_destination_share_sheet_ig_story_row_title).setText(username);
                    }
                    A0R2.setText(str);
                    Context context = getContext();
                    if (A003 != null) {
                        if (context != null) {
                            str3 = DbW.A0h(context, A003, 2131952392);
                        }
                    } else if (context != null) {
                        str3 = context.getString(2131955732);
                    }
                    A0R3.setText(str3);
                } else {
                    if (A003 != null) {
                        Context context2 = getContext();
                        if (context2 != null) {
                            str = DbV.A0u(context2, str, A003, 2131952394);
                        } else {
                            str = null;
                        }
                    }
                    A0R3.setText(str);
                }
                A0R3.setVisibility(0);
            }
            if (str2.length() <= 0) {
                z = false;
            }
            if (z) {
                A0F2.setVisibility(8);
                AnonymousClass3YO.A00(getContext(), this, A0j, str2);
            } else {
                A0j.setVisibility(8);
            }
            AnonymousClass0fU.A00(new LY7(47, (Object) A0F, (Object) this), A0F);
            A01(JZY.VIEW, this, this.A04);
        } else {
            A0F.setAlpha(0.5f);
            A0R.setVisibility(0);
            A0R.setText(2131952395);
            A01(JZY.UNAVAILABLE, this, false);
            JTS.A0y(view2, R.id.fb_profile_avatar);
        }
        this.A05 = new C64615Lez(this, 7);
        1OO A0J = 1NK.A00().A0J(DbX.A0l(AnonymousClass0t1.A01, this.A07).Bh3(), (String) null);
        A0J.A02(this.A05);
        A0J.A01();
    }

    public static final void A01(JZY jzy, C61362K4e k4e, boolean z) {
        0bb r3 = new 0bb();
        r3.A03("is_xpost_enabled", Boolean.valueOf(z));
        UserSession A0l = AnonymousClass7TE.A0l(k4e.A07);
        JZX.A00(jzy, JZZ.STORY, AnonymousClass818.IG_STORY_DUAL_DESTPICKER, r3, A0l);
    }

    public static final void A02(C61362K4e k4e) {
        ImageView imageView;
        Context requireContext;
        int i;
        if (!k4e.A03) {
            ImageView imageView2 = k4e.A01;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
                return;
            }
        } else {
            boolean z = k4e.A04;
            ImageView imageView3 = k4e.A01;
            if (z) {
                if (imageView3 != null) {
                    DbU.A13(k4e.requireContext(), imageView3, R.drawable.instagram_circle_check_pano_filled_24);
                    imageView = k4e.A01;
                    if (imageView != null) {
                        requireContext = k4e.requireContext();
                        i = R.color.badge_color;
                    }
                }
            } else if (imageView3 != null) {
                DbU.A13(k4e.requireContext(), imageView3, R.drawable.instagram_circle_outline_24);
                imageView = k4e.A01;
                if (imageView != null) {
                    requireContext = k4e.requireContext();
                    i = R.color.grey_2;
                }
            }
            DbU.A14(requireContext, imageView, i);
            return;
        }
        0qQ.A0F("shareToFacebookCheck");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A022 = AnonymousClass0fD.A02(-973631129);
        C61362K4e.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        Boolean bool = null;
        if (bundle2 != null) {
            bool = DbU.A0g(bundle2, AnonymousClass000.A00(3460));
        }
        if (bool != null) {
            this.A04 = bool.booleanValue();
            Bundle bundle3 = this.mArguments;
            if (bundle3 != null) {
                boolean z = bundle3.getBoolean(AnonymousClass000.A00(2762));
                if (Boolean.valueOf(z) != null) {
                    this.A03 = z;
                    AnonymousClass0fD.A09(133186714, A022);
                    return;
                }
            }
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = 1527373469;
        } else {
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = 980792819;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1996233163);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_add_to_story_dual_destination, viewGroup, false);
        AnonymousClass0fD.A09(-217746698, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-860741814);
        super.onDestroy();
        this.A02 = null;
        AnonymousClass0fD.A09(-932907829, A022);
    }
}

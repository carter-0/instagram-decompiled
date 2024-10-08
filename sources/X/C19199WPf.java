package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoBottomSheetConfiguration;
import com.instagram.modal.ModalActivity;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.WPf  reason: case insensitive filesystem */
public final class C19199WPf implements AnonymousClass0iw {
    public static final String __redex_internal_original_name = "EffectInfoBottomSheetController";
    public C279284yO A00;
    public C60121Jg2 A01;
    public C3504784u A02;
    public boolean A03 = false;
    public final int A04;
    public final Activity A05;
    public final View A06;
    public final View A07;
    public final ViewPager A08;
    public final 28D A09;
    public final AnonymousClass0iw A0A;
    public final UserSession A0B;
    public final EffectInfoBottomSheetConfiguration A0C;
    public final K79 A0D;
    public final C312266e6 A0E;
    public final AnonymousClass4DU A0F;
    public final String A0G;
    public final View A0H;
    public final Map A0I = new HashMap();
    public final boolean A0J;

    public final void A05(String str, String str2, String str3) {
        String str4;
        String str5 = null;
        if (str2 != null) {
            str4 = str2.toUpperCase(Locale.ROOT);
        } else {
            str4 = null;
        }
        if (str3 != null) {
            str5 = AnonymousClass7TF.A0e(this.A05.getResources(), 002.A0R("@", str3), 2131970991).toUpperCase(Locale.ROOT);
        }
        Activity activity = this.A05;
        new LT3(activity, this.A0D, this.A0B, (MT4) null, StringFormatUtil.formatStrLocaleSafe("https://www.instagram.com/ar/%s&utm_source=qr", str), str, activity.getResources().getString(2131970994), str4, str5, this.A0C.A04).A04();
    }

    public final void A06(String str, String str2, boolean z) {
        Activity activity = this.A05;
        AnonymousClass37D A0i = DbT.A0i(activity);
        String str3 = str;
        boolean z2 = z;
        if (A0i == null || !((AnonymousClass37F) A0i).A0g) {
            A01(activity, this, str, z);
            return;
        }
        A0i.A0Q(new C19690Wds(this, A0i, str3, str2, z2));
        A0i.A0B();
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public static void A00(Activity activity, C19199WPf wPf, String str) {
        UserSession userSession = wPf.A0B;
        1a1 A022 = C46447Df9.A02();
        C46474Dfc A012 = C46548Dgp.A01(userSession, str, "camera_effect_info_sheet_attribution", __redex_internal_original_name);
        A012.A0O = C273654mx.A00(90);
        Activity activity2 = activity;
        AnonymousClass6W8 r4 = new AnonymousClass6W8(activity2, A022.A01(userSession, A012.A04()), userSession, ModalActivity.class, "profile");
        r4.A0J = new int[]{R.anim.right_in, R.anim.left_out, R.anim.left_in, R.anim.right_out};
        r4.A0C(activity.getApplicationContext());
    }

    public static void A01(Activity activity, C19199WPf wPf, String str, boolean z) {
        C14068TpH tpH;
        UserSession userSession = wPf.A0B;
        AnonymousClass4DU r4 = wPf.A0F;
        int i = wPf.A04;
        switch (i) {
            case 0:
            case 1:
            case 4:
                tpH = C14068TpH.AR_EFFECT_CAMERA_TRAY;
                break;
            case 2:
                tpH = C14068TpH.AR_EFFECT_PROFILE_PREVIEW;
                break;
            case 3:
            case 7:
                tpH = C14068TpH.AR_EFFECT_DISCOVERY_PREVIEW;
                break;
            case 5:
                tpH = C14068TpH.AR_EFFECT_STORIES_ATTRIBUTION_BOTTOM_SHEET;
                break;
            case 8:
                tpH = C14068TpH.AR_EFFECT_FEED_ATTRIBUTION_BOTTOM_SHEET;
                break;
            case 9:
                tpH = C14068TpH.AR_EFFECT_VIDEO_CALLING;
                break;
            default:
                0kD.A01(AnonymousClass000.A00(931), 002.A0O("Unsupported entry point for reporting: ", i));
                tpH = C14068TpH.AR_EFFECT_CAMERA_TRAY;
                break;
        }
        C16677UzD uzD = C16677UzD.AR_EFFECT;
        boolean z2 = wPf.A0C.A04;
        C51974G9v.A1O(userSession, activity, r4, str);
        C71093OcF ocF = new C71093OcF(activity, r4, userSession, tpH, uzD, str, z2);
        C16666Uz2 uz2 = C16666Uz2.REPORT_BUTTON;
        0qQ.A0B(uz2, 0);
        ocF.A02 = uz2;
        ocF.A03 = new C16391Uu9(wPf, str, z);
        C71093OcF.A00((C331157Pu) null, ocF);
    }

    public static void A02(C19199WPf wPf) {
        int currentItem = wPf.A08.getCurrentItem();
        boolean z = false;
        boolean A1R = AnonymousClass7TF.A1R(currentItem);
        if (currentItem < wPf.A0C.A02.size() - 1) {
            z = true;
        }
        wPf.A07.setEnabled(A1R);
        wPf.A06.setEnabled(z);
    }

    public final void A03() {
        if (!this.A03) {
            this.A03 = true;
            if (this.A0J) {
                FragmentActivity activity = this.A0D.getActivity();
                if (activity != null) {
                    activity.setResult(60572);
                    activity.finish();
                } else {
                    return;
                }
            }
            this.A03 = false;
        }
    }

    public final void A04(String str) {
        C312266e6 r0 = this.A0E;
        if (r0 != null) {
            r0.EDY(str);
        }
        UserSession userSession = this.A0B;
        AnonymousClass7TG.A1N(userSession, str);
        C16909VAm.A00(new C19137WMt(userSession, str), userSession, str);
    }

    public C19199WPf(Bundle bundle, View view, EffectInfoBottomSheetConfiguration effectInfoBottomSheetConfiguration, K79 k79, C312266e6 r14, C60121Jg2 jg2) {
        AnonymousClass0iw r0;
        C19371WWm wWm = new C19371WWm(this);
        this.A0F = wWm;
        this.A0D = k79;
        this.A05 = k79.getRootActivity();
        this.A0H = view;
        EffectInfoBottomSheetConfiguration effectInfoBottomSheetConfiguration2 = effectInfoBottomSheetConfiguration;
        this.A0C = effectInfoBottomSheetConfiguration;
        this.A0J = effectInfoBottomSheetConfiguration.A06;
        this.A01 = jg2;
        UserSession A0U = DbS.A0U(bundle);
        this.A0B = A0U;
        this.A0E = r14;
        int i = effectInfoBottomSheetConfiguration.A00;
        this.A04 = i;
        this.A09 = effectInfoBottomSheetConfiguration.A01;
        this.A0G = effectInfoBottomSheetConfiguration.A03;
        if (bundle.getString("camera_destination") != null) {
            this.A00 = C338817ia.A00(bundle.getString("camera_destination"));
        }
        if (i == 0) {
            r0 = C17169VKy.A0E;
        } else if (i == 1) {
            r0 = C17169VKy.A0D;
        } else if (i == 5) {
            r0 = C17169VKy.A0G;
        } else if (i == 8) {
            r0 = C17169VKy.A08;
        } else if (i != 11) {
            r0 = C17169VKy.A0H;
        } else {
            r0 = C17169VKy.A0B;
        }
        this.A0A = r0;
        C17216VMu vMu = new C17216VMu(this);
        ViewPager requireViewById = view.requireViewById(R.id.effect_info_view_pager);
        this.A08 = requireViewById;
        requireViewById.setAdapter(new UFL(effectInfoBottomSheetConfiguration.A02, wWm, this.A00, new C18486Vsh(A0U, effectInfoBottomSheetConfiguration2, vMu, this, this)));
        this.A07 = view.requireViewById(R.id.left_arrow);
        this.A06 = view.requireViewById(R.id.right_arrow);
        int size = this.A0C.A02.size();
        View view2 = this.A07;
        if (size == 1) {
            view2.setVisibility(8);
            this.A06.setVisibility(8);
            return;
        }
        WB8.A00(view2, 25, this);
        WB8.A00(this.A06, 26, this);
        this.A08.A0J(new C18954WEh(this, 2));
        A02(this);
    }
}

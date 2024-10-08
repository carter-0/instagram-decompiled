package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public final class W3M {
    public static final W3M A00 = new Object();
    public static final Map A01 = 0Yt.A06(new 0eP[]{new 0eP(C16670Uz6.OPEN_LINK, C16680UzG.OPEN_LINK), new 0eP(C16670Uz6.LAUNCH_MEDIA_PICKER, C16680UzG.MEDIA_PICKER), new 0eP(C16670Uz6.RESUME_AD, C16680UzG.RESUME_AD), new 0eP(C16670Uz6.INCREASE_ACCOUNT_SPENDING_LIMIT, C16680UzG.ACCOUNT_SPENDING_LIMIT), new 0eP(C16670Uz6.BOOST_REEL, C16680UzG.BOOST), new 0eP(C16670Uz6.AD_SLIDER, C16680UzG.AD_SLIDER)});

    public static final C358248ab A00(Context context, DialogInterface.OnClickListener onClickListener, AnonymousClass0iw r6, ImageUrl imageUrl, C358278ae r8, String str, String str2, int i, boolean z) {
        C358248ab A0g = DbX.A0g(context, str2, str);
        A0g.A0Q(onClickListener, r8, i);
        A0g.A0G((DialogInterface.OnClickListener) null, 2131970109);
        A0g.A0s(true);
        if (z) {
            A0g.A08 = true;
            Context context2 = A0g.A0Q;
            float A05 = (float) JTR.A05(context2);
            int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.ads_disclosure_footer_top_divider_height);
            IgImageView A0H = JTP.A0H(A0g.A0W, R.layout.dialog_image);
            0qQ.A0C(A0H, AnonymousClass000.A00(3652));
            IgImageView igImageView = (RoundedCornerImageView) A0H;
            boolean z2 = false;
            igImageView.setVisibility(0);
            igImageView.setRadius(A05);
            igImageView.setStrokeWidth(dimensionPixelSize);
            if (dimensionPixelSize > 0) {
                z2 = true;
            }
            igImageView.setStrokeEnabled(z2);
            igImageView.A0E = new WTN(0, A0g, igImageView);
            igImageView.setRadius((float) A0g.A0O);
            igImageView.setBitmapShaderScaleType(AnonymousClass3MJ.CENTER_CROP);
            igImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            igImageView.setUrl(imageUrl, r6);
            return A0g;
        }
        A0g.A0p(imageUrl, r6);
        return A0g;
    }

    public static final void A02(Activity activity, Context context, String str, String str2, String str3, String str4) {
        if (str != null && str2 != null && str3 != null && str4 != null) {
            C358248ab A0g = DbX.A0g(context, str2, str);
            C50018FJd fJd = new C50018FJd((Object) activity, (Object) context, str4, 0);
            C358278ae r2 = C358278ae.RED_BOLD;
            A0g.A0Y(fJd, r2, str3, true);
            A0g.A0P((DialogInterface.OnClickListener) null, r2, 2131954722);
            A0g.A0s(true);
            DbT.A1V(A0g);
        }
    }

    public static final void A03(Context context, DialogInterface.OnClickListener onClickListener, AnonymousClass0iw r11, ImageUrl imageUrl, boolean z) {
        AnonymousClass7TG.A1Q(context, r11);
        DialogInterface.OnClickListener onClickListener2 = onClickListener;
        ImageUrl imageUrl2 = imageUrl;
        DbT.A1V(A00(context, onClickListener2, r11, imageUrl2, C358278ae.BLUE_BOLD, AnonymousClass7TF.A0d(context.getResources(), 2131970126), AnonymousClass7TF.A0d(context.getResources(), 2131970125), 2131970113, z));
    }

    public static final void A06(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        AnonymousClass7TF.A0D().postDelayed(new Wj2(userSession), 1000);
    }

    public final void A07(Context context, DialogInterface.OnClickListener onClickListener, AnonymousClass0iw r14, UserSession userSession, ImageUrl imageUrl, boolean z) {
        0qQ.A0B(userSession, 0);
        DialogInterface.OnClickListener onClickListener2 = onClickListener;
        AnonymousClass0iw r4 = r14;
        ImageUrl imageUrl2 = imageUrl;
        DbT.A1V(A00(context, onClickListener2, r4, imageUrl2, C358278ae.RED_BOLD, AnonymousClass7TF.A0d(context.getResources(), 2131970124), AnonymousClass7TF.A0d(context.getResources(), 2131970123), 2131970112, z));
        WGU A002 = WGU.A00(userSession);
        C16678UzE uzE = C16678UzE.CAMPAIGN_CONTROLS;
        A002.A01 = "ads_manager";
        A002.A0H(uzE, "promote_edit_pause_dialog");
    }

    public static final String A01(C16680UzG uzG) {
        Map map = A01;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            if (A1J.getValue() == uzG) {
                JTR.A1U(linkedHashMap, A1J);
            }
        }
        return DbT.A10(00k.A0D(linkedHashMap.keySet()));
    }

    public static final void A04(Context context, String str, String str2) {
        if (str != null && str2 != null) {
            C358248ab A0g = DbX.A0g(context, str2, str);
            A0g.A0G((DialogInterface.OnClickListener) null, 2131970140);
            A0g.A04();
            DbT.A1V(A0g);
        }
    }

    public static final void A05(FragmentActivity fragmentActivity, C19176WOi wOi, UserSession userSession, String str, String str2, Map map, boolean z, boolean z2, boolean z3) {
        String str3;
        boolean z4;
        String A002;
        int i;
        AnonymousClass7TG.A1T(userSession, fragmentActivity, str);
        map.put("target_id", str);
        map.put("origin", str2);
        if (wOi == null || (str3 = wOi.A0F) == null) {
            str3 = "";
        }
        map.put("boosted_id", str3);
        if (wOi != null) {
            z4 = AnonymousClass7TE.A1b(wOi.ByH());
            if (z4) {
                ImmutableList ByH = wOi.ByH();
                ArrayList A0r = AnonymousClass7TG.A0r(ByH);
                Iterator it = ByH.iterator();
                while (it.hasNext()) {
                    String str4 = C13989Tnp.A0S(it).A0C;
                    if (str4 != null) {
                        A0r.add(str4);
                    } else {
                        0qQ.A0F("adsMediaIgId");
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
                map.put("split_test_partner_promotion_ids", C51970G9q.A0k(A0r));
            }
        } else {
            z4 = false;
        }
        02m r6 = 02m.A0p;
        if (z2) {
            A002 = AnonymousClass000.A00(1198);
            i = 39130588;
            r6.markerStart(39130588);
            r6.markerAnnotate(39130588, "component_url", A002);
        } else {
            if (z3) {
                A002 = AnonymousClass000.A00(2880);
                i = 39137013;
            } else if (z) {
                A002 = AnonymousClass000.A00(1196);
                i = 39124993;
            } else {
                if (z4) {
                    A002 = "com.instagram.insights.media_refresh.split_tests.surface";
                } else {
                    A002 = AnonymousClass000.A00(1195);
                }
                i = 39124994;
            }
            r6.markerStart(i);
            r6.markerAnnotate(i, "component_url", A002);
            r6.markerAnnotate(i, "insights_type", "umi");
        }
        AnonymousClass7TF.A0D().postDelayed(new C20193Wmr(r6, i), StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
        int i2 = 2131952241;
        if (182.A06(0Tu.A06, userSession, 36330058910089648L)) {
            i2 = 2131957496;
        }
        String A0p = C51967G9n.A0p(fragmentActivity, i2);
        C46649DiU A04 = C46649DiU.A04(A002, map);
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig((0lg) userSession);
        igBloksScreenConfig.A0U = A0p;
        igBloksScreenConfig.A03 = new C47543E7g(i, 1);
        A04.A0D(fragmentActivity, igBloksScreenConfig);
    }
}

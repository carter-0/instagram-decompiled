package X;

import android.app.Dialog;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.util.JsonWriter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.Modifier;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.android.R;
import com.instagram.api.schemas.CreatorViewerSignalModel;
import com.instagram.api.schemas.MediaType;
import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState;
import com.instagram.contentnotes.ui.immersiveselfnote.ContentNotesImmersiveSelfNoteContent;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.feed.media.EffectPreviewIntf;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import com.instagram.wonderwall.model.WallText;
import java.io.Writer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public abstract class G9w {
    public static int A02(int i, int i2) {
        return (i + i2) * 31 * 31 * 31;
    }

    public static int A03(C286575Wy r1, C286565Wx r2, Object obj, 0sL r4) {
        C286565Wx.A0L(r2, false);
        C286645Xf.A04(r1, obj, r4);
        return 6;
    }

    public static Modifier A0C(C286575Wy r1, C286565Wx r2, Modifier modifier, Object obj) {
        C286565Wx.A0L(r2, false);
        return C288235ba.A04(r1, modifier, (C62320sa) obj);
    }

    public static Modifier A0D(C286575Wy r1, C286565Wx r2, Modifier modifier, C62320sa r4) {
        C286565Wx.A0L(r2, false);
        return C288235ba.A04(r1, modifier, r4);
    }

    public static Modifier A0I(Modifier modifier, float f) {
        return C287195Zj.A0B(modifier, 0.0f, 0.0f, f, 0.0f);
    }

    public static AnonymousClass9IC A0O() {
        return new AnonymousClass9IC(31, 0, false, false, false, false, false);
    }

    public static 2WL A0T(View view, long j) {
        view.measure(C245063cG.A01(j), C245063cG.A00(j));
        return new 2WL(C245133cN.A00(C245073cH.A01(j), Math.min(view.getMeasuredHeight(), C245073cH.A00(j))), (Object) null);
    }

    public static AnonymousClass3O5 A0U(AnonymousClass2WJ r6) {
        C336007du r3 = new C336007du();
        int A02 = r6.Bnf().A02(R.color.fds_white_alpha60);
        AnonymousClass3O5 r2 = r3.A00;
        r2.A09 = A02;
        r3.A02(0.0f);
        r2.A06 = 2;
        r3.A04(1000);
        r2.A03 = -20.0f;
        AnonymousClass3O5 A01 = r3.A01();
        0qQ.A07(A01);
        return A01;
    }

    public static C238873Dt A0V(Object obj) {
        return new C238873Dt((Integer) null, obj, (String) null, (String) null);
    }

    public static WallText.Res A0b(int i) {
        return new WallText.Res(i, new String[0]);
    }

    public static List A0l(View view, int i, int i2) {
        return 0sr.A1P(new Rect[]{new Rect(0, 0, i, i2), new Rect(view.getWidth() - i, 0, view.getWidth(), view.getHeight())});
    }

    public static C66162MFz A0n(C286575Wy r2, Object obj, int i) {
        C66162MFz mFz = new C66162MFz(obj, (AnonymousClass4D7) null, i);
        r2.FLL(mFz);
        return mFz;
    }

    public static void A14(View view, ImageView imageView, RoundedCornerFrameLayout roundedCornerFrameLayout) {
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 16;
        imageView.setLayoutParams(layoutParams);
        view.setLayoutParams(layoutParams);
        roundedCornerFrameLayout.addView(imageView);
        roundedCornerFrameLayout.addView(view);
        roundedCornerFrameLayout.setCornerBackgroundColor(0);
    }

    public static void A19(0Aj r3, 1Xj r4, String str, int i) {
        r3.A8D("elapsed_time_since_last_item", Double.valueOf(-1.0d));
        r3.A7p("is_acp_delivered", false);
        r3.AAJ("feed_request_id", r4.A0R);
        r3.AAJ("delivery_flags", C243413Yr.A00(r4.A0e));
        r3.A7p("is_eof", r4.A0C.CSj());
        Integer valueOf = Integer.valueOf(i);
        r3.A9F("carousel_index", C294185m0.A03(r4, valueOf));
        r3.AAJ("carousel_media_id", C294185m0.A0B(r4, valueOf));
        r3.AAJ("carousel_cover_media_id", C294185m0.A0A(r4, valueOf));
        r3.AAJ("nav_chain", str);
        r3.A9F("carousel_size", C294185m0.A05(r4, valueOf));
        r3.A9F("carousel_m_t", C294185m0.A04(r4, valueOf));
    }

    public static void A1F(2Wb r1, C244103ae r2, int i, long j) {
        r2.A0K((float) i);
        r2.A0I((float) 2Wd.A00(r1.Bnf(), j));
        r2.A0J((float) 2Wd.A00(r1.Bnf(), j));
        r2.A0H((float) 2Wd.A00(r1.Bnf(), j));
    }

    public static long A04() {
        return Double.doubleToRawLongBits(28.0d);
    }

    public static JsonWriter A08(MediaType mediaType, AnonymousClass571 r3, Writer writer, String str, String str2) {
        return new JsonWriter(writer).beginObject().name("avatar_id").value(r3.A02).name("avatar_revision_id").value(r3.A03).name("avatar_style").value(r3.A07).name("avatar_sticker_id").value(str).name("avatar_sticker_ikid").value(str2).name("avatar_sticker_media_type").value(mediaType.A00).name("surface");
    }

    public static JsonWriter A09(Writer writer, Boolean bool, String str) {
        return new JsonWriter(writer).beginObject().name("gif_media_id").value(str).name("is_sticker").value(bool.booleanValue()).endObject();
    }

    public static TextView A0A(Object obj) {
        TextView textView = (TextView) obj;
        0qQ.A0B(textView, 1);
        return textView;
    }

    public static Modifier A0B(C287605aT r2, Modifier modifier, C62320sa r4) {
        return C287635aW.A03(new AnonymousClass5aR(400.0f, 400.0f), r2, modifier, r4);
    }

    public static Modifier A0E(C286575Wy r5, Modifier modifier) {
        return C304766Fd.A01(C304816Fi.A01(AnonymousClass6C9.A00(1.0f, AnonymousClass5aQ.A00(r5).A0d), modifier, AnonymousClass5ZN.A01(16.0f)), AnonymousClass5ZN.A01(16.0f), AnonymousClass5aQ.A00(r5).A0k);
    }

    public static Modifier A0F(Modifier modifier) {
        return C287205Zk.A08(modifier, 44.0f);
    }

    public static Modifier A0G(Modifier modifier) {
        return C287195Zj.A07(modifier, 12.0f);
    }

    public static AnonymousClass5RD A0K(C287295Zu r2, C286575Wy r3) {
        return C287395a4.A02(r2, r3, C287215Zl.A05, 6);
    }

    public static AnonymousClass5RD A0L(C287325Zx r2, C286575Wy r3) {
        return C291495hO.A02(r2, r3, C287215Zl.A02, 6);
    }

    public static AnonymousClass5RD A0M(C286575Wy r2) {
        return C291495hO.A01(C287275Zs.A02, r2, C287215Zl.A00);
    }

    public static AnonymousClass5RD A0N(C286575Wy r2) {
        return C291495hO.A01(C287275Zs.A02, r2, C287215Zl.A00);
    }

    public static AnonymousClass2WA A0R(Object obj) {
        AnonymousClass2WA r1 = (AnonymousClass2WA) obj;
        0qQ.A0B(r1, 0);
        return r1;
    }

    public static C53030GhL A0Y(H0G h0g) {
        return (C53030GhL) h0g.A06.getValue();
    }

    public static INA A0a(C54153H0x h0x) {
        return (INA) h0x.A01.getValue();
    }

    public static C53029GhK A0c(C54149H0t h0t) {
        return (C53029GhK) h0t.A03.getValue();
    }

    public static C52259GLa A0d(C52259GLa gLa, GLR glr) {
        if (gLa == null) {
            return null;
        }
        glr.A0E.getValue();
        long uptimeMillis = SystemClock.uptimeMillis();
        boolean z = gLa.A04;
        boolean z2 = gLa.A06;
        return new C52259GLa(gLa.A02, gLa.A03, gLa.A00 + 1, uptimeMillis, z, z2);
    }

    public static IllegalStateException A0e() {
        return new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
    }

    public static String A0j(String str, int i) {
        return 002.A0I(str, ')', i);
    }

    public static String A0k(String str, String str2) {
        return 002.A0S(str, str2, ')');
    }

    public static C58141In7 A0o(C286575Wy r1, Object obj, int i) {
        C58141In7 in7 = new C58141In7(obj, i);
        r1.FLL(in7);
        return in7;
    }

    public static MIW A0p(C286575Wy r1, Object obj, int i) {
        MIW miw = new MIW(obj, i);
        r1.FLL(miw);
        return miw;
    }

    public static C66308MMr A0q(C286575Wy r1, Object obj, int i) {
        C66308MMr mMr = new C66308MMr(obj, i);
        r1.FLL(mMr);
        return mMr;
    }

    public static MMA A0r(C286575Wy r1, Object obj, int i) {
        MMA mma = new MMA(obj, i);
        r1.FLL(mma);
        return mma;
    }

    public static C51794G2d A0s(C286575Wy r1, Object obj, int i) {
        C51794G2d g2d = new C51794G2d(obj, i);
        r1.FLL(g2d);
        return g2d;
    }

    public static MP9 A0t(C286575Wy r1, Object obj, int i) {
        MP9 mp9 = new MP9(obj, i);
        r1.FLL(mp9);
        return mp9;
    }

    public static MMV A0u(C286575Wy r1, Object obj, Object obj2, int i) {
        MMV mmv = new MMV(i, obj, obj2);
        r1.FLL(mmv);
        return mmv;
    }

    public static MMZ A0v(C286575Wy r1, Object obj, Object obj2, int i) {
        MMZ mmz = new MMZ(i, obj, obj2);
        r1.FLL(mmz);
        return mmz;
    }

    public static void A16(C284945Oz r1, long j) {
        r1.Epw(new C285965Tk(j));
    }

    public static void A17(0Aj r2) {
        r2.AAJ("canonical_nav_chain", AnonymousClass1K6.A00);
        r2.AAJ("device_aspect_ratio_category", C254473sX.A00);
        r2.AAJ("device_fold_orientation", C254483sY.A00);
        r2.AAJ("device_fold_state", C254493sZ.A00);
        r2.A7p("device_is_in_multi_window_mode", C254503sa.A00);
        r2.Cgf();
    }

    public static void A1A(0Aj r2, Long l, String str) {
        r2.AAJ("event_type", str);
        r2.AAJ("benefit_type", "BIZ_LINKS_IN_REELS");
        r2.AAJ("subject_type", "viewer");
        r2.AAJ("object_type", "pill");
        r2.A9F("pbs_owner_id", l);
        r2.AAJ("surface", "ig_reels_consumption");
        r2.Cgf();
    }

    public static void A1B(0Aj r2, Long l, List list) {
        r2.A9F("media_ig_id", l);
        r2.AAJ("signal", ((CreatorViewerSignalModel) 00k.A0I(list)).BwM().toString());
        r2.AAJ("signal_text_enum", ((CreatorViewerSignalModel) 00k.A0I(list)).getTitle());
    }

    public static void A1D(0Aj r5, String str, String str2) {
        r5.A9F("fundraiser_id", 00y.A0n(10, str));
        r5.A9F("source_owner_id", 00y.A0n(10, str2));
        r5.AAJ("source_name", "FEED_POST");
        r5.A9H("attributes", (Map) null);
        r5.Cgf();
    }

    public static void A1E(1Ln r3, AnonymousClass0iw r4, 1Xj r5, String str) {
        r3.A0R("legacy_event_name", str);
        r3.A0M(V1Z.CTA_BAR, "analytics_component");
        r3.A0R("legacy_referral_surface", r4.getModuleName());
        r3.A0R("legacy_ui_component", "shopping_reels_cta");
        r3.A0m(r5.getId());
    }

    public static void A1J(AnonymousClass0iw r3, UserSession userSession, 1Xj r5, String str) {
        List B02;
        EffectPreviewIntf effectPreviewIntf;
        String effectId;
        CreativeConfigIntf AsO = r5.A0C.AsO();
        if (AsO != null && (B02 = AsO.B02()) != null && (effectPreviewIntf = (EffectPreviewIntf) 00k.A0J(B02)) != null && (effectId = effectPreviewIntf.getEffectId()) != null) {
            GGQ.A00(userSession).A00(userSession, str, effectId, r3.getModuleName());
        }
    }

    public static void A1K(1Ng r1, JMI jmi, String str) {
        r1.A00(new C64675Lg1(jmi, str));
    }

    public static void A1L(0lg r3, AnonymousClass3ZL r4) {
        C323506xb r32 = (C323506xb) r3.A01(C323506xb.class, new C20695WxR(r3, 20));
        r32.A02.put(r4.BHy(), Long.valueOf(System.currentTimeMillis()));
        r32.A02(r4);
    }

    public static void A1O(AnonymousClass6Z5 r0) {
        r0.A17.EHd();
    }

    public static boolean A1a(Object obj) {
        ((Number) obj).intValue();
        return 0fL.A02();
    }

    public static boolean A1b(Object obj) {
        return !((List) obj).isEmpty();
    }

    public static int A00(float f) {
        return Float.floatToIntBits(f) * 31;
    }

    public static int A01(int i) {
        return (i + C54732HQn.A00()) * 31;
    }

    public static long A05(C286575Wy r1) {
        return AnonymousClass5aQ.A00(r1).A0p;
    }

    public static long A06(C284945Oz r1) {
        return ((C289005cr) r1.getValue()).A00;
    }

    public static long A07(JSK jsk, Integer num) {
        return Double.doubleToRawLongBits((double) jsk.EIZ(num));
    }

    public static Modifier A0H(Modifier modifier) {
        return AnonymousClass6FZ.A01(modifier, AnonymousClass5ZN.A00());
    }

    public static C268084cj A0J(List list, int i) {
        return (C268084cj) list.get(i);
    }

    public static C53389GnL A0P(05G r0) {
        return (C53389GnL) r0.getValue();
    }

    public static C53378Gn8 A0Q(C270284gU r0) {
        return (C53378Gn8) r0.getValue();
    }

    public static 2WL A0S(View view, long j) {
        view.measure(C245063cG.A01(j), C245063cG.A00(j));
        return new 2WL(C245133cN.A00(Math.max(C245073cH.A03(j), view.getMeasuredWidth()), Math.max(C245073cH.A02(j), view.getMeasuredHeight())), (Object) null);
    }

    public static NotesPogThoughtBubbleUiState A0W(AnonymousClass0eM r0) {
        return ((ContentNotesImmersiveSelfNoteContent) r0.getValue()).A01;
    }

    public static C53395GnS A0X(05G r0) {
        return (C53395GnS) r0.getValue();
    }

    public static C53039GhV A0Z(AnonymousClass0eM r0) {
        return (C53039GhV) r0.getValue();
    }

    public static Object A0f(C286575Wy r0, int i) {
        r0.ExT(i);
        return r0.ECw();
    }

    public static Object A0g(C286575Wy r0, AnonymousClass0Ud r1, int i) {
        return AnonymousClass6FW.A02(r0, r1, i).getValue();
    }

    public static String A0h(C286575Wy r1, Object obj, int i) {
        return C304346Dc.A01(r1, new Object[]{obj}, i);
    }

    public static String A0i(C53985GxT gxT, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(gxT.A04);
        sb.append(", midcardType: ");
        sb.append(gxT.A05);
        sb.append(", videoIndex: ");
        sb.append(gxT.A01);
        return sb.toString();
    }

    public static List A0m(0Aj r4, 0bb r5, C46275DTe dTe, Long l) {
        r5.A06("signal", dTe.BHh().toString());
        r5.A06("signal_text_enum", dTe.getText());
        List singletonList = Collections.singletonList(r5);
        0qQ.A07(singletonList);
        r4.A9F("media_ig_id", l);
        r4.AAJ("signal", dTe.BHh().toString());
        r4.AAJ("signal_text_enum", dTe.getText());
        return singletonList;
    }

    public static 1HR A0w() {
        return new 1HR(Integer.MAX_VALUE);
    }

    public static void A0x(int i, List list) {
        list.add(Integer.valueOf(i));
    }

    public static void A0y(long j, StringBuilder sb) {
        sb.append(j);
        sb.append(", clickMediaId=");
    }

    public static void A0z(long j, StringBuilder sb) {
        sb.append(C289295dM.A08(j));
    }

    public static void A10(Canvas canvas, C62320sa r1) {
        canvas.save();
        r1.invoke();
        canvas.restore();
    }

    public static void A11(Typeface typeface, AnonymousClass3Y5 r1, C244103ae r2, long j) {
        r2.A0S(typeface);
        r2.A0F();
        r2.A0K((float) 2Wd.A00(r1.Bnf(), j));
        r2.A0I((float) 2Wd.A00(r1.Bnf(), j));
        r2.A0J((float) 2Wd.A00(r1.Bnf(), j));
        r2.A0H((float) 2Wd.A00(r1.Bnf(), j));
    }

    public static void A12(Typeface typeface, 2Wb r1, C244103ae r2, long j) {
        r2.A0S(typeface);
        r2.A0F();
        r2.A0K((float) 2Wd.A00(r1.Bnf(), j));
        r2.A0I((float) 2Wd.A00(r1.Bnf(), j));
        r2.A0J((float) 2Wd.A00(r1.Bnf(), j));
        r2.A0H((float) 2Wd.A00(r1.Bnf(), j));
    }

    public static void A13(Typeface typeface, C244103ae r1, AnonymousClass2V4 r2, long j) {
        r1.A0S(typeface);
        r1.A0F();
        r1.A0K((float) 2Wd.A00(r2, j));
        r1.A0I((float) 2Wd.A00(r2, j));
        r1.A0J((float) 2Wd.A00(r2, j));
        r1.A0H((float) 2Wd.A00(r2, j));
        r1.A0B();
    }

    public static void A15(C286575Wy r1, Modifier modifier, float f) {
        C289585dr.A00(r1, C287205Zk.A08(modifier, f));
    }

    public static void A18(0Aj r2, UserSession userSession, 1Xj r4) {
        r2.AAJ("follow_status", C294185m0.A06(userSession, r4));
        r2.A9F("ad_id", C294185m0.A01(userSession, r4));
        r2.A9F("a_pk", Long.valueOf(C294185m0.A00(userSession, r4)));
        r2.A9F("m_ts", Long.valueOf(r4.A1A()));
        r2.A9F("top_liker_count", C294185m0.A02(userSession, r4));
    }

    public static void A1C(0Aj r1, String str) {
        r1.AAJ(MYP.A00(), str);
    }

    public static void A1G(C244103ae r1, AnonymousClass2V4 r2, Integer num, long j) {
        r1.A0F();
        r1.A0K((float) 2Wd.A00(r2, j));
        r1.A0I((float) 2Wd.A00(r2, j));
        r1.A0J((float) 2Wd.A00(r2, j));
        r1.A0H((float) 2Wd.A00(r2, j));
        r1.A0W(num);
        r1.A0C();
        r1.A0X(num);
        r1.A0G();
    }

    public static void A1H(0Tu r4, 0lg r5, String str) {
        if (182.A06(r4, r5, 36317925627401873L)) {
            0f9 AEf = 0wj.A01.AEf("AD_REELS_BRS_ERROR", 817903741);
            AEf.ABQ(DialogModule.KEY_MESSAGE, 002.A0g("Received ", str, " brs severity map on brs test user"));
            AEf.report();
        }
    }

    public static void A1I(1Fa r1, String str, String str2, String str3) {
        r1.A9m(str, str2);
        r1.A0G("max_id", str3);
    }

    public static void A1M(UserSession userSession, C254523sc r2) {
        if (C228342lQ.A02(userSession)) {
            r2.A4X = C228342lQ.A01(1Au.A00(userSession)).toString();
            r2.A4Y = C228342lQ.A00(userSession).toString();
        }
    }

    public static void A1N(C254523sc r2, C233202vF r3, C251373n0 r4, 1PW r5) {
        r2.A2r = r4.Bxj();
        r2.A3G = Long.valueOf((long) r5.A02);
        r2.A2q = Integer.valueOf(AnonymousClass0xl.A00(C61170le.A00).A00());
        r2.A2u = Integer.valueOf(AnonymousClass1GD.A03() ? 1 : 0);
        r2.A4M = r3.A00;
    }

    public static void A1P(StringBuilder sb, Object obj) {
        sb.append(obj);
        sb.append(", mediaIds=");
    }

    public static void A1Q(StringBuilder sb, Object obj) {
        sb.append(obj);
        sb.append(", clickTimestamp=");
    }

    public static void A1R(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(", itemId=");
    }

    public static void A1S(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(", authorId=");
    }

    public static void A1T(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(", imageUrl=");
    }

    public static void A1U(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(", itemType=");
    }

    public static void A1V(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(", trackingToken=");
    }

    public static void A1W(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(", inventorySource=");
    }

    public static void A1X(StringBuilder sb, String str) {
        sb.append(str);
        sb.append((Object) null);
    }

    public static void A1Y(AnonymousClass0eM r0) {
        AnonymousClass0fN.A00((Dialog) r0.getValue());
    }

    public static void A1Z(Object[] objArr, int i, int i2) {
        objArr[i2] = Integer.valueOf(i);
    }
}

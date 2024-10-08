package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.MediaControlEventSourceEnum;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.BitSet;
import java.util.LinkedHashMap;
import java.util.Map;

public final class GJT {
    public JR4 A00;
    public boolean A01;
    public boolean A02;
    public final Handler A03 = AnonymousClass7TF.A0D();
    public final UserSession A04;
    public final Map A05 = AnonymousClass7TE.A1H();

    public GJT(JR4 jr4, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A04 = userSession;
        this.A00 = jr4;
    }

    public static final C55983Hqo A00(Context context, GJT gjt, AnonymousClass3OA r11, Integer num) {
        String str;
        String str2 = null;
        C55983Hqo hqo = new C55983Hqo(context);
        long parseLong = Long.parseLong(gjt.A04.A06);
        Map map = hqo.A04;
        map.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, Long.valueOf(parseLong));
        BitSet bitSet = hqo.A01;
        bitSet.set(2);
        map.put(AnonymousClass000.A00(4130), "dwell_reels_see_more_less");
        bitSet.set(1);
        map.put("cti_component", "AfiSeeMoreLessFollowup");
        bitSet.set(0);
        map.put("ad_id", DbV.A0q(r11.A0S));
        0eP A1L = AnonymousClass7TE.A1L("afi_id", gjt.A00.AaG());
        0eP A1L2 = AnonymousClass7TE.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "dwell_reels_see_more_less");
        0eP A1L3 = AnonymousClass7TE.A1L("global_position", String.valueOf(r11.A0P));
        0eP A1L4 = AnonymousClass7TE.A1L("ad_tracking_token", r11.A0j);
        C250183l2 r0 = r11.A03;
        if (r0 != null) {
            str2 = r0.Aa8();
        }
        0eP A1L5 = AnonymousClass7TE.A1L("ads_category", str2);
        0eP A1L6 = AnonymousClass7TE.A1L("trigger_source", "ad_dwell");
        if (num.intValue() != 0) {
            str = "see_less";
        } else {
            str = "see_more";
        }
        LinkedHashMap A06 = 0Yt.A06(new 0eP[]{A1L, A1L2, A1L3, A1L4, A1L5, A1L6, AnonymousClass7TE.A1L("answer", str)});
        if (!A06.isEmpty()) {
            map.put("extra_data", A06);
        }
        return hqo;
    }

    public static final void A01(Context context, GJT gjt, MediaControlEventSourceEnum mediaControlEventSourceEnum, AnonymousClass3W1 r14, AnonymousClass3OA r15, C55792HnR hnR, Integer num, String str, String str2) {
        String str3;
        if (false != r14.A2A) {
            r14.A2A = false;
            AnonymousClass3W1.A00(r14, 49);
        }
        GJT gjt2 = gjt;
        UserSession userSession = gjt.A04;
        Context context2 = context;
        Integer num2 = num;
        if (182.A06(0Tu.A05, userSession, 36319549125172702L)) {
            C55983Hqo A002 = A00(context2, gjt, r15, num2);
            IgBloksScreenConfig A0N = DbS.A0N(userSession);
            A0N.A0R = "com.bloks.www.bloks.ig_contextual_tray_infra_controller.bottom_sheet";
            if (A002.A01.nextClearBit(0) >= 3) {
                C46649DiU A06 = C46649DiU.A06("com.bloks.www.bloks.ig_contextual_tray_infra_controller.bottom_sheet", C359608dC.A01(A002.A04), A002.A03);
                A06.A00 = 719983200;
                A06.A05 = null;
                A06.A01 = 0;
                A06.A06 = null;
                A06.A03 = null;
                A06.A02 = null;
                A06.A04 = null;
                A06.A0H(A002.A02);
                A06.A0E(A002.A00, A0N);
            } else {
                throw DbU.A0i();
            }
        } else {
            1xC r2 = 1xC.A01;
            C310336ap A0a = DbS.A0a();
            A0a.A01 = Dc5.A00();
            A0a.A0D = str;
            A0a.A02();
            A0a.A0L = true;
            A0a.A0R = true;
            DbW.A0q(context2, A0a, 2131975851);
            A0a.A0A(new C57277IVm(0, context2, hnR, mediaControlEventSourceEnum, gjt2, num2));
            Drawable A022 = C14091Tpi.A02(context2, str2);
            if (A022 != null) {
                C51975G9x.A0y(context2, A022, A0a);
                DbY.A1K(r2, A0a);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        JR4 jr4 = gjt.A00;
        if (num2.intValue() != 0) {
            str3 = "see_less";
        } else {
            str3 = "see_more";
        }
        jr4.Ck7(str3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r1 != null) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r10 == null) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r10 = "circle_check_pano_outline_24";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        A01(r2, r11, r13, r14, r6, r16, X.AnonymousClass05K.A01, r9, r10);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(android.content.Context r12, com.instagram.api.schemas.MediaControlEventSourceEnum r13, X.AnonymousClass3W1 r14, X.AnonymousClass3OA r15, X.C55792HnR r16) {
        /*
            r11 = this;
            r6 = r15
            X.3y6 r1 = r15.A0E
            r2 = r12
            if (r1 == 0) goto L_0x000c
            java.lang.String r9 = r1.BVh()
            if (r9 != 0) goto L_0x0015
        L_0x000c:
            r0 = 2131972994(0x7f135382, float:1.9583011E38)
            java.lang.String r9 = X.AnonymousClass7TE.A16(r12, r0)
            if (r1 == 0) goto L_0x001b
        L_0x0015:
            java.lang.String r10 = r1.BVg()
            if (r10 != 0) goto L_0x001d
        L_0x001b:
            java.lang.String r10 = "circle_check_pano_outline_24"
        L_0x001d:
            java.lang.Integer r8 = X.AnonymousClass05K.A01
            r3 = r11
            r4 = r13
            r5 = r14
            r7 = r16
            A01(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GJT.A02(android.content.Context, com.instagram.api.schemas.MediaControlEventSourceEnum, X.3W1, X.3OA, X.HnR):void");
    }

    public final boolean A03(C267324bN r5) {
        C250183l2 r0;
        UserSession userSession = this.A04;
        if (r5 != null && GDZ.A00(r5) && (r0 = r5.A06().A03) != null && AnonymousClass7TF.A1Y(r0.CaW(), true) && new GBX().A00(r5)) {
            0Tu r2 = 0Tu.A05;
            if ((182.A06(r2, userSession, 36319549125107165L) || 182.A06(r2, userSession, 36319549125041628L)) && !this.A02 && !182.A06(r2, userSession, 36322358033918055L)) {
                return true;
            }
        }
        return false;
    }
}

package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;

public abstract class LPW {
    public static final CharSequence A00(Context context, C60951Ju9 ju9) {
        Resources resources;
        int i;
        CharSequence A0T;
        int ordinal = ju9.A01.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                resources = context.getResources();
                i = 2131971855;
            } else if (ordinal == 3) {
                resources = context.getResources();
                i = 2131971856;
            } else if (ordinal == 4) {
                resources = context.getResources();
                i = 2131971857;
            } else if (ordinal != 5) {
                A0T = "";
            } else {
                resources = context.getResources();
                i = 2131971858;
            }
            A0T = JTR.A0T(resources, ju9.A04, i);
        } else {
            resources = context.getResources();
            i = 2131971859;
            A0T = JTR.A0T(resources, ju9.A04, i);
        }
        return A0T;
    }

    public static final void A01(Context context, UserSession userSession, Integer num, Integer num2, Integer num3, String str, boolean z, boolean z2) {
        String str2;
        String str3;
        String str4;
        String str5;
        0qQ.A0B(userSession, 1);
        String str6 = null;
        Integer num4 = null;
        if (AnonymousClass0eD.A01(userSession) == 16V.A06) {
            num4 = num3;
        }
        Integer num5 = AnonymousClass05K.A01;
        if (num2 == num5) {
            str2 = "ccp";
        } else {
            str2 = "xar";
        }
        if (num4 != null) {
            str6 = C378169Ot.A00(num4);
        }
        if (!00k.A0u(0sr.A1P(new String[]{"CAL", "BPL"}), str6)) {
            str6 = null;
        }
        0eP A1L = AnonymousClass7TE.A1L("share_type", str2);
        if (str == null) {
            str = "";
        }
        0eP A1L2 = AnonymousClass7TE.A1L("camera_id", str);
        if (z) {
            str3 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str3 = "0";
        }
        0eP A1L3 = AnonymousClass7TE.A1L("is_clientside_on", str3);
        if (z2) {
            str4 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str4 = "0";
        }
        0eP A1L4 = AnonymousClass7TE.A1L("is_panavision", str4);
        if (num.intValue() != 0) {
            str5 = "v2";
        } else {
            str5 = "v1";
        }
        C46649DiU A04 = C46649DiU.A04("com.instagram.family_sharing.reels_ccp_xar_setting.ReelsCCPXARSetting", 0Yt.A02(new 0eP[]{A1L, A1L2, A1L3, A1L4, AnonymousClass7TE.A1L(C273654mx.A00(2241), str5), AnonymousClass7TE.A1L("linkage_destination_type_string", str6)}));
        IgBloksScreenConfig A0N = DbS.A0N(userSession);
        int i = 2131955688;
        if (num2 == num5) {
            i = 2131971820;
        }
        A0N.A0U = context.getString(i);
        A04.A0D(context, A0N);
    }

    public static final void A02(JZY jzy, UserSession userSession, boolean z) {
        0bb r2 = new 0bb();
        r2.A03("is_xpost_enabled", Boolean.valueOf(z));
        JZX.A00(jzy, JZZ.REELS, AnonymousClass818.IG_REELS_COMPOSER, r2, userSession);
    }
}

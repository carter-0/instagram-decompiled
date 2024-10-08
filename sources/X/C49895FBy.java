package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.FBy  reason: case insensitive filesystem */
public abstract class C49895FBy {
    public static boolean A02(Context context, AnonymousClass0iw r9, UserSession userSession, String str, String str2, String str3) {
        String str4;
        String str5 = str;
        if (str == null) {
            str4 = "Effect ID is not set";
        } else if (1X9.A00 != null) {
            1X9 A00 = AnonymousClass38W.A00();
            Context context2 = context;
            UserSession userSession2 = userSession;
            if (A00.A02(context, userSession)) {
                11Z.A04(new C73406Pc3(context2, r9, userSession2, A00, str5, str2, str3), 500);
                return true;
            }
            return false;
        } else {
            str4 = "RtcPlugin is not available";
        }
        0kD.A01("ArEffectOpener", str4);
        return false;
    }

    public static void A00(Context context, AnonymousClass0iw r2, UserSession userSession, String str, String str2, String str3) {
        if (!A02(context, r2, userSession, str, str2, str3)) {
            C358248ab A0Y = DbS.A0Y(context);
            Dba.A1M(A0Y);
            DbT.A19(context, A0Y, 2131974173);
            DbU.A17(context, A0Y, 2131974172);
            A0Y.A0J((DialogInterface.OnClickListener) null, 2131968772);
            DbT.A1V(A0Y);
        }
    }

    public static void A01(FragmentActivity fragmentActivity, String str, String str2, String str3, String str4) {
        Intent A01 = AnonymousClass14B.A00().A01(fragmentActivity);
        Uri.Builder A07 = DbW.A07("instagram://story-camera");
        if (str != null) {
            A07.appendQueryParameter("entrypoint", str);
        }
        if (str2 != null) {
            A07.appendQueryParameter("effect_id", str2);
        }
        if (str3 != null) {
            A07.appendQueryParameter("test_link_crypto_hash", str3);
        }
        if (str4 != null) {
            A07.appendQueryParameter("test_link_revision_id", str4);
        }
        Dba.A0o(fragmentActivity, A01, A07);
    }
}

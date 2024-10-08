package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.iabadscontext.IABAdsContext;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.Sla  reason: case insensitive filesystem */
public final class C12048Sla implements C13922TlQ, B3K {
    public static C12048Sla A0A;
    public String A00;
    public final Intent A01;
    public final Bundle A02;
    public final S14 A03;
    public final C340027ka A04;
    public final C340037kb A05;
    public final 0bY A06 = new C50186FSs(0);
    public final S34 A07;
    public final S3I A08;
    public final boolean A09;

    public final void AQ3(QLA qla, String str, boolean z) {
    }

    public final void DW1(QLA qla, String str) {
    }

    public final void DWB(String str) {
    }

    public final boolean EsV(QLA qla, Boolean bool, Boolean bool2, String str) {
        String str2;
        SPF spf = SPF.A06;
        if (spf != null && spf.A03()) {
            Boolean bool3 = true;
            if (bool3.equals(bool) && !spf.A04(str)) {
                if (this.A09) {
                    if (!00p.A0k(str, "https://www.facebook.com/oauth_account_linking_mobile/login_redirect", false) && !00p.A0k(str, "https://facebook.com/oauth_account_linking_mobile/login_redirect", false) && !00p.A0k(str, "https://m.facebook.com/oauth_account_linking_mobile/login_redirect", false) && !00p.A0k(str, 002.A0R(C10065Rm2.A01, "oauth_account_linking/?state="), false) && !00p.A0k(str, "instagram://oauth_account_linking/?state=", false) && !00p.A0k(str, "https://www.instagram.com/oauth_account_linking_mobile/login_redirect", false)) {
                        str2 = "https://instagram.com/oauth_account_linking_mobile/login_redirect";
                    }
                } else if (!00p.A0k(str, "instagram://bwp_login/?state=", false) && !00p.A0k(str, 002.A0R(C10065Rm2.A01, "bwp_login/?state="), false) && !00p.A0k(str, "https://facebook.com/amazon_bwp/login_redirect/", false)) {
                    str2 = "https://m.facebook.com/amazon_bwp/login_redirect/";
                }
                if (!str.startsWith(str2)) {
                    SQO.A02("IGBwPUserEventHandler", "Request not from allowed BwP domain", new Object[0]);
                    return true;
                }
            }
        }
        return false;
    }

    public final void Esf(QLA qla, Boolean bool, Boolean bool2, String str) {
    }

    public final void destroy() {
        Intent intent = this.A01;
        0qQ.A0B(intent, 0);
        if (intent.getBooleanExtra("IS_ERASE_API_KEY_1P_ENABLED", false)) {
            SPF spf = SPF.A06;
            FragmentActivity activity = this.A04.getActivity();
            if (activity != null && spf != null) {
                S8E.A01(activity.getApplicationContext(), spf, true);
            }
        }
    }

    public C12048Sla(Context context, Intent intent, C340027ka r13, C340037kb r14) {
        String str;
        Intent intent2;
        Bundle extras;
        String str2;
        A0A = this;
        this.A04 = r13;
        this.A05 = r14;
        this.A03 = new S14(context, r13);
        Intent intent3 = intent;
        this.A01 = intent;
        IABAdsContext iABAdsContext = (IABAdsContext) intent.getParcelableExtra("EXTRA_ADS_CONTEXT");
        if (iABAdsContext != null) {
            str = iABAdsContext.A09;
        } else {
            str = null;
        }
        String stringExtra = intent.getStringExtra("BrowserLiteIntent.IABLoggingExtras.IAB_SESSION_ID");
        String stringExtra2 = intent.getStringExtra("BWP_MEDIA_ID");
        Bundle A0a = AnonymousClass7TE.A0a();
        if (str != null) {
            A0a.putString("ad_id", str);
        }
        if (stringExtra != null) {
            A0a.putString("iab_session_id", stringExtra);
        }
        if (stringExtra2 != null) {
            A0a.putString("media_id", stringExtra2);
        }
        SPF spf = SPF.A06;
        if (spf != null) {
            C10533Rtm rtm = spf.A03;
            A0a.putLong("expiry_time", rtm.A00);
            A0a.putString("token_source", RUC.A00(rtm.A01));
        }
        A0a.putString("source", "JS_BRIDGE");
        SPF spf2 = SPF.A06;
        if (spf2 != null) {
            A0a.putBoolean("is_organic", spf2.A02);
            if (spf2.A02) {
                str2 = C273654mx.A00(868);
            } else {
                str2 = "ad";
            }
            A0a.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
        }
        this.A02 = A0a;
        FragmentActivity activity = r13.getActivity();
        activity.getClass();
        this.A07 = new S34(intent, A0a, new C11536Sbx(this, 1), activity);
        FragmentActivity activity2 = r13.getActivity();
        if (activity2 == null || (intent2 = activity2.getIntent()) == null || (extras = intent2.getExtras()) == null) {
            throw AnonymousClass7TE.A0y();
        }
        this.A09 = 182.A06(0Tu.A05, DbS.A0U(extras), 36330338083160646L);
        FragmentActivity activity3 = r13.getActivity();
        activity3.getClass();
        this.A08 = new S3I(intent3, A0a, new C11536Sbx(this, 1), activity3, "1187819425717021");
    }

    public final void DDj(Context context, Intent intent, View view, C340027ka r5, C13847TiP tiP, C340037kb r7) {
        C51974G9v.A1K(context, intent, r5);
        0qQ.A0B(r7, 4);
        if (A0A == null) {
            A0A = new C12048Sla(context, intent, r5, r7);
        }
    }
}

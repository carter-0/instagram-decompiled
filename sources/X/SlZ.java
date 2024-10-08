package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.facebook.browser.lite.webview.SystemWebView;
import com.facebook.iabadscontext.IABAdsContext;
import com.instagram.android.R;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.HashMap;
import java.util.Locale;

public abstract class SlZ implements C13922TlQ {
    public S3I A00;
    public String A01;
    public final Intent A02;
    public final Bundle A03;
    public final C340027ka A04;
    public final C340037kb A05;

    public final void A02(Integer num) {
        RDD rdd;
        int i;
        C310346aq r0;
        String str;
        C10378RrF rrF = ((QKR) this).A00;
        int intValue = num.intValue();
        if (intValue == 0) {
            rdd = RDD.A04;
        } else if (intValue != 1) {
            rdd = RDD.A03;
        } else {
            rdd = RDD.A02;
        }
        AnonymousClass3M8 r4 = rrF.A01;
        C310336ap r3 = new C310336ap();
        Context context = rrF.A00;
        boolean z = rdd instanceof QKU;
        if (z) {
            i = R.string.f0nameremoved;
        } else if (rdd instanceof QKT) {
            i = R.string.f0nameremoved;
        } else {
            i = R.string.f0nameremoved;
        }
        r3.A0D = context.getString(i);
        if (z) {
            r0 = ((QKU) rdd).A00;
        } else if (rdd instanceof QKT) {
            r0 = ((QKT) rdd).A00;
        } else {
            r0 = ((QKS) rdd).A00;
        }
        r3.A0C(r0);
        if (z) {
            str = "bwi_consent_denial";
        } else if (rdd instanceof QKT) {
            str = "bwi_auth_flow_success";
        } else {
            str = "bwi_auth_flow_error";
        }
        r3.A0H = str;
        r4.A0A(r3.A00());
    }

    public final void AQ3(QLA qla, String str, boolean z) {
    }

    public final void DW1(QLA qla, String str) {
    }

    public final void DWB(String str) {
    }

    public final boolean EsV(QLA qla, Boolean bool, Boolean bool2, String str) {
        return false;
    }

    public final void Esf(QLA qla, Boolean bool, Boolean bool2, String str) {
    }

    public final void destroy() {
    }

    public static final void A00(SlZ slZ, String str, String str2, String str3) {
        long j;
        Bundle bundle = slZ.A03;
        String string = bundle.getString("ad_id");
        if (string != null) {
            j = Long.parseLong(string);
        } else {
            j = 0;
        }
        String string2 = bundle.getString("iab_session_id");
        String str4 = "";
        if (string2 == null) {
            string2 = str4;
        }
        HashMap A1E = AnonymousClass7TE.A1E();
        if (str2.length() > 0) {
            A1E.put("pageLoadSource", str2);
        }
        if (str3.length() > 0) {
            A1E.put("pageCloseReason", str3);
        }
        String string3 = bundle.getString("token_source");
        if (string3 != null) {
            str4 = string3;
        }
        A1E.put("tokenSource", str4);
        SRY.A00().A03(j, str, string2, A1E);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.QcV, android.webkit.WebView] */
    public final void A01() {
        String str;
        SHI shi = SHI.A04;
        if (shi != null) {
            String str2 = SHI.A05;
            if (str2 == null || str2.length() == 0) {
                str2 = String.valueOf(shi.A01.A06);
            }
            QLA C8U = this.A04.C8U();
            if (C8U != null && str2 != null && str2.length() != 0) {
                ((SystemWebView) C8U).A04.loadUrl(str2);
                String str3 = this.A01;
                if (str3 == null) {
                    0qQ.A0F("pageReloadReason");
                    throw AnonymousClass00P.createAndThrow();
                }
                if ("new_access_token".equals(str3)) {
                    str = "PAGE_LOAD_AFTER_AUTH_SUCCESS";
                } else {
                    str = "PAGE_LOAD_AFTER_TOKEN_REFRESH";
                }
                A00(this, "PAGE_LOADED", str, "");
            }
        }
    }

    public SlZ(Intent intent, C340027ka r7, C340037kb r8) {
        String str;
        this.A04 = r7;
        this.A05 = r8;
        this.A02 = intent;
        IABAdsContext iABAdsContext = (IABAdsContext) intent.getParcelableExtra("EXTRA_ADS_CONTEXT");
        if (iABAdsContext != null) {
            str = iABAdsContext.A09;
        } else {
            str = null;
        }
        String stringExtra = intent.getStringExtra("BrowserLiteIntent.IABLoggingExtras.IAB_SESSION_ID");
        Bundle A0a = AnonymousClass7TE.A0a();
        if (str != null) {
            A0a.putString("ad_id", str);
        }
        if (stringExtra != null) {
            A0a.putString("iab_session_id", stringExtra);
            A0a.putString("app_session_id", stringExtra);
        }
        A0a.putString("source", "JS_BRIDGE");
        A0a.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, DbT.A12(Locale.ROOT, "AD"));
        SHI shi = SHI.A04;
        if (shi != null) {
            C10532Rtl rtl = shi.A02;
            A0a.putLong("expiry_time", rtl.A00);
            A0a.putString("token_source", RU9.A00(rtl.A01));
        }
        this.A03 = A0a;
    }

    public final void DDj(Context context, Intent intent, View view, C340027ka r5, C13847TiP tiP, C340037kb r7) {
        C51974G9v.A1K(context, intent, r5);
        0qQ.A0B(r7, 4);
        if (QKR.A01 == null) {
            QKR.A01 = new QKR(context, intent, r5, r7);
        }
    }
}

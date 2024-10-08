package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.fragment.app.FragmentActivity;

public final class ERI extends R8R implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "FundraiserDonationWebViewFragment";
    public WebView A00;

    public final boolean onBackPressed() {
        WebView webView = this.A00;
        if (webView != null) {
            if (webView.getUrl() != null) {
                Uri A03 = 0cp.A03(this.A00.getUrl());
                String host = A03.getHost();
                String path = A03.getPath();
                String queryParameter = A03.getQueryParameter("currentStep");
                if (host != null && path != null && queryParameter != null && host.equals("www.instagram.com") && path.equals("/donate/checkout/") && queryParameter.equals("confirmation")) {
                    A00(false);
                } else if (!super.onBackPressed()) {
                    FragmentActivity requireActivity = requireActivity();
                    Intent A09 = DbS.A09();
                    A09.putExtra(AnonymousClass000.A00(428), "DONATION_INCOMPLETE");
                    Dba.A0k(requireActivity, A09);
                    return true;
                }
            }
            return true;
        }
        throw AnonymousClass7TE.A0z("WebView not yet initialized");
    }

    private void A00(boolean z) {
        FragmentActivity requireActivity = requireActivity();
        if (z) {
            AnonymousClass0wW r2 = this.A03;
            r2.getClass();
            DbY.A0u(requireActivity, AnonymousClass7TE.A0a(), r2, "fbpay_hub");
        }
        Intent A09 = DbS.A09();
        A09.putExtra(AnonymousClass000.A00(428), AnonymousClass000.A00(2194));
        A09.putExtra(AnonymousClass000.A00(2317), z);
        Dba.A0k(requireActivity, A09);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0094, code lost:
        if (r2.equals("cancel") != false) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(android.net.Uri r8, android.webkit.WebView r9) {
        /*
            r7 = this;
            java.lang.String r3 = r8.getScheme()
            java.lang.String r5 = r8.getHost()
            java.lang.String r0 = "event"
            java.lang.String r2 = r8.getQueryParameter(r0)
            java.lang.String r0 = "currentStep"
            java.lang.String r1 = r8.getQueryParameter(r0)
            if (r3 == 0) goto L_0x0097
            if (r5 == 0) goto L_0x0097
            java.lang.String r0 = "instagram"
            boolean r6 = r3.equals(r0)
            r4 = 1
            if (r6 == 0) goto L_0x002d
            java.lang.String r0 = "fbpay_hub"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x002d
            r7.A00(r4)
            return r4
        L_0x002d:
            r3 = 0
            if (r1 == 0) goto L_0x0042
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "confirmation"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0042
        L_0x003e:
            r7.A00(r3)
            return r4
        L_0x0042:
            java.lang.String r0 = "www.instagram.com"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0077
            java.lang.String r0 = r8.getPath()
            if (r0 == 0) goto L_0x0077
            java.lang.String r1 = r8.getPath()
            r0 = 338(0x152, float:4.74E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0077
        L_0x0060:
            androidx.fragment.app.FragmentActivity r3 = r7.requireActivity()
            android.content.Intent r2 = X.DbS.A09()
            r0 = 428(0x1ac, float:6.0E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "DONATION_INCOMPLETE"
            r2.putExtra(r1, r0)
            X.Dba.A0k(r3, r2)
            return r4
        L_0x0077:
            if (r2 == 0) goto L_0x0097
            java.lang.String r0 = "resume"
            if (r6 == 0) goto L_0x0097
            boolean r1 = r5.equals(r0)
            if (r1 == 0) goto L_0x008c
            java.lang.String r0 = "done"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x008c
            goto L_0x003e
        L_0x008c:
            if (r1 == 0) goto L_0x0097
            java.lang.String r0 = "cancel"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0097
            goto L_0x0060
        L_0x0097:
            boolean r4 = super.A03(r8, r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ERI.A03(android.net.Uri, android.webkit.WebView):boolean");
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1290289225);
        super.onCreate(bundle);
        Activity rootActivity = getRootActivity();
        if (rootActivity != null) {
            Dbb.A0h(rootActivity);
            AnonymousClass0fD.A09(-1031031671, A02);
            return;
        }
        IllegalStateException A0z = AnonymousClass7TE.A0z("No Activity context found");
        AnonymousClass0fD.A09(332852573, A02);
        throw A0z;
    }

    public final void A02(WebView webView) {
        this.A00 = webView;
    }
}

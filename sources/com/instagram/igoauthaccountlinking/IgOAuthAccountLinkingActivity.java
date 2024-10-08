package com.instagram.igoauthaccountlinking;

import X.AnonymousClass0fD;
import X.DbS;
import com.facebook.oauthaccountlinking.OAuthAccountLinkingActivity;

public final class IgOAuthAccountLinkingActivity extends OAuthAccountLinkingActivity {
    public boolean A00;

    public final void onPause() {
        int A002 = AnonymousClass0fD.A00(-1381424750);
        IgOAuthAccountLinkingActivity.super.onPause();
        this.A00 = true;
        AnonymousClass0fD.A07(-755002287, A002);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.instagram.igoauthaccountlinking.IgOAuthAccountLinkingActivity, com.facebook.oauthaccountlinking.OAuthAccountLinkingActivity, android.app.Activity] */
    public final void onResume() {
        int A002 = AnonymousClass0fD.A00(-1809731633);
        super.onResume();
        if (this.A00 && !this.A00) {
            setResult(0, DbS.A09().putExtra("error", "LOGIN_CANCELLED_BY_USER"));
            finish();
        }
        AnonymousClass0fD.A07(-1235270533, A002);
    }
}

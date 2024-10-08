package com.facebook.privacy.consent.bloks.instagram;

import X.08y;
import X.09i;
import X.0qQ;
import X.2EG;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass6Tm;
import X.C277014uI;
import X.C299275ur;
import X.C61350mg;
import X.O50;
import X.OBC;
import X.SUL;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import java.util.concurrent.locks.ReentrantLock;

public final class InstagramConsentOpenIABUrlActivity extends IgFragmentActivity {
    public AnonymousClass0wW A00;
    public boolean A01;

    public final void onSaveInstanceState(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        InstagramConsentOpenIABUrlActivity.super.onSaveInstanceState(bundle);
        bundle.putBoolean("already_opened", this.A01);
    }

    public final AnonymousClass0wW getSession() {
        AnonymousClass0wW r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("session");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.content.Context, com.facebook.privacy.consent.bloks.instagram.InstagramConsentOpenIABUrlActivity, android.app.Activity, com.instagram.base.activity.IgFragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        String stringExtra;
        int A002 = AnonymousClass0fD.A00(429384915);
        08y r1 = 09i.A0A;
        Intent intent = getIntent();
        0qQ.A07(intent);
        AnonymousClass0wW A04 = r1.A04(C61350mg.A00(intent));
        0qQ.A0B(A04, 0);
        this.A00 = A04;
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        if (bundle != null) {
            this.A01 = bundle2.getBoolean("already_opened");
        }
        if (this.A01) {
            i = -753294861;
        } else {
            Intent intent2 = getIntent();
            if (intent2 == null || (stringExtra = intent2.getStringExtra("redirect_url")) == null || stringExtra.length() == 0) {
                setResult(0);
                finish();
                i = 1331769361;
            } else {
                UserSession session = getSession();
                if (session instanceof UserSession) {
                    SUL sul = new SUL(this, session, 2EG.A0V, stringExtra, false);
                    sul.A0S = "instagram_consent_open_iab_url_activity";
                    sul.A0A();
                } else {
                    SimpleWebViewActivity.A02.A02(this, session, new SimpleWebViewConfig((String) null, (String) null, false, false, false, false, true, true, false, false, true, false, false, false, (String) null, stringExtra));
                }
                i = 2100497717;
            }
        }
        AnonymousClass0fD.A07(i, A002);
    }

    public final void onPause() {
        int A002 = AnonymousClass0fD.A00(-1183122572);
        super.onPause();
        this.A01 = true;
        AnonymousClass0fD.A07(1231191861, A002);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.facebook.privacy.consent.bloks.instagram.InstagramConsentOpenIABUrlActivity, com.instagram.base.activity.IgFragmentActivity, android.app.Activity] */
    public final void onResume() {
        int A002 = AnonymousClass0fD.A00(-843153825);
        super.onResume();
        if (this.A01) {
            String stringExtra = getIntent().getStringExtra("callback_key");
            if (stringExtra != null) {
                ReentrantLock reentrantLock = O50.A01;
                reentrantLock.lock();
                try {
                    OBC obc = (OBC) O50.A00.remove(stringExtra);
                    if (obc != null) {
                        C277014uI r2 = obc.A01;
                        C299275ur.A00(obc.A00, AnonymousClass6Tm.A01, r2);
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            finish();
        }
        AnonymousClass0fD.A07(-924416587, A002);
    }
}

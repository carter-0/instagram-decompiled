package com.facebook.oauthaccountlinking;

import X.0qQ;
import X.2IS;
import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.AnonymousClass0kN;
import X.C11068S8o;
import X.C11069S8p;
import X.C12117SnG;
import X.C41845B3m;
import X.C41847B3o;
import X.C41848B3p;
import X.DbS;
import X.Pxe;
import X.Pxi;
import X.SnN;
import X.T0J;
import X.T9K;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.lang.reflect.InvocationTargetException;

public class OAuthAccountLinkingActivity extends OAuthAccountLinkingActivityBase {
    public boolean A00;
    public boolean A01;

    /* JADX WARNING: type inference failed for: r9v0, types: [androidx.activity.ComponentActivity, com.facebook.oauthaccountlinking.OAuthAccountLinkingActivity, java.lang.Object, com.facebook.oauthaccountlinking.OAuthAccountLinkingActivityBase, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onNewIntent(Intent intent) {
        String str;
        0qQ.A0B(intent, 0);
        OAuthAccountLinkingActivity.super.onNewIntent(intent);
        String stringExtra = intent.getStringExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
        String stringExtra2 = intent.getStringExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
        String stringExtra3 = intent.getStringExtra("error");
        if (stringExtra3 != null || stringExtra == null || stringExtra2 == null) {
            setResult(0, Pxi.A0B("error", stringExtra3));
            OAuthAccountLinkingActivityBase.A00(this, AnonymousClass05K.A0N, (Long) null, stringExtra3, (String) null);
            finish();
        } else {
            T9K t9k = this.A02;
            if (t9k != null) {
                try {
                    SnN snN = (SnN) C41847B3o.A17(C11068S8o.class, "create", 0);
                    2IS r2 = snN.A00;
                    r2.A04("authCode", stringExtra);
                    snN.A01 = true;
                    r2.A04(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, stringExtra2);
                    snN.A02 = true;
                    if (this.A02 != null) {
                        str = "IG";
                    } else {
                        str = null;
                    }
                    r2.A04("surface", str);
                    t9k.A00(this, snN.build().setMaxToleratedCacheAgeMs(0).setEnsureCacheWrite(false), new T0J(this, 0));
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                    throw C41845B3m.A0j(e);
                }
            }
        }
        this.A00 = true;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.facebook.oauthaccountlinking.OAuthAccountLinkingActivity, java.lang.Object, com.facebook.oauthaccountlinking.OAuthAccountLinkingActivityBase, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        Bundle bundle2;
        String str;
        String str2;
        int A002 = AnonymousClass0fD.A00(1116836110);
        OAuthAccountLinkingActivity.super.onCreate(bundle);
        A01();
        if (this.A02 != null) {
            this.A01 = AnonymousClass0kN.A02(Pxe.A0a(this));
            Intent intent = getIntent();
            if (intent == null || (bundle2 = intent.getBundleExtra("session_parameters")) == null) {
                bundle2 = new Bundle(0);
            }
            this.A00 = bundle2;
            Intent intent2 = getIntent();
            if (intent2 == null || (str = intent2.getStringExtra("oauth_integration_id")) == null) {
                str = "";
            }
            this.A03 = str;
            T9K t9k = this.A02;
            if (t9k != null) {
                try {
                    C12117SnG snG = (C12117SnG) C41847B3o.A16(C11069S8p.class);
                    String str3 = this.A03;
                    2IS r2 = snG.A00;
                    snG.A01 = C41848B3p.A1Z(r2, "oauth_integration_id", str3);
                    if (this.A02 != null) {
                        str2 = "IG";
                    } else {
                        str2 = null;
                    }
                    r2.A04("surface", str2);
                    PandoGraphQLRequest A003 = snG.build();
                    0qQ.A07(A003);
                    t9k.A00(this, A003, new T0J(this, 1));
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                    throw C41845B3m.A0j(e);
                }
            }
            i = 1132725407;
        } else {
            finish();
            i = -548617708;
        }
        AnonymousClass0fD.A07(i, A002);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.oauthaccountlinking.OAuthAccountLinkingActivity, android.app.Activity] */
    public final void onRestart() {
        int A002 = AnonymousClass0fD.A00(-367084873);
        OAuthAccountLinkingActivity.super.onRestart();
        this.A01 = true;
        AnonymousClass0fD.A07(330901793, A002);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.facebook.oauthaccountlinking.OAuthAccountLinkingActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public void onResume() {
        int A002 = AnonymousClass0fD.A00(-1096345688);
        OAuthAccountLinkingActivity.super.onResume();
        if (this.A01 && !this.A00) {
            setResult(0, DbS.A09().putExtra("error", "LOGIN_CANCELLED_BY_USER"));
            finish();
        }
        AnonymousClass0fD.A07(-487490173, A002);
    }
}

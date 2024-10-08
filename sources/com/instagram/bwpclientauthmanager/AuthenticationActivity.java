package com.instagram.bwpclientauthmanager;

import X.0qQ;
import X.1vm;
import X.1vn;
import X.2IS;
import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.AnonymousClass0kN;
import X.AnonymousClass7TF;
import X.C12090Smk;
import X.C12093Smn;
import X.C12097Sms;
import X.C12104Smz;
import X.C41845B3m;
import X.C41847B3o;
import X.C58840Ae;
import X.DbS;
import X.DbW;
import X.Pxe;
import X.Pxi;
import X.Pxj;
import X.S8U;
import X.S8V;
import X.SRE;
import X.T0Q;
import X.T0U;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.lang.reflect.InvocationTargetException;

public final class AuthenticationActivity extends BaseFragmentActivity {
    public UserSession A00;
    public Bundle A01 = new Bundle(0);
    public C58840Ae A02 = AnonymousClass0kN.A02(Pxe.A0a(this));
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [androidx.activity.ComponentActivity, com.instagram.bwpclientauthmanager.AuthenticationActivity, java.lang.Object, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onNewIntent(Intent intent) {
        0qQ.A0B(intent, 0);
        AuthenticationActivity.super.onNewIntent(intent);
        this.A03 = true;
        String stringExtra = intent.getStringExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
        String stringExtra2 = intent.getStringExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
        String stringExtra3 = intent.getStringExtra("error");
        intent.getStringExtra("iab_session_id");
        if (stringExtra3 != null || stringExtra == null || stringExtra2 == null) {
            if (0qQ.A0K(stringExtra3, "access_denied")) {
                setResult(0, DbS.A09().putExtra("error", "LOGIN_CANCELED_BY_USER"));
                SRE.A00.A02(this.A01, this.A02, AnonymousClass05K.A0Y, (String) null);
            } else {
                setResult(0, Pxi.A0B("error", stringExtra3));
                SRE.A00.A02(this.A01, this.A02, AnonymousClass05K.A0j, stringExtra3);
            }
            finish();
            return;
        }
        SRE sre = SRE.A00;
        C58840Ae r5 = this.A02;
        sre.A02(this.A01, r5, AnonymousClass05K.A0C, (String) null);
        1vn A012 = 1vm.A01(Pxe.A0a(this));
        Bundle bundle = this.A01;
        boolean z = this.A06;
        AnonymousClass7TF.A1B(r5, 1, bundle);
        T0Q t0q = new T0Q(bundle, this, r5, z);
        try {
            Object A0l = Pxj.A0l((Object) null, S8U.class, "create");
            0qQ.A0C(A0l, "null cannot be cast to non-null type com.facebook.bwpclientauthmanager.shared.AmazonBwpAccessTokenQuery.BuilderForAuthCode");
            C12104Smz smz = (C12104Smz) A0l;
            2IS r2 = smz.A00;
            r2.A04("auth_code", stringExtra);
            smz.A02 = true;
            r2.A04(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, stringExtra2);
            smz.A03 = true;
            r2.A00(SRE.A00(this.A01), "extra_data");
            C12090Smk.A00(new C12093Smn(t0q, 3), smz.build().setMaxToleratedCacheAgeMs(0).setEnsureCacheWrite(false), A012, t0q, 4);
        } catch (Exception e) {
            if ((e instanceof ClassNotFoundException) || (e instanceof IllegalAccessException) || (e instanceof InstantiationException) || (e instanceof InvocationTargetException) || (e instanceof NoSuchMethodException)) {
                throw C41845B3m.A0j(e);
            }
            throw e;
        }
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.bwpclientauthmanager.AuthenticationActivity, java.lang.Object, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        Intent intent;
        int A002 = AnonymousClass0fD.A00(88029637);
        super.onCreate(bundle);
        Intent intent2 = getIntent();
        if (intent2 == null || (bundle2 = intent2.getBundleExtra("iab_session_params")) == null) {
            bundle2 = new Bundle(0);
        }
        this.A01 = bundle2;
        Intent intent3 = getIntent();
        if (intent3 != null) {
            intent = (Intent) intent3.getParcelableExtra("iab_browser_intent");
        } else {
            intent = null;
        }
        this.A06 = DbW.A1a(intent);
        UserSession A0a = Pxe.A0a(this);
        this.A00 = A0a;
        1vn A012 = 1vm.A01(A0a);
        C58840Ae r12 = this.A02;
        Bundle bundle3 = this.A01;
        boolean z = this.A06;
        0qQ.A0B(r12, 1);
        0qQ.A0B(bundle3, 3);
        T0U t0u = new T0U(intent, bundle3, this, r12, A0a, z);
        try {
            Object A17 = C41847B3o.A17(S8V.class, "create", 0);
            0qQ.A0C(A17, "null cannot be cast to non-null type com.facebook.bwpclientauthmanager.shared.AmazonBwpLoginUrlQuery.Builder");
            C12097Sms sms = (C12097Sms) A17;
            sms.A00.A00(SRE.A00(this.A01), "extra_data");
            C12090Smk.A00(new C12093Smn(t0u, 2), sms.build().setMaxToleratedCacheAgeMs(0).setEnsureCacheWrite(false), A012, t0u, 3);
            AnonymousClass0fD.A07(-615789974, A002);
        } catch (Exception e) {
            if ((e instanceof ClassNotFoundException) || (e instanceof IllegalAccessException) || (e instanceof InstantiationException) || (e instanceof InvocationTargetException) || (e instanceof NoSuchMethodException)) {
                throw C41845B3m.A0j(e);
            }
            throw e;
        }
    }

    public final void onPause() {
        int A002 = AnonymousClass0fD.A00(337359291);
        super.onPause();
        this.A04 = true;
        AnonymousClass0fD.A07(-822359410, A002);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.bwpclientauthmanager.AuthenticationActivity, android.app.Activity] */
    public final void onRestart() {
        int A002 = AnonymousClass0fD.A00(-268039562);
        AuthenticationActivity.super.onRestart();
        this.A05 = true;
        AnonymousClass0fD.A07(-1207901917, A002);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.bwpclientauthmanager.AuthenticationActivity, android.app.Activity] */
    public final void onResume() {
        int A002 = AnonymousClass0fD.A00(-509790402);
        super.onResume();
        if ((this.A05 || this.A04) && !this.A03) {
            setResult(0, DbS.A09().putExtra("error", "LOGIN_CANCELED_BY_USER"));
            SRE.A00.A02(this.A01, this.A02, AnonymousClass05K.A0Y, (String) null);
            finish();
        }
        AnonymousClass0fD.A07(1241681773, A002);
    }
}

package com.instagram.fxcal.browser;

import X.00k;
import X.00l;
import X.0cp;
import X.0qQ;
import X.0sn;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C10917S0u;
import X.C51566FwC;
import X.C51966G9m;
import X.DbS;
import X.DbT;
import X.Dba;
import X.Pxe;
import X.SO4;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.android.R;
import com.instagram.base.activity.BaseFragmentActivity;
import java.util.List;

public final class FxChromeCustomTabsActivity extends BaseFragmentActivity {
    public boolean A00 = true;

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [androidx.activity.ComponentActivity, com.instagram.fxcal.browser.FxChromeCustomTabsActivity, android.app.Activity] */
    public final void onNewIntent(Intent intent) {
        0qQ.A0B(intent, 0);
        FxChromeCustomTabsActivity.super.onNewIntent(intent);
        Dba.A0k(this, DbS.A09().putExtra("KEY_URL", intent.getStringExtra("key_uri")));
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity, com.instagram.fxcal.browser.FxChromeCustomTabsActivity, android.content.ContextWrapper, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        String scheme;
        0sn queryIntentActivities;
        0sn A1C;
        String str;
        int A002 = AnonymousClass0fD.A00(434210020);
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("url_param");
        if (stringExtra != null) {
            try {
                if (!00l.A0W(stringExtra) && (scheme = 0cp.A03(stringExtra).getScheme()) != null && scheme.equals("https")) {
                    SO4 so4 = new SO4();
                    Intent intent = so4.A01;
                    intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
                    so4.A00 = ActivityOptions.makeCustomAnimation(this, R.anim.modal_slide_up_enter, R.anim.modal_empty_animation);
                    intent.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", ActivityOptions.makeCustomAnimation(this, R.anim.modal_empty_animation, R.anim.modal_slide_down_exit).toBundle());
                    intent.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", true);
                    C10917S0u A01 = so4.A01();
                    if (C51966G9m.A1X("com.opera.browser,com.sec.android.app.sbrowser,com.android.chrome")) {
                        Intent intent2 = A01.A00;
                        Context baseContext = getBaseContext();
                        0qQ.A07(baseContext);
                        List A0Q = 00l.A0Q("com.opera.browser,com.sec.android.app.sbrowser,com.android.chrome", new char[]{','}, 0);
                        PackageManager packageManager = baseContext.getPackageManager();
                        if (packageManager == null) {
                            A1C = 0sn.A00;
                        } else {
                            Uri A09 = DbT.A09(stringExtra);
                            PackageManager packageManager2 = baseContext.getPackageManager();
                            if (packageManager2 == null) {
                                queryIntentActivities = 0sn.A00;
                            } else {
                                queryIntentActivities = packageManager2.queryIntentActivities(Pxe.A0F(A09), 0);
                                0qQ.A07(queryIntentActivities);
                            }
                            A1C = AnonymousClass7TE.A1C();
                            for (ResolveInfo next : queryIntentActivities) {
                                Intent A092 = DbS.A09();
                                A092.setAction("android.support.customtabs.action.CustomTabsService");
                                A092.setPackage(next.activityInfo.packageName);
                                if (packageManager.resolveService(A092, 0) != null) {
                                    A1C.add(next);
                                }
                            }
                        }
                        if (A1C.isEmpty()) {
                            str = null;
                        } else {
                            str = ((ResolveInfo) 00k.A0I(00k.A0g(A1C, new C51566FwC((Object) A0Q, 6)))).activityInfo.packageName;
                        }
                        intent2.setPackage(str);
                    }
                    A01.A00(this, 0cp.A03(stringExtra));
                    AnonymousClass0fD.A07(-368703283, A002);
                    return;
                }
            } catch (Exception unused) {
                setResult(0);
                finish();
                AnonymousClass0fD.A07(773692474, A002);
                return;
            }
        }
        setResult(0);
        finish();
        AnonymousClass0fD.A07(-389693660, A002);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.fxcal.browser.FxChromeCustomTabsActivity, android.app.Activity] */
    public final void onResume() {
        int A002 = AnonymousClass0fD.A00(788667379);
        super.onResume();
        if (!this.A00) {
            setResult(0);
            finish();
        }
        this.A00 = false;
        AnonymousClass0fD.A07(1608035570, A002);
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}

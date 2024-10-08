package com.instagram.urlhandlers.fbeappstore;

import X.1QK;
import X.AnonymousClass000;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass2ZQ;
import X.AnonymousClass6W8;
import X.AnonymousClass7TE;
import X.C46649DiU;
import X.C49672F1e;
import X.C49891FBs;
import X.C71172bH;
import X.DbT;
import X.Dba;
import X.FFQ;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import java.util.HashMap;

public class FbeAppStoreUrlHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.fbeappstore.FbeAppStoreUrlHandlerActivity, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        C46649DiU A04;
        C49672F1e f1e;
        int i;
        int A002 = AnonymousClass0fD.A00(1801562154);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle A0A = DbT.A0A(intent);
        if (A0A != null) {
            this.A00 = DbT.A0W(A0A);
        }
        AnonymousClass0wW r1 = this.A00;
        if (r1 == null || (r1 instanceof UserSession)) {
            String stringExtra = intent.getStringExtra("app_id");
            String stringExtra2 = intent.getStringExtra("app_name");
            String stringExtra3 = intent.getStringExtra("app_logo_url");
            String stringExtra4 = intent.getStringExtra("authentication_url");
            if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra2) || TextUtils.isEmpty(stringExtra3) || TextUtils.isEmpty(stringExtra4)) {
                A04 = C46649DiU.A04(AnonymousClass000.A00(1192), AnonymousClass7TE.A1E());
                AnonymousClass0wW r0 = this.A00;
                r0.getClass();
                f1e = new C49672F1e(r0);
                i = 2131955115;
            } else {
                HashMap A0f = Dba.A0f("app_id", stringExtra);
                A0f.put("app_name", stringExtra2);
                A0f.put("app_logo_url", stringExtra3);
                A0f.put("authentication_url", stringExtra4);
                A04 = C46649DiU.A04("com.instagram.fbe.screens.value_prop", A0f);
                AnonymousClass0wW r02 = this.A00;
                r02.getClass();
                f1e = new C49672F1e(r02);
                i = 2131956548;
            }
            String string = getString(i);
            IgBloksScreenConfig igBloksScreenConfig = f1e.A00;
            igBloksScreenConfig.A0U = string;
            igBloksScreenConfig.A0i = true;
            Bundle A003 = C49891FBs.A00(igBloksScreenConfig, A04);
            AnonymousClass2ZQ A004 = C71172bH.A00();
            A004.getClass();
            A004.Eng(1QK.A0E);
            AnonymousClass6W8.A06(getApplicationContext(), A003, ModalActivity.class, "bloks");
            finish();
        } else {
            FFQ.A01(this, A0A, r1);
        }
        AnonymousClass0fD.A07(1092999786, A002);
    }

    public final AnonymousClass0wW getSession() {
        AnonymousClass0wW r0 = this.A00;
        r0.getClass();
        return r0;
    }
}

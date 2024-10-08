package com.instagram.urlhandlers.fbshopping;

import X.0Gl;
import X.0qQ;
import X.0wb;
import X.AnonymousClass000;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.DbS;
import X.DbT;
import X.FFi;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class FBShoppingExternalUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [com.instagram.urlhandlers.fbshopping.FBShoppingExternalUrlHandlerActivity, com.instagram.base.activity.BaseFragmentActivity, java.lang.Object, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        int A00 = AnonymousClass0fD.A00(-932280821);
        super.onCreate(bundle);
        Intent intent = getIntent();
        0qQ.A07(intent);
        Bundle A0A = DbT.A0A(intent);
        if (!(A0A == null || A0A.getString("original_url") == null)) {
            try {
                FFi.A01(this, DbS.A0O(AnonymousClass000.A00(4896)), 0Gl.A00(DbS.A0S(this)), "ig_product_wishlist", (String) null, A0A.getString("original_url"));
            } catch (IllegalArgumentException e) {
                0wb.A07("FBShoppingExternalUrlHandlerActivity", e);
            }
        }
        finish();
        AnonymousClass0fD.A07(1861454300, A00);
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}

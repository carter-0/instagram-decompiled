package com.instagram.urlhandlers.share;

import X.08y;
import X.09i;
import X.0qQ;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.DbS;
import X.DbT;
import X.DbV;
import X.DbW;
import X.DbX;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class ShareUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.app.Activity, com.instagram.urlhandlers.share.ShareUrlHandlerActivity] */
    public final AnonymousClass0wW getSession() {
        Bundle A0A;
        08y r1 = 09i.A0A;
        Intent intent = getIntent();
        if (intent != null && (A0A = DbT.A0A(intent)) != null) {
            return r1.A04(A0A);
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity, android.app.Activity, com.instagram.urlhandlers.share.ShareUrlHandlerActivity] */
    public final void onCreate(Bundle bundle) {
        String str;
        int A00 = AnonymousClass0fD.A00(-596839372);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A != null) {
            str = DbS.A0m(A0A);
        } else {
            str = null;
        }
        Intent A08 = DbX.A08(this);
        if (str == null) {
            str = "instagram://share";
        }
        Intent data = A08.setData(DbW.A07(str).build());
        0qQ.A07(data);
        DbV.A19(this, data);
        finish();
        AnonymousClass0fD.A07(-253081467, A00);
    }
}

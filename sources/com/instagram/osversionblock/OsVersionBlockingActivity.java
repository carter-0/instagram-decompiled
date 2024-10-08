package com.instagram.osversionblock;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.DbS;
import X.FPD;
import android.os.Bundle;
import com.instagram.android.R;
import com.instagram.base.activity.IgFragmentActivity;

public final class OsVersionBlockingActivity extends IgFragmentActivity {
    public AnonymousClass0wW A00;

    public final AnonymousClass0wW getSession() {
        AnonymousClass0wW r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        DbS.A14();
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.osversionblock.OsVersionBlockingActivity, java.lang.Object, com.instagram.base.activity.IgFragmentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0fD.A00(-1936183618);
        super.onCreate(bundle);
        AnonymousClass0wW A0S = DbS.A0S(this);
        0qQ.A0B(A0S, 0);
        this.A00 = A0S;
        setContentView((int) R.layout.osversionblock);
        FPD.A00(requireViewById(R.id.os_version_blocking_nav_button), 35, this);
        AnonymousClass0fD.A07(-853442433, A002);
    }
}

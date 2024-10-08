package com.instagram.debug.devoptions.fbpay;

import X.0qQ;
import X.AnonymousClass0fD;
import X.C66580MXl;
import X.Pxe;
import X.S3G;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.android.R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IgECPOnsitePlaygroundActivity extends IgFragmentActivity {
    public static final Companion Companion = new Object();
    public S3G ecpLauncher;

    public static final Intent getActivityIntent(Context context) {
        return Companion.getActivityIntent(context);
    }

    public void onCreate(Bundle bundle) {
        int A00 = AnonymousClass0fD.A00(2113669700);
        super.onCreate(bundle);
        this.ecpLauncher = new S3G(this);
        setContentView((int) R.layout.ig_ecp_onsite_playground_activity);
        AnonymousClass0fD.A07(-1940336513, A00);
    }

    public final class Companion {
        public final Intent getActivityIntent(Context context) {
            0qQ.A0B(context, 0);
            return C66580MXl.A0A(context, IgECPPlaygroundActivity.class);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public UserSession getSession() {
        return Pxe.A0a(this);
    }
}

package com.instagram.debug.devoptions.fbpay;

import X.0qQ;
import X.AnonymousClass0fD;
import X.AnonymousClass0fU;
import X.AnonymousClass1GD;
import X.C66580MXl;
import X.Pxe;
import X.S3G;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.facebookpay.webview.WebViewActivity;
import com.facebookpay.widget.paybutton.FBPayAnimationButton;
import com.instagram.android.R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IgECPPlaygroundActivity extends IgFragmentActivity {
    public static final Companion Companion = new Object();
    public static final String DEEPLINK_URL = "instagram://ecp_checkout?product_id=235936865236184&receiver_id=283912516944685&order_id=1003374073922800";
    public static final String DOMAIN = "ECP_CHECKOUT";
    public static final String DOMAIN_E2E = "ECP_E2E";
    public static final String MODULE_NAME = "ecp_playground";
    public static final String OFFSITE_DEFAULT_URL = "https://fb-qa-test-store.myshopify.com/";
    public static final int REQUEST_CODE_ECP_AVAILABLE = 10;
    public EditText deeplinkE2EUrlInputEditText;
    public S3G ecpLauncher;
    public EditText offsiteUrlInputEditText;

    public static final Intent getActivityIntent(Context context) {
        return Companion.getActivityIntent(context);
    }

    private final void expandTouchArea(View view, View view2, int i) {
        view.post(new IgECPPlaygroundActivity$expandTouchArea$1(view2, i, view));
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.content.Context, com.instagram.debug.devoptions.fbpay.IgECPPlaygroundActivity, com.instagram.base.activity.IgFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity] */
    public void onCreate(Bundle bundle) {
        int A00 = AnonymousClass0fD.A00(1625164523);
        super.onCreate(bundle);
        AnonymousClass1GD.A01(this);
        this.ecpLauncher = new S3G(this);
        setContentView((int) R.layout.ig_ecp_playground_activity);
        this.offsiteUrlInputEditText = (EditText) findViewById(R.id.express_checkout_edittext_offsite_url_input);
        this.deeplinkE2EUrlInputEditText = (EditText) findViewById(R.id.express_checkout_edittext_deeplink_e2e_url_input);
        AnonymousClass0fU.A00(new IgECPPlaygroundActivity$onCreate$1$1(this), findViewById(R.id.express_checkout_button));
        AnonymousClass0fU.A00(new IgECPPlaygroundActivity$onCreate$2$1(this), findViewById(R.id.express_checkout_button_offsite));
        View findViewById = findViewById(R.id.clear_url_input_text);
        View findViewById2 = findViewById(R.id.express_checkout_edittext_offsite_url_layout);
        0qQ.A07(findViewById2);
        0qQ.A0A(findViewById);
        expandTouchArea(findViewById2, findViewById, 100);
        AnonymousClass0fU.A00(new IgECPPlaygroundActivity$onCreate$3$1(this), findViewById);
        AnonymousClass0fU.A00(new IgECPPlaygroundActivity$onCreate$4$1(this), findViewById(R.id.express_checkout_button_onsite));
        AnonymousClass0fU.A00(new IgECPPlaygroundActivity$onCreate$5$1(this), findViewById(R.id.express_checkout_button_nux));
        AnonymousClass0fU.A00(new IgECPPlaygroundActivity$onCreate$6$1(this), findViewById(R.id.express_checkout_confirmation));
        View findViewById3 = findViewById(R.id.web_view);
        Intent A0A = C66580MXl.A0A(this, WebViewActivity.class);
        A0A.putExtra("WEB_VIEW_URL", "https://google.com");
        AnonymousClass0fU.A00(new IgECPPlaygroundActivity$onCreate$7$1(A0A, this), findViewById3);
        AnonymousClass0fU.A00(new IgECPPlaygroundActivity$onCreate$8$1(this), findViewById(R.id.express_checkout_deeplink));
        AnonymousClass0fU.A00(new IgECPPlaygroundActivity$onCreate$9$1(this), findViewById(R.id.express_checkout_deeplink_e2e));
        View findViewById4 = findViewById(R.id.express_checkout_edittext_deeplink_e2e_url_input_text);
        View findViewById5 = findViewById(R.id.express_checkout_edittext_deeplink_e2e_url_layout);
        0qQ.A07(findViewById5);
        0qQ.A0A(findViewById4);
        expandTouchArea(findViewById5, findViewById4, 100);
        AnonymousClass0fU.A00(new IgECPPlaygroundActivity$onCreate$10$1(this), findViewById4);
        FBPayAnimationButton fBPayAnimationButton = (FBPayAnimationButton) findViewById(R.id.pay_button);
        fBPayAnimationButton.setEnabled(true);
        AnonymousClass0fU.A00(new IgECPPlaygroundActivity$onCreate$11$1(fBPayAnimationButton), fBPayAnimationButton);
        AnonymousClass0fU.A00(new IgECPPlaygroundActivity$onCreate$12$1(fBPayAnimationButton), findViewById(R.id.pay_button_confirm));
        AnonymousClass0fU.A00(new IgECPPlaygroundActivity$onCreate$13$1(fBPayAnimationButton), findViewById(R.id.pay_button_cancel));
        AnonymousClass0fU.A00(new IgECPPlaygroundActivity$onCreate$14$1(fBPayAnimationButton), findViewById(R.id.pay_button_reset));
        AnonymousClass0fD.A07(1746430926, A00);
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

package com.spotify.sdk.android.auth;

import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.C10958S2q;
import X.C13501TbS;
import X.C13792Th7;
import X.C66579MXk;
import X.Pxf;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.util.Log;
import com.instagram.android.R;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.Iterator;

public class LoginActivity extends Activity implements C13501TbS {
    public final C10958S2q A00 = new C10958S2q(this);

    public final void onNewIntent(Intent intent) {
        Integer num;
        AuthorizationResponse authorizationResponse;
        Intent intent2 = intent;
        super.onNewIntent(intent2);
        Uri data = intent2.getData();
        C10958S2q s2q = this.A00;
        String str = null;
        String str2 = null;
        int i = 0;
        String str3 = null;
        if (data == null) {
            num = AnonymousClass05K.A0N;
        } else {
            String queryParameter = data.getQueryParameter("error");
            if (queryParameter != null) {
                str3 = data.getQueryParameter(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
                str2 = queryParameter;
                num = AnonymousClass05K.A0C;
            } else {
                String queryParameter2 = data.getQueryParameter(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
                if (queryParameter2 != null) {
                    str3 = data.getQueryParameter(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
                    str = queryParameter2;
                    num = AnonymousClass05K.A00;
                } else {
                    String encodedFragment = data.getEncodedFragment();
                    if (encodedFragment == null || encodedFragment.length() <= 0) {
                        num = AnonymousClass05K.A0Y;
                    } else {
                        String str4 = null;
                        String str5 = null;
                        for (String split : encodedFragment.split("&")) {
                            String[] split2 = split.split("=");
                            if (split2.length == 2) {
                                if (split2[0].startsWith("access_token")) {
                                    str4 = Uri.decode(split2[1]);
                                }
                                if (split2[0].startsWith(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE)) {
                                    str5 = Uri.decode(split2[1]);
                                }
                                if (split2[0].startsWith("expires_in")) {
                                    str = Uri.decode(split2[1]);
                                }
                            }
                        }
                        if (str != null) {
                            try {
                                i = Integer.parseInt(str);
                            } catch (NumberFormatException unused) {
                            }
                        }
                        authorizationResponse = new AuthorizationResponse(AnonymousClass05K.A01, (String) null, str4, str5, (String) null, i);
                        s2q.A00(authorizationResponse);
                    }
                }
            }
        }
        authorizationResponse = new AuthorizationResponse(num, str, (String) null, str3, str2, 0);
        s2q.A00(authorizationResponse);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Integer num;
        super.onActivityResult(i, i2, intent);
        if (i == 1138) {
            String str = null;
            String str2 = null;
            String str3 = null;
            int i3 = 0;
            String str4 = null;
            if (i2 == -2) {
                num = AnonymousClass05K.A0C;
                if (intent == null) {
                    str3 = "Invalid message format";
                } else {
                    str3 = intent.getStringExtra("ERROR");
                    if (str3 == null) {
                        str3 = "Unknown error";
                    }
                }
            } else if (i2 == -1) {
                BaseBundle baseBundle = (BaseBundle) intent.getParcelableExtra("REPLY");
                if (baseBundle == null) {
                    num = AnonymousClass05K.A0C;
                    str3 = "Missing response data";
                } else {
                    String string = baseBundle.getString("RESPONSE_TYPE", "unknown");
                    str4 = baseBundle.getString("STATE", (String) null);
                    if (string.equals(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE)) {
                        str2 = baseBundle.getString("AUTHORIZATION_CODE");
                        num = AnonymousClass05K.A00;
                    } else if (!string.equals("token")) {
                        num = AnonymousClass05K.A0Y;
                    } else {
                        str = baseBundle.getString("ACCESS_TOKEN");
                        i3 = baseBundle.getInt("EXPIRES_IN");
                        num = AnonymousClass05K.A01;
                    }
                }
            } else {
                num = AnonymousClass05K.A0N;
            }
            C10958S2q s2q = this.A00;
            s2q.A00 = this;
            s2q.A00(new AuthorizationResponse(num, str2, str, str4, str3, i3));
        }
    }

    public final void onCreate(Bundle bundle) {
        AuthorizationRequest authorizationRequest;
        int A02 = Pxf.A02(this, -857946363);
        super.onCreate(bundle);
        setContentView(R.layout.com_spotify_sdk_login_activity);
        Bundle bundleExtra = getIntent().getBundleExtra(C66579MXk.A00(551));
        if (bundleExtra == null) {
            authorizationRequest = null;
        } else {
            authorizationRequest = (AuthorizationRequest) bundleExtra.getParcelable("request");
        }
        C10958S2q s2q = this.A00;
        s2q.A00 = this;
        if (getCallingActivity() == null) {
            Log.e("com.spotify.sdk.android.auth.LoginActivity", "Can't use LoginActivity with a null caller. Possible reasons: calling activity has a singleInstance mode or LoginActivity is in a singleInstance/singleTask mode");
        } else if (authorizationRequest == null) {
            Log.e("com.spotify.sdk.android.auth.LoginActivity", "No authorization request");
            setResult(0);
        } else {
            if (bundle == null) {
                String.format("Spotify Auth starting with the request [%s]", new Object[]{authorizationRequest.A00().toString()});
                if (!s2q.A03) {
                    s2q.A03 = true;
                    Iterator it = s2q.A02.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C13792Th7 th7 = (C13792Th7) it.next();
                        if (th7.EwS(s2q.A04, authorizationRequest)) {
                            s2q.A01 = th7;
                            break;
                        }
                        th7.stop();
                    }
                }
            }
            AnonymousClass0fD.A07(438737101, A02);
        }
        finish();
        AnonymousClass0fD.A07(438737101, A02);
    }

    public final void onDestroy() {
        int A002 = AnonymousClass0fD.A00(43982237);
        C10958S2q s2q = this.A00;
        if (s2q.A03) {
            s2q.A03 = false;
            C13792Th7 th7 = s2q.A01;
            if (th7 != null) {
                th7.stop();
            }
            C13501TbS tbS = s2q.A00;
            if (tbS != null) {
                Log.w("com.spotify.sdk.android.auth.LoginActivity", "Spotify Auth cancelled due to LoginActivity being finished");
                ((Activity) tbS).setResult(0);
                s2q.A00 = null;
            }
        }
        s2q.A00 = null;
        super.onDestroy();
        AnonymousClass0fD.A07(-1582391288, A002);
    }

    public final void onResume() {
        int A002 = AnonymousClass0fD.A00(1388797185);
        super.onResume();
        C10958S2q s2q = this.A00;
        C13792Th7 th7 = s2q.A01;
        if (th7 != null && th7.CP1()) {
            s2q.A00(new AuthorizationResponse(AnonymousClass05K.A0N, (String) null, (String) null, (String) null, (String) null, 0));
        }
        AnonymousClass0fD.A07(-1866030464, A002);
    }
}

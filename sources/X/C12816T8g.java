package X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.SigningInfo;
import android.text.TextUtils;
import com.spotify.sdk.android.auth.AuthorizationRequest;

/* renamed from: X.T8g  reason: case insensitive filesystem */
public final class C12816T8g implements C13792Th7 {
    public SNS A00;

    public final boolean CP1() {
        return false;
    }

    public final boolean EwS(Activity activity, AuthorizationRequest authorizationRequest) {
        boolean z;
        SNS sns = new SNS(activity, authorizationRequest, new C10330RqT());
        this.A00 = sns;
        Activity activity2 = sns.A00;
        C10330RqT rqT = sns.A02;
        String[] strArr = SNS.A03;
        int i = 0;
        do {
            String A0R = 002.A0R("com.spotify.music", strArr[i]);
            Intent A0G = Pxe.A0G("com.spotify.sso.action.START_AUTH_FLOW");
            A0G.setPackage(A0R);
            ComponentName resolveActivity = A0G.resolveActivity(activity2.getPackageManager());
            if (resolveActivity != null) {
                try {
                    PackageInfo packageInfo = activity2.getPackageManager().getPackageInfo(resolveActivity.getPackageName(), 134217728);
                    SigningInfo signingInfo = packageInfo.signingInfo;
                    if (signingInfo != null) {
                        if (signingInfo.hasMultipleSigners()) {
                            z = SNS.A00(rqT, packageInfo.signingInfo.getApkContentsSigners());
                        } else {
                            z = SNS.A00(rqT, packageInfo.signingInfo.getSigningCertificateHistory());
                        }
                        if (z) {
                            A0G.putExtra("VERSION", 1);
                            AuthorizationRequest authorizationRequest2 = sns.A01;
                            A0G.putExtra("CLIENT_ID", authorizationRequest2.A01);
                            A0G.putExtra("REDIRECT_URI", authorizationRequest2.A02);
                            A0G.putExtra("RESPONSE_TYPE", authorizationRequest2.A03);
                            A0G.putExtra("SCOPES", authorizationRequest2.A05);
                            A0G.putExtra("STATE", authorizationRequest2.A04);
                            A0G.putExtra("UTM_SOURCE", "spotify-sdk");
                            String str = authorizationRequest2.A00;
                            if (TextUtils.isEmpty(str)) {
                                str = "android-sdk";
                            }
                            A0G.putExtra("UTM_CAMPAIGN", str);
                            A0G.putExtra("UTM_MEDIUM", "android-sdk");
                            try {
                                activity2.startActivityForResult(A0G, 1138);
                                return true;
                            } catch (ActivityNotFoundException unused) {
                                return false;
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                }
            }
            i++;
        } while (i < 4);
        return false;
    }

    public final void stop() {
        SNS sns = this.A00;
        if (sns != null) {
            sns.A00.finishActivity(1138);
        }
    }
}

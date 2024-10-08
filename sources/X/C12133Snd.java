package X;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.facebook.login.LoginClient$Request;
import com.facebook.login.LoginClient$Result;
import com.facebook.proxygen.TraceFieldType;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.Snd  reason: case insensitive filesystem */
public final class C12133Snd implements C13710TfX {
    public SP4 A00;
    public SP4 A01;
    public 0lg A02;

    public final boolean Ctj(Intent intent, int i, int i2) {
        LoginClient$Result A022;
        String stringExtra;
        LoginClient$Request loginClient$Request = this.A01.A01;
        if (intent == null) {
            A01(loginClient$Request, this.A02, (String) null, "native_auth_cancel");
            stringExtra = "Operation canceled";
        } else if (i2 == 0) {
            A01(loginClient$Request, this.A02, (String) null, "native_auth_cancel");
            stringExtra = intent.getStringExtra("error");
        } else {
            if (i2 != -1) {
                C9831Rht.A00(this.A02, "native_auth_error", loginClient$Request.A01, A00("Unexpected resultCode from authorization."), loginClient$Request.A02);
                A022 = LoginClient$Result.A02(loginClient$Request, "Unexpected resultCode from authorization.", (String) null, (String) null);
            } else {
                Bundle extras = intent.getExtras();
                String string = extras.getString("error");
                if (string == null) {
                    string = extras.getString("error_type");
                }
                String string2 = extras.getString(TraceFieldType.ErrorCode);
                String string3 = extras.getString("error_message");
                if (string3 == null) {
                    string3 = extras.getString(TraceFieldType.Error);
                }
                if (string == null && string2 == null && string3 == null) {
                    try {
                        A01(loginClient$Request, this.A02, (String) null, "native_auth_success");
                        A022 = LoginClient$Result.A00(SP4.A00(extras, AnonymousClass05K.A01, loginClient$Request.A03, loginClient$Request.A06), loginClient$Request);
                    } catch (TQM e) {
                        A022 = LoginClient$Result.A02(loginClient$Request, (String) null, e.getMessage(), (String) null);
                    }
                } else if (C10070Rm7.A00.contains(string)) {
                    this.A00.A02();
                    return true;
                } else if (C10070Rm7.A01.contains(string)) {
                    A022 = LoginClient$Result.A01(loginClient$Request, (String) null);
                } else {
                    A022 = LoginClient$Result.A02(loginClient$Request, string, string3, string2);
                }
            }
            this.A00.A04(A022);
            return true;
        }
        A022 = LoginClient$Result.A01(loginClient$Request, stringExtra);
        this.A00.A04(A022);
        return true;
    }

    public final void FI6(LoginClient$Request loginClient$Request) {
        Intent intent;
        0lg r1;
        String str;
        String str2;
        C9831Rht.A00(this.A02, "native_auth_attempted", loginClient$Request.A01, A00((String) null), loginClient$Request.A02);
        String A012 = SP4.A01();
        FragmentActivity activity = this.A01.A06.getActivity();
        String str3 = loginClient$Request.A03;
        Set set = loginClient$Request.A06;
        boolean z = loginClient$Request.A07;
        Iterator it = C11164SCy.A02.iterator();
        loop0:
        while (true) {
            if (!it.hasNext()) {
                intent = null;
                break;
            }
            C9934Rjn rjn = (C9934Rjn) it.next();
            Intent A09 = DbS.A09();
            if (rjn instanceof QOS) {
                str2 = "com.facebook.wakizashi";
            } else if (rjn instanceof QOR) {
                str2 = "com.facebook.orca";
            } else {
                str2 = "com.facebook.katana";
            }
            intent = A09.setClassName(str2, "com.facebook.katana.ProxyAuth").putExtra("client_id", str3);
            if (set.size() != 0) {
                intent.putExtra("scope", TextUtils.join(",", set));
            }
            if (!C11406SSd.A05(A012)) {
                intent.putExtra("e2e", A012);
            }
            intent.putExtra("response_type", "token,signed_request");
            intent.putExtra("return_scopes", "true");
            intent.putExtra("default_audience", "friends");
            intent.putExtra("legacy_override", "v2.3");
            if (z) {
                intent.putExtra("auth_type", "rerequest");
            }
            ResolveInfo resolveActivity = activity.getPackageManager().resolveActivity(intent, 0);
            if (resolveActivity != null) {
                String str4 = resolveActivity.activityInfo.packageName;
                String str5 = Build.BRAND;
                int i = activity.getApplicationInfo().flags;
                if (str5.startsWith("generic") && (i & 2) != 0) {
                    break;
                }
                try {
                    for (Signature byteArray : activity.getPackageManager().getPackageInfo(str4, 64).signatures) {
                        if (C9934Rjn.A00.contains(C11406SSd.A03(byteArray.toByteArray()))) {
                            break loop0;
                        }
                    }
                    continue;
                } catch (PackageManager.NameNotFoundException unused) {
                    continue;
                }
            }
        }
        intent.putExtra("is_cal", loginClient$Request.A02);
        intent.putExtra("location", loginClient$Request.A01);
        if (intent == null) {
            r1 = this.A02;
            str = "Null native intent";
        } else {
            try {
                if (!0kR.A0I(intent, this.A01.A06, 64206)) {
                    r1 = this.A02;
                    str = "Native auth failed at launching";
                } else {
                    return;
                }
            } catch (ActivityNotFoundException e) {
                A01(loginClient$Request, this.A02, e.getMessage(), "native_auth_error");
                this.A00.A02();
                return;
            }
        }
        A01(loginClient$Request, r1, str, "native_auth_error");
        this.A00.A02();
    }

    public static HashMap A00(String str) {
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put(AnonymousClass000.A00(601), String.valueOf(AnonymousClass1G3.A03()));
        A1E.put("exception", str);
        return A1E;
    }

    public static void A01(LoginClient$Request loginClient$Request, 0lg r4, String str, String str2) {
        C9831Rht.A00(r4, str2, loginClient$Request.A01, A00(str), loginClient$Request.A02);
    }
}

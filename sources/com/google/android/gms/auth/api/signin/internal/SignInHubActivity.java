package com.google.android.gms.auth.api.signin.internal;

import X.002;
import X.AnonymousClass07i;
import X.AnonymousClass0fD;
import X.AnonymousClass3Qk;
import X.C11667SeA;
import X.C13109TLs;
import X.C41845B3m;
import X.DbS;
import X.Pxe;
import X.Pxh;
import X.SHF;
import X.SPD;
import android.accounts.Account;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@KeepName
public class SignInHubActivity extends FragmentActivity {
    public static boolean A05;
    public int A00;
    public Intent A01;
    public SignInConfiguration A02;
    public boolean A03 = false;
    public boolean A04;

    /* JADX WARNING: type inference failed for: r3v0, types: [com.google.android.gms.auth.api.signin.internal.SignInHubActivity, android.app.Activity] */
    private final void A00(int i) {
        Status status = new Status(i, (String) null);
        Intent A09 = DbS.A09();
        A09.putExtra("googleSignInStatus", status);
        setResult(0, A09);
        finish();
        A05 = false;
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [X.07Z, android.content.Context, com.google.android.gms.auth.api.signin.internal.SignInHubActivity, android.app.Activity] */
    public final void onActivityResult(int i, int i2, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        RuntimeException runtimeException;
        if (!this.A03) {
            setResult(0);
            if (i == 40962) {
                int i3 = 8;
                Intent intent2 = intent;
                if (intent != null) {
                    SignInAccount signInAccount = (SignInAccount) intent2.getParcelableExtra("signInAccount");
                    if (signInAccount != null && (googleSignInAccount = signInAccount.zbc) != null) {
                        SHF A002 = SHF.A00(this);
                        GoogleSignInOptions googleSignInOptions = this.A02.A00;
                        synchronized (A002) {
                            SPD spd = A002.A02;
                            AnonymousClass3Qk.A02(googleSignInOptions);
                            String str = googleSignInAccount.A08;
                            spd.A04("defaultGoogleSignInAccount", str);
                            AnonymousClass3Qk.A02(googleSignInOptions);
                            String A0g = 002.A0g("googleSignInAccount", ":", str);
                            JSONObject A11 = DbS.A11();
                            try {
                                String str2 = googleSignInAccount.A04;
                                if (str2 != null) {
                                    A11.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str2);
                                }
                                String str3 = googleSignInAccount.A05;
                                if (str3 != null) {
                                    A11.put("tokenId", str3);
                                }
                                String str4 = googleSignInAccount.A06;
                                if (str4 != null) {
                                    A11.put("email", str4);
                                }
                                String str5 = googleSignInAccount.A07;
                                if (str5 != null) {
                                    A11.put(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME, str5);
                                }
                                String str6 = googleSignInAccount.A09;
                                if (str6 != null) {
                                    A11.put("givenName", str6);
                                }
                                String str7 = googleSignInAccount.A0A;
                                if (str7 != null) {
                                    A11.put("familyName", str7);
                                }
                                Uri uri = googleSignInAccount.A03;
                                if (uri != null) {
                                    A11.put("photoUrl", uri.toString());
                                }
                                String str8 = googleSignInAccount.A00;
                                if (str8 != null) {
                                    A11.put("serverAuthCode", str8);
                                }
                                A11.put("expirationTime", googleSignInAccount.A02);
                                A11.put("obfuscatedIdentifier", str);
                                JSONArray A1E = Pxe.A1E();
                                List list = googleSignInAccount.A0B;
                                Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
                                Arrays.sort(scopeArr, C13109TLs.A00);
                                for (Scope scope : scopeArr) {
                                    A1E.put(scope.A01);
                                }
                                A11.put("grantedScopes", A1E);
                                A11.remove("serverAuthCode");
                                spd.A04(A0g, A11.toString());
                                String A0g2 = 002.A0g("googleSignInOptions", ":", str);
                                JSONObject A112 = DbS.A11();
                                try {
                                    JSONArray A1E2 = Pxe.A1E();
                                    ArrayList arrayList = googleSignInOptions.A08;
                                    Collections.sort(arrayList, GoogleSignInOptions.A0I);
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        A1E2.put(((Scope) it.next()).A01);
                                    }
                                    A112.put("scopes", A1E2);
                                    Account account = googleSignInOptions.A00;
                                    if (account != null) {
                                        A112.put("accountName", account.name);
                                    }
                                    A112.put("idTokenRequested", googleSignInOptions.A05);
                                    A112.put("forceCodeForRefreshToken", googleSignInOptions.A0A);
                                    A112.put("serverAuthRequested", googleSignInOptions.A09);
                                    String str9 = googleSignInOptions.A01;
                                    if (!TextUtils.isEmpty(str9)) {
                                        A112.put("serverClientId", str9);
                                    }
                                    String str10 = googleSignInOptions.A02;
                                    if (!TextUtils.isEmpty(str10)) {
                                        A112.put("hostedDomain", str10);
                                    }
                                    spd.A04(A0g2, A112.toString());
                                    A002.A00 = googleSignInAccount;
                                    A002.A01 = googleSignInOptions;
                                } catch (JSONException e) {
                                    runtimeException = C41845B3m.A0j(e);
                                    throw runtimeException;
                                }
                            } catch (JSONException e2) {
                                runtimeException = C41845B3m.A0j(e2);
                                throw runtimeException;
                            }
                        }
                        intent2.removeExtra("signInAccount");
                        intent2.putExtra("googleSignInAccount", googleSignInAccount);
                        this.A04 = true;
                        this.A00 = i2;
                        this.A01 = intent2;
                        AnonymousClass07i.A00(this).A02((Bundle) null, new C11667SeA(this), 0);
                        A05 = false;
                        return;
                    } else if (intent2.hasExtra("errorCode") && (i3 = intent2.getIntExtra("errorCode", 8)) == 13) {
                        i3 = 12501;
                    }
                }
                A00(i3);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.07Z, androidx.activity.ComponentActivity, android.content.Context, com.google.android.gms.auth.api.signin.internal.SignInHubActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        int i2;
        String packageName;
        int A002 = AnonymousClass0fD.A00(-1639906415);
        SignInHubActivity.super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action != null) {
            if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
                A00(12500);
                i2 = -1030414423;
            } else {
                boolean equals = action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN");
                if (equals || action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
                    Bundle bundleExtra = intent.getBundleExtra("config");
                    if (bundleExtra != null) {
                        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
                        if (signInConfiguration == null) {
                            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
                            setResult(0);
                            finish();
                            i2 = -677715940;
                        } else {
                            this.A02 = signInConfiguration;
                            if (bundle != null) {
                                boolean z = bundle.getBoolean("signingInGoogleApiClients");
                                this.A04 = z;
                                if (z) {
                                    this.A00 = bundle.getInt("signInResultCode");
                                    Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                                    if (intent2 != null) {
                                        this.A01 = intent2;
                                        AnonymousClass07i.A00(this).A02((Bundle) null, new C11667SeA(this), 0);
                                        A05 = false;
                                        i2 = 1417466859;
                                    } else {
                                        i = -1314743039;
                                    }
                                } else {
                                    i2 = -541711958;
                                }
                            } else if (A05) {
                                setResult(0);
                                A00(12502);
                                i2 = -1680183990;
                            } else {
                                A05 = true;
                                Intent A0G = Pxe.A0G(action);
                                if (equals) {
                                    packageName = "com.google.android.gms";
                                } else {
                                    packageName = getPackageName();
                                }
                                A0G.setPackage(packageName);
                                A0G.putExtra("config", this.A02);
                                try {
                                    startActivityForResult(A0G, 40962);
                                } catch (ActivityNotFoundException unused) {
                                    this.A03 = true;
                                    Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
                                    A00(17);
                                }
                                i2 = -1174643578;
                            }
                        }
                    } else {
                        i = -812549903;
                    }
                } else {
                    Pxh.A1L("Unknown action: ", String.valueOf(intent.getAction()), "AuthSignInClient");
                    finish();
                    i2 = -417818207;
                }
            }
            AnonymousClass0fD.A07(i2, A002);
            return;
        }
        i = -1067329039;
        AnonymousClass0fD.A07(i, A002);
        throw null;
    }

    public final void onDestroy() {
        int A002 = AnonymousClass0fD.A00(641151584);
        SignInHubActivity.super.onDestroy();
        A05 = false;
        AnonymousClass0fD.A07(489646596, A002);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        SignInHubActivity.super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.A04);
        if (this.A04) {
            bundle.putInt("signInResultCode", this.A00);
            bundle.putParcelable("signInResultData", this.A01);
        }
    }
}

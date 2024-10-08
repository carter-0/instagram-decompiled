package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.FragmentActivity;
import com.facebook.browser.lite.webview.SystemWebView;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.instagram.acp.igacpsecuritykey.IGACPSecurityKeySignInActivity;
import java.util.HashMap;

/* renamed from: X.Sbx  reason: case insensitive filesystem */
public final class C11536Sbx implements 00W {
    public final int A00;
    public final Object A01;

    public C11536Sbx(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r0v33, types: [X.QcV, android.webkit.WebView] */
    public final /* bridge */ /* synthetic */ void Cti(Object obj) {
        Integer num;
        long j;
        String str;
        String str2;
        String obj2;
        boolean z;
        RDE rde;
        C262224Cq r4;
        MHD mhd;
        byte[] bArr;
        byte[] byteArrayExtra;
        switch (this.A00) {
            case 0:
                ActivityResult activityResult = (ActivityResult) obj;
                0qQ.A0B(activityResult, 0);
                Intent intent = activityResult.A01;
                if (intent != null) {
                    SlZ slZ = (SlZ) this.A01;
                    String stringExtra = intent.getStringExtra("result_operation_type");
                    String str3 = "";
                    if (stringExtra == null) {
                        stringExtra = str3;
                    }
                    slZ.A01 = stringExtra;
                    if (activityResult.A00 == 0) {
                        String stringExtra2 = intent.getStringExtra("error");
                        if (stringExtra2 != null) {
                            str3 = stringExtra2;
                        }
                        if (str3.equals("LOGIN_CANCELLED_BY_USER")) {
                            num = AnonymousClass05K.A00;
                        } else {
                            num = AnonymousClass05K.A01;
                        }
                        slZ.A02(num);
                        return;
                    }
                    if (!stringExtra.equals("refresh_access_token")) {
                        slZ.A02(AnonymousClass05K.A0C);
                    }
                    String stringExtra3 = intent.getStringExtra("access_token");
                    int intExtra = intent.getIntExtra("access_token_expiry_time", 0);
                    SHI shi = SHI.A04;
                    if (shi != null) {
                        C10532Rtl rtl = shi.A02;
                        rtl.A02 = stringExtra3;
                        rtl.A00 = (long) intExtra;
                        rtl.A01 = AnonymousClass05K.A0N;
                        FragmentActivity activity = slZ.A04.getActivity();
                        if (activity != null) {
                            S8D.A01(activity, shi);
                        }
                    }
                    slZ.A01();
                    return;
                }
                return;
            case 1:
                ActivityResult activityResult2 = (ActivityResult) obj;
                0qQ.A0B(activityResult2, 0);
                Intent intent2 = activityResult2.A01;
                if (intent2 != null) {
                    C12048Sla sla = (C12048Sla) this.A01;
                    String stringExtra4 = intent2.getStringExtra("result_type");
                    sla.A00 = stringExtra4;
                    if (activityResult2.A00 == 0) {
                        String stringExtra5 = intent2.getStringExtra("error");
                        if (0qQ.A0K(stringExtra5, "LOGIN_CANCELED_BY_USER") || (sla.A09 && 0qQ.A0K(stringExtra5, "LOGIN_CANCELLED_BY_USER"))) {
                            z = true;
                        } else {
                            z = false;
                        }
                        S14 s14 = sla.A03;
                        if (z) {
                            rde = RDE.A04;
                        } else {
                            rde = RDE.A02;
                        }
                        s14.A00(rde);
                        return;
                    }
                    if (!0qQ.A0K(stringExtra4, "refresh_token")) {
                        sla.A03.A00(RDE.A03);
                    }
                    C340027ka r7 = sla.A04;
                    boolean z2 = sla.A09;
                    0qQ.A0B(r7, 1);
                    String stringExtra6 = intent2.getStringExtra("access_token");
                    int intExtra2 = intent2.getIntExtra("expiry_time", 0);
                    if (z2) {
                        stringExtra6 = intent2.getStringExtra("access_token");
                        intExtra2 = intent2.getIntExtra("access_token_expiry_time", 0);
                    }
                    SPF spf = SPF.A06;
                    if (spf == null) {
                        0KC.A0E("BwPExtUtil", "BwPContext is null!");
                    } else {
                        C10533Rtm rtm = spf.A03;
                        rtm.A02 = stringExtra6;
                        rtm.A00 = (long) intExtra2;
                        rtm.A01 = AnonymousClass05K.A0N;
                        FragmentActivity activity2 = r7.getActivity();
                        if (activity2 != null) {
                            S8E.A01(activity2, spf, false);
                        }
                    }
                    Bundle bundle = sla.A02;
                    String str4 = sla.A00;
                    0qQ.A0B(bundle, 0);
                    SPF spf2 = SPF.A06;
                    if (spf2 == null) {
                        0KC.A0D("BwPExtUtil", "BwPContext is null");
                        return;
                    }
                    String str5 = SPF.A07;
                    if (str5 == null || str5.length() == 0 || !spf2.A04(str5)) {
                        str5 = spf2.A01.A03;
                    }
                    QLA C8U = r7.C8U();
                    if (C8U != null && str5 != null && str5.length() != 0) {
                        ((SystemWebView) C8U).A04.loadUrl(str5, spf2.A04.A00());
                        Object obj3 = bundle.get("ad_id");
                        if (obj3 == null || (obj2 = obj3.toString()) == null) {
                            j = 0;
                        } else {
                            j = Long.parseLong(obj2);
                        }
                        Object obj4 = bundle.get("iab_session_id");
                        String str6 = "";
                        if (obj4 == null || (str = obj4.toString()) == null) {
                            str = str6;
                        }
                        HashMap A1E = AnonymousClass7TE.A1E();
                        if ("new_token".equals(str4)) {
                            str2 = "PAGE_LOAD_AFTER_AUTH_SUCCESS";
                        } else {
                            str2 = "PAGE_LOAD_AFTER_TOKEN_REFRESH";
                        }
                        String A0d = Pxi.A0d(bundle, "media_id");
                        if (A0d != null) {
                            str6 = A0d;
                        }
                        A1E.put("pageLoadSource", str2);
                        A1E.put("tokenSource", RUC.A00(spf2.A03.A01));
                        A1E.put("is_organic", String.valueOf(spf2.A02));
                        A1E.put("media_id", str6);
                        SRY.A00().A04(j, "PAGE_LOADED", str, A1E);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                0qQ.A0B(obj, 0);
                C11621SdP sdP = (C11621SdP) this.A01;
                r4 = sdP.A03;
                mhd = new MHD(obj, (Object) sdP, (AnonymousClass4D7) null, 0);
                break;
            case 3:
                0qQ.A0B(obj, 0);
                C11621SdP sdP2 = (C11621SdP) this.A01;
                r4 = sdP2.A03;
                mhd = new MHD(obj, (Object) sdP2, (AnonymousClass4D7) null, 1);
                break;
            case 4:
                Boolean bool = (Boolean) obj;
                0qQ.A0B(bool, 0);
                boolean booleanValue = bool.booleanValue();
                U7x u7x = (U7x) this.A01;
                if (booleanValue) {
                    u7x.A04 = false;
                    U7x.A02(u7x);
                    return;
                }
                if (!u7x.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                    u7x.A04 = true;
                } else {
                    u7x.A04 = false;
                }
                U7x.A01(u7x);
                return;
            case 5:
                Boolean bool2 = (Boolean) obj;
                0qQ.A0B(bool2, 0);
                if (bool2.booleanValue()) {
                    String A002 = AnonymousClass2E0.A0F().A00("FulfillmentOptionViewModel");
                    AnonymousClass2Fj r1 = ((QDR) this.A01).A06;
                    if (!0qQ.A0K(A002, r1.A02())) {
                        r1.A0B(A002);
                        return;
                    }
                    return;
                }
                return;
            default:
                ActivityResult activityResult3 = (ActivityResult) obj;
                0qQ.A0B(activityResult3, 0);
                Intent intent3 = activityResult3.A01;
                if (intent3 != null) {
                    bArr = intent3.getByteArrayExtra("FIDO2_CREDENTIAL_EXTRA");
                } else {
                    bArr = null;
                }
                if (activityResult3.A00 != -1 || bArr == null) {
                    IGACPSecurityKeySignInActivity iGACPSecurityKeySignInActivity = (IGACPSecurityKeySignInActivity) this.A01;
                    if (intent3 == null || (byteArrayExtra = intent3.getByteArrayExtra("FIDO2_ERROR_EXTRA")) == null) {
                        IGACPSecurityKeySignInActivity.A01(iGACPSecurityKeySignInActivity, (Integer) null, (String) null);
                        return;
                    }
                    AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) SafeParcelableSerializer.A00(AuthenticatorErrorResponse.CREATOR, byteArrayExtra);
                    0qQ.A07(authenticatorErrorResponse);
                    IGACPSecurityKeySignInActivity.A01(iGACPSecurityKeySignInActivity, Integer.valueOf(authenticatorErrorResponse.A00.A00), authenticatorErrorResponse.A01);
                    return;
                }
                PublicKeyCredential publicKeyCredential = (PublicKeyCredential) SafeParcelableSerializer.A00(PublicKeyCredential.CREATOR, bArr);
                0qQ.A07(publicKeyCredential);
                Object obj5 = publicKeyCredential.A02;
                if (obj5 == null && (obj5 = publicKeyCredential.A01) == null && (obj5 = publicKeyCredential.A03) == null) {
                    throw AnonymousClass7TE.A0z("No response set.");
                } else if (obj5 instanceof AuthenticatorErrorResponse) {
                    AuthenticatorErrorResponse authenticatorErrorResponse2 = (AuthenticatorErrorResponse) obj5;
                    IGACPSecurityKeySignInActivity.A01((IGACPSecurityKeySignInActivity) this.A01, Integer.valueOf(authenticatorErrorResponse2.A00.A00), authenticatorErrorResponse2.A01);
                    return;
                } else if (obj5 instanceof AuthenticatorAssertionResponse) {
                    Activity activity3 = (Activity) this.A01;
                    String A10 = DbT.A10(IGACPSecurityKeySignInActivity.A00((AuthenticatorAssertionResponse) obj5));
                    Intent A09 = DbS.A09();
                    activity3.setResult(-1, A09);
                    A09.putExtra("extra_result_code", A10);
                    activity3.finish();
                    return;
                } else {
                    return;
                }
        }
        AnonymousClass7TE.A1Z(mhd, r4);
    }
}

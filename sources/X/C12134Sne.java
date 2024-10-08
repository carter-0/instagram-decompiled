package X;

import android.content.Intent;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.facebook.AccessToken;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.login.LoginClient$Request;
import com.facebook.login.LoginClient$Result;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Date;

/* renamed from: X.Sne  reason: case insensitive filesystem */
public final class C12134Sne implements C13710TfX, CallerContextable {
    public static final CallerContext A03 = CallerContext.A00(C12134Sne.class);
    public static final String __redex_internal_original_name = "FxCalLoginMethodHandler";
    public SP4 A00;
    public SP4 A01;
    public 0lg A02;

    public final boolean Ctj(Intent intent, int i, int i2) {
        LoginClient$Result loginClient$Result;
        String str;
        String str2;
        String str3;
        LoginClient$Request loginClient$Request = this.A01.A01;
        String str4 = "Operation canceled";
        if (intent != null) {
            AbstractMap abstractMap = (AbstractMap) intent.getSerializableExtra(AnonymousClass000.A00(131));
            if (abstractMap != null) {
                str = DbS.A0r("error", abstractMap);
            } else {
                str = null;
            }
            int i3 = i2;
            if (i2 == 0) {
                if (str != null) {
                    str4 = str;
                }
            } else if (i3 != -1 || abstractMap == null) {
                if (str == null) {
                    str = C66579MXk.A00(592);
                }
                loginClient$Result = LoginClient$Result.A02(loginClient$Request, str, "", (String) null);
                this.A00.A04(loginClient$Result);
                return true;
            } else {
                String A0r = DbS.A0r("error", abstractMap);
                if (A0r == null) {
                    try {
                        String A0i = Pxf.A0i("tokenString", abstractMap);
                        if (TextUtils.isEmpty(A0i)) {
                            loginClient$Result = LoginClient$Result.A02(loginClient$Request, "Token is null", "", (String) null);
                        } else {
                            if (abstractMap.get("userID") == null) {
                                str3 = "";
                            } else {
                                str3 = DbS.A0r("userID", abstractMap);
                            }
                            Date date = AccessToken.A0A;
                            loginClient$Result = LoginClient$Result.A00(new AccessToken(AnonymousClass05K.A1F, A0i, AnonymousClass1KO.A02, str3, EW3.A04.A00, (Collection) null, (Date) null, new Date()), loginClient$Request);
                        }
                    } catch (TQM e) {
                        if (e.getMessage() != null) {
                            str2 = e.getMessage();
                        } else {
                            str2 = "Token invalid";
                        }
                        loginClient$Result = LoginClient$Result.A02(loginClient$Request, "", str2, (String) null);
                    }
                } else if (C10070Rm7.A00.contains(A0r)) {
                    this.A00.A02();
                    return true;
                } else if (C10070Rm7.A01.contains(A0r)) {
                    loginClient$Result = LoginClient$Result.A01(loginClient$Request, A0r);
                } else {
                    loginClient$Result = LoginClient$Result.A02(loginClient$Request, A0r, "", (String) null);
                }
                this.A00.A04(loginClient$Result);
                return true;
            }
        }
        loginClient$Result = LoginClient$Result.A01(loginClient$Request, str4);
        this.A00.A04(loginClient$Result);
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.EmJ, java.lang.Object] */
    public final void FI6(LoginClient$Request loginClient$Request) {
        try {
            Fragment fragment = this.A01.A06;
            if (loginClient$Request.A01 == null) {
                loginClient$Request.A01 = "ig_default";
            }
            1Z9 A002 = C48920EmK.A00();
            if (A002.A00 == null) {
                A002.A00 = new Object();
            }
            new ELW().A01(fragment, this.A02, loginClient$Request.A01, (String) null, 64206);
        } catch (Exception unused) {
            this.A00.A02();
        }
    }
}

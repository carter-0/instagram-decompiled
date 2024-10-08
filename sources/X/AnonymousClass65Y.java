package X;

import android.content.Context;
import android.net.Uri;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

/* renamed from: X.65Y  reason: invalid class name */
public final class AnonymousClass65Y {
    public final Context A00;

    public AnonymousClass65Y(Context context) {
        0qQ.A0B(context, 1);
        this.A00 = context;
    }

    public final String A01(Long l, Long l2, String str, int i, boolean z, boolean z2) {
        String str2;
        0qQ.A0B(str, 0);
        Uri.Builder path = new Uri.Builder().path(AnonymousClass000.A00(1283));
        if (i == 2) {
            str2 = "did";
        } else {
            str2 = PublicKeyCredentialControllerUtility.JSON_KEY_ID;
        }
        Uri.Builder appendQueryParameter = path.appendQueryParameter(str2, str);
        if (l != null) {
            appendQueryParameter.appendQueryParameter("x", l.toString());
        }
        if (z) {
            appendQueryParameter.appendQueryParameter(TraceFieldType.TransportType, C254923tH.ACT.A00);
        }
        if (l2 != null && !z2) {
            appendQueryParameter.appendQueryParameter("mctid", l2.toString());
        }
        String obj = appendQueryParameter.toString();
        0qQ.A07(obj);
        return obj;
    }

    public final String A00(UserSession userSession, String str) {
        if (str == null) {
            return "";
        }
        if (str.length() == 0 || 0JC.A00().A04()) {
            return str;
        }
        String string = this.A00.getString(2131963987, new Object[]{AnonymousClass0t1.A01.A01(userSession).B8Q(), str});
        0qQ.A07(string);
        return string;
    }

    public AnonymousClass65Y() {
        this(C60960kU.A00);
    }
}

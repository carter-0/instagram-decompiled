package X;

import android.util.Base64;
import androidx.fragment.app.FragmentActivity;
import com.facebookpay.offsite.base.CheckoutHandler;
import com.facebookpay.offsite.models.message.GsonUtils;
import com.facebookpay.offsite.models.message.MessageType$Companion;
import com.facebookpay.offsite.models.message.ScriptOverrideRequest;
import com.facebookpay.offsite.models.message.StartCheckoutRequest;
import com.instagram.common.session.UserSession;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* renamed from: X.QhG  reason: case insensitive filesystem */
public final class C8124QhG extends C12435SuM {
    public final AnonymousClass2gO A00;
    public final C340027ka A01;
    public final C340027ka A02;
    public final S29 A03;
    public final String A04;
    public final ArrayList A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;
    public final UserSession A0A;

    public final void handleMessage(String str, String str2) {
        0qQ.A0B(str, 0);
        byte[] decode = Base64.decode(str, 0);
        0qQ.A07(decode);
        Charset charset = StandardCharsets.UTF_8;
        0qQ.A08(charset);
        String str3 = new String(decode, charset);
        GsonUtils gsonUtils = GsonUtils.INSTANCE;
        String messageType = gsonUtils.getMessageType(str3);
        if (0qQ.A0K(messageType, MessageType$Companion.START_CHECKOUT)) {
            StartCheckoutRequest toOffsiteStartCheckoutRequest = gsonUtils.getToOffsiteStartCheckoutRequest(str3);
            0rm A11 = C51965G9l.A11();
            FragmentActivity activity = this.A02.getActivity();
            if (activity != null) {
                activity.runOnUiThread(new C13042TIy(toOffsiteStartCheckoutRequest, this, A11));
            }
        } else if (0qQ.A0K(messageType, MessageType$Companion.SCRIPT_OVERRIDE)) {
            C11431STx A0D = AnonymousClass2E0.A0D();
            if (182.A06(0Tu.A05, A0D.A00, 36313514697885747L) && A0D.A01.getBoolean("script_injection", false) && str2 != null) {
                ScriptOverrideRequest toScriptOverrideRequest = gsonUtils.getToScriptOverrideRequest(str3);
                AnonymousClass0eM r2 = this.A07;
                ((CheckoutHandler) r2.getValue()).A0C = toScriptOverrideRequest.script;
                ((CheckoutHandler) r2.getValue()).A0D = str2;
            }
        } else {
            super.handleMessage(str, str2);
        }
    }

    public final String A02() {
        AnonymousClass0eM r1 = this.A09;
        String A002 = SDT.A00((SDT) r1.getValue());
        UserSession userSession = this.A0A;
        1Xj A0U = DbV.A0U(userSession, A002);
        String string = ((SDT) r1.getValue()).A00.getString("TrackingInfo.ARG_AD_ID");
        if (string != null || A0U == null) {
            return string;
        }
        return C231122qu.A07(userSession, A0U);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C8124QhG(X.C10981S3p r3, X.C340027ka r4, com.facebook.iabadscontext.IABAdsContext r5, com.instagram.common.session.UserSession r6, java.util.ArrayList r7, X.AnonymousClass0eM r8) {
        /*
            r2 = this;
            X.C51972G9s.A1D(r6, r7)
            X.S29 r1 = new X.S29
            r1.<init>(r4, r5, r6)
            androidx.fragment.app.FragmentActivity r0 = r4.getActivity()
            r2.<init>(r0, r3, r1, r8)
            r2.A02 = r4
            r2.A07 = r8
            r2.A03 = r1
            android.content.Intent r1 = r4.getIntent()
            if (r1 == 0) goto L_0x004a
            java.lang.String r0 = "BrowserLiteIntent.IABLoggingExtras.IAB_SESSION_ID"
            java.lang.String r0 = r1.getStringExtra(r0)
        L_0x0021:
            r2.A04 = r0
            r0 = 20
            X.Sdp r0 = X.C11647Sdp.A00(r3, r0)
            r2.A00 = r0
            r2.A01 = r4
            r2.A0A = r6
            r2.A05 = r7
            r0 = 30
            X.0t0 r0 = X.C58675Ivk.A00(r2, r0)
            r2.A09 = r0
            r0 = 29
            X.0t0 r0 = X.C58675Ivk.A00(r2, r0)
            r2.A08 = r0
            r0 = 28
            X.0t0 r0 = X.C58675Ivk.A00(r2, r0)
            r2.A06 = r0
            return
        L_0x004a:
            r0 = 0
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8124QhG.<init>(X.S3p, X.7ka, com.facebook.iabadscontext.IABAdsContext, com.instagram.common.session.UserSession, java.util.ArrayList, X.0eM):void");
    }
}

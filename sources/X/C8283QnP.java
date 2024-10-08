package X;

import android.text.TextUtils;
import android.util.Log;
import com.facebook.proxygen.TraceFieldType;
import com.facebookpay.logging.FBPayLoggerData;
import com.fbpay.ptt.impl.javacpp.ServerCertsVerifierImpl;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.QnP  reason: case insensitive filesystem */
public final class C8283QnP extends SSC implements C13738TgA {
    public SJB A00;
    public final 2FO A01;
    public final ServerCertsVerifierImpl A02;
    public final C10490Rt5 A03;
    public final boolean A04;

    public final void AWF(SJB sjb) {
        this.A00 = sjb;
        SSC.A04(this.A03.A00, this);
    }

    public C8283QnP(2FO r1, SJB sjb, ServerCertsVerifierImpl serverCertsVerifierImpl, AnonymousClass5A3 r4, C10490Rt5 rt5, boolean z) {
        super(r4);
        this.A03 = rt5;
        this.A02 = serverCertsVerifierImpl;
        this.A00 = sjb;
        this.A04 = z;
        this.A01 = r1;
    }

    public final 2Fk Bsc(C10784Ry5 ry5) {
        String str;
        C7422QCn A032 = SSC.A03(this);
        SUj A0W = Pxe.A0W(A032);
        HashMap A1E = AnonymousClass7TE.A1E();
        2FO r2 = this.A01;
        if (r2 != null) {
            A1E.put(Py7.A00(), C2818159r.A01());
            A1E.put("flow_name", 2M7.A0K.toString());
            A1E.put("logger_data", new FBPayLoggerData(new C11249SHj()));
            r2.Cgl("client_load_paysec_init", A1E);
        }
        if (SUj.A0V(A0W)) {
            A0W.getClass();
            C10449RsQ rsQ = (C10449RsQ) SUj.A0D(A0W);
            X509Certificate x509Certificate = rsQ.A00;
            if (x509Certificate == null) {
                List list = rsQ.A01;
                synchronized (this) {
                    str = "";
                    if (!this.A04) {
                        str = this.A02.verifyCerts(list);
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    if (r2 != null) {
                        A1E.put("error_message", "FBPay Certificate Error: ".concat(str));
                        A1E.put(TraceFieldType.ErrorCode, RealtimeSubscription.GRAPHQL_MQTT_VERSION);
                        A1E.put("error_stacktrace", Log.getStackTraceString(AnonymousClass7TE.A15("certificate error")));
                        r2.Cgl("client_load_paysec_fail", A1E);
                    }
                    AWF(this.A00);
                    SSC.A05(this);
                    return AnonymousClass72Y.A01(A032, new TPJ(7, ry5, this));
                }
            } else if (new Date(System.currentTimeMillis() + 3600000).after(x509Certificate.getNotAfter())) {
                AWF(this.A00);
            }
        }
        if (r2 != null) {
            r2.Cgl("client_load_paysec_success", A1E);
        }
        SSC.A05(this);
        return AnonymousClass72Y.A01(A032, new TPJ(7, ry5, this));
    }
}

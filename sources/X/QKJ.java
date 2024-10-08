package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.facebook.browser.lite.webview.SystemWebView;
import com.instagram.common.session.UserSession;
import com.meta.foa.session.FoaUserSession;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public abstract class QKJ extends QKM {
    public C270254gR A00;
    public STY A01;
    public S33 A02;

    /* JADX WARNING: type inference failed for: r3v2, types: [X.QcV, android.view.View] */
    public final void onCancel(DialogInterface dialogInterface) {
        RRP A06;
        C61080JwI jwI;
        FoaUserSession foaUserSession;
        UserSession A002;
        ? r3;
        List A13;
        Object obj;
        C61084JwM jwM;
        0qQ.A0B(dialogInterface, 0);
        STY sty = this.A01;
        if (sty != null) {
            STY.A02(sty, (SGp) null);
            C270254gR r8 = sty.A0T;
            C10860RzL rzL = r8.A00;
            Object obj2 = AnonymousClass05K.A00;
            0qQ.A0B(rzL, 0);
            C61038Jvc jvc = rzL.A0P;
            String str = jvc.A03;
            Integer num = null;
            if (!(str == null || (A13 = C66580MXl.A13(str, (Map) rzL.A0K.A02)) == null)) {
                ListIterator A18 = C51968G9o.A18(A13);
                while (true) {
                    if (!A18.hasPrevious()) {
                        obj = null;
                        break;
                    }
                    obj = A18.previous();
                    C59721JVf jVf = (C59721JVf) obj;
                    C61084JwM jwM2 = (C61084JwM) jVf.A01;
                    if (jwM2.A00 == obj2 && jwM2.A02 == obj2 && jVf.A00 == AnonymousClass05K.A01) {
                        break;
                    }
                }
                C59721JVf jVf2 = (C59721JVf) obj;
                if (!(jVf2 == null || (jwM = (C61084JwM) jVf2.A01) == null)) {
                    num = (Integer) jwM.A01;
                }
            }
            String str2 = "DECLINED_AUTOFILL";
            if (num == null || num != obj2) {
                rzL.A0L.A00 = AnonymousClass05K.A0N;
                STY.A01(sty);
                C7580QKv qKv = sty.A04;
                qKv.A01++;
                if (rzL.A0J.A00 == RF6.NOT_OPT_IN) {
                    SUR.A0B(r8, qKv, sty.A06("NOT_NOW_CLICK"));
                    str2 = "DECLINED_PREFETCH";
                }
                if (num != null) {
                    String A003 = S8H.A00(num);
                    A06 = sty.A06(str2);
                    A06.A0H = A003;
                } else {
                    A06 = sty.A06(str2);
                }
                C11364SPc.A03(qKv, A06);
                SUR.A0B(r8, qKv, A06);
                QLA qla = sty.A07;
                Context context = qKv.A00;
                UserSession userSession = r8.A04.A00;
                0Tu r4 = 0Tu.A05;
                if (0qQ.A0K(Pxe.A0w(r4, userSession, 36885810498634400L), "PERSISTENT") && C11392SRg.A04(rzL) && qla != null && (r3 = ((SystemWebView) qla).A04) != 0) {
                    r3.postDelayed(new TFV(r3, context), 200);
                }
                if (context != null) {
                    String A0w = Pxe.A0w(r4, userSession, 36885810504925871L);
                    if (A0w.length() != 0 && 1Wj.A00 != null && (jwI = rzL.A01) != null && (foaUserSession = (FoaUserSession) jwI.A00) != null && (A002 = C56316HwT.A00(foaUserSession)) != null) {
                        LinkedHashMap A1H = AnonymousClass7TE.A1H();
                        A1H.put("autofill_type", "payment_info");
                        A1H.put(Pxz.A00(9, 10, 87), 002.A0T(jvc.A02, rzL.A05.A05, ','));
                        1Wj r0 = 1Wj.A00;
                        if (r0 != null) {
                            r0.A02((Activity) context, A002, A0w, A1H);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            RRP A062 = sty.A06(str2);
            A062.A0H = "CONTACT_AUTOFILL";
            C7580QKv qKv2 = sty.A04;
            C11364SPc.A03(qKv2, A062);
            SUR.A0B(r8, qKv2, A062);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1401173168);
        if (bundle != null) {
            A07();
        }
        super.onCreate(bundle);
        AnonymousClass0fD.A09(-839175257, A022);
    }
}

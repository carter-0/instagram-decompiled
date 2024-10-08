package X;

import android.webkit.CookieManager;
import androidx.fragment.app.FragmentActivity;
import com.facebookpay.offsite.base.CheckoutHandler;
import com.facebookpay.offsite.models.message.PaymentRequest;
import com.facebookpay.offsite.models.message.StartCheckoutRequest;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.TIy  reason: case insensitive filesystem */
public final class C13042TIy implements Runnable {
    public final /* synthetic */ StartCheckoutRequest A00;
    public final /* synthetic */ C8124QhG A01;
    public final /* synthetic */ 0rm A02;

    public C13042TIy(StartCheckoutRequest startCheckoutRequest, C8124QhG qhG, 0rm r3) {
        this.A00 = startCheckoutRequest;
        this.A02 = r3;
        this.A01 = qhG;
    }

    public final void run() {
        String str;
        String str2;
        String str3;
        StartCheckoutRequest startCheckoutRequest = this.A00;
        List<String> list = startCheckoutRequest.content.cookieNames;
        if (list != null && !list.isEmpty()) {
            0rm r8 = this.A02;
            List<String> list2 = startCheckoutRequest.content.cookieNames;
            QLA C8U = this.A01.A02.C8U();
            if (C8U != null) {
                str3 = C8U.A05();
            } else {
                str3 = null;
            }
            ArrayList arrayList = null;
            if (str3 != null) {
                String A002 = C9649ReT.A00(str3);
                Pattern pattern = SCX.A01;
                RUF.A00();
                String cookie = CookieManager.getInstance().getCookie(A002);
                if (cookie != null) {
                    List A0Q = 00l.A0Q(cookie, new char[]{';'}, 0);
                    ArrayList A0r = AnonymousClass7TG.A0r(A0Q);
                    Iterator it = A0Q.iterator();
                    while (it.hasNext()) {
                        DbU.A1X(00l.A0B(AnonymousClass7TE.A18(it)), A0r);
                    }
                    arrayList = AnonymousClass7TE.A1C();
                    for (Object next : A0r) {
                        String str4 = (String) next;
                        String A12 = DbV.A12(00l.A0J(str4, str4, '='));
                        if (list2 != null) {
                            if (list2.contains(A12)) {
                                arrayList.add(next);
                            } else if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                Iterator<String> it2 = list2.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (new 11S(AnonymousClass7TE.A18(it2)).A08(A12)) {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            r8.A00 = arrayList;
        }
        0rm r2 = this.A02;
        if (r2.A00 != null) {
            str = new Gson().A0B(r2.A00);
        } else {
            str = null;
        }
        C8124QhG qhG = this.A01;
        PaymentRequest AMa = qhG.A00.AMa();
        if (AMa != null) {
            qhG.A01(AMa.content);
            ArrayList A1C = AnonymousClass7TE.A1C();
            if (str != null) {
                Pxi.A1L("COOKIES", str, A1C);
            }
            String str5 = startCheckoutRequest.content.handle;
            if (str5 != null) {
                Pxi.A1L("JS_HANDLE", str5, A1C);
            }
            AnonymousClass0eM r7 = qhG.A07;
            String str6 = CheckoutHandler.A00((CheckoutHandler) r7.getValue()).A07;
            if (str6 != null) {
                Pxi.A1L("ORDER_STUB_ID", str6, A1C);
            }
            C340027ka r3 = qhG.A02;
            QLA C8U2 = r3.C8U();
            if (C8U2 != null) {
                str2 = C8U2.A05();
            } else {
                str2 = null;
            }
            String A003 = C9649ReT.A00(str2);
            if (A003 != null) {
                AnonymousClass2Fj A09 = ((CheckoutHandler) r7.getValue()).A09(AMa, A003, SUR.A05(qhG.A05), A1C);
                FragmentActivity activity = r3.getActivity();
                if (activity != null) {
                    A09.A06(activity, qhG.A00);
                }
            }
        }
    }
}

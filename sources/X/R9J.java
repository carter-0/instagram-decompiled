package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.facebook.secure.securewebview.SecureWebView;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;

public final class R9J extends C14097Tpp {
    public final /* synthetic */ Collection A00;

    public final /* bridge */ /* synthetic */ Object A0K(View view, C307786Rm r11, C276544tV r12, Object obj) {
        C7889QcF qcF = (C7889QcF) ((SecureWebView) view);
        C276544tV r8 = r12;
        qcF.A00 = r12.A0R(49, false);
        qcF.onResume();
        C307786Rm r7 = r11;
        C10523Rtc rtc = (C10523Rtc) C307476Qg.A06(r11, r12);
        FragmentActivity A002 = RSR.A00(r11.A00);
        if (A002 != null) {
            rtc.A00.A00 = qcF;
            if (!rtc.A02) {
                rtc.A02 = true;
                00N onBackPressedDispatcher = A002.getOnBackPressedDispatcher();
                QAF qaf = rtc.A00;
                0qQ.A0B(qaf, 0);
                onBackPressedDispatcher.A03(qaf);
            }
        }
        if (rtc.A01 == null) {
            String str = "";
            String str2 = str;
            String A0H = r12.A0H();
            if (A0H != null) {
                str2 = A0H;
            }
            String A0G = r12.A0G();
            if (A0G != null) {
                str = A0G;
            }
            boolean equals = "POST".equals(str.toUpperCase(Locale.US));
            Collection collection = this.A00;
            if (equals) {
                qcF.setCookieStringsInsecure(str2, collection);
                qcF.loadData("<html> <head>  <script> function post(input) { var sourceURI = input['inlineUrl'];var params = input['bodyParams'];var method = \"POST\"; var form = document.createElement(\"form\"); form.setAttribute(\"method\", method);   form.setAttribute(\"action\", sourceURI); var jsonObj = JSON.parse(params);for(var key in jsonObj) { if(jsonObj.hasOwnProperty(key)) { var hiddenField = document.createElement(\"input\");   hiddenField.setAttribute(\"type\", \"hidden\");    hiddenField.setAttribute(\"name\", key);      hiddenField.setAttribute(\"value\", jsonObj[key]);          form.appendChild(hiddenField); } } document.body.appendChild(form);form.submit(); }   </script>  </head> <body></body> </html>", ReactWebViewManager.HTML_MIME_TYPE, ReactWebViewManager.HTML_ENCODING);
            } else {
                qcF.A03(C9950Rk3.A00, str2, collection, (Map) null);
            }
        }
        qcF.A01.A00 = new C10725Rx3(this, qcF, rtc, r7, r8);
        return null;
    }

    public final boolean A0N(C276544tV r2, C276544tV r3, Object obj, Object obj2) {
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public R9J(C307786Rm r1, C276544tV r2, Collection collection) {
        super(r1, r2);
        this.A00 = collection;
    }

    public final /* bridge */ /* synthetic */ void A0M(View view, C307786Rm r5, C276544tV r6, Object obj, Object obj2) {
        C7889QcF qcF = (C7889QcF) ((SecureWebView) view);
        qcF.A01.A00 = null;
        qcF.onPause();
        QAF qaf = ((C10523Rtc) C307476Qg.A06(r5, r6)).A00;
        qaf.A00 = null;
        qaf.A04(false);
        qcF.stopLoading();
        qcF.clearHistory();
        qcF.loadData("", (String) null, (String) null);
    }

    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        C7889QcF qcF = new C7889QcF(context);
        qcF.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return qcF;
    }

    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw AnonymousClass00P.createAndThrow();
    }
}

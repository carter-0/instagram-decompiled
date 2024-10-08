package X;

import android.content.Context;
import com.facebook.browser.iabjs.ota.instagram.IgIABJSScriptFetcher$handleHttpResponseOnComplete$1;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class T6L implements 1Qd {
    public 2ZD A00;
    public final ByteArrayOutputStream A01 = Pxe.A0b();
    public final /* synthetic */ int A02;
    public final /* synthetic */ Context A03;
    public final /* synthetic */ SKG A04;
    public final /* synthetic */ QuickPerformanceLogger A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ 1IX A0A;

    public final void onNewData(ByteBuffer byteBuffer) {
        0qQ.A0B(byteBuffer, 0);
        JTU.A1I(this.A01, byteBuffer);
    }

    public T6L(Context context, SKG skg, QuickPerformanceLogger quickPerformanceLogger, String str, String str2, String str3, String str4, 1IX r9, int i) {
        this.A05 = quickPerformanceLogger;
        this.A02 = i;
        this.A0A = r9;
        this.A04 = skg;
        this.A03 = context;
        this.A06 = str;
        this.A08 = str2;
        this.A07 = str3;
        this.A09 = str4;
    }

    public final void onComplete() {
        Integer num;
        this.A0A.EJ1((0sP) null, (Object) null);
        SKG skg = this.A04;
        Context context = this.A03;
        String str = this.A06;
        String str2 = this.A08;
        String str3 = this.A07;
        String str4 = this.A09;
        QuickPerformanceLogger quickPerformanceLogger = this.A05;
        int i = this.A02;
        2ZD r3 = this.A00;
        ByteArrayOutputStream byteArrayOutputStream = this.A01;
        Integer num2 = null;
        if (r3 != null) {
            int i2 = r3.A01;
            if (Integer.valueOf(i2) != null && i2 >= 200 && i2 < 300 && byteArrayOutputStream.size() != 0) {
                quickPerformanceLogger.markerPoint(646459455, i, "http_response_success");
                quickPerformanceLogger.markerEnd(646459455, i, 2);
                AnonymousClass7TE.A1Z(new IgIABJSScriptFetcher$handleHttpResponseOnComplete$1(context, skg, quickPerformanceLogger, byteArrayOutputStream, str, str2, str3, str4, (AnonymousClass4D7) null, i), AnonymousClass1HX.A02(1027178141, 3));
                return;
            }
        }
        if (byteArrayOutputStream.size() == 0) {
            SKG.A00(quickPerformanceLogger, "http_response_error", "empty_http_response", i, 646459455);
            SKG.A01((Exception) null, "empty_http_response", str2, str3, str4, 646454053);
            return;
        }
        if (r3 != null) {
            num = Integer.valueOf(r3.A01);
        } else {
            num = null;
        }
        SKG.A00(quickPerformanceLogger, "http_response_error", String.valueOf(num), i, 646459455);
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("http_response_error ");
        if (r3 != null) {
            num2 = Integer.valueOf(r3.A01);
        }
        SKG.A01((Exception) null, AnonymousClass7TF.A0i(num2, A1A), str2, str3, str4, 646454053);
    }

    public final void onFailed(IOException iOException) {
        String message;
        String str = null;
        this.A0A.EJ1((0sP) null, (Object) null);
        QuickPerformanceLogger quickPerformanceLogger = this.A05;
        int i = this.A02;
        IOException iOException2 = iOException;
        if (iOException != null) {
            str = iOException.getMessage();
        }
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        SKG.A00(quickPerformanceLogger, "execute_http_request_error", str, i, 646459455);
        if (!(iOException == null || (message = iOException.getMessage()) == null)) {
            str2 = message;
        }
        SKG.A01(iOException2, 002.A0R("execute_http_request_error ", str2), this.A08, this.A07, this.A09, 646454053);
    }

    public final void onResponseStarted(2ZD r5) {
        this.A05.markerPoint(646459455, this.A02, "on_http_fetch_result");
        this.A00 = r5;
    }
}

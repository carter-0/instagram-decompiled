package X;

import android.os.SystemClock;
import com.facebookpay.logging.FBPayLoggerData;
import java.util.HashMap;

/* renamed from: X.Svh  reason: case insensitive filesystem */
public final class C12511Svh implements AnonymousClass5A7 {
    public final /* synthetic */ FBPayLoggerData A00;
    public final /* synthetic */ SHU A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public C12511Svh(FBPayLoggerData fBPayLoggerData, SHU shu, String str, boolean z) {
        this.A01 = shu;
        this.A03 = z;
        this.A02 = str;
        this.A00 = fBPayLoggerData;
    }

    public final /* bridge */ /* synthetic */ void DvN(Object obj) {
        String str;
        SHU shu = this.A01;
        Throwable th = ((S21) obj).A02;
        boolean A1a = DbW.A1a(th);
        boolean z = this.A03;
        String str2 = this.A02;
        FBPayLoggerData fBPayLoggerData = this.A00;
        long elapsedRealtime = SystemClock.elapsedRealtime() - shu.A00;
        if (A1a) {
            if (z) {
                str = "fetch_auth_flows_cached_content_success";
            } else {
                str = "fetch_auth_flows_content_success";
            }
        } else if (z) {
            str = "fetch_auth_flows_cached_content_fail";
        } else {
            str = "fetch_auth_flows_content_fail";
        }
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("logger_data", fBPayLoggerData);
        if (th != null) {
            A1E.put("throwable", th);
        }
        if (elapsedRealtime != 0) {
            A1E.put("data_fetch_duration", Long.valueOf(elapsedRealtime));
        }
        A1E.put("product", str2);
        shu.A02.Cgl(str, A1E);
    }
}

package X;

import com.facebook.common.callercontext.CallerContext;
import java.util.List;

/* renamed from: X.8kC  reason: invalid class name and case insensitive filesystem */
public final class C363698kC {
    public final /* synthetic */ CallerContext A00;
    public final /* synthetic */ C363428ji A01;
    public final /* synthetic */ C363768kJ A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;

    public final void A00(Throwable th) {
        0qQ.A0B(th, 0);
        1wg r6 = this.A01.A04;
        String str = this.A03;
        String str2 = this.A00.A02;
        0qQ.A07(str2);
        r6.A04("service_manual_fetch_failure", str, this.A04, 0Yt.A02(new 0eP[]{new 0eP("caller_class", str2), new 0eP("error_message", th.getMessage())}));
        C363768kJ r0 = this.A02;
        if (r0 != null) {
            r0.onFailure();
        }
    }

    public C363698kC(CallerContext callerContext, C363428ji r2, C363768kJ r3, String str, List list) {
        this.A01 = r2;
        this.A03 = str;
        this.A00 = callerContext;
        this.A04 = list;
        this.A02 = r3;
    }
}

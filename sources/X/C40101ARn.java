package X;

import android.os.Bundle;
import com.facebook.xanalytics.XAnalyticsAdapter;
import com.facebook.xanalytics.XAnalyticsAdapterHolder;
import com.facebook.xanalytics.XAnalyticsHolder;
import com.meta.arfx.engine.interfaces.IARAnalyticsLoggerHost;
import java.util.List;

/* renamed from: X.ARn  reason: case insensitive filesystem */
public final class C40101ARn implements C312546ef {
    public IARAnalyticsLoggerHost A00;
    public AnonymousClass82L A01;
    public String A02;
    public final List A03 = AnonymousClass7TE.A1C();
    public final XAnalyticsAdapter A04;
    public final XAnalyticsAdapterHolder A05;

    public final void A00() {
        IARAnalyticsLoggerHost iARAnalyticsLoggerHost = this.A00;
        if (iARAnalyticsLoggerHost != null) {
            List list = this.A03;
            if (AnonymousClass7TE.A1b(list)) {
                iARAnalyticsLoggerHost.Ci0(list);
                list.clear();
            }
        }
    }

    public final String BgN() {
        String str = this.A02;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final XAnalyticsHolder CGu() {
        return this.A05;
    }

    public final void DOt(String str, String str2) {
        0qQ.A0B(str, 0);
        Bundle A0P = AnonymousClass7TG.A0P("eventName", str, AnonymousClass7TE.A1L("eventType", AnonymousClass05K.A0C));
        if (str2 != null) {
            A0P.putString("jsonExtras", str2);
        }
        this.A03.add(A0P);
    }

    public final void DOu(boolean z) {
        this.A03.add(AnonymousClass7TG.A0P("isStart", Boolean.valueOf(z), AnonymousClass7TE.A1L("eventType", AnonymousClass05K.A01)));
    }

    public final void EZn(C312596el r2, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        this.A02 = str;
        AnonymousClass82L r0 = this.A01;
        if (r0 != null) {
            r0.Csw(str5);
        }
    }

    public C40101ARn() {
        C40206AVw aVw = new C40206AVw(this);
        this.A04 = aVw;
        this.A05 = new XAnalyticsAdapterHolder(aVw);
    }

    public final void Ek3(AnonymousClass82L r1) {
        this.A01 = r1;
    }
}

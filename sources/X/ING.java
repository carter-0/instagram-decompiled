package X;

import android.content.Context;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public final class ING implements JPG {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C56603I4c A01;
    public final /* synthetic */ C57699If2 A02;

    public ING(Context context, C56603I4c i4c, C57699If2 if2) {
        this.A01 = i4c;
        this.A00 = context;
        this.A02 = if2;
    }

    public final void AUe(R9Q r9q) {
        C56603I4c i4c = this.A01;
        i4c.A01 = "unknown";
        i4c.A07 = false;
        i4c.A02(this.A00, "AEv2 - prefetch failure");
        if (!i4c.A06) {
            QuickPerformanceLogger quickPerformanceLogger = i4c.A0A.A00;
            quickPerformanceLogger.markerPoint(231933580, "editor_native_prefetch_end");
            quickPerformanceLogger.markerEnd(231933580, 3);
        }
    }

    public final void Eyw() {
        String A0R;
        C56603I4c i4c = this.A01;
        i4c.A01 = "warm";
        i4c.A07 = false;
        Context context = this.A00;
        double A002 = AnonymousClass30M.A00(AnonymousClass30J.SECONDS, AnonymousClass49C.A01.A00(this.A02.A00));
        if (Double.isInfinite(A002)) {
            A0R = String.valueOf(A002);
        } else {
            ThreadLocal threadLocal = C55367HgZ.A00[1];
            Object obj = threadLocal.get();
            DecimalFormat decimalFormat = obj;
            if (obj == null) {
                DecimalFormat decimalFormat2 = new DecimalFormat("0");
                decimalFormat2.setMinimumFractionDigits(1);
                decimalFormat2.setRoundingMode(RoundingMode.HALF_UP);
                threadLocal.set(decimalFormat2);
                decimalFormat = decimalFormat2;
            }
            String format = ((NumberFormat) decimalFormat).format(A002);
            0qQ.A07(format);
            A0R = 002.A0R(format, "s");
        }
        i4c.A02(context, 002.A0R("AEv2 - prefetch success ", A0R));
        if (!i4c.A06) {
            QuickPerformanceLogger quickPerformanceLogger = i4c.A0A.A00;
            quickPerformanceLogger.markerPoint(231933580, "editor_native_prefetch_end");
            quickPerformanceLogger.markerEnd(231933580, 2);
        }
    }
}

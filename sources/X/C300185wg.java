package X;

import android.content.Context;
import com.facebook.msys.mci.ProxyProvider;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.reliability.UserFlowLogger;
import java.util.Map;

/* renamed from: X.5wg  reason: invalid class name and case insensitive filesystem */
public final class C300185wg {
    public boolean A00;
    public final Context A01;
    public final C300235wm A02;
    public final C300265wp A03;
    public final ProxyProvider A04;
    public final C300255wo A05;
    public final C300255wo A06;
    public final C300255wo A07;
    public final QuickPerformanceLogger A08;
    public final UserFlowLogger A09;
    public final C300275wq A0A;
    public final C300215wk A0B;
    public final Integer A0C;
    public final Runnable A0D;
    public final String A0E;
    public final Map A0F;

    public C300185wg(Context context, C300235wm r3, C300265wp r4, ProxyProvider proxyProvider, C300255wo r6, C300255wo r7, C300255wo r8, QuickPerformanceLogger quickPerformanceLogger, UserFlowLogger userFlowLogger, C300275wq r11, C300215wk r12, Integer num, Runnable runnable, String str, Map map, boolean z) {
        this.A01 = context;
        this.A05 = r6;
        this.A0E = str;
        this.A0B = r12;
        this.A02 = r3;
        this.A0A = r11;
        this.A03 = r4;
        this.A06 = r7;
        this.A04 = proxyProvider;
        this.A08 = quickPerformanceLogger;
        this.A0C = num;
        this.A07 = r8;
        this.A09 = userFlowLogger;
        this.A0D = runnable;
        this.A0F = map;
        this.A00 = z;
    }
}

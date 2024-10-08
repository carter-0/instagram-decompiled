package X;

import android.content.Context;
import com.facebook.quicklog.QuickPerformanceLogger;

public final class A7N {
    public final Context A00;
    public final QuickPerformanceLogger A01;
    public final Object A02 = new Object();
    public final AnonymousClass15X A03;
    public final AnonymousClass1Jg A04;
    public volatile boolean A05;

    public A7N(Context context, AnonymousClass1Jg r4, QuickPerformanceLogger quickPerformanceLogger, boolean z) {
        0qQ.A0B(r4, 4);
        this.A00 = context;
        this.A01 = quickPerformanceLogger;
        this.A04 = r4;
        AST ast = new AST(this);
        this.A03 = ast;
        if (z) {
            r4.EBn(ast);
        }
    }
}

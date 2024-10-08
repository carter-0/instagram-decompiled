package X;

import android.content.Context;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import java.util.List;

/* renamed from: X.MYp  reason: case insensitive filesystem */
public final class C66603MYp {
    public int A00;
    public List A01;
    public final Context A02;
    public final C66600MYm A03;
    public final QuickPerformanceLogger A04;
    public final boolean A05;

    public C66603MYp(Context context, boolean z) {
        0qQ.A0B(context, 1);
        0eg qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
        this.A04 = qPLInstance == null ? QuickPerformanceLoggerProvider.A01 : qPLInstance;
        this.A03 = new C66600MYm(this);
        this.A02 = context;
        this.A05 = z;
    }
}

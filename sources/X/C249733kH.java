package X;

import android.text.TextUtils;
import android.util.Log;
import com.facebook.endtoend.EndToEnd;
import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: X.3kH  reason: invalid class name and case insensitive filesystem */
public final class C249733kH implements 0f9 {
    public static final Random A04 = new Random();
    public AnonymousClass0eK A00;
    public final EventBuilder A01;
    public final int A02;
    public final boolean A03;

    public final 0f9 ABO(String str, int i) {
        this.A01.annotate(str, i);
        return this;
    }

    public final 0f9 ABP(String str, long j) {
        this.A01.annotate(str, j);
        return this;
    }

    public final 0f9 ABQ(String str, String str2) {
        this.A01.annotate(str, str2);
        return this;
    }

    public final 0f9 ABR(String str, boolean z) {
        this.A01.annotate(str, z);
        return this;
    }

    public final 0f9 ABS(String str, String[] strArr) {
        this.A01.annotate(str, strArr);
        return this;
    }

    public final 0f9 ERJ(Throwable th) {
        EventBuilder eventBuilder = this.A01;
        if (eventBuilder.isSampled() && !this.A03) {
            eventBuilder.annotate("UI_UE_KEY_CAUSE_STACKTRACE", 0LE.A00(Log.getStackTraceString(th), this.A02));
        }
        return this;
    }

    public final boolean isSampled() {
        return this.A01.isSampled();
    }

    public final void report() {
        if (this.A00 != null) {
            Executor executor = XTh.A00;
            if (executor == null) {
                executor = Executors.newFixedThreadPool(3);
                XTh.A00 = executor;
            }
            executor.execute(new C73049PUg(this));
            return;
        }
        this.A01.report();
    }

    public C249733kH(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, String str, int i, int i2, int i3, boolean z, boolean z2) {
        String str2;
        EventBuilder markEventBuilder = lightweightQuickPerformanceLogger.markEventBuilder(i, i3 == 0 ? A04.nextInt() : i3, str);
        this.A01 = markEventBuilder;
        this.A03 = z;
        this.A02 = i2;
        if (markEventBuilder.isSampled()) {
            if (!z && !z2) {
                this.A01.annotate("UI_UE_KEY_CALLSITE_STACKTRACE", 0LE.A00(0LE.A01(new Throwable()), i2));
            }
            this.A01.annotate("UI_UE_KEY_END_POINT", 0LA.A00());
            this.A01.annotate("UI_UE_KEY_CATEGORY", str);
            this.A01.setActionId(11289);
            HashMap A022 = 0LF.A02();
            if (EndToEnd.A04()) {
                str2 = "mobilelab";
            } else {
                str2 = (String) A022.get("fb.report_source");
            }
            if (!TextUtils.isEmpty(str2)) {
                EventBuilder eventBuilder = this.A01;
                eventBuilder.annotate("report_source", str2);
                String A012 = 0LF.A01(A022);
                if (A012 != null) {
                    eventBuilder.annotate(AnonymousClass000.A00(765), A012);
                } else {
                    this.A00 = new Y4D();
                }
            }
        }
    }
}

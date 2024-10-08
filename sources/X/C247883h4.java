package X;

import com.instagram.debug.quickexperiment.dumper.QuickExperimentDumperPlugin;

/* renamed from: X.3h4  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C247883h4 implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass3OV A01;

    public /* synthetic */ C247883h4(AnonymousClass3OV r1, long j) {
        this.A01 = r1;
        this.A00 = j;
    }

    public final void run() {
        String str;
        AnonymousClass3OV r1 = this.A01;
        long j = this.A00;
        if (r1.A0Q.A00) {
            str = QuickExperimentDumperPlugin.NAME;
        } else if (AnonymousClass20W.A02()) {
            str = "transient_analysis";
        } else {
            str = null;
        }
        AnonymousClass3OV.A06(r1, str, "", 23399201, j);
    }
}

package X;

import com.facebook.hyperthrift.HyperThriftBase$Builder;
import com.facebook.logginginfra.falco.Identity;

/* renamed from: X.Xw1  reason: case insensitive filesystem */
public final /* synthetic */ class C22137Xw1 implements Y9C {
    public final /* synthetic */ long A00;

    public /* synthetic */ C22137Xw1(long j) {
        this.A00 = j;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.hyperthrift.HyperThriftBase$Builder, X.XIn] */
    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.hyperthrift.HyperThriftBase$Builder, X.XIm] */
    public final Identity AX4() {
        long j = this.A00;
        ? hyperThriftBase$Builder = new HyperThriftBase$Builder(2);
        ? hyperThriftBase$Builder2 = new HyperThriftBase$Builder(4);
        hyperThriftBase$Builder2.A01(Long.valueOf(j));
        hyperThriftBase$Builder.A01(hyperThriftBase$Builder2.A00());
        return hyperThriftBase$Builder.A00();
    }
}

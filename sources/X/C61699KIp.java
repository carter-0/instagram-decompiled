package X;

import java.io.File;
import java.util.Set;

/* renamed from: X.KIp  reason: case insensitive filesystem */
public final class C61699KIp extends 0ng {
    public final /* synthetic */ 2Nn A00;
    public final /* synthetic */ Set A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61699KIp(2Nn r4, Set set) {
        super(95, 5, false, false);
        this.A00 = r4;
        this.A01 = set;
    }

    public final void run() {
        File C4W = this.A00.C4W();
        0mb.A01(new Lc6(2, this.A01, C4W), C4W.getPath(), (Set) null);
    }
}

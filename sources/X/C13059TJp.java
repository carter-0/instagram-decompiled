package X;

import java.util.Map;

/* renamed from: X.TJp  reason: case insensitive filesystem */
public final class C13059TJp implements Runnable {
    public final /* synthetic */ C12080SmZ A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ Map A02;
    public final /* synthetic */ boolean A03;

    public C13059TJp(C12080SmZ smZ, String str, Map map, boolean z) {
        this.A00 = smZ;
        this.A01 = str;
        this.A03 = z;
        this.A02 = map;
    }

    public final void run() {
        this.A00.A00.DFl(this.A01, this.A02, this.A03);
    }
}

package X;

import java.util.Map;

/* renamed from: X.TIs  reason: case insensitive filesystem */
public final class C13036TIs implements Runnable {
    public final /* synthetic */ C12080SmZ A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ Map A02;

    public C13036TIs(C12080SmZ smZ, String str, Map map) {
        this.A00 = smZ;
        this.A01 = str;
        this.A02 = map;
    }

    public final void run() {
        this.A00.A00.DFh(this.A01, this.A02);
    }
}

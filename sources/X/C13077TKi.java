package X;

import java.util.Map;

/* renamed from: X.TKi  reason: case insensitive filesystem */
public final class C13077TKi implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C12080SmZ A02;
    public final /* synthetic */ Exception A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ Map A06;
    public final /* synthetic */ boolean A07;

    public C13077TKi(C12080SmZ smZ, Exception exc, String str, String str2, Map map, int i, long j, boolean z) {
        this.A02 = smZ;
        this.A01 = j;
        this.A04 = str;
        this.A03 = exc;
        this.A07 = z;
        this.A05 = str2;
        this.A00 = i;
        this.A06 = map;
    }

    public final void run() {
        C13924TlS tlS = this.A02.A00;
        long j = this.A01;
        String str = this.A04;
        Exception exc = this.A03;
        boolean z = this.A07;
        tlS.DEM(exc, str, this.A05, this.A06, this.A00, j, z);
    }
}

package X;

import java.util.List;

/* renamed from: X.4Yj  reason: invalid class name and case insensitive filesystem */
public final class C266304Yj implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ AnonymousClass4OJ A03;
    public final /* synthetic */ AnonymousClass4Yf A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;

    public C266304Yj(AnonymousClass4OJ r1, AnonymousClass4Yf r2, String str, List list, int i, long j, long j2) {
        this.A03 = r1;
        this.A00 = i;
        this.A04 = r2;
        this.A05 = str;
        this.A02 = j;
        this.A01 = j2;
        this.A06 = list;
    }

    public final void run() {
        AnonymousClass4MZ r0 = this.A03.A02;
        int i = this.A00;
        r0.Ck3(this.A04, this.A05, this.A06, i, this.A02, this.A01);
    }
}

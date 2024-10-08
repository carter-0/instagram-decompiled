package X;

import java.util.List;

/* renamed from: X.Wpt  reason: case insensitive filesystem */
public final class C20354Wpt implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass4OJ A01;
    public final /* synthetic */ C284815Oa A02;
    public final /* synthetic */ AnonymousClass4Yf A03;
    public final /* synthetic */ AnonymousClass4Yf A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ List A07;

    public C20354Wpt(AnonymousClass4OJ r1, C284815Oa r2, AnonymousClass4Yf r3, AnonymousClass4Yf r4, String str, String str2, List list, long j) {
        this.A01 = r1;
        this.A03 = r3;
        this.A04 = r4;
        this.A00 = j;
        this.A06 = str;
        this.A07 = list;
        this.A05 = str2;
        this.A02 = r2;
    }

    public final void run() {
        int i;
        AnonymousClass4MZ r1 = this.A01.A02;
        AnonymousClass4Yf r3 = this.A03;
        AnonymousClass4Yf r4 = this.A04;
        long j = this.A00;
        String str = this.A06;
        List list = this.A07;
        if (list != null) {
            i = list.size();
        } else {
            i = -1;
        }
        r1.ClB(this.A02, r3, r4, str, this.A05, i, j);
    }
}

package X;

import java.util.List;

/* renamed from: X.5ie  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C292255ie implements Runnable {
    public final /* synthetic */ AnonymousClass4Yf A00;
    public final /* synthetic */ AnonymousClass4Og A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ C292255ie(AnonymousClass4Yf r1, AnonymousClass4Og r2, String str, List list, boolean z) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = str;
        this.A03 = list;
        this.A04 = z;
    }

    public final void run() {
        AnonymousClass4Og r0 = this.A01;
        r0.A00.DAM(this.A00, this.A02, this.A03, this.A04);
    }
}

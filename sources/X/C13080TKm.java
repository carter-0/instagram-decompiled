package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.TKm  reason: case insensitive filesystem */
public final class C13080TKm implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C11252SHm A01;
    public final /* synthetic */ C11288SJh A02;
    public final /* synthetic */ C270254gR A03;
    public final /* synthetic */ QC2 A04;
    public final /* synthetic */ RRP A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ Integer A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ List A09;

    public C13080TKm(Context context, C11252SHm sHm, C11288SJh sJh, C270254gR r4, QC2 qc2, RRP rrp, Integer num, Integer num2, String str, List list) {
        this.A01 = sHm;
        this.A04 = qc2;
        this.A08 = str;
        this.A05 = rrp;
        this.A09 = list;
        this.A00 = context;
        this.A02 = sJh;
        this.A07 = num;
        this.A03 = r4;
        this.A06 = num2;
    }

    public final void run() {
        C11252SHm sHm = this.A01;
        QC2 qc2 = this.A04;
        String str = this.A08;
        RRP rrp = this.A05;
        List list = this.A09;
        sHm.A01(this.A00, this.A02, this.A03, qc2, rrp, this.A07, this.A06, str, list);
    }
}

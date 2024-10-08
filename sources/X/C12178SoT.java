package X;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import java.util.Map;
import kotlin.Deprecated;

/* renamed from: X.SoT  reason: case insensitive filesystem */
public final class C12178SoT implements C13851TiU {
    public long A00 = 1000;
    public STX A01;
    public final Handler A02;
    public final SPQ A03;
    public final C9010RLe A04;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.RLM, java.lang.Object] */
    public C12178SoT(Context context, Handler handler, C13526Tbv tbv, SPQ spq, C9010RLe rLe) {
        C51973G9u.A0r(3, rLe, spq, handler);
        this.A04 = rLe;
        this.A03 = spq;
        this.A02 = handler;
        this.A01 = new STX(context, tbv, new Object());
    }

    public final void E5p(C13523Tbs tbs, C10161Rnc rnc, boolean z) {
        0qQ.A0B(rnc, 0);
        this.A01.A0B(tbs, rnc);
    }

    @Deprecated(message = "See https://developer.android.com/google/play/billing/query-purchase-history for alternatives to use.")
    public final void E5q(C13524Tbt tbt, String str, boolean z) {
        0qQ.A0B(str, 0);
        this.A01.A0C(tbt, str);
    }

    @Deprecated(message = "use queryProductDetailsAsync as per Google API documentation")
    public final void E5s(C10358Rqv rqv, C13527Tbw tbw, boolean z) {
        0qQ.A0B(rqv, 0);
        this.A01.A0E(rqv, tbw);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.RnZ, java.lang.Object] */
    public final void A79(C13521Tbq tbq, String str, boolean z) {
        ? obj = new Object();
        obj.A00 = str;
        this.A01.A08(obj, tbq);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Rna, java.lang.Object] */
    public final void AJT(C13522Tbr tbr, String str, boolean z) {
        ? obj = new Object();
        obj.A00 = str;
        this.A01.A0A(obj, tbr);
    }

    public final void ASK() {
        this.A01.A07();
    }

    public final C11230SGo CTR(String str) {
        C11230SGo A05 = this.A01.A05();
        0qQ.A07(A05);
        return A05;
    }

    public final boolean CaO() {
        return this.A01.A0F();
    }

    public final void CfW(Activity activity, C10767Rxl rxl, C13559TcY tcY) {
        C11230SGo A06 = this.A01.A06(activity, rxl);
        0qQ.A07(A06);
        tcY.DN0(A06);
    }

    public final void E5r(C13525Tbu tbu, C10162Rnd rnd, boolean z) {
        this.A01.A0D(tbu, rnd);
    }

    public final void Ewn(C13689Tf6 tf6, boolean z) {
        this.A03.A00.Cgp((Map) null, (Map) null, "client_init_iap_store_connection_init");
        0KC.A0C("DCP", "Starting in-app billing connection.");
        this.A01.A09(new C11828ShE(0, tf6, this));
    }
}

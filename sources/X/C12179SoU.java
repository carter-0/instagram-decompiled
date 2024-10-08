package X;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Deprecated;

/* renamed from: X.SoU  reason: case insensitive filesystem */
public final class C12179SoU implements C13851TiU {
    public static final Set A05 = C51967G9n.A0t(new Integer[]{6, C66580MXl.A0q(), 12}, 0);
    public STX A00;
    public final Handler A01;
    public final SPQ A02;
    public final TLC A03;
    public final ConcurrentLinkedQueue A04;

    public final void A79(C13521Tbq tbq, String str, boolean z) {
        new QY7(tbq, new C12183SoY(3), this, str).A00();
    }

    public final void AJT(C13522Tbr tbr, String str, boolean z) {
        new QY9(tbr, new C12183SoY(3), this, str).A00();
    }

    public final void CfW(Activity activity, C10767Rxl rxl, C13559TcY tcY) {
        new QYE(activity, rxl, tcY, new C12183SoY(3), this).A00();
    }

    public final void E5p(C13523Tbs tbs, C10161Rnc rnc, boolean z) {
        0qQ.A0B(rnc, 0);
        new QYA(tbs, rnc, new C12183SoY(3), this).A00();
    }

    @Deprecated(message = "See https://developer.android.com/google/play/billing/query-purchase-history for alternatives to use.")
    public final void E5q(C13524Tbt tbt, String str, boolean z) {
        0qQ.A0B(str, 0);
        new QYB(tbt, new C12183SoY(3), this, str).A00();
    }

    @Deprecated(message = "use queryProductDetailsAsync as per Google API documentation")
    public final void E5s(C10358Rqv rqv, C13527Tbw tbw, boolean z) {
        0qQ.A0B(rqv, 0);
        new QYD(rqv, tbw, new C12183SoY(3), this).A00();
    }

    public final void Ewn(C13689Tf6 tf6, boolean z) {
        QY8 qy8 = new QY8(tf6, new C12183SoY(3), this);
        qy8.A00 = false;
        qy8.A00();
    }

    public final void ASK() {
        this.A00.A07();
    }

    public final C11230SGo CTR(String str) {
        C11230SGo A052 = this.A00.A05();
        0qQ.A07(A052);
        return A052;
    }

    public final boolean CaO() {
        return this.A00.A0F();
    }

    public final void E5r(C13525Tbu tbu, C10162Rnd rnd, boolean z) {
        C13817Thl soY;
        if (z) {
            soY = new C12182SoX(1000, 4, 16000);
        } else {
            soY = new C12183SoY(3);
        }
        new QYC(tbu, rnd, soY, this).A00();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.RLM, java.lang.Object] */
    public C12179SoU(Context context, Handler handler, C13526Tbv tbv, SPQ spq) {
        C51972G9s.A1D(spq, handler);
        this.A02 = spq;
        this.A01 = handler;
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        this.A04 = concurrentLinkedQueue;
        STX stx = new STX(context, tbv, new Object());
        this.A00 = stx;
        this.A03 = new TLC(stx, spq, this, concurrentLinkedQueue);
    }
}

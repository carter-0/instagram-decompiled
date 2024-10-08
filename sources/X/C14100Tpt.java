package X;

import android.content.Context;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Tpt  reason: case insensitive filesystem */
public final class C14100Tpt extends 2Th implements C251273mq {
    public static final C253183qL A0F = new Tq0();
    public static final C253183qL A0G = new C14112Tq6();
    public static final C253183qL A0H = new C14103Tpw();
    public static final C253183qL A0I = new C14105Tpy();
    public static final C253183qL A0J = new C14111Tq5();
    public static final C253183qL A0K = new C14107Tq1();
    public static final C253183qL A0L = new C14108Tq2();
    public static final C253183qL A0M = new C14113Tq7();
    public static final C253183qL A0N = new C14104Tpx();
    public static final C253183qL A0O = new C14106Tpz();
    public static final C253183qL A0P = new C14101Tpu();
    public static final C253183qL A0Q = new C14109Tq3();
    public static final C253183qL A0R = new C14110Tq4();
    public int A00 = 0;
    public int A01;
    public int A02 = 0;
    public int A03;
    public Rect A04;
    public AnonymousClass3AS A05;
    public C228432lf A06;
    public C17181VLl A07;
    public List A08;
    public List A09;
    public boolean A0A = true;
    public boolean A0B = true;
    public final C14536Txw A0C;
    public final Tq8 A0D;
    public final long A0E;

    public final boolean A0E() {
        return true;
    }

    public final C251273mq A0I() {
        return this;
    }

    public final /* synthetic */ 2Ue D6k(int i) {
        return C246243eG.A00(this, i);
    }

    public C14100Tpt(C14536Txw txw, Tq8 tq8, long j) {
        super(AnonymousClass05K.A01);
        this.A0E = j;
        this.A0D = tq8;
        this.A0C = txw;
        C244233ar[] r3 = {C244753bh.A00(A0M, this), C244753bh.A00(A0F, this), C244753bh.A00(A0Q, this), C244753bh.A00(A0R, this), C244753bh.A00(A0K, this), C244753bh.A00(A0J, this), C244753bh.A00(A0L, this), C244753bh.A00(A0G, this), C244753bh.A00(A0O, this), C244753bh.A00(A0H, this), C244753bh.A00(A0P, this), C244753bh.A00(A0I, this), C244753bh.A00(A0N, this)};
        int i = 0;
        do {
            A0D(r3[i]);
            i++;
        } while (i < 13);
    }

    public final long A0H() {
        return this.A0E;
    }

    public final void A0J(C249403jg r3) {
        List list = this.A09;
        if (list == null) {
            list = new ArrayList(4);
            this.A09 = list;
        }
        list.add(r3);
    }

    public final /* synthetic */ boolean AFh() {
        return false;
    }

    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        return new C298425tP(context);
    }

    public final /* synthetic */ 2Sd Bdg() {
        return C243983aS.A00;
    }

    public final /* synthetic */ int E2z() {
        return 3;
    }

    public final /* synthetic */ Object Bdd() {
        return getClass();
    }
}

package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import java.util.ArrayDeque;

/* renamed from: X.XvA  reason: case insensitive filesystem */
public final class C22084XvA implements Y90 {
    public float A00;
    public int A01;
    public SIH A02;
    public C21474Xc8 A03;
    public C21982Xoc A04;
    public SRK A05;
    public C10148RnP A06;
    public Y85 A07;
    public C21361XYo A08;
    public final C22519Y7q A09;
    public final Xno A0A;
    public final C21422XaX A0B = new C21422XaX(new C22085XvB(this));
    public final C21136XGd A0C;
    public final C21138XGf A0D;
    public final ImmutableList A0E;
    public final ImmutableList A0F;
    public final ArrayDeque A0G;
    public final Context A0H;
    public final Y87 A0I;
    public final YB7 A0J;
    public final XUD A0K;
    public final XUD A0L;

    static {
        new Object();
    }

    public final void reset() {
        C249803kO it = this.A0F.iterator();
        while (it.hasNext()) {
            ((YBY) it.next()).reset();
        }
        C249803kO it2 = this.A0E.iterator();
        while (it2.hasNext()) {
            ((YBY) it2.next()).reset();
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.XGd, X.Xuj, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v9, types: [X.Xc8, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v12, types: [java.lang.Object, X.XUD] */
    /* JADX WARNING: type inference failed for: r0v13, types: [java.lang.Object, X.XUD] */
    public C22084XvA(Context context, C22519Y7q y7q, Y87 y87, YB7 yb7) {
        this.A0H = context;
        SIH sih = SIH.A01;
        this.A02 = sih;
        this.A05 = SRK.A00(context, sih);
        this.A09 = y7q;
        this.A0J = yb7;
        y87.getClass();
        this.A0I = y87;
        Xno xno = new Xno(YB5.A00);
        this.A0A = xno;
        xno.A00();
        ? xuj = new C22057Xuj();
        this.A0C = xuj;
        C21138XGf xGf = new C21138XGf();
        this.A0D = xGf;
        this.A0F = ImmutableList.of(new C22057Xuj(), xuj, xGf);
        this.A0E = ImmutableList.of(new C22057Xuj());
        this.A00 = 1.0f;
        this.A01 = 0;
        this.A03 = new Object();
        C21982Xoc xoc = C21982Xoc.A03;
        this.A08 = new C21361XYo(xoc);
        this.A04 = xoc;
        this.A0G = new ArrayDeque();
        this.A0K = new Object();
        this.A0L = new Object();
    }
}

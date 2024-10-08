package X;

import android.content.Context;

/* renamed from: X.Vb1  reason: case insensitive filesystem */
public final class C17609Vb1 {
    public final Context A00;
    public final VJR A01;
    public final VJS A02;
    public final V5X A03;
    public final C64381Le A04;
    public final AnonymousClass1Sl A05;
    public final String A06;

    /* JADX WARNING: type inference failed for: r0v10, types: [java.lang.Object, X.WGY] */
    /* JADX WARNING: type inference failed for: r0v11, types: [X.VJS, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v12, types: [X.VJR, java.lang.Object] */
    public C17609Vb1(VUW vuw) {
        VJR vjr;
        VJS vjs;
        WGY wgy;
        this.A00 = vuw.A02;
        AnonymousClass1Sl r1 = vuw.A01;
        if (r1 == null) {
            r1 = new C19003WGe(this);
            vuw.A01 = r1;
        }
        this.A06 = "image_cache";
        r1.getClass();
        this.A05 = r1;
        this.A03 = vuw.A00;
        synchronized (VJR.class) {
            VJR vjr2 = VJR.A00;
            vjr = vjr2;
            if (vjr2 == null) {
                ? obj = new Object();
                VJR.A00 = obj;
                vjr = obj;
            }
        }
        this.A01 = vjr;
        synchronized (VJS.class) {
            VJS vjs2 = VJS.A00;
            vjs = vjs2;
            if (vjs2 == null) {
                ? obj2 = new Object();
                VJS.A00 = obj2;
                vjs = obj2;
            }
        }
        this.A02 = vjs;
        synchronized (WGY.class) {
            WGY wgy2 = WGY.A00;
            wgy = wgy2;
            if (wgy2 == null) {
                ? obj3 = new Object();
                WGY.A00 = obj3;
                wgy = obj3;
            }
        }
        this.A04 = wgy;
    }
}

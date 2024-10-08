package X;

import android.app.ActivityManager;
import android.content.Context;
import java.util.Set;

/* renamed from: X.Vd5  reason: case insensitive filesystem */
public final class C17736Vd5 {
    public final C17609Vb1 A00;
    public final C17609Vb1 A01;
    public final AnonymousClass1Sl A02;
    public final VJY A03;
    public final C64741Th A04;
    public final C17402VUh A05;
    public final C16784V5r A06;
    public final C17995VjX A07;
    public final Context A08;
    public final AnonymousClass1Sl A09;
    public final AnonymousClass1Sl A0A;
    public final AnonymousClass1Sl A0B;
    public final AnonymousClass1Jg A0C;
    public final VJX A0D;
    public final C18433Vrc A0E;
    public final Set A0F;
    public final Set A0G;
    public final Set A0H;

    /* JADX WARNING: type inference failed for: r1v10, types: [X.V4B, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v23, types: [java.lang.Object, X.WGk] */
    /* JADX WARNING: type inference failed for: r0v24, types: [X.VJY, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v25, types: [X.VJX, java.lang.Object] */
    public C17736Vd5(VUf vUf) {
        VJX vjx;
        VJY vjy;
        C19009WGk wGk;
        AnonymousClass1Sz.A00();
        this.A05 = new C17402VUh(vUf.A02);
        Context context = vUf.A01;
        Object systemService = context.getSystemService("activity");
        if (systemService != null) {
            this.A09 = new C19006WGh((ActivityManager) systemService);
            synchronized (VJX.class) {
                VJX vjx2 = VJX.A00;
                vjx = vjx2;
                if (vjx2 == null) {
                    ? obj = new Object();
                    VJX.A00 = obj;
                    vjx = obj;
                }
            }
            this.A0D = vjx;
            this.A08 = context;
            synchronized (VJY.class) {
                VJY vjy2 = VJY.A00;
                vjy = vjy2;
                if (vjy2 == null) {
                    ? obj2 = new Object();
                    VJY.A00 = obj2;
                    vjy = obj2;
                }
            }
            this.A03 = vjy;
            AnonymousClass1Sl r0 = AnonymousClass1TE.A00;
            0qQ.A08(r0);
            this.A0A = r0;
            AnonymousClass1Sl r02 = AnonymousClass1TE.A01;
            0qQ.A08(r02);
            this.A0B = r02;
            AnonymousClass1Sz.A00();
            this.A00 = new C17609Vb1(new VUW(context));
            synchronized (C19009WGk.class) {
                C19009WGk wGk2 = C19009WGk.A00;
                wGk = wGk2;
                if (wGk2 == null) {
                    ? obj3 = new Object();
                    C19009WGk.A00 = obj3;
                    wGk = obj3;
                }
            }
            this.A0C = wGk;
            AnonymousClass1Sz.A00();
            this.A0E = new C18433Vrc(30000);
            C17995VjX vjX = new C17995VjX(new C17655Vbl());
            this.A07 = vjX;
            0sl r03 = 0sl.A00;
            this.A0H = r03;
            this.A0G = r03;
            this.A0F = r03;
            this.A01 = this.A00;
            this.A04 = new C64731Tf(vjX.A04.A01.A00);
            this.A06 = vUf.A00;
            this.A02 = new C19005WGg(new Object(), this);
            AnonymousClass1Sz.A00();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}

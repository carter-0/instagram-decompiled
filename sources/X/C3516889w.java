package X;

import android.graphics.Bitmap;
import android.util.LruCache;
import java.util.HashMap;

/* renamed from: X.89w  reason: invalid class name and case insensitive filesystem */
public final class C3516889w extends 2YL {
    public int A00;
    public AnonymousClass89v A01;
    public AnonymousClass89v A02;
    public AnonymousClass89v A03;
    public final 2Fk A04;
    public final AnonymousClass2Fj A05;
    public final AnonymousClass2Fj A06 = new AnonymousClass2Fj();
    public final AnonymousClass2Fj A07;
    public final C3516989y A08;
    public final HashMap A09;
    public final 05G A0A;

    public final AnonymousClass89v A00() {
        AnonymousClass89v r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final /* bridge */ /* synthetic */ void A01(AnonymousClass51P r4, 0sL r5) {
        AnonymousClass51M r42 = (AnonymousClass51M) r4;
        0qQ.A0B(r42, 0);
        AnonymousClass2Fj r2 = this.A05;
        AnonymousClass89v r0 = this.A01;
        if (r0 != null) {
            r2.A0B(new AnonymousClass88W(new AnonymousClass8YV(r0, r42, r5)));
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A02(AnonymousClass89v r10, AnonymousClass89v r11) {
        if (!0qQ.A0K(this.A03, r10)) {
            this.A03 = r10;
        }
        if (!0qQ.A0K(this.A01, r11)) {
            this.A01 = r11;
            int i = r11.A01;
            0sP r2 = r11.A05;
            0sL r5 = r11.A07;
            0sP r3 = r11.A04;
            Bitmap.Config config = r11.A03;
            int i2 = r11.A00;
            0sP r4 = r11.A06;
            0qQ.A0B(r2, 2);
            0qQ.A0B(r5, 3);
            0qQ.A0B(r3, 4);
            0qQ.A0B(config, 5);
            0qQ.A0B(r4, 7);
            this.A02 = new AnonymousClass89v(config, r2, r3, r4, r5, i, i, i2);
        }
    }

    public final void A03(AnonymousClass831 r5, int i) {
        this.A05.A0B(new AnonymousClass88W(new AnonymousClass8YX(A00(), (AnonymousClass51M) r5.A04(i))));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.util.LruCache, java.lang.Object, X.89y] */
    public C3516889w() {
        ? lruCache = new LruCache(AnonymousClass89x.A00());
        this.A08 = lruCache;
        this.A07 = new 2Fk(lruCache);
        AnonymousClass2Fj r2 = new AnonymousClass2Fj();
        this.A05 = r2;
        this.A0A = new 02z(true);
        this.A04 = r2;
        this.A09 = new HashMap();
    }
}

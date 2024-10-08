package X;

import java.io.File;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

public final class LEF {
    public double A00;
    public double A01;
    public C62692Kks A02;
    public AnonymousClass3Q2 A03;
    public File A04;
    public File A05;
    public AtomicBoolean A06;
    public final 1Xj A07;
    public final File A08;
    public final Set A09;
    public final C63500KyB A0A;

    public final void A00(double d) {
        C62692Kks kks = this.A02;
        if (C62692Kks.A00(kks) < d) {
            kks.A00.set(Double.doubleToRawLongBits(d));
            Iterator it = this.A09.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass7TE.A11("onDownloadingProgressChanged");
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.Kks, java.lang.Number] */
    public LEF(1Xj r5, C63500KyB kyB, File file) {
        C51972G9s.A1B(r5, kyB);
        this.A07 = r5;
        this.A08 = file;
        this.A0A = kyB;
        this.A00 = 100.0d;
        this.A01 = 75.0d;
        this.A00 = 25.0d;
        this.A06 = JTQ.A0k();
        ? number = new Number();
        number.A00 = new AtomicLong(Double.doubleToRawLongBits(0.0d));
        this.A02 = number;
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        0qQ.A07(newSetFromMap);
        this.A09 = newSetFromMap;
    }
}

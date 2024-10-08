package X;

import com.facebook.common.dextricks.Constants;
import java.io.Closeable;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class Y1J implements Closeable {
    public static final Logger A05 = Logger.getLogger(C21995Xq2.class.getName());
    public int A00 = Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
    public boolean A01;
    public final C21978XoQ A02;
    public final C13198TPe A03;
    public final YCS A04;

    public final synchronized void A00() {
        if (!this.A01) {
            this.A04.flush();
        } else {
            throw C21055XCg.A0H();
        }
    }

    public final synchronized void A02(int i, long j) {
        Throwable th;
        if (this.A01) {
            th = C21055XCg.A0H();
        } else if (j == 0 || j > 2147483647L) {
            Object[] objArr = {Long.valueOf(j)};
            String[] strArr = C21995Xq2.A01;
            C22023Xt4 xt4 = SUS.A04;
            th = C21056XCh.A07("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", objArr);
        } else {
            A01((byte) 8, (byte) 0, i, 4);
            YCS ycs = this.A04;
            ycs.FNw((int) j);
            ycs.flush();
        }
        throw th;
    }

    public final synchronized void A03(int i, Integer num) {
        if (!this.A01) {
            int A002 = XY0.A00(num);
            A01((byte) 3, (byte) 0, i, 4);
            YCS ycs = this.A04;
            ycs.FNw(A002);
            ycs.flush();
        } else {
            throw C21055XCg.A0H();
        }
    }

    public final synchronized void A04(C13198TPe tPe, int i, int i2, boolean z) {
        if (!this.A01) {
            A01((byte) 0, AnonymousClass7TF.A1P(z ? 1 : 0) ? (byte) 1 : 0, i, i2);
            if (i2 > 0) {
                this.A04.FNi(tPe, (long) i2);
            }
        } else {
            throw C21055XCg.A0H();
        }
    }

    public final synchronized void close() {
        this.A01 = true;
        this.A04.close();
    }

    public final void A01(byte b, byte b2, int i, int i2) {
        Object[] objArr;
        String str;
        Logger logger = A05;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(C21995Xq2.A00(b, b2, i, i2, false));
        }
        int i3 = this.A00;
        if (i2 > i3) {
            objArr = C51968G9o.A1Z(Integer.valueOf(i3), i2);
            str = "FRAME_SIZE_ERROR length > %d: %d";
        } else if ((Integer.MIN_VALUE & i) == 0) {
            YCS ycs = this.A04;
            ycs.FNn((i2 >>> 16) & 255);
            ycs.FNn((i2 >>> 8) & 255);
            ycs.FNn(i2 & 255);
            ycs.FNn(b & 255);
            ycs.FNn(b2 & 255);
            ycs.FNw(i & Integer.MAX_VALUE);
            return;
        } else {
            objArr = AnonymousClass7TF.A1b(i);
            str = "reserved bit set: %s";
        }
        String[] strArr = C21995Xq2.A01;
        C22023Xt4 xt4 = SUS.A04;
        throw C21056XCh.A07(str, objArr);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.TPe] */
    public Y1J(YCS ycs) {
        this.A04 = ycs;
        ? obj = new Object();
        this.A03 = obj;
        this.A02 = new C21978XoQ(obj);
    }
}

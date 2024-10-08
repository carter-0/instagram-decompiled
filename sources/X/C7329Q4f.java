package X;

import android.content.Context;
import android.media.MediaFormat;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: X.Q4f  reason: case insensitive filesystem */
public final class C7329Q4f {
    public C9608Rdm A00;
    public Map A01 = AnonymousClass7TE.A1E();
    public Map A02 = AnonymousClass7TE.A1E();
    public boolean A03;
    public final int A04;
    public final long A05;
    public final long A06;
    public final Context A07;
    public final MediaFormat A08;
    public final C7255Q1d A09;
    public final C7232Q0d A0A;
    public final C13725Tfv A0B;
    public final SJL A0C;
    public final C13589TdH A0D;
    public final C13860Tig A0E;
    public final C13804ThT A0F;
    public final C10862RzN A0G;
    public final C13726Tfw A0H;
    public final C13855Tia A0I;
    public final List A0J = AnonymousClass7TE.A1C();

    /* JADX WARNING: type inference failed for: r3v0, types: [X.Q1b, java.lang.Object] */
    public final synchronized void A00() {
        ? obj = new Object();
        int i = 0;
        while (true) {
            this.A00.getClass();
            if (i < 1) {
                C13856Tib tib = (C13856Tib) C51968G9o.A10(this.A01, i);
                if (tib != null) {
                    try {
                        tib.cancel();
                    } catch (Throwable th) {
                        C7254Q1b.A00(obj, th);
                    }
                }
                C7333Q4j q4j = (C7333Q4j) C51968G9o.A10(this.A02, i);
                if (q4j != null) {
                    try {
                        C7333Q4j.A02(q4j, true);
                    } catch (IOException | RuntimeException unused) {
                    }
                    try {
                        q4j.A06 = false;
                    } catch (Throwable th2) {
                        C7254Q1b.A00(obj, th2);
                    }
                }
                i = 1;
            } else {
                this.A02.clear();
                this.A01.clear();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.Q1b, java.lang.Object] */
    public final synchronized void A01() {
        ? obj = new Object();
        int i = 0;
        while (true) {
            this.A00.getClass();
            if (i < 1) {
                C7333Q4j q4j = (C7333Q4j) C51968G9o.A10(this.A02, i);
                if (q4j != null && q4j.A06) {
                    this.A0C.A0W = true;
                    try {
                        q4j.stop();
                    } catch (Throwable th) {
                        C7254Q1b.A00(obj, th);
                    }
                }
                C13856Tib tib = (C13856Tib) C51968G9o.A10(this.A01, i);
                if (tib != null) {
                    try {
                        tib.release();
                    } catch (Throwable th2) {
                        C7254Q1b.A00(obj, th2);
                    }
                }
                i = 1;
            } else {
                this.A02.clear();
                this.A01.clear();
                obj.A01();
            }
        }
    }

    public final boolean A03() {
        int i = 0;
        boolean z = true;
        while (true) {
            this.A00.getClass();
            if (i >= 1) {
                return z;
            }
            C13856Tib tib = (C13856Tib) this.A01.get(Integer.valueOf(i));
            if (tib != null) {
                if (z) {
                    z = true;
                    if (tib.CQL()) {
                    }
                }
                z = false;
            }
            i = 1;
        }
    }

    public final void A02(long j) {
        Map map = this.A01;
        if (map.get(0) != null) {
            ((C13856Tib) map.get(0)).EF4(j);
            this.A00.getClass();
            int i = 0;
            while (true) {
                C9608Rdm rdm = this.A00;
                if (i < 1) {
                    rdm.getClass();
                    Object obj = map.get(Integer.valueOf(i));
                    obj.getClass();
                    ((C13856Tib) obj).APk(j);
                    i = 1;
                } else {
                    return;
                }
            }
        }
    }

    public C7329Q4f(Context context, MediaFormat mediaFormat, C7255Q1d q1d, C7232Q0d q0d, C13725Tfv tfv, SJL sjl, C13589TdH tdH, C13860Tig tig, C13804ThT thT, C10862RzN rzN, C13726Tfw tfw, C13855Tia tia, int i, long j, long j2) {
        this.A0D = tdH;
        this.A0F = thT;
        this.A0G = rzN;
        this.A0C = sjl;
        this.A0B = tfv;
        this.A07 = context;
        this.A04 = i;
        this.A08 = mediaFormat;
        this.A0I = tia;
        this.A0E = tig;
        this.A09 = q1d;
        this.A0H = tfw;
        this.A06 = j;
        this.A05 = j2;
        this.A0A = q0d;
    }
}

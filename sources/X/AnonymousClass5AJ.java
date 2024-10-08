package X;

import android.util.Pair;
import java.util.Locale;

/* renamed from: X.5AJ  reason: invalid class name */
public final class AnonymousClass5AJ {
    public int A00;
    public int A01;
    public long A02 = -1;
    public long A03 = Long.MAX_VALUE;
    public long A04;
    public long A05;
    public Pair A06 = Pair.create(-1L, -1L);
    public String A07 = "";
    public boolean A08;
    public boolean A09;
    public final C257063wn A0A;
    public final String A0B;

    public final String toString() {
        return String.format(Locale.US, "isKeyCached=%s, networkRequests=%d, mCacheRequests=%d, mRequestedRange=[%d,%d], mDynamicRange=%s", new Object[]{Boolean.valueOf(this.A09), Integer.valueOf(this.A01), Integer.valueOf(this.A00), Long.valueOf(this.A05), Long.valueOf(this.A04), Pair.create(Long.valueOf(this.A03), Long.valueOf(this.A02))});
    }

    public AnonymousClass5AJ(C257063wn r4, String str) {
        this.A0A = r4;
        this.A0B = str;
    }
}

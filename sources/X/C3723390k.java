package X;

import com.facebook.common.dextricks.Constants;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.90k  reason: invalid class name and case insensitive filesystem */
public final class C3723390k {
    public static final AtomicInteger A0J = new AtomicInteger();
    public Integer A00;
    public final int A01;
    public final C3723190i A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final C62320sa A09;
    public final C62320sa A0A;
    public final 0sP A0B;
    public final 0sL A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;

    public /* synthetic */ C3723390k(C3723190i r9, Integer num, String str, String str2, String str3, String str4, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        AnonymousClass90l r1;
        Integer num2;
        boolean z7 = z6;
        boolean z8 = z4;
        C3723490m r4 = null;
        C3723590n r3 = null;
        C3723690o r2 = null;
        boolean z9 = (i & 64) != 0 ? false : z3;
        z8 = (i & 128) != 0 ? false : z8;
        str3 = (i & 512) != 0 ? null : str3;
        if ((i & C249703kE.FLAG_MOVED) != 0) {
            r1 = AnonymousClass90l.A00;
        } else {
            r1 = null;
        }
        r4 = (i & 4096) != 0 ? C3723490m.A00 : r4;
        r3 = (i & 8192) != 0 ? C3723590n.A00 : r3;
        r2 = (i & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0 ? C3723690o.A00 : r2;
        z7 = (i & Constants.LOAD_RESULT_PGO) != 0 ? false : z7;
        0qQ.A0B(str2, 4);
        0qQ.A0B(r1, 12);
        0qQ.A0B(r4, 13);
        0qQ.A0B(r3, 14);
        0qQ.A0B(r2, 15);
        this.A02 = r9;
        this.A03 = num;
        this.A04 = str;
        this.A07 = str2;
        this.A0I = z;
        this.A0E = z2;
        this.A0G = z9;
        this.A0D = z8;
        this.A0H = z5;
        this.A05 = str3;
        this.A08 = str4;
        this.A09 = r1;
        this.A0A = r4;
        this.A0B = r3;
        this.A0C = r2;
        this.A0F = z7;
        this.A06 = 002.A0g(C3723090h.A01(r9), ",max_id:", str3);
        this.A01 = A0J.incrementAndGet();
        switch (num.intValue()) {
            case 0:
            case 1:
                num2 = AnonymousClass05K.A01;
                break;
            case 2:
                num2 = AnonymousClass05K.A0C;
                break;
            case 3:
                num2 = AnonymousClass05K.A0N;
                break;
            case 6:
                num2 = AnonymousClass05K.A0Y;
                break;
            default:
                num2 = AnonymousClass05K.A00;
                break;
        }
        this.A00 = num2;
    }
}

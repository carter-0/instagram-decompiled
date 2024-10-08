package X;

import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.Txs  reason: case insensitive filesystem */
public final class C14532Txs {
    public static final V5V A01 = new Object();
    public static volatile C14532Txs A02;
    public final Set A00 = new LinkedHashSet();

    private final Set A00() {
        Set set;
        Set set2 = this.A00;
        synchronized (set2) {
            if (set2.isEmpty()) {
                set = null;
            } else {
                set = 00k.A0k(set2);
            }
        }
        return set;
    }

    public final void A01(int i, int i2) {
        Set<C14532Txs> A002 = A00();
        if (A002 != null) {
            for (C14532Txs A012 : A002) {
                A012.A01(i, i2);
            }
        }
    }

    public final void A02(int i, int i2, long j) {
        Set<C14532Txs> A002 = A00();
        if (A002 != null) {
            for (C14532Txs A022 : A002) {
                A022.A02(i, i2, j);
            }
        }
    }

    public final void A03(int i, int i2, long j, long j2, short s) {
        Set<C14532Txs> A002 = A00();
        if (A002 != null) {
            for (C14532Txs A03 : A002) {
                A03.A03(i, i2, j, j2, s);
            }
        }
    }

    public final void A04(int i, int i2, String str, int i3) {
        Set<C14532Txs> A002 = A00();
        if (A002 != null) {
            for (C14532Txs A04 : A002) {
                A04.A04(i, i2, str, i3);
            }
        }
    }

    public final void A05(int i, int i2, String str, long j) {
        Set<C14532Txs> A002 = A00();
        if (A002 != null) {
            for (C14532Txs A05 : A002) {
                A05.A05(i, i2, str, j);
            }
        }
    }

    public final void A06(int i, int i2, String str, long j) {
        Set<C14532Txs> A002 = A00();
        if (A002 != null) {
            for (C14532Txs A06 : A002) {
                A06.A06(i, i2, str, j);
            }
        }
    }

    public final void A07(int i, int i2, String str, String str2) {
        Set<C14532Txs> A002 = A00();
        if (A002 != null) {
            for (C14532Txs A07 : A002) {
                A07.A07(i, i2, str, str2);
            }
        }
    }

    public final void A08(int i, int i2, String str, boolean z) {
        Set<C14532Txs> A002 = A00();
        if (A002 != null) {
            for (C14532Txs A08 : A002) {
                A08.A08(i, i2, str, z);
            }
        }
    }

    public final void A09(int i, int i2, String str, String[] strArr) {
        Set<C14532Txs> A002 = A00();
        if (A002 != null) {
            for (C14532Txs A09 : A002) {
                A09.A09(i, i2, str, strArr);
            }
        }
    }
}

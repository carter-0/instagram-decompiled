package X;

import java.util.BitSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.VuV  reason: case insensitive filesystem */
public final class C18579VuV {
    public C18579VuV A00;
    public List A01;
    public Set A02;
    public C18579VuV[] A03;
    public final int A04;
    public final int A05;
    public final C18579VuV A06;
    public final C18579VuV A07;
    public final BitSet A08;

    public final C18579VuV A00(int i) {
        List list;
        BitSet bitSet = this.A08;
        if (!bitSet.get(i) || (list = this.A01) == null) {
            return null;
        }
        int i2 = 0;
        for (int nextSetBit = bitSet.nextSetBit(0); nextSetBit < i; nextSetBit = bitSet.nextSetBit(nextSetBit + 1)) {
            i2++;
        }
        return (C18579VuV) list.get(i2);
    }

    public C18579VuV(C18579VuV vuV, C18579VuV vuV2, int i, int i2) {
        this.A08 = new BitSet();
        this.A01 = null;
        this.A02 = null;
        this.A03 = null;
        this.A05 = i;
        this.A06 = vuV;
        this.A07 = vuV2;
        this.A04 = vuV.A04 + i2;
        this.A00 = vuV2;
    }

    public C18579VuV() {
        this.A08 = new BitSet();
        this.A01 = null;
        this.A02 = null;
        this.A03 = null;
        this.A05 = -1;
        this.A06 = this;
        this.A07 = this;
        this.A04 = 0;
        this.A00 = this;
    }
}

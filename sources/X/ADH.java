package X;

import android.util.Pair;

public final class ADH {
    public float A00;
    public int A01 = -1;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public Pair A08;
    public boolean A09;
    public byte[] A0A;
    public float[] A0B;
    public C344957sh[] A0C;

    public static void A00(ADH adh) {
        if (adh.A0C != null) {
            int i = 0;
            while (true) {
                C344957sh[] r1 = adh.A0C;
                if (i < r1.length) {
                    if (r1[i].A02 != null) {
                        r1[i].A02.clear();
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}

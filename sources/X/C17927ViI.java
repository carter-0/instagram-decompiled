package X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.ViI  reason: case insensitive filesystem */
public final class C17927ViI {
    public int A00;
    public int A01;
    public int A02;
    public Integer A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Set A08 = new HashSet();

    public final void A00(int i) {
        if (i != this.A01) {
            this.A01 = i;
            if (i > this.A00) {
                this.A00 = i;
            }
            for (X4L DbF : this.A08) {
                DbF.DbF(this, 1);
            }
        }
    }
}

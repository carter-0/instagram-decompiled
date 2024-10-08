package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/* renamed from: X.Wfe  reason: case insensitive filesystem */
public final class C19797Wfe implements XAC {
    public int A00 = -1;
    public C17678Vc9 A01;
    public Object A02;
    public List A03 = new ArrayList();
    public final Stack A04 = new Stack();

    public final C16370Utn AAs(Object obj) {
        C17678Vc9 vc9;
        C17678Vc9 vc92;
        C17678Vc9 vc93 = this.A01;
        if (vc93 != null) {
            obj = vc93.A03.DTf(vc93, vc93.A05.FHf(vc93, obj), 1);
        }
        C17678Vc9 vc94 = null;
        if (!JTQ.A1P(this.A00, this.A03.size())) {
            int i = this.A00;
            while (true) {
                i++;
                if (i < this.A03.size()) {
                    vc92 = (C17678Vc9) this.A03.get(i);
                } else {
                    vc92 = null;
                }
                if (i >= this.A03.size() || (vc92 != null && vc92.A01.D1V(vc92, obj))) {
                    vc94 = vc92;
                }
            }
            vc94 = vc92;
        }
        int i2 = this.A00;
        if (!(i2 == -1 || (vc9 = this.A01) == null || vc9.A06)) {
            this.A04.push(Integer.valueOf(i2));
        }
        this.A01 = vc94;
        this.A00 = this.A03.indexOf(vc94);
        C17678Vc9 vc95 = this.A01;
        if (vc95 != null) {
            if (vc93 != null && !vc93.A06) {
                vc95.A04 = vc93;
            }
            this.A02 = vc95.A02.DTf(vc95, obj, 1);
        }
        return new C16370Utn(this, vc93, vc94, 0);
    }
}

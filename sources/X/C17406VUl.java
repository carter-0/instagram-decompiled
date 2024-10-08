package X;

import java.util.Map;

/* renamed from: X.VUl  reason: case insensitive filesystem */
public final class C17406VUl {
    public boolean A00;
    public final C17850Vh3 A01;
    public final Map A02;

    public C17406VUl(C17850Vh3 vh3, Map map, boolean z) {
        this.A01 = vh3;
        this.A02 = map;
        if (z && !this.A00) {
            this.A00 = true;
            vh3.A02.A01.add(this);
        }
    }
}

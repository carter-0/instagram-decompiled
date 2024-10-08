package X;

import java.lang.ref.Reference;
import java.util.Set;

/* renamed from: X.3vP  reason: invalid class name and case insensitive filesystem */
public final class C256213vP implements C256223vQ {
    public final /* synthetic */ AnonymousClass3PK A00;
    public final /* synthetic */ AnonymousClass3BV A01;
    public final /* synthetic */ AnonymousClass3WR A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Set A05;
    public final /* synthetic */ Set A06;
    public final /* synthetic */ Set A07;
    public final /* synthetic */ boolean A08;

    public final /* synthetic */ void Dxo() {
    }

    public C256213vP(AnonymousClass3PK r1, AnonymousClass3BV r2, AnonymousClass3WR r3, String str, String str2, Set set, Set set2, Set set3, boolean z) {
        this.A01 = r2;
        this.A03 = str;
        this.A07 = set;
        this.A02 = r3;
        this.A00 = r1;
        this.A06 = set2;
        this.A05 = set3;
        this.A08 = z;
        this.A04 = str2;
    }

    public final void Dxp(boolean z) {
        if (z) {
            String str = this.A03;
            Set set = this.A07;
            set.remove(this.A02);
            AnonymousClass3BV r3 = this.A01;
            AnonymousClass3BV.A04(this.A00, r3, str, set, this.A06, this.A05);
            Set<Reference> set2 = r3.A04;
            for (Reference reference : set2) {
                C311566ct r1 = (C311566ct) reference.get();
                if (r1 == null) {
                    set2.remove(reference);
                } else {
                    r1.DPq(str, this.A04);
                }
            }
        }
    }

    public final void Dxq(boolean z) {
        11Z.A02(new C257483xT(this, z));
    }
}

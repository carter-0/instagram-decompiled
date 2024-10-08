package X;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3Xz  reason: invalid class name and case insensitive filesystem */
public final class C243243Xz implements 2VG {
    public AnonymousClass3XI A00;
    public List A01;
    public boolean A02;
    public C243063Xg A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final 2TR A07;
    public final C243153Xp A08;
    public final boolean A09;

    public final void EAm(2Sg r3, String str) {
        0qQ.A0B(str, 0);
        0qQ.A0B(r3, 1);
        List list = this.A01;
        if (list == null) {
            list = new ArrayList();
        }
        this.A01 = list;
        list.add(new Pair(str, r3));
    }

    public final boolean A00() {
        C243063Xg r0;
        if (!this.A02 || AnonymousClass2VL.A01() || (r0 = this.A03) == null || r0.A01.get() != 1) {
            return false;
        }
        return true;
    }

    public final C243153Xp AjG() {
        return this.A08;
    }

    public final List B2I() {
        return this.A01;
    }

    public final int BLz() {
        return this.A04;
    }

    public final int Boc() {
        return this.A05;
    }

    public final int C9o() {
        return this.A06;
    }

    public final AnonymousClass3XI C9q() {
        return this.A00;
    }

    public final boolean COA() {
        return this.A09;
    }

    public final boolean CU9() {
        C243063Xg r0 = this.A03;
        if (r0 == null || !r0.A06) {
            return false;
        }
        return true;
    }

    public C243243Xz(2TR r3, C243153Xp r4, C243063Xg r5, AnonymousClass3XI r6, int i, int i2, int i3, boolean z) {
        boolean z2;
        this.A06 = i;
        this.A08 = r4;
        this.A04 = i2;
        this.A05 = i3;
        this.A09 = z;
        this.A07 = r3;
        this.A00 = r6;
        this.A03 = r5;
        if (r5 != null) {
            z2 = false;
            if (r5.A01.get() == 0) {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        this.A02 = z2;
    }
}

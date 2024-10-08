package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5f0  reason: invalid class name and case insensitive filesystem */
public final class C290245f0 implements C290255f1 {
    public static volatile C290245f0 A06;
    public final 0Gb A00;
    public final AnonymousClass0JR A01;
    public final C290265f2 A02 = new C290265f2();
    public final ArrayList A03 = new ArrayList();
    public final ArrayList A04 = new ArrayList();
    public final ArrayList A05 = new ArrayList();

    public static final void A00(C290245f0 r4, String str, String str2) {
        ArrayList arrayList = r4.A05;
        F2B f2b = new F2B(str, str2, r4.A01.now());
        synchronized (arrayList) {
            if (arrayList.size() >= 50) {
                arrayList.remove(0);
            }
            arrayList.add(f2b);
        }
    }

    public final long Aua() {
        return this.A01.now();
    }

    public final List Bd9() {
        return 00k.A0a(this.A03);
    }

    public final List BdD() {
        return 00k.A0a(this.A04);
    }

    public final List Bxa() {
        return 00k.A0a(this.A05);
    }

    public final boolean CJy() {
        if ((!this.A03.isEmpty()) || (!this.A04.isEmpty()) || (!this.A05.isEmpty())) {
            return true;
        }
        return false;
    }

    public C290245f0(0Gb r2, AnonymousClass0JR r3) {
        this.A00 = r2;
        this.A01 = r3;
    }
}

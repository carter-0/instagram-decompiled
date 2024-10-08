package X;

import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: X.7Ty  reason: invalid class name and case insensitive filesystem */
public final class C332177Ty implements C332187Tz {
    public final AnonymousClass0eK A00;
    public final C62320sa A01;

    public C332177Ty(AnonymousClass0eK r2, C62320sa r3) {
        0qQ.A0B(r3, 1);
        this.A01 = r3;
        this.A00 = r2;
    }

    public final boolean CXh() {
        C62320sa r1 = this.A01;
        if (!((C333517Zg) r1.invoke()).C6l().CSK() || !((C333517Zg) r1.invoke()).C6l().CVE()) {
            return false;
        }
        return true;
    }

    public final boolean CXi() {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.A00.get();
        if (linearLayoutManager == null) {
            return false;
        }
        return ((C333517Zg) this.A01.invoke()).BSN().Cbr(linearLayoutManager.A1a(), linearLayoutManager.A1b());
    }

    public final boolean CdC() {
        return ((C333517Zg) this.A01.invoke()).C6l().CSK();
    }
}

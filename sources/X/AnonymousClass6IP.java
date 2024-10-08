package X;

/* renamed from: X.6IP  reason: invalid class name */
public final class AnonymousClass6IP extends C267794cD implements C267954cW {
    public AnonymousClass6Gj A00;
    public C305246Hc A01;
    public C62320sa A02;
    public boolean A03;
    public boolean A04;
    public AnonymousClass6IQ A05;
    public 0sP A06;
    public final 0sP A07 = new AnonymousClass9L6(this, 21);

    public final boolean A0G() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [X.9Kw, X.0eL] */
    public final void AC5(AnonymousClass5SW r6) {
        C285635Sb r0;
        r6.ENH(AnonymousClass5SZ.A0G, true);
        r6.ENH(AnonymousClass5SZ.A0A, this.A07);
        boolean z = false;
        if (this.A00 == AnonymousClass6Gj.Vertical) {
            z = true;
        }
        AnonymousClass6IQ r1 = this.A05;
        if (z) {
            if (r1 != null) {
                r0 = AnonymousClass5SZ.A0W;
            }
            0qQ.A0F("scrollAxisRange");
            throw AnonymousClass00P.createAndThrow();
        }
        if (r1 != null) {
            r0 = AnonymousClass5SZ.A08;
        }
        0qQ.A0F("scrollAxisRange");
        throw AnonymousClass00P.createAndThrow();
        r6.ENH(r0, r1);
        0sP r2 = this.A06;
        if (r2 != null) {
            r6.ENH(C290125en.A0L, new C290145ep((String) null, r2));
        }
        r6.ENH(C290125en.A07, new C290145ep((String) null, new C377189Kw(new AnonymousClass9L8(this, 8), 12)));
        r6.ENH(AnonymousClass5SZ.A00, this.A01.AIJ());
    }

    public static final void A00(AnonymousClass6IP r4) {
        AnonymousClass9L6 r0;
        r4.A05 = new AnonymousClass6IQ(new AnonymousClass9L8(r4, 9), new AnonymousClass9L8(r4, 10), r4.A03);
        if (r4.A04) {
            r0 = new AnonymousClass9L6(r4, 22);
        } else {
            r0 = null;
        }
        r4.A06 = r0;
    }

    public final /* synthetic */ boolean Bu0() {
        return false;
    }

    public final /* synthetic */ boolean BuF() {
        return false;
    }

    public AnonymousClass6IP(AnonymousClass6Gj r3, C305246Hc r4, C62320sa r5, boolean z, boolean z2) {
        this.A02 = r5;
        this.A01 = r4;
        this.A00 = r3;
        this.A04 = z;
        this.A03 = z2;
        A00(this);
    }
}

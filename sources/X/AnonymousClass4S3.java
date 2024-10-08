package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;

/* renamed from: X.4S3  reason: invalid class name */
public final class AnonymousClass4S3 implements C264374Pq {
    public AnonymousClass4PL A00;
    public C264374Pq A01;
    public boolean A02 = true;
    public boolean A03;
    public boolean A04 = 2BY.A02(2BQ.A18);
    public final C264944Rx A05;
    public final AnonymousClass4S4 A06;

    public final long A00(boolean z) {
        AnonymousClass4PL r0 = this.A00;
        if (r0 == null || r0.CSi() || (!this.A00.CaO() && (z || this.A00.CKV()))) {
            this.A02 = true;
            if (this.A03) {
                this.A06.A00();
            }
        } else {
            C264374Pq r6 = this.A01;
            r6.getClass();
            long Bds = r6.Bds();
            if (this.A02) {
                AnonymousClass4S4 r5 = this.A06;
                if (Bds < r5.Bds()) {
                    r5.A01();
                } else {
                    this.A02 = false;
                    if (this.A03) {
                        r5.A00();
                    }
                }
            }
            AnonymousClass4S4 r2 = this.A06;
            r2.A02(Bds);
            AnonymousClass4P7 BdA = r6.BdA();
            if (!BdA.equals(r2.A00)) {
                r2.Efz(BdA);
                this.A05.DXa(BdA);
            }
        }
        return Bds();
    }

    public final void A01(AnonymousClass4PL r3) {
        C264374Pq r1;
        C264374Pq r0;
        if (r3 instanceof C264364Pp) {
            r1 = (C264364Pp) r3;
        } else if (r3 instanceof C266114Xp) {
            r1 = (C266114Xp) r3;
        } else {
            return;
        }
        if (r1 != null && r1 != (r0 = this.A01)) {
            if (r0 == null) {
                this.A01 = r1;
                this.A00 = r3;
                r1.Efz(this.A06.A00);
                return;
            }
            throw C2612348u.A01(new IllegalStateException("Multiple renderer media clocks enabled."), IgNetworkConsentStorage.MAX_ENTRIES);
        }
    }

    public final AnonymousClass4P7 BdA() {
        C264374Pq r0 = this.A01;
        if (r0 != null) {
            return r0.BdA();
        }
        return this.A06.A00;
    }

    public final long Bds() {
        if (this.A02) {
            return this.A06.Bds();
        }
        C264374Pq r0 = this.A01;
        r0.getClass();
        return r0.Bds();
    }

    public final void Efz(AnonymousClass4P7 r2) {
        C264374Pq r0 = this.A01;
        if (r0 != null) {
            r0.Efz(r2);
            r2 = this.A01.BdA();
        }
        this.A06.Efz(r2);
        if (this.A04) {
            this.A05.DXa(r2);
        }
    }

    public AnonymousClass4S3(C264944Rx r2, C697227w r3) {
        this.A05 = r2;
        this.A06 = new AnonymousClass4S4(r3);
    }
}

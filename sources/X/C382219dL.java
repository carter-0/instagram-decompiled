package X;

/* renamed from: X.9dL  reason: invalid class name and case insensitive filesystem */
public final class C382219dL extends C363898kX {
    public C341547n8 A00;

    public final boolean A0B(C390989sA r6, boolean z) {
        0qQ.A0B(r6, 0);
        if (!super.A0B(r6, false)) {
            return false;
        }
        C390989sA r3 = C390989sA.A04;
        C341547n8 r0 = this.A00;
        if (r6 == r3) {
            if (r0 != null) {
                r0.A0C(true);
                return true;
            }
        } else if (r0 != null) {
            r0.A0C(false);
            return true;
        }
        0qQ.A0F("supernovaBasicRecordingComponent");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A09() {
        super.A09();
        C343717qg r2 = C345297tG.A00;
        C343837qt r1 = this.A00;
        if (r1.CQN(r2)) {
            C343697qe Ape = r1.Ape(r2);
            0qQ.A07(Ape);
            C345297tG r12 = (C345297tG) Ape;
            if (r12 instanceof C341547n8) {
                this.A00 = (C341547n8) r12;
                return;
            }
            throw AnonymousClass7TE.A15("Missing SupernovaBasicRecordingComponent");
        }
        throw AnonymousClass7TE.A15("Missing RecordingComponent");
    }

    public final void A0A() {
        super.A0A();
        C341547n8 r1 = this.A00;
        if (r1 == null) {
            0qQ.A0F("supernovaBasicRecordingComponent");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r1.A0C(false);
        }
    }
}

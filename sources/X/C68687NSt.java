package X;

import java.util.List;

/* renamed from: X.NSt  reason: case insensitive filesystem */
public final class C68687NSt extends C353308Hc {
    public float A00;
    public AnonymousClass87G A01;
    public C70508O9h A02;
    public boolean A03;
    public boolean A04;
    public final AnonymousClass8AL A05;
    public final 05G A06;
    public final 05G A07;
    public final AnonymousClass80W A08;
    public final C262224Cq A09;
    public final 05G A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68687NSt(AnonymousClass8AL r8, AnonymousClass80W r9, C262224Cq r10) {
        super(r8);
        0qQ.A0B(r9, 2);
        this.A05 = r8;
        this.A08 = r9;
        this.A09 = r10;
        02z A012 = 106.A01(this.A01);
        this.A06 = A012;
        02z A10 = C51970G9q.A10(false);
        this.A0A = A10;
        02z A0s = JTQ.A0s(this.A04);
        this.A07 = A0s;
        AnonymousClass11O.A03(r10, new C62180ro(new C66191MHh(this, (AnonymousClass4D7) null, 10), new C61860pz(new MG9(this, (AnonymousClass4D7) null, 36), AnonymousClass11E.A01(AnonymousClass10H.A01(new C73571Pfz(1, (AnonymousClass4D7) null), AnonymousClass11E.A01(new MC9(AnonymousClass8DX.A00(r9), 59)), A10, A012, A0s)))));
    }

    public static final void A00(C68687NSt nSt, boolean z) {
        if (z != nSt.A03) {
            nSt.A03 = z;
            AnonymousClass8AL r1 = nSt.A05;
            if (z) {
                r1.A0C(true);
                r1.A0P.setTranslationY(nSt.A00);
            } else {
                r1.A0B(true);
            }
            C70508O9h o9h = nSt.A02;
            if (o9h != null) {
                C69112Ner.A03(o9h.A00);
            } else {
                0qQ.A0F("listener");
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }

    public final void A02(List list) {
        super.A02(list);
        int i = this.A00.A00;
        C70508O9h o9h = this.A02;
        if (o9h != null) {
            o9h.A00.A0H.A03(new C72904POo(i));
        } else {
            0qQ.A0F("listener");
            throw AnonymousClass00P.createAndThrow();
        }
    }
}

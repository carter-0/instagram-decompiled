package X;

import androidx.compose.ui.graphics.layer.GraphicsLayer;

/* renamed from: X.I4b  reason: case insensitive filesystem */
public final class C56602I4b {
    public static final long A0G = AnonymousClass5TW.A00(Integer.MAX_VALUE, Integer.MAX_VALUE);
    public long A00 = 0;
    public long A01;
    public long A02;
    public AnonymousClass5b8 A03;
    public GraphicsLayer A04;
    public boolean A05;
    public final AnonymousClass5b4 A06;
    public final AnonymousClass5b4 A07;
    public final C284945Oz A08;
    public final C284945Oz A09;
    public final C284945Oz A0A;
    public final C284945Oz A0B;
    public final C284945Oz A0C;
    public final C62320sa A0D;
    public final C262224Cq A0E;
    public final C285855Sz A0F;

    public static final void A00(C56602I4b i4b, long j) {
        i4b.A0C.Epw(new C289165d8(j));
    }

    public final void A01() {
        GraphicsLayer graphicsLayer = this.A04;
        this.A08.getValue();
        if (C51971G9r.A1W(this.A0A)) {
            if (graphicsLayer != null) {
                graphicsLayer.A05(1.0f);
            }
            AnonymousClass7TE.A1Z(new C59676JTh((Object) this, (AnonymousClass4D7) null, 9), this.A0E);
        }
    }

    public final void A02() {
        if (C51971G9r.A1W(this.A0B)) {
            AnonymousClass7TE.A1Z(new C59676JTh((Object) this, (AnonymousClass4D7) null, 10), this.A0E);
        }
    }

    public final void A03() {
        C285855Sz r0;
        C284945Oz r1 = this.A0B;
        if (C51971G9r.A1W(r1)) {
            C51967G9n.A16(r1, false);
            AnonymousClass7TE.A1Z(new C59676JTh((Object) this, (AnonymousClass4D7) null, 11), this.A0E);
        }
        C284945Oz r12 = this.A08;
        if (C51971G9r.A1W(r12)) {
            C51967G9n.A16(r12, false);
            AnonymousClass7TE.A1Z(new C59676JTh((Object) this, (AnonymousClass4D7) null, 12), this.A0E);
        }
        C284945Oz r13 = this.A0A;
        if (C51971G9r.A1W(r13)) {
            C51967G9n.A16(r13, false);
            AnonymousClass7TE.A1Z(new C59676JTh((Object) this, (AnonymousClass4D7) null, 13), this.A0E);
        }
        this.A05 = false;
        A00(this, 0);
        this.A02 = A0G;
        GraphicsLayer graphicsLayer = this.A04;
        if (!(graphicsLayer == null || (r0 = this.A0F) == null)) {
            r0.ECb(graphicsLayer);
        }
        this.A04 = null;
        this.A03 = null;
    }

    public final boolean A04() {
        return C51971G9r.A1W(this.A0A);
    }

    public C56602I4b(C285855Sz r9, C62320sa r10, C262224Cq r11) {
        GraphicsLayer graphicsLayer;
        this.A0E = r11;
        this.A0F = r9;
        this.A0D = r10;
        Boolean A0u = AnonymousClass7TE.A0u();
        this.A0B = C51970G9q.A0S(A0u);
        this.A08 = C51969G9p.A0S(A0u);
        this.A0A = C51969G9p.A0S(A0u);
        this.A09 = C51969G9p.A0S(A0u);
        long j = A0G;
        this.A02 = j;
        if (r9 != null) {
            graphicsLayer = r9.AM9();
        } else {
            graphicsLayer = null;
        }
        this.A04 = graphicsLayer;
        this.A06 = new AnonymousClass5b4(C287765aj.A03, new C289165d8(0), (Object) null);
        this.A07 = new AnonymousClass5b4(C287765aj.A02, C51967G9n.A0h(), (Object) null);
        this.A0C = C51969G9p.A0S(new C289165d8(0));
        this.A01 = j;
    }
}

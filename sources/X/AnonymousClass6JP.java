package X;

import java.util.Map;

/* renamed from: X.6JP  reason: invalid class name */
public final class AnonymousClass6JP implements C289145d6 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass6IK A02;
    public final /* synthetic */ AnonymousClass6IJ A03;
    public final /* synthetic */ Map A04;
    public final /* synthetic */ 0sP A05;

    public AnonymousClass6JP(AnonymousClass6IK r1, AnonymousClass6IJ r2, Map map, 0sP r4, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A04 = map;
        this.A02 = r1;
        this.A03 = r2;
        this.A05 = r4;
    }

    public final Map Aam() {
        return this.A04;
    }

    public final 0sP Bov() {
        return null;
    }

    public final void E2n() {
        0sP r1;
        C267964cX r0;
        if (!this.A02.CWf() || (r0 = this.A03.A09.A0W.A06.A00) == null) {
            r1 = this.A05;
            r0 = this.A03.A09.A0W.A06;
        } else {
            r1 = this.A05;
        }
        r1.invoke(r0.A05);
    }

    public final int getHeight() {
        return this.A00;
    }

    public final int getWidth() {
        return this.A01;
    }
}

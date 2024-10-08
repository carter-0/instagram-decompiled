package X;

import java.util.Map;

/* renamed from: X.LzE  reason: case insensitive filesystem */
public final class C65760LzE implements X83 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C60693Jpe A01;
    public final /* synthetic */ C60407Jl0 A02;
    public final /* synthetic */ C60964JuM A03;

    public C65760LzE(C60693Jpe jpe, C60407Jl0 jl0, C60964JuM juM, int i) {
        this.A02 = jl0;
        this.A00 = i;
        this.A01 = jpe;
        this.A03 = juM;
    }

    public final void DAc() {
        C60693Jpe jpe = this.A01;
        float f = jpe.A01;
        C60964JuM juM = this.A03;
        L0W l0w = juM.A03;
        C60693Jpe.A03(jpe, l0w, f);
        jpe.A0B.A01(l0w, juM.A04, juM.A05, juM.A07, jpe.A01);
        C60407Jl0 jl0 = this.A02;
        Map map = jl0.A06;
        int i = this.A00;
        map.put(Integer.valueOf(i), AnonymousClass7TE.A0u());
        ((C60964JuM) jl0.A00.get(i)).A00 = jpe.A01;
    }

    public final void DAh() {
        this.A02.A06.put(Integer.valueOf(this.A00), AnonymousClass7TE.A0v());
    }

    public final void DaL(int i) {
        if (DbX.A1a(C51968G9o.A10(this.A02.A06, this.A00))) {
            C60693Jpe jpe = this.A01;
            float f = ((float) i) / 100.0f;
            int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            jpe.A01 = f;
            jpe.A09.setText(String.valueOf(AnonymousClass7TE.A06(f, 100.0f)));
            LEZ lez = jpe.A0B;
            float f2 = jpe.A01;
            C60964JuM juM = this.A03;
            lez.A00(juM.A03, juM.A08, f2);
            C60693Jpe.A02(jpe, i);
        }
    }
}

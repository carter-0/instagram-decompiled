package X;

/* renamed from: X.Uso  reason: case insensitive filesystem */
public abstract class C16318Uso extends C19724WeQ {
    public C16311Usf A00;
    public C18571VuN A01;

    public void A01(C21006X9e x9e) {
        C18571VuN vuN;
        super.A01(x9e);
        this.A00 = C16311Usf.class.cast(x9e);
        C19723WeP weP = (C19723WeP) x9e;
        if (weP instanceof C16315Usj) {
            vuN = C18571VuN.A06;
        } else {
            vuN = weP.A06;
        }
        this.A01 = vuN;
        this.A02 = weP.A03;
        this.A00 = ((float) x9e.AbG()) / 255.0f;
    }
}

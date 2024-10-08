package X;

/* renamed from: X.Lph  reason: case insensitive filesystem */
public final class C65237Lph implements MSD {
    public final /* synthetic */ MW0 A00;
    public final /* synthetic */ String A01;

    public C65237Lph(MW0 mw0, String str) {
        this.A00 = mw0;
        this.A01 = str;
    }

    public final void Dof(String str, int i, int i2) {
        0qQ.A0B(str, 0);
        MW0 mw0 = this.A00;
        String str2 = this.A01;
        mw0.ET0(str);
        mw0.ESz(false);
        mw0.ET6(i);
        mw0.ET3(i2);
        LBS BeC = mw0.BeC();
        if (BeC != null) {
            BeC.A01 = mw0.As0();
            BeC.A00 = mw0.Arx();
        }
        mw0.BeD().A0B(str2);
    }
}

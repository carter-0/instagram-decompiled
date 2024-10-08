package X;

public final class PGL implements C74351PtR {
    public final /* synthetic */ AnonymousClass90H A00;

    public PGL(AnonymousClass90H r1) {
        this.A00 = r1;
    }

    public final void Dmr(Integer num) {
        C66819MdB mdB;
        int intValue = num.intValue();
        if (intValue == 3) {
            C66819MdB mdB2 = this.A00.A01;
            if (mdB2 != null) {
                mdB2.Ddt();
            }
        } else if (intValue == 4 && (mdB = this.A00.A01) != null) {
            mdB.Ddu();
        }
    }
}

package X;

public final class FmK implements C332277Ui {
    public final int A00;
    public final Object A01;
    public final String A02;

    public FmK(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public final void D9V() {
        String str;
        if (this.A00 == 0) {
            C46654DiZ diZ = (C46654DiZ) this.A01;
            AnonymousClass2kB r4 = (AnonymousClass2kB) diZ.A06.getValue();
            String str2 = diZ.A05;
            if (str2 == null) {
                str = "surface";
            } else {
                String str3 = diZ.A04;
                if (str3 == null) {
                    str = "mechanism";
                } else {
                    r4.A00(new Dwk(str2, str3, this.A02));
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void D9a() {
        if (this.A00 != 0) {
            FAF.A00((FAF) this.A01, this.A02);
        }
    }
}

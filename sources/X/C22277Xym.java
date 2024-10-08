package X;

/* renamed from: X.Xym  reason: case insensitive filesystem */
public abstract class C22277Xym implements X69 {
    public Y9R A00;
    public boolean A01;
    public boolean A02;

    public final C18035VkF CrY(Object obj) {
        C21392Xa0 AJm;
        C19106WLn wLn;
        int i;
        if (this.A01) {
            return new C18035VkF(true, (Object) null);
        }
        Y9R y9r = this.A00;
        if (y9r == null) {
            if (this instanceof XOD) {
                wLn = new C19106WLn(UVE.class);
                i = 3;
            } else {
                wLn = new C19106WLn(UVH.class);
                i = 1;
            }
            AJm = new C21392Xa0(new C22280Xyp(this, i), wLn);
        } else {
            AJm = y9r.AJm(obj);
        }
        Y9R y9r2 = AJm.A00;
        if (y9r2 != C22281Xyq.A00) {
            this.A00 = y9r2;
            return new C18035VkF(false, AJm.A01);
        } else if (!this.A02) {
            return EJH();
        } else {
            this.A01 = true;
            this.A00 = null;
            return new C18035VkF(true, (Object) null);
        }
    }

    public final C18035VkF EJH() {
        if (this.A02) {
            this.A01 = true;
        } else {
            this.A02 = true;
            this.A00 = new C22279Xyo(this);
        }
        return CrY((Object) null);
    }
}

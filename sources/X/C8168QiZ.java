package X;

/* renamed from: X.QiZ  reason: case insensitive filesystem */
public abstract class C8168QiZ extends C8218QkR {
    public final C8218QkR A00;

    public final C8218QkR A0S(C8218QkR qkR) {
        if (this instanceof C8166QiX) {
            return new C8166QiX(qkR, ((C8166QiX) this).A00);
        }
        if (this instanceof C8167QiY) {
            throw AnonymousClass7TE.A0z("Should never try to reset delegate");
        }
        C8165QiW qiW = (C8165QiW) this;
        if (qkR != qiW.A00) {
            return new C8165QiW(qkR, qiW.A00);
        }
        return qiW;
    }

    public C8168QiZ(C8218QkR qkR) {
        super(qkR);
        this.A00 = qkR;
    }
}

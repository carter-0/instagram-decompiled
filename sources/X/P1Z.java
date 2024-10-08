package X;

public abstract class P1Z implements C74544Pwd {
    public int A00;
    public long A01 = Long.MAX_VALUE;
    public Integer A02 = AnonymousClass05K.A00;
    public final O6T A03;

    public final void EIC(String str) {
        if (this instanceof NVZ) {
            ((NVZ) this).A00 = str;
        } else {
            ((C68740NVa) this).A00 = str;
        }
        this.A00 = 0;
        this.A01 = Long.MAX_VALUE;
        this.A02 = AnonymousClass05K.A00;
    }

    public final Integer Bz7() {
        return this.A02;
    }

    public void CgL() {
        this.A02 = AnonymousClass05K.A01;
    }

    public final void onDestroy() {
        if (this instanceof C68740NVa) {
            ((C68740NVa) this).A01.A01();
        }
    }

    public P1Z(O6T o6t) {
        this.A03 = o6t;
    }
}

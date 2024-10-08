package X;

import com.instagram.api.schemas.UrpRendererType;

public final class DHD implements C46218DQz {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final String Anf() {
        return this.A01;
    }

    public final Integer Bly() {
        return this.A00;
    }

    public final String Bm0() {
        return this.A02;
    }

    public final String C4Z() {
        return this.A03;
    }

    public DHD(C258003yJ r4) {
        String str;
        String str2;
        UrpRendererType Blw;
        this.A01 = r4.Anf();
        DUE BPp = r4.BPp();
        Integer num = null;
        if (BPp != null) {
            str = BPp.Bm0();
        } else {
            str = null;
        }
        this.A02 = str;
        DUE BPp2 = r4.BPp();
        if (BPp2 != null) {
            str2 = BPp2.C4Z();
        } else {
            str2 = null;
        }
        this.A03 = str2;
        DUE BPp3 = r4.BPp();
        if (!(BPp3 == null || (Blw = BPp3.Blw()) == null)) {
            int ordinal = Blw.ordinal();
            if (ordinal == 1) {
                num = AnonymousClass05K.A01;
            } else if (ordinal == 3) {
                num = AnonymousClass05K.A00;
            }
        }
        this.A00 = num;
    }
}

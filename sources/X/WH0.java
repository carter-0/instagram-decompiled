package X;

public final class WH0 implements C13848TiQ {
    public final String A00;
    public final S7E A01;
    public final X5t A02;
    public final C10384RrL A03;
    public final C18494Vsp A04;
    public volatile int A05 = 1;

    public final C18556Vu8[] Aqy() {
        return null;
    }

    public final C18556Vu8[] BU2() {
        return null;
    }

    public final int BaR(String str) {
        return -1;
    }

    public final String BdS() {
        String str;
        C18494Vsp vsp = this.A04;
        if (vsp == null || (str = vsp.A05) == null) {
            return "error";
        }
        return str;
    }

    public final S7E Bjd() {
        return this.A01;
    }

    public final long Bxy() {
        C18494Vsp vsp = this.A04;
        if (vsp != null) {
            return vsp.A00;
        }
        return -1;
    }

    public final String CDk() {
        String str;
        C18494Vsp vsp = this.A04;
        if (vsp == null || (str = vsp.A03) == null) {
            return "error";
        }
        Integer num = vsp.A02;
        if (num != null) {
            return AnonymousClass7TG.A0m(num, ":", AnonymousClass7TF.A0n(str));
        }
        return str;
    }

    public final void EGM(String str, String str2) {
        X5t x5t = this.A02;
        String A0u = 002.A0u("PARAM ACCESS ERROR - ", str2, ": ", "min_bitrate");
        int i = this.A05;
        this.A05 = Math.min(i * 10, 1000000);
        x5t.EAt(this, A0u, i);
    }

    public final C10384RrL EIR(VXH vxh) {
        X5t x5t = this.A02;
        String str = this.A00;
        int i = this.A05;
        this.A05 = Math.min(i * 10, 1000000);
        x5t.EAt(this, str, i);
        return this.A03;
    }

    public final String getName() {
        String str;
        C18494Vsp vsp = this.A04;
        if (vsp == null || (str = vsp.A04) == null) {
            return "error";
        }
        return str;
    }

    public WH0(S7E s7e, X5t x5t, C18494Vsp vsp, String str) {
        this.A01 = s7e;
        this.A04 = vsp;
        this.A00 = str;
        this.A02 = x5t;
        this.A03 = new C10384RrL(this, (W2K[]) null);
    }
}

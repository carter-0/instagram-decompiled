package X;

import com.instagram.api.schemas.RingSpec;
import com.instagram.api.schemas.RingSpecImpl;
import java.util.HashMap;

public final class DDv {
    public int A00;
    public RingSpecImpl A01;
    public C270044g6 A02;
    public C257593xe A03;
    public AnonymousClass3ID A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public HashMap A0A;
    public HashMap A0B;
    public HashMap A0C;
    public boolean A0D;

    public static void A00(DDv dDv) {
        dDv.A0A = new HashMap();
        dDv.A0B = new HashMap();
        dDv.A0C = new HashMap();
    }

    public DDv(RingSpec ringSpec, AnonymousClass3ID r3, String str) {
        RingSpecImpl ringSpecImpl;
        A00(this);
        this.A09 = str;
        if (ringSpec != null) {
            ringSpecImpl = ringSpec.F8l();
        } else {
            ringSpecImpl = null;
        }
        this.A01 = ringSpecImpl;
        this.A04 = r3;
    }

    public DDv() {
        A00(this);
    }

    public DDv(C46286DTp dTp) {
        A00(this);
        this.A06 = dTp.AgA();
        this.A09 = dTp.getId();
        int i = 0;
        this.A0D = AnonymousClass7TG.A1X(dTp.BuN());
        Integer Bw4 = dTp.Bw4();
        this.A00 = Bw4 != null ? Bw4.intValue() : i;
    }

    public DDv(String str, HashMap hashMap) {
        A00(this);
        this.A09 = str;
        this.A0B = hashMap;
    }
}

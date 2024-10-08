package X;

public final class Um4 extends Tt7 {
    public C14271Tsu A00;
    public C14271Tsu A01;
    public C14278TtB A02;
    public C14278TtB A03;
    public C14278TtB A04;
    public C14278TtB A05;
    public UmA A06;
    public UmC A07;
    public C14266Tso A08;
    public C14266Tso A09;
    public Tt4 A0A;
    public Tt4 A0B;
    public Tt4 A0C;
    public X98 A0D;
    public C365358my A0E;
    public XBw A0F;
    public final boolean A0G;

    public static final void A01(Um4 um4) {
        if (um4.A0F == null || um4.A0E == null || um4.A0A == null || um4.A0B == null || um4.A0C == null) {
            throw new IllegalStateException("Surfaces have not been initialized");
        }
    }

    public Um4(VNI vni) {
        boolean z = true;
        this.A0G = (vni == null || !vni.A00) ? false : z;
    }
}

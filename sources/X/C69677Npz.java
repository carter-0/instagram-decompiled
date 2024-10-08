package X;

/* renamed from: X.Npz  reason: case insensitive filesystem */
public abstract class C69677Npz {
    public int A00;
    public long A01;
    public boolean A02;
    public boolean A03;

    public final synchronized void A01() {
        C363058j1.A02.A02("sup:SUPNetworkAnalyticsImpl", "Starting session info tracking");
        this.A01 = System.currentTimeMillis();
        this.A02 = true;
        A03();
    }

    public final synchronized void A02() {
        if (this.A02) {
            C363058j1.A02.A02("sup:SUPNetworkAnalyticsImpl", "Stopping session info tracking");
            long currentTimeMillis = System.currentTimeMillis();
            this.A01 = currentTimeMillis;
            A04(currentTimeMillis - this.A01);
            this.A02 = false;
        }
    }

    public abstract void A03();

    public abstract void A04(long j);
}

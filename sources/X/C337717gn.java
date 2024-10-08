package X;

/* renamed from: X.7gn  reason: invalid class name and case insensitive filesystem */
public final class C337717gn extends 2Vq {
    public int A00 = -1;
    public String A01;
    public boolean A02;
    public final AnonymousClass2Ss A03;
    public final /* synthetic */ C337657gh A04;

    public final void A00() {
        synchronized (this) {
            if (this.A02) {
                int i = this.A00;
                String str = this.A01;
                this.A00 = -1;
                this.A01 = null;
                this.A02 = false;
                try {
                    C337657gh.A0G(this.A04, str, i);
                } catch (IndexOutOfBoundsException e) {
                    C337657gh r1 = this.A04;
                    throw C337657gh.A03(r1.A02, r1, e);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.7gn, java.lang.Runnable] */
    public final synchronized void A01() {
        if (this.A02) {
            this.A02 = false;
            this.A00 = -1;
            this.A01 = null;
            ((C70592Sr) this.A03).removeCallbacks(this);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.7gn, X.2Vq, java.lang.Runnable] */
    public final synchronized void A02(String str, int i) {
        if (!this.A02) {
            this.A02 = true;
            Throwable th = this.A00;
            if (th != null) {
                th.fillInStackTrace();
            }
            ((C70592Sr) this.A03).post(this);
            this.A00 = i;
            this.A01 = str;
        }
    }

    public C337717gn(C337657gh r2, AnonymousClass2Ss r3) {
        this.A04 = r2;
        this.A03 = r3;
    }
}

package X;

import java.util.List;

/* renamed from: X.4jV  reason: invalid class name and case insensitive filesystem */
public abstract class C271734jV implements C271744jW {
    public long A00 = -1;
    public long A01 = -1;
    public int A02 = -1;
    public C271754jX A03 = C271754jX.UNDEFINED;

    public Integer AwI() {
        return null;
    }

    public final int BHd() {
        if (this instanceof C271824je) {
            return ((C271824je) this).A00;
        }
        if (this instanceof C271834jf) {
            return ((C271834jf) this).A00;
        }
        return this.A02;
    }

    public final C271754jX Bz6() {
        if (this instanceof C271824je) {
            return ((C271824je) this).A03;
        }
        if (this instanceof C271834jf) {
            return ((C271834jf) this).A03;
        }
        return this.A03;
    }

    public final boolean CVX() {
        C271754jX r0 = C271754jX.SEEN;
        C271754jX Bz6 = Bz6();
        if (r0 == Bz6 || C271754jX.INSERTED_SUCCESSFULLY == Bz6) {
            return true;
        }
        return false;
    }

    public final void EZv(int i) {
        if (this instanceof C271824je) {
            C271824je r2 = (C271824je) this;
            List<C271744jW> list = r2.A05;
            if (list != null) {
                for (C271744jW EZv : list) {
                    EZv.EZv(i);
                }
            }
            r2.A00 = i;
        } else if (this instanceof C271834jf) {
            C271834jf r22 = (C271834jf) this;
            List<C271744jW> list2 = r22.A04;
            if (list2 != null) {
                for (C271744jW EZv2 : list2) {
                    EZv2.EZv(i);
                }
            }
            r22.A00 = i;
        } else {
            this.A02 = i;
        }
    }

    public final void EZw(long j) {
        if (this instanceof C271824je) {
            C271824je r2 = (C271824je) this;
            List<C271744jW> list = r2.A05;
            if (list != null) {
                for (C271744jW EZw : list) {
                    EZw.EZw(j);
                }
            }
            r2.A01 = j;
        } else if (this instanceof C271834jf) {
            C271834jf r22 = (C271834jf) this;
            List<C271744jW> list2 = r22.A04;
            if (list2 != null) {
                for (C271744jW EZw2 : list2) {
                    EZw2.EZw(j);
                }
            }
            r22.A01 = j;
        } else {
            this.A00 = j;
        }
    }

    public final void Ejc(long j) {
        if (this instanceof C271824je) {
            C271824je r2 = (C271824je) this;
            List<C271744jW> list = r2.A05;
            if (list != null) {
                for (C271744jW Ejc : list) {
                    Ejc.Ejc(j);
                }
            }
            r2.A02 = j;
        } else if (this instanceof C271834jf) {
            C271834jf r22 = (C271834jf) this;
            List<C271744jW> list2 = r22.A04;
            if (list2 != null) {
                for (C271744jW Ejc2 : list2) {
                    Ejc2.Ejc(j);
                }
            }
            r22.A02 = j;
        } else {
            this.A01 = j;
        }
    }

    public final void Elr(C271754jX r4) {
        if (this instanceof C271824je) {
            C271824je r2 = (C271824je) this;
            0qQ.A0B(r4, 0);
            List<C271744jW> list = r2.A05;
            if (list != null) {
                for (C271744jW Elr : list) {
                    Elr.Elr(r4);
                }
            }
            r2.A03 = r4;
        } else if (this instanceof C271834jf) {
            C271834jf r22 = (C271834jf) this;
            0qQ.A0B(r4, 0);
            List<C271744jW> list2 = r22.A04;
            if (list2 != null) {
                for (C271744jW Elr2 : list2) {
                    Elr2.Elr(r4);
                }
            }
            r22.A03 = r4;
        } else {
            0qQ.A0B(r4, 0);
            this.A03 = r4;
        }
    }
}

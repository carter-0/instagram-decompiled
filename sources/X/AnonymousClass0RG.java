package X;

/* renamed from: X.0RG  reason: invalid class name */
public final class AnonymousClass0RG implements AnonymousClass0gr {
    public final /* synthetic */ 0WG A00;

    public AnonymousClass0RG(0WG r1) {
        this.A00 = r1;
    }

    private void A00() {
        AnonymousClass0TR r0;
        this.A00.A05.onTrigger();
        synchronized (AnonymousClass0TU.class) {
            r0 = AnonymousClass0TU.A00;
        }
        if (r0 != null) {
            r0.EDs(this);
        }
    }

    public final void CuY(0TS r2) {
        if ((this.A00.A00 & 4) != 0 && r2 == 0TS.A02) {
            A00();
        }
    }

    public final void DMb(0TS r2) {
        if ((this.A00.A00 & 1) != 0 && r2 == 0TS.A02) {
            A00();
        }
    }

    public final void Dq7(0TS r2) {
        if ((this.A00.A00 & 2) != 0 && r2 == 0TS.A02) {
            A00();
        }
    }
}

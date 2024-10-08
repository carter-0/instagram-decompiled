package X;

import androidx.lifecycle.OnLifecycleEvent;

/* renamed from: X.FYw  reason: case insensitive filesystem */
public final class C50339FYw implements AnonymousClass0lh, AnonymousClass07Y {
    public AnonymousClass17A A00;
    public C51922G7q A01;
    public G8B A02;
    public C51952G8v A03;
    public Boolean A04;
    public Boolean A05;
    public Integer A06;
    public String A07;
    public String A08;
    public final 0lg A09;
    public final 27S A0A;

    @OnLifecycleEvent(07T.ON_DESTROY)
    public void cleanUp() {
        C51952G8v g8v = this.A03;
        if (g8v != null) {
            g8v.getLifecycle().A0A(this);
        }
        this.A03 = null;
        this.A07 = null;
        this.A04 = null;
        this.A02 = null;
        this.A06 = null;
        this.A08 = null;
        this.A05 = null;
        this.A01 = null;
        this.A00 = null;
    }

    public final void onSessionWillEnd() {
        AnonymousClass1Nd.A00(this.A09).A02(this.A0A, C50276FWh.class);
    }

    public C50339FYw(0lg r4) {
        FX1 A002 = FX1.A00(this, 32);
        this.A0A = A002;
        this.A09 = r4;
        AnonymousClass1Nd.A00(r4).A01(A002, C50276FWh.class);
    }
}

package X;

import android.view.View;
import android.view.ViewStub;

/* renamed from: X.3yi  reason: invalid class name and case insensitive filesystem */
public final class C258253yi {
    public C252063oV A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;

    public final void A00() {
        C252063oV r0 = this.A00;
        if (r0 == null) {
            0qQ.A0F("stubHolder");
            throw AnonymousClass00P.createAndThrow();
        } else if (r0.CVM()) {
            ((View) this.A01.getValue()).setVisibility(8);
        }
    }

    public C258253yi(ViewStub viewStub) {
        0eO r2 = 0eO.A02;
        this.A01 = AnonymousClass0eN.A00(r2, new AnonymousClass9L2(this, 6));
        this.A03 = AnonymousClass0eN.A00(r2, new AnonymousClass9L2(this, 8));
        this.A05 = AnonymousClass0eN.A00(r2, new AnonymousClass9L2(this, 10));
        this.A06 = AnonymousClass0eN.A00(r2, new AnonymousClass9L2(this, 11));
        this.A04 = AnonymousClass0eN.A00(r2, new AnonymousClass9L2(this, 9));
        this.A02 = AnonymousClass0eN.A00(r2, new AnonymousClass9L2(this, 7));
        this.A00 = 2b1.A01(viewStub, false, false);
    }

    public C258253yi(View view) {
        0eO r2 = 0eO.A02;
        this.A01 = AnonymousClass0eN.A00(r2, new AnonymousClass9L2(this, 6));
        this.A03 = AnonymousClass0eN.A00(r2, new AnonymousClass9L2(this, 8));
        this.A05 = AnonymousClass0eN.A00(r2, new AnonymousClass9L2(this, 10));
        this.A06 = AnonymousClass0eN.A00(r2, new AnonymousClass9L2(this, 11));
        this.A04 = AnonymousClass0eN.A00(r2, new AnonymousClass9L2(this, 9));
        this.A02 = AnonymousClass0eN.A00(r2, new AnonymousClass9L2(this, 7));
        this.A00 = 2b1.A00(view);
    }
}

package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Xby  reason: case insensitive filesystem */
public final class C21466Xby {
    public C21533Xe1 A00;
    public List A01 = AnonymousClass7TE.A1C();
    public final XcO A02 = new XcO();
    public final SIQ A03 = new SIQ();
    public final C22527Y7y A04;
    public final YCG A05;
    public final C22520Y7r A06;

    public final void A00() {
        if (!this.A01.isEmpty()) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            if (0 < this.A01.size()) {
                this.A01.get(0);
                throw AnonymousClass7TE.A11("release");
            } else {
                this.A01 = A1C;
            }
        }
    }

    public C21466Xby(C22520Y7r y7r, C21533Xe1 xe1, C22527Y7y y7y, YCG ycg) {
        this.A05 = ycg;
        this.A06 = y7r;
        this.A04 = y7y;
        this.A00 = xe1;
    }
}

package X;

import java.util.Set;

/* renamed from: X.IUm  reason: case insensitive filesystem */
public final class C57251IUm implements C242803Vz, AnonymousClass3W0 {
    public int A00;
    public Integer A01 = AnonymousClass05K.A0N;
    public int A02 = -1;
    public final Set A03 = AnonymousClass7TE.A1F();

    public final /* synthetic */ int BKg() {
        return -1;
    }

    public final /* synthetic */ int BL7() {
        return -1;
    }

    public final boolean CdP() {
        return C51969G9p.A1a(this.A01, AnonymousClass05K.A0N);
    }

    public final int getPosition() {
        int i = this.A02;
        if (i >= 0) {
            return i;
        }
        throw AnonymousClass7TE.A0z("Position is not set.");
    }

    public final void A00(int i) {
        C51965G9l.A13();
        this.A02 = i;
    }
}

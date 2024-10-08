package X;

import com.instagram.common.gallery.Medium;

/* renamed from: X.9m7  reason: invalid class name and case insensitive filesystem */
public final class C387379m7 extends AnonymousClass6MU {
    public int A00;
    public int A01;
    public Medium A02;

    public C387379m7(Medium medium, int i, int i2) {
        0qQ.A0B(medium, 1);
        this.A02 = medium;
        this.A01 = i;
        this.A00 = i2;
    }

    public final Medium A00() {
        Medium medium = this.A02;
        if (medium != null) {
            return medium;
        }
        0qQ.A0F("medium");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C273914nO BkW() {
        C317876nz r0 = C317876nz.A0a;
        C317876nz A002 = C317886o0.A00();
        C273914nO A0C = AnonymousClass7TH.A0C();
        AnonymousClass7TH.A0Y(this, A002, A0C);
        return A0C;
    }

    public final Integer CAk() {
        return AnonymousClass05K.A03;
    }

    public C387379m7() {
    }
}

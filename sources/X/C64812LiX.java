package X;

import java.util.AbstractCollection;

/* renamed from: X.LiX  reason: case insensitive filesystem */
public final class C64812LiX implements C232262tL {
    public final int A00;
    public final boolean A01;

    public static void A00(AbstractCollection abstractCollection, int i, boolean z) {
        abstractCollection.add(new C64812LiX(i, z));
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return Integer.valueOf(this.A00);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C64812LiX liX = (C64812LiX) obj;
        0qQ.A0B(liX, 0);
        return AnonymousClass7TF.A1S(this.A00, liX.A00);
    }

    public C64812LiX(int i, boolean z) {
        this.A00 = i;
        this.A01 = z;
    }
}

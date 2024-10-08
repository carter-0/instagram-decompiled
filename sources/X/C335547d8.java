package X;

import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.7d8  reason: invalid class name and case insensitive filesystem */
public final class C335547d8 extends AnonymousClass0T0 implements C334027aY {
    public final UUID A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C335547d8) && 0qQ.A0K(this.A00, ((C335547d8) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public /* synthetic */ C335547d8(UUID uuid, DefaultConstructorMarker defaultConstructorMarker, int i) {
        UUID randomUUID = UUID.randomUUID();
        0qQ.A0B(randomUUID, 1);
        this.A00 = randomUUID;
    }

    public C335547d8() {
        UUID randomUUID = UUID.randomUUID();
        0qQ.A0B(randomUUID, 1);
        this.A00 = randomUUID;
    }
}

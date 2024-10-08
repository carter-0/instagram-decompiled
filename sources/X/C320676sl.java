package X;

import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.6sl  reason: invalid class name and case insensitive filesystem */
public final class C320676sl implements C232262tL {
    public final long A00;

    public C320676sl() {
        this((DefaultConstructorMarker) null, 1, 0);
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return String.valueOf(this.A00);
    }

    public /* synthetic */ C320676sl(DefaultConstructorMarker defaultConstructorMarker, int i, long j) {
        this.A00 = UUID.randomUUID().getMostSignificantBits();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return false;
    }
}

package X;

/* renamed from: X.B7c  reason: case insensitive filesystem */
public final class C41925B7c extends C250663lr implements DZQ {
    public final int BPZ() {
        return getCoercedIntField(0, "maximum_global_impressions");
    }

    public final int BPa() {
        return getCoercedIntField(1, "maximum_impressions_per_user");
    }

    public final int BGX() {
        return A00("impression_cooldown_secs");
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        AnonymousClass4L8 r3 = AnonymousClass4L8.A00;
        return AnonymousClass7TG.A0U(r3, AnonymousClass7TE.A0f(r3, "maximum_global_impressions"), AnonymousClass7TE.A0f(r3, "maximum_impressions_per_user"), "impression_cooldown_secs");
    }

    public C41925B7c(int i) {
        super(i);
    }

    public C41925B7c() {
        super(8068514);
    }
}

package X;

/* renamed from: X.Nc0  reason: case insensitive filesystem */
public final class C68973Nc0 extends AnonymousClass78R {
    public final C3260875i createCommandData() {
        AnonymousClass7OR r2 = this.commandType;
        String A0R = 002.A0R(002.A0D("‍", r2.A00), this.trigger);
        String str = this.description;
        if (str != null) {
            return new C3260775h(this.loggingId, r2, 3, A0R, str, this.iconDrawableRes);
        }
        throw AnonymousClass7TE.A0y();
    }
}

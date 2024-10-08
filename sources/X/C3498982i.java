package X;

import com.instagram.user.model.User;

/* renamed from: X.82i  reason: invalid class name and case insensitive filesystem */
public final class C3498982i {
    public AnonymousClass8JI A00;
    public final A5F A01;
    public final C379289Tg A02;
    public final 1Xj A03;
    public final 1Xj A04;
    public final User A05;

    public C3498982i(A5F a5f, AnonymousClass8JI r5, 1Xj r6, User user) {
        C379289Tg r0;
        this.A04 = r6;
        this.A05 = user;
        this.A01 = a5f;
        if (r6.A5v()) {
            r0 = C379289Tg.STORY;
        } else if (r6.A5G() || r6.A5T() || r6.A5Y()) {
            r0 = C379289Tg.CLIPS;
        } else {
            throw new IllegalArgumentException(002.A0S("Unsupported media type ", r6.A32(), '!'));
        }
        this.A02 = r0;
        this.A03 = r6;
        this.A00 = r5;
    }
}

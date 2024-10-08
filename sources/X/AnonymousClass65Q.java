package X;

/* renamed from: X.65Q  reason: invalid class name */
public final class AnonymousClass65Q {
    public final 1Av A00;
    public final C61410nE A01;

    public AnonymousClass65Q(C61410nE r2, 1Av r3) {
        0qQ.A0B(r3, 1);
        0qQ.A0B(r2, 2);
        this.A00 = r3;
        this.A01 = r2;
    }

    public final C376639It A00() {
        String str;
        1Av r1 = this.A00;
        boolean z = true;
        if (r1.A1l()) {
            str = "direct_messages_muted";
        } else if (System.currentTimeMillis() < r1.A01.getLong(AnonymousClass000.A00(1280), -1)) {
            str = "all_notifications_paused";
        } else {
            z = false;
            str = "";
        }
        return new C376639It(str, 0, z);
    }
}

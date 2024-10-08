package X;

/* renamed from: X.4WS  reason: invalid class name */
public final class AnonymousClass4WS implements AnonymousClass4WT {
    public final /* synthetic */ AnonymousClass35D A00;

    public final void Dxf(1Xj r7, String str) {
        AnonymousClass35D r1 = this.A00;
        String A30 = r7.A30();
        if (A30 != null) {
            AnonymousClass35D.A00((C257183wz) null, r1, A30, (String) null, str, false);
            AnonymousClass2l3 r2 = r1.A02;
            AnonymousClass2l3.A02(r2, "FIRST_MEDIA_LOAD_FAILED");
            if (r2.A06) {
                r2.A0B.removeCallbacks(r2.A0K);
                Integer num = AnonymousClass05K.A0u;
                r2.A0O = num;
                r2.A0P = num;
                AnonymousClass2l3.A01(r2);
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void DyW(C257183wz r7, 1Xj r8) {
        AnonymousClass35D r1 = this.A00;
        String A30 = r8.A30();
        if (A30 != null) {
            AnonymousClass35D.A00(r7, r1, A30, (String) null, (String) null, true);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public AnonymousClass4WS(AnonymousClass35D r1) {
        this.A00 = r1;
    }

    public final void DyB(1Xj r4) {
        18g r2 = this.A00.A02.A0I;
        r2.A0O(r2.A02, "IG_FIRST_VIDEO_REQUESTED_PLAYING");
    }
}

package X;

/* renamed from: X.32s  reason: invalid class name and case insensitive filesystem */
public final class C2361732s implements 1wn {
    public final /* synthetic */ C2357230y A00;

    public C2361732s(C2357230y r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(-917528200);
        AnonymousClass3KV r5 = (AnonymousClass3KV) obj;
        int A032 = AnonymousClass0fD.A03(-1843720513);
        0qQ.A0B(r5, 0);
        boolean z = r5.A00;
        AnonymousClass2xS r0 = this.A00.A0W;
        if (z) {
            C232722uK r1 = r0.A0G;
            AnonymousClass4M3 r02 = r1.A05;
            if (r02 == null || !r02.isPlaying()) {
                r1.A0M();
            }
        } else {
            r0.A0G.A0T("bottom_sheet_height_threshold_reached");
        }
        AnonymousClass0fD.A0A(-1130299998, A032);
        AnonymousClass0fD.A0A(1436087898, A03);
    }
}

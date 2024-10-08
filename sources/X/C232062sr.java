package X;

/* renamed from: X.2sr  reason: invalid class name and case insensitive filesystem */
public final class C232062sr implements C232022sn {
    public final AnonymousClass5IN ABt(AnonymousClass4VR r10, AnonymousClass426 r11) {
        boolean z;
        0qQ.A0B(r10, 0);
        0qQ.A0B(r11, 1);
        AnonymousClass4UC r2 = ((AnonymousClass4VQ) r10).A01;
        long j = r2.A04 * 1000;
        long j2 = r2.A02 * 1000;
        long j3 = r11.A00;
        if ((j == 0 || j3 > j) && (j2 == 0 || j3 < j2)) {
            z = true;
        } else {
            z = false;
        }
        AnonymousClass5IO r22 = new AnonymousClass5IO(j, j2, j3);
        if (z) {
            return AnonymousClass5IM.A01(r22);
        }
        return AnonymousClass5IM.A02(r22, "outside_of_enabled_time");
    }

    public final String FNO() {
        return "client_enabled_time";
    }
}

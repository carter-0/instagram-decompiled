package X;

/* renamed from: X.4Qi  reason: invalid class name and case insensitive filesystem */
public final class C264554Qi implements C264564Qj {
    public C290455fL A00;
    public C264544Qh A01;
    public AnonymousClass28n A02;

    public final long BTQ(C264034Oi r17, AnonymousClass4XP r18, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, boolean z, boolean z2, boolean z3) {
        AnonymousClass4XP r6 = r18;
        if (j7 == -9223372036854775807L && j8 == -9223372036854775807L && j9 == -9223372036854775807L) {
            C264544Qh r0 = this.A01;
            if (!r0.A0M) {
                return -9223372036854775807L;
            }
            if (r0.A00 <= 0 && r0.A01 <= 0) {
                return -9223372036854775807L;
            }
        }
        if (!z) {
            return -9223372036854775807L;
        }
        C264544Qh r02 = this.A01;
        C264034Oi r1 = r17;
        if (r17 == null || !r1.A00) {
            return -9223372036854775807L;
        }
        long j10 = 0;
        long j11 = (long) r02.A00;
        long j12 = (long) r02.A01;
        if (j7 != -9223372036854775807L && j7 > 0) {
            j10 = j7;
        }
        if (j8 != -9223372036854775807L && j8 > 0) {
            j11 = j8;
        }
        if (j9 != -9223372036854775807L && j9 > 0) {
            j12 = j9;
        }
        long j13 = j5;
        if (j10 <= 0 || (j2 >= j5 && j >= j3)) {
            if (j11 <= 0 || j12 <= 0) {
                return -9223372036854775807L;
            }
            long j14 = j4 - (j11 * 1000);
            AnonymousClass4XN r62 = (AnonymousClass4XN) r6;
            if (j2 < Math.max(j13, Math.min(r62.A0f[r62.A0E.Brh()].A04(j14 - (j12 * 1000)), j6))) {
                return j14;
            }
            return -9223372036854775807L;
        } else if (z3) {
            return j4 - (j10 * 1000);
        } else {
            return -9223372036854775807L;
        }
    }
}

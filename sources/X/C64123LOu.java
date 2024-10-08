package X;

/* renamed from: X.LOu  reason: case insensitive filesystem */
public final class C64123LOu {
    public final AnonymousClass62P A00;
    public final AnonymousClass62P A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C64123LOu) {
                C64123LOu lOu = (C64123LOu) obj;
                if (this.A02 != lOu.A02 || !0qQ.A0K(this.A00, lOu.A00) || !0qQ.A0K(this.A01, lOu.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TF.A07(this.A00, C51965G9l.A05(this.A02)));
    }

    public C64123LOu(AnonymousClass62P r1, AnonymousClass62P r2, boolean z) {
        AnonymousClass7TG.A1Q(r1, r2);
        this.A02 = z;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MEmuUpdateProfileResponse(createdMEmuProfile=");
        A1A.append(this.A02);
        A1A.append(", extendedCaptureImages=");
        A1A.append(this.A00);
        A1A.append(", verificationResults=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C64123LOu() {
        /*
            r3 = this;
            r2 = 0
            X.0sn r0 = X.0sn.A00
            X.62P r1 = X.AnonymousClass62Q.A00(r0)
            X.62P r0 = X.AnonymousClass62Q.A00(r0)
            r3.<init>(r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64123LOu.<init>():void");
    }
}

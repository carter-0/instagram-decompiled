package X;

/* renamed from: X.DtZ  reason: case insensitive filesystem */
public final class C47248DtZ extends AnonymousClass0T0 implements C232262tL {
    public final C43746C7q A00;
    public final 0sP A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47248DtZ) {
                C47248DtZ dtZ = (C47248DtZ) obj;
                if (!0qQ.A0K(this.A00, dtZ.A00) || this.A02 != dtZ.A02 || !0qQ.A0K(this.A01, dtZ.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return String.valueOf(this.A00.A07("sticker_pack_id"));
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TF.A09(this.A02, AnonymousClass7TE.A0K(this.A00)));
    }

    public C47248DtZ(C43746C7q c7q, 0sP r2, boolean z) {
        this.A00 = c7q;
        this.A02 = z;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AvatarPoseGridItemViewModel(poseOption=");
        A1A.append(this.A00);
        A1A.append(C66579MXk.A00(47));
        A1A.append(this.A02);
        A1A.append(", onPoseSelected=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}

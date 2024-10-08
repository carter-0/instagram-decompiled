package X;

import com.instagram.api.schemas.AvatarCoinFlipBackgroundOptionResponse;

/* renamed from: X.DtY  reason: case insensitive filesystem */
public final class C47247DtY extends AnonymousClass0T0 implements C232262tL {
    public final AvatarCoinFlipBackgroundOptionResponse A00;
    public final 0sP A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47247DtY) {
                C47247DtY dtY = (C47247DtY) obj;
                if (!0qQ.A0K(this.A00, dtY.A00) || this.A02 != dtY.A02 || !0qQ.A0K(this.A01, dtY.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.A02;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TF.A09(this.A02, AnonymousClass7TE.A0K(this.A00)));
    }

    public C47247DtY(AvatarCoinFlipBackgroundOptionResponse avatarCoinFlipBackgroundOptionResponse, 0sP r2, boolean z) {
        this.A00 = avatarCoinFlipBackgroundOptionResponse;
        this.A02 = z;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AvatarBackgroundGridItemViewModel(backgroundOption=");
        A1A.append(this.A00);
        A1A.append(C66579MXk.A00(47));
        A1A.append(this.A02);
        A1A.append(", onBackgroundSelected=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}

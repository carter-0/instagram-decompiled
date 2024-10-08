package X;

import com.instagram.api.schemas.IGMusicArtistPinningErrorType;

/* renamed from: X.DrI  reason: case insensitive filesystem */
public final class C47141DrI extends AnonymousClass0T0 {
    public final IGMusicArtistPinningErrorType A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47141DrI) {
                C47141DrI drI = (C47141DrI) obj;
                if (!(this.A00 == drI.A00 && this.A01 == drI.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A01, AnonymousClass7TG.A0C(this.A00) * 31);
    }

    public C47141DrI(IGMusicArtistPinningErrorType iGMusicArtistPinningErrorType, boolean z) {
        this.A00 = iGMusicArtistPinningErrorType;
        this.A01 = z;
    }
}

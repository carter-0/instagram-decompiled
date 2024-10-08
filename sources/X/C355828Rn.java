package X;

/* renamed from: X.8Rn  reason: invalid class name and case insensitive filesystem */
public final class C355828Rn extends C355808Rl {
    public final int A00;
    public final C53368Gms A01;
    public final C53368Gms A02;
    public final C53368Gms A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C355828Rn) {
                C355828Rn r5 = (C355828Rn) obj;
                if (this.A00 != r5.A00 || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A02, r5.A02) || this.A04 != r5.A04) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VolumeControls(selectedVideoIndex=");
        sb.append(this.A00);
        sb.append(", selectedAudioCoords=");
        sb.append(this.A01);
        sb.append(", selectedVoiceoverCoords=");
        sb.append(this.A03);
        sb.append(", selectedStickerCoords=");
        sb.append(this.A02);
        sb.append(", originalCameraAudioOnMute=");
        sb.append(this.A04);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i = this.A00 * 31;
        C53368Gms gms = this.A01;
        int i2 = 0;
        if (gms == null) {
            hashCode = 0;
        } else {
            hashCode = gms.hashCode();
        }
        int i3 = (i + hashCode) * 31;
        C53368Gms gms2 = this.A03;
        if (gms2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = gms2.hashCode();
        }
        int i4 = (i3 + hashCode2) * 31;
        C53368Gms gms3 = this.A02;
        if (gms3 != null) {
            i2 = gms3.hashCode();
        }
        int i5 = (i4 + i2) * 31;
        int i6 = 1237;
        if (this.A04) {
            i6 = 1231;
        }
        return i5 + i6;
    }

    public C355828Rn(C53368Gms gms, C53368Gms gms2, C53368Gms gms3, int i, boolean z) {
        this.A00 = i;
        this.A01 = gms;
        this.A03 = gms2;
        this.A02 = gms3;
        this.A04 = z;
    }

    public C355828Rn() {
        this((C53368Gms) null, (C53368Gms) null, (C53368Gms) null, -1, false);
    }
}

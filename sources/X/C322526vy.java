package X;

import android.os.Parcelable;
import com.instagram.avatars.coinflip.AvatarCoinFlipConfig;

/* renamed from: X.6vy  reason: invalid class name and case insensitive filesystem */
public final class C322526vy {
    public int A00 = 0;
    public Parcelable A01;
    public AvatarCoinFlipConfig A02;
    public C322506vw A03 = C322506vw.Original;
    public C322496vv A04 = C322496vv.Closed;
    public C294255m9 A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I = false;
    public boolean A0J;
    public boolean A0K;

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        C322496vv r0 = this.A04;
        int i5 = 0;
        if (r0 != null) {
            i = r0.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        C322506vw r02 = this.A03;
        if (r02 != null) {
            i2 = r02.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        C294255m9 r03 = this.A05;
        if (r03 != null) {
            i3 = r03.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        Parcelable parcelable = this.A01;
        if (parcelable != null) {
            i4 = parcelable.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (((((((((((((((((((((((((((i8 + i4) * 31) + (this.A06 ? 1 : 0)) * 31) + (this.A0G ? 1 : 0)) * 31) + (this.A0A ? 1 : 0)) * 31) + (this.A08 ? 1 : 0)) * 31) + (this.A0J ? 1 : 0)) * 31) + (this.A0K ? 1 : 0)) * 31) + (this.A0H ? 1 : 0)) * 31) + (this.A0B ? 1 : 0)) * 31) + (this.A0C ? 1 : 0)) * 31) + (this.A0E ? 1 : 0)) * 31) + (this.A0D ? 1 : 0)) * 31) + (this.A09 ? 1 : 0)) * 31) + (this.A0I ? 1 : 0)) * 31;
        AvatarCoinFlipConfig avatarCoinFlipConfig = this.A02;
        if (avatarCoinFlipConfig != null) {
            i5 = avatarCoinFlipConfig.hashCode();
        }
        return ((((((i9 + i5) * 31) + this.A00) * 31) + (this.A07 ? 1 : 0)) * 31) + (this.A0F ? 1 : 0);
    }
}

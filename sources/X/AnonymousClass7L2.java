package X;

import com.instagram.direct.model.DirectThreadThemeInfo;

/* renamed from: X.7L2  reason: invalid class name */
public final class AnonymousClass7L2 {
    public final int A00;
    public final int A01;
    public final AnonymousClass7L1 A02;
    public final C329977Ky A03;
    public final C329967Kx A04;
    public final C329987Kz A05;
    public final C329987Kz A06;
    public final AnonymousClass7L0 A07;
    public final DirectThreadThemeInfo A08;
    public final String A09;
    public final boolean A0A;

    public final boolean A00() {
        DirectThreadThemeInfo directThreadThemeInfo = this.A08;
        if (directThreadThemeInfo == null || directThreadThemeInfo.A0g == null) {
            return false;
        }
        return true;
    }

    public AnonymousClass7L2(AnonymousClass7L1 r2, C329977Ky r3, C329967Kx r4, C329987Kz r5, C329987Kz r6, AnonymousClass7L0 r7, DirectThreadThemeInfo directThreadThemeInfo, int i, int i2, boolean z) {
        String str;
        this.A05 = r5;
        this.A06 = r6;
        this.A07 = r7;
        this.A04 = r4;
        this.A03 = r3;
        this.A02 = r2;
        this.A01 = i;
        this.A08 = directThreadThemeInfo;
        this.A00 = i2;
        this.A0A = z;
        if (directThreadThemeInfo == null) {
            str = "";
        } else {
            str = directThreadThemeInfo.A0o;
        }
        this.A09 = str;
    }
}

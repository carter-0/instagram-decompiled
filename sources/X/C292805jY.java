package X;

import com.instagram.api.schemas.RIXUAspectRatio;
import com.instagram.api.schemas.RIXULayoutFormat;
import com.instagram.api.schemas.RIXULayoutStyle;
import java.util.Set;

/* renamed from: X.5jY  reason: invalid class name and case insensitive filesystem */
public final class C292805jY {
    public static final C292805jY A04 = new C292805jY((RIXUAspectRatio) null, (RIXULayoutFormat) null, (RIXULayoutStyle) null, 0);
    public static final Set A05 = 0sc.A07(new RIXUAspectRatio[]{RIXUAspectRatio.AR_16_9, RIXUAspectRatio.AR_4_3});
    public static final Set A06 = 0sc.A07(new RIXULayoutFormat[]{RIXULayoutFormat.GRID_2X2, RIXULayoutFormat.GRID_3X2});
    public static final Set A07 = 0sc.A07(new RIXULayoutStyle[]{RIXULayoutStyle.CONTAINER, RIXULayoutStyle.FULL_BLEED});
    public final RIXUAspectRatio A00;
    public final RIXULayoutFormat A01;
    public final RIXULayoutStyle A02;
    public final int A03;

    public final boolean A00() {
        int i;
        Set set = A06;
        RIXULayoutFormat rIXULayoutFormat = this.A01;
        if (00k.A0u(set, rIXULayoutFormat) && 00k.A0u(A07, this.A02) && 00k.A0u(A05, this.A00)) {
            int i2 = this.A03;
            if (rIXULayoutFormat != null) {
                int ordinal = rIXULayoutFormat.ordinal();
                if (ordinal == 2) {
                    i = 4;
                } else if (ordinal == 3) {
                    i = 6;
                }
                if (i2 < i) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public C292805jY(RIXUAspectRatio rIXUAspectRatio, RIXULayoutFormat rIXULayoutFormat, RIXULayoutStyle rIXULayoutStyle, int i) {
        this.A01 = rIXULayoutFormat;
        this.A02 = rIXULayoutStyle;
        this.A00 = rIXUAspectRatio;
        this.A03 = i;
    }
}

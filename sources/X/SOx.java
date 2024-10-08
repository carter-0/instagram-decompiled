package X;

import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableSet;
import java.util.Set;

public final class SOx {
    public static final SOx A03;
    public final int A00;
    public final int A01;
    public final ImmutableSet A02;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SOx)) {
            return false;
        }
        SOx sOx = (SOx) obj;
        return this.A00 == sOx.A00 && this.A01 == sOx.A01 && Util.A0E(this.A02, sOx.A02);
    }

    static {
        SOx sOx;
        if (Util.A01 >= 33) {
            1R1 r2 = new 1R1();
            int i = 1;
            while (true) {
                int i2 = 4;
                while (true) {
                    r2.A04(Integer.valueOf(i2));
                    i++;
                    if (i <= 10) {
                        switch (i) {
                            case 1:
                            case 2:
                                i2 = 12;
                                break;
                            case 3:
                                i2 = 28;
                                break;
                            case 4:
                                i2 = 204;
                                break;
                            case 5:
                                i2 = 220;
                                break;
                            case 6:
                                i2 = 252;
                                break;
                            case 7:
                                i2 = 1276;
                                break;
                            case 8:
                                i2 = 6396;
                                break;
                            case 10:
                                i2 = 737532;
                                break;
                            default:
                                i2 = 0;
                                break;
                        }
                    } else {
                        sOx = new SOx((Set) r2.A05(), 2);
                    }
                }
            }
        } else {
            sOx = new SOx(2, 10);
        }
        A03 = sOx;
    }

    public final int hashCode() {
        return (((this.A00 * 31) + this.A01) * 31) + AnonymousClass7TG.A0C(this.A02);
    }

    public SOx(Set set, int i) {
        this.A00 = i;
        ImmutableSet A032 = ImmutableSet.A03(set);
        this.A02 = A032;
        C249803kO it = A032.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 = Math.max(i2, Integer.bitCount(AnonymousClass7TG.A0F(it)));
        }
        this.A01 = i2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AudioProfile[format=");
        A1A.append(this.A00);
        A1A.append(", maxChannelCount=");
        A1A.append(this.A01);
        A1A.append(", channelMasks=");
        return Pxg.A0r(this.A02, A1A);
    }

    public SOx(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = null;
    }
}

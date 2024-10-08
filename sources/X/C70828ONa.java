package X;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: X.ONa  reason: case insensitive filesystem */
public final class C70828ONa {
    public Uri A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !DbY.A1b(this, obj)) {
                return false;
            }
            C70828ONa oNa = (C70828ONa) obj;
            if (!(this.A04 == oNa.A04 && Float.compare(oNa.A01, this.A01) == 0 && Float.compare(oNa.A03, this.A03) == 0 && Float.compare(oNa.A02, this.A02) == 0 && 0qQ.A0K(this.A00, oNa.A00))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.A04), false, this.A00, 0, Float.valueOf(this.A01), Float.valueOf(this.A03), Float.valueOf(this.A02)});
    }

    public C70828ONa(Uri uri, float f, float f2, float f3, boolean z) {
        this.A00 = uri;
        this.A04 = z;
        this.A01 = f;
        this.A03 = f2;
        this.A02 = f3;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RtcTone{loop=");
        A1A.append(this.A04);
        A1A.append(", isAsset=");
        A1A.append(false);
        A1A.append(", fileUri=");
        A1A.append(this.A00);
        A1A.append(", resId=");
        A1A.append(0);
        A1A.append(", earpieceVolume=");
        A1A.append(this.A01);
        A1A.append(", speakerVolume=");
        A1A.append(this.A03);
        A1A.append(", headsetVolume=");
        A1A.append(this.A02);
        return C51967G9n.A0r(A1A, '}');
    }
}

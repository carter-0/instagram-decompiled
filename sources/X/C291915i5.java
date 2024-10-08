package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;

/* renamed from: X.5i5  reason: invalid class name and case insensitive filesystem */
public final class C291915i5 {
    public final int A00;
    public final int A01;
    public final C268454dQ A02;
    public final AnonymousClass5ZD A03;
    public final Object A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C291915i5) {
                C291915i5 r5 = (C291915i5) obj;
                if (!0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || this.A00 != r5.A00 || this.A01 != r5.A01 || !0qQ.A0K(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C268454dQ r0 = this.A02;
        int i = 0;
        int hashCode = (((((((r0 == null ? 0 : r0.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A00) * 31) + this.A01) * 31;
        Object obj = this.A04;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("TypefaceRequest(fontFamily=");
        sb.append(this.A02);
        sb.append(", fontWeight=");
        sb.append(this.A03);
        sb.append(", fontStyle=");
        int i = this.A00;
        if (i == 0) {
            str = ReactProgressBarViewManager.DEFAULT_STYLE;
        } else if (i == 1) {
            str = "Italic";
        } else {
            str = "Invalid";
        }
        sb.append(str);
        sb.append(", fontSynthesis=");
        int i2 = this.A01;
        if (i2 == 0) {
            str2 = "None";
        } else if (i2 == 1) {
            str2 = CameraRollManager.ASSET_TYPE_ALL;
        } else if (i2 == 2) {
            str2 = "Weight";
        } else if (i2 == 3) {
            str2 = "Style";
        } else {
            str2 = "Invalid";
        }
        sb.append(str2);
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.A04);
        sb.append(')');
        return sb.toString();
    }

    public C291915i5(C268454dQ r1, AnonymousClass5ZD r2, Object obj, int i, int i2) {
        this.A02 = r1;
        this.A03 = r2;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = obj;
    }
}

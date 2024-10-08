package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import java.util.Map;

/* renamed from: X.8Yw  reason: invalid class name and case insensitive filesystem */
public final class C357608Yw {
    public final String A00;
    public final Map A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C357608Yw) {
                C357608Yw r5 = (C357608Yw) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A00.hashCode() * 31) + IgNetworkConsentStorage.MAX_ENTRIES) * 31) + this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KaraokeBleeps(bleepAssetFilePath=");
        sb.append(this.A00);
        sb.append(", bleepAssetDurationInMs=");
        sb.append(IgNetworkConsentStorage.MAX_ENTRIES);
        sb.append(", originalAudioBleeps=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public C357608Yw(String str, Map map) {
        this.A00 = str;
        this.A01 = map;
    }
}

package X;

import android.os.Bundle;
import com.facebook.cameracore.mediapipeline.services.locale.LocaleDataSource;
import java.util.List;

/* renamed from: X.ARz  reason: case insensitive filesystem */
public final class C40111ARz implements LocaleDataSource, C41801B1g {
    public String A00;

    public final List EzQ(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        if (bundle.containsKey("commandType") && bundle.getInt("commandType") == 0 && bundle.containsKey("locale")) {
            setDeviceLocaleIdentifier(String.valueOf(bundle.getString("locale")));
        }
        return null;
    }

    public final void setDeviceLocaleIdentifier(String str) {
        0qQ.A0B(str, 0);
        this.A00 = str;
    }

    public final String getDeviceLocaleIdentifier() {
        return this.A00;
    }
}

package X;

import com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo;
import java.io.IOException;

public abstract class JUS {
    public static final ShareMediaLoggingInfo A00(String str) {
        if (str != null) {
            try {
                return C63999LHz.parseFromJson(16P.A00(str));
            } catch (IOException e) {
                0kD.A06("ShareMediaLoggingInfoConverter", "Failed to deserialize ShareMediaLoggingInfo from Clips draft.", e);
            }
        }
        return null;
    }
}

package X;

import com.instagram.api.schemas.MediaGenAIDetectionMethod;

/* renamed from: X.3pu  reason: invalid class name and case insensitive filesystem */
public abstract class C252913pu {
    public static final MediaGenAIDetectionMethod A00(String str) {
        MediaGenAIDetectionMethod mediaGenAIDetectionMethod = (MediaGenAIDetectionMethod) MediaGenAIDetectionMethod.A01.get(str);
        if (mediaGenAIDetectionMethod == null) {
            return MediaGenAIDetectionMethod.UNRECOGNIZED;
        }
        return mediaGenAIDetectionMethod;
    }
}

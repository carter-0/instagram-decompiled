package X;

import com.instagram.api.schemas.AudioMetadataLabels;

/* renamed from: X.4kP  reason: invalid class name and case insensitive filesystem */
public abstract class C272264kP {
    public static final AudioMetadataLabels A00(String str) {
        AudioMetadataLabels audioMetadataLabels = (AudioMetadataLabels) AudioMetadataLabels.A01.get(str);
        if (audioMetadataLabels == null) {
            return AudioMetadataLabels.UNRECOGNIZED;
        }
        return audioMetadataLabels;
    }
}

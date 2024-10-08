package X;

import com.instagram.api.schemas.MediaPromptPrefType;

public abstract class XVo {
    public static final MediaPromptPrefType A00(String str) {
        MediaPromptPrefType mediaPromptPrefType = (MediaPromptPrefType) MediaPromptPrefType.A01.get(str);
        if (mediaPromptPrefType == null) {
            return MediaPromptPrefType.UNRECOGNIZED;
        }
        return mediaPromptPrefType;
    }
}

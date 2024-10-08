package X;

import com.instagram.api.schemas.ClipsTextFormatType;

/* renamed from: X.3iQ  reason: invalid class name and case insensitive filesystem */
public abstract class C248693iQ {
    public static final ClipsTextFormatType A00(String str) {
        ClipsTextFormatType clipsTextFormatType = (ClipsTextFormatType) ClipsTextFormatType.A01.get(str);
        if (clipsTextFormatType == null) {
            return ClipsTextFormatType.UNRECOGNIZED;
        }
        return clipsTextFormatType;
    }
}

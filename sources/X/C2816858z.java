package X;

import com.instagram.api.schemas.IGLiveBadgeSettings;

/* renamed from: X.58z  reason: invalid class name and case insensitive filesystem */
public abstract class C2816858z {
    public static final IGLiveBadgeSettings A00(String str) {
        IGLiveBadgeSettings iGLiveBadgeSettings = (IGLiveBadgeSettings) IGLiveBadgeSettings.A01.get(str);
        if (iGLiveBadgeSettings == null) {
            return IGLiveBadgeSettings.UNRECOGNIZED;
        }
        return iGLiveBadgeSettings;
    }
}

package X;

import com.instagram.api.schemas.CameraTool;

/* renamed from: X.JZc  reason: case insensitive filesystem */
public abstract class C59808JZc {
    public static final C59809JZd A00(CameraTool cameraTool) {
        if (cameraTool == null) {
            return null;
        }
        int ordinal = cameraTool.ordinal();
        if (ordinal == 65 || ordinal == 70) {
            return C59809JZd.IMAGINE;
        }
        if (ordinal == 68 || ordinal == 91 || ordinal == 69) {
            return C59809JZd.IMAGINE_ME;
        }
        return null;
    }
}

package X;

import com.instagram.api.schemas.CameraTool;

/* renamed from: X.53k  reason: invalid class name and case insensitive filesystem */
public abstract class C2807253k {
    public static final CameraTool A00(String str) {
        CameraTool cameraTool = (CameraTool) CameraTool.A01.get(str);
        if (cameraTool == null) {
            return CameraTool.UNRECOGNIZED;
        }
        return cameraTool;
    }
}

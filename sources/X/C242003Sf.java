package X;

import com.instagram.api.schemas.BizUserInboxState;

/* renamed from: X.3Sf  reason: invalid class name and case insensitive filesystem */
public abstract class C242003Sf {
    public static final BizUserInboxState A00(String str) {
        BizUserInboxState bizUserInboxState = (BizUserInboxState) BizUserInboxState.A01.get(str);
        if (bizUserInboxState == null) {
            return BizUserInboxState.UNRECOGNIZED;
        }
        return bizUserInboxState;
    }
}

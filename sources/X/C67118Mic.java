package X;

import com.instagram.api.schemas.BizUserInboxState;

/* renamed from: X.Mic  reason: case insensitive filesystem */
public abstract class C67118Mic {
    public static final C67220MkG A00(BizUserInboxState bizUserInboxState, C67220MkG mkG) {
        C67220MkG mkG2;
        C67220MkG mkG3;
        0qQ.A0B(mkG, 1);
        if (bizUserInboxState == BizUserInboxState.NORMAL && mkG != C67220MkG.DEFAULT) {
            return C67220MkG.GENERAL_FOLDER_RECOVERED_BANNER;
        }
        if (bizUserInboxState == BizUserInboxState.NEW_API_THREADS_THROTTLED && mkG != (mkG3 = C67220MkG.NEW_THREADS_THROTTLED_BANNER) && mkG != C67220MkG.NEW_THREADS_THROTTLED_LIGHT_BANNER) {
            return mkG3;
        }
        if (bizUserInboxState != BizUserInboxState.GENERAL_FOLDER_THROTTLED || mkG == (mkG2 = C67220MkG.GENERAL_FOLDER_HMPS_BANNER) || mkG == C67220MkG.GENERAL_FOLDER_HMPS_LIGHT_BANNER) {
            return mkG;
        }
        return mkG2;
    }
}

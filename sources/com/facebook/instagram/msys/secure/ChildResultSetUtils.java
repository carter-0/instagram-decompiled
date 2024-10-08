package com.facebook.instagram.msys.secure;

import X.0dV;
import com.facebook.msys.mci.CQLResultSetImpl;

public class ChildResultSetUtils {
    public static ChildResultSetUtils sInstance = new Object();

    public static native CQLResultSetImpl getInstagramSecureThreadListMessageAdditionalInfoFromInstagramSecureThreadListNative(CQLResultSetImpl cQLResultSetImpl, int i);

    public static native CQLResultSetImpl getInstagramSecureThreadListMessageTextListFromInstagramSecureThreadListNative(CQLResultSetImpl cQLResultSetImpl, int i);

    public static native CQLResultSetImpl getInstagramSecureThreadListParticipantListFromInstagramSecureThreadListNative(CQLResultSetImpl cQLResultSetImpl, int i);

    public static native CQLResultSetImpl getInstagramSecureThreadListReceiptStateListFromInstagramSecureThreadListNative(CQLResultSetImpl cQLResultSetImpl, int i);

    /* JADX WARNING: type inference failed for: r0v1, types: [com.facebook.instagram.msys.secure.ChildResultSetUtils, java.lang.Object] */
    static {
        0dV.A0C("securethreadlistchildresultsetutils");
    }
}

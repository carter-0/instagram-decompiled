package X;

import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.DiJ  reason: case insensitive filesystem */
public abstract class C46638DiJ {
    public static final C255943uy A00(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1867169789) {
            if (hashCode != -1281977283) {
                if (hashCode == 336650556 && str.equals("loading")) {
                    return C255943uy.LOADING;
                }
            } else if (str.equals("failed")) {
                return C255943uy.FAILED;
            }
        } else if (str.equals(RealtimeConstants.SEND_SUCCESS)) {
            return C255943uy.SUCCESS;
        }
        throw DbW.A0c("unknown spinner state: ", str);
    }
}

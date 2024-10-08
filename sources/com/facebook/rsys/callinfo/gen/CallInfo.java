package com.facebook.rsys.callinfo.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C22180Xwq;
import X.C41845B3m;
import X.C66583MXo;
import X.C66584MXp;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

public class CallInfo {
    public static 2LV CONVERTER = C22180Xwq.A00(18);
    public static long sMcfTypeId;
    public final int expansionBehavior;
    public final boolean isAdminAddOnly;
    public final String name;
    public final int state;
    public final ArrayList threadAdminIds;
    public final String threadPhotoURL;

    public static native CallInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CallInfo)) {
                return false;
            }
            CallInfo callInfo = (CallInfo) obj;
            if (this.state != callInfo.state) {
                return false;
            }
            String str = this.name;
            String str2 = callInfo.name;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (this.expansionBehavior != callInfo.expansionBehavior) {
                return false;
            }
            ArrayList arrayList = this.threadAdminIds;
            ArrayList arrayList2 = callInfo.threadAdminIds;
            if (arrayList == null) {
                if (arrayList2 != null) {
                    return false;
                }
            } else if (!arrayList.equals(arrayList2)) {
                return false;
            }
            if (this.isAdminAddOnly != callInfo.isAdminAddOnly) {
                return false;
            }
            String str3 = this.threadPhotoURL;
            String str4 = callInfo.threadPhotoURL;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 != null) {
                return false;
            }
        }
    }

    public int hashCode() {
        return ((((((((C66583MXo.A01(this.state) + AnonymousClass7TG.A0E(this.name)) * 31) + this.expansionBehavior) * 31) + AnonymousClass7TG.A0C(this.threadAdminIds)) * 31) + (this.isAdminAddOnly ? 1 : 0)) * 31) + C41845B3m.A00(this.threadPhotoURL);
    }

    public CallInfo(int i, String str, int i2, ArrayList arrayList, boolean z, String str2) {
        this.state = i;
        this.name = str;
        this.expansionBehavior = i2;
        this.threadAdminIds = arrayList;
        this.isAdminAddOnly = z;
        this.threadPhotoURL = str2;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CallInfo{state=");
        A1A.append(this.state);
        A1A.append(",name=");
        A1A.append(this.name);
        A1A.append(",expansionBehavior=");
        A1A.append(this.expansionBehavior);
        A1A.append(",threadAdminIds=");
        A1A.append(this.threadAdminIds);
        A1A.append(",isAdminAddOnly=");
        A1A.append(this.isAdminAddOnly);
        A1A.append(",threadPhotoURL=");
        return C66584MXp.A0a(this.threadPhotoURL, A1A);
    }
}

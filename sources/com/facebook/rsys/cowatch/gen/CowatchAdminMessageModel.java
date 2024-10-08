package com.facebook.rsys.cowatch.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C22180Xwq;
import X.C41845B3m;
import X.C66583MXo;
import X.C66584MXp;
import com.facebook.djinni.msys.infra.McfReference;

public class CowatchAdminMessageModel {
    public static 2LV CONVERTER = C22180Xwq.A00(30);
    public static long sMcfTypeId;
    public final String adminMessage;
    public final String adminMessageActorUserId;
    public final int localAdminMessageType;

    public static native CowatchAdminMessageModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchAdminMessageModel)) {
                return false;
            }
            CowatchAdminMessageModel cowatchAdminMessageModel = (CowatchAdminMessageModel) obj;
            String str = this.adminMessage;
            String str2 = cowatchAdminMessageModel.adminMessage;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (this.localAdminMessageType != cowatchAdminMessageModel.localAdminMessageType) {
                return false;
            }
            String str3 = this.adminMessageActorUserId;
            String str4 = cowatchAdminMessageModel.adminMessageActorUserId;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 != null) {
                return false;
            }
        }
    }

    public int hashCode() {
        return ((C66583MXo.A01(AnonymousClass7TG.A0E(this.adminMessage)) + this.localAdminMessageType) * 31) + C41845B3m.A00(this.adminMessageActorUserId);
    }

    public CowatchAdminMessageModel(String str, int i, String str2) {
        this.adminMessage = str;
        this.localAdminMessageType = i;
        this.adminMessageActorUserId = str2;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CowatchAdminMessageModel{adminMessage=");
        A1A.append(this.adminMessage);
        A1A.append(",localAdminMessageType=");
        A1A.append(this.localAdminMessageType);
        A1A.append(",adminMessageActorUserId=");
        return C66584MXp.A0a(this.adminMessageActorUserId, A1A);
    }
}

package com.facebook.rsys.call.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C22180Xwq;
import X.C66582MXn;
import X.C66583MXo;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.callcontext.gen.CallContext;
import java.util.ArrayList;

public class AddUsersOptions {
    public static 2LV CONVERTER = C22180Xwq.A00(15);
    public static long sMcfTypeId;
    public final ArrayList customDataMessages;
    public final CallContext newCallContext;

    public static native AddUsersOptions createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AddUsersOptions)) {
                return false;
            }
            AddUsersOptions addUsersOptions = (AddUsersOptions) obj;
            CallContext callContext = this.newCallContext;
            CallContext callContext2 = addUsersOptions.newCallContext;
            if (callContext == null) {
                if (callContext2 != null) {
                    return false;
                }
            } else if (!callContext.equals(callContext2)) {
                return false;
            }
            ArrayList arrayList = this.customDataMessages;
            ArrayList arrayList2 = addUsersOptions.customDataMessages;
            if (arrayList != null) {
                return arrayList.equals(arrayList2);
            }
            if (arrayList2 != null) {
                return false;
            }
        }
    }

    public int hashCode() {
        return C66583MXo.A01(AnonymousClass7TG.A0C(this.newCallContext)) + AnonymousClass7TE.A0L(this.customDataMessages);
    }

    public AddUsersOptions(CallContext callContext, ArrayList arrayList) {
        this.newCallContext = callContext;
        this.customDataMessages = arrayList;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AddUsersOptions{newCallContext=");
        A1A.append(this.newCallContext);
        A1A.append(",customDataMessages=");
        return C66582MXn.A0v(this.customDataMessages, A1A);
    }
}

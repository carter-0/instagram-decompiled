package com.facebook.rsys.polls.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C22181Xwr;
import X.C66581MXm;
import X.C66582MXn;
import X.C66583MXo;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

public class PollsCreateActionParams {
    public static 2LV CONVERTER = C22181Xwr.A00(35);
    public static long sMcfTypeId;
    public final ArrayList options;
    public final String pollId;
    public final PollPermissionsModel pollPermissions;
    public final int pollType;
    public final String title;

    public static native PollsCreateActionParams createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PollsCreateActionParams)) {
            return false;
        }
        PollsCreateActionParams pollsCreateActionParams = (PollsCreateActionParams) obj;
        return this.pollId.equals(pollsCreateActionParams.pollId) && this.title.equals(pollsCreateActionParams.title) && this.options.equals(pollsCreateActionParams.options) && this.pollType == pollsCreateActionParams.pollType && this.pollPermissions.equals(pollsCreateActionParams.pollPermissions);
    }

    public int hashCode() {
        int A08 = AnonymousClass7TF.A08(this.title, C66583MXo.A06(this.pollId));
        return AnonymousClass7TE.A0N(this.pollPermissions, (AnonymousClass7TF.A07(this.options, A08) + this.pollType) * 31);
    }

    public PollsCreateActionParams(String str, String str2, ArrayList arrayList, int i, PollPermissionsModel pollPermissionsModel) {
        C66581MXm.A1R(str, str2, arrayList);
        pollPermissionsModel.getClass();
        this.pollId = str;
        this.title = str2;
        this.options = arrayList;
        this.pollType = i;
        this.pollPermissions = pollPermissionsModel;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("PollsCreateActionParams{pollId=");
        A1A.append(this.pollId);
        A1A.append(",title=");
        A1A.append(this.title);
        A1A.append(",options=");
        A1A.append(this.options);
        A1A.append(",pollType=");
        A1A.append(this.pollType);
        A1A.append(",pollPermissions=");
        return C66582MXn.A0v(this.pollPermissions, A1A);
    }
}

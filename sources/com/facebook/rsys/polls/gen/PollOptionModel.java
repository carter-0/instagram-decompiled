package com.facebook.rsys.polls.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C22181Xwr;
import X.C66579MXk;
import X.C66581MXm;
import X.C66582MXn;
import X.C66583MXo;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

public class PollOptionModel {
    public static 2LV CONVERTER = C22181Xwr.A00(30);
    public static long sMcfTypeId;
    public final PollOptionContentModel content;
    public final String id;
    public final PollOptionPermissionsModel permissions;
    public final float voteFraction;
    public final ArrayList voters;

    public static native PollOptionModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PollOptionModel)) {
            return false;
        }
        PollOptionModel pollOptionModel = (PollOptionModel) obj;
        return this.id.equals(pollOptionModel.id) && this.content.equals(pollOptionModel.content) && this.voters.equals(pollOptionModel.voters) && this.voteFraction == pollOptionModel.voteFraction && this.permissions.equals(pollOptionModel.permissions);
    }

    public int hashCode() {
        return AnonymousClass7TE.A0N(this.permissions, AnonymousClass7TF.A00(AnonymousClass7TF.A07(this.voters, AnonymousClass7TF.A07(this.content, C66583MXo.A06(this.id))), this.voteFraction));
    }

    public PollOptionModel(String str, PollOptionContentModel pollOptionContentModel, ArrayList arrayList, float f, PollOptionPermissionsModel pollOptionPermissionsModel) {
        C66581MXm.A1R(str, pollOptionContentModel, arrayList);
        pollOptionPermissionsModel.getClass();
        this.id = str;
        this.content = pollOptionContentModel;
        this.voters = arrayList;
        this.voteFraction = f;
        this.permissions = pollOptionPermissionsModel;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("PollOptionModel{id=");
        A1A.append(this.id);
        A1A.append(C66579MXk.A00(195));
        A1A.append(this.content);
        A1A.append(",voters=");
        A1A.append(this.voters);
        A1A.append(",voteFraction=");
        A1A.append(this.voteFraction);
        A1A.append(",permissions=");
        return C66582MXn.A0v(this.permissions, A1A);
    }
}

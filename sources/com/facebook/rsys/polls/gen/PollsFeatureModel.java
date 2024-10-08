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
import java.util.Map;

public class PollsFeatureModel {
    public static 2LV CONVERTER = C22181Xwr.A00(36);
    public static long sMcfTypeId;
    public final ArrayList pendingActionsQueue;
    public final PollsFeaturePermissionsModel permissions;
    public final Map polls;

    public static native PollsFeatureModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PollsFeatureModel)) {
            return false;
        }
        PollsFeatureModel pollsFeatureModel = (PollsFeatureModel) obj;
        return this.polls.equals(pollsFeatureModel.polls) && this.permissions.equals(pollsFeatureModel.permissions) && this.pendingActionsQueue.equals(pollsFeatureModel.pendingActionsQueue);
    }

    public int hashCode() {
        return AnonymousClass7TE.A0N(this.pendingActionsQueue, AnonymousClass7TF.A07(this.permissions, C66583MXo.A01(this.polls.hashCode())));
    }

    public PollsFeatureModel(Map map, PollsFeaturePermissionsModel pollsFeaturePermissionsModel, ArrayList arrayList) {
        C66581MXm.A1R(map, pollsFeaturePermissionsModel, arrayList);
        this.polls = map;
        this.permissions = pollsFeaturePermissionsModel;
        this.pendingActionsQueue = arrayList;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("PollsFeatureModel{polls=");
        A1A.append(this.polls);
        A1A.append(",permissions=");
        A1A.append(this.permissions);
        A1A.append(",pendingActionsQueue=");
        return C66582MXn.A0v(this.pendingActionsQueue, A1A);
    }
}

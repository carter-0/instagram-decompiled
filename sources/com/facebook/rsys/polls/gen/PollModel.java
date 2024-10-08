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

public class PollModel {
    public static 2LV CONVERTER = C22181Xwr.A00(28);
    public static long sMcfTypeId;
    public final PollParticipantModel creator;
    public final String id;
    public final ArrayList options;
    public final PollPermissionsModel permissions;
    public final int state;
    public final String title;
    public final int type;

    public static native PollModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PollModel)) {
            return false;
        }
        PollModel pollModel = (PollModel) obj;
        return this.id.equals(pollModel.id) && this.creator.equals(pollModel.creator) && this.options.equals(pollModel.options) && this.title.equals(pollModel.title) && this.type == pollModel.type && this.state == pollModel.state && this.permissions.equals(pollModel.permissions);
    }

    public int hashCode() {
        int A07 = AnonymousClass7TF.A07(this.options, AnonymousClass7TF.A07(this.creator, C66583MXo.A06(this.id)));
        return AnonymousClass7TE.A0N(this.permissions, (((AnonymousClass7TF.A08(this.title, A07) + this.type) * 31) + this.state) * 31);
    }

    public PollModel(String str, PollParticipantModel pollParticipantModel, ArrayList arrayList, String str2, int i, int i2, PollPermissionsModel pollPermissionsModel) {
        C66581MXm.A1R(str, pollParticipantModel, arrayList);
        str2.getClass();
        pollPermissionsModel.getClass();
        this.id = str;
        this.creator = pollParticipantModel;
        this.options = arrayList;
        this.title = str2;
        this.type = i;
        this.state = i2;
        this.permissions = pollPermissionsModel;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("PollModel{id=");
        A1A.append(this.id);
        A1A.append(",creator=");
        A1A.append(this.creator);
        A1A.append(",options=");
        A1A.append(this.options);
        A1A.append(",title=");
        A1A.append(this.title);
        A1A.append(",type=");
        A1A.append(this.type);
        A1A.append(",state=");
        A1A.append(this.state);
        A1A.append(",permissions=");
        return C66582MXn.A0v(this.permissions, A1A);
    }
}

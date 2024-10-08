package com.facebook.rsys.roomslobby.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C22181Xwr;
import X.C66581MXm;
import X.C66582MXn;
import X.C66583MXo;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

public class LobbyModel {
    public static 2LV CONVERTER = C22181Xwr.A00(55);
    public static long sMcfTypeId;
    public final ArrayList activeParticipants;
    public final boolean canDisplayActiveParticipants;
    public final String linkUrl;
    public final ArrayList ringlistParticipants;

    public static native LobbyModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LobbyModel)) {
            return false;
        }
        LobbyModel lobbyModel = (LobbyModel) obj;
        return this.linkUrl.equals(lobbyModel.linkUrl) && this.canDisplayActiveParticipants == lobbyModel.canDisplayActiveParticipants && this.activeParticipants.equals(lobbyModel.activeParticipants) && this.ringlistParticipants.equals(lobbyModel.ringlistParticipants);
    }

    public int hashCode() {
        return AnonymousClass7TE.A0N(this.ringlistParticipants, AnonymousClass7TF.A07(this.activeParticipants, (C66583MXo.A06(this.linkUrl) + (this.canDisplayActiveParticipants ? 1 : 0)) * 31));
    }

    public LobbyModel(String str, boolean z, ArrayList arrayList, ArrayList arrayList2) {
        C66581MXm.A1R(str, arrayList, arrayList2);
        this.linkUrl = str;
        this.canDisplayActiveParticipants = z;
        this.activeParticipants = arrayList;
        this.ringlistParticipants = arrayList2;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("LobbyModel{linkUrl=");
        A1A.append(this.linkUrl);
        A1A.append(",canDisplayActiveParticipants=");
        A1A.append(this.canDisplayActiveParticipants);
        A1A.append(",activeParticipants=");
        A1A.append(this.activeParticipants);
        A1A.append(",ringlistParticipants=");
        return C66582MXn.A0v(this.ringlistParticipants, A1A);
    }
}

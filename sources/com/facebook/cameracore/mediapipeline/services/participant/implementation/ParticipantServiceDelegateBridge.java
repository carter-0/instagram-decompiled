package com.facebook.cameracore.mediapipeline.services.participant.implementation;

import X.0qQ;
import X.B0W;
import X.C56909IHe;
import X.NDr;
import com.facebook.cameracore.mediapipeline.services.participant.interfaces.ParticipantData;
import java.util.List;

public final class ParticipantServiceDelegateBridge {
    public B0W delegate;

    public final ParticipantData getCurrentUserDataSnapshot() {
        B0W b0w = this.delegate;
        if (b0w == null) {
            return null;
        }
        NDr nDr = ((C56909IHe) b0w).A01;
        String str = nDr.A05;
        if (str == null) {
            str = nDr.A08.A06;
        }
        return new ParticipantData(str, true, true, 1);
    }

    public final List getPeersDataSnapshot() {
        B0W b0w = this.delegate;
        if (b0w != null) {
            return ((C56909IHe) b0w).A01.A06;
        }
        return null;
    }

    public final void setParticipantUpdateHandler(Object obj) {
        B0W b0w = this.delegate;
        if (b0w != null) {
            ParticipantUpdateHandlerHybrid participantUpdateHandlerHybrid = (ParticipantUpdateHandlerHybrid) obj;
            0qQ.A0B(participantUpdateHandlerHybrid, 0);
            ((C56909IHe) b0w).A00 = participantUpdateHandlerHybrid;
        }
    }
}

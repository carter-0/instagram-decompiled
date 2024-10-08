package X;

import com.facebook.rsys.call.gen.CallModel;
import com.facebook.rsys.call.gen.CallParticipant;
import com.facebook.rsys.call.gen.ParticipantMediaState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.Nqo  reason: case insensitive filesystem */
public abstract class C69724Nqo {
    public static final boolean A00(CallModel callModel) {
        if (callModel != null) {
            ParticipantMediaState participantMediaState = callModel.selfParticipant.mediaState;
            if (participantMediaState == null || C69725Nqp.A00(participantMediaState)) {
                return true;
            }
            ArrayList arrayList = callModel.remoteParticipants;
            0qQ.A06(arrayList);
            if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ParticipantMediaState participantMediaState2 = ((CallParticipant) it.next()).mediaState;
                    0qQ.A06(participantMediaState2);
                    if (C69725Nqp.A00(participantMediaState2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

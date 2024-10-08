package X;

import com.facebook.rsys.audio.gen.AudioStream;
import com.facebook.rsys.call.gen.CallModel;
import com.facebook.rsys.call.gen.ParticipantMediaState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.PgY  reason: case insensitive filesystem */
public final /* synthetic */ class C73597PgY extends 03J implements 0sP {
    public static final C73597PgY A00 = new C73597PgY();

    public C73597PgY() {
        super(1, C69724Nqo.class, "isSelfAudioOn", "isSelfAudioOn(Lcom/facebook/rsys/call/gen/CallModel;)Z", 1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean z;
        CallModel callModel = (CallModel) obj;
        0qQ.A0B(callModel, 0);
        ParticipantMediaState participantMediaState = callModel.selfParticipant.mediaState;
        if (participantMediaState != null) {
            ArrayList arrayList = participantMediaState.audioStreams;
            0qQ.A06(arrayList);
            z = false;
            if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        int i = ((AudioStream) it.next()).streamState;
                        if (i != 3 && i != 2) {
                            if (i == 0) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            return Boolean.valueOf(z);
        }
        z = true;
        return Boolean.valueOf(z);
    }
}

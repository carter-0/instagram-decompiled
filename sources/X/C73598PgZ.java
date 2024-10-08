package X;

import com.facebook.rsys.audio.gen.AudioStream;
import com.facebook.rsys.call.gen.CallModel;
import com.facebook.rsys.call.gen.CallParticipant;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.PgZ  reason: case insensitive filesystem */
public final /* synthetic */ class C73598PgZ extends 03J implements 0sP {
    public static final C73598PgZ A00 = new C73598PgZ();

    public C73598PgZ() {
        super(1, C69561No5.class, "isBotAudioEnabled", "isBotAudioEnabled(Lcom/facebook/rsys/call/gen/CallModel;)Ljava/lang/Boolean;", 1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2;
        Object obj3;
        CallModel callModel = (CallModel) obj;
        0qQ.A0B(callModel, 0);
        boolean z = true;
        ArrayList arrayList = callModel.remoteParticipants;
        if (arrayList == null) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (0qQ.A0K(((CallParticipant) obj2).userId, "0")) {
                break;
            }
        }
        CallParticipant callParticipant = (CallParticipant) obj2;
        if (callParticipant == null) {
            return true;
        }
        ArrayList arrayList2 = callParticipant.mediaState.audioStreams;
        0qQ.A06(arrayList2);
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it2.next();
            if (((AudioStream) obj3).type == 9) {
                break;
            }
        }
        AudioStream audioStream = (AudioStream) obj3;
        if (audioStream == null) {
            return null;
        }
        if (audioStream.streamStateDesired != 3) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

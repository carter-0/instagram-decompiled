package X;

import com.facebook.rsys.call.gen.CallModel;

public final /* synthetic */ class Pr2 extends 01B {
    public static final Pr2 A00 = new Pr2();

    public Pr2() {
        super(CallModel.class, "remoteParticipants", "getRemoteParticipants()Ljava/util/ArrayList;", 0);
    }

    public final Object get(Object obj) {
        return ((CallModel) obj).remoteParticipants;
    }
}

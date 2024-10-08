package X;

import com.facebook.rsys.state.gen.State;

public final /* synthetic */ class Pr1 extends 01B {
    public static final Pr1 A00 = new Pr1();

    public Pr1() {
        super(State.class, "callState", "getCallState()I", 0);
    }

    public final Object get(Object obj) {
        return Integer.valueOf(((State) obj).callState);
    }
}

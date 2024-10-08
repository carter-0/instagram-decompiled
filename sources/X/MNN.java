package X;

import com.facebook.rsys.state.gen.State;

public final class MNN extends 0Yg implements 0sP {
    public static final MNN A00 = new MNN();

    public MNN() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        N4A n4a = (N4A) obj;
        0qQ.A0B(n4a, 0);
        State state = (State) n4a.A00(State.class);
        boolean z = true;
        if (!(state == null || (i = state.callState) == 4 || i == 0)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

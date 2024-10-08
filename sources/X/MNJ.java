package X;

import com.facebook.rsys.state.gen.State;

public final class MNJ extends 0Yg implements 0sP {
    public static final MNJ A00 = new MNJ();

    public MNJ() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean z;
        N4A n4a = (N4A) obj;
        0qQ.A0B(n4a, 0);
        State state = (State) n4a.A00(State.class);
        if (state != null) {
            int i = state.callState;
            if (Integer.valueOf(i) != null && (i == 4 || i == 0)) {
                z = true;
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}

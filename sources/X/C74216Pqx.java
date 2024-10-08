package X;

import com.facebook.rsys.state.gen.State;

/* renamed from: X.Pqx  reason: case insensitive filesystem */
public final /* synthetic */ class C74216Pqx extends 01B {
    public static final C74216Pqx A00 = new C74216Pqx();

    public C74216Pqx() {
        super(State.class, "callState", "getCallState()I", 0);
    }

    public final Object get(Object obj) {
        return Integer.valueOf(((State) obj).callState);
    }
}

package X;

import com.facebook.rsys.state.gen.State;

/* renamed from: X.Pqy  reason: case insensitive filesystem */
public final /* synthetic */ class C74217Pqy extends 01B {
    public static final C74217Pqy A00 = new C74217Pqy();

    public C74217Pqy() {
        super(State.class, "callState", "getCallState()I", 0);
    }

    public final Object get(Object obj) {
        return Integer.valueOf(((State) obj).callState);
    }
}

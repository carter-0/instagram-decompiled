package X;

import com.facebook.rsys.call.gen.CallModel;

/* renamed from: X.Pqz  reason: case insensitive filesystem */
public final /* synthetic */ class C74218Pqz extends 01B {
    public static final C74218Pqz A00 = new C74218Pqz();

    public C74218Pqz() {
        super(CallModel.class, "inCallState", "getInCallState()I", 0);
    }

    public final Object get(Object obj) {
        return Integer.valueOf(((CallModel) obj).inCallState);
    }
}

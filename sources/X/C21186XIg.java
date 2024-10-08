package X;

/* renamed from: X.XIg  reason: case insensitive filesystem */
public final class C21186XIg extends C21385XZs implements Y9J {
    public static final Object A00 = Y8Q.class;
    public static final Object[] A01;
    public static final String[] A02;

    static {
        String[] strArr = {"user_alias_id", XDX.A00(9, 10, 68), "optimistic_session_id", "start_time_millis", "expiration_time_millis", "message_id"};
        A02 = strArr;
        A01 = new Object[]{"live_location_sessions.updaters.UpdateObject", "live_location_sessions", strArr, 0, null, null, "_id = ?", 1, null, null};
    }

    public C21186XIg() {
        super(A01);
    }

    public final /* bridge */ /* synthetic */ Y8M CrS(YAf yAf) {
        return new C22175Xwh(yAf);
    }
}

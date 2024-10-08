package X;

/* renamed from: X.KzG  reason: case insensitive filesystem */
public abstract class C63567KzG {
    public static String A00 = "";
    public static C58840Ae A01;
    public static AnonymousClass0JP A02;
    public static C18423VrS A03;
    public static C63574KzN A04;
    public static C63574KzN A05;
    public static boolean A06;

    public static final void A00(Integer num, Integer num2) {
        String str;
        String str2;
        0qQ.A0B(num2, 1);
        if (A06) {
            C58840Ae r1 = A01;
            if (r1 == null) {
                str2 = "analyticsLogger";
            } else {
                0Aj A0d = C51969G9p.A0d(r1, "avatars_core_experience_immersive_avatar_impression");
                0bb r2 = new 0bb();
                r2.A06("effect_id", A00);
                switch (num.intValue()) {
                    case 0:
                        str = "view";
                        break;
                    case 1:
                        str = "effect";
                        break;
                    default:
                        str = "glb";
                        break;
                }
                r2.A06("avatar_component", str);
                if (A0d.isSampled()) {
                    A0d.AAK(r2, "event_data");
                    C18423VrS vrS = A03;
                    if (vrS == null) {
                        str2 = "avatarScubaLoggerSessionId";
                    } else {
                        A0d.AAJ("avatar_session_id", vrS.A00);
                        AnonymousClass0JP r0 = A02;
                        if (r0 == null) {
                            str2 = "clock";
                        } else {
                            A0d.A8D(C66579MXk.A00(112), Double.valueOf((double) r0.now()));
                            JTQ.A15(A0d, "editor");
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            0qQ.A0F(str2);
            throw AnonymousClass00P.createAndThrow();
        }
    }
}

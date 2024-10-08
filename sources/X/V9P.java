package X;

public abstract class V9P {
    public static final String A00(C307896Rx r6, AnonymousClass6Tm r7) {
        C16386Uu3 uu3;
        AnonymousClass4M3 r2;
        C307786Rm r0 = r6.A03;
        if (r0 != null) {
            C276544tV A0P = DbY.A0P(r7, 1);
            C313376gL A00 = C313366gK.A00((C229382nI) r0.A02);
            String A0D = A0P.A0D();
            if (A0D != null) {
                C305866Jw A002 = A00.A00(A0D);
                if (A002 == null || (uu3 = (C16386Uu3) A00.A03.get(A002)) == null || (r2 = uu3.A02) == null) {
                    return "unprepared";
                }
                int ordinal = ((AnonymousClass4M1) r2).A0M.ordinal();
                if (ordinal == 4) {
                    return "paused";
                }
                if (ordinal == 3) {
                    OI0 oi0 = uu3.A01;
                    if ((oi0 == null || !oi0.A02) && r2.getCurrentPositionMs() >= r2.AzN()) {
                        return "playback_complete";
                    }
                    return "playing";
                } else if (ordinal == 1) {
                    return "attempt_to_play";
                } else {
                    if (ordinal == 2) {
                        return "prepared";
                    }
                    return "unprepared";
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            throw new IllegalStateException("Required value was null.");
        }
    }
}

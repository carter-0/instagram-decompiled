package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;

/* renamed from: X.7C9  reason: invalid class name */
public final class AnonymousClass7C9 implements C327687Bu {
    public final boolean ABE() {
        return false;
    }

    public final boolean AFJ(UserSession userSession, C254703su r5) {
        Boolean bool;
        C254873tC r0;
        0qQ.A0B(r5, 0);
        2FW r1 = r5.A10;
        if (r1 == 2FW.A1y || r1 == 2FW.A1x) {
            ImmutableList A0H = r5.A0H();
            if (A0H == null || (r0 = (C254873tC) A0H.get(0)) == null) {
                bool = null;
            } else {
                bool = Boolean.valueOf(r0.A1i);
            }
            if (0qQ.A0K(bool, true)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean AFS(UserSession userSession, C254703su r3, int i) {
        return false;
    }

    public final boolean AFY(C254703su r2) {
        return true;
    }

    public final boolean AFk(UserSession userSession, C254703su r4) {
        0qQ.A0B(r4, 1);
        if (r4.A0g() != null) {
            return true;
        }
        return false;
    }

    public final boolean AFl(UserSession userSession, C254703su r7) {
        0qQ.A0B(r7, 1);
        2FW r2 = r7.A10;
        C3262676b r0 = C3262676b.$redex_init_class;
        int ordinal = r2.ordinal();
        if (ordinal == 22) {
            Object obj = r7.A1T;
            0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.model.DirectReelMedia");
            if (AnonymousClass7Q3.REPLY.equals(((AnonymousClass7FN) obj).A01)) {
                return true;
            }
            Object obj2 = r7.A1T;
            0qQ.A0C(obj2, "null cannot be cast to non-null type com.instagram.direct.model.DirectReelMedia");
            if (((AnonymousClass7FN) obj2).A01 == AnonymousClass7Q3.REPLY_GIF) {
                return true;
            }
        } else if (ordinal == 23) {
            2FW r22 = r7.A0z;
            if (r22 == null) {
                0wb.A03("DirectReelShareMessagePresenter", "message type should not be null");
            } else {
                int ordinal2 = r22.ordinal();
                if (ordinal2 == 2 || ordinal2 == 54) {
                    return true;
                }
                if (!(ordinal2 == 9 || ordinal2 == 10)) {
                    if (ordinal2 == 12) {
                        return true;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid message content type: ");
                    sb.append(r22);
                    throw new IllegalStateException(sb.toString());
                }
            }
        } else if (ordinal != 24) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Invalid content type: ");
            sb2.append(r2);
            throw new IllegalStateException(sb2.toString());
        }
        return false;
    }

    public final boolean AFm(UserSession userSession, C254703su r3) {
        return false;
    }

    public final boolean AFn(UserSession userSession, C254703su r3) {
        return false;
    }

    public final boolean AG2(UserSession userSession, C254703su r3, int i) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r3, 1);
        return AnonymousClass7FL.A00(r3, userSession.A06);
    }

    public final String C1n(UserSession userSession, C254703su r7) {
        0qQ.A0B(r7, 1);
        2FW r3 = r7.A10;
        C3262676b r0 = C3262676b.$redex_init_class;
        int ordinal = r3.ordinal();
        if (ordinal == 22) {
            Object obj = r7.A1T;
            0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.model.DirectReelMedia");
            return ((AnonymousClass7FN) obj).A0A;
        } else if (ordinal == 23) {
            2FW r32 = r7.A0z;
            if (r32 != null) {
                int ordinal2 = r32.ordinal();
                if (ordinal2 != 2) {
                    if (ordinal2 == 54) {
                        return null;
                    }
                    if (ordinal2 != 9) {
                        if (ordinal2 == 10 || ordinal2 == 12) {
                            return null;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("Invalid message content type: ");
                        sb.append(r32);
                        throw new IllegalStateException(sb.toString());
                    }
                }
                return r7.A1q;
            }
            throw new IllegalStateException("Required value was null.");
        } else if (ordinal == 24) {
            return null;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Invalid content type: ");
            sb2.append(r3);
            throw new IllegalStateException(sb2.toString());
        }
    }

    public final String CFp() {
        return null;
    }

    public final boolean CPF() {
        return true;
    }

    public final boolean CRy(UserSession userSession) {
        return false;
    }

    public final boolean CS1(UserSession userSession, C254703su r3) {
        0qQ.A0B(userSession, 0);
        return C3267277x.A00(1Au.A00(userSession));
    }

    public final boolean CS3(UserSession userSession, C254703su r3) {
        0qQ.A0B(userSession, 0);
        return C3267277x.A01(1Au.A00(userSession));
    }

    public final boolean CSF(UserSession userSession, C254703su r3) {
        0qQ.A0B(userSession, 0);
        return C3267277x.A02(1Au.A00(userSession));
    }

    public final boolean CVT(UserSession userSession, C254703su r3) {
        return true;
    }

    public final boolean CdO() {
        return true;
    }

    public final boolean Ce6(C254713sv r2) {
        return false;
    }

    public final /* synthetic */ boolean AFO(C254703su r2) {
        return false;
    }

    public final /* synthetic */ boolean AFp(C254703su r2) {
        return false;
    }

    public final /* synthetic */ boolean AG3(C254703su r2) {
        return false;
    }

    public final /* synthetic */ boolean AFq(UserSession userSession, C254703su r3) {
        return false;
    }
}

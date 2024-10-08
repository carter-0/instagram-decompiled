package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7CB  reason: invalid class name */
public final class AnonymousClass7CB implements C327687Bu {
    public final boolean ABE() {
        return false;
    }

    public final boolean AFJ(UserSession userSession, C254703su r3) {
        0qQ.A0B(r3, 0);
        return r3.A1S();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004d, code lost:
        if (r0.A00() == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0060, code lost:
        if (r1 == X.C278114wI.A08) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean AFS(com.instagram.common.session.UserSession r6, X.C254703su r7, int r8) {
        /*
            r5 = this;
            r0 = 0
            X.0qQ.A0B(r6, r0)
            r0 = 1
            r4 = 32
            X.0qQ.A0B(r7, r0)
            X.2FW r3 = r7.A10
            X.ElJ r0 = X.C48857ElJ.$redex_init_class
            int r1 = r3.ordinal()
            r2 = 0
            if (r1 == r4) goto L_0x0030
            r0 = 33
            if (r1 == r0) goto L_0x0063
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Invalid type: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0030:
            java.lang.Object r1 = r7.A1T
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.model.DirectLiveViewerInvite"
            X.0qQ.A0C(r1, r0)
            X.Cw5 r1 = (X.C45425Cw5) r1
            X.4gL r1 = r1.A01
            if (r1 == 0) goto L_0x0063
            java.lang.String r0 = r1.A05(r6)
            if (r0 == 0) goto L_0x0058
            X.4wI r0 = r1.A06
            if (r0 != 0) goto L_0x0049
            X.4wI r0 = X.C278114wI.UNKNOWN
        L_0x0049:
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x0058
        L_0x004f:
            r1 = 1
        L_0x0050:
            boolean r0 = r7.A2P
            if (r0 != 0) goto L_0x0057
            if (r1 == 0) goto L_0x0057
            r2 = 1
        L_0x0057:
            return r2
        L_0x0058:
            X.4wI r1 = r1.A06
            if (r1 != 0) goto L_0x005e
            X.4wI r1 = X.C278114wI.UNKNOWN
        L_0x005e:
            X.4wI r0 = X.C278114wI.POST_LIVE
            if (r1 != r0) goto L_0x0063
            goto L_0x004f
        L_0x0063:
            r1 = 0
            goto L_0x0050
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7CB.AFS(com.instagram.common.session.UserSession, X.3su, int):boolean");
    }

    public final boolean AFY(C254703su r2) {
        return true;
    }

    public final boolean AFk(UserSession userSession, C254703su r3) {
        return false;
    }

    public final boolean AFl(UserSession userSession, C254703su r7) {
        0qQ.A0B(r7, 1);
        2FW r3 = r7.A10;
        C48857ElJ elJ = C48857ElJ.$redex_init_class;
        int ordinal = r3.ordinal();
        if (ordinal == 32) {
            Object obj = r7.A1T;
            0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.model.DirectLiveViewerInvite");
            if (((C45425Cw5) obj).A08.length() != 0) {
                return true;
            }
            return false;
        } else if (ordinal == 33) {
            return false;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid type: ");
            sb.append(r3);
            throw new IllegalStateException(sb.toString());
        }
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

    public final String C1n(UserSession userSession, C254703su r6) {
        0qQ.A0B(r6, 1);
        2FW r2 = r6.A10;
        C48857ElJ elJ = C48857ElJ.$redex_init_class;
        int ordinal = r2.ordinal();
        if (ordinal == 32) {
            Object obj = r6.A1T;
            0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.model.DirectLiveViewerInvite");
            return ((C45425Cw5) obj).A08;
        } else if (ordinal == 33) {
            return null;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid type: ");
            sb.append(r2);
            throw new IllegalStateException(sb.toString());
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

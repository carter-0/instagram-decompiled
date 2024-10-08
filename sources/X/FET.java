package X;

import java.util.HashMap;

public final class FET {
    public static final C49042EoM A01 = new Object();
    public static final HashMap A02 = AnonymousClass7TE.A1E();
    public final FRM A00;

    public FET(FRM frm) {
        0qQ.A0B(frm, 1);
        this.A00 = frm;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008d, code lost:
        return new X.C47943ENu(r1, r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009c, code lost:
        return new X.C47942ENt(r3, r1, r5, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C49722F3l A00(X.FET r3, X.C48155EZx r4, java.lang.String r5) {
        /*
            int[] r1 = X.C49288EsX.A00
            int r0 = r4.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L_0x0011;
                case 2: goto L_0x0017;
                case 3: goto L_0x001c;
                case 4: goto L_0x0021;
                case 5: goto L_0x0026;
                case 6: goto L_0x002b;
                case 7: goto L_0x0030;
                case 8: goto L_0x0035;
                case 9: goto L_0x003a;
                case 10: goto L_0x003e;
                case 11: goto L_0x0042;
                case 12: goto L_0x0046;
                case 13: goto L_0x004a;
                case 14: goto L_0x004e;
                case 15: goto L_0x0052;
                case 16: goto L_0x0056;
                case 17: goto L_0x005a;
                case 18: goto L_0x005f;
                case 19: goto L_0x0064;
                case 20: goto L_0x0069;
                case 21: goto L_0x006e;
                case 22: goto L_0x0073;
                case 23: goto L_0x0078;
                case 24: goto L_0x007c;
                case 25: goto L_0x0080;
                case 26: goto L_0x0085;
                case 27: goto L_0x008e;
                case 28: goto L_0x0093;
                default: goto L_0x000b;
            }
        L_0x000b:
            X.ENr r2 = new X.ENr
            r2.<init>()
            return r2
        L_0x0011:
            X.EZx r1 = X.C48155EZx.CHECK_FOR_PHONE
            r0 = 17
            goto L_0x0097
        L_0x0017:
            X.EZx r1 = X.C48155EZx.FB_CONNECT
            r0 = 18
            goto L_0x0097
        L_0x001c:
            X.EZx r1 = X.C48155EZx.IDENTITY_SYNCING
            r0 = 19
            goto L_0x0097
        L_0x0021:
            X.EZx r1 = X.C48155EZx.IDENTITY_SYNCING_AFTER_NUX_LINKING
            r0 = 20
            goto L_0x0097
        L_0x0026:
            X.EZx r1 = X.C48155EZx.AUTO_CROSSPOSTING
            r0 = 21
            goto L_0x0097
        L_0x002b:
            X.EZx r1 = X.C48155EZx.CONTACT_INVITE_NO_SKIP_BUTTON
            r0 = 22
            goto L_0x0097
        L_0x0030:
            X.EZx r1 = X.C48155EZx.CONTACT_INVITE_UPDATED_TEXT_NO_ILLUSTRATION
            r0 = 23
            goto L_0x0097
        L_0x0035:
            X.EZx r1 = X.C48155EZx.CONTACT_INVITE_REDESIGN_B
            r0 = 24
            goto L_0x0097
        L_0x003a:
            X.EZx r1 = X.C48155EZx.CONTACT_INVITE_REDESIGN_C
            r0 = 0
            goto L_0x0097
        L_0x003e:
            X.EZx r1 = X.C48155EZx.CONTACT_INVITE
            r0 = 1
            goto L_0x0097
        L_0x0042:
            X.EZx r1 = X.C48155EZx.PARTIAL_CONTACT_IMPORT
            r0 = 2
            goto L_0x0097
        L_0x0046:
            X.EZx r1 = X.C48155EZx.TAKE_PROFILE_PHOTO
            r0 = 3
            goto L_0x0097
        L_0x004a:
            X.EZx r1 = X.C48155EZx.DISCOVER_PEOPLE
            r0 = 4
            goto L_0x0097
        L_0x004e:
            X.EZx r1 = X.C48155EZx.DISCOVER_PEOPLE_AFTER_PARTIAL_CI
            r0 = 5
            goto L_0x0097
        L_0x0052:
            X.EZx r1 = X.C48155EZx.DP_NUX_QUICK_FRIENDING
            r0 = 6
            goto L_0x0097
        L_0x0056:
            X.EZx r1 = X.C48155EZx.DP_NUX_QUICK_FRIENDING_AFTER_PARTIAL_CI
            r0 = 7
            goto L_0x0097
        L_0x005a:
            X.EZx r1 = X.C48155EZx.A0N
            r0 = 8
            goto L_0x0097
        L_0x005f:
            X.EZx r1 = X.C48155EZx.DISCOVER_ACCOUNTS
            r0 = 9
            goto L_0x0097
        L_0x0064:
            X.EZx r1 = X.C48155EZx.ADD_PHONE
            r0 = 10
            goto L_0x0097
        L_0x0069:
            X.EZx r1 = X.C48155EZx.TURN_ON_ONETAP
            r0 = 11
            goto L_0x0097
        L_0x006e:
            X.EZx r1 = X.C48155EZx.CP_ACQUISITION_PHONE
            r0 = 12
            goto L_0x0097
        L_0x0073:
            X.EZx r1 = X.C48155EZx.ACCOUNT_PRIVACY
            r0 = 13
            goto L_0x0097
        L_0x0078:
            X.EZx r1 = X.C48155EZx.FOLLOW_FROM_LOGGED_IN_ACCOUNTS
            r0 = 0
            goto L_0x0088
        L_0x007c:
            X.EZx r1 = X.C48155EZx.A0D
            r0 = 1
            goto L_0x0088
        L_0x0080:
            X.EZx r1 = X.C48155EZx.LIGHTWEIGHT_CONNECTIONS
            r0 = 14
            goto L_0x0097
        L_0x0085:
            X.EZx r1 = X.C48155EZx.PUSH_OPT_IN
            r0 = 2
        L_0x0088:
            X.ENu r2 = new X.ENu
            r2.<init>(r1, r5, r0)
            return r2
        L_0x008e:
            X.EZx r1 = X.C48155EZx.UXR_SURVEY
            r0 = 15
            goto L_0x0097
        L_0x0093:
            X.EZx r1 = X.C48155EZx.CP_ACQUISITION_EMAIL
            r0 = 16
        L_0x0097:
            X.ENt r2 = new X.ENt
            r2.<init>(r3, r1, r5, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FET.A00(X.FET, X.EZx, java.lang.String):X.F3l");
    }
}

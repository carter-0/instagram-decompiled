package X;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.Xme  reason: case insensitive filesystem */
public abstract class C21949Xme {
    public static final Map A00;
    public static final Map A01;

    static {
        0eP A002 = A00(C21249XQu.IS_QUIET_MODE_ENABLED, XRZ.A1G);
        XRZ xrz = XRZ.A1I;
        C21249XQu xQu = C21249XQu.IS_VERIFIED;
        0eP A003 = A00(xQu, xrz);
        0eP A004 = A00(xQu, XRZ.A0K);
        0eP A005 = A00(C21249XQu.IS_MANAGED_DEVICE, XRZ.A0U);
        0eP A006 = A00(C21249XQu.CAN_CREATE_STANDALONE_FUNDRAISERS, XRZ.A0a);
        0eP A007 = A00(C21249XQu.IS_INTERNAL_BUILD, XRZ.A0f);
        0eP A008 = A00(C21249XQu.IS_LINKED_ACCOUNT, XRZ.A0k);
        XRZ xrz2 = XRZ.A1M;
        A00 = 0Yt.A06(new 0eP[]{A002, A003, A004, A005, A006, A007, A008, A00(C21249XQu.HAS_LINKED_FB_ACCOUNT, xrz2), A00(C21249XQu.IS_SMART_GLASSES_TOOLKIT_ENABLED, XRZ.A1S), A00(C21249XQu.HAS_FAN_CLUB_SUBSCRIPTIONS, XRZ.A1T), A00(C21249XQu.IS_SUPERVISION_ENABLED, XRZ.A1V)});
        XRZ xrz3 = XRZ.A09;
        C21248XQt xQt = C21248XQt.ACCOUNT_TYPE;
        A01 = 0Yt.A06(new 0eP[]{A00(xQt, xrz3), A00(xQt, XRZ.A0D), A00(xQt, XRZ.A1W), A00(xQt, XRZ.A0C), A00(C21248XQt.BLOCKED_ACCOUNTS_COUNT, XRZ.A0H), A00(xQt, XRZ.A0J), A00(xQt, XRZ.A0O), A00(xQt, XRZ.A0P), A00(xQt, XRZ.A0Q), A00(xQt, XRZ.A0R), A00(C21248XQt.FAVORITES_COUNT, XRZ.A0X), A00(xQt, XRZ.A0e), A00(C21248XQt.MUTED_ACCOUNTS_COUNT, XRZ.A0x), A00(xQt, XRZ.A1E), A00(C21248XQt.RESTRICTED_COUNT, XRZ.A1J), A00(xQt, xrz2)});
    }

    public static 0eP A00(Object obj, Object obj2) {
        List singletonList = Collections.singletonList(obj);
        0qQ.A07(singletonList);
        return new 0eP(obj2, singletonList);
    }
}

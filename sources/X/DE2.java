package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.InlineStyleAtRangeDict;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

public abstract class DE2 {
    public static AnonymousClass3JC A00;
    public static boolean A01;

    public static void A0E(UserSession userSession, boolean z) {
        CH5 ch5 = new CH5(2);
        UserSession userSession2 = userSession;
        if (182.A06(0Tu.A05, userSession, 36314485361347169L)) {
            2IS A04 = C41845B3m.A04();
            2IS A042 = C41845B3m.A04();
            A04.A02("set_reminder_shown", Boolean.valueOf(z));
            1vm.A01(userSession2).A06(new PandoGraphQLRequest(C41845B3m.A05(), "IGFxIdentityManagementMutation", A04.getParamsCopy(), A042.getParamsCopy(), BpC.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "fxim_update_reminders_state", AnonymousClass7TE.A1C()), ch5);
            return;
        }
        2IS A043 = C41845B3m.A04();
        A043.A02("set_reminder_shown", Boolean.valueOf(z));
        C239113Fa r1 = new C239113Fa(A043, B9T.class, "IGFxIdentityManagementMutation", true);
        C239123Fb A012 = C46479Dfi.A01(userSession);
        A012.A08(r1);
        1OC A05 = A012.A05();
        A05.A00 = ch5;
        1ES.A03(A05);
    }

    public static ImmutableList A00() {
        Object obj;
        AnonymousClass3JC r0 = A00;
        if (r0 != null && (obj = r0.A01) != null && ((DZP) obj).B8k() != null && A02().BEg() != null && A02().BEg().Bo0() != null) {
            return A02().BEg().Bo0();
        }
        throw AnonymousClass7TE.A0z("Missing required content to build the FX Reminder Dialog.");
    }

    public static G9V A01() {
        Object obj;
        AnonymousClass3JC r0 = A00;
        if (r0 != null && (obj = r0.A01) != null && ((DZP) obj).B8k() != null && A02().Bps() != null) {
            return A02().Bps();
        }
        throw AnonymousClass7TE.A0z("Missing required content to build the FX Reminder Dialog.");
    }

    public static DaJ A02() {
        return ((DZP) A00.A01).B8k();
    }

    public static G9O A03() {
        Object obj;
        AnonymousClass3JC r0 = A00;
        if (r0 != null && (obj = r0.A01) != null && ((DZP) obj).B8l() != null && A09().BVL() != null) {
            return A09().BVL();
        }
        throw AnonymousClass7TE.A0z("Missing required content to build the FX Reminder Dialog.");
    }

    public static G9I A04() {
        Object obj;
        AnonymousClass3JC r0 = A00;
        if (r0 != null && (obj = r0.A01) != null && ((DZP) obj).B8l() != null && A09().BVM() != null) {
            return A09().BVM();
        }
        throw AnonymousClass7TE.A0z("Missing required content to build the FX Reminder Dialog.");
    }

    public static G9Q A05() {
        Object obj;
        AnonymousClass3JC r0 = A00;
        if (r0 != null && (obj = r0.A01) != null && ((DZP) obj).B8l() != null && A09().Bc3() != null) {
            return A09().Bc3();
        }
        throw AnonymousClass7TE.A0z("Missing required content to build the FX Reminder Dialog.");
    }

    public static G9R A06() {
        Object obj;
        AnonymousClass3JC r0 = A00;
        if (r0 != null && (obj = r0.A01) != null && ((DZP) obj).B8l() != null && A09().BcB() != null) {
            return A09().BcB();
        }
        throw AnonymousClass7TE.A0z("Missing required content to build the FX Reminder Dialog.");
    }

    public static DZ0 A07() {
        Object obj;
        AnonymousClass3JC r0 = A00;
        if (r0 != null && (obj = r0.A01) != null && ((DZP) obj).B8l() != null && A09().BcC() != null) {
            return A09().BcC();
        }
        throw AnonymousClass7TE.A0z("Missing required content to build the FX Reminder Dialog.");
    }

    public static DYI A08() {
        Object obj;
        AnonymousClass3JC r0 = A00;
        if (r0 != null && (obj = r0.A01) != null && ((DZP) obj).B8l() != null && A09().CD5() != null) {
            return A09().CD5();
        }
        throw AnonymousClass7TE.A0z("Missing required content to build the FX Reminder Dialog.");
    }

    public static DaL A09() {
        return ((DZP) A00.A01).B8l();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        if (A02().AkX() == false) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0F() {
        /*
            X.3JC r1 = A00
            r3 = 0
            if (r1 == 0) goto L_0x0054
            java.lang.Object r0 = r1.A01
            if (r0 == 0) goto L_0x0054
            X.DZP r0 = (X.DZP) r0
            X.DaJ r0 = r0.B8k()
            if (r0 == 0) goto L_0x0054
            java.lang.Object r2 = r1.A01
            X.DZP r2 = (X.DZP) r2
            X.DaJ r0 = r2.B8k()
            X.DYz r0 = r0.Bh0()
            if (r0 == 0) goto L_0x0054
            X.3JC r0 = A00
            if (r0 == 0) goto L_0x003a
            java.lang.Object r0 = r0.A01
            if (r0 == 0) goto L_0x003a
            X.DZP r0 = (X.DZP) r0
            X.DaJ r0 = r0.B8k()
            if (r0 == 0) goto L_0x003a
            X.DaJ r0 = A02()
            boolean r1 = r0.AkX()
            r0 = 1
            if (r1 != 0) goto L_0x003b
        L_0x003a:
            r0 = 0
        L_0x003b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0054
            X.DaJ r0 = r2.B8k()
            X.DYz r0 = r0.Bh0()
            boolean r0 = r0.BJI()
            if (r0 == 0) goto L_0x0054
            r3 = 1
        L_0x0054:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DE2.A0F():boolean");
    }

    public static boolean A0G() {
        Object obj;
        AnonymousClass3JC r0 = A00;
        if (r0 == null || (obj = r0.A01) == null || ((DZP) obj).B8k() == null || !A02().AkZ()) {
            return false;
        }
        return true;
    }

    public static Boolean A0A() {
        ImmutableList A002 = A00();
        ArrayList A1C = AnonymousClass7TE.A1C();
        C249803kO it = A002.iterator();
        while (it.hasNext()) {
            A1C.addAll(((DYE) it.next()).AY1());
        }
        boolean z = false;
        if (!A1C.isEmpty()) {
            z = !((DYy) A1C.get(0)).BJH();
        }
        return Boolean.valueOf(z);
    }

    public static String A0B() {
        DZ0 A07 = A07();
        if (A07.C7k() != null && !C296675qS.A03(A07.C7k().getText())) {
            return A07.C7k().getText();
        }
        throw AnonymousClass7TE.A0z("Missing required content to build the FX Reminder Dialog.");
    }

    public static String A0C() {
        DZ0 A07 = A07();
        if (A07.Agb() != null && !C296675qS.A03(A07.Agb().getText())) {
            return A07.Agb().getText();
        }
        throw AnonymousClass7TE.A0z("Missing required content to build the FX Reminder Dialog.");
    }

    public static ArrayList A0D() {
        DYI A08 = A08();
        if (A08.Agc() != null) {
            ImmutableList inlineStyleRanges = A08.Agc().getInlineStyleRanges();
            ArrayList A1C = AnonymousClass7TE.A1C();
            C249803kO it = inlineStyleRanges.iterator();
            while (it.hasNext()) {
                DaK daK = (DaK) it.next();
                if (daK.hasInlineStyle() && daK.hasLength() && daK.hasOffset()) {
                    A1C.add(new InlineStyleAtRangeDict(Integer.valueOf(daK.getInlineStyle()), Integer.valueOf(daK.getLength()), Integer.valueOf(daK.getOffset())));
                }
            }
            return A1C;
        }
        throw AnonymousClass7TE.A0z("Missing required content to build the FX Reminder Dialog.");
    }
}

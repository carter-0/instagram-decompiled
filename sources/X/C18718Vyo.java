package X;

import java.util.concurrent.ConcurrentMap;

/* renamed from: X.Vyo  reason: case insensitive filesystem */
public abstract class C18718Vyo {
    public static final ConcurrentMap A00;
    public static final ConcurrentMap A01;

    static {
        17j r0 = new 17j();
        r0.A03(8);
        A00 = r0.A00();
        17j r02 = new 17j();
        r02.A03(8);
        A01 = r02.A00();
    }

    public static final void A00(C18485Vsg vsg) {
        String str;
        ConcurrentMap concurrentMap = A00;
        String str2 = vsg.A03;
        if (concurrentMap.containsKey(str2)) {
            C18485Vsg vsg2 = (C18485Vsg) concurrentMap.get(str2);
            if (vsg2 != null) {
                vsg2.A04.addAll(vsg.A04);
                return;
            }
            return;
        }
        Integer num = vsg.A01;
        C239133Fc r4 = new C239133Fc(C18203VnT.class, "IgInsightsPostGridSurfaceQuery", vsg.A02, true);
        if (3 - num.intValue() != 0) {
            str = "STORY_GRID";
        } else {
            str = "POST_GRID";
        }
        String A0w = C66582MXn.A0w(str);
        C15621Ufn ufn = new C15621Ufn(vsg, 3);
        C239123Fb A012 = C46479Dfi.A01(vsg.A00);
        A012.A09(r4);
        A012.A08 = "insights_policy";
        A012.A07 = A0w;
        C239153Fe r0 = A012.A02;
        if (r0 != null) {
            r0.EZZ(true);
        }
        1OC A07 = A012.A07(AnonymousClass05K.A00);
        A07.A00 = new C15625Ufr(1, ufn, concurrentMap, vsg);
        1ES.A03(A07);
    }

    public static final void A01(C18485Vsg vsg) {
        String str;
        ConcurrentMap concurrentMap = A01;
        String str2 = vsg.A03;
        if (concurrentMap.containsKey(str2)) {
            C18485Vsg vsg2 = (C18485Vsg) concurrentMap.get(str2);
            if (vsg2 != null) {
                vsg2.A04.addAll(vsg.A04);
                return;
            }
            return;
        }
        Integer num = vsg.A01;
        C239133Fc r4 = new C239133Fc(C18204VnU.class, "IgInsightsStoryGridSurfaceQuery", vsg.A02, true);
        if (3 - num.intValue() != 0) {
            str = "STORY_GRID";
        } else {
            str = "POST_GRID";
        }
        String A0w = C66582MXn.A0w(str);
        C15621Ufn ufn = new C15621Ufn(vsg, 4);
        C239123Fb A012 = C46479Dfi.A01(vsg.A00);
        A012.A09(r4);
        A012.A08 = "insights_policy";
        A012.A07 = A0w;
        C239153Fe r0 = A012.A02;
        if (r0 != null) {
            r0.EZZ(true);
        }
        1OC A07 = A012.A07(AnonymousClass05K.A00);
        A07.A00 = new C15625Ufr(1, ufn, concurrentMap, vsg);
        1ES.A03(A07);
    }
}

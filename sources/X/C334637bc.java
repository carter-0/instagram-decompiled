package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.7bc  reason: invalid class name and case insensitive filesystem */
public final class C334637bc implements 27S {
    public final /* synthetic */ C334537bS A00;

    public C334637bc(C334537bS r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        String str;
        Integer num;
        Integer num2;
        boolean z;
        Integer num3;
        int i;
        int A03 = AnonymousClass0fD.A03(1526803554);
        C240343Kn r3 = (C240343Kn) obj;
        int A032 = AnonymousClass0fD.A03(-2014384225);
        0qQ.A0B(r3, 0);
        C334537bS r1 = this.A00;
        C227252iu r0 = r1.A01;
        if (r0 instanceof AnonymousClass0j6) {
            0qQ.A0C(r0, AnonymousClass000.A00(3651));
            0jB E4x = ((AnonymousClass0j6) r0).E4x();
            if (E4x != null && 0qQ.A0K(r3.A02, E4x.A01(new 0j9(AnonymousClass05K.A0u, "media_id")))) {
                if (r0 instanceof C227252iu) {
                    0qQ.A0C(r0, AnonymousClass000.A00(331));
                    r0.EKl();
                }
                i = -566899561;
                AnonymousClass0fD.A0A(i, A032);
                AnonymousClass0fD.A0A(2141456989, A03);
            }
        }
        1Xj r4 = r3.A01;
        AnonymousClass3W1 r6 = r3.A04;
        String str2 = r3.A02;
        AnonymousClass4DU r11 = r1.A0G;
        String moduleName = r11.getModuleName();
        String str3 = r3.A05;
        UserSession userSession = r1.A0E;
        boolean A02 = 2R8.A02(userSession, r4);
        boolean isOrganicEligible = r11.isOrganicEligible();
        boolean isSponsoredEligible = r11.isSponsoredEligible();
        AnonymousClass5OB r12 = AnonymousClass5OB.CAROUSEL_SLIDE_MENTION;
        C249763kK r13 = r1.A00;
        if (r13 != null) {
            str = r13.getSessionId();
        } else {
            str = null;
        }
        if (r6 != null) {
            num = Integer.valueOf(r6.A03);
            num2 = Integer.valueOf(r6.getPosition());
            z = r6.A2V;
            num3 = Integer.valueOf(r6.A0W);
        } else {
            num = null;
            num2 = null;
            z = false;
            num3 = null;
        }
        String BpP = r4.BpP();
        String str4 = str2;
        C3018960m.A00().A00().A01(r0.requireActivity(), new C53335GmL(r12, (Float) null, num, num2, (Integer) null, num3, Integer.valueOf(r3.A00), str4, (String) null, moduleName, str3, (String) null, (String) null, str, (String) null, BpP, (String) null, (String) null, (String) null, (List) null, r4.A0r(), A02, isOrganicEligible, isSponsoredEligible, false, false, z, true, r3.A06, r4.A5v(), false, false, false, false, false, false, false, false, r4.A4l(), r4.CcK(), false, false, false, false, false, false, false), userSession, A09.A00(userSession).booleanValue(), r4.CcK());
        i = 146573871;
        AnonymousClass0fD.A0A(i, A032);
        AnonymousClass0fD.A0A(2141456989, A03);
    }

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        return true;
    }
}

package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.J6b  reason: case insensitive filesystem */
public final class C59094J6b extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;
    public final String A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59094J6b(UserSession userSession, DirectShareTarget directShareTarget, String str, String str2, String str3, int i) {
        super(1);
        this.A00 = i;
        this.A01 = directShareTarget;
        this.A02 = userSession;
        switch (i) {
            case 2:
            case 3:
            case 4:
                this.A03 = str;
                this.A04 = str2;
                this.A05 = str3;
                break;
            default:
                this.A05 = str;
                this.A03 = str2;
                this.A04 = str3;
                break;
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        SIP sip;
        C10824Ryk ryk;
        String str2;
        switch (this.A00) {
            case 0:
                SUj sUj = (SUj) obj;
                if (SUj.A0V(sUj)) {
                    sip = AnonymousClass2E0.A01().A0E;
                    ryk = (C10824Ryk) this.A01;
                    Object obj2 = sUj.A01;
                    obj2.getClass();
                    str2 = (String) obj2;
                } else if (!SUj.A0S(sUj)) {
                    return null;
                } else {
                    sip = AnonymousClass2E0.A01().A0E;
                    ryk = (C10824Ryk) this.A01;
                    str2 = this.A03;
                    0qQ.A0A(str2);
                }
                return sip.A01(((QDJ) this.A02).A0A.A02((C298525tb) null, true), ryk, str2, this.A04, this.A05);
            case 1:
                AnonymousClass5SW r10 = (AnonymousClass5SW) obj;
                0qQ.A0B(r10, 0);
                C285645Sc.A03(r10, this.A04);
                C285645Sc.A02(r10, 0);
                int ordinal = ((C69316NjH) this.A02).ordinal();
                if (ordinal == 1) {
                    str = this.A05;
                } else if (ordinal != 3) {
                    str = null;
                } else {
                    str = this.A03;
                }
                C285645Sc.A04(r10, str, new MMP(this.A01, 36));
                break;
            case 2:
                C254783t2 r102 = (C254783t2) obj;
                DirectShareTarget directShareTarget = (DirectShareTarget) this.A01;
                boolean z = false;
                if (r102 instanceof AnonymousClass9HR) {
                    directShareTarget = new DirectShareTarget(r102, DbY.A0W(directShareTarget, 0));
                }
                if (!(r102 instanceof PIO)) {
                    z = OZA.A00.A01((UserSession) this.A02, directShareTarget);
                }
                OXC.A00((UserSession) this.A02, directShareTarget.A01()).ELk(directShareTarget, this.A03, this.A04, this.A05, z);
                break;
            case 3:
                C254783t2 r103 = (C254783t2) obj;
                DirectShareTarget directShareTarget2 = (DirectShareTarget) this.A01;
                boolean z2 = false;
                if (r103 instanceof AnonymousClass9HR) {
                    directShareTarget2 = new DirectShareTarget(r103, DbY.A0W(directShareTarget2, 0));
                }
                if (!(r103 instanceof PIO)) {
                    z2 = OZA.A00.A01((UserSession) this.A02, directShareTarget2);
                }
                OXC.A00((UserSession) this.A02, directShareTarget2.A01()).EMK(directShareTarget2, this.A03, this.A04, this.A05, z2);
                break;
            case 4:
                C254783t2 r104 = (C254783t2) obj;
                DirectShareTarget directShareTarget3 = (DirectShareTarget) this.A01;
                boolean z3 = false;
                if (r104 instanceof AnonymousClass9HR) {
                    directShareTarget3 = new DirectShareTarget(r104, DbY.A0W(directShareTarget3, 0));
                }
                if (!(r104 instanceof PIO)) {
                    z3 = OZA.A00.A01((UserSession) this.A02, directShareTarget3);
                }
                OXC.A00((UserSession) this.A02, directShareTarget3.A01()).EMR(directShareTarget3, this.A03, this.A04, this.A05, z3);
                break;
            default:
                C254783t2 r105 = (C254783t2) obj;
                DirectShareTarget directShareTarget4 = (DirectShareTarget) this.A01;
                boolean z4 = false;
                if (r105 instanceof AnonymousClass9HR) {
                    directShareTarget4 = new DirectShareTarget(r105, DbY.A0W(directShareTarget4, 0));
                }
                if (!(r105 instanceof PIO)) {
                    z4 = OZA.A00.A01((UserSession) this.A02, directShareTarget4);
                }
                OXC.A00((UserSession) this.A02, directShareTarget4.A01()).EN8(directShareTarget4, this.A05, this.A03, this.A04, z4);
                break;
        }
        return C60340gF.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59094J6b(Object obj, Object obj2, String str, String str2, String str3, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A04 = str;
        this.A02 = obj2;
        this.A05 = str2;
        this.A03 = str3;
    }
}

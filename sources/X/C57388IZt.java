package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.IZt  reason: case insensitive filesystem */
public final class C57388IZt implements C13678Ten {
    public final int A00;
    public final Object A01;

    public C57388IZt(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Cxg() {
        AnonymousClass37D r1;
        switch (this.A00) {
            case 0:
                r1 = (AnonymousClass37D) this.A01;
                break;
            case 1:
                r1 = (AnonymousClass37D) this.A01;
                if (r1 == null) {
                    return;
                }
                break;
            case 2:
                SUL sul = (SUL) this.A01;
                C13678Ten ten = sul.A0H;
                if (ten != null) {
                    ten.Cxg();
                }
                S6e s6e = sul.A0K;
                if (s6e != null) {
                    String str = "collapsed";
                    if (!sul.A0b) {
                        if (sul.A0c) {
                            str = "secondary_cta";
                        } else if (!sul.A0a) {
                            return;
                        }
                    }
                    s6e.A02(str, "dismiss", "external_tap");
                    return;
                }
                return;
            default:
                long currentTimeMillis = System.currentTimeMillis();
                DdD ddD = (DdD) this.A01;
                if (currentTimeMillis - -1 < 300) {
                    AnonymousClass2S0.A01.A05(14);
                    UserSession userSession = ddD.A03;
                    AnonymousClass0BO.A00(userSession).CIe(ddD.A02.requireContext(), userSession, "double_tap_tab_bar_direct_action_bar");
                    return;
                }
                return;
        }
        r1.A0P((C332277Ui) null);
    }
}

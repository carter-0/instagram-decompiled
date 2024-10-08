package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.Map;

public final class GE4 implements AnonymousClass32U, C250603lj {
    public boolean A00;
    public final UserSession A01;
    public final C52016GBn A02;

    public final void ATF(AnonymousClass30Y r11, C252093oY r12) {
        JRN jrn;
        boolean A1U = AnonymousClass7TF.A1U(0, r11, r12);
        AnonymousClass3W1 r0 = ((C52058GDe) r11.A04).A0E;
        if (r0 != null) {
            int position = r0.getPosition();
            float CFe = r12.CFe(r11);
            if (CFe != 1.0f) {
                C267324bN r2 = (C267324bN) r11.A03;
                int A0A = C51968G9o.A0A(r11, r12);
                if (A0A != 0 && A0A == A1U) {
                    UserSession userSession = this.A01;
                    0Tu r7 = 0Tu.A05;
                    if (182.A06(r7, userSession, 36326498382395176L)) {
                        if (CFe > C51965G9l.A00(r7, userSession, 37170923312382488L) && r2.CcK()) {
                            C52016GBn gBn = this.A02;
                            if (!gBn.A0Y(r2.getId())) {
                                gBn.A0S(false);
                                gBn.A0H(r2, position);
                                String id = r2.getId();
                                Map map = gBn.A0H.A00;
                                Iterator A16 = DbV.A16(map);
                                while (A16.hasNext()) {
                                    Object next = A16.next();
                                    0qQ.A0B(next, 0);
                                    JRN jrn2 = (JRN) map.get(next);
                                    if (!next.equals(id) && jrn2 != null && jrn2.CeZ() == A1U && (jrn = (JRN) map.get(next)) != null) {
                                        jrn.E20("percent_visibility");
                                    }
                                }
                            }
                        }
                    } else if (!182.A06(r7, userSession, 36326498382198566L)) {
                    } else {
                        if (CFe > C51965G9l.A00(r7, userSession, 37170923312382488L)) {
                            C52016GBn gBn2 = this.A02;
                            if (!gBn2.A0Y(r2.getId())) {
                                gBn2.A0S(false);
                                gBn2.A0H(r2, position);
                            }
                        } else if (CFe < C51965G9l.A00(r7, userSession, 37170923312382488L)) {
                            0qQ.A0A(r2);
                            C52016GBn gBn3 = this.A02;
                            if (gBn3.A0Y(r2.getId())) {
                                gBn3.A0N(r2, "percent_visibility", false, false);
                            }
                        }
                    }
                }
            }
        }
    }

    public final /* synthetic */ void DWA(int i, int i2) {
    }

    public final /* synthetic */ void DWY() {
    }

    public final void DhU(Integer num) {
        if (C51967G9n.A03(num, 0) == 0 && this.A00) {
            this.A02.A0D();
            this.A00 = false;
        }
    }

    public final /* synthetic */ void Dpv() {
    }

    public final /* synthetic */ void Dpy(C267324bN r1, int i) {
    }

    public final void DVz(int i) {
        this.A02.A0S(false);
    }

    public final void DW0(int i) {
        C52016GBn gBn = this.A02;
        gBn.A0S(false);
        gBn.A0I((C267324bN) null, i);
    }

    public final void DW8(int i, int i2) {
        if (i == i2) {
            this.A00 = true;
        }
    }

    public GE4(UserSession userSession, C52016GBn gBn) {
        this.A01 = userSession;
        this.A02 = gBn;
    }

    public final void DhG(float f, float f2) {
    }
}

package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashSet;

public abstract class W0T {
    public final 05G A00;
    public final 05G A01;
    public final AnonymousClass0Ud A02;
    public final AnonymousClass0Ud A03;

    public static /* synthetic */ void A01(W0T w0t, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6 = z5;
        boolean z7 = z4;
        boolean z8 = z3;
        boolean z9 = z2;
        boolean z10 = z;
        W0T w0t2 = w0t;
        if ((i & 1) != 0) {
            z10 = ((AnonymousClass9ID) w0t.A01.getValue()).A03;
        }
        if ((i & 2) != 0) {
            z9 = ((AnonymousClass9ID) w0t.A01.getValue()).A01;
        }
        if ((i & 4) != 0) {
            z8 = ((AnonymousClass9ID) w0t.A01.getValue()).A06;
        }
        if ((i & 8) != 0) {
            z7 = ((AnonymousClass9ID) w0t.A01.getValue()).A07;
        }
        if ((i & 16) != 0) {
            z6 = ((AnonymousClass9ID) w0t.A01.getValue()).A05;
        }
        w0t2.A0E(z10, z9, z8, z7, z6);
    }

    public final void A02() {
        C18078Vl7 vl7;
        if ((this instanceof C16279Urh) && (vl7 = ((C16279Urh) this).A04.A01) != null) {
            vl7.A0B.E2t();
        }
    }

    public final void A03() {
        if (this instanceof C16279Urh) {
            C18760Vzv vzv = ((C16279Urh) this).A04;
            if (vzv.A02()) {
                C363058j1.A02.A01("sup:MediaStreamControllerDelegate", "Permissions already granted!");
                return;
            }
            String[] A002 = C17132VJh.A00.A00();
            for (String str : A002) {
                Context context = vzv.A09;
                0qQ.A0C(context, "null cannot be cast to non-null type android.app.Activity");
                Activity activity = (Activity) context;
                if (1DL.A05(activity, str)) {
                    1Av r13 = vzv.A0D;
                    AnonymousClass7TF.A1J(r13, r13.A1n, 1Av.A8a, 124, true);
                }
                1Av r11 = vzv.A0D;
                if (!AnonymousClass7TG.A1a(r11, r11.A1n, 1Av.A8a, 124) || 1DL.A00(activity, str) != C346927vz.DENIED_DONT_ASK_AGAIN) {
                    C363058j1.A02.A01("sup:MediaStreamControllerDelegate", "Requesting bluetooth permissions...");
                    0qQ.A0C(context, "null cannot be cast to non-null type android.app.Activity");
                    C13990Tnq.A0k(activity, new C64729Lh6(9, A002, vzv), A002, r3);
                } else {
                    C363058j1.A02.A01("sup:MediaStreamControllerDelegate", "Already denied permissions twice - deeplinking to phone settings");
                    W38.A06(activity, (Integer) null);
                }
            }
        }
    }

    public final void A04() {
        if (this instanceof C16279Urh) {
            C16279Urh urh = (C16279Urh) this;
            1Av r7 = urh.A03;
            0s0 r6 = r7.A4s;
            AnonymousClass0YZ[] r5 = 1Av.A8a;
            if (AnonymousClass7TG.A1a(r7, r6, r5, 122)) {
                urh.A07(new UUl(false));
                return;
            }
            C363058j1.A02.A01("sup:GlassesToggleRepository", "Showing NUX tooltip");
            urh.A07(new UUl(true));
            AnonymousClass7TF.A1J(r7, r6, r5, 122, true);
        }
    }

    public final void A05() {
        if (this instanceof C16279Urh) {
            C16279Urh urh = (C16279Urh) this;
            urh.A07(((V4Y) urh.A00.getValue()).A00(true));
            urh.A0B((Boolean) null, (Boolean) null, AnonymousClass7TE.A0u(), (Boolean) null);
            C17917Vi8 vi8 = (C17917Vi8) urh.A05.getValue();
            if (vi8 != null) {
                vi8.A01 = true;
            }
        }
    }

    public final void A06() {
        C18078Vl7 vl7;
        if (this instanceof C16279Urh) {
            C16279Urh urh = (C16279Urh) this;
            05G r1 = urh.A00;
            urh.A07(((V4Y) r1.getValue()).A00(false));
            VR1 A022 = ((V4Y) r1.getValue()).A02();
            if (!(A022 == null || A022.A00 != 7 || (vl7 = urh.A04.A01) == null)) {
                vl7.A06(C391639tP.STREAM_RESUME);
            }
            C18777W1b w1b = urh.A01;
            w1b.A05(UV6.A00);
            C17917Vi8 vi8 = (C17917Vi8) urh.A05.getValue();
            if (vi8 != null) {
                vi8.A01 = false;
            }
            if (!urh.A0G() && w1b.A02.isEmpty()) {
                w1b.A05(C15185UUo.A00);
            }
        }
    }

    public final void A07(V4Y v4y) {
        if (this instanceof C16279Urh) {
            C363058j1.A02.A03("sup:GlassesToggleRepository", AnonymousClass7TG.A0m(v4y, "Setting glasses state to ", new StringBuilder()));
            this.A00.Epw(v4y);
        }
    }

    public final void A08(VR1 vr1) {
        VR1 vr12;
        if (this instanceof C16279Urh) {
            0qQ.A0B(vr1, 0);
            C18777W1b w1b = ((C16279Urh) this).A01;
            int i = vr1.A00;
            if (i == 4) {
                vr12 = UV5.A00;
            } else if (i == 7) {
                vr12 = C15195UUy.A00;
            } else if (i == 10) {
                vr12 = C15183UUm.A00;
            } else {
                return;
            }
            w1b.A05(vr12);
        }
    }

    public final void A09(VR1 vr1) {
        if (this instanceof C16279Urh) {
            ((C16279Urh) this).A01.A05(vr1);
        }
    }

    public final void A0A(X5A x5a, X80 x80, C62320sa r4, 0sP r5, 0sL r6) {
        if (this instanceof C16279Urh) {
            C18760Vzv vzv = ((C16279Urh) this).A04;
            vzv.A03 = x5a;
            vzv.A04 = x80;
            vzv.A05 = r4;
            vzv.A06 = r5;
            vzv.A07 = r6;
        }
    }

    public final void A0B(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        if (this instanceof C16279Urh) {
            05G r1 = this.A00;
            V4Y A012 = ((V4Y) r1.getValue()).A01((VR1) null, bool, bool2, bool3, bool4);
            if (A012 != null) {
                r1.Epw(A012);
            }
        }
    }

    public final void A0C(boolean z) {
        if (this instanceof C16279Urh) {
            C16279Urh urh = (C16279Urh) this;
            C18760Vzv vzv = urh.A04;
            if (!vzv.A02()) {
                C363058j1.A02.A01("sup:GlassesToggleRepository", "Showing permissions dialog to user");
                A01(urh, 23, false, false, false, true, false);
                return;
            }
            UserSession userSession = urh.A02;
            if (!1Au.A00(userSession).A1q()) {
                C363058j1.A02.A01("sup:GlassesToggleRepository", "Showing NUX bottom sheet");
                A01(urh, 27, false, false, true, false, false);
                1Av A002 = 1Au.A00(userSession);
                AnonymousClass7TF.A1J(A002, A002.A4r, 1Av.A8a, 123, true);
                return;
            }
            if (z) {
                urh.A07(new K0S(new C61044Jvi(15, false), false));
                urh.A01.A03();
            }
            UserSession userSession2 = vzv.A0C;
            Context context = vzv.A09;
            if (C362988ir.A01(context.getApplicationContext(), userSession2)) {
                C18078Vl7 vl7 = vzv.A01;
                if (vl7 == null) {
                    C17806VgJ vgJ = vzv.A02;
                    if (vgJ == null) {
                        vgJ = 1pd.A00(C362988ir.A00());
                        vzv.A02 = vgJ;
                        if (vgJ == null) {
                            return;
                        }
                    }
                    vl7 = vgJ.A00;
                    if (vl7 != null) {
                        W0T A003 = C18760Vzv.A00(vzv);
                        if (A003 != null) {
                            A003.A07(new K0S(new C61044Jvi(15, false), false));
                        }
                        new C19667WdV(vzv, 1).Dba(vl7);
                    } else {
                        vgJ.A00(context, userSession2, new C19667WdV(vzv, 1), "sup:MediaStreamControllerDelegate");
                        return;
                    }
                } else if (vl7.A0B.isConnected()) {
                    return;
                }
                vl7.A0B.connect();
            }
        }
    }

    public final void A0D(boolean z) {
        C18078Vl7 vl7;
        boolean z2;
        if (this instanceof C16279Urh) {
            C16279Urh urh = (C16279Urh) this;
            if (z) {
                vl7 = urh.A04.A01;
                if (vl7 != null) {
                    z2 = true;
                } else {
                    return;
                }
            } else {
                LinkedHashSet linkedHashSet = urh.A01.A02;
                if ((linkedHashSet.contains(UV1.A00) || !linkedHashSet.contains(C15186UUp.A00)) && (vl7 = urh.A04.A01) != null) {
                    z2 = false;
                } else {
                    return;
                }
            }
            vl7.A0B.EkZ(z2);
        }
    }

    public final void A0E(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        if (this instanceof C16279Urh) {
            05G r4 = this.A01;
            Object value = r4.getValue();
            r4.Epw(new AnonymousClass9ID(12, z, z2, z3, z4, z5));
            C363068j2 r2 = C363058j1.A02;
            StringBuilder sb = new StringBuilder();
            sb.append("Updating flow attributes flow from ");
            sb.append(value);
            sb.append(" to  ");
            r2.A03("sup:GlassesToggleRepository", AnonymousClass7TF.A0i(r4.getValue(), sb));
        }
    }

    public final boolean A0F() {
        if (this instanceof C16279Urh) {
            return ((C16279Urh) this).A04.A02();
        }
        return false;
    }

    public final boolean A0G() {
        C18078Vl7 vl7;
        if (!(this instanceof C16279Urh) || (vl7 = ((C16279Urh) this).A04.A01) == null || !vl7.A0B.isConnected()) {
            return false;
        }
        return true;
    }

    public final boolean A0H() {
        if (this instanceof C16279Urh) {
            return this.A00.getValue() instanceof K0S;
        }
        return false;
    }

    public final boolean A0I() {
        if (this instanceof C16279Urh) {
            V4Y v4y = (V4Y) this.A00.getValue();
            if (!(v4y instanceof K0R) || !((K0R) v4y).A01) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean A0J() {
        if (this instanceof C16279Urh) {
            return this.A00.getValue() instanceof K0R;
        }
        return false;
    }

    public final boolean A0K() {
        if (this instanceof C16279Urh) {
            return 0qQ.A0K(this.A00.getValue(), UUk.A00);
        }
        return false;
    }

    public final boolean A0L() {
        if (this instanceof C16279Urh) {
            V4Y v4y = (V4Y) this.A00.getValue();
            if (!(v4y instanceof K0R) || !((K0R) v4y).A00.A04) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean A0M() {
        if (this instanceof C16279Urh) {
            V4Y v4y = (V4Y) this.A00.getValue();
            if (!(v4y instanceof UUl) || !((UUl) v4y).A00) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean A0N() {
        if (this instanceof C16279Urh) {
            return AnonymousClass7TF.A1V(((C16279Urh) this).A04.A01);
        }
        return false;
    }

    public W0T() {
        02z A012 = 106.A01(UUk.A00);
        this.A00 = A012;
        02z r1 = new 02z(new AnonymousClass9ID(127, false, false, false, false, false));
        this.A01 = r1;
        this.A02 = 10b.A03(A012);
        this.A03 = 10b.A03(r1);
    }
}

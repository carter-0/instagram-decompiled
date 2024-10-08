package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.Iterator;

public final class ISX implements AnonymousClass3WV {
    public final C52476GUc A00;
    public final UserSession A01;
    public final AnonymousClass3WV A02;

    public final void A85(C245833dY r2, int i) {
        0qQ.A0B(r2, 1);
        this.A02.A85(r2, i);
    }

    public final void A82(int i) {
        this.A02.A82(i);
    }

    public final void A87(int i) {
        this.A02.A87(i);
    }

    public final void A88(int i) {
        this.A02.A88(i);
    }

    public final void A8V(int i) {
        this.A02.A8V(i);
    }

    public final void A8i(int i) {
        this.A02.A8i(i);
    }

    public final void AAB(int i) {
        this.A02.AAB(i);
    }

    public final void E49(1Xj r2, AnonymousClass3W1 r3) {
        this.A02.E49(r2, r3);
    }

    public final void E4A(AnonymousClass3W1 r2, AnonymousClass3OA r3) {
        this.A02.E4A(r2, r3);
    }

    public final void FJ8(View view) {
        this.A02.FJ8(view);
    }

    public ISX(UserSession userSession, C52476GUc gUc, AnonymousClass3WV r3) {
        AnonymousClass7TG.A1U(r3, gUc, userSession);
        this.A02 = r3;
        this.A00 = gUc;
        this.A01 = userSession;
    }

    public final void ECB(View view, int i, Object obj, Object obj2) {
        GV8 gv8;
        Integer num;
        Integer num2;
        Integer num3;
        String str;
        String str2;
        Integer num4;
        AnonymousClass7TG.A1Q(obj, obj2);
        1Xj A022 = 1Xi.A02(obj);
        if (A022 != null) {
            if (A022.CcK()) {
                C52476GUc gUc = this.A00;
                AnonymousClass3W1 BQr = gUc.BQr(A022);
                int position = BQr.getPosition();
                1Xj A023 = 1Xi.A02(gUc.A04(position - 1));
                1Xj A024 = 1Xi.A02(gUc.A04(position + 1));
                Integer num5 = null;
                String A0u = C51969G9p.A0u(A023);
                String A0u2 = C51969G9p.A0u(A024);
                BQr.A1S = A0u;
                BQr.A1O = A0u2;
                int position2 = BQr.getPosition();
                String id = A022.getId();
                Integer num6 = null;
                if (id != null) {
                    Iterator A0v = AnonymousClass7TF.A0v(gUc.A07);
                    while (true) {
                        if (!A0v.hasNext()) {
                            break;
                        }
                        C55485HiT hiT = (C55485HiT) A0v.next();
                        if (hiT != null) {
                            1Nv r1 = hiT.A00;
                            if ((r1 instanceof GV8) && (gv8 = (GV8) r1) != null && 0qQ.A0K(gv8.A0K.getId(), id)) {
                                break;
                            }
                        }
                    }
                }
                gv8 = null;
                int i2 = position2;
                while (true) {
                    i2--;
                    if (-1 < i2) {
                        if (gUc.A04(i2) instanceof AnonymousClass3OA) {
                            num6 = Integer.valueOf(i2);
                            break;
                        }
                    } else {
                        break;
                    }
                }
                int i3 = position2;
                while (true) {
                    i3--;
                    if (-1 < i3) {
                        if (gUc.A04(i3) instanceof AnonymousClass3O9) {
                            num = Integer.valueOf(i3);
                            break;
                        }
                    } else {
                        num = null;
                        break;
                    }
                }
                if (gv8 != null) {
                    BQr.A0p = gv8.A00;
                }
                if (num6 != null) {
                    BQr.A08 = (position2 - num6.intValue()) - 1;
                }
                if (num != null) {
                    BQr.A0P = (position2 - num.intValue()) - 1;
                }
                if (A023 != null) {
                    num2 = A023.A2I();
                } else {
                    num2 = null;
                }
                if (A024 != null) {
                    num3 = A024.A2I();
                } else {
                    num3 = null;
                }
                BQr.A18 = num2;
                BQr.A17 = num3;
                if (A023 != null) {
                    str = C243413Yr.A00(A023.A0e);
                } else {
                    str = null;
                }
                if (A024 != null) {
                    str2 = C243413Yr.A00(A024.A0e);
                } else {
                    str2 = null;
                }
                BQr.A1R = str;
                BQr.A1N = str2;
                if (A023 != null) {
                    num4 = A023.CEl();
                } else {
                    num4 = null;
                }
                if (A024 != null) {
                    num5 = A024.CEl();
                }
                BQr.A0a(num4, num5);
            }
            this.A02.ECB(view, i, obj, obj2);
        }
    }
}

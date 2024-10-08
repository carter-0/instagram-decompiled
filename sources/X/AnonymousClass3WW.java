package X;

import android.view.View;
import com.instagram.api.schemas.BrandSafetyContentBlocklistBitmapQLObj;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3WW  reason: invalid class name */
public final class AnonymousClass3WW implements AnonymousClass3WV {
    public final AnonymousClass2rI A00;
    public final UserSession A01;
    public final AnonymousClass3WV A02;
    public final boolean A03;

    public AnonymousClass3WW(UserSession userSession, AnonymousClass3WV r5, AnonymousClass2rI r6) {
        0qQ.A0B(r5, 1);
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r6, 3);
        this.A02 = r5;
        this.A01 = userSession;
        this.A00 = r6;
        this.A03 = 182.A06(0Tu.A05, userSession, 2342158624148819378L);
    }

    private final ArrayList A00(int i) {
        1Xj A022;
        BrandSafetyContentBlocklistBitmapQLObj AiG;
        List Afw;
        if (i < 0) {
            return null;
        }
        AnonymousClass2rI r1 = this.A00;
        if (i >= r1.B5I() || (A022 = 1Xi.A02(r1.A03(i).A05)) == null || (AiG = A022.A0C.AiG()) == null || (Afw = AiG.Afw()) == null) {
            return null;
        }
        return C271914jn.A00.A01(Afw);
    }

    public final void A85(C245833dY r2, int i) {
        0qQ.A0B(r2, 1);
        this.A02.A85(r2, i);
    }

    public final void ECB(View view, int i, Object obj, Object obj2) {
        String str;
        String str2;
        String str3;
        String str4;
        1Xj A022;
        1Xj A023;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        1Xj A024;
        1Xj A025;
        1Xj A026;
        1Xj A027;
        1Xj A028;
        1Xj A029;
        0qQ.A0B(obj, 2);
        0qQ.A0B(obj2, 3);
        1Xj A0210 = 1Xi.A02(obj);
        if (A0210 != null && A0210.CcK()) {
            AnonymousClass2rI r5 = this.A00;
            C228392lb r4 = r5.A0S;
            int position = r4.BQr(A0210).getPosition();
            int i2 = position - 1;
            if (i2 < 0 || i2 >= r5.B5I() || (A029 = 1Xi.A02(r5.A03(i2).A05)) == null) {
                str = null;
            } else {
                str = A029.getId();
            }
            int i3 = position + 1;
            if (i3 < 0 || i3 >= r5.B5I() || (A028 = 1Xi.A02(r5.A03(i3).A05)) == null) {
                str2 = null;
            } else {
                str2 = A028.getId();
            }
            AnonymousClass3W1 BQr = r4.BQr(A0210);
            BQr.A1S = str;
            BQr.A1O = str2;
            if (this.A03) {
                AnonymousClass3W1 BQr2 = r4.BQr(A0210);
                if (i2 < 0 || i2 >= r5.B5I() || (A027 = 1Xi.A02(r5.A03(i2).A05)) == null) {
                    num = null;
                } else {
                    num = A027.A2I();
                }
                if (i3 < 0 || i3 >= r5.B5I() || (A026 = 1Xi.A02(r5.A03(i3).A05)) == null) {
                    num2 = null;
                } else {
                    num2 = A026.A2I();
                }
                BQr2.A18 = num;
                BQr2.A17 = num2;
                String str5 = null;
                if (i2 >= 0 && i2 < r5.B5I() && (A025 = 1Xi.A02(r5.A03(i2).A05)) != null) {
                    str5 = C243413Yr.A00(A025.A0e);
                }
                String str6 = null;
                if (i3 >= 0 && i3 < r5.B5I() && (A024 = 1Xi.A02(r5.A03(i3).A05)) != null) {
                    str6 = C243413Yr.A00(A024.A0e);
                }
                BQr2.A1R = str5;
                BQr2.A1N = str6;
                if (i2 < 0 || i2 >= r5.B5I()) {
                    num3 = null;
                } else {
                    num3 = r5.A03(i2).A08;
                }
                if (i3 < 0 || i3 >= r5.B5I()) {
                    num4 = null;
                } else {
                    num4 = r5.A03(i3).A08;
                }
                BQr2.A0a(num3, num4);
                ArrayList A002 = A00(i2);
                ArrayList A003 = A00(i3);
                if (A002 != null) {
                    BQr2.A1i = A002;
                }
                if (A003 != null) {
                    BQr2.A1h = A003;
                }
            }
            if (i2 < 0 || i2 >= r5.B5I() || (A023 = 1Xi.A02(r5.A03(i2).A05)) == null) {
                str3 = null;
            } else {
                str3 = A023.A0C.BIl();
            }
            if (i3 < 0 || i3 >= r5.B5I() || (A022 = 1Xi.A02(r5.A03(i3).A05)) == null) {
                str4 = null;
            } else {
                str4 = A022.A0C.BIl();
            }
            AnonymousClass3W1 BQr3 = r4.BQr(A0210);
            BQr3.A1Q = str3;
            BQr3.A1M = str4;
        }
        this.A02.ECB(view, i, obj, obj2);
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
}

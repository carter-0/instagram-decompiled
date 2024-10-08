package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.GCc  reason: case insensitive filesystem */
public final class C52030GCc {
    public final UserSession A00;
    public final AnonymousClass4DU A01;
    public final Context A02;

    public static final float A00(C52030GCc gCc, Float f) {
        if (f == null) {
            return 0.0f;
        }
        return 0nA.A01(gCc.A02, f.floatValue());
    }

    public static final void A01(GSY gsy, C52030GCc gCc, C267324bN r8, String str, 0sP r10) {
        0jB A012;
        1Xj r5 = r8.A02;
        if (r5 != null) {
            AnonymousClass4DU r3 = gCc.A01;
            C254523sc A04 = C254513sb.A04(r8, r3, "gesture");
            A04.A7M = gsy.A02;
            A04.A2V = Double.valueOf((double) A00(gCc, (Float) gsy.A00));
            A04.A2W = Double.valueOf((double) A00(gCc, (Float) gsy.A01));
            UserSession userSession = gCc.A00;
            A04.A0G(userSession, r5);
            if (str == null) {
                str = r3.getModuleName();
            }
            A04.A73 = str;
            A02(gCc, A04);
            A04.A1C = Boolean.valueOf(r5.CcK());
            if (GDZ.A00(r8) && (A012 = C52452GTe.A01(userSession, r8.A06().A0N, gsy.A03)) != null) {
                A04.A0q = A012;
            }
            r10.invoke(A04);
            C233822wX.A0H(userSession, A04, r3);
        }
    }

    public static final void A02(C52030GCc gCc, C254523sc r4) {
        Context context = gCc.A02;
        float A002 = A00(gCc, Float.valueOf((float) 0nA.A09(context)));
        float A003 = A00(gCc, Float.valueOf((float) 0nA.A08(context)));
        r4.A2U = Double.valueOf((double) A002);
        r4.A2T = Double.valueOf((double) A003);
    }

    public final void A03(GSY gsy, C267324bN r3, String str) {
        A01(gsy, this, r3, str, GQ5.A00);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.5sM, java.lang.Object] */
    public final void A04(C267324bN r8, Boolean bool, Boolean bool2, Double d, Double d2, Float f, Float f2, Float f3, String str, String str2, String str3, 0sP r19, float f4, float f5, float f6, float f7, float f8, float f9) {
        1Xj r1 = r8.A02;
        if (r1 != null) {
            float A002 = A00(this, Float.valueOf(f4));
            float A003 = A00(this, Float.valueOf(f5));
            float A004 = A00(this, Float.valueOf(f6));
            float A005 = A00(this, Float.valueOf(f7));
            ? obj = new Object();
            obj.A02 = A002;
            obj.A03 = A003;
            obj.A00 = A004;
            obj.A01 = A005;
            obj.A04 = f8;
            obj.A05 = f9;
            AnonymousClass4DU r3 = this.A01;
            C254523sc A04 = C254513sb.A04(r8, r3, "gesture");
            A04.A7M = str;
            A04.A73 = "primary";
            A04.A12 = obj;
            A04.A18 = bool;
            A04.A5M = str2;
            A04.A5N = str3;
            A04.A19 = bool2;
            A04.A2h = Float.valueOf(A00(this, f));
            A04.A2i = Float.valueOf(A00(this, f2));
            UserSession userSession = this.A00;
            A04.A0G(userSession, r1);
            A02(this, A04);
            A04.A1C = Boolean.valueOf(r1.CcK());
            if (d != null) {
                A04.A2X = Double.valueOf(d.doubleValue() / 1000.0d);
            }
            if (d2 != null) {
                A04.A01 = d2.doubleValue() / 1000.0d;
            }
            if (f3 != null) {
                A04.A2g = Float.valueOf(f3.floatValue() / 1000.0f);
            }
            0sP r0 = r19;
            if (r19 != null) {
                r0.invoke(A04);
            }
            C233822wX.A0H(userSession, A04, r3);
        }
    }

    public final void A05(C267324bN r7, String str, String str2) {
        1Xj r5;
        if (r7 != null && (r5 = r7.A02) != null) {
            String A0i = 002.A0i(AnonymousClass000.A00(1139), str, str2, '_');
            AnonymousClass4DU r3 = this.A01;
            C254523sc A04 = C254513sb.A04(r7, r3, "gesture");
            UserSession userSession = this.A00;
            A04.A0G(userSession, r5);
            A04.A73 = "bottom_sheet";
            A04.A7M = A0i;
            C233822wX.A0H(userSession, A04, r3);
        }
    }

    public C52030GCc(Context context, UserSession userSession, AnonymousClass4DU r3) {
        AnonymousClass7TG.A1U(context, userSession, r3);
        this.A02 = context;
        this.A00 = userSession;
        this.A01 = r3;
    }
}

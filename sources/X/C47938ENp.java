package X;

import android.content.Context;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.ENp  reason: case insensitive filesystem */
public final class C47938ENp extends FV4 implements AnonymousClass0iw, C51950G8t {
    public static final C49885FBl A03 = new Object();
    public static final HashMap A04 = AnonymousClass7TE.A1E();
    public static final String __redex_internal_original_name = "OnboardingControllerBusinessLogic";
    public boolean A00;
    public final Context A01;
    public final 0lg A02;

    public final void A03(UserSession userSession, FRM frm, EXD exd) {
        if (182.A06(0Tu.A06, userSession, 36317715174069711L) && !this.A00) {
            super.A02(new C47946ENx(frm, exd), false);
        }
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [X.Ezs, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v11, types: [X.Ez9, java.lang.Object] */
    public final void Cm0(int i) {
        List<C49722F3l> A1C;
        String str;
        FRM frm = (FRM) this.A03;
        UserSession userSession = frm.A00;
        if (!(userSession == null || i == -2 || i == -1)) {
            C49722F3l f3l = this.A00;
            if (f3l == null || (str = ((C48155EZx) f3l.A00).name()) == null) {
                str = "";
            }
            String valueOf = String.valueOf(i);
            double A012 = DbS.A01();
            double A002 = DbS.A00();
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "nux_step_completed");
            if (A0e.isSampled()) {
                DbY.A1D(A0e, A012, A002);
                DbZ.A1J(A0e, str);
                DbW.A13(A0e, A012);
                DbY.A1I(A0e, "module", "waterfall_log_in", A002);
                A0e.AAJ(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, valueOf);
                FH8.A0E(A0e, "extra", (String) null);
                A0e.Cgf();
            }
        }
        super.Cm0(i);
        UserSession userSession2 = frm.A00;
        if (userSession2 != null) {
            AnonymousClass35C r5 = new AnonymousClass35C(userSession2);
            F39 f39 = this.A01;
            int i2 = f39.A00;
            if (i2 <= 0) {
                i2 = 0;
            }
            List list = f39.A01;
            if (i2 < list.size()) {
                A1C = list.subList(i2, list.size());
            } else {
                A1C = AnonymousClass7TE.A1C();
            }
            EXD exd = frm.A01;
            if (A1C == null || A1C.isEmpty() || exd == null) {
                r5.A00();
                return;
            }
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            for (C49722F3l f3l2 : A1C) {
                String str2 = f3l2.A01;
                ? obj = new Object();
                obj.A00 = (C48155EZx) f3l2.A00;
                obj.A02 = str2;
                obj.A03 = null;
                obj.A01 = null;
                A1C2.add(obj);
            }
            ? obj2 = new Object();
            obj2.A04 = A1C2;
            obj2.A01 = exd;
            obj2.A03 = 0;
            try {
                1Av r4 = r5.A01;
                DbS.A1a(r4, C49782F6q.A00(obj2), r4.A79, 1Av.A8a, 252);
            } catch (IOException e) {
                0wb.A07("Onboarding Persistence Failure", e);
                r5.A00();
            }
        }
    }

    public final String getModuleName() {
        return "nux_controller_business_logic";
    }

    public C47938ENp(Context context, 0lg r3, FRM frm, F39 f39) {
        super(f39, frm);
        this.A02 = r3;
        this.A01 = DbT.A05(context);
    }

    public final void A02(F39 f39, boolean z) {
        super.A02(f39, z);
        this.A00 = true;
    }
}

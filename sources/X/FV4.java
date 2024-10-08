package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.nux.cal.model.DpActionContent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class FV4 implements AnonymousClass0iw {
    public static final String __redex_internal_original_name = "DynamicFlowControllerBusinessLogic";
    public C49722F3l A00;
    public F39 A01;
    public Set A02 = AnonymousClass7TE.A1F();
    public final Object A03;
    public final Map A04 = AnonymousClass7TE.A1H();

    public final void ATY() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00() {
        /*
            r11 = this;
            X.F39 r0 = r11.A01
            X.F3l r5 = r0.A00()
            r11.A00 = r5
            if (r5 != 0) goto L_0x002a
            java.util.Set r1 = r11.A02
            java.util.HashSet r0 = X.AnonymousClass7TE.A1F()
            r11.A02 = r0
            java.util.Iterator r1 = r1.iterator()
        L_0x0016:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0026
            java.lang.Object r0 = r1.next()
            X.G6A r0 = (X.G6A) r0
            r0.onFinished()
            goto L_0x0016
        L_0x0026:
            r11.A01()
            return
        L_0x002a:
            X.EZx r4 = X.C48155EZx.CONTACT_INVITE
            X.EZx r3 = X.C48155EZx.CONTACT_INVITE_NO_SKIP_BUTTON
            X.EZx r2 = X.C48155EZx.CONTACT_INVITE_UPDATED_TEXT_NO_ILLUSTRATION
            X.EZx r1 = X.C48155EZx.CONTACT_INVITE_REDESIGN_B
            X.EZx r0 = X.C48155EZx.CONTACT_INVITE_REDESIGN_C
            X.EZx[] r0 = new X.C48155EZx[]{r4, r3, r2, r1, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            java.util.Set r1 = X.00k.A0k(r0)
            X.G54 r3 = r5.A00
            X.EZx r3 = (X.C48155EZx) r3
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.nux.impl.dynamicflow.onboarding.OnboardingStep"
            X.0qQ.A0C(r3, r0)
            boolean r0 = r1.contains(r3)
            if (r0 == 0) goto L_0x0077
            java.util.Iterator r4 = r1.iterator()
        L_0x0053:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0080
            java.lang.Object r2 = r4.next()
            java.util.Map r0 = r11.A04
            java.util.Iterator r1 = X.DbV.A16(r0)
        L_0x0063:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0053
            java.lang.Object r0 = r1.next()
            X.F3l r0 = (X.C49722F3l) r0
            X.G54 r0 = r0.A00
            if (r2 != r0) goto L_0x0063
        L_0x0073:
            r11.A00()
            return
        L_0x0077:
            java.util.Map r0 = r11.A04
            boolean r0 = r0.containsKey(r5)
            if (r0 == 0) goto L_0x0080
            goto L_0x0073
        L_0x0080:
            boolean r0 = r5.A00()
            if (r0 != 0) goto L_0x008b
            r0 = -1
            r11.Cm0(r0)
            return
        L_0x008b:
            r1 = r11
            X.ENp r1 = (X.C47938ENp) r1
            java.lang.Object r0 = r1.A03
            X.FRM r0 = (X.FRM) r0
            X.EXD r0 = r0.A01
            X.0lg r10 = r1.A02
            if (r0 == 0) goto L_0x009c
            java.lang.String r9 = r0.A00
            if (r9 != 0) goto L_0x009e
        L_0x009c:
            java.lang.String r9 = ""
        L_0x009e:
            java.lang.String r8 = r3.name()
            r7 = 0
            r0 = 2
            double r5 = X.DbV.A00(r8, r0)
            double r2 = X.DbS.A00()
            X.0wc r1 = X.AnonymousClass0kN.A02(r10)
            java.lang.String r0 = "ig_dynamic_onboarding_step"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r1, r0)
            X.DbZ.A1G(r4, r5, r2)
            X.DbS.A1G(r4, r9)
            java.lang.String r0 = "onboarding_step"
            r4.AAJ(r0, r8)
            X.FH8.A06(r4)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            java.lang.String r0 = "skipped"
            r4.A7p(r0, r1)
            X.DbW.A12(r4, r2)
            X.DbZ.A1E(r4)
            X.FH8.A08(r4, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FV4.A00():void");
    }

    public final void A01() {
        String str;
        boolean z;
        Boolean Ab4;
        C47938ENp eNp = (C47938ENp) this;
        C49885FBl fBl = C47938ENp.A03;
        FRM frm = (FRM) eNp.A03;
        synchronized (fBl) {
            HashMap hashMap = C47938ENp.A04;
            UserSession userSession = frm.A00;
            if (userSession != null) {
                str = userSession.A06;
            } else {
                str = null;
            }
            hashMap.remove(str);
            UserSession userSession2 = frm.A00;
            if (userSession2 != null) {
                userSession2.A03(DpActionContent.class);
            }
        }
        UserSession userSession3 = frm.A00;
        0Tu r3 = 0Tu.A05;
        if (!DbY.A1Y(r3, userSession3, 36330750399759102L)) {
            Context context = eNp.A01;
            0lg r7 = eNp.A02;
            UserSession userSession4 = frm.A00;
            if (userSession4 == null || ((Ab4 = DbX.A0m(userSession4).Ab4()) != null && Ab4.booleanValue())) {
                z = true;
            } else {
                z = false;
            }
            boolean A002 = frm.A00();
            boolean A032 = AnonymousClass1G3.A03();
            boolean A1V = AnonymousClass7TF.A1V(frm.A00);
            1ES.A03(C49043EoN.A00(context, r7, frm.A01, AnonymousClass05K.A0C, frm.A02, Dba.A0e(eNp.A04), z, A002, A032, A1V, false));
        }
        if (userSession3 != null && 182.A06(r3, userSession3, 36331089702634381L)) {
            1Av A003 = 1Au.A00(userSession3);
            AnonymousClass7TF.A1J(A003, A003.A7m, 1Av.A8a, 37, true);
        }
    }

    public final boolean CTj() {
        Object obj;
        F39 f39 = this.A01;
        int i = 0;
        List list = f39.A01;
        if (0 < list.size()) {
            obj = list.get(0);
        } else {
            obj = null;
            i = list.size();
        }
        f39.A00 = i;
        if (obj == null || !obj.equals(this.A00)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.F38] */
    public void Cm0(int i) {
        C49722F3l f3l = this.A00;
        if (f3l != null) {
            G54 g54 = f3l.A00;
            FRM frm = (FRM) this.A03;
            if (((C48155EZx) g54) instanceof C47939ENq) {
                0qQ.A0B(frm, 0);
            }
            Map map = this.A04;
            G54 g542 = f3l.A00;
            ? obj = new Object();
            String name = ((C48155EZx) g542).name();
            0qQ.A0B(name, 0);
            obj.A01 = name;
            obj.A00 = i;
            map.put(f3l, obj);
        }
        A00();
    }

    public FV4(F39 f39, Object obj) {
        this.A01 = f39;
        this.A00 = f39.A00();
        this.A03 = obj;
    }

    public void A02(F39 f39, boolean z) {
        if (!11Z.A07()) {
            11Z.A02(new C51476Fuk(this, f39, z));
            return;
        }
        this.A01 = f39;
        if (z) {
            this.A00 = f39.A00();
        }
    }
}

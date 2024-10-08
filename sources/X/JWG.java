package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Looper;
import com.instagram.common.session.UserSession;

public final class JWG {
    public Dialog A00;
    public C49945FFy A01;
    public Integer A02;
    public boolean A03;
    public boolean A04;
    public final Activity A05;
    public final Context A06;
    public final C60012JdL A07 = new C60012JdL(Looper.getMainLooper(), this, 0);
    public final UserSession A08;
    public final C267864cL A09;

    public final boolean A0A(DialogInterface.OnClickListener onClickListener, Integer num) {
        0qQ.A0B(num, 0);
        Integer num2 = this.A02;
        if (this.A03 || (num2 != null && (LPN.A01(num) < LPN.A01(num2) || num == num2))) {
            return false;
        }
        if (A09() && num2 != null) {
            A08(num2);
        }
        for (Integer num3 : AnonymousClass05K.A00(26)) {
            if (LPN.A01(num3) < LPN.A01(num)) {
                this.A07.removeMessages(LPN.A00(num3));
            }
        }
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            this.A07.post(new M8Y(onClickListener, this, num));
            return true;
        }
        A04(onClickListener, this, num);
        return true;
    }

    private final Dialog A00(int i) {
        C358248ab A0Y = DbS.A0Y(this.A06);
        A0Y.A08(i);
        A0Y.A05();
        A0Y.A09(2131960801);
        LV3.A01(A0Y, this, 28, 2131958477);
        return A0Y.A02();
    }

    private final Dialog A01(DialogInterface.OnClickListener onClickListener, Integer num) {
        Integer num2 = AnonymousClass05K.A00;
        Activity activity = this.A05;
        int i = 2131976403;
        if (num == num2) {
            i = 2131969399;
        }
        String A0e = AnonymousClass7TF.A0e(activity.getResources(), AnonymousClass7TF.A0j(AnonymousClass7TE.A16(activity, i)), 2131972064);
        0qQ.A07(A0e);
        C358248ab A0Y = DbS.A0Y(this.A06);
        A0Y.A05 = A0e;
        A0Y.A0L(onClickListener, 2131971974);
        A0Y.A05();
        return A0Y.A02();
    }

    private final Dialog A02(Integer num) {
        LV0 A002 = LV0.A00(num, this, 14);
        C358248ab A0X = DbS.A0X(this.A05);
        A0X.A08(2131972525);
        A0X.A0H(A002, 2131958477);
        A0X.A0I(A002, 2131958480);
        A0X.A09(2131972526);
        A0X.A0B(new C64207LTx(this, 0));
        return A0X.A02();
    }

    private final Dialog A03(Integer num) {
        C358248ab A0X = DbS.A0X(this.A05);
        A0X.A09(2131974180);
        A0X.A08(2131974179);
        A0X.A0K(LV3.A00(this, 26), 2131958481);
        A0X.A0H(LV3.A00(this, 27), 2131958479);
        A0X.A0O(LV0.A00(num, this, 15), C358278ae.DEFAULT, 2131958480);
        A0X.A0B(new C64207LTx(this, 1));
        return A0X.A02();
    }

    public static final void A05(JWG jwg) {
        UserSession userSession = jwg.A08;
        JZM.A00(userSession);
        27p.A01(userSession).A1l(AnonymousClass000.A00(443));
        jwg.A04 = true;
        jwg.A05.onBackPressed();
        jwg.A04 = false;
    }

    public static final void A07(JWG jwg, Integer num) {
        UserSession userSession = jwg.A08;
        27p.A01(userSession).A1D(C371088xY.DIALOG, (C59725JVj) null, AnonymousClass7TF.A0g(userSession), (String) null, (String) null, (String) null, false);
        if (num == AnonymousClass05K.A00 || num == AnonymousClass05K.A01) {
            AnonymousClass6SR.A01().A07(userSession, "gallery", AnonymousClass7TF.A1W(num, AnonymousClass05K.A01));
        }
        JZM.A00(userSession);
        27p.A01(userSession).A1l(AnonymousClass000.A00(929));
        jwg.A09.EJy(false);
    }

    public final void A08(Integer num) {
        if (!this.A03) {
            C60012JdL jdL = this.A07;
            jdL.removeMessages(LPN.A00(num));
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                jdL.post(new M69(this, num));
            } else {
                A06(this, num);
            }
        }
    }

    public final boolean A09() {
        Dialog dialog = this.A00;
        if ((dialog == null || !dialog.isShowing()) && this.A01 == null) {
            return false;
        }
        return true;
    }

    public final boolean A0B(Integer num) {
        if (this.A02 != num || !A09()) {
            return false;
        }
        return true;
    }

    public JWG(Activity activity, UserSession userSession, C267864cL r6) {
        AnonymousClass7TG.A1O(activity, userSession);
        this.A05 = activity;
        this.A08 = userSession;
        this.A09 = r6;
        this.A06 = JWB.A01(userSession) ? 2Yn.A01(activity) : activity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00c2, code lost:
        r0 = X.AnonymousClass7TF.A0e(r3.getResources(), X.AnonymousClass7TF.A0j(X.AnonymousClass7TF.A0d(r1, r0)), 2131969589);
        X.0qQ.A07(r0);
        r2 = X.DbS.A0X(r3);
        r2.A0q(r0);
        r2.A0H((android.content.DialogInterface.OnClickListener) null, 2131969588);
        r2.A0I(r6, 2131969590);
        r2.A09(2131969591);
        r2 = r2.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0114, code lost:
        r2.A09(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0117, code lost:
        r2 = r2.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x017a, code lost:
        r7.A00 = r2;
        r2.setOnDismissListener(new X.LV8(r7, 4));
        X.AnonymousClass0fN.A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x01cd, code lost:
        r0 = r7.A06;
        r5 = r7.A08;
        r4 = new X.C46498Dg1(r0, r5);
        r3 = r7.A05;
        r4.A0D(r3.getString(2131974180), r3.getString(2131974179));
        r0 = r4.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x01ee, code lost:
        if (r0 == null) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x01f0, code lost:
        r0.A04 = com.instagram.android.R.style.igds_emphasized_label;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x01f2, code lost:
        r4.A02(new X.LY1(r7, 59), 2131958481);
        X.LY8.A01(r4, r6, r7, 39, 2131958480);
        r2 = 2131958479;
        r1 = new X.LY1(r7, 60);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0211, code lost:
        r4.A04(r1, r2);
        r2 = X.C51965G9l.A11();
        r4.A03 = new X.C65348Lro(1, r2, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0224, code lost:
        if (X.JWB.A01(r5) == false) goto L_0x022e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0226, code lost:
        r1 = X.AnonymousClass2k4.NIGHT;
        X.0qQ.A0B(r1, 0);
        r4.A02 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x022e, code lost:
        r0 = new X.C49945FFy(r4);
        r2.A00 = r0;
        r7.A01 = r0;
        r0.A03(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x023a, code lost:
        r7.A02 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x023c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(android.content.DialogInterface.OnClickListener r6, X.JWG r7, java.lang.Integer r8) {
        /*
            int r0 = r8.intValue()
            switch(r0) {
                case 0: goto L_0x0163;
                case 1: goto L_0x0152;
                case 2: goto L_0x00a6;
                case 3: goto L_0x009d;
                case 4: goto L_0x009d;
                case 5: goto L_0x0094;
                case 6: goto L_0x00af;
                case 7: goto L_0x00b9;
                case 8: goto L_0x0007;
                case 9: goto L_0x0076;
                case 10: goto L_0x0055;
                case 11: goto L_0x0036;
                case 12: goto L_0x0026;
                case 13: goto L_0x001e;
                case 14: goto L_0x00f8;
                case 15: goto L_0x002e;
                case 16: goto L_0x0016;
                case 17: goto L_0x01cb;
                case 18: goto L_0x01c8;
                case 19: goto L_0x018a;
                case 20: goto L_0x011c;
                case 21: goto L_0x0141;
                case 22: goto L_0x003e;
                case 23: goto L_0x000e;
                case 24: goto L_0x0174;
                case 25: goto L_0x0163;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.String r0 = "Unrecognized dialog type."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x000e:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            android.app.Dialog r2 = r7.A01(r6, r0)
            goto L_0x017a
        L_0x0016:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            android.app.Dialog r2 = r7.A03(r0)
            goto L_0x017a
        L_0x001e:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            android.app.Dialog r2 = r7.A02(r0)
            goto L_0x017a
        L_0x0026:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            android.app.Dialog r2 = r7.A02(r0)
            goto L_0x017a
        L_0x002e:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            android.app.Dialog r2 = r7.A03(r0)
            goto L_0x017a
        L_0x0036:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            android.app.Dialog r2 = r7.A02(r0)
            goto L_0x017a
        L_0x003e:
            android.app.Activity r0 = r7.A05
            X.8ab r2 = X.DbS.A0X(r0)
            r0 = 2131961035(0x7f1324cb, float:1.9558756E38)
            r2.A09(r0)
            r0 = 2131961034(0x7f1324ca, float:1.9558754E38)
            r2.A08(r0)
            r2.A0E(r6)
            goto L_0x0117
        L_0x0055:
            android.app.Activity r0 = r7.A05
            X.8ab r2 = X.DbS.A0X(r0)
            r0 = 2131961740(0x7f13278c, float:1.9560185E38)
            r2.A09(r0)
            r0 = 0
            r2.A0r(r0)
            r0 = 2131968503(0x7f1341f7, float:1.9573902E38)
            r2.A08(r0)
            r0 = 30
            X.LV3 r0 = X.LV3.A00(r7, r0)
            r2.A0E(r0)
            goto L_0x0117
        L_0x0076:
            android.app.Activity r0 = r7.A05
            X.8ab r2 = X.DbS.A0X(r0)
            r0 = 0
            r2.A0r(r0)
            r0 = 2131969408(0x7f134580, float:1.9575738E38)
            r2.A08(r0)
            r0 = 29
            X.LV3 r0 = X.LV3.A00(r7, r0)
            r2.A0E(r0)
            r0 = 2131969409(0x7f134581, float:1.957574E38)
            goto L_0x0114
        L_0x0094:
            r0 = 2131960824(0x7f1323f8, float:1.9558328E38)
            android.app.Dialog r2 = r7.A00(r0)
            goto L_0x017a
        L_0x009d:
            r0 = 2131960800(0x7f1323e0, float:1.9558279E38)
            android.app.Dialog r2 = r7.A00(r0)
            goto L_0x017a
        L_0x00a6:
            r0 = 2131960791(0x7f1323d7, float:1.955826E38)
            android.app.Dialog r2 = r7.A00(r0)
            goto L_0x017a
        L_0x00af:
            android.app.Activity r3 = r7.A05
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131969399(0x7f134577, float:1.957572E38)
            goto L_0x00c2
        L_0x00b9:
            android.app.Activity r3 = r7.A05
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131976403(0x7f1360d3, float:1.9589926E38)
        L_0x00c2:
            java.lang.String r0 = X.AnonymousClass7TF.A0d(r1, r0)
            java.lang.String r2 = X.AnonymousClass7TF.A0j(r0)
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131969589(0x7f134635, float:1.9576105E38)
            java.lang.String r0 = X.AnonymousClass7TF.A0e(r1, r2, r0)
            X.0qQ.A07(r0)
            X.8ab r2 = X.DbS.A0X(r3)
            r2.A0q(r0)
            r1 = 2131969588(0x7f134634, float:1.9576103E38)
            r0 = 0
            r2.A0H(r0, r1)
            r0 = 2131969590(0x7f134636, float:1.9576107E38)
            r2.A0I(r6, r0)
            r0 = 2131969591(0x7f134637, float:1.957611E38)
            r2.A09(r0)
            android.app.Dialog r2 = r2.A02()
            goto L_0x017a
        L_0x00f8:
            android.app.Activity r0 = r7.A05
            X.8ab r2 = X.DbS.A0X(r0)
            r0 = 2131972080(0x7f134ff0, float:1.9581157E38)
            r2.A08(r0)
            r1 = 2131972078(0x7f134fee, float:1.9581153E38)
            r0 = 0
            r2.A0H(r0, r1)
            r0 = 2131972079(0x7f134fef, float:1.9581155E38)
            r2.A0I(r6, r0)
            r0 = 2131972081(0x7f134ff1, float:1.958116E38)
        L_0x0114:
            r2.A09(r0)
        L_0x0117:
            android.app.Dialog r2 = r2.A02()
            goto L_0x017a
        L_0x011c:
            android.app.Activity r1 = r7.A05
            X.GcX r2 = new X.GcX
            r2.<init>(r1)
            r3 = 0
            r2.setCancelable(r3)
            r0 = 2131972639(0x7f13521f, float:1.9582291E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r1, r0)
            r0 = 2131436153(0x7f0b2279, float:1.8494168E38)
            android.view.View r0 = r2.findViewById(r0)
            X.0qQ.A07(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setVisibility(r3)
            r0.setText(r1)
            goto L_0x017a
        L_0x0141:
            android.app.Activity r1 = r7.A05
            r0 = 0
            X.6ST r2 = X.DbV.A0h(r1)
            r2.setCancelable(r0)
            r0 = 2131972638(0x7f13521e, float:1.958229E38)
            X.DbU.A18(r1, r2, r0)
            goto L_0x017a
        L_0x0152:
            android.app.Activity r1 = r7.A05
            r0 = 0
            X.6ST r2 = X.DbV.A0h(r1)
            r2.setCancelable(r0)
            r0 = 2131969783(0x7f1346f7, float:1.9576499E38)
            X.DbU.A18(r1, r2, r0)
            goto L_0x017a
        L_0x0163:
            android.app.Activity r1 = r7.A05
            r0 = 0
            X.6ST r2 = X.DbV.A0h(r1)
            r2.setCancelable(r0)
            r0 = 2131965491(0x7f133633, float:1.9567793E38)
            X.DbU.A18(r1, r2, r0)
            goto L_0x017a
        L_0x0174:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            android.app.Dialog r2 = r7.A01(r6, r0)
        L_0x017a:
            r7.A00 = r2
            r1 = 4
            X.LV8 r0 = new X.LV8
            r0.<init>(r7, r1)
            r2.setOnDismissListener(r0)
            X.AnonymousClass0fN.A00(r2)
            goto L_0x023a
        L_0x018a:
            java.lang.Integer r6 = X.AnonymousClass05K.A0C
            android.content.Context r0 = r7.A06
            com.instagram.common.session.UserSession r5 = r7.A08
            X.Dg1 r4 = new X.Dg1
            r4.<init>(r0, r5)
            android.app.Activity r3 = r7.A05
            r0 = 2131972524(0x7f1351ac, float:1.9582058E38)
            java.lang.String r1 = r3.getString(r0)
            r0 = 2131972523(0x7f1351ab, float:1.9582056E38)
            java.lang.String r0 = r3.getString(r0)
            r4.A0D(r1, r0)
            r2 = 2131958480(0x7f131ad0, float:1.9553573E38)
            r1 = 40
            X.LY8 r0 = new X.LY8
            r0.<init>(r1, r6, r7)
            r4.A03(r0, r2)
            r2 = 2131960802(0x7f1323e2, float:1.9558283E38)
            r1 = 61
            X.LY1 r0 = new X.LY1
            r0.<init>(r7, r1)
            r4.A04(r0, r2)
            r2 = 2131958479(0x7f131acf, float:1.9553571E38)
            X.LXn r1 = X.C64261LXn.A00
            goto L_0x0211
        L_0x01c8:
            java.lang.Integer r6 = X.AnonymousClass05K.A0C
            goto L_0x01cd
        L_0x01cb:
            java.lang.Integer r6 = X.AnonymousClass05K.A00
        L_0x01cd:
            android.content.Context r0 = r7.A06
            com.instagram.common.session.UserSession r5 = r7.A08
            X.Dg1 r4 = new X.Dg1
            r4.<init>(r0, r5)
            android.app.Activity r3 = r7.A05
            r0 = 2131974180(0x7f135824, float:1.9585417E38)
            java.lang.String r1 = r3.getString(r0)
            r0 = 2131974179(0x7f135823, float:1.9585415E38)
            java.lang.String r0 = r3.getString(r0)
            r4.A0D(r1, r0)
            r1 = 2132018633(0x7f1405c9, float:1.9675578E38)
            X.DfA r0 = r4.A04
            if (r0 == 0) goto L_0x01f2
            r0.A04 = r1
        L_0x01f2:
            r2 = 2131958481(0x7f131ad1, float:1.9553575E38)
            r1 = 59
            X.LY1 r0 = new X.LY1
            r0.<init>(r7, r1)
            r4.A02(r0, r2)
            r1 = 2131958480(0x7f131ad0, float:1.9553573E38)
            r0 = 39
            X.LY8.A01(r4, r6, r7, r0, r1)
            r2 = 2131958479(0x7f131acf, float:1.9553571E38)
            r0 = 60
            X.LY1 r1 = new X.LY1
            r1.<init>(r7, r0)
        L_0x0211:
            r4.A04(r1, r2)
            X.0rm r2 = X.C51965G9l.A11()
            r1 = 1
            X.Lro r0 = new X.Lro
            r0.<init>(r1, r2, r7)
            r4.A03 = r0
            boolean r0 = X.JWB.A01(r5)
            if (r0 == 0) goto L_0x022e
            X.2k4 r1 = X.AnonymousClass2k4.NIGHT
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r4.A02 = r1
        L_0x022e:
            X.FFy r0 = new X.FFy
            r0.<init>(r4)
            r2.A00 = r0
            r7.A01 = r0
            r0.A03(r3)
        L_0x023a:
            r7.A02 = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JWG.A04(android.content.DialogInterface$OnClickListener, X.JWG, java.lang.Integer):void");
    }

    public static final void A06(JWG jwg, Integer num) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw AnonymousClass7TE.A15("hideOnUiThread is not called on UI thread");
        } else if (jwg.A02 == num) {
            Dialog dialog = jwg.A00;
            if (dialog != null) {
                dialog.dismiss();
            }
            jwg.A00 = null;
            C49945FFy fFy = jwg.A01;
            if (fFy != null) {
                fFy.A02();
            }
            jwg.A01 = null;
            jwg.A02 = null;
        }
    }
}

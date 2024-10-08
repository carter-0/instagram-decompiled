package X;

import android.content.Context;
import android.content.res.Resources;
import android.widget.CompoundButton;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.ReelAutoArchiveSettingStr;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.LlP  reason: case insensitive filesystem */
public final class C64986LlP implements C66530MVi, 1wn {
    public static final C70944OSr A0H = new C70944OSr(true);
    public int A00;
    public int A01;
    public MS0 A02;
    public C363008it A03;
    public C63951LEt A04;
    public PR9 A05;
    public Integer A06;
    public boolean A07;
    public C62488Kgd A08;
    public final Context A09;
    public final Resources A0A;
    public final FragmentActivity A0B;
    public final UserSession A0C;
    public final EyG A0D;
    public final C47518E6c A0E;
    public final G7U A0F;
    public final List A0G = AnonymousClass7TE.A1C();

    public final void onResume() {
    }

    private void A00() {
        C62488Kgd kgd = this.A08;
        if (kgd == C62488Kgd.ALL_SETTINGS || kgd == C62488Kgd.CAMERA_SETTINGS) {
            List list = this.A0G;
            A05(this, list, 32, 2131971614, 1Au.A00(this.A0C).A1i());
            list.add(new FGF(2131971613));
        }
        UserSession userSession = this.A0C;
        if (!182.A06(0Tu.A05, userSession, 36319098153474968L)) {
            ReelAutoArchiveSettingStr BkX = DbV.A0k(userSession).BkX();
            if (BkX == null) {
                BkX = ReelAutoArchiveSettingStr.A07;
            }
            boolean A1a = C51969G9p.A1a(BkX, ReelAutoArchiveSettingStr.A04);
            List list2 = this.A0G;
            A05(this, list2, 31, 2131971612, A1a);
            A02(this.A09, 2131971611, list2);
        }
    }

    private void A01() {
        C47518E6c e6c = this.A0E;
        UserSession userSession = this.A0C;
        1OC A012 = 1NP.A01(userSession);
        C61500KAf.A00(A012, this, 49);
        e6c.schedule(A012);
        1NY A0M = DbZ.A0M(userSession);
        A0M.A0A("archive/live/live_archive_settings/");
        1OC A0S = DbU.A0S(A0M, C61286K0x.class, LHK.class);
        C61500KAf.A00(A0S, this, 50);
        e6c.schedule(A0S);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.C64986LlP r15) {
        /*
            java.util.List r6 = r15.A0G
            r6.clear()
            X.OSr r5 = A0H
            r6.add(r5)
            X.Kgd r1 = r15.A08
            X.Kgd r0 = X.C62488Kgd.AUTO_SAVE_SETTINGS_ONLY
            if (r1 != r0) goto L_0x0014
            r15.A00()
        L_0x0013:
            return
        L_0x0014:
            com.instagram.common.session.UserSession r4 = r15.A0C
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.0eE r7 = X.AnonymousClass0t1.A01
            X.4Cl r0 = X.DbX.A0m(r4)
            java.lang.Boolean r0 = r0.Cbw()
            if (r0 == 0) goto L_0x0052
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0052
            r3 = 2131973728(0x7f135660, float:1.95845E38)
            X.LEt r0 = r15.A04
            X.0eM r0 = r0.A01
            java.lang.Object r0 = X.Dba.A0W(r0)
            boolean r2 = X.AnonymousClass7TE.A1a(r0)
            r1 = 29
            X.LZJ r0 = new X.LZJ
            r0.<init>((X.C64986LlP) r15, (int) r1)
            X.PR9 r1 = new X.PR9
            r1.<init>((android.widget.CompoundButton.OnCheckedChangeListener) r0, (int) r3, (boolean) r2)
            r0 = 2131973729(0x7f135661, float:1.9584502E38)
            r1.A02 = r0
            r6.add(r1)
            r6.add(r5)
        L_0x0052:
            r0 = 2131971642(0x7f134e3a, float:1.958027E38)
            X.JTQ.A0t(r0, r6)
            r0 = 2131971640(0x7f134e38, float:1.9580265E38)
            X.JTQ.A0t(r0, r6)
            r0 = 43
            X.LY3 r10 = new X.LY3
            r10.<init>((java.lang.Object) r15, (int) r0)
            java.lang.Integer r1 = r15.A06
            java.lang.Integer r11 = X.AnonymousClass05K.A01
            r3 = 1
            if (r1 == r11) goto L_0x0321
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x031a
            android.content.Context r1 = r15.A09
            r0 = 2131968420(0x7f1341a4, float:1.9573734E38)
            java.lang.String r2 = r1.getString(r0)
        L_0x0079:
            android.content.Context r1 = r15.A09
            X.Fmc r0 = new X.Fmc
            r0.<init>((android.content.Context) r1, (android.view.View.OnClickListener) r10, (java.lang.CharSequence) r2)
        L_0x0080:
            r6.add(r0)
            android.content.Context r8 = r15.A09
            int r1 = X.AnonymousClass0Ke.A00(r8)
            r0 = 2011(0x7db, float:2.818E-42)
            if (r1 < r0) goto L_0x0093
            r0 = 2131971638(0x7f134e36, float:1.958026E38)
            A02(r8, r0, r6)
        L_0x0093:
            r0 = 2131971641(0x7f134e39, float:1.9580267E38)
            X.JTQ.A0t(r0, r6)
            r0 = 44
            X.LY3 r9 = new X.LY3
            r9.<init>((java.lang.Object) r15, (int) r0)
            java.lang.Integer r1 = r15.A06
            if (r1 == r11) goto L_0x0308
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x0308
            X.OAN r0 = new X.OAN
            r0.<init>(r10)
        L_0x00ad:
            r6.add(r0)
            r0 = 2131971637(0x7f134e35, float:1.9580259E38)
            A02(r8, r0, r6)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36310881881031008(0x81008e00000160, double:3.0264861415249823E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x011d
            r0 = 2131973426(0x7f135532, float:1.9583887E38)
            X.JTQ.A0t(r0, r6)
            X.1Av r0 = X.1Au.A00(r4)
            java.lang.String r1 = "reel"
            java.util.Set r0 = r0.A0I(r1)
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1D(r0)
            X.1Av r0 = X.1Au.A00(r4)
            boolean r10 = r0.A24(r1)
            if (r10 == 0) goto L_0x02ff
            android.content.res.Resources r12 = r15.A0A
            r9 = 2131820874(0x7f11014a, float:1.9274475E38)
            int r1 = r11.size()
            int r0 = r11.size()
            java.lang.Object[] r0 = X.AnonymousClass7TF.A1b(r0)
            java.lang.String r9 = r12.getQuantityString(r9, r1, r0)
        L_0x00f6:
            r0 = 6
            X.LXU r1 = new X.LXU
            r1.<init>(r0, r15, r11, r10)
            X.Fmc r0 = new X.Fmc
            r0.<init>((android.content.Context) r8, (android.view.View.OnClickListener) r1, (java.lang.CharSequence) r9)
            r6.add(r0)
            r0 = 2131974516(0x7f135974, float:1.9586098E38)
            A02(r8, r0, r6)
            if (r10 == 0) goto L_0x011d
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x011d
            androidx.fragment.app.FragmentActivity r1 = r15.A0B
            r0 = 60
            X.LV2 r0 = X.LV2.A00(r15, r0)
            X.C64025LJm.A00(r1, r0)
        L_0x011d:
            r6.add(r5)
            r0 = 2131971627(0x7f134e2b, float:1.9580239E38)
            X.JTQ.A0t(r0, r6)
            r0 = 2131971626(0x7f134e2a, float:1.9580237E38)
            X.JTQ.A0t(r0, r6)
            r0 = 2131971621(0x7f134e25, float:1.9580226E38)
            A02(r8, r0, r6)
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            java.lang.Integer r0 = X.JTS.A0e(r4)
            java.lang.Integer r10 = X.AnonymousClass05K.A0C
            java.lang.String r9 = "anyone"
            if (r0 != r10) goto L_0x02ee
            r0 = 2131971625(0x7f134e29, float:1.9580235E38)
            java.lang.String r0 = r8.getString(r0)
            X.DbV.A1V(r9, r0, r11)
            java.lang.String r1 = "following"
            r0 = 2131971624(0x7f134e28, float:1.9580233E38)
        L_0x014f:
            java.lang.String r0 = r8.getString(r0)
            X.DbV.A1V(r1, r0, r11)
            java.lang.String r1 = "off"
            r0 = 2131968751(0x7f1342ef, float:1.9574405E38)
            java.lang.String r0 = r8.getString(r0)
            X.DbV.A1V(r1, r0, r11)
            X.1Av r12 = X.1Au.A00(r4)
            r0 = 754(0x2f2, float:1.057E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            X.0xa r0 = r12.A01
            java.lang.String r9 = r0.getString(r1, r9)
            X.0qQ.A07(r9)
            r0 = 6
            X.FQU r1 = new X.FQU
            r1.<init>(r15, r0)
            X.OTj r0 = new X.OTj
            r0.<init>(r1, r9, r11)
            r6.add(r0)
            r6.add(r5)
            r0 = 36318247749949468(0x8107410000181c, double:3.03114434668899E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 != 0) goto L_0x019c
            r0 = 36320313629810920(0x810922000920e8, double:3.0324508174320026E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x01c1
        L_0x019c:
            r0 = 2131974395(0x7f1358fb, float:1.9585853E38)
            X.JTQ.A0t(r0, r6)
            r0 = 2131971615(0x7f134e1f, float:1.9580214E38)
            java.lang.String r9 = r8.getString(r0)
            r0 = 45
            X.LY3 r1 = new X.LY3
            r1.<init>((java.lang.Object) r15, (int) r0)
            X.Fmc r0 = new X.Fmc
            r0.<init>((android.content.Context) r8, (android.view.View.OnClickListener) r1, (java.lang.CharSequence) r9)
            r6.add(r0)
            r0 = 2131971616(0x7f134e20, float:1.9580216E38)
            A02(r8, r0, r6)
            r6.add(r5)
        L_0x01c1:
            r15.A00()
            r6.add(r5)
            int r9 = r6.size()
            java.lang.Integer r0 = X.JTS.A0e(r4)
            if (r0 != r10) goto L_0x01e7
            r11 = 2131971629(0x7f134e2d, float:1.9580243E38)
            X.1Av r0 = X.1Au.A00(r4)
            boolean r1 = r0.A1h()
            r0 = 27
            A05(r15, r6, r0, r11, r1)
            r0 = 2131971628(0x7f134e2c, float:1.958024E38)
            A02(r8, r0, r6)
        L_0x01e7:
            X.EyG r14 = r15.A0D
            com.instagram.common.session.UserSession r13 = r14.A01
            java.lang.Integer r0 = X.JTQ.A0R(r13, r7)
            if (r0 == r10) goto L_0x0226
            boolean r0 = X.C321616uT.A00(r13)
            if (r0 != 0) goto L_0x0226
            r12 = 2131952911(0x7f13050f, float:1.9542278E38)
            com.instagram.user.model.User r0 = r7.A01(r13)
            boolean r0 = r0.A27()
            r11 = r0 ^ 1
            r0 = 22
            X.FQO r1 = new X.FQO
            r1.<init>(r14, r0)
            X.PR9 r0 = new X.PR9
            r0.<init>((android.widget.CompoundButton.OnCheckedChangeListener) r1, (int) r12, (boolean) r11)
            r6.add(r0)
            com.instagram.user.model.User r0 = r7.A01(r13)
            boolean r1 = r0.A1j()
            r0 = 2131952899(0x7f130503, float:1.9542254E38)
            if (r1 == 0) goto L_0x0223
            r0 = 2131952900(0x7f130504, float:1.9542256E38)
        L_0x0223:
            A02(r8, r0, r6)
        L_0x0226:
            boolean r0 = X.C321616uT.A00(r4)
            if (r0 != 0) goto L_0x0251
            r12 = 2131971610(0x7f134e1a, float:1.9580204E38)
            X.1Av r11 = X.1Au.A00(r4)
            X.0s0 r7 = r11.A0D
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 64
            boolean r1 = X.AnonymousClass7TG.A1a(r11, r7, r1, r0)
            r0 = 30
            A05(r15, r6, r0, r12, r1)
            java.lang.Integer r1 = X.JTS.A0e(r4)
            r0 = 2131971632(0x7f134e30, float:1.9580249E38)
            if (r1 != r10) goto L_0x024e
            r0 = 2131971631(0x7f134e2f, float:1.9580247E38)
        L_0x024e:
            A02(r8, r0, r6)
        L_0x0251:
            boolean r0 = X.C46508DgB.A00(r4)
            r11 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x028d
            r10 = 2131974356(0x7f1358d4, float:1.9585774E38)
            boolean r0 = X.AnonymousClass8PU.A07(r4)
            if (r0 == 0) goto L_0x02ec
            boolean r0 = X.AnonymousClass8PU.A03(r4)
            if (r0 == 0) goto L_0x02ec
            boolean r0 = X.C363018iu.A00(r4)
            if (r0 == 0) goto L_0x02ec
        L_0x026f:
            r0 = 26
            X.LZJ r7 = new X.LZJ
            r7.<init>((X.C64986LlP) r15, (int) r0)
            r0 = 41
            X.LsA r1 = new X.LsA
            r1.<init>(r15, r0)
            X.PR9 r0 = new X.PR9
            r0.<init>((android.widget.CompoundButton.OnCheckedChangeListener) r7, (X.C358618bC) r1, (int) r10, (boolean) r11)
            r15.A05 = r0
            r6.add(r0)
            r0 = 2131971634(0x7f134e32, float:1.9580253E38)
            A02(r8, r0, r6)
        L_0x028d:
            com.facebook.common.callercontext.CallerContext r0 = X.AnonymousClass8PU.A00
            int r0 = X.DbT.A02(r6, r9)
            if (r0 <= 0) goto L_0x02a8
            int r7 = X.DbT.A02(r6, r0)
            r0 = 2131971633(0x7f134e31, float:1.958025E38)
            java.lang.String r1 = r8.getString(r0)
            X.DfA r0 = new X.DfA
            r0.<init>((java.lang.CharSequence) r1)
            r6.add(r7, r0)
        L_0x02a8:
            r0 = 36311311377760759(0x8100f2000001f7, double:3.0267577569863214E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x02d8
            r6.add(r5)
            r0 = 2131971639(0x7f134e37, float:1.9580263E38)
            X.JTQ.A0t(r0, r6)
            r5 = 2131974366(0x7f1358de, float:1.9585794E38)
            X.1Av r4 = X.1Au.A00(r4)
            X.0s0 r2 = r4.A7n
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 29
            boolean r1 = X.AnonymousClass7TG.A1a(r4, r2, r1, r0)
            r0 = 28
            A05(r15, r6, r0, r5, r1)
            r0 = 2131974367(0x7f1358df, float:1.9585796E38)
            A02(r8, r0, r6)
        L_0x02d8:
            int r0 = X.DbT.A02(r6, r3)
            java.lang.Object r0 = r6.get(r0)
            boolean r0 = r0 instanceof X.C70944OSr
            if (r0 == 0) goto L_0x0013
            int r0 = X.DbT.A02(r6, r3)
            r6.remove(r0)
            return
        L_0x02ec:
            r11 = 0
            goto L_0x026f
        L_0x02ee:
            r0 = 2131971622(0x7f134e26, float:1.9580229E38)
            java.lang.String r0 = r8.getString(r0)
            X.DbV.A1V(r9, r0, r11)
            java.lang.String r1 = "following"
            r0 = 2131971623(0x7f134e27, float:1.958023E38)
            goto L_0x014f
        L_0x02ff:
            r0 = 2131973425(0x7f135531, float:1.9583885E38)
            java.lang.String r9 = r8.getString(r0)
            goto L_0x00f6
        L_0x0308:
            android.content.res.Resources r2 = r15.A0A
            r1 = 2131821028(0x7f1101e4, float:1.9274788E38)
            int r0 = r15.A01
            java.lang.String r1 = X.DbY.A0d(r2, r0, r1)
            X.Fmc r0 = new X.Fmc
            r0.<init>((android.content.Context) r8, (android.view.View.OnClickListener) r9, (java.lang.CharSequence) r1)
            goto L_0x00ad
        L_0x031a:
            X.OAN r0 = new X.OAN
            r0.<init>(r10)
            goto L_0x0080
        L_0x0321:
            android.content.res.Resources r2 = r15.A0A
            r1 = 2131821028(0x7f1101e4, float:1.9274788E38)
            int r0 = r15.A00
            java.lang.String r2 = X.DbY.A0d(r2, r0, r1)
            goto L_0x0079
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64986LlP.A03(X.LlP):void");
    }

    public static void A05(C64986LlP llP, List list, int i, int i2, boolean z) {
        list.add(new PR9((CompoundButton.OnCheckedChangeListener) new LZJ(llP, i), i2, z));
    }

    public final List BRl() {
        return this.A0G;
    }

    public final int C7q() {
        if (this.A08 == C62488Kgd.AUTO_SAVE_SETTINGS_ONLY) {
            return 2131973150;
        }
        return 2131974515;
    }

    public final boolean Esz() {
        return C51969G9p.A1a(this.A08, C62488Kgd.CAMERA_SETTINGS);
    }

    public final String getModuleName() {
        int ordinal = this.A08.ordinal();
        if (ordinal == 0) {
            return C273654mx.A00(3240);
        }
        if (ordinal == 1) {
            return "reel_auto_save_settings";
        }
        if (ordinal == 2) {
            return "stories_camera_settings";
        }
        throw AnonymousClass7TE.A0w("invalid_settings_module_name");
    }

    public final void onDestroy() {
        AnonymousClass1Nd.A00(this.A0C).A02(this, FWB.class);
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [X.07Z, X.E6c, androidx.fragment.app.Fragment, X.4D6] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C64986LlP(android.content.Context r4, android.content.res.Resources r5, androidx.fragment.app.FragmentActivity r6, com.instagram.common.session.UserSession r7, X.C62488Kgd r8, X.C47518E6c r9) {
        /*
            r3 = this;
            r3.<init>()
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r3.A0G = r0
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            r3.A06 = r2
            r3.A0C = r7
            r3.A0B = r6
            r3.A0E = r9
            r3.A09 = r4
            r3.A0A = r5
            r3.A08 = r8
            android.os.Bundle r1 = r9.requireArguments()
            r0 = 2474(0x9aa, float:3.467E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = X.DbT.A1X(r1, r0)
            r3.A07 = r0
            X.EyG r0 = new X.EyG
            r0.<init>(r9, r9)
            r3.A0D = r0
            r1 = 3
            X.M1D r0 = new X.M1D
            r0.<init>(r3, r1)
            r3.A0F = r0
            X.Lx9 r0 = new X.Lx9
            r0.<init>(r3, r1)
            X.8it r0 = X.LJr.A01(r7, r0)
            r3.A03 = r0
            r3.A06 = r2
            X.3kF r0 = X.C249713kF.A00
            X.LEt r0 = r0.A0V(r7)
            r3.A04 = r0
            X.0eM r0 = r0.A01
            java.lang.Object r2 = r0.getValue()
            X.2Fk r2 = (X.2Fk) r2
            r1 = 27
            X.LZr r0 = new X.LZr
            r0.<init>(r3, r1)
            r2.A06(r9, r0)
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r7)
            java.lang.Class<X.FWB> r0 = X.FWB.class
            r1.A01(r3, r0)
            A03(r3)
            r3.A01()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64986LlP.<init>(android.content.Context, android.content.res.Resources, androidx.fragment.app.FragmentActivity, com.instagram.common.session.UserSession, X.Kgd, X.E6c):void");
    }

    public static void A02(Context context, int i, List list) {
        list.add(new FGF((CharSequence) context.getString(i)));
    }

    public static /* synthetic */ void A04(C64986LlP llP) {
        A03(llP);
        MS0 ms0 = llP.A02;
        if (ms0 != null) {
            ms0.DRL();
        }
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A032 = AnonymousClass0fD.A03(-703158351);
        int A033 = AnonymousClass0fD.A03(2006578268);
        if (!this.A0E.mDetached) {
            A01();
        }
        AnonymousClass0fD.A0A(583575315, A033);
        AnonymousClass0fD.A0A(-119828334, A032);
    }

    public final void EiE(MS0 ms0) {
        this.A02 = ms0;
    }
}

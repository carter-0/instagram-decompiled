package X;

import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.EDa  reason: case insensitive filesystem */
public final class C47691EDa extends 1P0 {
    public final int A00;
    public final Object A01;

    public C47691EDa(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(AnonymousClass4DH r1, 1OC r2, int i) {
        r2.A00 = new C47691EDa(r1, i);
        r1.schedule(r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0369, code lost:
        r1 = (X.1XP) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x043e, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0445, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x066a, code lost:
        X.AnonymousClass0fD.A0A(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x066d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0091, code lost:
        if (r4 != null) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0185, code lost:
        if (r3.length() != 0) goto L_0x0198;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFail(X.C268654dm r11) {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x0626;
                case 1: goto L_0x0604;
                case 2: goto L_0x056d;
                case 3: goto L_0x0551;
                case 4: goto L_0x0505;
                case 5: goto L_0x0005;
                case 6: goto L_0x04d2;
                case 7: goto L_0x04b5;
                case 8: goto L_0x0497;
                case 9: goto L_0x0005;
                case 10: goto L_0x0479;
                case 11: goto L_0x045b;
                case 12: goto L_0x042d;
                case 13: goto L_0x0414;
                case 14: goto L_0x0005;
                case 15: goto L_0x03cb;
                case 16: goto L_0x0657;
                case 17: goto L_0x0643;
                case 18: goto L_0x03b0;
                case 19: goto L_0x0395;
                case 20: goto L_0x0350;
                case 21: goto L_0x0638;
                case 22: goto L_0x0332;
                case 23: goto L_0x0005;
                case 24: goto L_0x0323;
                case 25: goto L_0x02e6;
                case 26: goto L_0x02cf;
                case 27: goto L_0x02ae;
                case 28: goto L_0x0284;
                case 29: goto L_0x026b;
                case 30: goto L_0x0233;
                case 31: goto L_0x0218;
                case 32: goto L_0x01d6;
                case 33: goto L_0x0148;
                case 34: goto L_0x0129;
                case 35: goto L_0x00f1;
                case 36: goto L_0x004a;
                case 37: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.C47691EDa.super.onFail(r11)
            return
        L_0x0009:
            r0 = 412581035(0x18977cab, float:3.9158468E-24)
            int r5 = X.AnonymousClass0fD.A03(r0)
            r3 = 0
            X.0qQ.A0B(r11, r3)
            X.2dY r1 = X.2dZ.A0t
            java.lang.Object r0 = r10.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.DbY.A17(r0, r1, r3)
            boolean r0 = r11 instanceof X.C268674do
            if (r0 == 0) goto L_0x0045
            X.4do r11 = (X.C268674do) r11
            java.lang.Object r2 = r11.A00
            X.1XP r2 = (X.1XP) r2
            r1 = 1
            if (r2 == 0) goto L_0x0045
            java.util.List r0 = r2.mErrorStrings
            if (r0 == 0) goto L_0x0045
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 != r1) goto L_0x0045
            java.util.List r0 = r2.mErrorStrings
            if (r0 == 0) goto L_0x0045
            java.lang.String r2 = X.AnonymousClass7TE.A19(r0, r3)
            if (r2 == 0) goto L_0x0045
            android.content.Context r1 = X.C60960kU.A00
            java.lang.String r0 = "save_user_profile_failed"
            X.C59689JTv.A03(r1, r2, r0, r3)
        L_0x0045:
            r0 = -144795997(0xfffffffff75e96a3, float:-4.5146296E33)
            goto L_0x066a
        L_0x004a:
            r0 = 1409678641(0x5405fd31, float:2.30191399E12)
            int r5 = X.AnonymousClass0fD.A03(r0)
            r7 = 0
            X.0qQ.A0B(r11, r7)
            X.C47691EDa.super.onFail(r11)
            X.2dY r0 = X.2dZ.A0t
            java.lang.Object r8 = r10.A01
            X.E38 r8 = (X.E38) r8
            X.2dZ r0 = X.DbU.A0L(r8, r0)
            r0.setIsLoading(r7)
            java.lang.Object r6 = r11.A00()
            r3 = r6
            X.1XP r3 = (X.1XP) r3
            r2 = 0
            if (r3 == 0) goto L_0x007f
            java.util.List r1 = r3.mErrorStrings
            if (r1 == 0) goto L_0x007f
            boolean r0 = X.AnonymousClass7TE.A1b(r1)
            if (r0 == 0) goto L_0x007f
            java.lang.Object r4 = r1.get(r7)
            if (r4 != 0) goto L_0x009a
        L_0x007f:
            X.CFz r6 = (X.C43859CFz) r6
            if (r6 == 0) goto L_0x0093
            java.util.List r1 = r6.A01
            if (r1 == 0) goto L_0x00ed
            boolean r0 = X.AnonymousClass7TE.A1b(r1)
            if (r0 == 0) goto L_0x0093
            java.lang.Object r4 = r1.get(r7)
            if (r4 != 0) goto L_0x009a
        L_0x0093:
            if (r3 == 0) goto L_0x0099
            java.lang.String r2 = r3.getErrorMessage()
        L_0x0099:
            r4 = r2
        L_0x009a:
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x00a7
            android.content.Context r1 = r8.requireContext()
            java.lang.String r0 = "edit_fullname_failed"
            X.C59689JTv.A03(r1, r4, r0, r7)
        L_0x00a7:
            X.6ve r9 = r8.A04
            if (r9 == 0) goto L_0x00c2
            long r0 = r9.A02
            r6 = 0
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x00c2
            X.C322326ve.A01(r3, r9, r0)
            r0 = 1
            r9.A04 = r0
            com.facebook.quicklog.reliability.UserFlowLoggerImpl r3 = r9.A0A
            long r1 = r9.A02
            java.lang.String r0 = "name_change_error"
            r3.flowMarkPoint(r1, r0)
        L_0x00c2:
            X.6ve r1 = r8.A04
            if (r1 == 0) goto L_0x00d5
            long r2 = r1.A02
            r6 = 0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x00d5
            com.facebook.quicklog.reliability.UserFlowLoggerImpl r1 = r1.A0A
            java.lang.String r0 = "failure_reason"
            r1.flowAnnotate(r2, r0, r4)
        L_0x00d5:
            X.0eM r0 = r8.A0G
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.F3s r1 = X.C49061Eof.A00(r0)
            X.EWT r0 = X.EWT.EDIT_NAME_FLOW
            if (r4 != 0) goto L_0x00e5
            java.lang.String r4 = ""
        L_0x00e5:
            r1.A04(r0, r4)
            r0 = -1645876281(0xffffffff9de5ebc7, float:-6.0859583E-21)
            goto L_0x066a
        L_0x00ed:
            java.lang.String r0 = "message"
            goto L_0x043e
        L_0x00f1:
            r0 = -18792076(0xfffffffffee14174, float:-1.4970808E38)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r10.A01
            X.E38 r2 = (X.E38) r2
            boolean r0 = r2.isResumed()
            if (r0 == 0) goto L_0x0117
            X.2dY r1 = X.2dZ.A0t
            androidx.fragment.app.FragmentActivity r0 = r2.getActivity()
            X.2dZ r0 = r1.A03(r0)
            r1 = 0
            r0.setIsLoading(r1)
            com.instagram.actionbar.ActionButton r0 = r2.A00
            if (r0 == 0) goto L_0x0117
            r0.setVisibility(r1)
        L_0x0117:
            android.content.Context r3 = r2.getContext()
            r2 = 2131972232(0x7f135088, float:1.9581466E38)
            r1 = 1
            java.lang.String r0 = "fetch_user_failed"
            X.C59689JTv.A01(r3, r0, r2, r1)
            r0 = -157516337(0xfffffffff69c7dcf, float:-1.5870117E33)
            goto L_0x066a
        L_0x0129:
            r0 = -1050553619(0xffffffffc161d2ed, float:-14.113996)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r10.A01
            X.FPH r0 = (X.FPH) r0
            java.lang.Object r0 = r0.A01
            android.content.Context r3 = X.DbT.A07(r0)
            r2 = 2131972232(0x7f135088, float:1.9581466E38)
            r1 = 1
            java.lang.String r0 = "check_age_verification_upsell_eligibility_failed"
            X.C59689JTv.A01(r3, r0, r2, r1)
            r0 = 1509770580(0x59fd4554, float:8.9111745E15)
            goto L_0x066a
        L_0x0148:
            r0 = -1700772435(0xffffffff9aa045ad, float:-6.6287016E-23)
            int r5 = X.AnonymousClass0fD.A03(r0)
            r4 = 0
            X.0qQ.A0B(r11, r4)
            boolean r0 = r11 instanceof X.C268674do
            if (r0 == 0) goto L_0x0187
            r0 = r11
            X.4do r0 = (X.C268674do) r0
            java.lang.Object r1 = r0.A00
            r0 = r1
            X.Dvm r0 = (X.C47352Dvm) r0
            java.util.List r2 = r0.A01
            if (r2 == 0) goto L_0x0179
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0179
            java.lang.Object r1 = r10.A01
            X.FGB r1 = (X.FGB) r1
            com.instagram.user.model.User r0 = X.DbS.A0g(r2, r4)
            X.FGB.A02(r1, r0)
            r0 = -1556881526(0xffffffffa333df8a, float:-9.750946E-18)
            goto L_0x066a
        L_0x0179:
            X.1XP r1 = (X.1XP) r1
            java.lang.String r3 = r1.getErrorMessage()
            if (r3 == 0) goto L_0x0187
            int r0 = r3.length()
            if (r0 != 0) goto L_0x0198
        L_0x0187:
            java.lang.Object r0 = r10.A01
            X.FGB r0 = (X.FGB) r0
            X.4DH r0 = r0.A09
            android.content.res.Resources r1 = X.DbV.A05(r0)
            r0 = 2131974093(0x7f1357cd, float:1.958524E38)
            java.lang.String r3 = r1.getString(r0)
        L_0x0198:
            java.lang.Object r2 = r10.A01
            X.FGB r2 = (X.FGB) r2
            X.4DH r0 = r2.A09
            androidx.fragment.app.FragmentActivity r1 = r0.getActivity()
            java.lang.String r0 = "save_bio_failed"
            X.C59689JTv.A03(r1, r3, r0, r4)
            com.instagram.common.session.UserSession r0 = r2.A0D
            X.F3s r1 = X.C49061Eof.A00(r0)
            X.EWT r0 = X.EWT.EDIT_BIO_FLOW
            r1.A04(r0, r3)
            X.6ve r7 = r2.A01
            java.lang.Object r6 = r11.A00()
            X.1XP r6 = (X.1XP) r6
            long r3 = r7.A02
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x01d1
            X.C322326ve.A01(r6, r7, r3)
            r0 = 1
            r7.A03 = r0
            com.facebook.quicklog.reliability.UserFlowLoggerImpl r3 = r7.A0A
            long r1 = r7.A02
            java.lang.String r0 = "bio_save_error"
            r3.flowMarkPoint(r1, r0)
        L_0x01d1:
            r0 = 1311094826(0x4e25b82a, float:6.950775E8)
            goto L_0x066a
        L_0x01d6:
            r0 = 901111936(0x35b5e080, float:1.3550889E-6)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r4 = r10.A01
            X.E71 r4 = (X.E71) r4
            boolean r0 = r4.isResumed()
            if (r0 == 0) goto L_0x01fc
            X.2dY r1 = X.2dZ.A0t
            androidx.fragment.app.FragmentActivity r0 = r4.getActivity()
            X.2dZ r0 = r1.A03(r0)
            r1 = 0
            r0.setIsLoading(r1)
            com.instagram.actionbar.ActionButton r0 = r4.A08
            if (r0 == 0) goto L_0x01fc
            r0.setVisibility(r1)
        L_0x01fc:
            android.content.Context r3 = r4.getContext()
            r2 = 2131972232(0x7f135088, float:1.9581466E38)
            r1 = 1
            java.lang.String r0 = "fetch_user_for_editing_failed"
            X.C59689JTv.A01(r3, r0, r2, r1)
            android.view.View r1 = r4.mView
            if (r1 == 0) goto L_0x0213
            r0 = 2131435641(0x7f0b2079, float:1.849313E38)
            X.DbX.A1B(r1, r0)
        L_0x0213:
            r0 = -1235376717(0xffffffffb65da5b3, float:-3.3028016E-6)
            goto L_0x066a
        L_0x0218:
            r0 = 668006412(0x27d0f80c, float:5.800053E-15)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r10.A01
            android.content.Context r3 = X.DbT.A07(r0)
            r2 = 2131972232(0x7f135088, float:1.9581466E38)
            r1 = 1
            java.lang.String r0 = "create_account_category_failed"
            X.C59689JTv.A01(r3, r0, r2, r1)
            r0 = 552812391(0x20f33f67, float:4.1207757E-19)
            goto L_0x066a
        L_0x0233:
            r0 = -1564769491(0xffffffffa2bb832d, float:-5.082534E-18)
            int r5 = X.AnonymousClass7TG.A0D(r11, r0)
            X.C47691EDa.super.onFail(r11)
            java.lang.Object r2 = r10.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            java.lang.String r3 = X.DbZ.A0j(r2)
            boolean r0 = r11 instanceof X.C268674do
            if (r0 == 0) goto L_0x025c
            X.4do r11 = (X.C268674do) r11
            java.lang.Object r0 = r11.A00
            X.1XT r0 = (X.AnonymousClass1XT) r0
            java.lang.String r1 = r0.getErrorMessage()
            if (r1 == 0) goto L_0x025c
            int r0 = r1.length()
            if (r0 == 0) goto L_0x025c
            r3 = r1
        L_0x025c:
            androidx.fragment.app.FragmentActivity r2 = r2.getActivity()
            java.lang.String r1 = "get_account_category_failed"
            r0 = 1
            X.C59689JTv.A03(r2, r3, r1, r0)
            r0 = -885923571(0xffffffffcb31e10d, float:-1.1657485E7)
            goto L_0x066a
        L_0x026b:
            r0 = -1684119966(0xffffffff9b9e5e62, float:-2.61999E-22)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.C47691EDa.super.onFail(r11)
            java.lang.Object r1 = r10.A01
            X.E5f r1 = (X.C47500E5f) r1
            r0 = 2131975552(0x7f135d80, float:1.95882E38)
            r1.A02(r0)
            r0 = -887942220(0xffffffffcb1313b4, float:-9638836.0)
            goto L_0x066a
        L_0x0284:
            r0 = 723462497(0x2b1f2961, float:5.654557E-13)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.C47691EDa.super.onFail(r11)
            java.lang.Object r0 = r10.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.8ab r2 = X.Dba.A0I(r0)
            r0 = 2131964330(0x7f1331aa, float:1.9565439E38)
            r2.A09(r0)
            r0 = 2131964329(0x7f1331a9, float:1.9565437E38)
            r2.A08(r0)
            r1 = 2131960862(0x7f13241e, float:1.9558405E38)
            r0 = 0
            X.Dba.A0t(r0, r2, r1)
            r0 = 1450239654(0x5670e6a6, float:6.6218355E13)
            goto L_0x066a
        L_0x02ae:
            r0 = 2020861158(0x7873e4e6, float:1.9787043E34)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.C47691EDa.super.onFail(r11)
            java.lang.String r1 = "FxSettingsPersonalDetailsShouldShowInAcResponse"
            r0 = 446(0x1be, float:6.25E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0wb.A03(r1, r0)
            java.lang.Object r0 = r10.A01
            X.Dib r0 = (X.C46656Dib) r0
            X.C46656Dib.A0A(r0)
            r0 = 1166308092(0x458472fc, float:4238.373)
            goto L_0x066a
        L_0x02cf:
            r0 = 1596205383(0x5f242947, float:1.1829064E19)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r10.A01
            X.FPC r0 = (X.FPC) r0
            java.lang.Object r0 = r0.A01
            X.Dib r0 = (X.C46656Dib) r0
            X.C46656Dib.A0H(r0)
            r0 = 659619865(0x27510019, float:2.900463E-15)
            goto L_0x066a
        L_0x02e6:
            r0 = -1591481307(0xffffffffa123ec25, float:-5.5539083E-19)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r4 = r10.A01
            X.Dib r4 = (X.C46656Dib) r4
            boolean r0 = r4.isResumed()
            if (r0 == 0) goto L_0x0307
            X.2dZ r0 = X.Dba.A0A(r4)
            r1 = 0
            r0.setIsLoading(r1)
            com.instagram.actionbar.ActionButton r0 = r4.A0N
            r0.getClass()
            r0.setVisibility(r1)
        L_0x0307:
            android.content.Context r3 = r4.getContext()
            r2 = 2131972232(0x7f135088, float:1.9581466E38)
            r1 = 1
            java.lang.String r0 = "fetch_user_for_editing_failed"
            X.C59689JTv.A01(r3, r0, r2, r1)
            android.view.View r1 = r4.mView
            if (r1 == 0) goto L_0x031e
            r0 = 2131435641(0x7f0b2079, float:1.849313E38)
            X.DbX.A1B(r1, r0)
        L_0x031e:
            r0 = 82812856(0x4ef9fb8, float:5.633531E-36)
            goto L_0x066a
        L_0x0323:
            r0 = 1349875819(0x5075786b, float:1.64732385E10)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.C47691EDa.super.onFail(r11)
            r0 = 1052991240(0x3ec35f08, float:0.3815844)
            goto L_0x066a
        L_0x0332:
            r0 = 94060764(0x59b40dc, float:1.4599956E-35)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.C47691EDa.super.onFail(r11)
            java.lang.Object r0 = r10.A01
            android.content.Context r3 = X.DbT.A08(r0)
            r2 = 2131962217(0x7f132969, float:1.9561153E38)
            r1 = 1
            java.lang.String r0 = "fetch_featured_account_error"
            X.C59689JTv.A01(r3, r0, r2, r1)
            r0 = -1870821795(0xffffffff907d865d, float:-4.9998962E-29)
            goto L_0x066a
        L_0x0350:
            r0 = -914883810(0xffffffffc977fb1e, float:-1015729.9)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r4 = r10.A01
            com.instagram.profile.edit.fragment.CompleteYourProfileFragment r4 = (com.instagram.profile.edit.fragment.CompleteYourProfileFragment) r4
            r0 = 2131974093(0x7f1357cd, float:1.958524E38)
            java.lang.String r3 = r4.getString(r0)
            java.lang.Object r1 = r11.A00()
            r2 = 0
            if (r1 == 0) goto L_0x037b
            X.1XP r1 = (X.1XP) r1
            java.util.List r0 = r1.mErrorStrings
            if (r0 == 0) goto L_0x037b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x037b
            java.util.List r0 = r1.mErrorStrings
            java.lang.String r3 = X.DbU.A0t(r0, r2)
        L_0x037b:
            com.instagram.profile.edit.fragment.CompleteYourProfileFragment.A03(r4, r3)
            androidx.fragment.app.FragmentActivity r1 = r4.getActivity()
            if (r1 == 0) goto L_0x0390
            X.2dZ r0 = X.DbT.A0K(r1)
            r0.setIsLoading(r2)
            java.lang.String r0 = "save_failed"
            X.C59689JTv.A03(r1, r3, r0, r2)
        L_0x0390:
            r0 = 915992119(0x3698ee37, float:4.557685E-6)
            goto L_0x066a
        L_0x0395:
            r0 = -1629091046(0xffffffff9ee60b1a, float:-2.4356789E-20)
            int r5 = X.AnonymousClass7TG.A0D(r11, r0)
            X.C47691EDa.super.onFail(r11)
            java.lang.Object r1 = r10.A01
            com.instagram.profile.edit.controller.editcontrollerbarcelona.EditProfileBarcelonaController r1 = (com.instagram.profile.edit.controller.editcontrollerbarcelona.EditProfileBarcelonaController) r1
            com.instagram.user.model.User r0 = r1.A04
            boolean r0 = r0.A1i()
            r1.A00 = r0
            r0 = -1068767549(0xffffffffc04be6c3, float:-3.1859596)
            goto L_0x066a
        L_0x03b0:
            r0 = 602334496(0x23e6e520, float:2.5033688E-17)
            int r5 = X.AnonymousClass7TG.A0D(r11, r0)
            X.C47691EDa.super.onFail(r11)
            java.lang.Object r1 = r10.A01
            com.instagram.profile.edit.controller.editcontrollerbarcelona.EditProfileBarcelonaController r1 = (com.instagram.profile.edit.controller.editcontrollerbarcelona.EditProfileBarcelonaController) r1
            com.instagram.user.model.User r0 = r1.A04
            boolean r0 = r0.A1i()
            r1.A00 = r0
            r0 = -1742242924(0xffffffff98277b94, float:-2.1646635E-24)
            goto L_0x066a
        L_0x03cb:
            r0 = 1599053918(0x5f4fa05e, float:1.4961061E19)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.C47691EDa.super.onFail(r11)
            java.lang.String r7 = X.C319126q5.A00(r11)
            java.lang.Object r1 = r10.A01
            X.E3g r1 = (X.C47459E3g) r1
            java.lang.String r0 = X.DbZ.A0j(r1)
            java.lang.String r6 = X.C319126q5.A03(r11, r0)
            X.0wW r4 = r1.A01
            java.lang.String r3 = "sign_up_with_biz_option"
            java.lang.String r2 = r1.A04
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            X.0xI r1 = X.C48730EjF.A00(r0)
            java.lang.String r0 = "step"
            r1.A0C(r0, r3)
            java.lang.String r0 = "entry_point"
            r1.A0C(r0, r2)
            java.lang.String r0 = "error_identifier"
            r1.A0C(r0, r7)
            java.lang.String r0 = "error_message"
            r1.A0C(r0, r6)
            if (r4 == 0) goto L_0x040f
            X.DbU.A1R(r1, r4)
            r0 = -1716122988(0xffffffff99b60a94, float:-1.8822631E-23)
            goto L_0x066a
        L_0x040f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0414:
            r0 = -572946572(0xffffffffddd98774, float:-1.95932807E18)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r10.A01
            X.E54 r1 = (X.E54) r1
            java.lang.String r0 = X.E54.A0X
            android.view.View r1 = r1.A02
            r0 = 8
            r1.setVisibility(r0)
            r0 = 778550534(0x2e67bd06, float:5.2691206E-11)
            goto L_0x066a
        L_0x042d:
            r0 = -1547089161(0xffffffffa3c94af7, float:-2.1824213E-17)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r10.A01
            X.E2t r0 = (X.C47447E2t) r0
            X.DmO r3 = r0.A02
            if (r3 != 0) goto L_0x0446
            java.lang.String r0 = "interestAdapter"
        L_0x043e:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0446:
            r2 = 1
            boolean r0 = r3.A04
            if (r0 == 0) goto L_0x0454
            X.E2t r1 = r3.A0A
            r0 = 0
            r1.A02(r0)
            r3.notifyDataSetChanged()
        L_0x0454:
            r3.A07 = r2
            r0 = 1076195366(0x40257026, float:2.58497)
            goto L_0x066a
        L_0x045b:
            r0 = -1197996876(0xffffffffb89804b4, float:-7.248801E-5)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r10.A01
            X.E2t r1 = (X.C47447E2t) r1
            r0 = 0
            r1.A02(r0)
            android.content.Context r1 = r1.getContext()
            r0 = 2131975944(0x7f135f08, float:1.9588995E38)
            X.C59689JTv.A07(r1, r0)
            r0 = 1732556975(0x6744b8af, float:9.2899064E23)
            goto L_0x066a
        L_0x0479:
            r0 = -1527560728(0xffffffffa4f345e8, float:-1.0550288E-16)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r10.A01
            X.E2t r1 = (X.C47447E2t) r1
            r0 = 0
            r1.A02(r0)
            android.content.Context r1 = r1.getContext()
            r0 = 2131975944(0x7f135f08, float:1.9588995E38)
            X.C59689JTv.A07(r1, r0)
            r0 = 1789574264(0x6aaabc78, float:1.032037E26)
            goto L_0x066a
        L_0x0497:
            r0 = 1356773274(0x50deb79a, float:2.98925957E10)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r10.A01
            X.E23 r1 = (X.E23) r1
            r0 = 0
            r1.A03(r0)
            android.content.Context r1 = r1.getContext()
            r0 = 2131975944(0x7f135f08, float:1.9588995E38)
            X.C59689JTv.A07(r1, r0)
            r0 = 1454433095(0x56b0e347, float:9.7245098E13)
            goto L_0x066a
        L_0x04b5:
            r0 = 320415541(0x13192735, float:1.9330646E-27)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r10.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.8ab r1 = X.DbW.A0U(r0)
            r0 = 2131968258(0x7f134102, float:1.9573406E38)
            r1.A08(r0)
            X.Dba.A1L(r1)
            r0 = -671941459(0xffffffffd7f2fcad, float:-5.34334096E14)
            goto L_0x066a
        L_0x04d2:
            r0 = 1988750214(0x7689eb86, float:1.3986751E33)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r11.A00()
            if (r1 == 0) goto L_0x04fd
            X.1XP r1 = (X.1XP) r1
            java.lang.String r0 = r1.getErrorMessage()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x04fd
            java.lang.Object r2 = r10.A01
            X.E3Y r2 = (X.E3Y) r2
            java.lang.String r1 = r1.getErrorMessage()
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            r2.EuV(r1, r0)
        L_0x04f8:
            r0 = -1486822621(0xffffffffa760e323, float:-3.1209376E-15)
            goto L_0x066a
        L_0x04fd:
            java.lang.Object r0 = r10.A01
            X.E3Y r0 = (X.E3Y) r0
            X.E3Y.A03(r0)
            goto L_0x04f8
        L_0x0505:
            r0 = 1293193684(0x4d1491d4, float:1.5578656E8)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r10.A01
            X.E77 r2 = (X.E77) r2
            com.instagram.registration.ui.NotificationBar r0 = r2.A00
            if (r0 == 0) goto L_0x051d
            java.lang.String r1 = X.DbZ.A0j(r2)
            com.instagram.registration.ui.NotificationBar r0 = r2.A00
            X.C49958FGq.A08(r0, r1)
        L_0x051d:
            com.instagram.common.session.UserSession r4 = r2.getSession()
            X.DiE r0 = X.C46634DiE.A08
            X.AnonymousClass7TG.A1N(r4, r0)
            double r6 = X.DbS.A01()
            double r2 = X.DbS.A00()
            X.0wc r1 = X.AnonymousClass0kN.A02(r4)
            java.lang.String r0 = "save_additional_phone_fail"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            X.Dbc.A0X(r1, r6, r2)
            java.lang.String r0 = "additional_contact"
            X.DbZ.A1J(r1, r0)
            X.FH8.A09(r1, r4)
            X.FH8.A04(r1)
            X.DbT.A1P(r1)
            r1.Cgf()
            r0 = -1557761512(0xffffffffa3267218, float:-9.023038E-18)
            goto L_0x066a
        L_0x0551:
            r0 = 1618353666(0x60761e02, float:7.093846E19)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.C47691EDa.super.onFail(r11)
            java.lang.Object r0 = r10.A01
            X.ENo r0 = (X.C47937ENo) r0
            java.lang.String r1 = X.DbZ.A0j(r0)
            com.instagram.registration.ui.NotificationBar r0 = r0.A05
            X.C49958FGq.A08(r0, r1)
            r0 = 1927974142(0x72ea8cfe, float:9.2915125E30)
            goto L_0x066a
        L_0x056d:
            r0 = -2093899864(0xffffffff83319fa8, float:-5.21989E-37)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r3 = r10.A01
            X.E20 r3 = (X.E20) r3
            X.0wW r7 = r3.A01
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7
            java.lang.String r6 = r3.A03
            com.google.common.collect.ImmutableList$Builder r1 = com.google.common.collect.ImmutableList.builder()
            X.EZY r0 = X.EZY.NAME
            r1.add(r0)
            X.Dkp r0 = r3.A02
            com.instagram.common.typedurl.ImageUrl r0 = r0.A01
            boolean r0 = X.C253833rU.A02(r0)
            if (r0 != 0) goto L_0x0596
            X.EZY r0 = X.EZY.PROFILE_PHOTO
            r1.add(r0)
        L_0x0596:
            com.google.common.collect.ImmutableList r4 = r1.build()
            com.google.common.collect.ImmutableList$Builder r2 = com.google.common.collect.ImmutableList.builder()
            X.EWu r1 = X.C48128EWu.FACEBOOK
            r2.add(r1)
            X.Dkp r0 = r3.A02
            com.instagram.common.typedurl.ImageUrl r0 = r0.A01
            boolean r0 = X.C253833rU.A02(r0)
            if (r0 != 0) goto L_0x05b0
            r2.add(r1)
        L_0x05b0:
            com.google.common.collect.ImmutableList r1 = r2.build()
            r0 = 0
            X.0qQ.A0B(r7, r0)
            X.AnonymousClass7TG.A1U(r6, r4, r1)
            java.util.HashMap r1 = X.FGS.A00(r4, r1)
            java.lang.String r0 = "cp_sync_error"
            X.FGS.A03(r7, r0, r6, r1)
            android.content.Context r0 = r3.getContext()
            if (r0 != 0) goto L_0x05d3
            r0 = -1
            X.E20.A01(r3, r0)
        L_0x05ce:
            r0 = 629305781(0x258271b5, float:2.2628456E-16)
            goto L_0x066a
        L_0x05d3:
            X.8ab r2 = X.DbS.A0Y(r0)
            r0 = 2131974914(0x7f135b02, float:1.9586905E38)
            r2.A09(r0)
            X.Dkp r0 = r3.A02
            boolean r0 = r0.A0C
            if (r0 == 0) goto L_0x05fb
            r1 = 2131974915(0x7f135b03, float:1.9586908E38)
            r0 = 48
            X.C50020FJf.A01(r2, r3, r0, r1)
            r1 = 2131974913(0x7f135b01, float:1.9586903E38)
            r0 = 49
            X.FJf r0 = X.C50020FJf.A00(r3, r0)
            r2.A0G(r0, r1)
        L_0x05f7:
            X.DbT.A1V(r2)
            goto L_0x05ce
        L_0x05fb:
            r1 = 2131974913(0x7f135b01, float:1.9586903E38)
            r0 = 50
            X.C50020FJf.A01(r2, r3, r0, r1)
            goto L_0x05f7
        L_0x0604:
            r0 = 805320880(0x300038b0, float:4.6646687E-10)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r4 = r10.A01
            X.E20 r4 = (X.E20) r4
            X.0wW r3 = r4.A01
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            java.lang.String r2 = r4.A03
            X.AnonymousClass7TG.A1N(r3, r2)
            java.lang.String r1 = "cp_upsell_config_fetch_failed"
            r0 = 0
            X.FGS.A03(r3, r1, r2, r0)
            r0 = -1
            X.E20.A01(r4, r0)
            r0 = -1674233925(0xffffffff9c3537bb, float:-5.9959906E-22)
            goto L_0x066a
        L_0x0626:
            r0 = -654607595(0xffffffffd8fb7b15, float:-2.21204841E15)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r10.A01
            X.FFu r0 = (X.C49941FFu) r0
            X.C49941FFu.A02(r0)
            r0 = 377987269(0x1687a0c5, float:2.1911886E-25)
            goto L_0x066a
        L_0x0638:
            r0 = -812070692(0xffffffffcf98c8dc, float:-5.1266007E9)
            int r5 = X.AnonymousClass0fD.A03(r0)
            r0 = -1624618927(0xffffffff9f2a4851, float:-3.605872E-20)
            goto L_0x066a
        L_0x0643:
            r0 = 1145844874(0x444c348a, float:816.8209)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.0wb r2 = X.0wb.A01
            java.lang.String r1 = "AdActivityRemoveMutationUtils"
            java.lang.String r0 = "AdActivity remove undo mutation failed"
            r2.Ew0(r1, r0)
            r0 = -180573727(0xfffffffff53ca9e1, float:-2.3915951E32)
            goto L_0x066a
        L_0x0657:
            r0 = 1582401005(0x5e5185ed, float:3.77443348E18)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.0wb r2 = X.0wb.A01
            java.lang.String r1 = "AdActivityRemoveMutationUtils"
            java.lang.String r0 = "AdActivity remove mutation failed"
            r2.Ew0(r1, r0)
            r0 = -1126711734(0xffffffffbcd7be4a, float:-0.026335854)
        L_0x066a:
            X.AnonymousClass0fD.A0A(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47691EDa.onFail(X.4dm):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b1, code lost:
        X.0qQ.A0F("toggleBarcelonaSwitchCell");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ba, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x01af, code lost:
        X.AnonymousClass0fD.A0A(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01b2, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFinish() {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 3: goto L_0x0009;
                case 4: goto L_0x001f;
                case 5: goto L_0x0034;
                case 6: goto L_0x0005;
                case 7: goto L_0x004f;
                case 8: goto L_0x0005;
                case 9: goto L_0x0005;
                case 10: goto L_0x0005;
                case 11: goto L_0x0005;
                case 12: goto L_0x0005;
                case 13: goto L_0x0005;
                case 14: goto L_0x0005;
                case 15: goto L_0x0005;
                case 16: goto L_0x0005;
                case 17: goto L_0x0005;
                case 18: goto L_0x0067;
                case 19: goto L_0x008c;
                case 20: goto L_0x0005;
                case 21: goto L_0x0005;
                case 22: goto L_0x0005;
                case 23: goto L_0x0005;
                case 24: goto L_0x0005;
                case 25: goto L_0x00bb;
                case 26: goto L_0x00ce;
                case 27: goto L_0x0005;
                case 28: goto L_0x00e5;
                case 29: goto L_0x00fd;
                case 30: goto L_0x0115;
                case 31: goto L_0x012c;
                case 32: goto L_0x0142;
                case 33: goto L_0x0154;
                case 34: goto L_0x016e;
                case 35: goto L_0x018c;
                case 36: goto L_0x0005;
                case 37: goto L_0x019e;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.C47691EDa.super.onFinish()
            return
        L_0x0009:
            r0 = -1465210426(0xffffffffa8aaa9c6, float:-1.8947419E-14)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r4.A01
            X.ENo r0 = (X.C47937ENo) r0
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r0.A06
            r0 = 0
            r1.setShowProgressBar(r0)
            r0 = 356601512(0x15414ea8, float:3.9038088E-26)
            goto L_0x01af
        L_0x001f:
            r0 = 1702454709(0x657965b5, float:7.360909E22)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r4.A01
            X.E77 r0 = (X.E77) r0
            X.EEK r0 = r0.A01
            r0.A00()
            r0 = 1645687735(0x621733b7, float:6.972962E20)
            goto L_0x01af
        L_0x0034:
            r0 = -972875200(0xffffffffc6031a40, float:-8390.5625)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r4.A01
            X.E6s r2 = (X.C47531E6s) r2
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A02
            if (r1 == 0) goto L_0x0047
            r0 = 0
            r1.setShowProgressBar(r0)
        L_0x0047:
            X.C47531E6s.A02(r2)
            r0 = 1580449803(0x5e33c00b, float:3.23809116E18)
            goto L_0x01af
        L_0x004f:
            r0 = 1949475574(0x7432a2f6, float:5.6612188E31)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r4.A01
            X.E58 r0 = (X.E58) r0
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r0.A02
            if (r1 == 0) goto L_0x0062
            r0 = 0
            r1.setShowProgressBar(r0)
        L_0x0062:
            r0 = -1795016836(0xffffffff9502377c, float:-2.629706E-26)
            goto L_0x01af
        L_0x0067:
            r0 = 740832591(0x2c28354f, float:2.3903828E-12)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.C47691EDa.super.onFinish()
            java.lang.Object r1 = r4.A01
            com.instagram.profile.edit.controller.editcontrollerbarcelona.EditProfileBarcelonaController r1 = (com.instagram.profile.edit.controller.editcontrollerbarcelona.EditProfileBarcelonaController) r1
            com.instagram.igds.components.textcell.IgdsListCell r0 = r1.toggleBarcelonaSwitchCell
            if (r0 == 0) goto L_0x00b1
            boolean r0 = r0.isEnabled()
            if (r0 != 0) goto L_0x0087
            com.instagram.igds.components.textcell.IgdsListCell r1 = r1.toggleBarcelonaSwitchCell
            if (r1 == 0) goto L_0x00b1
            r0 = 1
            r1.setEnabled(r0)
        L_0x0087:
            r0 = 535814709(0x1fefe235, float:1.01594665E-19)
            goto L_0x01af
        L_0x008c:
            r0 = 178955558(0xaaaa526, float:1.6432526E-32)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.C47691EDa.super.onFinish()
            java.lang.Object r1 = r4.A01
            com.instagram.profile.edit.controller.editcontrollerbarcelona.EditProfileBarcelonaController r1 = (com.instagram.profile.edit.controller.editcontrollerbarcelona.EditProfileBarcelonaController) r1
            com.instagram.igds.components.textcell.IgdsListCell r0 = r1.toggleBarcelonaSwitchCell
            if (r0 == 0) goto L_0x00b1
            boolean r0 = r0.isEnabled()
            if (r0 != 0) goto L_0x00ac
            com.instagram.igds.components.textcell.IgdsListCell r1 = r1.toggleBarcelonaSwitchCell
            if (r1 == 0) goto L_0x00b1
            r0 = 1
            r1.setEnabled(r0)
        L_0x00ac:
            r0 = 976563369(0x3a352ca9, float:6.911257E-4)
            goto L_0x01af
        L_0x00b1:
            java.lang.String r0 = "toggleBarcelonaSwitchCell"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00bb:
            r0 = 365452138(0x15c85b6a, float:8.092358E-26)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r4.A01
            X.Dib r1 = (X.C46656Dib) r1
            r0 = 0
            r1.A13 = r0
            r0 = -993329780(0xffffffffc4cafd8c, float:-1623.9233)
            goto L_0x01af
        L_0x00ce:
            r0 = 734649442(0x2bc9dc62, float:1.4343078E-12)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r4.A01
            X.FPC r0 = (X.FPC) r0
            java.lang.Object r1 = r0.A01
            X.Dib r1 = (X.C46656Dib) r1
            r0 = 0
            r1.A12 = r0
            r0 = -122900402(0xfffffffff8acb04e, float:-2.8020342E34)
            goto L_0x01af
        L_0x00e5:
            r0 = 1771498435(0x6996ebc3, float:2.2806528E25)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.C47691EDa.super.onFinish()
            java.lang.Object r0 = r4.A01
            X.E5f r0 = (X.C47500E5f) r0
            X.EEK r0 = r0.A03
            r0.A00()
            r0 = 177686924(0xa97498c, float:1.4568436E-32)
            goto L_0x01af
        L_0x00fd:
            r0 = -2116461733(0xffffffff81d95b5b, float:-7.98443E-38)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.C47691EDa.super.onFinish()
            java.lang.Object r0 = r4.A01
            X.E5f r0 = (X.C47500E5f) r0
            X.EEK r0 = r0.A03
            r0.A00()
            r0 = 1730652170(0x6727a80a, float:7.91735E23)
            goto L_0x01af
        L_0x0115:
            r0 = -1298343691(0xffffffffb29cd8f5, float:-1.825945E-8)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.2dY r1 = X.2dZ.A0t
            java.lang.Object r0 = r4.A01
            androidx.fragment.app.FragmentActivity r0 = X.DbZ.A0E(r0)
            X.Dba.A0m(r0, r1)
            r0 = -161568916(0xfffffffff65ea76c, float:-1.1289899E33)
            goto L_0x01af
        L_0x012c:
            r0 = 1098616918(0x417b9056, float:15.722738)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.2dY r1 = X.2dZ.A0t
            java.lang.Object r0 = r4.A01
            androidx.fragment.app.FragmentActivity r0 = X.DbZ.A0E(r0)
            X.Dba.A0m(r0, r1)
            r0 = -2065851301(0xffffffff84dd9c5b, float:-5.210044E-36)
            goto L_0x01af
        L_0x0142:
            r0 = -1368272737(0xffffffffae71d09f, float:-5.498235E-11)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r4.A01
            X.E71 r1 = (X.E71) r1
            r0 = 0
            r1.A0B = r0
            r0 = 1072020132(0x3fe5baa4, float:1.7947583)
            goto L_0x01af
        L_0x0154:
            r0 = -290701526(0xffffffffeeac3f2a, float:-2.665389E28)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.2dY r1 = X.2dZ.A0t
            java.lang.Object r0 = r4.A01
            X.FGB r0 = (X.FGB) r0
            X.4DH r0 = r0.A09
            androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
            X.Dba.A0m(r0, r1)
            r0 = -1403277890(0xffffffffac5badbe, float:-3.1218218E-12)
            goto L_0x01af
        L_0x016e:
            r0 = 1534123923(0x5b70df93, float:6.7799817E16)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r4.A01
            X.FPH r2 = (X.FPH) r2
            java.lang.Object r1 = r2.A02
            X.2da r1 = (X.2da) r1
            r0 = 1
            r1.EVS(r0)
            java.lang.Object r0 = r2.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.Dbb.A0x(r0)
            r0 = -1154966476(0xffffffffbb289c34, float:-0.002572787)
            goto L_0x01af
        L_0x018c:
            r0 = 719385877(0x2ae0f515, float:3.9960453E-13)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r4.A01
            X.E38 r1 = (X.E38) r1
            r0 = 0
            r1.A0A = r0
            r0 = 607845959(0x243afe47, float:4.0547702E-17)
            goto L_0x01af
        L_0x019e:
            r0 = -1043790656(0xffffffffc1c904c0, float:-25.12732)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r4.A01
            X.E38 r1 = (X.E38) r1
            r0 = 0
            r1.A0C = r0
            r0 = -2124520274(0xffffffff815e64ae, float:-4.0847194E-38)
        L_0x01af:
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47691EDa.onFinish():void");
    }

    public final void onStart() {
        int i;
        int i2;
        switch (this.A00) {
            case 3:
                i = AnonymousClass0fD.A03(1711855706);
                ((C47937ENo) this.A01).A06.setShowProgressBar(true);
                i2 = -34302073;
                break;
            case 4:
                i = AnonymousClass0fD.A03(-360365852);
                ((E77) this.A01).A01.A01();
                i2 = -903209039;
                break;
            case 5:
                i = AnonymousClass0fD.A03(-1872384385);
                ProgressButton progressButton = ((C47531E6s) this.A01).A02;
                if (progressButton != null) {
                    progressButton.setShowProgressBar(true);
                }
                i2 = -1296901261;
                break;
            case 7:
                i = AnonymousClass0fD.A03(-670056524);
                ProgressButton progressButton2 = ((E58) this.A01).A02;
                if (progressButton2 != null) {
                    progressButton2.setShowProgressBar(true);
                }
                i2 = -2020441625;
                break;
            case 8:
                i = AnonymousClass0fD.A03(230980591);
                ((E23) this.A01).A03(true);
                i2 = 66132692;
                break;
            case 9:
                i = AnonymousClass0fD.A03(-1519674027);
                ((E23) this.A01).A03(true);
                i2 = 1771319334;
                break;
            case 10:
                i = AnonymousClass0fD.A03(-291146787);
                ((C47447E2t) this.A01).A02(true);
                i2 = -351220615;
                break;
            case 11:
                i = AnonymousClass0fD.A03(-954874017);
                ((C47447E2t) this.A01).A02(true);
                i2 = 1333112743;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                i = AnonymousClass0fD.A03(-420328415);
                ((C47447E2t) this.A01).A02(true);
                i2 = 2133082543;
                break;
            case 20:
                i = AnonymousClass0fD.A03(313933637);
                Dbb.A0y((Fragment) this.A01);
                i2 = 1497115973;
                break;
            case 25:
                i = AnonymousClass0fD.A03(1352184308);
                C46656Dib dib = (C46656Dib) this.A01;
                dib.A13 = true;
                DbT.A0K(dib.requireActivity()).setIsLoading(true);
                C46656Dib.A0N(dib, false);
                i2 = 831096672;
                break;
            case 26:
                i = AnonymousClass0fD.A03(-1704560852);
                ((C46656Dib) ((FPC) this.A01).A01).A12 = true;
                i2 = -1738831087;
                break;
            case 28:
                i = AnonymousClass0fD.A03(-1833892028);
                C47691EDa.super.onStart();
                ((C47500E5f) this.A01).A03.A01();
                i2 = 893507991;
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                i = AnonymousClass0fD.A03(-1750502949);
                C47691EDa.super.onStart();
                ((C47500E5f) this.A01).A03.A01();
                i2 = 327512820;
                break;
            case 30:
                i = AnonymousClass0fD.A03(557962998);
                Dba.A0n(DbZ.A0E(this.A01), 2dZ.A0t);
                i2 = -1368031271;
                break;
            case 31:
                i = AnonymousClass0fD.A03(-1798660273);
                Dba.A0n(DbZ.A0E(this.A01), 2dZ.A0t);
                i2 = 1078314462;
                break;
            case 32:
                i = AnonymousClass0fD.A03(421547402);
                E71 e71 = (E71) this.A01;
                e71.A0B = true;
                DbY.A18(e71, true);
                i2 = 2146453418;
                break;
            case 33:
                i = AnonymousClass0fD.A03(1535334279);
                i2 = 1242186807;
                break;
            case 34:
                i = AnonymousClass0fD.A03(-142770580);
                FPH fph = (FPH) this.A01;
                ((2da) fph.A02).EVS(false);
                Dbb.A0y((Fragment) fph.A01);
                i2 = -1582686410;
                break;
            case 35:
                i = AnonymousClass0fD.A03(-309155857);
                E38 e38 = (E38) this.A01;
                e38.A0A = true;
                if (e38.isResumed()) {
                    DbY.A17(e38, 2dZ.A0t, true);
                }
                i2 = -959235276;
                break;
            case 37:
                i = AnonymousClass0fD.A03(-1492154258);
                E38 e382 = (E38) this.A01;
                e382.A0C = true;
                DbY.A17(e382, 2dZ.A0t, true);
                i2 = 334199124;
                break;
            default:
                C47691EDa.super.onStart();
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    /* JADX WARNING: type inference failed for: r0v147, types: [com.instagram.registration.model.UserBirthDate, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v531, types: [X.1qK, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0645, code lost:
        if (r0.A04 != false) goto L_0x0647;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x0c0b, code lost:
        r10 = "interestAdapter";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x0ce3, code lost:
        r10 = androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x0dfc, code lost:
        r10 = "interestAccountsAdapter";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:0x0dfe, code lost:
        X.0qQ.A0F(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x0e05, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x0f01, code lost:
        X.AnonymousClass0fD.A0A(r0, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x0f04, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x0fc2, code lost:
        X.AnonymousClass0fD.A0A(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x0fc5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:529:0x1252, code lost:
        X.AnonymousClass0fD.A0A(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:530:0x1255, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:555:0x12f3, code lost:
        X.AnonymousClass0fD.A0A(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:556:0x12f6, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r20) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x129b;
                case 1: goto L_0x0fc6;
                case 2: goto L_0x0f57;
                case 3: goto L_0x0f05;
                case 4: goto L_0x0eb6;
                case 5: goto L_0x0009;
                case 6: goto L_0x0e5c;
                case 7: goto L_0x0e19;
                case 8: goto L_0x0ce7;
                case 9: goto L_0x0c0f;
                case 10: goto L_0x0bc7;
                case 11: goto L_0x0b49;
                case 12: goto L_0x0ae5;
                case 13: goto L_0x0ab9;
                case 14: goto L_0x0a6a;
                case 15: goto L_0x09df;
                case 16: goto L_0x099a;
                case 17: goto L_0x0955;
                case 18: goto L_0x0932;
                case 19: goto L_0x090f;
                case 20: goto L_0x0893;
                case 21: goto L_0x086e;
                case 22: goto L_0x079f;
                case 23: goto L_0x0735;
                case 24: goto L_0x06f1;
                case 25: goto L_0x0595;
                case 26: goto L_0x049a;
                case 27: goto L_0x0456;
                case 28: goto L_0x03c1;
                case 29: goto L_0x039b;
                case 30: goto L_0x031a;
                case 31: goto L_0x02d9;
                case 32: goto L_0x029c;
                case 33: goto L_0x022d;
                case 34: goto L_0x01a5;
                case 35: goto L_0x0115;
                case 36: goto L_0x0096;
                case 37: goto L_0x000d;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.C47691EDa.super.onSuccess(r8)
            return
        L_0x000d:
            r0 = -1563866654(0xffffffffa2c949e2, float:-5.4559386E-18)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.DwB r8 = (X.DwB) r8
            r0 = -1615809421(0xffffffff9fb0b473, float:-7.483743E-20)
            int r3 = X.AnonymousClass7TG.A0D(r8, r0)
            java.lang.Object r4 = r7.A01
            X.E38 r4 = (X.E38) r4
            X.0eM r0 = r4.A0G
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r0)
            X.17i r1 = X.17h.A00(r6)
            com.instagram.user.model.User r0 = r8.A00
            X.0qQ.A07(r0)
            r1.A03(r0)
            X.F1D r0 = r4.A03
            if (r0 == 0) goto L_0x0081
            java.lang.String r0 = r0.A0O
        L_0x0039:
            java.lang.String r5 = "Required value was null."
            if (r0 == 0) goto L_0x008b
            X.FGv.A04(r0)
            X.6qt r1 = X.C319606qt.A01(r6)
            com.instagram.user.model.User r0 = X.DbT.A0j(r6)
            r1.A0F(r0)
            com.instagram.user.model.User r0 = r8.A00
            java.lang.String r1 = r0.getFullName()
            java.lang.String r0 = r4.A09
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 != 0) goto L_0x006a
            X.0wc r1 = X.AnonymousClass0kN.A01(r4, r6)
            java.lang.String r0 = "profile_edit_name"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r0 = r4.A08
            if (r0 == 0) goto L_0x0083
            X.DbV.A1J(r1, r0)
        L_0x006a:
            android.view.View r1 = r4.mView
            if (r1 == 0) goto L_0x0076
            X.Fr9 r0 = new X.Fr9
            r0.<init>(r4)
            r1.post(r0)
        L_0x0076:
            r0 = -2075871945(0xffffffff8444b537, float:-2.3122899E-36)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = -2060834951(0xffffffff852a2779, float:-8.0006116E-36)
            goto L_0x0fc2
        L_0x0081:
            r0 = 0
            goto L_0x0039
        L_0x0083:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r5)
            r0 = 1980170297(0x76070039, float:6.845357E32)
            goto L_0x0092
        L_0x008b:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r5)
            r0 = -1370976724(0xffffffffae488e2c, float:-4.560101E-11)
        L_0x0092:
            X.AnonymousClass0fD.A0A(r0, r3)
            throw r1
        L_0x0096:
            r0 = -1955773958(0xffffffff8b6d41fa, float:-4.5694175E-32)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.CFz r8 = (X.C43859CFz) r8
            r0 = -1700139348(0xffffffff9aa9eeac, float:-7.028236E-23)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r5 = 0
            X.0qQ.A0B(r8, r5)
            X.C47691EDa.super.onSuccess(r8)
            java.lang.Object r6 = r7.A01
            X.E38 r6 = (X.E38) r6
            X.6ve r2 = r6.A04
            if (r2 == 0) goto L_0x00bf
            r1 = 1
            r0 = 3051(0xbeb, float:4.275E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r2.A0A(r0, r1)
        L_0x00bf:
            X.6ve r1 = r6.A04
            if (r1 == 0) goto L_0x00c8
            java.lang.String r0 = "edit_full_name"
            r1.A04(r0)
        L_0x00c8:
            com.instagram.user.model.User r2 = r6.A05
            if (r2 == 0) goto L_0x00eb
            X.CtJ r0 = r8.A00
            if (r0 == 0) goto L_0x0111
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L_0x010d
            r2.A0t(r0)
            X.0eM r1 = r6.A0G
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r1)
            X.DbT.A1S(r0, r2)
            X.0lg r0 = X.DbT.A0X(r1)
            X.6qt r0 = X.C319606qt.A01(r0)
            r0.A0F(r2)
        L_0x00eb:
            X.0eM r0 = r6.A0G
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.F3s r2 = X.C49061Eof.A00(r0)
            X.EWT r1 = X.EWT.EDIT_NAME_FLOW
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r2.A01(r1, r0)
            X.DbY.A18(r6, r5)
            X.DbT.A1J(r6)
            r0 = 1839432002(0x6da38142, float:6.32529E27)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -1120234494(0xffffffffbd3a9402, float:-0.045551307)
            goto L_0x12f3
        L_0x010d:
            java.lang.String r10 = "fullname"
            goto L_0x0dfe
        L_0x0111:
            java.lang.String r10 = "user"
            goto L_0x0dfe
        L_0x0115:
            r0 = 451464722(0x1ae8ce12, float:9.6285876E-23)
            int r9 = X.AnonymousClass0fD.A03(r0)
            X.DvS r8 = (X.DvS) r8
            r0 = -455250022(0xffffffffe4dd6f9a, float:-3.2678177E22)
            int r3 = X.AnonymousClass7TG.A0D(r8, r0)
            java.lang.Object r4 = r7.A01
            X.E38 r4 = (X.E38) r4
            X.F1D r1 = r8.A00
            r4.A03 = r1
            android.view.View r0 = r4.mView
            if (r0 == 0) goto L_0x0191
            if (r1 == 0) goto L_0x0191
            android.os.Bundle r1 = r4.requireArguments()
            java.lang.String r0 = "full_name"
            java.lang.String r0 = r1.getString(r0)
            r5 = 1
            if (r0 == 0) goto L_0x0146
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0191
        L_0x0146:
            X.F1D r0 = r4.A03
            if (r0 == 0) goto L_0x015b
            java.lang.String r1 = r0.A0F
            if (r1 == 0) goto L_0x015b
            int r0 = r1.length()
            if (r0 == 0) goto L_0x015b
            com.instagram.igds.components.form.IgFormField r0 = r4.A02
            if (r0 == 0) goto L_0x015b
            r0.setText(r1)
        L_0x015b:
            X.F1D r0 = r4.A03
            if (r0 == 0) goto L_0x018e
            X.EbC r0 = r0.A06
            if (r0 == 0) goto L_0x018e
            X.EbO r2 = r0.A00
            if (r2 == 0) goto L_0x018e
            boolean r0 = r2.A02
            boolean r0 = X.AnonymousClass7TF.A1S(r0, r5)
            r4.A0B = r0
            java.lang.String r1 = r2.A01
            r4.A07 = r1
            boolean r0 = r2.A03
            boolean r0 = X.AnonymousClass7TF.A1S(r0, r5)
            r4.A0D = r0
            java.lang.String r0 = r2.A00
            r4.A06 = r0
            if (r1 == 0) goto L_0x018e
            int r0 = r1.length()
            if (r0 == 0) goto L_0x018e
            com.instagram.common.ui.base.IgTextView r0 = r4.A01
            if (r0 == 0) goto L_0x018e
            r0.setText(r1)
        L_0x018e:
            X.E38.A00(r4)
        L_0x0191:
            boolean r0 = r4.isResumed()
            if (r0 == 0) goto L_0x019a
            X.Dbb.A0u(r4)
        L_0x019a:
            r0 = 1979954566(0x7603b586, float:6.6784436E32)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = -715085390(0xffffffffd560a9b2, float:-1.5438715E13)
            goto L_0x0f01
        L_0x01a5:
            r0 = -255825844(0xfffffffff0c0684c, float:-4.7637767E29)
            int r9 = X.AnonymousClass0fD.A03(r0)
            X.UXn r8 = (X.C15253UXn) r8
            r0 = -180976118(0xfffffffff536860a, float:-2.3137614E32)
            int r2 = X.AnonymousClass0fD.A03(r0)
            boolean r0 = r8.A04
            if (r0 == 0) goto L_0x021d
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()
            java.lang.Object r0 = r7.A01
            X.FPH r0 = (X.FPH) r0
            java.lang.Object r3 = r0.A01
            X.E2x r3 = (X.C47451E2x) r3
            java.util.GregorianCalendar r0 = r3.A02
            r5 = 1
            int r0 = r0.get(r5)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "year"
            r4.put(r0, r1)
            java.util.GregorianCalendar r0 = r3.A02
            int r0 = X.DbZ.A06(r0)
            int r0 = r0 + 1
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "month"
            r4.put(r0, r1)
            java.util.GregorianCalendar r0 = r3.A02
            int r0 = X.DbU.A03(r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "day"
            r4.put(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r5)
            r0 = 100
            java.lang.String r0 = X.Pxd.A00(r0)
            r4.put(r0, r1)
            com.instagram.common.session.UserSession r1 = r3.A00
            java.lang.String r0 = "com.instagram.age_verification.age_verification_bottom_sheet.action"
            X.8ey r1 = X.C359988do.A04(r1, r0, r4)
            r0 = 11
            X.E84.A00(r1, r7, r0)
            r3.schedule(r1)
        L_0x0212:
            r0 = -1710687473(0xffffffff9a08fb0f, float:-2.8326944E-23)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = -1156335949(0xffffffffbb13b6b3, float:-0.0022539317)
            goto L_0x0f01
        L_0x021d:
            java.lang.Object r0 = r7.A01
            X.FPH r0 = (X.FPH) r0
            java.lang.Object r1 = r0.A01
            X.E2x r1 = (X.C47451E2x) r1
            java.lang.Object r0 = r0.A02
            X.2da r0 = (X.2da) r0
            X.C47451E2x.A00(r0, r1)
            goto L_0x0212
        L_0x022d:
            r0 = 2009975629(0x77cdcb4d, float:8.348002E33)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.Dvm r8 = (X.C47352Dvm) r8
            r0 = 685230173(0x28d7c85d, float:2.3956689E-14)
            int r4 = X.AnonymousClass7TG.A0D(r8, r0)
            com.instagram.user.model.User r0 = r8.A00
            X.0qQ.A07(r0)
            java.lang.Object r5 = r7.A01
            X.FGB r5 = (X.FGB) r5
            X.1Ng r7 = r5.A0B
            com.instagram.common.session.UserSession r6 = r5.A0D
            java.lang.String r2 = r6.A06
            X.4Cl r0 = r0.A03
            X.3qt r1 = r0.Afr()
            X.FWU r0 = new X.FWU
            r0.<init>(r1, r2)
            r7.A00(r0)
            android.os.Handler r1 = r5.A04
            X.Fr8 r0 = new X.Fr8
            r0.<init>(r5)
            r1.post(r0)
            X.0iw r0 = r5.A0A
            X.0wc r1 = X.AnonymousClass0kN.A01(r0, r6)
            java.lang.String r0 = "profile_edit_bio"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r0 = r5.A0G
            X.DbV.A1J(r1, r0)
            X.F3s r2 = X.C49061Eof.A00(r6)
            X.EWT r1 = X.EWT.EDIT_BIO_FLOW
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r2.A01(r1, r0)
            X.6ve r2 = r5.A01
            r0 = 1534(0x5fe, float:2.15E-42)
            java.lang.String r1 = X.C273654mx.A00(r0)
            r0 = 1
            r2.A0A(r1, r0)
            java.lang.String r0 = "edit_bio"
            r2.A04(r0)
            r0 = 901295831(0x35b8aed7, float:1.3759953E-6)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -671316995(0xffffffffd7fc83fd, float:-5.55287631E14)
            goto L_0x12f3
        L_0x029c:
            r0 = 679499085(0x2880554d, float:1.4247848E-14)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.DvS r8 = (X.DvS) r8
            r0 = 1597874545(0x5f3da171, float:1.3664327E19)
            int r4 = X.AnonymousClass7TG.A0D(r8, r0)
            X.F1D r0 = r8.A00
            if (r0 != 0) goto L_0x02bb
            r0 = -1065319434(0xffffffffc08083f6, float:-4.0161085)
        L_0x02b3:
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -2120836309(0xffffffff81969b2b, float:-5.5323953E-38)
            goto L_0x12f3
        L_0x02bb:
            java.lang.Object r2 = r7.A01
            X.E71 r2 = (X.E71) r2
            com.instagram.user.model.User r1 = r2.A0A
            if (r1 != 0) goto L_0x02c7
            java.lang.String r10 = "displayedUser"
            goto L_0x0dfe
        L_0x02c7:
            boolean r0 = r0.A0d
            X.4Cl r1 = r1.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.ElB(r0)
            X.E71.A00(r2)
            r0 = -57283011(0xfffffffffc95ee3d, float:-6.227874E36)
            goto L_0x02b3
        L_0x02d9:
            r0 = -1586621754(0xffffffffa16e12c6, float:-8.0662383E-19)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = -560965816(0xffffffffde905748, float:-5.2004305E18)
            int r6 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r5 = r7.A01
            X.E6x r5 = (X.C47534E6x) r5
            com.instagram.common.session.UserSession r0 = r5.getSession()
            X.1Ng r4 = X.AnonymousClass1Nd.A00(r0)
            java.util.List r1 = r5.A03
            X.0qQ.A0A(r1)
            int r0 = r5.A00
            java.lang.String r2 = X.AnonymousClass7TE.A19(r1, r0)
            com.instagram.common.session.UserSession r0 = r5.getSession()
            java.lang.String r1 = r0.A06
            X.FWb r0 = new X.FWb
            r0.<init>(r2, r1)
            r4.A00(r0)
            X.DbX.A1J(r5)
            r0 = 465862508(0x1bc47f6c, float:3.2507824E-22)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = -312106998(0xffffffffed65a00a, float:-4.4415964E27)
            goto L_0x12f3
        L_0x031a:
            r0 = -488079152(0xffffffffe2e880d0, float:-2.1444633E21)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.Dvl r8 = (X.C47351Dvl) r8
            r0 = -306575858(0xffffffffedba060e, float:-7.1964414E27)
            int r2 = X.AnonymousClass0fD.A03(r0)
            r6 = 0
            X.0qQ.A0B(r8, r6)
            java.lang.Object r5 = r7.A01
            X.E6x r5 = (X.C47534E6x) r5
            java.util.List r1 = r8.A01
            if (r1 == 0) goto L_0x0397
            r5.A03 = r1
            int r0 = r8.A00
            r5.A00 = r0
            X.0qQ.A0A(r1)
            int r8 = r1.size()
            r7 = 0
        L_0x0344:
            if (r7 >= r8) goto L_0x037e
            android.view.LayoutInflater r4 = r5.A01
            X.0qQ.A0A(r4)
            r1 = 2131623971(0x7f0e0023, float:1.8875109E38)
            android.widget.RadioGroup r0 = r5.A02
            java.lang.String r10 = "radioGroup"
            if (r0 == 0) goto L_0x0dfe
            android.view.View r1 = r4.inflate(r1, r0, r6)
            r0 = 1634(0x662, float:2.29E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.util.List r0 = r5.A03
            X.0qQ.A0A(r0)
            java.lang.Object r0 = r0.get(r7)
            X.DbZ.A14(r1, r0)
            java.util.List r0 = r5.A05
            r0.add(r1)
            android.widget.RadioGroup r0 = r5.A02
            if (r0 == 0) goto L_0x0dfe
            r0.addView(r1)
            int r7 = r7 + 1
            goto L_0x0344
        L_0x037e:
            java.util.List r1 = r5.A05
            int r0 = r5.A00
            java.lang.Object r1 = r1.get(r0)
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            r0 = 1
            r1.setChecked(r0)
            r0 = 372510963(0x163410f3, float:1.4545632E-25)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = 1544045562(0x5c0843fa, float:1.53421351E17)
            goto L_0x12f3
        L_0x0397:
            java.lang.String r10 = "accountCategoryList"
            goto L_0x0dfe
        L_0x039b:
            r0 = 770644791(0x2def1b37, float:2.718324E-11)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = 1129519584(0x435319e0, float:211.10107)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.C47691EDa.super.onSuccess(r8)
            java.lang.Object r1 = r7.A01
            X.E5f r1 = (X.C47500E5f) r1
            r0 = 2131961579(0x7f1326eb, float:1.9559859E38)
            r1.A02(r0)
            r0 = -239710579(0xfffffffff1b64e8d, float:-1.8054795E30)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = -913300377(0xffffffffc9902467, float:-1180812.9)
            goto L_0x1252
        L_0x03c1:
            r0 = -173148997(0xfffffffff5adf4bb, float:-4.410308E32)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.Dvf r8 = (X.C47345Dvf) r8
            r0 = 1828262327(0x6cf911b7, float:2.4088495E27)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.C47691EDa.super.onSuccess(r8)
            boolean r0 = r8.A01
            if (r0 == 0) goto L_0x043e
            java.lang.Object r6 = r7.A01
            X.EMR r6 = (X.EMR) r6
            android.content.Context r0 = r6.getContext()
            if (r0 == 0) goto L_0x043e
            X.0hq r2 = r6.getParentFragmentManager()
            java.lang.String r0 = "edit_profile"
            java.lang.String r1 = r6.A00
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0449
            r0 = 479(0x1df, float:6.71E-43)
            java.lang.String r1 = X.C273654mx.A00(r0)
        L_0x03f6:
            r0 = 0
            r2.A0y(r1, r0)
            X.0wW r2 = r6.A02
            boolean r0 = r2 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x0426
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            com.instagram.user.model.User r1 = X.DbT.A0j(r2)
            r1.A0Z()
            X.DbT.A1S(r2, r1)
            X.1Ng r3 = X.AnonymousClass1Nd.A00(r2)
            X.3DO r0 = new X.3DO
            r0.<init>()
            r3.A00(r0)
            java.lang.String r2 = r1.getId()
            java.lang.String r1 = r8.A00
            X.FWV r0 = new X.FWV
            r0.<init>(r2, r1)
            r3.A00(r0)
        L_0x0426:
            X.6ap r2 = X.DbS.A0a()
            android.content.Context r0 = r6.getContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131954971(0x7f130d1b, float:1.9546456E38)
            X.DbT.A1D(r1, r2, r0)
            r2.A06()
            X.Dbb.A1Q(r2)
        L_0x043e:
            r0 = -1438903632(0xffffffffaa3c12b0, float:-1.6704238E-13)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 628340495(0x2573b70f, float:2.1138913E-16)
            goto L_0x1252
        L_0x0449:
            java.lang.String r0 = "personal_information"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0454
            java.lang.String r1 = "PersonalInformationFragment.BACK_STACK_NAME"
            goto L_0x03f6
        L_0x0454:
            r1 = 0
            goto L_0x03f6
        L_0x0456:
            r0 = 837320935(0x31e880e7, float:6.766743E-9)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.3JC r8 = (X.AnonymousClass3JC) r8
            r0 = 1205273143(0x47d70237, float:110084.43)
            int r6 = X.AnonymousClass0fD.A03(r0)
            if (r8 == 0) goto L_0x048f
            java.lang.Object r5 = r8.A01
            if (r5 == 0) goto L_0x048f
            X.3FZ r5 = (X.AnonymousClass3FZ) r5
            java.lang.Class<X.DqS> r3 = X.C47091DqS.class
            java.lang.String r1 = "fxcal_settings"
            X.3FZ r0 = r5.A00(r3, r1)
            if (r0 == 0) goto L_0x048f
            java.lang.Object r2 = r7.A01
            X.Dib r2 = (X.C46656Dib) r2
            X.3FZ r1 = r5.A00(r3, r1)
            java.lang.String r0 = "should_show_node_in_accounts_center"
            boolean r0 = r1.A06(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A0s = r0
            X.C46656Dib.A0A(r2)
        L_0x048f:
            r0 = 1125329030(0x43132886, float:147.1583)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = -1198892905(0xffffffffb88a5897, float:-6.596854E-5)
            goto L_0x1252
        L_0x049a:
            r0 = 754572959(0x2cf9de9f, float:7.1017216E-12)
            int r9 = X.AnonymousClass0fD.A03(r0)
            X.3JC r8 = (X.AnonymousClass3JC) r8
            r0 = -1060947437(0xffffffffc0c33a13, float:-6.100839)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r7.A01
            X.FPC r0 = (X.FPC) r0
            java.lang.Object r12 = r0.A01
            X.Dib r12 = (X.C46656Dib) r12
            android.content.Context r7 = r12.getContext()
            com.instagram.common.session.UserSession r4 = r12.A0V
            androidx.fragment.app.FragmentActivity r6 = r12.getActivity()
            java.lang.String r2 = "edit_profile"
            if (r7 == 0) goto L_0x0591
            if (r6 == 0) goto L_0x0591
            java.lang.Object r1 = r8.A01
            if (r1 == 0) goto L_0x0591
            X.C7x r1 = (X.C43753C7x) r1
            X.C7w r0 = r1.A0E()
            if (r0 == 0) goto L_0x0591
            X.C7w r10 = r1.A0E()
            r10.getClass()
            java.lang.Class<X.BpT> r13 = X.BpT.class
            r8 = 1
            r0 = 3041(0xbe1, float:4.261E-42)
            java.lang.String r11 = X.AnonymousClass000.A00(r0)
            r5 = -2018329658(0xffffffff87b2bbc6, float:-2.6892827E-34)
            X.3lr r0 = r10.getOptionalTreeField(r8, r11, r13, r5)
            if (r0 == 0) goto L_0x0591
            X.3lr r0 = r10.getOptionalTreeField(r8, r11, r13, r5)
            java.lang.String r1 = "uri"
            java.lang.String r0 = r0.A07(r1)
            if (r0 == 0) goto L_0x0591
            X.3lr r0 = r10.getOptionalTreeField(r8, r11, r13, r5)
            java.lang.String r1 = r0.A07(r1)
            r1.getClass()
            X.2EG r0 = X.2EG.A1S
            X.SUL r5 = new X.SUL
            r5.<init>(r6, r4, r0, r1)
            r5.A0S = r2
            r0 = 62
            X.FJi r6 = X.C50023FJi.A00(r5, r0)
            X.C7v r0 = r10.A0E()
            if (r0 == 0) goto L_0x058d
            X.C7v r0 = r10.A0E()
            X.BpR r0 = r0.A0E()
            if (r0 == 0) goto L_0x058d
            X.C7v r0 = r10.A0E()
            X.BpR r0 = r0.A0E()
            java.lang.String r1 = "header"
            java.lang.String r0 = r0.A07(r1)
            if (r0 == 0) goto L_0x058d
            X.C7v r0 = r10.A0E()
            X.BpR r0 = r0.A0E()
            java.lang.String r2 = "subtext"
            java.lang.String r0 = r0.getOptionalStringField(r8, r2)
            if (r0 == 0) goto L_0x058d
            X.C7v r0 = r10.A0E()
            X.BpR r0 = r0.A0E()
            java.lang.String r1 = r0.A07(r1)
            r1.getClass()
            X.C7v r0 = r10.A0E()
            X.BpR r0 = r0.A0E()
            java.lang.String r0 = r0.getOptionalStringField(r8, r2)
            r0.getClass()
            X.8ab r2 = X.DbX.A0g(r7, r0, r1)
            r0 = 2131956706(0x7f1313e2, float:1.9549975E38)
            r2.A0I(r6, r0)
            r1 = 6
            X.FHc r0 = new X.FHc
            r0.<init>(r1)
            r2.A0C(r0)
            android.app.Dialog r0 = r2.A02()
            if (r0 == 0) goto L_0x058d
            X.AnonymousClass0fN.A00(r0)
            X.EZm r1 = X.C48144EZm.BIZ_EDIT_NAME
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.lang.String r0 = "reminder_shown"
            X.FGS.A01(r1, r4, r0)
        L_0x0582:
            r0 = 1567007678(0x5d66a3be, float:1.0387085E18)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = -1973587467(0xffffffff8a5d71f5, float:-1.0662196E-32)
            goto L_0x0f01
        L_0x058d:
            r5.A0A()
            goto L_0x0582
        L_0x0591:
            X.C46656Dib.A0H(r12)
            goto L_0x0582
        L_0x0595:
            r0 = 1856025492(0x6ea0b394, float:2.486735E28)
            int r9 = X.AnonymousClass0fD.A03(r0)
            X.DvS r8 = (X.DvS) r8
            r0 = 1996248916(0x76fc5754, float:2.559043E33)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r3 = r7.A01
            X.Dib r3 = (X.C46656Dib) r3
            X.F1D r6 = r8.A00
            r3.A0e = r6
            if (r6 != 0) goto L_0x05ba
            r0 = 568695957(0x21e59c95, float:1.555909E-18)
        L_0x05b2:
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -1795358340(0xffffffff94fd017c, float:-2.5547057E-26)
            goto L_0x0f01
        L_0x05ba:
            com.instagram.common.session.UserSession r5 = r3.A0V
            com.instagram.user.model.User r2 = X.DbT.A0j(r5)
            boolean r0 = r6.A0V
            X.4Cl r1 = r2.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.EYX(r0)
            boolean r0 = r6.A0X
            X.4Cl r1 = r2.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.Edv(r0)
            boolean r0 = r6.A0T
            X.4Cl r1 = r2.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.EYS(r0)
            boolean r0 = r6.A0U
            X.4Cl r1 = r2.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.EYV(r0)
            boolean r0 = r6.A0Y
            X.4Cl r1 = r2.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.Edw(r0)
            boolean r0 = r6.A0W
            X.4Cl r1 = r2.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.Edu(r0)
            X.17i r1 = X.17h.A00(r5)
            r0 = 0
            r1.A01(r2, r0, r0)
            X.F1D r1 = r3.A0e
            java.lang.String r0 = r1.A0C
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            r3.A17 = r0
            com.instagram.user.model.User r0 = r3.A0q
            java.lang.String r1 = r1.A0K
            X.4Cl r0 = r0.A03
            r0.Efd(r1)
            com.instagram.user.model.User r2 = r3.A0q
            X.F1D r0 = r3.A0e
            java.lang.String r1 = r0.A0L
            X.4Cl r0 = r2.A03
            r0.Efe(r1)
            com.instagram.user.model.User r1 = r3.A0q
            X.F1D r0 = r3.A0e
            boolean r0 = r0.A0d
            X.4Cl r1 = r1.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.ElB(r0)
            X.C46656Dib.A0I(r3)
            com.instagram.user.model.User r2 = r3.A0q
            if (r2 == 0) goto L_0x0683
            X.Dfh r0 = r3.A0U
            if (r0 == 0) goto L_0x0647
            boolean r0 = r0.A04
            r5 = 1
            if (r0 == 0) goto L_0x0648
        L_0x0647:
            r5 = 0
        L_0x0648:
            X.F1D r0 = r3.A0e
            java.lang.String r1 = r0.A0I
            if (r1 == 0) goto L_0x06e9
            X.4Cl r0 = r2.A03
            r0.EfG(r1)
        L_0x0653:
            com.instagram.user.model.User r2 = r3.A0q
            X.F1D r0 = r3.A0e
            java.lang.String r1 = r0.A0J
            X.4Cl r0 = r2.A03
            r0.EfI(r1)
            com.instagram.user.model.User r2 = r3.A0q
            X.F1D r0 = r3.A0e
            java.lang.String r1 = r0.A08
            if (r1 == 0) goto L_0x06e2
            X.4Cl r0 = r2.A03
            r0.EO4(r1)
        L_0x066b:
            com.instagram.user.model.User r2 = r3.A0q
            X.F1D r0 = r3.A0e
            java.lang.String r1 = r0.A09
            X.4Cl r0 = r2.A03
            r0.EO5(r1)
            if (r5 == 0) goto L_0x0680
            X.Dfh r0 = r3.A0U
            if (r0 == 0) goto L_0x06bc
            boolean r0 = r0.A04
            if (r0 != 0) goto L_0x06bc
        L_0x0680:
            X.C46656Dib.A0J(r3)
        L_0x0683:
            X.C46656Dib.A0D(r3)
            X.C46656Dib.A0E(r3)
            r0 = 1
            X.C46656Dib.A0N(r3, r0)
            android.view.View r1 = r3.A04
            if (r1 == 0) goto L_0x0699
            X.Fr7 r0 = new X.Fr7
            r0.<init>(r7)
            r1.post(r0)
        L_0x0699:
            boolean r0 = r3.isResumed()
            if (r0 == 0) goto L_0x06a6
            X.2dZ r0 = X.Dba.A0A(r3)
            r0.A0T()
        L_0x06a6:
            android.view.View r0 = r3.mView
            if (r0 == 0) goto L_0x06b7
            android.view.ViewTreeObserver r2 = r0.getViewTreeObserver()
            r1 = 6
            X.SbZ r0 = new X.SbZ
            r0.<init>(r7, r1)
            r2.addOnGlobalLayoutListener(r0)
        L_0x06b7:
            r0 = -232853117(0xfffffffff21ef183, float:-3.1481985E30)
            goto L_0x05b2
        L_0x06bc:
            X.1xC r5 = X.1xC.A01
            X.6ap r2 = X.DbS.A0a()
            X.6aq r0 = X.C310346aq.SUCCESS
            r2.A0C(r0)
            com.instagram.user.model.User r0 = r3.A0q
            X.4Cl r0 = r0.A03
            java.lang.String r0 = r0.BaI()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r0 = 2131956552(0x7f131348, float:1.9549663E38)
            if (r1 == 0) goto L_0x06db
            r0 = 2131969129(0x7f134469, float:1.9575172E38)
        L_0x06db:
            X.DbS.A1E(r3, r2, r0)
            X.DbY.A1K(r5, r2)
            goto L_0x0680
        L_0x06e2:
            X.4Cl r1 = r2.A03
            r0 = 0
            r1.EO4(r0)
            goto L_0x066b
        L_0x06e9:
            X.4Cl r1 = r2.A03
            r0 = 0
            r1.EfG(r0)
            goto L_0x0653
        L_0x06f1:
            r0 = 2033869371(0x793a623b, float:6.0484973E34)
            int r9 = X.AnonymousClass0fD.A03(r0)
            X.371 r8 = (X.AnonymousClass371) r8
            r0 = 1033202052(0x3d956984, float:0.07295516)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.C47691EDa.super.onSuccess(r8)
            java.lang.Object r0 = r8.FH3()
            X.Dr5 r0 = (X.C47128Dr5) r0
            boolean r3 = r0.A00
            java.lang.Object r2 = r7.A01
            X.Dib r2 = (X.C46656Dib) r2
            com.instagram.user.model.User r1 = r2.A0q
            if (r1 == 0) goto L_0x071b
            com.instagram.common.session.UserSession r0 = r2.A0V
            if (r0 == 0) goto L_0x071b
            X.C308436Ug.A00(r0, r1, r3)
        L_0x071b:
            android.widget.TextView r1 = r2.A0H
            if (r1 == 0) goto L_0x072a
            r0 = 2131968751(0x7f1342ef, float:1.9574405E38)
            if (r3 == 0) goto L_0x0727
            r0 = 2131968777(0x7f134309, float:1.9574458E38)
        L_0x0727:
            r1.setText(r0)
        L_0x072a:
            r0 = -1684339705(0xffffffff9b9b0407, float:-2.5645202E-22)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -914697900(0xffffffffc97ad154, float:-1027349.25)
            goto L_0x0f01
        L_0x0735:
            r0 = -1896881024(0xffffffff8eefe480, float:-5.9138086E-30)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.3JC r8 = (X.AnonymousClass3JC) r8
            r0 = 1776156623(0x69ddffcf, float:3.3547579E25)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r7.A01
            X.Dib r0 = (X.C46656Dib) r0
            java.util.ArrayList r6 = r0.A1O
            r6.clear()
            java.lang.Object r8 = r8.A01
            if (r8 == 0) goto L_0x0794
            X.3FZ r8 = (X.AnonymousClass3FZ) r8
            java.lang.Class<X.Dqf> r7 = X.C47103Dqf.class
            java.lang.String r3 = "ig_ldp_app_store_apps_root_wrapper"
            X.3FZ r0 = r8.A00(r7, r3)
            if (r0 == 0) goto L_0x0794
            X.3FZ r0 = r8.A00(r7, r3)
            java.lang.Class<X.Dqe> r2 = X.C47102Dqe.class
            java.lang.String r1 = "ig_ldp_app_store_apps"
            com.google.common.collect.ImmutableList r0 = r0.A02(r1, r2)
            if (r0 == 0) goto L_0x0794
            X.3FZ r0 = r8.A00(r7, r3)
            com.google.common.collect.ImmutableList r0 = r0.A02(r1, r2)
            java.util.Iterator r3 = r0.iterator()
        L_0x0778:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0794
            java.lang.Object r2 = r3.next()
            X.3FZ r2 = (X.AnonymousClass3FZ) r2
            java.lang.String r1 = "app_id"
            java.lang.String r0 = r2.A05(r1)
            if (r0 == 0) goto L_0x0778
            java.lang.String r0 = r2.A05(r1)
            r6.add(r0)
            goto L_0x0778
        L_0x0794:
            r0 = 1681378727(0x6437cda7, float:1.3562292E22)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -789178626(0xffffffffd0f616fe, float:-3.30296156E10)
            goto L_0x1252
        L_0x079f:
            r0 = 627720460(0x256a410c, float:2.0318303E-16)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.6p3 r8 = (X.C318496p3) r8
            r0 = 2050858001(0x7a3d9c11, float:2.4612738E35)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.C47691EDa.super.onSuccess(r8)
            if (r8 == 0) goto L_0x0863
            java.util.List r0 = r8.A00
            if (r0 == 0) goto L_0x0863
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            if (r0 == 0) goto L_0x0863
            java.lang.Object r6 = r7.A01
            X.Dib r6 = (X.C46656Dib) r6
            java.util.List r0 = r6.A0u
            if (r0 == 0) goto L_0x0863
            r0.clear()
            java.util.List r0 = r8.A00
            if (r0 == 0) goto L_0x07e5
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
        L_0x07d1:
            java.util.Iterator r2 = r0.iterator()
        L_0x07d5:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x07e7
            java.lang.Object r1 = r2.next()
            java.util.List r0 = r6.A0u
            r0.add(r1)
            goto L_0x07d5
        L_0x07e5:
            r0 = 0
            goto L_0x07d1
        L_0x07e7:
            X.E8u r7 = r6.A0i
            java.util.List r11 = r6.A0u
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>(r11)
            java.util.List r5 = r7.A00
            java.util.Iterator r13 = r5.iterator()
        L_0x07fa:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0836
            java.lang.Object r9 = r13.next()
            X.Ewi r9 = (X.C49503Ewi) r9
            com.instagram.user.model.User r8 = r9.A01
            java.util.Iterator r12 = r11.iterator()
        L_0x080c:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x07fa
            com.instagram.user.model.User r2 = X.DbT.A0k(r12)
            java.lang.String r0 = r2.getId()
            boolean r0 = X.DbV.A1Z(r8, r0)
            if (r0 == 0) goto L_0x080c
            r0 = 1
            r9.A00 = r0
            r10.remove(r2)
            com.instagram.user.model.FollowStatus r1 = r8.B6o()
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A08
            if (r1 != r0) goto L_0x080c
            com.instagram.user.model.FollowStatus r0 = r2.B6o()
            r8.A0n(r0)
            goto L_0x080c
        L_0x0836:
            boolean r0 = X.DbT.A1b(r10)
            if (r0 == 0) goto L_0x0859
            java.util.Iterator r2 = X.AnonymousClass7TE.A1G(r10)
        L_0x0840:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0859
            com.instagram.user.model.User r0 = X.DbT.A0k(r2)
            X.0qQ.A0A(r0)
            X.Ewi r1 = new X.Ewi
            r1.<init>(r0)
            r0 = 1
            r1.A00 = r0
            r5.add(r1)
            goto L_0x0840
        L_0x0859:
            X.C47582E8u.A00(r7)
            android.widget.ListView r0 = r6.A0C
            if (r0 == 0) goto L_0x0863
            X.W11.A00(r0)
        L_0x0863:
            r0 = 1755850863(0x68a8286f, float:6.3528275E24)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = -965182402(0xffffffffc6787c3e, float:-15903.061)
            goto L_0x1252
        L_0x086e:
            r0 = -177194495(0xfffffffff5703a01, float:-3.0452337E32)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = -1894194718(0xffffffff8f18e1e2, float:-7.537682E-30)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r7.A01
            X.Dib r0 = (X.C46656Dib) r0
            X.E8u r1 = r0.A0i
            r0 = -1994335474(0xffffffff8920db0e, float:-1.9362298E-33)
            X.0fE.A00(r1, r0)
            r0 = -1785914319(0xffffffff958d1c31, float:-5.6993925E-26)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = -55105043(0xfffffffffcb729ed, float:-7.6083254E36)
            goto L_0x1252
        L_0x0893:
            r0 = -1234237497(0xffffffffb66f07c7, float:-3.5618302E-6)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.DwB r8 = (X.DwB) r8
            r0 = 1875112050(0x6fc3f072, float:1.21280515E29)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r5 = r7.A01
            com.instagram.profile.edit.fragment.CompleteYourProfileFragment r5 = (com.instagram.profile.edit.fragment.CompleteYourProfileFragment) r5
            com.instagram.common.session.UserSession r0 = r5.A02
            X.17i r1 = X.17h.A00(r0)
            com.instagram.user.model.User r0 = r8.A00
            r1.A03(r0)
            com.instagram.user.model.User r0 = r5.A05
            java.lang.String r0 = r0.getUsername()
            X.FGv.A04(r0)
            com.instagram.common.session.UserSession r0 = r5.A02
            X.6qt r1 = X.C319606qt.A01(r0)
            com.instagram.user.model.User r0 = r5.A05
            r1.A0F(r0)
            boolean r0 = r5.A08
            if (r0 != 0) goto L_0x08da
            com.instagram.common.session.UserSession r0 = r5.A02
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.6ur r0 = new X.6ur
            r0.<init>(r1)
            r2.A00(r0)
        L_0x08da:
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r5.A01
            if (r0 == 0) goto L_0x08f0
            java.lang.String r7 = "profile_completion"
            r9 = 0
            java.lang.String r8 = r5.A06
            X.Xtl r6 = new X.Xtl
            r10 = r9
            r11 = r9
            r12 = r9
            r13 = r9
            r14 = r9
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r0.Ckg(r6)
        L_0x08f0:
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            if (r1 == 0) goto L_0x090b
            android.view.View r0 = r5.mView
            if (r0 == 0) goto L_0x090b
            r0 = 0
            r5.A09 = r0
            r1.onBackPressed()
            r0 = 552399341(0x20ecf1ed, float:4.0140048E-19)
        L_0x0903:
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -29090415(0xfffffffffe441d91, float:-6.517055E37)
            goto L_0x12f3
        L_0x090b:
            r0 = -1795376210(0xffffffff94fcbbae, float:-2.5519524E-26)
            goto L_0x0903
        L_0x090f:
            r0 = 1121958032(0x42dfb890, float:111.86047)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = -543725331(0xffffffffdf9768ed, float:-2.1820461E19)
            int r1 = X.AnonymousClass7TG.A0D(r8, r0)
            X.C47691EDa.super.onSuccess(r8)
            java.lang.Object r0 = r7.A01
            com.instagram.profile.edit.controller.editcontrollerbarcelona.EditProfileBarcelonaController r0 = (com.instagram.profile.edit.controller.editcontrollerbarcelona.EditProfileBarcelonaController) r0
            com.instagram.profile.edit.controller.editcontrollerbarcelona.EditProfileBarcelonaController.A00(r0)
            r0 = -1575821234(0xffffffffa212e04e, float:-1.9905436E-18)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = 1393640486(0x53114426, float:6.239136E11)
            goto L_0x1252
        L_0x0932:
            r0 = 530870933(0x1fa47295, float:6.964626E-20)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = 510344374(0x1e6b3cb6, float:1.2453351E-20)
            int r1 = X.AnonymousClass7TG.A0D(r8, r0)
            X.C47691EDa.super.onSuccess(r8)
            java.lang.Object r0 = r7.A01
            com.instagram.profile.edit.controller.editcontrollerbarcelona.EditProfileBarcelonaController r0 = (com.instagram.profile.edit.controller.editcontrollerbarcelona.EditProfileBarcelonaController) r0
            com.instagram.profile.edit.controller.editcontrollerbarcelona.EditProfileBarcelonaController.A00(r0)
            r0 = 1006650553(0x3c0044b9, float:0.007828885)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = -256438360(0xfffffffff0b70fa8, float:-4.5323747E29)
            goto L_0x1252
        L_0x0955:
            r0 = -1458796909(0xffffffffa90c8693, float:-3.120297E-14)
            int r9 = X.AnonymousClass0fD.A03(r0)
            X.3JC r8 = (X.AnonymousClass3JC) r8
            r0 = 1173580065(0x45f36921, float:7789.141)
            int r6 = X.AnonymousClass0fD.A03(r0)
            r5 = 0
            X.0qQ.A0B(r8, r5)
            java.lang.Object r4 = r7.A01
            X.G6C r4 = (X.G6C) r4
            java.lang.Object r3 = r8.A01
            X.3lr r3 = (X.C250663lr) r3
            if (r3 == 0) goto L_0x0998
            java.lang.Class<X.BmP> r2 = X.BmP.class
            r0 = 4269(0x10ad, float:5.982E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 1971766956(0x7586c6ac, float:3.416979E32)
            X.3lr r1 = r3.getOptionalTreeField(r5, r1, r2, r0)
            if (r1 == 0) goto L_0x0998
            java.lang.String r0 = "success"
            java.lang.Boolean r0 = X.C41846B3n.A0d(r1, r0, r5)
        L_0x098a:
            r4.Doc(r0)
            r0 = 1552884126(0x5c8f219e, float:3.22303073E17)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = 1395924451(0x53341de3, float:7.7359553E11)
            goto L_0x0f01
        L_0x0998:
            r0 = 0
            goto L_0x098a
        L_0x099a:
            r0 = -537249647(0xffffffffdffa3891, float:-3.606064E19)
            int r9 = X.AnonymousClass0fD.A03(r0)
            X.3JC r8 = (X.AnonymousClass3JC) r8
            r0 = -1715416918(0xffffffff99c0d0aa, float:-1.9936613E-23)
            int r6 = X.AnonymousClass0fD.A03(r0)
            r5 = 0
            X.0qQ.A0B(r8, r5)
            java.lang.Object r4 = r7.A01
            X.G6C r4 = (X.G6C) r4
            java.lang.Object r3 = r8.A01
            X.3lr r3 = (X.C250663lr) r3
            if (r3 == 0) goto L_0x09dd
            java.lang.Class<X.BmN> r2 = X.BmN.class
            r0 = 4257(0x10a1, float:5.965E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = -635104767(0xffffffffda251201, float:-1.16157917E16)
            X.3lr r1 = r3.getOptionalTreeField(r5, r1, r2, r0)
            if (r1 == 0) goto L_0x09dd
            java.lang.String r0 = "success"
            java.lang.Boolean r0 = X.C41846B3n.A0d(r1, r0, r5)
        L_0x09cf:
            r4.Doc(r0)
            r0 = -1180102172(0xffffffffb9a911e4, float:-3.224752E-4)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = -1786905258(0xffffffff957dfd56, float:-5.129279E-26)
            goto L_0x0f01
        L_0x09dd:
            r0 = 0
            goto L_0x09cf
        L_0x09df:
            r0 = -1352813392(0xffffffffaf5db4b0, float:-2.0164026E-10)
            int r9 = X.AnonymousClass0fD.A03(r0)
            X.EDn r8 = (X.C47704EDn) r8
            r0 = 1269622968(0x4bace8b8, float:2.2663536E7)
            int r6 = X.AnonymousClass0fD.A03(r0)
            X.C47691EDa.super.onSuccess(r8)
            if (r8 != 0) goto L_0x09ff
            r0 = -1915687343(0xffffffff8dd0ee51, float:-1.2876362E-30)
        L_0x09f7:
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = -1246106990(0xffffffffb5b9ea92, float:-1.3851843E-6)
            goto L_0x0f01
        L_0x09ff:
            X.Eu5 r0 = r8.A00
            if (r0 == 0) goto L_0x0a12
            java.lang.String r2 = r0.A00
            if (r2 == 0) goto L_0x0a12
            java.lang.Object r1 = r7.A01
            X.E3g r1 = (X.C47459E3g) r1
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r1.A02
            if (r0 == 0) goto L_0x0a12
            X.DbV.A1P(r1, r0, r2)
        L_0x0a12:
            java.lang.Object r7 = r7.A01
            X.E3g r7 = (X.C47459E3g) r7
            android.widget.TextView r0 = r7.A00
            if (r0 == 0) goto L_0x0a3f
            java.lang.String r0 = r8.A01
            if (r0 == 0) goto L_0x0a3f
            com.facebook.common.callercontext.CallerContext r0 = X.FRZ.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 18298162703828134(0x410215000104a6, double:1.8922175987627624E-307)
            boolean r0 = X.1AW.A06(r2, r0)
            if (r0 != 0) goto L_0x0a3f
            java.lang.String r0 = r8.A01
            r7.A06 = r0
            android.widget.TextView r3 = r7.A00
            android.content.Context r2 = r7.requireContext()
            r1 = 2131956870(0x7f131486, float:1.9550308E38)
            java.lang.String r0 = r7.A06
            X.DbX.A13(r2, r3, r0, r1)
        L_0x0a3f:
            X.0wW r5 = r7.A01
            java.lang.String r4 = "sign_up_with_biz_option"
            java.lang.String r3 = r7.A04
            java.lang.String r2 = r7.A05
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            X.0xI r1 = X.C48730EjF.A00(r0)
            java.lang.String r0 = "step"
            r1.A0C(r0, r4)
            java.lang.String r0 = "entry_point"
            r1.A0C(r0, r3)
            java.lang.String r0 = "page_id"
            r1.A0C(r0, r2)
            if (r5 == 0) goto L_0x0a65
            X.DbU.A1R(r1, r5)
            r0 = 101507868(0x60ce31c, float:2.6497927E-35)
            goto L_0x09f7
        L_0x0a65:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0a6a:
            r0 = 1887326246(0x707e5026, float:3.1482434E29)
            int r9 = X.AnonymousClass0fD.A03(r0)
            X.Dvi r8 = (X.C47348Dvi) r8
            r0 = -271626780(0xffffffffefcf4de4, float:-1.2831512E29)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.F2H r2 = r8.A00
            java.util.List r5 = r8.A01
            if (r2 == 0) goto L_0x0a99
            java.lang.Object r0 = r7.A01
            X.E3V r0 = (X.E3V) r0
            java.util.List r1 = r0.A0N
            r1.clear()
            java.util.List r0 = r2.A01
            r1.addAll(r0)
        L_0x0a8e:
            r0 = -1036714489(0xffffffffc234fe07, float:-45.248074)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 1823423709(0x6caf3cdd, float:1.6947955E27)
            goto L_0x0f01
        L_0x0a99:
            if (r5 == 0) goto L_0x0a8e
            X.1Q0 r1 = X.1Q0.A0z
            java.lang.Object r3 = r7.A01
            X.E3V r3 = (X.E3V) r3
            X.0aP r0 = r3.A01
            X.FGI r2 = r1.A02(r0)
            X.EZy r0 = X.C48156EZy.A0A
            X.DiE r1 = r0.A00
            X.EXD r0 = r3.A0F
            X.FGI.A02(r2, r0, r1)
            java.util.List r0 = r3.A0M
            r0.clear()
            r0.addAll(r5)
            goto L_0x0a8e
        L_0x0ab9:
            r0 = 570456290(0x220078e2, float:1.741123E-18)
            int r9 = X.AnonymousClass0fD.A03(r0)
            X.DvW r8 = (X.DvW) r8
            r0 = 274781287(0x1060d467, float:4.433984E-29)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r7.A01
            X.E54 r1 = (X.E54) r1
            java.lang.String r0 = X.E54.A0X
            android.view.View r1 = r1.A02
            boolean r0 = r8.A00
            int r0 = X.DbW.A01(r0)
            r1.setVisibility(r0)
            r0 = -1883814518(0xffffffff8fb7458a, float:-1.8071979E-29)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = 935971652(0x37c9cb44, float:2.405572E-5)
            goto L_0x0f01
        L_0x0ae5:
            r0 = -117494671(0xfffffffff8ff2c71, float:-4.1404284E34)
            int r9 = X.AnonymousClass0fD.A03(r0)
            X.Duh r8 = (X.C47314Duh) r8
            r0 = -14337477(0xffffffffff253a3b, float:-2.1962497E38)
            int r5 = X.AnonymousClass0fD.A03(r0)
            r6 = 0
            X.0qQ.A0B(r8, r6)
            X.DrC r0 = r8.A00
            if (r0 == 0) goto L_0x0ce3
            java.util.List r2 = r0.A00
            java.lang.Object r1 = r7.A01
            X.E2t r1 = (X.C47447E2t) r1
            boolean r0 = r1.A05
            if (r0 == 0) goto L_0x0b0f
            if (r2 == 0) goto L_0x0b2e
            int r0 = r2.size()
        L_0x0b0d:
            r1.A00 = r0
        L_0x0b0f:
            X.DmO r4 = r1.A02
            if (r4 == 0) goto L_0x0c0b
            r3 = 1
            if (r2 == 0) goto L_0x0b30
            java.util.Iterator r2 = r2.iterator()
        L_0x0b1a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0b30
            java.lang.String r0 = X.AnonymousClass7TE.A18(r2)
            java.util.HashMap r1 = r4.A02
            java.lang.Long r0 = X.DbV.A0q(r0)
            X.DbU.A1Y(r0, r1, r3)
            goto L_0x0b1a
        L_0x0b2e:
            r0 = 0
            goto L_0x0b0d
        L_0x0b30:
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x0b3c
            X.E2t r0 = r4.A0A
            r0.A02(r6)
            r4.notifyDataSetChanged()
        L_0x0b3c:
            r4.A07 = r3
            r0 = -696108458(0xffffffffd6823a56, float:-7.1593531E13)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 1973196179(0x759c9593, float:3.969883E32)
            goto L_0x0f01
        L_0x0b49:
            r0 = -401970229(0xffffffffe80a6bcb, float:-2.6147E24)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.DuZ r8 = (X.C47306DuZ) r8
            r0 = -337089583(0xffffffffebe86bd1, float:-5.6195988E26)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r5 = 0
            X.0qQ.A0B(r8, r5)
            X.Dr9 r0 = r8.A00
            if (r0 == 0) goto L_0x0ce3
            java.util.List r0 = r0.A00
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            java.lang.String r10 = "manageSubtitle"
            r9 = 0
            java.lang.Object r7 = r7.A01
            X.E2t r7 = (X.C47447E2t) r7
            if (r0 == 0) goto L_0x0bb2
            X.Dr9 r0 = r8.A00
            if (r0 == 0) goto L_0x0ce3
            java.util.List r0 = r0.A00
            java.lang.String r6 = X.DbX.A0u(r0, r5)
            r7.A04 = r6
            android.content.Context r2 = r7.getContext()
            if (r2 == 0) goto L_0x0b8b
            r1 = 2131975036(0x7f135b7c, float:1.9587153E38)
            java.lang.String r0 = r7.A04
            java.lang.String r9 = X.DbW.A0h(r2, r0, r1)
        L_0x0b8b:
            android.text.SpannableStringBuilder r2 = X.DbS.A0C(r9)
            r1 = 9
            X.Dj8 r0 = new X.Dj8
            r0.<init>(r7, r1)
            X.AnonymousClass7AV.A05(r2, r0, r6)
            android.widget.TextView r0 = r7.A01
            if (r0 == 0) goto L_0x0dfe
            r0.setText(r2)
        L_0x0ba0:
            android.widget.TextView r0 = r7.A01
            if (r0 == 0) goto L_0x0dfe
            r0.setVisibility(r5)
            r0 = 1925198095(0x72c0310f, float:7.613495E30)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 1686847159(0x648b3eb7, float:2.0548932E22)
            goto L_0x1252
        L_0x0bb2:
            android.widget.TextView r2 = r7.A01
            if (r2 == 0) goto L_0x0dfe
            android.content.Context r1 = r7.getContext()
            if (r1 == 0) goto L_0x0bc3
            r0 = 2131976059(0x7f135f7b, float:1.9589228E38)
            java.lang.String r9 = r1.getString(r0)
        L_0x0bc3:
            r2.setText(r9)
            goto L_0x0ba0
        L_0x0bc7:
            r0 = 227058292(0xd88a274, float:8.420756E-31)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.Duk r8 = (X.C47317Duk) r8
            r0 = 1500903420(0x5975f7fc, float:4.32712694E15)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r3 = 0
            X.0qQ.A0B(r8, r3)
            X.DrJ r0 = r8.A00
            if (r0 == 0) goto L_0x0ce3
            java.util.List r1 = r0.A01
            if (r1 == 0) goto L_0x0bfe
            java.lang.Object r0 = r7.A01
            X.E2t r0 = (X.C47447E2t) r0
            X.DmO r2 = r0.A02
            if (r2 == 0) goto L_0x0c0b
            r2.A03 = r1
            r1 = 1
            r2.A00 = r1
            boolean r0 = r2.A07
            if (r0 == 0) goto L_0x0bfc
            X.E2t r0 = r2.A0A
            r0.A02(r3)
            r2.notifyDataSetChanged()
        L_0x0bfc:
            r2.A04 = r1
        L_0x0bfe:
            r0 = 235625852(0xe0b5d7c, float:1.7178084E-30)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -2089433237(0xffffffff8375c76b, float:-7.222795E-37)
            X.AnonymousClass0fD.A0A(r0, r5)
            return
        L_0x0c0b:
            java.lang.String r10 = "interestAdapter"
            goto L_0x0dfe
        L_0x0c0f:
            r0 = 1608106661(0x5fd9c2a5, float:3.138257E19)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.CDX r8 = (X.CDX) r8
            r0 = -663383876(0xffffffffd87590bc, float:-1.08000791E15)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r5 = 0
            X.0qQ.A0B(r8, r5)
            X.BAs r2 = r8.A00
            if (r2 == 0) goto L_0x0ce3
            java.lang.Object r1 = r7.A01
            X.E23 r1 = (X.E23) r1
            X.0eM r0 = r1.A09
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.1E4.A00(r0)
            java.util.List r8 = r2.A00
            if (r8 == 0) goto L_0x0cd8
            X.DmQ r7 = r1.A00
            if (r7 == 0) goto L_0x0dfc
            java.util.Iterator r18 = r8.iterator()
        L_0x0c40:
            boolean r0 = r18.hasNext()
            r12 = 0
            if (r0 == 0) goto L_0x0cd0
            java.lang.Object r1 = r18.next()
            X.JwJ r1 = (X.C61081JwJ) r1
            java.lang.String r10 = r1.A01
            java.lang.String r9 = "discover_accounts"
            boolean r0 = X.0qQ.A0K(r10, r9)
            if (r0 != 0) goto L_0x0c5e
            if (r10 == 0) goto L_0x0c5e
            java.util.ArrayList r0 = r7.A0B
            r0.add(r10)
        L_0x0c5e:
            java.lang.Object r0 = r1.A00
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0c40
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r17 = r0.iterator()
        L_0x0c6c:
            boolean r0 = r17.hasNext()
            r11 = 1
            if (r0 == 0) goto L_0x0cc3
            int r16 = r12 + 1
            java.lang.Object r2 = r17.next()
            X.4hL r2 = (X.C270814hL) r2
            java.util.List r15 = r2.A01
            if (r15 == 0) goto L_0x0cba
            boolean r0 = X.AnonymousClass7TE.A1b(r15)
            if (r0 == 0) goto L_0x0cba
            com.instagram.user.model.User r14 = r2.A00
            if (r14 == 0) goto L_0x0cba
            X.1Xj r0 = X.DbZ.A0T(r15, r5)
            X.1iA r13 = r0.BR7()
            X.1iA r0 = X.1iA.A0a
            r1 = 3
            if (r13 != r0) goto L_0x0c97
            r1 = 4
        L_0x0c97:
            int r0 = r15.size()
            if (r0 != r1) goto L_0x0cba
            java.lang.String r1 = r14.getId()
            if (r10 == 0) goto L_0x0ca8
            java.util.HashMap r0 = r7.A0C
            r0.put(r1, r10)
        L_0x0ca8:
            r0 = 3
            if (r12 < r0) goto L_0x0cbd
            boolean r0 = X.0qQ.A0K(r10, r9)
            if (r0 != 0) goto L_0x0cbd
            int r0 = r8.size()
            if (r0 == r11) goto L_0x0cbd
            r6.add(r2)
        L_0x0cba:
            r12 = r16
            goto L_0x0c6c
        L_0x0cbd:
            java.util.ArrayList r0 = r7.A0B
            r0.add(r2)
            goto L_0x0cba
        L_0x0cc3:
            boolean r0 = X.DbT.A1b(r6)
            if (r0 == 0) goto L_0x0c40
            java.util.ArrayList r0 = r7.A0B
            r0.add(r6)
            goto L_0x0c40
        L_0x0cd0:
            X.E23 r0 = r7.A0A
            r0.A03(r5)
            r7.notifyDataSetChanged()
        L_0x0cd8:
            r0 = 675057294(0x283c8e8e, float:1.0467008E-14)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 1181870277(0x4671e8c5, float:15482.192)
            goto L_0x12f3
        L_0x0ce3:
            java.lang.String r10 = "response"
            goto L_0x0dfe
        L_0x0ce7:
            r0 = -523501296(0xffffffffe0cc0110, float:-1.1760039E20)
            int r9 = X.AnonymousClass0fD.A03(r0)
            X.CEn r8 = (X.C43821CEn) r8
            r0 = -1441901326(0xffffffffaa0e54f2, float:-1.2641605E-13)
            int r5 = X.AnonymousClass0fD.A03(r0)
            r6 = 0
            X.0qQ.A0B(r8, r6)
            X.DrL r1 = r8.FH3()
            java.lang.Object r8 = r7.A01
            X.E23 r8 = (X.E23) r8
            X.0eM r7 = r8.A09
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r7)
            X.1E4.A00(r0)
            java.util.List r2 = r1.A00
            if (r2 == 0) goto L_0x0e0e
            X.0lg r3 = X.DbT.A0X(r7)
            X.0Tu r4 = X.0Tu.A06
            r0 = 36597579538107226(0x82054e00020b5a, double:3.207794894298786E-306)
            int r10 = X.DbS.A04(r4, r3, r0)
            X.0lg r3 = X.DbT.A0X(r7)
            r0 = 36597579538172763(0x82054e00030b5b, double:3.2077948943402316E-306)
            int r1 = X.DbS.A04(r4, r3, r0)
            X.DmQ r8 = r8.A00
            if (r8 == 0) goto L_0x0dfc
            r0 = 1
            r8.A05 = r0
            r8.A00 = r1
            java.util.Iterator r3 = r2.iterator()
            r1 = 0
        L_0x0d3a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0d63
            java.lang.Object r0 = r3.next()
            X.Dse r0 = (X.C47192Dse) r0
            X.Dre r0 = r0.A00
            if (r0 == 0) goto L_0x0d3a
            java.util.List r0 = r0.A01
            if (r0 == 0) goto L_0x0d3a
            java.lang.Object r0 = X.00k.A0O(r0, r6)
            X.N5K r0 = (X.N5K) r0
            if (r0 == 0) goto L_0x0d3a
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x0d3a
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x0d3a
            int r1 = r1 + 1
            goto L_0x0d3a
        L_0x0d63:
            int r7 = r1 + -1
            java.util.Iterator r17 = r2.iterator()
            r4 = 0
        L_0x0d6a:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0e06
            java.lang.Object r12 = r17.next()
            X.Dse r12 = (X.C47192Dse) r12
            X.Dre r0 = r12.A00
            if (r0 == 0) goto L_0x0d6a
            java.util.List r0 = r0.A01
            if (r0 == 0) goto L_0x0d6a
            java.lang.Object r0 = X.00k.A0O(r0, r6)
            X.N5K r0 = (X.N5K) r0
            if (r0 == 0) goto L_0x0d6a
            java.util.List r2 = r0.A00
            if (r2 == 0) goto L_0x0d6a
            boolean r0 = X.AnonymousClass7TE.A1b(r2)
            if (r0 == 0) goto L_0x0d6a
            java.lang.String r1 = r12.A02
            if (r1 == 0) goto L_0x0d99
            java.util.ArrayList r0 = r8.A0B
            r0.add(r1)
        L_0x0d99:
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r16 = r2.iterator()
            r13 = 0
        L_0x0da2:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0ded
            int r15 = r13 + 1
            java.lang.Object r11 = r16.next()
            X.Dt4 r11 = (X.C47217Dt4) r11
            com.instagram.user.model.User r14 = r11.A00
            if (r14 == 0) goto L_0x0de0
            java.lang.String r2 = r11.A03
            if (r2 == 0) goto L_0x0dc1
            java.util.HashMap r1 = r8.A0C
            java.lang.String r0 = r14.getId()
            r1.put(r0, r2)
        L_0x0dc1:
            java.lang.String r1 = r12.A01
            java.lang.String r0 = "From your contacts"
            boolean r0 = X.0qQ.A0K(r1, r0)
            java.util.HashMap r2 = r8.A0D
            java.lang.String r1 = r14.getId()
            if (r0 == 0) goto L_0x0de8
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0dd6:
            r2.put(r1, r0)
            if (r13 < r10) goto L_0x0de2
            if (r4 == r7) goto L_0x0de2
            r3.add(r11)
        L_0x0de0:
            r13 = r15
            goto L_0x0da2
        L_0x0de2:
            java.util.ArrayList r0 = r8.A0B
            r0.add(r11)
            goto L_0x0de0
        L_0x0de8:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            goto L_0x0dd6
        L_0x0ded:
            boolean r0 = X.DbT.A1b(r3)
            if (r0 == 0) goto L_0x0df8
            java.util.ArrayList r0 = r8.A0B
            r0.add(r3)
        L_0x0df8:
            int r4 = r4 + 1
            goto L_0x0d6a
        L_0x0dfc:
            java.lang.String r10 = "interestAccountsAdapter"
        L_0x0dfe:
            X.0qQ.A0F(r10)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0e06:
            X.E23 r0 = r8.A0A
            r0.A03(r6)
            r8.notifyDataSetChanged()
        L_0x0e0e:
            r0 = -2038137537(0xffffffff86847d3f, float:-4.9836914E-35)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 1307296501(0x4debc2f5, float:4.94427808E8)
            goto L_0x0f01
        L_0x0e19:
            r0 = 915767275(0x36957feb, float:4.4554376E-6)
            int r2 = X.AnonymousClass0fD.A03(r0)
            r0 = -1419731700(0xffffffffab609d0c, float:-7.9798733E-13)
            int r1 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r5 = r7.A01
            X.DuF r5 = (X.C47286DuF) r5
            boolean r0 = r5.A04
            if (r0 == 0) goto L_0x0e43
            com.instagram.common.session.UserSession r0 = r5.A00
            X.6qt r3 = X.C319606qt.A01(r0)
            com.instagram.common.session.UserSession r6 = r5.A00
            java.lang.String r8 = r6.A06
            r9 = 1
            java.lang.Integer r7 = X.AnonymousClass05K.A03
            android.content.Context r4 = r5.getContext()
            r3.A09(r4, r5, r6, r7, r8, r9)
        L_0x0e43:
            android.view.View r0 = r5.requireView()
            X.0nA.A0N(r0)
            X.G8t r0 = X.C49047EoR.A00(r5)
            X.Dba.A1O(r0)
            r0 = -1524618303(0xffffffffa5202bc1, float:-1.3892612E-16)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = -297046561(0xffffffffee4b6ddf, float:-1.5739571E28)
            goto L_0x0fc2
        L_0x0e5c:
            r0 = -1381334484(0xffffffffadaa822c, float:-1.938457E-11)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.DvA r8 = (X.DvA) r8
            r0 = -1246381027(0xffffffffb5b5bc1d, float:-1.3540299E-6)
            int r9 = X.AnonymousClass0fD.A03(r0)
            java.lang.String r0 = r8.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.Object r6 = r7.A01
            X.E3Y r6 = (X.E3Y) r6
            if (r0 != 0) goto L_0x0eb2
            java.lang.String r5 = r8.A00
            r0 = 10
            X.FJh r4 = new X.FJh
            r4.<init>((java.lang.String) r5, (java.lang.Object) r6, (int) r0)
            r0 = 59
            X.FJf r3 = X.C50020FJf.A00(r6, r0)
            X.8ab r1 = X.Dba.A0I(r6)
            r0 = 2131973891(0x7f135703, float:1.958483E38)
            java.lang.String r0 = X.DbV.A0z(r6, r5, r0)
            r1.A0q(r0)
            r0 = 2131976948(0x7f1362f4, float:1.959103E38)
            r1.A0I(r4, r0)
            r0 = 2131968381(0x7f13417d, float:1.9573655E38)
            r1.A0H(r3, r0)
            X.DbT.A1V(r1)
        L_0x0ea4:
            X.C47691EDa.super.onSuccess(r8)
            r0 = -894326672(0xffffffffcab1a870, float:-5821496.0)
            X.AnonymousClass0fD.A0A(r0, r9)
            r0 = -398960235(0xffffffffe8385995, float:-3.4822717E24)
            goto L_0x0fc2
        L_0x0eb2:
            X.E3Y.A03(r6)
            goto L_0x0ea4
        L_0x0eb6:
            r0 = -912196693(0xffffffffc9a0fbab, float:-1318773.4)
            int r9 = X.AnonymousClass0fD.A03(r0)
            r0 = -1206124291(0xffffffffb81c00fd, float:-3.719422E-5)
            int r10 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r8 = r7.A01
            X.E77 r8 = (X.E77) r8
            com.instagram.common.session.UserSession r7 = r8.getSession()
            X.DiE r0 = X.C46634DiE.A08
            boolean r6 = X.AnonymousClass7TG.A1Z(r7, r0)
            double r4 = X.DbS.A01()
            double r2 = X.DbS.A00()
            X.0wc r1 = X.AnonymousClass0kN.A02(r7)
            java.lang.String r0 = "save_additional_phone_success"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            X.Dbc.A0X(r1, r4, r2)
            java.lang.String r0 = "additional_contact"
            X.DbZ.A1J(r1, r0)
            X.FH8.A09(r1, r7)
            X.DbT.A1P(r1)
            r1.Cgf()
            X.E77.A00(r8, r6)
            r0 = -1761795632(0xffffffff96fd21d0, float:-4.0895693E-25)
            X.AnonymousClass0fD.A0A(r0, r10)
            r0 = 1844824036(0x6df5c7e4, float:9.508185E27)
        L_0x0f01:
            X.AnonymousClass0fD.A0A(r0, r9)
            return
        L_0x0f05:
            r0 = 1207240706(0x47f50802, float:125456.016)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.Dvh r8 = (X.C47347Dvh) r8
            r0 = -1921583326(0xffffffff8d76f722, float:-7.610208E-31)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r6 = r7.A01
            X.ENo r6 = (X.C47937ENo) r6
            com.instagram.registration.model.RegFlowExtras r7 = r6.A01
            boolean r0 = r8.A00
            r7.A0s = r0
            if (r0 == 0) goto L_0x0f4b
            boolean r0 = r8.A01
            r7.A0v = r0
            int r4 = r6.A02
            int r0 = r6.A01
            int r3 = r0 + 1
            int r1 = r6.A00
            com.instagram.registration.model.UserBirthDate r0 = new com.instagram.registration.model.UserBirthDate
            r0.<init>()
            r0.A02 = r4
            r0.A01 = r3
            r0.A00 = r1
            r7.A03 = r0
            X.EZy r0 = X.C48156EZy.A09
            X.DiE r0 = r0.A00
            r6.A03(r0)
        L_0x0f41:
            r0 = 1759920181(0x68e64035, float:8.6986296E24)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 2085590380(0x7c4f956c, float:4.3113443E36)
            goto L_0x0fc2
        L_0x0f4b:
            int r4 = r6.A02
            int r3 = r6.A01
            int r1 = r6.A00
            java.lang.String r0 = r7.A0J
            r6.A04(r0, r4, r3, r1)
            goto L_0x0f41
        L_0x0f57:
            r0 = -567209142(0xffffffffde31134a, float:-3.18990588E18)
            int r2 = X.AnonymousClass0fD.A03(r0)
            r0 = -73364864(0xfffffffffba08a80, float:-1.6671532E36)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r7 = r7.A01
            X.E20 r7 = (X.E20) r7
            X.0wW r8 = r7.A01
            com.instagram.common.session.UserSession r8 = (com.instagram.common.session.UserSession) r8
            java.lang.String r6 = r7.A03
            com.google.common.collect.ImmutableList$Builder r1 = com.google.common.collect.ImmutableList.builder()
            X.EZY r0 = X.EZY.NAME
            r1.add(r0)
            X.Dkp r0 = r7.A02
            com.instagram.common.typedurl.ImageUrl r0 = r0.A01
            boolean r0 = X.C253833rU.A02(r0)
            if (r0 != 0) goto L_0x0f87
            X.EZY r0 = X.EZY.PROFILE_PHOTO
            r1.add(r0)
        L_0x0f87:
            com.google.common.collect.ImmutableList r4 = r1.build()
            com.google.common.collect.ImmutableList$Builder r3 = com.google.common.collect.ImmutableList.builder()
            X.EWu r1 = X.C48128EWu.FACEBOOK
            r3.add(r1)
            X.Dkp r0 = r7.A02
            com.instagram.common.typedurl.ImageUrl r0 = r0.A01
            boolean r0 = X.C253833rU.A02(r0)
            if (r0 != 0) goto L_0x0fa1
            r3.add(r1)
        L_0x0fa1:
            com.google.common.collect.ImmutableList r1 = r3.build()
            r0 = 0
            X.0qQ.A0B(r8, r0)
            X.AnonymousClass7TG.A1U(r6, r4, r1)
            java.util.HashMap r1 = X.FGS.A00(r4, r1)
            java.lang.String r0 = "cp_sync_success"
            X.FGS.A03(r8, r0, r6, r1)
            r0 = 1
            X.E20.A01(r7, r0)
            r0 = -906451881(0xffffffffc9f8a457, float:-2036874.9)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -1032684645(0xffffffffc2727b9b, float:-60.62071)
        L_0x0fc2:
            X.AnonymousClass0fD.A0A(r0, r2)
            return
        L_0x0fc6:
            r0 = 2049521377(0x7a2936e1, float:2.1965281E35)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.3JC r8 = (X.AnonymousClass3JC) r8
            r0 = 1984544974(0x7649c0ce, float:1.02301E33)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r6 = r7.A01
            X.E20 r6 = (X.E20) r6
            X.2YN r1 = X.DbW.A0F(r6)
            java.lang.Class<X.Dkp> r0 = X.C46762Dkp.class
            X.2YL r1 = r1.A00(r0)
            X.Dkp r1 = (X.C46762Dkp) r1
            r6.A02 = r1
            r5 = 0
            X.0qQ.A0B(r8, r5)
            java.lang.Object r7 = r8.A01
            java.lang.String r8 = "Required value was null."
            if (r7 == 0) goto L_0x1296
            X.3FZ r7 = (X.AnonymousClass3FZ) r7
            java.lang.Class<X.Dqc> r2 = X.C47100Dqc.class
            r0 = 4797(0x12bd, float:6.722E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.3FZ r7 = r7.A00(r2, r0)
            if (r7 == 0) goto L_0x1291
            java.lang.Class<X.Dqb> r2 = X.C47099Dqb.class
            java.lang.String r0 = "fx_ig_nux_config"
            X.3FZ r7 = r7.A00(r2, r0)
            if (r7 == 0) goto L_0x128c
            java.lang.Class<X.DqZ> r2 = X.C47097DqZ.class
            java.lang.String r0 = "content"
            X.3FZ r8 = r7.A00(r2, r0)
            java.lang.Class<X.Dqa> r2 = X.C47098Dqa.class
            java.lang.String r0 = "error"
            X.3FZ r2 = r7.A00(r2, r0)
            if (r8 == 0) goto L_0x1277
            java.lang.Class<X.DqX> r2 = X.DqX.class
            java.lang.String r0 = "card_content"
            X.3FZ r7 = r8.A00(r2, r0)
            java.lang.Class<X.DqY> r2 = X.C47096DqY.class
            java.lang.String r0 = "footer_content"
            X.3FZ r2 = r8.A00(r2, r0)
            if (r7 == 0) goto L_0x1098
            if (r2 == 0) goto L_0x1098
            java.lang.String r0 = "title"
            java.lang.String r0 = r8.A05(r0)
            r1.A0B = r0
            java.lang.String r0 = "body"
            java.lang.String r0 = r8.A05(r0)
            r1.A02 = r0
            java.lang.String r0 = "accounts_to_sync"
            com.google.common.collect.ImmutableList r0 = r8.A01(r0)
            r1.A00 = r0
            java.lang.String r0 = "preview_label_text"
            java.lang.String r0 = r7.A05(r0)
            r1.A08 = r0
            java.lang.String r0 = "facebook_name"
            java.lang.String r0 = r7.A05(r0)
            r1.A05 = r0
            java.lang.String r0 = "facebook_profile_picture_url"
            java.lang.String r0 = r7.A05(r0)
            if (r0 == 0) goto L_0x1274
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.DbS.A0V(r0)
        L_0x1066:
            r1.A01 = r0
            java.lang.String r0 = "disclosure_text"
            java.lang.String r0 = r2.A05(r0)
            r1.A03 = r0
            java.lang.String r0 = "learn_more_text"
            java.lang.String r0 = r2.A05(r0)
            r1.A07 = r0
            java.lang.String r0 = "help_center_url"
            java.lang.String r0 = r2.A05(r0)
            r1.A06 = r0
            r0 = 98
            java.lang.String r0 = X.Pxd.A00(r0)
            java.lang.String r0 = r2.A05(r0)
            r1.A09 = r0
            r0 = 267(0x10b, float:3.74E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            java.lang.String r0 = r2.A05(r0)
            r1.A0A = r0
        L_0x1098:
            X.1ZF r1 = X.C48916EmG.A00()
            android.view.Window r0 = X.DbV.A0G(r6)
            r1.A01(r0)
            X.Dkp r1 = r6.A02
            java.lang.String r0 = r1.A04
            if (r0 != 0) goto L_0x1260
            java.lang.String r0 = r1.A02
            if (r0 == 0) goto L_0x1260
            X.0wW r2 = r6.A01
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.String r1 = r6.A03
            boolean r8 = X.AnonymousClass7TF.A1U(r5, r2, r1)
            java.lang.String r0 = "cp_upsell_config_fetch_success"
            r7 = 0
            X.FGS.A03(r2, r0, r1, r7)
            android.view.ViewStub r0 = r6.A00
            android.view.View r9 = r0.inflate()
            r0 = 2131442865(0x7f0b3cb1, float:1.8507782E38)
            android.widget.TextView r1 = X.Dba.A07(r9, r0)
            X.Dkp r0 = r6.A02
            java.lang.String r0 = r0.A0B
            r0.getClass()
            r1.setText(r0)
            r0 = 2131428824(0x7f0b05d8, float:1.8479303E38)
            android.widget.TextView r13 = X.Dba.A07(r9, r0)
            X.Dkp r0 = r6.A02
            java.lang.String r1 = r0.A02
            r1.getClass()
            X.Dkp r0 = r6.A02
            java.lang.String r11 = r0.A05
            r11.getClass()
            int r10 = r1.indexOf(r11)
            android.text.SpannableStringBuilder r2 = X.DbS.A0C(r1)
            android.text.style.StyleSpan r1 = new android.text.style.StyleSpan
            r1.<init>(r8)
            java.util.regex.Pattern r0 = X.0mp.A01
            int r0 = r11.length()
            int r0 = r0 + r10
            r12 = 33
            r2.setSpan(r1, r10, r0, r12)
            r13.setText(r2)
            r0 = 2131434011(0x7f0b1a1b, float:1.8489824E38)
            android.widget.TextView r1 = X.Dba.A07(r9, r0)
            X.Dkp r0 = r6.A02
            java.lang.String r0 = r0.A08
            r0.getClass()
            r1.setText(r0)
            r0 = 2131434789(0x7f0b1d25, float:1.8491402E38)
            android.view.View r10 = X.DbU.A0B(r9, r0)
            r0 = 2131428394(0x7f0b042a, float:1.8478431E38)
            android.view.View r2 = X.DbU.A0B(r10, r0)
            com.instagram.common.ui.widget.imageview.IgImageView r2 = (com.instagram.common.ui.widget.imageview.IgImageView) r2
            X.0wW r0 = r6.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            com.instagram.user.model.User r11 = X.DbT.A0j(r0)
            X.Dkp r0 = r6.A02
            com.instagram.common.typedurl.ImageUrl r1 = r0.A01
            boolean r0 = X.C253833rU.A02(r1)
            if (r0 == 0) goto L_0x125b
            android.content.Context r1 = r6.requireContext()
            r0 = 2131239607(0x7f0822b7, float:1.8095526E38)
            X.DbU.A13(r1, r2, r0)
        L_0x1142:
            r0 = 2131428567(0x7f0b04d7, float:1.8478782E38)
            android.view.View r2 = X.DbU.A0B(r10, r0)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            android.content.Context r1 = r6.requireContext()
            r0 = 2131237511(0x7f081a87, float:1.8091275E38)
            X.DbU.A13(r1, r2, r0)
            r0 = 2131427440(0x7f0b0070, float:1.8476496E38)
            android.widget.TextView r2 = X.Dba.A07(r10, r0)
            java.lang.String r1 = r11.getFullName()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x116a
            java.lang.String r1 = r11.getUsername()
        L_0x116a:
            r1.getClass()
            r2.setText(r1)
            r0 = 2131427439(0x7f0b006f, float:1.8476494E38)
            android.widget.TextView r1 = X.Dba.A07(r10, r0)
            r0 = 2131951730(0x7f130072, float:1.9539883E38)
            r1.setText(r0)
            r0 = 2131432571(0x7f0b147b, float:1.8486903E38)
            android.view.View r2 = X.DbU.A0B(r9, r0)
            r0 = 2131428394(0x7f0b042a, float:1.8478431E38)
            android.view.View r10 = X.DbU.A0B(r2, r0)
            com.instagram.common.ui.widget.imageview.IgImageView r10 = (com.instagram.common.ui.widget.imageview.IgImageView) r10
            X.Dkp r0 = r6.A02
            com.instagram.common.typedurl.ImageUrl r1 = r0.A01
            boolean r0 = X.C253833rU.A02(r1)
            if (r0 == 0) goto L_0x1256
            android.content.Context r1 = r6.requireContext()
            r0 = 2131239607(0x7f0822b7, float:1.8095526E38)
            X.DbU.A13(r1, r10, r0)
        L_0x11a1:
            r0 = 2131428567(0x7f0b04d7, float:1.8478782E38)
            android.view.View r10 = X.DbU.A0B(r2, r0)
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            android.content.Context r1 = r6.requireContext()
            r0 = 2131231787(0x7f08042b, float:1.8079665E38)
            X.DbU.A13(r1, r10, r0)
            r0 = 2131427440(0x7f0b0070, float:1.8476496E38)
            android.widget.TextView r1 = X.Dba.A07(r2, r0)
            X.Dkp r0 = r6.A02
            java.lang.String r0 = r0.A05
            r0.getClass()
            r1.setText(r0)
            r0 = 2131427439(0x7f0b006f, float:1.8476494E38)
            android.widget.TextView r1 = X.Dba.A07(r2, r0)
            r0 = 2131961885(0x7f13281d, float:1.956048E38)
            r1.setText(r0)
            r0 = 2131431906(0x7f0b11e2, float:1.8485554E38)
            android.widget.TextView r1 = X.Dba.A07(r9, r0)
            X.Dkp r0 = r6.A02
            java.lang.String r0 = r0.A03
            r0.getClass()
            r1.setText(r0)
            r0 = 2131435356(0x7f0b1f5c, float:1.8492552E38)
            android.widget.TextView r11 = X.Dba.A07(r9, r0)
            X.Dkp r0 = r6.A02
            java.lang.String r10 = r0.A06
            r10.getClass()
            X.Dkp r0 = r6.A02
            java.lang.String r1 = r0.A07
            r1.getClass()
            r0 = 3
            X.DjE r2 = new X.DjE
            r2.<init>(r10, r6, r0)
            android.text.SpannableStringBuilder r1 = X.DbS.A0C(r1)
            int r0 = r1.length()
            r1.setSpan(r2, r5, r0, r12)
            X.DbX.A1G(r11, r1)
            r0 = 2131438169(0x7f0b2a59, float:1.8498257E38)
            android.widget.TextView r1 = X.Dba.A07(r9, r0)
            X.Dkp r0 = r6.A02
            java.lang.String r0 = r0.A09
            r0.getClass()
            r1.setText(r0)
            r0 = 12
            X.FP0.A00(r1, r0, r6)
            r0 = 2131440852(0x7f0b34d4, float:1.85037E38)
            android.widget.TextView r1 = X.Dba.A07(r9, r0)
            X.Dkp r0 = r6.A02
            java.lang.String r0 = r0.A0A
            r0.getClass()
            r1.setText(r0)
            r0 = 13
            X.FP0.A00(r1, r0, r6)
            X.0wW r2 = r6.A01
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.String r1 = r6.A03
            X.0qQ.A0B(r2, r5)
            X.0qQ.A0B(r1, r8)
            java.lang.String r0 = "cp_upsell_screen_shown"
            X.FGS.A03(r2, r0, r1, r7)
        L_0x1249:
            r0 = 340325417(0x1448f429, float:1.0145572E-26)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 1467836989(0x577d6a3d, float:2.78632732E14)
        L_0x1252:
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        L_0x1256:
            r10.setUrl(r1, r6)
            goto L_0x11a1
        L_0x125b:
            r2.setUrl(r1, r6)
            goto L_0x1142
        L_0x1260:
            X.0wW r5 = r6.A01
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.String r2 = r6.A03
            X.AnonymousClass7TF.A1H(r5, r2)
            java.lang.String r1 = "cp_upsell_config_fetch_failed"
            r0 = 0
            X.FGS.A03(r5, r1, r2, r0)
            r0 = -1
            X.E20.A01(r6, r0)
            goto L_0x1249
        L_0x1274:
            r0 = 0
            goto L_0x1066
        L_0x1277:
            if (r2 == 0) goto L_0x1098
            java.lang.String r0 = "message"
            java.lang.String r0 = r2.A05(r0)
            r1.A04 = r0
            r0 = 38
            java.lang.String r0 = X.Pxd.A00(r0)
            r2.A05(r0)
            goto L_0x1098
        L_0x128c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x1291:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x1296:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x129b:
            r0 = 2114479543(0x7e0865b7, float:4.5325785E37)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.Dv8 r8 = (X.Dv8) r8
            r0 = 1745719966(0x680d929e, float:2.674233E24)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.util.List r0 = r8.A00
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r4 = r0.iterator()
        L_0x12b5:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x12ce
            java.lang.Object r0 = r4.next()
            X.EwN r0 = (X.C49482EwN) r0
            X.F1D r2 = r0.A00
            java.lang.String r1 = r0.A01
            X.ENO r0 = new X.ENO
            r0.<init>(r2, r1)
            r6.add(r0)
            goto L_0x12b5
        L_0x12ce:
            java.lang.Object r1 = r7.A01
            X.FFu r1 = (X.C49941FFu) r1
            java.lang.Object r2 = r1.A07
            monitor-enter(r2)
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1D(r6)     // Catch:{ all -> 0x12fb }
            r1.A01 = r0     // Catch:{ all -> 0x12fb }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x12fb }
            monitor-exit(r2)     // Catch:{ all -> 0x12fb }
            if (r0 != 0) goto L_0x12f7
            java.util.concurrent.CopyOnWriteArrayList r0 = r1.A04
            r0.getClass()
            r1.A03(r6, r0)
        L_0x12ea:
            r0 = -433049090(0xffffffffe63031fe, float:-2.0801467E23)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 971377179(0x39e60a1b, float:4.3876548E-4)
        L_0x12f3:
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        L_0x12f7:
            X.C49941FFu.A02(r1)
            goto L_0x12ea
        L_0x12fb:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x12fb }
            r0 = -2078807731(0xffffffff8417e94d, float:-1.7857091E-36)
            X.AnonymousClass0fD.A0A(r0, r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47691EDa.onSuccess(java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        if (33 - this.A00 != 0) {
            C47691EDa.super.onSuccessInBackground(obj);
            return;
        }
        int A03 = AnonymousClass0fD.A03(158571000);
        AnonymousClass0fD.A0A(-590082544, AnonymousClass0fD.A03(2114962022));
        AnonymousClass0fD.A0A(-248099578, A03);
    }
}

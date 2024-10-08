package X;

import android.content.Context;
import android.os.Handler;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.business.BusinessInfo;
import com.instagram.model.business.PublicPhoneContact;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.Map;

public final class EDZ extends 1P0 {
    public ERP A00;
    public final Context A01;
    public final 0hq A02;
    public final AnonymousClass0aP A03;
    public final G69 A04;
    public final EXD A05;
    public final /* synthetic */ Handler A06;
    public final /* synthetic */ AnonymousClass4DH A07;
    public final /* synthetic */ 0lg A08;
    public final /* synthetic */ BusinessInfo A09;
    public final /* synthetic */ EXD A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;

    public EDZ(Context context, Handler handler, 0hq r3, AnonymousClass4DH r4, AnonymousClass0aP r5, 0lg r6, BusinessInfo businessInfo, G69 g69, EXD exd, EXD exd2, String str, String str2) {
        this.A08 = r6;
        this.A09 = businessInfo;
        this.A0C = str;
        this.A06 = handler;
        this.A07 = r4;
        this.A0A = exd2;
        this.A0B = str2;
        this.A01 = context;
        this.A03 = r5;
        this.A02 = r3;
        this.A04 = g69;
        this.A05 = exd;
    }

    public static void A00(EDZ edz, UserSession userSession, DwQ dwQ) {
        ERP erp = edz.A00;
        if (erp != null) {
            erp.A08();
        }
        if (dwQ.A05) {
            synchronized (C49917FEr.A00()) {
            }
            AnonymousClass4DH r3 = edz.A07;
            G8D activity = r3.getActivity();
            if (activity instanceof G8D) {
                Dba.A1P(activity);
            }
            C46413Dea.A05(r3.requireActivity(), 0cp.A03(002.A0R("instagram://professional_signup_nux?entry_point=", edz.A0B)), r3, userSession);
            C49843F9i.A00 = null;
            C49913FEl.A02(r3.requireContext());
            return;
        }
        User A0j = DbT.A0j(userSession);
        A0j.A03.Ecx(0);
        DbY.A1P(A0j);
        edz.A06.post(new C51343Fsb(edz, userSession));
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(1940633790);
        DwQ dwQ = (DwQ) obj;
        int A033 = AnonymousClass0fD.A03(493414084);
        User user = dwQ.A01;
        user.A03.Ek2(dwQ.A02);
        boolean z = dwQ.A05;
        AnonymousClass0aP r2 = this.A03;
        if (z) {
            String id = user.getId();
            String str = this.A05.A00;
            0qQ.A0B(r2, 0);
            C49216ErL.A00(r2, (C49922FEx) null, "done", id, str, "business", (String) null);
        } else {
            String id2 = user.getId();
            String str2 = this.A05.A00;
            AnonymousClass7TG.A1N(r2, str2);
            C49222ErR.A00(r2, (Integer) null, str2, "business", id2, (String) null).Cgf();
        }
        String id3 = user.getId();
        0lg r7 = this.A08;
        String str3 = null;
        if (182.A06(0Tu.A05, r7, 36315434546564271L)) {
            BusinessFlowAnalyticsLogger A012 = C319596qs.A01(C319586qr.BUSINESS_SIGNUP_FLOW, r7, "business_account_creation", AnonymousClass7TF.A0b());
            BusinessInfo businessInfo = this.A09;
            String str4 = businessInfo.A0J;
            PublicPhoneContact publicPhoneContact = businessInfo.A01;
            if (publicPhoneContact != null) {
                str3 = publicPhoneContact.A02;
            }
            String str5 = businessInfo.A0B;
            String str6 = this.A0C;
            String str7 = businessInfo.A09;
            CallerContext callerContext = FRR.A00;
            HashMap A1E = AnonymousClass7TE.A1E();
            A1E.put("email", str5);
            A1E.put("phone", str3);
            A1E.put("page_id", str4);
            A1E.put(C46476Dff.A01(), str6);
            A1E.put("category_id", str7);
            A1E.put("personal_ig_id", 0Gl.A02(r7));
            A1E.put("new_created_business_ig_id", id3);
            if (A012 != null) {
                C49917FEr.A00();
                C49917FEr.A00();
                A012.Ckg(new C22030Xtl((String) null, (String) null, (String) null, (String) null, (String) null, (Map) null, A1E, (Map) null));
            }
        } else {
            C49917FEr.A00();
            C49917FEr.A00();
            String str8 = this.A0C;
            BusinessInfo businessInfo2 = this.A09;
            String str9 = businessInfo2.A0J;
            PublicPhoneContact publicPhoneContact2 = businessInfo2.A01;
            if (publicPhoneContact2 != null) {
                str3 = publicPhoneContact2.A02;
            }
            String str10 = businessInfo2.A0B;
            String str11 = businessInfo2.A09;
            String A022 = 0Gl.A02(r7);
            0xI A002 = C48730EjF.A00(AnonymousClass05K.A01);
            A002.A0C("step", (String) null);
            A002.A0C(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, (String) null);
            A002.A0C("fb_user_id", (String) null);
            A002.A0C("personal_ig_id", A022);
            A002.A0C("new_created_business_ig_id", id3);
            0xF r1 = new 0xF();
            0xF.A00(r1, str10, "email");
            0xF.A00(r1, str3, "phone");
            0xF.A00(r1, (Object) null, "address");
            0xF.A00(r1, str9, "page_id");
            0xF.A00(r1, str8, C46476Dff.A01());
            0xF.A00(r1, str11, "category_id");
            0xF.A00(r1, (Object) null, "date_of_birth");
            A002.A05(r1, "selected_values");
            if (r7 != null) {
                DbU.A1R(A002, r7);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        UserSession A023 = C46413Dea.A02(this.A01, (AnonymousClass0iw) null, r2, user, (String) null, false);
        if (dwQ.A06) {
            1ES.A03(new FZ8(0, this, A023, dwQ));
        } else {
            A00(this, A023, dwQ);
        }
        AnonymousClass0fD.A0A(-1369955861, A033);
        AnonymousClass0fD.A0A(-658391784, A032);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFail(X.C268654dm r13) {
        /*
            r12 = this;
            r0 = -604137315(0xffffffffdbfd989d, float:-1.42761938E17)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.ERP r0 = r12.A00
            if (r0 == 0) goto L_0x000e
            r0.A08()
        L_0x000e:
            boolean r0 = r13 instanceof X.C268674do
            if (r0 == 0) goto L_0x00cc
            java.lang.Object r2 = r13.A00()
            X.DwQ r2 = (X.DwQ) r2
            X.FAD r0 = r2.A00
            if (r0 == 0) goto L_0x00c9
            java.lang.String r5 = r0.A01
        L_0x001e:
            if (r0 == 0) goto L_0x00c6
            java.lang.String r4 = r0.A00
        L_0x0022:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x002a
            java.lang.String r4 = r2.mErrorSource
        L_0x002a:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x0034
            java.lang.String r4 = r2.getErrorMessage()
        L_0x0034:
            X.G69 r1 = r12.A04
            boolean r0 = r2.isFeedbackRequired()
            if (r0 != 0) goto L_0x00e4
            if (r1 == 0) goto L_0x00e4
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x0040:
            r1.EuV(r4, r0)
        L_0x0043:
            X.0lg r2 = r12.A08
            X.C49917FEr.A00()
            r7 = 0
            X.C49917FEr.A00()
            com.instagram.model.business.BusinessInfo r1 = r12.A09
            java.lang.String r9 = r1.A0J
            com.instagram.model.business.PublicPhoneContact r0 = r1.A01
            if (r0 == 0) goto L_0x00c4
            java.lang.String r10 = r0.A02
        L_0x0056:
            java.lang.String r11 = r1.A0B
            java.lang.String r8 = r1.A09
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            X.0xI r1 = X.C48730EjF.A00(r0)
            java.lang.String r0 = "step"
            r1.A0C(r0, r7)
            java.lang.String r0 = "entry_point"
            r1.A0C(r0, r7)
            java.lang.String r0 = "fb_user_id"
            r1.A0C(r0, r7)
            X.0xF r6 = new X.0xF
            r6.<init>()
            java.lang.String r0 = "email"
            X.0xF.A00(r6, r11, r0)
            java.lang.String r0 = "phone"
            X.0xF.A00(r6, r10, r0)
            java.lang.String r0 = "address"
            X.0xF.A00(r6, r7, r0)
            java.lang.String r0 = "page_id"
            X.0xF.A00(r6, r9, r0)
            java.lang.String r0 = X.C46476Dff.A01()
            X.0xF.A00(r6, r7, r0)
            java.lang.String r0 = "category_id"
            X.0xF.A00(r6, r8, r0)
            java.lang.String r0 = "date_of_birth"
            X.0xF.A00(r6, r7, r0)
            java.lang.String r0 = "selected_values"
            r1.A05(r6, r0)
            if (r5 == 0) goto L_0x00ab
            int r0 = r5.length()
            if (r0 == 0) goto L_0x00ab
            java.lang.String r0 = "error_identifier"
            r1.A0C(r0, r4)
        L_0x00ab:
            if (r4 == 0) goto L_0x00b8
            int r0 = r4.length()
            if (r0 == 0) goto L_0x00b8
            java.lang.String r0 = "error_message"
            r1.A0C(r0, r4)
        L_0x00b8:
            if (r2 == 0) goto L_0x00f2
            X.DbU.A1R(r1, r2)
            r0 = -1814569248(0xffffffff93d7dee0, float:-5.4493402E-27)
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        L_0x00c4:
            r10 = 0
            goto L_0x0056
        L_0x00c6:
            r4 = 0
            goto L_0x0022
        L_0x00c9:
            r5 = 0
            goto L_0x001e
        L_0x00cc:
            android.content.Context r1 = r12.A01
            r0 = 2131968258(0x7f134102, float:1.9573406E38)
            java.lang.String r4 = r1.getString(r0)
            r0 = 2131975944(0x7f135f08, float:1.9588995E38)
            java.lang.String r5 = r1.getString(r0)
            X.G69 r1 = r12.A04
            if (r1 == 0) goto L_0x00e4
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x0040
        L_0x00e4:
            X.1xC r2 = X.1xC.A01
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            X.FVp r0 = new X.FVp
            r0.<init>(r4, r1)
            r2.A00(r0)
            goto L_0x0043
        L_0x00f2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EDZ.onFail(X.4dm):void");
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(959819418);
        EDZ.super.onFinish();
        AnonymousClass0fD.A0A(2115904256, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(858135810);
        int A033 = AnonymousClass0fD.A03(-2123151724);
        EDZ.super.onStart();
        0SM r8f = new R8F();
        this.A00 = r8f;
        r8f.A0B(this.A02, "ProgressDialog");
        AnonymousClass0fD.A0A(-1645178011, A033);
        AnonymousClass0fD.A0A(-1821353380, A032);
    }
}

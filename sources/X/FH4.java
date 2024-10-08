package X;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.google.common.collect.ImmutableList;
import com.instagram.accountlinking.model.AccountFamily;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository;
import com.instagram.fxcal.upsell.common.FxIgLogoutACUpsellImpl;
import com.instagram.user.model.User;
import fxcache.model.FxCalAccount;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class FH4 {
    public final Fragment A00;
    public final FragmentActivity A01;
    public final 0hq A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final FxIgLogoutACUpsellImpl A05;
    public final C50340FYx A06;
    public final C49534ExG A07;
    public final FAB A08;
    public final AnonymousClass07i A09;

    /* JADX WARNING: type inference failed for: r6v0, types: [X.6qu, java.lang.Object] */
    public static void A06(FH4 fh4) {
        FH4 fh42 = fh4;
        fh4.A01();
        ? obj = new Object();
        HashMap A1E = AnonymousClass7TE.A1E();
        UserSession userSession = fh4.A04;
        A1E.put("uids", DbV.A17(userSession).toString());
        A1E.put("uids_count", String.valueOf(DbV.A04(userSession)));
        boolean z = !C48983EnL.A00().booleanValue();
        FCF.A01(fh42.A03, userSession, "logout_d2_loaded");
        if (z) {
            0qQ.A0B(userSession, 0);
            C319616qu.A01(userSession, "logout_password_saving_multiaccount_logout_all_dialog_viewed", "logout_spi", "logout", "logout_interaction");
        }
        C358248ab A0X = DbS.A0X(fh42.A01);
        A0X.A09(2131965550);
        A0X.A0I(new C49992FIb(2, A1E, obj, fh42, z), 2131965544);
        A0X.A0C(new C50017FJc((C319616qu) obj, fh42, 4, z));
        A0X.A07 = !C61670oa.A01();
        try {
            AnonymousClass0fN.A00(A0X.A02());
        } catch (WindowManager.BadTokenException unused) {
            fh42.A0D(EVP.SINGLE, true);
        }
    }

    public static void A08(FH4 fh4, boolean z) {
        FH4 fh42 = fh4;
        fh4.A01();
        UserSession userSession = fh4.A04;
        String str = userSession.A06;
        C319606qt A012 = C319606qt.A01(userSession);
        A012.A0H(str);
        E1R e1r = new E1R();
        e1r.A00 = z;
        C331127Pr A0W = DbS.A0W(userSession);
        A0W.A0a = AnonymousClass7TE.A0u();
        FragmentActivity fragmentActivity = fh42.A01;
        A0W.A0g = fragmentActivity.getResources().getString(2131968824);
        A0W.A0v = true;
        A0W.A0K = new C50104FOu((Object) e1r, (Object) A012, (Object) fh42, str, 7);
        if (1AW.A06(0Tu.A05, 18296148364230840L)) {
            A0W.A0d = AnonymousClass7TF.A0e(fragmentActivity.getResources(), AnonymousClass7TF.A0Q(userSession).getUsername(), 2131968827);
        }
        C331157Pu A002 = A0W.A00();
        A002.A0Q(true);
        A002.A02(fragmentActivity, e1r);
    }

    private ArrayList A00() {
        UserSession userSession = this.A04;
        List<FxCalAccount> A032 = 1wB.A00(userSession).A03(CallerContext.A01("LogoutDialogHelper"), "ig_native_linking_cache_logout_linked_accounts", "INSTAGRAM");
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (!A032.isEmpty()) {
            String A0q = DbX.A0q(userSession);
            for (FxCalAccount fxCalAccount : A032) {
                String str = fxCalAccount.A0A;
                if (str != null) {
                    if (str.equals(A0q)) {
                        A1C.add(0, str);
                    } else {
                        A1C.add(str);
                    }
                }
            }
        }
        return A1C;
    }

    private void A01() {
        1Wj r3 = 1Wj.A00;
        if (r3 != null) {
            r3.A03(this.A04, this.A01, "1949557911961250");
        }
    }

    public static void A02(C319616qu r5, FH4 fh4, boolean z) {
        UserSession userSession = fh4.A04;
        0qQ.A0B(userSession, 0);
        C319616qu.A01(userSession, "logout_password_saving_logout_dialog_viewed", "logout_spi", "logout", "logout_interaction");
        C358248ab A0X = DbS.A0X(fh4.A01);
        A0X.A09(2131954416);
        A0X.A0K(new C50017FJc(r5, fh4, 3, z), 2131954415);
        C50025FJk.A02(A0X, fh4, r5, 31, 2131954414);
        DbV.A1S(A0X);
        try {
            AnonymousClass0fN.A00(A0X.A02());
        } catch (WindowManager.BadTokenException unused) {
            fh4.A0D(EVP.SINGLE, z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0083, code lost:
        if (r2 <= 1) goto L_0x0085;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.EVP r7, X.FH4 r8) {
        /*
            com.instagram.common.session.UserSession r0 = r8.A04
            X.9BG r4 = X.AnonymousClass9BG.A01(r0)
            com.instagram.user.model.User r6 = X.DbT.A0j(r0)
            java.lang.String r0 = r6.getId()
            java.util.Map r1 = r4.A02
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L_0x008d
            java.lang.String r0 = r6.getId()
            boolean r0 = r4.A06(r0)
            if (r0 == 0) goto L_0x0047
            java.lang.String r0 = r6.getId()
            java.lang.Object r0 = r1.get(r0)
            com.instagram.accountlinking.model.AccountFamily r0 = (com.instagram.accountlinking.model.AccountFamily) r0
            java.util.List r0 = r0.A04
            java.util.Iterator r3 = r0.iterator()
        L_0x0030:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0047
            com.instagram.user.model.User r2 = X.DbT.A0k(r3)
            X.0BQ r1 = r4.A01
            java.lang.String r0 = r2.getId()
            boolean r0 = r1.CO7(r0)
            if (r0 == 0) goto L_0x0030
            r6 = r2
        L_0x0047:
            java.lang.String r1 = r6.getUsername()
            java.lang.String r0 = X.FGv.A01()
            boolean r5 = r1.equals(r0)
            X.EVP r0 = X.EVP.ALL
            if (r7 == r0) goto L_0x0085
            X.0BQ r0 = r4.A01
            java.util.Set r0 = r0.BNz()
            java.util.Iterator r3 = r0.iterator()
            r2 = 0
        L_0x0062:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0081
            java.lang.String r1 = X.AnonymousClass7TE.A18(r3)
            boolean r0 = r4.A05(r1)
            if (r0 == 0) goto L_0x007e
            boolean r0 = r4.A07(r1)
            if (r0 != 0) goto L_0x007e
            int r0 = X.AnonymousClass9BG.A00(r4, r1)
            if (r0 != 0) goto L_0x0062
        L_0x007e:
            int r2 = r2 + 1
            goto L_0x0062
        L_0x0081:
            r1 = 1
            r0 = 0
            if (r2 > r1) goto L_0x0086
        L_0x0085:
            r0 = 1
        L_0x0086:
            if (r5 != 0) goto L_0x008d
            if (r0 == 0) goto L_0x008d
            X.DbY.A1P(r6)
        L_0x008d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FH4.A03(X.EVP, X.FH4):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(X.EVP r20, X.FH4 r21) {
        /*
            r4 = r21
            com.instagram.common.session.UserSession r2 = r4.A04
            java.lang.String r8 = r2.A06
            X.6qt r7 = X.C319606qt.A01(r2)
            X.0iw r1 = r4.A03
            java.lang.String r0 = "logout_d3_loaded"
            X.FCF.A00(r1, r2, r0)
            r3 = 4
            X.FIZ r15 = new X.FIZ
            r9 = r20
            r20 = r3
            r19 = r8
            r18 = r7
            r17 = r9
            r16 = r4
            r15.<init>(r16, r17, r18, r19, r20)
            r21 = 5
            X.FIZ r6 = new X.FIZ
            r16 = r6
            r17 = r4
            r18 = r9
            r19 = r7
            r20 = r8
            r16.<init>(r17, r18, r19, r20, r21)
            androidx.fragment.app.FragmentActivity r10 = r4.A01
            X.8ab r5 = X.DbS.A0X(r10)
            int r11 = r9.ordinal()
            r0 = 2
            if (r11 == r0) goto L_0x00e0
            r1 = 3
            r0 = 2131971936(0x7f134f60, float:1.9580865E38)
            if (r11 == r1) goto L_0x004a
            r0 = 2131971930(0x7f134f5a, float:1.9580853E38)
        L_0x004a:
            X.DbT.A19(r10, r5, r0)
            r13 = 2
            if (r11 == r13) goto L_0x00db
            r14 = 3
            if (r11 == r14) goto L_0x007a
            r0 = 2131971930(0x7f134f5a, float:1.9580853E38)
        L_0x0056:
            java.lang.String r0 = r10.getString(r0)
        L_0x005a:
            r5.A0q(r0)
            X.EVP r1 = X.EVP.LINKED_ACCOUNTS
            r0 = 2131971929(0x7f134f59, float:1.9580851E38)
            if (r9 != r1) goto L_0x0067
            r0 = 2131954425(0x7f130af9, float:1.9545349E38)
        L_0x0067:
            r5.A0I(r15, r0)
            r0 = 2131968513(0x7f134201, float:1.9573923E38)
            r5.A0H(r6, r0)
            X.DbV.A1S(r5)
            X.DbT.A1V(r5)
            r7.A0H(r8)
            return
        L_0x007a:
            java.util.ArrayList r12 = r4.A00()
            int r11 = r12.size()
            r0 = 1
            r1 = 0
            if (r11 != r13) goto L_0x009a
            r4 = 2131971933(0x7f134f5d, float:1.958086E38)
            java.lang.Object r1 = r12.get(r1)
            java.lang.Object r0 = r12.get(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
        L_0x0095:
            java.lang.String r0 = r10.getString(r4, r0)
            goto L_0x005a
        L_0x009a:
            if (r11 != r14) goto L_0x00b0
            r4 = 2131971934(0x7f134f5e, float:1.9580861E38)
            java.lang.Object r2 = r12.get(r1)
            java.lang.Object r1 = r12.get(r0)
            java.lang.Object r0 = r12.get(r13)
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r1, r0}
            goto L_0x0095
        L_0x00b0:
            if (r11 < r3) goto L_0x00cb
            r4 = 2131971935(0x7f134f5f, float:1.9580863E38)
            java.lang.Object r3 = r12.get(r1)
            java.lang.Object r2 = r12.get(r0)
            java.lang.Object r1 = r12.get(r13)
            int r11 = r11 - r14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r2, r1, r0}
            goto L_0x0095
        L_0x00cb:
            r4 = 2131971932(0x7f134f5c, float:1.9580857E38)
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r2)
            java.lang.String r0 = r0.getUsername()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            goto L_0x0095
        L_0x00db:
            r0 = 2131971938(0x7f134f62, float:1.958087E38)
            goto L_0x0056
        L_0x00e0:
            r0 = 2131971937(0x7f134f61, float:1.9580867E38)
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FH4.A04(X.EVP, X.FH4):void");
    }

    public static void A07(FH4 fh4) {
        List list;
        UserSession userSession = fh4.A04;
        FCF.A00(fh4.A03, userSession, "logout_d4_loaded");
        AnonymousClass9BG A012 = AnonymousClass9BG.A01(userSession);
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList A042 = A012.A04(userSession);
        if (A042 != null) {
            Iterator it = A042.iterator();
            while (it.hasNext()) {
                A1C.add(DbT.A0k(it).getUsername());
            }
        }
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        User A032 = A012.A03(userSession);
        if (A032 != null) {
            AccountFamily accountFamily = (AccountFamily) A012.A02.get(A032.getId());
            if (accountFamily != null) {
                if (accountFamily.A04.isEmpty()) {
                    list = accountFamily.A03;
                } else {
                    list = accountFamily.A04;
                }
                HashSet A022 = AnonymousClass9BG.A02(list);
                AnonymousClass3EO r0 = A012.A00;
                if (r0 != null) {
                    C249803kO it2 = ImmutableList.copyOf(r0.A01.values()).iterator();
                    while (it2.hasNext()) {
                        C49537ExJ exJ = (C49537ExJ) it2.next();
                        if (A022.contains(exJ.A00.A01.getId())) {
                            A1C2.add(exJ.A00.A01.getUsername());
                        }
                    }
                }
            }
        }
        A1C.addAll(A1C2);
        C319606qt.A01(userSession).A0K(userSession.A06);
        FragmentActivity fragmentActivity = fh4.A01;
        C358248ab A0X = DbS.A0X(fragmentActivity);
        Resources resources = fragmentActivity.getResources();
        int i = 2131965547;
        int size = A1C.size();
        if (size != 1) {
            if (size == 2) {
                i = 2131965549;
            } else if (size == 3) {
                i = 2131965548;
            } else if (size == 4) {
                i = 2131965546;
            } else if (size == 5) {
                i = 2131965545;
            }
        }
        A0X.A05 = 0bC.A01(resources, (String[]) A1C.toArray(new String[A1C.size()]), i).toString();
        C50020FJf.A01(A0X, fh4, 30, 2131965544);
        A0X.A0C(C50020FJf.A00(fh4, 29));
        DbV.A1S(A0X);
        DbT.A1V(A0X);
    }

    public final void A0B() {
        UserSession userSession = this.A04;
        ArrayList A042 = AnonymousClass9BG.A01(userSession).A04(userSession);
        EVP evp = EVP.FAMILY;
        A03(evp, this);
        C67623Mqv mqv = C67620Mqs.A04;
        FragmentActivity fragmentActivity = this.A01;
        if (A042 == null) {
            A042 = AnonymousClass7TE.A1C();
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        FragmentActivity fragmentActivity2 = fragmentActivity;
        DbV.A1Q(new C47705EDo(fragmentActivity, this.A00, fragmentActivity2, this.A02, this.A03, userSession, evp, A042, A1C, true, DbX.A1Y(userSession)));
    }

    public final void A0C(EVP evp) {
        ClipsDraftRepository A002 = C361288fz.A00(this.A01, this.A04);
        C2801950r r4 = C2801950r.CLIPS;
        A5X a5x = new A5X(evp, this);
        AnonymousClass7TE.A1Z(new AnonymousClass9KM((Object) A002, (Object) a5x, (Object) r4, (AnonymousClass4D7) null, 9, 42), A002.A01);
    }

    public final void A0D(EVP evp, boolean z) {
        EVP evp2 = evp;
        EI3 ei3 = new EI3(evp, this);
        UserSession userSession = this.A04;
        if (182.A06(0Tu.A05, userSession, 36311487471747618L)) {
            0nY.A00().ATE(ei3);
        } else {
            ei3.run();
        }
        0xY A0d = DbS.A0d(DbS.A0e());
        A0d.E5T("is_from_log_out", true);
        A0d.apply();
        C67623Mqv mqv = C67620Mqs.A04;
        FragmentActivity fragmentActivity = this.A01;
        ArrayList A1C = AnonymousClass7TE.A1C();
        FragmentActivity fragmentActivity2 = fragmentActivity;
        DbV.A1Q(new C47705EDo(fragmentActivity, this.A00, fragmentActivity2, this.A02, this.A03, userSession, evp2, A1C, z));
    }

    public FH4(Fragment fragment, FragmentActivity fragmentActivity, 0hq r5, AnonymousClass07i r6, AnonymousClass0iw r7, UserSession userSession) {
        fragmentActivity.getClass();
        this.A01 = fragmentActivity;
        this.A04 = userSession;
        this.A00 = fragment;
        r5.getClass();
        this.A02 = r5;
        this.A09 = r6;
        r7.getClass();
        this.A03 = r7;
        this.A08 = new FAB(fragmentActivity);
        C49534ExG exG = C49534ExG.A02;
        if (exG == null) {
            exG = new C49534ExG();
            C49534ExG.A02 = exG;
        }
        this.A07 = exG;
        0qQ.A0B(userSession, 0);
        this.A06 = (C50340FYx) userSession.A01(C50340FYx.class, new C73662Phb(userSession, 27));
        this.A05 = C323576xi.A00(userSession, fragmentActivity.getApplicationContext(), "IG_LOGOUT_UPSELL");
    }

    public static void A05(FH4 fh4) {
        String str;
        FragmentActivity fragmentActivity;
        int i;
        Object[] objArr;
        ArrayList A002 = fh4.A00();
        int size = A002.size();
        if (size == 2) {
            fragmentActivity = fh4.A01;
            i = 2131954417;
            objArr = new Object[]{A002.get(0), A002.get(1)};
        } else if (size == 3) {
            fragmentActivity = fh4.A01;
            i = 2131954418;
            objArr = new Object[]{A002.get(0), A002.get(1), A002.get(2)};
        } else if (size >= 4) {
            fragmentActivity = fh4.A01;
            i = 2131954419;
            objArr = new Object[]{A002.get(0), A002.get(1), A002.get(2), Integer.valueOf(size - 3)};
        } else {
            str = "";
            C358248ab A0X = DbS.A0X(fh4.A01);
            A0X.A09(2131954416);
            A0X.A0q(str);
            A0X.A0L(C50020FJf.A00(fh4, 27), 2131954415);
            A0X.A0H((DialogInterface.OnClickListener) null, 2131954414);
            DbV.A1S(A0X);
            AnonymousClass0fN.A00(A0X.A02());
        }
        str = fragmentActivity.getString(i, objArr);
        C358248ab A0X2 = DbS.A0X(fh4.A01);
        A0X2.A09(2131954416);
        A0X2.A0q(str);
        A0X2.A0L(C50020FJf.A00(fh4, 27), 2131954415);
        A0X2.A0H((DialogInterface.OnClickListener) null, 2131954414);
        DbV.A1S(A0X2);
        try {
            AnonymousClass0fN.A00(A0X2.A02());
        } catch (WindowManager.BadTokenException unused) {
            fh4.A0D(EVP.LINKED_ACCOUNTS, false);
        }
    }

    public static void A09(FH4 fh4, boolean z) {
        fh4.A01();
        UserSession userSession = fh4.A04;
        String str = userSession.A06;
        FCF.A02(fh4.A03, userSession, "logout_d1_loaded", str, z);
        C319606qt.A01(userSession).A0H(str);
        C49484EwP ewP = new C49484EwP(fh4, str);
        FragmentActivity fragmentActivity = fh4.A01;
        FF8 ff8 = new FF8(fragmentActivity);
        ff8.A01(2131965551);
        String string = fragmentActivity.getString(2131968828);
        CheckBox checkBox = ff8.A08;
        checkBox.getClass();
        checkBox.setChecked(z);
        checkBox.setText(string);
        checkBox.setOnCheckedChangeListener(new FQ1(16, ff8, ewP));
        checkBox.setVisibility(0);
        View view = ff8.A05;
        view.getClass();
        view.setVisibility(0);
        TextView textView = ff8.A0A;
        textView.getClass();
        textView.setVisibility(8);
        ff8.A03(C50025FJk.A00(ff8, ewP, 54), ff8.A02.getString(2131965544));
        ff8.A02(C50020FJf.A00(fh4, 26), 2131954722);
        AnonymousClass0fN.A00(ff8.A00());
    }

    public static void A0A(FH4 fh4, boolean z) {
        fh4.A01();
        FCF.A00(fh4.A03, fh4.A04, "logout_d2_loaded");
        C358248ab A0X = DbS.A0X(fh4.A01);
        A0X.A09(2131965551);
        A0X.A0I(new FIG(3, fh4, z), 2131965544);
        A0X.A0C(C50020FJf.A00(fh4, 31));
        DbV.A1S(A0X);
        DbT.A1V(A0X);
    }
}

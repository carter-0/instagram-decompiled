package X;

import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.EDo  reason: case insensitive filesystem */
public class C47705EDo extends C67620Mqs implements AnonymousClass0iw, AnonymousClass08W {
    public static final String __redex_internal_original_name = "LogoutTask";
    public User A00;
    public final Context A01;
    public final Fragment A02;
    public final FragmentActivity A03;
    public final 0hq A04;
    public final AnonymousClass0iw A05;
    public final UserSession A06;
    public final EVP A07;
    public final List A08;
    public final List A09;
    public final boolean A0A;
    public final boolean A0B;

    public C47705EDo(Context context, Fragment fragment, FragmentActivity fragmentActivity, 0hq r5, AnonymousClass0iw r6, UserSession userSession, EVP evp, List list, List list2, boolean z, boolean z2) {
        DbW.A1N(context, 1, r5);
        this.A01 = context;
        this.A06 = userSession;
        this.A08 = list;
        this.A09 = list2;
        this.A04 = r5;
        this.A07 = evp;
        this.A02 = fragment;
        this.A03 = fragmentActivity;
        this.A05 = r6;
        this.A0B = z;
        this.A0A = z2;
    }

    public final String getModuleName() {
        return "log_out_task";
    }

    public static final void A00(AnonymousClass3EO r15, C47705EDo eDo, int i) {
        Uri A012;
        C47705EDo eDo2 = eDo;
        AnonymousClass0aP A032 = 09i.A0A.A03(eDo2);
        AnonymousClass3EO r7 = r15;
        ImmutableList A0K = DbU.A0K(r15.A02.values());
        C49557Exs exs = (C49557Exs) A0K.get(i);
        FragmentActivity fragmentActivity = eDo2.A03;
        C46634DiE diE = C46634DiE.A0Z;
        AnonymousClass0iw r8 = eDo2.A05;
        Integer num = AnonymousClass05K.A01;
        String username = exs.A00.getUsername();
        C50515Fdb fdb = new C50515Fdb(fragmentActivity);
        Fragment fragment = eDo2.A02;
        if (fragment == null) {
            A012 = null;
        } else {
            A012 = C46413Dea.A01(fragment);
        }
        EME eme = new EME(A012, fragmentActivity, r7, r8, A032, fdb, eDo2, exs, diE, num, username, A0K, i);
        1OC A033 = FHA.A03(eDo2.A01, A032, exs.A01, exs.A00.getId(), (String) null);
        A033.A00 = eme;
        1ES.A03(A033);
    }

    public static final void A01(C47705EDo eDo) {
        UserSession userSession = eDo.A06;
        AnonymousClass3EO A002 = AnonymousClass3EO.A00(userSession);
        0qQ.A07(A002);
        if (!A002.A02.isEmpty()) {
            HashMap A1E = AnonymousClass7TE.A1E();
            A002.A02 = A1E;
            A002.A05(A1E.values());
        }
        if (!A002.A01.isEmpty()) {
            HashMap A1E2 = AnonymousClass7TE.A1E();
            A002.A01 = A1E2;
            A002.A04(A1E2.values());
        }
        HashMap A1E3 = AnonymousClass7TE.A1E();
        List list = eDo.A09;
        A1E3.put("uids", list.toString());
        Dbb.A1T(userSession, A1E3, list.size());
        C319616qu.A00(userSession, AnonymousClass05K.A01, "logout_success", "login_logout_integration", "logout_integration", "logout", (String) null, A1E3);
        0tS A0h = DbT.A0h();
        DbS.A1a(A0h, userSession.A06, A0h.A09, 0tS.A4G, 185);
        1xC.A01.A00(new 0KY((String) null, (String) null));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        if (X.DbX.A1Y(r8.A06) == false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002f, code lost:
        if (r0 != false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r8.A0A == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object A03(java.lang.Object[] r24) {
        /*
            r23 = this;
            r8 = r23
            X.EVP r11 = r8.A07
            X.EVP r10 = X.EVP.FAMILY
            r2 = 0
            r15 = 1
            if (r11 == r10) goto L_0x0017
            X.EVP r0 = X.EVP.ALL
            if (r11 == r0) goto L_0x0017
            X.EVP r0 = X.EVP.LINKED_ACCOUNTS
            if (r11 == r0) goto L_0x0017
            boolean r0 = r8.A0A
            r3 = 1
            if (r0 != 0) goto L_0x0018
        L_0x0017:
            r3 = 0
        L_0x0018:
            X.EVP r0 = X.EVP.ALL
            if (r11 == r0) goto L_0x0022
            if (r11 == r10) goto L_0x0022
            X.EVP r0 = X.EVP.LINKED_ACCOUNTS
            if (r11 != r0) goto L_0x002b
        L_0x0022:
            com.instagram.common.session.UserSession r0 = r8.A06
            boolean r1 = X.DbX.A1Y(r0)
            r0 = 1
            if (r1 != 0) goto L_0x002c
        L_0x002b:
            r0 = 0
        L_0x002c:
            if (r3 != 0) goto L_0x0031
            r14 = 0
            if (r0 == 0) goto L_0x0032
        L_0x0031:
            r14 = 1
        L_0x0032:
            X.EVP r0 = X.EVP.LINKED_ACCOUNTS
            if (r11 != r0) goto L_0x0096
            com.instagram.common.session.UserSession r4 = r8.A06
            X.1wM r5 = X.1wB.A00(r4)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.fxcache.cache.FxIGMasterAccountCacheHelper"
            X.0qQ.A0C(r5, r0)
            java.lang.String r0 = "LogoutTask"
            com.facebook.common.callercontext.CallerContext r3 = com.facebook.common.callercontext.CallerContext.A01(r0)
            java.lang.String r1 = "FACEBOOK"
            java.lang.String r0 = "INSTAGRAM"
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r0)
            java.lang.String r0 = "ig_native_linking_cache_logout_linked_accounts"
            java.util.List r7 = r5.A04(r3, r0, r1)
            java.util.List r0 = X.DbV.A17(r4)
            com.instagram.user.model.User r6 = X.DbT.A0j(r4)
            java.util.Iterator r5 = r0.iterator()
        L_0x006a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x019f
            com.instagram.user.model.User r4 = X.DbT.A0k(r5)
            if (r4 == r6) goto L_0x006a
            java.util.Iterator r3 = r7.iterator()
        L_0x007a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x006a
            java.lang.Object r0 = r3.next()
            fxcache.model.FxCalAccount r0 = (fxcache.model.FxCalAccount) r0
            java.lang.String r1 = r0.A0A
            if (r1 == 0) goto L_0x007a
            java.lang.String r0 = r4.getUsername()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x007a
        L_0x0094:
            r8.A00 = r4
        L_0x0096:
            com.instagram.common.session.UserSession r6 = r8.A06
            r13 = 0
            X.0wc r1 = X.DbT.A0Q(r8, r6, r2)
            java.lang.String r0 = "ig_log_out_sso"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r14)
            java.lang.String r0 = "sso_enabled"
            r3.A7p(r0, r1)
            java.lang.String r12 = r6.A06
            java.lang.Long r1 = X.AnonymousClass7TE.A10(r12)
            java.lang.String r0 = "user_id"
            r3.A9F(r0, r1)
            X.0qv r5 = X.0qv.A02
            android.content.Context r0 = X.C60960kU.A00
            java.lang.String r1 = r5.A04(r0)
            java.lang.String r0 = "app_device_id"
            r3.AAJ(r0, r1)
            r3.Cgf()
            X.4Cl r0 = X.DbX.A0m(r6)
            java.lang.String r1 = r0.Bsr()
            X.6qt r0 = X.C319606qt.A01(r6)
            r0.A0D(r6, r12)
            if (r14 == 0) goto L_0x00e7
            com.instagram.user.model.User r0 = r8.A00
            if (r0 != 0) goto L_0x00e7
            X.6qt r0 = X.C319606qt.A01(r6)
            boolean r0 = r0.A0J(r12)
            if (r0 == 0) goto L_0x00e7
            r2 = 1
        L_0x00e7:
            android.content.Context r9 = r8.A01
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            X.0qQ.A0B(r9, r13)
            r7 = 0
            X.1NY r2 = X.AnonymousClass7TG.A0a(r6)
            java.lang.String r0 = "accounts/logout/"
            r2.A0A(r0)
            java.lang.String r0 = "session_flush_nonce"
            java.lang.String r4 = X.DbT.A0u(r9, r2, r0, r1)
            r1 = 9
            r0 = 57
            java.lang.String r0 = X.C46326Dbu.A01(r13, r1, r0)
            r2.A9m(r0, r4)
            java.lang.String r1 = r5.A05(r9)
            java.lang.String r0 = "guid"
            X.0jh r1 = X.DbW.A0I(r2, r6, r0, r1)
            X.19f r0 = X.19f.A1z
            X.DbW.A1A(r0, r2, r1)
            java.lang.Class<X.Dvw> r1 = X.C47362Dvw.class
            java.lang.Class<X.F6P> r0 = X.F6P.class
            r2.A0O(r7, r1, r0, r13)
            java.lang.String r1 = "true"
            if (r14 == 0) goto L_0x012f
            java.lang.String r0 = "one_tap_app_login"
            r2.A9m(r0, r1)
            java.lang.String r0 = "is_app_level_spi"
            r2.A0E(r0, r3)
        L_0x012f:
            java.lang.String r0 = "prevent_remove_device_from_wa"
            X.1OC r5 = X.DbT.A0T(r2, r0, r1)
            if (r14 == 0) goto L_0x0168
            X.1CU r0 = X.AnonymousClass1CT.A00(r6)
            java.lang.String r1 = r0.A04
            X.EDT r0 = new X.EDT
            r20 = r1
            r21 = r13
            r22 = r13
            r19 = r6
            r18 = r8
            r17 = r9
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r5.A00 = r0
            X.6qt r4 = X.C319606qt.A01(r6)
            long r2 = java.lang.System.currentTimeMillis()
            X.6qx r1 = X.C319606qt.A02(r4, r12)
            r1.A01 = r2
            java.util.Map r0 = r4.A00
            r0.put(r12, r1)
            r4.A0B(r7, r7, r7, r13)
        L_0x0168:
            r5.run()
            X.0tC r0 = r6.A04
            X.0tD r0 = r0.A00
            X.07v.A01(r9, r6, r0)
            if (r11 != r10) goto L_0x0183
            java.util.List r1 = r8.A08
            boolean r0 = X.AnonymousClass7TE.A1b(r1)
            if (r0 == 0) goto L_0x0183
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r6)
            r1.remove(r0)
        L_0x0183:
            java.util.List r0 = r8.A09
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x019a
            X.0DZ r1 = X.0DT.A00(r6)
            com.instagram.common.session.UserSession r0 = r1.A00
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x019a
            X.0DZ.A00(r1)
        L_0x019a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r15)
            return r0
        L_0x019f:
            r4 = 0
            goto L_0x0094
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47705EDo.A03(java.lang.Object[]):java.lang.Object");
    }

    public final void A04() {
        if (this.A0B) {
            0hq r4 = this.A04;
            if (r4.A0R("ProgressDialog") == null) {
                new R8F().A0G(new 0s1(r4), "ProgressDialog", true);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A05(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            com.instagram.common.session.UserSession r9 = r0.A06
            java.util.List r6 = X.DbV.A17(r9)
            java.lang.String r4 = r9.A06
            java.util.List r13 = r0.A09
            r13.add(r4)
            X.0wc r2 = X.AnonymousClass0kN.A01(r0, r9)
            X.EVP r11 = r0.A07
            X.EVP r5 = X.EVP.ALL
            if (r11 != r5) goto L_0x0046
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L_0x0046
            java.lang.String r1 = "log_out_all_accounts"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r2, r1)
            r1 = 335(0x14f, float:4.7E-43)
        L_0x0027:
            X.1Ln r4 = new X.1Ln
            r4.<init>(r2, r1)
            java.util.HashSet r3 = X.AnonymousClass7TE.A1F()
            java.util.Iterator r2 = r13.iterator()
        L_0x0034:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0064
            java.lang.String r1 = X.AnonymousClass7TE.A18(r2)
            java.lang.Long r1 = X.DbV.A0q(r1)
            r3.add(r1)
            goto L_0x0034
        L_0x0046:
            X.EVP r1 = X.EVP.FAMILY
            if (r11 != r1) goto L_0x005b
            java.util.List r1 = r0.A08
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x005b
        L_0x0052:
            java.lang.String r1 = "log_out_account_group"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r2, r1)
            r1 = 334(0x14e, float:4.68E-43)
            goto L_0x0027
        L_0x005b:
            X.EVP r1 = X.EVP.LINKED_ACCOUNTS
            if (r11 != r1) goto L_0x006f
            com.instagram.user.model.User r1 = r0.A00
            if (r1 == 0) goto L_0x006f
            goto L_0x0052
        L_0x0064:
            java.lang.String r2 = "array_logging_out_account_ids"
            X.0Aj r1 = r4.A00
            r1.AAF(r2, r3)
            r4.Cgf()
            goto L_0x0085
        L_0x006f:
            X.EVP r1 = X.EVP.SINGLE
            if (r11 != r1) goto L_0x0085
            java.lang.String r1 = "log_out_single_accounts"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r2, r1)
            java.lang.Long r2 = X.DbV.A0q(r4)
            java.lang.String r1 = "logging_out_account_id"
            r3.A9F(r1, r2)
            r3.Cgf()
        L_0x0085:
            r15 = 0
            if (r11 != r5) goto L_0x00c0
            boolean r1 = X.AnonymousClass7TE.A1b(r6)
            if (r1 == 0) goto L_0x00c0
            com.instagram.user.model.User r3 = X.DbS.A0g(r6, r15)
            X.08y r1 = X.09i.A0A
            r1.A03(r0)
            X.09i r2 = X.08y.A00()
            monitor-enter(r2)
            X.0qQ.A0B(r3, r15)     // Catch:{ all -> 0x0110 }
            com.instagram.common.session.UserSession r10 = r2.A02(r3)     // Catch:{ all -> 0x0110 }
            X.17i r1 = X.17h.A00(r10)     // Catch:{ all -> 0x0110 }
            r1.A01(r3, r15, r15)     // Catch:{ all -> 0x0110 }
            X.07d r1 = r2.A02     // Catch:{ all -> 0x0110 }
            r1.A08(r3)     // Catch:{ all -> 0x0110 }
            X.08y.A01(r15)     // Catch:{ all -> 0x0110 }
            X.0t9 r1 = r2.A04     // Catch:{ all -> 0x0110 }
            if (r1 == 0) goto L_0x00bb
            X.0t9.A00(r1, r15)     // Catch:{ all -> 0x0110 }
            goto L_0x0203
        L_0x00bb:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ all -> 0x0110 }
            throw r0     // Catch:{ all -> 0x0110 }
        L_0x00c0:
            X.EVP r1 = X.EVP.FAMILY
            if (r11 != r1) goto L_0x0113
            java.util.List r12 = r0.A08
            boolean r1 = X.AnonymousClass7TE.A1b(r12)
            if (r1 == 0) goto L_0x0113
            com.instagram.user.model.User r3 = X.DbS.A0g(r12, r15)
            X.08y r1 = X.09i.A0A
            r1.A03(r0)
            X.09i r2 = X.08y.A00()
            monitor-enter(r2)
            X.0qQ.A0B(r3, r15)     // Catch:{ all -> 0x0110 }
            com.instagram.common.session.UserSession r10 = r2.A02(r3)     // Catch:{ all -> 0x0110 }
            X.17i r1 = X.17h.A00(r10)     // Catch:{ all -> 0x0110 }
            r1.A01(r3, r15, r15)     // Catch:{ all -> 0x0110 }
            X.07d r1 = r2.A02     // Catch:{ all -> 0x0110 }
            r1.A08(r3)     // Catch:{ all -> 0x0110 }
            X.08y.A01(r15)     // Catch:{ all -> 0x0110 }
            X.0t9 r1 = r2.A04     // Catch:{ all -> 0x0110 }
            if (r1 == 0) goto L_0x010b
            X.0t9.A00(r1, r15)     // Catch:{ all -> 0x0110 }
            monitor-exit(r2)
            android.content.Context r5 = r0.A01
            X.0hq r8 = r0.A04
            androidx.fragment.app.Fragment r6 = r0.A02
            androidx.fragment.app.FragmentActivity r7 = r0.A03
            X.0iw r9 = r0.A05
            boolean r14 = r0.A0B
            X.EDo r4 = new X.EDo
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0218
        L_0x010b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ all -> 0x0110 }
            throw r0     // Catch:{ all -> 0x0110 }
        L_0x0110:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0113:
            X.EVP r1 = X.EVP.LINKED_ACCOUNTS
            if (r11 != r1) goto L_0x014d
            com.instagram.user.model.User r1 = r0.A00
            if (r1 == 0) goto L_0x014d
            X.08y r1 = X.09i.A0A
            r1.A03(r0)
            X.09i r3 = X.08y.A00()
            com.instagram.user.model.User r2 = r0.A00
            X.0qQ.A0A(r2)
            X.Fl9 r1 = new X.Fl9
            r1.<init>(r0)
        L_0x012e:
            X.0Gm r1 = (X.0Gm) r1
            com.instagram.common.session.UserSession r10 = r3.A01(r1, r2)
            android.content.Context r5 = r0.A01
            X.0hq r3 = r0.A04
            androidx.fragment.app.Fragment r6 = r0.A02
            androidx.fragment.app.FragmentActivity r2 = r0.A03
            X.0iw r1 = r0.A05
            boolean r0 = r0.A0B
            X.EDo r4 = new X.EDo
            r7 = r2
            r8 = r3
            r9 = r1
            r12 = r13
            r13 = r0
            r14 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0218
        L_0x014d:
            X.0BQ r3 = X.AnonymousClass0BO.A00(r9)
            java.util.List r2 = r3.BO0()
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x019b
            r1 = r3
            X.0tB r1 = (X.0tB) r1
            X.07d r1 = r1.A02
            java.util.Map r7 = r1.A03
            java.util.Set r4 = r7.keySet()
            java.util.Set r3 = r3.BNz()
            java.util.Iterator r8 = r2.iterator()
        L_0x016e:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x019b
            com.instagram.user.model.User r2 = X.DbT.A0k(r8)
            boolean r1 = X.DbV.A1a(r2, r4)
            if (r1 == 0) goto L_0x016e
            java.lang.String r1 = r2.getId()
            java.lang.Object r1 = r7.get(r1)
            boolean r1 = r3.contains(r1)
            if (r1 != 0) goto L_0x016e
            X.08y r1 = X.09i.A0A
            r1.A03(r0)
            X.09i r3 = X.08y.A00()
            X.Fl8 r1 = new X.Fl8
            r1.<init>()
            goto L_0x012e
        L_0x019b:
            X.0hq r2 = r0.A04
            java.lang.String r1 = "ProgressDialog"
            androidx.fragment.app.Fragment r1 = r2.A0R(r1)
            X.0SM r1 = (X.0SM) r1
            if (r1 == 0) goto L_0x01aa
            r1.A08()
        L_0x01aa:
            X.3EO r2 = X.AnonymousClass3EO.A00(r9)
            X.0qQ.A07(r2)
            if (r11 == r5) goto L_0x022c
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L_0x021e
            java.lang.Object r10 = r6.get(r15)
            com.instagram.user.model.User r10 = (com.instagram.user.model.User) r10
            android.content.Context r7 = r0.A01
            r0 = 1
            X.0qQ.A0B(r7, r0)
            java.lang.String r0 = "invite_prefs"
            X.0tX r3 = X.0xn.A00(r7, r0)
            java.lang.String r2 = "invite_initiation_user_id"
            r8 = 0
            java.lang.String r1 = r3.getString(r2, r8)
            if (r1 == 0) goto L_0x01f3
            java.lang.String r0 = r10.getId()
            boolean r1 = r1.equals(r0)
            X.0xY r0 = r3.AR4()
            r0.E5g(r2, r8)
            if (r1 == 0) goto L_0x01f0
            r0.apply()
            X.09i r0 = X.08y.A00()
            r0.A01(r8, r10)
            return
        L_0x01f0:
            r0.apply()
        L_0x01f3:
            X.0BQ r6 = X.AnonymousClass0BO.A00(r9)
            boolean r0 = r6.AG1(r7, r9, r10)
            if (r0 == 0) goto L_0x021d
            java.lang.String r11 = "log_out"
            r6.E2S(r7, r8, r9, r10, r11)
            return
        L_0x0203:
            monitor-exit(r2)
            android.content.Context r5 = r0.A01
            X.0hq r2 = r0.A04
            androidx.fragment.app.Fragment r6 = r0.A02
            androidx.fragment.app.FragmentActivity r1 = r0.A03
            X.0iw r0 = r0.A05
            X.EDo r4 = new X.EDo
            r7 = r1
            r8 = r2
            r9 = r0
            r12 = r13
            r13 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x0218:
            java.lang.Void[] r0 = new java.lang.Void[r15]
            r4.A02(r0)
        L_0x021d:
            return
        L_0x021e:
            java.util.HashMap r1 = r2.A02
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x022c
            A00(r2, r0, r15)
            return
        L_0x022c:
            A01(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47705EDo.A05(java.lang.Object):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C47705EDo(android.content.Context r13, androidx.fragment.app.Fragment r14, androidx.fragment.app.FragmentActivity r15, X.0hq r16, X.AnonymousClass0iw r17, com.instagram.common.session.UserSession r18, X.EVP r19, java.util.List r20, boolean r21, boolean r22) {
        /*
            r12 = this;
            r0 = 1
            r1 = r13
            X.0qQ.A0B(r13, r0)
            r4 = r16
            r7 = r19
            X.AnonymousClass7TG.A1R(r4, r7)
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            r0 = r12
            r2 = r14
            r3 = r15
            r5 = r17
            r6 = r18
            r9 = r20
            r10 = r21
            r11 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47705EDo.<init>(android.content.Context, androidx.fragment.app.Fragment, androidx.fragment.app.FragmentActivity, X.0hq, X.0iw, com.instagram.common.session.UserSession, X.EVP, java.util.List, boolean, boolean):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C47705EDo(android.content.Context r12, androidx.fragment.app.Fragment r13, androidx.fragment.app.FragmentActivity r14, X.0hq r15, X.AnonymousClass0iw r16, com.instagram.common.session.UserSession r17, X.EVP r18, java.util.List r19, boolean r20) {
        /*
            r11 = this;
            r9 = 1
            r1 = r12
            r6 = r17
            X.AnonymousClass7TF.A1B(r12, r9, r6)
            r4 = r15
            r7 = r18
            X.AnonymousClass7TG.A1R(r15, r7)
            r0 = r11
            r2 = r13
            r3 = r14
            r5 = r16
            r8 = r19
            r10 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47705EDo.<init>(android.content.Context, androidx.fragment.app.Fragment, androidx.fragment.app.FragmentActivity, X.0hq, X.0iw, com.instagram.common.session.UserSession, X.EVP, java.util.List, boolean):void");
    }
}

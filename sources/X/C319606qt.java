package X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.user.model.User;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.6qt  reason: invalid class name and case insensitive filesystem */
public final class C319606qt {
    public static C319606qt A02;
    public Map A00 = new HashMap();
    public final C319616qu A01 = new Object();

    public static C319606qt A00() {
        C319606qt r0 = A02;
        if (r0 != null) {
            return r0;
        }
        C319606qt r02 = new C319606qt();
        A02 = r02;
        return r02;
    }

    public static C319606qt A01(0lg r1) {
        if (A02 == null) {
            C319606qt r0 = new C319606qt();
            A02 = r0;
            r0.A0C(r1);
        }
        return A02;
    }

    public static C319646qx A02(C319606qt r1, String str) {
        if (r1.A00.containsKey(str)) {
            return (C319646qx) r1.A00.get(str);
        }
        C319646qx r0 = new C319646qx();
        r0.A06 = str;
        return r0;
    }

    public static final List A03() {
        ArrayList arrayList = new ArrayList();
        String string = AnonymousClass0xl.A00(C61170le.A00).A00.getString("one_tap_login_user_map", (String) null);
        if (!TextUtils.isEmpty(string)) {
            try {
                return (List) C319626qv.parseFromJson(16P.A00(string)).A00;
            } catch (IOException unused) {
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (r1.A04.equals("APP_LEVEL_SPI_UNKNOWN") == false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Boolean A04(java.lang.String r3) {
        /*
            r2 = this;
            java.util.Map r0 = r2.A00
            java.lang.Object r1 = r0.get(r3)
            X.6qx r1 = (X.C319646qx) r1
            if (r1 == 0) goto L_0x001b
            boolean r0 = r2.A0K(r3)
            if (r0 == 0) goto L_0x001b
            java.lang.String r1 = r1.A04
            java.lang.String r0 = "APP_LEVEL_SPI_UNKNOWN"
            boolean r1 = r1.equals(r0)
            r0 = 1
            if (r1 != 0) goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C319606qt.A04(java.lang.String):java.lang.Boolean");
    }

    public final ArrayList A05() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.A00.entrySet()) {
            if (((C319646qx) entry.getValue()).A08) {
                arrayList.add(entry.getValue());
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        if (r18.booleanValue() == false) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(android.content.Context r15, X.AnonymousClass0iw r16, X.0lg r17, java.lang.Boolean r18, java.lang.Boolean r19, java.lang.Integer r20, java.lang.Iterable r21, boolean r22) {
        /*
            r14 = this;
            r3 = r21
            java.util.Iterator r6 = r3.iterator()
        L_0x0006:
            boolean r0 = r6.hasNext()
            r8 = r16
            r7 = r20
            r2 = r22
            r4 = r17
            if (r0 == 0) goto L_0x003f
            java.lang.Object r5 = r6.next()
            java.lang.String r5 = (java.lang.String) r5
            X.6qx r1 = A02(r14, r5)
            boolean r0 = r1.A08
            if (r0 == r2) goto L_0x0025
            X.C49131Epu.A00(r8, r4, r7, r5, r2)
        L_0x0025:
            r1.A08 = r2
            if (r18 != 0) goto L_0x0033
            java.lang.String r0 = "APP_LEVEL_SPI_UNKNOWN"
        L_0x002b:
            r1.A04 = r0
            java.util.Map r0 = r14.A00
            r0.put(r5, r1)
            goto L_0x0006
        L_0x0033:
            boolean r0 = r18.booleanValue()
            if (r0 == 0) goto L_0x003c
            java.lang.String r0 = "APP_LEVEL_SPI_YES"
            goto L_0x002b
        L_0x003c:
            java.lang.String r0 = "APP_LEVEL_SPI_NO"
            goto L_0x002b
        L_0x003f:
            if (r18 == 0) goto L_0x0048
            boolean r0 = r18.booleanValue()
            r11 = 1
            if (r0 != 0) goto L_0x0049
        L_0x0048:
            r11 = 0
        L_0x0049:
            java.lang.Integer r0 = X.AnonymousClass05K.A06
            if (r7 == r0) goto L_0x0075
            r7 = r15
            if (r15 == 0) goto L_0x0075
            boolean r0 = r4 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x0075
            r9 = r4
            com.instagram.common.session.UserSession r9 = (com.instagram.common.session.UserSession) r9
            java.lang.String r0 = r9.A06
            boolean r0 = r14.A0N(r0)
            if (r0 == 0) goto L_0x0075
            X.0Tu r5 = X.0Tu.A05
            r0 = 18312950276176224(0x410f8800003960, double:1.898062423948829E-307)
            boolean r0 = X.1AW.A06(r5, r0)
            if (r0 == 0) goto L_0x0075
            r10 = 0
            boolean r13 = r19.booleanValue()
            r12 = r10
            X.C49132Epv.A00(r7, r8, r9, r10, r11, r12, r13)
        L_0x0075:
            if (r16 == 0) goto L_0x009f
            java.lang.String r1 = r8.getModuleName()
            java.lang.String r0 = "caa_login_save_credentials"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x009b
            java.lang.String r0 = "caa_login_one_tap_log_out_fragment"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x009b
            java.lang.String r0 = "caa_logout_save_credentials_single_account"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x009b
            java.lang.String r0 = "caa_registration_save_credentials"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x009f
        L_0x009b:
            r14.A0B(r8, r4, r3, r2)
            return
        L_0x009f:
            r1 = 0
            r0 = 0
            r14.A0B(r1, r1, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C319606qt.A07(android.content.Context, X.0iw, X.0lg, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.Iterable, boolean):void");
    }

    public final void A0A(AnonymousClass0iw r3, 0lg r4, Integer num, String str) {
        this.A00.remove(str);
        C49131Epu.A00(r3, r4, num, str, false);
        A0B((AnonymousClass0iw) null, (0lg) null, (Iterable) null, false);
    }

    public final void A0B(AnonymousClass0iw r17, 0lg r18, Iterable iterable, boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        Integer num;
        String str5;
        String str6;
        String str7;
        String str8;
        Integer num2;
        0lg r8 = r18;
        try {
            ArrayList<C319646qx> arrayList = new ArrayList<>(this.A00.values());
            HashSet hashSet = new HashSet();
            hashSet.addAll(0tS.A00().A09());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C319646qx r1 = (C319646qx) it.next();
                hashSet.remove(r1.A06);
                hashSet.remove(r1.A07);
            }
            0tS.A00().A0H(hashSet);
            StringWriter stringWriter = new StringWriter();
            17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
            A0A.A0c();
            16P.A03(A0A, "user_info_list");
            for (C319646qx r5 : arrayList) {
                if (r5 != null) {
                    A0A.A0c();
                    A0A.A0S("upsell_seen_before", r5.A0B);
                    A0A.A0S("allow_non_fb_sso", r5.A08);
                    A0A.A0S("rejected_sso_upsell", r5.A0A);
                    String str9 = r5.A06;
                    if (str9 != null) {
                        A0A.A0R(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str9);
                    }
                    String str10 = r5.A05;
                    if (str10 != null) {
                        A0A.A0R("login_nonce", str10);
                    }
                    String str11 = r5.A03;
                    if (str11 != null) {
                        A0A.A0R("login_token", str11);
                    }
                    String str12 = r5.A07;
                    if (str12 != null) {
                        A0A.A0R(C46325Dbt.A00(19, 8, 78), str12);
                    }
                    if (r5.A02 != null) {
                        A0A.A0q("profile_pic_url");
                        16h.A01(A0A, r5.A02);
                    }
                    A0A.A0Q("last_logout_timestamp", r5.A01);
                    A0A.A0Q("login_token_update_timestamp", r5.A00);
                    A0A.A0S("is_fx_sso", r5.A09);
                    String str13 = r5.A04;
                    if (str13 != null) {
                        A0A.A0R("is_app_level_spi", str13);
                    }
                    A0A.A0Z();
                }
            }
            A0A.A0Y();
            A0A.A0Z();
            A0A.close();
            String obj = stringWriter.toString();
            0xY AR4 = AnonymousClass0xl.A00(C61170le.A00).A00.AR4();
            AR4.E5g("one_tap_login_user_map", obj);
            AR4.apply();
            if (z && r18 != null && r17 != null) {
                HashMap hashMap = new HashMap();
                if (iterable != null) {
                    hashMap.put("uid", iterable.toString());
                }
                String moduleName = r17.getModuleName();
                switch (moduleName.hashCode()) {
                    case 200821380:
                        if (moduleName.equals("caa_registration_save_credentials")) {
                            C49867FAk.A00(r8, "ntf", "password_saving", "password_saving_success", (String) null, (HashMap) null);
                            return;
                        }
                        return;
                    case 293415587:
                        if (moduleName.equals("caa_login_one_tap_log_out_fragment")) {
                            C319616qu.A00(r8, AnonymousClass05K.A01, "logout_password_saving_multiaccount_opt_in_successful", "logout_spi", "spi", "logout_interaction", (String) null, hashMap);
                            return;
                        }
                        return;
                    case 1985400354:
                        if (moduleName.equals("caa_logout_save_credentials_single_account")) {
                            num2 = AnonymousClass05K.A01;
                            str8 = "logout_password_saving_opt_in_successful";
                            str7 = "logout_spi";
                            str6 = "spi";
                            str5 = "logout_interaction";
                            break;
                        } else {
                            return;
                        }
                    case 2122863948:
                        if (moduleName.equals("caa_login_save_credentials")) {
                            num2 = AnonymousClass05K.A01;
                            str8 = "login_password_saving_opt_in_successful";
                            str7 = "login_spi";
                            str6 = "spi";
                            str5 = "home_page";
                            break;
                        } else {
                            return;
                        }
                    default:
                        return;
                }
                C319616qu.A00(r8, num2, str8, str7, str6, str5, (String) null, (HashMap) null);
            }
        } catch (IOException unused) {
            if (z && r18 != null && r17 != null) {
                HashMap hashMap2 = new HashMap();
                if (iterable != null) {
                    hashMap2.put("uid", iterable.toString());
                }
                String moduleName2 = r17.getModuleName();
                switch (moduleName2.hashCode()) {
                    case 200821380:
                        if (moduleName2.equals("caa_registration_save_credentials")) {
                            C49867FAk.A00(r8, "ntf", "password_saving", "password_saving_failure", "Couldn't write to disk", (HashMap) null);
                            return;
                        }
                        return;
                    case 293415587:
                        if (moduleName2.equals("caa_login_one_tap_log_out_fragment")) {
                            num = AnonymousClass05K.A01;
                            str4 = "logout_password_saving_multiaccount_opt_in_failed";
                            str3 = "logout_spi";
                            str2 = "spi";
                            str = "logout_interaction";
                            break;
                        } else {
                            return;
                        }
                    case 1985400354:
                        if (moduleName2.equals("caa_logout_save_credentials_single_account")) {
                            num = AnonymousClass05K.A01;
                            str4 = "logout_password_saving_opt_in_failed";
                            str3 = "logout_spi";
                            str2 = "spi";
                            str = "logout_interaction";
                            break;
                        } else {
                            return;
                        }
                    case 2122863948:
                        if (moduleName2.equals("caa_login_save_credentials")) {
                            num = AnonymousClass05K.A01;
                            str4 = "login_password_saving_opt_in_failed";
                            str3 = "login_spi";
                            str2 = "spi";
                            str = "home_page";
                            break;
                        } else {
                            return;
                        }
                    default:
                        return;
                }
                hashMap2 = null;
                C319616qu.A00(r8, num, str4, str3, str2, str, "Couldn't write to disk", hashMap2);
            }
        }
    }

    public final void A0E(C319646qx r3) {
        this.A00.put(r3.A06, r3);
        A0B((AnonymousClass0iw) null, (0lg) null, (Iterable) null, false);
    }

    public final void A0G(String str) {
        if (this.A00.containsKey(str)) {
            C319646qx r3 = (C319646qx) this.A00.get(str);
            r3.A05 = null;
            r3.A03 = null;
            r3.A00 = -1;
            A0B((AnonymousClass0iw) null, (0lg) null, (Iterable) null, false);
        }
    }

    public final boolean A0I() {
        int i = 0;
        for (Map.Entry value : this.A00.entrySet()) {
            if (((C319646qx) value.getValue()).A08) {
                i++;
            }
        }
        if (i < 5) {
            return true;
        }
        return false;
    }

    public final boolean A0J(String str) {
        if (!this.A00.containsKey(str) || !((C319646qx) this.A00.get(str)).A08 || !((C319646qx) this.A00.get(str)).A04.equals("APP_LEVEL_SPI_YES")) {
            return false;
        }
        return true;
    }

    public final boolean A0K(String str) {
        if (!this.A00.containsKey(str) || !((C319646qx) this.A00.get(str)).A08) {
            return false;
        }
        return true;
    }

    public final boolean A0L(String str) {
        if (!this.A00.containsKey(str) || !((C319646qx) this.A00.get(str)).A0B) {
            return false;
        }
        return true;
    }

    public final boolean A0M(String str) {
        if (!this.A00.containsKey(str) || !((C319646qx) this.A00.get(str)).A0A) {
            return false;
        }
        return true;
    }

    public final boolean A0N(String str) {
        if (!this.A00.containsKey(str) || !((C319646qx) this.A00.get(str)).A08 || ((C319646qx) this.A00.get(str)).A05 != null) {
            return false;
        }
        return true;
    }

    public final ArrayList A06(0lg r5) {
        ArrayList A05 = A05();
        Iterator it = A05.iterator();
        while (it.hasNext()) {
            if (AnonymousClass0BO.A00(r5).CO7(((C319646qx) it.next()).A06)) {
                it.remove();
            }
        }
        return A05;
    }

    public final void A08(Context context, AnonymousClass0iw r2, 0lg r3, Boolean bool, Boolean bool2, Integer num, String str, boolean z) {
        A07(context, r2, r3, bool, bool2, num, Collections.singleton(str), z);
    }

    public final void A09(Context context, AnonymousClass0iw r12, 0lg r13, Integer num, String str, boolean z) {
        Context context2 = context;
        AnonymousClass0iw r3 = r12;
        0lg r4 = r13;
        A07(context2, r3, r4, Boolean.valueOf(A0J(str)), false, num, Collections.singleton(str), z);
    }

    public final void A0C(0lg r7) {
        List<C319646qx> A03 = A03();
        HashMap hashMap = new HashMap();
        if (A03 != null) {
            ArrayList arrayList = new ArrayList();
            for (C319646qx r2 : A03) {
                if (r2 == null || (!r2.A0A && r2.A08 && !AnonymousClass0BO.A00(r7).CO7(r2.A06) && (TextUtils.isEmpty(r2.A05) || TextUtils.isEmpty(r2.A07) || TextUtils.isEmpty(r2.A06)))) {
                    arrayList.add(r2);
                } else {
                    hashMap.put(r2.A06, r2);
                }
            }
        }
        if (!hashMap.isEmpty()) {
            this.A00 = hashMap;
        }
    }

    public final void A0D(UserSession userSession, String str) {
        if (A04(str).booleanValue()) {
            27y A002 = 27u.A00(userSession);
            CallerContext.A01("OneTapLoginUserHelper");
            if (A002.A01()) {
                C319646qx A022 = A02(this, str);
                A022.A04 = "APP_LEVEL_SPI_YES";
                A0E(A022);
            }
        }
    }

    public final void A0F(User user) {
        String str;
        Iterator it = A05().iterator();
        while (it.hasNext()) {
            C319646qx r2 = (C319646qx) it.next();
            String str2 = r2.A06;
            str2.getClass();
            if (str2.equals(user.getId()) && (str = r2.A05) != null) {
                A0E(new C319646qx(user, str));
            }
        }
    }

    public final void A0H(String str) {
        C319646qx A022 = A02(this, str);
        A022.A0B = true;
        this.A00.put(str, A022);
        A0B((AnonymousClass0iw) null, (0lg) null, (Iterable) null, false);
    }
}

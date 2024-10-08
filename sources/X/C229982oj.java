package X;

import android.os.Bundle;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.profile.intf.UserDetailEntryInfo;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.2oj  reason: invalid class name and case insensitive filesystem */
public final class C229982oj implements C229992ok {
    public Set A00;
    public final FragmentActivity A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final C229972oi A04;
    public final Fragment A05;
    public final AnonymousClass4D6 A06;
    public final C229962oh A07;
    public final AnonymousClass2oG A08;
    public final C230012om A09;
    public final Integer A0A;

    public final void A9R(AnonymousClass3O9 r2, C242803Vz r3) {
        0qQ.A0B(r2, 0);
        0qQ.A0B(r3, 1);
        AnonymousClass2oG r0 = this.A08;
        if (r0 != null) {
            r0.A9R(r2, r3);
        }
    }

    /* JADX WARNING: type inference failed for: r0v23, types: [X.WNI, java.lang.Object, X.4bz] */
    public final void DpE(1UQ r11, AnonymousClass3UO r12, Integer num, String str, String str2, String str3, List list) {
        String str4;
        EX9 ex9 = EX9.UNKNOWN;
        if (r11 == 1UQ.A0v) {
            ex9 = EX9.FEED_SUGGESTED_USERS_UPSELL;
        } else if (r11 == 1UQ.A0r) {
            ex9 = EX9.FEED_SUGGESTED_PRODUCERS_UPSELL;
        }
        int ordinal = r12.ordinal();
        if (ordinal != 2) {
            String str5 = str;
            String str6 = str2;
            if (ordinal == 6) {
                List list2 = list;
                if (list != null) {
                    str4 = 00k.A0P(",", "", "", list2, G3T.A00);
                } else {
                    str4 = "";
                }
                if (FC6.A02()) {
                    C309516Yo r1 = new C309516Yo(this.A01, this.A03);
                    r1.A08();
                    r1.A0D(FC6.A00().A00().A00((Boolean) null, "feed_unit", str5, str6, r11.toString(), str4, "feed_su_with_dp_upsell_card"));
                    r1.A04();
                }
                String str7 = str3;
                if (str3 != null && num != null) {
                    int intValue = num.intValue();
                    C229972oi r0 = this.A04;
                    if (r0 != null) {
                        r0.A00(str7, intValue);
                    }
                }
            } else if (ordinal == 4) {
                A00(r11, str, str2);
            } else if (ordinal == 5) {
                0eE r02 = AnonymousClass0t1.A01;
                UserSession userSession = this.A03;
                if (VFS.A00(r02.A01(userSession)) == 0) {
                    C309516Yo r2 = new C309516Yo(this.A01, userSession);
                    r2.A0D(C46447Df9.A03().A01.A04("profile"));
                    r2.A0A = C273654mx.A00(479);
                    String str8 = userSession.A06;
                    ? obj = new Object();
                    obj.A00 = str8;
                    r2.A07 = obj;
                    r2.A04();
                    return;
                }
                1WW r13 = 1WW.A00;
                if (r13 != null) {
                    r13.A07(this.A01, userSession);
                } else {
                    0qQ.A0F("instance");
                    throw AnonymousClass00P.createAndThrow();
                }
            } else if (ordinal != 3) {
                0wb.A03("SuggestedUsersDelegateImpl", "Unhandled Suggested Upsell button click `SuggestedItemType`. Please fix ASAP because  otherwise tap behavior for your upsell will be nonfunctional. ");
            } else {
                C48958Emw.A00(this.A01, C48145EZn.FEED_SUGGESTED_USERS, this.A03, true, false);
            }
        } else {
            UserSession userSession2 = this.A03;
            new FGL(this.A05, this.A02, userSession2, (C51950G8t) null, (C49498Ewd) null).A07(ex9);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DpF(android.app.Activity r21, android.view.View r22, com.instagram.common.session.UserSession r23, X.AnonymousClass3UM r24, java.lang.Integer r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.util.List r31, int r32, int r33, int r34) {
        /*
            r20 = this;
            r0 = 0
            r1 = r23
            X.0qQ.A0B(r1, r0)
            r2 = r20
            java.lang.Integer r0 = r2.A0A
            java.lang.String r17 = X.C294615mk.A00(r0)
            r3 = r24
            java.lang.String r4 = r3.getId()
            X.0iw r0 = r2.A02
            java.lang.String r8 = r0.getModuleName()
            r9 = 0
            r1 = 2
            X.0qQ.A0B(r4, r1)
            r1 = 3
            X.0qQ.A0B(r8, r1)
            java.lang.String r11 = ""
            java.lang.String r7 = r3.getAlgorithm()
            java.lang.String r1 = r3.CDC()
            if (r1 == 0) goto L_0x0030
            r11 = r1
        L_0x0030:
            java.lang.String r15 = r3.BxN()
            X.2om r6 = r2.A09
            r1 = r32
            r18 = r33
            r12 = r26
            r10 = r27
            r13 = r28
            r14 = r29
            r19 = r1
            r16 = r4
            X.C230012om.A03(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r9 = r31
            if (r31 == 0) goto L_0x00ea
            r5 = r30
            if (r30 == 0) goto L_0x00ea
            java.lang.String r4 = "middle_state"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x00ea
            r4 = r22
            if (r22 == 0) goto L_0x00ea
            r5 = r21
            if (r21 == 0) goto L_0x00ea
            androidx.fragment.app.FragmentActivity r3 = r2.A01
            android.view.Window r6 = r3.getWindow()
            if (r6 == 0) goto L_0x00dc
            android.view.View r6 = r6.getDecorView()
            if (r6 == 0) goto L_0x00dc
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            com.instagram.common.session.UserSession r6 = r2.A03
            java.lang.String r8 = r6.A05
            java.lang.String r6 = "IgSessionManager.SESSION_TOKEN_KEY"
            r7.putString(r6, r8)
            r6 = 469(0x1d5, float:6.57E-43)
            java.lang.String r6 = X.C66579MXk.A00(r6)
            r8 = r34
            r7.putInt(r6, r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r9)
            r6 = 468(0x1d4, float:6.56E-43)
            java.lang.String r6 = X.C66579MXk.A00(r6)
            r7.putParcelableArrayList(r6, r8)
            r6 = 86
            java.lang.String r6 = X.C66579MXk.A00(r6)
            r7.putInt(r6, r1)
            r1 = 85
            java.lang.String r1 = X.C66579MXk.A00(r1)
            r7.putString(r1, r10)
            java.lang.String r1 = r0.getModuleName()
            r0 = 84
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r7.putString(r0, r1)
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r8 = com.instagram.modal.TransparentModalActivity.class
            r0 = 820(0x334, float:1.149E-42)
            java.lang.String r6 = X.C273654mx.A00(r0)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r3, r8)
            java.lang.String r0 = "fragment_name"
            android.content.Intent r1 = r1.putExtra(r0, r6)
            java.lang.String r0 = "fragment_arguments"
            android.content.Intent r1 = r1.putExtra(r0, r7)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r1.setFlags(r0)
            X.0b6 r0 = X.0kR.A00
            X.0R3 r0 = r0.A07()
            r0.A08(r5, r3, r1, r4)
        L_0x00dc:
            if (r25 == 0) goto L_0x00e9
            int r1 = r25.intValue()
            X.2oi r0 = r2.A04
            if (r0 == 0) goto L_0x00e9
            r0.A00(r13, r1)
        L_0x00e9:
            return
        L_0x00ea:
            r2.A01(r3, r12, r10, r13)
            goto L_0x00dc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C229982oj.DpF(android.app.Activity, android.view.View, com.instagram.common.session.UserSession, X.3UM, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, int, int, int):void");
    }

    public final void DpH(1UQ r12, AnonymousClass3UM r13, String str, String str2, String str3, String str4, int i, int i2) {
        1OC A012;
        String A002 = C294615mk.A00(this.A0A);
        String id = r13.getId();
        String moduleName = this.A02.getModuleName();
        0qQ.A0B(id, 2);
        0qQ.A0B(moduleName, 3);
        String str5 = "";
        String CDC = r13.CDC();
        if (CDC != null) {
            str5 = CDC;
        }
        String algorithm = r13.getAlgorithm();
        String BxN = r13.BxN();
        0wc r2 = this.A09.A01;
        0Aj A003 = r2.A00(r2.A00, "recommended_user_dismissed");
        A003.AAJ("target_id", id);
        A003.A8k("position", Integer.valueOf(i2));
        A003.AAJ("view_module", A002);
        A003.AAJ("algorithm", algorithm);
        A003.A8k("view_state_item_type", Integer.valueOf(i));
        A003.AAJ("container_module", moduleName);
        A003.AAJ("follow_impression_id", str5);
        A003.AAJ("ranking_algorithm", str4);
        A003.AAJ("social_context", BxN);
        A003.AAJ("insertion_context", str);
        A003.AAJ("display_format", str2);
        A003.AAJ("netego_unit_id", str3);
        A003.AAJ("topic_name", (String) null);
        0bb r1 = new 0bb();
        r1.A06("search_session_id", (String) null);
        r1.A06("serp_session_id", (String) null);
        r1.A06("query_text", (String) null);
        r1.A06("rank_token", (String) null);
        A003.AAK(r1, "search_context");
        A003.A8M((AnonymousClass0Ac) null, "text_app_aysf_vertical_type");
        A003.Cgf();
        String id2 = r13.CCd().getId();
        String algorithm2 = r13.getAlgorithm();
        1UQ r0 = 1UQ.A0o;
        UserSession userSession = this.A03;
        if (r12 == r0) {
            1NY r22 = new 1NY(userSession, -2);
            r22.A04();
            r22.A0A("discover/dismiss_close_friend_suggestion/");
            r22.A9m("target_id", id2);
            r22.A0Q(1XP.class, 1XY.class);
            A012 = r22.A0M();
        } else {
            A012 = F88.A01(userSession, id2, r13.CDC(), algorithm2);
        }
        1ES.A03(A012);
    }

    public final void DpO(C292975jp r7, User user, int i) {
        AnonymousClass4D6 r4 = this.A06;
        1OC A002 = C46374Ddr.A00(this.A03, AnonymousClass05K.A01, user.getId(), (String) null, false);
        A002.A00 = new C68523NLu(r7, this, user, i);
        r4.schedule(A002);
    }

    public final void EBq(View view, AnonymousClass3O9 r3) {
        0qQ.A0B(r3, 0);
        0qQ.A0B(view, 1);
        AnonymousClass2oG r0 = this.A08;
        if (r0 != null) {
            r0.EBq(view, r3);
        }
    }

    public final void A01(AnonymousClass3UM r20, String str, String str2, String str3) {
        FragmentActivity fragmentActivity = this.A01;
        if (AnonymousClass06S.A01(fragmentActivity.getSupportFragmentManager())) {
            UserSession userSession = this.A03;
            C309516Yo r4 = new C309516Yo(fragmentActivity, userSession);
            r4.A08();
            1a1 r3 = C46447Df9.A03().A01;
            C46474Dfc A012 = C46548Dgp.A01(userSession, r20.getId(), C273654mx.A00(3382), this.A02.getModuleName());
            A012.A03 = new UserDetailEntryInfo((String) null, (String) null, (String) null, (String) null, str, str2, str3, (String) null, (String) null, (String) null, (String) null, (List) null);
            r4.A0B((Bundle) null, r3.A02(userSession, A012.A04()));
            r4.A0B = "suggested_users";
            r4.A04();
        }
    }

    public final AnonymousClass0iw AbT() {
        return this.A02;
    }

    public final void Ckj(AnonymousClass3UH r5) {
        C229962oh r3 = this.A07;
        if (r3 != null) {
            HashSet hashSet = r3.A03;
            String str = r5.A0F;
            if (str == null) {
                str = "";
            }
            if (hashSet.add(str)) {
                0wc r2 = r3.A01;
                0Aj A002 = r2.A00(r2.A00, C273654mx.A00(308));
                if (A002.isSampled()) {
                    String str2 = r5.A0F;
                    if (str2 == null) {
                        str2 = "";
                    }
                    A002.AAJ("netego_id", str2);
                    1UQ r0 = r5.A05;
                    if (r0 == null) {
                        r0 = 1UQ.A0v;
                    }
                    A002.AAJ(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r0.toString());
                    A002.AAJ("tracking_token", r5.A0G);
                    A002.A9F(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, 00y.A0n(10, r3.A02.A06));
                    A002.Cgf();
                }
            }
        }
    }

    public final void Ckk(AnonymousClass3UH r10) {
        C229962oh r2 = this.A07;
        if (r2 != null) {
            HashSet hashSet = r2.A04;
            String str = r10.A0F;
            if (str == null) {
                str = "";
            }
            if (hashSet.add(str)) {
                UserSession userSession = r2.A02;
                1UQ r0 = r10.A05;
                if (r0 == null) {
                    r0 = 1UQ.A0v;
                }
                String obj = r0.toString();
                String str2 = r10.A0F;
                if (str2 == null) {
                    str2 = "";
                }
                VF8.A00(r2.A00, r2.A01, userSession, (Long) null, obj, str2, C273654mx.A00(644), r10.A0G);
            }
        }
    }

    public final void Ckl(AnonymousClass3UH r5) {
        C229962oh r3 = this.A07;
        if (r3 != null) {
            HashSet hashSet = r3.A05;
            String str = r5.A0F;
            if (str == null) {
                str = "";
            }
            if (hashSet.add(str)) {
                0wc r2 = r3.A01;
                0Aj A002 = r2.A00(r2.A00, "instagram_netego_secondary_click");
                if (A002.isSampled()) {
                    1UQ r0 = r5.A05;
                    if (r0 == null) {
                        r0 = 1UQ.A0v;
                    }
                    A002.AAJ(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r0.toString());
                    A002.AAJ("action", "cta_secondary_click");
                    A002.AAJ("container_module", r3.A00.getModuleName());
                    A002.A9F("ig_userid", Long.valueOf(Long.parseLong(r3.A02.A06)));
                    String str2 = r5.A0F;
                    if (str2 == null) {
                        str2 = "";
                    }
                    A002.AAJ("netego_id", str2);
                    A002.AAJ("tracking_token", r5.A0G);
                    A002.Cgf();
                }
            }
        }
    }

    public final void DpJ(AnonymousClass3UM r18, Long l, String str, String str2, String str3, String str4, int i, int i2, int i3) {
        Set set = this.A00;
        if (set == null) {
            set = new HashSet();
            this.A00 = set;
        }
        if (set.add(r18.getId())) {
            String A002 = C294615mk.A00(this.A0A);
            String id = r18.getId();
            String moduleName = this.A02.getModuleName();
            0qQ.A0B(id, 2);
            0qQ.A0B(moduleName, 3);
            String str5 = "";
            String CDC = r18.CDC();
            if (CDC != null) {
                str5 = CDC;
            }
            String algorithm = r18.getAlgorithm();
            String BxN = r18.BxN();
            C230012om.A01(this.A09, Integer.valueOf(i3), l, algorithm, moduleName, (String) null, "profile", str5, str, str3, str4, BxN, id, A002, i2, i);
        }
    }

    public final void DpM(1UQ r6, Integer num, String str, String str2, String str3, String str4, int i) {
        if (r6 == 1UQ.A0o) {
            C309516Yo r1 = new C309516Yo(this.A01, this.A03);
            r1.A08();
            r1.A0D(new C62040KXc());
            r1.A04();
        } else {
            String A002 = C294615mk.A00(this.A0A);
            String moduleName = this.A02.getModuleName();
            0qQ.A0B("", 2);
            0qQ.A0B(moduleName, 3);
            C230012om r3 = this.A09;
            0wc r2 = r3.A01;
            0Aj A003 = r2.A00(r2.A00, C273654mx.A00(913));
            A003.AAJ("view_module", A002);
            A003.A8k("view_state_item_type", Integer.valueOf(i));
            A003.AAJ("ranking_algorithm", str);
            A003.AAJ("netego_unit_id", str2);
            A003.AAJ("module", r3.A02);
            A003.A8M((AnonymousClass0Ac) null, "text_app_aysf_vertical_type");
            A003.Cgf();
            A00(r6, str3, str4);
        }
        if (num != null) {
            int intValue = num.intValue();
            C229972oi r0 = this.A04;
            if (r0 != null) {
                r0.A00(str2, intValue);
            }
        }
    }

    public final void DpN() {
        Set set = this.A00;
        if (set != null) {
            set.clear();
        }
    }

    public C229982oj(Fragment fragment, FragmentActivity fragmentActivity, AnonymousClass0iw r7, UserSession userSession, C229962oh r9, AnonymousClass2oG r10, C229972oi r11, Integer num) {
        this.A03 = userSession;
        this.A05 = fragment;
        this.A02 = r7;
        this.A01 = fragmentActivity;
        this.A08 = r10;
        this.A0A = num;
        this.A09 = new C230012om(r7, userSession);
        this.A06 = new C228602lw(fragment.requireContext(), AnonymousClass07i.A00(fragment), (Integer) null);
        this.A07 = r9;
        this.A04 = r11;
    }

    private final void A00(1UQ r11, String str, String str2) {
        if (FC6.A02()) {
            C309516Yo r1 = new C309516Yo(this.A01, this.A03);
            r1.A08();
            r1.A0B((Bundle) null, FC6.A00().A00().A00((Boolean) null, "feed_unit", str, str2, r11.toString(), (String) null, (String) null));
            r1.A04();
        }
    }

    public final void DpI(AnonymousClass3UM r19, String str, String str2, String str3, String str4, int i, int i2) {
        EWA ewa;
        User CCd = r19.CCd();
        String str5 = null;
        if (CCd != null) {
            FollowStatus B6o = CCd.B6o();
            ewa = C292995jr.A02(B6o);
            str5 = 1aC.A06(B6o);
        } else {
            ewa = null;
        }
        String A002 = C294615mk.A00(this.A0A);
        String id = r19.getId();
        String moduleName = this.A02.getModuleName();
        String str6 = null;
        0qQ.A0B(id, 2);
        0qQ.A0B(moduleName, 3);
        String str7 = "";
        String CDC = r19.CDC();
        if (CDC != null) {
            str7 = CDC;
        }
        String algorithm = r19.getAlgorithm();
        String BxN = r19.BxN();
        if (ewa != null) {
            str6 = ewa.A00;
        }
        C230012om.A05(this.A09, algorithm, moduleName, (String) null, str2, str5, str7, str, str3, str4, str6, BxN, id, A002, i2, i);
    }
}

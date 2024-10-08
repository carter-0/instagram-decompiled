package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.android.R;
import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.UUID;

/* renamed from: X.3Gj  reason: invalid class name and case insensitive filesystem */
public final class C239413Gj implements AnonymousClass0lh {
    public static final AnonymousClass0iw A08 = new 0xG("live_in_app_notif");
    public Context A00;
    public UserSession A01;
    public C313626gk A02;
    public boolean A03;
    public boolean A04;
    public final Handler A05 = new Handler(Looper.getMainLooper());
    public final HashMap A06 = new HashMap();
    public final HashMap A07 = new HashMap();

    public final void A08(String str, String str2) {
        if (this.A01 != null && this.A00 != null) {
            A05(new C51059Fnp(this, str2), this, AnonymousClass05K.A0C, str, false);
        }
    }

    public static final OU0 A00(Reel reel, User user, C239413Gj r8, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        C270194gL r5;
        String str5;
        User user2;
        Set A062;
        int i;
        int i2;
        Object[] objArr;
        ImageUrl imageUrl = null;
        if (r8.A00 == null || (r5 = reel.A0H) == null) {
            return null;
        }
        String username = user.getUsername();
        Context context = r8.A00;
        if (context != null) {
            if (str.length() == 0) {
                if (z3) {
                    i2 = 2131963883;
                    if (z) {
                        i2 = 2131963961;
                    }
                } else if (z) {
                    i2 = 2131963960;
                } else {
                    i2 = 2131963882;
                    if (z2) {
                        i2 = 2131963876;
                    }
                }
                objArr = new Object[]{username};
            } else {
                if (z3) {
                    i = 2131963884;
                    if (z) {
                        i = 2131963962;
                    }
                } else if (z) {
                    i = 2131963963;
                } else {
                    i = 2131963885;
                    if (z2) {
                        i = 2131963877;
                    }
                }
                objArr = new Object[]{username, str};
            }
            str5 = context.getString(i2, objArr);
        } else {
            str5 = null;
        }
        if (!reel.A0d() || ((A062 = r5.A06()) != null && A062.isEmpty())) {
            user2 = null;
        } else {
            user2 = (User) r5.A06().iterator().next();
        }
        OIS A002 = OU0.A00(r8.A01.A06);
        A002.A0G = "ig_live_invite_notification_type";
        A002.A0E = str5;
        A002.A04 = user.Bh3();
        if (user2 != null) {
            imageUrl = user2.Bh3();
        }
        A002.A05 = imageUrl;
        A002.A03 = PushChannelType.LOCAL;
        A002.A08 = new C72720PHa(r5, reel, user, r8, str2, str3, str4);
        return new OU0(A002);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r15 = r17;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(com.instagram.model.reels.Reel r17, com.instagram.user.model.User r18, X.C239413Gj r19, java.lang.String r20, boolean r21) {
        /*
            r2 = r19
            android.content.Context r0 = r2.A00
            if (r0 == 0) goto L_0x004f
            r15 = r17
            com.instagram.user.model.User r5 = r15.A0D()
            if (r5 == 0) goto L_0x004f
            X.4gL r1 = r15.A0H
            if (r1 == 0) goto L_0x004f
            r0 = 18
            java.lang.String r3 = X.C66579MXk.A00(r0)
            X.0qQ.A0C(r5, r3)
            java.lang.String r4 = r1.A0X
            r4.getClass()
            java.lang.String r8 = r1.A0e
            r8.getClass()
            r17 = r18
            X.2MD r0 = X.2MD.A01()
            boolean r0 = r0.A0A()
            r12 = 0
            if (r0 == 0) goto L_0x004f
            androidx.fragment.app.FragmentActivity r0 = X.C239403Gi.A00()
            if (r0 == 0) goto L_0x0050
            X.0hq r1 = r0.getSupportFragmentManager()
            r0 = 2131435209(0x7f0b1ec9, float:1.8492254E38)
            androidx.fragment.app.Fragment r1 = r1.A0P(r0)
            if (r1 == 0) goto L_0x0050
            boolean r0 = r1 instanceof X.K6W
            if (r0 == 0) goto L_0x0050
            boolean r0 = r1.isVisible()
            if (r0 == 0) goto L_0x0050
        L_0x004f:
            return
        L_0x0050:
            X.6gk r0 = r2.A02
            if (r0 == 0) goto L_0x005b
            boolean r0 = r0.EtF(r4)
            if (r0 != 0) goto L_0x005b
            return
        L_0x005b:
            if (r21 == 0) goto L_0x004f
            r7 = 1
            if (r18 == 0) goto L_0x019f
            java.util.HashMap r6 = r2.A06
            java.lang.String r1 = r5.getId()
            java.lang.String r0 = r18.getId()
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
            java.lang.Object r0 = r6.get(r0)
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x004f
            java.lang.String r1 = r5.getId()
            java.lang.String r0 = r18.getId()
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
            r6.put(r0, r4)
        L_0x0087:
            X.2MD r4 = X.2MD.A01()
            com.instagram.user.model.User r5 = r15.A0D()
            X.0qQ.A0C(r5, r3)
            android.content.Context r6 = r2.A00
            if (r6 == 0) goto L_0x019d
            com.instagram.common.session.UserSession r13 = r2.A01
            if (r13 == 0) goto L_0x019d
            X.4gL r14 = r15.A0H
            if (r14 == 0) goto L_0x019d
            java.lang.String r9 = r14.A0Y
            if (r9 != 0) goto L_0x00a4
            java.lang.String r9 = ""
        L_0x00a4:
            X.3NV r1 = r14.A0A
            if (r1 != 0) goto L_0x00aa
            X.3NV r1 = X.AnonymousClass3NV.A08
        L_0x00aa:
            X.3NV r0 = X.AnonymousClass3NV.A0A
            r11 = 0
            if (r1 != r0) goto L_0x00b0
            r11 = 1
        L_0x00b0:
            X.3NV r0 = X.AnonymousClass3NV.A05
            if (r1 == r0) goto L_0x00c6
            X.3NV r0 = X.AnonymousClass3NV.A04
            if (r1 != r0) goto L_0x019a
            X.4w0 r0 = r14.A02
            if (r0 == 0) goto L_0x019a
            X.4vt r0 = r0.A0A
            if (r0 == 0) goto L_0x019a
            boolean r0 = r0.CVs()
            if (r0 != r7) goto L_0x019a
        L_0x00c6:
            r3 = 1
        L_0x00c7:
            X.3NV r1 = r14.A0A
            if (r1 != 0) goto L_0x00cd
            X.3NV r1 = X.AnonymousClass3NV.A08
        L_0x00cd:
            X.3NV r0 = X.AnonymousClass3NV.A04
            r10 = 0
            if (r1 != r0) goto L_0x00d3
            r10 = 1
        L_0x00d3:
            boolean r1 = r15.A0j()
            r16 = r5
            r8 = 2
            if (r18 == 0) goto L_0x0143
            com.instagram.user.model.FollowStatus r1 = r18.B6o()
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A05
            if (r1 != r0) goto L_0x00f0
            com.instagram.user.model.FollowStatus r1 = r5.B6o()
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A06
            if (r1 != r0) goto L_0x00f0
            r17 = r5
            r16 = r18
        L_0x00f0:
            if (r11 == 0) goto L_0x0134
            r3 = 2131963964(0x7f13303c, float:1.9564696E38)
        L_0x00f5:
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.String r0 = r16.getUsername()
            r1[r12] = r0
            java.lang.String r9 = r17.getUsername()
        L_0x0101:
            r1[r7] = r9
        L_0x0103:
            java.lang.String r3 = r6.getString(r3, r1)
            X.0qQ.A0A(r3)
            java.lang.String r0 = r13.A06
            X.OIS r1 = X.OU0.A00(r0)
            r0 = r20
            r1.A0G = r0
            r1.A0E = r3
            com.instagram.common.typedurl.ImageUrl r0 = r5.Bh3()
            r1.A04 = r0
            com.instagram.common.notifications.push.intf.PushChannelType r0 = com.instagram.common.notifications.push.intf.PushChannelType.LOCAL
            r1.A03 = r0
            X.PHY r12 = new X.PHY
            r17 = r2
            r16 = r5
            r12.<init>(r13, r14, r15, r16, r17)
            r1.A08 = r12
            X.OU0 r0 = new X.OU0
            r0.<init>(r1)
        L_0x0130:
            r4.A09(r0)
            return
        L_0x0134:
            if (r3 == 0) goto L_0x013a
            r3 = 2131963912(0x7f133008, float:1.956459E38)
            goto L_0x00f5
        L_0x013a:
            r3 = 2131963916(0x7f13300c, float:1.9564599E38)
            if (r10 == 0) goto L_0x00f5
            r3 = 2131963874(0x7f132fe2, float:1.9564514E38)
            goto L_0x00f5
        L_0x0143:
            int r0 = r9.length()
            if (r0 <= 0) goto L_0x0166
            if (r11 == 0) goto L_0x0157
            r3 = 2131963967(0x7f13303f, float:1.9564702E38)
        L_0x014e:
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.String r0 = r5.getUsername()
            r1[r12] = r0
            goto L_0x0101
        L_0x0157:
            if (r3 == 0) goto L_0x015d
            r3 = 2131963915(0x7f13300b, float:1.9564597E38)
            goto L_0x014e
        L_0x015d:
            r3 = 2131963985(0x7f133051, float:1.9564739E38)
            if (r10 == 0) goto L_0x014e
            r3 = 2131963879(0x7f132fe7, float:1.9564524E38)
            goto L_0x014e
        L_0x0166:
            if (r1 == 0) goto L_0x0185
            if (r11 == 0) goto L_0x0176
            r3 = 2131963966(0x7f13303e, float:1.95647E38)
        L_0x016d:
            java.lang.String r0 = r5.getUsername()
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            goto L_0x0103
        L_0x0176:
            if (r3 == 0) goto L_0x017c
            r3 = 2131963914(0x7f13300a, float:1.9564595E38)
            goto L_0x016d
        L_0x017c:
            r3 = 2131963938(0x7f133022, float:1.9564644E38)
            if (r10 == 0) goto L_0x016d
            r3 = 2131963878(0x7f132fe6, float:1.9564522E38)
            goto L_0x016d
        L_0x0185:
            if (r11 == 0) goto L_0x018b
            r3 = 2131963965(0x7f13303d, float:1.9564698E38)
            goto L_0x016d
        L_0x018b:
            if (r3 == 0) goto L_0x0191
            r3 = 2131963913(0x7f133009, float:1.9564593E38)
            goto L_0x016d
        L_0x0191:
            r3 = 2131963927(0x7f133017, float:1.9564621E38)
            if (r10 == 0) goto L_0x016d
            r3 = 2131963875(0x7f132fe3, float:1.9564516E38)
            goto L_0x016d
        L_0x019a:
            r3 = 0
            goto L_0x00c7
        L_0x019d:
            r0 = 0
            goto L_0x0130
        L_0x019f:
            java.util.HashMap r6 = r2.A07
            java.lang.String r0 = r5.getId()
            java.lang.Object r0 = r6.get(r0)
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x004f
            java.lang.String r11 = r5.getId()
            com.instagram.common.session.UserSession r0 = r2.A01
            X.0iw r10 = A08
            X.0wc r9 = X.AnonymousClass0kN.A01(r10, r0)
            java.lang.String r1 = "live_notification_bar_imp"
            X.0kJ r0 = r9.A00
            X.0Aj r9 = r9.A00(r0, r1)
            long r0 = java.lang.Long.parseLong(r11)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "a_pk"
            r9.A9F(r0, r1)
            long r0 = java.lang.Long.parseLong(r4)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "broadcast_id"
            r9.A9F(r0, r1)
            java.lang.String r0 = "m_pk"
            r9.AAJ(r0, r8)
            java.lang.String r1 = r10.getModuleName()
            java.lang.String r0 = "container_module"
            r9.AAJ(r0, r1)
            r0 = 10
            java.lang.Long r1 = X.00y.A0n(r0, r4)
            java.lang.String r0 = "b_pk"
            r9.A9F(r0, r1)
            r9.Cgf()
            java.lang.String r0 = r5.getId()
            r6.put(r0, r4)
            goto L_0x0087
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C239413Gj.A03(com.instagram.model.reels.Reel, com.instagram.user.model.User, X.3Gj, java.lang.String, boolean):void");
    }

    public static final void A05(C46203DQf dQf, C239413Gj r4, Integer num, String str, boolean z) {
        UserSession userSession = r4.A01;
        if (userSession != null && !14i.A08()) {
            1OC A062 = LTC.A06(userSession, str, true);
            A062.A00 = new C43873CGn(userSession, dQf, r4, num, str, z);
            1ES.A03(A062);
        }
    }

    public static final void A06(C239413Gj r3, String str, String str2, String str3) {
        UserSession userSession = r3.A01;
        AnonymousClass0iw r32 = A08;
        0wc A012 = AnonymousClass0kN.A01(r32, userSession);
        0Aj A002 = A012.A00(A012.A00, "live_notification_bar_tapped");
        A002.A9F("a_pk", Long.valueOf(Long.parseLong(str3)));
        A002.A9F(TraceFieldType.BroadcastId, Long.valueOf(Long.parseLong(str2)));
        A002.AAJ("m_pk", str);
        A002.AAJ("container_module", r32.getModuleName());
        A002.Cgf();
    }

    public static final void A07(C239413Gj r2, String str, String str2, String str3) {
        UserSession userSession = r2.A01;
        if (userSession != null) {
            0xI A002 = 0xI.A00(A08, "live_push_notification_fetch_broadcast_result");
            A002.A0C(TraceFieldType.BroadcastId, str);
            A002.A0C("a_pk", str2);
            A002.A0C(AnonymousClass000.A00(364), str3);
            C60510iO.A00(userSession).EFq(A002);
        }
    }

    public final void onSessionWillEnd() {
        this.A07.clear();
        this.A00 = null;
    }

    public C239413Gj(UserSession userSession, Context context) {
        this.A01 = userSession;
        this.A00 = context;
    }

    public static final void A01(Reel reel, AnonymousClass3BQ r9, C239413Gj r10, String str, String str2) {
        boolean z;
        if (2MD.A01().A0A()) {
            FragmentActivity A002 = C239403Gi.A00();
            UserSession userSession = r10.A01;
            if (A002 != null && userSession != null) {
                Reel reel2 = reel;
                C270194gL r0 = reel.A0H;
                AnonymousClass3BQ r5 = r9;
                if (r0 != null) {
                    C278114wI r02 = r0.A06;
                    if (r02 == null) {
                        r02 = C278114wI.UNKNOWN;
                    }
                    if (r02.A00()) {
                        if (r9 == AnonymousClass3BQ.PUSH_NOTIFICATION) {
                            z = true;
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(reel2);
                            F8Q.A01(A002, userSession, reel2, r5, str, str2, arrayList, 0, z, false);
                        }
                        C59689JTv.A07(A002, 2131965437);
                        return;
                    }
                }
                z = false;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(reel2);
                F8Q.A01(A002, userSession, reel2, r5, str, str2, arrayList2, 0, z, false);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.6Ye, java.lang.Object] */
    public static final void A02(Reel reel, AnonymousClass3BQ r7, C239413Gj r8, String str, String str2) {
        FragmentActivity A002 = C239403Gi.A00();
        UserSession userSession = r8.A01;
        if (A002 != null && userSession != null) {
            C270194gL r0 = reel.A0H;
            if (r0 != null) {
                C278114wI r02 = r0.A06;
                if (r02 == null) {
                    r02 = C278114wI.UNKNOWN;
                }
                if (r02.A00()) {
                    C59689JTv.A07(r8.A00, 2131965437);
                    return;
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(reel);
            0qQ.A0B(r7, 3);
            1OP r03 = 1OP.$redex_init_class;
            ? obj = new Object();
            obj.A02(userSession, reel.getId(), arrayList);
            obj.A0H = str;
            obj.A0J = str2;
            obj.A04 = r7;
            obj.A08(UUID.randomUUID().toString());
            obj.A00 = 0;
            F8Q.A00(A002, obj.A00(), userSession, reel, r7, false, false);
        }
    }

    public static final void A04(Reel reel, C239413Gj r4, String str) {
        Fragment fragment;
        FragmentActivity A002 = C239403Gi.A00();
        C270194gL r3 = reel.A0H;
        UserSession userSession = r4.A01;
        if (A002 != null) {
            0hq supportFragmentManager = A002.getSupportFragmentManager();
            if (supportFragmentManager != null) {
                fragment = supportFragmentManager.A0P(R.id.layout_container_main);
            } else {
                fragment = null;
            }
            if (r3 != null && userSession != null && fragment != null) {
                Context requireContext = fragment.requireContext();
                AnonymousClass07i.A00(fragment);
                C72192OyC A003 = C66953Mfm.A00(requireContext, userSession);
                0qQ.A07(C61560nl.A00().A00);
                r3.A0X.getClass();
                0qQ.A0B(C62467KgH.DECLINE_INVITE, 1);
                A003.A08(str);
            }
        }
    }
}

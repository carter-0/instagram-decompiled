package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.repository.user.UserNetworkDataSource;
import com.instagram.repository.user.UserRepository$fetchUserInfoUsingReactiveStream$1;
import com.instagram.user.model.User;
import java.io.File;

public final class Dd7 extends C252733pa {
    public final 02m A00;
    public final AnonymousClass92f A01;
    public final UserNetworkDataSource A02;
    public final AnonymousClass5CJ A03;
    public final 0V2 A04 = 10D.A01(AnonymousClass05K.A00, 0, 0);
    public final boolean A05;

    public static final User A00(G5K g5k) {
        if (g5k instanceof C46323Dbr) {
            return new User(((C46323Dbr) g5k).A00, (String) null);
        }
        if (g5k instanceof C46456DfK) {
            return new User((String) null, ((C46456DfK) g5k).A00);
        }
        throw AnonymousClass7TE.A1K();
    }

    private final boolean A01(1P0 r3, AnonymousClass4D6 r4, C3727792j r5, G5K g5k) {
        if (r4 == null || !(g5k instanceof C46323Dbr) || !this.A01.A0A(r3, r4, r5, ((C46323Dbr) g5k).A00)) {
            return false;
        }
        return true;
    }

    public final AnonymousClass0r6 A02(G5K g5k) {
        0V1 r2;
        int i;
        if (g5k instanceof C46323Dbr) {
            r2 = new 0V1((C262204Co) null, this.A04);
            i = 12;
        } else if (g5k instanceof C46456DfK) {
            r2 = new 0V1((C262204Co) null, this.A04);
            i = 13;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        return new MC0(i, g5k, r2);
    }

    public final void A03(C323126wz r24, C323066wt r25, G5K g5k, String str, String str2, int i, boolean z) {
        String str3;
        02m r2;
        int i2;
        String str4;
        1Ef build;
        G5K g5k2 = g5k;
        C323126wz r1 = r24;
        String str5 = str;
        String str6 = str2;
        AnonymousClass7TG.A1O(str5, str6);
        C323066wt r15 = r25;
        int i3 = i;
        if (r1 instanceof C323116wy) {
            C323116wy r12 = (C323116wy) r1;
            str3 = "profile_info_data_source";
            if (A01(r12.A00, r15.A00, C3727792j.USER_INFO, g5k2)) {
                r2 = this.A00;
                i2 = 31784979;
                str4 = "legacy_streaming_prefetch";
            } else {
                UserNetworkDataSource userNetworkDataSource = this.A02;
                AnonymousClass4D6 r14 = r12.A02;
                AnonymousClass1GR r4 = r12.A01;
                0qQ.A0B(r4, 6);
                UserSession userSession = userNetworkDataSource.A01;
                1FZ r22 = new 1FZ(userSession, 302881412, 1, false);
                r22.A04();
                r22.A00 = new 1Fj(new 0bH(userSession), new 1NX((File) null), C3727992l.class, true, false);
                0Tu r11 = 0Tu.A05;
                if (182.A06(r11, userSession, 36328216370887767L)) {
                    r22.A06 = 1CE.A04;
                }
                if (g5k2 instanceof C46323Dbr) {
                    r22.A0A("users/{user_id}/info_stream/");
                    r22.A0A = "users/{user_id}/info/";
                    r22.A0C = "user_info_stream_by_id";
                    DbS.A1P(r22, ((C46323Dbr) g5k2).A00);
                    if (182.A06(r11, userSession, 36327091087685799L)) {
                        r22.A9m("is_user_chuck_optimization_enabled", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
                    }
                } else if (g5k2 instanceof C46456DfK) {
                    r22.A0A("users/{user_name}/usernameinfo_stream/");
                    r22.A0A = "users/{user_name}/usernameinfo/";
                    r22.A0C = "user_info_stream_by_username";
                    r22.A9m("user_name", ((C46456DfK) g5k2).A00);
                } else {
                    throw AnonymousClass7TE.A1K();
                }
                DbZ.A1O(r22, r15, str5, str6, z);
                1GP A0M = r22.A0M();
                A0M.A02(r4);
                if (i3 != -1) {
                    A0M.A00 = new C323146x1(i3);
                    19V.A01.add(new C324276yv(i3));
                }
                r14.schedule(A0M);
                r2 = this.A00;
                i2 = 31784979;
                str4 = "legacy_streaming_network_request";
            }
        } else if (r1 instanceof EQG) {
            EQG eqg = (EQG) r1;
            str3 = "profile_info_data_source";
            if (A01(eqg.A01, r15.A00, C3727792j.GRAPHQL_USER_INFO, g5k2)) {
                r2 = this.A00;
                i2 = 31784979;
                str4 = "graphql_defer_prefetch";
            } else {
                UserNetworkDataSource userNetworkDataSource2 = this.A02;
                2IR r23 = eqg.A00;
                AnonymousClass4D6 r16 = eqg.A02;
                0qQ.A0B(r23, 4);
                if (g5k2 instanceof C46323Dbr) {
                    String str7 = ((C46323Dbr) g5k2).A00;
                    C50175FSh A002 = C49063Eoh.A00();
                    A002.A00(str7);
                    2IS r13 = A002.A00;
                    r13.A04("from_module", str5);
                    r13.A04(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str6);
                    A002.A01.A02("use_defer", true);
                    build = A002.build();
                } else if (g5k2 instanceof C46456DfK) {
                    String str8 = ((C46456DfK) g5k2).A00;
                    C50174FSg fSg = new C50174FSg();
                    2IS r42 = fSg.A01;
                    r42.A01("use_defer");
                    boolean z2 = true;
                    2IS r132 = fSg.A00;
                    r132.A04(Dd6.A00(), str8);
                    if (str8 == null) {
                        z2 = false;
                    }
                    fSg.A02 = z2;
                    r132.A04("from_module", str5);
                    r132.A04(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str6);
                    r42.A02("use_defer", true);
                    build = fSg.build();
                } else {
                    throw AnonymousClass7TE.A1K();
                }
                0qQ.A07(build);
                if (userNetworkDataSource2.A02) {
                    build.setEnsureCacheWrite(true);
                    build.setNetworkTimeoutSeconds(4);
                } else if (userNetworkDataSource2.A03) {
                    build.setCacheFallbackByDuration_EXPERIMENTAL(4000);
                }
                build.addTrackedHttpResponseHeader(AnonymousClass000.A00(63));
                r16.schedule(new FZ9(build, r23, 1vm.A01(userNetworkDataSource2.A01), new 0nX(1575610476)));
                r2 = this.A00;
                i2 = 31784979;
                str4 = "graphql_defer_network_request";
            }
        } else if (r1 instanceof EQE) {
            EQE eqe = (EQE) r1;
            1P0 r122 = eqe.A00;
            str3 = "profile_info_data_source";
            if (A01(new C47701EDk(r122, eqe), r15.A00, C3727792j.USER_INFO, g5k2)) {
                r2 = this.A00;
                i2 = 31784979;
                str4 = "legacy_rest_prefetch";
            } else {
                AnonymousClass4D6 r43 = eqe.A01;
                UserNetworkDataSource userNetworkDataSource3 = this.A02;
                C47701EDk eDk = new C47701EDk(r122, eqe);
                UserNetworkDataSource userNetworkDataSource4 = userNetworkDataSource3;
                C323066wt r133 = r15;
                G5K g5k3 = g5k2;
                String str9 = str5;
                String str10 = str6;
                if (r43 != null) {
                    1OC A003 = UserNetworkDataSource.A00(userNetworkDataSource4, r133, g5k3, str9, str10, false);
                    A003.A00 = eDk;
                    DbZ.A1U(A003, i3);
                    r43.schedule(A003);
                    r2 = this.A00;
                    i2 = 31784979;
                    str4 = "legacy_rest_network_request";
                } else {
                    1OC A004 = UserNetworkDataSource.A00(userNetworkDataSource4, r133, g5k3, str9, str10, false);
                    DbZ.A1U(A004, i3);
                    EDJ edj = new EDJ(eDk, A004);
                    A004.A00 = edj;
                    userNetworkDataSource3.A00 = edj;
                    1ES.A06(A004, 1671325816, false);
                    r2 = this.A00;
                    i2 = 31784979;
                    str4 = "legacy_rest_network_request_tps";
                }
            }
        } else if (r1 instanceof EQF) {
            EQF eqf = (EQF) r1;
            1P0 r123 = eqf.A00;
            str3 = "profile_info_data_source";
            if (A01(new C47702EDl(r123, eqf), r15.A00, C3727792j.GRAPHQL_USER_INFO, g5k2)) {
                r2 = this.A00;
                i2 = 31784979;
                str4 = "graphql_non_defer_prefetch";
            } else {
                AnonymousClass4D6 r26 = eqf.A01;
                if (g5k2 instanceof C46323Dbr) {
                    UserNetworkDataSource userNetworkDataSource5 = this.A02;
                    String str11 = ((C46323Dbr) g5k2).A00;
                    C47702EDl eDl = new C47702EDl(r123, eqf);
                    0qQ.A0B(str11, 0);
                    C50175FSh A005 = C49063Eoh.A00();
                    A005.A00(str11);
                    2IS r17 = A005.A00;
                    r17.A04("from_module", str5);
                    r17.A04(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str6);
                    A005.A01.A01("use_defer");
                    1Ef build2 = A005.build();
                    0qQ.A07(build2);
                    build2.addTrackedHttpResponseHeader(AnonymousClass000.A00(63));
                    1OC A006 = AnonymousClass9D0.A00(1vm.A01(userNetworkDataSource5.A01).A03(build2));
                    A006.A00 = eDl;
                    r26.schedule(A006);
                    r2 = this.A00;
                    i2 = 31784979;
                    str4 = "graphql_non_defer_network_request";
                } else {
                    return;
                }
            }
        } else if (r24 == null) {
            AnonymousClass7TE.A1Z(new UserRepository$fetchUserInfoUsingReactiveStream$1(r15, this, g5k2, str5, str6, (AnonymousClass4D7) null, i3, false), this.A01);
            return;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        r2.markerAnnotate(i2, i3, str3, str4);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Dd7(X.02m r4, X.AnonymousClass92f r5, com.instagram.repository.user.UserNetworkDataSource r6, X.AnonymousClass5CJ r7, boolean r8) {
        /*
            r3 = this;
            r0 = 1765100087(0x69354a37, float:1.3697878E25)
            r2 = 3
            X.19S r1 = X.AnonymousClass43D.A01(r0, r2)
            r0 = 2
            X.0qQ.A0B(r5, r0)
            X.DbW.A1O(r7, r2, r1)
            java.lang.String r0 = "Profile"
            r3.<init>(r0, r1)
            r3.A02 = r6
            r3.A01 = r5
            r3.A03 = r7
            r3.A05 = r8
            r3.A00 = r4
            r1 = 0
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.05D r0 = X.10D.A01(r0, r1, r1)
            r3.A04 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Dd7.<init>(X.02m, X.92f, com.instagram.repository.user.UserNetworkDataSource, X.5CJ, boolean):void");
    }
}

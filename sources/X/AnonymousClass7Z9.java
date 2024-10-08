package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.user.model.User;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.7Z9  reason: invalid class name */
public final class AnonymousClass7Z9 implements AnonymousClass7ZA {
    public final UserSession A00;
    public final AnonymousClass7S8 A01;
    public final C333587Zn A02;
    public final 2Dm A03;

    public AnonymousClass7Z9(UserSession userSession, AnonymousClass7S8 r3, 2Dm r4) {
        0qQ.A0B(r4, 1);
        0qQ.A0B(userSession, 3);
        this.A03 = r4;
        this.A01 = r3;
        this.A00 = userSession;
        this.A02 = new C333587Zn(userSession);
    }

    public final 1aU AGo(C254743sy r2, String str) {
        return 1aU.A09(true);
    }

    public final void AGp(Context context, C254793t3 r7, String str, boolean z) {
        0qQ.A0B(str, 1);
        UserSession userSession = this.A00;
        1Ng A002 = AnonymousClass1Nd.A00(userSession);
        if (!C48877Eld.A00(context, str, false, z)) {
            A002.A00(new C330937Ov(r7, AnonymousClass05K.A0C));
            return;
        }
        C66665MaY A08 = C66669Mac.A08(userSession, C65901hl.class);
        String str2 = C300965yF.A01(r7).A00;
        0qQ.A0B(A08, 1);
        0qQ.A0B(str2, 2);
        1OS r1 = new 1OS(A08);
        r1.A01 = str2;
        r1.A00 = str;
        1Ou.A01(userSession).A0A(r1);
    }

    public final 1aU APP(C254793t3 r2) {
        0qQ.A0B(r2, 0);
        return 1aU.A06(new C72124Owj(this, r2));
    }

    public final 1aU ARj(C254793t3 r2) {
        0qQ.A0B(r2, 0);
        return 1aU.A06(new C72125Owk(this, r2));
    }

    public final 1aU Cfq(Context context, C254743sy r3) {
        0qQ.A0B(r3, 0);
        return 1aU.A06(new AYY(this, r3));
    }

    public final void Cm3(C254793t3 r5) {
        C254763t0 A012 = C300965yF.A01(r5);
        UserSession userSession = this.A00;
        C66671Mae.A0E(userSession, C327647Bq.A00(A012), false);
        String str = A012.A00;
        0qQ.A0B(str, 1);
        AnonymousClass0kM r1 = new AnonymousClass0kM(userSession);
        r1.A01 = "direct_inbox";
        0wc A002 = r1.A00();
        0Aj A003 = A002.A00(A002.A00, C273654mx.A00(655));
        A003.AAJ("action", "thread_clear_unread");
        A003.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        A003.Cgf();
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [X.Nad, X.3Sa] */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
        r4 = r5.A03;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CmB(com.instagram.model.direct.messageid.DirectMessageIdentifier r19) {
        /*
            r18 = this;
            r7 = 0
            r1 = r19
            X.0qQ.A0B(r1, r7)
            r5 = r18
            X.7S8 r0 = r5.A01
            if (r0 == 0) goto L_0x0050
            X.3sy r2 = r0.AfV()
        L_0x0010:
            r0 = 87
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r2, r0)
            com.instagram.model.direct.DirectThreadKey r2 = (com.instagram.model.direct.DirectThreadKey) r2
            java.lang.String r6 = r1.A02
            if (r6 == 0) goto L_0x010e
            X.2Dm r4 = r5.A03
            X.3su r3 = r4.BRz(r2, r6)
            if (r3 == 0) goto L_0x010e
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r12 = r5.A00
            com.instagram.user.model.User r5 = r0.A01(r12)
            X.47v r1 = r3.A0g
            java.lang.String r0 = "Callers must have non-null voice message"
            X.17k.A07(r1, r0)
            X.2FW r1 = r3.A10
            X.2FW r0 = X.2FW.A1k
            if (r1 != r0) goto L_0x010e
            java.lang.String r0 = r5.getId()
            boolean r0 = X.AnonymousClass7F3.A01(r3, r0)
            if (r0 != 0) goto L_0x010e
            X.47v r0 = r3.A0g
            int r0 = r0.A00
            if (r0 != 0) goto L_0x010e
            X.2Dr r4 = (X.2Dr) r4
            monitor-enter(r4)
            goto L_0x0052
        L_0x0050:
            r2 = 0
            goto L_0x0010
        L_0x0052:
            X.0qQ.A0B(r2, r7)     // Catch:{ all -> 0x010b }
            X.48S r1 = r4.A0P(r2)     // Catch:{ all -> 0x010b }
            if (r1 != 0) goto L_0x006b
            r0 = 2388(0x954, float:3.346E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x010b }
            r0 = 226(0xe2, float:3.17E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x010b }
            X.0wb.A03(r1, r0)     // Catch:{ all -> 0x010b }
            goto L_0x00b9
        L_0x006b:
            monitor-enter(r1)     // Catch:{ all -> 0x010b }
            X.3su r7 = r1.A0J(r6)     // Catch:{ all -> 0x0108 }
            if (r7 == 0) goto L_0x009a
            X.47v r6 = r7.A0g     // Catch:{ all -> 0x0108 }
            if (r6 == 0) goto L_0x009a
            int r5 = r6.A00     // Catch:{ all -> 0x0108 }
            int r0 = r5 + 1
            if (r0 == r5) goto L_0x0085
            int r0 = java.lang.Math.max(r0, r5)     // Catch:{ all -> 0x0108 }
            r6.A00 = r0     // Catch:{ all -> 0x0108 }
            r0 = 1
            r7.A2C = r0     // Catch:{ all -> 0x0108 }
        L_0x0085:
            X.3U9 r0 = r1.A0I     // Catch:{ all -> 0x0108 }
            com.instagram.model.direct.DirectThreadKey r6 = r0.BJz()     // Catch:{ all -> 0x0108 }
            r8 = 0
            java.util.List r10 = java.util.Collections.singletonList(r7)     // Catch:{ all -> 0x0108 }
            java.lang.Integer r7 = X.AnonymousClass05K.A04     // Catch:{ all -> 0x0108 }
            r11 = 1
            X.2Kb r5 = new X.2Kb     // Catch:{ all -> 0x0108 }
            r9 = r8
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0108 }
            goto L_0x00a9
        L_0x009a:
            X.0wj r6 = X.0wj.A01     // Catch:{ all -> 0x0108 }
            r5 = 20134884(0x1333be4, float:3.2920077E-38)
            java.lang.String r0 = "Voice message is missing from thread entry"
            X.0f9 r0 = r6.AEf(r0, r5)     // Catch:{ all -> 0x0108 }
            r0.report()     // Catch:{ all -> 0x0108 }
            r5 = 0
        L_0x00a9:
            monitor-exit(r1)     // Catch:{ all -> 0x010b }
            X.2Dr.A0F(r4, r1)     // Catch:{ all -> 0x010b }
            if (r5 == 0) goto L_0x00b9
            X.1Ng r0 = r4.A06     // Catch:{ all -> 0x010b }
            r0.A00(r5)     // Catch:{ all -> 0x010b }
            X.2FF r0 = r4.A09     // Catch:{ all -> 0x010b }
            r0.accept(r5)     // Catch:{ all -> 0x010b }
        L_0x00b9:
            monitor-exit(r4)
            java.lang.String r6 = r3.A0g()
            if (r6 == 0) goto L_0x0100
            java.lang.String r5 = r3.A0f()
            java.lang.Class<X.1gb> r14 = X.C65761gb.class
            boolean r1 = r3.A2P
            r15 = 0
            X.ODs r13 = r3.A0M()
            boolean r0 = r3.A1S()
            if (r0 == 0) goto L_0x00fb
            r16 = 0
        L_0x00d5:
            r17 = r1
            X.MaY r4 = X.C66669Mac.A04(r12, r13, r14, r15, r16, r17)
            boolean r3 = r3.A1S()
            java.lang.String r0 = r2.A00
            X.Nad r2 = new X.Nad
            r2.<init>(r0, r6, r5)
            boolean r0 = r4.A07
            X.1gb r1 = new X.1gb
            r1.<init>(r4)
            r1.A00 = r2
            r1.A01 = r3
            r1.A02 = r0
            X.1Ou r0 = X.1Ou.A01(r12)
            r0.A0A(r1)
            return
        L_0x00fb:
            java.lang.String r16 = r3.A0f()
            goto L_0x00d5
        L_0x0100:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0108:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x010b }
            throw r0     // Catch:{ all -> 0x010b }
        L_0x010b:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x010e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7Z9.CmB(com.instagram.model.direct.messageid.DirectMessageIdentifier):void");
    }

    public final void Cmn(C254793t3 r11) {
        if (r11 instanceof C254763t0) {
            C254763t0 A012 = C300965yF.A01(r11);
            UserSession userSession = this.A00;
            C67236MkW mkW = (C67236MkW) userSession.A01(C67236MkW.class, new C73918Ply(userSession, 1));
            String str = A012.A00;
            if (str != null && str.length() != 0) {
                Set set = mkW.A01;
                if (set.contains(str)) {
                    DirectThreadKey A002 = C327647Bq.A00(A012);
                    AnonymousClass9IM r2 = new AnonymousClass9IM((Object) Long.valueOf(System.currentTimeMillis()), 0, 7);
                    C66665MaY A08 = C66669Mac.A08(userSession, C66341mG.class);
                    0qQ.A0B(A08, 1);
                    1OS r1 = new 1OS(A08);
                    0qQ.A0B(A002, 0);
                    r1.A01 = A002;
                    r1.A00 = r2;
                    1Ou.A01(userSession).A0A(r1);
                    0u4.A00(set).remove(str);
                    O0L.A00(C69448Nls.IGD_NUDGE_THREAD_CLICK, mkW.A00, str);
                }
            }
        }
    }

    public final 1aU Cow(AnonymousClass0iw r2, C254793t3 r3, boolean z) {
        0qQ.A0B(r3, 0);
        return 1aU.A06(new C72152OxC(r2, this, r3, z));
    }

    public final void Cp3(AnonymousClass0iw r3, C254793t3 r4, int i) {
        0qQ.A0B(r4, 0);
        C66671Mae.A02(r3, this.A00, C300965yF.A01(r4).A00, i);
    }

    public final void Cp4(AnonymousClass0iw r4, C254793t3 r5) {
        0qQ.A0B(r5, 0);
        C66671Mae.A04(r4, this.A00, C300965yF.A01(r5).A00, true);
    }

    public final void D8Q(C254783t2 r1) {
    }

    public final 1aU EDT(C254793t3 r2, List list) {
        0qQ.A0B(r2, 0);
        return 1aU.A06(new C72136Owv(this, r2, list));
    }

    public final 1aU EE7(C254793t3 r2, List list) {
        0qQ.A0B(r2, 0);
        return 1aU.A06(new C72137Oww(this, r2, list));
    }

    public final 1aU EEm(C254743sy r2) {
        return 1aU.A09(true);
    }

    public final void EGT(C254743sy r5) {
        0qQ.A0B(r5, 0);
        UserSession userSession = this.A00;
        DirectThreadKey A032 = C66647MaG.A03(r5);
        0qQ.A0B(A032, 1);
        1OS r1 = new 1OS(C66669Mac.A08(userSession, AnonymousClass1j4.class));
        r1.A00 = A032;
        1Ou.A01(userSession).A0A(r1);
    }

    public final 1aU EJz(C254743sy r6, String str, String str2, boolean z) {
        0qQ.A0B(r6, 1);
        if (str2 == null) {
            str2 = C66647MaG.A03(r6).A00;
        }
        if (str.length() == 0) {
            C395259zT.A00(this.A00, str2);
        } else {
            UserSession userSession = this.A00;
            if (str2 != null) {
                0xa r2 = 1Au.A00(userSession).A01;
                0xY AR4 = r2.AR4();
                AR4.E5g(002.A0R("direct_thread_draft_", str2), str);
                AR4.apply();
                0xY AR42 = r2.AR4();
                AR42.E5c(002.A0R("direct_thread_draft_timestamp_", str2), System.currentTimeMillis());
                AR42.apply();
            }
        }
        return 1aU.A09(true);
    }

    public final void Eyu(String str, String str2) {
        UserSession userSession = this.A00;
        C66665MaY A08 = C66669Mac.A08(userSession, C66211kj.class);
        0qQ.A0B(A08, 1);
        1OS r1 = new 1OS(A08);
        r1.A01 = str;
        r1.A00 = str2;
        1Ou.A01(userSession).A0A(r1);
    }

    public final void FHH(UserSession userSession, C242373Tu r9, C254793t3 r10, int i, boolean z, boolean z2) {
        0qQ.A0B(userSession, 0);
        C66671Mae.A08(userSession, r9, C300965yF.A01(r10).A00, i, z, z2);
    }

    public final void FHN(C254793t3 r5, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(r5, 0);
        if (!z2) {
            AnonymousClass1Nd.A00(this.A00).A00(new C330677Nt(z));
        }
        C66671Mae.A0B(this.A00, C300965yF.A01(r5), 002.A1D("DirectThreadActionsManager ", false), z);
    }

    public final void FIg(AnonymousClass0iw r4, C254743sy r5) {
        String str = C66647MaG.A03(r5).A00;
        if (str != null) {
            C66671Mae.A06(r4, this.A00, str, false);
        }
    }

    public final 1aU FIi(AnonymousClass0iw r2, C254793t3 r3, boolean z) {
        0qQ.A0B(r3, 0);
        return 1aU.A06(new C72153OxD(r2, this, r3, z));
    }

    public final 1aU FIn(AnonymousClass0iw r2, C254793t3 r3) {
        0qQ.A0B(r3, 0);
        return 1aU.A06(new AYZ(r2, this, r3));
    }

    public final void FKs(String str, String str2, String str3) {
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        0qQ.A0B(str3, 2);
        this.A03.FKs(str, str2, str3);
    }

    public final void FKt(String str, String str2, String str3) {
        0qQ.A0B(str, 0);
        0qQ.A0B(str3, 2);
        this.A03.FKt(str, str2, str3);
    }

    public static final String A00(C254703su r1) {
        if (!r1.A2G) {
            return r1.A0g();
        }
        BigInteger valueOf = BigInteger.valueOf(r1.C7c());
        0qQ.A07(valueOf);
        return valueOf.shiftLeft(64).toString();
    }

    public final 1aU A9n(Context context, C254793t3 r8, C67350MmR mmR, List list, List list2, int i) {
        return 1aU.A06(new C72158OxI(this, r8, mmR, list2, i));
    }

    public final 1aU AGN(C254793t3 r2, List list) {
        return 1aU.A06(new C72133Ows(this, r2, list));
    }

    public final 1aU AOf(C254793t3 r3, User user) {
        return 1aU.A06(new C72134Owt(this, r3, user)).A0L(C72107OwR.A00);
    }

    public final void Clg(C45376CvI cvI) {
        UserSession userSession = this.A00;
        C66665MaY A08 = C66669Mac.A08(userSession, C66501nf.class);
        String str = cvI.A01;
        if (str != null) {
            0qQ.A0B(A08, 1);
            1OS r1 = new 1OS(A08);
            r1.A01 = str;
            r1.A00 = cvI;
            1Ou.A01(userSession).A0A(r1);
            return;
        }
        0qQ.A0F("igThreadIgid");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Clk(C254793t3 r12, String str, String str2, int i) {
        UserSession userSession = this.A00;
        String str3 = C300965yF.A01(r12).A00;
        HashMap A022 = 0Yt.A02(new 0eP[]{new 0eP(C273654mx.A00(68), str2)});
        C69871NtZ.A00(((C72182Oxr) userSession.A01(C72182Oxr.class, new C73902Pld(userSession, 28))).A00, str3, str, "capture_screenshot_in_channel", "impression", "system_capture", "thread_view", A022, i);
    }

    public final void Cll(C254793t3 r5) {
        C70621ODs oDs;
        if (r5 != null) {
            UserSession userSession = this.A00;
            String str = C300965yF.A01(r5).A00;
            0qQ.A0B(str, 1);
            Class<AnonymousClass1j1> cls = AnonymousClass1j1.class;
            AnonymousClass3U9 A0N = 1bJ.A00(userSession).A0N(str);
            if (A0N != null) {
                oDs = A0N.B25();
            } else {
                oDs = null;
            }
            1OS r1 = new 1OS(C66669Mac.A02(userSession, oDs, cls));
            r1.A00 = str;
            1Ou.A01(userSession).A0A(r1);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void Cm2(C376509Ig r28, C254793t3 r29, boolean z) {
        Integer num;
        long j;
        AnonymousClass3SZ BrG;
        C241973Sc r0;
        AnonymousClass9JD r17;
        AnonymousClass3SZ BrG2;
        AnonymousClass9JD r6;
        C254703su r11;
        String A0g;
        AnonymousClass7S8 r12;
        AnonymousClass3SZ BrG3;
        C272964li Axk;
        String str;
        C376509Ig r9 = r28;
        if (r28 != null && C376509Ig.A00(2, r9)) {
            String str2 = C300965yF.A01(r29).A00;
            2Dr r8 = this.A03;
            0qQ.A0B(str2, 0);
            AnonymousClass3U9 A0N = r8.A0N(str2);
            if (A0N != null) {
                C254703su r10 = (C254703su) r9.A03;
                C254703su r5 = (C254703su) r9.A04;
                N49 n49 = (N49) r9.A02;
                UserSession userSession = this.A00;
                String str3 = userSession.A06;
                String A002 = A00(r10);
                if (A002 != null) {
                    String str4 = r10.A1u;
                    0qQ.A07(str4);
                    if (!(n49 == null || n49.A01 == null || (str = n49.A00) == null || AnonymousClass48W.A00.compare(str, A002) <= 0)) {
                        A002 = n49.A00;
                        if (A002 != null) {
                            str4 = n49.A01;
                            if (str4 == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    0Tu r112 = 0Tu.A05;
                    if (182.A06(r112, userSession, 2342163327141290271L) && (Axk = A0N.Axk()) != null) {
                        Long l = Axk.A05;
                        if (l != null) {
                            String A022 = C2611348j.A02(l.longValue(), Axk.A08);
                            if (AnonymousClass48W.A00.compare(A022, A002) > 0) {
                                str4 = Axk.A07;
                                if (str4 != null) {
                                    A002 = A022;
                                } else {
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                    }
                    boolean z2 = false;
                    if (!(!182.A06(r112, userSession, 36325665159591032L) || (r11 = (C254703su) r9.A01) == null || (A0g = r11.A0g()) == null || (r12 = this.A01) == null || (BrG3 = r12.BrG(true)) == null)) {
                        AnonymousClass9JD r02 = BrG3.A01;
                        if (r02 == null) {
                            r02 = new AnonymousClass9JD((Boolean) null, (Long) null, (String) null, (String) null, (DefaultConstructorMarker) null, 15, 2);
                        }
                        String str5 = r02.A02;
                        if (str5 == null || A0g.compareTo(str5) > 0) {
                            BrG3.A01 = new AnonymousClass9JD((Boolean) true, Long.valueOf(r11.C7c()), A00(r11), r11.A1j);
                            z2 = true;
                        }
                    }
                    if (!z && A0N.CbQ(str3, A002, str4) && !z2) {
                        if (r5 != null) {
                            if (AnonymousClass48N.A0A(A0N, str3, A00(r5))) {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    if (r10.A10 == 2FW.A0q) {
                        AnonymousClass3F2.A00().A02.A04(userSession, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, AnonymousClass7QG.A02(str3, str2, "ds"));
                    }
                    AnonymousClass7AG r03 = r10.A0Q;
                    String str6 = null;
                    if (r03 != null) {
                        num = r03.A02;
                    } else {
                        num = null;
                    }
                    if (num == AnonymousClass05K.A01) {
                        return;
                    }
                    if (!r10.A1S() || r10.A10 != 2FW.A1M) {
                        String A0g2 = r10.A0g();
                        if (!(r5 == null || A0g2 == null)) {
                            r5.A1o(A0g2);
                        }
                        if (r5 != null) {
                            str6 = A00(r5);
                            j = r5.C7c();
                        } else {
                            AnonymousClass7S8 r04 = this.A01;
                            if (r04 == null || (BrG = r04.BrG(true)) == null || (r0 = BrG.A02) == null) {
                                j = 0;
                            } else {
                                str6 = r0.A01;
                                j = r0.A00;
                            }
                        }
                        if (r8.A0C.A02.equals(str2)) {
                            2Dr.A00(A0N, r8).A0K(false);
                            r8.EK3();
                            C66671Mae.A0K(userSession, str2, true);
                            0xY AR4 = AnonymousClass4k9.A00(userSession).A00.AR4();
                            AR4.E5Z(C66579MXk.A00(768), 0);
                            AR4.apply();
                        }
                        C254703su r62 = (C254703su) r9.A01;
                        if (r62 != null) {
                            r17 = new AnonymousClass9JD((Boolean) true, Long.valueOf(r62.C7c()), A00(r62), r62.A1j);
                        } else {
                            AnonymousClass7S8 r63 = this.A01;
                            if (r63 == null || (BrG2 = r63.BrG(true)) == null || (r6 = BrG2.A01) == null) {
                                r17 = new AnonymousClass9JD((Boolean) null, (Long) null, (String) null, (String) null, (DefaultConstructorMarker) null, 15, 2);
                            } else {
                                r17 = new AnonymousClass9JD((Boolean) false, (Long) r6.A01, r6.A02, r6.A03);
                            }
                        }
                        boolean z3 = false;
                        if (r5 != null) {
                            z3 = true;
                        }
                        C66671Mae.A00(r17, userSession, str2, A002, str4, str6, j, z3);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
    }

    public final void Cm7(C254793t3 r10, String str, boolean z) {
        if (r10 != null) {
            UserSession userSession = this.A00;
            C254743sy A05 = C300965yF.A05(r10);
            0qQ.A0C(A05, AnonymousClass000.A00(87));
            DirectThreadKey directThreadKey = (DirectThreadKey) A05;
            0qQ.A0B(directThreadKey, 1);
            1OS r1 = new 1OS(C66669Mac.A04(userSession, OQO.A00(userSession, directThreadKey), C66001id.class, (String) null, (String) null, z));
            r1.A00 = directThreadKey;
            1Ou.A01(userSession).A0A(r1);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final 1aU E4f(C254793t3 r3, User user) {
        return 1aU.A06(new C72135Owu(this, r3, user)).A0L(C72108OwS.A00);
    }

    public final 1aU EEQ(C254793t3 r2, List list) {
        return 1aU.A06(new C72138Owx(this, r2, list));
    }

    public final void Cou(AnonymousClass0iw r3, C254743sy r4, int i) {
        String str = C66647MaG.A03(r4).A00;
        if (str != null) {
            C66671Mae.A03(r3, this.A00, str, i);
        }
    }

    public final void FHI(UserSession userSession, C254793t3 r3, Integer num, int i, int i2) {
        C66671Mae.A0H(userSession, num, C300965yF.A01(r3).A00, i, i2);
    }
}

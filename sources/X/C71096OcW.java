package X;

import android.content.Context;
import android.os.ParcelUuid;
import com.facebook.rtc.logging.connectfunnel.logger.gen.ConnectFunnel;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.rtc.RtcCallAudience;
import com.instagram.model.rtc.RtcCallFunnelSessionId;
import com.instagram.model.rtc.RtcCallKey;
import com.instagram.model.rtc.RtcCallSource;
import com.instagram.model.rtc.RtcCreateCallArgs;
import com.instagram.model.rtc.RtcIgNotification;
import com.instagram.model.rtc.RtcJoinCallArgs;
import com.instagram.model.rtc.RtcThreadKey;
import com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments;
import com.instagram.rtc.analytics.RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplId;
import com.instagram.rtc.rsys.models.IgCallModel;
import com.instagram.rtc.rsys.models.ParticipantModel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;

/* renamed from: X.OcW  reason: case insensitive filesystem */
public abstract class C71096OcW {
    public static final RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplId A00(Context context, UserSession userSession, C331527Ri r6, C331537Rj r7) {
        if (!182.A06(DbS.A0J(r6, 2), userSession, 36315889812901528L)) {
            return null;
        }
        C66649MaI A00 = C66653MaM.A00(context, userSession);
        if (A00.A0A(r6) && A00.A0B(r6)) {
            return null;
        }
        AnonymousClass38W.A00();
        RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplId rtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplId = new RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplId(new ParcelUuid(UUID.randomUUID()));
        OWf A002 = C70320O1y.A00(userSession);
        A002.A01 = rtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplId.A00();
        A002.A01(2);
        A002.A04(r7.A00);
        return rtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplId;
    }

    public static final void A01(Context context, C69465Nm9 nm9, AnonymousClass0iw r41, UserSession userSession, C331527Ri r43, RtcCallFunnelSessionId rtcCallFunnelSessionId, C331537Rj r45, RtcStartCoWatchPlaybackArguments rtcStartCoWatchPlaybackArguments, boolean z) {
        String C6C;
        String str;
        String C6C2;
        C358248ab r11;
        Integer num;
        N9J n9j;
        String quantityString;
        String quantityString2;
        ArrayList arrayList;
        ArrayList arrayList2;
        Object obj;
        User BZK;
        User BZK2;
        Boolean AaM;
        Boolean AaL;
        String str2;
        Context context2 = context;
        UserSession userSession2 = userSession;
        C331527Ri r6 = r43;
        C51973G9u.A1E(context2, userSession2, r6);
        C331537Rj r9 = r45;
        0qQ.A0B(r9, 5);
        OW2 ow2 = new OW2(userSession2, context2);
        if (ow2.A01()) {
            ow2.A00();
            return;
        }
        if (!r6.CKo()) {
            str2 = " startVideoCall with a null thread";
        } else {
            if (r6.CVr()) {
                C6C = r6.C6k();
            } else {
                C6C = r6.C6C();
            }
            if (C6C == null) {
                str2 = " startVideoCall with a null threadId";
            } else {
                1X8 A00 = AnonymousClass38W.A00();
                User A0Q = AnonymousClass7TF.A0Q(userSession2);
                List Aaq = r6.Aaq();
                boolean CUG = r6.CUG();
                String C6g = r6.C6g(context2, userSession2);
                if (r6.C6a() != 1013) {
                    if (C66648MaH.A04(userSession2, r6.BZK(), r6.BJ5(), r6.C6a(), r6.BRV().size()) && !(((BZK = r6.BZK()) == null || (AaL = BZK.A03.AaL()) == null || !AaL.booleanValue()) && ((BZK2 = r6.BZK()) == null || (AaM = BZK2.A03.AaM()) == null || !AaM.booleanValue()))) {
                        C6g = DbV.A0u(context2, context2.getString(2131976531), C6g, 2131964456);
                    }
                }
                String username = A0Q.getUsername();
                String id = A0Q.getId();
                ImageUrl Bh3 = A0Q.Bh3();
                List BRX = r6.BRX();
                ArrayList A1C = AnonymousClass7TE.A1C();
                for (Object next : BRX) {
                    DbV.A1U(next, A1C, 0qQ.A0K(next, DbX.A0t(A0Q.BST())) ? 1 : 0);
                }
                RtcCallAudience rtcCallAudience = new RtcCallAudience(Bh3, C6g, username, id, Aaq, A1C, CUG);
                C69277Nid Azh = r6.Azh();
                C69277Nid nid = C69277Nid.NO_E2EE;
                String str3 = null;
                if (!C51969G9p.A1a(Azh, nid)) {
                    str = r6.C6C();
                    C6C2 = null;
                } else {
                    str = null;
                    C6C2 = r6.C6C();
                    str3 = r6.C6R();
                }
                C69465Nm9 nm92 = nm9;
                RtcCallSource rtcCallSource = new RtcCallSource(nm92, r9, new RtcThreadKey(C6C, r6.C6k(), str, C6C2, str3));
                C66649MaI A002 = C66653MaM.A00(context2, userSession2);
                Context applicationContext = context2.getApplicationContext();
                AnonymousClass0iw r8 = r41;
                RtcCallFunnelSessionId rtcCallFunnelSessionId2 = rtcCallFunnelSessionId;
                boolean z2 = z;
                if (!A002.A0A(r6) || (!A002.A0B(r6) && A00.A02(context2, userSession2))) {
                    RtcStartCoWatchPlaybackArguments rtcStartCoWatchPlaybackArguments2 = rtcStartCoWatchPlaybackArguments;
                    if (A00.A02(context2, userSession2)) {
                        List BRZ = r6.BRZ();
                        1X8 r3 = A00;
                        C72192OyC A01 = C66953Mfm.A01(r3.A00(r3.A00, userSession2).A06);
                        if (A01 != null) {
                            IgCallModel A012 = A01.A09.A01();
                            if (A012 == null || (arrayList2 = A012.participants) == null) {
                                arrayList = BRZ;
                            } else {
                                LinkedHashSet A0y = DbS.A0y();
                                Iterator it = arrayList2.iterator();
                                while (it.hasNext()) {
                                    ParticipantModel A0n = C66580MXl.A0n(it);
                                    C72187Oxw oxw = A01.A05;
                                    String str4 = A0n.userId;
                                    0qQ.A07(str4);
                                    C61034JvY jvY = (C61034JvY) oxw.A00.get(str4);
                                    if (!(jvY == null || (obj = jvY.A02) == null)) {
                                        A0y.add(obj);
                                    }
                                }
                                ArrayList A1C2 = AnonymousClass7TE.A1C();
                                for (Object next2 : BRZ) {
                                    DbV.A1U(next2, A1C2, 00k.A0u(A0y, C70903OQv.A00((User) next2).A02) ? 1 : 0);
                                }
                                arrayList = A1C2;
                            }
                            BRZ = arrayList;
                        }
                        if (r6.Azh() == nid && 182.A06(0Tu.A05, userSession2, 36316551237865959L) && AnonymousClass7TE.A1b(BRZ)) {
                            C58234Ioc ioc = new C58234Ioc(context2, userSession2, r6, r8, r9, rtcStartCoWatchPlaybackArguments2, rtcCallFunnelSessionId2, nm92, 0, z2);
                            if (AnonymousClass1ox.A00 != null) {
                                ArrayList A0r = AnonymousClass7TG.A0r(BRZ);
                                Iterator it2 = BRZ.iterator();
                                while (it2.hasNext()) {
                                    C66582MXn.A1O(A0r, it2);
                                }
                                C71196OfI ofI = new C71196OfI(context2, A00, userSession2, r6, BRZ, C6C, 0);
                                C71189Of8 of8 = new C71189Of8(1, context2, userSession2, A00, ioc);
                                r11 = DbS.A0Y(context2);
                                if (A0r.size() == 1) {
                                    quantityString = DbW.A0h(context2, A0r.get(0), 2131976530);
                                } else {
                                    quantityString = context2.getResources().getQuantityString(R.plurals.videocall_add_user_when_already_in_call_title_quantity, DbT.A02(A0r, 1), C51968G9o.A1Z(A0r.get(0), DbT.A02(A0r, 1)));
                                }
                                r11.A05 = quantityString;
                                r11.A08(2131976543);
                                if (A0r.size() == 1) {
                                    quantityString2 = DbW.A0h(context2, A0r.get(0), 2131976529);
                                } else {
                                    quantityString2 = context2.getResources().getQuantityString(R.plurals.videocall_add_user_to_call_quantity, DbT.A02(A0r, 1), C51968G9o.A1Z(A0r.get(0), DbT.A02(A0r, 1)));
                                }
                                0qQ.A0A(quantityString2);
                                r11.A0c(ofI, quantityString2);
                                r11.A0O(of8, C358278ae.RED_BOLD, 2131976551);
                                r11.A05();
                                DbT.A1V(r11);
                                return;
                            }
                            0qQ.A0F("instance");
                            throw AnonymousClass00P.createAndThrow();
                        }
                    } else {
                        C72192OyC A013 = C66953Mfm.A01(A00.A00(context2, userSession2).A06);
                        if (A013 == null || (n9j = (N9J) A013.A09.A0K.A00.A00) == null) {
                            num = null;
                        } else {
                            num = n9j.A01;
                        }
                        if (num != AnonymousClass05K.A01) {
                            C71342cb.A00(userSession2).A0D(r8, "call_button", 0);
                            A00.A01(context2, userSession2, new RtcCreateCallArgs(nm92, r6.Azh(), rtcCallAudience, rtcCallFunnelSessionId2, rtcCallSource, (RtcIgNotification) null, rtcStartCoWatchPlaybackArguments2, (String) null, -1, z2, r6.CVE(), false), new C73907Pli(applicationContext, 39));
                            return;
                        }
                    }
                    if (AnonymousClass1ox.A00 != null) {
                        boolean A06 = 182.A06(0Tu.A05, userSession2, 36316551237931496L);
                        C71185Of3 of3 = new C71185Of3(9, userSession2, A00, context2);
                        r11 = DbS.A0Y(context2);
                        int i = 2131976544;
                        if (A06) {
                            i = 2131976545;
                        }
                        r11.A09(i);
                        r11.A08(2131976543);
                        int i2 = 2131976569;
                        if (A06) {
                            i2 = 2131976551;
                        }
                        r11.A0K(of3, i2);
                        r11.A05();
                        DbT.A1V(r11);
                        return;
                    }
                    0qQ.A0F("instance");
                    throw AnonymousClass00P.createAndThrow();
                }
                C71342cb.A00(userSession2).A0D(r8, "call_button", 0);
                C69277Nid Azh2 = r6.Azh();
                String CDs = r6.CDs();
                if (CDs != null) {
                    A00.A00(context2, userSession2).A06(new RtcJoinCallArgs(Azh2, C69278Nie.NOT_SET, rtcCallAudience, rtcCallFunnelSessionId2, new RtcCallKey(CDs), rtcCallSource, (RtcIgNotification) null, (String) null, (String) null, -1, z2), new C73907Pli(applicationContext, 38));
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
        }
        0wb.A03("DirectVideoCaller", str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0085, code lost:
        if (r7 != false) goto L_0x0087;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(android.content.Context r8, X.C69465Nm9 r9, com.instagram.common.session.UserSession r10, X.C331527Ri r11, X.C331537Rj r12) {
        /*
            r0 = 2
            X.0qQ.A0B(r11, r0)
            X.MaI r6 = X.C66653MaM.A00(r8, r10)
            boolean r0 = r6.A0A(r11)
            if (r0 == 0) goto L_0x006f
            java.lang.String r4 = r11.C6C()
            java.lang.String r5 = r11.CDr()
            java.util.List r2 = r11.Bk9()
            if (r2 == 0) goto L_0x006d
            X.3mO r1 = X.C250993mO.A01(r10)
            X.3mS r0 = X.C251033mS.A00(r10)
            java.util.List r0 = X.C250993mO.A03(r0, r2)
            boolean r0 = r1.A0D(r0)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
        L_0x0030:
            boolean r0 = r6.A0B(r11)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            java.lang.String r1 = X.O0M.A00(r12)
            X.0kM r0 = new X.0kM
            r0.<init>(r10)
            X.0wc r1 = X.C66580MXl.A0N(r0, r1)
            java.lang.String r0 = "direct_join_video_call"
            X.0Aj r8 = X.AnonymousClass7TE.A0e(r1, r0)
            if (r5 == 0) goto L_0x0056
            java.lang.Long r1 = X.AnonymousClass7TE.A10(r5)
            java.lang.String r0 = "target_id"
            r8.A9F(r0, r1)
        L_0x0056:
            if (r4 == 0) goto L_0x005b
            X.C66580MXl.A1J(r8, r4)
        L_0x005b:
            if (r3 == 0) goto L_0x0062
            java.lang.String r0 = "is_active"
            r8.A7p(r0, r3)
        L_0x0062:
            if (r2 == 0) goto L_0x0069
            java.lang.String r0 = "is_video_call_ongoing"
            r8.A7p(r0, r2)
        L_0x0069:
            r8.Cgf()
            return
        L_0x006d:
            r3 = 0
            goto L_0x0030
        L_0x006f:
            X.Nid r1 = r11.Azh()
            X.Nid r0 = X.C69277Nid.NO_E2EE
            boolean r7 = X.C51969G9p.A1a(r1, r0)
            java.lang.String r6 = r11.C6C()
            r3 = 0
            if (r7 != 0) goto L_0x00f6
            java.lang.String r5 = r11.C6C()
        L_0x0084:
            r0 = r3
            if (r7 == 0) goto L_0x008f
        L_0x0087:
            java.lang.String r1 = r11.C6R()
            java.lang.Long r3 = X.C51972G9s.A0i(r1)
        L_0x008f:
            java.util.List r4 = r11.Bk9()
            if (r4 == 0) goto L_0x00f4
            X.3mO r2 = X.C250993mO.A01(r10)
            X.3mS r1 = X.C251033mS.A00(r10)
            java.util.List r1 = X.C250993mO.A03(r1, r4)
            boolean r1 = r2.A0D(r1)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
        L_0x00a9:
            java.lang.String r2 = X.O0M.A00(r12)
            X.0kM r1 = new X.0kM
            r1.<init>(r10)
            X.0wc r2 = X.C66580MXl.A0N(r1, r2)
            java.lang.String r1 = "direct_start_video_call"
            X.0Aj r8 = X.AnonymousClass7TE.A0e(r2, r1)
            java.lang.String r2 = ""
            java.lang.String r1 = "e_counter_channel"
            r8.A9O(r1, r2)
            if (r6 == 0) goto L_0x00c8
            X.C66580MXl.A1J(r8, r6)
        L_0x00c8:
            if (r5 == 0) goto L_0x00cd
            X.C66580MXl.A1K(r8, r5)
        L_0x00cd:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r7)
            java.lang.String r1 = "e2ee_mandated"
            r8.A7p(r1, r2)
            if (r0 == 0) goto L_0x00dd
            java.lang.String r1 = "armadillo_thread_id"
            r8.A9F(r1, r0)
        L_0x00dd:
            if (r3 == 0) goto L_0x00e4
            java.lang.String r0 = "occamadillo_thread_id"
            r8.A9F(r0, r3)
        L_0x00e4:
            if (r4 == 0) goto L_0x00eb
            java.lang.String r0 = "is_active"
            r8.A7p(r0, r4)
        L_0x00eb:
            if (r9 == 0) goto L_0x0069
            java.lang.String r0 = "xma_type"
            r8.A8M(r9, r0)
            goto L_0x0069
        L_0x00f4:
            r4 = 0
            goto L_0x00a9
        L_0x00f6:
            r5 = r3
            java.lang.String r0 = r11.C6C()
            if (r0 == 0) goto L_0x0084
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r0)
            goto L_0x0087
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71096OcW.A02(android.content.Context, X.Nm9, com.instagram.common.session.UserSession, X.7Ri, X.7Rj):void");
    }

    public static final void A03(UserSession userSession, RtcCallFunnelSessionId rtcCallFunnelSessionId, Integer num) {
        String str;
        if (rtcCallFunnelSessionId != null && 182.A06(0Tu.A05, userSession, 36315889812901528L)) {
            AnonymousClass38W.A00();
            switch (num.intValue()) {
                case 0:
                    str = "no_network_connection_dialog_shown";
                    break;
                case 1:
                    str = "thread_is_null";
                    break;
                case 2:
                    str = "thread_missing_call_capability";
                    break;
                case 3:
                    str = "account_type_not_enabled_hpms_dialog_shown";
                    break;
                default:
                    str = "blocked_account_dialog_user_declined";
                    break;
            }
            C70320O1y.A00(userSession);
            String A00 = rtcCallFunnelSessionId.A00();
            0qQ.A0B(A00, 0);
            C71004OWb.A00.A00("IGRTCProductFunnelLogger", 002.A0u("fail local call id ", A00, " due to reason ", str));
            ConnectFunnel.CProxy.fail(A00, str, (String) null);
        }
    }

    public static final void A04(UserSession userSession, C331537Rj r3, String str) {
        0Aj A0e = AnonymousClass7TE.A0e(C66580MXl.A0N(new AnonymousClass0kM(userSession), O0M.A00(r3)), "direct_vc_icon_impression");
        if (str != null) {
            C66580MXl.A1J(A0e, str);
        }
        A0e.Cgf();
    }
}

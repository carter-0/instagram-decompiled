package X;

import android.os.SystemClock;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class FZ0 implements 0lm {
    public long A00 = -1;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public final AnonymousClass0iw A0B;
    public final 02m A0C;
    public final 0wc A0D;
    public final UserSession A0E;
    public final OEC A0F;
    public final Map A0G;
    public final Map A0H;
    public final Map A0I;
    public final Map A0J;
    public final Map A0K;
    public final Map A0L;
    public final Map A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;

    public FZ0(AnonymousClass0iw r5, UserSession userSession) {
        AnonymousClass7TF.A1B(userSession, 1, r5);
        this.A0P = 182.A06(0Tu.A05, userSession, 36312883335857525L);
        02m r0 = 02m.A0p;
        0qQ.A07(r0);
        this.A0C = r0;
        this.A0F = (OEC) userSession.A01(OEC.class, new C73903Ple(userSession, 12));
        this.A0D = AnonymousClass0kN.A01(r5, userSession);
        this.A0E = userSession;
        this.A0B = r5;
        boolean z = true;
        this.A0A = true;
        this.A07 = AnonymousClass7TG.A0j();
        this.A0H = new Y44();
        this.A0I = new Y44();
        this.A0L = new Y44();
        this.A0M = new Y44();
        this.A0K = new Y44();
        this.A0G = new Y44();
        this.A0J = new Y44();
        this.A0O = AnonymousClass7TF.A1V(this.A08);
        this.A0N = this.A06 == null ? false : z;
    }

    public static void A02(0bb r2, FZ0 fz0, DirectShareTarget directShareTarget, Long l) {
        r2.A05(C66579MXk.A00(1078), l);
        Integer A042 = directShareTarget.A04(fz0.A0E.A06, false);
        0qQ.A07(A042);
        r2.A01(C71112Od3.A01(A042), C66579MXk.A00(159));
    }

    public final void A09(C48136EZe eZe, AnonymousClass0iw r23, UserSession userSession, DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, String str5, int i, long j, long j2, long j3, boolean z) {
        Map map;
        String str6;
        C254763t0 A022;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        C48136EZe eZe2 = eZe;
        DirectShareTarget directShareTarget2 = directShareTarget;
        AnonymousClass7TF.A1F(directShareTarget2, 1, eZe2);
        0qQ.A0B(r23, 11);
        if (this.A09) {
            int ordinal = eZe2.ordinal();
            long j4 = j;
            long j5 = j3;
            long j6 = j2;
            String str7 = str;
            String str8 = str2;
            String str9 = str3;
            int i2 = i;
            if (ordinal == 0) {
                map = this.A0H;
            } else if (ordinal == 1 || ordinal == 3) {
                if (this.A0O) {
                    map = this.A0L;
                } else {
                    return;
                }
            } else if (ordinal == 2 || ordinal == 4) {
                if (this.A0O) {
                    this.A0M.put(directShareTarget2, A00(eZe2, userSession2, directShareTarget2, str7, str8, str9, i2, j4, j6, j5));
                }
                if (this.A06 != null) {
                    String str10 = str4;
                    if (str4 != null && 182.A06(AnonymousClass7TF.A0H(userSession2), userSession2, 36328508426829181L)) {
                        map = this.A0K;
                        String r4 = new 1Ln(AnonymousClass7TE.A0e(this.A0D, "share_sheet_search_impressions"), 375);
                        str6 = null;
                        if (DbT.A1Y(r4)) {
                            0bb r2 = new 0bb();
                            r2.A06("query_string", str10);
                            A02(r2, this, directShareTarget2, Long.valueOf(j6));
                            r4.A0N(r2, "search_result");
                            r4.A0R("query_session_id", this.A07);
                            r4.A0M(C71112Od3.A03(i2, true), "ui_section");
                            r4.A0S("data_sources", C71112Od3.A05(directShareTarget2.A08));
                            r4.A0O("impression_selected", Boolean.valueOf(z));
                            r4.A0R("sub_query_session_id", this.A06);
                            r4.A0Q("query_length", DbS.A0j(str10.length()));
                            r4.A0Q("ui_section_index", Long.valueOf(j4));
                            String str11 = str5;
                            if (str5 != null) {
                                r4.A0N(N1H.A00(directShareTarget2, str11), "mnet_request");
                            }
                            r4.A0M(C71112Od3.A02(DbZ.A0S(directShareTarget2)), TraceFieldType.TransportType);
                            C254793t3 A052 = AnonymousClass6W3.A05(DbS.A0c(directShareTarget2));
                            if (!(A052 == null || (A022 = C300965yF.A02(A052)) == null)) {
                                str6 = A022.A00;
                            }
                            r4.A0R(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str6);
                            r4.A0S("recipient_id", directShareTarget2.A0C());
                            str6 = r4;
                        }
                        map.put(directShareTarget2, str6);
                    }
                    return;
                }
                return;
            } else {
                return;
            }
            str6 = A00(eZe2, userSession2, directShareTarget2, str7, str8, str9, i2, j4, j6, j5);
            map.put(directShareTarget2, str6);
        }
    }

    public final void A0A(C48136EZe eZe, UserSession userSession, DirectShareTarget directShareTarget, 1iA r11, String str, String str2, String str3, String str4, int i, long j, long j2, boolean z) {
        String str5;
        0sn A1C;
        C69454Nly nly;
        Long l;
        DbW.A1O(userSession, 0, str2);
        if (this.A09 || this.A0O) {
            1Ln r3 = new 1Ln(AnonymousClass7TE.A0e(this.A0D, "direct_share_media"), 147);
            if (DbT.A1Y(r3)) {
                r3.A0R(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
                r3.A0R("share_sheet_session_id", this.A07);
                if (str == null) {
                    str = this.A08;
                }
                r3.A0R("query_session_id", str);
                r3.A0M(eZe, "sheet_state");
                C254783t2 A0c = DbS.A0c(directShareTarget);
                if (A0c instanceof C254763t0) {
                    str5 = ((C254763t0) A0c).A00;
                } else {
                    str5 = null;
                }
                r3.A0R(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str5);
                if (DbT.A14(directShareTarget).isEmpty()) {
                    Long A10 = AnonymousClass7TE.A10(userSession.A06);
                    if (A10 != null) {
                        0bb r2 = new 0bb();
                        r2.A05("recipient_id", A10);
                        r2.A01(C69454Nly.INSTAGRAM, "interop_user_type");
                        A1C = AnonymousClass7TE.A1I(r2);
                    } else {
                        A1C = 0sn.A00;
                    }
                } else {
                    A1C = AnonymousClass7TE.A1C();
                    for (PendingRecipient pendingRecipient : DbT.A14(directShareTarget)) {
                        Long A102 = AnonymousClass7TE.A10(pendingRecipient.getId());
                        if (A102 != null) {
                            0bb r22 = new 0bb();
                            r22.A05("recipient_id", A102);
                            if (pendingRecipient.A01 == 0) {
                                nly = C69454Nly.INSTAGRAM;
                            } else {
                                nly = C69454Nly.FACEBOOK;
                            }
                            r22.A01(nly, "interop_user_type");
                            A1C.add(r22);
                        }
                    }
                }
                r3.A0S("recipient_info", A1C);
                r3.A0R("section_type", C69838Nt2.A00(i));
                if (r11 != null) {
                    l = DbS.A0j(r11.A00);
                } else {
                    l = null;
                }
                r3.A0Q("media_type", l);
                r3.A0R(TraceFieldType.RequestID, str3);
                r3.A0Q("relative_position", Long.valueOf(j));
                r3.A0Q("position", Long.valueOf(j2));
                r3.A0R("send_type", str4);
                r3.A0R("super_share_channels", String.valueOf(z ? 1 : 0));
                if (this.A0P && AnonymousClass7TF.A0Q(userSession).A05() != 1 && !directShareTarget.A0E()) {
                    r3.A0R(TraceFieldType.TransportType, AnonymousClass6W3.A00(DbS.A0c(directShareTarget)).A00);
                }
                this.A0G.put(directShareTarget, r3);
            }
        }
    }

    public final void A0C(String str, String str2, String str3) {
        0qQ.A0B(str, 0);
        0Aj A0e = AnonymousClass7TE.A0e(this.A0D, "direct_group_create_button_select");
        if (A0e.isSampled()) {
            DbS.A1N(A0e, str);
            DbU.A1N(A0e, "share_sheet_session_id", this.A07, str2);
            A0e.AAJ("ranking_info_token", str3);
            A0e.Cgf();
        }
    }

    private final 1Ln A00(C48136EZe eZe, UserSession userSession, DirectShareTarget directShareTarget, String str, String str2, String str3, int i, long j, long j2, long j3) {
        String str4;
        0sn A1C;
        C69454Nly nly;
        Long r5 = new 1Ln(AnonymousClass7TE.A0e(this.A0D, C66579MXk.A00(792)), 148);
        Long l = null;
        if (DbT.A1Y(r5)) {
            r5.A0R(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "DIRECT_RESHARE_SHEET");
            r5.A00.A9O(C273654mx.A00(144), "");
            r5.A0R("share_sheet_session_id", this.A07);
            r5.A0R("query_session_id", this.A08);
            r5.A0M(eZe, "sheet_state");
            C254783t2 A0c = DbS.A0c(directShareTarget);
            if (A0c instanceof C254763t0) {
                str4 = ((C254763t0) A0c).A00;
            } else {
                str4 = null;
            }
            r5.A0R(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str4);
            if (DbT.A14(directShareTarget).isEmpty()) {
                Long A10 = AnonymousClass7TE.A10(userSession.A06);
                if (A10 != null) {
                    0bb r2 = new 0bb();
                    r2.A05("recipient_id", A10);
                    r2.A01(C69454Nly.INSTAGRAM, "interop_user_type");
                    A1C = AnonymousClass7TE.A1I(r2);
                } else {
                    A1C = 0sn.A00;
                }
            } else {
                A1C = AnonymousClass7TE.A1C();
                for (PendingRecipient pendingRecipient : DbT.A14(directShareTarget)) {
                    Long A102 = AnonymousClass7TE.A10(pendingRecipient.getId());
                    if (A102 != null) {
                        0bb r22 = new 0bb();
                        r22.A05("recipient_id", A102);
                        if (pendingRecipient.A01 == 0) {
                            nly = C69454Nly.INSTAGRAM;
                        } else {
                            nly = C69454Nly.FACEBOOK;
                        }
                        r22.A01(nly, "interop_user_type");
                        C251053mU A022 = C251033mS.A00(userSession).A02(pendingRecipient.getId());
                        if (A022 != null) {
                            r22.A05("last_active_time", Long.valueOf((System.currentTimeMillis() - A022.A01) / StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS));
                        }
                        A1C.add(r22);
                    }
                }
            }
            r5.A0S("recipient_info", A1C);
            r5.A0R("section_type", C69838Nt2.A00(i));
            if (j3 != -1) {
                l = Long.valueOf(j3);
            }
            r5.A0Q("media_type", l);
            r5.A0R(TraceFieldType.RequestID, str);
            r5.A0Q("relative_position", Long.valueOf(j));
            r5.A0Q("position", Long.valueOf(j2));
            r5.A0R("send_type", str2);
            r5.A0O(C273654mx.A00(784), AnonymousClass7TE.A0u());
            r5.A0R("inventory_source", str3);
            l = r5;
            if (this.A0P && AnonymousClass7TF.A0Q(userSession).A05() != 1 && !directShareTarget.A0E()) {
                r5.A0R(TraceFieldType.TransportType, AnonymousClass6W3.A00(DbS.A0c(directShareTarget)).A00);
            }
        }
        return l;
    }

    public static void A01(0Aj r2, FZ0 fz0, DirectShareTarget directShareTarget, String str, int i) {
        r2.AAe("data_sources", C71112Od3.A05(directShareTarget.A08));
        r2.AAJ("sub_query_session_id", fz0.A06);
        r2.A9F("query_length", Long.valueOf((long) str.length()));
        r2.A9F("ui_section_index", Long.valueOf((long) i));
    }

    public final String A03() {
        if (this.A09) {
            A07();
        }
        String A0b = AnonymousClass7TF.A0b();
        this.A07 = A0b;
        this.A09 = true;
        this.A00 = SystemClock.elapsedRealtime();
        return A0b;
    }

    public final void A04() {
        if (!this.A09) {
            A03();
        }
        if (this.A0N) {
            A06();
        }
        this.A06 = AnonymousClass7TF.A0b();
    }

    public final void A05() {
        if (!this.A09) {
            A03();
        }
        if (this.A0O) {
            A08();
        }
        this.A08 = AnonymousClass7TF.A0b();
    }

    public final void A06() {
        Map map = this.A0K;
        Iterator A0v = AnonymousClass7TF.A0v(map);
        while (A0v.hasNext()) {
            AnonymousClass0Ai r0 = (AnonymousClass0Ai) A0v.next();
            if (r0 != null) {
                r0.Cgf();
            }
        }
        this.A06 = null;
        map.clear();
    }

    public final void A08() {
        Map map = this.A0L;
        C49757F5i.A01(map.values());
        Map map2 = this.A0M;
        C49757F5i.A01(map2.values());
        this.A08 = null;
        map.clear();
        map2.clear();
    }

    public final void A07() {
        String str;
        A08();
        Map map = this.A0H;
        Iterator A16 = DbV.A16(map);
        while (A16.hasNext()) {
            Object next = A16.next();
            0Ak r6 = (0Ak) map.get(next);
            C49540Exb exb = (C49540Exb) this.A0I.get(next);
            if (!(r6 == null || exb == null)) {
                if (exb.A02 == AnonymousClass05K.A00) {
                    exb.A01 += SystemClock.elapsedRealtime() - exb.A00;
                }
                r6.A0P("dwell_time_s", Double.valueOf(((double) Math.round((((double) exb.A01) / 1000.0d) * 100.0d)) / 100.0d));
            }
        }
        C49757F5i.A01(map.values());
        Map map2 = this.A0G;
        Iterator A162 = DbV.A16(map2);
        while (A162.hasNext()) {
            DirectShareTarget A0f = DbT.A0f(A162);
            0Ak r2 = (0Ak) map2.get(A0f);
            if (r2 != null) {
                C254783t2 A0c = DbS.A0c(A0f);
                if (A0c instanceof C254763t0) {
                    r2.A0R(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, ((C254763t0) A0c).A00);
                }
                this.A0A = false;
                r2.Cgf();
            }
        }
        long j = this.A00;
        if (j != -1) {
            double elapsedRealtime = ((double) (SystemClock.elapsedRealtime() - j)) / 1000.0d;
            0Aj A0e = AnonymousClass7TE.A0e(this.A0D, "direct_reshare_sheet_time_spent");
            if (182.A06(0Tu.A05, this.A0E, 36323921402080883L)) {
                str = null;
            } else {
                str = this.A02;
            }
            if (A0e.isSampled()) {
                A0e.AAJ("media_id", str);
                A0e.AAJ("ranking_info_token", this.A04);
                A0e.A8D("time_spent", Double.valueOf(elapsedRealtime));
                A0e.AAJ("inventory_source", this.A01);
                A0e.AAJ("share_sheet_session_id", this.A07);
                A0e.AAJ("ranking_request_id", this.A05);
                A0e.AAJ("media_type", this.A03);
                DbX.A1L(A0e);
            }
        }
        OEC oec = this.A0F;
        oec.A01.markerEnd(276892616, 2);
        oec.A00 = null;
        this.A00 = -1;
        this.A0A = true;
        map.clear();
        this.A0I.clear();
        map2.clear();
        this.A0J.clear();
    }

    public final void A0B(AnonymousClass0iw r10, 1iA r11, String str, String str2, List list) {
        String str3;
        boolean A1X = DbW.A1X(str);
        if (!(!this.A0G.isEmpty()) && this.A0A) {
            UserSession userSession = this.A0E;
            String str4 = this.A07;
            ArrayList A1C = AnonymousClass7TE.A1C();
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                DirectShareTarget A0f = DbT.A0f(it);
                C254783t2 A0c = DbS.A0c(A0f);
                if (A0c instanceof C254763t0) {
                    A1C2.add(((C254763t0) A0c).A00);
                }
                for (PendingRecipient id : DbW.A0m(A0f)) {
                    A1C.add(id.getId());
                }
            }
            AnonymousClass0kM r0 = new AnonymousClass0kM(userSession);
            r0.A00 = r10;
            0Aj A0e = AnonymousClass7TE.A0e(r0.A00(), "direct_reshare_exit_flow");
            if (A0e.isSampled()) {
                A0e.A9O(C273654mx.A00(144), "");
                A0e.A9O("recipient_ids", A1C);
                A0e.A9O(AnonymousClass000.A00(1886), A1C2);
                A0e.AAJ(C273654mx.A00(3358), str);
                A0e.AAJ("share_sheet_session_id", str4);
                A0e.AAJ("ranking_request_id", str2);
                if (r11 != null) {
                    str3 = r11.name();
                } else {
                    str3 = null;
                }
                A0e.AAJ("media_type", str3);
                DbX.A1L(A0e);
            }
            this.A0A = A1X;
        }
    }

    public final void onUserSessionWillEnd(boolean z) {
        A07();
    }
}

package X;

import android.content.Context;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcCallFunnelSessionId;
import com.instagram.model.rtc.RtcCallKey;
import com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments;
import com.instagram.rtc.analytics.RtcCallSurveyLogger;
import com.instagram.rtc.signaling.models.RtcConnectionEntity;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Map;
import java.util.Set;

public final class OWA {
    public OEN A00;
    public C71869OsB A01;
    public RtcCallSurveyLogger A02;
    public C71142Ods A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final Context A07;
    public final UserFlowLoggerImpl A08;
    public final UserSession A09;
    public final AnonymousClass0qK A0A = new IP4(this, 0);
    public final C70687OGi A0B;
    public final C71078Oax A0C;
    public final C251033mS A0D;
    public final 1XB A0E;
    public final OFV A0F;
    public final OEO A0G;
    public final C71938OtO A0H = new C71938OtO(this);
    public final OJ4 A0I;
    public final 1Cn A0J;
    public final Set A0K;
    public final C62320sa A0L;
    public final C62320sa A0M;

    public final String A01(C69465Nm9 nm9, RtcCallFunnelSessionId rtcCallFunnelSessionId, RtcCallKey rtcCallKey, RtcStartCoWatchPlaybackArguments rtcStartCoWatchPlaybackArguments, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        String str7;
        String str8;
        C69277Nid nid;
        C69496Nme nme;
        C69449Nlt nlt;
        C69485NmT nmT;
        String str9;
        String str10 = str;
        0qQ.A0B(str10, 1);
        0qQ.A0B(str2, 5);
        Context context = this.A07;
        UserSession userSession = this.A09;
        boolean z2 = z;
        RtcCallKey rtcCallKey2 = rtcCallKey;
        RtcCallKey rtcCallKey3 = rtcCallKey2;
        String str11 = str10;
        Context context2 = context;
        UserSession userSession2 = userSession;
        C71142Ods ods = new C71142Ods(context2, nm9, userSession2, rtcCallFunnelSessionId, rtcCallKey3, num2, str11, str3, str4, str5, str6, z2);
        C71142Ods ods2 = this.A03;
        if (ods2 != null && !ods2.A0O) {
            C71142Ods.A02(C69417Nkz.A0c, ods2, (0sP) null);
        }
        this.A03 = ods;
        OFV ofv = this.A0F;
        ofv.A00 = AnonymousClass05K.A00;
        ofv.A03 = false;
        ofv.A02 = false;
        ofv.A01 = false;
        02m r15 = 02m.A0p;
        r15.markerStart(805190082);
        Integer num3 = num;
        int intValue = num3.intValue();
        if (intValue != 0) {
            str7 = "JOIN_CALL";
        } else {
            str7 = "INITIATE_CALL";
        }
        r15.markerAnnotate(805190082, "call_type", str7);
        r15.markerAnnotate(805190082, "startup_type", C64031Cc.A09.toString());
        r15.markerAnnotate(805190082, "time_since_startup", C64031Cc.A02());
        r15.markerAnnotate(805190082, "time_since_startup_bucket", C64031Cc.A00());
        r15.markerEnd(805190082, 2);
        0LA.A05(AnonymousClass0LO.A6Z, DateFormat.getDateTimeInstance().format(Calendar.getInstance().getTime()));
        if (intValue != 0) {
            str8 = "join_call";
        } else {
            str8 = "initiate_call";
        }
        0LA.A05(AnonymousClass0LO.A6a, str8);
        C71142Ods ods3 = this.A03;
        if (ods3 != null) {
            ods3.A0Y.A05();
        }
        if (intValue != 0) {
            ofv.A02 = true;
        } else {
            ofv.A03 = true;
        }
        A02(new C72809PKx(num3));
        C68160N3a n3a = (C68160N3a) this.A0L.invoke();
        if (n3a == null || (nid = n3a.A02) == null) {
            nid = C69277Nid.NO_E2EE;
        }
        this.A01 = new C71869OsB(userSession, nid, rtcCallKey2);
        this.A02 = new RtcCallSurveyLogger(context, AnonymousClass12T.A00, userSession, rtcCallKey2);
        this.A00 = new OEN(userSession, context, z2);
        C71078Oax oax = this.A0C;
        oax.A00 = rtcCallKey2;
        C68683NSp nSp = ods.A0Y;
        oax.A01 = nSp.A05();
        RtcStartCoWatchPlaybackArguments rtcStartCoWatchPlaybackArguments2 = rtcStartCoWatchPlaybackArguments;
        if (rtcStartCoWatchPlaybackArguments != null) {
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(oax.A02), "ig_cowatch_event");
            C69502Nmk nmk = C69502Nmk.A05;
            int intValue2 = rtcStartCoWatchPlaybackArguments2.A03.intValue();
            if (intValue2 == 5) {
                nme = C69496Nme.IN_THREAD_ENTRYPOINT_SINGLE_FEED;
            } else if (intValue2 == 2) {
                nme = C69496Nme.SHARE_SHEET_ENTRYPOINT;
            } else if (intValue2 == 6) {
                nme = C69496Nme.DIRECT_SHARE_ENTRYPOINT;
            } else if (intValue2 != 7) {
                nme = null;
            } else {
                nme = C69496Nme.DIRECT_SHARE_LOCAL_ENTRYPOINT;
            }
            String str12 = rtcStartCoWatchPlaybackArguments2.A04;
            String A0L2 = 00l.A0L(str12, "_", str12);
            int intValue3 = rtcStartCoWatchPlaybackArguments2.A01.intValue();
            if (intValue3 == 0 || intValue3 == 2) {
                nlt = C69449Nlt.INSTAGRAM;
            } else if (intValue3 == 1) {
                nlt = C69449Nlt.FACEBOOK;
            } else {
                throw AnonymousClass7TE.A1K();
            }
            switch (rtcStartCoWatchPlaybackArguments2.A02.intValue()) {
                case 0:
                    nmT = C69485NmT.PHOTO;
                    break;
                case 1:
                    nmT = C69485NmT.VIDEO;
                    break;
                case 2:
                    nmT = C69485NmT.CAROUSEL_PHOTO;
                    break;
                case 3:
                    nmT = C69485NmT.CAROUSEL_VIDEO;
                    break;
                case 4:
                    nmT = C69485NmT.CAROUSEL;
                    break;
                case 5:
                    nmT = C69485NmT.IGTV;
                    break;
                case 6:
                    nmT = C69485NmT.REELS;
                    break;
                case 7:
                    nmT = null;
                    break;
                default:
                    throw AnonymousClass7TE.A1K();
            }
            if (A0e.isSampled()) {
                C51965G9l.A19(nmk, A0e);
                A0e.A8M(nme, "source");
                A0e.A9H("extra_info", (Map) null);
                RtcCallKey rtcCallKey4 = oax.A00;
                if (rtcCallKey4 != null) {
                    str9 = rtcCallKey4.A00;
                } else {
                    str9 = null;
                }
                A0e.AAJ("server_info", str9);
                A0e.AAJ("waterfall_id", oax.A01);
                A0e.A8M(nmT, "media_type");
                A0e.AAJ("media_id", A0L2);
                A0e.A8M(nlt, "media_source");
                A0e.Cgf();
            }
        }
        OWf A002 = C70320O1y.A00(userSession);
        String A052 = nSp.A05();
        0qQ.A0B(A052, 0);
        A002.A01 = A052;
        if (!this.A04) {
            C62670v5.A0B.A03(this.A0A);
            this.A04 = true;
        }
        return nSp.A05();
    }

    public final void A02(C74267Prv prv) {
        0Aj r4;
        long j;
        Long A10;
        02m r2;
        int i;
        short s;
        Integer num;
        C69277Nid nid;
        Integer num2;
        C69277Nid nid2;
        C69277Nid nid3;
        C69277Nid nid4;
        String str;
        UserSession userSession;
        0xI A012;
        String str2;
        String str3;
        0qQ.A0B(prv, 0);
        if (prv instanceof PL4) {
            A00(new PK3(((PL4) prv).A00));
            return;
        }
        if (prv instanceof PLF) {
            C68160N3a n3a = (C68160N3a) this.A0L.invoke();
            if (n3a != null) {
                RtcConnectionEntity.RtcCallConnectionEntity rtcCallConnectionEntity = n3a.A03;
                String str4 = null;
                if (!C51969G9p.A1a(rtcCallConnectionEntity.A01, C69277Nid.NO_E2EE)) {
                    str3 = rtcCallConnectionEntity.A0J;
                } else {
                    str3 = null;
                    str4 = rtcCallConnectionEntity.A0E;
                }
                1XB r42 = this.A0E;
                userSession = this.A09;
                String str5 = rtcCallConnectionEntity.A03.A00;
                String str6 = n3a.A08;
                String str7 = rtcCallConnectionEntity.A0G;
                String str8 = userSession.A06;
                boolean A0K2 = 0qQ.A0K(str7, str8);
                AnonymousClass7TG.A1Q(str5, str6);
                A012 = 1XB.A01(C331537Rj.RING_SCREEN, r42, AnonymousClass05K.A0Y, str8, (String) null, str5, str6, str3, str4, (String) null);
                A012.A09("is_current_user", Boolean.valueOf(A0K2));
            } else {
                return;
            }
        } else if (prv instanceof PL3) {
            PL3 pl3 = (PL3) prv;
            C68160N3a n3a2 = (C68160N3a) this.A0L.invoke();
            if (n3a2 != null) {
                RtcConnectionEntity.RtcCallConnectionEntity rtcCallConnectionEntity2 = n3a2.A03;
                String str9 = null;
                if (!C51969G9p.A1a(rtcCallConnectionEntity2.A01, C69277Nid.NO_E2EE)) {
                    str = rtcCallConnectionEntity2.A0J;
                } else {
                    str = null;
                    str9 = rtcCallConnectionEntity2.A0E;
                }
                1XB r43 = this.A0E;
                userSession = this.A09;
                String str10 = rtcCallConnectionEntity2.A03.A00;
                String str11 = n3a2.A08;
                Integer num3 = pl3.A00;
                AnonymousClass7TG.A1Q(str10, str11);
                0qQ.A0B(num3, 7);
                A012 = 1XB.A01(C331537Rj.RING_SCREEN, r43, AnonymousClass05K.A0N, userSession.A06, (String) null, str10, str11, str, str9, (String) null);
                switch (num3.intValue()) {
                    case 3:
                        str2 = "tap_reply_button";
                        break;
                    case 4:
                        str2 = "tap_quick_reply_option1";
                        break;
                    case 5:
                        str2 = "tap_quick_reply_option2";
                        break;
                    case 6:
                        str2 = "tap_quick_reply_option3";
                        break;
                    default:
                        str2 = "tap_custom_reply";
                        break;
                }
                A012.A0C("action", str2);
            } else {
                return;
            }
        } else if (prv instanceof C74576PxP) {
            C74576PxP pxP = (C74576PxP) prv;
            C71869OsB osB = this.A01;
            if (osB == null) {
                return;
            }
            if (pxP instanceof C72788PKc) {
                C72788PKc pKc = (C72788PKc) pxP;
                String str12 = pKc.A01;
                String str13 = pKc.A02;
                Integer num4 = pKc.A00;
                0qQ.A0B(num4, 2);
                C71869OsB.A00(osB, AnonymousClass05K.A00, num4, str12, str13);
                if (osB.A01.A01() || !((nid4 = osB.A05) == C69277Nid.P2P_E2EE || nid4 == C69277Nid.GVC_E2EE)) {
                    02m r22 = osB.A02.A00;
                    if (r22.isMarkerOn(112601624, 0)) {
                        r22.markerEnd(112601624, 2);
                        return;
                    }
                    return;
                }
                return;
            }
            if (pxP instanceof PKZ) {
                Integer num5 = ((PKZ) pxP).A00;
                0qQ.A0B(num5, 0);
                C71869OsB.A00(osB, AnonymousClass05K.A01, num5, (String) null, (String) null);
                if (osB.A01.A01() || !((nid3 = osB.A05) == C69277Nid.P2P_E2EE || nid3 == C69277Nid.GVC_E2EE)) {
                    r2 = osB.A02.A00;
                    i = 112601624;
                    if (r2.isMarkerOn(112601624, 0)) {
                        s = 4;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (pxP instanceof PKY) {
                String str14 = ((PKY) pxP).A00;
                if (osB.A01.A01() || !((nid2 = osB.A05) == C69277Nid.P2P_E2EE || nid2 == C69277Nid.GVC_E2EE)) {
                    02m r23 = osB.A02.A00;
                    r23.markerStart(112601624);
                    r23.markerAnnotate(112601624, C273654mx.A00(174), str14);
                    return;
                }
                return;
            } else {
                if (pxP instanceof C72791PKf) {
                    num = AnonymousClass05K.A0C;
                    num2 = AnonymousClass05K.A01;
                } else if (pxP instanceof C72792PKg) {
                    num = AnonymousClass05K.A0N;
                    num2 = AnonymousClass05K.A01;
                } else if (pxP instanceof C72789PKd) {
                    num = AnonymousClass05K.A0Y;
                    num2 = AnonymousClass05K.A00;
                } else if (pxP instanceof C72790PKe) {
                    num = AnonymousClass05K.A0j;
                    num2 = AnonymousClass05K.A00;
                } else {
                    if (pxP instanceof C72793PKh) {
                        num = AnonymousClass05K.A08;
                    } else if (pxP instanceof C72794PKi) {
                        num = AnonymousClass05K.A09;
                    } else if (pxP instanceof C72786PKa) {
                        Integer num6 = ((C72786PKa) pxP).A00;
                        0qQ.A0B(num6, 0);
                        C71869OsB.A00(osB, AnonymousClass05K.A0A, num6, (String) null, (String) null);
                        if (osB.A01.A01() || !((nid = osB.A05) == C69277Nid.P2P_E2EE || nid == C69277Nid.GVC_E2EE)) {
                            C70929OSc oSc = osB.A02;
                            String A002 = O24.A00(num6);
                            r2 = oSc.A00;
                            i = 112601624;
                            if (r2.isMarkerOn(112601624, 0)) {
                                r2.markerAnnotate(112601624, "error_message", A002);
                                s = 3;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else if (pxP instanceof IX4) {
                        num = AnonymousClass05K.A1F;
                    } else if (pxP instanceof IX5) {
                        num = AnonymousClass05K.A02;
                    } else if (pxP instanceof IX6) {
                        Integer num7 = AnonymousClass05K.A1I;
                        C71869OsB.A00(osB, num7, num7, (String) null, (String) null);
                        return;
                    } else if (pxP instanceof IX7) {
                        num = AnonymousClass05K.A03;
                    } else if (pxP instanceof IX2) {
                        num = AnonymousClass05K.A04;
                    } else if (pxP instanceof IX3) {
                        num = AnonymousClass05K.A05;
                    } else if (pxP instanceof C72787PKb) {
                        Integer num8 = ((C72787PKb) pxP).A00;
                        0qQ.A0B(num8, 0);
                        C71869OsB.A00(osB, AnonymousClass05K.A06, num8, (String) null, (String) null);
                        return;
                    } else if (pxP instanceof C72795PKj) {
                        num = AnonymousClass05K.A07;
                    } else {
                        DbT.A1Q(0wj.A01, "Attempt to log undefined avatar event", 245701013);
                        return;
                    }
                    num2 = AnonymousClass05K.A1I;
                }
                C71869OsB.A00(osB, num, num2, (String) null, (String) null);
                return;
            }
            r2.markerEnd(i, s);
            return;
        } else {
            if (prv instanceof PL5) {
                PL5 pl5 = (PL5) prv;
                RtcCallSurveyLogger rtcCallSurveyLogger = this.A02;
                if (rtcCallSurveyLogger != null) {
                    Set A0k = 00k.A0k(this.A0K);
                    String str15 = pl5.A01;
                    String str16 = pl5.A02;
                    String str17 = pl5.A03;
                    String str18 = pl5.A00;
                    String str19 = (String) this.A0M.invoke();
                    RtcCallKey rtcCallKey = rtcCallSurveyLogger.A00;
                    if (rtcCallKey == null) {
                        0wb.A03("RtcCallSurveyLogger", "Call key is null when attempting to log call end survey");
                        return;
                    }
                    rtcCallSurveyLogger.A01(str15, str16, str17, str19, true);
                    String str20 = (String) 00k.A0A(A0k);
                    if (str20 == null || (A10 = AnonymousClass7TE.A10(str20)) == null) {
                        j = 0;
                    } else {
                        j = A10.longValue();
                    }
                    r4 = AnonymousClass7TE.A0e(rtcCallSurveyLogger.A01, "ls_rtc_end_call_survey");
                    r4.AAe("rtc_end_call_survey_selected_options", AnonymousClass7TE.A1I(str16));
                    r4.AAJ("rtc_end_call_survey_issue", str15);
                    r4.AAJ("shared_call_id", rtcCallKey.A00);
                    if (str18 == null) {
                        str18 = "";
                    }
                    r4.AAJ("rtc_end_call_survey_freeform", str18);
                    r4.A9F("peer_id", Long.valueOf(j));
                    if (str19 == null) {
                        str19 = "";
                    }
                    r4.AAJ("local_call_id", str19);
                } else {
                    return;
                }
            } else if (prv instanceof PLC) {
                RtcCallSurveyLogger rtcCallSurveyLogger2 = this.A02;
                if (rtcCallSurveyLogger2 != null) {
                    String str21 = (String) this.A0M.invoke();
                    Integer valueOf = Integer.valueOf(this.A05 ? 1 : 0);
                    RtcCallKey rtcCallKey2 = rtcCallSurveyLogger2.A00;
                    if (rtcCallKey2 != null) {
                        r4 = AnonymousClass7TE.A0e(rtcCallSurveyLogger2.A01, "ls_rtc_star_rating_shown");
                        if (str21 == null) {
                            str21 = "";
                        }
                        r4.AAJ("local_call_id", str21);
                        r4.AAJ("shared_call_id", rtcCallKey2.A00);
                        r4.A9F("rating_style", DbZ.A0c(valueOf));
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (prv instanceof PL1) {
                OEO oeo = this.A0G;
                String str22 = ((PL1) prv).A00;
                C74561PxA pxA = oeo.A00;
                if (pxA != null) {
                    pxA.AUZ(str22);
                    return;
                }
                return;
            } else if (prv instanceof PL7) {
                PL7 pl7 = (PL7) prv;
                OEN oen = this.A00;
                if (oen != null) {
                    String str23 = pl7.A02;
                    Map map = pl7.A03;
                    String str24 = pl7.A01;
                    int i2 = pl7.A00;
                    boolean z = pl7.A04;
                    AnonymousClass7TF.A1H(str23, map);
                    if (!oen.A02) {
                        27p.A01(oen.A01).A13(C279294yP.RTC, C59725JVj.VIDEO_CHAT, str23, (String) null, str24, map, (Map) null, -1, i2, z, false);
                        return;
                    }
                    return;
                }
                return;
            } else {
                A00(prv);
                return;
            }
            r4.Cgf();
            return;
        }
        DbU.A1R(A012, userSession);
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [java.lang.Object, X.OJ4] */
    public /* synthetic */ OWA(Context context, UserSession userSession, C62320sa r7, C62320sa r8) {
        OFV ofv = new OFV();
        1XB r2 = AnonymousClass38W.A00().A01;
        UserFlowLoggerImpl userFlowLoggerImpl = new UserFlowLoggerImpl(02m.A0p);
        0qQ.A0B(r2, 6);
        this.A07 = context;
        this.A09 = userSession;
        this.A0L = r7;
        this.A0M = r8;
        this.A0F = ofv;
        this.A0E = r2;
        this.A08 = userFlowLoggerImpl;
        this.A0C = C69830Nsr.A00(userSession);
        this.A0B = (C70687OGi) userSession.A01(C70687OGi.class, new MJ0(userSession, 20));
        this.A0D = C251033mS.A00(userSession);
        this.A0G = O26.A00(userSession);
        this.A0J = new 1Cn(context);
        this.A0I = new Object();
        this.A0K = DbS.A0y();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        r1.A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        switch(r5.intValue()) {
            case 1: goto L_0x0068;
            case 2: goto L_0x0065;
            case 3: goto L_0x0062;
            case 4: goto L_0x005f;
            default: goto L_0x003d;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        r0 = "end_screen_impression";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        r2 = X.C71142Ods.A01(r8, r0);
        r12.AvD().invoke(r2);
        r2.A02("cold_start_index", java.lang.Long.valueOf(X.C68683NSp.A03));
        r8.A0T.EFq(X.C71142Ods.A00(r2, r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005f, code lost:
        r0 = "connected_impression";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0062, code lost:
        r0 = "ringing_screen_impression";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0065, code lost:
        r0 = "connecting_screen_impression";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0068, code lost:
        r0 = "waterfall_started";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0098, code lost:
        r1.A02(r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0260  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00(X.C74267Prv r12) {
        /*
            r11 = this;
            X.Ods r8 = r11.A03
            if (r8 == 0) goto L_0x0025
            boolean r0 = r12 instanceof X.C74425Puf
            if (r0 == 0) goto L_0x0100
            X.OFV r2 = r11.A0F
            X.Puf r12 = (X.C74425Puf) r12
            java.lang.Integer r5 = r12.BzT()
            r6 = 0
            int r1 = X.C51967G9n.A03(r5, r6)
            java.lang.Integer r0 = r2.A00
            int r0 = r0.intValue()
            if (r1 <= r0) goto L_0x0025
            boolean r0 = r2.A03
            if (r0 != 0) goto L_0x0026
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x0026
        L_0x0025:
            return
        L_0x0026:
            r2.A00 = r5
            int r0 = r5.intValue()
            switch(r0) {
                case 1: goto L_0x006b;
                case 2: goto L_0x0079;
                case 3: goto L_0x0089;
                case 4: goto L_0x009c;
                default: goto L_0x002f;
            }
        L_0x002f:
            X.OVr r1 = X.C70996OVr.A03
            java.lang.String r0 = "product_ended"
        L_0x0033:
            r1.A01(r0)
        L_0x0036:
            int r0 = r5.intValue()
            switch(r0) {
                case 1: goto L_0x0068;
                case 2: goto L_0x0065;
                case 3: goto L_0x0062;
                case 4: goto L_0x005f;
                default: goto L_0x003d;
            }
        L_0x003d:
            java.lang.String r0 = "end_screen_impression"
        L_0x003f:
            X.ONr r2 = X.C71142Ods.A01(r8, r0)
            X.0sP r0 = r12.AvD()
            r0.invoke(r2)
            long r0 = X.C68683NSp.A03
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "cold_start_index"
            r2.A02(r0, r1)
            X.0iu r1 = r8.A0T
            X.0xI r0 = X.C71142Ods.A00(r2, r8)
            r1.EFq(r0)
            return
        L_0x005f:
            java.lang.String r0 = "connected_impression"
            goto L_0x003f
        L_0x0062:
            java.lang.String r0 = "ringing_screen_impression"
            goto L_0x003f
        L_0x0065:
            java.lang.String r0 = "connecting_screen_impression"
            goto L_0x003f
        L_0x0068:
            java.lang.String r0 = "waterfall_started"
            goto L_0x003f
        L_0x006b:
            X.C71142Ods.A06(r8)
            long r0 = android.os.SystemClock.elapsedRealtime()
            r8.A0F = r0
            X.OVr r1 = X.C70996OVr.A03
            java.lang.String r0 = "product_started"
            goto L_0x0033
        L_0x0079:
            X.OVr r1 = X.C70996OVr.A03
            java.lang.String r0 = "product_connecting"
            r1.A01(r0)
            com.instagram.common.session.UserSession r0 = r8.A0U
            X.OWf r1 = X.C70320O1y.A00(r0)
            r0 = 10
            goto L_0x0098
        L_0x0089:
            X.OVr r1 = X.C70996OVr.A03
            java.lang.String r0 = "product_ringing"
            r1.A01(r0)
            com.instagram.common.session.UserSession r0 = r8.A0U
            X.OWf r1 = X.C70320O1y.A00(r0)
            r0 = 11
        L_0x0098:
            r1.A02(r0)
            goto L_0x0036
        L_0x009c:
            X.OVr r1 = X.C70996OVr.A03
            java.lang.String r0 = "product_connected"
            r1.A01(r0)
            com.instagram.common.session.UserSession r0 = r8.A0U
            X.OWf r1 = X.C70320O1y.A00(r0)
            r0 = 14
            r1.A02(r0)
            java.lang.String r4 = r1.A01
            if (r4 == 0) goto L_0x00c3
            r3 = 0
            X.OWb r2 = X.C71004OWb.A00
            java.lang.String r0 = "succeed "
            java.lang.String r1 = X.002.A0R(r0, r4)
            java.lang.String r0 = "IGRTCProductFunnelLogger"
            r2.A00(r0, r1)
            com.facebook.rtc.logging.connectfunnel.logger.gen.ConnectFunnel.CProxy.succeed(r4, r3)
        L_0x00c3:
            X.OGi r2 = r8.A0V
            java.lang.String r1 = r8.A0e
            X.NSp r0 = r8.A0Y
            java.lang.String r4 = r0.A05()
            r0 = 1
            X.0qQ.A0B(r4, r0)
            X.OBG r2 = r2.A03
            r0 = 0
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0036
            int r1 = r1.hashCode()
            com.facebook.quicklog.reliability.UserFlowLoggerImpl r3 = r2.A00
            r0 = 572856456(0x22251888, float:2.2374657E-18)
            long r1 = r3.generateFlowId(r0, r1)
            java.lang.String r0 = "call_connected"
            r3.flowMarkPoint(r1, r0)
            java.lang.String r0 = "is_caller"
            r3.flowAnnotate(r1, r0, r6)
            java.lang.String r0 = "is_group"
            r3.flowAnnotate(r1, r0, r6)
            java.lang.String r0 = "waterfall_id"
            r3.flowAnnotate(r1, r0, r4)
            r3.flowEndSuccess(r1)
            goto L_0x0036
        L_0x0100:
            boolean r0 = r12 instanceof X.C74575PxO
            if (r0 == 0) goto L_0x0158
            X.Pue r12 = (X.C74424Pue) r12
            r0 = 0
            X.0qQ.A0B(r12, r0)
            X.OTL r1 = r8.A0X
            X.PKl r0 = X.C72797PKl.A00
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x012a
            X.OVE r5 = r1.A00
        L_0x0116:
            long r3 = r5.A01
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0126
            X.0sa r0 = r5.A02
            long r0 = X.JTR.A0O(r0)
            r5.A01 = r0
        L_0x0126:
            X.C71142Ods.A03(r12, r8)
            return
        L_0x012a:
            X.PKm r0 = X.C72798PKm.A00
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0138
            X.OVE r0 = r1.A00
        L_0x0134:
            r0.A00()
            goto L_0x0126
        L_0x0138:
            X.PKo r0 = X.C72800PKo.A00
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0143
            X.OVE r5 = r1.A01
            goto L_0x0116
        L_0x0143:
            boolean r0 = r12 instanceof X.C72807PKv
            if (r0 == 0) goto L_0x014a
            X.OVE r0 = r1.A01
            goto L_0x0134
        L_0x014a:
            boolean r0 = r12 instanceof X.C72803PKr
            if (r0 == 0) goto L_0x0151
            X.OVE r5 = r1.A02
            goto L_0x0116
        L_0x0151:
            boolean r0 = r12 instanceof X.C72804PKs
            if (r0 == 0) goto L_0x0126
            X.OVE r0 = r1.A02
            goto L_0x0134
        L_0x0158:
            boolean r0 = r12 instanceof X.C74424Pue
            if (r0 == 0) goto L_0x0163
            X.Pue r12 = (X.C74424Pue) r12
        L_0x015e:
            r0 = 0
            X.0qQ.A0B(r12, r0)
            goto L_0x0126
        L_0x0163:
            boolean r0 = r12 instanceof X.PLI
            if (r0 == 0) goto L_0x0177
            X.Nkz r1 = X.C69417Nkz.A0h
            X.Ppc r0 = X.C74135Ppc.A00
            X.C71142Ods.A02(r1, r8, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.C71142Ods.A07(r8, r0)
            r0 = 1
        L_0x0174:
            r11.A06 = r0
            return
        L_0x0177:
            boolean r0 = r12 instanceof X.PLH
            if (r0 == 0) goto L_0x0189
            X.Nkz r1 = X.C69417Nkz.MAXIMIZED
            X.Ppb r0 = X.C74134Ppb.A00
            X.C71142Ods.A02(r1, r8, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.C71142Ods.A07(r8, r0)
            r0 = 0
            goto L_0x0174
        L_0x0189:
            boolean r0 = r12 instanceof X.PLD
            if (r0 == 0) goto L_0x019a
            long r0 = android.os.SystemClock.elapsedRealtime()
            r8.A09 = r0
            long r0 = android.os.SystemClock.elapsedRealtime()
        L_0x0197:
            r8.A08 = r0
            return
        L_0x019a:
            boolean r0 = r12 instanceof X.PLE
            if (r0 == 0) goto L_0x01bb
            long r5 = r8.A0A
            long r3 = r8.A09
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x01ad
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 - r3
        L_0x01ad:
            long r5 = r5 + r0
            r8.A0A = r5
            r0 = 0
            r8.A09 = r0
            X.C71142Ods.A04(r8)
            X.C71142Ods.A05(r8)
            goto L_0x0197
        L_0x01bb:
            boolean r0 = r12 instanceof X.PLJ
            if (r0 == 0) goto L_0x01c6
            long r0 = android.os.SystemClock.elapsedRealtime()
            r8.A06 = r0
            return
        L_0x01c6:
            boolean r0 = r12 instanceof X.PLK
            if (r0 == 0) goto L_0x01ce
            X.C71142Ods.A04(r8)
            return
        L_0x01ce:
            boolean r0 = r12 instanceof X.PLA
            if (r0 == 0) goto L_0x021b
            X.PLA r12 = (X.PLA) r12
            r0 = 0
            X.0qQ.A0B(r12, r0)
            java.lang.Integer r0 = r12.A00
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x01f0;
                case 1: goto L_0x01fa;
                case 2: goto L_0x0204;
                case 3: goto L_0x0218;
                case 4: goto L_0x020e;
                default: goto L_0x01e1;
            }
        L_0x01e1:
            java.lang.String r3 = "camera_dual_off"
        L_0x01e3:
            X.Nkz r2 = X.C69417Nkz.A1M
            r0 = 35
            X.PmT r1 = new X.PmT
            r1.<init>(r8, r12, r3, r0)
        L_0x01ec:
            X.C71142Ods.A02(r2, r8, r1)
            return
        L_0x01f0:
            boolean r0 = r12.A04
            if (r0 == 0) goto L_0x01f7
            java.lang.String r3 = "microphone_on"
            goto L_0x01e3
        L_0x01f7:
            java.lang.String r3 = "microphone_off"
            goto L_0x01e3
        L_0x01fa:
            boolean r0 = r12.A03
            if (r0 == 0) goto L_0x0201
            java.lang.String r3 = "camera_on"
            goto L_0x01e3
        L_0x0201:
            java.lang.String r3 = "camera_off"
            goto L_0x01e3
        L_0x0204:
            boolean r0 = r12.A02
            if (r0 == 0) goto L_0x020b
            java.lang.String r3 = "camera_front"
            goto L_0x01e3
        L_0x020b:
            java.lang.String r3 = "camera_back"
            goto L_0x01e3
        L_0x020e:
            boolean r0 = r12.A02
            if (r0 == 0) goto L_0x0215
            java.lang.String r3 = "camera_dual_front"
            goto L_0x01e3
        L_0x0215:
            java.lang.String r3 = "camera_dual_back"
            goto L_0x01e3
        L_0x0218:
            java.lang.String r3 = "camera_dual_on"
            goto L_0x01e3
        L_0x021b:
            boolean r0 = r12 instanceof X.PLB
            if (r0 == 0) goto L_0x026e
            X.PLB r12 = (X.PLB) r12
            r0 = 0
            X.0qQ.A0B(r12, r0)
            X.Nkz r2 = X.C69417Nkz.A0Z
            r1 = 13
            X.PqS r0 = new X.PqS
            r0.<init>((int) r1, (java.lang.Object) r8, (java.lang.Object) r12)
            X.C71142Ods.A02(r2, r8, r0)
            java.lang.Integer r1 = r12.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            boolean r0 = X.AnonymousClass7TF.A1W(r1, r0)
            r3 = 0
            if (r0 != 0) goto L_0x0263
            long r5 = r8.A0J
            long r0 = r8.A0B
            r9 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x024c
            long r9 = android.os.SystemClock.elapsedRealtime()
            long r9 = r9 - r0
        L_0x024c:
            long r5 = r5 + r9
            r8.A0J = r5
        L_0x024f:
            r8.A0B = r3
        L_0x0251:
            boolean r0 = r8.A0f
            if (r0 == 0) goto L_0x0260
            boolean r0 = r12.A07
            if (r0 == 0) goto L_0x025e
            java.lang.String r0 = "1004"
        L_0x025b:
            r8.A0M = r0
            return
        L_0x025e:
            r0 = 0
            goto L_0x025b
        L_0x0260:
            java.lang.String r0 = r12.A05
            goto L_0x025b
        L_0x0263:
            long r1 = r8.A0B
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0251
            long r3 = android.os.SystemClock.elapsedRealtime()
            goto L_0x024f
        L_0x026e:
            boolean r0 = r12 instanceof X.PL9
            if (r0 == 0) goto L_0x027d
            X.Nkz r2 = X.C69417Nkz.A0a
            r0 = 14
        L_0x0276:
            X.PqS r1 = new X.PqS
            r1.<init>((int) r0, (java.lang.Object) r8, (java.lang.Object) r12)
            goto L_0x01ec
        L_0x027d:
            boolean r0 = r12 instanceof X.PL6
            if (r0 == 0) goto L_0x028c
            X.Nkz r2 = X.C69417Nkz.A1P
            r0 = 49
        L_0x0285:
            X.PqW r1 = new X.PqW
            r1.<init>(r12, r0)
            goto L_0x01ec
        L_0x028c:
            boolean r0 = r12 instanceof X.PL8
            if (r0 == 0) goto L_0x0295
            X.Nkz r2 = X.C69417Nkz.A08
            r0 = 12
            goto L_0x0276
        L_0x0295:
            boolean r0 = r12 instanceof X.PL2
            if (r0 == 0) goto L_0x02cc
            X.PL2 r12 = (X.PL2) r12
            r0 = 0
            X.0qQ.A0B(r12, r0)
            long r1 = r12.A00
            r6 = 0
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x02b9
            long r0 = android.os.SystemClock.elapsedRealtime()
            r8.A0E = r0
            long r2 = r8.A0H
            r0 = 1
            long r2 = r2 + r0
            r8.A0H = r2
        L_0x02b4:
            X.Nkz r2 = X.C69417Nkz.A13
            r0 = 48
            goto L_0x0285
        L_0x02b9:
            long r4 = r8.A0E
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x02b4
            long r2 = r8.A0I
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 - r4
            long r2 = r2 + r0
            r8.A0I = r2
            r8.A0E = r6
            goto L_0x02b4
        L_0x02cc:
            boolean r0 = r12 instanceof X.PLG
            if (r0 == 0) goto L_0x02d6
            X.Nkz r2 = X.C69417Nkz.A05
            X.PpZ r1 = X.C74132PpZ.A00
            goto L_0x01ec
        L_0x02d6:
            boolean r0 = r12 instanceof X.PK8
            if (r0 == 0) goto L_0x02de
            X.PK8 r12 = (X.PK8) r12
            goto L_0x015e
        L_0x02de:
            boolean r0 = r12 instanceof X.C72768PJi
            if (r0 == 0) goto L_0x02e6
            X.PJi r12 = (X.C72768PJi) r12
            goto L_0x015e
        L_0x02e6:
            X.0wj r2 = X.0wj.A01
            r1 = 245701013(0xea51995, float:4.0700275E-30)
            java.lang.String r0 = "Attempt to log undefined event"
            X.DbT.A1Q(r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OWA.A00(X.Prv):void");
    }
}

package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.VvW  reason: case insensitive filesystem */
public final class C18635VvW {
    public C18509Vt6 A00;
    public final UserSession A01;

    public C18635VvW(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
    }

    public final void A02(C18509Vt6 vt6, String str, String str2, long j, long j2) {
        0qQ.A0B(str2, 3);
        vt6.A08 = str;
        Long valueOf = Long.valueOf(j);
        vt6.A02 = valueOf;
        Long valueOf2 = Long.valueOf(j2);
        vt6.A03 = valueOf2;
        vt6.A04 = str2;
        this.A00 = vt6;
        UserSession userSession = this.A01;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A00((AnonymousClass0iw) null, 0kJ.A05, userSession), "ig_survey_impression");
        if (A0e.isSampled()) {
            A0e.AAJ("survey_id", str);
            A0e.A9F("tessa_config_id", valueOf);
            C13992Tns.A0h(A0e, userSession, valueOf2);
            DbS.A1O(A0e, str2);
            if (this.A00 != null) {
                A0e.AAJ("detailed_survey_type", (String) null);
                C18509Vt6 vt62 = this.A00;
                if (vt62 != null) {
                    A0e.A9F("ig_media_id", vt62.A00);
                    if (this.A00 != null) {
                        A0e.AAJ("notification_id", (String) null);
                        if (this.A00 != null) {
                            A0e.AAJ("notification_channel", (String) null);
                            if (this.A00 != null) {
                                A0e.AAJ("notification_type", (String) null);
                                if (this.A00 != null) {
                                    A0e.A9F("ad_campaign_id", (Long) null);
                                    if (this.A00 != null) {
                                        A0e.AAJ("ad_tracking_token", (String) null);
                                        if (this.A00 != null) {
                                            C51965G9l.A1D(A0e, (Long) null);
                                            C18509Vt6 vt63 = this.A00;
                                            if (vt63 != null) {
                                                A0e.AAJ("ranking_info_token", vt63.A07);
                                                if (this.A00 != null) {
                                                    A0e.AAJ("canonical_inventory_source", (String) null);
                                                    if (this.A00 != null) {
                                                        A0e.A9F("client_position", (Long) null);
                                                        if (this.A00 != null) {
                                                            A0e.A9F("feed_recs_post_position", (Long) null);
                                                            C18509Vt6 vt64 = this.A00;
                                                            if (vt64 != null) {
                                                                A0e.A9F("position_in_tray", vt64.A01);
                                                                C18509Vt6 vt65 = this.A00;
                                                                if (vt65 != null) {
                                                                    A0e.AAJ("containing_viewer_session_id", vt65.A06);
                                                                    C18509Vt6 vt66 = this.A00;
                                                                    if (vt66 != null) {
                                                                        A0e.AAJ("containing_tray_session_id", vt66.A05);
                                                                        DbX.A1L(A0e);
                                                                        return;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            0qQ.A0F("baseEventFields");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void A03(List list, long j, long j2, long j3, boolean z) {
        Long[] A002 = A00(j, j2, z);
        long longValue = A002[0].longValue();
        long longValue2 = A002[1].longValue();
        if (this.A00 == null) {
            0kD.A07("RapidFeedbackLogger", "Unable to log survey response event ig_survey_response due to Base event fields not initialized from initial impression", (Throwable) null);
        } else {
            UserSession userSession = this.A01;
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A00((AnonymousClass0iw) null, 0kJ.A05, userSession), "ig_survey_response");
            if (A0e.isSampled()) {
                ArrayList A0r = AnonymousClass7TG.A0r(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    0eP A1A = JTO.A1A(it);
                    0bb r4 = new 0bb();
                    r4.A06("question_id", (String) A1A.A00);
                    r4.A06(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, C51970G9q.A0k((Collection) A1A.A01));
                    A0r.add(r4);
                }
                C18509Vt6 vt6 = this.A00;
                if (vt6 != null) {
                    String str = vt6.A08;
                    if (str != null) {
                        A0e.AAJ("survey_id", str);
                        C18509Vt6 vt62 = this.A00;
                        if (vt62 != null) {
                            Long l = vt62.A02;
                            if (l != null) {
                                A0e.A9F("tessa_config_id", l);
                                C18509Vt6 vt63 = this.A00;
                                if (vt63 != null) {
                                    Long l2 = vt63.A03;
                                    if (l2 != null) {
                                        C13992Tns.A0h(A0e, userSession, l2);
                                        C18509Vt6 vt64 = this.A00;
                                        if (vt64 != null) {
                                            String str2 = vt64.A04;
                                            if (str2 != null) {
                                                DbS.A1O(A0e, str2);
                                                A0e.AAe("responses", A0r);
                                                A0e.A9F("page_dwell_time", Long.valueOf(longValue2));
                                                C13991Tnr.A15(A0e, Long.valueOf(longValue), j3);
                                                A0e.A9F("bakeoff_ig_media_id", (Long) null);
                                                A0e.A9F("bakeoff_ig_author_id", (Long) null);
                                                A0e.AAJ("bakeoff_ranking_info_token", (String) null);
                                                A0e.AAJ("bakeoff_canonical_inventory_source", (String) null);
                                                A0e.A9F("bakeoff_client_position", (Long) null);
                                                A0e.A9F("bakeoff_feed_recs_post_position", (Long) null);
                                                if (this.A00 != null) {
                                                    A0e.AAJ("detailed_survey_type", (String) null);
                                                    C18509Vt6 vt65 = this.A00;
                                                    if (vt65 != null) {
                                                        A0e.A9F("ig_media_id", vt65.A00);
                                                        if (this.A00 != null) {
                                                            A0e.AAJ("notification_id", (String) null);
                                                            if (this.A00 != null) {
                                                                A0e.AAJ("notification_channel", (String) null);
                                                                if (this.A00 != null) {
                                                                    A0e.AAJ("notification_type", (String) null);
                                                                    if (this.A00 != null) {
                                                                        A0e.A9F("ad_campaign_id", (Long) null);
                                                                        if (this.A00 != null) {
                                                                            A0e.AAJ("ad_tracking_token", (String) null);
                                                                            if (this.A00 != null) {
                                                                                C51965G9l.A1D(A0e, (Long) null);
                                                                                C18509Vt6 vt66 = this.A00;
                                                                                if (vt66 != null) {
                                                                                    A0e.AAJ("ranking_info_token", vt66.A07);
                                                                                    if (this.A00 != null) {
                                                                                        A0e.AAJ("canonical_inventory_source", (String) null);
                                                                                        if (this.A00 != null) {
                                                                                            A0e.A9F("client_position", (Long) null);
                                                                                            if (this.A00 != null) {
                                                                                                A0e.A9F("feed_recs_post_position", (Long) null);
                                                                                                C18509Vt6 vt67 = this.A00;
                                                                                                if (vt67 != null) {
                                                                                                    A0e.A9F("position_in_tray", vt67.A01);
                                                                                                    C18509Vt6 vt68 = this.A00;
                                                                                                    if (vt68 != null) {
                                                                                                        A0e.AAJ("containing_viewer_session_id", vt68.A06);
                                                                                                        C18509Vt6 vt69 = this.A00;
                                                                                                        if (vt69 != null) {
                                                                                                            A0e.AAJ("containing_tray_session_id", vt69.A05);
                                                                                                            DbX.A1L(A0e);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                throw new IllegalStateException("Required value was null.");
                                            }
                                        }
                                    } else {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                0qQ.A0F("baseEventFields");
                throw AnonymousClass00P.createAndThrow();
            }
        }
        0Aj A0e2 = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(this.A01), "ig_survey_response_debug");
        if (!A0e2.isSampled()) {
            return;
        }
        if (list.isEmpty()) {
            0kD.A07("RapidFeedbackLogger", "Unable to log survey response debug event ig_survey_response_debug due to empty list of responses", (Throwable) null);
            return;
        }
        A0e2.AAJ("question_name", (String) ((0eP) AnonymousClass7TE.A13(list)).A00);
        A0e2.Cgf();
    }

    public final void A01(long j, long j2, long j3, boolean z) {
        Long[] A002 = A00(j, j2, z);
        long longValue = A002[0].longValue();
        long longValue2 = A002[1].longValue();
        if (this.A00 == null) {
            0kD.A07("RapidFeedbackLogger", "Unable to log survey exit event ig_survey_exit due to Base event fields not initialized from initial impression", (Throwable) null);
            return;
        }
        UserSession userSession = this.A01;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A00((AnonymousClass0iw) null, 0kJ.A05, userSession), "ig_survey_exit");
        if (A0e.isSampled()) {
            C18509Vt6 vt6 = this.A00;
            if (vt6 != null) {
                String str = vt6.A08;
                if (str != null) {
                    A0e.AAJ("survey_id", str);
                    C18509Vt6 vt62 = this.A00;
                    if (vt62 != null) {
                        Long l = vt62.A02;
                        if (l != null) {
                            A0e.A9F("tessa_config_id", l);
                            C18509Vt6 vt63 = this.A00;
                            if (vt63 != null) {
                                Long l2 = vt63.A03;
                                if (l2 != null) {
                                    C13992Tns.A0h(A0e, userSession, l2);
                                    C18509Vt6 vt64 = this.A00;
                                    if (vt64 != null) {
                                        String str2 = vt64.A04;
                                        if (str2 != null) {
                                            DbS.A1O(A0e, str2);
                                            A0e.A9F("page_dwell_time", Long.valueOf(longValue2));
                                            C13991Tnr.A15(A0e, Long.valueOf(longValue), j3);
                                            if (this.A00 != null) {
                                                A0e.AAJ("detailed_survey_type", (String) null);
                                                C18509Vt6 vt65 = this.A00;
                                                if (vt65 != null) {
                                                    A0e.A9F("ig_media_id", vt65.A00);
                                                    if (this.A00 != null) {
                                                        A0e.AAJ("notification_id", (String) null);
                                                        if (this.A00 != null) {
                                                            A0e.AAJ("notification_channel", (String) null);
                                                            if (this.A00 != null) {
                                                                A0e.AAJ("notification_type", (String) null);
                                                                if (this.A00 != null) {
                                                                    A0e.A9F("ad_campaign_id", (Long) null);
                                                                    if (this.A00 != null) {
                                                                        A0e.AAJ("ad_tracking_token", (String) null);
                                                                        if (this.A00 != null) {
                                                                            C51965G9l.A1D(A0e, (Long) null);
                                                                            C18509Vt6 vt66 = this.A00;
                                                                            if (vt66 != null) {
                                                                                A0e.AAJ("ranking_info_token", vt66.A07);
                                                                                if (this.A00 != null) {
                                                                                    A0e.AAJ("canonical_inventory_source", (String) null);
                                                                                    if (this.A00 != null) {
                                                                                        A0e.A9F("client_position", (Long) null);
                                                                                        if (this.A00 != null) {
                                                                                            A0e.A9F("feed_recs_post_position", (Long) null);
                                                                                            C18509Vt6 vt67 = this.A00;
                                                                                            if (vt67 != null) {
                                                                                                A0e.A9F("position_in_tray", vt67.A01);
                                                                                                C18509Vt6 vt68 = this.A00;
                                                                                                if (vt68 != null) {
                                                                                                    A0e.AAJ("containing_viewer_session_id", vt68.A06);
                                                                                                    C18509Vt6 vt69 = this.A00;
                                                                                                    if (vt69 != null) {
                                                                                                        A0e.AAJ("containing_tray_session_id", vt69.A05);
                                                                                                        DbX.A1L(A0e);
                                                                                                        return;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            throw new IllegalStateException("Required value was null.");
                                        }
                                    }
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            0qQ.A0F("baseEventFields");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public static final Long[] A00(long j, long j2, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - j;
        long j4 = currentTimeMillis - j2;
        if (z) {
            j3 /= 1000;
            j4 /= 1000;
        }
        return new Long[]{Long.valueOf(j3), Long.valueOf(j4)};
    }
}

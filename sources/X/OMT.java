package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.aistudio.logging.AiStudioLoggingData;
import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.common.session.UserSession;
import com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData;
import com.instagram.direct.messagethread.messageactions.model.MessageActionsViewModel;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class OMT {
    public final 0wc A00;
    public final UserSession A01;

    public OMT(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = DbW.A0J(userSession, "direct_thread");
    }

    public final void A01(MessageActionsViewModel messageActionsViewModel, C254743sy r30, String str, List list) {
        String str2;
        String str3;
        XSN xsn;
        List list2 = list;
        0qQ.A0B(list2, 3);
        0wc r10 = this.A00;
        0kJ r9 = r10.A00;
        0Aj A002 = r10.A00(r9, "direct_long_press_message_menu_open");
        MessageActionsViewModel messageActionsViewModel2 = messageActionsViewModel;
        C254743sy r17 = r30;
        if (A002.isSampled()) {
            DbS.A1J(A002, "long_press");
            A002.AAJ("menu_ui", str);
            C66581MXm.A1H(A002, messageActionsViewModel2.A0Z);
            Long l = null;
            if (r30 != null) {
                str3 = C67003Mgb.A01(r17);
            } else {
                str3 = null;
            }
            C66580MXl.A1K(A002, str3);
            if (r30 != null) {
                l = C67003Mgb.A00(r17);
            }
            A002.A9F("occamadillo_thread_id", l);
            String str4 = messageActionsViewModel2.A0G;
            if (str4 == null) {
                str4 = String.valueOf(messageActionsViewModel2.A07);
            }
            A002.AAJ(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str4);
            MessageIdentifier messageIdentifier = messageActionsViewModel2.A08;
            A002.AAJ("message_id", messageIdentifier.A01);
            int i = messageActionsViewModel2.A02;
            XSN[] values = XSN.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    xsn = null;
                    break;
                }
                xsn = values[i2];
                Long valueOf = Long.valueOf(xsn.A00);
                long j = (long) i;
                if (valueOf != null && valueOf.longValue() == j) {
                    break;
                }
                i2++;
            }
            A002.A8M(xsn, "thread_subtype");
            A002.AAJ("bot_response_id", messageActionsViewModel2.A0D);
            A002.AAJ("client_context", messageIdentifier.A00());
            A002.Cgf();
        }
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((LongPressActionData) it.next()).A03 == AnonymousClass05K.A0G) {
                    String str5 = messageActionsViewModel2.A08.A01;
                    boolean z = messageActionsViewModel2.A0Z;
                    0Aj A003 = r10.A00(r9, C273654mx.A00(264));
                    if (A003.isSampled()) {
                        DbS.A1J(A003, "lp_impression");
                        A003.AAJ("message_type", 2FW.A1g.toString());
                        A003.AAJ("message_id", str5);
                        C66581MXm.A1H(A003, z);
                        Long l2 = null;
                        if (r30 != null) {
                            str2 = C67003Mgb.A01(r17);
                        } else {
                            str2 = null;
                        }
                        C66580MXl.A1K(A003, str2);
                        if (r30 != null) {
                            l2 = C67003Mgb.A00(r17);
                        }
                        A003.A9F("occamadillo_thread_id", l2);
                        A003.Cgf();
                    }
                }
            }
        }
        C71082Ob1 ob1 = C71082Ob1.A00;
        UserSession userSession = this.A01;
        int i3 = messageActionsViewModel2.A02;
        UserSession userSession2 = userSession;
        ob1.A03(userSession2, r17, Boolean.valueOf(messageActionsViewModel2.A0Z), messageActionsViewModel2.A0B, messageActionsViewModel2.A0A, (Integer) null, (String) null, messageActionsViewModel2.A0H, (String) null, 25, 1, i3);
    }

    public final void A00(XSV xsv, AiStudioLoggingData aiStudioLoggingData, MessageActionsViewModel messageActionsViewModel, C254743sy r30, String str, String str2, String str3) {
        String str4;
        String str5;
        Long l;
        XSN xsn;
        Long l2;
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "direct_long_press_message_menu_click");
        MessageActionsViewModel messageActionsViewModel2 = messageActionsViewModel;
        C254743sy r15 = r30;
        String str6 = str;
        if (A0e.isSampled()) {
            DbS.A1J(A0e, "click");
            A0e.AAJ("menu_ui", str2);
            A0e.AAJ("menu_selection", str6);
            C66581MXm.A1H(A0e, messageActionsViewModel2.A0Z);
            if (r30 != null) {
                str5 = C67003Mgb.A01(r15);
            } else {
                str5 = null;
            }
            C66580MXl.A1K(A0e, str5);
            if (r30 != null) {
                l = C67003Mgb.A00(r15);
            } else {
                l = null;
            }
            A0e.A9F("occamadillo_thread_id", l);
            String str7 = messageActionsViewModel2.A0G;
            if (str7 == null) {
                str7 = String.valueOf(messageActionsViewModel2.A07);
            }
            A0e.AAJ(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str7);
            MessageIdentifier messageIdentifier = messageActionsViewModel2.A08;
            A0e.AAJ("message_id", messageIdentifier.A01);
            int i = messageActionsViewModel2.A02;
            XSN[] values = XSN.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    xsn = null;
                    break;
                }
                xsn = values[i2];
                Long valueOf = Long.valueOf(xsn.A00);
                long j = (long) i;
                if (valueOf != null && valueOf.longValue() == j) {
                    break;
                }
                i2++;
            }
            A0e.A8M(xsn, "thread_subtype");
            A0e.AAJ("bot_response_id", messageActionsViewModel2.A0D);
            A0e.AAJ("client_context", messageIdentifier.A00());
            A0e.A8M(xsv, "thread_type");
            A0e.AAJ("media_source", str3);
            if (messageActionsViewModel2.A0P) {
                if (182.A06(0Tu.A05, this.A01, 36323736718749115L)) {
                    String str8 = messageActionsViewModel2.A0H;
                    if (str8 != null) {
                        l2 = AnonymousClass7TE.A10(str8);
                    } else {
                        l2 = null;
                    }
                    A0e.A9F("bot_id", l2);
                    A0e.A8M(C69437Nlh.A02, "message_sender_fbtype");
                }
            }
            A0e.Cgf();
        }
        C71082Ob1 ob1 = C71082Ob1.A00;
        UserSession userSession = this.A01;
        int i3 = messageActionsViewModel2.A02;
        ob1.A03(userSession, r15, Boolean.valueOf(messageActionsViewModel2.A0Z), messageActionsViewModel2.A0B, messageActionsViewModel2.A0A, (Integer) null, (String) null, messageActionsViewModel2.A0H, str6, 25, 0, i3);
        AiStudioLoggingData aiStudioLoggingData2 = aiStudioLoggingData;
        if (aiStudioLoggingData == null) {
            return;
        }
        if (str6.equals("forward") || str6.equals("share")) {
            LTH lth = new LTH(userSession);
            String str9 = aiStudioLoggingData2.A01;
            IGAIAgentType iGAIAgentType = aiStudioLoggingData2.A00;
            if (LTH.A05(iGAIAgentType)) {
                1Ln A002 = LTH.A00(lth);
                if (DbT.A1Y(A002)) {
                    A002.A0l("long_press_message_menu_forward");
                    Long l3 = null;
                    if (str9 != null) {
                        l3 = AnonymousClass7TE.A10(str9);
                    }
                    A002.A0j(l3);
                    if (iGAIAgentType == null || (str4 = iGAIAgentType.A00) == null) {
                        str4 = "";
                    }
                    A002.A0x(AnonymousClass7TF.A0w("agent_type", str4));
                    A002.Cgf();
                }
            }
        }
    }
}

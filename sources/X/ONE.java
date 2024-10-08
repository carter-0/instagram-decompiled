package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.memtransporteventpayload.TransportEvent;
import com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent;
import com.instagram.direct.armadilloexpress.transportpayload.Raven;
import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;
import com.instagram.direct.msys.reverb.ReverbMessage;
import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ONE {
    public final UserSession A00;

    public ONE(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        OSF.A00();
    }

    public final 0eP A00(C331237Qc r7, ReverbMessage reverbMessage, long j, boolean z) {
        0qQ.A0B(reverbMessage, 0);
        0eP A01 = A01(r7, reverbMessage, j, z);
        C254703su r5 = (C254703su) A01.A00;
        Object obj = A01.A01;
        if (r5 != null) {
            Object supplementalKeys = reverbMessage.getSupplementalKeys();
            if (supplementalKeys instanceof ArrayList) {
                List list = (List) supplementalKeys;
                if (list.size() > 1) {
                    C73429PcU.A01(3, list);
                }
                Iterator A1G = AnonymousClass7TE.A1G((AbstractCollection) supplementalKeys);
                while (A1G.hasNext()) {
                    Object next = A1G.next();
                    DbS.A1Y(next);
                    A02(r5, r7, reverbMessage, (String) next);
                }
            }
        }
        return AnonymousClass7TE.A1L(r5, obj);
    }

    public final 0eP A01(C331237Qc r38, ReverbMessage reverbMessage, long j, boolean z) {
        String str;
        int A1S;
        N4L n4l;
        String str2;
        Object obj;
        Exception exc;
        C254703su r0;
        TransportEvent.Event event;
        C69510Nms nms;
        TransportEvent.Event event2;
        C242373Tu r4;
        ReverbMessage reverbMessage2 = reverbMessage;
        0qQ.A0B(reverbMessage2, 0);
        C331237Qc r3 = r38;
        long j2 = j;
        if (reverbMessage2.getToplevelEvent() != null) {
            try {
                byte[] toplevelEvent = reverbMessage2.getToplevelEvent();
                0qQ.A07(toplevelEvent);
                TransportEvent transportEvent = (TransportEvent) R5b.A04(TransportEvent.DEFAULT_INSTANCE, toplevelEvent);
                int i = transportEvent.contentCase_;
                if (AnonymousClass7TF.A1S(i, 2)) {
                    if (i == 2) {
                        event2 = (TransportEvent.Event) transportEvent.content_;
                    } else {
                        event2 = TransportEvent.Event.DEFAULT_INSTANCE;
                    }
                    int i2 = event2.eventCase_;
                    if (C66581MXm.A1V(i2) || AnonymousClass7TF.A1S(i2, 2)) {
                        UserSession userSession = this.A00;
                        AnonymousClass3U9 B34 = 2L2.A00(userSession).B34(j2);
                        if (B34 != null) {
                            r4 = B34.AiM();
                        } else {
                            r4 = null;
                        }
                        if (!C331057Pi.A02(r4) && !C308556Us.A0N(userSession, B34)) {
                            0KC.A0C("ReverbMessageParser", "Security alart isn't enabled");
                            return new 0eP((Object) null, (Object) null);
                        }
                    }
                }
                try {
                    OWL owl = OWL.A00;
                    UserSession userSession2 = this.A00;
                    String senderId = reverbMessage2.getSenderId();
                    0qQ.A07(senderId);
                    Long A10 = AnonymousClass7TE.A10(senderId);
                    String messageId = reverbMessage2.getMessageId();
                    0qQ.A07(messageId);
                    long A0P = AnonymousClass7TE.A0P(reverbMessage2.getTimestampInMs());
                    String str3 = r3.A00.A00;
                    String str4 = null;
                    if (0qQ.A0K(C66581MXm.A0r(userSession2, AnonymousClass0t1.A01), A10)) {
                        str4 = userSession2.A06;
                    } else {
                        Iterator it = r3.A01.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (0qQ.A0K(((User) obj).BST(), A10)) {
                                break;
                            }
                        }
                        User user = (User) obj;
                        if (user != null) {
                            str4 = user.getId();
                        }
                    }
                    if (str4 == null) {
                        0wb.A03("ArmadilloExpressProtobufAdapter", "senderIgid is null");
                        0KC.A0C("ArmadilloExpressProtobufAdapter", "Not able to resolve senderIgid");
                        exc = new Exception("Not able to resolve senderIgid");
                    } else if (str3 != null) {
                        String A04 = C2611348j.A04(messageId, A0P);
                        OIH oih = new OIH((C70621ODs) null, true, AnonymousClass05K.A0j, A04, messageId, str3, str4, (String) null, (String) null, (String) null, j2, C2611348j.A01(A04), false, false, false);
                        int i3 = transportEvent.contentCase_;
                        if (i3 == 1) {
                            TransportEvent.Placeholder placeholder = (TransportEvent.Placeholder) transportEvent.content_;
                            0qQ.A07(placeholder);
                            boolean z2 = true;
                            if ((placeholder.bitField0_ & 1) == 0) {
                                z2 = false;
                            }
                            int i4 = 0;
                            if (z2) {
                                int i5 = placeholder.type_;
                                if (i5 == 1) {
                                    nms = C69510Nms.DECRYPTION_FAILURE;
                                } else if (i5 != 2) {
                                    nms = C69510Nms.DECRYPTION_FAILURE;
                                } else {
                                    nms = C69510Nms.UNAVAILABLE_MESSAGE;
                                }
                                if (nms == C69510Nms.DECRYPTION_FAILURE) {
                                    i4 = -1;
                                } else if (nms == C69510Nms.UNAVAILABLE_MESSAGE) {
                                    i4 = -3;
                                }
                            }
                            r0 = owl.A00(userSession2, oih, i4);
                        } else {
                            if (i3 == 2) {
                                event = (TransportEvent.Event) transportEvent.content_;
                            } else {
                                event = TransportEvent.Event.DEFAULT_INSTANCE;
                            }
                            if (event.eventCase_ == 1) {
                                TransportEvent.Event.DeviceChange deviceChange = (TransportEvent.Event.DeviceChange) event.event_;
                                0qQ.A07(deviceChange);
                                r0 = owl.A01(oih, deviceChange);
                            } else {
                                exc = new Exception("Unsupported transport event type, expected event or placeholder type");
                            }
                        }
                        return AnonymousClass7TE.A1L(r0, (Object) null);
                    } else {
                        0wb.A03("ArmadilloExpressProtobufAdapter", "threadIgid is null");
                        0KC.A0C("ArmadilloExpressProtobufAdapter", "Not able to resolve threadIgId");
                        exc = new Exception("Not able to resolve threadIgId");
                    }
                    throw exc;
                } catch (C69530NnC e) {
                    0KC.A0F("ReverbMessageParser", 002.A0r("Failed to parse transport payload (memThreadId: ", ", otid: ", reverbMessage2.getMessageId(), j2), e);
                    0KC.A0E("ReverbMessageParser", "Failed to parse transport payload");
                    return AnonymousClass7TE.A1L((Object) null, e.getMessage());
                }
            } catch (AnonymousClass5I7 e2) {
                0KC.A0H("ArmadilloExpressProtobufAdapter", "Unable to parse incoming transport event protobuf", e2);
                throw new Exception("Transport event protobuf parsing failure");
            } catch (C69531NnD e3) {
                0KC.A0F("ReverbMessageParser", 002.A0r("Failed to parse transport event (memThreadId: ", ", otid: ", reverbMessage2.getMessageId(), j2), e3);
                0KC.A0J("ReverbMessageParser", "Failed to parse transport event", e3);
                return AnonymousClass7TE.A1L((Object) null, e3.getMessage());
            }
        } else {
            try {
                C71037Oa0 oa0 = C71037Oa0.A00;
                byte[] toplevelPayload = reverbMessage2.getToplevelPayload();
                0qQ.A07(toplevelPayload);
                TransportPayload A002 = C71037Oa0.A00(toplevelPayload);
                int i6 = A002.transportPayloadCase_;
                if (AnonymousClass7TF.A1S(i6, 3) || AnonymousClass7TF.A1S(i6, 2)) {
                    StringBuilder A1A = AnonymousClass7TE.A1A();
                    A1A.append("create supplement/delete as toplevel, messageOtid=");
                    A1A.append(reverbMessage2.getMessageId());
                    A1A.append(" isSupplement=");
                    int i7 = A002.transportPayloadCase_;
                    A1A.append(AnonymousClass7TF.A1S(i7, 3));
                    A1A.append(", isDelete=");
                    A1A.append(AnonymousClass7TF.A1S(i7, 2));
                    0KC.A0C("ReverbMessageParser", A1A.toString());
                    DbT.A1Q(0wj.A01, "use_suppliment_as_toplevel", 817895806);
                    str = "Not a top level payload";
                    return AnonymousClass7TE.A1L((Object) null, str);
                }
                if (reverbMessage2.getThreadTypeTag() == 2) {
                    A1S = 2;
                } else {
                    A1S = AnonymousClass7TF.A1S(reverbMessage2.getThreadTypeTag(), 1);
                }
                if (A002.transportPayloadCase_ == 1) {
                    AddMessageContent addMessageContent = A002.A0L().content_;
                    if (addMessageContent == null) {
                        addMessageContent = AddMessageContent.DEFAULT_INSTANCE;
                    }
                    Raven A0M = addMessageContent.A0L().A0M();
                    0qQ.A07(A0M);
                    C69515Nmx A0L = A0M.A0L();
                    0qQ.A07(A0L);
                    if (A0L == C69515Nmx.RAVEN_VIEW_MODEL_ONCE || A0L == C69515Nmx.RAVEN_VIEW_MODEL_REPLAYABLE) {
                        Object supplementalKeys = reverbMessage2.getSupplementalKeys();
                        TransportPayload transportPayload = null;
                        if (supplementalKeys != null && (supplementalKeys instanceof ArrayList)) {
                            ArrayList A1C = AnonymousClass7TE.A1C();
                            for (Object next : (Iterable) supplementalKeys) {
                                if ((next instanceof String) && (str2 = (String) next) != null && 00l.A0d(str2, "content_view_seen:", false)) {
                                    A1C.add(next);
                                }
                            }
                            byte[] payloadForSupplementalKey = reverbMessage2.getPayloadForSupplementalKey(String.valueOf(00k.A0J(A1C)));
                            if (payloadForSupplementalKey != null) {
                                try {
                                    transportPayload = C71037Oa0.A00(payloadForSupplementalKey);
                                } catch (C69531NnD e4) {
                                    0KC.A0F("ReverbMessageParser", "Skip rebuild of topLevelPayload for raven as supplementalTransportPayload is null", e4);
                                }
                            }
                        }
                        A002 = oa0.A01(transportPayload, A002);
                    }
                }
                try {
                    UserSession userSession3 = this.A00;
                    String senderId2 = reverbMessage2.getSenderId();
                    0qQ.A07(senderId2);
                    Long A102 = AnonymousClass7TE.A10(senderId2);
                    String messageId2 = reverbMessage2.getMessageId();
                    0qQ.A07(messageId2);
                    UserSession userSession4 = userSession3;
                    C254703su A02 = oa0.A02(userSession4, A002, r3, AnonymousClass05K.A0j, A102, messageId2, (String) null, A1S, j2, AnonymousClass7TE.A0P(reverbMessage2.getTimestampInMs()), z);
                    N4L n4l2 = A02.A0D;
                    if (n4l2 != null) {
                        n4l = new N4L((Boolean) n4l2.A03, (Boolean) n4l2.A02, true, n4l2.A06, reverbMessage2.isFromEBServer());
                    } else {
                        n4l = null;
                    }
                    A02.A0w(n4l);
                    return AnonymousClass7TE.A1L(A02, (Object) null);
                } catch (C69530NnC e5) {
                    e = e5;
                    0KC.A0J("ReverbMessageParser", "Failed to create from reverb top level payload", e);
                    str = e.getMessage();
                    return AnonymousClass7TE.A1L((Object) null, str);
                }
            } catch (C69531NnD e6) {
                e = e6;
                StringBuilder A1A2 = AnonymousClass7TE.A1A();
                A1A2.append("Failed to parse transport payload (memThreadId: ");
                A1A2.append(j2);
                A1A2.append(", otid: ");
                A1A2.append(reverbMessage2.getMessageId());
                A1A2.append(", payloadVersion: ");
                A1A2.append(reverbMessage2.getToplevelPayloadVersion());
                0KC.A0F("ReverbMessageParser", AnonymousClass7TG.A0p(A1A2), e);
                str = e.getMessage();
                return AnonymousClass7TE.A1L((Object) null, str);
            }
        }
    }

    public final void A02(C254703su r15, C331237Qc r16, ReverbMessage reverbMessage, String str) {
        C254703su r8 = r15;
        String str2 = str;
        AnonymousClass7TF.A1C(r15, 0, str2);
        ReverbMessage reverbMessage2 = reverbMessage;
        byte[] payloadForSupplementalKey = reverbMessage2.getPayloadForSupplementalKey(str2);
        if (payloadForSupplementalKey == null) {
            0KC.A0D("ReverbMessageParser", "Supplemental payload is null");
            return;
        }
        try {
            C71037Oa0 oa0 = C71037Oa0.A00;
            TransportPayload A002 = C71037Oa0.A00(payloadForSupplementalKey);
            oa0.A04(this.A00, C66580MXl.A0S(A002), r8, r16, 1000 * reverbMessage2.getTimestampInMsForSupplementalKey(str2), C66580MXl.A08(reverbMessage2.getSenderIdForSupplementalKey(str2)));
        } catch (C69531NnD e) {
            0KC.A0F("ReverbMessageParser", "Cannot parse supplemental payload", e);
        }
    }
}

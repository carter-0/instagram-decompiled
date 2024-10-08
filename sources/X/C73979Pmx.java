package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebookpay.logging.LoggingContext;
import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.Reaction;
import com.instagram.direct.armadilloexpress.transportpayload.SupplementMessageContent;
import com.instagram.direct.armadilloexpress.transportpayload.SupplementMessagePayload;
import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;
import com.instagram.direct.request.DirectThreadApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Pmx  reason: case insensitive filesystem */
public final class C73979Pmx extends 0Yg implements 0sP {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;
    public final String A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73979Pmx(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, String str2, int i, long j) {
        super(1);
        this.A00 = i;
        this.A06 = obj;
        this.A01 = j;
        this.A04 = obj2;
        this.A03 = obj3;
        this.A08 = str;
        this.A07 = str2;
        this.A02 = obj4;
        this.A05 = obj5;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ArrayList arrayList;
        Object obj2;
        Reaction reaction;
        Reaction reaction2;
        String str;
        Object obj3 = obj;
        switch (this.A00) {
            case 0:
                1Ln r2 = (1Ln) obj3;
                0bb r4 = new 0bb();
                LoggingContext loggingContext = (LoggingContext) this.A06;
                C51971G9r.A1B(r4, loggingContext);
                0bb r3 = new 0bb();
                r3.A05("credential_id", Long.valueOf(this.A01));
                r3.A01(SUU.A01((C21267XRm) this.A04), "credential_type");
                r4.A07("credential_container", AnonymousClass7TE.A1I(r3));
                List list = (List) this.A03;
                if (list != null) {
                    arrayList = AnonymousClass7TG.A0r(list);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        JTS.A1V(arrayList, it);
                    }
                } else {
                    arrayList = 0sn.A00;
                }
                r4.A07("container_ids", arrayList);
                C66582MXn.A1B(r4, loggingContext);
                r4.A06("view_name", this.A08);
                r4.A06(TraceFieldType.FailureReason, this.A07);
                r4.A07("applied_discounts", (List) this.A02);
                r2.A0N(r4, "event_payload");
                C51969G9p.A1G(r2, this.A05);
                return r2;
            case 1:
                0eP r22 = (0eP) obj3;
                0qQ.A0B(r22, 0);
                C254703su r32 = (C254703su) r22.A00;
                String str2 = (String) r22.A01;
                if (r32 != null) {
                    OTW.A00(r32, this.A07, String.valueOf(((OIH) this.A04).A00), (String) null);
                    C51965G9l.A1W(this.A02, r32);
                    break;
                } else {
                    String A0g = 002.A0g("Target message is not in cache, reverb fetch failed with ", str2, " or it's not the last message in thread. ");
                    OTW otw = (OTW) this.A06;
                    OIH oih = (OIH) this.A04;
                    2Eq r23 = (2Eq) this.A03;
                    String str3 = this.A07;
                    0sP r8 = (0sP) this.A02;
                    SupplementMessagePayload A0S = C66580MXl.A0S((TransportPayload) this.A05);
                    String str4 = A0S.targetMessageWaServerTimeSec_;
                    0qQ.A07(str4);
                    SupplementMessageContent supplementMessageContent = A0S.content_;
                    if (supplementMessageContent == null) {
                        supplementMessageContent = SupplementMessageContent.DEFAULT_INSTANCE;
                    }
                    if (supplementMessageContent.supplementMessageContentCase_ != 1 || str4.length() == 0) {
                        C66584MXp.A16(String.valueOf(oih.A00), str3, 002.A0R(A0g, "Supplemental is not qualified for EB fetch."));
                        r8.invoke((Object) null);
                        break;
                    } else {
                        String A042 = C2611348j.A04(str3, Long.parseLong(str4));
                        UserSession userSession = otw.A00;
                        String str5 = r23.BJy().A00;
                        if (str5 != null) {
                            1OC A0E = DirectThreadApi.A0E(userSession, str5, (String) null, AnonymousClass7TE.A1I(A042), AnonymousClass7TE.A1I(str3));
                            A0E.A00 = new EC9(oih, otw, r8, A0g, str3, 1);
                            1ES.A02(A0E);
                            break;
                        } else {
                            throw AnonymousClass7TE.A0y();
                        }
                    }
                }
            default:
                C254703su r24 = (C254703su) obj3;
                ArrayList A1C = AnonymousClass7TE.A1C();
                if (r24 == null || r24.A0g() == null) {
                    OZM ozm = (OZM) this.A06;
                    OO2 oo2 = ozm.A04;
                    String str6 = this.A08;
                    C71033OZu oZu = oo2.A01;
                    oZu.A02(str6, "build_failed");
                    oZu.A04(str6, 3);
                    0KC.A0C("ArmadilloExpressMessageProcessor", "Message not found in reverb for upsert message payload");
                    ozm.A06.A07(((OIH) this.A03).A07, str6, "Message not found in reverb for upsert message payload", true);
                    C70808OMd oMd = ozm.A05;
                    oMd.A00(str6, (List) null, 7035, 6);
                    oMd.A01(str6, false);
                } else {
                    OZM ozm2 = (OZM) this.A06;
                    OO2 oo22 = ozm2.A04;
                    String str7 = this.A08;
                    oo22.A01.A02(str7, "build_end");
                    OIH oih2 = (OIH) this.A03;
                    String str8 = oih2.A07;
                    r24.A1h = str8;
                    AnonymousClass2Ep r6 = (AnonymousClass2Ep) this.A02;
                    A1C.add(OZM.A01(r24, r6, ozm2));
                    TransportPayload transportPayload = (TransportPayload) this.A05;
                    String str9 = ozm2.A00.A06;
                    String str10 = r24.A1u;
                    0qQ.A07(str10);
                    String str11 = oih2.A0A;
                    0qQ.A0B(transportPayload, 0);
                    if (C66582MXn.A0R(transportPayload).supplementMessageContentCase_ == 1 && str9.equals(str10) && !str9.equals(str11)) {
                        String str12 = this.A07;
                        Iterator it2 = ozm2.A03.Aax(r6.BJy(), false).iterator();
                        while (true) {
                            String str13 = null;
                            if (it2.hasNext()) {
                                obj2 = it2.next();
                                C254703su r14 = (C254703su) obj2;
                                if (r14.A10 == 2FW.A0G) {
                                    C2606546n r33 = r14.A0N;
                                    if (r33 != null) {
                                        str13 = r33.A05;
                                    }
                                    if (0qQ.A0K(str13, str12) && 0qQ.A0K(r14.A1u, str11)) {
                                    }
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        C254703su r1 = (C254703su) obj2;
                        if (r1 != null) {
                            String A0g2 = r1.A0g();
                            String A0f = r1.A0f();
                            if (A0f != null) {
                                A1C.add(new C68979NcA(r6, A0g2, A0f, str11));
                            } else {
                                throw AnonymousClass7TE.A0y();
                            }
                        }
                        SupplementMessageContent A0R = C66582MXn.A0R(transportPayload);
                        if (A0R.supplementMessageContentCase_ == 1) {
                            reaction = (Reaction) A0R.supplementMessageContent_;
                        } else {
                            reaction = Reaction.DEFAULT_INSTANCE;
                        }
                        if (0qQ.A0K(reaction.reactionStatus_, "created")) {
                            long j = this.A01;
                            C254703su r0 = new C254703su();
                            r0.A0a = null;
                            String A043 = C2611348j.A04(str7, j);
                            long A012 = C2611348j.A01(A043);
                            long j2 = oih2.A00;
                            Boolean bool = oih2.A03;
                            Integer num = oih2.A04;
                            OWL.A00.A02(new OIH((C70621ODs) null, bool, num, A043, str7, oih2.A0B, str11, (String) null, str8, (String) null, j2, A012, false, false, false), r0);
                            List list2 = 0sn.A00;
                            C2606546n r11 = new C2606546n((BBV) null, "", (String) null, list2, list2, AnonymousClass7TE.A1I(new AnonymousClass9JK()), true);
                            SupplementMessageContent A0R2 = C66582MXn.A0R(transportPayload);
                            if (A0R2.supplementMessageContentCase_ == 1) {
                                reaction2 = (Reaction) A0R2.supplementMessageContent_;
                            } else {
                                reaction2 = Reaction.DEFAULT_INSTANCE;
                            }
                            if ((reaction2.bitField0_ & 4) != 0) {
                                str = reaction2.emoji_;
                            } else {
                                str = null;
                            }
                            r11.A04 = str;
                            r11.A05 = C69854NtI.A00(transportPayload);
                            r0.A1T = r11;
                            r0.A0N = r11;
                            r0.A10 = 2FW.A0G;
                            if (!r0.A2D) {
                                r0.A2D = true;
                                r0.A2C = true;
                            }
                            A1C.add(0, OZM.A01(r0, r6, ozm2));
                        }
                    }
                }
                ((C70416O5t) this.A04).A00.A0A(A1C);
                break;
        }
        return C60340gF.A00;
    }
}

package com.instagram.rtc.stateprovider;

import X.00k;
import X.0eS;
import X.0qQ;
import X.0sI;
import X.0sn;
import X.1Au;
import X.1Av;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C51974G9v;
import X.C60340gF;
import X.C61034JvY;
import X.C66580MXl;
import X.L2O;
import X.N4R;
import X.N97;
import X.OR1;
import com.facebook.rsys.moderator.gen.ModeratorParticipantCapabilityInfo;
import com.facebook.rsys.moderator.gen.ModeratorSoftMuteModel;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.rtc.rsys.models.EngineModel;
import com.instagram.rtc.rsys.models.IgCallModel;
import com.instagram.rtc.rsys.models.ParticipantModel;
import com.instagram.rtc.statemodel.RtcSettingsParticipant;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.rtc.stateprovider.RtcSettingsProvider$settings$1", f = "RtcSettingsProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class RtcSettingsProvider$settings$1 extends AnonymousClass1Ek implements 0sI {
    public /* synthetic */ Object A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ boolean A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ OR1 A04;
    public final /* synthetic */ boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RtcSettingsProvider$settings$1(UserSession userSession, OR1 or1, AnonymousClass4D7 r4, boolean z) {
        super(5, r4);
        this.A03 = userSession;
        this.A04 = or1;
        this.A05 = z;
    }

    public static void A00(L2O l2o, AbstractCollection abstractCollection, Iterator it) {
        Object next = it.next();
        if (l2o.A00.containsKey(((ParticipantModel) next).userId)) {
            abstractCollection.add(next);
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean A1a = AnonymousClass7TE.A1a(obj4);
        RtcSettingsProvider$settings$1 rtcSettingsProvider$settings$1 = new RtcSettingsProvider$settings$1(this.A03, this.A04, (AnonymousClass4D7) obj5, this.A05);
        rtcSettingsProvider$settings$1.A00 = obj;
        rtcSettingsProvider$settings$1.A01 = obj2;
        rtcSettingsProvider$settings$1.A02 = A1a;
        return rtcSettingsProvider$settings$1.invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Long l;
        IgCallModel igCallModel;
        boolean z2;
        ModeratorSoftMuteModel moderatorSoftMuteModel;
        Map map;
        Object obj2;
        IgCallModel igCallModel2;
        ArrayList arrayList4;
        IgCallModel igCallModel3;
        IgCallModel igCallModel4;
        0eS.A00(obj);
        N4R n4r = (N4R) this.A00;
        L2O l2o = (L2O) this.A01;
        boolean z3 = this.A02;
        EngineModel engineModel = (EngineModel) n4r.A00;
        if (engineModel == null || (igCallModel4 = engineModel.callModel) == null) {
            z = false;
        } else {
            z = igCallModel4.e2eeMandated;
        }
        UserSession userSession = this.A03;
        1Av A002 = 1Au.A00(userSession);
        EngineModel engineModel2 = (EngineModel) n4r.A00;
        if (engineModel2 == null || (igCallModel3 = engineModel2.callModel) == null || (arrayList = igCallModel3.participants) == null) {
            arrayList = 0sn.A00;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : arrayList) {
            if (((ParticipantModel) next).state == 17) {
                A1C.add(next);
            }
        }
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        Iterator it = A1C.iterator();
        while (it.hasNext()) {
            A00(l2o, A1C2, it);
        }
        ArrayList A1C3 = AnonymousClass7TE.A1C();
        Iterator it2 = A1C2.iterator();
        while (it2.hasNext()) {
            ParticipantModel A0n = C66580MXl.A0n(it2);
            String str = A0n.rendererId;
            0qQ.A07(str);
            A1C3.add(OR1.A00((C61034JvY) l2o.A00.get(A0n.userId), str));
        }
        EngineModel engineModel3 = (EngineModel) n4r.A00;
        if (engineModel3 == null || (igCallModel2 = engineModel3.callModel) == null || (arrayList4 = igCallModel2.participants) == null) {
            arrayList2 = AnonymousClass7TE.A1C();
        } else {
            ArrayList A1C4 = AnonymousClass7TE.A1C();
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                Object next2 = it3.next();
                if (((ParticipantModel) next2).state == 7) {
                    A1C4.add(next2);
                }
            }
            arrayList2 = 00k.A0U(A1C4);
        }
        ArrayList A1C5 = AnonymousClass7TE.A1C();
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            A00(l2o, A1C5, it4);
        }
        ArrayList A1C6 = AnonymousClass7TE.A1C();
        Iterator it5 = A1C5.iterator();
        while (it5.hasNext()) {
            ParticipantModel A0n2 = C66580MXl.A0n(it5);
            C61034JvY jvY = (C61034JvY) l2o.A00.get(A0n2.userId);
            String str2 = A0n2.rendererId;
            0qQ.A07(str2);
            RtcSettingsParticipant A003 = OR1.A00(jvY, str2);
            boolean z4 = A0n2.audioEnabled;
            if (!(engineModel3 == null || (moderatorSoftMuteModel = engineModel3.moderatorSoftMuteModel) == null || (map = moderatorSoftMuteModel.conferenceParticipantCapabilities) == null)) {
                if (jvY != null) {
                    obj2 = jvY.A02;
                } else {
                    obj2 = null;
                }
                ModeratorParticipantCapabilityInfo moderatorParticipantCapabilityInfo = (ModeratorParticipantCapabilityInfo) map.get(String.valueOf(obj2));
                if (moderatorParticipantCapabilityInfo != null) {
                    z2 = moderatorParticipantCapabilityInfo.actionCapabilitiesAsParticipant;
                    boolean z5 = A0n2.hasVoiceActivity;
                    String str3 = A003.A04;
                    String str4 = A003.A05;
                    String str5 = A003.A06;
                    String str6 = A003.A03;
                    ImageUrl imageUrl = A003.A01;
                    List list = A003.A07;
                    C51974G9v.A0d(0, str3, str5, str6, imageUrl);
                    0qQ.A0B(list, 7);
                    A1C6.add(new RtcSettingsParticipant(imageUrl, A003.A02, str3, str4, str5, str6, list, A003.A00, z4, z2, z5));
                }
            }
            z2 = false;
            boolean z52 = A0n2.hasVoiceActivity;
            String str32 = A003.A04;
            String str42 = A003.A05;
            String str52 = A003.A06;
            String str62 = A003.A03;
            ImageUrl imageUrl2 = A003.A01;
            List list2 = A003.A07;
            C51974G9v.A0d(0, str32, str52, str62, imageUrl2);
            0qQ.A0B(list2, 7);
            A1C6.add(new RtcSettingsParticipant(imageUrl2, A003.A02, str32, str42, str52, str62, list2, A003.A00, z4, z2, z52));
        }
        EngineModel engineModel4 = (EngineModel) n4r.A00;
        if (engineModel4 == null || (igCallModel = engineModel4.callModel) == null || (arrayList3 = igCallModel.participants) == null) {
            arrayList3 = 0sn.A00;
        }
        ArrayList A1C7 = AnonymousClass7TE.A1C();
        for (Object next3 : arrayList3) {
            int i = ((ParticipantModel) next3).state;
            if (!(i == 17 || i == 18 || i == 19 || i == 20 || i == 21 || i == 22 || i == 7)) {
                A1C7.add(next3);
            }
        }
        ArrayList A1C8 = AnonymousClass7TE.A1C();
        Iterator it6 = A1C7.iterator();
        while (it6.hasNext()) {
            A00(l2o, A1C8, it6);
        }
        ArrayList A1C9 = AnonymousClass7TE.A1C();
        Iterator it7 = A1C8.iterator();
        while (it7.hasNext()) {
            ParticipantModel A0n3 = C66580MXl.A0n(it7);
            C61034JvY jvY2 = (C61034JvY) l2o.A00.get(A0n3.userId);
            String str7 = A0n3.rendererId;
            0qQ.A07(str7);
            RtcSettingsParticipant A004 = OR1.A00(jvY2, str7);
            if (jvY2 != null) {
                l = (Long) jvY2.A02;
            } else {
                l = null;
            }
            String str8 = A004.A04;
            String str9 = A004.A05;
            String str10 = A004.A06;
            String str11 = A004.A03;
            ImageUrl imageUrl3 = A004.A01;
            List list3 = A004.A07;
            C51974G9v.A0d(0, str8, str10, str11, imageUrl3);
            0qQ.A0B(list3, 7);
            A1C9.add(new RtcSettingsParticipant(imageUrl3, l, str8, str9, str10, str11, list3, A004.A00, false, false, false));
        }
        return new N97(A1C3, A1C6, A1C9, z, A002.A23(userSession), A002.A01.getBoolean("in_call_settings_audio_touch_up", true), A002.A22(userSession), this.A05, z3);
    }
}

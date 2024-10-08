package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.rtc.RtcCallKey;
import com.instagram.model.rtc.RtcIgNotification;
import com.instagram.rtc.signaling.models.RtcConnectionEntity;
import com.instagram.video.common.events.IgRtcEventHeader;

public abstract class ABG {
    public static final RtcConnectionEntity A00(C69315NjG njG, RtcConnectionEntity rtcConnectionEntity, String str) {
        RtcConnectionEntity rtcCallGenericConnectionEntity;
        RtcConnectionEntity rtcConnectionEntity2 = rtcConnectionEntity;
        C69315NjG njG2 = njG;
        if (rtcConnectionEntity2 instanceof RtcConnectionEntity.RtcCallConnectionEntity) {
            RtcConnectionEntity.RtcCallConnectionEntity rtcCallConnectionEntity = (RtcConnectionEntity.RtcCallConnectionEntity) rtcConnectionEntity2;
            String str2 = rtcCallConnectionEntity.A0G;
            Integer num = rtcCallConnectionEntity.A08;
            Integer num2 = rtcCallConnectionEntity.A07;
            RtcIgNotification rtcIgNotification = rtcCallConnectionEntity.A04;
            Long l = rtcCallConnectionEntity.A09;
            String str3 = rtcCallConnectionEntity.A0H;
            String str4 = rtcCallConnectionEntity.A0I;
            String str5 = rtcCallConnectionEntity.A0J;
            String str6 = rtcCallConnectionEntity.A0K;
            String str7 = rtcCallConnectionEntity.A0B;
            String str8 = rtcCallConnectionEntity.A0C;
            String str9 = rtcCallConnectionEntity.A0A;
            String str10 = rtcCallConnectionEntity.A0D;
            String str11 = rtcCallConnectionEntity.A0E;
            C69277Nid nid = rtcCallConnectionEntity.A01;
            boolean z = rtcCallConnectionEntity.A0M;
            C69278Nie nie = rtcCallConnectionEntity.A02;
            boolean z2 = rtcCallConnectionEntity.A0L;
            boolean z3 = rtcCallConnectionEntity.A0N;
            IgRtcEventHeader igRtcEventHeader = rtcCallConnectionEntity.A06;
            RtcCallKey rtcCallKey = rtcCallConnectionEntity.A03;
            0qQ.A0B(str2, 1);
            AnonymousClass7TG.A1Q(num, num2);
            AnonymousClass7TF.A1F(str3, 7, str4);
            0qQ.A0B(str7, 11);
            0qQ.A0B(nid, 16);
            0qQ.A0B(nie, 18);
            0qQ.A0B(rtcCallKey, 22);
            rtcCallGenericConnectionEntity = new RtcConnectionEntity.RtcCallConnectionEntity(nid, nie, rtcCallKey, rtcIgNotification, njG2, igRtcEventHeader, num, num2, l, str2, str, str3, str4, str5, str6, str7, str8, str9, str10, str11, z, z2, z3);
        } else if (rtcConnectionEntity2 instanceof RtcConnectionEntity.LiveInviteConnectionEntity) {
            RtcConnectionEntity.LiveInviteConnectionEntity liveInviteConnectionEntity = (RtcConnectionEntity.LiveInviteConnectionEntity) rtcConnectionEntity2;
            String str12 = liveInviteConnectionEntity.A08;
            Integer num3 = liveInviteConnectionEntity.A04;
            Integer num4 = liveInviteConnectionEntity.A03;
            String str13 = liveInviteConnectionEntity.A07;
            RtcIgNotification rtcIgNotification2 = liveInviteConnectionEntity.A01;
            Long l2 = liveInviteConnectionEntity.A05;
            String str14 = liveInviteConnectionEntity.A09;
            String str15 = liveInviteConnectionEntity.A0A;
            String str16 = liveInviteConnectionEntity.A0B;
            String str17 = liveInviteConnectionEntity.A06;
            ImageUrl imageUrl = liveInviteConnectionEntity.A00;
            0qQ.A0B(str12, 1);
            AnonymousClass7TG.A1Q(num3, num4);
            AnonymousClass7TF.A1F(str14, 7, str15);
            0qQ.A0B(str17, 10);
            rtcCallGenericConnectionEntity = new RtcConnectionEntity.LiveInviteConnectionEntity(imageUrl, rtcIgNotification2, njG2, num3, num4, l2, str12, str13, str14, str15, str16, str17);
        } else if (rtcConnectionEntity2 instanceof RtcConnectionEntity.EndCallConnectionEntity) {
            RtcConnectionEntity.EndCallConnectionEntity endCallConnectionEntity = (RtcConnectionEntity.EndCallConnectionEntity) rtcConnectionEntity2;
            String str18 = endCallConnectionEntity.A0C;
            Integer num5 = endCallConnectionEntity.A05;
            Integer num6 = endCallConnectionEntity.A03;
            String str19 = endCallConnectionEntity.A0B;
            RtcIgNotification rtcIgNotification3 = endCallConnectionEntity.A01;
            Long l3 = endCallConnectionEntity.A06;
            String str20 = endCallConnectionEntity.A0D;
            String str21 = endCallConnectionEntity.A0E;
            String str22 = endCallConnectionEntity.A0F;
            String str23 = endCallConnectionEntity.A08;
            String str24 = endCallConnectionEntity.A09;
            String str25 = endCallConnectionEntity.A07;
            String str26 = endCallConnectionEntity.A0A;
            boolean z4 = endCallConnectionEntity.A0H;
            Integer num7 = endCallConnectionEntity.A04;
            C69277Nid nid2 = endCallConnectionEntity.A00;
            boolean z5 = endCallConnectionEntity.A0G;
            0qQ.A0B(str18, 1);
            AnonymousClass7TG.A1Q(num5, num6);
            AnonymousClass7TF.A1F(str20, 7, str21);
            0qQ.A0B(nid2, 16);
            rtcCallGenericConnectionEntity = new RtcConnectionEntity.EndCallConnectionEntity(nid2, rtcIgNotification3, njG2, num5, num6, num7, l3, str18, str19, str20, str21, str22, str23, str24, str25, str26, z4, z5);
        } else if (rtcConnectionEntity2 instanceof RtcConnectionEntity.RtcCallGenericConnectionEntity) {
            RtcConnectionEntity.RtcCallGenericConnectionEntity rtcCallGenericConnectionEntity2 = (RtcConnectionEntity.RtcCallGenericConnectionEntity) rtcConnectionEntity2;
            String str27 = rtcCallGenericConnectionEntity2.A06;
            Integer num8 = rtcCallGenericConnectionEntity2.A03;
            Integer num9 = rtcCallGenericConnectionEntity2.A02;
            String str28 = rtcCallGenericConnectionEntity2.A05;
            RtcIgNotification rtcIgNotification4 = rtcCallGenericConnectionEntity2.A00;
            Long l4 = rtcCallGenericConnectionEntity2.A04;
            String str29 = rtcCallGenericConnectionEntity2.A07;
            String str30 = rtcCallGenericConnectionEntity2.A08;
            String str31 = rtcCallGenericConnectionEntity2.A09;
            0qQ.A0B(str27, 1);
            AnonymousClass7TG.A1Q(num8, num9);
            AnonymousClass7TF.A1F(str29, 7, str30);
            rtcCallGenericConnectionEntity = new RtcConnectionEntity.RtcCallGenericConnectionEntity(rtcIgNotification4, njG2, num8, num9, l4, str27, str28, str29, str30, str31);
        } else {
            throw AnonymousClass7TE.A1K();
        }
        return rtcCallGenericConnectionEntity;
    }

    public static final RtcConnectionEntity A01(RtcConnectionEntity rtcConnectionEntity, Long l) {
        RtcConnectionEntity rtcCallGenericConnectionEntity;
        RtcConnectionEntity rtcConnectionEntity2 = rtcConnectionEntity;
        0qQ.A0B(rtcConnectionEntity2, 0);
        Long l2 = l;
        if (rtcConnectionEntity2 instanceof RtcConnectionEntity.RtcCallConnectionEntity) {
            RtcConnectionEntity.RtcCallConnectionEntity rtcCallConnectionEntity = (RtcConnectionEntity.RtcCallConnectionEntity) rtcConnectionEntity2;
            C69315NjG njG = rtcCallConnectionEntity.A05;
            String str = rtcCallConnectionEntity.A0G;
            Integer num = rtcCallConnectionEntity.A08;
            Integer num2 = rtcCallConnectionEntity.A07;
            String str2 = rtcCallConnectionEntity.A0F;
            RtcIgNotification rtcIgNotification = rtcCallConnectionEntity.A04;
            String str3 = rtcCallConnectionEntity.A0H;
            String str4 = rtcCallConnectionEntity.A0I;
            String str5 = rtcCallConnectionEntity.A0J;
            String str6 = rtcCallConnectionEntity.A0K;
            String str7 = rtcCallConnectionEntity.A0B;
            String str8 = rtcCallConnectionEntity.A0C;
            String str9 = rtcCallConnectionEntity.A0A;
            String str10 = rtcCallConnectionEntity.A0D;
            String str11 = rtcCallConnectionEntity.A0E;
            C69277Nid nid = rtcCallConnectionEntity.A01;
            boolean z = rtcCallConnectionEntity.A0M;
            C69278Nie nie = rtcCallConnectionEntity.A02;
            boolean z2 = rtcCallConnectionEntity.A0L;
            boolean z3 = rtcCallConnectionEntity.A0N;
            IgRtcEventHeader igRtcEventHeader = rtcCallConnectionEntity.A06;
            RtcCallKey rtcCallKey = rtcCallConnectionEntity.A03;
            0qQ.A0B(njG, 0);
            AnonymousClass7TG.A1U(str, num, num2);
            AnonymousClass7TF.A1F(str3, 7, str4);
            0qQ.A0B(str7, 11);
            0qQ.A0B(nid, 16);
            0qQ.A0B(nie, 18);
            0qQ.A0B(rtcCallKey, 22);
            rtcCallGenericConnectionEntity = new RtcConnectionEntity.RtcCallConnectionEntity(nid, nie, rtcCallKey, rtcIgNotification, njG, igRtcEventHeader, num, num2, l2, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, z, z2, z3);
        } else if (rtcConnectionEntity2 instanceof RtcConnectionEntity.LiveInviteConnectionEntity) {
            RtcConnectionEntity.LiveInviteConnectionEntity liveInviteConnectionEntity = (RtcConnectionEntity.LiveInviteConnectionEntity) rtcConnectionEntity2;
            C69315NjG njG2 = liveInviteConnectionEntity.A02;
            String str12 = liveInviteConnectionEntity.A08;
            Integer num3 = liveInviteConnectionEntity.A04;
            Integer num4 = liveInviteConnectionEntity.A03;
            String str13 = liveInviteConnectionEntity.A07;
            RtcIgNotification rtcIgNotification2 = liveInviteConnectionEntity.A01;
            String str14 = liveInviteConnectionEntity.A09;
            String str15 = liveInviteConnectionEntity.A0A;
            String str16 = liveInviteConnectionEntity.A0B;
            String str17 = liveInviteConnectionEntity.A06;
            ImageUrl imageUrl = liveInviteConnectionEntity.A00;
            0qQ.A0B(njG2, 0);
            AnonymousClass7TG.A1U(str12, num3, num4);
            AnonymousClass7TF.A1F(str14, 7, str15);
            0qQ.A0B(str17, 10);
            rtcCallGenericConnectionEntity = new RtcConnectionEntity.LiveInviteConnectionEntity(imageUrl, rtcIgNotification2, njG2, num3, num4, l2, str12, str13, str14, str15, str16, str17);
        } else if (rtcConnectionEntity2 instanceof RtcConnectionEntity.EndCallConnectionEntity) {
            RtcConnectionEntity.EndCallConnectionEntity endCallConnectionEntity = (RtcConnectionEntity.EndCallConnectionEntity) rtcConnectionEntity2;
            C69315NjG njG3 = endCallConnectionEntity.A02;
            String str18 = endCallConnectionEntity.A0C;
            Integer num5 = endCallConnectionEntity.A05;
            Integer num6 = endCallConnectionEntity.A03;
            String str19 = endCallConnectionEntity.A0B;
            RtcIgNotification rtcIgNotification3 = endCallConnectionEntity.A01;
            String str20 = endCallConnectionEntity.A0D;
            String str21 = endCallConnectionEntity.A0E;
            String str22 = endCallConnectionEntity.A0F;
            String str23 = endCallConnectionEntity.A08;
            String str24 = endCallConnectionEntity.A09;
            String str25 = endCallConnectionEntity.A07;
            String str26 = endCallConnectionEntity.A0A;
            boolean z4 = endCallConnectionEntity.A0H;
            Integer num7 = endCallConnectionEntity.A04;
            C69277Nid nid2 = endCallConnectionEntity.A00;
            boolean z5 = endCallConnectionEntity.A0G;
            0qQ.A0B(njG3, 0);
            AnonymousClass7TG.A1U(str18, num5, num6);
            AnonymousClass7TF.A1F(str20, 7, str21);
            0qQ.A0B(nid2, 16);
            rtcCallGenericConnectionEntity = new RtcConnectionEntity.EndCallConnectionEntity(nid2, rtcIgNotification3, njG3, num5, num6, num7, l2, str18, str19, str20, str21, str22, str23, str24, str25, str26, z4, z5);
        } else if (rtcConnectionEntity2 instanceof RtcConnectionEntity.RtcCallGenericConnectionEntity) {
            RtcConnectionEntity.RtcCallGenericConnectionEntity rtcCallGenericConnectionEntity2 = (RtcConnectionEntity.RtcCallGenericConnectionEntity) rtcConnectionEntity2;
            C69315NjG njG4 = rtcCallGenericConnectionEntity2.A01;
            String str27 = rtcCallGenericConnectionEntity2.A06;
            Integer num8 = rtcCallGenericConnectionEntity2.A03;
            Integer num9 = rtcCallGenericConnectionEntity2.A02;
            String str28 = rtcCallGenericConnectionEntity2.A05;
            RtcIgNotification rtcIgNotification4 = rtcCallGenericConnectionEntity2.A00;
            String str29 = rtcCallGenericConnectionEntity2.A07;
            String str30 = rtcCallGenericConnectionEntity2.A08;
            String str31 = rtcCallGenericConnectionEntity2.A09;
            0qQ.A0B(njG4, 0);
            AnonymousClass7TG.A1U(str27, num8, num9);
            AnonymousClass7TF.A1F(str29, 7, str30);
            rtcCallGenericConnectionEntity = new RtcConnectionEntity.RtcCallGenericConnectionEntity(rtcIgNotification4, njG4, num8, num9, l2, str27, str28, str29, str30, str31);
        } else {
            throw AnonymousClass7TE.A1K();
        }
        return rtcCallGenericConnectionEntity;
    }
}

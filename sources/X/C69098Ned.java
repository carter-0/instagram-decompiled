package X;

import com.facebook.rsys.mediastats.gen.MediaStats;
import com.facebook.rsys.mediastats.gen.VideoStreamStats;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Ned  reason: case insensitive filesystem */
public final class C69098Ned extends C71135OdY {
    public int A00;
    public N9L A01;
    public String A02;
    public final C71111Ocu A03;
    public final PMC A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69098Ned(C71111Ocu ocu, PMC pmc) {
        super(DbS.A0z(N9L.class));
        0qQ.A0B(ocu, 2);
        this.A04 = pmc;
        this.A03 = ocu;
        pmc.A00 = new C72724PHe(this);
    }

    public static final List A00(C69098Ned ned) {
        OGS ogs;
        String[] strArr;
        String str;
        C69098Ned ned2 = ned;
        N9L n9l = ned2.A01;
        ArrayList arrayList = null;
        if (n9l == null) {
            0qQ.A0F("boundModel");
            throw AnonymousClass00P.createAndThrow();
        }
        List list = n9l.A02;
        if (!(list == null || (ogs = (OGS) 00k.A0O(list, ned2.A00)) == null)) {
            MediaStats mediaStats = ogs.A00;
            String str2 = ogs.A01;
            String str3 = ogs.A03;
            String str4 = ogs.A04;
            String A0R = 002.A0R("streamId=", mediaStats.streamId);
            String A0R2 = 002.A0R("userId=", mediaStats.userId);
            String A0R3 = 002.A0R("channelType=", str2);
            String A0R4 = 002.A0R("streamDirection=", str3);
            String A0R5 = 002.A0R("streamType=", str4);
            String A0R6 = 002.A0R("mimeType=", mediaStats.mimeType);
            String A0R7 = 002.A0R("audioSsrc=", mediaStats.audioSsrc);
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("audioEstimatedPlayoutTimestampMS=");
            String A0i = AnonymousClass7TF.A0i(mediaStats.audioEstimatedPlayoutTimestampMS, A1A);
            StringBuilder A1A2 = AnonymousClass7TE.A1A();
            A1A2.append("audioSamplingRateKhz=");
            String A0i2 = AnonymousClass7TF.A0i(mediaStats.audioSamplingRateKhz, A1A2);
            StringBuilder A1A3 = AnonymousClass7TE.A1A();
            A1A3.append("audioE2eDelayMS=");
            String A0i3 = AnonymousClass7TF.A0i(mediaStats.audioE2eDelayMS, A1A3);
            String A0R8 = 002.A0R("audioCodec=", mediaStats.audioCodec);
            StringBuilder A1A4 = AnonymousClass7TE.A1A();
            A1A4.append("audioBitrateKbps=");
            String A0i4 = AnonymousClass7TF.A0i(mediaStats.audioBitrateKbps, A1A4);
            StringBuilder A1A5 = AnonymousClass7TE.A1A();
            A1A5.append("audioTargetBitrateKbps=");
            String A0i5 = AnonymousClass7TF.A0i(mediaStats.audioTargetBitrateKbps, A1A5);
            StringBuilder A1A6 = AnonymousClass7TE.A1A();
            A1A6.append("audioBytesReceived=");
            String A0i6 = AnonymousClass7TF.A0i(mediaStats.audioBytesReceived, A1A6);
            StringBuilder A1A7 = AnonymousClass7TE.A1A();
            A1A7.append("audioBytesSent=");
            String A0i7 = AnonymousClass7TF.A0i(mediaStats.audioBytesSent, A1A7);
            StringBuilder A1A8 = AnonymousClass7TE.A1A();
            A1A8.append("audioPacketsReceived=");
            String A0i8 = AnonymousClass7TF.A0i(mediaStats.audioPacketsReceived, A1A8);
            StringBuilder A1A9 = AnonymousClass7TE.A1A();
            A1A9.append("audioPacketsLost=");
            String A0i9 = AnonymousClass7TF.A0i(mediaStats.audioPacketsLost, A1A9);
            StringBuilder A1A10 = AnonymousClass7TE.A1A();
            A1A10.append("audioFecPacketsReceived=");
            String A0i10 = AnonymousClass7TF.A0i(mediaStats.audioFecPacketsReceived, A1A10);
            StringBuilder A1A11 = AnonymousClass7TE.A1A();
            A1A11.append("audioNackCount=");
            String A0i11 = AnonymousClass7TF.A0i(mediaStats.audioNackCount, A1A11);
            StringBuilder A1A12 = AnonymousClass7TE.A1A();
            A1A12.append("audioRetransmittedPacketsSent=");
            String A0i12 = AnonymousClass7TF.A0i(mediaStats.audioRetransmittedPacketsSent, A1A12);
            StringBuilder A1A13 = AnonymousClass7TE.A1A();
            A1A13.append("audioJitterMS=");
            String A0i13 = AnonymousClass7TF.A0i(mediaStats.audioJitterMS, A1A13);
            StringBuilder A1A14 = AnonymousClass7TE.A1A();
            A1A14.append("concealedSamples=");
            String A0i14 = AnonymousClass7TF.A0i(mediaStats.concealedSamples, A1A14);
            StringBuilder A1A15 = AnonymousClass7TE.A1A();
            A1A15.append("totalSamplesReceived=");
            String A0i15 = AnonymousClass7TF.A0i(mediaStats.totalSamplesReceived, A1A15);
            StringBuilder A1A16 = AnonymousClass7TE.A1A();
            A1A16.append("audioLevel=");
            ArrayList A1L = 0sr.A1L(new String[]{A0R, A0R2, A0R3, A0R4, A0R5, A0R6, A0R7, A0i, A0i2, A0i3, A0R8, A0i4, A0i5, A0i6, A0i7, A0i8, A0i9, A0i10, A0i11, A0i12, A0i13, A0i14, A0i15, AnonymousClass7TF.A0i(mediaStats.audioLevel, A1A16)});
            ArrayList arrayList2 = mediaStats.videoStreams;
            0qQ.A06(arrayList2);
            VideoStreamStats videoStreamStats = (VideoStreamStats) 00k.A0J(arrayList2);
            if (videoStreamStats != null) {
                Class<?> cls = videoStreamStats.getClass();
                0qQ.A0B(cls, 0);
                Map map = 0Yh.A03;
                String A012 = 0q1.A01(cls);
                String A0g = 002.A0g(A012, "::ssrc=", videoStreamStats.ssrc);
                StringBuilder A0n = AnonymousClass7TF.A0n(A012);
                A0n.append("::frameWidth=");
                String A0i16 = AnonymousClass7TF.A0i(videoStreamStats.frameWidth, A0n);
                StringBuilder A0n2 = AnonymousClass7TF.A0n(A012);
                A0n2.append("::frameHeight=");
                String A0i17 = AnonymousClass7TF.A0i(videoStreamStats.frameHeight, A0n2);
                StringBuilder A0n3 = AnonymousClass7TF.A0n(A012);
                A0n3.append("::bitrateKbps=");
                String A0i18 = AnonymousClass7TF.A0i(videoStreamStats.bitrateKbps, A0n3);
                StringBuilder A0n4 = AnonymousClass7TF.A0n(A012);
                A0n4.append("::bytesSent=");
                String A0i19 = AnonymousClass7TF.A0i(videoStreamStats.bytesSent, A0n4);
                StringBuilder A0n5 = AnonymousClass7TF.A0n(A012);
                A0n5.append("::bytesReceived=");
                String A0i20 = AnonymousClass7TF.A0i(videoStreamStats.bytesReceived, A0n5);
                StringBuilder A0n6 = AnonymousClass7TF.A0n(A012);
                A0n6.append("::retransmittedPacketsSent=");
                String A0i21 = AnonymousClass7TF.A0i(videoStreamStats.retransmittedPacketsSent, A0n6);
                StringBuilder A0n7 = AnonymousClass7TF.A0n(A012);
                A0n7.append("::framesEncoded=");
                String A0i22 = AnonymousClass7TF.A0i(videoStreamStats.framesEncoded, A0n7);
                StringBuilder A0n8 = AnonymousClass7TF.A0n(A012);
                A0n8.append("::framesEncodedPerSecond=");
                String A0i23 = AnonymousClass7TF.A0i(videoStreamStats.framesEncodedPerSecond, A0n8);
                StringBuilder A0n9 = AnonymousClass7TF.A0n(A012);
                A0n9.append("::framesDecoded=");
                String A0i24 = AnonymousClass7TF.A0i(videoStreamStats.framesDecoded, A0n9);
                StringBuilder A0n10 = AnonymousClass7TF.A0n(A012);
                A0n10.append("::framesDecodedPerSecond=");
                String A0i25 = AnonymousClass7TF.A0i(videoStreamStats.framesDecodedPerSecond, A0n10);
                String A0g2 = 002.A0g(A012, "::codec=", videoStreamStats.codec);
                StringBuilder A0n11 = AnonymousClass7TF.A0n(A012);
                A0n11.append("::e2eDelayMS=");
                String A0i26 = AnonymousClass7TF.A0i(videoStreamStats.e2eDelayMS, A0n11);
                StringBuilder A0n12 = AnonymousClass7TF.A0n(A012);
                A0n12.append("::nackCount=");
                String A0i27 = AnonymousClass7TF.A0i(videoStreamStats.nackCount, A0n12);
                StringBuilder A0n13 = AnonymousClass7TF.A0n(A012);
                A0n13.append("::jitterMS=");
                String A0i28 = AnonymousClass7TF.A0i(videoStreamStats.jitterMS, A0n13);
                StringBuilder A0n14 = AnonymousClass7TF.A0n(A012);
                A0n14.append("::packetsReceived=");
                String A0i29 = AnonymousClass7TF.A0i(videoStreamStats.packetsReceived, A0n14);
                StringBuilder A0n15 = AnonymousClass7TF.A0n(A012);
                A0n15.append("::packetsLost=");
                String A0i30 = AnonymousClass7TF.A0i(videoStreamStats.packetsLost, A0n15);
                StringBuilder A0n16 = AnonymousClass7TF.A0n(A012);
                A0n16.append("::fecPacketsReceived=");
                String A0i31 = AnonymousClass7TF.A0i(videoStreamStats.fecPacketsReceived, A0n16);
                StringBuilder A0n17 = AnonymousClass7TF.A0n(A012);
                A0n17.append("::totalEncodeTime=");
                String A0i32 = AnonymousClass7TF.A0i(videoStreamStats.totalEncodeTime, A0n17);
                StringBuilder A0n18 = AnonymousClass7TF.A0n(A012);
                A0n18.append("::targetBitrateKbps=");
                strArr = new String[]{A0g, A0i16, A0i17, A0i18, A0i19, A0i20, A0i21, A0i22, A0i23, A0i24, A0i25, A0g2, A0i26, A0i27, A0i28, A0i29, A0i30, A0i31, A0i32, AnonymousClass7TF.A0i(videoStreamStats.targetBitrateKbps, A0n18)};
            } else {
                strArr = new String[]{AnonymousClass7TG.A0m(arrayList2, "videoStreams=", AnonymousClass7TE.A1A())};
            }
            ArrayList A0S = 00k.A0S(0sr.A1L(strArr), A1L);
            arrayList = AnonymousClass7TE.A1C();
            Iterator it = A0S.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                String lowerCase = ((String) next).toLowerCase();
                0qQ.A07(lowerCase);
                String str5 = ned2.A02;
                if (str5 != null) {
                    str = str5.toLowerCase();
                    0qQ.A07(str);
                } else {
                    str = "";
                }
                if (DbU.A1a(lowerCase, str)) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }
}

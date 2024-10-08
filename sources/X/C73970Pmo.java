package X;

import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationAdditionalEffectInfo;
import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationApi;
import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationSharedEffectInfo;

/* renamed from: X.Pmo  reason: case insensitive filesystem */
public final class C73970Pmo extends 0Yg implements 0sP {
    public final int A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73970Pmo(String str, String str2, String str3, String str4, String str5, int i, long j) {
        super(1);
        this.A00 = i;
        this.A01 = j;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A06 = str4;
        this.A02 = str5;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A00 != 0) {
            NCZ ncz = (NCZ) obj;
            0qQ.A0B(ncz, 0);
            NDr nDr = ncz.A06;
            long j = this.A01;
            String str = this.A03;
            String str2 = this.A04;
            String str3 = this.A05;
            String str4 = this.A06;
            String str5 = this.A02;
            0qQ.A0B(str3, 3);
            VideoEffectCommunicationApi videoEffectCommunicationApi = nDr.A00;
            if (videoEffectCommunicationApi != null) {
                videoEffectCommunicationApi.sendGroupEffect(new VideoEffectCommunicationSharedEffectInfo(j, str, str2, str3, str4, str5, false, false, false, 1, (VideoEffectCommunicationAdditionalEffectInfo) null));
            }
        } else {
            C63010xe r15 = (C63010xe) obj;
            0qQ.A0B(r15, 0);
            String str6 = this.A06;
            0qQ.A0B(str6, 0);
            C262294Dd r3 = r15.A00;
            r3.E5f("last_navigation_source", str6);
            String str7 = this.A04;
            0qQ.A0B(str7, 0);
            r3.E5f("last_navigation_destination", str7);
            String str8 = this.A05;
            0qQ.A0B(str8, 0);
            r3.E5f("last_navigation_fragment_classname", str8);
            r3.E5b("last_navigation_timestamp", this.A01);
            String str9 = this.A02;
            0qQ.A0B(str9, 0);
            r3.E5f("last_navigation_history", str9);
            String str10 = this.A03;
            0qQ.A0B(str10, 0);
            r3.E5f(AnonymousClass000.A00(3489), str10);
        }
        return C60340gF.A00;
    }
}

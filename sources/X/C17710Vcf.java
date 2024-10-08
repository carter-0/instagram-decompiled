package X;

import com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf;
import com.instagram.api.schemas.OnFeedMessagesIntf;
import com.instagram.api.schemas.PrivacyDisclosureInfo;
import com.instagram.api.schemas.SocialProofInfo;
import com.instagram.api.schemas.WhatsAppAttributionInfo;

/* renamed from: X.Vcf  reason: case insensitive filesystem */
public class C17710Vcf {
    public OnFeedMessagesIntf A00;
    public PrivacyDisclosureInfo A01;
    public SocialProofInfo A02;
    public WhatsAppAttributionInfo A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public Boolean A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public final IGCTMessagingAdsInfoDictIntf A0C;

    public C17710Vcf(IGCTMessagingAdsInfoDictIntf iGCTMessagingAdsInfoDictIntf) {
        this.A0C = iGCTMessagingAdsInfoDictIntf;
        this.A08 = iGCTMessagingAdsInfoDictIntf.BEr();
        this.A04 = iGCTMessagingAdsInfoDictIntf.COE();
        this.A05 = iGCTMessagingAdsInfoDictIntf.CSD();
        this.A00 = iGCTMessagingAdsInfoDictIntf.BTY();
        this.A09 = iGCTMessagingAdsInfoDictIntf.BaD();
        this.A01 = iGCTMessagingAdsInfoDictIntf.Bfm();
        this.A0A = iGCTMessagingAdsInfoDictIntf.Bnt();
        this.A0B = iGCTMessagingAdsInfoDictIntf.BqY();
        this.A06 = iGCTMessagingAdsInfoDictIntf.BuH();
        this.A07 = iGCTMessagingAdsInfoDictIntf.Buu();
        this.A02 = iGCTMessagingAdsInfoDictIntf.BxZ();
        this.A03 = iGCTMessagingAdsInfoDictIntf.CGQ();
    }
}

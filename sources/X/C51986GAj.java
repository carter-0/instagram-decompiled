package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ImmutablePandoIntentAwareAdsInfo;
import com.instagram.api.schemas.IntentAwareAdsFormatInfo;
import com.instagram.api.schemas.IntentAwareAdsFormatInfoImpl;
import com.instagram.api.schemas.IntentAwareAdsInfo;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;

/* renamed from: X.GAj  reason: case insensitive filesystem */
public final class C51986GAj {
    public IntentAwareAdsFormatInfo A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public final IntentAwareAdsInfoIntf A0A;

    public final IntentAwareAdsInfoIntf A00() {
        IntentAwareAdsFormatInfoImpl intentAwareAdsFormatInfoImpl;
        Object intentAwareAdsInfo;
        TreeUpdaterJNI treeUpdaterJNI;
        IntentAwareAdsInfoIntf intentAwareAdsInfoIntf = this.A0A;
        if (intentAwareAdsInfoIntf instanceof ImmutablePandoIntentAwareAdsInfo) {
            TreeUpdaterJNI treeUpdaterJNI2 = TreeUpdaterJNI.$redex_init_class;
            IntentAwareAdsFormatInfo intentAwareAdsFormatInfo = this.A00;
            if (intentAwareAdsFormatInfo != null) {
                treeUpdaterJNI = intentAwareAdsFormatInfo.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            intentAwareAdsInfo = C41847B3o.A0o(intentAwareAdsInfoIntf, new 0eP[]{AnonymousClass7TE.A1L("format_info", treeUpdaterJNI), AnonymousClass7TE.A1L("insertion_mechanism", this.A04), AnonymousClass7TE.A1L("is_seed_ad_eligible", this.A01), AnonymousClass7TE.A1L("multi_ads_first_ad_id", this.A05), AnonymousClass7TE.A1L("multi_ads_type", this.A02), AnonymousClass7TE.A1L("multi_ads_unit_id", this.A06), AnonymousClass7TE.A1L("seed_ad_id", this.A07), AnonymousClass7TE.A1L("seed_ad_position", this.A03), AnonymousClass7TE.A1L("seed_ad_token", this.A08), AnonymousClass7TE.A1L("trigger_type", this.A09)});
        } else {
            IntentAwareAdsFormatInfo intentAwareAdsFormatInfo2 = this.A00;
            if (intentAwareAdsFormatInfo2 != null) {
                intentAwareAdsFormatInfoImpl = intentAwareAdsFormatInfo2.F5E();
            } else {
                intentAwareAdsFormatInfoImpl = null;
            }
            String str = this.A04;
            Boolean bool = this.A01;
            String str2 = this.A05;
            intentAwareAdsInfo = new IntentAwareAdsInfo(intentAwareAdsFormatInfoImpl, bool, this.A02, this.A03, str, str2, this.A06, this.A07, this.A08, this.A09);
        }
        return (IntentAwareAdsInfoIntf) intentAwareAdsInfo;
    }

    public C51986GAj(IntentAwareAdsInfo intentAwareAdsInfo) {
        this.A0A = intentAwareAdsInfo;
        this.A00 = intentAwareAdsInfo.B7S();
        this.A04 = intentAwareAdsInfo.BHg();
        this.A01 = intentAwareAdsInfo.CbN();
        this.A05 = intentAwareAdsInfo.BUR();
        this.A02 = intentAwareAdsInfo.BUY();
        this.A06 = intentAwareAdsInfo.BUa();
        this.A07 = intentAwareAdsInfo.Br2();
        this.A03 = intentAwareAdsInfo.Br3();
        this.A08 = intentAwareAdsInfo.Br4();
        this.A09 = intentAwareAdsInfo.C9y();
    }
}

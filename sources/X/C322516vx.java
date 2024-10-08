package X;

import com.instagram.aistudio.profile.model.AiStudioProfileBannerModel;
import com.instagram.fanclub.intf.FanClubGuidedActivationProfileBannerParams;
import com.instagram.fanclub.intf.UserPayFanclubUpsellParams;
import com.instagram.sponsored.analytics.SourceModelInfoParams;
import com.instagram.user.model.User;

/* renamed from: X.6vx  reason: invalid class name and case insensitive filesystem */
public final class C322516vx {
    public int A00;
    public AnonymousClass9J4 A01;
    public AiStudioProfileBannerModel A02;
    public C279864zZ A03;
    public C322126vI A04;
    public C3034368u A05;
    public FanClubGuidedActivationProfileBannerParams A06;
    public UserPayFanclubUpsellParams A07;
    public 1Xj A08;
    public JVM A09;
    public C234502xy A0A;
    public C48247EbS A0B;
    public C319896rP A0C;
    public SourceModelInfoParams A0D;
    public User A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        User user = this.A0E;
        int i13 = 0;
        if (user != null) {
            i = user.hashCode();
        } else {
            i = 0;
        }
        int i14 = ((((i * 31) + (this.A0K ? 1 : 0)) * 31) + this.A00) * 31 * 31;
        1Xj r0 = this.A08;
        if (r0 != null) {
            i2 = r0.hashCode();
        } else {
            i2 = 0;
        }
        int i15 = (i14 + i2) * 31;
        SourceModelInfoParams sourceModelInfoParams = this.A0D;
        if (sourceModelInfoParams != null) {
            i3 = sourceModelInfoParams.hashCode();
        } else {
            i3 = 0;
        }
        int i16 = (i15 + i3) * 31;
        C319896rP r02 = this.A0C;
        if (r02 != null) {
            i4 = r02.hashCode();
        } else {
            i4 = 0;
        }
        int i17 = (i16 + i4) * 31;
        C322126vI r03 = this.A04;
        if (r03 != null) {
            i5 = r03.hashCode();
        } else {
            i5 = 0;
        }
        int i18 = (i17 + i5) * 31;
        AnonymousClass9J4 r04 = this.A01;
        if (r04 != null) {
            i6 = r04.hashCode();
        } else {
            i6 = 0;
        }
        int i19 = (i18 + i6) * 31;
        C48247EbS ebS = this.A0B;
        if (ebS != null) {
            i7 = ebS.hashCode();
        } else {
            i7 = 0;
        }
        int i20 = (((i19 + i7) * 31) + (this.A0J ? 1 : 0)) * 31;
        String str = this.A0H;
        if (str != null) {
            i8 = str.hashCode();
        } else {
            i8 = 0;
        }
        int i21 = (i20 + i8) * 31;
        String str2 = this.A0G;
        if (str2 != null) {
            i9 = str2.hashCode();
        } else {
            i9 = 0;
        }
        int i22 = (i21 + i9) * 31;
        String str3 = this.A0F;
        if (str3 != null) {
            i10 = str3.hashCode();
        } else {
            i10 = 0;
        }
        int i23 = (i22 + i10) * 31;
        UserPayFanclubUpsellParams userPayFanclubUpsellParams = this.A07;
        if (userPayFanclubUpsellParams != null) {
            i11 = userPayFanclubUpsellParams.hashCode();
        } else {
            i11 = 0;
        }
        int i24 = (i23 + i11) * 31;
        C3034368u r05 = this.A05;
        if (r05 != null) {
            i12 = r05.hashCode();
        } else {
            i12 = 0;
        }
        int i25 = (i24 + i12) * 31;
        AiStudioProfileBannerModel aiStudioProfileBannerModel = this.A02;
        if (aiStudioProfileBannerModel != null) {
            i13 = aiStudioProfileBannerModel.hashCode();
        }
        return ((((i25 + i13) * 31) + (this.A0M ? 1 : 0)) * 31) + (this.A0I ? 1 : 0);
    }
}

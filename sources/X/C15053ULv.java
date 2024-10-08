package X;

import com.instagram.api.schemas.AdGeoLocationType;
import com.instagram.api.schemas.AdvantageAudienceData;
import com.instagram.api.schemas.TargetingRelaxationConstants;
import com.instagram.business.promote.model.AudienceGeoLocation;
import com.instagram.business.promote.model.PromoteAudienceInfo;
import java.util.List;

/* renamed from: X.ULv  reason: case insensitive filesystem */
public final class C15053ULv extends AnonymousClass0T0 {
    public int A00 = 0;
    public int A01 = 0;
    public AdvantageAudienceData A02 = null;
    public TargetingRelaxationConstants A03 = null;
    public String A04 = null;
    public String A05 = null;
    public List A06 = null;
    public List A07 = null;
    public List A08 = null;
    public boolean A09 = false;

    public C15053ULv(PromoteAudienceInfo promoteAudienceInfo) {
        0qQ.A0B(promoteAudienceInfo, 1);
        this.A04 = promoteAudienceInfo.A04;
        this.A05 = promoteAudienceInfo.A05;
        this.A01 = promoteAudienceInfo.A01;
        this.A00 = promoteAudienceInfo.A00;
        this.A06 = promoteAudienceInfo.A06;
        this.A07 = promoteAudienceInfo.A07;
        this.A08 = promoteAudienceInfo.A08;
        this.A03 = promoteAudienceInfo.A03;
        this.A02 = promoteAudienceInfo.A02;
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [X.ULv, java.lang.Object] */
    public static /* synthetic */ C15053ULv A00(AdvantageAudienceData advantageAudienceData, TargetingRelaxationConstants targetingRelaxationConstants, C15053ULv uLv, String str, List list, List list2, List list3, int i, int i2, int i3, boolean z) {
        String str2 = null;
        if ((i3 & 1) != 0) {
            str2 = uLv.A04;
        }
        if ((i3 & 2) != 0) {
            str = uLv.A05;
        }
        if ((i3 & 4) != 0) {
            i = uLv.A01;
        }
        if ((i3 & 8) != 0) {
            i2 = uLv.A00;
        }
        if ((i3 & 16) != 0) {
            list = uLv.A06;
        }
        if ((i3 & 32) != 0) {
            list2 = uLv.A07;
        }
        if ((i3 & 64) != 0) {
            list3 = uLv.A08;
        }
        if ((i3 & 128) != 0) {
            targetingRelaxationConstants = uLv.A03;
        }
        if ((i3 & 256) != 0) {
            advantageAudienceData = uLv.A02;
        }
        if ((i3 & 512) != 0) {
            z = uLv.A09;
        }
        ? obj = new Object();
        obj.A04 = str2;
        obj.A05 = str;
        obj.A01 = i;
        obj.A00 = i2;
        obj.A06 = list;
        obj.A07 = list2;
        obj.A08 = list3;
        obj.A03 = targetingRelaxationConstants;
        obj.A02 = advantageAudienceData;
        obj.A09 = z;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15053ULv) {
                C15053ULv uLv = (C15053ULv) obj;
                if (!0qQ.A0K(this.A04, uLv.A04) || !0qQ.A0K(this.A05, uLv.A05) || this.A01 != uLv.A01 || this.A00 != uLv.A00 || !0qQ.A0K(this.A06, uLv.A06) || !0qQ.A0K(this.A07, uLv.A07) || !0qQ.A0K(this.A08, uLv.A08) || this.A03 != uLv.A03 || !0qQ.A0K(this.A02, uLv.A02) || this.A09 != uLv.A09) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final AudienceGeoLocation A01() {
        AdGeoLocationType adGeoLocationType;
        List list = this.A07;
        if (list == null || list.size() != 1) {
            return null;
        }
        AdGeoLocationType adGeoLocationType2 = ((AudienceGeoLocation) 00k.A0I(list)).A03;
        if (adGeoLocationType2 != null) {
            adGeoLocationType = VAK.A00(adGeoLocationType2);
        } else {
            adGeoLocationType = null;
        }
        if (adGeoLocationType == AdGeoLocationType.CUSTOM_LOCATION) {
            return (AudienceGeoLocation) 00k.A0I(list);
        }
        return null;
    }

    public final int hashCode() {
        return DbS.A06(this.A09, ((((((((((((((((AnonymousClass7TG.A0E(this.A04) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + this.A01) * 31) + this.A00) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A02)) * 31);
    }

    public C15053ULv() {
    }
}

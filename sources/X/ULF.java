package X;

import com.instagram.business.promote.model.AudienceGeoLocation;
import java.util.ArrayList;
import java.util.List;

public final class ULF extends AnonymousClass0T0 {
    public int A00 = 0;
    public int A01;
    public AudienceGeoLocation A02 = null;
    public AudienceGeoLocation A03 = null;
    public List A04;
    public List A05;
    public boolean A06;

    public ULF() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.A05 = arrayList;
        this.A04 = arrayList2;
        this.A01 = 5;
        this.A06 = false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ULF) {
                ULF ulf = (ULF) obj;
                if (this.A00 != ulf.A00 || !0qQ.A0K(this.A03, ulf.A03) || !0qQ.A0K(this.A02, ulf.A02) || !0qQ.A0K(this.A05, ulf.A05) || !0qQ.A0K(this.A04, ulf.A04) || this.A01 != ulf.A01 || this.A06 != ulf.A06) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A07 = AnonymousClass7TF.A07(this.A05, ((((this.A00 * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A02)) * 31);
        return DbS.A06(this.A06, (AnonymousClass7TF.A07(this.A04, A07) + this.A01) * 31);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.ULF, java.lang.Object] */
    public static final ULF A00(AudienceGeoLocation audienceGeoLocation, AudienceGeoLocation audienceGeoLocation2, List list, List list2, int i, int i2, boolean z) {
        C51972G9s.A1D(list, list2);
        ? obj = new Object();
        obj.A00 = i;
        obj.A03 = audienceGeoLocation;
        obj.A02 = audienceGeoLocation2;
        obj.A05 = list;
        obj.A04 = list2;
        obj.A01 = i2;
        obj.A06 = z;
        return obj;
    }
}

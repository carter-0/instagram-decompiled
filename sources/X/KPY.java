package X;

import com.instagram.api.schemas.BrandedContentGatingInfo;
import java.util.Date;
import java.util.List;

public final class KPY extends C59889JbE {
    public final 28D A00;
    public final BrandedContentGatingInfo A01;
    public final String A02;
    public final Date A03;
    public final List A04;
    public final boolean A05;

    public KPY(28D r2, BrandedContentGatingInfo brandedContentGatingInfo, String str, Date date, List list, boolean z) {
        super("advanced_settings");
        this.A03 = date;
        this.A04 = list;
        this.A02 = str;
        this.A05 = z;
        this.A01 = brandedContentGatingInfo;
        this.A00 = r2;
    }
}

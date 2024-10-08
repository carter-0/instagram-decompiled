package X;

import com.facebook.rsys.starrating.gen.StarRatingApi;

/* renamed from: X.IwX  reason: case insensitive filesystem */
public final class C58724IwX extends 0Yg implements 0sP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58724IwX(int i, long j) {
        super(1);
        this.A00 = i;
        this.A01 = j;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        NCZ ncz = (NCZ) obj;
        0qQ.A0B(ncz, 0);
        StarRatingApi starRatingApi = ncz.A07.A00;
        if (starRatingApi != null) {
            starRatingApi.submitStarRating(this.A00, (String) null, Long.valueOf(this.A01));
        }
        return C60340gF.A00;
    }
}

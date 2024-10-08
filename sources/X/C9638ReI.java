package X;

import com.google.common.collect.ImmutableList;
import com.instagram.android.R;

/* renamed from: X.ReI  reason: case insensitive filesystem */
public abstract class C9638ReI {
    /* JADX WARNING: type inference failed for: r1v5, types: [X.Qgf, X.Ry4] */
    /* JADX WARNING: type inference failed for: r4v1, types: [X.RwX, X.QgU] */
    public static final void A00(C13883Tj6 tj6, C13883Tj6 tj62, C13883Tj6 tj63, C13883Tj6 tj64, ImmutableList.Builder builder, String str, String str2, String str3, String str4, 0sK r22, double d, int i) {
        int i2;
        RH2 rh2;
        String str5 = null;
        String str6 = str3;
        if (d > 0.0d) {
            if (str3 != null) {
                str5 = 00p.A0g(str6, "↑", "", false);
            }
            i2 = 2131969119;
        } else {
            if (str3 != null) {
                str5 = 00p.A0g(str6, "↓", "", false);
            }
            i2 = 2131969118;
        }
        C12400StQ A00 = C12400StQ.A00(new Object[]{tj6, tj62, tj63, C12400StQ.A00(new Object[]{C12401StR.A01(str5)}, i2)}, 2131969117);
        ? ry4 = new C10783Ry4(12);
        ry4.A00 = new C12397Ssl((Integer) null, 14, R.drawable.rounded_icon_background, R.dimen.account_recs_header_image_margin);
        C8080QgY A002 = C8080QgY.A00();
        SST.A02(tj6, A002, RH2.PRIMARY_TEXT);
        SST.A03(tj62, A002, RH2.A0x);
        A002.A03 = new SST((C13889TjC) null, tj63, RH2.A14);
        if (d > 0.0d) {
            rh2 = RH2.A1D;
        } else {
            rh2 = RH2.A1C;
        }
        A002.A01 = new SST((C13889TjC) null, tj64, rh2);
        SRP A003 = SRP.A00();
        A003.A01 = A00;
        A003.A04 = false;
        SO0.A00(A003, A002);
        ry4.A02 = new C8086Qge(A002);
        ? rwX = new C10693RwX();
        rwX.A01 = new SST((C13889TjC) null, C12400StQ.A00(new Object[0], 2131976623), RH2.A13);
        rwX.A00 = new C12397Ssl(6, (Integer) null, R.drawable.button_background, 0);
        rwX.A00 = new C11487SbA(str2, str, str4, r22);
        SO0.A00(new SRP((C13883Tj6) null, C12400StQ.A00(new Object[0], i), AnonymousClass05K.A01, true, false, false), rwX);
        ry4.A01 = new C8081QgZ(rwX);
        builder.add(new C8095Qgn(ry4));
    }
}

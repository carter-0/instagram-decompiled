package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediatype.ProductType;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.HDp  reason: case insensitive filesystem */
public final class C54438HDp extends C252733pa {
    public final UserSession A00;
    public final 05G A01 = DbS.A10(new N4R());
    public final Context A02;

    public static final AnonymousClass3WR A00(C267324bN r33) {
        1Xy r2;
        String str;
        List list;
        String str2;
        Integer num;
        String str3;
        1Xj r0 = r33.A02;
        Boolean bool = null;
        if (r0 != null) {
            r2 = r0.A0C;
        } else {
            r2 = null;
        }
        Integer num2 = AnonymousClass05K.A00;
        if (r2 == null || (str = r2.getId()) == null) {
            str = "0";
        }
        ProductType productType = (ProductType) ProductType.A01.get("clips");
        if (r2 != null) {
            list = r2.CEY();
        } else {
            list = null;
        }
        ArrayList A002 = AnonymousClass3WQ.A00(list);
        if (r2 != null) {
            str2 = r2.getVideoDashManifest();
            num = r2.CRC();
            str3 = r2.getVideoCodec();
            bool = r2.BAZ();
        } else {
            str2 = null;
            num = null;
            str3 = null;
        }
        return new AnonymousClass3WR((C2814057m) null, productType, (C255573uM) null, bool, (Double) null, num2, num, str, (String) null, (String) null, str2, (String) null, str3, (String) null, (String) null, (String) null, A002, (List) null, (List) null, -1, -1, Long.MAX_VALUE, false, false, false, false, false, false, true, false);
    }

    public static final String A01(C267324bN r17, C54438HDp hDp) {
        C67231sQ A0n;
        C267324bN r3 = r17;
        1Xj r1 = r3.A02;
        if (r1 == null || (A0n = C51966G9m.A0n(r1)) == null) {
            return null;
        }
        String A04 = AnonymousClass3ZJ.A04(A0n.BUr(), A0n.BZB());
        String A03 = AnonymousClass3ZJ.A03(A0n.BUr(), A0n.BZB());
        0qQ.A07(A03);
        boolean A0A = AnonymousClass3ZJ.A0A(A0n);
        C67061rp AZY = A0n.AZY();
        C376489Ie A002 = AnonymousClass3ZJ.A00(A0n.BZB());
        1Xj r0 = r3.A02;
        C54438HDp hDp2 = hDp;
        UserSession userSession = hDp2.A00;
        AnonymousClass4Ke r4 = new AnonymousClass4Ke(A002, AZY, A04, A03, R.dimen.abc_text_size_menu_header_material, false, A0A, false, false, true, true, AnonymousClass3ZJ.A0D(userSession, r0), C263304Kd.A03(A0n), false);
        Context context = hDp2.A02;
        return AnonymousClass4Kf.A03(AnonymousClass7TF.A0A(context), AnonymousClass4Kf.A01(context, r4), AnonymousClass4Kf.A00(context, r4), userSession, r4, false).toString();
    }

    public static final void A02(C54634HLr hLr, C54438HDp hDp) {
        Object value;
        05G r3 = hDp.A01;
        do {
            value = r3.getValue();
            0qQ.A0B(hLr, 1);
        } while (!r3.AIY(value, new N4R((C61078JwG) ((N4R) value).A00, hLr)));
    }

    public C54438HDp(UserSession userSession, Context context) {
        super("ig_nux_reels_tuning", AnonymousClass43D.A00(2097882485));
        this.A00 = userSession;
        this.A02 = context;
    }
}

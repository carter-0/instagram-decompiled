package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.Nvz  reason: case insensitive filesystem */
public abstract class C70021Nvz {
    public static final void A00(Context context, UserSession userSession, AnonymousClass7FR r7, ArrayList arrayList) {
        if (r7.A0Z) {
            C66583MXo.A1M(AnonymousClass05K.A0N, AnonymousClass7TE.A16(context, 2131960226), arrayList, R.drawable.instagram_report_pano_outline_24);
        }
        if (r7.A0b) {
            C66583MXo.A1M(AnonymousClass05K.A0o, AnonymousClass7TE.A16(context, 2131960226), arrayList, R.drawable.instagram_report_pano_outline_24);
        }
        if (r7.A0p) {
            Integer num = AnonymousClass05K.A0Y;
            int i = 2131960654;
            if (r7.A0z) {
                i = 2131960643;
            }
            String A16 = AnonymousClass7TE.A16(context, i);
            boolean A06 = 182.A06(0Tu.A05, userSession, 36320932104512470L);
            int i2 = R.drawable.instagram_delete_pano_outline_24;
            if (A06) {
                i2 = R.drawable.instagram_undo_circle_pano_outline_24;
            }
            C66583MXo.A1M(num, A16, arrayList, i2);
        }
        if (r7.A0W) {
            C66583MXo.A1M(AnonymousClass05K.A0j, AnonymousClass7TE.A16(context, 2131971974), arrayList, R.drawable.instagram_delete_pano_outline_24);
        }
        if (r7.A0J) {
            C66583MXo.A1M(AnonymousClass05K.A0F, AnonymousClass7TE.A16(context, 2131957531), arrayList, R.drawable.instagram_delete_pano_outline_24);
        }
        if (r7.A0q) {
            C66583MXo.A1M(AnonymousClass05K.A0m, AnonymousClass7TE.A16(context, 2131960643), arrayList, R.drawable.instagram_undo_circle_pano_outline_24);
        }
    }
}

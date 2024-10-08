package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;

public abstract class I6V {
    public static final boolean A05(1Xj r4, 1Xj r5) {
        if (r5 == null) {
            return false;
        }
        if (r4.A5D()) {
            r4 = r4.A1c(0);
        }
        if (r5.A5D()) {
            r5 = r5.A1c(0);
        }
        0qQ.A0A(r4);
        String id = r4.getId();
        0qQ.A0A(r5);
        if (!C51969G9p.A1Z(r5, id)) {
            String id2 = r4.getId();
            if (id2 != null) {
                String A02 = AnonymousClass3VO.A02(id2);
                String id3 = r5.getId();
                if (id3 != null) {
                    return 0qQ.A0K(A02, AnonymousClass3VO.A02(id3));
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }

    public static final void A00(Activity activity, ImageUrl imageUrl, MVB mvb, C54665HMw hMw, String str, String str2, boolean z, boolean z2, boolean z3) {
        String string;
        0qQ.A0B(hMw, 9);
        if (hMw == C54665HMw.PRODUCT_AUTO_COLLECTION || hMw == C54665HMw.EMPTY_PRODUCT_AUTO_COLLECTION) {
            Resources resources = activity.getResources();
            int i = 2131969881;
            if (z2) {
                i = 2131969823;
            }
            string = resources.getString(i);
        } else {
            Resources resources2 = activity.getResources();
            int i2 = 2131972031;
            if (z2) {
                i2 = 2131952374;
            }
            string = AnonymousClass7TF.A0e(resources2, str, i2);
        }
        C310336ap A0a = DbS.A0a();
        A0a.A0D = string;
        if (imageUrl != null) {
            A0a.A09 = imageUrl;
            A0a.A03();
        }
        if (z) {
            A0a.A0L = true;
            0qQ.A0A(mvb);
            A0a.A0A(mvb);
            0qQ.A0A(str2);
            A0a.A0D(str2);
        }
        if (z3) {
            A0a.A06();
        }
        Dbb.A1Q(A0a);
    }

    public static final void A01(Activity activity, String str, boolean z) {
        String str2;
        int i = 2131972030;
        if (z) {
            i = 2131952369;
        }
        String A0e = AnonymousClass7TF.A0e(activity.getResources(), str, i);
        if (z) {
            str2 = "add_to_collection_failure_notification";
        } else {
            str2 = "remove_from_collection_failure_notification";
        }
        C59689JTv.A00(activity, A0e, str2, 1);
    }

    public static final void A02(Context context, 1Xj r4, MVB mvb, int i) {
        DbY.A1S(context, r4);
        C310336ap A0a = DbS.A0a();
        A0a.A0D = context.getResources().getQuantityString(R.plurals.save_home_bulk_edit_add_failure_notification, i);
        C51970G9q.A1L(r4, A0a);
        A0a.A0L = true;
        A0a.A0A = mvb;
        A0a.A0G = AnonymousClass7TF.A0d(context.getResources(), 2131972371);
        Dbb.A1Q(A0a);
    }

    public static final void A03(Context context, 1Xj r4, MVB mvb, int i) {
        DbY.A1S(context, r4);
        C310336ap A0a = DbS.A0a();
        A0a.A0D = context.getResources().getQuantityString(R.plurals.save_home_bulk_edit_move_failure_notification, i);
        C51970G9q.A1L(r4, A0a);
        A0a.A0L = true;
        A0a.A0A = mvb;
        A0a.A0G = AnonymousClass7TF.A0d(context.getResources(), 2131972371);
        Dbb.A1Q(A0a);
    }

    public static final void A04(C310336ap r0) {
        Dbb.A1Q(r0);
    }
}

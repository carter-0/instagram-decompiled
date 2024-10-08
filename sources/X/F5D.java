package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.android.R;
import com.instagram.ui.slidecardpageadapter.SlideCardViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class F5D {
    public static final List A01(Context context, 16V r10, boolean z) {
        FAM[] famArr;
        String str;
        String str2;
        int i;
        int i2;
        String str3;
        int i3;
        int ordinal = r10.ordinal();
        if (ordinal == 0) {
            if (z) {
                CallerContext callerContext = FRZ.A00;
            }
            famArr = new FAM[3];
            famArr[0] = FAM.A00(context);
            str3 = context.getString(2131971305);
            i3 = 2131971304;
        } else if (ordinal == 2) {
            famArr = new FAM[3];
            famArr[0] = FAM.A00(context);
            str3 = context.getString(2131971307);
            i3 = 2131971306;
        } else if (ordinal != 3) {
            return 0sn.A00;
        } else {
            famArr = new FAM[3];
            famArr[0] = new FAM(context.getString(2131957046), context.getString(2131957043), R.drawable.instagram_user_pano_outline_24, R.drawable.instagram_creator_experience_assets_creator_controls_illustration);
            famArr[1] = new FAM(context.getString(2131957045), context.getString(2131957042), R.drawable.instagram_direct_pano_outline_24, R.drawable.instagram_creator_experience_assets_creator_inbox_illustration);
            str = context.getString(2131957044);
            str2 = context.getString(2131957041);
            i = R.drawable.instagram_insights_pano_outline_24;
            i2 = R.drawable.instagram_creator_experience_assets_creator_insights_illustration;
            famArr[2] = new FAM(str, str2, i, i2);
            return 0sr.A1P(famArr);
        }
        famArr[1] = new FAM(str3, context.getString(i3), R.drawable.instagram_ads_pano_outline_24, R.drawable.ig_illustrations_illo_ads_megaphone_refresh);
        str = context.getString(2131976962);
        str2 = context.getString(2131976961);
        i = R.drawable.instagram_mail_pano_outline_24;
        i2 = R.drawable.ig_illustrations_illo_contact_buttons_refresh;
        famArr[2] = new FAM(str, str2, i, i2);
        return 0sr.A1P(famArr);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [com.instagram.ui.slidecardpageadapter.SlideCardViewModel, java.lang.Object] */
    public static final ArrayList A00(SlideCardViewModel slideCardViewModel, List list, boolean z) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (slideCardViewModel != null) {
            A1C.add(slideCardViewModel);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FAM fam = (FAM) it.next();
            if (z) {
                CallerContext callerContext = FRZ.A00;
            }
            String str = fam.A03;
            String str2 = fam.A02;
            if (!(str == null || str2 == null)) {
                int i = fam.A00;
                ? obj = new Object();
                obj.A00 = 0;
                obj.A01 = i;
                obj.A06 = null;
                obj.A05 = null;
                obj.A0B = str;
                obj.A0A = str2;
                obj.A08 = null;
                obj.A09 = null;
                obj.A07 = null;
                obj.A02 = null;
                obj.A03 = null;
                obj.A04 = null;
                A1C.add(obj);
            }
        }
        return A1C;
    }
}

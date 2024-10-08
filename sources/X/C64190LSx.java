package X;

import android.content.res.Resources;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.fragment.EditMediaInfoFragment;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.LSx  reason: case insensitive filesystem */
public abstract class C64190LSx {
    public static void A01(View view, UserSession userSession, C282555Dn r10, AnonymousClass3QO r11, String str, Map map, Map map2, Map map3, boolean z, boolean z2) {
        View view2 = view;
        if (z || r11 == AnonymousClass3QO.OPAL) {
            view.setVisibility(8);
            return;
        }
        C282555Dn r7 = r10;
        boolean z3 = z2;
        if (EditMediaInfoFragment.A0Q(r10.A00)) {
            A03(view2, r7, (List) map.get(str), (List) map2.get(str), (List) map3.get(str), z3);
            return;
        }
        Map map4 = new Map[]{map}[0];
        if (map4 != null) {
            Iterator A0v = AnonymousClass7TF.A0v(map4);
            while (true) {
                if (A0v.hasNext()) {
                    if (!((List) A0v.next()).isEmpty()) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        Map map5 = new Map[]{map2}[0];
        if (map5 != null) {
            Iterator A0v2 = AnonymousClass7TF.A0v(map5);
            while (A0v2.hasNext()) {
                if (!((List) A0v2.next()).isEmpty()) {
                    A02(view, r10, (List) map2.get(str));
                    return;
                }
            }
        }
        if (C367088qA.A01(userSession)) {
            A00(LY5.A00(r10, 1), view, view.getResources().getString(2131974931), R.drawable.instagram_add_pano_outline_24);
            return;
        }
        A04(view, r10, (List) map.get(str), (List) map3.get(str), z3);
    }

    public static void A00(View.OnClickListener onClickListener, View view, String str, int i) {
        DbU.A0F(view, R.id.tag_indicator_button_icon).setImageResource(i);
        DbX.A1E(view, str, R.id.tag_indicator_button_text);
        AnonymousClass0fU.A00(onClickListener, view);
        view.setVisibility(0);
    }

    public static void A02(View view, C282555Dn r5, List list) {
        int i;
        String string;
        int i2;
        int size;
        if (A05(list)) {
            if (list == null) {
                size = 0;
            } else {
                size = list.size();
            }
            i = R.drawable.instagram_shopping_bag_pano_filled_24;
            string = DbY.A0d(view.getResources(), size, R.plurals.num_products_formatted);
            i2 = 4;
        } else {
            i = R.drawable.instagram_shopping_bag_pano_filled_24;
            string = view.getResources().getString(2131969865);
            i2 = 5;
        }
        A00(LY5.A00(r5, i2), view, string, i);
    }

    public static void A03(View view, C282555Dn r7, List list, List list2, List list3, boolean z) {
        String str;
        int i;
        int size;
        int i2;
        int size2;
        String str2 = null;
        if (A05(list2)) {
            if (list2 == null) {
                size2 = 0;
            } else {
                size2 = list2.size();
            }
            str = DbY.A0d(view.getResources(), size2, R.plurals.num_products_formatted);
        } else {
            str = null;
        }
        if (A05(list) || (A05(list3) && z)) {
            if (list == null) {
                size = 0;
            } else {
                size = list.size();
            }
            if (list3 == null || !A05(list3) || !z) {
                i2 = 0;
            } else {
                i2 = list3.size();
            }
            str2 = DbY.A0d(view.getResources(), size + i2, R.plurals.x_people);
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        Resources resources = view.getResources();
        if (str2 != null) {
            A1A.append(str2);
            if (str != null) {
                A1A.append(" • ");
            } else {
                A1A.append(" • ");
                A1A.append(resources.getString(2131969865));
                i = R.drawable.instagram_user_circle_pano_filled_24;
                A00(LY5.A00(r7, 6), view, A1A.toString(), i);
            }
        } else if (str != null) {
            A1A.append(str);
            A1A.append(" • ");
            str = resources.getString(2131969343);
        } else {
            A1A.append(resources.getString(2131974931));
            i = R.drawable.instagram_add_pano_outline_24;
            A00(LY5.A00(r7, 6), view, A1A.toString(), i);
        }
        A1A.append(str);
        i = R.drawable.instagram_shopping_bag_pano_filled_24;
        A00(LY5.A00(r7, 6), view, A1A.toString(), i);
    }

    public static void A04(View view, C282555Dn r5, List list, List list2, boolean z) {
        int i;
        String str;
        int i2;
        int size;
        int i3;
        if (A05(list) || (A05(list2) && z)) {
            if (list == null) {
                size = 0;
            } else {
                size = list.size();
            }
            if (list2 == null || !A05(list2) || !z) {
                i3 = 0;
            } else {
                i3 = list2.size();
            }
            i = R.drawable.instagram_user_circle_pano_filled_24;
            str = DbY.A0d(view.getResources(), size + i3, R.plurals.x_people);
            i2 = 2;
        } else {
            i = R.drawable.instagram_user_circle_pano_filled_24;
            str = view.getResources().getString(2131969343);
            i2 = 3;
        }
        A00(LY5.A00(r5, i2), view, str, i);
    }

    public static boolean A05(List list) {
        List list2 = new List[]{list}[0];
        if (list2 == null || list2.isEmpty()) {
            return false;
        }
        return true;
    }
}

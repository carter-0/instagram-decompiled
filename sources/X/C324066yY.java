package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.Constants;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.ActionButtonPartnerType;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* renamed from: X.6yY  reason: invalid class name and case insensitive filesystem */
public abstract class C324066yY {
    public static boolean A05(User user) {
        if (user == null) {
            return false;
        }
        boolean z = false;
        if (user.A03.AyK() != null) {
            z = true;
        }
        return (2Ek.A00(user) || 2Ek.A01(user)) && z;
    }

    public static C274674os A00(SMBPartnerType sMBPartnerType, User user) {
        if (sMBPartnerType == null) {
            return null;
        }
        if (sMBPartnerType.equals(SMBPartnerType.GIFT_CARD)) {
            return user.A03.Bx2();
        }
        if (sMBPartnerType.equals(SMBPartnerType.FOOD_DELIVERY)) {
            return user.A03.Bwz();
        }
        if (sMBPartnerType.equals(SMBPartnerType.DONATION)) {
            return user.A03.Bx0();
        }
        return null;
    }

    public static String A01(Context context, SMBPartnerType sMBPartnerType, String str) {
        int i;
        boolean equals = str.equals("sticker");
        boolean equals2 = sMBPartnerType.equals(SMBPartnerType.GIFT_CARD);
        if (equals) {
            if (equals2) {
                i = 2131952352;
            } else if (!sMBPartnerType.equals(SMBPartnerType.FOOD_DELIVERY)) {
                return null;
            } else {
                i = 2131952290;
            }
        } else if (equals2) {
            i = 2131952351;
        } else if (sMBPartnerType.equals(SMBPartnerType.FOOD_DELIVERY)) {
            i = 2131952289;
        } else if (!sMBPartnerType.equals(SMBPartnerType.DONATION)) {
            return null;
        } else {
            i = 2131952294;
        }
        return context.getString(i);
    }

    public static String A02(SMBPartnerType sMBPartnerType) {
        if (sMBPartnerType == null) {
            return "";
        }
        int ordinal = sMBPartnerType.ordinal();
        if (ordinal == 6) {
            return "https://help.instagram.com/3180219732057386";
        }
        if (ordinal == 3) {
            return "https://help.instagram.com/661624171320775";
        }
        if (ordinal == 2) {
            return "https://help.instagram.com/242451420235904";
        }
        throw new UnsupportedOperationException(002.A0R("Unexpected partnerType, received ", sMBPartnerType.toString()));
    }

    public static String A03(ExP exP) {
        ImmutableList of;
        String str;
        ImmutableList of2;
        ImmutableList of3;
        StringBuilder sb = new StringBuilder();
        sb.append("https://");
        List list = exP.A02;
        if (list != null) {
            of = ImmutableList.copyOf((Collection) list);
        } else {
            of = ImmutableList.of();
        }
        if (of != null) {
            List list2 = exP.A02;
            if (list2 != null) {
                of2 = ImmutableList.copyOf((Collection) list2);
            } else {
                of2 = ImmutableList.of();
            }
            if (!of2.isEmpty()) {
                List list3 = exP.A02;
                if (list3 != null) {
                    of3 = ImmutableList.copyOf((Collection) list3);
                } else {
                    of3 = ImmutableList.of();
                }
                str = (String) of3.get(0);
                sb.append(str);
                return sb.toString();
            }
        }
        sb.append(exP.A01.toLowerCase(Locale.US));
        str = ".com";
        sb.append(str);
        return sb.toString();
    }

    public static boolean A04(FragmentActivity fragmentActivity, ActionButtonPartnerType actionButtonPartnerType, SMBPartnerType sMBPartnerType, String str) {
        Intent intent = new Intent("android.intent.action.VIEW", 0cp.A03(str));
        String A00 = Pxd.A00(6);
        Intent addCategory = intent.addCategory(A00);
        String A002 = Pxd.A00(632);
        Intent addFlags = addCategory.addCategory(A002).addFlags(335544320);
        if (SMBPartnerType.DONATION.equals(sMBPartnerType)) {
            return 0kR.A0A(fragmentActivity, addFlags);
        }
        if (!SMBPartnerType.FOOD_DELIVERY.equals(sMBPartnerType) && actionButtonPartnerType != ActionButtonPartnerType.FBE) {
            return false;
        }
        String str2 = 0oI.A02;
        PackageManager packageManager = fragmentActivity.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent action = new Intent().addCategory(A00).addCategory(A002).setAction("android.intent.action.VIEW");
        Intent data = new Intent(action).setData(0cp.A03(str));
        Intent data2 = new Intent(action).setData(0cp.A03("http://example.com"));
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(data, Constants.LOAD_RESULT_PGO_ATTEMPTED);
        List<ResolveInfo> queryIntentActivities2 = packageManager.queryIntentActivities(data2, Constants.LOAD_RESULT_PGO_ATTEMPTED);
        HashSet hashSet = new HashSet();
        for (ResolveInfo resolveInfo : queryIntentActivities2) {
            hashSet.add(resolveInfo.activityInfo.packageName);
        }
        for (ResolveInfo next : queryIntentActivities) {
            if (!hashSet.contains(next.activityInfo.packageName)) {
                if (0JW.A04(packageManager, next.activityInfo.packageName)) {
                    return 0kR.A0D(fragmentActivity, addFlags);
                }
                return false;
            }
        }
        return false;
    }
}

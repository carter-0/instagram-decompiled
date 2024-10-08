package X;

import android.os.Bundle;

public final class LEU {
    public final C61428K7d A01(Integer num, Integer num2, Long l, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
        C62506Kgw kgw;
        boolean A1U = AnonymousClass7TF.A1U(0, str, str2);
        Bundle A0B = DbV.A0B(str3, 2);
        A0B.putString("UserPaySupporterListBottomSheetFragment.FRAGMENT_ARGUMENTS_MEDIA_ID", str);
        A0B.putString("UserPaySupporterListBottomSheetFragment.FRAGMENT_ARGUMENTS_INSIGHTS_ID", str4);
        A0B.putString("UserPaySupporterListBottomSheetFragment.FRAGMENT_ARGUMENTS_BADGES_ESTIMATED_EARNINGS", str2);
        A0B.putString("UserPaySupporterListBottomSheetFragment.FRAGMENT_ARGUMENTS_NUM_BADGES", str3);
        if (num != null) {
            A0B.putInt("UserPaySupporterListBottomSheetFragment.FRAGMENT_ARGUMENTS_NUM_SUPPORTERS", num.intValue());
        }
        A0B.putBoolean("UserPaySupporterListBottomSheetFragment.FRAGMENT_ARGUMENTS_IS_POST_LIVE", z);
        A0B.putBoolean("UserPaySupporterListBottomSheetFragment.FRAGMENT_ARGUMENTS_IS_FROM_SETTINGS", z2);
        int intValue = num2.intValue();
        if (intValue == 0) {
            kgw = C62506Kgw.DURING_LIVE;
        } else if (intValue == A1U) {
            kgw = C62506Kgw.POST_LIVE;
        } else if (intValue != 2) {
            kgw = C62506Kgw.STICKER_EDITING;
        } else {
            kgw = C62506Kgw.SETTINGS;
        }
        A0B.putSerializable("UserPaySupporterListBottomSheetFragment.FRAGMENT_ARGUMENTS_ENTRY_POINT", kgw);
        A0B.putString("UserPaySupporterListBottomSheetFragment.FRAGMENT_ARGUMENTS_MEDIA_INSIGHT_TITLE", str5);
        if (l != null) {
            A0B.putLong("UserPaySupporterListBottomSheetFragment.FRAGMENT_ARGUMENTS_MEDIA_INSIGHT_DATETIME", l.longValue());
        }
        C61428K7d k7d = new C61428K7d();
        k7d.setArguments(A0B);
        return k7d;
    }

    public final /* bridge */ /* synthetic */ KUY A00(String str, String str2) {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString(C273654mx.A00(102), str);
        A0a.putString(AnonymousClass000.A00(203), str2);
        KUY kuy = new KUY();
        kuy.setArguments(A0a);
        return kuy;
    }
}

package X;

import com.facebook.pando.TreeJNI;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.EdA  reason: case insensitive filesystem */
public abstract class C48353EdA {
    public static AnonymousClass16q A00(AnonymousClass16q r35, C267504bf r36, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Integer num, Integer num2, String str, String str2, List list) {
        TreeJNI treeJNI;
        C47220Dt7 dt7;
        TreeUpdaterJNI treeUpdaterJNI;
        AnonymousClass16q r2 = r35;
        Boolean bool14 = bool11;
        Boolean bool15 = bool10;
        Boolean bool16 = bool9;
        Boolean bool17 = bool8;
        Boolean bool18 = bool7;
        Boolean bool19 = bool12;
        String str3 = str2;
        Boolean bool20 = bool4;
        String str4 = str;
        Boolean bool21 = bool3;
        Integer num3 = num2;
        Boolean bool22 = bool2;
        Integer num4 = num;
        Boolean bool23 = bool;
        Boolean bool24 = bool13;
        Boolean bool25 = bool5;
        Boolean bool26 = bool6;
        if (r2 instanceof EOM) {
            0eP A1L = AnonymousClass7TE.A1L("daily_time_limit_without_extensions_seconds", num4);
            0eP A1L2 = AnonymousClass7TE.A1L("fc_url", str4);
            0eP A1L3 = AnonymousClass7TE.A1L("has_guardian", bool23);
            0eP A1L4 = AnonymousClass7TE.A1L("has_stated_age", bool22);
            0eP A1L5 = AnonymousClass7TE.A1L("is_blocked_list_enabled", bool21);
            0eP A1L6 = AnonymousClass7TE.A1L("is_daily_limit_non_blocking", bool20);
            0eP A1L7 = AnonymousClass7TE.A1L("is_eligible_for_supervision", bool25);
            0eP A1L8 = AnonymousClass7TE.A1L("is_guardian_of_viewer", bool26);
            0eP A1L9 = AnonymousClass7TE.A1L("is_guardian_user", bool18);
            0eP A1L10 = AnonymousClass7TE.A1L("is_modify_privacy_settings_enabled", bool17);
            0eP A1L11 = AnonymousClass7TE.A1L("is_quiet_time_feature_enabled", bool16);
            0eP A1L12 = AnonymousClass7TE.A1L("is_quiet_time_non_blocking", bool15);
            0eP A1L13 = AnonymousClass7TE.A1L("is_supervised_by_viewer", bool14);
            0eP A1L14 = AnonymousClass7TE.A1L("is_supervised_or_in_cooldown", bool19);
            0eP A1L15 = AnonymousClass7TE.A1L("is_supervised_user", bool24);
            ArrayList arrayList = null;
            if (r36 != null) {
                treeUpdaterJNI = r36.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            0eP A1L16 = AnonymousClass7TE.A1L(AnonymousClass000.A00(168), treeUpdaterJNI);
            if (list != null) {
                arrayList = AnonymousClass7TE.A1C();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C51953G8w g8w = (C51953G8w) it.next();
                    if (g8w != null) {
                        arrayList.add(g8w.FHC());
                    }
                }
            }
            TreeJNI treeJNI2 = (TreeJNI) r2;
            treeJNI = C41845B3m.A0S(treeJNI2, 0Yt.A06(new 0eP[]{A1L, A1L2, A1L3, A1L4, A1L5, A1L6, A1L7, A1L8, A1L9, A1L10, A1L11, A1L12, A1L13, A1L14, A1L15, A1L16, AnonymousClass7TE.A1L("quiet_time_intervals", arrayList), AnonymousClass7TE.A1L(AnonymousClass000.A00(1781), str3), AnonymousClass7TE.A1L("screen_time_daily_limit_seconds", num3)})).applyToTree(treeJNI2);
            0qQ.A07(treeJNI);
        } else {
            ArrayList arrayList2 = null;
            if (r36 != null) {
                dt7 = r36.FCt();
            } else {
                dt7 = null;
            }
            if (list != null) {
                arrayList2 = AnonymousClass7TG.A0r(list);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((C51953G8w) it2.next()).F8R());
                }
            }
            Boolean bool27 = bool23;
            Boolean bool28 = bool22;
            treeJNI = new 16p(dt7, bool27, bool28, bool21, bool20, bool25, bool26, bool18, bool17, bool16, bool15, bool14, bool19, bool24, num4, num3, str4, str3, arrayList2);
        }
        return (AnonymousClass16q) treeJNI;
    }
}

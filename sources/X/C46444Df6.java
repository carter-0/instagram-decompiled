package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Df6  reason: case insensitive filesystem */
public abstract /* synthetic */ class C46444Df6 {
    public static Map A00(AnonymousClass16q r4) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r4.Av5() != null) {
            A1H.put("daily_time_limit_without_extensions_seconds", r4.Av5());
        }
        if (r4.B4n() != null) {
            A1H.put("fc_url", r4.B4n());
        }
        if (r4.BBH() != null) {
            A1H.put("has_guardian", r4.BBH());
        }
        if (r4.BCA() != null) {
            A1H.put("has_stated_age", r4.BCA());
        }
        if (r4.CPU() != null) {
            A1H.put("is_blocked_list_enabled", r4.CPU());
        }
        if (r4.CR7() != null) {
            A1H.put("is_daily_limit_non_blocking", r4.CR7());
        }
        if (r4.CSM() != null) {
            A1H.put("is_eligible_for_supervision", r4.CSM());
        }
        if (r4.CUV() != null) {
            A1H.put("is_guardian_of_viewer", r4.CUV());
        }
        if (r4.CUW() != null) {
            A1H.put("is_guardian_user", r4.CUW());
        }
        if (r4.CXk() != null) {
            A1H.put("is_modify_privacy_settings_enabled", r4.CXk());
        }
        if (r4.CaI() != null) {
            A1H.put("is_quiet_time_feature_enabled", r4.CaI());
        }
        if (r4.CaJ() != null) {
            A1H.put("is_quiet_time_non_blocking", r4.CaJ());
        }
        if (r4.Ccn() != null) {
            A1H.put("is_supervised_by_viewer", r4.Ccn());
        }
        if (r4.Cco() != null) {
            A1H.put("is_supervised_or_in_cooldown", r4.Cco());
        }
        if (r4.Ccp() != null) {
            A1H.put("is_supervised_user", r4.Ccp());
        }
        ArrayList arrayList = null;
        if (r4.BLd() != null) {
            C267504bf BLd = r4.BLd();
            if (BLd != null) {
                treeUpdaterJNI = BLd.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put(AnonymousClass000.A00(168), treeUpdaterJNI);
        }
        if (r4.Biv() != null) {
            List<C51953G8w> Biv = r4.Biv();
            if (Biv != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (C51953G8w g8w : Biv) {
                    if (g8w != null) {
                        arrayList.add(g8w.FHC());
                    }
                }
            }
            A1H.put("quiet_time_intervals", arrayList);
        }
        if (r4.Bpt() != null) {
            A1H.put(AnonymousClass000.A00(1781), r4.Bpt());
        }
        if (r4.Bpu() != null) {
            A1H.put("screen_time_daily_limit_seconds", r4.Bpu());
        }
        return 0Yt.A0B(A1H);
    }
}

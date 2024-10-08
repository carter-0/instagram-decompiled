package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CqH  reason: case insensitive filesystem */
public abstract /* synthetic */ class C45099CqH {
    public static Map A00(C233502vp r5) {
        ArrayList arrayList;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r5.AmE() != null) {
            A1H.put("carry_over_highest_position_rule", r5.AmE());
        }
        if (r5.Aq8() != null) {
            A1H.put("consumed_media_gap_to_previous_ad", r5.Aq8());
        }
        if (r5.Aq9() != null) {
            A1H.put("consumed_media_gap_to_previous_netego", r5.Aq9());
        }
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (r5.AyQ() != null) {
            List<DST> AyQ = r5.AyQ();
            if (AyQ != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (DST dst : AyQ) {
                    if (dst != null) {
                        arrayList.add(dst.FHC());
                    }
                }
            } else {
                arrayList = null;
            }
            A1H.put("dnf", arrayList);
        }
        if (r5.BDP() != null) {
            A1H.put("highest_ad_position_rule_value", r5.BDP());
        }
        if (r5.BDQ() != null) {
            A1H.put(C273654mx.A00(2449), r5.BDQ());
        }
        if (r5.CWw() != null) {
            A1H.put("is_media_based_hp_enabled", r5.CWw());
        }
        if (r5.BPI() != null) {
            A1H.put(C273654mx.A00(3004), r5.BPI());
        }
        if (r5.BT4() != null) {
            A1H.put(AnonymousClass000.A00(5054), r5.BT4());
        }
        if (r5.BT5() != null) {
            A1H.put(AnonymousClass000.A00(5055), r5.BT5());
        }
        if (r5.BT8() != null) {
            A1H.put(C273654mx.A00(3035), r5.BT8());
        }
        if (r5.Bde() != null) {
            A1H.put("pool_refresh_ttl_in_sec", r5.Bde());
        }
        if (r5.BiM() != null) {
            C67241sS BiM = r5.BiM();
            if (BiM != null) {
                treeUpdaterJNI = BiM.FHC();
            }
            A1H.put(AnonymousClass000.A00(5156), treeUpdaterJNI);
        }
        if (r5.Bka() != null) {
            A1H.put("reel_gap_to_previous_ad", r5.Bka());
        }
        if (r5.Bkb() != null) {
            A1H.put("reel_gap_to_previous_netego", r5.Bkb());
        }
        if (r5.Bs2() != null) {
            A1H.put("self_pog_chaining_highest_position_rule", r5.Bs2());
        }
        if (r5.C4M() != null) {
            A1H.put(AnonymousClass000.A00(802), r5.C4M());
        }
        if (r5.C7J() != null) {
            A1H.put(C273654mx.A00(3427), AnonymousClass7TH.A0D(r5.C7J()));
        }
        return 0Yt.A0B(A1H);
    }
}

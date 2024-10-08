package X;

import com.instagram.api.schemas.OnImpressionStyle;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8wh  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C370578wh {
    public static Map A00(C257873y6 r3) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (r3.Axz() != null) {
            linkedHashMap.put("dismiss_icon", r3.Axz());
        }
        if (r3.BVe() != null) {
            linkedHashMap.put("negative_confirmation_body", r3.BVe());
        }
        if (r3.BVf() != null) {
            linkedHashMap.put("negative_confirmation_cta_text", r3.BVf());
        }
        if (r3.BVg() != null) {
            linkedHashMap.put("negative_confirmation_icon", r3.BVg());
        }
        if (r3.BVh() != null) {
            linkedHashMap.put("negative_confirmation_title", r3.BVh());
        }
        if (r3.BVi() != null) {
            linkedHashMap.put("negative_icon", r3.BVi());
        }
        if (r3.BVj() != null) {
            linkedHashMap.put("negative_text", r3.BVj());
        }
        if (r3.Bdt() != null) {
            linkedHashMap.put("positive_confirmation_body", r3.Bdt());
        }
        if (r3.Bdu() != null) {
            linkedHashMap.put(C273654mx.A00(3134), r3.Bdu());
        }
        if (r3.Bdv() != null) {
            linkedHashMap.put("positive_confirmation_icon", r3.Bdv());
        }
        if (r3.Bdw() != null) {
            linkedHashMap.put("positive_confirmation_title", r3.Bdw());
        }
        if (r3.Bdx() != null) {
            linkedHashMap.put("positive_icon", r3.Bdx());
        }
        if (r3.Bdy() != null) {
            linkedHashMap.put("positive_text", r3.Bdy());
        }
        if (r3.C23() != null) {
            OnImpressionStyle C23 = r3.C23();
            if (C23 != null) {
                str = C23.A00;
            } else {
                str = null;
            }
            linkedHashMap.put("style", str);
        }
        if (r3.C2W() != null) {
            linkedHashMap.put("subtext", r3.C2W());
        }
        if (r3.getText() != null) {
            linkedHashMap.put("text", r3.getText());
        }
        return 0Yt.A0B(linkedHashMap);
    }
}

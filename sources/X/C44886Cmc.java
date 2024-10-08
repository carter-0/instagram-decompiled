package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.FeedItemType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Cmc  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44886Cmc {
    public static Map A00(AnonymousClass3IO r4) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r4.AYU() != null) {
            A1H.put("action_text", r4.AYU());
        }
        r4.getDuration();
        A1H.put(TraceFieldType.Duration, Integer.valueOf(r4.getDuration()));
        r4.Azg();
        A1H.put("dynamic_width_enabled", Boolean.valueOf(r4.Azg()));
        r4.B9g();
        A1H.put("gradient_animation_enabled", Boolean.valueOf(r4.B9g()));
        r4.BEV();
        C41845B3m.A0x(Long.valueOf(r4.BEV()), A1H);
        r4.Cdo();
        A1H.put("is_unit_dismissable", Boolean.valueOf(r4.Cdo()));
        r4.BKW();
        A1H.put("large_profile_pictures_enabled", Boolean.valueOf(r4.BKW()));
        r4.BNW();
        A1H.put("load_animation_enabled", Boolean.valueOf(r4.BNW()));
        r4.BUf();
        A1H.put("multiple_gradients_enabled", Boolean.valueOf(r4.BUf()));
        if (r4.BVr() != null) {
            FeedItemType BVr = r4.BVr();
            0qQ.A0B(BVr, 0);
            A1H.put("netego_type", BVr.A00);
        }
        r4.BWP();
        A1H.put("no_follow_confirmation", Boolean.valueOf(r4.BWP()));
        if (r4.BjK() != null) {
            A1H.put("ranking_algorithm", r4.BjK());
        }
        r4.BwD();
        A1H.put("shuffle_enabled", Boolean.valueOf(r4.BwD()));
        r4.Bwu();
        A1H.put("smaller_follow_tap_target_enabled", Boolean.valueOf(r4.Bwu()));
        if (r4.C2t() != null) {
            List<C241293Oq> C2t = r4.C2t();
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (C241293Oq r0 : C2t) {
                if (r0 != null) {
                    A1C.add(r0.FHC());
                }
            }
            A1H.put("suggestions", A1C);
        }
        if (r4.getTitle() != null) {
            C41845B3m.A12(r4.getTitle(), A1H);
        }
        if (r4.C9L() != null) {
            A1H.put("tracking_token", r4.C9L());
        }
        return 0Yt.A0B(A1H);
    }
}

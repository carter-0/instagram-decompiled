package X;

import com.instagram.api.schemas.RingSpecImpl;
import com.instagram.api.schemas.RingSpecPointImpl;
import java.util.List;

/* renamed from: X.3Mr  reason: invalid class name and case insensitive filesystem */
public final class C240823Mr extends 0Yg implements C62320sa {
    public static final C240823Mr A00 = new C240823Mr();

    public C240823Mr() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        List A1P = 0sr.A1P(new String[]{AnonymousClass3Mk.A08, AnonymousClass3Mk.A06, AnonymousClass3Mk.A07, AnonymousClass3Mk.A05});
        double radians = Math.toRadians(35.0d);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        return new RingSpecImpl(new RingSpecPointImpl((float) ((cos * 0.7d) + 0.5d), (float) (0.5d - (sin * 0.7d))), new RingSpecPointImpl((float) (0.5d - (cos * 0.75d)), (float) ((sin * 0.75d) + 0.5d)), "default_brand_update", A1P, 0sr.A1P(new Float[]{Float.valueOf(0.1435f), Float.valueOf(0.3779f), Float.valueOf(0.6071f), Float.valueOf(0.831f)}));
    }
}

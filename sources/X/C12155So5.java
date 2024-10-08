package X;

import android.os.Build;
import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.OdinContext;
import com.facebook.odin.model.Type;
import java.util.List;
import java.util.Map;

/* renamed from: X.So5  reason: case insensitive filesystem */
public final class C12155So5 implements C258943zt {
    public static final String A00;
    public static final String A01;
    public static final Map A02;

    public final String getId() {
        return "DeviceSpeedSource";
    }

    static {
        String str = Build.MANUFACTURER;
        0qQ.A08(str);
        String A0j = AnonymousClass7TF.A0j(str);
        A01 = A0j;
        A00 = 002.A0R("base speed missing for ", A0j);
        0eP A1L = AnonymousClass7TE.A1L("samsung", Float.valueOf(1.28f));
        0eP A1L2 = AnonymousClass7TE.A1L("xiaomi", Float.valueOf(1.24f));
        Float valueOf = Float.valueOf(1.2f);
        0eP A1L3 = AnonymousClass7TE.A1L("vivo", valueOf);
        Float valueOf2 = Float.valueOf(1.25f);
        A02 = 0Yt.A06(new 0eP[]{A1L, A1L2, A1L3, AnonymousClass7TE.A1L("motorola", valueOf2), AnonymousClass7TE.A1L("oppo", valueOf), AnonymousClass7TE.A1L("realme", Float.valueOf(1.21f)), AnonymousClass7TE.A1L("huawei", Float.valueOf(1.43f)), AnonymousClass7TE.A1L("oneplus", valueOf2), AnonymousClass7TE.A1L("google", Float.valueOf(1.18f)), AnonymousClass7TE.A1L("honor", Float.valueOf(1.52f)), AnonymousClass7TE.A1L("infinix", Float.valueOf(1.3f)), AnonymousClass7TE.A1L("infinix mobility limited", Float.valueOf(1.23f)), AnonymousClass7TE.A1L("tecno mobile limited", Float.valueOf(1.17f))});
    }

    public final AnonymousClass40G ATg(OdinContext odinContext) {
        Map map = A02;
        String str = A01;
        if (!map.containsKey(str)) {
            return new AnonymousClass40G(0sn.A00, A00, false);
        }
        try {
            C255463uA[] r0 = FeatureData.A0E;
            Object obj = map.get(str);
            if (obj != null) {
                return Pxf.A0M(AnonymousClass7TE.A1I(new FeatureData((Type) null, "111", (String) null, (List) null, (double) AnonymousClass7TE.A04(obj), 16374, 0)));
            }
            throw AnonymousClass7TE.A0y();
        } catch (IllegalStateException e) {
            return Pxg.A0Q(e);
        }
    }
}

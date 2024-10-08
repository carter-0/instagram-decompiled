package X;

import android.os.Build;
import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.OdinContext;
import com.facebook.odin.model.Type;
import java.util.List;
import java.util.Map;

/* renamed from: X.So4  reason: case insensitive filesystem */
public final class C12154So4 implements C258943zt {
    public static final String A00;
    public static final Map A01 = 0Yt.A06(new 0eP[]{AnonymousClass7TE.A1L("samsung", Float.valueOf(1.0f)), AnonymousClass7TE.A1L("xiaomi", Float.valueOf(2.0f)), AnonymousClass7TE.A1L("vivo", Float.valueOf(3.0f)), AnonymousClass7TE.A1L("motorola", Float.valueOf(4.0f)), AnonymousClass7TE.A1L("oppo", Float.valueOf(5.0f)), AnonymousClass7TE.A1L("realme", Float.valueOf(6.0f)), AnonymousClass7TE.A1L("huawei", Float.valueOf(7.0f)), AnonymousClass7TE.A1L("oneplus", Float.valueOf(8.0f)), AnonymousClass7TE.A1L("google", Float.valueOf(9.0f)), AnonymousClass7TE.A1L("honor", Float.valueOf(10.0f)), AnonymousClass7TE.A1L("infinix", Float.valueOf(11.0f)), AnonymousClass7TE.A1L("infinix mobility limited", Float.valueOf(12.0f)), AnonymousClass7TE.A1L("tecno mobile limited", Float.valueOf(13.0f))});

    public final String getId() {
        return "ManufacturerIdSource";
    }

    static {
        String str = Build.MANUFACTURER;
        0qQ.A08(str);
        A00 = AnonymousClass7TF.A0j(str);
    }

    public final AnonymousClass40G ATg(OdinContext odinContext) {
        double d;
        C255463uA[] r0 = FeatureData.A0E;
        Number A14 = C51966G9m.A14(A00, A01);
        if (A14 != null) {
            d = (double) A14.floatValue();
        } else {
            d = 0.0d;
        }
        return Pxf.A0M(AnonymousClass7TE.A1I(new FeatureData((Type) null, "4294", (String) null, (List) null, d, 16374, 0)));
    }
}

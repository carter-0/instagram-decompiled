package X;

import android.os.Bundle;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.FBs  reason: case insensitive filesystem */
public abstract class C49891FBs {
    public static final Bundle A00(IgBloksScreenConfig igBloksScreenConfig, C46649DiU diU) {
        IgBloksScreenConfig igBloksScreenConfig2 = igBloksScreenConfig;
        0qQ.A0B(igBloksScreenConfig, 1);
        boolean booleanValue = C46648DiT.A00(igBloksScreenConfig.A0B).booleanValue();
        Bundle A0a = AnonymousClass7TE.A0a();
        C46649DiU diU2 = diU;
        Map map = diU2.A07;
        new ArrayList();
        Map map2 = diU2.A0B;
        int i = diU2.A00;
        List list = diU2.A09;
        String str = diU2.A05;
        String str2 = diU2.A06;
        C276544tV r6 = diU2.A03;
        C46645DiQ.A02(A0a, new C46645DiQ(diU2.A02, r6, diU2.A08, str, str2, (HashMap) map, list, diU2.A0A, map2, map2, i, false), booleanValue);
        IgBloksScreenConfig.A04(A0a, igBloksScreenConfig2, false);
        DbW.A0w(A0a, igBloksScreenConfig2.A0B);
        return A0a;
    }

    public static final C46622Di2 A01(IgBloksScreenConfig igBloksScreenConfig, C46649DiU diU) {
        0qQ.A0B(igBloksScreenConfig, 1);
        Bundle A00 = A00(igBloksScreenConfig, diU);
        C46622Di2 di2 = new C46622Di2();
        di2.setArguments(A00);
        return di2;
    }

    public static final AnonymousClass3M3 A02(IgBloksScreenConfig igBloksScreenConfig, C46649DiU diU) {
        0qQ.A0B(igBloksScreenConfig, 1);
        AnonymousClass3M3 r1 = new AnonymousClass3M3();
        r1.setArguments(A00(igBloksScreenConfig, diU));
        return r1;
    }
}

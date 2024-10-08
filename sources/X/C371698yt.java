package X;

import android.content.Context;
import com.facebook.cameracore.audiograph.AudioGraphClientProvider;
import com.facebook.cameracore.mediapipeline.featureconfig.ProductFeatureConfig;
import com.facebook.cameracore.mediapipeline.services.networking.interfaces.NetworkPolicyConfiguration;
import com.facebook.cameracore.musiceffect.AudioServiceConfigurationAnnouncer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.8yt  reason: invalid class name and case insensitive filesystem */
public final class C371698yt {
    public Map A00;
    public final C372158zq A01;
    public final C372168zr A02;
    public final C371978zS A03;
    public final C372128zj A04;
    public final ProductFeatureConfig A05;
    public final C371718yv A06;
    public final NetworkPolicyConfiguration A07;
    public final HashMap A08;

    public static C371708yu A00(Context context, boolean z) {
        C371708yu r2 = new C371708yu();
        if (z) {
            r2.A05 = new C371718yv(context, (AudioGraphClientProvider) null, (AudioServiceConfigurationAnnouncer) null, false);
        }
        return r2;
    }

    public static boolean A01(C371698yt r0, Object obj) {
        return r0.A08.containsKey(obj);
    }

    public final C371618yh A02(C371628yi r3) {
        C371618yh r0 = (C371618yh) this.A08.get(r3);
        if (r0 != null) {
            return r0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid configuration key: ");
        sb.append(r3);
        sb.append(" Please use hasConfiguration() to check if the configuration is available.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final ArrayList A03(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            HashMap hashMap = this.A08;
            if (hashMap.containsKey(next)) {
                arrayList.add(((C371618yh) hashMap.get(next)).A00());
            }
        }
        return arrayList;
    }

    public C371698yt(C371708yu r3) {
        HashMap hashMap = new HashMap();
        this.A08 = hashMap;
        hashMap.putAll(r3.A08);
        this.A01 = r3.A00;
        this.A00 = r3.A07;
        this.A04 = r3.A03;
        this.A02 = r3.A01;
        this.A05 = r3.A04;
        this.A03 = r3.A02;
        this.A06 = r3.A05;
        this.A07 = r3.A06;
    }
}

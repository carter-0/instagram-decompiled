package X;

import com.facebook.cameracore.mediapipeline.featureconfig.ProductFeatureConfig;
import com.facebook.cameracore.mediapipeline.services.networking.interfaces.NetworkPolicyConfiguration;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.8yu  reason: invalid class name and case insensitive filesystem */
public final class C371708yu {
    public C372158zq A00;
    public C372168zr A01;
    public C371978zS A02;
    public C372128zj A03;
    public ProductFeatureConfig A04;
    public C371718yv A05;
    public NetworkPolicyConfiguration A06;
    public Map A07;
    public final HashMap A08;

    public final void A00(C371628yi r2, C371618yh r3) {
        HashMap hashMap = this.A08;
        if (r3 == null) {
            hashMap.remove(r2);
        } else {
            hashMap.put(r2, r3);
        }
    }

    public final void A01(C39674A4o a4o) {
        this.A07.put(a4o.A00, a4o);
    }

    public C371708yu(C371698yt r3) {
        HashMap hashMap = new HashMap();
        this.A08 = hashMap;
        this.A07 = new HashMap();
        hashMap.putAll(r3.A08);
        this.A00 = r3.A01;
        this.A07 = r3.A00;
        this.A03 = r3.A04;
        this.A01 = r3.A02;
        this.A04 = r3.A05;
        this.A02 = r3.A03;
        this.A05 = r3.A06;
        this.A06 = r3.A07;
    }

    public C371708yu() {
        this.A08 = new HashMap();
        this.A07 = new HashMap();
    }
}

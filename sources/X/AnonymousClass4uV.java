package X;

import android.content.res.AssetManager;
import com.facebook.hyperthrift.HyperThriftBase;
import com.facebook.hyperthrift.reflect.GeneratedHyperThriftClassLookup;

/* renamed from: X.4uV  reason: invalid class name */
public final class AnonymousClass4uV {
    public final S17 A00;
    public final GeneratedHyperThriftClassLookup A01;

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.hyperthrift.reflect.GeneratedHyperThriftClassLookup, java.lang.Object] */
    public AnonymousClass4uV(AssetManager assetManager) {
        C10207RoO roO = new C10207RoO(assetManager);
        ? obj = new Object();
        this.A00 = new S17(roO);
        this.A01 = obj;
    }

    public final HyperThriftBase A00(AnonymousClass46C r4, String str) {
        return C21999Xq7.A00(new C21999Xq7(this.A00, this.A01, r4), str);
    }

    public final void A01(HyperThriftBase hyperThriftBase, AnonymousClass46C r4, String str) {
        C21998Xq6.A00(hyperThriftBase, new C21998Xq6(this.A00, r4), str);
    }
}

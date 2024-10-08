package X;

import android.content.Context;
import android.content.res.AssetManager;

/* renamed from: X.8o1  reason: invalid class name and case insensitive filesystem */
public final class C365998o1 {
    public final /* synthetic */ AssetManager A00;
    public final /* synthetic */ boolean A01;

    public C365998o1(AssetManager assetManager, boolean z) {
        this.A00 = assetManager;
        this.A01 = z;
    }

    public static C365998o1 A00(Context context, boolean z) {
        AssetManager assets = context.getAssets();
        0qQ.A07(assets);
        return new C365998o1(assets, z);
    }
}

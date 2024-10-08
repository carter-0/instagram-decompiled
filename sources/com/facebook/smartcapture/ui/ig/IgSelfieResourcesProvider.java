package com.facebook.smartcapture.ui.ig;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass11c;
import X.C10973S3g;
import X.C13582Td8;
import X.C13722Tfo;
import X.C13857Tic;
import X.C249363jc;
import X.C7933Qd5;
import X.Q6K;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.facebook.smartcapture.resources.ResourcesProvider;

public class IgSelfieResourcesProvider extends C10973S3g implements ResourcesProvider {
    public static final Parcelable.Creator CREATOR = C10973S3g.A00(IgSelfieResourcesProvider.class);
    public Resources A00;

    /* JADX WARNING: type inference failed for: r0v1, types: [X.Tic, java.lang.Object] */
    public final C13857Tic Az2() {
        if (this instanceof XMDSIgSelfieResourcesProvider) {
            return new C7933Qd5();
        }
        return new Object();
    }

    public final Resources Bng() {
        Resources resources = this.A00;
        if (resources != null) {
            return resources;
        }
        0qQ.A0F("resources");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void CN1(Context context) {
        Resources resources;
        C249363jc A01 = AnonymousClass11c.A00().A01();
        if (context instanceof C13722Tfo) {
            C13722Tfo tfo = (C13722Tfo) context;
            if (!tfo.BEc().isEmpty()) {
                C13582Td8 C1r = tfo.C1r();
                AssetManager assets = A01.getAssets();
                0qQ.A07(assets);
                DisplayMetrics displayMetrics = A01.getDisplayMetrics();
                0qQ.A07(displayMetrics);
                Configuration configuration = A01.getConfiguration();
                0qQ.A07(configuration);
                resources = new Q6K(assets, configuration, A01, displayMetrics, C1r, tfo.BEc());
                this.A00 = resources;
            }
        }
        resources = A01;
        this.A00 = resources;
    }
}

package com.instagram.wellbeing.idverification.fragment;

import X.0qQ;
import X.AnonymousClass11c;
import X.AnonymousClass7TE;
import X.C10973S3g;
import X.C13582Td8;
import X.C13722Tfo;
import X.C13857Tic;
import X.C249363jc;
import X.Q6K;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.facebook.smartcapture.resources.ResourcesProvider;
import java.util.Map;

public final class IgIdCaptureResourcesProvider extends C10973S3g implements ResourcesProvider {
    public static final Parcelable.Creator CREATOR = C10973S3g.A00(IgIdCaptureResourcesProvider.class);
    public Resources A00;
    public C13857Tic A01;

    public final C13857Tic Az2() {
        C13857Tic tic = this.A01;
        if (tic != null) {
            return tic;
        }
        throw AnonymousClass7TE.A0z("DrawableProvider not initialized, call initialize(context) first");
    }

    public final Resources Bng() {
        return this.A00;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Tic, java.lang.Object] */
    public final void CN1(Context context) {
        this.A01 = new Object();
        C249363jc A012 = AnonymousClass11c.A00().A01();
        if (context instanceof C13722Tfo) {
            C13722Tfo tfo = (C13722Tfo) context;
            Map BEc = tfo.BEc();
            if (!BEc.isEmpty()) {
                C13582Td8 C1r = tfo.C1r();
                AssetManager assets = A012.getAssets();
                0qQ.A07(assets);
                DisplayMetrics displayMetrics = A012.getDisplayMetrics();
                0qQ.A07(displayMetrics);
                Configuration configuration = A012.getConfiguration();
                0qQ.A07(configuration);
                this.A00 = new Q6K(assets, configuration, A012, displayMetrics, C1r, BEc);
                return;
            }
        }
        this.A00 = A012;
    }
}

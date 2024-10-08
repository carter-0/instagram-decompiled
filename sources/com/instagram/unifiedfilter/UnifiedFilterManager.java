package com.instagram.unifiedfilter;

import X.0Tu;
import X.0dV;
import X.182;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C51966G9m;
import X.C63467KxW;
import android.content.res.AssetManager;
import android.os.Looper;
import android.view.Surface;
import com.facebook.jni.HybridData;
import com.instagram.common.session.UserSession;
import java.util.UUID;

public final class UnifiedFilterManager {
    public static final C63467KxW Companion = new Object();
    public final int id = UUID.randomUUID().hashCode();
    public final HybridData mHybridData = initHybrid();

    private final native void addOverlay(int i, int i2, String str, boolean z, float[] fArr, int i3);

    private final native void cleanup(int i);

    private final native String[] getAllFilterIds(int i);

    private final native int getInputTextureId(int i);

    private final native void init(int i, AssetManager assetManager, Surface surface, boolean z);

    public static final native HybridData initHybrid();

    private final native void initVideoInput(int i, int i2, int i3, boolean z);

    private final native void present(int i);

    private final native void render(int i, boolean z);

    private final native void renderAt(int i, long j, boolean z);

    private final native void setBoolParameter(int i, int i2, String str, boolean z);

    private final native void setFilter(int i, int i2, String str);

    private final native void setFilterEnabled(int i, int i2, boolean z);

    private final native void setFilterOutputSize(int i, int i2, int i3, int i4);

    private final native void setFiltersEnabled(int i, int[] iArr, int i2);

    private final native void setInputImage(int i, String str, int i2);

    private final native boolean setInputTexture(int i, int i2, int i3, int i4, int i5);

    private final native void setIntParameter(int i, int i2, String str, int i3);

    private final native void setIntVectorParameter(int i, int i2, String str, int[] iArr);

    private final native void setIsOnscreenRender(int i, boolean z);

    private final native void setOutput(int i, int i2, int i3, int i4, int i5);

    private final native void setOverlayImage(int i, int i2, String str, int i3);

    private final native void setParameter(int i, int i2, String str, float[] fArr, int i3);

    private final native void setSplitScreenLeftFilter(int i, int i2, String str);

    private final native void setSplitScreenRightFilter(int i, int i2, String str);

    private final native void setStringParameter(int i, int i2, String str, String str2);

    private final native void setSurface(int i, Surface surface);

    public final void addOverlay(int i, String str, boolean z, float[] fArr, int i2) {
        AnonymousClass7TG.A1P(str, fArr);
        addOverlay(this.id, i, str, false, fArr, 12);
    }

    public final void render(boolean z) {
        render(this.id, true);
    }

    public final boolean setInputTexture(int i, int i2, int i3, int i4) {
        return setInputTexture(this.id, i, i2, i3, i4);
    }

    public final void setOutput(int i, int i2, int i3, int i4) {
        setOutput(this.id, i, i2, i3, i4);
    }

    public final void setParameter(int i, String str, float[] fArr, int i2) {
        setParameter(this.id, i, str, fArr, i2);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.KxW] */
    static {
        if (C51966G9m.A1a(Looper.myLooper(), Looper.getMainLooper())) {
            0dV.A0C("unifiedfilter");
            return;
        }
        throw AnonymousClass7TE.A0z("unifiedfilter library should not be loaded in the UI thread");
    }

    public final void cleanup() {
        cleanup(this.id);
    }

    public final void setFilter(int i, String str) {
        setFilter(this.id, i, str);
    }

    public final void setFilterEnabled(int i, boolean z) {
        setFilterEnabled(this.id, i, z);
    }

    public final void setFilterOutputSize(int i, int i2, int i3) {
        setFilterOutputSize(this.id, i, i2, i3);
    }

    public final void setIsOnscreenRender(boolean z) {
        setIsOnscreenRender(this.id, z);
    }

    public final void setSurface(Surface surface) {
        setSurface(this.id, surface);
    }

    public final void init(UserSession userSession, AssetManager assetManager, Surface surface) {
        AnonymousClass7TG.A1N(userSession, assetManager);
        init(this.id, assetManager, surface, 182.A06(0Tu.A05, userSession, 36316254885122235L));
    }

    public final void setParameter(int i, String str, int i2) {
        setIntParameter(this.id, i, str, i2);
    }
}

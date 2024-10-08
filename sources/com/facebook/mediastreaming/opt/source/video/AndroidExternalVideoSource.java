package com.facebook.mediastreaming.opt.source.video;

import X.002;
import X.0dV;
import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C10401Rrd;
import X.C12136Sng;
import X.C16719V3c;
import X.C20826X0a;
import X.C51967G9n;
import X.V67;
import X.Y9L;
import android.util.Pair;
import com.facebook.jni.HybridData;
import com.facebook.mediastreaming.opt.common.StreamingHybridClassBase;
import com.facebook.mediastreaming.opt.common.SurfaceHolder;
import com.facebook.mediastreaming.opt.source.SurfaceTextureHolder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class AndroidExternalVideoSource extends StreamingHybridClassBase implements Y9L {
    public static final V67 Companion = new Object();
    public static final String TAG = 002.A0R("mss:", "AndroidExternalVideoSource");
    public C20826X0a frameSchedulerFactory;
    public int height;
    public int outputFrameRate;
    public final Map outputSurfaces = new HashMap();
    public boolean started;
    public AndroidVideoInput videoInput;
    public int width;

    private final native void onFrameDrawn(int i, long j, int i2, int i3);

    public void onVideoInputFrameAvailable(int i, long j) {
        if (this.started) {
            onFrameDrawn(i, j, this.width, this.height);
        }
    }

    public final void setVideoInput(AndroidVideoInput androidVideoInput) {
        0qQ.A0B(androidVideoInput, 0);
        this.videoInput = androidVideoInput;
        androidVideoInput.setErrorListener(this);
        this.frameSchedulerFactory = androidVideoInput.getFrameSchedulerFactory();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.V67] */
    static {
        0dV.A0C("mediastreaming");
    }

    private final void ensureSurfaceOutput() {
        boolean z = this.started;
        HashMap hashMap = new HashMap(this.outputSurfaces);
        AndroidVideoInput androidVideoInput = this.videoInput;
        if (androidVideoInput != null) {
            if (!androidVideoInput.enableCaptureRenderer()) {
                Iterator A0u = AnonymousClass7TF.A0u(this.outputSurfaces);
                while (A0u.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                    androidVideoInput.setOutputSurface(AnonymousClass7TE.A0M(A1J.getKey()), ((C16719V3c) A1J.getValue()).A02);
                }
            } else if (!hashMap.isEmpty()) {
                new C12136Sng(new C10401Rrd(this, hashMap), this.width, this.height);
                throw new IllegalStateException("Required value was null.");
            }
            if (z) {
                start();
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARNING: type inference failed for: r0v21, types: [java.lang.Object, X.V3c] */
    public final void setOutputSurface(int i, SurfaceHolder surfaceHolder, int i2, int i3, boolean z, boolean z2) {
        Map map = this.outputSurfaces;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            Map map2 = this.outputSurfaces;
            ? obj = new Object();
            obj.A02 = surfaceHolder;
            obj.A01 = i2;
            obj.A00 = i3;
            map2.put(valueOf, obj);
        } else {
            C16719V3c v3c = (C16719V3c) this.outputSurfaces.get(valueOf);
            if (v3c != null) {
                v3c.A02 = surfaceHolder;
                if (surfaceHolder != null) {
                    v3c.A01 = i2;
                    v3c.A00 = i3;
                }
            }
        }
        long j = 0;
        Integer A0k = C51967G9n.A0k();
        Pair create = Pair.create(A0k, A0k);
        Iterator A0v = AnonymousClass7TF.A0v(this.outputSurfaces);
        while (A0v.hasNext()) {
            C16719V3c v3c2 = (C16719V3c) A0v.next();
            int i4 = v3c2.A01;
            int i5 = v3c2.A00;
            long j2 = ((long) i4) * ((long) i5);
            if (j2 > j) {
                create = Pair.create(Integer.valueOf(i4), Integer.valueOf(i5));
                j = j2;
            }
        }
        Object obj2 = create.first;
        0qQ.A06(obj2);
        int A0M = AnonymousClass7TE.A0M(obj2);
        Object obj3 = create.second;
        0qQ.A06(obj3);
        setVideoConfig(A0M, AnonymousClass7TE.A0M(obj3), this.outputFrameRate);
        if (this.started) {
            AndroidVideoInput androidVideoInput = this.videoInput;
            if (androidVideoInput == null) {
                throw AnonymousClass7TE.A0y();
            } else if (androidVideoInput.enableCaptureRenderer()) {
                Number number = (Number) create.first;
                if (number != null) {
                    number.intValue();
                }
                ensureSurfaceOutput();
            } else {
                androidVideoInput.setOutputSurface(i, surfaceHolder);
            }
        }
    }

    public final void setVideoConfig(int i, int i2, int i3) {
        this.width = i;
        this.height = i2;
        this.outputFrameRate = i3;
    }

    public final void stop() {
        AndroidVideoInput androidVideoInput = this.videoInput;
        if (androidVideoInput != null) {
            androidVideoInput.stopRenderingToOutput();
            androidVideoInput.setOutputSurface((SurfaceTextureHolder) null, false);
            this.outputSurfaces.clear();
            this.started = false;
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void uninitialize() {
        AndroidVideoInput androidVideoInput = this.videoInput;
        if (androidVideoInput != null) {
            androidVideoInput.removeErrorListener(this);
        }
    }

    public AndroidExternalVideoSource(HybridData hybridData) {
        super(hybridData);
    }

    public final void pause() {
        stop();
    }

    public final void pauseOutput(int i) {
        Integer valueOf = Integer.valueOf(i);
        if (this.outputSurfaces.containsKey(valueOf)) {
            this.outputSurfaces.get(valueOf);
            AndroidVideoInput androidVideoInput = this.videoInput;
            if (androidVideoInput != null) {
                androidVideoInput.pauseOutputSurface(i);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final void resume() {
        start();
    }

    public final void resumeOutput(int i) {
        Integer valueOf = Integer.valueOf(i);
        if (this.outputSurfaces.containsKey(valueOf)) {
            this.outputSurfaces.get(valueOf);
            AndroidVideoInput androidVideoInput = this.videoInput;
            if (androidVideoInput != null) {
                androidVideoInput.resumeOutputSurface(i);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final void start() {
        ensureSurfaceOutput();
        AndroidVideoInput androidVideoInput = this.videoInput;
        if (androidVideoInput != null) {
            androidVideoInput.startRenderingToOutput();
            this.started = true;
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}

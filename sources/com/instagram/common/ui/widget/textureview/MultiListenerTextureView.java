package com.instagram.common.ui.widget.textureview;

import X.0qQ;
import X.AnonymousClass4X5;
import X.AnonymousClass4X6;
import X.C20565Wui;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView;
import com.instagram.ui.widget.drawing.gl.GLDrawingView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class MultiListenerTextureView extends TextureView implements TextureView.SurfaceTextureListener, AnonymousClass4X5 {
    public AnonymousClass4X6 A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MultiListenerTextureView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public final void A02(TextureView.SurfaceTextureListener surfaceTextureListener) {
        0qQ.A0B(surfaceTextureListener, 0);
        this.A00.A00.add(surfaceTextureListener);
    }

    public final void setDelegate(AnonymousClass4X6 r2) {
        0qQ.A0B(r2, 0);
        this.A00 = r2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:15|16|17|18|32|27|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x001c, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x002c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r5 = this;
            boolean r0 = r5 instanceof com.instagram.ui.widget.drawing.gl.GLDrawingView
            if (r0 == 0) goto L_0x0040
            r4 = r5
            com.instagram.ui.widget.drawing.gl.GLDrawingView r4 = (com.instagram.ui.widget.drawing.gl.GLDrawingView) r4
            r4.A03()
            X.Wui r3 = r4.A05
            if (r3 == 0) goto L_0x0038
            X.VuH r2 = com.instagram.ui.widget.drawing.gl.GLDrawingView.A0I
            monitor-enter(r2)
            r1 = 0
            r3.A08 = r1     // Catch:{ all -> 0x0034 }
            r0 = 1
            r3.A09 = r0     // Catch:{ all -> 0x0034 }
            r3.A07 = r1     // Catch:{ all -> 0x0034 }
            r2.notifyAll()     // Catch:{ all -> 0x0034 }
        L_0x001c:
            boolean r0 = r3.A01     // Catch:{ all -> 0x0034 }
            if (r0 != 0) goto L_0x0037
            boolean r0 = r3.A06     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x0037
            boolean r0 = r3.A07     // Catch:{ all -> 0x0034 }
            if (r0 != 0) goto L_0x0037
            r2.wait()     // Catch:{ InterruptedException -> 0x002c }
            goto L_0x001c
        L_0x002c:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0034 }
            r0.interrupt()     // Catch:{ all -> 0x0034 }
            goto L_0x001c
        L_0x0034:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0037:
            monitor-exit(r2)
        L_0x0038:
            X.Wq6 r1 = r4.A0E
            r0 = 0
            r1.A09 = r0
            r4.A07 = r0
            return
        L_0x0040:
            X.4X6 r0 = r5.A00
            r0.A01()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.widget.textureview.MultiListenerTextureView.A01():void");
    }

    public final AnonymousClass4X6 getDelegate() {
        return this.A00;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:15|16|17|18|40|35|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x001a, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x002a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSurfaceTextureAvailable(android.graphics.SurfaceTexture r5, int r6, int r7) {
        /*
            r4 = this;
            boolean r0 = r4 instanceof com.instagram.ui.widget.drawing.gl.GLDrawingView
            if (r0 == 0) goto L_0x0037
            r0 = r4
            com.instagram.ui.widget.drawing.gl.GLDrawingView r0 = (com.instagram.ui.widget.drawing.gl.GLDrawingView) r0
            r3 = 0
            X.0qQ.A0B(r5, r3)
            X.Wui r2 = r0.A05
            if (r2 == 0) goto L_0x0088
            X.VuH r1 = com.instagram.ui.widget.drawing.gl.GLDrawingView.A0I
            monitor-enter(r1)
            r0 = 1
            r2.A03 = r0     // Catch:{ all -> 0x0034 }
            r2.A02 = r3     // Catch:{ all -> 0x0034 }
            r1.notifyAll()     // Catch:{ all -> 0x0034 }
        L_0x001a:
            boolean r0 = r2.A0B     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x0032
            boolean r0 = r2.A02     // Catch:{ all -> 0x0034 }
            if (r0 != 0) goto L_0x0032
            boolean r0 = r2.A01     // Catch:{ all -> 0x0034 }
            if (r0 != 0) goto L_0x0032
            r1.wait()     // Catch:{ InterruptedException -> 0x002a }
            goto L_0x001a
        L_0x002a:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0034 }
            r0.interrupt()     // Catch:{ all -> 0x0034 }
            goto L_0x001a
        L_0x0032:
            monitor-exit(r1)
            return
        L_0x0034:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0037:
            r0 = 0
            X.0qQ.A0B(r5, r0)
            X.4X6 r0 = r4.A00     // Catch:{ RuntimeException -> 0x0041 }
            r0.onSurfaceTextureAvailable(r5, r6, r7)     // Catch:{ RuntimeException -> 0x0041 }
            return
        L_0x0041:
            r3 = move-exception
            android.content.Context r1 = r4.getContext()
            boolean r0 = r1 instanceof android.app.Activity
            r2 = 0
            if (r0 == 0) goto L_0x0057
            android.app.Activity r1 = (android.app.Activity) r1
            if (r1 == 0) goto L_0x0057
            boolean r0 = r1.isFinishing()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        L_0x0057:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r3.getMessage()
            r1.append(r0)
            java.lang.String r0 = ", width: "
            r1.append(r0)
            r1.append(r6)
            r0 = 2020(0x7e4, float:2.83E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ", activity is finishing: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "MultiListenerTextureView_onSurfaceTextureAvailable()"
            X.0wb.A06(r0, r1, r3)
        L_0x0088:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.widget.textureview.MultiListenerTextureView.onSurfaceTextureAvailable(android.graphics.SurfaceTexture, int, int):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:12|13|14|15|26|22|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0017, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0023 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture r4) {
        /*
            r3 = this;
            boolean r0 = r3 instanceof com.instagram.ui.widget.drawing.gl.GLDrawingView
            if (r0 == 0) goto L_0x0031
            r1 = r3
            com.instagram.ui.widget.drawing.gl.GLDrawingView r1 = (com.instagram.ui.widget.drawing.gl.GLDrawingView) r1
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.Wui r2 = r1.A05
            if (r2 == 0) goto L_0x002f
            X.VuH r1 = com.instagram.ui.widget.drawing.gl.GLDrawingView.A0I
            monitor-enter(r1)
            r2.A03 = r0     // Catch:{ all -> 0x002b }
            r1.notifyAll()     // Catch:{ all -> 0x002b }
        L_0x0017:
            boolean r0 = r2.A0B     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x002e
            boolean r0 = r2.A01     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x002e
            r1.wait()     // Catch:{ InterruptedException -> 0x0023 }
            goto L_0x0017
        L_0x0023:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x002b }
            r0.interrupt()     // Catch:{ all -> 0x002b }
            goto L_0x0017
        L_0x002b:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x002e:
            monitor-exit(r1)
        L_0x002f:
            r0 = 1
            return r0
        L_0x0031:
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.4X6 r0 = r3.A00
            boolean r0 = r0.onSurfaceTextureDestroyed(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.widget.textureview.MultiListenerTextureView.onSurfaceTextureDestroyed(android.graphics.SurfaceTexture):boolean");
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this instanceof GLDrawingView) {
            0qQ.A0B(surfaceTexture, 0);
            C20565Wui wui = ((GLDrawingView) this).A05;
            if (wui != null) {
                wui.A06(i, i2);
                return;
            }
            return;
        }
        0qQ.A0B(surfaceTexture, 0);
        this.A00.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (!(this instanceof GLDrawingView)) {
            0qQ.A0B(surfaceTexture, 0);
            this.A00.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    public final void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        throw new UnsupportedOperationException("Use addSurfaceTextureListener instead. If you only have one listener, you shouldn't be using this custom view.");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiListenerTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A00 = new AnonymousClass4X6((AnonymousClass4X6) null);
        super.setSurfaceTextureListener(this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MultiListenerTextureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MultiListenerTextureView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}

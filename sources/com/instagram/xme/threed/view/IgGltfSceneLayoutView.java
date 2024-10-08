package com.instagram.xme.threed.view;

import X.05G;
import X.0qQ;
import X.106;
import X.19B;
import X.1Eo;
import X.AnonymousClass05K;
import X.AnonymousClass07Z;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass0xx;
import X.AnonymousClass4D7;
import X.AnonymousClass6WO;
import X.C11446SVi;
import X.C20866X1s;
import X.C22543Y8q;
import X.C226632hb;
import X.C315726kR;
import X.C315736kS;
import X.C315746kT;
import X.C315796kZ;
import X.C60240fb;
import X.C71362ch;
import X.C71772f0;
import X.C72988PRx;
import X.C8836RBw;
import X.LWi;
import X.MGC;
import X.MGL;
import X.MM2;
import android.content.Context;
import android.hardware.SensorManager;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.xme.threed.repository.Xme3dMediaRepository;

public final class IgGltfSceneLayoutView extends IgFrameLayout {
    public static final AnonymousClass0iw A0D = new C315736kS();
    public static final C226632hb A0E = C315726kR.A00;
    public RoundedCornerFrameLayout A00;
    public C20866X1s A01;
    public C72988PRx A02;
    public IgGltfSceneTextureView A03;
    public Integer A04;
    public 05G A05 = 106.A01((Object) null);
    public IgImageView A06;
    public SpinnerImageView A07;
    public C22543Y8q A08;
    public Integer A09;
    public final Object A0A = new Object();
    public final C315746kT A0B = new C315746kT(this);
    public final Object A0C = new Object();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgGltfSceneLayoutView(Context context) {
        super(context);
        0qQ.A0B(context, 1);
        Integer num = AnonymousClass05K.A00;
        this.A09 = num;
        this.A04 = num;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.ig_gltf_scene_layout, this);
        this.A00 = (RoundedCornerFrameLayout) requireViewById(R.id.rounded_corner_layout);
        this.A03 = (IgGltfSceneTextureView) requireViewById(R.id.scene_tex_view);
        IgImageView findViewById = inflate.findViewById(R.id.preview_image);
        this.A06 = findViewById;
        findViewById.setImageRendererAndReset(A0E);
        this.A07 = (SpinnerImageView) inflate.findViewById(R.id.loading_spinner);
        setCornerRadius(0);
        A00(this, this.A09);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008a, code lost:
        if (r6 != X.AnonymousClass05K.A0C) goto L_0x008c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized void A00(com.instagram.xme.threed.view.IgGltfSceneLayoutView r5, java.lang.Integer r6) {
        /*
            monitor-enter(r5)
            java.lang.Integer r0 = r5.A09     // Catch:{ all -> 0x008e }
            if (r6 == r0) goto L_0x008c
            r5.A09 = r6     // Catch:{ all -> 0x008e }
            int r2 = r6.intValue()     // Catch:{ all -> 0x008e }
            r4 = 0
            r1 = 0
            r3 = 8
            if (r2 == r4) goto L_0x0040
            r0 = 1
            if (r2 == r0) goto L_0x0030
            r0 = 2
            if (r2 == r0) goto L_0x0050
            r0 = 3
            if (r2 != r0) goto L_0x002a
            com.instagram.xme.threed.view.IgGltfSceneTextureView r0 = r5.A03     // Catch:{ all -> 0x008e }
            r0.setAlpha(r1)     // Catch:{ all -> 0x008e }
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r5.A06     // Catch:{ all -> 0x008e }
            r0.setVisibility(r3)     // Catch:{ all -> 0x008e }
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r5.A07     // Catch:{ all -> 0x008e }
            r0.setVisibility(r3)     // Catch:{ all -> 0x008e }
            goto L_0x0061
        L_0x002a:
            X.Wub r0 = new X.Wub     // Catch:{ all -> 0x008e }
            r0.<init>()     // Catch:{ all -> 0x008e }
            throw r0     // Catch:{ all -> 0x008e }
        L_0x0030:
            com.instagram.xme.threed.view.IgGltfSceneTextureView r0 = r5.A03     // Catch:{ all -> 0x008e }
            r0.setAlpha(r1)     // Catch:{ all -> 0x008e }
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r5.A06     // Catch:{ all -> 0x008e }
            r0.setVisibility(r4)     // Catch:{ all -> 0x008e }
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r5.A07     // Catch:{ all -> 0x008e }
            r0.setVisibility(r4)     // Catch:{ all -> 0x008e }
            goto L_0x0061
        L_0x0040:
            com.instagram.xme.threed.view.IgGltfSceneTextureView r0 = r5.A03     // Catch:{ all -> 0x008e }
            r0.setAlpha(r1)     // Catch:{ all -> 0x008e }
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r5.A06     // Catch:{ all -> 0x008e }
            r0.setVisibility(r3)     // Catch:{ all -> 0x008e }
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r5.A07     // Catch:{ all -> 0x008e }
            r0.setVisibility(r3)     // Catch:{ all -> 0x008e }
            goto L_0x0061
        L_0x0050:
            com.instagram.xme.threed.view.IgGltfSceneTextureView r1 = r5.A03     // Catch:{ all -> 0x008e }
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)     // Catch:{ all -> 0x008e }
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r5.A06     // Catch:{ all -> 0x008e }
            r0.setVisibility(r3)     // Catch:{ all -> 0x008e }
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r5.A07     // Catch:{ all -> 0x008e }
            r0.setVisibility(r3)     // Catch:{ all -> 0x008e }
        L_0x0061:
            X.X1s r2 = r5.A01     // Catch:{ all -> 0x008e }
            if (r2 == 0) goto L_0x008c
            X.WgW r2 = (X.C19851WgW) r2     // Catch:{ all -> 0x008e }
            java.lang.Integer r0 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x008e }
            if (r6 != r0) goto L_0x0088
            X.6kx r1 = r2.A00     // Catch:{ all -> 0x008e }
            com.instagram.feed.widget.IgProgressImageView r0 = r1.BGP()     // Catch:{ all -> 0x008e }
            r0.setVisibility(r4)     // Catch:{ all -> 0x008e }
            com.instagram.xme.threed.view.IgGltfSceneLayoutView r0 = r1.A1s     // Catch:{ all -> 0x008e }
            r0.setVisibility(r3)     // Catch:{ all -> 0x008e }
        L_0x0079:
            X.VTK r0 = r2.A01     // Catch:{ all -> 0x008e }
            X.6a9 r1 = r0.A01     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x008c
            r0 = 1
            r1.A00 = r0     // Catch:{ all -> 0x008e }
            instagram.features.stories.fragment.ReelViewerFragment r0 = r1.A01     // Catch:{ all -> 0x008e }
            r0.EHd()     // Catch:{ all -> 0x008e }
            goto L_0x008c
        L_0x0088:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x008e }
            if (r6 == r0) goto L_0x0079
        L_0x008c:
            monitor-exit(r5)
            return
        L_0x008e:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.xme.threed.view.IgGltfSceneLayoutView.A00(com.instagram.xme.threed.view.IgGltfSceneLayoutView, java.lang.Integer):void");
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final void setUrl(String str, UserSession userSession, AnonymousClass6WO r19) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 1);
        AnonymousClass6WO r8 = r19;
        0qQ.A0B(r8, 2);
        05G r2 = this.A05;
        String str2 = str;
        if (!0qQ.A0K(str2, r2.getValue())) {
            C72988PRx pRx = new C72988PRx(userSession2, r8);
            this.A02 = pRx;
            this.A03.setErrorReportCallback(pRx);
            Xme3dMediaRepository xme3dMediaRepository = (Xme3dMediaRepository) userSession2.A01(Xme3dMediaRepository.class, MM2.A00);
            if (isAttachedToWindow()) {
                AnonymousClass07Z A002 = C71362ch.A00(this);
                if (A002 != null) {
                    AnonymousClass0xx A003 = C71772f0.A00(A002.getLifecycle());
                    1Eo.A05(19B.A00, new MGC((Object) xme3dMediaRepository, (Object) this, (AnonymousClass4D7) null, 26), A003);
                }
                AnonymousClass07Z A004 = C71362ch.A00(this);
                if (A004 != null) {
                    AnonymousClass0xx A005 = C71772f0.A00(A004.getLifecycle());
                    1Eo.A05(19B.A00, new MGL(userSession2, xme3dMediaRepository, r8, this, (AnonymousClass4D7) null, 5), A005);
                }
            } else {
                addOnAttachStateChangeListener(new LWi(this, userSession2, r8, xme3dMediaRepository, this));
            }
            r2.Epw(str2);
        }
    }

    public static final void A01(IgGltfSceneLayoutView igGltfSceneLayoutView, String str) {
        Handler handler;
        synchronized (igGltfSceneLayoutView.A0C) {
            C315796kZ r5 = igGltfSceneLayoutView.A03.A03;
            if (!0qQ.A0K(r5.A0B, str) || igGltfSceneLayoutView.A04 != AnonymousClass05K.A01) {
                Integer num = AnonymousClass05K.A00;
                if (num != igGltfSceneLayoutView.A04) {
                    A00(igGltfSceneLayoutView, AnonymousClass05K.A01);
                }
                igGltfSceneLayoutView.A04 = num;
                r5.A08 = num;
            } else {
                A00(igGltfSceneLayoutView, AnonymousClass05K.A0C);
            }
            if (!0qQ.A0K(r5.A0B, str)) {
                r5.A0B = null;
                r5.A0A = null;
                C8836RBw rBw = r5.A04;
                if (!(rBw == null || (handler = rBw.A02) == null)) {
                    handler.sendEmptyMessage(7);
                }
            }
            r5.A00();
            C315746kT r0 = igGltfSceneLayoutView.A0B;
            0qQ.A0B(r0, 0);
            r5.A06 = r0;
            Integer num2 = AnonymousClass05K.A00;
            synchronized (igGltfSceneLayoutView.A0A) {
                boolean z = !0qQ.A0K(r5.A09, str);
                r5.A09 = str;
                r5.A07 = num2;
                r5.A0B = str;
                if (z) {
                    r5.A03.A03 = false;
                }
                C8836RBw rBw2 = r5.A04;
                if (rBw2 != null) {
                    Handler handler2 = rBw2.A02;
                    if (handler2 == null) {
                        C315796kZ r1 = (C315796kZ) rBw2.A02.get();
                        if (r1 != null) {
                            r1.A0D = true;
                        }
                    } else {
                        handler2.sendEmptyMessage(9);
                    }
                } else {
                    r5.A0D = true;
                }
            }
        }
    }

    private final C315796kZ getGltfSceneRenderTarget() {
        return this.A03.A03;
    }

    public static /* synthetic */ void setUrl$default(IgGltfSceneLayoutView igGltfSceneLayoutView, String str, UserSession userSession, AnonymousClass6WO r4, int i, Object obj) {
        if ((i & 4) != 0) {
            r4 = AnonymousClass6WO.OTHER;
        }
        igGltfSceneLayoutView.setUrl(str, userSession, r4);
    }

    public final C22543Y8q getGltfSceneLoadedListener() {
        return null;
    }

    public final C20866X1s getSceneLayoutStateListener() {
        return this.A01;
    }

    public final void setCornerRadius(int i) {
        this.A00.setCornerRadius(i);
    }

    public final void setPreviewUrl(ImageUrl imageUrl) {
        if (imageUrl == null) {
            this.A06.A09();
        } else {
            this.A06.setUrl(imageUrl, A0D);
        }
    }

    public final void setRenderingEnabled(boolean z) {
        C315796kZ r2 = this.A03.A03;
        C8836RBw rBw = r2.A04;
        if (z) {
            if (rBw != null) {
                rBw.A01();
            }
        } else if (rBw != null) {
            rBw.A0H = true;
            C11446SVi sVi = rBw.A0E;
            SensorManager sensorManager = sVi.A01;
            if (sensorManager != null) {
                C60240fb.A00(sVi, sensorManager);
            }
        }
        r2.A0E = z;
    }

    public final void onAttachedToWindow() {
        Handler handler;
        int A062 = AnonymousClass0fD.A06(-1614890271);
        super.onAttachedToWindow();
        IgGltfSceneTextureView igGltfSceneTextureView = this.A03;
        C315796kZ r1 = igGltfSceneTextureView.A03;
        String str = r1.A0B;
        if (str != null) {
            r1.A0B = null;
            r1.A0A = null;
            C8836RBw rBw = r1.A04;
            if (!(rBw == null || (handler = rBw.A02) == null)) {
                handler.sendEmptyMessage(7);
            }
            A01(this, str);
            setRenderingEnabled(true);
            igGltfSceneTextureView.A00();
        }
        AnonymousClass0fD.A0D(-2112102913, A062);
    }

    public final void setGltfSceneLoadedListener(C22543Y8q y8q) {
        this.A08 = y8q;
    }

    public final void setSceneLayoutStateListener(C20866X1s x1s) {
        this.A01 = x1s;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgGltfSceneLayoutView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        0qQ.A0B(attributeSet, 2);
        Integer num = AnonymousClass05K.A00;
        this.A09 = num;
        this.A04 = num;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.ig_gltf_scene_layout, this);
        this.A00 = (RoundedCornerFrameLayout) requireViewById(R.id.rounded_corner_layout);
        this.A03 = (IgGltfSceneTextureView) requireViewById(R.id.scene_tex_view);
        IgImageView findViewById = inflate.findViewById(R.id.preview_image);
        this.A06 = findViewById;
        findViewById.setImageRendererAndReset(A0E);
        this.A07 = (SpinnerImageView) inflate.findViewById(R.id.loading_spinner);
        setCornerRadius(0);
        A00(this, this.A09);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgGltfSceneLayoutView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        0qQ.A0B(attributeSet, 2);
        Integer num = AnonymousClass05K.A00;
        this.A09 = num;
        this.A04 = num;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.ig_gltf_scene_layout, this);
        this.A00 = (RoundedCornerFrameLayout) requireViewById(R.id.rounded_corner_layout);
        this.A03 = (IgGltfSceneTextureView) requireViewById(R.id.scene_tex_view);
        IgImageView findViewById = inflate.findViewById(R.id.preview_image);
        this.A06 = findViewById;
        findViewById.setImageRendererAndReset(A0E);
        this.A07 = (SpinnerImageView) inflate.findViewById(R.id.loading_spinner);
        setCornerRadius(0);
        A00(this, this.A09);
    }
}

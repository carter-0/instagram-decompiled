package X;

import android.content.Context;
import android.view.View;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.cameracore.mediapipeline.dataproviders.location.interfaces.LocationDataProvider;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.8sn  reason: invalid class name and case insensitive filesystem */
public final class C368528sn extends AnonymousClass82G implements AnonymousClass0iw {
    public static final String __redex_internal_original_name = "PostCaptureARRenderControllerImpl";
    public int A00;
    public C361848gv A01;
    public C3497681r A02;
    public C367448ql A03;
    public C17703VcY A04;
    public Set A05;
    public int A06 = 0;
    public final AnonymousClass82S A07;
    public final C367648rL A08;
    public final AnonymousClass82N A09;
    public final AnonymousClass82P A0A;
    public final C312196dz A0B;
    public final AnonymousClass82T A0C;
    public final C367318qY A0D;
    public final UserSession A0E;
    public final Integer A0F;
    public final Set A0G = new CopyOnWriteArraySet(Collections.newSetFromMap(new WeakHashMap()));
    public final Set A0H = new CopyOnWriteArraySet(Collections.newSetFromMap(new WeakHashMap()));
    public final Set A0I = new CopyOnWriteArraySet(Collections.newSetFromMap(new WeakHashMap()));
    public final Context A0J;
    public final View A0K;
    public final AnonymousClass82I A0L = new C367358qc(this);
    public volatile CameraAREffect A0M;

    /* JADX WARNING: type inference failed for: r0v21, types: [java.lang.Object, X.MVB] */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c5, code lost:
        if (r3 != null) goto L_0x00c7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00fe  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00(com.instagram.camera.effect.models.CameraAREffect r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            com.instagram.camera.effect.models.CameraAREffect r6 = r7.A0M     // Catch:{ all -> 0x010d }
            if (r8 == 0) goto L_0x001c
            java.lang.String r5 = r8.A0K     // Catch:{ all -> 0x010d }
            boolean r0 = r5.isEmpty()     // Catch:{ NumberFormatException -> 0x001c }
            if (r0 != 0) goto L_0x001c
            long r3 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x001c }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x001c
            X.6dz r0 = r7.A0B     // Catch:{ all -> 0x010d }
            r0.CjU(r5)     // Catch:{ all -> 0x010d }
        L_0x001c:
            if (r6 == 0) goto L_0x002b
            boolean r0 = r6.equals(r8)     // Catch:{ all -> 0x010d }
            if (r0 != 0) goto L_0x002b
            X.6dz r1 = r7.A0B     // Catch:{ all -> 0x010d }
            java.lang.String r0 = r6.A0K     // Catch:{ all -> 0x010d }
            r1.EyC(r0)     // Catch:{ all -> 0x010d }
        L_0x002b:
            X.VcY r0 = r7.A04     // Catch:{ all -> 0x010d }
            if (r0 == 0) goto L_0x0034
            com.instagram.camera.effect.models.CameraAREffect r0 = r7.A0M     // Catch:{ all -> 0x010d }
            X.2PP.A00(r0, r8)     // Catch:{ all -> 0x010d }
        L_0x0034:
            com.instagram.camera.effect.models.CameraAREffect r2 = r7.A0M     // Catch:{ all -> 0x010d }
            java.util.Set r0 = r7.A0H     // Catch:{ all -> 0x010d }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x010d }
        L_0x003c:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x010d }
            if (r0 == 0) goto L_0x004c
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x010d }
            X.82E r0 = (X.AnonymousClass82E) r0     // Catch:{ all -> 0x010d }
            r0.DBe(r8, r2)     // Catch:{ all -> 0x010d }
            goto L_0x003c
        L_0x004c:
            r7.A0M = r8     // Catch:{ all -> 0x010d }
            monitor-exit(r7)     // Catch:{ all -> 0x010d }
            X.81r r4 = r7.A02
            X.8gv r0 = r7.A01
            if (r0 != 0) goto L_0x006a
            java.lang.String r1 = "PostCaptureARRenderControllerImpl"
            java.lang.String r0 = "mMQRenderer is null."
            X.0kD.A01(r1, r0)
            if (r4 == 0) goto L_0x0069
            if (r8 == 0) goto L_0x0069
            java.lang.String r2 = r8.A0K
            java.lang.String r1 = "renderer_is_null"
            java.lang.String r0 = "MQRenderer is null"
            r4.AVd(r2, r1, r0)
        L_0x0069:
            return
        L_0x006a:
            X.8ql r3 = r7.A03
            if (r8 == 0) goto L_0x00c5
            if (r3 == 0) goto L_0x00de
            java.lang.String r1 = r8.A0K
            java.lang.String r0 = r8.A0M
            boolean r0 = r3.CL7(r1, r0)
            if (r0 != 0) goto L_0x00c7
            if (r4 == 0) goto L_0x0083
            java.lang.String r1 = r8.A0K
            java.lang.String r0 = "not enough memory"
            r4.AVe(r1, r0)
        L_0x0083:
            java.lang.String r1 = "PostCaptureARRenderControllerImpl"
            java.lang.String r0 = "OneCamera detected there is not enough resources to select effect"
            X.0KC.A0C(r1, r0)
            X.6ap r2 = new X.6ap
            r2.<init>()
            r2.A05()
            java.lang.String r0 = "ar_effects_not_enough_memory"
            r2.A0H = r0
            android.content.Context r1 = r7.A0J
            r0 = 2131953135(0x7f1305ef, float:1.9542732E38)
            java.lang.String r0 = r1.getString(r0)
            r2.A0D = r0
            r0 = 2131968772(0x7f134304, float:1.9574448E38)
            java.lang.String r0 = r1.getString(r0)
            r2.A0D(r0)
            r0 = 1
            r2.A0L = r0
            X.Lrw r0 = new X.Lrw
            r0.<init>()
            r2.A0A(r0)
            X.Dc2 r2 = r2.A00()
            X.1xC r1 = X.1xC.A01
            X.3GP r0 = new X.3GP
            r0.<init>(r2)
            r1.A00(r0)
            return
        L_0x00c5:
            if (r3 == 0) goto L_0x00de
        L_0x00c7:
            int r0 = r7.A06
            r2 = 1
            if (r0 == r2) goto L_0x00de
            X.8gv r1 = r7.A01
            X.8tQ r0 = new X.8tQ
            r0.<init>(r1)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            com.instagram.common.session.UserSession r0 = r7.A0E
            r3.EUt(r0, r1)
            r7.A06 = r2
        L_0x00de:
            X.6dz r3 = r7.A0B
            X.8ql r0 = r7.A03
            if (r0 == 0) goto L_0x00fe
            X.8Eo r1 = r0.ALQ()
            if (r8 == 0) goto L_0x00f0
            java.lang.String r0 = r8.A0Q
            if (r0 == 0) goto L_0x00f0
            r1.A04 = r0
        L_0x00f0:
            X.8Ep r2 = r1.A00()
            r1 = 0
            X.AXM r0 = new X.AXM
            r0.<init>(r7)
            r3.Cg9(r1, r2, r8, r0)
            return
        L_0x00fe:
            if (r8 == 0) goto L_0x0107
            java.lang.String r1 = "PostCaptureARRenderControllerImpl"
            java.lang.String r0 = "pipeline controller is unexpectedly null"
            X.0kD.A01(r1, r0)
        L_0x0107:
            X.8Eo r1 = new X.8Eo
            r1.<init>()
            goto L_0x00f0
        L_0x010d:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x010d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C368528sn.A00(com.instagram.camera.effect.models.CameraAREffect):void");
    }

    public final void A08(EffectAttribution effectAttribution, EffectManifest effectManifest, EffectServiceHost effectServiceHost, String str) {
        C371978zS r0;
        LocationDataProvider locationDataProvider;
        C371698yt r02 = effectServiceHost.mServicesHostConfiguration;
        if (!(r02 == null || (r0 = r02.A03) == null || (locationDataProvider = r0.A00) == null)) {
            locationDataProvider.setDataSource(new QLM(this.A0J, this.A0E));
        }
        this.A0A.A00.clear();
    }

    public final void A09(String str) {
        if (str != null) {
            this.A0B.EyC(str);
        }
    }

    public final void A0B() {
        C367448ql r0 = this.A03;
        if (r0 != null) {
            r0.EIx();
        }
        CameraAREffect cameraAREffect = this.A0M;
        if (cameraAREffect != null) {
            if (182.A06(0Tu.A05, this.A0E, 36315683656633827L)) {
                A00(cameraAREffect);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.82L, java.lang.Object] */
    public final void A0C(C365408n3 r10, C344557s3 r11) {
        C367448ql r1 = this.A03;
        if (r1 == null) {
            C367318qY r0 = this.A0D;
            r0.getClass();
            r1 = r0.ALO(r10, r11);
            this.A03 = r1;
        }
        if (this.A01 == null) {
            Context context = this.A0J;
            UserSession userSession = this.A0E;
            ? obj = new Object();
            AnonymousClass82I r5 = this.A0L;
            r1.getClass();
            this.A01 = C368558sq.A00(context, obj, r1.B8n(), r5, C312146dt.A00(userSession), userSession, C368548sp.A00(this.A0F));
        }
        C367448ql r2 = this.A03;
        r2.getClass();
        r2.EUt(this.A0E, Collections.singletonList(new C368848tQ(this.A01)));
    }

    public final String getModuleName() {
        C367448ql r0 = this.A03;
        if (r0 != null) {
            return r0.getModuleName();
        }
        return "";
    }

    /* JADX WARNING: type inference failed for: r0v15, types: [X.8rL, java.lang.Object] */
    public C368528sn(Context context, View view, C367318qY r7, UserSession userSession, boolean z) {
        Integer num;
        this.A0J = context;
        this.A0E = userSession;
        Context applicationContext = context.getApplicationContext();
        C312126dr r2 = C312126dr.A01;
        0qQ.A0B(applicationContext, 0);
        this.A0B = C312176dx.A00(applicationContext, r2, C312146dt.A00(userSession), (C365828nk) null, userSession);
        this.A09 = new AnonymousClass82M(userSession);
        this.A0A = new AnonymousClass82P();
        if (z) {
            num = AnonymousClass05K.A00;
        } else {
            num = AnonymousClass05K.A01;
        }
        this.A0F = num;
        this.A0K = view;
        this.A0D = r7;
        AnonymousClass82S r0 = new AnonymousClass82S();
        this.A07 = r0;
        AnonymousClass82T r1 = new AnonymousClass82T(r0, userSession);
        this.A0C = r1;
        r1.A00 = new C367368qd(this);
        this.A08 = new Object();
    }

    public final void A0D(CameraAREffect cameraAREffect) {
        A00(cameraAREffect);
        Set set = this.A05;
        if (set != null) {
            set.clear();
        }
    }
}

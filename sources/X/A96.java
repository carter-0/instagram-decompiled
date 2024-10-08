package X;

import android.content.Context;
import com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceDataSource;
import com.instagram.camera.effect.mq.IgCameraEffectsController;
import com.instagram.common.session.UserSession;

public final class A96 {
    public C41798B1d A00;
    public final AnonymousClass82X A01;
    public final 1Ng A02;
    public final 1wn A03;
    public final String A04;
    public final boolean A05;

    public A96(Context context, UserSession userSession, C41798B1d b1d, String str) {
        C312196dz r11;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 2);
        this.A00 = b1d;
        AYC ayc = new AYC(this, 4);
        this.A03 = ayc;
        Context context2 = context;
        boolean z = AnonymousClass0Ke.A00(context2) >= 2011;
        this.A05 = z;
        AXF axf = new AXF();
        C312126dr r5 = C312126dr.A01;
        Context applicationContext = context2.getApplicationContext();
        0qQ.A07(applicationContext);
        if (C305756Jk.A00(applicationContext)) {
            Context applicationContext2 = context2.getApplicationContext();
            0qQ.A07(applicationContext2);
            r11 = C312176dx.A00(applicationContext2, r5, C312146dt.A00(userSession2), (C365828nk) null, userSession2);
        } else {
            r11 = null;
        }
        C3496181b r9 = new C3496181b(context2, (C3496081a) null, userSession2);
        this.A01 = new AnonymousClass82X(context2, (GalleryPickerServiceDataSource) null, axf, r9, new IgCameraEffectsController(context2.getApplicationContext(), axf, r9, r11, userSession2, (C357638Yz) null, (C3496481e) null, "instagram_live"), r11, (AnonymousClass82A) null, userSession2, (C342847pG) null, (C342837pF) null, (AnonymousClass823) null, (AnonymousClass829) null, AnonymousClass0eN.A01(new C41566AwY(46, context2, userSession2)));
        if (z) {
            String str2 = str;
            if (str != null) {
                0kD.A07("CameraEffectFacade", 002.A0R("Attempting to set unknown effect: ", str2), (Throwable) null);
            }
            this.A04 = str2;
            1Ng A002 = AnonymousClass1Nd.A00(userSession2);
            A002.A01(ayc, C366888pq.class);
            this.A02 = A002;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = r3.A01.A05;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00() {
        /*
            r3 = this;
            boolean r0 = r3.A05
            if (r0 == 0) goto L_0x0019
            X.82X r0 = r3.A01
            com.instagram.camera.effect.mq.IgCameraEffectsController r2 = r0.A05
            X.6dz r0 = r2.A0L
            if (r0 == 0) goto L_0x0019
            X.6e0 r1 = r0.B0C()
            com.instagram.common.session.UserSession r0 = r2.A0N
            boolean r1 = r1.A01(r0)
            r0 = 1
            if (r1 != 0) goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A96.A00():boolean");
    }
}

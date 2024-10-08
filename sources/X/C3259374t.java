package X;

import com.instagram.common.session.UserSession;
import com.meta.cal.AudioSession;
import com.meta.cal.AudioSessionFactory;
import com.meta.cal.CaptionCallback;
import com.meta.cal.IoConfig;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.74t  reason: invalid class name and case insensitive filesystem */
public final class C3259374t implements 0lm {
    public AudioSessionFactory A00;
    public final UserSession A01;
    public final AnonymousClass930 A02;
    public final Map A03 = new LinkedHashMap();
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A00(0eO.A02, C41619AxX.A00);
    public final C262224Cq A05;
    public final AnonymousClass12T A06;

    public static final /* synthetic */ C69239Nht A00(C3259374t r1, C70764OKk oKk, int i) {
        return new C69239Nht(r1, oKk, i);
    }

    /* access modifiers changed from: private */
    public final AudioSession A02(CaptionCallback captionCallback, byte b, int i, int i2) {
        AudioSession audioSession;
        AnonymousClass930 r4 = this.A02;
        if (r4 != null) {
            r4.A00.markerPoint(331815788, i2, "CREATE_AUDIO_SESSION_START");
        }
        AudioSessionFactory audioSessionFactory = this.A00;
        if (audioSessionFactory != null) {
            audioSessionFactory.registerCaptionCallback(captionCallback);
        }
        AudioSessionFactory audioSessionFactory2 = this.A00;
        if (audioSessionFactory2 != null) {
            audioSession = audioSessionFactory2.createSession(new IoConfig(i, b));
        } else {
            audioSession = null;
        }
        if (r4 != null) {
            r4.A00.markerPoint(331815788, i2, "CREATE_AUDIO_SESSION_END");
        }
        return audioSession;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005e, code lost:
        if (X.182.A06(X.0Tu.A05, r1.A00, 36325527720047634L) == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007a, code lost:
        if (X.182.A06(X.0Tu.A05, r1.A00, 36325527719719950L) == false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a1, code lost:
        if (X.182.A06(r2, r3, 36325527720309780L) == false) goto L_0x00a3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.C3259374t r9) {
        /*
            com.meta.cal.AudioSessionFactory r0 = r9.A00
            if (r0 != 0) goto L_0x00fc
            boolean r0 = A06()
            if (r0 == 0) goto L_0x00fc
            X.930 r5 = r9.A02
            if (r5 == 0) goto L_0x001b
            X.02m r2 = r5.A00
            r1 = 331818691(0x13c726c3, float:5.0272884E-27)
            r2.markerStart(r1)
            java.lang.String r0 = "CREATE_SESSION_FACTORY_START"
            r2.markerPoint(r1, r0)
        L_0x001b:
            com.meta.cal.AudioComponentState r6 = com.meta.cal.AudioComponentState.createDisabledState()
            com.meta.cal.AudioComponent r4 = com.meta.cal.AudioComponent.CAPTIONS
            r0 = 1
            r6.setEnabled(r4, r0)
            X.0xi r0 = X.0tS.A4E
            X.0tS r3 = r0.A00()
            X.0s0 r2 = r3.A37
            X.0YZ[] r1 = X.0tS.A4G
            r0 = 249(0xf9, float:3.49E-43)
            r0 = r1[r0]
            java.lang.Object r0 = r2.CDM(r3, r0)
            java.lang.String r0 = (java.lang.String) r0
            r6.setModelPath(r4, r0)
            com.meta.cal.AudioSessionFactory r4 = com.meta.cal.AudioSessionFactory.createSessionFactory()
            r4.setComponentState(r6)
            com.instagram.common.session.UserSession r8 = r9.A01
            X.5yp r1 = new X.5yp
            r1.<init>(r8)
            boolean r0 = r1.A00()
            if (r0 == 0) goto L_0x0060
            com.instagram.common.session.UserSession r3 = r1.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325527720047634(0x810de000083412, double:3.035748229093157E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r7 = 1
            if (r0 != 0) goto L_0x0061
        L_0x0060:
            r7 = 0
        L_0x0061:
            X.5yp r1 = new X.5yp
            r1.<init>(r8)
            boolean r0 = r1.A00()
            if (r0 == 0) goto L_0x007c
            com.instagram.common.session.UserSession r3 = r1.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325527719719950(0x810de00003340e, double:3.035748228885928E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r6 = 1
            if (r0 != 0) goto L_0x007d
        L_0x007c:
            r6 = 0
        L_0x007d:
            X.5yp r1 = new X.5yp
            r1.<init>(r8)
            boolean r0 = X.AnonymousClass1A9.A00()
            if (r0 != 0) goto L_0x00a3
            com.instagram.common.session.UserSession r3 = r1.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325527719523340(0x810de00000340c, double:3.035748228761591E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00a3
            r0 = 36325527720309780(0x810de0000c3414, double:3.035748229258939E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r1 = 1
            if (r0 != 0) goto L_0x00a4
        L_0x00a3:
            r1 = 0
        L_0x00a4:
            com.meta.cal.CaptionConfig r0 = new com.meta.cal.CaptionConfig
            r0.<init>(r7, r6, r1)
            r4.setCaptionConfig(r0)
            boolean r7 = r4.preloadDependencies()
            r9.A00 = r4
            r6 = 0
            com.meta.cal.AudioSessionFactoryInfo r0 = r4.info()
            if (r5 == 0) goto L_0x00fc
            if (r0 == 0) goto L_0x00fd
            java.lang.String r3 = r0.getCaptionDecoderConfig()
            java.lang.String r2 = r0.getModelName()
            short r0 = r0.getModelVersion()
            java.lang.Short r6 = java.lang.Short.valueOf(r0)
        L_0x00cb:
            r4 = 331818691(0x13c726c3, float:5.0272884E-27)
            if (r3 == 0) goto L_0x00d7
            X.02m r1 = r5.A00
            java.lang.String r0 = "CAPTION_CONFIG"
            r1.markerAnnotate(r4, r0, r3)
        L_0x00d7:
            if (r2 == 0) goto L_0x00e0
            X.02m r1 = r5.A00
            java.lang.String r0 = "MODEL_NAME"
            r1.markerAnnotate(r4, r0, r2)
        L_0x00e0:
            if (r6 == 0) goto L_0x00ee
            short r0 = r6.shortValue()
            X.02m r3 = r5.A00
            java.lang.String r2 = "MODEL_VERSION"
            long r0 = (long) r0
            r3.markerAnnotate(r4, r2, r0)
        L_0x00ee:
            X.02m r1 = r5.A00
            java.lang.String r0 = "CREATE_SESSION_FACTORY_END"
            r1.markerPoint(r4, r0)
            r0 = 3
            if (r7 == 0) goto L_0x00f9
            r0 = 2
        L_0x00f9:
            r1.markerEnd(r4, r0)
        L_0x00fc:
            return
        L_0x00fd:
            r3 = r6
            r2 = r6
            goto L_0x00cb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3259374t.A04(X.74t):void");
    }

    public static final boolean A06() {
        0tS A002 = 0tS.A4E.A00();
        if (A002.A37.CDM(A002, 0tS.A4G[249]) == null || !C301285yr.A00) {
            return false;
        }
        return true;
    }

    public final void onUserSessionWillEnd(boolean z) {
        this.A03.clear();
        this.A00 = null;
    }

    public C3259374t(UserSession userSession, AnonymousClass930 r5) {
        this.A01 = userSession;
        this.A02 = r5;
        AnonymousClass12T r2 = AnonymousClass12T.A00;
        this.A06 = r2;
        this.A05 = 19E.A02(r2.CO6(467813965, 3));
    }
}

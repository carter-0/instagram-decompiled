package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.IGAdsFeedVideoWBViewerTypeEnum;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;

public final class GDS {
    public GDW A00;
    public GDV A01;
    public GDU A02;
    public boolean A03;
    public final Context A04;
    public final FragmentActivity A05;
    public final ClipsViewerConfig A06;
    public final ClipsViewerSource A07;
    public final C267324bN A08;
    public final UserSession A09;
    public final AnonymousClass4DU A0A;
    public final AnonymousClass2xU A0B;
    public final AnonymousClass3W1 A0C;
    public final C249763kK A0D;
    public final GD6 A0E;
    public final C52016GBn A0F;
    public final C52012GBj A0G;
    public final String A0H;
    public final boolean A0I;
    public final GDT A0J;

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0067, code lost:
        if (r4 == X.AnonymousClass05K.A01) goto L_0x0069;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x006f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0078  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(X.GDS r7) {
        /*
            X.37E r6 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r5 = r7.A05
            X.37D r0 = r6.A01(r5)
            r1 = 0
            if (r0 == 0) goto L_0x0059
            X.37F r0 = (X.AnonymousClass37F) r0
            java.lang.Integer r4 = r0.A0K
        L_0x000f:
            java.lang.Integer r2 = X.AnonymousClass05K.A15
            r3 = 1
            com.instagram.clips.intf.ClipsViewerConfig r0 = r7.A06
            if (r4 != r2) goto L_0x003b
            com.instagram.clips.intf.ClipsWatchAndBrowseData r4 = r0.A0K
            r2 = 1
            if (r4 == 0) goto L_0x0039
            boolean r0 = r4.A0D
            if (r0 != r3) goto L_0x0039
            X.37D r0 = r6.A01(r5)
            if (r0 == 0) goto L_0x0039
            X.37F r0 = (X.AnonymousClass37F) r0
            int r1 = r0.A06
            r0 = 2
            if (r1 != r0) goto L_0x0039
            java.lang.Integer r1 = r4.A07
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 == r0) goto L_0x0036
            boolean r0 = r4.A0C
            if (r0 != r3) goto L_0x0039
        L_0x0036:
            r6 = r2 ^ 1
        L_0x0038:
            return r6
        L_0x0039:
            r2 = 0
            goto L_0x0036
        L_0x003b:
            com.instagram.clips.intf.ClipsWatchAndBrowseData r5 = r0.A0K
            r6 = 0
            if (r5 == 0) goto L_0x005b
            boolean r0 = r5.A0D
            if (r0 != r3) goto L_0x005b
            java.lang.Integer r0 = X.AnonymousClass05K.A1I
            if (r4 == r0) goto L_0x0038
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r4 == r0) goto L_0x0038
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r4 == r0) goto L_0x0038
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            if (r4 == r0) goto L_0x0038
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            if (r4 != r0) goto L_0x005b
            return r6
        L_0x0059:
            r4 = r1
            goto L_0x000f
        L_0x005b:
            java.lang.Integer r0 = X.AnonymousClass05K.A1F
            if (r4 == r0) goto L_0x0070
            if (r5 == 0) goto L_0x0074
            boolean r0 = r5.A0J
            if (r0 != r3) goto L_0x0074
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r4 != r0) goto L_0x0074
        L_0x0069:
            java.lang.Integer r2 = r5.A08
        L_0x006b:
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r2 != r0) goto L_0x0074
            return r6
        L_0x0070:
            if (r5 != 0) goto L_0x0069
            r2 = r1
            goto L_0x006b
        L_0x0074:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r4 != r0) goto L_0x0081
            if (r5 == 0) goto L_0x007c
            java.lang.Integer r1 = r5.A09
        L_0x007c:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 != r0) goto L_0x0081
            return r6
        L_0x0081:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GDS.A00(X.GDS):boolean");
    }

    public GDS(Context context, FragmentActivity fragmentActivity, ClipsViewerConfig clipsViewerConfig, C267324bN r6, UserSession userSession, AnonymousClass4DU r8, GD6 gd6, C52016GBn gBn, C52012GBj gBj, String str) {
        AnonymousClass3W1 r0;
        1Xj r02;
        C250513lZ A0w;
        C255123tc BF5;
        1Xj r03;
        AnonymousClass7TG.A1U(context, clipsViewerConfig, gBj);
        AnonymousClass7TG.A1S(userSession, fragmentActivity);
        C51974G9v.A1Q(r8, str, gBn, gd6);
        this.A04 = context;
        this.A06 = clipsViewerConfig;
        this.A0G = gBj;
        this.A08 = r6;
        this.A09 = userSession;
        this.A05 = fragmentActivity;
        this.A0A = r8;
        this.A0H = str;
        this.A0F = gBn;
        this.A0E = gd6;
        this.A07 = clipsViewerConfig.A0J;
        IGAdsFeedVideoWBViewerTypeEnum iGAdsFeedVideoWBViewerTypeEnum = null;
        if (r6 == null || (r03 = r6.A02) == null) {
            r0 = null;
        } else {
            r0 = gd6.BQr(r03);
        }
        this.A0C = r0;
        if (!(r6 == null || (r02 = r6.A02) == null || (A0w = C51966G9m.A0w(r02)) == null || (BF5 = A0w.BF5()) == null)) {
            iGAdsFeedVideoWBViewerTypeEnum = BF5.BEn();
        }
        this.A0I = AnonymousClass7TF.A1W(iGAdsFeedVideoWBViewerTypeEnum, IGAdsFeedVideoWBViewerTypeEnum.POST_TAP_WATCH_AND_BROWSE_VIEWER_ON_REELS_VIEWER_WITH_CHAINING);
        this.A0B = new C57240IUb(this, 15);
        this.A0J = new GDT(userSession);
        this.A0D = 1L2.A00();
    }
}

package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Wad  reason: case insensitive filesystem */
public final class C19491Wad implements C230222pE, C20962X6p {
    public User A00;
    public final Activity A01;
    public final UserSession A02;
    public final C17883Vha A03;
    public final UserDetailFragment A04;
    public final AnonymousClass32A A05;
    public final AnonymousClass0iw A06;
    public final List A07 = new ArrayList();
    public final boolean A08;

    public C19491Wad(AnonymousClass0iw r3, UserSession userSession, C17883Vha vha, UserDetailFragment userDetailFragment) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A04 = userDetailFragment;
        this.A06 = r3;
        this.A03 = vha;
        this.A01 = userDetailFragment.requireActivity();
        this.A05 = new AnonymousClass32A(userDetailFragment, userSession, new AnonymousClass328(userDetailFragment));
        this.A08 = AnonymousClass7TF.A0Q(userSession).A2P();
    }

    public final /* synthetic */ void DFj(Reel reel, AnonymousClass6UY r2) {
    }

    public final /* synthetic */ void DcC(Reel reel) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0078, code lost:
        if (r10 == null) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007a, code lost:
        X.0wb.A03("ProfileReelGridDelegate", X.C273654mx.A00(1349));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0085, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dcc(com.instagram.ui.widget.spinner.SpinnerImageView r24, java.lang.String r25, int r26, int r27, int r28) {
        /*
            r23 = this;
            r1 = 0
            X.6rX r6 = X.C319976rX.A00
            r0 = r23
            com.instagram.common.session.UserSession r8 = r0.A02
            com.instagram.profile.fragment.UserDetailFragment r7 = r0.A04
            com.instagram.user.model.User r2 = r0.A00
            r9 = 0
            if (r2 == 0) goto L_0x0089
            java.lang.String r15 = r2.getId()
        L_0x0012:
            com.instagram.user.model.User r2 = r0.A00
            if (r2 == 0) goto L_0x0086
            java.lang.String r16 = r2.getUsername()
        L_0x001a:
            r2 = 3
            int r21 = r27 / r2
            int r22 = r27 % r2
            r11 = r25
            r10 = r9
            r12 = r9
            r13 = r9
            r14 = r9
            r17 = r9
            r18 = r9
            r19 = r9
            r20 = r9
            r6.A0C(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            com.instagram.user.model.User r2 = r0.A00
            X.6rY r14 = X.C319976rX.A00(r8, r2)
            com.instagram.user.model.User r2 = r0.A00
            if (r2 == 0) goto L_0x003e
            java.lang.String r9 = r2.getId()
        L_0x003e:
            r2 = 4084(0xff4, float:5.723E-42)
            java.lang.String r15 = X.AnonymousClass000.A00(r2)
            java.lang.String r17 = ""
            java.lang.String r19 = "grid_tab"
            r12 = r7
            r13 = r8
            r16 = r9
            r18 = r17
            X.C319976rX.A08(r12, r13, r14, r15, r16, r17, r18, r19)
            com.instagram.model.reels.Reel r10 = X.Dba.A0L(r8, r11)
            if (r10 != 0) goto L_0x008b
            X.Vha r2 = r0.A03
            java.util.List r2 = r2.A03
            java.util.Iterator r4 = r2.iterator()
        L_0x005f:
            boolean r3 = r4.hasNext()
            r2 = 0
            if (r3 == 0) goto L_0x007a
            java.lang.Object r10 = r4.next()
            com.instagram.model.reels.Reel r10 = (com.instagram.model.reels.Reel) r10
            if (r10 == 0) goto L_0x0072
            java.lang.String r2 = r10.getId()
        L_0x0072:
            boolean r2 = X.0qQ.A0K(r2, r11)
            if (r2 == 0) goto L_0x005f
            if (r10 != 0) goto L_0x008b
        L_0x007a:
            java.lang.String r1 = "ProfileReelGridDelegate"
            r0 = 1349(0x545, float:1.89E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0wb.A03(r1, r0)
            return
        L_0x0086:
            r16 = r9
            goto L_0x001a
        L_0x0089:
            r15 = r9
            goto L_0x0012
        L_0x008b:
            X.Vha r2 = r0.A03
            java.util.List r2 = r2.A03
            java.util.Iterator r4 = r2.iterator()
        L_0x0093:
            boolean r3 = r4.hasNext()
            r2 = 0
            if (r3 == 0) goto L_0x00c9
            java.lang.Object r3 = r4.next()
            com.instagram.model.reels.Reel r3 = (com.instagram.model.reels.Reel) r3
            if (r3 == 0) goto L_0x00a6
            java.lang.String r2 = r3.getId()
        L_0x00a6:
            boolean r2 = X.0qQ.A0K(r2, r11)
            if (r2 == 0) goto L_0x0093
        L_0x00ac:
            java.util.List r2 = X.AnonymousClass7TE.A1I(r3)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>(r2)
            java.util.List r5 = r0.A07
            java.util.Iterator r3 = r5.iterator()
        L_0x00bb:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x00cb
            android.view.View r2 = X.JTO.A0H(r3)
            X.AnonymousClass7TH.A0R(r2)
            goto L_0x00bb
        L_0x00c9:
            r3 = r2
            goto L_0x00ac
        L_0x00cb:
            r5.clear()
            X.32A r9 = r0.A05
            X.6VJ r3 = r9.A07
            if (r3 == 0) goto L_0x00d9
            java.lang.Integer r2 = X.AnonymousClass05K.A15
            r3.A05(r2)
        L_0x00d9:
            r4 = 1
            X.Wag r3 = new X.Wag
            r2 = r24
            r3.<init>(r2, r4)
            r5.add(r2)
            r2 = 408(0x198, float:5.72E-43)
            java.lang.String r6 = X.C273654mx.A00(r2)
            boolean r5 = r10.A1S
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            r7.A0y(r2, r6, r11, r5)
            X.3BQ r11 = X.AnonymousClass3BQ.PROFILE_HIGHLIGHTS_TRAY
            X.34n r2 = X.C2366334m.A00(r8)
            r2.A03(r10, r11, r1)
            X.32D r1 = new X.32D
            r1.<init>()
            r1.A07 = r4
            com.instagram.model.reels.ReelViewerConfig r5 = new com.instagram.model.reels.ReelViewerConfig
            r5.<init>((X.AnonymousClass32D) r1)
            android.app.Activity r2 = r0.A01
            X.Uph r1 = new X.Uph
            r1.<init>(r2, r0)
            r9.A05 = r1
            X.2pH r0 = r7.A1M
            java.lang.String r0 = r0.A04
            r9.A0C = r0
            X.WNI r0 = r7.A0l()
            r9.A01 = r0
            r9.A0F = r4
            r9.A03 = r5
            r9.A06 = r3
            r0 = -1
            r9.A00 = r0
            r12 = 0
            r14 = r13
            r15 = r13
            r9.A05(r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19491Wad.Dcc(com.instagram.ui.widget.spinner.SpinnerImageView, java.lang.String, int, int, int):void");
    }

    public final /* synthetic */ void Dcl(Reel reel) {
    }

    public static final void A00(Reel reel, C19491Wad wad, int i, boolean z) {
        AnonymousClass1Nd.A00(wad.A02).A00(new C321926uy(reel, i, z));
    }

    public static final void A01(C19491Wad wad, String str) {
        String str2;
        C319976rX r1 = C319976rX.A00;
        UserSession userSession = wad.A02;
        AnonymousClass0iw r2 = wad.A06;
        C319986rY r4 = C319986rY.SELF;
        String str3 = userSession.A06;
        if (wad.A08) {
            str2 = "forced_migration";
        } else {
            str2 = "opt_in";
        }
        r1.A0D(r2, userSession, r4, str, str3, str2, (String) null);
    }

    public final void Dce(String str, int i) {
        UserSession userSession = this.A02;
        Reel A0L = Dba.A0L(userSession, str);
        if (A0L != null && A0L.A0W != null) {
            Activity activity = this.A01;
            UserDetailFragment userDetailFragment = this.A04;
            new W2M(activity, userDetailFragment, userDetailFragment, userSession, A0L).A04(new C19147WNd(A0L, this, str), AnonymousClass05K.A01);
        }
    }
}

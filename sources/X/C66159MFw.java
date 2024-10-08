package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;
import com.instagram.profilecard.domain.ProfileCardViewModel;
import java.util.List;

/* renamed from: X.MFw  reason: case insensitive filesystem */
public final class C66159MFw extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public final int A08 = 0;
    public final Object A09;
    public final Object A0A;
    public final Object A0B;
    public final Object A0C;
    public final String A0D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66159MFw(28D r2, C63764L5w l5w, CameraSpec cameraSpec, String str, List list, AnonymousClass4D7 r7, AnonymousClass4D7 r8) {
        super(2, r8);
        this.A02 = list;
        this.A0C = r7;
        this.A0A = l5w;
        this.A0D = str;
        this.A09 = r2;
        this.A0B = cameraSpec;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.MFw, X.4D7] */
    /* JADX WARNING: type inference failed for: r0v2, types: [X.MFw, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r10) {
        AnonymousClass4D7 r7 = r10;
        if (this.A08 != 0) {
            L3W l3w = (L3W) this.A0C;
            ? mFw = new C66159MFw((FragmentActivity) this.A09, (AnonymousClass0iw) this.A0B, l3w, (ProfileCardViewModel) this.A0A, this.A0D, r10);
            mFw.A02 = obj;
            return mFw;
        }
        C63764L5w l5w = (C63764L5w) this.A0A;
        String str = this.A0D;
        return new C66159MFw((28D) this.A09, l5w, (CameraSpec) this.A0B, str, (List) this.A02, (AnonymousClass4D7) this.A0C, r7);
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [X.MFw, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00df, code lost:
        if (X.C241603Pv.A00(r15) == r6) goto L_0x00e1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006f A[Catch:{ Exception -> 0x0247 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0181 A[Catch:{ all -> 0x01ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x018a A[Catch:{ all -> 0x01ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r1 = r16
            int r0 = r15.A08
            if (r0 == 0) goto L_0x0029
            X.1Hj r6 = X.1Hj.A02
            int r0 = r15.A00
            r12 = 2
            r11 = 1
            r9 = 0
            if (r0 == 0) goto L_0x00aa
            if (r0 == r11) goto L_0x00e2
            java.lang.Object r7 = r15.A07
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r2 = r15.A06
            java.lang.Object r3 = r15.A05
            X.0iw r3 = (X.AnonymousClass0iw) r3
            java.lang.Object r4 = r15.A04
            androidx.fragment.app.FragmentActivity r4 = (androidx.fragment.app.FragmentActivity) r4
            java.lang.Object r5 = r15.A03
            com.instagram.profilecard.domain.ProfileCardViewModel r5 = (com.instagram.profilecard.domain.ProfileCardViewModel) r5
            java.lang.Object r8 = r15.A02
            X.4Cq r8 = (X.C262224Cq) r8
            goto L_0x013a
        L_0x0029:
            X.1Hj r6 = X.1Hj.A02
            int r0 = r15.A00
            r5 = 1
            if (r0 == 0) goto L_0x0050
            if (r0 != r5) goto L_0x004b
            java.lang.Object r2 = r15.A01
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.Object r3 = r15.A07
            java.util.Iterator r3 = (java.util.Iterator) r3
            java.lang.Object r0 = r15.A06
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Object r11 = r15.A05
            com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec r11 = (com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec) r11
            java.lang.Object r13 = r15.A04
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r4 = r15.A03
            X.L5w r4 = (X.C63764L5w) r4
            goto L_0x00a0
        L_0x004b:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0x()
            throw r1
        L_0x0050:
            X.0eS.A00(r1)
            java.lang.Object r0 = r15.A02     // Catch:{ Exception -> 0x0247 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x0247 }
            java.lang.Object r4 = r15.A0A     // Catch:{ Exception -> 0x0247 }
            X.L5w r4 = (X.C63764L5w) r4     // Catch:{ Exception -> 0x0247 }
            java.lang.String r13 = r15.A0D     // Catch:{ Exception -> 0x0247 }
            java.lang.Object r11 = r15.A0B     // Catch:{ Exception -> 0x0247 }
            com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec r11 = (com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec) r11     // Catch:{ Exception -> 0x0247 }
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r0)     // Catch:{ Exception -> 0x0247 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ Exception -> 0x0247 }
        L_0x0069:
            boolean r0 = r3.hasNext()     // Catch:{ Exception -> 0x0247 }
            if (r0 == 0) goto L_0x01da
            java.lang.Object r8 = r3.next()     // Catch:{ Exception -> 0x0247 }
            com.instagram.common.gallery.Medium r8 = (com.instagram.common.gallery.Medium) r8     // Catch:{ Exception -> 0x0247 }
            androidx.fragment.app.FragmentActivity r7 = r4.A00     // Catch:{ Exception -> 0x0247 }
            com.instagram.common.session.UserSession r9 = r4.A01     // Catch:{ Exception -> 0x0247 }
            X.2Nn r12 = r4.A02     // Catch:{ Exception -> 0x0247 }
            r15.A03 = r4     // Catch:{ Exception -> 0x0247 }
            r15.A04 = r13     // Catch:{ Exception -> 0x0247 }
            r15.A05 = r11     // Catch:{ Exception -> 0x0247 }
            r15.A06 = r2     // Catch:{ Exception -> 0x0247 }
            r15.A07 = r3     // Catch:{ Exception -> 0x0247 }
            r15.A01 = r2     // Catch:{ Exception -> 0x0247 }
            r15.A00 = r5     // Catch:{ Exception -> 0x0247 }
            r14 = 0
            X.3Pl r1 = X.JTQ.A0m(r15)     // Catch:{ Exception -> 0x0247 }
            r0 = 8
            X.KH1 r10 = new X.KH1     // Catch:{ Exception -> 0x0247 }
            r10.<init>((int) r0, (X.AnonymousClass4D7) r1)     // Catch:{ Exception -> 0x0247 }
            X.C39810AAh.A01(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x0247 }
            java.lang.Object r1 = r1.A00()     // Catch:{ Exception -> 0x0247 }
            if (r1 == r6) goto L_0x00e1
            r0 = r2
            goto L_0x00a3
        L_0x00a0:
            X.0eS.A00(r1)     // Catch:{ Exception -> 0x0247 }
        L_0x00a3:
            X.51M r1 = (X.AnonymousClass51M) r1     // Catch:{ Exception -> 0x0247 }
            r2.add(r1)     // Catch:{ Exception -> 0x0247 }
            r2 = r0
            goto L_0x0069
        L_0x00aa:
            X.0eS.A00(r1)
            java.lang.Object r8 = r15.A02
            X.4Cq r8 = (X.C262224Cq) r8
            java.lang.Object r5 = r15.A0A
            com.instagram.profilecard.domain.ProfileCardViewModel r5 = (com.instagram.profilecard.domain.ProfileCardViewModel) r5
            com.instagram.user.model.User r0 = r5.A05
            if (r0 == 0) goto L_0x025c
            java.lang.String r7 = r0.getId()
            java.lang.Object r13 = r15.A0C
            X.L3W r13 = (X.L3W) r13
            java.lang.Object r4 = r15.A09
            androidx.fragment.app.FragmentActivity r4 = (androidx.fragment.app.FragmentActivity) r4
            java.lang.Object r3 = r15.A0B
            X.0iw r3 = (X.AnonymousClass0iw) r3
            java.lang.String r2 = r15.A0D
            r15.A02 = r8
            r15.A03 = r5
            r15.A04 = r13
            r15.A05 = r4
            r15.A06 = r3
            r15.A07 = r2
            r15.A01 = r7
            r15.A00 = r11
            java.lang.Object r0 = X.C241603Pv.A00(r15)
            if (r0 != r6) goto L_0x00fe
        L_0x00e1:
            return r6
        L_0x00e2:
            java.lang.Object r7 = r15.A01
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r2 = r15.A07
            java.lang.Object r3 = r15.A06
            X.0iw r3 = (X.AnonymousClass0iw) r3
            java.lang.Object r4 = r15.A05
            androidx.fragment.app.FragmentActivity r4 = (androidx.fragment.app.FragmentActivity) r4
            java.lang.Object r13 = r15.A04
            X.L3W r13 = (X.L3W) r13
            java.lang.Object r5 = r15.A03
            com.instagram.profilecard.domain.ProfileCardViewModel r5 = (com.instagram.profilecard.domain.ProfileCardViewModel) r5
            java.lang.Object r0 = r15.A02
            X.4Cq r8 = X.JTO.A1D(r0, r1)
        L_0x00fe:
            X.05G r1 = r5.A0K
        L_0x0100:
            java.lang.Object r10 = r1.getValue()
            r14 = r10
            X.GnU r14 = (X.C53397GnU) r14
            r0 = 8382463(0x7fe7ff, float:1.1746333E-38)
            X.GnU r0 = X.C53397GnU.A00((com.instagram.common.typedurl.ImageUrl) null, r9, r9, r14, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.Map) null, 0.0f, 0.0f, 0.0f, r0, false, false, false, false, false, false, false, false, false, false)
            boolean r0 = r1.AIY(r10, r0)
            if (r0 == 0) goto L_0x0100
            X.3Ns r10 = new X.3Ns     // Catch:{ all -> 0x01ca }
            r10.<init>()     // Catch:{ all -> 0x01ca }
            X.0V2 r1 = r13.A00     // Catch:{ all -> 0x01ca }
            X.Kzw r0 = new X.Kzw     // Catch:{ all -> 0x01ca }
            r0.<init>(r10)     // Catch:{ all -> 0x01ca }
            r1.FIA(r0)     // Catch:{ all -> 0x01ca }
            r15.A02 = r8     // Catch:{ all -> 0x01ca }
            r15.A03 = r5     // Catch:{ all -> 0x01ca }
            r15.A04 = r4     // Catch:{ all -> 0x01ca }
            r15.A05 = r3     // Catch:{ all -> 0x01ca }
            r15.A06 = r2     // Catch:{ all -> 0x01ca }
            r15.A07 = r7     // Catch:{ all -> 0x01ca }
            r15.A01 = r9     // Catch:{ all -> 0x01ca }
            r15.A00 = r12     // Catch:{ all -> 0x01ca }
            java.lang.Object r1 = r10.A0E(r15)     // Catch:{ all -> 0x01ca }
            if (r1 != r6) goto L_0x013d
            return r6
        L_0x013a:
            X.0eS.A00(r1)     // Catch:{ all -> 0x01ca }
        L_0x013d:
            X.60f r1 = (X.C3018260f) r1     // Catch:{ all -> 0x01ca }
            android.graphics.Bitmap r6 = X.C298615tk.A00(r1)     // Catch:{ all -> 0x01ca }
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x01ca }
            r1 = 0
            android.graphics.Bitmap r10 = r6.copy(r0, r1)     // Catch:{ all -> 0x01ca }
            X.FYZ r0 = r5.A0J     // Catch:{ all -> 0x01ca }
            X.0qQ.A0A(r10)     // Catch:{ all -> 0x01ca }
            X.0qQ.A0B(r10, r1)     // Catch:{ all -> 0x01ca }
            X.0qQ.A0B(r7, r11)     // Catch:{ all -> 0x01ca }
            java.util.Map r0 = r0.A00     // Catch:{ all -> 0x01ca }
            r0.put(r7, r10)     // Catch:{ all -> 0x01ca }
            com.instagram.common.session.UserSession r11 = r5.A0F     // Catch:{ all -> 0x01ca }
            X.L6y r6 = new X.L6y     // Catch:{ all -> 0x01ca }
            r6.<init>(r4, r3, r11)     // Catch:{ all -> 0x01ca }
            X.0Ud r0 = r5.A0L     // Catch:{ all -> 0x01ca }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x01ca }
            X.GnU r0 = (X.C53397GnU) r0     // Catch:{ all -> 0x01ca }
            boolean r0 = r0.A0F     // Catch:{ all -> 0x01ca }
            if (r0 == 0) goto L_0x019b
            r0 = 1292(0x50c, float:1.81E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x01ca }
            boolean r0 = X.0qQ.A0K(r2, r0)     // Catch:{ all -> 0x01ca }
            if (r0 == 0) goto L_0x019b
            X.JVM r0 = r5.A02     // Catch:{ all -> 0x01ca }
            if (r0 == 0) goto L_0x018a
            com.instagram.music.common.model.MusicAssetModel r2 = r0.A02     // Catch:{ all -> 0x01ca }
            if (r2 == 0) goto L_0x018a
            com.instagram.api.schemas.MusicProduct r1 = com.instagram.api.schemas.MusicProduct.MUSIC_ON_PROFILE     // Catch:{ all -> 0x01ca }
            java.lang.String r0 = ""
            com.instagram.music.common.model.MusicOverlayStickerModel r3 = X.C59670JTa.A04(r1, r2, r9, r0)     // Catch:{ all -> 0x01ca }
            goto L_0x018b
        L_0x018a:
            r3 = r9
        L_0x018b:
            if (r3 == 0) goto L_0x019b
            X.0Tu r2 = X.0Tu.A05     // Catch:{ all -> 0x01ca }
            r0 = 36326163374683714(0x810e7400003642, double:3.0361502196445895E-306)
            boolean r0 = X.182.A06(r2, r11, r0)     // Catch:{ all -> 0x01ca }
            if (r0 == 0) goto L_0x019b
            r9 = r3
        L_0x019b:
            X.05G r0 = r5.A0K     // Catch:{ all -> 0x01ca }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x01ca }
            X.GnU r0 = (X.C53397GnU) r0     // Catch:{ all -> 0x01ca }
            java.lang.String r11 = r0.A08     // Catch:{ all -> 0x01ca }
            androidx.fragment.app.FragmentActivity r3 = r6.A00     // Catch:{ all -> 0x01ca }
            java.lang.String r2 = X.2RR.A01()     // Catch:{ all -> 0x01ca }
            r0 = 2130970321(0x7f0406d1, float:1.7549349E38)
            int r1 = X.AnonymousClass7TF.A03(r3, r0)     // Catch:{ all -> 0x01ca }
            X.LjB r0 = new X.LjB     // Catch:{ all -> 0x01ca }
            r0.<init>(r9, r6, r7, r11)     // Catch:{ all -> 0x01ca }
            X.LTL.A03(r3, r10, r0, r2, r1)     // Catch:{ all -> 0x01ca }
            boolean r0 = X.19E.A07(r8)
            if (r0 == 0) goto L_0x025c
            X.37E r0 = X.AnonymousClass37D.A00
            X.DbX.A10(r4, r0)
            com.instagram.profilecard.domain.ProfileCardViewModel.A03(r5)
            goto L_0x025c
        L_0x01ca:
            r1 = move-exception
            boolean r0 = X.19E.A07(r8)
            if (r0 == 0) goto L_0x01d9
            X.37E r0 = X.AnonymousClass37D.A00
            X.DbX.A10(r4, r0)
            com.instagram.profilecard.domain.ProfileCardViewModel.A03(r5)
        L_0x01d9:
            throw r1
        L_0x01da:
            java.util.List r2 = (java.util.List) r2     // Catch:{ Exception -> 0x0247 }
            X.JXe r5 = new X.JXe
            r5.<init>()
            java.lang.Object r0 = r15.A02
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = X.00k.A0J(r0)
            com.instagram.common.gallery.Medium r0 = (com.instagram.common.gallery.Medium) r0
            if (r0 == 0) goto L_0x0245
            java.lang.String r0 = r0.A0a
        L_0x01ef:
            X.JXc r0 = X.C59764JXc.A00(r0)
            r5.A0C = r0
            X.JXu r0 = X.JXu.A02
            r5.A05(r0)
            java.lang.Object r4 = r15.A0A
            X.L5w r4 = (X.C63764L5w) r4
            com.instagram.common.session.UserSession r3 = r4.A01
            X.0Tu r6 = X.0Tu.A05
            r0 = 36323955761557122(0x810c7200012e82, double:3.034754116213988E-306)
            boolean r0 = X.182.A06(r6, r3, r0)
            if (r0 == 0) goto L_0x0215
            androidx.fragment.app.FragmentActivity r1 = r4.A00
            java.lang.String r0 = r15.A0D
            java.util.ArrayList r2 = X.C394629yQ.A00(r1, r3, r0, r2)
        L_0x0215:
            r5.A06(r2)
            java.lang.Object r2 = r15.A09
            java.lang.String r0 = r2.toString()
            X.JXc r0 = X.C59764JXc.A00(r0)
            r5.A0F = r0
            java.lang.String r1 = r15.A0D
            X.28D r0 = X.28D.A2d
            if (r2 != r0) goto L_0x0242
            X.50r r0 = X.C2801950r.FEED_POST
        L_0x022c:
            X.5kq r0 = r5.A02(r0, r1)
            androidx.fragment.app.FragmentActivity r1 = r4.A00
            X.8g1 r1 = X.C361298g0.A00(r1, r3)
            java.util.Map r2 = r1.A01
            java.lang.String r1 = r0.A0T
            r2.put(r1, r0)
            java.lang.Object r2 = r15.A0C
            X.4D7 r2 = (X.AnonymousClass4D7) r2
            goto L_0x0259
        L_0x0242:
            X.50r r0 = X.C2801950r.CLIPS
            goto L_0x022c
        L_0x0245:
            r0 = 0
            goto L_0x01ef
        L_0x0247:
            r0 = move-exception
            java.lang.Object r2 = r15.A0C
            X.4D7 r2 = (X.AnonymousClass4D7) r2
            java.lang.String r1 = r0.getMessage()
            X.5tp r0 = new X.5tp
            r0.<init>(r1)
            X.0eQ r0 = X.JTU.A0c(r0)
        L_0x0259:
            r2.resumeWith(r0)
        L_0x025c:
            X.0gF r6 = X.C60340gF.A00
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66159MFw.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C66159MFw) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66159MFw(FragmentActivity fragmentActivity, AnonymousClass0iw r3, L3W l3w, ProfileCardViewModel profileCardViewModel, String str, AnonymousClass4D7 r7) {
        super(2, r7);
        this.A0A = profileCardViewModel;
        this.A0C = l3w;
        this.A09 = fragmentActivity;
        this.A0B = r3;
        this.A0D = str;
    }
}

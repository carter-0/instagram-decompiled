package com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel;

import X.05F;
import X.0Tu;
import X.0V2;
import X.0qQ;
import X.0xa;
import X.106;
import X.10D;
import X.10b;
import X.182;
import X.1E8;
import X.2YL;
import X.AnonymousClass05K;
import X.AnonymousClass0Ud;
import X.AnonymousClass0r6;
import X.AnonymousClass10A;
import X.AnonymousClass1Nd;
import X.AnonymousClass376;
import X.AnonymousClass4D7;
import X.AnonymousClass64X;
import X.AnonymousClass8WT;
import X.AnonymousClass8WU;
import X.AnonymousClass9IV;
import X.AnonymousClass9IZ;
import X.AnonymousClass9K3;
import X.AnonymousClass9QA;
import X.AnonymousClass9QD;
import X.C241053Nr;
import X.C318116oQ;
import X.C357638Yz;
import X.C62170rn;
import com.instagram.common.session.UserSession;
import com.instagram.reels.store.ReelStore;

public final class GalleryMemoriesViewModel extends 2YL {
    public boolean A00;
    public final UserSession A01;
    public final 1E8 A02;
    public final C241053Nr A03;
    public final 0xa A04;
    public final 0V2 A05;
    public final AnonymousClass0Ud A06;
    public final C357638Yz A07;
    public final AnonymousClass8WT A08;
    public final ReelStore A09;
    public final AnonymousClass0r6 A0A;

    public GalleryMemoriesViewModel(UserSession userSession, C357638Yz r9, 1E8 r10, AnonymousClass8WT r11, C241053Nr r12, 0xa r13, ReelStore reelStore) {
        05F A032;
        0qQ.A0B(r12, 2);
        0qQ.A0B(r10, 3);
        0qQ.A0B(r11, 5);
        0qQ.A0B(r13, 6);
        0qQ.A0B(r9, 7);
        this.A01 = userSession;
        this.A03 = r12;
        this.A02 = r10;
        this.A09 = reelStore;
        this.A08 = r11;
        this.A04 = r13;
        this.A07 = r9;
        C62170rn r1 = new C62170rn(new AnonymousClass9K3(this, (AnonymousClass4D7) null, 37), new AnonymousClass8WU(this, new AnonymousClass64X(AnonymousClass1Nd.A00(userSession)).A00(AnonymousClass376.class)));
        this.A0A = r1;
        if (A02(this)) {
            AnonymousClass9QD r5 = new AnonymousClass9QD(this, r1);
            A032 = 10b.A02(new AnonymousClass9IV(7, (Object) null, (Object) A00((AnonymousClass9IZ) null, this, AnonymousClass05K.A01)), C318116oQ.A00(this), r5, AnonymousClass10A.A00);
        } else {
            A032 = 10b.A03(106.A01(new AnonymousClass9IV(7, (Object) null, (Object) A00((AnonymousClass9IZ) null, this, AnonymousClass05K.A01))));
        }
        this.A06 = A032;
        this.A05 = 10D.A01(AnonymousClass05K.A00, 0, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        if (r4 == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        if (A02(r8) == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        r3 = r8.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        if (X.AnonymousClass8WT.A00(r3) != X.AnonymousClass05K.A01) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (((int) X.182.A01(X.0Tu.A05, r3, 36609223195039567L)) >= 0) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004b, code lost:
        if (r5 == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        if (r8.A00 != false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0051, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0069, code lost:
        if (r8.A04.getInt("memories_gallery_nux_seen_count", 0) < ((int) X.182.A01(X.0Tu.A05, r8.A01, 36609223194711886L))) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006b, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0080, code lost:
        return new X.AnonymousClass8WV(r9, (int) X.182.A01(X.0Tu.A05, r8.A01, 36609223195039567L), r5, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        if (r7.A03 == null) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
        if (X.182.A06(X.0Tu.A05, r8.A01, 36327748218272424L) != false) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        if (A02(r8) == false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        if (X.AnonymousClass8WT.A00(r8.A01) == X.AnonymousClass05K.A01) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        r5 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass8WV A00(X.AnonymousClass9IZ r7, com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.GalleryMemoriesViewModel r8, java.lang.Integer r9) {
        /*
            if (r7 == 0) goto L_0x0007
            java.lang.Object r0 = r7.A03
            r4 = 1
            if (r0 != 0) goto L_0x0017
        L_0x0007:
            r4 = 0
            com.instagram.common.session.UserSession r3 = r8.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327748218272424(0x810fe5000a3aa8, double:3.0371524811117426E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0028
        L_0x0017:
            boolean r0 = A02(r8)
            if (r0 == 0) goto L_0x0028
            com.instagram.common.session.UserSession r0 = r8.A01
            java.lang.Integer r1 = X.AnonymousClass8WT.A00(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r5 = 1
            if (r1 == r0) goto L_0x0029
        L_0x0028:
            r5 = 0
        L_0x0029:
            if (r4 == 0) goto L_0x004a
            boolean r0 = A02(r8)
            if (r0 == 0) goto L_0x004a
            com.instagram.common.session.UserSession r3 = r8.A01
            java.lang.Integer r1 = X.AnonymousClass8WT.A00(r3)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x004a
            X.0Tu r2 = X.0Tu.A05
            r0 = 36609223195039567(0x820fe5000b174f, double:3.2151583898280413E-306)
            long r1 = X.182.A01(r2, r3, r0)
            int r0 = (int) r1
            r6 = 1
            if (r0 >= 0) goto L_0x004b
        L_0x004a:
            r6 = 0
        L_0x004b:
            if (r5 == 0) goto L_0x006b
            boolean r0 = r8.A00
            if (r0 != 0) goto L_0x006b
            X.0xa r2 = r8.A04
            java.lang.String r1 = "memories_gallery_nux_seen_count"
            r0 = 0
            int r4 = r2.getInt(r1, r0)
            com.instagram.common.session.UserSession r3 = r8.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 36609223194711886(0x820fe50006174e, double:3.2151583896208145E-306)
            long r1 = X.182.A01(r2, r3, r0)
            int r0 = (int) r1
            r7 = 1
            if (r4 < r0) goto L_0x006c
        L_0x006b:
            r7 = 0
        L_0x006c:
            com.instagram.common.session.UserSession r3 = r8.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 36609223195039567(0x820fe5000b174f, double:3.2151583898280413E-306)
            long r0 = X.182.A01(r2, r3, r0)
            int r4 = (int) r0
            X.8WV r2 = new X.8WV
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.GalleryMemoriesViewModel.A00(X.9IZ, com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.GalleryMemoriesViewModel, java.lang.Integer):X.8WV");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDg, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
        if (r2 == r3) goto L_0x0057;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.GalleryMemoriesViewModel r5, X.AnonymousClass4D7 r6) {
        /*
            r3 = 39
            boolean r0 = X.C66128MDg.A01(r3, r6)
            if (r0 == 0) goto L_0x0058
            r4 = r6
            X.MDg r4 = (X.C66128MDg) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0058
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r4.A02
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x0042
            if (r0 != r1) goto L_0x005e
            java.lang.Object r5 = r4.A01
            com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.GalleryMemoriesViewModel r5 = (com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.GalleryMemoriesViewModel) r5
            X.0eS.A00(r2)
        L_0x0028:
            X.9IZ r2 = (X.AnonymousClass9IZ) r2
            java.lang.Object r2 = r2.A03
            X.3HX r2 = (X.AnonymousClass3HX) r2
            if (r2 != 0) goto L_0x0032
            r0 = 0
            return r0
        L_0x0032:
            com.instagram.reels.store.ReelStore r1 = r5.A09
            java.lang.String r0 = r2.A1U
            com.instagram.model.reels.Reel r3 = r1.A0M(r0)
            if (r3 != 0) goto L_0x0057
            r0 = 0
            com.instagram.model.reels.Reel r3 = r1.A0I(r2, r0)
            return r3
        L_0x0042:
            X.0eS.A00(r2)
            X.3Nr r0 = r5.A03
            X.2Q9 r0 = r0.AvE()
            r4.A01 = r5
            r4.A00 = r1
            X.4Cp r0 = (X.C262214Cp) r0
            java.lang.Object r2 = r0.A0E(r4)
            if (r2 != r3) goto L_0x0028
        L_0x0057:
            return r3
        L_0x0058:
            X.MDg r4 = new X.MDg
            r4.<init>(r5, r6, r3)
            goto L_0x0016
        L_0x005e:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.GalleryMemoriesViewModel.A01(com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.GalleryMemoriesViewModel, X.4D7):java.lang.Object");
    }

    public static final boolean A02(GalleryMemoriesViewModel galleryMemoriesViewModel) {
        if (galleryMemoriesViewModel.A07.A08.A00 instanceof AnonymousClass9QA) {
            UserSession userSession = galleryMemoriesViewModel.A01;
            if (!182.A06(0Tu.A05, userSession, 36327748217617057L) || AnonymousClass8WT.A00(userSession) == AnonymousClass05K.A00) {
                return false;
            }
            return true;
        }
        return false;
    }
}

package com.instagram.igtv.uploadflow.upload;

import X.05G;
import X.0qQ;
import X.106;
import X.19B;
import X.1Av;
import X.28D;
import X.2Fk;
import X.2YL;
import X.AnonymousClass0eM;
import X.AnonymousClass0iw;
import X.AnonymousClass1YB;
import X.AnonymousClass2Fj;
import X.AnonymousClass2g9;
import X.AnonymousClass3Q2;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C51974G9v;
import X.C53368Gms;
import X.C60983Juf;
import X.C60990Jum;
import X.C60993Jup;
import X.C60994Juq;
import X.C61017JvH;
import X.C63302Kul;
import X.C63652L1o;
import X.C63722L4g;
import X.C63775L6h;
import X.C64147LQk;
import X.C65414Lsu;
import X.C66299MMi;
import X.JTO;
import X.JTR;
import X.KTX;
import X.KTY;
import X.LBS;
import X.LF3;
import X.LJ9;
import X.MHE;
import X.ML6;
import X.MW0;
import android.graphics.RectF;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.BrandedContentGatingInfoIntf;
import com.instagram.api.schemas.BrandedContentProjectMetadataIntf;
import com.instagram.api.schemas.MediaCroppingCoordinates;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.igtv.uploadflow.metadata.shopping.model.IGTVShoppingMetadata;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class IGTVUploadViewModel extends 2YL implements AnonymousClass0iw, MW0 {
    public static final long A0N = JTR.A0N(TimeUnit.DAYS);
    public 28D A00;
    public LJ9 A01;
    public boolean A02;
    public final 2Fk A03;
    public final 2Fk A04;
    public final AnonymousClass2Fj A05;
    public final UserSession A06;
    public final C63775L6h A07;
    public final C64147LQk A08;
    public final LF3 A09;
    public final C63652L1o A0A;
    public final String A0B;
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F;
    public final AnonymousClass0eM A0G;
    public final AnonymousClass0eM A0H;
    public final AnonymousClass0eM A0I;
    public final 05G A0J;
    public final C63302Kul A0K;
    public final 1Av A0L;
    public final /* synthetic */ C65414Lsu A0M = new C65414Lsu();

    public IGTVUploadViewModel(UserSession userSession, C63775L6h l6h, C64147LQk lQk, LF3 lf3, C63652L1o l1o, C63302Kul kul, 1Av r11, String str) {
        0qQ.A0B(str, 1);
        C51974G9v.A1S(userSession, lQk, l1o, l6h, lf3);
        0qQ.A0B(r11, 9);
        this.A0B = str;
        this.A06 = userSession;
        this.A08 = lQk;
        this.A0A = l1o;
        this.A07 = l6h;
        this.A09 = lf3;
        this.A0K = kul;
        this.A0L = r11;
        this.A00 = 28D.A5J;
        this.A0I = C66299MMi.A01(this, 28);
        this.A01 = KTY.A00;
        this.A04 = AnonymousClass2g9.A00(19B.A00, new MHE((Object) this, (AnonymousClass4D7) null, 49, 42));
        AnonymousClass2Fj A0K2 = JTO.A0K();
        this.A05 = A0K2;
        this.A03 = A0K2;
        this.A0C = C66299MMi.A01(this, 23);
        this.A0G = C66299MMi.A01(this, 26);
        this.A0F = C66299MMi.A01(this, 25);
        this.A0J = 106.A01(ImmutableList.of());
        this.A0H = C66299MMi.A01(this, 27);
        this.A0D = AnonymousClass1YB.A00(ML6.A00);
        this.A0E = C66299MMi.A01(this, 24);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0062, code lost:
        if (r6.equals(r0) != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007e, code lost:
        if (r6.equals(X.KTQ.A00) == false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        if (r6.equals(X.KTR.A00) != false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(X.AnonymousClass4DU r5, java.lang.Object r6) {
        /*
            r4 = this;
            r2 = 0
            X.LQk r1 = r4.A08
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x000b
            boolean r0 = r6 instanceof X.C61945KSu
            if (r0 != 0) goto L_0x0027
        L_0x000b:
            if (r5 == 0) goto L_0x0027
            X.KZv r0 = r1.A07
            android.util.Pair r0 = r0.A00
            java.lang.Object r3 = r0.first
            X.0qQ.A07(r3)
            boolean r0 = r3 instanceof X.C65391LsX
            if (r0 == 0) goto L_0x0038
            X.KTR r0 = X.KTR.A00
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0080
        L_0x0022:
            X.0eM r0 = r1.A0A
            r0.getValue()
        L_0x0027:
            r1.A02 = r2
            X.KZv r1 = r1.A07
            r1.A04(r6)
            boolean r0 = r6 instanceof X.C66395MQb
            if (r0 == 0) goto L_0x0037
            X.LLT r0 = X.LLT.A00
            r1.A04(r0)
        L_0x0037:
            return
        L_0x0038:
            boolean r0 = r3 instanceof X.C65402Lsi
            if (r0 != 0) goto L_0x0080
            boolean r0 = r3 instanceof X.C65385LsR
            if (r0 != 0) goto L_0x0065
            X.LsU r0 = X.C65388LsU.A00
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0065
            boolean r0 = r3 instanceof X.C65393LsZ
            if (r0 == 0) goto L_0x0068
            X.KT4 r0 = X.KT4.A00
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0022
            X.KT3 r0 = X.KT3.A00
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0022
            X.KT5 r0 = X.KT5.A00
        L_0x005e:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0027
            goto L_0x0022
        L_0x0065:
            X.KT8 r0 = X.KT8.A00
            goto L_0x005e
        L_0x0068:
            boolean r0 = r3 instanceof X.C65386LsS
            if (r0 != 0) goto L_0x0070
            boolean r0 = r3 instanceof X.C65389LsV
            if (r0 == 0) goto L_0x0027
        L_0x0070:
            X.KTP r0 = X.KTP.A00
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0022
            X.KTQ r0 = X.KTQ.A00
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0022
        L_0x0080:
            X.KSu r0 = X.C61945KSu.A00
            goto L_0x005e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel.A04(X.4DU, java.lang.Object):void");
    }

    public final void EgG(float f) {
        this.A0M.EgG(f);
    }

    public final String getModuleName() {
        return "IGTVUploadInteractor";
    }

    public final void setTitle(String str) {
        0qQ.A0B(str, 0);
        this.A0M.A0N = str;
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.MDx, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0064 A[Catch:{ 3g0 -> 0x00b0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ad A[EDGE_INSN: B:39:0x00ad->B:34:0x00ad ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r8, java.lang.String r9, X.AnonymousClass4D7 r10) {
        /*
            r3 = 43
            boolean r0 = X.C66145MDx.A02(r3, r10)
            if (r0 == 0) goto L_0x0024
            r7 = r10
            X.MDx r7 = (X.C66145MDx) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0024
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r7.A03
            X.1Hj r6 = X.1Hj.A02
            int r2 = r7.A00
            r1 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r1) goto L_0x002a
            java.lang.Object r9 = r7.A02
            goto L_0x0051
        L_0x0024:
            X.MDx r7 = new X.MDx
            r7.<init>(r8, r10, r3)
            goto L_0x0016
        L_0x002a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x002f:
            X.0eS.A00(r0)
            X.0eM r0 = r8.A0G     // Catch:{ 3g0 -> 0x00b0 }
            java.lang.Object r5 = r0.getValue()     // Catch:{ 3g0 -> 0x00b0 }
            com.instagram.igtv.repository.series.IGTVSeriesRepository r5 = (com.instagram.igtv.repository.series.IGTVSeriesRepository) r5     // Catch:{ 3g0 -> 0x00b0 }
            com.instagram.common.session.UserSession r0 = r8.A06     // Catch:{ 3g0 -> 0x00b0 }
            java.lang.String r4 = r0.A06     // Catch:{ 3g0 -> 0x00b0 }
            X.C66145MDx.A00(r8, r9, r7, r1)     // Catch:{ 3g0 -> 0x00b0 }
            com.instagram.repository.common.MemoryCache r3 = r5.A01     // Catch:{ 3g0 -> 0x00b0 }
            r2 = 0
            r1 = 2
            X.MEF r0 = new X.MEF     // Catch:{ 3g0 -> 0x00b0 }
            r0.<init>(r5, r4, r2, r1)     // Catch:{ 3g0 -> 0x00b0 }
            java.lang.Object r0 = r3.A02(r4, r7, r0)     // Catch:{ 3g0 -> 0x00b0 }
            if (r0 != r6) goto L_0x0054
            return r6
        L_0x0051:
            X.0eS.A00(r0)     // Catch:{ 3g0 -> 0x00b0 }
        L_0x0054:
            X.K1C r0 = (X.K1C) r0     // Catch:{ 3g0 -> 0x00b0 }
            java.util.List r3 = r0.A00     // Catch:{ 3g0 -> 0x00b0 }
            r5 = 0
            java.util.Iterator r2 = r3.iterator()     // Catch:{ 3g0 -> 0x00b0 }
        L_0x005d:
            boolean r0 = r2.hasNext()     // Catch:{ 3g0 -> 0x00b0 }
            r1 = -1
            if (r0 == 0) goto L_0x00ad
            java.lang.Object r0 = r2.next()     // Catch:{ 3g0 -> 0x00b0 }
            X.K1d r0 = (X.C61292K1d) r0     // Catch:{ 3g0 -> 0x00b0 }
            java.lang.String r0 = r0.A03     // Catch:{ 3g0 -> 0x00b0 }
            java.lang.String r0 = X.LQM.A02(r0)     // Catch:{ 3g0 -> 0x00b0 }
            boolean r0 = X.0qQ.A0K(r0, r9)     // Catch:{ 3g0 -> 0x00b0 }
            if (r0 == 0) goto L_0x0077
            goto L_0x007a
        L_0x0077:
            int r5 = r5 + 1
            goto L_0x005d
        L_0x007a:
            if (r5 == r1) goto L_0x00ad
            java.lang.Object r4 = r3.get(r5)     // Catch:{ 3g0 -> 0x00b0 }
            X.K1d r4 = (X.C61292K1d) r4     // Catch:{ 3g0 -> 0x00b0 }
            java.lang.String r3 = r4.A03     // Catch:{ 3g0 -> 0x00b0 }
            X.0qQ.A07(r3)     // Catch:{ 3g0 -> 0x00b0 }
            java.lang.String r2 = r4.A08     // Catch:{ 3g0 -> 0x00b0 }
            X.0qQ.A07(r2)     // Catch:{ 3g0 -> 0x00b0 }
            X.Ki6 r1 = r4.A00     // Catch:{ 3g0 -> 0x00b0 }
            X.Ki6 r0 = X.C62573Ki6.LIVE     // Catch:{ 3g0 -> 0x00b0 }
            if (r1 != r0) goto L_0x00a9
            java.util.List r0 = r4.A0B     // Catch:{ 3g0 -> 0x00b0 }
            if (r0 != 0) goto L_0x009a
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()     // Catch:{ 3g0 -> 0x00b0 }
        L_0x009a:
            int r1 = r0.size()     // Catch:{ 3g0 -> 0x00b0 }
            X.LMg r0 = new X.LMg     // Catch:{ 3g0 -> 0x00b0 }
            r0.<init>(r5, r1, r3, r2)     // Catch:{ 3g0 -> 0x00b0 }
            X.KTa r6 = new X.KTa     // Catch:{ 3g0 -> 0x00b0 }
            r6.<init>(r0)     // Catch:{ 3g0 -> 0x00b0 }
            goto L_0x00ac
        L_0x00a9:
            java.util.List r0 = r4.A0A     // Catch:{ 3g0 -> 0x00b0 }
            goto L_0x009a
        L_0x00ac:
            return r6
        L_0x00ad:
            X.KTb r6 = X.C61952KTb.A00     // Catch:{ 3g0 -> 0x00b0 }
            return r6
        L_0x00b0:
            r1 = move-exception
            java.lang.String r0 = "IGTVUploadInteractor"
            r1.A00(r0)
            X.KTc r6 = X.C61953KTc.A00
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel.A00(com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel, java.lang.String, X.4D7):java.lang.Object");
    }

    public final C60983Juf A01(String str) {
        int i;
        long currentTimeMillis;
        RectF rectF;
        KTX A022 = A02();
        0qQ.A0B(A022, 0);
        C65414Lsu lsu = this.A0M;
        C63722L4g l4g = lsu.A0C;
        if (l4g != null) {
            i = l4g.A00;
            currentTimeMillis = l4g.A01;
        } else {
            i = -1;
            currentTimeMillis = System.currentTimeMillis();
        }
        Medium medium = A022.A00;
        String str2 = medium.A0X;
        int i2 = medium.A07;
        AnonymousClass3Q2 r5 = A022.A02;
        C60993Jup jup = new C60993Jup(str2, i2, r5.A0H, r5.A0G, A022.A00());
        String str3 = lsu.A0N;
        String str4 = lsu.A0H;
        C53368Gms gms = new C53368Gms(lsu.A05, lsu.A06, 17);
        C60990Jum jum = new C60990Jum(0, r5.A02, r5.A5x);
        C60994Juq juq = new C60994Juq(lsu.A0J, lsu.A04, lsu.A03, lsu.A02, lsu.A0Y, lsu.A0Z);
        MediaCroppingCoordinates mediaCroppingCoordinates = lsu.A09;
        RectF rectF2 = null;
        if (mediaCroppingCoordinates != null) {
            rectF = new RectF(mediaCroppingCoordinates.A01, mediaCroppingCoordinates.A03, mediaCroppingCoordinates.A02, mediaCroppingCoordinates.A00);
        } else {
            rectF = null;
        }
        MediaCroppingCoordinates mediaCroppingCoordinates2 = lsu.A0A;
        if (mediaCroppingCoordinates2 != null) {
            rectF2 = new RectF(mediaCroppingCoordinates2.A01, mediaCroppingCoordinates2.A03, mediaCroppingCoordinates2.A02, mediaCroppingCoordinates2.A00);
        }
        boolean z = lsu.A0b;
        String str5 = lsu.A0M;
        boolean z2 = lsu.A0h;
        boolean z3 = lsu.A0Q;
        boolean z4 = lsu.A0R;
        boolean z5 = lsu.A0a;
        boolean z6 = lsu.A0f;
        List list = lsu.A0O;
        if (list == null) {
            list = AnonymousClass7TE.A1C();
        }
        return new C60983Juf(rectF, rectF2, gms, jum, new C61017JvH(lsu.A08, list, z3, z4, z5, z6, lsu.A0T, lsu.A0e), juq, jup, lsu.A0B, str3, str4, str5, str, i, currentTimeMillis, true, z, z2, true);
    }

    public final KTX A02() {
        LJ9 lj9 = this.A01;
        0qQ.A0C(lj9, "null cannot be cast to non-null type com.instagram.igtv.uploadflow.upload.IGTVUploadAsset.ValidUploadAsset");
        return (KTX) lj9;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.4D7, X.MDp] */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(int r15, X.AnonymousClass4D7 r16) {
        /*
            r14 = this;
            r3 = 34
            r5 = r16
            boolean r0 = X.C66137MDp.A02(r3, r5)
            if (r0 == 0) goto L_0x017a
            r4 = r5
            X.MDp r4 = (X.C66137MDp) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x017a
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0018:
            java.lang.Object r3 = r4.A02
            X.1Hj r1 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x015f
            if (r0 != r2) goto L_0x0180
            java.lang.Object r5 = r4.A01
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r5 = (com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel) r5
            X.0eS.A00(r3)
        L_0x002a:
            X.Juf r3 = (X.C60983Juf) r3
            com.instagram.igtv.draft.model.IGTVDraftsRepository r0 = X.JTP.A0a(r5)
            java.lang.String r1 = r5.A0B
            X.0qQ.A0B(r3, r2)
            java.util.Map r0 = r0.A00
            r0.put(r1, r3)
            X.Jup r9 = r3.A08
            java.lang.String r0 = r9.A04
            java.io.File r4 = X.AnonymousClass7TE.A0t(r0)
            long r6 = r9.A03
            int r1 = (int) r6
            r0 = 3
            com.instagram.common.gallery.Medium r8 = X.C282665Eg.A03(r4, r0, r1)
            int r1 = r9.A01
            r8.A07 = r1
            if (r1 == 0) goto L_0x0157
            r0 = 2
            if (r1 == r0) goto L_0x0157
            int r1 = r9.A00
            r6 = r1
            int r0 = r9.A02
            r7 = r0
        L_0x0059:
            r8.A0B = r1
            r8.A04 = r0
            X.LF3 r0 = r5.A09
            r12 = 0
            X.LJ9 r0 = r0.A01(r8, r5, r2)
            r5.A01 = r0
            X.1Av r2 = r5.A0L
            X.Lsu r9 = r5.A0M
            r1 = 0
            X.Jum r11 = r3.A05
            float r10 = r11.A00
            r9.A00(r10)
            java.lang.String r0 = r3.A0D
            r9.setTitle(r0)
            java.lang.String r0 = r3.A0A
            r9.ER5(r0)
            X.Gms r4 = r3.A04
            int r0 = r4.A00
            r9.A05 = r0
            int r0 = r4.A01
            r9.A06 = r0
            r9.EgG(r10)
            boolean r0 = r11.A02
            r9.A0d = r0
            X.Juq r4 = r3.A07
            boolean r0 = r4.A04
            r9.A0Y = r0
            java.lang.String r0 = r4.A03
            r9.A0J = r0
            int r0 = r4.A02
            r9.A04 = r0
            int r0 = r4.A01
            r9.A03 = r0
            int r0 = r4.A00
            r9.A02 = r0
            boolean r0 = r4.A05
            r9.A0Z = r0
            android.graphics.RectF r0 = r3.A02
            if (r0 == 0) goto L_0x0154
            float r13 = r0.left
            float r11 = r0.top
            float r10 = r0.right
            float r4 = r0.bottom
            com.instagram.api.schemas.MediaCroppingCoordinates r0 = new com.instagram.api.schemas.MediaCroppingCoordinates
            r0.<init>(r4, r13, r10, r11)
        L_0x00b8:
            r9.A09 = r0
            android.graphics.RectF r0 = r3.A03
            if (r0 == 0) goto L_0x00cb
            float r11 = r0.left
            float r10 = r0.top
            float r4 = r0.right
            float r0 = r0.bottom
            com.instagram.api.schemas.MediaCroppingCoordinates r12 = new com.instagram.api.schemas.MediaCroppingCoordinates
            r12.<init>(r0, r11, r4, r10)
        L_0x00cb:
            r9.A0A = r12
            X.JvH r4 = r3.A06
            java.lang.Object r0 = r4.A02
            java.util.List r0 = (java.util.List) r0
            r9.A0O = r0
            java.lang.Object r0 = r4.A01
            com.instagram.api.schemas.BrandedContentProjectMetadataIntf r0 = (com.instagram.api.schemas.BrandedContentProjectMetadataIntf) r0
            r9.A08 = r0
            boolean r0 = r4.A07
            r9.A0f = r0
            boolean r0 = r4.A05
            r9.A0a = r0
            boolean r0 = r4.A03
            r9.A0Q = r0
            boolean r0 = r4.A04
            r9.A0R = r0
            boolean r0 = r4.A06
            r9.A0e = r0
            java.lang.String r10 = r3.A0B
            r9.A0M = r10
            boolean r4 = r3.A0H
            r9.A0h = r4
            r9.A0U = r1
            boolean r0 = r3.A0E
            r9.A0b = r0
            int r12 = r3.A00
            long r0 = r3.A01
            X.L4g r11 = new X.L4g
            r11.<init>(r12, r0)
            r9.A0C = r11
            java.lang.String r1 = r3.A0C
            if (r1 == 0) goto L_0x0114
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0114
            r9.A0K = r1
        L_0x0114:
            com.instagram.igtv.uploadflow.metadata.shopping.model.IGTVShoppingMetadata r0 = r3.A09
            if (r0 == 0) goto L_0x011a
            r9.A0B = r0
        L_0x011a:
            boolean r0 = r3.A0G
            r9.A0g = r0
            boolean r3 = r3.A0F
            X.0xa r2 = r2.A01
            X.0xY r1 = r2.AR4()
            java.lang.String r0 = "igtv_share_preview_to_feed_pref"
            r1.E5T(r0, r3)
            r1.apply()
            if (r10 == 0) goto L_0x013c
            X.0xY r1 = r2.AR4()
            java.lang.String r0 = "felix_crossposting_sticky_pref"
            r1.E5T(r0, r4)
            r1.apply()
        L_0x013c:
            java.lang.String r0 = r9.A0J
            r8.A0a = r0
            r8.A0B = r7
            r8.A04 = r6
            X.LJ9 r0 = r5.A01
            boolean r0 = r0 instanceof X.KTX
            if (r0 == 0) goto L_0x0151
            X.KTX r0 = r5.A02()
            r0.A01()
        L_0x0151:
            X.LJ9 r0 = r5.A01
            return r0
        L_0x0154:
            r0 = r12
            goto L_0x00b8
        L_0x0157:
            int r1 = r9.A02
            r7 = r1
            int r0 = r9.A00
            r6 = r0
            goto L_0x0059
        L_0x015f:
            X.0eS.A00(r3)
            com.instagram.igtv.draft.model.IGTVDraftsRepository r0 = X.JTP.A0a(r14)
            X.MVv r0 = r0.A01
            X.0r6 r0 = r0.Ayp(r15)
            r4.A01 = r14
            r4.A00 = r2
            java.lang.Object r3 = X.AnonymousClass10c.A02(r4, r0)
            if (r3 != r1) goto L_0x0177
            return r1
        L_0x0177:
            r5 = r14
            goto L_0x002a
        L_0x017a:
            X.MDp r4 = X.C66137MDp.A00(r14, r5, r3)
            goto L_0x0018
        L_0x0180:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel.A03(int, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008b, code lost:
        if (r3.A2q == null) goto L_0x008d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(X.LBS r11) {
        /*
            r10 = this;
            X.Lsu r2 = r10.A0M
            r2.A0D = r11
            com.instagram.common.session.UserSession r0 = r10.A06
            r6 = 0
            r9 = 1
            com.instagram.pendingmedia.store.PendingMediaStore r1 = X.28K.A00(r0)
            java.lang.String r0 = r11.A0C
            X.3Q2 r3 = r1.A03(r0)
            if (r3 != 0) goto L_0x003a
            X.3Q2 r3 = X.AnonymousClass9T3.A01(r0)
            java.lang.String r0 = r11.A09
            r3.A2U = r0
            long r0 = r11.A08
            r3.A0a = r0
            boolean r0 = r11.A0H
            r3.A5x = r0
            java.util.ArrayList r0 = r11.A02
            r3.A4C = r0
            boolean r0 = X.DbT.A1b(r0)
            r3.A5i = r0
            int r0 = r11.A01
            r3.A0H = r0
            int r0 = r11.A00
            r3.A0G = r0
            int r0 = r11.A07
            r3.A07 = r0
        L_0x003a:
            java.lang.String r0 = r3.A3o
            if (r0 != 0) goto L_0x0040
            java.lang.String r0 = r2.A0N
        L_0x0040:
            r2.setTitle(r0)
            java.lang.String r0 = r3.A2Z
            if (r0 != 0) goto L_0x0049
            java.lang.String r0 = r2.A0H
        L_0x0049:
            r2.ER5(r0)
            boolean r0 = r3.A5M
            r2.A0Y = r0
            boolean r0 = r3.A5L
            r2.A0Z = r0
            int r0 = r3.A05
            r2.A02 = r0
            int r0 = r3.A07
            r2.A01 = r0
            java.lang.String r0 = r3.A33
            r2.A0J = r0
            X.LBS r1 = r2.A0D
            if (r1 == 0) goto L_0x00b0
            int r0 = r3.A0H
        L_0x0066:
            r2.A04 = r0
            if (r1 == 0) goto L_0x00ad
            int r0 = r3.A0G
        L_0x006c:
            r2.A03 = r0
            java.util.List r0 = r3.A4C
            r2.A0O = r0
            boolean r0 = r3.A5i
            r2.A0f = r0
            com.instagram.api.schemas.BrandedContentGatingInfo r0 = r3.A0s
            r2.A07 = r0
            com.instagram.api.schemas.BrandedContentProjectMetadata r0 = r3.A0t
            r2.A08 = r0
            boolean r0 = r3.A5Z
            r2.A0b = r0
            X.3QO r1 = r3.A1F
            X.3QO r0 = X.AnonymousClass3QO.FAN_CLUB
            if (r1 != r0) goto L_0x008d
            java.lang.String r1 = r3.A2q
            r0 = 1
            if (r1 != 0) goto L_0x008e
        L_0x008d:
            r0 = 0
        L_0x008e:
            r2.A0U = r0
            java.lang.String r4 = r3.A35
            r5 = 0
            r7 = r6
            r8 = r6
            com.instagram.common.gallery.Medium r1 = X.C282665Eg.A04(r4, r5, r6, r7, r8, r9)
            X.KTX r0 = new X.KTX
            r0.<init>(r1, r10, r3, r9)
            r10.A01 = r0
            boolean r0 = r11.A05
            r2.A0b = r0
            boolean r0 = r11.A06
            r2.A0c = r0
            boolean r0 = r11.A04
            r2.A0U = r0
            return
        L_0x00ad:
            int r0 = r3.A0B
            goto L_0x006c
        L_0x00b0:
            int r0 = r3.A0C
            goto L_0x0066
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel.A05(X.LBS):void");
    }

    public final boolean A06() {
        return AnonymousClass7TF.A1W(this.A00, 28D.A3B);
    }

    public final boolean AcO() {
        return this.A0M.A0Q;
    }

    public final boolean AcP() {
        return this.A0M.A0R;
    }

    public final BrandedContentProjectMetadataIntf Aho() {
        return this.A0M.A08;
    }

    public final List Ahr() {
        return this.A0M.A0O;
    }

    public final String AlL() {
        return this.A0M.A0H;
    }

    public final int Arw() {
        return this.A0M.A02;
    }

    public final int Arx() {
        return this.A0M.A03;
    }

    public final int As0() {
        return this.A0M.A04;
    }

    public final boolean B2Q() {
        return this.A0M.A0U;
    }

    public final String B2V() {
        return this.A0M.A0L;
    }

    public final MediaCroppingCoordinates B5R() {
        return this.A0M.A09;
    }

    public final int B5s() {
        return this.A0M.A05;
    }

    public final int B5v() {
        return this.A0M.A06;
    }

    public final BrandedContentGatingInfoIntf BQ3() {
        return this.A0M.A07;
    }

    public final NewFundraiserInfo BVx() {
        return this.A0M.A0E;
    }

    public final List BbY() {
        return this.A0M.A0P;
    }

    public final float Be4() {
        return this.A0M.A00;
    }

    public final LBS BeC() {
        return this.A0M.A0D;
    }

    public final AnonymousClass2Fj BeD() {
        return this.A0M.A0j;
    }

    public final MediaCroppingCoordinates Bgq() {
        return this.A0M.A0A;
    }

    public final boolean BtO() {
        return this.A0M.A0h;
    }

    public final IGTVShoppingMetadata Bto() {
        return this.A0M.A0B;
    }

    public final boolean CQe() {
        return this.A0M.A0Z;
    }

    public final boolean CU6() {
        return this.A0M.A0a;
    }

    public final boolean CW4() {
        return this.A0M.A0d;
    }

    public final void EQ1(BrandedContentProjectMetadataIntf brandedContentProjectMetadataIntf) {
        this.A0M.A08 = brandedContentProjectMetadataIntf;
    }

    public final void EQ2(List list) {
        this.A0M.A0O = list;
    }

    public final void ER5(String str) {
        this.A0M.A0H = str;
    }

    public final void ESz(boolean z) {
        this.A0M.A0Y = z;
    }

    public final void ET0(String str) {
        this.A0M.A0J = str;
    }

    public final void ET1(boolean z) {
        this.A0M.A0Z = z;
    }

    public final void ET2(int i) {
        this.A0M.A02 = i;
    }

    public final void ET3(int i) {
        this.A0M.A03 = i;
    }

    public final void ET6(int i) {
        this.A0M.A04 = i;
    }

    public final void EWn(int i) {
        this.A0M.A05 = i;
    }

    public final void EWp(int i) {
        this.A0M.A06 = i;
    }

    public final void Eah(boolean z) {
        this.A0M.A0d = z;
    }

    public final void EfL(boolean z) {
        this.A0M.A0f = z;
    }

    public final void EfX(List list) {
        this.A0M.A0P = list;
    }

    public final void EkA(boolean z) {
        this.A0M.A0h = z;
    }

    public final String getTitle() {
        return this.A0M.A0N;
    }

    public final boolean isPaidPartnership() {
        return this.A0M.A0f;
    }
}

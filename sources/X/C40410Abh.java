package X;

import android.content.Context;
import com.instagram.clips.template.creation.model.ClipsTemplateModel;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.util.List;

/* renamed from: X.Abh  reason: case insensitive filesystem */
public final class C40410Abh implements B1S {
    public final ClipsTemplateModel A00;
    public final C353828Ji A01;
    public final C3499582p A02;
    public final AnonymousClass9P8 A03;
    public final AnonymousClass8A2 A04;
    public final C39716A6h A05;
    public final A5C A06;
    public final A5D A07;
    public final A5E A08;
    public final AnonymousClass831 A09;
    public final Boolean A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final List A0G;
    public final List A0H;
    public final List A0I;
    public final C62320sa A0J;
    public final C62320sa A0K;
    public final boolean A0L;
    public final Context A0M;
    public final UserSession A0N;
    public final CropInfo A0O;
    public final C366678pU A0P;
    public final A89 A0Q;
    public final AnonymousClass3QO A0R;
    public final PendingMediaStore A0S;
    public final C62320sa A0T;
    public final C62320sa A0U;
    public final C62320sa A0V;
    public final 0sP A0W;
    public final 0sL A0X;
    public final 0sL A0Y;
    public final boolean A0Z;

    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01aa, code lost:
        if (X.182.A06(X.0Tu.A05, r1.A0N, 36324372373450799L) == false) goto L_0x01ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01b9, code lost:
        if (X.182.A06(X.0Tu.A05, r1.A0N, 36324372373319725L) != false) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01bb, code lost:
        r0 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0266 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object Cor(X.C293505kq r64, X.AnonymousClass4D7 r65) {
        /*
            r63 = this;
            r1 = r63
            X.0sa r0 = r1.A0U
            r0.invoke()
            X.0sa r0 = r1.A0J
            java.lang.Object r2 = r0.invoke()
            X.3Q2 r2 = (X.AnonymousClass3Q2) r2
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r2.A13
            java.lang.String r0 = r0.A03
            if (r0 == 0) goto L_0x002b
            boolean r0 = X.00l.A0W(r0)
            if (r0 != 0) goto L_0x002b
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r2.A13
            java.lang.String r3 = r0.A03
            r0 = 4300(0x10cc, float:6.026E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = X.0qQ.A0K(r3, r0)
            if (r0 == 0) goto L_0x0084
        L_0x002b:
            com.instagram.common.gallery.metadata.MediaUploadMetadata r6 = r2.A13
            X.A6h r7 = r1.A05
            java.lang.String r11 = r7.A02
            r5 = 0
            r9 = 1
            int r0 = r11.length()
            if (r0 != 0) goto L_0x0082
            java.util.List r8 = r7.A03
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r8.iterator()
        L_0x0043:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0059
            java.lang.Object r0 = r3.next()
            com.instagram.common.gallery.Medium r0 = (com.instagram.common.gallery.Medium) r0
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r0.A0G
            java.lang.String r0 = r0.A03
            if (r0 == 0) goto L_0x0043
            r10.add(r0)
            goto L_0x0043
        L_0x0059:
            com.instagram.common.session.UserSession r4 = r7.A01
            r11 = 0
            java.lang.String r0 = ""
            X.Kp0 r0 = X.C59737JVv.A01(r4, r0, r10)
            if (r0 != 0) goto L_0x007e
            int r0 = r8.size()
            if (r0 != r9) goto L_0x0082
            java.lang.Object r0 = r8.get(r5)
            com.instagram.common.gallery.Medium r0 = (com.instagram.common.gallery.Medium) r0
            if (r0 == 0) goto L_0x0082
            java.lang.String r3 = r0.A0X
            if (r3 == 0) goto L_0x0082
            android.content.Context r0 = r7.A00
            X.Kp0 r0 = X.C59737JVv.A00(r0, r4, r3, r5)
            if (r0 == 0) goto L_0x0082
        L_0x007e:
            java.lang.String r11 = r0.A01()
        L_0x0082:
            r6.A03 = r11
        L_0x0084:
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r2.A13
            java.lang.String r0 = r0.A02
            if (r0 == 0) goto L_0x0090
            boolean r0 = X.00l.A0W(r0)
            if (r0 == 0) goto L_0x00ba
        L_0x0090:
            com.instagram.common.gallery.metadata.MediaUploadMetadata r5 = r2.A13
            X.A6h r0 = r1.A05
            java.util.List r0 = r0.A03
            java.util.ArrayList r4 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x009e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00b2
            java.lang.Object r0 = r3.next()
            com.instagram.common.gallery.Medium r0 = (com.instagram.common.gallery.Medium) r0
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r0.A0G
            java.lang.String r0 = r0.A02
            r4.add(r0)
            goto L_0x009e
        L_0x00b2:
            java.lang.Object r0 = X.00k.A0J(r4)
            java.lang.String r0 = (java.lang.String) r0
            r5.A02 = r0
        L_0x00ba:
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r2.A13
            java.lang.String r0 = r0.A08
            if (r0 == 0) goto L_0x00c6
            boolean r0 = X.00l.A0W(r0)
            if (r0 == 0) goto L_0x00f0
        L_0x00c6:
            com.instagram.common.gallery.metadata.MediaUploadMetadata r5 = r2.A13
            X.A6h r0 = r1.A05
            java.util.List r0 = r0.A03
            java.util.ArrayList r4 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x00d4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00e8
            java.lang.Object r0 = r3.next()
            com.instagram.common.gallery.Medium r0 = (com.instagram.common.gallery.Medium) r0
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r0.A0G
            java.lang.String r0 = r0.A08
            r4.add(r0)
            goto L_0x00d4
        L_0x00e8:
            java.lang.Object r0 = X.00k.A0J(r4)
            java.lang.String r0 = (java.lang.String) r0
            r5.A08 = r0
        L_0x00f0:
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r2.A13
            java.lang.String r0 = r0.A0A
            if (r0 == 0) goto L_0x00fc
            boolean r0 = X.00l.A0W(r0)
            if (r0 == 0) goto L_0x0129
        L_0x00fc:
            com.instagram.common.gallery.metadata.MediaUploadMetadata r7 = r2.A13
            X.A5E r0 = r1.A08
            boolean r8 = r2.A12()
            java.util.List r6 = r0.A00
            int r5 = r6.size()
            r4 = 0
            r0 = 1
            r3 = 0
            if (r5 != r0) goto L_0x0253
            java.lang.Object r4 = r6.get(r4)
            com.instagram.common.gallery.Medium r4 = (com.instagram.common.gallery.Medium) r4
            if (r4 == 0) goto L_0x0254
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r4.A0G
            java.lang.String r0 = r0.A0A
            if (r0 == 0) goto L_0x0254
            boolean r0 = X.00l.A0W(r0)
            if (r0 != 0) goto L_0x0254
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r4.A0G
            java.lang.String r3 = r0.A0A
        L_0x0127:
            r7.A0A = r3
        L_0x0129:
            X.82p r0 = r1.A02
            X.82o r0 = r0.A02
            X.82Y r5 = r0.A01
            java.lang.String r0 = r5.A05()
            int r0 = r0.hashCode()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.A2e = r0
            java.lang.String r0 = r1.A0F
            r2.A33 = r0
            X.A5C r0 = r1.A06
            X.82z r3 = r0.A00
            java.lang.String r0 = r0.A01
            X.835 r0 = r3.A00(r0)
            X.83I r0 = r0.A03
            X.51W r6 = r0.A02()
            r2.A1P = r6
            X.A5D r0 = r1.A07
            android.content.Context r4 = r0.A00
            com.instagram.common.session.UserSession r3 = r0.A01
            X.2Nn r0 = X.AnonymousClass830.A00(r4, r3)
            r9 = 0
            com.facebook.videolite.transcoder.base.composition.MediaComposition r0 = X.AHJ.A01(r4, r3, r6, r0, r9)
            r2.A0r = r0
            X.8pU r6 = r1.A0P
            r8 = 0
            if (r6 == 0) goto L_0x0250
            X.8pV r0 = r6.A03
            if (r0 == 0) goto L_0x0250
            X.8PW r0 = r0.A05
            if (r0 == 0) goto L_0x0250
            java.util.LinkedHashMap r0 = r0.A09
            if (r0 == 0) goto L_0x0250
            java.util.Set r3 = r0.keySet()
            if (r3 == 0) goto L_0x0250
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0233
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0233
        L_0x0185:
            r0 = 0
        L_0x0186:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
        L_0x018a:
            X.8Yz r0 = r5.A0X
            if (r0 == 0) goto L_0x0230
            X.80m r0 = r0.A08
            java.lang.Object r3 = r0.A00
        L_0x0192:
            r5 = 1
            boolean r0 = X.AnonymousClass7TF.A1Y(r4, r5)
            if (r0 == 0) goto L_0x022e
            boolean r0 = r3 instanceof X.AnonymousClass80O
            if (r0 == 0) goto L_0x01ac
            com.instagram.common.session.UserSession r7 = r1.A0N
            X.0Tu r0 = X.0Tu.A05
            r3 = 36324372373450799(0x810cd30002302f, double:3.035017583253111E-306)
            boolean r0 = X.182.A06(r0, r7, r3)
            if (r0 != 0) goto L_0x01bb
        L_0x01ac:
            com.instagram.common.session.UserSession r7 = r1.A0N
            X.0Tu r0 = X.0Tu.A05
            r3 = 36324372373319725(0x810cd30000302d, double:3.035017583170219E-306)
            boolean r0 = X.182.A06(r0, r7, r3)
            if (r0 == 0) goto L_0x022e
        L_0x01bb:
            r0 = 1
        L_0x01bc:
            r3 = r0 ^ 1
            X.8Ji r0 = r1.A01
            X.81C r0 = r0.A00
            X.81E r0 = r0.A00()
            X.8Jj r0 = (X.C353838Jj) r0
            r37 = 0
            android.graphics.Bitmap r3 = r0.A02(r3)
            if (r3 == 0) goto L_0x022c
            float r0 = r2.A02
            android.graphics.Bitmap r4 = X.AEI.A00(r3, r0)
        L_0x01d6:
            android.content.Context r11 = r1.A0M
            com.instagram.common.session.UserSession r12 = r1.A0N
            X.0sL r3 = r1.A0Y
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            java.lang.Object r4 = r3.invoke(r4, r0)
            X.1GK r4 = (X.1GK) r4
            X.0sa r0 = r1.A0V
            java.lang.Object r3 = r0.invoke()
            X.1GK r3 = (X.1GK) r3
            if (r6 == 0) goto L_0x022a
            X.8pV r0 = r6.A03
            if (r0 == 0) goto L_0x022a
            X.8PW r0 = r0.A05
            if (r0 == 0) goto L_0x022a
            java.util.LinkedHashMap r0 = r0.A09
        L_0x01fa:
            X.KH3 r10 = new X.KH3
            r13 = r4
            r14 = r3
            r15 = r37
            r16 = r2
            r17 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r0 = r10.call()
            if (r0 != 0) goto L_0x0272
            java.lang.String r0 = "Failed to prepare pending media video for Clips upload"
            java.lang.IllegalStateException r5 = X.AnonymousClass7TE.A0z(r0)
            X.8A2 r1 = r1.A04
            java.lang.String r4 = r5.getMessage()
            X.1QP r0 = r1.A0J
            long r2 = r1.A07
            X.AE4 r1 = new X.AE4
            r1.<init>(r0)
            r1.A01 = r2
            java.lang.String r0 = "error"
            r1.A06(r0, r4)
            throw r5
        L_0x022a:
            r0 = r8
            goto L_0x01fa
        L_0x022c:
            r4 = 0
            goto L_0x01d6
        L_0x022e:
            r0 = 0
            goto L_0x01bc
        L_0x0230:
            r3 = r8
            goto L_0x0192
        L_0x0233:
            java.util.Iterator r4 = r3.iterator()
        L_0x0237:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0185
            android.graphics.drawable.Drawable r3 = X.AnonymousClass7TE.A0Z(r4)
            boolean r0 = X.AnonymousClass9SF.A04(r3)
            if (r0 != 0) goto L_0x0237
            X.9X8 r0 = X.AnonymousClass9SF.A01(r3)
            if (r0 != 0) goto L_0x0237
            r0 = 1
            goto L_0x0186
        L_0x0250:
            r4 = r8
            goto L_0x018a
        L_0x0253:
            r4 = r3
        L_0x0254:
            if (r8 == 0) goto L_0x0266
            if (r4 == 0) goto L_0x0127
            android.net.Uri r0 = r4.A02()
            java.lang.String r0 = X.C59782JYb.A00(r0)
            java.lang.String r3 = X.C59737JVv.A04(r0)
            goto L_0x0127
        L_0x0266:
            if (r4 == 0) goto L_0x0127
            java.lang.String r0 = r4.A0X
            if (r0 == 0) goto L_0x0127
            java.lang.String r3 = X.C364678lo.A05(r0)
            goto L_0x0127
        L_0x0272:
            X.0sP r3 = r1.A0W
            java.lang.String r0 = r2.A35
            r3.invoke(r0)
            com.instagram.pendingmedia.store.PendingMediaStore r4 = r1.A0S
            java.lang.String r0 = r2.A35
            r4.A0D(r2, r0)
            java.lang.String r3 = r2.A35
            java.util.Set r0 = r4.A07
            r0.add(r3)
            X.0sa r0 = r1.A0T
            java.lang.Object r7 = r0.invoke()
            X.8pU r7 = (X.C366678pU) r7
            X.8vh r6 = new X.8vh
            r6.<init>(r7)
            X.0Tu r0 = X.0Tu.A05
            r3 = 36320378053730679(0x81093100002177, double:3.0324915593782725E-306)
            boolean r0 = X.182.A06(r0, r12, r3)
            if (r0 == 0) goto L_0x02cd
            X.8pR r0 = r7.A01
            X.8pN r0 = r0.A04
            java.util.List r13 = X.C18686Vwk.A02(r0)
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r13.iterator()
        L_0x02b1:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0303
            java.lang.Object r0 = r3.next()
            X.XCH r0 = (X.XCH) r0
            X.513 r0 = X.C18686Vwk.A00(r0)
            if (r0 == 0) goto L_0x02b1
            X.50v r0 = r0.A00()
            if (r0 == 0) goto L_0x02b1
            r7.add(r0)
            goto L_0x02b1
        L_0x02cd:
            X.8vj r0 = r6.A02
            if (r0 == 0) goto L_0x02fb
            X.8vl r0 = r0.A04
            if (r0 == 0) goto L_0x02fb
            java.util.List r0 = r0.A03
        L_0x02d7:
            java.lang.String r4 = "Required value was null."
            if (r0 == 0) goto L_0x0524
            java.util.ArrayList r7 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x02e3:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0302
            java.lang.Object r0 = r3.next()
            X.A6D r0 = (X.A6D) r0
            X.513 r0 = r0.A00
            if (r0 == 0) goto L_0x02fd
            X.50v r0 = r0.A00()
            r7.add(r0)
            goto L_0x02e3
        L_0x02fb:
            r0 = r8
            goto L_0x02d7
        L_0x02fd:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r4)
            throw r0
        L_0x0302:
            r13 = r8
        L_0x0303:
            X.0sL r0 = r1.A0X
            r0.invoke(r6, r7)
            X.A89 r3 = r1.A0Q
            java.util.HashMap r12 = X.AnonymousClass7TE.A1E()
            com.instagram.common.session.UserSession r11 = r3.A04
            X.8pV r0 = r3.A08
            X.8PW r4 = r0.A05
            if (r4 == 0) goto L_0x0338
            java.util.List r4 = r4.A0E
        L_0x0318:
            java.util.HashMap r4 = X.C59895JbK.A0D(r11, r4)
            if (r4 == 0) goto L_0x033a
            java.util.Iterator r10 = X.AnonymousClass7TF.A0s(r4)
        L_0x0322:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L_0x033a
            java.util.Map$Entry r4 = X.AnonymousClass7TE.A1J(r10)
            java.lang.Object r7 = r4.getKey()
            java.lang.Object r4 = r4.getValue()
            r12.put(r7, r4)
            goto L_0x0322
        L_0x0338:
            r4 = 0
            goto L_0x0318
        L_0x033a:
            X.7zv r4 = r3.A0A
            int r7 = r4.A0F
            r60 = r7
            X.8nd r27 = X.C365758nd.A07
            java.lang.String r7 = r4.A0f
            r32 = r7
            java.lang.Integer r7 = r3.A0B
            r30 = r7
            java.util.Set r7 = r3.A0E
            java.util.ArrayList r43 = X.AnonymousClass7TE.A1D(r7)
            java.util.Set r7 = r4.A10
            if (r7 == 0) goto L_0x0520
            com.google.common.collect.ImmutableList r44 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r7)
        L_0x0358:
            X.8DO r7 = r3.A07
            r26 = r7
            java.util.List r7 = r4.A0u
            r59 = r7
            com.instagram.camera.effect.models.CameraAREffect r7 = r0.A00
            r62 = r7
            int r7 = r3.A00
            r55 = r7
            java.lang.String r33 = r4.A06()
            X.8PW r7 = r0.A05
            if (r7 == 0) goto L_0x051d
            java.util.List r7 = r7.A0D
        L_0x0372:
            X.LMJ r23 = X.C59895JbK.A09(r7)
            X.82o r10 = r3.A06
            java.lang.String r7 = r4.A0l
            r34 = r7
            r48 = 7
            X.9I6 r19 = new X.9I6
            r45 = r19
            r46 = r9
            r47 = r9
            r49 = r9
            r50 = r9
            r45.<init>(r46, r47, r48, r49, r50)
            X.8PW r7 = r0.A05
            r54 = 1
            if (r7 == 0) goto L_0x0519
            boolean r7 = r7.A00()
            if (r7 != r5) goto L_0x0519
        L_0x0399:
            X.8PW r5 = r0.A05
            X.0qQ.A0A(r5)
            X.8Nz r5 = r5.A06
            int r51 = X.C59895JbK.A00(r5)
            java.lang.String r5 = r3.A0C
            r35 = r5
            java.lang.String r5 = r3.A0D
            r22 = r5
            X.8PW r5 = r0.A05
            X.0qQ.A0A(r5)
            java.util.List r7 = r5.A0E
            X.8PW r5 = r0.A05
            if (r5 == 0) goto L_0x0516
            java.util.List r5 = r5.A0F
        L_0x03b9:
            android.util.Pair r16 = X.C59895JbK.A04(r7, r5)
            X.82Y r7 = r10.A01
            boolean r5 = r7.A0N
            r21 = r5
            com.instagram.music.common.model.MusicBrowseCategory r5 = r3.A09
            r20 = r5
            java.lang.String r5 = r7.A0G
            boolean r56 = X.AnonymousClass7TF.A1V(r5)
            r52 = 0
            X.8pT r5 = r0.A04
            com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation r24 = X.AEE.A00(r5)
            boolean r57 = X.AEE.A02(r0)
            java.lang.Integer r31 = r4.A04()
            boolean r58 = r10.A0D()
            boolean r0 = r3.A0G
            r18 = r0
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r0 = r3.A05
            r17 = r0
            X.293 r15 = r3.A02
            X.EZl r14 = r3.A01
            com.instagram.api.schemas.ACRType r10 = r3.A03
            com.instagram.reels.prompt.model.PromptStickerModel r5 = r7.A09
            r4.A02()
            boolean r0 = r3.A0F
            r25 = r17
            r28 = r20
            r29 = r5
            r36 = r22
            r38 = r37
            r39 = r37
            r40 = r37
            r41 = r37
            r42 = r12
            r45 = r59
            r46 = r37
            r47 = r37
            r48 = r37
            r49 = r60
            r50 = r55
            r55 = r21
            r59 = r18
            r60 = r0
            r61 = r9
            r17 = r14
            r18 = r15
            r20 = r10
            r21 = r62
            r22 = r11
            com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo r11 = X.C59895JbK.A0A(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r54, r55, r56, r57, r58, r59, r60, r61)
            java.lang.String r12 = r2.A35
            com.instagram.creation.base.CropInfo r10 = r1.A0O
            X.3QO r7 = r1.A0R
            boolean r0 = r1.A0Z
            r4 = r64
            if (r0 == 0) goto L_0x0513
            X.JXu r8 = X.JXu.A03
            X.0qQ.A0B(r4, r9)
            long r2 = r4.A01
            r14 = -1
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x0447
            long r2 = java.lang.System.currentTimeMillis()
        L_0x0447:
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r2)
        L_0x044c:
            X.0sa r0 = r1.A0K
            java.lang.Object r9 = r0.invoke()
            X.JXe r3 = new X.JXe
            r3.<init>()
            X.JXc r0 = new X.JXc
            r0.<init>(r12)
            r3.A0g = r0
            X.JXc r0 = new X.JXc
            r0.<init>(r6)
            r3.A0i = r0
            X.JXc r0 = new X.JXc
            r0.<init>(r13)
            r3.A0n = r0
            X.JXc r0 = new X.JXc
            r0.<init>(r11)
            r3.A0k = r0
            X.9P8 r2 = r1.A03
            X.JXc r0 = new X.JXc
            r0.<init>(r2)
            r3.A0j = r0
            com.instagram.clips.template.creation.model.ClipsTemplateModel r0 = r1.A00
            r3.A04(r0)
            X.JXc r0 = new X.JXc
            r0.<init>(r10)
            r3.A0t = r0
            java.util.List r2 = r1.A0I
            X.JXc r0 = new X.JXc
            r0.<init>(r2)
            r3.A0h = r0
            java.util.List r2 = r1.A0G
            X.JXc r0 = new X.JXc
            r0.<init>(r2)
            r3.A09 = r0
            X.JXc r0 = new X.JXc
            r0.<init>(r9)
            r3.A0m = r0
            java.lang.String r2 = r1.A0B
            X.JXc r0 = new X.JXc
            r0.<init>(r2)
            r3.A0F = r0
            boolean r0 = r1.A0L
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            X.JXc r0 = new X.JXc
            r0.<init>(r2)
            r3.A0V = r0
            java.lang.String r2 = r1.A0D
            X.JXc r0 = new X.JXc
            r0.<init>(r2)
            r3.A0W = r0
            java.lang.String r2 = r1.A0C
            X.JXc r0 = new X.JXc
            r0.<init>(r2)
            r3.A0M = r0
            java.util.List r2 = r1.A0H
            X.JXc r0 = new X.JXc
            r0.<init>(r2)
            r3.A0o = r0
            java.lang.String r2 = r1.A0E
            if (r2 == 0) goto L_0x04dd
            X.JXc r0 = new X.JXc
            r0.<init>(r2)
            r3.A06 = r0
        L_0x04dd:
            if (r7 == 0) goto L_0x04e6
            X.JXc r0 = new X.JXc
            r0.<init>(r7)
            r3.A00 = r0
        L_0x04e6:
            java.lang.Boolean r2 = r1.A0A
            if (r2 == 0) goto L_0x04f1
            X.JXc r0 = new X.JXc
            r0.<init>(r2)
            r3.A0U = r0
        L_0x04f1:
            X.831 r0 = r1.A09
            if (r0 == 0) goto L_0x0500
            java.util.ArrayList r0 = r0.A05()
            java.util.List r0 = X.LIO.A01(r0)
            r3.A06(r0)
        L_0x0500:
            if (r8 == 0) goto L_0x0505
            r3.A05(r8)
        L_0x0505:
            if (r5 == 0) goto L_0x050e
            long r0 = r5.longValue()
            r3.A03(r0)
        L_0x050e:
            X.5kq r0 = r3.A01(r4)
            return r0
        L_0x0513:
            r5 = r8
            goto L_0x044c
        L_0x0516:
            r5 = 0
            goto L_0x03b9
        L_0x0519:
            r54 = 0
            goto L_0x0399
        L_0x051d:
            r7 = 0
            goto L_0x0372
        L_0x0520:
            r44 = 0
            goto L_0x0358
        L_0x0524:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40410Abh.Cor(X.5kq, X.4D7):java.lang.Object");
    }

    public C40410Abh(Context context, ClipsTemplateModel clipsTemplateModel, UserSession userSession, CropInfo cropInfo, C353828Ji r7, C3499582p r8, C366678pU r9, AnonymousClass9P8 r10, AnonymousClass8A2 r11, C39716A6h a6h, A5C a5c, A5D a5d, A89 a89, A5E a5e, AnonymousClass831 r17, AnonymousClass3QO r18, PendingMediaStore pendingMediaStore, Boolean bool, String str, String str2, String str3, String str4, String str5, List list, List list2, List list3, C62320sa r29, C62320sa r30, C62320sa r31, C62320sa r32, C62320sa r33, 0sP r34, 0sL r35, 0sL r36, boolean z, boolean z2) {
        PendingMediaStore pendingMediaStore2 = pendingMediaStore;
        0qQ.A0B(pendingMediaStore2, 4);
        0qQ.A0B(r11, 24);
        this.A0M = context;
        this.A0N = userSession;
        this.A0J = r29;
        this.A0S = pendingMediaStore2;
        this.A05 = a6h;
        this.A08 = a5e;
        this.A02 = r8;
        this.A0F = str;
        this.A06 = a5c;
        this.A07 = a5d;
        this.A01 = r7;
        this.A0Y = r35;
        this.A0V = r30;
        this.A0W = r34;
        this.A0Q = a89;
        this.A0X = r36;
        this.A0K = r31;
        this.A0O = cropInfo;
        this.A03 = r10;
        this.A00 = clipsTemplateModel;
        this.A0I = list;
        this.A0G = list2;
        this.A0B = str2;
        this.A04 = r11;
        this.A09 = r17;
        this.A0U = r32;
        this.A0P = r9;
        this.A0T = r33;
        this.A0L = z;
        this.A0R = r18;
        this.A0Z = z2;
        this.A0D = str3;
        this.A0C = str4;
        this.A0E = str5;
        this.A0A = bool;
        this.A0H = list3;
    }
}

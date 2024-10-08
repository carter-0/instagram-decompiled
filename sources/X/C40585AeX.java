package X;

import android.content.Context;
import android.graphics.Color;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.AeX  reason: case insensitive filesystem */
public final class C40585AeX implements MU6 {
    public final Context A00;
    public final UserSession A01;

    public static final int A00(List list) {
        return Color.argb((int) ((AnonymousClass7TG.A00(list, 3) * 255.0f) + 0.5f), (int) ((AnonymousClass7TG.A00(list, 0) * 255.0f) + 0.5f), (int) ((AnonymousClass7TG.A00(list, 1) * 255.0f) + 0.5f), (int) ((AnonymousClass7TG.A00(list, 2) * 255.0f) + 0.5f));
    }

    public final String getName() {
        return "PreprocessServerEditing";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x012b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x026e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
        X.1zE.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0272, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object FIH(X.LP8 r24, X.AnonymousClass4D7 r25) {
        /*
            r23 = this;
            r5 = r24
            X.3Q2 r4 = r5.A0D
            X.3QD r0 = r4.A1f
            X.3QD r7 = X.AnonymousClass3QD.NOT_UPLOADED
            r1 = r23
            if (r0 != r7) goto L_0x0058
            X.1iA r2 = r4.A1G
            X.1iA r0 = X.1iA.A0Q
            if (r2 != r0) goto L_0x0058
            boolean r0 = X.C379909Vu.A05(r4)
            if (r0 == 0) goto L_0x0048
            com.instagram.common.session.UserSession r6 = r1.A01
            X.0Tu r0 = X.0Tu.A05
            r2 = 36327731037747861(0x810fe100003a95, double:3.0371416160788285E-306)
        L_0x0021:
            boolean r0 = X.182.A06(r0, r6, r2)
            if (r0 == 0) goto L_0x002f
            java.util.EnumSet r0 = com.instagram.pendingmedia.model.constants.ShareType.A02
            boolean r0 = r4.A15(r0)
            if (r0 != 0) goto L_0x0058
        L_0x002f:
            X.1iA r0 = X.1iA.A0a
            r4.A0V(r0)
            java.util.Set r0 = r4.A4t
            r0.clear()
            r0 = 0
            r4.A33 = r0
            X.3QF r2 = r4.A1T
            r0 = 0
            r2.A03 = r0
            r0 = 0
            r2.A05 = r0
        L_0x0045:
            X.KVl r0 = X.C62012KVl.A00
            return r0
        L_0x0048:
            boolean r0 = X.C379909Vu.A06(r4)
            if (r0 == 0) goto L_0x0058
            com.instagram.common.session.UserSession r6 = r1.A01
            X.0Tu r0 = X.0Tu.A05
            r2 = 36327731037878935(0x810fe100023a97, double:3.03714161616172E-306)
            goto L_0x0021
        L_0x0058:
            com.instagram.common.session.UserSession r6 = r1.A01
            X.0Tu r0 = X.0Tu.A05
            r2 = 36327731037813398(0x810fe100013a96, double:3.0371416161202744E-306)
            boolean r0 = X.182.A06(r0, r6, r2)
            if (r0 == 0) goto L_0x0045
            X.3QD r0 = r4.A1f
            if (r0 != r7) goto L_0x0045
            X.1iA r2 = r4.A1G
            X.1iA r0 = X.1iA.A0a
            if (r2 != r0) goto L_0x0045
            X.AIn r2 = X.C39905AIn.A00     // Catch:{ all -> 0x02b2 }
            boolean r0 = r2.A03(r6, r4)     // Catch:{ all -> 0x02b2 }
            if (r0 == 0) goto L_0x008a
            X.3ui r0 = X.C39905AIn.A01(r4)     // Catch:{ all -> 0x02b2 }
            if (r0 == 0) goto L_0x0149
            java.lang.String r9 = r0.A1a     // Catch:{ all -> 0x02b2 }
            X.1iA r0 = X.1iA.A0Q     // Catch:{ all -> 0x02b2 }
            r4.A0V(r0)     // Catch:{ all -> 0x02b2 }
            java.lang.String r8 = "PreprocessServerEditingStep"
            r6 = 0
            goto L_0x00af
        L_0x008a:
            boolean r0 = r2.A04(r6, r4)     // Catch:{ all -> 0x02b2 }
            if (r0 == 0) goto L_0x0045
            X.3ui r8 = X.C39905AIn.A02(r4)     // Catch:{ all -> 0x02b2 }
            if (r8 == 0) goto L_0x02a7
            java.lang.String r9 = r8.A1a     // Catch:{ all -> 0x02b2 }
            X.1iA r0 = X.1iA.A0Q     // Catch:{ all -> 0x02b2 }
            r4.A0V(r0)     // Catch:{ all -> 0x02b2 }
            X.4aT r0 = X.C39905AIn.A00(r4)     // Catch:{ all -> 0x02b2 }
            if (r0 == 0) goto L_0x02a0
            java.util.List r12 = r0.A0V     // Catch:{ all -> 0x02b2 }
            if (r12 == 0) goto L_0x0299
            java.util.List r11 = r0.A0Q     // Catch:{ all -> 0x02b2 }
            if (r11 == 0) goto L_0x0292
            float r0 = r0.A02     // Catch:{ all -> 0x02b2 }
            goto L_0x0151
        L_0x00af:
            java.lang.String r3 = X.0qc.A02()     // Catch:{ all -> 0x0136 }
            if (r3 == 0) goto L_0x0130
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ all -> 0x0136 }
            r7 = 1
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r7, r7, r0)     // Catch:{ all -> 0x0136 }
            android.graphics.Canvas r1 = new android.graphics.Canvas     // Catch:{ all -> 0x0136 }
            r1.<init>(r6)     // Catch:{ all -> 0x0136 }
            r0 = 0
            r1.drawColor(r0)     // Catch:{ all -> 0x0136 }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ all -> 0x0136 }
            r0.<init>(r3)     // Catch:{ all -> 0x0136 }
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0136 }
            r2.<init>(r0)     // Catch:{ all -> 0x0136 }
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x0129 }
            X.0fO.A02(r0, r6, r2, r7)     // Catch:{ all -> 0x0129 }
            r2.close()     // Catch:{ all -> 0x0136 }
            if (r6 == 0) goto L_0x00dc
            r6.recycle()     // Catch:{ all -> 0x02b2 }
        L_0x00dc:
            r4.A33 = r3     // Catch:{ all -> 0x02b2 }
            java.util.Set r3 = r4.A4t     // Catch:{ all -> 0x02b2 }
            X.9sJ r0 = X.C391079sJ.VIDEO     // Catch:{ all -> 0x02b2 }
            X.ADJ r2 = new X.ADJ     // Catch:{ all -> 0x02b2 }
            r2.<init>(r0, r9)     // Catch:{ all -> 0x02b2 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x02b2 }
            r2.A03 = r0     // Catch:{ all -> 0x02b2 }
            r2.A0H = r9     // Catch:{ all -> 0x02b2 }
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.STORY     // Catch:{ all -> 0x02b2 }
            java.lang.String r0 = r0.A00     // Catch:{ all -> 0x02b2 }
            r2.A0J = r0     // Catch:{ all -> 0x02b2 }
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.lang.Float r1 = java.lang.Float.valueOf(r0)     // Catch:{ all -> 0x02b2 }
            r2.A08 = r1     // Catch:{ all -> 0x02b2 }
            r2.A06 = r1     // Catch:{ all -> 0x02b2 }
            r2.A09 = r1     // Catch:{ all -> 0x02b2 }
            r2.A0A = r1     // Catch:{ all -> 0x02b2 }
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x02b2 }
            r2.A0F = r0     // Catch:{ all -> 0x02b2 }
            r2.A07 = r1     // Catch:{ all -> 0x02b2 }
            r3.add(r2)     // Catch:{ all -> 0x02b2 }
            int r1 = r4.A0H     // Catch:{ all -> 0x02b2 }
            int r0 = r4.A0G     // Catch:{ all -> 0x02b2 }
            r4.A0S = r1     // Catch:{ all -> 0x02b2 }
            r4.A0R = r0     // Catch:{ all -> 0x02b2 }
            X.3QF r2 = r4.A1T     // Catch:{ all -> 0x02b2 }
            r0 = 2
            r2.A03 = r0     // Catch:{ all -> 0x02b2 }
            com.instagram.pendingmedia.model.ClipInfo r0 = r4.A1N     // Catch:{ all -> 0x02b2 }
            int r1 = r0.A05     // Catch:{ all -> 0x02b2 }
            int r0 = r0.A07     // Catch:{ all -> 0x02b2 }
            int r1 = r1 - r0
            long r0 = (long) r1     // Catch:{ all -> 0x02b2 }
            r2.A05 = r0     // Catch:{ all -> 0x02b2 }
            X.KVm r0 = X.C62013KVm.A00     // Catch:{ all -> 0x02b2 }
            return r0
        L_0x0129:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x012b }
        L_0x012b:
            r0 = move-exception
            X.1zE.A00(r2, r1)     // Catch:{ all -> 0x0136 }
            goto L_0x0135
        L_0x0130:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0136 }
            r0.<init>()     // Catch:{ all -> 0x0136 }
        L_0x0135:
            throw r0     // Catch:{ all -> 0x0136 }
        L_0x0136:
            r3 = move-exception
            X.0wj r1 = X.0wj.A01     // Catch:{ all -> 0x028e }
            r0 = 817903929(0x30c03939, float:1.3986102E-9)
            X.0f9 r2 = r1.AEf(r8, r0)     // Catch:{ all -> 0x028e }
            java.lang.String r1 = "message"
            java.lang.String r0 = "create_bitmap_error"
            X.AnonymousClass7TF.A19(r2, r1, r0, r3)     // Catch:{ all -> 0x028e }
            goto L_0x028d
        L_0x0149:
            java.lang.String r0 = "Immersive mention reshare ReelInteractive is null"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ all -> 0x02b2 }
            goto L_0x02b1
        L_0x0151:
            r16 = 0
            r14 = 0
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            boolean r13 = X.AnonymousClass7TF.A1R(r0)
            java.lang.String r2 = "PreprocessServerEditingStep"
            r6 = 0
            android.content.Context r1 = r1.A00     // Catch:{ all -> 0x027c }
            java.lang.String r10 = X.0qc.A02()     // Catch:{ all -> 0x027c }
            if (r10 == 0) goto L_0x0276
            android.util.DisplayMetrics r0 = X.AnonymousClass7TF.A0E(r1)     // Catch:{ all -> 0x027c }
            int r0 = r0.widthPixels     // Catch:{ all -> 0x027c }
            int r7 = r0 / 2
            r3 = 1058013184(0x3f100000, float:0.5625)
            float r0 = (float) r7     // Catch:{ all -> 0x027c }
            float r0 = r0 / r3
            int r3 = X.AnonymousClass1GB.A01(r0)     // Catch:{ all -> 0x027c }
            float r0 = (float) r3     // Catch:{ all -> 0x027c }
            int r20 = A00(r12)     // Catch:{ all -> 0x027c }
            int r21 = A00(r11)     // Catch:{ all -> 0x027c }
            android.graphics.Shader$TileMode r22 = android.graphics.Shader.TileMode.CLAMP     // Catch:{ all -> 0x027c }
            android.graphics.LinearGradient r15 = new android.graphics.LinearGradient     // Catch:{ all -> 0x027c }
            r17 = r16
            r18 = r16
            r19 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x027c }
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x027c }
            android.graphics.Bitmap r11 = android.graphics.Bitmap.createBitmap(r7, r3, r0)     // Catch:{ all -> 0x027c }
            android.graphics.Canvas r3 = new android.graphics.Canvas     // Catch:{ all -> 0x0273 }
            r3.<init>(r11)     // Catch:{ all -> 0x0273 }
            r0 = 5
            android.graphics.Paint r0 = X.AnonymousClass7TE.A0V(r0)     // Catch:{ all -> 0x0273 }
            r0.setShader(r15)     // Catch:{ all -> 0x0273 }
            r3.drawPaint(r0)     // Catch:{ all -> 0x0273 }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ all -> 0x0273 }
            r0.<init>(r10)     // Catch:{ all -> 0x0273 }
            java.io.BufferedOutputStream r7 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0273 }
            r7.<init>(r0)     // Catch:{ all -> 0x0273 }
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x026c }
            r0 = 90
            X.0fO.A02(r3, r11, r7, r0)     // Catch:{ all -> 0x026c }
            r7.close()     // Catch:{ all -> 0x0273 }
            if (r11 == 0) goto L_0x01ba
            r11.recycle()     // Catch:{ all -> 0x02b2 }
        L_0x01ba:
            r4.A33 = r10     // Catch:{ all -> 0x02b2 }
            java.util.Set r7 = r4.A4t     // Catch:{ all -> 0x02b2 }
            X.9sJ r0 = X.C391079sJ.VIDEO     // Catch:{ all -> 0x02b2 }
            X.ADJ r3 = new X.ADJ     // Catch:{ all -> 0x02b2 }
            r3.<init>(r0, r9)     // Catch:{ all -> 0x02b2 }
            com.instagram.pendingmedia.model.ClipInfo r0 = r4.A1N     // Catch:{ all -> 0x02b2 }
            int r2 = r0.A05     // Catch:{ all -> 0x02b2 }
            int r0 = r0.A07     // Catch:{ all -> 0x02b2 }
            int r2 = r2 - r0
            float r2 = (float) r2     // Catch:{ all -> 0x02b2 }
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r2 = r2 / r0
            java.lang.Float r0 = java.lang.Float.valueOf(r2)     // Catch:{ all -> 0x02b2 }
            r3.A05 = r0     // Catch:{ all -> 0x02b2 }
            float r0 = r8.A03     // Catch:{ all -> 0x02b2 }
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ all -> 0x02b2 }
            r3.A09 = r0     // Catch:{ all -> 0x02b2 }
            float r0 = r8.A04     // Catch:{ all -> 0x02b2 }
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ all -> 0x02b2 }
            r3.A0A = r0     // Catch:{ all -> 0x02b2 }
            int r0 = r8.A09     // Catch:{ all -> 0x02b2 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x02b2 }
            r3.A0F = r0     // Catch:{ all -> 0x02b2 }
            float r0 = r8.A02     // Catch:{ all -> 0x02b2 }
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ all -> 0x02b2 }
            r3.A08 = r0     // Catch:{ all -> 0x02b2 }
            float r0 = r8.A00     // Catch:{ all -> 0x02b2 }
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ all -> 0x02b2 }
            r3.A06 = r0     // Catch:{ all -> 0x02b2 }
            float r2 = r8.A01     // Catch:{ all -> 0x02b2 }
            r0 = 1135869952(0x43b40000, float:360.0)
            float r2 = r2 * r0
            java.lang.Float r0 = java.lang.Float.valueOf(r2)     // Catch:{ all -> 0x02b2 }
            r3.A07 = r0     // Catch:{ all -> 0x02b2 }
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.STORY     // Catch:{ all -> 0x02b2 }
            java.lang.String r0 = r0.A00     // Catch:{ all -> 0x02b2 }
            r3.A0J = r0     // Catch:{ all -> 0x02b2 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r14)     // Catch:{ all -> 0x02b2 }
            r3.A03 = r0     // Catch:{ all -> 0x02b2 }
            r3.A0H = r9     // Catch:{ all -> 0x02b2 }
            int r0 = r8.A07     // Catch:{ all -> 0x02b2 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x02b2 }
            r3.A0D = r0     // Catch:{ all -> 0x02b2 }
            java.lang.String r0 = r8.A1k     // Catch:{ all -> 0x02b2 }
            r3.A0M = r0     // Catch:{ all -> 0x02b2 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x02b2 }
            r3.A0C = r0     // Catch:{ all -> 0x02b2 }
            r3.A0B = r0     // Catch:{ all -> 0x02b2 }
            r3.A0E = r0     // Catch:{ all -> 0x02b2 }
            X.3WT r0 = X.AnonymousClass3WT.MENTION_RESHARE     // Catch:{ all -> 0x02b2 }
            java.lang.String r0 = r0.A00     // Catch:{ all -> 0x02b2 }
            r3.A0L = r0     // Catch:{ all -> 0x02b2 }
            android.util.DisplayMetrics r2 = X.AnonymousClass7TF.A0E(r1)     // Catch:{ all -> 0x02b2 }
            int r0 = r2.widthPixels     // Catch:{ all -> 0x02b2 }
            float r1 = (float) r0     // Catch:{ all -> 0x02b2 }
            float r0 = r2.density     // Catch:{ all -> 0x02b2 }
            float r1 = r1 / r0
            int r0 = (int) r1     // Catch:{ all -> 0x02b2 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x02b2 }
            X.AD7 r1 = new X.AD7     // Catch:{ all -> 0x02b2 }
            r1.<init>(r6, r6, r0, r6)     // Catch:{ all -> 0x02b2 }
            r3.A01 = r1     // Catch:{ all -> 0x02b2 }
            if (r13 == 0) goto L_0x024f
            java.lang.String r0 = "v2"
            r1.A04 = r0     // Catch:{ all -> 0x02b2 }
        L_0x024f:
            r7.add(r3)     // Catch:{ all -> 0x02b2 }
            int r1 = r4.A0H     // Catch:{ all -> 0x02b2 }
            int r0 = r4.A0G     // Catch:{ all -> 0x02b2 }
            r4.A0S = r1     // Catch:{ all -> 0x02b2 }
            r4.A0R = r0     // Catch:{ all -> 0x02b2 }
            X.3QF r2 = r4.A1T     // Catch:{ all -> 0x02b2 }
            r0 = 2
            r2.A03 = r0     // Catch:{ all -> 0x02b2 }
            com.instagram.pendingmedia.model.ClipInfo r0 = r4.A1N     // Catch:{ all -> 0x02b2 }
            int r1 = r0.A05     // Catch:{ all -> 0x02b2 }
            int r0 = r0.A07     // Catch:{ all -> 0x02b2 }
            int r1 = r1 - r0
            long r0 = (long) r1     // Catch:{ all -> 0x02b2 }
            r2.A05 = r0     // Catch:{ all -> 0x02b2 }
            X.KVm r0 = X.C62013KVm.A00     // Catch:{ all -> 0x02b2 }
            return r0
        L_0x026c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x026e }
        L_0x026e:
            r0 = move-exception
            X.1zE.A00(r7, r1)     // Catch:{ all -> 0x0273 }
            throw r0     // Catch:{ all -> 0x0273 }
        L_0x0273:
            r3 = move-exception
            r6 = r11
            goto L_0x027d
        L_0x0276:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x027c }
            r0.<init>()     // Catch:{ all -> 0x027c }
            throw r0     // Catch:{ all -> 0x027c }
        L_0x027c:
            r3 = move-exception
        L_0x027d:
            X.0wj r1 = X.0wj.A01     // Catch:{ all -> 0x028e }
            r0 = 817903929(0x30c03939, float:1.3986102E-9)
            X.0f9 r2 = r1.AEf(r2, r0)     // Catch:{ all -> 0x028e }
            java.lang.String r1 = "message"
            java.lang.String r0 = "create_bitmap_error"
            X.AnonymousClass7TF.A19(r2, r1, r0, r3)     // Catch:{ all -> 0x028e }
        L_0x028d:
            throw r3     // Catch:{ all -> 0x028e }
        L_0x028e:
            r0 = move-exception
            if (r6 == 0) goto L_0x02b1
            goto L_0x02ae
        L_0x0292:
            java.lang.String r0 = "bottomColors of background gradient is null"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ all -> 0x02b2 }
            goto L_0x02b1
        L_0x0299:
            java.lang.String r0 = "topColors of background gradient is null"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ all -> 0x02b2 }
            goto L_0x02b1
        L_0x02a0:
            java.lang.String r0 = "background gradient is null"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ all -> 0x02b2 }
            goto L_0x02b1
        L_0x02a7:
            java.lang.String r0 = "Non-immersive mention reshare ReelInteractive is null"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ all -> 0x02b2 }
            goto L_0x02b1
        L_0x02ae:
            r6.recycle()     // Catch:{ all -> 0x02b2 }
        L_0x02b1:
            throw r0     // Catch:{ all -> 0x02b2 }
        L_0x02b2:
            r3 = move-exception
            X.37k r0 = r5.A0E
            X.55S r2 = X.AnonymousClass55S.A0D
            java.lang.String r1 = "failed_to_preprocess_server_editing"
            java.lang.String r9 = "UnknownException"
            r8 = r1
            r10 = r3
            r5 = r0
            r6 = r2
            r7 = r4
            r5.EG1(r6, r7, r8, r9, r10)
            r0 = 0
            X.55U r1 = X.AnonymousClass55V.A01(r2, r1, r0, r3)
            X.KVk r0 = new X.KVk
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40585AeX.FIH(X.LP8, X.4D7):java.lang.Object");
    }

    public C40585AeX(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }
}

package X;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Sgi  reason: case insensitive filesystem */
public abstract class C11796Sgi implements C13518Tbn, C13688Tf5, C13912TlE {
    public float A00;
    public BlurMaskFilter A01;
    public QGR A02;
    public C10520RtZ A03;
    public C11796Sgi A04;
    public C11796Sgi A05;
    public boolean A06;
    public Paint A07;
    public List A08;
    public boolean A09;
    public final Matrix A0A;
    public final Paint A0B = new Paint(1);
    public final Paint A0C;
    public final Paint A0D;
    public final Path A0E = C51965G9l.A0C();
    public final RectF A0F;
    public final RectF A0G;
    public final RectF A0H;
    public final RectF A0I;
    public final Q6Y A0J;
    public final S7O A0K;
    public final S56 A0L;
    public final List A0M;
    public final Matrix A0N = AnonymousClass7TE.A0U();
    public final Matrix A0O = AnonymousClass7TE.A0U();
    public final Paint A0P;
    public final Paint A0Q;
    public final RectF A0R;

    public final void ESm(List list, List list2) {
    }

    private void A05() {
        if (this.A08 == null) {
            C11796Sgi sgi = this.A05;
            if (sgi == null) {
                this.A08 = Collections.emptyList();
                return;
            }
            this.A08 = AnonymousClass7TE.A1C();
            do {
                this.A08.add(sgi);
                sgi = sgi.A05;
            } while (sgi != null);
        }
    }

    private void A06(Canvas canvas) {
        RectF rectF = this.A0H;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.A0P);
    }

    public final C10157RnY A08() {
        if (!(this instanceof QGg)) {
            return this.A0L.A0E;
        }
        QGg qGg = (QGg) this;
        C10157RnY rnY = qGg.A0L.A0E;
        if (rnY == null) {
            return qGg.A01.A08();
        }
        return rnY;
    }

    public final C10723Rx1 A09() {
        if (!(this instanceof QGg)) {
            return this.A0L.A0F;
        }
        QGg qGg = (QGg) this;
        C10723Rx1 rx1 = qGg.A0L.A0F;
        if (rx1 == null) {
            return qGg.A01.A09();
        }
        return rx1;
    }

    public void A0A(float f) {
        S7O s7o = this.A0K;
        C11388SRb sRb = s7o.A02;
        if (sRb != null) {
            sRb.A08(f);
        }
        C11388SRb sRb2 = s7o.A06;
        if (sRb2 != null) {
            sRb2.A08(f);
        }
        C11388SRb sRb3 = s7o.A01;
        if (sRb3 != null) {
            sRb3.A08(f);
        }
        C11388SRb sRb4 = s7o.A00;
        if (sRb4 != null) {
            sRb4.A08(f);
        }
        C11388SRb sRb5 = s7o.A03;
        if (sRb5 != null) {
            sRb5.A08(f);
        }
        C11388SRb sRb6 = s7o.A05;
        if (sRb6 != null) {
            sRb6.A08(f);
        }
        C11388SRb sRb7 = s7o.A04;
        if (sRb7 != null) {
            sRb7.A08(f);
        }
        QGR qgr = s7o.A07;
        if (qgr != null) {
            qgr.A08(f);
        }
        QGR qgr2 = s7o.A08;
        if (qgr2 != null) {
            qgr2.A08(f);
        }
        C10520RtZ rtZ = this.A03;
        if (rtZ != null) {
            int i = 0;
            while (true) {
                List list = rtZ.A00;
                if (i >= list.size()) {
                    break;
                }
                ((C11388SRb) list.get(i)).A08(f);
                i++;
            }
        }
        QGR qgr3 = this.A02;
        if (qgr3 != null) {
            qgr3.A08(f);
        }
        C11796Sgi sgi = this.A04;
        if (sgi != null) {
            sgi.A0A(f);
        }
        List list2 = this.A0M;
        list2.size();
        for (int i2 = 0; i2 < list2.size(); i2++) {
            ((C11388SRb) list2.get(i2)).A08(f);
        }
        list2.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01fd, code lost:
        if (r5 != null) goto L_0x020c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x020a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(android.graphics.Canvas r14, android.graphics.Matrix r15, int r16) {
        /*
            r13 = this;
            r3 = r16
            boolean r0 = r13 instanceof X.QGi
            if (r0 == 0) goto L_0x00ab
            r1 = r13
            X.QGi r1 = (X.QGi) r1
            X.S56 r4 = r1.A04
            int r5 = r4.A04
            int r7 = android.graphics.Color.alpha(r5)
            if (r7 == 0) goto L_0x009a
            X.SRb r0 = r1.A00
            if (r0 == 0) goto L_0x00a4
            java.lang.Object r0 = r0.A06()
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x00a4
            android.graphics.Paint r2 = r1.A02
            int r0 = r0.intValue()
            r2.setColor(r0)
        L_0x0028:
            X.S7O r0 = r1.A0K
            X.SRb r0 = r0.A02
            if (r0 != 0) goto L_0x009b
            r0 = 100
        L_0x0030:
            float r6 = (float) r3
            r5 = 1132396544(0x437f0000, float:255.0)
            float r6 = r6 / r5
            float r3 = (float) r7
            float r3 = r3 / r5
            float r0 = (float) r0
            float r3 = r3 * r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 / r0
            float r6 = r6 * r3
            float r6 = r6 * r5
            int r3 = (int) r6
            r2.setAlpha(r3)
            X.SRb r0 = r1.A01
            X.Pxj.A15(r2, r0)
            if (r3 <= 0) goto L_0x009a
            float[] r5 = r1.A05
            r12 = 0
            r3 = 0
            r5[r12] = r3
            r11 = 1
            r5[r11] = r3
            int r0 = r4.A06
            float r0 = (float) r0
            r10 = 2
            r5[r10] = r0
            r9 = 3
            r5[r9] = r3
            r8 = 4
            r5[r8] = r0
            int r0 = r4.A05
            float r0 = (float) r0
            r7 = 5
            r5[r7] = r0
            r6 = 6
            r5[r6] = r3
            r4 = 7
            r5[r4] = r0
            r15.mapPoints(r5)
            android.graphics.Path r3 = r1.A03
            r3.reset()
            r1 = r5[r12]
            r0 = r5[r11]
            r3.moveTo(r1, r0)
            r1 = r5[r10]
            r0 = r5[r9]
            r3.lineTo(r1, r0)
            r1 = r5[r8]
            r0 = r5[r7]
            r3.lineTo(r1, r0)
            r1 = r5[r6]
            r0 = r5[r4]
            r3.lineTo(r1, r0)
            r1 = r5[r12]
            r0 = r5[r11]
            r3.lineTo(r1, r0)
            r3.close()
            r14.drawPath(r3, r2)
        L_0x009a:
            return
        L_0x009b:
            java.lang.Object r0 = r0.A06()
            int r0 = X.AnonymousClass7TE.A0M(r0)
            goto L_0x0030
        L_0x00a4:
            android.graphics.Paint r2 = r1.A02
            r2.setColor(r5)
            goto L_0x0028
        L_0x00ab:
            boolean r0 = r13 instanceof X.QGg
            if (r0 == 0) goto L_0x00b8
            r0 = r13
            X.QGg r0 = (X.QGg) r0
            X.Sgc r0 = r0.A00
            r0.AQI(r14, r15, r3)
            return
        L_0x00b8:
            boolean r0 = r13 instanceof X.C7490QGf
            if (r0 != 0) goto L_0x009a
            boolean r0 = r13 instanceof X.C7491QGh
            if (r0 == 0) goto L_0x0210
            r2 = r13
            X.QGh r2 = (X.C7491QGh) r2
            X.SRb r0 = r2.A01
            if (r0 == 0) goto L_0x0122
            java.lang.Object r5 = r0.A06()
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            if (r5 == 0) goto L_0x0122
        L_0x00cf:
            boolean r0 = r5.isRecycled()
            if (r0 != 0) goto L_0x009a
            X.Rxj r7 = r2.A05
            if (r7 == 0) goto L_0x009a
            float r8 = X.SSo.A00()
            android.graphics.Paint r4 = r2.A02
            r4.setAlpha(r3)
            X.SRb r0 = r2.A00
            X.Pxj.A15(r4, r0)
            r14.save()
            r14.concat(r15)
            android.graphics.Rect r6 = r2.A04
            int r1 = r5.getWidth()
            int r0 = r5.getHeight()
            r3 = 0
            r6.set(r3, r3, r1, r0)
            X.Q6Y r0 = r2.A0J
            boolean r0 = r0.A0W
            android.graphics.Rect r2 = r2.A03
            if (r0 == 0) goto L_0x0117
            int r0 = r7.A02
            float r0 = (float) r0
            float r0 = r0 * r8
            int r1 = (int) r0
            int r0 = r7.A01
        L_0x010a:
            float r0 = (float) r0
            float r0 = r0 * r8
            int r0 = (int) r0
            r2.set(r3, r3, r1, r0)
            r14.drawBitmap(r5, r6, r2, r4)
        L_0x0113:
            r14.restore()
            return
        L_0x0117:
            float r0 = X.JTO.A02(r5)
            float r0 = r0 * r8
            int r1 = (int) r0
            int r0 = r5.getHeight()
            goto L_0x010a
        L_0x0122:
            X.S56 r0 = r2.A0L
            java.lang.String r6 = r0.A0K
            X.Q6Y r7 = r2.A0J
            X.SFI r5 = r7.A0K
            if (r5 == 0) goto L_0x014c
            android.graphics.drawable.Drawable$Callback r1 = r7.getCallback()
            r4 = 0
            if (r1 == 0) goto L_0x013d
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L_0x013d
            android.view.View r1 = (android.view.View) r1
            android.content.Context r4 = r1.getContext()
        L_0x013d:
            android.content.Context r1 = r5.A01
            boolean r0 = r1 instanceof android.app.Application
            if (r0 == 0) goto L_0x0147
            android.content.Context r4 = r4.getApplicationContext()
        L_0x0147:
            if (r4 == r1) goto L_0x014c
            r0 = 0
            r7.A0K = r0
        L_0x014c:
            X.SFI r4 = r7.A0K
            if (r4 != 0) goto L_0x0163
            android.graphics.drawable.Drawable$Callback r5 = r7.getCallback()
            java.lang.String r1 = r7.A0O
            X.S7N r0 = r7.A0G
            java.util.Map r0 = r0.A02()
            X.SFI r4 = new X.SFI
            r4.<init>(r5, r1, r0)
            r7.A0K = r4
        L_0x0163:
            java.util.Map r7 = r4.A03
            java.lang.Object r8 = r7.get(r6)
            X.Rxj r8 = (X.C10765Rxj) r8
            r9 = 0
            if (r8 == 0) goto L_0x0206
            android.graphics.Bitmap r5 = r8.A00
            if (r5 != 0) goto L_0x01fd
            android.content.Context r1 = r4.A01
            if (r1 == 0) goto L_0x0206
            java.lang.String r10 = r8.A04
            android.graphics.BitmapFactory$Options r5 = new android.graphics.BitmapFactory$Options
            r5.<init>()
            r0 = 1
            r5.inScaled = r0
            r0 = 160(0xa0, float:2.24E-43)
            r5.inDensity = r0
            java.lang.String r0 = "data:"
            boolean r0 = r10.startsWith(r0)
            if (r0 == 0) goto L_0x01a4
            java.lang.String r0 = "base64,"
            int r0 = r10.indexOf(r0)
            if (r0 <= 0) goto L_0x01a4
            r0 = 44
            int r0 = r10.indexOf(r0)     // Catch:{ IllegalArgumentException -> 0x0200 }
            java.lang.String r0 = X.Pxe.A0v(r0, r10)     // Catch:{ IllegalArgumentException -> 0x0200 }
            r4 = 0
            byte[] r1 = android.util.Base64.decode(r0, r4)     // Catch:{ IllegalArgumentException -> 0x0200 }
            goto L_0x01d3
        L_0x01a4:
            java.lang.String r4 = r4.A02     // Catch:{ IOException -> 0x01f9 }
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ IOException -> 0x01f9 }
            if (r0 != 0) goto L_0x01f2
            android.content.res.AssetManager r1 = r1.getAssets()     // Catch:{ IOException -> 0x01f9 }
            java.lang.String r0 = X.002.A0R(r4, r10)     // Catch:{ IOException -> 0x01f9 }
            java.io.InputStream r0 = r1.open(r0)     // Catch:{ IOException -> 0x01f9 }
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeStream(r0, r9, r5)     // Catch:{ IllegalArgumentException -> 0x01e5 }
            if (r4 != 0) goto L_0x01ca
            java.lang.String r1 = "Decoded image `"
            java.lang.String r0 = "` is null."
            java.lang.String r0 = X.002.A0g(r1, r6, r0)
            X.S85.A00(r0)
            goto L_0x0206
        L_0x01ca:
            int r1 = r8.A02
            int r0 = r8.A01
            android.graphics.Bitmap r5 = X.SSo.A02(r4, r1, r0)
            goto L_0x01d8
        L_0x01d3:
            int r0 = r1.length
            android.graphics.Bitmap r5 = X.0fP.A00(r1, r4, r0, r5)
        L_0x01d8:
            java.lang.Object r1 = X.SFI.A04
            monitor-enter(r1)
            java.lang.Object r0 = r7.get(r6)     // Catch:{ all -> 0x0272 }
            X.Rxj r0 = (X.C10765Rxj) r0     // Catch:{ all -> 0x0272 }
            r0.A00 = r5     // Catch:{ all -> 0x0272 }
            monitor-exit(r1)     // Catch:{ all -> 0x0272 }
            goto L_0x01fd
        L_0x01e5:
            r4 = move-exception
            java.lang.String r1 = "Unable to decode image `"
            java.lang.String r0 = "`."
            java.lang.String r0 = X.002.A0g(r1, r6, r0)
            X.S85.A01(r0, r4)
            goto L_0x0206
        L_0x01f2:
            java.lang.String r0 = "You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ IOException -> 0x01f9 }
            throw r0     // Catch:{ IOException -> 0x01f9 }
        L_0x01f9:
            r1 = move-exception
            java.lang.String r0 = "Unable to open asset."
            goto L_0x0203
        L_0x01fd:
            if (r5 == 0) goto L_0x0206
            goto L_0x020c
        L_0x0200:
            r1 = move-exception
            java.lang.String r0 = "data URL did not have correct base64 format."
        L_0x0203:
            X.S85.A01(r0, r1)
        L_0x0206:
            X.Rxj r0 = r2.A05
            if (r0 == 0) goto L_0x009a
            android.graphics.Bitmap r5 = r0.A00
        L_0x020c:
            if (r5 == 0) goto L_0x009a
            goto L_0x00cf
        L_0x0210:
            r7 = r13
            X.QGj r7 = (X.C7492QGj) r7
            android.graphics.RectF r6 = r7.A04
            X.S56 r5 = r7.A0L
            float r2 = r5.A01
            float r1 = r5.A00
            r0 = 0
            r6.set(r0, r0, r2, r1)
            r15.mapRect(r6)
            X.Q6Y r0 = r7.A0J
            boolean r0 = r0.A0U
            r2 = 255(0xff, float:3.57E-43)
            r1 = 1
            if (r0 == 0) goto L_0x026e
            java.util.List r0 = r7.A05
            int r0 = r0.size()
            if (r0 <= r1) goto L_0x026e
            if (r3 == r2) goto L_0x026e
            android.graphics.Paint r0 = r7.A03
            r0.setAlpha(r3)
            r14.saveLayer(r6, r0)
            r3 = 255(0xff, float:3.57E-43)
        L_0x023f:
            java.util.List r4 = r7.A05
            int r2 = X.DbT.A02(r4, r1)
        L_0x0245:
            if (r2 < 0) goto L_0x0113
            boolean r0 = r7.A01
            if (r0 != 0) goto L_0x0261
            java.lang.String r1 = r5.A0J
            java.lang.String r0 = "__container"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0261
        L_0x0255:
            java.lang.Object r0 = r4.get(r2)
            X.Sgi r0 = (X.C11796Sgi) r0
            r0.AQI(r14, r15, r3)
        L_0x025e:
            int r2 = r2 + -1
            goto L_0x0245
        L_0x0261:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0255
            boolean r0 = r14.clipRect(r6)
            if (r0 == 0) goto L_0x025e
            goto L_0x0255
        L_0x026e:
            r14.save()
            goto L_0x023f
        L_0x0272:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0272 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11796Sgi.A0B(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    public final void A0C(C11388SRb sRb) {
        if (sRb != null) {
            this.A0M.add(sRb);
        }
    }

    public final void A0D(SPM spm, SPM spm2, List list, int i) {
        if (this instanceof QGg) {
            ((QGg) this).A00.EIb(spm, spm2, list, i);
        } else if (this instanceof C7492QGj) {
            C7492QGj qGj = (C7492QGj) this;
            int i2 = 0;
            while (true) {
                List list2 = qGj.A05;
                if (i2 < list2.size()) {
                    ((C11796Sgi) list2.get(i2)).EIb(spm, spm2, list, i);
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public void A0E(boolean z) {
        if (z && this.A07 == null) {
            this.A07 = new Paint();
        }
        this.A09 = z;
    }

    public void AAd(SIR sir, Object obj) {
        this.A0K.A04(sir, obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: X.Rqs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: X.Rqs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: X.Rqs} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AQI(android.graphics.Canvas r22, android.graphics.Matrix r23, int r24) {
        /*
            r21 = this;
            r10 = r21
            boolean r0 = r10.A06
            if (r0 == 0) goto L_0x0302
            X.S56 r0 = r10.A0L
            r19 = r0
            boolean r0 = r0.A0O
            if (r0 != 0) goto L_0x0302
            r10.A05()
            android.graphics.Matrix r13 = r10.A0O
            r13.reset()
            r20 = r23
            r0 = r20
            r13.set(r0)
            java.util.List r0 = r10.A08
            int r1 = r0.size()
        L_0x0023:
            int r1 = r1 + -1
            if (r1 < 0) goto L_0x0039
            java.util.List r0 = r10.A08
            java.lang.Object r0 = r0.get(r1)
            X.Sgi r0 = (X.C11796Sgi) r0
            X.S7O r0 = r0.A0K
            android.graphics.Matrix r0 = r0.A00()
            r13.preConcat(r0)
            goto L_0x0023
        L_0x0039:
            r3 = 100
            X.S7O r4 = r10.A0K
            X.SRb r0 = r4.A02
            if (r0 == 0) goto L_0x004d
            java.lang.Object r0 = r0.A06()
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x004d
            int r3 = r0.intValue()
        L_0x004d:
            r0 = r24
            float r2 = (float) r0
            r1 = 1132396544(0x437f0000, float:255.0)
            float r2 = r2 / r1
            float r0 = (float) r3
            float r2 = r2 * r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r0
            float r2 = r2 * r1
            int r11 = (int) r2
            X.Sgi r0 = r10.A04
            r12 = r22
            if (r0 != 0) goto L_0x006c
            X.RtZ r0 = r10.A03
            if (r0 == 0) goto L_0x024e
            java.util.List r0 = r0.A00
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x024e
        L_0x006c:
            android.graphics.RectF r9 = r10.A0H
            r8 = 0
            r10.Aha(r13, r9, r8)
            X.Sgi r0 = r10.A04
            if (r0 == 0) goto L_0x0095
            r0 = r19
            java.lang.Integer r1 = r0.A0I
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x0095
            android.graphics.RectF r5 = r10.A0G
            r3 = 0
            r5.set(r3, r3, r3, r3)
            X.Sgi r2 = r10.A04
            r1 = 1
            r0 = r20
            r2.Aha(r0, r5, r1)
            boolean r0 = r9.intersect(r5)
            if (r0 != 0) goto L_0x0095
            r9.set(r3, r3, r3, r3)
        L_0x0095:
            android.graphics.Matrix r0 = r4.A00()
            r13.preConcat(r0)
            android.graphics.RectF r1 = r10.A0F
            r2 = 0
            r1.set(r2, r2, r2, r2)
            X.RtZ r14 = r10.A03
            if (r14 == 0) goto L_0x012d
            java.util.List r0 = r14.A00
            r18 = r0
            boolean r0 = r18.isEmpty()
            if (r0 != 0) goto L_0x012d
            java.util.List r0 = r14.A01
            r17 = r0
            int r16 = r17.size()
            r4 = 0
        L_0x00b9:
            r0 = r16
            if (r4 >= r0) goto L_0x0124
            r0 = r17
            java.lang.Object r5 = r0.get(r4)
            X.Rvq r5 = (X.C10656Rvq) r5
            r0 = r18
            java.lang.Object r0 = r0.get(r4)
            X.SRb r0 = (X.C11388SRb) r0
            java.lang.Object r0 = r0.A06()
            android.graphics.Path r0 = (android.graphics.Path) r0
            if (r0 == 0) goto L_0x00f8
            android.graphics.Path r3 = r10.A0E
            r3.set(r0)
            r3.transform(r13)
            java.lang.Integer r0 = r5.A02
            int r6 = r0.intValue()
            r0 = 3
            if (r6 == r0) goto L_0x012d
            r0 = 1
            if (r6 == r0) goto L_0x012d
            r0 = 2
            if (r6 == r0) goto L_0x011f
            if (r6 == r8) goto L_0x011f
        L_0x00ee:
            android.graphics.RectF r15 = r10.A0I
            r3.computeBounds(r15, r8)
            if (r4 != 0) goto L_0x00fb
            r1.set(r15)
        L_0x00f8:
            int r4 = r4 + 1
            goto L_0x00b9
        L_0x00fb:
            float r3 = r1.left
            float r0 = r15.left
            float r7 = java.lang.Math.min(r3, r0)
            float r3 = r1.top
            float r0 = r15.top
            float r6 = java.lang.Math.min(r3, r0)
            float r3 = r1.right
            float r0 = r15.right
            float r5 = java.lang.Math.max(r3, r0)
            float r3 = r1.bottom
            float r0 = r15.bottom
            float r0 = java.lang.Math.max(r3, r0)
            r1.set(r7, r6, r5, r0)
            goto L_0x00f8
        L_0x011f:
            boolean r0 = r5.A03
            if (r0 == 0) goto L_0x00ee
            goto L_0x012d
        L_0x0124:
            boolean r0 = r9.intersect(r1)
            if (r0 != 0) goto L_0x012d
            r9.set(r2, r2, r2, r2)
        L_0x012d:
            android.graphics.RectF r3 = r10.A0R
            int r0 = r12.getWidth()
            float r1 = (float) r0
            int r0 = r12.getHeight()
            float r0 = (float) r0
            r3.set(r2, r2, r1, r0)
            android.graphics.Matrix r1 = r10.A0N
            r12.getMatrix(r1)
            boolean r0 = r1.isIdentity()
            if (r0 != 0) goto L_0x014d
            r1.invert(r1)
            r1.mapRect(r3)
        L_0x014d:
            boolean r0 = r9.intersect(r3)
            if (r0 != 0) goto L_0x0156
            r9.set(r2, r2, r2, r2)
        L_0x0156:
            float r0 = r9.width()
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0275
            float r0 = r9.height()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0275
            android.graphics.Paint r7 = r10.A0B
            r6 = 255(0xff, float:3.57E-43)
            r7.setAlpha(r6)
            r12.saveLayer(r9, r7)
            r10.A06(r12)
            r10.A0B(r12, r13, r11)
            if (r14 == 0) goto L_0x025c
            java.util.List r0 = r14.A00
            r17 = r0
            boolean r0 = r17.isEmpty()
            if (r0 != 0) goto L_0x025c
            android.graphics.Paint r5 = r10.A0C
            r12.saveLayer(r9, r5)
            r4 = 0
        L_0x018a:
            java.util.List r0 = r14.A01
            r16 = r0
            int r0 = r16.size()
            if (r4 >= r0) goto L_0x0259
            r0 = r16
            java.lang.Object r15 = r0.get(r4)
            X.Rvq r15 = (X.C10656Rvq) r15
            r0 = r17
            java.lang.Object r3 = r0.get(r4)
            X.SRb r3 = (X.C11388SRb) r3
            java.util.List r0 = r14.A02
            java.lang.Object r2 = r0.get(r4)
            X.SRb r2 = (X.C11388SRb) r2
            java.lang.Integer r0 = r15.A02
            int r1 = r0.intValue()
            r0 = 3
            if (r1 == r0) goto L_0x0229
            r0 = 1
            if (r1 == r0) goto L_0x01d9
            r0 = 2
            if (r1 == r0) goto L_0x01f3
            if (r1 != r8) goto L_0x01d6
            boolean r0 = r15.A03
            if (r0 == 0) goto L_0x021d
            r12.saveLayer(r9, r7)
            r12.drawRect(r9, r7)
            android.graphics.Path r1 = A04(r13, r3, r10)
            A07(r7, r2)
            android.graphics.Paint r0 = r10.A0D
        L_0x01d0:
            r12.drawPath(r1, r0)
        L_0x01d3:
            r12.restore()
        L_0x01d6:
            int r4 = r4 + 1
            goto L_0x018a
        L_0x01d9:
            if (r4 != 0) goto L_0x01e6
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r7.setColor(r0)
            r7.setAlpha(r6)
            r12.drawRect(r9, r7)
        L_0x01e6:
            boolean r0 = r15.A03
            if (r0 == 0) goto L_0x0216
            android.graphics.Paint r1 = r10.A0D
            r12.saveLayer(r9, r1)
            r12.drawRect(r9, r7)
            goto L_0x01ff
        L_0x01f3:
            boolean r0 = r15.A03
            if (r0 == 0) goto L_0x020a
            r12.saveLayer(r9, r5)
            r12.drawRect(r9, r7)
            android.graphics.Paint r1 = r10.A0D
        L_0x01ff:
            A07(r1, r2)
            android.graphics.Path r0 = A04(r13, r3, r10)
            r12.drawPath(r0, r1)
            goto L_0x01d3
        L_0x020a:
            r12.saveLayer(r9, r5)
            android.graphics.Path r1 = A04(r13, r3, r10)
            r0 = r7
            A07(r7, r2)
            goto L_0x01d0
        L_0x0216:
            android.graphics.Path r1 = A04(r13, r3, r10)
            android.graphics.Paint r0 = r10.A0D
            goto L_0x0225
        L_0x021d:
            android.graphics.Path r1 = A04(r13, r3, r10)
            r0 = r7
            A07(r7, r2)
        L_0x0225:
            r12.drawPath(r1, r0)
            goto L_0x01d6
        L_0x0229:
            boolean r0 = r17.isEmpty()
            if (r0 != 0) goto L_0x01d6
            r2 = 0
        L_0x0230:
            int r0 = r16.size()
            if (r2 >= r0) goto L_0x0247
            r0 = r16
            java.lang.Object r0 = r0.get(r2)
            X.Rvq r0 = (X.C10656Rvq) r0
            java.lang.Integer r1 = r0.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 != r0) goto L_0x01d6
            int r2 = r2 + 1
            goto L_0x0230
        L_0x0247:
            r7.setAlpha(r6)
            r12.drawRect(r9, r7)
            goto L_0x01d6
        L_0x024e:
            android.graphics.Matrix r0 = r4.A00()
            r13.preConcat(r0)
            r10.A0B(r12, r13, r11)
            goto L_0x02a8
        L_0x0259:
            r12.restore()
        L_0x025c:
            X.Sgi r0 = r10.A04
            if (r0 == 0) goto L_0x0272
            android.graphics.Paint r0 = r10.A0Q
            r12.saveLayer(r9, r0)
            r10.A06(r12)
            X.Sgi r1 = r10.A04
            r0 = r20
            r1.AQI(r12, r0, r11)
            r12.restore()
        L_0x0272:
            r12.restore()
        L_0x0275:
            boolean r0 = r10.A09
            if (r0 == 0) goto L_0x02a8
            android.graphics.Paint r0 = r10.A07
            if (r0 == 0) goto L_0x02a8
            X.JTO.A1N(r0)
            android.graphics.Paint r1 = r10.A07
            r0 = -251901(0xfffffffffffc2803, float:NaN)
            r1.setColor(r0)
            android.graphics.Paint r1 = r10.A07
            r0 = 1082130432(0x40800000, float:4.0)
            r1.setStrokeWidth(r0)
            android.graphics.Paint r0 = r10.A07
            r12.drawRect(r9, r0)
            android.graphics.Paint r1 = r10.A07
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r1.setStyle(r0)
            android.graphics.Paint r1 = r10.A07
            r0 = 1357638635(0x50ebebeb, float:3.1664855E10)
            r1.setColor(r0)
            android.graphics.Paint r0 = r10.A07
            r12.drawRect(r9, r0)
        L_0x02a8:
            r1 = 0
            X.Q6Y r0 = r10.A0J
            X.S7N r0 = r0.A0G
            X.Rvn r5 = r0.A0D
            r0 = r19
            java.lang.String r4 = r0.A0J
            boolean r0 = r5.A00
            if (r0 == 0) goto L_0x0302
            java.util.Map r0 = r5.A01
            java.lang.Object r3 = r0.get(r4)
            X.Rqs r3 = (X.C10355Rqs) r3
            if (r3 != 0) goto L_0x02c9
            X.Rqs r3 = new X.Rqs
            r3.<init>()
            r0.put(r4, r3)
        L_0x02c9:
            float r2 = r3.A00
            float r2 = r2 + r1
            r3.A00 = r2
            int r0 = r3.A01
            int r1 = r0 + 1
            r3.A01 = r1
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r0) goto L_0x02e3
            r0 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r0
            r3.A00 = r2
            r0 = 1073741823(0x3fffffff, float:1.9999999)
            r3.A01 = r0
        L_0x02e3:
            java.lang.String r0 = "__container"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0302
            java.util.Set r0 = r5.A02
            java.util.Iterator r1 = r0.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0302
            r1.next()
            java.lang.String r0 = "onFrameRendered"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x0302:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11796Sgi.AQI(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    public void Aha(Matrix matrix, RectF rectF, boolean z) {
        this.A0H.set(0.0f, 0.0f, 0.0f, 0.0f);
        A05();
        Matrix matrix2 = this.A0A;
        matrix2.set(matrix);
        if (z) {
            List list = this.A08;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    matrix2.preConcat(((C11796Sgi) this.A08.get(size)).A0K.A00());
                }
            } else {
                C11796Sgi sgi = this.A05;
                if (sgi != null) {
                    matrix2.preConcat(sgi.A0K.A00());
                }
            }
        }
        matrix2.preConcat(this.A0K.A00());
    }

    public final void Dwx() {
        this.A0J.invalidateSelf();
    }

    public final void EIb(SPM spm, SPM spm2, List list, int i) {
        C11796Sgi sgi = this.A04;
        if (sgi != null) {
            String str = sgi.A0L.A0J;
            SPM spm3 = new SPM(spm2);
            spm3.A01.add(str);
            if (spm.A01(this.A04.A0L.A0J, i)) {
                C11796Sgi sgi2 = this.A04;
                SPM spm4 = new SPM(spm3);
                spm4.A00 = sgi2;
                list.add(spm4);
            }
            if (spm.A03(this.A0L.A0J, i)) {
                this.A04.A0D(spm, spm3, list, spm.A00(this.A04.A0L.A0J, i) + i);
            }
        }
        String str2 = this.A0L.A0J;
        if (spm.A02(str2, i)) {
            if (!"__container".equals(str2)) {
                SPM spm5 = new SPM(spm2);
                spm5.A01.add(str2);
                spm2 = spm5;
                if (spm.A01(str2, i)) {
                    SPM spm6 = new SPM(spm5);
                    spm6.A00 = this;
                    list.add(spm6);
                }
            }
            if (spm.A03(str2, i)) {
                A0D(spm, spm2, list, i + spm.A00(str2, i));
            }
        }
    }

    public final String getName() {
        return this.A0L.A0J;
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [X.SRb, X.QGR] */
    public C11796Sgi(Q6Y q6y, S56 s56) {
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_IN;
        boolean z = true;
        Paint paint = new Paint(1);
        Pxi.A0v(paint, mode2);
        this.A0C = paint;
        PorterDuff.Mode mode3 = PorterDuff.Mode.DST_OUT;
        Paint paint2 = new Paint(1);
        Pxi.A0v(paint2, mode3);
        this.A0D = paint2;
        Paint paint3 = new Paint(1);
        this.A0Q = paint3;
        PorterDuff.Mode mode4 = PorterDuff.Mode.CLEAR;
        Paint paint4 = new Paint();
        Pxi.A0v(paint4, mode4);
        this.A0P = paint4;
        this.A0H = AnonymousClass7TE.A0Y();
        this.A0R = AnonymousClass7TE.A0Y();
        this.A0F = AnonymousClass7TE.A0Y();
        this.A0G = AnonymousClass7TE.A0Y();
        this.A0I = AnonymousClass7TE.A0Y();
        this.A0A = AnonymousClass7TE.A0U();
        this.A0M = AnonymousClass7TE.A1C();
        this.A06 = true;
        this.A00 = 0.0f;
        this.A0J = q6y;
        this.A0L = s56;
        if (s56.A0I == AnonymousClass05K.A0C) {
            mode = PorterDuff.Mode.DST_OUT;
        } else {
            mode = PorterDuff.Mode.DST_IN;
        }
        Pxi.A0v(paint3, mode);
        S7O s7o = new S7O(s56.A0D);
        this.A0K = s7o;
        s7o.A02(this);
        List list = s56.A0M;
        if (list != null && !list.isEmpty()) {
            C10520RtZ rtZ = new C10520RtZ(list);
            this.A03 = rtZ;
            for (C11388SRb A092 : rtZ.A00) {
                A092.A09(this);
            }
            for (C11388SRb sRb : this.A03.A02) {
                A0C(sRb);
                sRb.A09(this);
            }
        }
        List list2 = this.A0L.A0L;
        if (!list2.isEmpty()) {
            ? sRb2 = new C11388SRb(list2);
            this.A02 = sRb2;
            sRb2.A04 = true;
            sRb2.A09(new C11791Sgd(this));
            z = C11388SRb.A01(this.A02) != 1.0f ? false : z;
            if (z != this.A06) {
                this.A06 = z;
                this.A0J.invalidateSelf();
            }
            A0C(this.A02);
        } else if (true != this.A06) {
            this.A06 = true;
            this.A0J.invalidateSelf();
        }
    }

    public static Path A04(Matrix matrix, C11388SRb sRb, C11796Sgi sgi) {
        Path path = sgi.A0E;
        path.set((Path) sRb.A06());
        path.transform(matrix);
        return path;
    }

    public static void A07(Paint paint, C11388SRb sRb) {
        paint.setAlpha((int) (((float) ((Number) sRb.A06()).intValue()) * 2.55f));
    }
}

package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.view.ViewGroup;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9X8  reason: invalid class name */
public class AnonymousClass9X8 extends Drawable implements AnonymousClass5MJ, B1K, C3724991d, C41782B0l {
    public float A00;
    public int A01;
    public int A02;
    public C376429Hy A03;
    public C391099sL A04;
    public C3510387i A05;
    public boolean A06;
    public boolean A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final Medium A0B;
    public final C391149sQ A0C;
    public final String A0D;
    public final float A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final UserSession A0J;

    public final void EXC(int i, int i2) {
    }

    public final /* synthetic */ void EqG() {
    }

    public final void draw(Canvas canvas) {
    }

    public final int getOpacity() {
        return -1;
    }

    public final void onBoundsChange(Rect rect) {
        Rect bounds;
        0qQ.A0B(rect, 0);
        C3510387i r3 = this.A05;
        if (r3 != null) {
            int width = rect.width();
            int height = rect.height();
            r3.A02 = (float) rect.left;
            r3.A03 = (float) rect.top;
            SimpleVideoLayout simpleVideoLayout = r3.A0T;
            ViewGroup.LayoutParams layoutParams = simpleVideoLayout.getLayoutParams();
            if (layoutParams != null) {
                if (!(layoutParams.width == width && layoutParams.height == height)) {
                    layoutParams.width = width;
                    layoutParams.height = height;
                    simpleVideoLayout.setLayoutParams(layoutParams);
                }
                Drawable drawable = r3.A08;
                if (!(drawable == null || (bounds = drawable.getBounds()) == null)) {
                    rect = bounds;
                }
                RoundedCornerFrameLayout roundedCornerFrameLayout = r3.A0U;
                roundedCornerFrameLayout.setPivotX(rect.exactCenterX() - r3.A02);
                roundedCornerFrameLayout.setPivotY(rect.exactCenterY() - r3.A03);
                roundedCornerFrameLayout.setTranslationY(r3.A03 + r3.A01);
                roundedCornerFrameLayout.setTranslationX(r3.A02 + r3.A00);
            }
        }
    }

    public final void setAlpha(int i) {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(16:38|43|(1:45)|46|(1:48)(1:50)|49|51|52|53|54|(2:55|(2:57|(1:62)(1:111))(0))|68|69|(9:80|(1:82)(1:94)|(1:84)|85|(1:93)(2:89|(1:91)(2:98|99))|92|95|96|114)|100|101) */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        r1 = r1.getLong("durationUs");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0155, code lost:
        if (r1 == Long.MAX_VALUE) goto L_0x015b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        r5 = X.AnonymousClass7TE.A0P(r1);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:68:0x015b */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0132 A[Catch:{ all -> 0x0160, FFMpegBadDataException | IOException | RuntimeException -> 0x0165 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0180  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass9X8(X.C376429Hy r15, com.instagram.common.gallery.Medium r16, com.instagram.common.session.UserSession r17, X.C391149sQ r18, X.C391099sL r19, java.lang.String r20, float r21, int r22, int r23, int r24, int r25, boolean r26) {
        /*
            r14 = this;
            java.lang.String r9 = "VideoStickerDrawable"
            r1 = r16
            r3 = r17
            X.AnonymousClass7TG.A1O(r3, r1)
            r0 = 10
            r2 = r19
            X.0qQ.A0B(r2, r0)
            r14.<init>()
            r14.A0J = r3
            r14.A0B = r1
            r0 = r18
            r14.A0C = r0
            r0 = r22
            r14.A0H = r0
            r0 = r23
            r14.A0G = r0
            r14.A03 = r15
            r0 = r20
            r14.A0D = r0
            r0 = r26
            r14.A06 = r0
            r0 = r21
            r14.A00 = r0
            r14.A04 = r2
            r0 = r24
            r14.A02 = r0
            r0 = r25
            r14.A01 = r0
            r11 = 0
            r6 = 0
            r4 = 30
            android.media.MediaExtractor r7 = new android.media.MediaExtractor     // Catch:{ IOException | NullPointerException -> 0x007b, all -> 0x0076 }
            r7.<init>()     // Catch:{ IOException | NullPointerException -> 0x007b, all -> 0x0076 }
            java.lang.String r0 = r1.A0X     // Catch:{ IOException | NullPointerException -> 0x0078, all -> 0x0071 }
            r7.setDataSource(r0)     // Catch:{ IOException | NullPointerException -> 0x0078, all -> 0x0071 }
            int r5 = r7.getTrackCount()     // Catch:{ IOException | NullPointerException -> 0x0078, all -> 0x0071 }
            r3 = 0
        L_0x004e:
            if (r3 >= r5) goto L_0x0078
            android.media.MediaFormat r2 = r7.getTrackFormat(r3)     // Catch:{ IOException | NullPointerException -> 0x0078, all -> 0x0071 }
            X.0qQ.A07(r2)     // Catch:{ IOException | NullPointerException -> 0x0078, all -> 0x0071 }
            java.lang.String r0 = "mime"
            java.lang.String r1 = r2.getString(r0)     // Catch:{ IOException | NullPointerException -> 0x0078, all -> 0x0071 }
            if (r1 == 0) goto L_0x006e
            java.lang.String r0 = "video/"
            boolean r0 = X.00p.A0k(r1, r0, r6)     // Catch:{ IOException | NullPointerException -> 0x0078, all -> 0x0071 }
            if (r0 == 0) goto L_0x006e
            java.lang.String r0 = "frame-rate"
            int r4 = r2.getInteger(r0)     // Catch:{ IOException | NullPointerException -> 0x0078, all -> 0x0071 }
            goto L_0x0078
        L_0x006e:
            int r3 = r3 + 1
            goto L_0x004e
        L_0x0071:
            r0 = move-exception
            r7.release()
            throw r0
        L_0x0076:
            r0 = move-exception
            throw r0
        L_0x0078:
            r7.release()
        L_0x007b:
            com.instagram.common.gallery.Medium r1 = r14.A0B
            java.lang.String r0 = r1.A0X
            if (r0 == 0) goto L_0x01d8
            int r0 = r0.length()
            if (r0 == 0) goto L_0x01d8
            boolean r0 = r1.A06()
            if (r0 == 0) goto L_0x01d8
            r14.A0A = r4
            int r8 = r14.A0H
            int r5 = r14.A0G
            android.media.MediaMetadataRetriever r3 = new android.media.MediaMetadataRetriever
            r3.<init>()
            com.instagram.common.gallery.Medium r0 = r14.A0B     // Catch:{ RuntimeException -> 0x00e7 }
            java.lang.String r0 = r0.A0X     // Catch:{ RuntimeException -> 0x00e7 }
            r3.setDataSource(r0)     // Catch:{ RuntimeException -> 0x00e7 }
            r13 = 1
            r0 = 18
            java.lang.String r2 = r3.extractMetadata(r0)
            r0 = 19
            java.lang.String r1 = r3.extractMetadata(r0)
            r0 = 24
            java.lang.String r12 = r3.extractMetadata(r0)
            if (r2 == 0) goto L_0x00cf
            if (r1 == 0) goto L_0x00cf
            int r8 = java.lang.Integer.parseInt(r2)
            int r5 = java.lang.Integer.parseInt(r1)
        L_0x00be:
            if (r12 == 0) goto L_0x00f6
            int r1 = java.lang.Integer.parseInt(r12)
            r0 = 90
            if (r1 == r0) goto L_0x00cc
            r0 = 270(0x10e, float:3.78E-43)
            if (r1 != r0) goto L_0x00f6
        L_0x00cc:
            r6 = 1
            r2 = r5
            goto L_0x00f7
        L_0x00cf:
            java.lang.String r10 = "Failed to read media metadata on: "
            com.instagram.common.gallery.Medium r0 = r14.A0B
            java.lang.String r7 = r0.A0X
            java.lang.String r2 = "| with length: "
            java.io.File r0 = X.AnonymousClass7TE.A0t(r7)
            long r0 = r0.length()
            java.lang.String r0 = X.002.A0q(r10, r7, r2, r0)
            X.0kD.A0E(r9, r0, r11)
            goto L_0x00be
        L_0x00e7:
            r2 = move-exception
            java.lang.String r1 = "Can't set dataSource for medium path: "
            com.instagram.common.gallery.Medium r0 = r14.A0B
            java.lang.String r0 = r0.A0X
            java.lang.String r0 = X.002.A0R(r1, r0)
            X.0kD.A0E(r9, r0, r2)
            r13 = 0
        L_0x00f6:
            r2 = r8
        L_0x00f7:
            r14.A0I = r2
            if (r6 != 0) goto L_0x00fc
            r8 = r5
        L_0x00fc:
            r14.A0F = r8
            int r0 = r14.A0H
            float r7 = (float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r6 = r7 * r1
            float r5 = (float) r2
            float r6 = r6 / r5
            int r0 = r14.A0G
            float r2 = (float) r0
            float r0 = r2 * r1
            float r1 = (float) r8
            float r0 = r0 / r1
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0116
            float r2 = r2 / r1
        L_0x0113:
            r14.A0E = r2
            goto L_0x0119
        L_0x0116:
            float r2 = r7 / r5
            goto L_0x0113
        L_0x0119:
            com.instagram.common.gallery.Medium r0 = r14.A0B     // Catch:{ FFMpegBadDataException | IOException | RuntimeException -> 0x0165 }
            java.lang.String r1 = r0.A0X     // Catch:{ FFMpegBadDataException | IOException | RuntimeException -> 0x0165 }
            java.lang.String r7 = "video/"
            X.Q0h r0 = X.Q12.A00     // Catch:{ FFMpegBadDataException | IOException | RuntimeException -> 0x0165 }
            com.facebook.ffmpeg.FFMpegMediaDemuxer r10 = new com.facebook.ffmpeg.FFMpegMediaDemuxer     // Catch:{ FFMpegBadDataException | IOException | RuntimeException -> 0x0165 }
            r10.<init>(r0, r1)     // Catch:{ FFMpegBadDataException | IOException | RuntimeException -> 0x0165 }
            r10.initialize()     // Catch:{ all -> 0x0160 }
            r2 = 0
        L_0x012a:
            int r0 = r10.getTrackCount()     // Catch:{ all -> 0x0160 }
            r5 = 0
            if (r2 >= r0) goto L_0x015b
            com.facebook.ffmpeg.FFMpegMediaFormat r1 = r10.getTrackFormat(r2)     // Catch:{ all -> 0x0160 }
            java.lang.String r0 = "mime"
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x0160 }
            if (r0 == 0) goto L_0x014c
            boolean r0 = r0.startsWith(r7)     // Catch:{ all -> 0x0160 }
            if (r0 == 0) goto L_0x014c
            java.lang.String r0 = "durationUs"
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x014f
        L_0x014c:
            int r2 = r2 + 1
            goto L_0x012a
        L_0x014f:
            long r1 = r1.getLong(r0)     // Catch:{ ClassCastException | NullPointerException -> 0x015b }
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x015b
            long r5 = X.AnonymousClass7TE.A0P(r1)     // Catch:{ all -> 0x0160 }
        L_0x015b:
            r10.release()     // Catch:{ FFMpegBadDataException | IOException | RuntimeException -> 0x0165 }
            int r2 = (int) r5     // Catch:{ FFMpegBadDataException | IOException | RuntimeException -> 0x0165 }
            goto L_0x017e
        L_0x0160:
            r0 = move-exception
            r10.release()     // Catch:{ FFMpegBadDataException | IOException | RuntimeException -> 0x0165 }
            throw r0     // Catch:{ FFMpegBadDataException | IOException | RuntimeException -> 0x0165 }
        L_0x0165:
            r1 = move-exception
            java.lang.String r0 = "FFMpegMediaDemuxer failed to extract duration"
            X.0kD.A0E(r9, r0, r1)
            if (r13 == 0) goto L_0x01c4
            r0 = 32
            java.lang.String r0 = r3.extractMetadata(r0)
            if (r0 == 0) goto L_0x01c4
            int r1 = java.lang.Integer.parseInt(r0)
            int r0 = r14.A0A
            int r1 = r1 / r0
            int r2 = r1 * 1000
        L_0x017e:
            if (r2 == 0) goto L_0x01c4
            X.9sL r1 = r14.A04
            X.9sL r0 = X.C391099sL.NOT_CLIPS
            if (r1 == r0) goto L_0x01b7
            com.instagram.common.session.UserSession r0 = r14.A0J
            X.80y r0 = X.C3495980z.A00(r0)
            int r0 = r0.A01
        L_0x018e:
            if (r2 <= r0) goto L_0x0191
            r2 = r0
        L_0x0191:
            r14.A08 = r2
            if (r13 == 0) goto L_0x01aa
            r1 = 32
            java.lang.String r0 = r3.extractMetadata(r1)
            if (r0 == 0) goto L_0x01aa
            java.lang.String r0 = r3.extractMetadata(r1)
            if (r0 == 0) goto L_0x01bf
            int r2 = java.lang.Integer.parseInt(r0)
        L_0x01a7:
            r14.A09 = r2
            goto L_0x01bb
        L_0x01aa:
            float r1 = (float) r2
            float r0 = (float) r4
            float r1 = r1 * r0
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 / r0
            double r0 = (double) r1
            double r0 = java.lang.Math.floor(r0)
            int r2 = (int) r0
            goto L_0x01a7
        L_0x01b7:
            r0 = 60000(0xea60, float:8.4078E-41)
            goto L_0x018e
        L_0x01bb:
            r3.release()     // Catch:{ Exception -> 0x01be }
        L_0x01be:
            return
        L_0x01bf:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x01c4:
            java.lang.String r1 = "[VideoStickerDrawable] Video duration needs to be > 0 for Medium in VideoStickerDrawable. path: "
            com.instagram.common.gallery.Medium r0 = r14.A0B
            java.lang.String r0 = r0.A0X
            java.lang.String r1 = X.002.A0R(r1, r0)
            r0 = 1
            X.0qQ.A0B(r1, r0)
            X.Kkp r0 = new X.Kkp
            r0.<init>(r1)
            throw r0
        L_0x01d8:
            com.instagram.common.gallery.Medium r0 = r14.A0B
            java.lang.String r1 = r0.A0X
            if (r1 != 0) goto L_0x01e0
            java.lang.String r1 = "null"
        L_0x01e0:
            java.lang.String r0 = "[VideoStickerDrawable] Medium provided is missing or does not exist: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9X8.<init>(X.9Hy, com.instagram.common.gallery.Medium, com.instagram.common.session.UserSession, X.9sQ, X.9sL, java.lang.String, float, int, int, int, int, boolean):void");
    }

    public final Bitmap A00(long j) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(this.A0B.A0X);
            Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(TimeUnit.MILLISECONDS.toMicros(j));
            mediaMetadataRetriever.release();
            return frameAtTime;
        } catch (Exception e) {
            0kD.A0I("Exception calling MediaMetadataRetriever#release", e, 0Yt.A0E());
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Aev, X.50v, java.lang.Object] */
    public final C2802350v BzV() {
        Medium medium = this.A0B;
        C391149sQ r11 = this.A0C;
        int i = this.A0H;
        int i2 = this.A0G;
        C376429Hy r8 = this.A03;
        float f = this.A00;
        C391099sL r6 = this.A04;
        boolean z = this.A06;
        boolean z2 = this.A07;
        int i3 = this.A02;
        int i4 = this.A01;
        ? obj = new Object();
        obj.A07 = C391149sQ.UNKNOWN;
        obj.A06 = medium;
        obj.A07 = r11;
        obj.A02 = i;
        obj.A01 = i2;
        obj.A05 = r8;
        obj.A00 = f;
        obj.A08 = r6;
        obj.A09 = z;
        obj.A0A = z2;
        obj.A04 = i3;
        obj.A03 = i4;
        return obj;
    }

    public final void Dre(int i, int i2) {
        if (this.A0C == C391149sQ.GALLERY_STICKER) {
            this.A02 = i;
            this.A01 = i2;
            C3510387i r0 = this.A05;
            if (r0 != null) {
                r0.A07 = i;
            }
        }
    }

    public final int getDurationInMs() {
        return this.A08;
    }

    public final int getIntrinsicHeight() {
        return AnonymousClass7TE.A06((float) this.A0F, this.A0E);
    }

    public final int getIntrinsicWidth() {
        return AnonymousClass7TE.A06((float) this.A0I, this.A0E);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException();
    }

    public final boolean ANf(Canvas canvas, Integer num, Integer num2, long j) {
        int i;
        int i2;
        Rect rect;
        Bitmap A002 = A00(j);
        if (A002 == null) {
            return false;
        }
        Paint paint = new Paint();
        Rect A0X = AnonymousClass7TE.A0X(this);
        float width = ((float) A0X.width()) / ((float) A0X.height());
        int width2 = A002.getWidth();
        int height = A002.getHeight();
        float f = (float) width2;
        float f2 = (float) height;
        float f3 = f / f2;
        if (AnonymousClass7TE.A00(f3, width) < 0.01f) {
            rect = new Rect(0, 0, width2, height);
        } else {
            if (f3 > width) {
                i2 = (int) (width * f2);
                i = height;
            } else {
                if (f3 < width) {
                    i = (int) (width * f);
                } else {
                    i = height;
                }
                i2 = width2;
            }
            int i3 = (width2 - i2) / 2;
            int i4 = (height - i) / 2;
            rect = new Rect(i3, i4, i2 + i3, i + i4);
        }
        canvas.drawBitmap(A002, rect, getBounds(), paint);
        return true;
    }
}

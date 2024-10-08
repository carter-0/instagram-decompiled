package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* renamed from: X.Let  reason: case insensitive filesystem */
public final class C64609Let implements 1Qd {
    public long A00;
    public long A01;
    public ByteArrayOutputStream A02;
    public FileOutputStream A03;
    public boolean A04;
    public final Context A05;
    public final 0hq A06;
    public final UserSession A07;
    public final LEF A08;
    public final File A09;
    public final boolean A0A;
    public final boolean A0B;
    public final AnonymousClass4DU A0C;
    public final AnonymousClass3W1 A0D;
    public final boolean A0E;
    public final boolean A0F;

    public final void onFailed(IOException iOException) {
        this.A04 = true;
        boolean z = this.A0A;
        if (z) {
            try {
                FileOutputStream fileOutputStream = this.A03;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                JTR.A1O(this.A09);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        LEF lef = this.A08;
        lef.A06.set(false);
        Iterator it = lef.A09.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass7TE.A11("onDownloadingProgressChanged");
        } else if (z) {
            SQH.A01(this.A06);
            AnonymousClass7TF.A0D().post(new M5U(this));
        }
    }

    public final void onNewData(ByteBuffer byteBuffer) {
        0qQ.A0B(byteBuffer, 0);
        boolean z = this.A0A;
        if (!z || !this.A04) {
            int remaining = byteBuffer.remaining();
            long j = this.A01 + ((long) remaining);
            this.A01 = j;
            long j2 = this.A00;
            if (j2 > 0) {
                this.A08.A00(((double) j) / ((double) j2));
            }
            int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            if (z) {
                try {
                    FileOutputStream fileOutputStream = this.A03;
                    if (fileOutputStream != null) {
                        fileOutputStream.write(byteBuffer.array(), arrayOffset, remaining);
                    }
                } catch (IOException e) {
                    onFailed(e);
                    e.printStackTrace();
                }
            } else {
                ByteArrayOutputStream byteArrayOutputStream = this.A02;
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.write(byteBuffer.array(), arrayOffset, remaining);
                }
            }
        }
    }

    public final void onResponseStarted(2ZD r4) {
        0qQ.A0B(r4, 0);
        1Fn A002 = r4.A00(AnonymousClass000.A00(426));
        if (A002 != null) {
            try {
                String str = A002.A01;
                0qQ.A06(str);
                this.A00 = Long.parseLong(str);
            } catch (NumberFormatException e) {
                0KC.A0C("DownloadingMediaProgressCallback", e.getMessage());
            }
        }
        LEF lef = this.A08;
        lef.A00(0.0d);
        lef.A06.set(true);
        Iterator it = lef.A09.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass7TE.A11("onDownloadingProgressChanged");
        }
    }

    /* JADX WARNING: type inference failed for: r8v8 */
    /* JADX WARNING: type inference failed for: r49v2, types: [X.9XE] */
    /* JADX WARNING: type inference failed for: r23v5, types: [X.9X5] */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01f9, code lost:
        if (X.182.A06(r6, r4, 36326305108735677L) == false) goto L_0x01fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x002e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        X.1zE.A00(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0032, code lost:
        throw r1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0161  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onComplete() {
        /*
            r59 = this;
            r0 = r59
            boolean r1 = r0.A04
            if (r1 == 0) goto L_0x000b
            boolean r1 = r0.A0A
            if (r1 == 0) goto L_0x000b
            return
        L_0x000b:
            boolean r1 = r0.A0A
            if (r1 == 0) goto L_0x0017
            java.io.FileOutputStream r1 = r0.A03     // Catch:{ IOException -> 0x004b }
            if (r1 == 0) goto L_0x0052
            r1.close()     // Catch:{ IOException -> 0x004b }
            goto L_0x0052
        L_0x0017:
            boolean r1 = r0.A0B
            if (r1 == 0) goto L_0x0035
            java.io.File r1 = r0.A09     // Catch:{ all -> 0x0033 }
            java.io.FileOutputStream r3 = X.JTO.A0t(r1)     // Catch:{ all -> 0x0033 }
            java.io.ByteArrayOutputStream r1 = r0.A02     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x0028
            r1.writeTo(r3)     // Catch:{ all -> 0x002c }
        L_0x0028:
            r3.close()     // Catch:{ all -> 0x0033 }
            goto L_0x0052
        L_0x002c:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x002e }
        L_0x002e:
            r1 = move-exception
            X.1zE.A00(r3, r2)     // Catch:{ all -> 0x0033 }
            throw r1     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r1 = move-exception
            goto L_0x004f
        L_0x0035:
            java.io.File r1 = r0.A09
            java.io.FileOutputStream r2 = X.JTO.A0t(r1)
            java.io.ByteArrayOutputStream r1 = r0.A02     // Catch:{ IOException -> 0x0043 }
            if (r1 == 0) goto L_0x0047
            r1.writeTo(r2)     // Catch:{ IOException -> 0x0043 }
            goto L_0x0047
        L_0x0043:
            r1 = move-exception
            r1.printStackTrace()     // Catch:{ all -> 0x0521 }
        L_0x0047:
            r2.close()
            goto L_0x0052
        L_0x004b:
            r1 = move-exception
            r0.onFailed(r1)
        L_0x004f:
            r1.printStackTrace()
        L_0x0052:
            long r2 = r0.A00
            r19 = 0
            int r1 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r1 != 0) goto L_0x0061
            X.LEF r3 = r0.A08
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r3.A00(r1)
        L_0x0061:
            com.instagram.common.session.UserSession r4 = r0.A07
            X.0Tu r6 = X.0Tu.A05
            r1 = 36326305108604604(0x810e95000036bc, double:3.036239852746877E-306)
            boolean r53 = X.182.A06(r6, r4, r1)
            android.content.Context r1 = r0.A05
            r58 = r1
            java.io.File r13 = r0.A09
            X.LEF r5 = r0.A08
            boolean r7 = r0.A0E
            r3 = 0
            r14 = 3
            com.instagram.common.gallery.Medium r12 = X.C282665Eg.A03(r13, r14, r3)
            r8 = 0
            X.JtC r1 = X.Q0Y.A01(r13)     // Catch:{ IllegalArgumentException -> 0x00c8 }
            int r2 = r1.A01     // Catch:{ IllegalArgumentException -> 0x00c8 }
            int r1 = r1.A00     // Catch:{ IllegalArgumentException -> 0x00c8 }
            r12.A0B = r2     // Catch:{ IllegalArgumentException -> 0x00c8 }
            r12.A04 = r1     // Catch:{ IllegalArgumentException -> 0x00c8 }
            com.instagram.pendingmedia.model.constants.ShareType r11 = com.instagram.pendingmedia.model.constants.ShareType.CLIPS
            X.7IH r10 = new X.7IH
            r1 = r58
            r10.<init>(r1)
            r2 = 1
            X.0qQ.A0B(r4, r2)
            X.JYp r9 = X.C59796JYp.A00(r12, r3)
            X.80y r1 = X.C3495980z.A00(r4)
            int r1 = r1.A01
            long r15 = (long) r1
            r17 = r9
            r18 = r10
            r21 = r15
            r23 = r2
            boolean r1 = X.ABQ.A00(r17, r18, r19, r21, r23)
            if (r1 != 0) goto L_0x0161
            long r1 = r9.A03
            r11 = -1
            int r10 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r10 != 0) goto L_0x012f
            java.lang.String r1 = "Illegal argument"
        L_0x00bb:
            X.KVw r9 = new X.KVw
            r9.<init>(r1)
        L_0x00c0:
            boolean r1 = r9 instanceof X.C62023KVx
            if (r1 == 0) goto L_0x00c8
            X.KVx r9 = (X.C62023KVx) r9
            X.3Q2 r8 = r9.A00
        L_0x00c8:
            r9 = 1
            if (r53 == 0) goto L_0x00d1
            if (r8 == 0) goto L_0x050c
            r8.A61 = r9
            r8.A60 = r9
        L_0x00d1:
            r22 = 0
            if (r8 == 0) goto L_0x050c
            r5.A03 = r8
            X.1Xj r1 = r5.A07
            r54 = r1
            X.1sQ r10 = X.C51966G9m.A0n(r54)
            int r21 = X.0nA.A09(r58)
            com.instagram.pendingmedia.model.ClipInfo r2 = r8.A1N
            com.instagram.pendingmedia.model.ClipInfo r1 = X.C376399Hv.A00()
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 != 0) goto L_0x012a
            r1 = r21
            float r2 = (float) r1
            com.instagram.pendingmedia.model.ClipInfo r1 = r8.A1N
            float r1 = r1.A00
            float r2 = r2 / r1
            int r1 = (int) r2
            r20 = r1
        L_0x00fa:
            int r12 = X.JTT.A07(r4, r8)
            r1 = r54
            X.1Xy r1 = r1.A0C
            com.instagram.feed.media.CreativeConfigIntf r1 = r1.AsO()
            if (r1 == 0) goto L_0x0192
            java.util.List r1 = r1.B02()
            if (r1 == 0) goto L_0x0192
            java.util.ArrayList r8 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r2 = r1.iterator()
        L_0x0116:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0194
            java.lang.Object r1 = r2.next()
            com.instagram.feed.media.EffectPreviewIntf r1 = (com.instagram.feed.media.EffectPreviewIntf) r1
            java.lang.String r1 = r1.getEffectId()
            r8.add(r1)
            goto L_0x0116
        L_0x012a:
            int r20 = X.0nA.A08(r58)
            goto L_0x00fa
        L_0x012f:
            r11 = -2
            int r10 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r10 != 0) goto L_0x0138
            java.lang.String r1 = "Runtime exception"
            goto L_0x00bb
        L_0x0138:
            r11 = -3
            int r10 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r10 != 0) goto L_0x0148
            java.lang.String r2 = "Unsupported video file mime type: "
            java.lang.String r1 = r9.A06
            java.lang.String r1 = X.002.A0R(r2, r1)
            goto L_0x00bb
        L_0x0148:
            int r9 = (r19 > r1 ? 1 : (r19 == r1 ? 0 : -1))
            if (r9 > 0) goto L_0x015d
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r9 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r9 > 0) goto L_0x015d
            java.lang.String r9 = "Duration is "
            java.lang.String r1 = X.002.A0Q(r9, r1)
            goto L_0x00bb
        L_0x015d:
            java.lang.String r1 = "Unknown Error"
            goto L_0x00bb
        L_0x0161:
            X.JYp r1 = X.C59796JYp.A00(r12, r3)
            java.lang.String r1 = r1.A07     // Catch:{ FFMpegBadDataException | IOException | RuntimeException -> 0x0171 }
            java.io.File r1 = X.AnonymousClass7TE.A0t(r1)     // Catch:{ FFMpegBadDataException | IOException | RuntimeException -> 0x0171 }
            int r1 = X.Q0X.A01(r1)     // Catch:{ FFMpegBadDataException | IOException | RuntimeException -> 0x0171 }
            r12.A07 = r1     // Catch:{ FFMpegBadDataException | IOException | RuntimeException -> 0x0171 }
        L_0x0171:
            int r1 = r12.A0B
            float r10 = (float) r1
            int r1 = r12.A04
            float r1 = (float) r1
            float r10 = r10 / r1
            X.3Q2 r2 = X.JZ1.A00(r8, r3)
            X.JZ1.A03(r4, r2, r9, r10)
            java.lang.String r1 = r12.A0O
            r2.A3J = r1
            r2.A1k = r11
            boolean r1 = X.C63396KwH.A00(r12)
            r2.A5x = r1
            X.KVx r9 = new X.KVx
            r9.<init>(r2)
            goto L_0x00c0
        L_0x0192:
            r8 = r22
        L_0x0194:
            X.3Q2 r2 = r5.A03
            if (r2 == 0) goto L_0x01a0
            if (r8 == 0) goto L_0x021c
            java.util.List r1 = X.00k.A0X(r8)
        L_0x019e:
            r2.A4H = r1
        L_0x01a0:
            X.3Q2 r1 = r5.A03
            r19 = r1
            java.lang.String r18 = "Required value was null."
            if (r1 == 0) goto L_0x0507
            r41 = 0
            r1 = r58
            int r11 = X.DbW.A02(r9, r1, r4)
            java.util.LinkedHashMap r17 = X.AnonymousClass7TE.A1H()
            r45 = r7 ^ 1
            com.instagram.user.model.User r1 = X.C51966G9m.A11(r54)
            if (r1 == 0) goto L_0x0219
            java.lang.String r48 = r1.getUsername()
            boolean r1 = X.0mp.A0B(r48)
            if (r1 != 0) goto L_0x01eb
            if (r10 == 0) goto L_0x0216
            com.instagram.api.schemas.MusicInfo r1 = r10.BUr()
            if (r1 == 0) goto L_0x0216
            com.instagram.api.schemas.TrackData r1 = r1.BUk()
            if (r1 == 0) goto L_0x0216
            com.instagram.music.common.model.MusicAssetModel r47 = com.instagram.music.common.model.MusicAssetModel.A01(r1, r3)
        L_0x01d8:
            r46 = r58
            r49 = r21
            r50 = r20
            r51 = r12
            r52 = r45
            android.util.Pair r2 = X.C39604A1u.A00(r46, r47, r48, r49, r50, r51, r52, r53)
            r1 = r17
            X.JTT.A11(r2, r1)
        L_0x01eb:
            if (r53 == 0) goto L_0x0454
            if (r7 == 0) goto L_0x01fb
            r1 = 36326305108735677(0x810e95000236bd, double:3.036239852829768E-306)
            boolean r1 = X.182.A06(r6, r4, r1)
            r2 = 1
            if (r1 != 0) goto L_0x01fc
        L_0x01fb:
            r2 = 0
        L_0x01fc:
            r15 = 0
            r1 = 31
            X.3QS r13 = new X.3QS
            r13.<init>(r15, r1)
            if (r2 == 0) goto L_0x0288
            r1 = 36889255062078280(0x830e9500010348, double:3.3922516701411445E-306)
            java.lang.String r8 = X.182.A04(r6, r4, r1)
            boolean r1 = X.00l.A0W(r8)
            if (r1 != 0) goto L_0x0288
            goto L_0x021f
        L_0x0216:
            r47 = 0
            goto L_0x01d8
        L_0x0219:
            r48 = r22
            goto L_0x01eb
        L_0x021c:
            X.0sn r1 = X.0sn.A00
            goto L_0x019e
        L_0x021f:
            X.1QT r1 = X.JTQ.A0E()     // Catch:{ Exception -> 0x0254 }
            X.1QU r7 = r1.A00()     // Catch:{ Exception -> 0x0254 }
            X.14G r2 = X.14G.A03()     // Catch:{ Exception -> 0x0254 }
            X.16e r1 = X.AnonymousClass2hY.A09     // Catch:{ Exception -> 0x0254 }
            X.2hY r1 = r1.E1h(r8)     // Catch:{ Exception -> 0x0254 }
            X.47Y r7 = r2.A08(r7, r1, r4)     // Catch:{ Exception -> 0x0254 }
            java.lang.String r2 = "mp3"
            java.lang.String r1 = ".mp3"
            java.lang.String r1 = X.AnonymousClass457.A0D(r2, r1)     // Catch:{ Exception -> 0x0254 }
            java.io.File r2 = X.AnonymousClass7TE.A0t(r1)     // Catch:{ Exception -> 0x0254 }
            X.1Qb r1 = r7.A02     // Catch:{ Exception -> 0x0254 }
            java.io.InputStream r1 = r1.AjD()     // Catch:{ Exception -> 0x0254 }
            boolean r1 = X.0mb.A09(r2, r1)     // Catch:{ Exception -> 0x0254 }
            if (r1 == 0) goto L_0x0288
            java.lang.String r27 = r2.getAbsolutePath()     // Catch:{ Exception -> 0x0254 }
            if (r27 == 0) goto L_0x0288
            goto L_0x025f
        L_0x0254:
            X.0wj r7 = X.0wj.A01
            r2 = 817902318(0x30c032ee, float:1.3984314E-9)
            java.lang.String r1 = "downloading_endcard_audio_failed"
            r7.EFR(r2, r1)
            goto L_0x0288
        L_0x025f:
            java.io.File r1 = X.AnonymousClass7TE.A0t(r27)
            r5.A04 = r1
            X.51J r25 = X.AnonymousClass51J.VOICEOVER
            r30 = 1065353216(0x3f800000, float:1.0)
            r34 = 4000(0xfa0, float:5.605E-42)
            X.51I r1 = new X.51I
            r26 = r22
            r28 = r22
            r29 = r22
            r31 = r30
            r32 = r3
            r33 = r12
            r23 = r1
            r24 = r22
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            X.0qQ.A0B(r1, r3)
            java.util.List r2 = r13.A03
            r2.add(r1)
        L_0x0288:
            r1 = 36889255062209353(0x830e9500030349, double:3.3922516702240355E-306)
            java.lang.String r1 = X.182.A04(r6, r4, r1)
            java.lang.Integer r51 = X.C393779wz.A00(r1)
            r1 = 36889255062274890(0x830e950004034a, double:3.3922516702654814E-306)
            java.lang.String r10 = X.182.A04(r6, r4, r1)
            java.lang.Integer[] r8 = X.AnonymousClass05K.A00(r11)
            int r7 = r8.length
            r2 = 0
        L_0x02a4:
            if (r2 >= r7) goto L_0x02be
            r16 = r8[r2]
            int r1 = r16.intValue()
            int r1 = 1 - r1
            if (r1 == 0) goto L_0x02bb
            java.lang.String r1 = "animated"
        L_0x02b2:
            boolean r1 = r1.equals(r10)
            if (r1 != 0) goto L_0x02c0
            int r2 = r2 + 1
            goto L_0x02a4
        L_0x02bb:
            java.lang.String r1 = "static"
            goto L_0x02b2
        L_0x02be:
            java.lang.Integer r16 = X.AnonymousClass05K.A00
        L_0x02c0:
            int r1 = r51.intValue()
            if (r1 == r9) goto L_0x02fb
            if (r1 != r3) goto L_0x02f6
            java.io.File r7 = r5.A08
            long r1 = r54.A1B()
            r10 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r10
            X.0qQ.A0B(r7, r3)
            java.lang.String r11 = X.JTP.A0t(r7)
            r10 = 0
            r8 = 0
        L_0x02da:
            android.media.MediaMetadataRetriever r7 = new android.media.MediaMetadataRetriever     // Catch:{ RuntimeException -> 0x0324, all -> 0x02f4 }
            r7.<init>()     // Catch:{ RuntimeException -> 0x0324, all -> 0x02f4 }
            r7.setDataSource(r11)     // Catch:{ RuntimeException -> 0x02e3 }
            goto L_0x02e9
        L_0x02e3:
            r7 = move-exception
            int r8 = r8 + 1
            if (r8 < r14) goto L_0x02da
            goto L_0x02f3
        L_0x02e9:
            android.graphics.Bitmap r10 = r7.getFrameAtTime(r1, r14)     // Catch:{ RuntimeException -> 0x0321, all -> 0x02ee }
            goto L_0x0321
        L_0x02ee:
            r1 = move-exception
            r7.release()
            throw r1
        L_0x02f3:
            throw r7     // Catch:{ RuntimeException -> 0x0324, all -> 0x02f4 }
        L_0x02f4:
            r1 = move-exception
            throw r1
        L_0x02f6:
            X.Wub r1 = X.AnonymousClass7TE.A1K()
            throw r1
        L_0x02fb:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            r1 = 8
            android.graphics.Bitmap r10 = android.graphics.Bitmap.createBitmap(r1, r1, r2)
            X.0qQ.A07(r10)
            android.graphics.Canvas r2 = X.JTO.A0B(r10)
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2.drawColor(r1)
            java.io.File r1 = X.0mb.A04(r58)
            android.graphics.Bitmap$CompressFormat r8 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Exception -> 0x031f }
            r7 = 75
            java.io.FileOutputStream r2 = X.JTO.A0t(r1)     // Catch:{ Exception -> 0x031f }
            X.0fO.A02(r8, r10, r2, r7)     // Catch:{ Exception -> 0x031f }
            goto L_0x0328
        L_0x031f:
            r1 = 0
            goto L_0x0328
        L_0x0321:
            r7.release()
        L_0x0324:
            if (r10 != 0) goto L_0x04ae
            r1 = r22
        L_0x0328:
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L_0x04ab
            r5.A05 = r1
            X.51R r2 = new X.51R
            r2.<init>()
            java.lang.String r1 = r1.getCanonicalPath()
            if (r1 == 0) goto L_0x04fd
            r2.A0I = r1
            int r1 = r54.A0y()
            r2.A09 = r1
            int r1 = r54.A0x()
            r2.A05 = r1
            r2.A0K = r9
            r1 = 4000(0xfa0, float:5.605E-42)
            r2.A04 = r1
            r40 = 1073741822(0x3ffffffe, float:1.9999998)
            X.51M r7 = new X.51M
            r25 = r22
            r26 = r22
            r27 = r2
            r28 = r22
            r29 = r22
            r30 = r22
            r31 = r22
            r32 = r22
            r33 = r15
            r34 = r3
            r35 = r3
            r36 = r3
            r37 = r3
            r38 = r3
            r39 = r3
            r41 = r3
            r42 = r3
            r43 = r3
            r44 = r3
            r23 = r7
            r24 = r22
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
            r7.A09 = r3
            r7.A08 = r1
            r7.A0G(r8)
            r7.A0F()
        L_0x0389:
            X.51R r11 = new X.51R
            r11.<init>()
            java.io.File r1 = r5.A08
            java.lang.String r1 = r1.getCanonicalPath()
            X.0qQ.A0B(r1, r3)
            r11.A0F = r1
            int r1 = r54.A0y()
            r11.A09 = r1
            int r1 = r54.A0x()
            r11.A05 = r1
            long r1 = r54.A1B()
            int r10 = (int) r1
            r11.A04 = r10
            r40 = 1073741822(0x3ffffffe, float:1.9999998)
            X.51M r10 = new X.51M
            r23 = r10
            r24 = r22
            r25 = r22
            r26 = r22
            r27 = r11
            r28 = r22
            r29 = r22
            r30 = r22
            r31 = r22
            r32 = r22
            r33 = r15
            r34 = r3
            r35 = r3
            r36 = r3
            r37 = r3
            r38 = r3
            r39 = r3
            r41 = r3
            r42 = r3
            r43 = r3
            r44 = r3
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
            r10.A09 = r3
            long r1 = r54.A1B()
            int r11 = (int) r1
            r10.A08 = r11
            r10.A0G(r8)
            r10.A0F()
            if (r7 == 0) goto L_0x04a5
            com.google.common.collect.ImmutableList r7 = com.google.common.collect.ImmutableList.of(r10, r7)
        L_0x03f3:
            X.0qQ.A0A(r7)
            r2 = r22
            X.51W r41 = X.C39563A0f.A00(r13, r7, r2, r2)
            if (r48 == 0) goto L_0x04f8
            r55 = 4000(0xfa0, float:5.605E-42)
            r1 = r21
            float r2 = (float) r1
            r1 = r20
            float r7 = (float) r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>(r15, r15, r2, r7)
            r26 = -1
            X.5Eq r7 = new X.5Eq
            r23 = r7
            r24 = r1
            r25 = r15
            r27 = r21
            r28 = r20
            r23.<init>(r24, r25, r26, r27, r28)
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            r1 = r16
            if (r1 != r2) goto L_0x0492
            long r1 = (long) r12
            X.9X5 r8 = new X.9X5
            r23 = r8
            r24 = r58
            r25 = r48
            r26 = r21
            r27 = r20
            r28 = r55
            r29 = r1
            r23.<init>(r24, r25, r26, r27, r28, r29)
        L_0x0436:
            android.graphics.drawable.Drawable r8 = (android.graphics.drawable.Drawable) r8
            int r1 = X.AnonymousClass5MH.A0D
            java.lang.String r2 = X.AnonymousClass7TF.A0b()
            X.5MH r10 = new X.5MH
            r1 = r58
            r10.<init>((android.content.Context) r1, (android.graphics.drawable.Drawable) r8, (java.lang.String) r2)
            int r1 = r12 + r55
            r10.Eog(r12, r1)
            android.util.Pair r2 = new android.util.Pair
            r2.<init>(r10, r7)
            r1 = r17
            X.JTT.A11(r2, r1)
        L_0x0454:
            X.LBC r7 = new X.LBC
            r36 = r7
            r37 = r58
            r38 = r4
            r39 = r22
            r40 = r22
            r42 = r22
            r43 = r19
            r44 = r17
            r46 = r3
            r47 = r9
            r36.<init>(r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47)
            X.0hq r8 = r0.A06
            X.4DU r3 = r0.A0C
            X.3W1 r1 = r0.A0D
            boolean r0 = r0.A0F
            X.LmK r2 = new X.LmK
            r10 = r8
            r11 = r4
            r12 = r3
            r13 = r1
            r14 = r5
            r15 = r0
            r8 = r2
            r9 = r58
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r0 = 36319132513213365(0x81080f00001bb5, double:3.031703874539734E-306)
            boolean r0 = X.182.A06(r6, r4, r0)
            if (r0 == 0) goto L_0x04f0
            X.LS1.A01(r7, r2)
            return
        L_0x0492:
            long r1 = (long) r12
            X.9XE r8 = new X.9XE
            r49 = r8
            r50 = r58
            r52 = r48
            r53 = r21
            r54 = r20
            r56 = r1
            r49.<init>(r50, r51, r52, r53, r54, r55, r56)
            goto L_0x0436
        L_0x04a5:
            com.google.common.collect.ImmutableList r7 = com.google.common.collect.ImmutableList.of(r10)
            goto L_0x03f3
        L_0x04ab:
            r7 = 0
            goto L_0x0389
        L_0x04ae:
            java.lang.String r7 = X.2RR.A01()
            java.lang.String r2 = "direct_temp_cover_frame"
            java.lang.String r1 = ".jpg"
            java.lang.String r2 = X.AnonymousClass45F.A04(r2, r1)
            java.io.File r1 = new java.io.File
            r1.<init>(r7, r2)
            java.io.FileOutputStream r2 = X.JTO.A0t(r1)     // Catch:{ FileNotFoundException -> 0x04e1, IOException -> 0x04da }
            java.io.BufferedOutputStream r7 = new java.io.BufferedOutputStream     // Catch:{ FileNotFoundException -> 0x04e1, IOException -> 0x04da }
            r7.<init>(r2)     // Catch:{ FileNotFoundException -> 0x04e1, IOException -> 0x04da }
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ FileNotFoundException -> 0x04e1, IOException -> 0x04da }
            boolean r2 = X.JZK.A00(r2, r10, r7)     // Catch:{ FileNotFoundException -> 0x04e1, IOException -> 0x04da }
            if (r2 != 0) goto L_0x04d2
            r1 = r22
        L_0x04d2:
            r7.close()     // Catch:{ FileNotFoundException -> 0x04e1, IOException -> 0x04da }
            r10.recycle()
            goto L_0x0328
        L_0x04da:
            r10.recycle()
            r1 = r22
            goto L_0x0328
        L_0x04e1:
            r7 = move-exception
            java.lang.String r2 = "MediaCaptureUtil"
            java.lang.String r1 = "could not find file"
            X.0wb.A06(r2, r1, r7)     // Catch:{ all -> 0x0502 }
            r10.recycle()
            r1 = r22
            goto L_0x0328
        L_0x04f0:
            X.5g0 r0 = X.LS1.A00(r7, r2)
            X.1ES.A03(r0)
            return
        L_0x04f8:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x04fd:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x0502:
            r1 = move-exception
            r10.recycle()
            throw r1
        L_0x0507:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r18)
            throw r0
        L_0x050c:
            X.JTR.A1O(r13)
            X.0hq r1 = r0.A06
            X.SQH.A01(r1)
            android.os.Handler r2 = X.AnonymousClass7TF.A0D()
            X.M5U r1 = new X.M5U
            r1.<init>(r0)
            r2.post(r1)
            return
        L_0x0521:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0523 }
        L_0x0523:
            r1 = move-exception
            X.1zE.A00(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64609Let.onComplete():void");
    }

    public C64609Let(Context context, 0hq r6, UserSession userSession, AnonymousClass4DU r8, AnonymousClass3W1 r9, LEF lef, File file, boolean z, boolean z2) {
        AnonymousClass7TG.A1O(context, userSession);
        AnonymousClass7TG.A1S(r6, r8);
        0Tu A0J = DbS.A0J(file, 9);
        boolean A062 = 182.A06(A0J, userSession, 36323586394565910L);
        boolean A063 = 182.A06(A0J, userSession, 36325768237692109L);
        this.A08 = lef;
        this.A09 = file;
        this.A0A = A062;
        this.A0B = A063;
        if (A062) {
            try {
                this.A03 = JTO.A0t(file);
            } catch (IOException e) {
                onFailed(e);
            }
        } else {
            this.A02 = new ByteArrayOutputStream();
        }
        this.A05 = context;
        this.A07 = userSession;
        this.A0E = z;
        this.A0F = z2;
        this.A06 = r6;
        this.A0C = r8;
        this.A0D = r9;
    }
}

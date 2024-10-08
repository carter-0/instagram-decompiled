package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.Uri;
import android.opengl.GLUtils;
import android.os.Build;
import com.facebook.onecamera.components.mediapipeline.gl.context.igl.IglTexture;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter;
import com.instagram.util.jpeg.JpegBridge;
import com.instagram.util.jpeg.NativeImage;
import java.io.IOException;

/* renamed from: X.8mI  reason: invalid class name and case insensitive filesystem */
public final class C364958mI {
    public static final Object A0B = new Object();
    public int A00;
    public CropInfo A01;
    public C3499782r A02;
    public boolean A03;
    public boolean A04;
    public final UserSession A05;
    public final C364888mB A06;
    public final C364968mJ A07;
    public final C364808m2 A08;
    public final boolean A09;
    public final Bitmap A0A;

    public C364958mI(Bitmap bitmap, UserSession userSession, CropInfo cropInfo, C3499782r r6, C364888mB r7, C364808m2 r8, int i, boolean z) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r8, 2);
        this.A05 = userSession;
        this.A08 = r8;
        this.A0A = bitmap;
        this.A01 = cropInfo;
        this.A00 = i;
        this.A09 = z;
        this.A02 = r6;
        this.A06 = r7;
        02m r1 = 02m.A0p;
        0qQ.A07(r1);
        this.A07 = new C364968mJ(r1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0071 A[Catch:{ UnsatisfiedLinkError -> 0x0058 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007b A[Catch:{ UnsatisfiedLinkError -> 0x0058 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0124 A[Catch:{ UnsatisfiedLinkError -> 0x010b }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x012e A[Catch:{ UnsatisfiedLinkError -> 0x010b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.instagram.util.jpeg.NativeImage A01(java.lang.String r17, java.lang.String r18, boolean r19) {
        /*
            r16 = this;
            r5 = 0
            r6 = r16
            if (r19 == 0) goto L_0x000b
            com.instagram.creation.base.CropInfo r0 = r6.A01
            if (r0 == 0) goto L_0x000b
            android.graphics.Rect r5 = r0.A02
        L_0x000b:
            X.8m2 r4 = r6.A08
            byte[] r9 = r4.BG2()
            if (r9 == 0) goto L_0x0150
            boolean r1 = r4.CW0()
            r0 = r18
            if (r1 == 0) goto L_0x0085
            X.8mX r3 = X.C365098mW.A00
            int r7 = r4.getWidth()
            int r8 = r4.getHeight()
            monitor-enter(r3)
            java.util.Map r4 = r3.A00     // Catch:{ all -> 0x0082 }
            java.lang.Object r1 = r4.get(r0)     // Catch:{ all -> 0x0082 }
            X.8mY r1 = (X.C365118mY) r1     // Catch:{ all -> 0x0082 }
            if (r1 == 0) goto L_0x0033
            com.instagram.util.jpeg.NativeImage r0 = r1.A00     // Catch:{ all -> 0x0082 }
            goto L_0x0080
        L_0x0033:
            int r1 = X.C365128mZ.A00     // Catch:{ all -> 0x0082 }
            boolean r1 = com.instagram.util.jpeg.JpegBridge.A01()     // Catch:{ all -> 0x0082 }
            if (r1 == 0) goto L_0x0060
            if (r5 == 0) goto L_0x003e
            goto L_0x0045
        L_0x003e:
            r1 = 12
            com.instagram.util.jpeg.NativeImage r1 = com.instagram.util.jpeg.JpegBridge.decodeFullJpegFromMemory(r7, r8, r9, r1)     // Catch:{ UnsatisfiedLinkError -> 0x0058 }
            goto L_0x0053
        L_0x0045:
            int r10 = r5.left     // Catch:{ UnsatisfiedLinkError -> 0x0058 }
            int r11 = r5.top     // Catch:{ UnsatisfiedLinkError -> 0x0058 }
            int r12 = r5.right     // Catch:{ UnsatisfiedLinkError -> 0x0058 }
            int r13 = r5.bottom     // Catch:{ UnsatisfiedLinkError -> 0x0058 }
            r14 = 12
            com.instagram.util.jpeg.NativeImage r1 = com.instagram.util.jpeg.JpegBridge.decodeCroppedJpegFromMemory(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ UnsatisfiedLinkError -> 0x0058 }
        L_0x0053:
            com.instagram.util.jpeg.NativeImage r1 = X.C365128mZ.A01(r1)     // Catch:{ UnsatisfiedLinkError -> 0x0058 }
            goto L_0x0061
        L_0x0058:
            r5 = move-exception
            java.lang.String r2 = "JpegHelper"
            java.lang.String r1 = "UnsatisfiedLinkError"
            X.0KC.A0G(r2, r1, r5)     // Catch:{ all -> 0x0082 }
        L_0x0060:
            r1 = 0
        L_0x0061:
            r1.getClass()     // Catch:{ all -> 0x0082 }
            X.8mY r2 = new X.8mY     // Catch:{ all -> 0x0082 }
            r2.<init>(r1, r3)     // Catch:{ all -> 0x0082 }
            java.lang.Object r1 = r4.get(r0)     // Catch:{ all -> 0x0082 }
            X.8mY r1 = (X.C365118mY) r1     // Catch:{ all -> 0x0082 }
            if (r1 == 0) goto L_0x007b
            com.instagram.util.jpeg.NativeImage r0 = r2.A00     // Catch:{ all -> 0x0082 }
            int r0 = r0.bufferId     // Catch:{ all -> 0x0082 }
            com.instagram.util.jpeg.JpegBridge.releaseNativeBuffer(r0)     // Catch:{ all -> 0x0082 }
            com.instagram.util.jpeg.NativeImage r0 = r1.A00     // Catch:{ all -> 0x0082 }
            goto L_0x0080
        L_0x007b:
            r4.put(r0, r2)     // Catch:{ all -> 0x0082 }
            com.instagram.util.jpeg.NativeImage r0 = r2.A00     // Catch:{ all -> 0x0082 }
        L_0x0080:
            monitor-exit(r3)
            return r0
        L_0x0082:
            r1 = move-exception
            monitor-exit(r3)
            throw r1
        L_0x0085:
            boolean r1 = r4.CW0()
            if (r1 != 0) goto L_0x0150
            X.8mX r2 = X.C365098mW.A00
            int r7 = r4.getWidth()
            int r15 = r4.getHeight()
            monitor-enter(r2)
            java.util.Map r4 = r2.A00     // Catch:{ all -> 0x014d }
            java.lang.Object r1 = r4.get(r0)     // Catch:{ all -> 0x014d }
            X.8mY r1 = (X.C365118mY) r1     // Catch:{ all -> 0x014d }
            if (r1 == 0) goto L_0x00a4
            com.instagram.util.jpeg.NativeImage r0 = r1.A00     // Catch:{ all -> 0x014d }
            goto L_0x0133
        L_0x00a4:
            r5 = 0
            int r13 = r7 * 4
            int r1 = r13 * r15
            java.nio.ByteBuffer r12 = java.nio.ByteBuffer.allocateDirect(r1)     // Catch:{ all -> 0x014d }
            int r3 = r7 * r15
            int r1 = r3 / 4
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocateDirect(r3)     // Catch:{ all -> 0x014d }
            r6.put(r9, r5, r3)     // Catch:{ all -> 0x014d }
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocateDirect(r1)     // Catch:{ all -> 0x014d }
            r8.put(r9, r3, r1)     // Catch:{ all -> 0x014d }
            java.nio.ByteBuffer r10 = java.nio.ByteBuffer.allocateDirect(r1)     // Catch:{ all -> 0x014d }
            int r3 = r3 + r1
            r10.put(r9, r3, r1)     // Catch:{ all -> 0x014d }
            r6.rewind()     // Catch:{ all -> 0x014d }
            r8.rewind()     // Catch:{ all -> 0x014d }
            r10.rewind()     // Catch:{ all -> 0x014d }
            int r9 = r7 / 2
            X.0qQ.A0A(r12)     // Catch:{ all -> 0x014d }
            com.instagram.libyuv.IgYuvColorConverter r1 = com.instagram.libyuv.IgYuvColorConverter.INSTANCE     // Catch:{ all -> 0x014d }
            r1 = 6
            X.0qQ.A0B(r12, r1)     // Catch:{ all -> 0x014d }
            boolean r1 = r6.isDirect()     // Catch:{ all -> 0x014d }
            java.lang.String r3 = "Check failed."
            if (r1 == 0) goto L_0x0141
            boolean r1 = r8.isDirect()     // Catch:{ all -> 0x014d }
            if (r1 == 0) goto L_0x013b
            boolean r1 = r10.isDirect()     // Catch:{ all -> 0x014d }
            if (r1 == 0) goto L_0x0147
            boolean r1 = r12.isDirect()     // Catch:{ all -> 0x014d }
            if (r1 == 0) goto L_0x0135
            r11 = r9
            r14 = r7
            com.instagram.libyuv.IgYuvColorConverter.nativeConvertI420ToABGR(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x014d }
            int r1 = X.C365128mZ.A00     // Catch:{ all -> 0x014d }
            boolean r1 = com.instagram.util.jpeg.JpegBridge.A01()     // Catch:{ all -> 0x014d }
            if (r1 == 0) goto L_0x0113
            com.instagram.util.jpeg.NativeImage r1 = com.instagram.util.jpeg.JpegBridge.createNativeImageFromRgbaBuffer(r7, r15, r12)     // Catch:{ UnsatisfiedLinkError -> 0x010b }
            com.instagram.util.jpeg.NativeImage r1 = X.C365128mZ.A01(r1)     // Catch:{ UnsatisfiedLinkError -> 0x010b }
            goto L_0x0114
        L_0x010b:
            r5 = move-exception
            java.lang.String r3 = "JpegHelper"
            java.lang.String r1 = "UnsatisfiedLinkError"
            X.0KC.A0G(r3, r1, r5)     // Catch:{ all -> 0x014d }
        L_0x0113:
            r1 = 0
        L_0x0114:
            r1.getClass()     // Catch:{ all -> 0x014d }
            X.8mY r3 = new X.8mY     // Catch:{ all -> 0x014d }
            r3.<init>(r1, r2)     // Catch:{ all -> 0x014d }
            java.lang.Object r1 = r4.get(r0)     // Catch:{ all -> 0x014d }
            X.8mY r1 = (X.C365118mY) r1     // Catch:{ all -> 0x014d }
            if (r1 == 0) goto L_0x012e
            com.instagram.util.jpeg.NativeImage r0 = r3.A00     // Catch:{ all -> 0x014d }
            int r0 = r0.bufferId     // Catch:{ all -> 0x014d }
            com.instagram.util.jpeg.JpegBridge.releaseNativeBuffer(r0)     // Catch:{ all -> 0x014d }
            com.instagram.util.jpeg.NativeImage r0 = r1.A00     // Catch:{ all -> 0x014d }
            goto L_0x0133
        L_0x012e:
            r4.put(r0, r3)     // Catch:{ all -> 0x014d }
            com.instagram.util.jpeg.NativeImage r0 = r3.A00     // Catch:{ all -> 0x014d }
        L_0x0133:
            monitor-exit(r2)
            return r0
        L_0x0135:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x014d }
            r0.<init>(r3)     // Catch:{ all -> 0x014d }
            goto L_0x014c
        L_0x013b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x014d }
            r0.<init>(r3)     // Catch:{ all -> 0x014d }
            goto L_0x014c
        L_0x0141:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x014d }
            r0.<init>(r3)     // Catch:{ all -> 0x014d }
            goto L_0x014c
        L_0x0147:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x014d }
            r0.<init>(r3)     // Catch:{ all -> 0x014d }
        L_0x014c:
            throw r0     // Catch:{ all -> 0x014d }
        L_0x014d:
            r1 = move-exception
            monitor-exit(r2)
            throw r1
        L_0x0150:
            X.8mX r2 = X.C365098mW.A00
            r3 = r17
            if (r17 == 0) goto L_0x015f
            X.8mJ r1 = r6.A07
            com.instagram.common.session.UserSession r0 = r6.A05
            com.instagram.util.jpeg.NativeImage r0 = r2.A00(r5, r0, r1, r3)
            return r0
        L_0x015f:
            java.lang.String r0 = "path is null"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C364958mI.A01(java.lang.String, java.lang.String, boolean):com.instagram.util.jpeg.NativeImage");
    }

    private final C365358my A00(SurfaceCropFilter surfaceCropFilter) {
        Bitmap decodeByteArray;
        C364808m2 r1 = this.A08;
        String AvM = r1.AvM();
        String title = r1.getTitle();
        if (AvM != null) {
            decodeByteArray = BitmapFactory.decodeFile(AvM);
        } else {
            byte[] BG2 = r1.BG2();
            if (BG2 == null) {
                return null;
            }
            decodeByteArray = BitmapFactory.decodeByteArray(BG2, 0, BG2.length);
        }
        if (decodeByteArray == null) {
            return null;
        }
        int width = decodeByteArray.getWidth();
        int height = decodeByteArray.getHeight();
        CropInfo cropInfo = this.A01;
        if (cropInfo == null) {
            cropInfo = C395009z3.A00(width, height);
            this.A01 = cropInfo;
        }
        A02(cropInfo.A02, width, height, this.A00);
        if (!00l.A0d(title, "cover_photo", false)) {
            A04(surfaceCropFilter, this.A00, width, height);
        }
        C365358my A032 = AnonymousClass9S9.A03(decodeByteArray, true);
        this.A06.DTX(cropInfo, title, this.A00);
        return A032;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
        if (X.182.A06(X.0Tu.A05, r10.A05, 36325222777303791L) == false) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A02(android.graphics.Rect r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            boolean r0 = r10.A03
            if (r0 != 0) goto L_0x0091
            boolean r0 = r10.A09
            if (r0 != 0) goto L_0x0091
            int r0 = r11.width()
            float r4 = (float) r0
            int r0 = r11.height()
            float r0 = (float) r0
            float r4 = r4 / r0
            X.82r r0 = r10.A02
            if (r0 == 0) goto L_0x008f
            X.514 r1 = r0.ANP()
        L_0x001b:
            X.514 r0 = X.AnonymousClass514.ORIGINAL
            if (r1 != r0) goto L_0x002f
            com.instagram.common.session.UserSession r3 = r10.A05
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325222777303791(0x810d99000732ef, double:3.0355553820740446E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0030
        L_0x002f:
            r0 = 0
        L_0x0030:
            boolean r0 = X.C64138LPn.A02(r14, r4, r0)
            if (r0 != 0) goto L_0x0091
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            r2 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            com.instagram.creation.base.CropInfo r1 = r10.A01
            if (r1 == 0) goto L_0x008d
            int r0 = r1.A01
        L_0x0045:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            if (r1 == 0) goto L_0x008b
            int r0 = r1.A00
        L_0x004d:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            if (r1 == 0) goto L_0x0089
            android.graphics.Rect r0 = r1.A02
            if (r0 == 0) goto L_0x0089
            int r0 = r0.width()
        L_0x005b:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            com.instagram.creation.base.CropInfo r0 = r10.A01
            if (r0 == 0) goto L_0x006b
            android.graphics.Rect r0 = r0.A02
            if (r0 == 0) goto L_0x006b
            int r2 = r0.height()
        L_0x006b:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r14)
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r4, r5, r6, r7, r8, r9}
            java.lang.String r0 = "scaled: %d x %d, orig: %d x %d, crop: %d x %d, exif: %d"
            java.lang.String r1 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r1)
            java.lang.String r0 = "Aspect ratio error: "
            java.lang.String r1 = X.002.A0R(r0, r1)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0089:
            r0 = 0
            goto L_0x005b
        L_0x008b:
            r0 = 0
            goto L_0x004d
        L_0x008d:
            r0 = 0
            goto L_0x0045
        L_0x008f:
            r1 = 0
            goto L_0x001b
        L_0x0091:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C364958mI.A02(android.graphics.Rect, int, int, int):void");
    }

    public static final void A03(IglTexture iglTexture, C364958mI r6, SurfaceCropFilter surfaceCropFilter, String str, int i) {
        NativeImage nativeImage;
        int width;
        int height;
        C365108mX r1 = C365098mW.A00;
        synchronized (r1) {
            C365118mY r0 = (C365118mY) r1.A00.get(str);
            if (r0 == null) {
                nativeImage = null;
            } else {
                nativeImage = r0.A00;
            }
        }
        if (iglTexture != null) {
            width = iglTexture.getWidth();
            height = iglTexture.getHeight();
        } else if (nativeImage != null) {
            width = nativeImage.width;
            height = nativeImage.height;
        } else {
            return;
        }
        CropInfo cropInfo = r6.A01;
        if (cropInfo == null) {
            cropInfo = C395009z3.A00(width, height);
            r6.A01 = cropInfo;
        }
        r6.A02(cropInfo.A02, width, height, i);
        if (!00l.A0d(str, "cover_photo", false)) {
            r6.A04(surfaceCropFilter, i, width, height);
        }
        r6.A06.DTX(cropInfo, str, i);
    }

    private final void A04(SurfaceCropFilter surfaceCropFilter, int i, int i2, int i3) {
        CropInfo cropInfo = this.A01;
        if (cropInfo != null) {
            SurfaceCropFilter surfaceCropFilter2 = surfaceCropFilter;
            if (surfaceCropFilter != null && surfaceCropFilter.A00.A0F) {
                surfaceCropFilter2.A0K(C63218KtP.A00(cropInfo.A02, i2, i3, cropInfo.A01, cropInfo.A00), i2, i3, i, false);
                surfaceCropFilter.A00.A0A = this.A09;
            }
        }
    }

    public final C365358my A05(SurfaceCropFilter surfaceCropFilter, boolean z) {
        C365358my r3;
        NativeImage A012;
        RuntimeException runtimeException;
        C365358my A002;
        C364808m2 r2 = this.A08;
        String AvM = r2.AvM();
        if (AvM != null && this.A01 == null) {
            this.A00 = 1MF.A00(AvM);
        }
        Bitmap bitmap = this.A0A;
        if (bitmap != null) {
            if (bitmap.isRecycled()) {
                0f9 AEf = 0wj.A01.AEf("ImageInputSurfaceProvider", 817892527);
                AEf.ABQ(DialogModule.KEY_MESSAGE, "createInputSurfaceNonDestructiveCrop: unintended recycle behavior with bitmap");
                AEf.report();
            }
            BitmapFactory.Options options = AnonymousClass9S9.A00;
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int A003 = AnonymousClass9S9.A00();
            GLUtils.texImage2D(3553, 0, bitmap, 0);
            bitmap.recycle();
            if (!AnonymousClass9S9.A05("makeBitmapTexture")) {
                return C365338mw.A01((C367428qj) null, A003, width, height);
            }
            return null;
        }
        SurfaceCropFilter surfaceCropFilter2 = surfaceCropFilter;
        if (Build.VERSION.SDK_INT >= 34 && this.A04 && r2.Cdi() && (A002 = A00(surfaceCropFilter2)) != null) {
            return A002;
        }
        try {
            synchronized (A0B) {
                String AvM2 = r2.AvM();
                String title = r2.getTitle();
                if (z) {
                    try {
                        29K r32 = 27p.A01(this.A05).A04;
                        r32.A03.A0D("upload_image_to_gpu_requested", r32.A01, (String) null, (String) null, (String) null, (String) null);
                    } catch (IOException e) {
                        r3 = A00(surfaceCropFilter2);
                        if (r3 != null) {
                            if (z) {
                                29K r4 = 27p.A01(this.A05).A04;
                                r4.A03.A0D("upload_image_to_gpu_success", r4.A01, (String) null, (String) null, (String) null, (String) null);
                            }
                            A06();
                        } else {
                            if (z) {
                                29K r33 = 27p.A01(this.A05).A04;
                                r33.A03.A0C("upload_image_to_gpu_failed", r33.A01);
                            }
                            runtimeException = new RuntimeException(e);
                            throw runtimeException;
                        }
                    } catch (IllegalStateException e2) {
                        if (z) {
                            29K r34 = 27p.A01(this.A05).A04;
                            r34.A03.A0C("upload_image_to_gpu_failed", r34.A01);
                        }
                        runtimeException = new RuntimeException(e2);
                        throw runtimeException;
                    } catch (Throwable th) {
                        A06();
                        throw th;
                    }
                }
                if (this.A09) {
                    A012 = A01(AvM2, title, true);
                    CropInfo cropInfo = this.A01;
                    if (cropInfo != null) {
                        Rect rect = cropInfo.A02;
                        rect.set(0, 0, rect.width(), cropInfo.A02.height());
                    }
                } else {
                    A012 = A01(AvM2, title, false);
                }
                r3 = C365338mw.A01((C367428qj) null, JpegBridge.uploadTexture(A012, 6408), A012.width, A012.height);
                A03((IglTexture) null, this, surfaceCropFilter2, title, this.A00);
                A06();
                if (z) {
                    29K r42 = 27p.A01(this.A05).A04;
                    r42.A03.A0D("upload_image_to_gpu_success", r42.A01, (String) null, (String) null, (String) null, (String) null);
                }
            }
            return r3;
        } catch (C365318mt e3) {
            Uri BZF = r2.BZF();
            if (BZF != null) {
                if (182.A06(0Tu.A05, this.A05, 36315473202908404L)) {
                    String title2 = r2.getTitle();
                    Bitmap E1R = r2.E1R(((int) (((double) Runtime.getRuntime().maxMemory()) * 0.08d)) / 4, false);
                    if (E1R != null) {
                        int width2 = E1R.getWidth();
                        int height2 = E1R.getHeight();
                        CropInfo cropInfo2 = this.A01;
                        if (cropInfo2 == null) {
                            cropInfo2 = C395009z3.A00(width2, height2);
                            this.A01 = cropInfo2;
                        }
                        A02(cropInfo2.A02, width2, height2, this.A00);
                        if (!00l.A0d(title2, "cover_photo", false)) {
                            A04(surfaceCropFilter2, this.A00, width2, height2);
                        }
                        C365358my A032 = AnonymousClass9S9.A03(E1R, true);
                        this.A06.DTX(cropInfo2, title2, this.A00);
                        if (A032 != null) {
                            return A032;
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to load original file: ");
                    sb.append(BZF);
                    throw new IOException(sb.toString(), e3);
                }
            }
            throw e3;
        }
    }

    public final void A06() {
        C365098mW.A00.A01(this.A08.getTitle());
    }
}

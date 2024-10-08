package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;

/* renamed from: X.8vW  reason: invalid class name and case insensitive filesystem */
public final class C369908vW extends Drawable implements C268684dp, C321026tS, Drawable.Callback, AnonymousClass1MK, C268714ds {
    public float A00;
    public Bitmap A01;
    public Path A02;
    public Path A03;
    public C59985Jcu A04;
    public boolean A05;
    public boolean A06;
    public ColorFilter A07;
    public final float A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final Paint A0E;
    public final AnonymousClass6M4 A0F;
    public final String A0G;
    public final float A0H;
    public final long A0I;
    public final Resources A0J;
    public final Bitmap A0K;
    public final Paint A0L;
    public final RectF A0M;
    public final Medium A0N;
    public final C321106ta A0O;
    public final C354668Mx A0P;
    public final CopyOnWriteArraySet A0Q;
    public final boolean A0R;
    public final boolean A0S;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0022, code lost:
        if (r11.CeS() == false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C369908vW(android.content.Context r9, android.graphics.Bitmap r10, com.instagram.common.gallery.Medium r11, com.instagram.common.typedurl.ImageUrl r12, X.C354668Mx r13, java.lang.Integer r14, int r15, int r16, boolean r17, boolean r18, boolean r19, boolean r20) {
        /*
            r8 = this;
            r2 = 1
            X.0qQ.A0B(r9, r2)
            r0 = 9
            X.0qQ.A0B(r13, r0)
            r8.<init>()
            r8.A0N = r11
            r8.A0B = r15
            r0 = r16
            r8.A0A = r0
            r8.A0P = r13
            r0 = r20
            r8.A0R = r0
            r3 = 0
            if (r18 == 0) goto L_0x0024
            boolean r0 = r11.CeS()
            r6 = 1
            if (r0 != 0) goto L_0x0025
        L_0x0024:
            r6 = 0
        L_0x0025:
            r8.A0S = r6
            r5 = 0
            r0 = 1059481190(0x3f266666, float:0.65)
            X.6ta r0 = X.C394019xP.A00(r9, r0)
            r0.setCallback(r8)
            r8.A0O = r0
            r1 = 3
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r1)
            r8.A0L = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r8.A0M = r0
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
            r0.<init>()
            r8.A0Q = r0
            android.content.res.Resources r4 = r9.getResources()
            X.0qQ.A07(r4)
            r8.A0J = r4
            X.8Mx r0 = X.C354668Mx.BEFORE_AND_AFTER
            if (r13 != r0) goto L_0x00a8
            r0 = 2131165213(0x7f07001d, float:1.7944637E38)
            int r0 = r4.getDimensionPixelSize(r0)
            int r7 = r0 * 2
        L_0x0060:
            r8.A09 = r7
            long r0 = android.os.SystemClock.elapsedRealtime()
            r8.A0I = r0
            r0 = 2131165245(0x7f07003d, float:1.7944702E38)
            int r0 = r4.getDimensionPixelSize(r0)
            float r0 = (float) r0
            r8.A0H = r0
            java.lang.String r0 = r11.A0X
            int r0 = X.C364678lo.A01(r0)
            r8.A0D = r0
            r0 = 0
            if (r6 == 0) goto L_0x0084
            r0 = 2131239495(0x7f082247, float:1.8095299E38)
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r4, r0, r5)
        L_0x0084:
            r8.A0K = r0
            r8.A05 = r2
            int r1 = r13.ordinal()
            java.lang.String r0 = "rollcall_v2_photo_sticker"
            switch(r1) {
                case 0: goto L_0x00f4;
                case 1: goto L_0x00ed;
                case 2: goto L_0x00e6;
                case 3: goto L_0x00df;
                case 4: goto L_0x00df;
                case 5: goto L_0x00d8;
                case 6: goto L_0x00d8;
                case 7: goto L_0x00fc;
                case 8: goto L_0x00d5;
                case 9: goto L_0x00fc;
                case 10: goto L_0x00d2;
                case 11: goto L_0x00c3;
                case 12: goto L_0x00cf;
                case 13: goto L_0x00cc;
                case 14: goto L_0x00c6;
                case 15: goto L_0x00c9;
                default: goto L_0x0091;
            }
        L_0x0091:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "No ID defined for style: "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x00a8:
            X.8Mx r0 = X.C354668Mx.POTATO
            if (r13 != r0) goto L_0x00b4
            r0 = 2131165250(0x7f070042, float:1.7944712E38)
        L_0x00af:
            int r7 = r4.getDimensionPixelSize(r0)
            goto L_0x0060
        L_0x00b4:
            if (r17 == 0) goto L_0x00c1
            if (r14 == 0) goto L_0x00bd
            int r7 = r14.intValue()
            goto L_0x0060
        L_0x00bd:
            r0 = 2131165243(0x7f07003b, float:1.7944698E38)
            goto L_0x00af
        L_0x00c1:
            r7 = 0
            goto L_0x0060
        L_0x00c3:
            java.lang.String r0 = "gallery_image_sticker_star_refresh"
            goto L_0x00fc
        L_0x00c6:
            java.lang.String r0 = "gallery_image_sticker_tiles"
            goto L_0x00fc
        L_0x00c9:
            java.lang.String r0 = "gallery_image_sticker_starburst"
            goto L_0x00fc
        L_0x00cc:
            java.lang.String r0 = "gallery_image_sticker_flower"
            goto L_0x00fc
        L_0x00cf:
            java.lang.String r0 = "gallery_image_sticker_badge"
            goto L_0x00fc
        L_0x00d2:
            java.lang.String r0 = "gallery_image_sticker_heart_refresh"
            goto L_0x00fc
        L_0x00d5:
            java.lang.String r0 = "before_and_after_story_sticker"
            goto L_0x00fc
        L_0x00d8:
            r0 = 2413(0x96d, float:3.381E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            goto L_0x00fc
        L_0x00df:
            r0 = 2411(0x96b, float:3.379E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            goto L_0x00fc
        L_0x00e6:
            r0 = 2412(0x96c, float:3.38E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            goto L_0x00fc
        L_0x00ed:
            r0 = 711(0x2c7, float:9.96E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            goto L_0x00fc
        L_0x00f4:
            if (r7 <= 0) goto L_0x013c
            r0 = 712(0x2c8, float:9.98E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
        L_0x00fc:
            r8.A0G = r0
            r0 = 2131099902(0x7f0600fe, float:1.781217E38)
            int r1 = r9.getColor(r0)
            r8.A0C = r1
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r2)
            r0.setColor(r1)
            r8.A0E = r0
            r0 = 1092616192(0x41200000, float:10.0)
            float r0 = X.0nA.A00(r9, r0)
            r8.A08 = r0
            if (r10 == 0) goto L_0x0129
            r8.A01(r10, r3)
        L_0x011e:
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.6M4 r0 = X.C321156tf.A01(r9, r8, r1, r0)
            r8.A0F = r0
            return
        L_0x0129:
            if (r19 == 0) goto L_0x012f
            A02(r12, r8, r2)
            goto L_0x011e
        L_0x012f:
            X.0nO r1 = X.0nY.A00()
            X.9ky r0 = new X.9ky
            r0.<init>(r12, r8)
            r1.ATE(r0)
            goto L_0x011e
        L_0x013c:
            r0 = 151(0x97, float:2.12E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            goto L_0x00fc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C369908vW.<init>(android.content.Context, android.graphics.Bitmap, com.instagram.common.gallery.Medium, com.instagram.common.typedurl.ImageUrl, X.8Mx, java.lang.Integer, int, int, boolean, boolean, boolean, boolean):void");
    }

    public final void A9D(C41815B1v b1v) {
        0qQ.A0B(b1v, 0);
        this.A0Q.add(b1v);
    }

    public final /* synthetic */ void CLr() {
        C321156tf.A02(this);
    }

    public final void CyF(C226952iF r3, AnonymousClass3LX r4) {
        0qQ.A0B(r4, 1);
        Bitmap bitmap = r4.A01;
        if (bitmap != null) {
            A01(bitmap, true);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void DJx(C226952iF r1, C254673sr r2) {
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public final void EE1(C41815B1v b1v) {
        0qQ.A0B(b1v, 0);
        this.A0Q.remove(b1v);
    }

    public final void draw(Canvas canvas) {
        int i;
        int i2;
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas2, 0);
        canvas2.save();
        canvas2.translate((float) getBounds().left, (float) getBounds().top);
        if (this.A01 == null) {
            float elapsedRealtime = ((float) (SystemClock.elapsedRealtime() - this.A0I)) / 500.0f;
            if (elapsedRealtime > 1.0f) {
                elapsedRealtime = 1.0f;
            }
            C321106ta r0 = this.A0O;
            r0.A00(elapsedRealtime);
            r0.draw(canvas2);
        } else {
            canvas2.save();
            float f = this.A00;
            canvas2.scale(f, f);
            C59985Jcu jcu = this.A04;
            if (this.A06 && jcu != null) {
                int i3 = jcu.A01;
                float f2 = this.A08;
                int i4 = ((int) f2) * 2;
                int i5 = i3 + i4;
                int i6 = jcu.A00 + i4;
                int i7 = i5 - i6;
                if (i7 < 0) {
                    i7 = 0;
                }
                int i8 = i7 / 2;
                int i9 = i6 - i5;
                if (i9 < 0) {
                    i9 = 0;
                }
                int i10 = i9 / 2;
                Path path = this.A02;
                canvas2.save();
                float f3 = -f2;
                canvas2.translate(f3, f3);
                if (path != null) {
                    if (i5 > i6) {
                        canvas2.translate((float) i8, 0.0f);
                    } else if (i6 > i5) {
                        canvas2.translate(0.0f, (float) i10);
                    }
                    canvas2.clipPath(path);
                    canvas2.drawColor(this.A0C);
                } else {
                    float f4 = (float) this.A09;
                    canvas2.drawRoundRect(0.0f, 0.0f, (float) i5, (float) i6, f4, f4, this.A0E);
                }
                canvas2.restore();
            }
            Path path2 = this.A03;
            if (path2 != null) {
                if (this.A05) {
                    C59985Jcu jcu2 = this.A04;
                    if (jcu2 != null) {
                        i = jcu2.A01;
                        i2 = jcu2.A00;
                    } else {
                        i = 0;
                        i2 = 0;
                    }
                    int i11 = (i - i2) / 2;
                    int i12 = 0;
                    if (0 < i11) {
                        i12 = i11;
                    }
                    int i13 = (i2 - i) / 2;
                    int i14 = 0;
                    if (0 < i13) {
                        i14 = i13;
                    }
                    if (i > i2) {
                        canvas2.translate((float) i12, 0.0f);
                    } else if (i2 > i) {
                        canvas2.translate(0.0f, (float) i14);
                    }
                }
                canvas2.clipPath(path2);
            }
            C59985Jcu jcu3 = this.A04;
            if (jcu3 != null) {
                jcu3.draw(canvas2);
            }
            canvas2.restore();
            if (this.A0S) {
                RectF rectF = this.A0M;
                float f5 = this.A0H / 2.0f;
                rectF.set((((float) getBounds().width()) / 2.0f) - f5, (((float) getBounds().height()) / 2.0f) - f5, (((float) getBounds().width()) / 2.0f) + f5, (((float) getBounds().height()) / 2.0f) + f5);
                Bitmap bitmap = this.A0K;
                if (bitmap != null) {
                    canvas2.drawBitmap(bitmap, (Rect) null, rectF, this.A0L);
                }
            }
        }
        canvas2.restore();
        this.A0F.draw(canvas2);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        this.A0O.setBounds(0, 0, rect.width(), rect.height());
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        0qQ.A0B(runnable, 1);
        scheduleSelf(runnable, j);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        0qQ.A0B(runnable, 1);
        unscheduleSelf(runnable);
    }

    private final void A01(Bitmap bitmap, boolean z) {
        Integer num;
        int i;
        C59985Jcu jcu;
        float f;
        int i2;
        Integer valueOf;
        Integer valueOf2;
        Float valueOf3;
        int height;
        Bitmap bitmap2 = bitmap;
        this.A01 = bitmap2;
        C354668Mx r4 = this.A0P;
        if (r4.ordinal() == 8) {
            num = AnonymousClass05K.A1F;
        } else {
            num = AnonymousClass05K.A1I;
        }
        if (8 - num.intValue() != 0) {
            i = 15;
        } else {
            i = 12;
        }
        if (this.A0R) {
            int i3 = this.A0B;
            int i4 = this.A0A;
            float f2 = (float) this.A09;
            float f3 = (float) i3;
            float f4 = (float) i4;
            float f5 = f3 / f4;
            if (f5 > 1.0f) {
                valueOf = Integer.valueOf((int) (f4 * f5));
                valueOf2 = Integer.valueOf(i4);
            } else {
                valueOf = Integer.valueOf(i3);
                valueOf2 = Integer.valueOf((int) (f3 / f5));
            }
            int intValue = valueOf.intValue();
            int intValue2 = valueOf2.intValue();
            Matrix matrix = new Matrix();
            int i5 = this.A0D;
            matrix.setRotate((float) i5);
            if (i5 == 0 || i5 == 180) {
                valueOf3 = Float.valueOf((float) bitmap2.getWidth());
                height = bitmap2.getHeight();
            } else {
                valueOf3 = Float.valueOf((float) bitmap2.getHeight());
                height = bitmap2.getWidth();
            }
            float f6 = (float) intValue;
            float max = Math.max(f6 / valueOf3.floatValue(), ((float) intValue2) / ((float) height));
            matrix.postScale(max, max);
            int width = bitmap2.getWidth();
            int height2 = bitmap2.getHeight();
            0fO.A03(bitmap2);
            Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, width, height2, matrix, true);
            0qQ.A07(createBitmap);
            matrix.setTranslate(-((float) Math.max(0, (createBitmap.getWidth() - i3) / 2)), -((float) Math.max(0, (createBitmap.getHeight() - i4) / 2)));
            jcu = new C59985Jcu(createBitmap, matrix, f2, i);
            jcu.setBounds(0, 0, i3, i4);
            this.A00 = Math.max(f4 / ((float) jcu.A00), f3 / ((float) jcu.A01));
        } else {
            if (z) {
                int i6 = 0;
                0eP A002 = A00(bitmap2, this);
                int intValue3 = ((Number) A002.A00).intValue();
                int intValue4 = ((Number) A002.A01).intValue();
                Bitmap bitmap3 = this.A01;
                if (bitmap3 != null) {
                    i2 = bitmap3.getWidth();
                } else {
                    i2 = 0;
                }
                Bitmap bitmap4 = this.A01;
                if (bitmap4 != null) {
                    i6 = bitmap4.getHeight();
                }
                int i7 = this.A0D;
                boolean z2 = 1MF.A02;
                Matrix matrix2 = new Matrix();
                1MF.A0J(matrix2, i2, i6, intValue3, intValue4, i7, false);
                jcu = new C59985Jcu(bitmap2, matrix2, (float) this.A09, i);
            } else {
                jcu = new C59985Jcu(bitmap2, (Matrix) null, (float) this.A09, i);
            }
            int i8 = jcu.A01;
            int i9 = jcu.A00;
            int i10 = i9;
            jcu.setBounds(0, 0, i8, i9);
            if (i8 > i9) {
                f = (float) this.A0B;
                i10 = i8;
            } else {
                f = (float) this.A0A;
            }
            this.A00 = f / ((float) i10);
            this.A03 = C39898AIf.A02(r4, i8, i9);
            int i11 = ((int) this.A08) * 2;
            this.A02 = C39898AIf.A02(r4, i8 + i11, i9 + i11);
        }
        jcu.mutate().setAlpha(jcu.getAlpha());
        jcu.mutate().setColorFilter(jcu.getColorFilter());
        this.A04 = jcu;
        Iterator it = this.A0Q.iterator();
        0qQ.A07(it);
        while (it.hasNext()) {
            ((C41815B1v) it.next()).DOX();
        }
        invalidateSelf();
    }

    public static final void A02(SimpleImageUrl simpleImageUrl, C369908vW r9, boolean z) {
        String str;
        int i;
        int i2;
        Bitmap bitmap;
        Medium medium = r9.A0N;
        if (medium.A05()) {
            str = medium.A0X;
        } else {
            str = medium.A0a;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int i3 = r9.A0D;
        if (i3 == 90 || i3 == 270) {
            i = options.outHeight;
            i2 = options.outWidth;
        } else {
            i = options.outWidth;
            i2 = options.outHeight;
        }
        int i4 = 1;
        while (true) {
            int i5 = i4 * 2;
            if (i / i5 <= r9.A0B && i2 / i5 <= r9.A0A) {
                break;
            }
            i4 = i5;
        }
        if (str != null) {
            Uri fromFile = Uri.fromFile(new File(str));
            0qQ.A07(fromFile);
            simpleImageUrl = C253833rU.A00(fromFile, -1, -1);
        } else if (simpleImageUrl == null) {
            return;
        }
        if (z) {
            AnonymousClass48Q r4 = new AnonymousClass48Q();
            1OO A0J2 = 1NK.A00().A0J(simpleImageUrl, (String) null);
            A0J2.A02(r4);
            A0J2.A01 = i4;
            A0J2.A01();
            try {
                r4.A01.await(10, TimeUnit.SECONDS);
            } catch (InterruptedException unused) {
            }
            AnonymousClass3LX r0 = r4.A00;
            if (r0 != null && (bitmap = r0.A01) != null) {
                r9.A01(bitmap, true);
                return;
            }
            return;
        }
        1OO A0J3 = 1NK.A00().A0J(simpleImageUrl, (String) null);
        A0J3.A02(r9);
        A0J3.A01 = i4;
        A0J3.A01();
    }

    public final void AHg() {
        this.A0Q.clear();
    }

    public final C2802350v BzV() {
        return new C387379m7(this.A0N, this.A0B, this.A0A);
    }

    public final AnonymousClass6M4 C49() {
        return this.A0F;
    }

    public final /* synthetic */ boolean Cdq() {
        return false;
    }

    public final void FL9(boolean z, boolean z2) {
        this.A06 = z;
        AnonymousClass6M4 r0 = this.A0F;
        if (z2) {
            r0.A01();
        } else {
            r0.A00();
        }
        invalidateSelf();
    }

    public final int getIntrinsicHeight() {
        int i;
        if (this.A01 == null) {
            return this.A0O.A03;
        }
        C59985Jcu jcu = this.A04;
        if (jcu != null) {
            i = jcu.A00;
        } else {
            i = 0;
        }
        return AnonymousClass1GB.A01(((float) i) * this.A00);
    }

    public final int getIntrinsicWidth() {
        int i;
        if (this.A01 == null) {
            return this.A0O.A04;
        }
        C59985Jcu jcu = this.A04;
        if (jcu != null) {
            i = jcu.A01;
        } else {
            i = 0;
        }
        return AnonymousClass1GB.A01(((float) i) * this.A00);
    }

    public final boolean isLoading() {
        if (this.A01 == null) {
            return true;
        }
        return false;
    }

    public final void setAlpha(int i) {
        Drawable mutate;
        C59985Jcu jcu = this.A04;
        if (!(jcu == null || (mutate = jcu.mutate()) == null)) {
            mutate.setAlpha(i);
        }
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable mutate;
        this.A07 = colorFilter;
        C59985Jcu jcu = this.A04;
        if (!(jcu == null || (mutate = jcu.mutate()) == null)) {
            mutate.setColorFilter(this.A07);
        }
        invalidateSelf();
    }

    public static final 0eP A00(Bitmap bitmap, C369908vW r4) {
        int i;
        float f;
        int i2;
        float f2;
        float width = (((float) bitmap.getWidth()) * 1.0f) / ((float) bitmap.getHeight());
        int i3 = r4.A0D;
        if (i3 == 0 || i3 == 180) {
            if (bitmap.getHeight() > bitmap.getWidth()) {
                i = r4.A0A;
                f = ((float) i) * width;
                i2 = (int) f;
                return new 0eP(Integer.valueOf(i2), Integer.valueOf(i));
            }
            i2 = r4.A0B;
            f2 = ((float) i2) / width;
        } else if (bitmap.getHeight() > bitmap.getWidth()) {
            i2 = r4.A0B;
            f2 = ((float) i2) * width;
        } else {
            i = r4.A0A;
            f = ((float) i) / width;
            i2 = (int) f;
            return new 0eP(Integer.valueOf(i2), Integer.valueOf(i));
        }
        i = (int) f2;
        return new 0eP(Integer.valueOf(i2), Integer.valueOf(i));
    }

    public final /* synthetic */ boolean CZ7(UserSession userSession) {
        return true;
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }
}

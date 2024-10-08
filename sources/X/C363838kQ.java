package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import com.google.common.collect.ImmutableList;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.gallery.GeneratedMediaMetadata;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import java.util.List;

/* renamed from: X.8kQ  reason: invalid class name and case insensitive filesystem */
public final class C363838kQ extends 2Cl {
    public Bitmap A00;
    public final int A01;
    public final Context A02;
    public final Bitmap A03;
    public final Bitmap A04;
    public final C363848kR A05;
    public final C363858kS A06;
    public final C363858kS A07;
    public final ImmutableList A08;
    public final CameraAREffect A09;
    public final MediaUploadMetadata A0A;
    public final UserSession A0B;
    public final TargetViewSizeProvider A0C;
    public final C352908Fn A0D;
    public final AnonymousClass8GK A0E;
    public final Boolean A0F;
    public final Float A0G;
    public final Float A0H;
    public final Integer A0I;
    public final Integer A0J;
    public final Integer A0K;
    public final Integer A0L;
    public final Integer A0M;
    public final Integer A0N;
    public final Long A0O;
    public final String A0P;
    public final String A0Q;
    public final String A0R;
    public final String A0S;
    public final List A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final byte[] A0X;
    public final byte[] A0Y;
    public final Rect A0Z;

    public C363838kQ(Context context, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, Rect rect, C363848kR r7, C363858kS r8, C363858kS r9, ImmutableList immutableList, CameraAREffect cameraAREffect, MediaUploadMetadata mediaUploadMetadata, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, C352908Fn r15, AnonymousClass8GK r16, Boolean bool, Float f, Float f2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Long l, String str, String str2, String str3, String str4, List list, byte[] bArr, byte[] bArr2, int i, boolean z, boolean z2, boolean z3) {
        this.A0B = userSession;
        this.A02 = context;
        this.A0C = targetViewSizeProvider;
        this.A0D = r15;
        this.A03 = bitmap;
        this.A0Y = bArr2;
        this.A0X = bArr;
        this.A04 = bitmap2;
        this.A05 = r7;
        this.A0Z = rect;
        this.A0W = z3;
        this.A09 = cameraAREffect;
        this.A08 = immutableList;
        this.A0Q = str2;
        this.A0R = str3;
        this.A06 = r8;
        this.A00 = bitmap3;
        this.A0U = z;
        this.A0P = str;
        this.A0E = r16;
        this.A01 = i;
        this.A0T = list;
        this.A0S = str4;
        this.A0O = l;
        this.A0K = num3;
        this.A0G = f;
        this.A0I = num;
        this.A0H = f2;
        this.A0J = num2;
        this.A0V = z2;
        this.A0F = bool;
        this.A0L = num4;
        this.A0N = num6;
        this.A07 = r9;
        this.A0M = num5;
        this.A0A = mediaUploadMetadata;
    }

    public final int getRunnableId() {
        return 549;
    }

    public final void onFail(Exception exc) {
        0qQ.A0B(exc, 0);
        C59689JTv.A0B(this.A02, "save_captured_photo_failed");
        this.A0D.DWx(exc.getMessage());
    }

    public final /* bridge */ /* synthetic */ Object call() {
        int i;
        int i2;
        int A002;
        int i3;
        boolean z;
        C352218Cl r13;
        BackgroundGradientColors backgroundGradientColors;
        GeneratedMediaMetadata generatedMediaMetadata;
        Number number;
        byte[] bArr = this.A0Y;
        if (bArr != null) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            0fP.A00(bArr, 0, bArr.length, options);
            i2 = options.outWidth;
            i = options.outHeight;
        } else {
            Bitmap bitmap = this.A03;
            if (bitmap != null) {
                i2 = bitmap.getWidth();
                i = bitmap.getHeight();
            } else {
                0kD.A0D("SaveCapturedPhotoTask", "JPEG, bitmap, and YUV data cannot all be null.", (Throwable) null);
                i = 0;
                i2 = 0;
            }
        }
        UserSession userSession = this.A0B;
        Context context = this.A02;
        boolean z2 = this.A0W;
        Bitmap bitmap2 = this.A03;
        C352218Cl A003 = C363868kT.A00(context, bitmap2, this.A05, userSession, bArr, i2, i, z2);
        String str = this.A0P;
        A003.A0a = str;
        A003.A0v = this.A0U;
        A003.A0W = this.A0O;
        A003.A0T = this.A0K;
        A003.A0O = this.A0G;
        A003.A0Q = this.A0I;
        A003.A0P = this.A0H;
        A003.A0S = this.A0J;
        A003.A10 = this.A0V;
        A003.A0N = this.A0F;
        A003.A1A = bArr;
        A003.A0V = this.A0N;
        A003.A0U = this.A0M;
        A003.A0K = this.A0E;
        A003.A0b = this.A0Q;
        MediaUploadMetadata mediaUploadMetadata = this.A0A;
        0qQ.A0B(mediaUploadMetadata, 0);
        A003.A0G = mediaUploadMetadata;
        Integer num = this.A0L;
        if (num != null) {
            A002 = num.intValue();
        } else if (bitmap2 != null) {
            A002 = 0;
        } else {
            A002 = C364138kv.A00(bArr);
        }
        A003.A07 = A002;
        C363858kS r14 = this.A06;
        if (r14 == null || (number = (Number) r14.A03(C363858kS.A0K)) == null) {
            if (str == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unhandled cameraFacingId: ");
                sb.append(C363858kS.A0K);
                sb.append('.');
                0kD.A0D("SaveCapturedPhotoTask", sb.toString(), (Throwable) null);
            } else if (str.equals("front")) {
                i3 = 1;
            } else if (!str.equals("back")) {
                0kD.A0D("SaveCapturedPhotoTask", 002.A0S("Unhandled mCameraPosition: ", str, '.'), (Throwable) null);
            }
            i3 = 0;
        } else {
            i3 = number.intValue();
        }
        A003.A00 = i3;
        CameraAREffect cameraAREffect = this.A09;
        if (cameraAREffect != null) {
            A003.A0E = cameraAREffect;
            A003.A0c = this.A0R;
            if (cameraAREffect.A0f) {
                A003.A0t.add(C391429sz.A0X.toString());
            }
        }
        Medium medium = A003.A0F;
        if (!(medium == null || (generatedMediaMetadata = medium.A0E) == null || !generatedMediaMetadata.A01)) {
            A003.A0t.add(C391429sz.A06.toString());
        }
        if (r14 != null) {
            Rect A022 = r14.A02(A002);
            A003.A03 = A022.left;
            A003.A05 = A022.top;
            A003.A04 = A022.right;
            A003.A02 = A022.bottom;
        }
        Bitmap bitmap3 = this.A04;
        byte[] bArr2 = this.A0X;
        int i4 = 0;
        if (bArr2 != null) {
            bitmap3 = 0fP.A00(bArr2, 0, bArr2.length, new BitmapFactory.Options());
            z = !z2;
            i4 = C364138kv.A00(bArr2);
        } else {
            z = false;
        }
        if (bitmap3 != null) {
            r13 = C363868kT.A00(context, bitmap3, (C363848kR) null, userSession, bArr2, bitmap3.getWidth(), bitmap3.getHeight(), z);
            r13.A0C = bitmap3;
            r13.A07 = i4;
            C363858kS r1 = this.A07;
            if (r1 != null) {
                r1.A02(i4);
            }
        } else {
            r13 = null;
        }
        A003.A0L = r13;
        Bitmap bitmap4 = this.A00;
        if (bitmap2 != null) {
            backgroundGradientColors = 0oT.A01(bitmap2, AnonymousClass05K.A00);
            A003.A0I = 0oY.A01(backgroundGradientColors, A002);
        } else if (bitmap4 != null) {
            A003.A0I = 0oY.A01(new BackgroundGradientColors(bitmap4.getPixel(0, 0), bitmap4.getPixel(3, 3)), A002);
            this.A00 = null;
        } else if (bArr != null) {
            AnonymousClass81W r12 = ((NineSixteenLayoutConfigImpl) this.A0C).A0K;
            int width = (int) (((float) r12.getWidth()) * 0.5f);
            int height = (int) (((float) r12.getHeight()) * 0.5f);
            int i5 = 1;
            while (i2 / i5 > width && i / i5 > height) {
                i5 *= 2;
            }
            Integer num2 = AnonymousClass05K.A00;
            Matrix matrix = 0oT.A00;
            Matrix matrix2 = new Matrix();
            matrix2.postRotate((float) (A002 % 180));
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inSampleSize = i5;
            Bitmap A004 = 0fP.A00(bArr, 0, bArr.length, options2);
            int i6 = options2.outWidth;
            int i7 = options2.outHeight;
            0fO.A03(A004);
            Bitmap createBitmap = Bitmap.createBitmap(A004, 0, 0, i6, i7, matrix2, true);
            0qQ.A07(createBitmap);
            backgroundGradientColors = 0oT.A01(createBitmap, num2);
            createBitmap.recycle();
            A004.recycle();
            A003.A0I = 0oY.A01(backgroundGradientColors, A002);
        }
        int i8 = this.A01;
        if (i8 != -1) {
            A003.A08 = i8;
            A003.A0s = this.A0T;
            A003.A0d = this.A0S;
            ImmutableList immutableList = this.A08;
            if (immutableList != null) {
                A003.A0o = immutableList;
            }
        }
        return A003;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C352218Cl r3 = (C352218Cl) obj;
        0qQ.A0B(r3, 0);
        C352908Fn r1 = this.A0D;
        if (!r1.CeF()) {
            C340297l2 Ajh = r1.Ajh();
            if (Ajh != null) {
                Ajh.A0D();
                return;
            }
            return;
        }
        r1.DWy(r3);
    }
}

package androidx.core.graphics.drawable;

import X.002;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C66582MXn;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode A0A = PorterDuff.Mode.SRC_IN;
    public int A00;
    public int A01;
    public int A02;
    public ColorStateList A03;
    public PorterDuff.Mode A04;
    public Parcelable A05;
    public Object A06;
    public String A07;
    public String A08;
    public byte[] A09;

    public static IconCompat A03(Bundle bundle) {
        Object obj;
        int i = bundle.getInt(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        IconCompat iconCompat = new IconCompat(i);
        iconCompat.A00 = bundle.getInt("int1");
        iconCompat.A01 = bundle.getInt("int2");
        iconCompat.A07 = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.A03 = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.A04 = PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i) {
            case -1:
            case 1:
            case 5:
                obj = bundle.getParcelable("obj");
                break;
            case 2:
            case 4:
            case 6:
                obj = bundle.getString("obj");
                break;
            case 3:
                obj = bundle.getByteArray("obj");
                break;
            default:
                Log.w("IconCompat", 002.A0O("Unknown type ", i));
                return null;
        }
        iconCompat.A06 = obj;
        return iconCompat;
    }

    public final int A04() {
        int i = this.A02;
        if (i == -1) {
            return ((Icon) this.A06).getResId();
        }
        if (i == 2) {
            return this.A00;
        }
        throw C66582MXn.A0k(this, "called getResId() on ", AnonymousClass7TE.A1A());
    }

    public final Bitmap A05() {
        Object obj;
        int i = this.A02;
        if (i == -1) {
            obj = this.A06;
            if (!(obj instanceof Bitmap)) {
                return null;
            }
        } else if (i == 1) {
            obj = this.A06;
        } else if (i == 5) {
            Bitmap bitmap = (Bitmap) this.A06;
            int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
            Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint(3);
            float f = (float) min;
            float f2 = 0.5f * f;
            float f3 = 0.9166667f * f2;
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
            paint.setColor(-16777216);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            Matrix matrix = new Matrix();
            matrix.setTranslate(((float) (-(bitmap.getWidth() - min))) / 2.0f, ((float) (-(bitmap.getHeight() - min))) / 2.0f);
            bitmapShader.setLocalMatrix(matrix);
            paint.setShader(bitmapShader);
            canvas.drawCircle(f2, f2, f3, paint);
            canvas.setBitmap((Bitmap) null);
            return createBitmap;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("called getBitmap() on ");
            sb.append(this);
            throw new IllegalStateException(sb.toString());
        }
        return (Bitmap) obj;
    }

    public final Uri A06() {
        int i = this.A02;
        if (i == -1) {
            return ((Icon) this.A06).getUri();
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.A06);
        }
        throw C66582MXn.A0k(this, "called getUri() on ", AnonymousClass7TE.A1A());
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r3 = this;
            int r1 = r3.A02
            r0 = -1
            if (r1 != r0) goto L_0x000c
            java.lang.Object r0 = r3.A06
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L_0x000c:
            java.lang.String r0 = "Icon(typ="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            switch(r1) {
                case 1: goto L_0x00a1;
                case 2: goto L_0x00a5;
                case 3: goto L_0x00a9;
                case 4: goto L_0x00ad;
                case 5: goto L_0x00b1;
                case 6: goto L_0x00b5;
                default: goto L_0x0016;
            }
        L_0x0016:
            java.lang.String r0 = "UNKNOWN"
        L_0x0018:
            r2.append(r0)
            switch(r1) {
                case 1: goto L_0x007f;
                case 2: goto L_0x005e;
                case 3: goto L_0x004a;
                case 4: goto L_0x003f;
                case 5: goto L_0x007f;
                case 6: goto L_0x003f;
                default: goto L_0x001e;
            }
        L_0x001e:
            android.content.res.ColorStateList r1 = r3.A03
            if (r1 == 0) goto L_0x002a
            java.lang.String r0 = " tint="
            r2.append(r0)
            r2.append(r1)
        L_0x002a:
            android.graphics.PorterDuff$Mode r1 = r3.A04
            android.graphics.PorterDuff$Mode r0 = A0A
            if (r1 == r0) goto L_0x0038
            java.lang.String r0 = " mode="
            r2.append(r0)
            r2.append(r1)
        L_0x0038:
            java.lang.String r0 = ")"
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r2)
            return r0
        L_0x003f:
            java.lang.String r0 = " uri="
            r2.append(r0)
            java.lang.Object r0 = r3.A06
            r2.append(r0)
            goto L_0x001e
        L_0x004a:
            java.lang.String r0 = " len="
            r2.append(r0)
            int r0 = r3.A00
            r2.append(r0)
            int r1 = r3.A01
            if (r1 == 0) goto L_0x001e
            java.lang.String r0 = " off="
            r2.append(r0)
            goto L_0x009c
        L_0x005e:
            java.lang.String r0 = " pkg="
            r2.append(r0)
            java.lang.String r0 = r3.A07
            r2.append(r0)
            java.lang.String r0 = " id="
            r2.append(r0)
            int r0 = r3.A04()
            java.lang.Object[] r1 = X.AnonymousClass7TF.A1b(r0)
            java.lang.String r0 = "0x%08x"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r2.append(r0)
            goto L_0x001e
        L_0x007f:
            java.lang.String r0 = " size="
            r2.append(r0)
            java.lang.Object r0 = r3.A06
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            int r0 = r0.getWidth()
            r2.append(r0)
            java.lang.String r0 = "x"
            r2.append(r0)
            java.lang.Object r0 = r3.A06
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            int r1 = r0.getHeight()
        L_0x009c:
            r2.append(r1)
            goto L_0x001e
        L_0x00a1:
            java.lang.String r0 = "BITMAP"
            goto L_0x0018
        L_0x00a5:
            java.lang.String r0 = "RESOURCE"
            goto L_0x0018
        L_0x00a9:
            java.lang.String r0 = "DATA"
            goto L_0x0018
        L_0x00ad:
            java.lang.String r0 = "URI"
            goto L_0x0018
        L_0x00b1:
            java.lang.String r0 = "BITMAP_MASKABLE"
            goto L_0x0018
        L_0x00b5:
            java.lang.String r0 = "URI_MASKABLE"
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.toString():java.lang.String");
    }

    public IconCompat() {
        this.A02 = -1;
        this.A09 = null;
        this.A05 = null;
        this.A00 = 0;
        this.A01 = 0;
        this.A03 = null;
        this.A04 = A0A;
        this.A08 = null;
    }

    public static IconCompat A00(Context context, int i) {
        context.getClass();
        return A01(context.getResources(), context.getPackageName(), i);
    }

    public static IconCompat A01(Resources resources, String str, int i) {
        str.getClass();
        if (i != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.A00 = i;
            if (resources != null) {
                try {
                    iconCompat.A06 = resources.getResourceName(i);
                } catch (Resources.NotFoundException unused) {
                    throw AnonymousClass7TE.A0w("Icon resource cannot be found");
                }
            } else {
                iconCompat.A06 = str;
            }
            iconCompat.A07 = str;
            return iconCompat;
        }
        throw AnonymousClass7TE.A0w("Drawable resource ID must not be 0");
    }

    public static IconCompat A02(Bitmap bitmap) {
        bitmap.getClass();
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.A06 = bitmap;
        return iconCompat;
    }

    public final InputStream A07(Context context) {
        StringBuilder sb;
        String str;
        Uri A062 = A06();
        String scheme = A062.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(A062);
            } catch (Exception e) {
                e = e;
                sb = AnonymousClass7TE.A1A();
                str = "Unable to load image from URI: ";
                Log.w("IconCompat", AnonymousClass7TG.A0m(A062, str, sb), e);
                return null;
            }
        } else {
            try {
                return new FileInputStream(AnonymousClass7TE.A0t((String) this.A06));
            } catch (FileNotFoundException e2) {
                e = e2;
                sb = AnonymousClass7TE.A1A();
                str = "Unable to load image from path: ";
                Log.w("IconCompat", AnonymousClass7TG.A0m(A062, str, sb), e);
                return null;
            }
        }
    }

    public IconCompat(int i) {
        this.A09 = null;
        this.A05 = null;
        this.A00 = 0;
        this.A01 = 0;
        this.A03 = null;
        this.A04 = A0A;
        this.A08 = null;
        this.A02 = i;
    }
}

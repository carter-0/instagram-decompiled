package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.util.Base64;
import android.widget.ImageView;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Ujc  reason: case insensitive filesystem */
public final class C15852Ujc extends IgImageView {
    public static final AnonymousClass0iw A06 = new 0xG("ig_react_image_view");
    public Uri A00;
    public float A01;
    public ImageView.ScaleType A02 = ImageView.ScaleType.CENTER_CROP;
    public boolean A03;
    public final Map A04 = new HashMap();
    public final Rect A05 = new Rect();

    public final boolean hasOverlappingRendering() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.Ujc, android.widget.ImageView, android.view.View] */
    private void setUriFromSingleSource(String str) {
        Uri uri;
        if (str != null) {
            try {
                if (str.startsWith("data:image/png;base64,")) {
                    byte[] decode = Base64.decode(str.replace("data:image/png;base64,", ""), 0);
                    setImageDrawable(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(decode, 0, decode.length)));
                    return;
                }
                Uri A032 = 0cp.A03(str);
                this.A00 = A032;
                if (A032.getScheme() == null) {
                    this.A00 = null;
                }
            } catch (Exception unused) {
            }
        }
        if (this.A00 == null) {
            Context context = getContext();
            if (str == null || str.isEmpty()) {
                uri = null;
            } else {
                uri = new Uri.Builder().scheme(Pxd.A00(76)).authority(context.getPackageName()).path(String.valueOf(SH1.A02.A00(context, str))).build();
            }
            this.A00 = uri;
        }
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [com.instagram.common.ui.widget.imageview.IgImageView, X.Ujc, android.widget.ImageView, android.view.View] */
    public final void A0H() {
        String str;
        if (this.A03) {
            Map map = this.A04;
            if (map.size() <= 1 || (getWidth() > 0 && getHeight() > 0)) {
                this.A00 = null;
                if (!map.isEmpty()) {
                    if (map.size() > 1) {
                        double width = (double) (getWidth() * getHeight());
                        Iterator A0u = AnonymousClass7TF.A0u(map);
                        double d = Double.MAX_VALUE;
                        str = null;
                        while (A0u.hasNext()) {
                            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                            double abs = Math.abs(1.0d - (JTO.A00(A1J.getValue()) / width));
                            if (abs < d) {
                                str = DbT.A13(A1J);
                                d = abs;
                            }
                        }
                    } else {
                        str = AnonymousClass7TE.A18(DbV.A16(map));
                    }
                    setUriFromSingleSource(str);
                }
                if (this.A00 != null) {
                    setScaleType(this.A02);
                    boolean equals = Pxd.A00(76).equals(this.A00.getScheme());
                    Uri uri = this.A00;
                    if (equals) {
                        setImageURI(uri);
                    } else {
                        0qQ.A0B(uri, 0);
                        setUrl(C253833rU.A00(uri, -1, -1), A06);
                    }
                    this.A03 = false;
                }
            }
        }
    }

    public void setBorderRadius(float f) {
        if (!C18099VlT.A00(this.A01, f)) {
            this.A01 = f;
            this.A03 = true;
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.common.ui.widget.imageview.IgImageView, X.Ujc, android.widget.ImageView] */
    public void setImageDrawable(Drawable drawable) {
        C240563Lj r0;
        GradientDrawable gradientDrawable = drawable;
        if (this.A01 > 0.0f) {
            if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                if (bitmap != null) {
                    r0 = new C240563Lj(bitmap, false);
                } else {
                    r0 = null;
                }
                setImageDrawable(r0);
                return;
            }
            boolean z = drawable instanceof ColorDrawable;
            gradientDrawable = drawable;
            if (z) {
                int color = ((ColorDrawable) drawable).getColor();
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setColor(color);
                gradientDrawable2.setShape(1);
                gradientDrawable = gradientDrawable2;
            }
        }
        C15852Ujc.super.setImageDrawable(gradientDrawable);
    }

    public void setScaleTypeNoUpdate(ImageView.ScaleType scaleType) {
        this.A02 = scaleType;
        this.A03 = true;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.common.ui.widget.imageview.IgImageView, X.Ujc, android.view.View, java.lang.Object] */
    public void setShouldNotifyLoadEvents(boolean z) {
        WTN wtn;
        if (!z) {
            wtn = null;
        } else {
            C20877X2e A0K = C13990Tnq.A0K(this, (Q6H) getContext());
            if (A0K != null) {
                setRequestStartListener(new WTP(A0K, this));
                wtn = new WTN(2, A0K, this);
            } else {
                return;
            }
        }
        this.A0E = wtn;
    }

    public void setSource(ReadableArray readableArray) {
        String string;
        String string2;
        Map map = this.A04;
        map.clear();
        if (!(readableArray == null || readableArray.size() == 0)) {
            if (readableArray.size() == 1) {
                ReadableMap map2 = readableArray.getMap(0);
                if (!(map2 == null || (string2 = map2.getString("uri")) == null)) {
                    map.put(string2, Double.valueOf(0.0d));
                }
            } else {
                for (int i = 0; i < readableArray.size(); i++) {
                    ReadableMap map3 = readableArray.getMap(i);
                    if (!(map3 == null || (string = map3.getString("uri")) == null)) {
                        map.put(string, Double.valueOf(map3.getDouble(IgReactMediaPickerNativeModule.WIDTH) * map3.getDouble(IgReactMediaPickerNativeModule.HEIGHT)));
                    }
                }
            }
        }
        this.A03 = true;
    }

    public C15852Ujc(Context context) {
        super(context);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Ujc, android.view.View] */
    public final void draw(Canvas canvas) {
        int A032 = AnonymousClass0fD.A03(905192558);
        Rect rect = this.A05;
        getDrawingRect(rect);
        canvas.clipRect(rect);
        C15852Ujc.super.draw(canvas);
        AnonymousClass0fD.A0A(-1623677008, A032);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.Ujc, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (r4.A04.size() > 1) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSizeChanged(int r5, int r6, int r7, int r8) {
        /*
            r4 = this;
            r0 = 426378489(0x196a04f9, float:1.2098521E-23)
            int r3 = X.AnonymousClass0fD.A06(r0)
            X.C15852Ujc.super.onSizeChanged(r5, r6, r7, r8)
            if (r5 <= 0) goto L_0x0022
            if (r6 <= 0) goto L_0x0022
            boolean r0 = r4.A03
            if (r0 != 0) goto L_0x001c
            java.util.Map r0 = r4.A04
            int r2 = r0.size()
            r1 = 1
            r0 = 0
            if (r2 <= r1) goto L_0x001d
        L_0x001c:
            r0 = 1
        L_0x001d:
            r4.A03 = r0
            r4.A0H()
        L_0x0022:
            r0 = 606502433(0x24267e21, float:3.6102347E-17)
            X.AnonymousClass0fD.A0D(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15852Ujc.onSizeChanged(int, int, int, int):void");
    }
}

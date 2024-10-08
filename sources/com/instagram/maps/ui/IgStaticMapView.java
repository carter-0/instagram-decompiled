package com.instagram.maps.ui;

import X.002;
import X.0xG;
import X.1yR;
import X.2R6;
import X.AnonymousClass0iw;
import X.AnonymousClass7TF;
import X.C13988Tno;
import X.C13989Tnp;
import X.C14654U0a;
import X.C16503Uvz;
import X.C18608Vv1;
import X.C20580Wuy;
import X.C253833rU;
import X.C66582MXn;
import X.C69419Nl1;
import X.DbU;
import X.UH1;
import X.WC3;
import X.X0K;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.android.maps.StaticMapView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.EnumSet;

public class IgStaticMapView extends FrameLayout {
    public static String A0K = "jpg";
    public static float[] A0L;
    public static final AnonymousClass0iw A0M = new 0xG("ig_static_map_view");
    public int A00;
    public int A01;
    public Drawable A02;
    public Drawable A03;
    public Drawable A04;
    public Uri A05;
    public View A06;
    public C69419Nl1 A07 = C69419Nl1.BOTTOM_RIGHT;
    public C18608Vv1 A08;
    public String A09;
    public EnumSet A0A = EnumSet.of(C16503Uvz.A00);
    public int A0B;
    public int A0C;
    public View A0D;
    public X0K A0E;
    public final Paint A0F = new Paint(2);
    public final Paint A0G = new Paint();
    public final Rect A0H = new Rect();
    public final StaticMapView.StaticMapOptions A0I = new StaticMapView.StaticMapOptions("");
    public final float[] A0J = new float[2];

    private void A03(AttributeSet attributeSet) {
        if (attributeSet != null) {
            this.A07 = C69419Nl1.A00(attributeSet.getAttributeValue("http://schemas.android.com/apk/facebook", "infoButtonPosition"));
            int attributeResourceValue = attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/facebook", "centeredMapPinDrawable", 0);
            float attributeFloatValue = attributeSet.getAttributeFloatValue("http://schemas.android.com/apk/facebook", "centeredMapPinDrawableAnchorU", 0.5f);
            float attributeFloatValue2 = attributeSet.getAttributeFloatValue("http://schemas.android.com/apk/facebook", "centeredMapPinDrawableAnchorV", 0.5f);
            if (attributeResourceValue != 0) {
                Drawable drawable = getResources().getDrawable(attributeResourceValue);
                float[] fArr = this.A0J;
                fArr[0] = attributeFloatValue;
                fArr[1] = attributeFloatValue2;
                this.A02 = drawable;
                A01();
                invalidate();
            }
        }
        setWillNotDraw(false);
        Resources resources = getResources();
        float f = resources.getDisplayMetrics().density;
        this.A0B = (int) (16.0f * f);
        int max = Math.max(1, (int) (f * 1.0f));
        this.A0C = max;
        Paint paint = this.A0G;
        paint.setStrokeWidth((float) max);
        paint.setColor(-1842984);
        Context context = getContext();
        IgImageView igImageView = new IgImageView(context);
        DbU.A12(context, igImageView, 2131965859);
        this.A0D = igImageView;
        addView(igImageView, -1, -1);
        Paint paint2 = this.A0F;
        paint2.setColor(-1);
        paint2.setAlpha(178);
        float f2 = resources.getDisplayMetrics().density;
        this.A06 = new View(context);
        C14654U0a u0a = new C14654U0a(this);
        this.A03 = u0a;
        this.A06.setBackground(u0a);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int i = (int) (f2 * 8.0f);
        layoutParams.setMargins(0, 0, i, i);
        layoutParams.gravity = 85;
        this.A06.setLayoutParams(layoutParams);
        WC3.A00(this.A06, 1, this);
        View view = this.A06;
        this.A06 = view;
        addView(view);
        if (isEnabled()) {
            this.A06.setVisibility(0);
        }
    }

    private void A01() {
        Drawable drawable = this.A02;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = this.A02.getIntrinsicHeight();
            float[] fArr = this.A0J;
            int paddingLeft = (getPaddingLeft() + (C66582MXn.A04(this, getWidth()) / 2)) - ((int) (((float) intrinsicWidth) * fArr[0]));
            int paddingTop = (getPaddingTop() + (C13989Tnp.A0I(this, getHeight()) / 2)) - ((int) (((float) intrinsicHeight) * fArr[1]));
            this.A02.setBounds(paddingLeft, paddingTop, intrinsicWidth + paddingLeft, intrinsicHeight + paddingTop);
        }
    }

    private void A02() {
        String queryParameter;
        if (this.A01 != 0 && this.A00 != 0) {
            StaticMapView.StaticMapOptions staticMapOptions = this.A0I;
            if (((staticMapOptions.A0B != null && staticMapOptions.A02 != null) || staticMapOptions.A03 != null || staticMapOptions.A0A != null || staticMapOptions.A06 != null || !staticMapOptions.A0C.isEmpty() || staticMapOptions.A07 != null) && this.A0D.getVisibility() == 0) {
                float f = staticMapOptions.A00;
                float f2 = staticMapOptions.A01;
                Uri A002 = A00(getResources(), staticMapOptions, 2R6.A03, (int) (f * ((float) this.A01)), (int) (f2 * ((float) this.A00)));
                if (!A002.equals(this.A05)) {
                    this.A05 = A002;
                    if (this.A09 == null && (queryParameter = A002.getQueryParameter("v")) != null) {
                        this.A09 = queryParameter;
                    }
                    1yR r1 = 1yR.A0Q;
                    if (1yR.A07 != null) {
                        r1.A05(new C20580Wuy(this));
                    }
                    this.A0D.setUrl(C253833rU.A00(A002, -1, -1), A0M);
                }
            }
        }
    }

    public static Uri getStaticMapBaseUrl() {
        2R6.A01(2R6.A05);
        return Uri.parse(2R6.A0B.A03);
    }

    public float[] getAnchors() {
        return this.A0J;
    }

    public Drawable getCenteredMapPinDrawable() {
        return this.A02;
    }

    public String getLanguageCode() {
        return 2R6.A03;
    }

    public X0K getMapLoadCallback() {
        return null;
    }

    public StaticMapView.StaticMapOptions getStaticMapOptions() {
        return this.A0I;
    }

    public final boolean isEnabled() {
        return AnonymousClass7TF.A1Q(this.A0D.getVisibility());
    }

    public void setCenteredMapPinDrawable(Drawable drawable) {
        float[] fArr = this.A0J;
        fArr[0] = 0.5f;
        fArr[1] = 0.5f;
        this.A02 = drawable;
        A01();
        invalidate();
    }

    public void setEnabled(boolean z) {
        View view = this.A0D;
        if (z) {
            view.setVisibility(0);
            this.A06.setVisibility(0);
            A02();
            return;
        }
        view.setVisibility(8);
        this.A06.setVisibility(8);
    }

    public void setImageFormat(String str) {
        A0K = str;
    }

    public void setInfoButtonPosition(C69419Nl1 nl1) {
        this.A07 = nl1;
    }

    public void setMapLoadCallback(X0K x0k) {
        this.A0E = x0k;
    }

    public final void setMapOptions(StaticMapView.StaticMapOptions staticMapOptions) {
        StaticMapView.StaticMapOptions staticMapOptions2 = this.A0I;
        if (!staticMapOptions2.equals(staticMapOptions)) {
            staticMapOptions2.A04 = staticMapOptions.A04;
            staticMapOptions2.A08 = staticMapOptions.A08;
            staticMapOptions2.A0B = staticMapOptions.A0B;
            staticMapOptions2.A02 = staticMapOptions.A02;
            staticMapOptions2.A0A = staticMapOptions.A0A;
            staticMapOptions2.A03 = staticMapOptions.A03;
            staticMapOptions2.A05 = staticMapOptions.A05;
            staticMapOptions2.A06 = staticMapOptions.A06;
            staticMapOptions2.A07 = staticMapOptions.A07;
            staticMapOptions2.A00 = staticMapOptions.A00;
            staticMapOptions2.A01 = staticMapOptions.A01;
            staticMapOptions2.A0C = staticMapOptions.A0C;
            staticMapOptions2.A09 = staticMapOptions.A09;
            A02();
        }
    }

    public void setMapReporterLauncher(C18608Vv1 vv1) {
        this.A08 = vv1;
    }

    public IgStaticMapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A03(attributeSet);
        this.A08 = new UH1(getContext());
    }

    public static Uri A00(Resources resources, StaticMapView.StaticMapOptions staticMapOptions, String str, int i, int i2) {
        int i3;
        int i4 = 2;
        if (resources.getDisplayMetrics().density < 1.5f) {
            i4 = 1;
        }
        float f = resources.getDisplayMetrics().density;
        if (f < 1.5f) {
            i3 = 1;
        } else {
            i3 = 3;
            if (f < 2.5f) {
                i3 = 2;
            }
        }
        2R6.A01(2R6.A05);
        Uri.Builder appendQueryParameter = Uri.parse(2R6.A0B.A03).buildUpon().appendQueryParameter("size", 002.A0P("x", i / i4, i2 / i4)).appendQueryParameter("scale", String.valueOf(i4)).appendQueryParameter("marker_scale", String.valueOf(i3)).appendQueryParameter("language", str);
        String str2 = staticMapOptions.A05;
        if (str2 == null) {
            str2 = A0K;
        }
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("format", str2);
        String str3 = staticMapOptions.A0A;
        if (str3 != null) {
            appendQueryParameter2.appendQueryParameter("visible", str3);
        }
        String str4 = staticMapOptions.A03;
        if (str4 != null) {
            appendQueryParameter2.appendQueryParameter("circle", str4);
        }
        String str5 = staticMapOptions.A06;
        if (str5 != null) {
            appendQueryParameter2.appendQueryParameter("markers", str5);
        }
        String str6 = staticMapOptions.A07;
        if (str6 != null) {
            appendQueryParameter2.appendQueryParameter("path", str6);
        }
        String str7 = staticMapOptions.A02;
        if (str7 != null) {
            appendQueryParameter2.appendQueryParameter("center", str7);
        }
        String str8 = staticMapOptions.A0B;
        if (str8 != null) {
            appendQueryParameter2.appendQueryParameter("zoom", str8);
        }
        int size = staticMapOptions.A0C.size();
        for (int i5 = 0; i5 < size; i5++) {
            String A0c = 002.A0c("marker_list[", "]", i5);
            String str9 = (String) staticMapOptions.A0C.get(i5);
            if (str9 != null) {
                appendQueryParameter2.appendQueryParameter(A0c, str9);
            }
        }
        String str10 = staticMapOptions.A09;
        if (str10 != null) {
            appendQueryParameter2.appendQueryParameter("theme", str10);
        }
        String str11 = staticMapOptions.A04;
        if (str11 == null) {
            str11 = "StaticMapView.java";
        }
        if (str11 != null) {
            appendQueryParameter2.appendQueryParameter("_nc_client_caller", str11);
        }
        String str12 = staticMapOptions.A08;
        if (str12 != null) {
            appendQueryParameter2.appendQueryParameter("_nc_client_id", str12);
        }
        return appendQueryParameter2.build();
    }

    public final void dispatchDraw(Canvas canvas) {
        Drawable drawable;
        super.dispatchDraw(canvas);
        if (this.A0D.getVisibility() == 0 && (drawable = this.A02) != null) {
            drawable.draw(canvas);
        }
    }

    public Drawable getInfoGlyph() {
        return getContext().getDrawable(R.drawable.instagram_info_filled_16);
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A0D.getVisibility() == 0) {
            int save = canvas.save();
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int A0G2 = C13989Tnp.A0G(this);
            int A0F2 = C13989Tnp.A0F(this);
            canvas.clipRect(paddingLeft, paddingTop, A0G2, A0F2);
            canvas.drawColor(-987675);
            int i = A0G2 - paddingLeft;
            int i2 = A0F2 - paddingTop;
            canvas.translate((float) paddingLeft, (float) paddingTop);
            int i3 = this.A0B;
            int i4 = ((((i + i3) - 1) / i3) + (((i2 + i3) - 1) / i3)) << 2;
            float[] fArr = A0L;
            if (fArr == null || fArr.length < i4) {
                fArr = new float[i4];
                A0L = fArr;
            }
            int i5 = i3 - ((this.A0C + 1) / 2);
            int i6 = 0;
            for (int i7 = i5; i7 < i; i7 += i3) {
                int i8 = i6 + 1;
                float f = (float) i7;
                fArr[i6] = f;
                int i9 = i8 + 1;
                fArr[i8] = 0.0f;
                int i10 = i9 + 1;
                fArr[i9] = f;
                i6 = i10 + 1;
                fArr[i10] = (float) i2;
            }
            while (i5 < i2) {
                int i11 = i6 + 1;
                fArr[i6] = 0.0f;
                int i12 = i11 + 1;
                float f2 = (float) i5;
                fArr[i11] = f2;
                int i13 = i12 + 1;
                fArr[i12] = (float) i;
                i6 = i13 + 1;
                fArr[i13] = f2;
                i5 += i3;
            }
            canvas.drawLines(fArr, 0, i6, this.A0G);
            canvas.restoreToCount(save);
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int width;
        super.onLayout(z, i, i2, i3, i4);
        int i8 = this.A01;
        int i9 = this.A00;
        this.A01 = this.A0D.getWidth();
        this.A00 = this.A0D.getHeight();
        Drawable drawable = this.A04;
        if (drawable == null) {
            drawable = getInfoGlyph();
            this.A04 = drawable;
        }
        Rect rect = this.A0H;
        if (drawable != null) {
            i5 = drawable.getIntrinsicWidth();
        } else {
            i5 = 0;
        }
        Drawable drawable2 = this.A04;
        if (drawable2 != null) {
            i6 = drawable2.getIntrinsicHeight();
        } else {
            i6 = 0;
        }
        rect.set(0, 0, i5, i6);
        int i10 = (int) (C13988Tno.A0F(this).density * 8.0f);
        int ordinal = this.A07.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                width = (this.A01 - rect.width()) - i10;
            } else if (ordinal != 2) {
                width = (this.A01 - rect.width()) - i10;
                i10 = (this.A00 - rect.height()) - i10;
            } else {
                i7 = (this.A00 - rect.height()) - i10;
            }
            i7 = i10;
            i10 = width;
        } else {
            i7 = i10;
        }
        rect.offsetTo(i10, i7);
        if (!(i8 == this.A01 && i9 == this.A00)) {
            A02();
        }
        A01();
    }

    public void setImageDrawable(Drawable drawable, ImageView imageView) {
        imageView.setImageDrawable(drawable);
    }

    public IgStaticMapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A03(attributeSet);
        this.A08 = new UH1(getContext());
    }

    public IgStaticMapView(Context context) {
        super(context);
        A03((AttributeSet) null);
        this.A08 = new UH1(getContext());
    }
}

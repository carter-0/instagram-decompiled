package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.facebook.litho.annotations.Comparable;
import com.facebook.litho.annotations.Prop;

/* renamed from: X.3gH  reason: invalid class name and case insensitive filesystem */
public final class C247403gH extends C251253mo {
    @Prop(optional = false, resType = C54606HKp.A06)
    @Comparable(type = 13)
    public Drawable A00;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 13)
    public ImageView.ScaleType A01;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 3)
    public boolean A02 = true;

    public final boolean A0N() {
        return true;
    }

    public final boolean A16() {
        return true;
    }

    public final boolean AFh() {
        return true;
    }

    public final int E2z() {
        return 30;
    }

    public C247403gH() {
        super("ImageComponent");
    }

    public final Integer A0G() {
        return AnonymousClass05K.A01;
    }

    public final Object A0H(Context context) {
        ImageView.ScaleType[] scaleTypeArr = C247473gO.A00;
        return new Drawable();
    }

    public final boolean A0T(C251263mp r8, C251263mp r9, 2TB r10, 2TB r11) {
        ImageView.ScaleType scaleType;
        ImageView.ScaleType scaleType2;
        Drawable drawable;
        Drawable drawable2;
        Boolean valueOf;
        C247403gH r82 = (C247403gH) r8;
        C247403gH r92 = (C247403gH) r9;
        Boolean bool = null;
        if (r82 == null) {
            scaleType = null;
        } else {
            scaleType = r82.A01;
        }
        if (r92 == null) {
            scaleType2 = null;
        } else {
            scaleType2 = r92.A01;
        }
        if (r82 == null) {
            drawable = null;
        } else {
            drawable = r82.A00;
        }
        if (r92 == null) {
            drawable2 = null;
        } else {
            drawable2 = r92.A00;
        }
        if (r82 == null) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(r82.A02);
        }
        if (r92 != null) {
            bool = Boolean.valueOf(r92.A02);
        }
        ImageView.ScaleType[] scaleTypeArr = C247473gO.A00;
        if (scaleType2 == scaleType && C278954xn.A00(drawable2, drawable) && bool == valueOf) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.2Tq, java.lang.Object] */
    public final /* bridge */ /* synthetic */ C70672Tq A0d() {
        return new Object();
    }

    public final void A0r(2V1 r7, C70672Tq r8, 2Tc r9) {
        AnonymousClass2VX r2;
        Integer valueOf;
        int A002;
        Drawable drawable = this.A00;
        ImageView.ScaleType scaleType = this.A01;
        ImageView.ScaleType[] scaleTypeArr = C247473gO.A00;
        int A022 = r9.A02() + r9.A03();
        int A04 = r9.A04() + r9.A01();
        if (ImageView.ScaleType.FIT_XY == scaleType || drawable == null || drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            r2 = null;
            valueOf = Integer.valueOf(r9.A05() - A022);
            A002 = r9.A00() - A04;
        } else {
            r2 = AnonymousClass2VX.A01.A00(drawable, scaleType, r9.A05() - A022, r9.A00() - A04);
            valueOf = Integer.valueOf(drawable.getIntrinsicWidth());
            A002 = drawable.getIntrinsicHeight();
        }
        Integer valueOf2 = Integer.valueOf(A002);
        C247463gN r82 = (C247463gN) r8;
        r82.A00 = r2;
        r82.A02 = valueOf;
        r82.A01 = valueOf2;
    }

    public final void A0s(2V1 r4, C70672Tq r5, Object obj) {
        C247463gN r52 = (C247463gN) r5;
        Integer num = r52.A02;
        Integer num2 = r52.A01;
        ImageView.ScaleType[] scaleTypeArr = C247473gO.A00;
        ((2Ul) obj).A02(num.intValue(), num2.intValue());
    }

    public final /* bridge */ /* synthetic */ C251263mp A0E() {
        return super.A0E();
    }
}

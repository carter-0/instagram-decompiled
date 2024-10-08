package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import com.instagram.android.R;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.user.model.Product;

/* renamed from: X.8uu  reason: invalid class name and case insensitive filesystem */
public abstract class C369528uu extends Drawable implements C300645xY {
    public int A01() {
        if (this instanceof C389739q7) {
            return ((C389739q7) this).A04.A02;
        }
        return 0;
    }

    public Product A02() {
        Product product;
        if (this instanceof C389739q7) {
            product = ((C389739q7) this).A01;
        } else {
            product = ((C389729q6) this).A05;
        }
        if (product != null) {
            return product;
        }
        0qQ.A0F("_product");
        throw AnonymousClass00P.createAndThrow();
    }

    public String A03() {
        if (this instanceof C389739q7) {
            return ((C389739q7) this).A05;
        }
        return ((C389729q6) this).A0F;
    }

    public String A04() {
        if (this instanceof C389739q7) {
            String str = ((C389739q7) this).A04.A0E;
            if (str == null) {
                return "";
            }
            return str;
        }
        Product product = ((C389729q6) this).A05;
        if (product != null) {
            return product.A0J;
        }
        0qQ.A0F("_product");
        throw AnonymousClass00P.createAndThrow();
    }

    public void A05(Product product, String str, int i, boolean z) {
        ExtendedImageUrl extendedImageUrl;
        String str2;
        if (this instanceof C389739q7) {
            C389739q7 r2 = (C389739q7) this;
            r2.A01 = product;
            r2.A03 = z;
            String str3 = product.A0J;
            if (str != null) {
                str2 = str.toUpperCase(AnonymousClass1Q2.A02());
                0qQ.A07(str2);
            } else {
                if (str3 != null) {
                    str2 = str3.toUpperCase(AnonymousClass1Q2.A02());
                    0qQ.A07(str2);
                } else {
                    str2 = null;
                }
                0qQ.A0A(str2);
            }
            r2.A04.A05(str2, i);
            return;
        }
        C389729q6 r4 = (C389729q6) this;
        r4.A05 = product;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(product.A0J);
        C306386Ly r5 = r4.A04;
        if (product.A04()) {
            SpannableStringBuilder append = new SpannableStringBuilder().append(W2t.A01(r4.A0B, r4.A0C.getDimensionPixelSize(R.dimen.abc_control_corner_material)));
            SpannableStringBuilder append2 = spannableStringBuilder.append(append);
            if (r5.A08().A00(append2).getLineCount() <= 1) {
                0qQ.A0A(append2);
            } else {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                StaticLayout A00 = r5.A08().A00(spannableStringBuilder2);
                0qQ.A07(A00);
                append2 = new SpannableStringBuilder(spannableStringBuilder2.subSequence(0, (A00.getLineEnd(0) - "…".length()) - append.length())).append("…").append(append);
                0qQ.A07(append2);
            }
            spannableStringBuilder = append2;
        }
        r5.A0L(spannableStringBuilder);
        C306386Ly r6 = r4.A03;
        String str4 = product.A0L;
        if (str4 == null) {
            str4 = "";
        }
        r6.A0M(str4);
        int i2 = r4.A07;
        int i3 = r4.A09;
        r4.A00 = i2 + i3 + r5.A06 + r4.A08 + r6.A06 + i3;
        ImageInfo imageInfo = product.A08;
        if (imageInfo != null) {
            extendedImageUrl = 1iI.A03(imageInfo);
        } else {
            extendedImageUrl = null;
        }
        if (C253833rU.A02(extendedImageUrl)) {
            Context context = r4.A0B;
            r4.A01 = context.getColor(2Yu.A04(context));
            Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
            0qQ.A07(createBitmap);
            C389729q6.A00(createBitmap, r4);
        } else if (extendedImageUrl != null) {
            1OO A0J = 1NK.A00().A0J(extendedImageUrl, (String) null);
            A0J.A02(r4);
            A0J.A01();
        }
        r4.invalidateSelf();
    }

    public boolean A06() {
        if (this instanceof C389739q7) {
            return ((C389739q7) this).A03;
        }
        return false;
    }
}

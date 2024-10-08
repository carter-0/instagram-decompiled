package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.api.schemas.ProductReviewStatus;
import com.instagram.api.schemas.ProductVariantPossibleValueDictIntf;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Vuo  reason: case insensitive filesystem */
public final class C18597Vuo {
    public static C14682U1d A00;
    public static final C18597Vuo A01 = new Object();

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    public final void A00(AnonymousClass0iw r8, C63665L2b l2b, X81 x81, C17649Vbf vbf, Product product) {
        C14682U1d u1d;
        Object A012;
        View view;
        int i;
        String str;
        0qQ.A0B(r8, 0);
        C51974G9v.A1P(vbf, product, l2b, x81);
        View view2 = vbf.A00;
        Context context = view2.getContext();
        WBE.A00(view2, 25, x81, product);
        ImageInfo imageInfo = product.A07;
        if (imageInfo != null) {
            0qQ.A0A(context);
            ExtendedImageUrl A013 = 1iI.A01(context, imageInfo);
            if (A013 != null) {
                vbf.A05.setUrl(A013, r8);
            }
        }
        ? r1 = vbf.A05;
        if (!product.A04() || product.A0P) {
            u1d = null;
        } else {
            JTQ.A1K(context);
            u1d = A00;
            if (u1d == null) {
                u1d = new C14682U1d(context);
                A00 = u1d;
            }
        }
        r1.setForeground(u1d);
        vbf.A03.setText(product.A0J);
        boolean EtC = x81.EtC(product);
        TextView textView = vbf.A02;
        if (EtC) {
            User user = product.A0B;
            if (user != null) {
                str = user.getUsername();
            } else {
                str = "";
            }
            textView.setText(C324476zN.A09(context, str, Integer.valueOf(R.style.FullPriceSubtitleStyle)));
        } else {
            0qQ.A0A(context);
            ArrayList arrayList = new ArrayList();
            if (!product.A0P && product.A04()) {
                arrayList.add(context.getResources().getString(2131969827));
            }
            0qQ.A0B(context, 1);
            if (product.A05 == ProductReviewStatus.APPROVED) {
                A012 = C324476zN.A08(context, product, (Integer) null, (Integer) null);
            } else {
                A012 = C324476zN.A01(context, product, R.style.PendingReviewSubtitleStyle, R.style.AuthErrorTextAppearance);
            }
            arrayList.add(A012);
            List<ProductVariantPossibleValueDictIntf> list = product.A0O;
            if (list != null) {
                for (ProductVariantPossibleValueDictIntf productVariantPossibleValueDictIntf : list) {
                    if (productVariantPossibleValueDictIntf.getValue().length() > 0) {
                        arrayList.add(productVariantPossibleValueDictIntf.getValue());
                    }
                }
            }
            String str2 = product.A0M;
            if (str2 != null) {
                arrayList.add(002.A0R("SKU ", str2));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                spannableStringBuilder.append((CharSequence) it.next());
                if (it.hasNext()) {
                    spannableStringBuilder.append(" ");
                    spannableStringBuilder.append("·");
                    spannableStringBuilder.append(" ");
                }
            }
            textView.setText(spannableStringBuilder);
            textView.getViewTreeObserver().addOnPreDrawListener(new WCE(vbf, 8));
        }
        int intValue = l2b.A00.intValue();
        if (intValue == 0) {
            view = vbf.A04;
            view.setVisibility(0);
            i = 23;
        } else if (intValue != 1) {
            view2.removeCallbacks(vbf.A06);
            view2.setTouchDelegate((TouchDelegate) null);
            vbf.A01.setVisibility(8);
            vbf.A04.setVisibility(8);
            return;
        } else {
            view2.post(vbf.A06);
            view = vbf.A01;
            view.setVisibility(0);
            i = 24;
        }
        WBE.A00(view, i, x81, product);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r1.equals(r0.A0A) == false) goto L_0x0021;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(com.instagram.common.ui.widget.imageview.RoundedCornerImageView r3, com.instagram.user.model.Product r4) {
        /*
            r2 = this;
            r0 = 0
            X.0qQ.A0B(r3, r0)
            r1 = 1
            boolean r0 = r4.A04()
            if (r0 == 0) goto L_0x0034
            boolean r0 = r4.A0P
            if (r0 != 0) goto L_0x0034
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r4.A01
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r0 = r0.A0C
            if (r0 == 0) goto L_0x0021
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Boolean r0 = r0.A0A
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0034
        L_0x0021:
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r3)
            X.U1d r0 = A00
            if (r0 != 0) goto L_0x0030
            X.U1d r0 = new X.U1d
            r0.<init>(r1)
            A00 = r0
        L_0x0030:
            r3.setForeground(r0)
            return
        L_0x0034:
            r0 = 0
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18597Vuo.A01(com.instagram.common.ui.widget.imageview.RoundedCornerImageView, com.instagram.user.model.Product):void");
    }
}

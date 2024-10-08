package X;

import android.graphics.Typeface;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.ImageUrlBase;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.user.model.Product;
import java.util.List;

/* renamed from: X.Gu1  reason: case insensitive filesystem */
public final class C53772Gu1 extends C251343mx {
    public final List A00;
    public final 0sP A01;
    public final 0sP A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;

    public final C251263mp A0X(AnonymousClass3Y5 r42) {
        int min;
        Product product;
        ImageInfo BGO;
        List Al9;
        ImageUrl imageUrl;
        ImageInfo BGO2;
        List Al92;
        ImageUrl imageUrl2;
        AnonymousClass3Y5 r13 = r42;
        0qQ.A0B(r13, 0);
        List list = this.A00;
        if (list == null || list.isEmpty()) {
            return null;
        }
        long A0B = C244013aV.A0B(r13);
        long A0C = C244013aV.A0C(r13, R.dimen.ab_test_media_thumbnail_preview_item_width);
        long A0C2 = C244013aV.A0C(r13, R.dimen.ad_not_delivering_thumbnail_height);
        long A0A = C244013aV.A0A(r13);
        long A0A2 = C244013aV.A0A(r13);
        int A08 = C51969G9p.A08(r13, R.color.fundraiser_search_background_tint_color);
        2V1 r7 = r13.A05;
        int A09 = C51972G9s.A09(r7.A0C, r13);
        String A002 = 002.A00('+', list.size() - 2);
        boolean A1W = C51970G9q.A1W(list.size(), 3);
        if (A1W) {
            min = 2;
        } else {
            min = Math.min(list.size(), 3);
        }
        List<Product> A0i = 00k.A0i(list, C229632nm.A0C(0, min));
        if (A1W) {
            product = (Product) 00k.A0O(list, 2);
        } else {
            product = null;
        }
        AnonymousClass3XV r2 = 2WX.A02;
        C243573Zh r21 = C243573Zh.CENTER;
        Integer num = AnonymousClass05K.A00;
        2WX A003 = AnonymousClass9JR.A00(G9t.A0y(G9t.A12(num, r21, 3), num, 0), AnonymousClass05K.A04, 0, A0B);
        2Wb A0S = AnonymousClass7TG.A0S(r7);
        for (Product product2 : A0i) {
            ProductImageContainer productImageContainer = product2.A09;
            if (productImageContainer == null || (BGO2 = productImageContainer.BGO()) == null || (Al92 = BGO2.Al9()) == null || (imageUrl2 = (ImageUrlBase) 00k.A0J(Al92)) == null) {
                return null;
            }
            A0S.A00(new C53984GxS(ImageView.ScaleType.CENTER_CROP, C51973G9u.A0Z(AnonymousClass9JR.A00(AnonymousClass9JR.A00(AnonymousClass9JR.A00(C51971G9r.A0X(C51971G9r.A0X((2WX) null, AnonymousClass05K.A01, 1.0f, 1), AnonymousClass05K.A0Y, 1.0f, 1), AnonymousClass05K.A0N, 0, A0C), AnonymousClass05K.A0C, 0, A0C2), AnonymousClass05K.A0G, 0, A0A2), new J6T(9, (Object) product2, (Object) this)), this.A03, imageUrl2, (float) C51968G9o.A09(A0S, A0A), C51973G9u.A06(A0S), -16777216, false, false));
        }
        if (product != null) {
            ProductImageContainer productImageContainer2 = product.A09;
            if (productImageContainer2 == null || (BGO = productImageContainer2.BGO()) == null || (Al9 = BGO.Al9()) == null || (imageUrl = (ImageUrlBase) 00k.A0J(Al9)) == null) {
                return null;
            }
            Integer num2 = AnonymousClass05K.A01;
            2WX A0X = C51971G9r.A0X((2WX) null, num2, 1.0f, 1);
            Integer num3 = AnonymousClass05K.A0Y;
            2WX A0Z = C51973G9u.A0Z(AnonymousClass9JR.A00(AnonymousClass9JR.A00(AnonymousClass9JR.A00(C51971G9r.A0X(A0X, num3, 1.0f, 1), AnonymousClass05K.A0N, 0, A0C), AnonymousClass05K.A0C, 0, A0C2), AnonymousClass05K.A0G, 0, A0A2), new MP8(this, 0));
            2Wb A0w = G9t.A0w(A0S);
            2WX A0O = C51974G9v.A0O((2WX) null, num2, num, 100.0f, 0);
            C244413b9 r6 = C244413b9.ABSOLUTE;
            AnonymousClass0iw r1 = this.A03;
            A0w.A00(new C53984GxS(ImageView.ScaleType.CENTER_CROP, C51971G9r.A0Y(A0O, num3, r6, 3), r1, imageUrl, (float) C51968G9o.A09(A0w, A0A), C51973G9u.A06(A0w), -16777216, false, false));
            A0w.A00(new C53968GxC(C51971G9r.A0Y(C51974G9v.A0O((2WX) null, num2, num, 100.0f, 0), num3, r6, 3), (float) C51968G9o.A09(A0w, A0A), A08));
            2WX A0Y = C51971G9r.A0Y((2WX) null, num, r21, 3);
            long A0G = C51972G9s.A0G(14.0f);
            Typeface typeface = Typeface.DEFAULT;
            long A0D = C51969G9p.A0D();
            C244103ae A0b = C51971G9r.A0b(A0w.A00, (2V5) null, A002, 0);
            C51973G9u.A17(A0w, A0b, A09, A0G);
            A0b.A0R(0);
            G9w.A12(typeface, A0w, A0b, A0D);
            A0b.A0W(num);
            C51974G9v.A14(A0b, num, 1.0f, false, true);
            G9t.A1M(A0w, A0Y, A0b);
            A0S.A00(C243563Zg.A04(A0w, A0S, A0Z));
        }
        return C243563Zg.A0F(A0S, r13, A003);
    }

    public C53772Gu1(AnonymousClass0iw r2, UserSession userSession, List list, 0sP r5, 0sP r6) {
        C51974G9v.A1M(r2, userSession, r5);
        0qQ.A0B(r6, 5);
        this.A00 = list;
        this.A03 = r2;
        this.A04 = userSession;
        this.A02 = r5;
        this.A01 = r6;
    }
}

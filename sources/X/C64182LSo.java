package X;

import android.content.Intent;
import com.instagram.model.shopping.productintfs.TaggingFeedSessionInformation;
import com.instagram.shopping.intf.productpicker.MultiProductPickerResult;
import com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.LSo  reason: case insensitive filesystem */
public final class C64182LSo {
    public static final TaggingFeedMultiSelectState A00(Intent intent) {
        MultiProductPickerResult multiProductPickerResult = (MultiProductPickerResult) intent.getParcelableExtra(AnonymousClass000.A00(83));
        if (multiProductPickerResult == null) {
            return null;
        }
        List list = multiProductPickerResult.A02;
        Map map = multiProductPickerResult.A03;
        return new TaggingFeedMultiSelectState(multiProductPickerResult.A00, multiProductPickerResult.A01, list, map);
    }

    public static final ArrayList A01(C61062Jw0 jw0, String str) {
        List<BBU> list;
        TaggingFeedSessionInformation taggingFeedSessionInformation;
        if (jw0 != null) {
            list = (List) jw0.A01;
        } else {
            list = null;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (list != null) {
            for (BBU bbu : list) {
                String str2 = bbu.A06;
                if (str == null || str2 == null) {
                    taggingFeedSessionInformation = null;
                } else {
                    taggingFeedSessionInformation = new TaggingFeedSessionInformation(str, str2);
                }
                ProductDetailsProductItemDict productDetailsProductItemDict = (ProductDetailsProductItemDict) bbu.A00;
                if (productDetailsProductItemDict != null) {
                    A1C.add(new Product(taggingFeedSessionInformation, productDetailsProductItemDict));
                }
            }
        }
        return A1C;
    }

    public final C61062Jw0 A04(Intent intent, String str) {
        String str2 = null;
        MultiProductPickerResult multiProductPickerResult = (MultiProductPickerResult) intent.getParcelableExtra(AnonymousClass000.A00(83));
        if (multiProductPickerResult == null) {
            return null;
        }
        ProductCollection productCollection = multiProductPickerResult.A01;
        List list = multiProductPickerResult.A02;
        if (productCollection != null) {
            str2 = productCollection.Aoi();
        }
        return LSG.A00(productCollection, str2, str, list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0048, code lost:
        if (r2 == null) goto L_0x0032;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A02(X.C15035UKo r6, com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState r7) {
        /*
            com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta r0 = r7.A00
            r1 = 0
            if (r0 == 0) goto L_0x004b
            java.lang.String r5 = r0.A01
        L_0x0007:
            java.util.Map r0 = r7.A04
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            r4 = 0
            if (r0 == 0) goto L_0x0041
            if (r5 == 0) goto L_0x0041
            if (r6 == 0) goto L_0x0042
            X.JwC r2 = r6.A02
            if (r2 == 0) goto L_0x0043
            java.lang.Object r0 = r2.A01
            X.JV7 r0 = (X.JV7) r0
            if (r0 == 0) goto L_0x0043
            java.lang.String r3 = r0.A02
        L_0x0022:
            java.lang.Object r2 = r2.A00
            X.Jw2 r2 = (X.C61064Jw2) r2
            if (r2 == 0) goto L_0x0047
            java.lang.Object r0 = r2.A00
            com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta r0 = (com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta) r0
            if (r0 == 0) goto L_0x0047
            java.lang.String r0 = r0.A01
        L_0x0030:
            java.lang.String r1 = r2.A02
        L_0x0032:
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0041
            boolean r0 = r5.equals(r1)
            if (r0 != 0) goto L_0x0041
            if (r3 != 0) goto L_0x0041
            r4 = 1
        L_0x0041:
            return r4
        L_0x0042:
            r2 = r1
        L_0x0043:
            r3 = r1
            if (r2 != 0) goto L_0x0022
            r2 = r1
        L_0x0047:
            r0 = r1
            if (r2 == 0) goto L_0x0032
            goto L_0x0030
        L_0x004b:
            r5 = r1
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64182LSo.A02(X.UKo, com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0043, code lost:
        if (r2 != com.instagram.api.schemas.ProductCollectionV2Type.DISCOUNT) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0052, code lost:
        if (r3 == null) goto L_0x0055;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0032 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A03(X.C15035UKo r5, com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState r6) {
        /*
            com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta r0 = r6.A00
            r2 = 0
            if (r0 == 0) goto L_0x0057
            java.lang.String r1 = r0.A01
        L_0x0007:
            java.util.Map r0 = r6.A04
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            r4 = 0
            if (r0 == 0) goto L_0x004f
            if (r1 != 0) goto L_0x004f
            if (r5 == 0) goto L_0x0050
            X.JwC r3 = r5.A02
            if (r3 == 0) goto L_0x0051
            java.lang.Object r0 = r3.A01
            X.JV7 r0 = (X.JV7) r0
            if (r0 == 0) goto L_0x0051
            java.lang.String r1 = r0.A02
        L_0x0022:
            java.lang.Object r0 = r3.A00
            X.Jw2 r0 = (X.C61064Jw2) r0
            if (r0 == 0) goto L_0x0055
            java.lang.Object r0 = r0.A00
            com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta r0 = (com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta) r0
            if (r0 == 0) goto L_0x0055
            java.lang.String r3 = r0.A01
        L_0x0030:
            if (r1 != 0) goto L_0x0045
            if (r5 == 0) goto L_0x0040
            X.JwL r0 = r5.A00
            if (r0 == 0) goto L_0x0040
            java.lang.Object r0 = r0.A00
            com.instagram.user.model.ProductCollectionImpl r0 = (com.instagram.user.model.ProductCollectionImpl) r0
            if (r0 == 0) goto L_0x0040
            com.instagram.api.schemas.ProductCollectionV2Type r2 = r0.A00
        L_0x0040:
            com.instagram.api.schemas.ProductCollectionV2Type r0 = com.instagram.api.schemas.ProductCollectionV2Type.DISCOUNT
            r1 = 1
            if (r2 == r0) goto L_0x0046
        L_0x0045:
            r1 = 0
        L_0x0046:
            boolean r0 = X.AnonymousClass7TF.A1V(r3)
            if (r1 != 0) goto L_0x004e
            if (r0 == 0) goto L_0x004f
        L_0x004e:
            r4 = 1
        L_0x004f:
            return r4
        L_0x0050:
            r3 = r2
        L_0x0051:
            r1 = r2
            if (r3 == 0) goto L_0x0055
            goto L_0x0022
        L_0x0055:
            r3 = r2
            goto L_0x0030
        L_0x0057:
            r1 = r2
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64182LSo.A03(X.UKo, com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState):boolean");
    }
}

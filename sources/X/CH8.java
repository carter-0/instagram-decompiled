package X;

import com.google.common.collect.ImmutableList;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class CH8 extends 1P0 {
    public final int A00;
    public final Object A01;

    public CH8(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onFail(C268654dm r4) {
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A03(-158578239);
                ((C70605ODc) this.A01).A02.invoke(0sn.A00);
                i2 = -1546151620;
                break;
            case 1:
                i = AnonymousClass0fD.A03(-1070224076);
                ((C70606ODd) this.A01).A02.invoke(0sn.A00);
                i2 = -1191568372;
                break;
            case 2:
                i = AnonymousClass7TG.A0D(r4, 58167610);
                CH8.super.onFail(r4);
                i2 = -278486241;
                break;
            default:
                CH8.super.onFail(r4);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        ArrayList arrayList;
        int i;
        C250663lr optionalTreeField;
        ImmutableList requiredCompactedTreeListField;
        ArrayList arrayList2;
        C250663lr optionalTreeField2;
        ImmutableList requiredCompactedTreeListField2;
        C250663lr requiredTreeField;
        C250663lr optionalTreeField3;
        String optionalStringField;
        List list;
        C41935B7m b7m;
        List list2;
        C41935B7m b7m2;
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                A03 = AnonymousClass0fD.A03(-188234132);
                AnonymousClass3JD r2 = (AnonymousClass3JD) obj2;
                int A032 = AnonymousClass0fD.A03(-2115399048);
                0qQ.A0B(r2, 0);
                0sP r6 = ((C70605ODc) this.A01).A02;
                C250663lr A0U = C41845B3m.A0U(r2);
                if (A0U == null || (optionalTreeField = A0U.getOptionalTreeField(0, "xfb_recently_used_gifs_for_eimu(offset:$offset,search_query:null,take:$take)", C42736BhX.class, 1914736205)) == null || (requiredCompactedTreeListField = optionalTreeField.getRequiredCompactedTreeListField(0, "nodes", C42735BhW.class, 69419338)) == null) {
                    arrayList = 0sn.A00;
                } else {
                    arrayList = AnonymousClass7TE.A1C();
                    Iterator it = requiredCompactedTreeListField.iterator();
                    while (it.hasNext()) {
                        C250663lr A0V = C41845B3m.A0V(it);
                        C250663lr optionalTreeField4 = A0V.getOptionalTreeField(3, "image_original_info", C42734BhV.class, 2098685752);
                        String A08 = A0V.A08("giphy_id");
                        if (!(A08 == null || optionalTreeField4 == null)) {
                            arrayList.add(O1A.A00(new GifUrlImpl(C41846B3n.A0g(optionalTreeField4, "size_bytes", 5), C41846B3n.A0g(optionalTreeField4, "webp_size_bytes", 6), C41846B3n.A0g(optionalTreeField4, "mp4_size_bytes", 7), optionalTreeField4.A09("url"), optionalTreeField4.getOptionalStringField(3, "webp"), optionalTreeField4.A0B("mp4"), (float) optionalTreeField4.getCoercedIntField(1, IgReactMediaPickerNativeModule.WIDTH), (float) optionalTreeField4.getCoercedIntField(0, IgReactMediaPickerNativeModule.HEIGHT)), A08, A0V.A09(C66654MaN.A01(18, 8, 16))));
                        }
                    }
                }
                r6.invoke(arrayList);
                AnonymousClass0fD.A0A(-1871634108, A032);
                i = 1006347492;
                break;
            case 1:
                A03 = AnonymousClass0fD.A03(-776204140);
                AnonymousClass3JD r22 = (AnonymousClass3JD) obj2;
                int A033 = AnonymousClass0fD.A03(-971877208);
                0qQ.A0B(r22, 0);
                0sP r62 = ((C70606ODd) this.A01).A02;
                C250663lr A0U2 = C41845B3m.A0U(r22);
                if (A0U2 == null || (optionalTreeField2 = A0U2.getOptionalTreeField(0, "xfb_saved_gifs_for_eimu(offset:$offset,search_query:null,take:$take)", C42742Bhd.class, 1724185247)) == null || (requiredCompactedTreeListField2 = optionalTreeField2.getRequiredCompactedTreeListField(0, "nodes", C42741Bhc.class, -1538416791)) == null) {
                    arrayList2 = 0sn.A00;
                } else {
                    arrayList2 = AnonymousClass7TE.A1C();
                    Iterator it2 = requiredCompactedTreeListField2.iterator();
                    while (it2.hasNext()) {
                        C250663lr A0V2 = C41845B3m.A0V(it2);
                        C250663lr optionalTreeField5 = A0V2.getOptionalTreeField(3, "image_original_info", C42740Bhb.class, 857897055);
                        String A082 = A0V2.A08("giphy_id");
                        if (!(A082 == null || optionalTreeField5 == null)) {
                            arrayList2.add(O1A.A00(new GifUrlImpl(C41846B3n.A0g(optionalTreeField5, "size_bytes", 5), C41846B3n.A0g(optionalTreeField5, "webp_size_bytes", 6), C41846B3n.A0g(optionalTreeField5, "mp4_size_bytes", 7), optionalTreeField5.A09("url"), optionalTreeField5.getOptionalStringField(3, "webp"), optionalTreeField5.A0B("mp4"), (float) optionalTreeField5.getCoercedIntField(1, IgReactMediaPickerNativeModule.WIDTH), (float) optionalTreeField5.getCoercedIntField(0, IgReactMediaPickerNativeModule.HEIGHT)), A082, A0V2.A09(C66654MaN.A01(18, 8, 16))));
                        }
                    }
                }
                r62.invoke(arrayList2);
                AnonymousClass0fD.A0A(511059406, A033);
                i = -619297218;
                break;
            case 2:
                A03 = AnonymousClass0fD.A03(-2048825262);
                AnonymousClass3JC r23 = (AnonymousClass3JC) obj2;
                int A034 = AnonymousClass0fD.A03(1747125014);
                0qQ.A0B(r23, 0);
                C250663lr r5 = (C250663lr) r23.A01;
                if (!(r5 == null || (requiredTreeField = r5.getRequiredTreeField(0, "xdt__generate_share_url_info(request:$input)", C61.class, 1340945927)) == null || (optionalTreeField3 = requiredTreeField.getOptionalTreeField(0, "share_url_wrapper", C60.class, 970764982)) == null || (optionalStringField = optionalTreeField3.getOptionalStringField(0, "sharing_url")) == null)) {
                    ((AnonymousClass2hV) this.A01).apply(optionalStringField);
                }
                AnonymousClass0fD.A0A(-2015571632, A034);
                i = -5113366;
                break;
            case 3:
                A03 = AnonymousClass0fD.A03(531047614);
                C43844CFk cFk = (C43844CFk) obj2;
                int A0D = AnonymousClass7TG.A0D(cFk, 1236134578);
                CH8.super.onSuccess(cFk);
                H05 h05 = (H05) this.A01;
                C41936B7n b7n = cFk.A00;
                if (b7n == null || (b7m = b7n.A00) == null) {
                    list = null;
                } else {
                    list = b7m.A00;
                }
                h05.A00 = list;
                h05.A01 = true;
                h05.onResume();
                AnonymousClass0fD.A0A(-964370976, A0D);
                i = -1109339729;
                break;
            default:
                A03 = AnonymousClass0fD.A03(1882861455);
                C43844CFk cFk2 = (C43844CFk) obj2;
                int A0D2 = AnonymousClass7TG.A0D(cFk2, -1531414042);
                CH8.super.onSuccess(cFk2);
                H06 h06 = (H06) this.A01;
                C41936B7n b7n2 = cFk2.A00;
                if (b7n2 == null || (b7m2 = b7n2.A00) == null) {
                    list2 = null;
                } else {
                    list2 = b7m2.A00;
                }
                h06.A00 = list2;
                h06.A01 = true;
                h06.onResume();
                AnonymousClass0fD.A0A(-665288238, A0D2);
                i = -1867724565;
                break;
        }
        AnonymousClass0fD.A0A(i, A03);
    }
}

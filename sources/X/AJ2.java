package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class AJ2 {
    public KB3 A00;
    public final Context A01;
    public final AnonymousClass4DH A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final AE2 A05;
    public final AnonymousClass8ME A06;
    public final LPD A07;
    public final String A08;
    public final C66464MSs A09;
    public final String A0A = "StickerOverlayController";

    public static void A04(C347017w8 r41, AJ2 aj2, AIV aiv) {
        String str;
        AnonymousClass8BG r5 = null;
        Integer num = AnonymousClass05K.A00;
        AJ2 aj22 = aj2;
        String str2 = aj22.A0A;
        ArrayList A1C = AnonymousClass7TE.A1C();
        C347017w8 r34 = r41;
        Iterator it = r34.A05().iterator();
        while (it.hasNext()) {
            Drawable A0Z = AnonymousClass7TE.A0Z(it);
            if (A0Z instanceof C369528uu) {
                A1C.add(((C369528uu) A0Z).A03());
                if ((A0Z instanceof C389739q7) && ((C389739q7) A0Z).A00 == C62565Khv.AUTO_TAG) {
                    r5 = new AnonymousClass8BG(0.5f, 0.85f);
                }
            } else {
                if (A0Z instanceof C369538uv) {
                    str = ((C389709q4) ((C369538uv) A0Z)).A01;
                } else if (A0Z instanceof C369548uw) {
                    str = ((C389719q5) ((C369548uw) A0Z)).A02;
                } else if (A0Z instanceof C369558ux) {
                    str = ((C389749q8) ((C369558ux) A0Z)).A03;
                }
                A1C.add(str);
            }
        }
        C310416b1 r4 = new C310416b1((AnonymousClass8BH) r5, (AnonymousClass8DA) null, (C3510487j) null, num, (Integer) null, (Integer) null, (Object) str2, (String) null, (List) null, 0.4f, 8.0f, -1.0f, -1.0f, -1.0f, 0, true, false, true, true, false, false, false, true, true, true, true, true, false, false);
        aj22.A06.A0x(r34, AnonymousClass57C.ASSET_PICKER, (MusicOverlayStickerModel) null, r4, aiv.A00, (String) null, (String) null, (String) null, (String) null, A1C);
    }

    public AJ2(Context context, AnonymousClass07i r5, AnonymousClass4DH r6, AnonymousClass0iw r7, UserSession userSession, C365798nh r9, AnonymousClass8ME r10, String str) {
        C65681Lxw lxw = new C65681Lxw(this, 0);
        this.A09 = lxw;
        this.A01 = context;
        this.A06 = r10;
        this.A04 = userSession;
        this.A05 = new AE2(userSession, r9);
        this.A07 = C249713kF.A00.A0I(context, r5, userSession, lxw);
        this.A02 = r6;
        this.A03 = r7;
        this.A08 = str;
        this.A00 = C249713kF.A00.A0X(userSession);
    }

    public static C347017w8 A00(AIV aiv, InteractiveDrawableContainer interactiveDrawableContainer) {
        String Aoi;
        Product product = aiv.A00;
        if (product != null) {
            return A01(interactiveDrawableContainer, product);
        }
        List list = aiv.A04;
        if (list != null) {
            return A02(interactiveDrawableContainer, list);
        }
        ProductCollection productCollection = aiv.A01;
        if (productCollection != null) {
            Iterator it = interactiveDrawableContainer.A0V(C347017w8.class).iterator();
            while (it.hasNext()) {
                C347017w8 r4 = (C347017w8) it.next();
                Class<C369548uw> cls = C369548uw.class;
                if (r4.A0E(cls)) {
                    ArrayList A062 = r4.A06(cls);
                    if (((C389719q5) ((C369548uw) A062.get(0))).A01.Aoi() != null) {
                        String Aoi2 = ((C389719q5) ((C369548uw) A062.get(0))).A01.Aoi();
                        if (productCollection.Aoi() == null) {
                            Aoi = "";
                        } else {
                            Aoi = productCollection.Aoi();
                        }
                        if (Aoi2.equals(Aoi)) {
                            return r4;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return null;
        }
        User user = aiv.A03;
        if (user != null) {
            Iterator it2 = interactiveDrawableContainer.A0V(C347017w8.class).iterator();
            while (it2.hasNext()) {
                C347017w8 r42 = (C347017w8) it2.next();
                Class<C369558ux> cls2 = C369558ux.class;
                if (r42.A0E(cls2)) {
                    String A002 = AnonymousClass3ZA.A00(((C389749q8) ((C369558ux) AnonymousClass7TE.A12(r42.A06(cls2)))).A02);
                    A002.getClass();
                    if (A002.equals(AnonymousClass3ZA.A00(user))) {
                        return r42;
                    }
                }
            }
            return null;
        }
        throw AnonymousClass7TE.A1B("Unsupported Shopping sticker type");
    }

    public static C347017w8 A01(InteractiveDrawableContainer interactiveDrawableContainer, Product product) {
        Iterator it = interactiveDrawableContainer.A0V(C347017w8.class).iterator();
        while (it.hasNext()) {
            C347017w8 r2 = (C347017w8) it.next();
            Class<C369528uu> cls = C369528uu.class;
            if (r2.A0E(cls)) {
                ArrayList A062 = r2.A06(cls);
                if (product == null || ((C369528uu) AnonymousClass7TE.A12(A062)).A02().A0H.equals(product.A0H)) {
                    return r2;
                }
            }
        }
        return null;
    }

    public static C347017w8 A02(InteractiveDrawableContainer interactiveDrawableContainer, List list) {
        Iterator it = interactiveDrawableContainer.A0V(C347017w8.class).iterator();
        while (it.hasNext()) {
            C347017w8 r2 = (C347017w8) it.next();
            Class<C369538uv> cls = C369538uv.class;
            if (r2.A0E(cls)) {
                ArrayList A062 = r2.A06(cls);
                if (list == null || ((C389709q4) ((C369538uv) AnonymousClass7TE.A12(A062))).A02.equals(list)) {
                    return r2;
                }
            }
        }
        return null;
    }

    public static void A03(Spannable spannable, AJ2 aj2, AIV aiv, C62565Khv khv, C358868bb r12, String str, int i, boolean z, boolean z2) {
        ArrayList arrayList;
        Context context;
        Object r1;
        Product product = aiv.A00;
        if (product != null) {
            if (182.A06(0Tu.A05, aj2.A04, 36319866952687292L)) {
                AE2 ae2 = aj2.A05;
                context = aj2.A01;
                arrayList = AnonymousClass7TF.A0q(context, 0);
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.product_sticker_text_size);
                int A012 = AnonymousClass8XF.A01(context);
                if (str != null) {
                    int hashCode = str.hashCode();
                    if (hashCode != -1563501812) {
                        if (hashCode != 1080478002) {
                            if (hashCode == 1408761647 && str.equals("product_item_list_cell_sticker_black_white")) {
                                arrayList.add(new C69057Ndu(context, "product_item_list_cell_sticker_black_white"));
                                r1 = new C69057Ndu(context, "product_item_list_cell_sticker_subtle");
                            }
                        } else if (str.equals("product_item_tile_sticker_black_white")) {
                            r1 = new C389729q6(context);
                        }
                        arrayList.add(r1);
                    } else if (str.equals("product_item_text_sticker_vibrant")) {
                        arrayList.add(new C389739q7(context, A012, dimensionPixelSize, "product_item_text_sticker_vibrant"));
                        arrayList.add(new C389739q7(context, A012, dimensionPixelSize, "product_item_text_sticker_subtle"));
                        arrayList.add(new C389739q7(context, A012, dimensionPixelSize, "product_item_text_sticker_black_white"));
                        Integer A002 = AE2.A00(ae2.A00);
                        if (A002 != null) {
                            int intValue = A002.intValue();
                            C389739q7 r13 = new C389739q7(context, A012, dimensionPixelSize, "product_item_text_sticker_media_primary_color");
                            C380069Wl r0 = r13.A04;
                            r0.A02 = intValue;
                            r0.invalidateSelf();
                            arrayList.add(r13);
                        }
                    }
                }
            } else {
                AE2 ae22 = aj2.A05;
                context = aj2.A01;
                arrayList = ae22.A01(context);
            }
            String obj = spannable.toString();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Drawable A0Z = AnonymousClass7TE.A0Z(it);
                ((C369528uu) A0Z).A05(product, obj, i, z);
                if ((A0Z instanceof C389739q7) && khv == C62565Khv.AUTO_TAG) {
                    C389739q7 r02 = (C389739q7) A0Z;
                    r02.A00 = khv;
                    r02.A02 = z2;
                }
                AES.A02(A0Z, r12);
            }
        } else {
            List list = aiv.A04;
            if (list != null) {
                AE2 ae23 = aj2.A05;
                context = aj2.A01;
                arrayList = ae23.A04(context, list);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Drawable A0Z2 = AnonymousClass7TE.A0Z(it2);
                    ((C369538uv) A0Z2).A01(spannable.toString(), i);
                    AES.A02(A0Z2, r12);
                }
            } else {
                ProductCollection productCollection = aiv.A01;
                if (productCollection == null || aiv.A00() == null) {
                    User user = aiv.A03;
                    if (user != null) {
                        AE2 ae24 = aj2.A05;
                        context = aj2.A01;
                        arrayList = ae24.A03(context, user);
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            Drawable A0Z3 = AnonymousClass7TE.A0Z(it3);
                            ((C369558ux) A0Z3).A00(spannable.toString(), i);
                            AES.A02(A0Z3, r12);
                        }
                    } else {
                        throw AnonymousClass7TE.A1B("Unsupported Shopping sticker type");
                    }
                } else {
                    AE2 ae25 = aj2.A05;
                    context = aj2.A01;
                    aiv.A00();
                    arrayList = ae25.A02(context, productCollection);
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        Drawable A0Z4 = AnonymousClass7TE.A0Z(it4);
                        if (A0Z4 instanceof C369548uw) {
                            C369548uw r14 = (C369548uw) A0Z4;
                            r14.A00(i);
                            AES.A02(r14, r12);
                        }
                    }
                }
            }
        }
        A04(new C347017w8(context, aj2.A04, arrayList), aj2, aiv);
    }

    public static void A05(AJ2 aj2, L5A l5a) {
        C358248ab r1 = new C358248ab(aj2.A01);
        r1.A05 = l5a.A01;
        r1.A0q(l5a.A00);
        r1.A0r(true);
        r1.A0s(true);
        r1.A06();
        AnonymousClass0fN.A00(r1.A02());
    }
}

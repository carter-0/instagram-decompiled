package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductTag;
import com.instagram.model.shopping.clips.ClipsShoppingInfoIntf;
import com.instagram.tagging.model.Tag;
import com.instagram.tagging.model.TagSerializer;
import com.instagram.user.model.Product;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.6Ur  reason: invalid class name and case insensitive filesystem */
public final class C308546Ur implements DialogInterface.OnClickListener {
    public final /* synthetic */ C308516Uo A00;

    public C308546Ur(C308516Uo r1) {
        this.A00 = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        1NY r4;
        String str;
        String str2;
        Object obj;
        ProductTag productTag;
        Object obj2;
        C17600Vas vas = this.A00.A00;
        if (vas != null) {
            1Xj r6 = vas.A02;
            if (r6.A5G()) {
                C67231sQ clipsMetadata = r6.A0C.getClipsMetadata();
                if (clipsMetadata != null) {
                    ClipsShoppingInfoIntf Btl = clipsMetadata.Btl();
                    if (Btl != null) {
                        List Bga = Btl.Bga();
                        if (Bga != null) {
                            C11307SKv.A01(new AWQ(new C20785Wyw(vas, 23)), Bga.iterator());
                        }
                        C61062Jw0 A02 = LSG.A00.A02(Btl);
                        r4 = new 1NY(vas.A01, -2);
                        r4.A04();
                        r4.A0A(0mp.A06("media/%s/edit_media/", new Object[]{r6.getId()}));
                        r4.A0Q(C61290K1b.class, C64024LJl.class);
                        r4.A9m(AnonymousClass9NJ.A00(0, 9, 92), 0qv.A00(vas.A00));
                        r4.A0R = true;
                        try {
                            r4.A9m("shopping_data", C45890D9t.A00(A02));
                        } catch (IOException e) {
                            e = e;
                            str = "RejectedProductTagNetworkHelper";
                            str2 = "Unable to parse clips shopping metadata";
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else if (r6.A5v()) {
                List A3o = r6.A3o(AnonymousClass3WT.PRODUCT);
                if (A3o != null) {
                    Product A0I = ((C255783ui) A3o.get(0)).A0I();
                    AnonymousClass4DU r0 = vas.A03;
                    UserSession userSession = vas.A01;
                    W3r.A07(userSession, r6, r0, A0I);
                    r4 = new 1NY(userSession, -2);
                    r4.A04();
                    String A30 = r6.A30();
                    if (A30 != null) {
                        r4.A0A(0mp.A06("commerce/story/%s/remove_product_sticker/", new Object[]{A30}));
                        r4.A0Q(C61290K1b.class, C64024LJl.class);
                        r4.A0R = true;
                        r4.A9m("product_id", vas.A05);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                if (r6.A5D()) {
                    for (Object next : new HashMap(r6.A3N()).entrySet()) {
                        0qQ.A07(next);
                        Iterator it = ((List) ((Map.Entry) next).getValue()).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            if (0qQ.A0K(((Tag) obj2).getId(), vas.A05)) {
                                break;
                            }
                        }
                        productTag = (ProductTag) obj2;
                        if (productTag != null) {
                        }
                    }
                    return;
                }
                ArrayList A3G = r6.A3G();
                if (A3G != null) {
                    Iterator it2 = A3G.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        if (0qQ.A0K(((Tag) obj).getId(), vas.A05)) {
                            break;
                        }
                    }
                    productTag = (ProductTag) obj;
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
                if (productTag != null) {
                    Product A002 = C14502TxO.A00(productTag.A02);
                    AnonymousClass4DU r02 = vas.A03;
                    UserSession userSession2 = vas.A01;
                    W3r.A07(userSession2, r6, r02, A002);
                    r4 = new 1NY(userSession2, -2);
                    r4.A04();
                    r4.A0A(0mp.A06("media/%s/edit_media/", new Object[]{r6.getId()}));
                    r4.A0Q(C61290K1b.class, C64024LJl.class);
                    r4.A9m(AnonymousClass9NJ.A00(0, 9, 92), 0qv.A00(vas.A00));
                    r4.A0R = true;
                    try {
                        if (r6.A5D()) {
                            HashMap hashMap = new HashMap();
                            for (Map.Entry entry : new HashMap(r6.A3N()).entrySet()) {
                                List list = (List) entry.getValue();
                                ArrayList arrayList = new ArrayList();
                                Iterator it3 = list.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    Tag tag = (Tag) it3.next();
                                    if (0qQ.A0K(tag.getId(), vas.A05)) {
                                        list.remove(tag);
                                        arrayList.add(tag);
                                        break;
                                    }
                                }
                                hashMap.put(entry.getKey(), TagSerializer.A00(list, arrayList));
                            }
                            String obj3 = new JSONObject(0Yt.A0B(hashMap)).toString();
                            0qQ.A07(obj3);
                            r4.AA0("children_product_tags", obj3);
                        } else {
                            String A003 = AnonymousClass000.A00(3792);
                            ArrayList A3G2 = r6.A3G();
                            if (A3G2 != null) {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(productTag);
                                A3G2.remove(productTag);
                                r4.A9m(A003, TagSerializer.A00(A3G2, arrayList2));
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                    } catch (IOException e2) {
                        e = e2;
                        str = "RejectedProductTagNetworkHelper";
                        str2 = "Unable to parse product tag";
                        0wb.A06(str, str2, e);
                        1OC A0M = r4.A0M();
                        A0M.A00 = new C15586UfE(vas);
                        1ES.A03(A0M);
                    }
                } else {
                    return;
                }
            }
            1OC A0M2 = r4.A0M();
            A0M2.A00 = new C15586UfE(vas);
            1ES.A03(A0M2);
        }
    }
}

package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.model.shopping.ProductGroup;
import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.user.model.Product;
import instagram.features.clips.edit.ClipsEditMetadataController;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Lyv  reason: case insensitive filesystem */
public final class C65741Lyv implements C273414mX {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C65741Lyv(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void Cyc() {
        String str;
        Object obj;
        switch (this.A00) {
            case 0:
                C68449NIn nIn = (C68449NIn) this.A02;
                0xY A0p = AnonymousClass7TE.A0p(1Au.A00(nIn.A0i()));
                A0p.E5T(C66579MXk.A00(865), true);
                A0p.apply();
                if (((0r1) this.A01).A00) {
                    C68449NIn.A0Q(nIn, C66579MXk.A00(367));
                    return;
                }
                IgEditText igEditText = nIn.A0H;
                if (igEditText == null) {
                    str = "noteEditText";
                    break;
                } else {
                    C69979NvJ.A00(igEditText);
                    return;
                }
            case 1:
                K4Y k4y = (K4Y) this.A02;
                if (k4y.A0E != null) {
                    0lg A0X = DbT.A0X(k4y.A0F);
                    String valueOf = String.valueOf(k4y.A0E);
                    AnonymousClass7TG.A1N(A0X, valueOf);
                    FG9.A00(A0X, "upsell_screen_dismissed", valueOf);
                }
                C66520MUy mUy = (C66520MUy) this.A01;
                if (mUy != null) {
                    mUy.getDismissAction();
                    return;
                }
                return;
            case 2:
                C61942KSr kSr = (C61942KSr) this.A02;
                AnonymousClass0eM r4 = kSr.A0W;
                UserSession A0l = AnonymousClass7TE.A0l(r4);
                C295095nZ r3 = (C295095nZ) this.A01;
                boolean z = r3.A00;
                String valueOf2 = String.valueOf(r3.A02);
                kSr.requireContext();
                AnonymousClass5w9 r0 = AnonymousClass5w8.A05;
                AnonymousClass5w9.A00(AnonymousClass7TE.A0l(r4));
                C295105na.A02(A0l, "default_privacy_consent_bottomsheet_dismiss_click", valueOf2, (String) null, "video_feed", String.valueOf(r3.A01), z, C363558jv.A00(AnonymousClass7TE.A0l(r4)), r3.A05);
                if (AnonymousClass5w9.A02(r3) && !r3.A00) {
                    C61942KSr.A04(r3, kSr);
                    AnonymousClass5w8 A002 = AnonymousClass5w9.A00(AnonymousClass7TE.A0l(r4));
                    kSr.requireActivity();
                    A002.A07(kSr.requireContext(), "video_feed");
                    return;
                }
                return;
            case 3:
                C59844JaK.A00((C59844JaK) this.A02).A06((L2R) this.A01);
                return;
            case 4:
                W27 w27 = (W27) this.A02;
                VX6 vx6 = w27.A05;
                ProductGroup productGroup = vx6.A00;
                str = "_productGroup";
                if (productGroup != null) {
                    HashSet hashSet = new HashSet(productGroup.A00());
                    Map map = vx6.A02;
                    Iterator A16 = DbV.A16(map);
                    while (A16.hasNext()) {
                        ProductVariantDimension productVariantDimension = (ProductVariantDimension) A16.next();
                        String A11 = DbT.A11(productVariantDimension, map);
                        if (A11 != null) {
                            ProductGroup productGroup2 = vx6.A00;
                            if (productGroup2 == null) {
                                break;
                            } else {
                                List A012 = productGroup2.A01(productVariantDimension, A11);
                                0qQ.A07(A012);
                                hashSet.retainAll(00k.A0k(A012));
                            }
                        }
                    }
                    vx6.A01 = hashSet;
                    if (DbT.A1b(hashSet)) {
                        Iterator it = vx6.A01.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = it.next();
                                if (((Product) obj).A0P) {
                                }
                            } else {
                                obj = null;
                            }
                        }
                        Product product = (Product) obj;
                        if (product == null) {
                            product = (Product) vx6.A01.iterator().next();
                        }
                        if (w27.A02) {
                            AnonymousClass1Nd.A00(w27.A04).A00(new WQI(product));
                            return;
                        }
                        return;
                    }
                    throw DbT.A0m();
                }
                break;
            default:
                return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Cyf() {
        AnonymousClass3QO r0;
        if (5 - this.A00 == 0) {
            ClipsEditMetadataController clipsEditMetadataController = (ClipsEditMetadataController) this.A02;
            Object A022 = JTT.A0P(clipsEditMetadataController.A18).A00.A02();
            1Xj r02 = (1Xj) this.A01;
            if (r02 != null) {
                r0 = r02.A1t();
            } else {
                r0 = null;
            }
            if (A022 != r0) {
                clipsEditMetadataController.A0T = true;
                ClipsEditMetadataController.A0C(clipsEditMetadataController);
            }
        }
    }
}

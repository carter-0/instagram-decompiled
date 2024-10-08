package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.SellerShoppableFeedType;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productintfs.TaggingFeedSessionInformation;
import com.instagram.model.shopping.reels.ProductCollectionLinkIntf;
import com.instagram.model.shopping.reels.ProfileShopLinkIntf;
import com.instagram.model.shopping.reels.ReelMultiProductLinkIntf;
import com.instagram.model.shopping.reels.ReelProductLink;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6aN  reason: invalid class name and case insensitive filesystem */
public final class C310066aN {
    public final FragmentActivity A00;
    public final AnonymousClass4DH A01;
    public final UserSession A02;
    public final AnonymousClass4DU A03;
    public final C310016aI A04;
    public final AnonymousClass3BQ A05;

    public C310066aN(FragmentActivity fragmentActivity, AnonymousClass4DH r3, UserSession userSession, AnonymousClass4DU r5, AnonymousClass3BQ r6, C310016aI r7) {
        0qQ.A0B(r7, 1);
        0qQ.A0B(r6, 4);
        0qQ.A0B(userSession, 5);
        this.A04 = r7;
        this.A00 = fragmentActivity;
        this.A03 = r5;
        this.A05 = r6;
        this.A02 = userSession;
        this.A01 = r3;
    }

    public static final void A02(C255773uh r12, C310066aN r13, User user, boolean z) {
        String str;
        String str2;
        String str3 = null;
        if (user != null) {
            str = AnonymousClass3ZA.A00(user);
        } else {
            str = null;
        }
        ArrayList A0A = C294165ly.A0A(r12);
        ArrayList arrayList = new ArrayList();
        Iterator it = A0A.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            User user2 = ((Product) next).A0B;
            if (user2 != null) {
                str2 = AnonymousClass3ZA.A00(user2);
            } else {
                str2 = null;
            }
            if (00p.A0j(str2, str, true)) {
                arrayList.add(next);
            }
        }
        List A002 = C64030LJu.A00(arrayList);
        if (user != null) {
            str3 = AnonymousClass3ZA.A00(user);
        }
        String username = user.A03.getUsername();
        if (str3 != null && username != null) {
            C249713kF r2 = C249713kF.A00;
            FragmentActivity fragmentActivity = r13.A00;
            UserSession userSession = r13.A02;
            AnonymousClass4DU r6 = r13.A03;
            W2P A0N = r2.A0N(fragmentActivity, SellerShoppableFeedType.A04, userSession, r6, r13.A04.A02, r6.getModuleName(), "stories_cta", str3, username);
            A0N.A03 = r12.A0b;
            A0N.A0I = A002;
            A0N.A0K = z;
            A0N.A0C = AnonymousClass3ZA.A00(user);
            A0N.A05();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(android.content.Context r20, X.C255773uh r21) {
        /*
            r19 = this;
            r2 = 1
            r4 = r19
            com.instagram.common.session.UserSession r11 = r4.A02
            X.4DU r7 = r4.A03
            java.lang.String r9 = r7.getModuleName()
            java.lang.String r15 = "stories_cta"
            r0 = 2
            X.0qQ.A0B(r9, r0)
            r3 = r21
            X.1Xj r5 = r3.A0b
            if (r5 == 0) goto L_0x00e3
            X.0wc r1 = X.AnonymousClass0kN.A01(r7, r11)
            java.lang.String r10 = "instagram_shopping_story_cta_bar_tap"
            X.0kJ r0 = r1.A00
            X.0Aj r6 = r1.A00(r0, r10)
            r1 = 1
            boolean r0 = r6.isSampled()
            if (r0 != 0) goto L_0x002b
            r1 = 0
        L_0x002b:
            java.lang.String r8 = "stories_view_shop"
            if (r1 == 0) goto L_0x006c
            java.lang.String r1 = r5.getId()
            if (r1 == 0) goto L_0x0135
            java.lang.String r0 = "m_pk"
            r6.AAJ(r0, r1)
            X.327 r1 = new X.327
            r1.<init>()
            java.lang.String r0 = "prior_module"
            r1.A06(r0, r9)
            java.lang.String r0 = "submodule"
            r1.A06(r0, r15)
            java.lang.String r0 = "navigation_info"
            r6.AAK(r1, r0)
            java.util.ArrayList r0 = X.C294165ly.A0A(r3)
            java.util.List r1 = X.C64030LJu.A01(r0)
            java.lang.String r0 = "product_ids"
            r6.AAe(r0, r1)
            java.util.HashMap r1 = X.C294165ly.A0B(r3)
            java.lang.String r0 = "product_merchant_ids"
            r6.A9H(r0, r1)
            java.lang.String r0 = "cta_bar_type"
            r6.AAJ(r0, r8)
            r6.Cgf()
        L_0x006c:
            X.0wc r6 = X.AnonymousClass0kN.A01(r7, r11)
            r0 = 2910(0xb5e, float:4.078E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            X.0kJ r0 = r6.A00
            X.0Aj r6 = r6.A00(r0, r1)
            boolean r0 = r6.isSampled()
            if (r0 == 0) goto L_0x00e3
            java.lang.String r1 = ""
            java.lang.String r0 = "shopping_session_id"
            r6.AAJ(r0, r1)
            X.V1Z r1 = X.V1Z.CTA_BAR
            java.lang.String r0 = "analytics_component"
            r6.A8M(r1, r0)
            java.lang.String r0 = "legacy_event_name"
            r6.AAJ(r0, r10)
            java.lang.String r0 = "legacy_referral_surface"
            r6.AAJ(r0, r9)
            java.lang.String r0 = "legacy_ui_component"
            r6.AAJ(r0, r15)
            java.lang.String r1 = r5.getId()
            java.lang.String r0 = "m_pk"
            r6.AAJ(r0, r1)
            java.lang.String r0 = "cta_bar_type"
            r6.AAJ(r0, r8)
            java.util.ArrayList r0 = X.C294165ly.A0A(r3)
            java.util.List r1 = X.C64030LJu.A01(r0)
            java.lang.String r0 = "product_ids"
            r6.AAe(r0, r1)
            java.util.HashMap r1 = X.C294165ly.A0B(r3)
            java.lang.String r0 = "product_merchant_ids"
            r6.A9H(r0, r1)
            r6.Cgf()
        L_0x00c6:
            java.util.ArrayList r6 = X.C294165ly.A09(r5)
            r1 = 0
            if (r6 == 0) goto L_0x00e2
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x00e2
            int r0 = r6.size()
            if (r0 != r2) goto L_0x00e6
            java.lang.Object r0 = r6.get(r1)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            A02(r3, r4, r0, r2)
        L_0x00e2:
            return
        L_0x00e3:
            if (r5 != 0) goto L_0x00c6
            return
        L_0x00e6:
            r2 = r20
            if (r20 == 0) goto L_0x012d
            X.7Pr r1 = new X.7Pr
            r1.<init>(r11)
            r0 = 2131973746(0x7f135672, float:1.9584537E38)
            java.lang.String r0 = r2.getString(r0)
            r1.A0d = r0
            X.7Pu r2 = r1.A00()
            androidx.fragment.app.FragmentActivity r1 = r4.A00
            r0 = 0
            java.lang.String r0 = X.Pxd.A00(r0)
            X.0qQ.A0C(r1, r0)
            X.3kF r0 = X.C249713kF.A00
            X.W3Y r10 = r0.A0T()
            r13 = 0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
            java.lang.String r14 = r7.getModuleName()
            java.lang.String r16 = r5.getId()
            java.lang.String r17 = r5.C9L()
            X.UrH r12 = new X.UrH
            r12.<init>(r3, r4)
            r18 = r0
            X.UYg r0 = r10.A0G(r11, r12, r13, r14, r15, r16, r17, r18)
            r2.A02(r1, r0)
            return
        L_0x012d:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0135:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C310066aN.A03(android.content.Context, X.3uh):void");
    }

    public final void A04(DialogInterface.OnDismissListener onDismissListener, C255773uh r17, C250973mM r18, C297795sM r19, C273414mX r20, 2EG r21) {
        ReelMultiProductLinkIntf reelMultiProductLinkIntf;
        C263944Ny r0;
        User user;
        String A002;
        DialogInterface.OnDismissListener onDismissListener2 = onDismissListener;
        0qQ.A0B(onDismissListener2, 4);
        C255773uh r10 = r17;
        if (r10.A0e == C250963mL.MEDIA) {
            1Xj r02 = r10.A0b;
            r02.getClass();
            reelMultiProductLinkIntf = r02.A20();
        } else {
            reelMultiProductLinkIntf = null;
        }
        if (reelMultiProductLinkIntf != null) {
            List Bga = reelMultiProductLinkIntf.Bga();
            C250973mM r11 = r18;
            C297795sM r12 = r19;
            2EG r13 = r21;
            if (Bga == null || Bga.size() != 1) {
                A01(r10, r11, r12, r13, "multi_product");
                if (Bga != null) {
                    C310016aI r2 = this.A04;
                    List A022 = C14502TxO.A02(Bga);
                    String obj = r13.toString();
                    0qQ.A0B(obj, 3);
                    0wc A012 = AnonymousClass0kN.A01(C310016aI.A01(r11.A0H, r2), r2.A06);
                    1Ln r5 = new 1Ln(A012.A00(A012.A00, "instagram_shopping_viewer_open_shopping_permanent_entrypoint"), 322);
                    if (r5.A00.isSampled()) {
                        1Xj r03 = r10.A0b;
                        if (r03 != null) {
                            String id = r03.getId();
                            if (id != null) {
                                r5.A0m(id);
                                r5.A00.A9H("product_merchant_ids", C294165ly.A0D(A022));
                                0qQ.A0B(A022, 0);
                                Product product = (Product) 00k.A0J(A022);
                                if (product == null || (user = product.A0B) == null || (A002 = AnonymousClass3ZA.A00(user)) == null) {
                                    r0 = null;
                                } else {
                                    r0 = C263944Ny.A00(A002);
                                }
                                r5.A0e(r0);
                                r5.A0O("is_checkout_enabled", C294165ly.A08(A022));
                                r5.A0R("submodule", obj);
                                r5.Cgf();
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                }
                C56012HrK A0P = C249713kF.A00.A0P(this.A00, this.A02, this.A03);
                A0P.A07 = AnonymousClass05K.A0C;
                1Xj r1 = r10.A0b;
                if (r1 != null) {
                    A0P.A01 = r1;
                    A0P.A02 = null;
                    A0P.A05 = r20;
                    A0P.A00();
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            A00(onDismissListener2, r10, r11, r12, r13, C14502TxO.A00((ProductDetailsProductItemDictIntf) Bga.get(0)));
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A05(DialogInterface.OnDismissListener onDismissListener, C255773uh r10, C250973mM r11, C297795sM r12, 2EG r13) {
        ProductDetailsProductItemDict productDetailsProductItemDict;
        DialogInterface.OnDismissListener onDismissListener2 = onDismissListener;
        0qQ.A0B(onDismissListener, 4);
        C255773uh r3 = r10;
        if (r10.A0e == C250963mL.MEDIA) {
            1Xj r0 = r10.A0b;
            r0.getClass();
            ReelProductLink A21 = r0.A21();
            if (!(A21 == null || (productDetailsProductItemDict = A21.A00) == null)) {
                A00(onDismissListener2, r3, r11, r12, r13, new Product((TaggingFeedSessionInformation) null, productDetailsProductItemDict));
                return;
            }
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A06(C255773uh r12, C250973mM r13, C297795sM r14, 2EG r15) {
        ProductCollectionLinkIntf productCollectionLinkIntf;
        C255773uh r3 = r12;
        if (r12.A0e == C250963mL.MEDIA) {
            1Xj r0 = r12.A0b;
            r0.getClass();
            productCollectionLinkIntf = r0.A1y();
        } else {
            productCollectionLinkIntf = null;
        }
        if (productCollectionLinkIntf != null) {
            A01(r3, r13, r14, r15, "seller_funded_incentive");
            C249713kF r5 = C249713kF.A00;
            FragmentActivity fragmentActivity = this.A00;
            UserSession userSession = this.A02;
            String moduleName = this.A03.getModuleName();
            1Xj r02 = r12.A0b;
            if (r02 != null) {
                String id = r02.getId();
                if (id != null) {
                    r5.A12(fragmentActivity, userSession, productCollectionLinkIntf, moduleName, id);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A07(C255773uh r17, C250973mM r18, C297795sM r19, 2EG r20) {
        String str;
        C255773uh r11 = r17;
        if (r11.A0e == C250963mL.MEDIA) {
            1Xj r1 = r11.A0b;
            r1.getClass();
            ProfileShopLinkIntf A1z = r1.A1z();
            if (A1z != null) {
                C255783ui A002 = C289745e8.A00(AnonymousClass3WT.PRODUCT, r11.A0b());
                ArrayList arrayList = null;
                if (A002 != null) {
                    User user = A002.A0I().A0B;
                    if (user != null) {
                        str = AnonymousClass3ZA.A00(user);
                    } else {
                        str = null;
                    }
                    String BhF = A1z.BhF();
                    if (BhF == null) {
                        BhF = null;
                    }
                    if (0qQ.A0K(str, BhF)) {
                        arrayList = new ArrayList();
                        arrayList.add(A002.A0I().A0H);
                    }
                }
                A01(r11, r18, r19, r20, AnonymousClass000.A00(3802));
                String BhF2 = A1z.BhF();
                if (BhF2 == null) {
                    BhF2 = null;
                }
                C249713kF r4 = C249713kF.A00;
                FragmentActivity fragmentActivity = this.A00;
                UserSession userSession = this.A02;
                AnonymousClass4DU r8 = this.A03;
                String str2 = this.A04.A02;
                String str3 = this.A05.A00;
                if (A1z.BhF() == null || BhF2 == null) {
                    BhF2 = "";
                }
                W2P A0N = r4.A0N(fragmentActivity, A1z.BsB(), userSession, r8, str2, str3, "shopping_swipe_up", BhF2, A1z.BhG());
                A0N.A03 = r1;
                A0N.A0H = arrayList;
                A0N.A0J = true;
                A0N.A05();
                return;
            }
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final void A00(DialogInterface.OnDismissListener onDismissListener, C255773uh r14, C250973mM r15, C297795sM r16, 2EG r17, Product product) {
        2EG r10 = r17;
        A01(r14, r15, r16, r10, "shopping_pdp");
        WNN A0L = C249713kF.A00.A0L(this.A00, this.A02, this.A03, product, "shopping_swipe_up", (String) null);
        A0L.A02 = onDismissListener;
        A0L.A02(r14.A0b, (Integer) null);
        A0L.A0U = true;
        A0L.A0B = r10;
        A0L.A00 = r15.A01;
        WNN.A01(A0L);
    }

    private final void A01(C255773uh r8, C250973mM r9, C297795sM r10, 2EG r11, String str) {
        C310016aI r0 = this.A04;
        User user = r8.A0i;
        String obj = r11.toString();
        C250973mM r1 = r9;
        C297795sM r2 = r10;
        String str2 = str;
        r0.A0M(r1, r2, user, obj, "reel_present_browser", str2);
        r0.A0M(r1, r2, user, obj, "instagram_organic_action", str2);
    }
}

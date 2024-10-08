package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.api.schemas.MerchantCheckoutStyle;
import com.instagram.api.schemas.OnFeedMessagesIntf;
import com.instagram.api.schemas.PrivacyDisclosureInfo;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.model.reels.Reel;
import com.instagram.model.shopping.ProductTag;
import com.instagram.tagging.model.Tag;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.webrtc.MediaStreamTrack;

public abstract class SUD {
    public static AndroidLink A00;
    public static String A01;
    public static AndroidLink A02;
    public static String A03;
    public static boolean A04;
    public static boolean A05;
    public static final 0bY A06 = DbW.A0G();

    public static final void A03(1Nv r13, 1Xj r14, AndroidLink androidLink, Q03 q03) {
        AndroidLink androidLink2 = A00;
        1Nv r7 = r13;
        1Xj r5 = r14;
        Q03 q032 = q03;
        if (androidLink2 != null) {
            if (!0qQ.A0K(r14.getId(), A01)) {
                A00 = null;
                A01 = null;
            }
            A05(r7, r14, androidLink2, q032, false, true);
            return;
        }
        androidLink2 = A02;
        if (androidLink2 != null) {
            if (0qQ.A0K(r14.getId(), A03)) {
                A04 = true;
                A05(r7, r14, androidLink2, q032, false, true);
                return;
            }
            A02 = null;
            A03 = null;
        }
        String Avj = androidLink.Avj();
        if (Avj != null) {
            String CHl = androidLink.CHl();
            A06(r7, q032, C9855RiU.A00(androidLink), Avj);
            if (0qQ.A0K(CHl, "com.whatsapp")) {
                AnonymousClass59S.A01(q032.A10, r5.getId(), 766847856);
            }
            if (C66580MXl.A1a("instagram://extbrowser", 1, Avj)) {
                C18574VuQ.A00(q032.A10).A02(r5, q032.A12.getModuleName());
            }
            UserSession userSession = q032.A10;
            FragmentActivity fragmentActivity = q032.A0z;
            Context A052 = DbT.A05(fragmentActivity);
            XSH xsh = XSH.PAGE_INSTAGRAM_STREAM;
            0qQ.A0B(xsh, 5);
            if (!VC4.A00(fragmentActivity, A052, xsh, userSession, r5, (C17519VYx) null, (Integer) null, (String) null, (String) null, (String) null)) {
                FH7.A06(fragmentActivity, userSession, AnonymousClass47L.AD_DESTINATION_DEEPLINK, (C49716F3b) null, Avj, CHl);
            }
            AnonymousClass3GX.A00(userSession).A07("instagram_deeplink");
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A05(1Nv r7, 1Xj r8, AndroidLink androidLink, Q03 q03, boolean z, boolean z2) {
        String str;
        02m r2;
        int i;
        String str2;
        AnonymousClass0eM r6 = q03.A14;
        C258403yx r1 = (C258403yx) r6.getValue();
        r1.A01(TVY.A00);
        02m r22 = r1.A00;
        if (r22 != null) {
            r22.markerPoint(1056313521, "open_web_link");
        }
        if (A08(r7, androidLink, q03)) {
            C258403yx r12 = (C258403yx) r6.getValue();
            r12.A01(TVZ.A00);
            r2 = r12.A00;
            if (r2 != null) {
                i = 1056313521;
                str2 = "open_web_link_in_app";
            } else {
                return;
            }
        } else {
            A05 = z;
            if (z2) {
                A02 = androidLink;
                str = r8.getId();
            } else {
                str = null;
                A02 = null;
            }
            A03 = str;
            C258403yx r13 = (C258403yx) r6.getValue();
            r13.A01(C13327TVa.A00);
            02m r23 = r13.A00;
            if (r23 != null) {
                r23.markerPoint(1056313521, "open_web_link_in_browser");
            }
            SUL A012 = A01(r8, androidLink, q03, false);
            Fragment fragment = q03.A0y;
            IgFragmentActivity igFragmentActivity = (IgFragmentActivity) A012.A1H;
            if (igFragmentActivity != null) {
                igFragmentActivity.registerOnActivityResultListener(new C50298FXd(3, A012, igFragmentActivity));
            }
            SUL.A02(fragment, A012, 1);
            C258403yx r14 = (C258403yx) r6.getValue();
            r14.A01(TVX.A00);
            r2 = r14.A00;
            if (r2 != null) {
                i = 1056313521;
                str2 = "on_browser_launch";
            } else {
                return;
            }
        }
        r2.markerPoint(i, str2);
    }

    public static final void A06(1Nv r37, Q03 q03, String str, String str2) {
        0jB r2;
        long j;
        String str3;
        User user;
        1Nv r4 = r37;
        0qQ.A0B(r4, 0);
        Q03 q032 = q03;
        UserSession userSession = q032.A10;
        FragmentActivity fragmentActivity = q032.A0z;
        0qQ.A0B(fragmentActivity, 1);
        ((C11240SHa) userSession.A01(C11240SHa.class, new MMZ(17, (Object) fragmentActivity.getApplicationContext(), (Object) userSession))).A01(r4.ByO(userSession), Long.valueOf(AnonymousClass7TG.A0I()));
        2EG r1 = 2EG.A3M;
        2EG r7 = q032.A13;
        String str4 = str;
        String str5 = str2;
        if (r1 == r7) {
            AnonymousClass3OA r12 = q032.A0O;
            if (r12 != null) {
                str3 = r12.A0S;
            } else {
                str3 = null;
            }
            AnonymousClass4DU r13 = q032.A12;
            String obj = r7.toString();
            1Xj r8 = q032.A0J;
            if (r8 != null) {
                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r13, userSession), "instagram_ad_shopping_sheet_action");
                ArrayList A3A = r8.A3A();
                Long l = null;
                if (AnonymousClass4KJ.A00(A3A)) {
                    user = null;
                } else {
                    user = C14502TxO.A00(((ProductTag) A3A.get(0)).A02).A0B;
                }
                if (str3 == null) {
                    str3 = C231122qu.A07(userSession, r8);
                }
                if (user != null && str3 != null) {
                    User A2A = r8.A2A(userSession);
                    A2A.getClass();
                    A0e.A9F("a_pk", DbV.A0q(A2A.getId()));
                    C51970G9q.A17(A0e, Long.parseLong(str3));
                    A0e.AAJ(AnonymousClass000.A00(608), A2A.B6o().toString());
                    A0e.A7p(C273654mx.A00(776), (Boolean) null);
                    A0e.AAJ("m_pk", r8.getId());
                    A0e.A9F("m_t", DbS.A0j(r8.BR7().A00));
                    String A002 = AnonymousClass3ZA.A00(user);
                    A002.getClass();
                    A0e.AAE(C263944Ny.A00(A002), "merchant_id");
                    A0e.AAJ(AnonymousClass000.A00(4024), obj);
                    A0e.AAJ("action", str4);
                    A0e.AAJ("from", obj);
                    C51965G9l.A1L(A0e, r8.C9L());
                    A0e.AAJ("url", str5);
                    A0e.A7p(C273654mx.A00(773), Boolean.valueOf(C51969G9p.A1a(user.A03.BRp(), MerchantCheckoutStyle.NONE)));
                    ArrayList A3K = r8.A3K(true);
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    if (!AnonymousClass4KJ.A00(A3K)) {
                        Iterator it = A3K.iterator();
                        while (it.hasNext()) {
                            C66582MXn.A1N(((Product) it.next()).A0H, A1C);
                        }
                    }
                    A0e.AAe("product_ids", A1C);
                    ArrayList A3K2 = r8.A3K(true);
                    HashMap A1E = AnonymousClass7TE.A1E();
                    if (!AnonymousClass4KJ.A00(A3K2)) {
                        Iterator it2 = A3K2.iterator();
                        while (it2.hasNext()) {
                            Product product = (Product) it2.next();
                            String A003 = AnonymousClass3ZA.A00(product.A0B);
                            A003.getClass();
                            Long A0q = DbV.A0q(A003);
                            List A1B = Pxe.A1B(A0q, A1E);
                            if (A1B != null) {
                                A1B.add(DbV.A0q(product.A0H));
                            } else {
                                ArrayList A1C2 = AnonymousClass7TE.A1C();
                                C66582MXn.A1N(product.A0H, A1C2);
                                A1E.put(A0q, A1C2);
                            }
                        }
                    }
                    A0e.A9H(AnonymousClass000.A00(5131), A1E);
                    ArrayList A3E = r8.A3E();
                    ArrayList A1C3 = AnonymousClass7TE.A1C();
                    if (!AnonymousClass4KJ.A00(A3E)) {
                        Iterator it3 = A3E.iterator();
                        while (it3.hasNext()) {
                            A1C3.add(C263944Ny.A00(((Tag) it3.next()).getId()));
                        }
                    }
                    A0e.AAe(C273654mx.A00(983), A1C3);
                    A0e.AAJ(AnonymousClass000.A00(665), r8.A0C.BIl());
                    if (r8.A0C.Bdp() != null) {
                        l = DbV.A0q(r8.A0C.Bdp());
                    }
                    A0e.A9F("m_ix", l);
                    A0e.A9F("m_ts", Long.valueOf(r8.A1A()));
                    A0e.A9F(AnonymousClass000.A00(1580), DbV.A0q(A2A.getId()));
                    A0e.AAJ(AnonymousClass000.A00(150), r8.A0R);
                    A0e.A7p(C273654mx.A00(2926), false);
                    ArrayList A3K3 = r8.A3K(true);
                    ArrayList A1C4 = AnonymousClass7TE.A1C();
                    if (!AnonymousClass4KJ.A00(A3K3)) {
                        Iterator it4 = A3K3.iterator();
                        while (it4.hasNext()) {
                            Product product2 = (Product) it4.next();
                            if (product2.A01.A0F != null) {
                                C66582MXn.A1N(product2.A0H, A1C4);
                            }
                        }
                    }
                    A0e.AAe(C273654mx.A00(2295), A1C4);
                    A0e.Cgf();
                    return;
                }
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        } else if (!q032.A0o) {
            AnonymousClass4DU r15 = q032.A12;
            String obj2 = r7.toString();
            String str6 = q032.A0f;
            Integer valueOf = Integer.valueOf(q032.A09);
            C270594gz r132 = q032.A11;
            int i = q032.A0B;
            Integer num = q032.A0Y;
            IntentAwareAdsInfoIntf intentAwareAdsInfoIntf = q032.A0H;
            String str7 = q032.A0h;
            String str8 = q032.A0e;
            Float valueOf2 = Float.valueOf(q032.A06);
            Float valueOf3 = Float.valueOf(q032.A07);
            C257603xf r5 = q032.A0F;
            String id = r4.getId();
            if (id != null) {
                0eP r22 = GFX.A00;
                0jB r16 = null;
                if (!(r22 == null || !id.equals(r22.A00) || (r2 = (0jB) r22.A01) == null)) {
                    0eP r11 = GFX.A01;
                    if (r11 == null || !id.equals(r11.A00)) {
                        j = 0;
                    } else {
                        j = AnonymousClass7TE.A0R(r11.A01);
                    }
                    r2.A04(C271774jZ.A71, Long.valueOf(Pxe.A0C(j)));
                    r16 = r2;
                }
                0jB r23 = q032.A0I;
                0jB r17 = r23;
                UserSession userSession2 = userSession;
                C270594gz r19 = r132;
                1Nv r20 = r4;
                AnonymousClass4DU r21 = r15;
                C257603xf r14 = r5;
                IntentAwareAdsInfoIntf intentAwareAdsInfoIntf2 = intentAwareAdsInfoIntf;
                C233822wX.A04(r14, intentAwareAdsInfoIntf2, r16, r17, userSession2, r19, r20, r21, Boolean.valueOf(q032.A0l), Boolean.valueOf(q032.A0k), valueOf2, valueOf3, Float.valueOf(q032.A05), Float.valueOf(q032.A04), Float.valueOf(q032.A01), Float.valueOf(q032.A00), valueOf, num, q032.A0X, obj2, str4, str5, str6, str7, str8, q032.A0c, i);
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }

    public static final void A07(AndroidLink androidLink, Q03 q03, AnonymousClass37D r9, String str, String str2) {
        OnFeedMessagesIntf BTY;
        String str3;
        AnonymousClass47L r1;
        AnonymousClass6a7 r0;
        if (str == null) {
            0wb r2 = 0wb.A01;
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Entry point is null due to unmatched UrlSource: ");
            r2.Ew0("openDirectReplayFailed", AnonymousClass7TF.A0i(q03.A13, A1A));
            C59689JTv.A0F(q03.A0z, "open_link_generic_error", 2131969037);
            return;
        }
        UserSession userSession = q03.A10;
        0xY AR4 = 1Au.A00(userSession).A01.AR4();
        AR4.E5T("has_seen_direct_reply_bottom_sheet", true);
        AR4.apply();
        OOA A062 = 1as.A04.A02.A06(q03.A12, userSession, str);
        Bundle bundle = A062.A01;
        bundle.putString(C66579MXk.A00(224), (String) null);
        bundle.putString(C66579MXk.A00(212), str2);
        Reel reel = q03.A0M;
        if (reel != null) {
            String str4 = q03.A0g;
            if (str4 != null) {
                A062.A04(str4);
                A062.A03(reel.getId());
                A062.A06(userSession.A06);
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        } else {
            1Xj r02 = q03.A0J;
            if (r02 != null) {
                A062.A02(r02.getId());
                1Xj r03 = q03.A0J;
                0qQ.A0B(r03, 1);
                IGCTMessagingAdsInfoDictIntf A002 = C231122qu.A00(userSession, r03);
                if (!(A002 == null || (BTY = A002.BTY()) == null || !AnonymousClass3ZN.A02(BTY))) {
                    PrivacyDisclosureInfo Bfm = A002.Bfm();
                    if (Bfm != null) {
                        str3 = Bfm.Bfo();
                    } else {
                        str3 = null;
                    }
                    bundle.putString(C66579MXk.A00(299), str3);
                }
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
        if (androidLink != null) {
            r1 = C271714jT.A01(androidLink);
        } else {
            r1 = null;
        }
        if (r1 == AnonymousClass47L.AD_DESTINATION_DIRECT_MESSAGE) {
            bundle.putString(C66579MXk.A00(530), "_ctd");
        }
        r9.A0J(A062.A00());
        if (reel != null && (r0 = q03.A0W) != null) {
            r0.A01();
        }
    }

    public static final boolean A09(1Nv r7, AndroidLink androidLink, Q03 q03, String str) {
        A06(r7, q03, str, androidLink.Avj());
        UserSession userSession = q03.A10;
        FragmentActivity fragmentActivity = q03.A0z;
        String Avj = androidLink.Avj();
        if (Avj != null) {
            0qQ.A0B(fragmentActivity, 1);
            return FG7.A02(FG7.A00(userSession, Avj, MediaStreamTrack.VIDEO_TRACK_KIND, false), fragmentActivity, userSession, (AnonymousClass4DU) null, true);
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final XSH A00(Q03 q03) {
        1sy r2;
        1sy r22;
        AnonymousClass3W1 r3 = q03.A0K;
        1sy r1 = null;
        if (r3 != null) {
            r2 = r3.A0o;
        } else {
            r2 = null;
        }
        if (r2 != 1sy.A0A) {
            if (r3 != null) {
                r22 = r3.A0o;
            } else {
                r22 = null;
            }
            if (r22 != 1sy.A0B) {
                if (r3 != null) {
                    r1 = r3.A0o;
                }
                if (r1 == 1sy.A07) {
                    return XSH.PAGE_INSTAGRAM_REELS_TAB;
                }
                if (q03.A0M != null) {
                    return XSH.PAGE_INSTAGRAM_STORY;
                }
                return XSH.PAGE_INSTAGRAM_STREAM;
            }
        }
        return XSH.PAGE_INSTAGRAM_EXPLORE_CONTEXTUAL;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: com.facebook.iabadscontext.IABAdsMetaCheckoutPaymentsSDKDataExtension} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: com.facebook.iabadscontext.IABAdsMetaCheckoutPaymentsSDKDataExtension} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: com.facebook.iabadscontext.ReceiverInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: com.facebook.browser.lite.extensions.igleadformextension.IGLeadFormExtensionModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: com.facebook.browser.lite.extensions.igleadformextension.IGLeadFormExtensionModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: com.facebook.browser.lite.extensions.igleadformextension.IGLeadFormExtensionModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v2, resolved type: com.facebook.browser.lite.extensions.igleadformextension.IGLeadFormExtensionModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: com.facebook.browser.lite.extensions.igleadformextension.IGLeadFormExtensionModel} */
    /* JADX WARNING: type inference failed for: r8v7 */
    /* JADX WARNING: type inference failed for: r5v21, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r8v20 */
    /* JADX WARNING: type inference failed for: r8v21 */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0047, code lost:
        if (r3 != null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0370, code lost:
        if (r3 == null) goto L_0x0372;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0499, code lost:
        if (r3 != 1) goto L_0x049b;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x04a2  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x04e0  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x056e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.SUL A01(X.1Xj r65, com.instagram.model.androidlink.AndroidLink r66, X.Q03 r67, boolean r68) {
        /*
            r19 = 0
            r6 = 1
            r10 = 2
            r30 = r66
            r0 = r30
            X.0qQ.A0B(r0, r10)
            r0 = r67
            com.instagram.common.session.UserSession r1 = r0.A10
            com.instagram.model.reels.Reel r2 = r0.A0M
            r29 = r2
            X.3OA r3 = r0.A0O
            r2 = r65
            if (r29 == 0) goto L_0x0620
            r3 = r29
            java.lang.String r15 = r3.ByO(r1)
        L_0x001f:
            if (r68 == 0) goto L_0x061b
            A00 = r66
            java.lang.String r3 = r2.getId()
        L_0x0027:
            A01 = r3
            androidx.fragment.app.Fragment r3 = r0.A0y
            r68 = r3
            java.lang.String r64 = r30.CGH()
            if (r64 == 0) goto L_0x062c
            X.2EG r3 = r0.A13
            r65 = r3
            java.lang.String r28 = r2.getId()
            java.lang.String r27 = X.C231122qu.A07(r1, r2)
            X.3OA r3 = r0.A0O
            if (r3 == 0) goto L_0x060b
            com.google.common.collect.ImmutableList r3 = r3.A00
            r26 = r3
            if (r3 == 0) goto L_0x060b
        L_0x0049:
            java.lang.String r25 = r30.BkT()
            X.4DU r3 = r0.A12
            java.lang.String r24 = r3.getModuleName()
            java.lang.String r3 = r0.A0j
            r67 = r3
            java.lang.String r3 = r0.A0i
            r66 = r3
            r23 = 0
            java.lang.String r22 = X.C231122qu.A0G(r1, r2)
            X.1wP r3 = X.1wN.A00(r1)
            X.3OA r3 = r3.A00(r2)
            if (r3 == 0) goto L_0x05fa
            java.lang.String r8 = r3.A0V
        L_0x006d:
            r21 = 0
            if (r8 == 0) goto L_0x008f
            java.lang.String r7 = r2.C9L()
            boolean r3 = X.0mp.A0B(r8)
            if (r3 != 0) goto L_0x008f
            X.0Tu r5 = X.0Tu.A05
            r3 = 36317264202437586(0x81065c000013d2, double:3.030522347282048E-306)
            boolean r3 = X.182.A06(r5, r1, r3)
            if (r3 == 0) goto L_0x008f
            com.facebook.browser.lite.extensions.igcallextension.IGCallExtensionModel r21 = new com.facebook.browser.lite.extensions.igcallextension.IGCallExtensionModel
            r3 = r21
            r3.<init>(r7, r8)
        L_0x008f:
            java.lang.String r20 = r30.CGH()
            java.lang.String r42 = X.C231122qu.A07(r1, r2)
            if (r42 != 0) goto L_0x0254
            r9 = r23
        L_0x009b:
            int r7 = r0.A09
            boolean r3 = r2.A5W()
            r5 = 0
            if (r3 == 0) goto L_0x00ff
            com.instagram.user.model.User r3 = r2.A2A(r1)
            if (r3 == 0) goto L_0x00ff
            java.lang.String r4 = X.C231122qu.A07(r1, r2)
            X.4Cl r8 = r3.A03
            java.lang.Integer r8 = r8.B70()
            int r42 = X.DbX.A01(r8)
            boolean r8 = r2.A5D()
            if (r8 == 0) goto L_0x0250
            X.1Xj r8 = r2.A1c(r7)
            if (r8 == 0) goto L_0x00ca
            X.1Xy r5 = r8.A0C
        L_0x00c6:
            java.lang.String r5 = r5.BMq()
        L_0x00ca:
            r33 = r5
            java.lang.String r32 = X.C231122qu.A0G(r1, r2)
            com.instagram.common.typedurl.ImageUrl r31 = r3.Bh3()
            java.lang.String r34 = r2.C9L()
            java.lang.String r36 = r30.BM9()
            java.lang.String r37 = r2.getId()
            java.lang.String r38 = r65.toString()
            java.lang.String r39 = r2.A33(r7)
            boolean r43 = X.1sx.A0G(r1, r4)
            java.lang.String r40 = X.C231122qu.A09(r1, r2)
            X.4Cl r3 = r3.A03
            java.lang.String r41 = r3.getFbidV2()
            com.facebook.browser.lite.extensions.igleadformextension.IGLeadFormExtensionModel r5 = new com.facebook.browser.lite.extensions.igleadformextension.IGLeadFormExtensionModel
            r30 = r5
            r35 = r4
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
        L_0x00ff:
            androidx.fragment.app.FragmentActivity r3 = r0.A0z
            boolean r3 = X.0oI.A0G(r3)
            r7 = 0
            if (r3 == 0) goto L_0x014f
            X.1wP r3 = X.1wN.A00(r1)
            X.3OA r3 = r3.A00(r2)
            if (r3 == 0) goto L_0x0116
            X.3y2 r10 = r3.A0D
            if (r10 != 0) goto L_0x0122
        L_0x0116:
            X.1Xy r3 = r2.A0C
            X.3lZ r3 = r3.getInjected()
            if (r3 == 0) goto L_0x014f
            X.3y2 r10 = r3.BSA()
        L_0x0122:
            if (r10 == 0) goto L_0x014f
            java.lang.String r4 = r10.BSB()
            java.lang.String r3 = "whatsapp"
            boolean r3 = X.0qQ.A0K(r4, r3)
            if (r3 == 0) goto L_0x014f
            X.0Tu r8 = X.0Tu.A05
            r3 = 36321000823989256(0x8109c200002408, double:3.032885401797491E-306)
            boolean r3 = X.182.A06(r8, r1, r3)
            if (r3 == 0) goto L_0x014f
            java.lang.String r4 = r10.BSB()
            java.lang.String r3 = r10.AYR()
            java.lang.String r2 = X.C231122qu.A07(r1, r2)
            com.facebook.browser.lite.extensions.whatsapp.CTWABrowserCTAExtensionModel r7 = new com.facebook.browser.lite.extensions.whatsapp.CTWABrowserCTAExtensionModel
            r7.<init>(r4, r3, r2)
        L_0x014f:
            if (r29 == 0) goto L_0x024d
            java.lang.String r4 = r29.getId()
        L_0x0155:
            androidx.fragment.app.FragmentActivity r61 = r68.requireActivity()
            X.SUL r3 = new X.SUL
            r60 = r3
            r62 = r1
            r63 = r65
            r65 = r19
            r60.<init>(r61, r62, r63, r64, r65)
            r2 = r25
            r3.A0P = r2
            java.util.List r2 = java.util.Collections.unmodifiableList(r26)
            r3.A0T = r2
            r2 = r28
            r3.A0C(r2)
            r2 = r27
            r3.A0B(r2)
            r2 = r24
            r3.A0S = r2
            r3.A0D(r15)
            r2 = r67
            r3.A0F(r2)
            X.QKn r8 = r3.A1L
            android.os.Bundle r11 = r8.A00
            java.lang.String r10 = "TrackingInfo.ARG_REEL_TRAY_SESSION_ID"
            r2 = r66
            r11.putString(r10, r2)
            r2 = r23
            r3.A0Q = r2
            if (r22 == 0) goto L_0x01a0
            android.os.Bundle r11 = r8.A00
            java.lang.String r10 = "TrackingInfo.ARG_ADVERTISER_NAME"
            r2 = r22
            r11.putString(r10, r2)
        L_0x01a0:
            android.os.Bundle r10 = r8.A00
            java.lang.String r2 = "TrackingInfo.ARG_REEL_ID"
            r10.putString(r2, r4)
            r2 = r21
            r3.A06 = r2
            r3.A0B = r9
            r3.A08 = r5
            r3.A07 = r7
            boolean r2 = r0.A0n
            r3.A0w = r2
            com.instagram.api.schemas.IGAdsIABScreenshotDataDict r2 = r0.A0G
            r3.A0E = r2
            boolean r2 = r0.A0o
            r3.A10 = r2
            java.lang.String r5 = r0.A0b
            android.os.Bundle r4 = r8.A00
            java.lang.String r2 = "TrackingInfo.ARG_CALLSITE_SESSION_ID"
            r4.putString(r2, r5)
            boolean r2 = A05
            if (r2 == 0) goto L_0x01d0
            r3.A0v = r6
            boolean r2 = A04
            r3.A0u = r2
        L_0x01d0:
            boolean r2 = r0.A0q
            if (r2 == 0) goto L_0x024c
            X.0Tu r7 = X.0Tu.A06
            r4 = 37166009869730200(0x840a4a00010198, double:3.567272524902381E-306)
            double r4 = X.182.A00(r7, r1, r4)
            r3.A0z = r6
            boolean r2 = r0.A0s
            r3.A13 = r2
            float r2 = (float) r4
            r3.A03 = r2
            r2 = r19
            r3.A14 = r2
            X.SHR r4 = r0.A0U
            boolean r2 = X.AnonymousClass7TF.A1V(r4)
            r3.A0c = r2
            r3.A1B = r6
            r3.A11 = r6
            r3.A18 = r6
            r3.A0d = r6
            r3.A0f = r6
            X.4Gp r2 = r0.A0S
            r3.A0J = r2
            X.S6e r2 = r0.A0T
            r3.A0K = r2
            X.Tht r2 = r0.A0R
            r3.A0I = r2
            r3.A0L = r4
            r4 = 36321584940918320(0x810a4a00152630, double:3.0332547996954813E-306)
            boolean r2 = X.182.A06(r7, r1, r4)
            r3.A1A = r2
            float r2 = r0.A03
            r3.A02 = r2
            r3.A17 = r6
            X.4mf r2 = r0.A0Q
            if (r2 == 0) goto L_0x0227
            r3.A0F = r2
            boolean r2 = r0.A0u
            r3.A16 = r2
        L_0x0227:
            boolean r2 = r0.A0t
            if (r2 == 0) goto L_0x0240
            r3.A0k = r6
            float r2 = r0.A02
            r3.A01 = r2
            r4 = 36321584940525100(0x810a4a000f262c, double:3.0332547994468074E-306)
            boolean r1 = X.182.A06(r7, r1, r4)
            r3.A0i = r1
            r3.A15 = r6
            r3.A0b = r6
        L_0x0240:
            boolean r1 = r0.A0r
            if (r1 != 0) goto L_0x024c
            r1 = r19
            r3.A0y = r1
            int r0 = r0.A08
            r3.A04 = r0
        L_0x024c:
            return r3
        L_0x024d:
            r4 = 0
            goto L_0x0155
        L_0x0250:
            X.1Xy r5 = r2.A0C
            goto L_0x00c6
        L_0x0254:
            X.3lK r7 = X.C231122qu.A01(r1, r2)
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            if (r7 == 0) goto L_0x027c
            java.util.List r3 = r7.B0f()
            if (r3 == 0) goto L_0x027c
            java.util.Iterator r4 = r3.iterator()
        L_0x0268:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L_0x027c
            java.lang.Object r3 = r4.next()
            com.instagram.api.schemas.IGPostClickEligibleExperienceTypes r3 = (com.instagram.api.schemas.IGPostClickEligibleExperienceTypes) r3
            X.RFY r3 = X.C2816959a.A00(r3)
            r11.add(r3)
            goto L_0x0268
        L_0x027c:
            java.util.LinkedHashMap r18 = X.AnonymousClass7TE.A1H()
            if (r7 == 0) goto L_0x02e8
            java.util.List r3 = r7.BE2()
            if (r3 == 0) goto L_0x02e8
            java.util.Iterator r14 = r3.iterator()
        L_0x028c:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto L_0x02e8
            java.lang.Object r9 = r14.next()
            X.DTE r9 = (X.DTE) r9
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.List r3 = r9.Axn()
            if (r3 == 0) goto L_0x02cf
            java.util.Iterator r13 = r3.iterator()
        L_0x02a6:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto L_0x02cf
            java.lang.Object r4 = r13.next()
            X.DTF r4 = (X.DTF) r4
            java.lang.Integer r3 = r4.BXp()
            int r12 = X.AnonymousClass7TG.A0A(r3)
            java.lang.Integer r3 = r4.BMP()
            int r5 = X.DbX.A01(r3)
            java.lang.String r4 = r4.getUrl()
            com.facebook.iabadscontext.DisclaimerBodyUrlRanges r3 = new com.facebook.iabadscontext.DisclaimerBodyUrlRanges
            r3.<init>(r12, r5, r4)
            r8.add(r3)
            goto L_0x02a6
        L_0x02cf:
            com.instagram.api.schemas.IGPostClickEligibleExperienceTypes r3 = r9.B0e()
            if (r3 == 0) goto L_0x028c
            X.RFY r5 = X.C2816959a.A00(r3)
            java.lang.String r3 = r9.Axp()
            com.facebook.iabadscontext.DisclaimerText r4 = new com.facebook.iabadscontext.DisclaimerText
            r4.<init>(r3, r8)
            r3 = r18
            r3.put(r5, r4)
            goto L_0x028c
        L_0x02e8:
            X.0Tu r5 = X.0Tu.A05
            r3 = 36315992892444508(0x81053400050f5c, double:3.029718365723271E-306)
            boolean r9 = X.182.A06(r5, r1, r3)
            com.facebook.iabadscontext.MetaCheckoutExperienceType r4 = com.facebook.iabadscontext.MetaCheckoutExperienceType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            com.facebook.iabadscontext.IABAdsMetaCheckoutDataExtension r14 = new com.facebook.iabadscontext.IABAdsMetaCheckoutDataExtension
            r14.<init>(r4)
            if (r7 == 0) goto L_0x05d9
            X.4fx r3 = r7.BSX()
            if (r3 == 0) goto L_0x05d9
            java.lang.String r8 = r3.BSW()
        L_0x0306:
            java.lang.String r3 = "BAU_WEB_CHECKOUT"
            boolean r3 = X.0qQ.A0K(r8, r3)
            if (r3 == 0) goto L_0x05cd
            com.facebook.iabadscontext.MetaCheckoutExperienceType r4 = com.facebook.iabadscontext.MetaCheckoutExperienceType.BAU_WEB_CHECKOUT
        L_0x0310:
            if (r9 == 0) goto L_0x05c7
            com.facebook.iabadscontext.MetaCheckoutExperienceType r3 = com.facebook.iabadscontext.MetaCheckoutExperienceType.ONSITE_SHOPIFY_SDK_CHECKOUT
            if (r4 != r3) goto L_0x05c7
        L_0x0316:
            com.facebook.iabadscontext.IABAdsMetaCheckoutDataExtension r14 = new com.facebook.iabadscontext.IABAdsMetaCheckoutDataExtension
            r14.<init>(r4)
        L_0x031b:
            r3 = 36313514697426992(0x8102f300160830, double:3.028151145215303E-306)
            boolean r3 = X.182.A06(r5, r1, r3)
            if (r3 == 0) goto L_0x05bf
            r8 = 0
            if (r7 == 0) goto L_0x03ae
            X.4fy r4 = r7.BSb()
            if (r4 == 0) goto L_0x03ae
            X.RFY r3 = X.RFY.IAB_META_CHECKOUT_METAPAYMENTS_SDK
            boolean r3 = r11.contains(r3)
            if (r3 == 0) goto L_0x03ae
            X.TjM r16 = r4.An7()
            if (r16 == 0) goto L_0x03ae
            X.TjK r3 = r16.Bb0()
            if (r3 == 0) goto L_0x05b9
            java.util.List r4 = r3.C38()
            if (r4 != 0) goto L_0x034b
            X.0sn r4 = X.0sn.A00
        L_0x034b:
            java.lang.String r3 = r3.Bb5()
            if (r3 != 0) goto L_0x0356
            java.lang.String r3 = new java.lang.String
            r3.<init>()
        L_0x0356:
            com.facebook.iabadscontext.PaymentConfig r13 = new com.facebook.iabadscontext.PaymentConfig
            r13.<init>(r4, r3)
            X.TjJ r9 = r16.Ae9()
            r4 = 0
            if (r9 == 0) goto L_0x0372
            java.lang.Boolean r3 = r9.CPB()
            if (r3 == 0) goto L_0x036c
            boolean r4 = r3.booleanValue()
        L_0x036c:
            java.util.List r3 = r9.AeA()
            if (r3 != 0) goto L_0x0374
        L_0x0372:
            X.0sn r3 = X.0sn.A00
        L_0x0374:
            com.facebook.iabadscontext.Availability r12 = new com.facebook.iabadscontext.Availability
            r12.<init>(r3, r4)
            X.TjL r3 = r16.Bk3()
            if (r3 == 0) goto L_0x03a2
            java.lang.String r9 = r3.getId()
            if (r9 != 0) goto L_0x038a
            java.lang.String r9 = new java.lang.String
            r9.<init>()
        L_0x038a:
            java.lang.String r4 = r3.getName()
            if (r4 != 0) goto L_0x0395
            java.lang.String r4 = new java.lang.String
            r4.<init>()
        L_0x0395:
            java.util.List r3 = r3.CDG()
            if (r3 != 0) goto L_0x039d
            X.0sn r3 = X.0sn.A00
        L_0x039d:
            com.facebook.iabadscontext.ReceiverInfo r8 = new com.facebook.iabadscontext.ReceiverInfo
            r8.<init>(r9, r4, r3)
        L_0x03a2:
            com.facebook.iabadscontext.CheckoutSetupPayload r3 = new com.facebook.iabadscontext.CheckoutSetupPayload
            r3.<init>(r12, r13, r8)
            com.facebook.iabadscontext.IABAdsMetaCheckoutPaymentsSDKDataExtension r8 = new com.facebook.iabadscontext.IABAdsMetaCheckoutPaymentsSDKDataExtension
            r4 = r20
            r8.<init>(r3, r4)
        L_0x03ae:
            if (r7 == 0) goto L_0x05b5
            java.lang.Long r3 = r7.BGd()
            if (r3 == 0) goto L_0x05b5
            long r3 = r3.longValue()
            int r9 = (int) r3
            java.lang.Integer r41 = java.lang.Integer.valueOf(r9)
        L_0x03bf:
            java.util.List r3 = X.00k.A0a(r11)
            com.google.common.collect.ImmutableList r40 = X.DbU.A0K(r3)
            X.1Xy r3 = r2.A0C
            com.instagram.user.model.User r3 = r3.CCd()
            if (r3 == 0) goto L_0x05b1
            com.instagram.common.typedurl.ImageUrl r3 = r3.Bh3()
            java.lang.String r43 = r3.getUrl()
        L_0x03d7:
            X.1Xy r3 = r2.A0C
            java.lang.String r3 = r3.AnT()
            if (r3 == 0) goto L_0x05ad
            java.util.List r45 = X.AnonymousClass7TE.A1I(r3)
        L_0x03e3:
            java.lang.String r49 = r2.getId()
            X.0wc r46 = X.AnonymousClass0kN.A02(r1)
            r3 = 36320979349414900(0x8109bd000423f4, double:3.032871821190197E-306)
            boolean r50 = X.182.A06(r5, r1, r3)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r50)
            r3 = 36320979350463478(0x8109bd001423f6, double:3.032871821853322E-306)
            boolean r51 = X.182.A06(r5, r1, r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r51)
            if (r7 == 0) goto L_0x05aa
            X.4fv r5 = r7.Aj7()
        L_0x040b:
            java.lang.Integer r56 = X.AnonymousClass05K.A0N
            com.facebook.iabbwpextension.IABBwPExtension r39 = new com.facebook.iabbwpextension.IABBwPExtension
            r31 = r39
            r32 = r56
            r33 = r20
            r34 = r23
            r35 = r23
            r36 = r23
            r37 = r23
            r38 = r19
            r31.<init>(r32, r33, r34, r35, r36, r37, r38)
            if (r50 != 0) goto L_0x0426
            if (r51 == 0) goto L_0x0591
        L_0x0426:
            if (r5 == 0) goto L_0x0591
            com.instagram.api.schemas.IGBuyWithPrimeExperienceTypes r3 = r5.Aj5()
            if (r3 == 0) goto L_0x058d
            int r3 = r3.ordinal()
            if (r3 == r6) goto L_0x0589
            if (r3 == r10) goto L_0x0585
            r4 = 3
            if (r3 != r4) goto L_0x058d
            r3 = r56
        L_0x043b:
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            if (r3 != r4) goto L_0x0441
            if (r50 == 0) goto L_0x0447
        L_0x0441:
            java.lang.Integer r4 = X.AnonymousClass05K.A0C
            if (r3 != r4) goto L_0x0557
            if (r51 != 0) goto L_0x0557
        L_0x0447:
            r47 = r3
            r48 = r42
            r52 = r19
            X.S8F.A00(r46, r47, r48, r49, r50, r51, r52)
        L_0x0450:
            com.facebook.iabadscontext.IgPromoAdsExtension r38 = X.C2816959a.A01(r7, r1, r2)
            if (r7 == 0) goto L_0x0553
            X.4fu r17 = r7.Aj2()
        L_0x045a:
            java.lang.Integer r13 = X.AnonymousClass05K.A0C
            java.lang.Integer r12 = X.AnonymousClass05K.A00
            r16 = 0
            java.lang.Integer r49 = java.lang.Integer.valueOf(r19)
            com.facebook.iabadscontext.IABAdsBwIntegrationExtension r32 = new com.facebook.iabadscontext.IABAdsBwIntegrationExtension
            r46 = r32
            r47 = r13
            r48 = r12
            r50 = r23
            r51 = r20
            r52 = r23
            r53 = r23
            r54 = r23
            r55 = r23
            r46.<init>(r47, r48, r49, r50, r51, r52, r53, r54, r55)
            X.0wc r46 = X.AnonymousClass0kN.A02(r1)
            java.util.HashMap r9 = X.AnonymousClass7TE.A1E()
            if (r17 == 0) goto L_0x04fb
            com.instagram.api.schemas.BuyWithIntegrationPostClickExperienceTypes r3 = r17.Aj3()
            if (r3 == 0) goto L_0x049b
            int r3 = r3.ordinal()
            if (r3 == r10) goto L_0x054f
            r4 = 3
            if (r3 == r4) goto L_0x054c
            r4 = 4
            if (r3 == r4) goto L_0x054c
            r5 = r56
            if (r3 == r6) goto L_0x049c
        L_0x049b:
            r5 = r12
        L_0x049c:
            com.instagram.api.schemas.PartnerTypes r3 = r17.Baq()
            if (r3 == 0) goto L_0x0548
            int r3 = r3.ordinal()
            if (r3 == r6) goto L_0x0544
            r4 = 3
            if (r3 == r4) goto L_0x04b0
            r4 = 4
            if (r3 != r4) goto L_0x0548
            java.lang.Integer r56 = X.AnonymousClass05K.A0Y
        L_0x04b0:
            java.lang.String r4 = X.RVT.A00(r56)
            java.lang.String r3 = "PARTNER_TYPE"
            r9.put(r3, r4)
            java.lang.Long r3 = X.AnonymousClass7TE.A10(r42)
            long r50 = X.DbY.A04(r3)
            java.lang.String r47 = "PRE_CLICK_AD_PROCESSING"
            r48 = r23
            r49 = r9
            X.RU7.A00(r46, r47, r48, r49, r50)
            if (r5 == r13) goto L_0x04fb
            if (r5 == r12) goto L_0x04fb
            java.lang.Long r58 = r17.BXh()
            java.lang.String r60 = r17.Ac0()
            java.lang.String r61 = r17.getAccessToken()
            java.lang.Integer r3 = r17.AXl()
            if (r3 == 0) goto L_0x04e4
            int r16 = r3.intValue()
        L_0x04e4:
            java.lang.Integer r57 = java.lang.Integer.valueOf(r16)
            java.lang.String r62 = r17.AfY()
            java.lang.String r63 = r17.BaI()
            com.facebook.iabadscontext.IABAdsBwIntegrationExtension r32 = new com.facebook.iabadscontext.IABAdsBwIntegrationExtension
            r54 = r32
            r55 = r5
            r59 = r20
            r54.<init>(r55, r56, r57, r58, r59, r60, r61, r62, r63)
        L_0x04fb:
            r3 = 0
            if (r7 == 0) goto L_0x05e1
            X.4fw r5 = r7.BDy()
            if (r5 == 0) goto L_0x05e1
            X.RFY r4 = X.RFY.IAB_AUTOFILL_ADS_PERSONALIZATION
            boolean r4 = r11.contains(r4)
            if (r4 == 0) goto L_0x05e1
            com.instagram.api.schemas.IGAdCreationOptimizationPayloadDict r4 = r5.AYz()
            if (r4 == 0) goto L_0x05e1
            java.util.List r4 = r4.AYy()
            if (r4 == 0) goto L_0x05e1
            java.util.ArrayList r7 = X.AnonymousClass7TG.A0r(r4)
            java.util.Iterator r9 = r4.iterator()
        L_0x0520:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x05dc
            java.lang.Object r3 = r9.next()
            com.instagram.api.schemas.IGAdCreativeOptimizationConfigByTypeDict r3 = (com.instagram.api.schemas.IGAdCreativeOptimizationConfigByTypeDict) r3
            java.lang.String r5 = r3.BYY()
            if (r5 == 0) goto L_0x0541
            java.lang.String r4 = r3.BYb()
            if (r4 == 0) goto L_0x0541
            com.facebook.iabadscontext.IabAdCreativeOptimizationConfigByType r3 = new com.facebook.iabadscontext.IabAdCreativeOptimizationConfigByType
            r3.<init>(r5, r4)
        L_0x053d:
            r7.add(r3)
            goto L_0x0520
        L_0x0541:
            r3 = r23
            goto L_0x053d
        L_0x0544:
            java.lang.Integer r56 = X.AnonymousClass05K.A01
            goto L_0x04b0
        L_0x0548:
            r56 = r12
            goto L_0x04b0
        L_0x054c:
            r5 = r13
            goto L_0x049c
        L_0x054f:
            java.lang.Integer r5 = X.AnonymousClass05K.A01
            goto L_0x049c
        L_0x0553:
            r17 = 0
            goto L_0x045a
        L_0x0557:
            r47 = r3
            r48 = r42
            r52 = r19
            X.S8F.A00(r46, r47, r48, r49, r50, r51, r52)
            java.lang.String r34 = r5.Ac0()
            java.lang.String r35 = r5.getAccessToken()
            java.lang.Integer r4 = r5.AXl()
            if (r4 == 0) goto L_0x0572
            int r38 = r4.intValue()
        L_0x0572:
            java.lang.String r36 = r5.AfY()
            java.lang.String r37 = r5.BaI()
            com.facebook.iabbwpextension.IABBwPExtension r39 = new com.facebook.iabbwpextension.IABBwPExtension
            r31 = r39
            r32 = r3
            r31.<init>(r32, r33, r34, r35, r36, r37, r38)
            goto L_0x0450
        L_0x0585:
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            goto L_0x043b
        L_0x0589:
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            goto L_0x043b
        L_0x058d:
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            goto L_0x043b
        L_0x0591:
            if (r5 != 0) goto L_0x0595
            r38 = 1
        L_0x0595:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r38)
            java.lang.Object[] r5 = new java.lang.Object[]{r9, r3, r4}
            java.lang.String r4 = "Not bwp session with bwp 1P flag %s, 3P flag %s and bwpExtension null being %s"
            boolean r3 = X.SQO.A00
            if (r3 == 0) goto L_0x0450
            r3 = r23
            java.lang.String.format(r3, r4, r5)
            goto L_0x0450
        L_0x05aa:
            r5 = 0
            goto L_0x040b
        L_0x05ad:
            X.0sn r45 = X.0sn.A00
            goto L_0x03e3
        L_0x05b1:
            r43 = 0
            goto L_0x03d7
        L_0x05b5:
            r41 = 0
            goto L_0x03bf
        L_0x05b9:
            X.0sn r4 = X.0sn.A00
            java.lang.String r3 = "LIVE"
            goto L_0x0356
        L_0x05bf:
            X.RFY r3 = X.RFY.IAB_META_CHECKOUT_METAPAYMENTS_SDK
            r11.remove(r3)
            r8 = 0
            goto L_0x03ae
        L_0x05c7:
            com.facebook.iabadscontext.MetaCheckoutExperienceType r3 = com.facebook.iabadscontext.MetaCheckoutExperienceType.BAU_WEB_CHECKOUT
            if (r4 != r3) goto L_0x031b
            goto L_0x0316
        L_0x05cd:
            java.lang.String r3 = "ONSITE_SHOPIFY_SDK_CHECKOUT"
            boolean r3 = X.0qQ.A0K(r8, r3)
            if (r3 == 0) goto L_0x0310
            com.facebook.iabadscontext.MetaCheckoutExperienceType r4 = com.facebook.iabadscontext.MetaCheckoutExperienceType.ONSITE_SHOPIFY_SDK_CHECKOUT
            goto L_0x0310
        L_0x05d9:
            r8 = 0
            goto L_0x0306
        L_0x05dc:
            com.facebook.iabadscontext.IABPostClickPersonalizationDataExtension r3 = new com.facebook.iabadscontext.IABPostClickPersonalizationDataExtension
            r3.<init>(r7)
        L_0x05e1:
            java.lang.String r44 = r2.C9L()
            com.facebook.iabadscontext.IABAdsContext r9 = new com.facebook.iabadscontext.IABAdsContext
            r31 = r9
            r33 = r14
            r34 = r8
            r35 = r23
            r36 = r3
            r37 = r23
            r46 = r18
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            goto L_0x009b
        L_0x05fa:
            X.1Xy r3 = r2.A0C
            X.3lZ r3 = r3.getInjected()
            if (r3 == 0) goto L_0x0608
            java.lang.String r8 = r3.Bby()
            goto L_0x006d
        L_0x0608:
            r8 = 0
            goto L_0x006d
        L_0x060b:
            java.util.List r3 = X.C231122qu.A0K(r1, r2)
            if (r3 == 0) goto L_0x0617
            java.util.ArrayList r26 = X.AnonymousClass7TE.A1D(r3)
            goto L_0x0049
        L_0x0617:
            X.0sn r26 = X.0sn.A00
            goto L_0x0049
        L_0x061b:
            r3 = 0
            A00 = r3
            goto L_0x0027
        L_0x0620:
            if (r3 == 0) goto L_0x0626
            java.lang.String r15 = r3.A0j
            if (r15 != 0) goto L_0x001f
        L_0x0626:
            java.lang.String r15 = X.C231122qu.A0F(r1, r2)
            goto L_0x001f
        L_0x062c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SUD.A01(X.1Xj, com.instagram.model.androidlink.AndroidLink, X.Q03, boolean):X.SUL");
    }

    /* JADX WARNING: type inference failed for: r6v5, types: [X.RRA, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01ac, code lost:
        if (r0 == null) goto L_0x01ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0029, code lost:
        if (r5.length() != 0) goto L_0x002c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C13879Tj0 r21, X.1Nv r22, X.1Xj r23, com.instagram.model.androidlink.AndroidLink r24, com.instagram.model.androidlink.AndroidLink r25, X.Q03 r26) {
        /*
            r3 = r26
            com.instagram.common.session.UserSession r12 = r3.A10
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318037296551691(0x8107100000170b, double:3.031011255112808E-306)
            boolean r4 = X.182.A06(r2, r12, r0)
            r0 = 36318037296617228(0x8107100001170c, double:3.031011255154254E-306)
            boolean r0 = X.182.A06(r2, r12, r0)
            java.lang.String r5 = r24.BgP()
            r16 = 0
            if (r4 == 0) goto L_0x00b2
            r1 = 1
            if (r0 == 0) goto L_0x002b
            if (r5 == 0) goto L_0x002b
            int r0 = r5.length()
            if (r0 != 0) goto L_0x002c
        L_0x002b:
            r1 = 0
        L_0x002c:
            java.lang.String r6 = r24.CHl()
            java.lang.String r10 = "Required value was null."
            if (r6 == 0) goto L_0x0203
            java.lang.String r4 = r24.BlB()
            if (r1 == 0) goto L_0x00af
            android.net.Uri r0 = X.0oI.A00
        L_0x003c:
            android.net.Uri$Builder r1 = r0.buildUpon()
            java.lang.String r0 = "id"
            r1.appendQueryParameter(r0, r6)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0051
            java.lang.String r0 = "referrer"
            r1.appendQueryParameter(r0, r4)
        L_0x0051:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x005c
            java.lang.String r0 = "listing"
            r1.appendQueryParameter(r0, r5)
        L_0x005c:
            android.net.Uri r0 = r1.build()
            java.lang.String r15 = X.DbT.A10(r0)
            java.lang.String r0 = X.C9855RiU.A00(r24)
            r1 = r22
            A06(r1, r3, r0, r15)
            X.VuQ r1 = X.C18574VuQ.A00(r12)
            X.4DU r0 = r3.A12
            java.lang.String r0 = r0.getModuleName()
            r7 = r23
            r1.A02(r7, r0)
            androidx.fragment.app.FragmentActivity r11 = r3.A0z
            r6 = 0
            X.0qQ.A0B(r11, r6)
            r8 = 1
            r0 = 36316667202048592(0x8105d100011250, double:3.0301448018321204E-306)
            boolean r0 = X.182.A06(r2, r12, r0)
            if (r0 == 0) goto L_0x00db
            r0 = 36598142178823278(0x8205d100020c6e, double:3.208150710553189E-306)
            int r1 = X.DbS.A04(r2, r12, r0)
            java.lang.String r0 = "com.facebook.katana"
            boolean r0 = X.0oI.A0H(r11, r0, r1)
            if (r0 == 0) goto L_0x00db
            boolean r0 = X.0oI.A0F(r11)
            if (r0 == 0) goto L_0x00db
            java.lang.String r0 = "market://"
            boolean r0 = X.C66580MXl.A1a(r0, r8, r15)
            if (r0 == 0) goto L_0x00db
            goto L_0x00b6
        L_0x00af:
            android.net.Uri r0 = X.0oI.A01
            goto L_0x003c
        L_0x00b2:
            r5 = r16
            goto L_0x002b
        L_0x00b6:
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()     // Catch:{ ActivityNotFoundException | IllegalAccessException | IllegalStateException | InstantiationException | NullPointerException -> 0x00d5 }
            java.lang.String r0 = "EXTRA_URL"
            r1.putString(r0, r15)     // Catch:{ ActivityNotFoundException | IllegalAccessException | IllegalStateException | InstantiationException | NullPointerException -> 0x00d5 }
            X.R8G r4 = new X.R8G     // Catch:{ ActivityNotFoundException | IllegalAccessException | IllegalStateException | InstantiationException | NullPointerException -> 0x00d5 }
            r4.<init>()     // Catch:{ ActivityNotFoundException | IllegalAccessException | IllegalStateException | InstantiationException | NullPointerException -> 0x00d5 }
            r4.setArguments(r1)     // Catch:{ ActivityNotFoundException | IllegalAccessException | IllegalStateException | InstantiationException | NullPointerException -> 0x00d5 }
            X.0s1 r1 = X.DbW.A0D(r11)     // Catch:{ ActivityNotFoundException | IllegalAccessException | IllegalStateException | InstantiationException | NullPointerException -> 0x00d5 }
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            r1.A09(r4, r0)     // Catch:{ ActivityNotFoundException | IllegalAccessException | IllegalStateException | InstantiationException | NullPointerException -> 0x00d5 }
            r1.A00()     // Catch:{ ActivityNotFoundException | IllegalAccessException | IllegalStateException | InstantiationException | NullPointerException -> 0x00d5 }
            goto L_0x00dd
        L_0x00d5:
            r1 = move-exception
            java.lang.String r0 = "ig_fb_google_playstore_overlay_helper"
            X.0wb.A08(r0, r1)
        L_0x00db:
            r0 = 0
            goto L_0x00de
        L_0x00dd:
            r0 = 1
        L_0x00de:
            java.lang.String r4 = "app"
            if (r0 != 0) goto L_0x015a
            X.F3b r14 = new X.F3b
            r14.<init>(r11, r12)
            X.47L r13 = X.AnonymousClass47L.AD_DESTINATION_APP_STORE
            X.FH7.A06(r11, r12, r13, r14, r15, r16)
            r0 = 694(0x2b6, float:9.73E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = X.00p.A0k(r15, r0, r6)
            if (r0 != 0) goto L_0x0110
            java.lang.String r0 = "https://play.google.com/d"
            boolean r0 = X.00p.A0k(r15, r0, r6)
            if (r0 != 0) goto L_0x0110
            java.lang.String r0 = "http://play.google.com/store/apps/details"
            boolean r0 = X.00p.A0k(r15, r0, r6)
            if (r0 != 0) goto L_0x0110
            java.lang.String r0 = "https://play.google.com/store/apps/details"
            boolean r0 = X.00p.A0k(r15, r0, r6)
            if (r0 == 0) goto L_0x0125
        L_0x0110:
            boolean r0 = r14.A01()
            if (r0 == 0) goto L_0x0125
            r0 = 36323629344173396(0x810c2600032d54, double:3.0345476885461425E-306)
            boolean r0 = X.182.A06(r2, r12, r0)
            if (r0 == 0) goto L_0x0125
            if (r5 == 0) goto L_0x01f5
            java.lang.String r4 = "hsdp csl"
        L_0x0125:
            X.RRA r6 = new X.RRA
            r6.<init>()
            long r0 = java.lang.System.currentTimeMillis()
            r6.A00 = r0
            r6.A03 = r3
            r6.A02 = r7
            androidx.fragment.app.Fragment r1 = r3.A0y
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.analytics.intf.AnalyticsModule"
            X.0qQ.A0C(r1, r0)
            X.0iw r1 = (X.AnonymousClass0iw) r1
            X.0wc r0 = X.AnonymousClass0kN.A01(r1, r12)
            r6.A01 = r0
            r6.A05 = r4
            r6.A04 = r15
            X.0r1 r9 = new X.0r1
            r9.<init>()
            X.07V r5 = r11.getLifecycle()
            r1 = 3
            X.SdS r0 = new X.SdS
            r0.<init>(r1, r6, r9)
            r5.A09(r0)
        L_0x015a:
            X.3GX r1 = X.AnonymousClass3GX.A00(r12)
            java.lang.String r0 = "instagram_appinstall"
            r1.A07(r0)
            java.lang.String r5 = X.C231122qu.A07(r12, r7)
            r0 = 36316954964792021(0x810614000012d5, double:3.0303267841497924E-306)
            boolean r0 = X.182.A06(r2, r12, r0)
            java.lang.String r6 = ""
            if (r0 == 0) goto L_0x0197
            android.content.Context r0 = X.DbT.A05(r11)
            X.215 r17 = X.213.A00(r0, r12)
            java.lang.String r19 = r24.CHl()
            if (r19 == 0) goto L_0x01fe
            r20 = r5
            if (r5 != 0) goto L_0x0188
            r20 = r6
        L_0x0188:
            if (r25 == 0) goto L_0x018e
            java.lang.String r16 = r25.Avj()
        L_0x018e:
            r18 = r21
            r21 = r16
            r22 = r4
            r17.A05(r18, r19, r20, r21, r22)
        L_0x0197:
            r0 = 36318166145570772(0x81072e000017d4, double:3.031092739751308E-306)
            boolean r0 = X.182.A06(r2, r12, r0)
            if (r0 == 0) goto L_0x01c1
            com.instagram.model.reels.Reel r1 = r3.A0M
            X.3OA r0 = r3.A0O
            if (r1 == 0) goto L_0x01e8
            java.lang.String r0 = r1.ByO(r12)
        L_0x01ac:
            if (r0 != 0) goto L_0x01f3
        L_0x01ae:
            if (r5 == 0) goto L_0x01c1
            android.content.Context r0 = X.DbT.A05(r11)
            X.2I2 r1 = X.2I0.A00(r0, r12)
            java.lang.String r0 = r24.CHl()
            if (r0 == 0) goto L_0x01f9
            r1.A01(r0, r5, r6, r4)
        L_0x01c1:
            X.59c r0 = X.C2817059b.A00(r12)
            com.instagram.common.session.UserSession r3 = r0.A00
            r0 = 36319046613867387(0x8107fb00001b7b, double:3.0316495514474487E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x01e7
            java.lang.String r2 = r24.Ac5()
            if (r2 == 0) goto L_0x01e7
            java.lang.String r1 = r24.BlB()
            if (r1 == 0) goto L_0x01e7
            java.lang.String r0 = r24.CHl()
            if (r0 == 0) goto L_0x01e7
            X.AnonymousClass59c.A00(r8, r2, r1, r0, r5)
        L_0x01e7:
            return
        L_0x01e8:
            if (r0 == 0) goto L_0x01ee
            java.lang.String r0 = r0.A0j
            if (r0 != 0) goto L_0x01f3
        L_0x01ee:
            java.lang.String r0 = X.C231122qu.A0F(r12, r7)
            goto L_0x01ac
        L_0x01f3:
            r6 = r0
            goto L_0x01ae
        L_0x01f5:
            java.lang.String r4 = "hsdp"
            goto L_0x0125
        L_0x01f9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r10)
            throw r0
        L_0x01fe:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r10)
            throw r0
        L_0x0203:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SUD.A02(X.Tj0, X.1Nv, X.1Xj, com.instagram.model.androidlink.AndroidLink, com.instagram.model.androidlink.AndroidLink, X.Q03):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x018e, code lost:
        r15 = X.C66579MXk.A00(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.1Nv r24, X.1Xj r25, com.instagram.model.androidlink.AndroidLink r26, X.Q03 r27, boolean r28) {
        /*
            r0 = r27
            com.instagram.model.reels.Reel r1 = r0.A0M
            r12 = r25
            if (r1 != 0) goto L_0x0096
            com.instagram.common.session.UserSession r11 = r0.A10
            X.1Av r2 = X.1Au.A00(r11)
            r4 = 1
            X.0xa r2 = r2.A01
            X.0xY r3 = r2.AR4()
            java.lang.String r2 = "has_seen_direct_reply_bottom_sheet"
            r3.E5T(r2, r4)
            r3.apply()
            androidx.fragment.app.FragmentActivity r8 = r0.A0z
            X.1Ng r3 = X.AnonymousClass1Nd.A00(r11)
            X.XSH r10 = A00(r0)
            com.instagram.user.model.User r19 = r12.A2A(r11)
            java.lang.String r21 = X.C231122qu.A07(r11, r12)
            int r2 = r0.A09
            java.lang.Integer r20 = java.lang.Integer.valueOf(r2)
            r2 = 129(0x81, float:1.81E-43)
            java.lang.String r15 = X.C66579MXk.A00(r2)
            r16 = r8
            r17 = r11
            r18 = r12
            boolean r2 = X.AEO.A01(r16, r17, r18, r19, r20, r21)
            if (r2 != 0) goto L_0x008e
            int r2 = r0.A09
            java.lang.Integer r14 = java.lang.Integer.valueOf(r2)
            r6 = 2
            X.DbW.A1N(r8, r6, r10)
            r13 = 0
            r9 = r8
            r16 = r13
            r17 = r13
            boolean r2 = X.VC4.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            if (r2 != 0) goto L_0x008e
            X.1as r2 = X.1as.A04
            X.1ap r5 = r2.A02
            X.4DU r2 = r0.A12
            X.OOA r7 = r5.A06(r2, r11, r15)
            java.lang.String r2 = r12.getId()
            r7.A02(r2)
            android.os.Bundle r5 = r7.A01
            r2 = 91
            java.lang.String r2 = X.C66579MXk.A00(r2)
            r5.putBoolean(r2, r4)
            X.37D r5 = X.DbT.A0i(r8)
            if (r5 == 0) goto L_0x0096
            X.HFY r2 = new X.HFY
            r2.<init>(r3, r6)
            r5.A0Q(r2)
            X.NK2 r2 = r7.A00()
            r5.A0J(r2)
        L_0x008e:
            X.INq r2 = new X.INq
            r2.<init>(r4)
            r3.A05(r2)
        L_0x0096:
            X.2EG r2 = r0.A13
            int r3 = r2.ordinal()
            r2 = 10
            if (r3 == r2) goto L_0x0194
            switch(r3) {
                case 3: goto L_0x017a;
                case 13: goto L_0x0197;
                case 14: goto L_0x017f;
                case 16: goto L_0x0189;
                case 25: goto L_0x0177;
                case 26: goto L_0x0174;
                case 117: goto L_0x0185;
                case 146: goto L_0x0182;
                case 154: goto L_0x018c;
                default: goto L_0x00a3;
            }
        L_0x00a3:
            switch(r3) {
                case 14: goto L_0x0171;
                case 118: goto L_0x0171;
                case 119: goto L_0x0171;
                case 120: goto L_0x0171;
                case 121: goto L_0x0171;
                case 126: goto L_0x0171;
                case 147: goto L_0x0171;
                case 148: goto L_0x0171;
                case 149: goto L_0x0171;
                default: goto L_0x00a6;
            }
        L_0x00a6:
            r15 = 0
        L_0x00a7:
            r2 = 0
            if (r1 == 0) goto L_0x016d
            java.lang.String r16 = r1.getId()
        L_0x00ae:
            java.lang.String r3 = r0.A0g
            r17 = r2
            if (r1 == 0) goto L_0x00b6
            r17 = r3
        L_0x00b6:
            com.instagram.common.session.UserSession r11 = r0.A10
            java.lang.String r1 = X.C231122qu.A07(r11, r12)
            if (r1 != 0) goto L_0x00c0
            java.lang.String r1 = ""
        L_0x00c0:
            X.XSH r10 = A00(r0)
            java.lang.String r6 = X.C231122qu.A07(r11, r12)
            long r3 = X.AEO.A00(r11, r12)
            int r5 = (int) r3
            X.C48902Em2.A00(r11, r6, r2, r5)
            com.instagram.user.model.User r21 = r12.A2A(r11)
            androidx.fragment.app.FragmentActivity r8 = r0.A0z
            int r3 = r0.A09
            java.lang.Integer r22 = java.lang.Integer.valueOf(r3)
            r18 = r8
            r19 = r11
            r20 = r12
            r23 = r1
            boolean r3 = X.AEO.A01(r18, r19, r20, r21, r22, r23)
            r4 = r26
            if (r3 != 0) goto L_0x016b
            android.content.Context r9 = X.DbT.A05(r8)
            X.VYx r13 = r0.A0V
            int r3 = r0.A0C
            java.lang.Integer r14 = java.lang.Integer.valueOf(r3)
            r3 = r2
            r5 = 5
            X.0qQ.A0B(r10, r5)
            boolean r5 = X.VC4.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            if (r5 != 0) goto L_0x0128
            X.37D r7 = X.DbT.A0i(r8)
            if (r7 == 0) goto L_0x0163
            r6 = r7
            X.37F r6 = (X.AnonymousClass37F) r6
            boolean r5 = r6.A0g
            if (r5 == 0) goto L_0x0167
            r22 = 1
            X.FmQ r5 = new X.FmQ
            r16 = r5
            r17 = r4
            r18 = r0
            r19 = r7
            r20 = r1
            r21 = r15
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r6.A0H = r5
            r7.A0B()
        L_0x0128:
            X.1Xy r1 = r12.A0C
            com.instagram.user.model.User r1 = r1.CCd()
            if (r1 == 0) goto L_0x0134
            java.lang.String r2 = r1.getId()
        L_0x0134:
            java.lang.String r1 = "cta_click_send_message"
            X.AnonymousClass59S.A02(r11, r2, r1)
            r2 = 766847856(0x2db52b70, float:2.0596608E-11)
            java.lang.String r1 = r12.getId()
            X.AnonymousClass59S.A01(r11, r1, r2)
            if (r28 == 0) goto L_0x0163
            if (r26 == 0) goto L_0x0164
            java.lang.Integer r1 = r4.BMu()
            if (r1 == 0) goto L_0x0164
            java.lang.String r1 = X.C9855RiU.A00(r4)
        L_0x0151:
            r2 = r24
            A06(r2, r0, r1, r3)
            X.3GX r1 = X.AnonymousClass3GX.A00(r11)
            r0 = 3366(0xd26, float:4.717E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.A06(r0)
        L_0x0163:
            return
        L_0x0164:
            java.lang.String r1 = "clicktodirect"
            goto L_0x0151
        L_0x0167:
            A07(r4, r0, r7, r15, r1)
            goto L_0x0128
        L_0x016b:
            r3 = r2
            goto L_0x0128
        L_0x016d:
            r16 = r2
            goto L_0x00ae
        L_0x0171:
            r2 = 3851(0xf0b, float:5.396E-42)
            goto L_0x0199
        L_0x0174:
            r2 = 1104(0x450, float:1.547E-42)
            goto L_0x018e
        L_0x0177:
            r2 = 827(0x33b, float:1.159E-42)
            goto L_0x018e
        L_0x017a:
            java.lang.String r15 = "row_cta"
            goto L_0x00a7
        L_0x017f:
            r2 = 1067(0x42b, float:1.495E-42)
            goto L_0x018e
        L_0x0182:
            r2 = 1139(0x473, float:1.596E-42)
            goto L_0x018e
        L_0x0185:
            java.lang.String r15 = "like_cta"
            goto L_0x00a7
        L_0x0189:
            r2 = 2900(0xb54, float:4.064E-42)
            goto L_0x0199
        L_0x018c:
            r2 = 274(0x112, float:3.84E-43)
        L_0x018e:
            java.lang.String r15 = X.C66579MXk.A00(r2)
            goto L_0x00a7
        L_0x0194:
            r2 = 1716(0x6b4, float:2.405E-42)
            goto L_0x0199
        L_0x0197:
            r2 = 3115(0xc2b, float:4.365E-42)
        L_0x0199:
            java.lang.String r15 = X.AnonymousClass000.A00(r2)
            goto L_0x00a7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SUD.A04(X.1Nv, X.1Xj, com.instagram.model.androidlink.AndroidLink, X.Q03, boolean):void");
    }

    public static final boolean A08(1Nv r4, AndroidLink androidLink, Q03 q03) {
        String CGH = androidLink.CGH();
        if (CGH != null) {
            String str = q03.A0a;
            if (str == null) {
                str = C9855RiU.A00(androidLink);
            }
            A06(r4, q03, str, CGH);
            return FH7.A0B(q03.A0z, q03.A10, CGH, q03.A12.getModuleName());
        }
        throw AnonymousClass7TE.A0z("webUri must be non-null");
    }
}

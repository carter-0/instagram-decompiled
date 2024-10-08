package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.instagram.api.schemas.RankingInfo;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductArEffectMetadata;
import com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Ur2  reason: case insensitive filesystem */
public final class C16239Ur2 extends VP2 implements XCC {
    public final UserSession A00;
    public final C18065Vkr A01;
    public final AnonymousClass326 A02;
    public final X9C A03;
    public final Activity A04;
    public final Context A05;
    public final RankingInfo A06;
    public final W03 A07;
    public final W1W A08;
    public final C18782W1i A09;
    public final C18021Vjx A0A;
    public final C18738VzJ A0B;
    public final C17469VWw A0C;
    public final String A0D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16239Ur2(Activity activity, Context context, RankingInfo rankingInfo, UserSession userSession, W03 w03, W1W w1w, C18065Vkr vkr, C18782W1i w1i, C18021Vjx vjx, C18738VzJ vzJ, AnonymousClass326 r12, X9C x9c, C17469VWw vWw, C18020Vjw vjw, String str) {
        super(vjw);
        DbW.A1N(userSession, 2, w1w);
        C51974G9v.A1Q(vjx, w1i, vjw, vkr);
        0qQ.A0B(vzJ, 11);
        0qQ.A0B(vWw, 13);
        this.A05 = context;
        this.A00 = userSession;
        this.A04 = activity;
        this.A03 = x9c;
        this.A08 = w1w;
        this.A07 = w03;
        this.A0A = vjx;
        this.A09 = w1i;
        this.A01 = vkr;
        this.A0B = vzJ;
        this.A02 = r12;
        this.A0C = vWw;
        this.A0D = str;
        this.A06 = rankingInfo;
    }

    public final void DIv(C16276Urd urd) {
        0qQ.A0B(urd, 0);
        A01(urd);
        this.A0B.A02 = true;
        C18782W1i w1i = this.A09;
        ProductArEffectMetadata productArEffectMetadata = urd.A01;
        Product product = this.A03.Bz5().A09;
        0qQ.A0A(product);
        w1i.A03(28D.A4J, productArEffectMetadata, product);
    }

    public final void DIw(ProductArEffectMetadata productArEffectMetadata) {
        String str;
        W1W w1w = this.A08;
        X9C x9c = this.A03;
        Product product = x9c.Bz5().A09;
        0qQ.A0A(product);
        0qQ.A0B(product, 0);
        0Aj A0e = AnonymousClass7TE.A0e(w1w.A04, "instagram_shopping_ar_try_on_tag_entry_point_tap");
        C13991Tnr.A17(A0e, product.A0H);
        User user = product.A0B;
        if (user != null) {
            str = AnonymousClass3ZA.A00(user);
        } else {
            str = null;
        }
        C13988Tno.A1A(A0e, str);
        C13989Tnp.A1H(A0e, product);
        A0e.AAJ("checkout_session_id", w1w.A0E);
        C13988Tno.A17(A0e, W1W.A00(w1w, (String) null));
        A0e.Cgf();
        this.A0B.A02 = true;
        C18782W1i w1i = this.A09;
        Product product2 = x9c.Bz5().A09;
        0qQ.A0A(product2);
        w1i.A03(28D.A4J, productArEffectMetadata, product2);
    }

    public final void DIy(C16272UrZ urZ, String str) {
        0qQ.A0B(urZ, 1);
        A01(urZ);
        A02(urZ, str);
    }

    public final void DIz(C16273Ura ura, String str) {
        0qQ.A0B(ura, 1);
        A01(ura);
        A02(ura, str);
    }

    public final void DJ0(C16271UrY urY, String str) {
        0qQ.A0B(urY, 1);
        A01(urY);
        A02(urY, str);
    }

    public final void DJ1(XC0 xc0, C16274Urb urb, String str) {
        0qQ.A0B(urb, 1);
        A01(urb);
        A02(urb, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0122  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DJ2(X.C16275Urc r39, java.lang.String r40) {
        /*
            r38 = this;
            r0 = 1
            r4 = r39
            X.0qQ.A0B(r4, r0)
            r5 = r38
            r5.A01(r4)
            X.X9C r3 = r5.A03
            X.Vuf r2 = r3.Bz5()
            X.W1L r1 = r2.A04
            com.instagram.user.model.Product r6 = r2.A09
            X.0qQ.A0A(r6)
            X.Vuf r0 = r3.Bz5()
            com.instagram.user.model.Product r0 = r0.A08
            X.0qQ.A0A(r0)
            java.lang.String r11 = r0.A0H
            X.Vrv r0 = r2.A07
            java.util.Map r0 = r0.A01
            java.util.Map r2 = java.util.Collections.unmodifiableMap(r0)
            X.0qQ.A07(r2)
            X.1Xj r9 = r3.Bxm()
            com.instagram.common.session.UserSession r7 = r5.A00
            java.util.List r8 = r1.A01(r7, r6)
            X.0Tu r10 = X.0Tu.A05
            r0 = 36313248408012628(0x8102b500000754, double:3.027982742717398E-306)
            boolean r0 = X.182.A06(r10, r7, r0)
            if (r0 == 0) goto L_0x0113
            r0 = 36313248408405848(0x8102b500060758, double:3.027982742966072E-306)
            boolean r0 = X.182.A06(r10, r7, r0)
            if (r0 == 0) goto L_0x0113
            X.W1i r3 = r5.A09
            r0 = 36876198361694299(0x8302b50004005b, double:3.3839945602432024E-306)
            java.lang.String r34 = X.182.A04(r10, r7, r0)
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>(r2)
            r2 = 0
            com.instagram.api.schemas.RankingInfo r0 = r5.A06
            r18 = r0
            com.instagram.user.model.User r0 = r6.A0B
            if (r0 == 0) goto L_0x006f
            java.lang.String r27 = X.C13988Tno.A0b(r0)
            if (r27 != 0) goto L_0x0071
        L_0x006f:
            java.lang.String r27 = ""
        L_0x0071:
            java.lang.String r15 = r5.A0D
            X.37E r1 = X.AnonymousClass37D.A00
            android.app.Activity r0 = r5.A04
            X.37D r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x011f
            X.37F r0 = (X.AnonymousClass37F) r0
            boolean r5 = r0.A0g
        L_0x0081:
            int r16 = r8.indexOf(r4)
            X.0Tu r8 = X.0Tu.A06
            r0 = 36313248408799067(0x8102b5000c075b, double:3.027982743214745E-306)
            java.lang.Boolean r8 = X.AnonymousClass7TF.A0R(r8, r7, r0)
            java.lang.String r7 = "see_all_in_hero_carousel"
            r1 = 2
            X.0qQ.A0B(r11, r1)
            if (r9 == 0) goto L_0x011d
            com.instagram.common.session.UserSession r0 = r3.A08
            com.instagram.user.model.User r0 = r9.A2A(r0)
        L_0x009e:
            java.lang.String r14 = r3.A0J
            java.lang.String r13 = r3.A0C
            X.4DU r12 = r3.A09
            java.lang.String r23 = r12.getModuleName()
            if (r9 == 0) goto L_0x0114
            java.lang.String r25 = r9.getId()
            if (r0 == 0) goto L_0x0116
            java.lang.String r29 = r0.getId()
        L_0x00b4:
            java.lang.String r30 = r9.A30()
        L_0x00b8:
            X.X9C r0 = r3.A0B
            X.Vuf r0 = r0.Bz5()
            java.util.Map r0 = r0.A0D
            java.util.Set r33 = r0.keySet()
            X.0qQ.A07(r33)
            java.lang.String r9 = r3.A0D
            com.instagram.shopping.fragment.pdp.mediagrid.MediaGridArguments r0 = new com.instagram.shopping.fragment.pdp.mediagrid.MediaGridArguments
            r24 = r7
            r26 = r2
            r28 = r15
            r31 = r9
            r32 = r10
            r20 = r11
            r21 = r14
            r22 = r13
            r17 = r0
            r19 = r6
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            if (r5 == 0) goto L_0x0122
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            r1 = 3009(0xbc1, float:4.217E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            r5.putParcelable(r1, r0)
            X.4DH r0 = r3.A07
            android.content.Context r1 = r0.requireContext()
            r0 = 2131965913(0x7f1337d9, float:1.956865E38)
            java.lang.String r1 = r1.getString(r0)
            java.lang.String r0 = "surface_title"
            r5.putString(r0, r1)
            com.instagram.common.session.UserSession r4 = r3.A08
            java.lang.Class<com.instagram.modal.ModalActivity> r2 = com.instagram.modal.ModalActivity.class
            androidx.fragment.app.FragmentActivity r1 = r3.A05
            r0 = 3331(0xd03, float:4.668E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.DbU.A0w(r1, r5, r4, r2, r0)
        L_0x0113:
            return
        L_0x0114:
            r25 = r2
        L_0x0116:
            r29 = r2
            if (r9 != 0) goto L_0x00b4
            r30 = r2
            goto L_0x00b8
        L_0x011d:
            r0 = r2
            goto L_0x009e
        L_0x011f:
            r5 = 0
            goto L_0x0081
        L_0x0122:
            X.VZr r5 = r3.A02
            if (r5 != 0) goto L_0x013d
            boolean r37 = r6.A04()
            java.lang.String r35 = r12.getModuleName()
            r29 = r3
            r30 = r27
            r31 = r11
            r32 = r14
            r33 = r13
            r36 = r7
            X.C18782W1i.A01(r29, r30, r31, r32, r33, r34, r35, r36, r37)
        L_0x013d:
            X.VZr r9 = r3.A02
            if (r9 == 0) goto L_0x01c3
            java.lang.String r12 = r4.A01()
            r10 = 0
            java.util.Map r6 = r9.A03
            java.lang.String r5 = "selected_media_item_identifier"
            r6.put(r5, r12)
            java.lang.String r11 = java.lang.String.valueOf(r16)
            java.lang.String r5 = "selected_media_postion"
            r6.put(r5, r11)
            r11 = 95
            int r5 = r12.length()
            int r5 = r5 + -1
            int r11 = X.00l.A05(r12, r11, r5)
            r5 = -1
            if (r11 == r5) goto L_0x01bb
            int r11 = r11 + 1
            java.lang.String r12 = X.C66580MXl.A0z(r12, r11)
        L_0x016b:
            java.lang.String r11 = "selected_media_thumbnail_media_id"
            r6.put(r11, r12)
            java.lang.Integer r4 = r4.A02
            java.lang.String r11 = X.C18269Voj.A00(r4)
            r4 = 3948(0xf6c, float:5.532E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r4)
            r6.put(r4, r11)
            java.lang.String r4 = "prop_prior_submodule"
            r6.put(r4, r7)
            java.lang.String r4 = "is_auto_scrolling_enabled"
            r6.put(r4, r8)
            r4 = 1302(0x516, float:1.824E-42)
            java.lang.String r4 = X.C273654mx.A00(r4)
            r6.put(r4, r0)
            com.instagram.bloks.hosting.IgBloksScreenConfig r4 = r3.A00
            java.util.BitSet r0 = r9.A02
            int r0 = r0.nextClearBit(r10)
            if (r0 < r1) goto L_0x01be
            java.util.Map r0 = r9.A04
            java.util.HashMap r3 = X.C359608dC.A01(r0)
            r0 = 128(0x80, float:1.794E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.DiU r1 = new X.DiU
            r1.<init>(r3, r6, r0)
            r1.A05 = r2
            r1.A00 = r5
            r1.A03 = r2
            r1.A04 = r2
            android.content.Context r0 = r9.A00
            r1.A0D(r0, r4)
            return
        L_0x01bb:
            java.lang.String r12 = ""
            goto L_0x016b
        L_0x01be:
            java.lang.IllegalStateException r0 = X.DbU.A0i()
            throw r0
        L_0x01c3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16239Ur2.DJ2(X.Urc, java.lang.String):void");
    }

    public final void EBR(View view, String str) {
        0qQ.A0B(str, 1);
        C17469VWw vWw = this.A0C;
        C13988Tno.A14(view, vWw.A00, vWw.A01, str);
    }

    public static final void A00(FeaturedProductPermissionStatus featuredProductPermissionStatus, C16239Ur2 ur2, C18001Vjd vjd, String str) {
        C74546Pwf Bbg;
        FeaturedProductPermissionStatus featuredProductPermissionStatus2;
        C16239Ur2 ur22 = ur2;
        X9C x9c = ur22.A03;
        W2j A002 = W2j.A00(x9c);
        C18570VuM vuM = new C18570VuM(x9c.Bz5().A04);
        C18001Vjd vjd2 = vjd;
        vuM.A04.put(vjd2.A01(), C16605Uxz.LOADING);
        A002.A04 = new W1L(vuM);
        C18588Vuf.A00(x9c, A002);
        1Xj r12 = ((C16272UrZ) vjd2).A01;
        Iterator A0s = AnonymousClass7TF.A0s(C254423sS.A07(r12));
        while (A0s.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
            Object key = A1J.getKey();
            ArrayList<C46292DTv> arrayList = new ArrayList<>();
            for (Object next : (List) A1J.getValue()) {
                C74546Pwf Bbg2 = ((C46292DTv) next).Bbg();
                if (Bbg2 != null) {
                    featuredProductPermissionStatus2 = Bbg2.BzM();
                } else {
                    featuredProductPermissionStatus2 = null;
                }
                if (featuredProductPermissionStatus2 == featuredProductPermissionStatus) {
                    arrayList.add(next);
                }
            }
            for (C46292DTv dTv : arrayList) {
                if (!(dTv == null || (Bbg = dTv.Bbg()) == null)) {
                    C18021Vjx vjx = ur22.A0A;
                    FeaturedProductPermissionStatus featuredProductPermissionStatus3 = FeaturedProductPermissionStatus.CANCELED;
                    String str2 = str;
                    C58802Ixn ixn = new C58802Ixn(ur22, dTv, vjd2, key, r12, str2, 4);
                    vjx.A00.schedule(C17059VGh.A00(vjx.A01, featuredProductPermissionStatus3, String.valueOf(Bbg.BEY()), new C58220IoO(vjd2, key, ur22, dTv, str2, 3), ixn));
                }
            }
        }
    }

    private final void A01(C18001Vjd vjd) {
        C15054ULx uLx;
        String str;
        C18588Vuf Bz5 = this.A03.Bz5();
        W1L w1l = Bz5.A04;
        Product product = Bz5.A09;
        List A012 = w1l.A01(this.A00, product);
        W03 w03 = this.A07;
        if (w03 != null) {
            0qQ.A0A(A012);
            if (vjd instanceof C16275Urc) {
                vjd = ((C16275Urc) vjd).A00;
            }
            int indexOf = A012.indexOf(vjd);
            int size = A012.size();
            C263944Ny r0 = null;
            if (product != null) {
                uLx = C294165ly.A03(w03.A03, product);
            } else {
                uLx = null;
            }
            0Aj A0e = AnonymousClass7TE.A0e(w03.A02, "instagram_ads_app_hero_carousel_click");
            if (A0e.isSampled()) {
                C15029UKi uKi = w03.A01;
                if (uKi == null || (str = uKi.A05) == null) {
                    str = "";
                }
                C51965G9l.A1L(A0e, W03.A00(A0e, w03, str));
                if (uLx != null) {
                    r0 = uLx.A01;
                }
                W03.A01(A0e, w03, C13992Tns.A0E(r0, A0e, uLx));
                C13991Tnr.A11(A0e, size);
                A0e.AAJ("position_in_carousel", String.valueOf(indexOf));
                A0e.Cgf();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x00d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A02(X.C18001Vjd r31, java.lang.String r32) {
        /*
            r30 = this;
            r5 = r30
            X.X9C r4 = r5.A03
            X.Vuf r2 = r4.Bz5()
            X.W1L r1 = r2.A04
            com.instagram.user.model.Product r10 = r2.A09
            X.0qQ.A0A(r10)
            X.Vuf r0 = r4.Bz5()
            com.instagram.user.model.Product r0 = r0.A08
            X.0qQ.A0A(r0)
            java.lang.String r11 = r0.A0H
            X.Vrv r0 = r2.A07
            java.util.Map r0 = r0.A01
            java.util.Map r3 = java.util.Collections.unmodifiableMap(r0)
            X.0qQ.A07(r3)
            X.1Xj r2 = r4.Bxm()
            com.instagram.common.session.UserSession r0 = r5.A00
            java.util.List r8 = r1.A01(r0, r10)
            X.W1i r0 = r5.A09
            java.lang.String r7 = r5.A0D
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>(r3)
            X.0qQ.A0A(r8)
            X.Vuf r3 = r4.Bz5()
            X.Vsx r3 = r3.A02
            X.Uxz r4 = r3.A01
            X.Uxz r3 = X.C16605Uxz.LOADED
            boolean r28 = X.C51969G9p.A1a(r4, r3)
            com.instagram.api.schemas.RankingInfo r9 = r5.A06
            r21 = 0
            X.AnonymousClass7TG.A1O(r10, r11)
            r4 = 7
            r3 = 8
            android.os.Bundle r3 = X.DbV.A0B(r8, r3)
            if (r2 == 0) goto L_0x00d7
            com.instagram.common.session.UserSession r5 = r0.A08
            com.instagram.user.model.User r6 = r2.A2A(r5)
        L_0x005f:
            android.os.Parcelable[] r27 = X.VHI.A00(r8)
            X.0qQ.A07(r27)
            java.lang.String r12 = r0.A0J
            java.lang.String r13 = r0.A0C
            java.lang.String r14 = r31.A01()
            X.4DU r5 = r0.A09
            java.lang.String r15 = r5.getModuleName()
            if (r2 == 0) goto L_0x00ce
            java.lang.String r18 = r2.getId()
            if (r6 == 0) goto L_0x00d0
            java.lang.String r19 = r6.getId()
        L_0x0080:
            java.lang.String r20 = r2.A30()
        L_0x0084:
            X.X9C r5 = r0.A0B
            X.Vuf r2 = r5.Bz5()
            X.VYe r2 = r2.A03
            java.lang.String r6 = r2.A03
            X.Vuf r2 = r5.Bz5()
            java.util.Map r2 = r2.A0D
            java.util.Set r26 = r2.keySet()
            X.0qQ.A07(r26)
            java.lang.String r5 = r0.A0D
            java.lang.String r2 = r0.A0I
            r29 = 1
            com.instagram.shopping.fragment.pdp.lightbox.LightboxArguments r8 = new com.instagram.shopping.fragment.pdp.lightbox.LightboxArguments
            r16 = r32
            r22 = r6
            r23 = r5
            r24 = r2
            r25 = r1
            r17 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            java.lang.String r1 = "arguments"
            r3.putParcelable(r1, r8)
            com.instagram.common.session.UserSession r5 = r0.A08
            java.lang.Class<com.instagram.modal.ModalActivity> r10 = com.instagram.modal.ModalActivity.class
            androidx.fragment.app.FragmentActivity r2 = r0.A05
            java.lang.String r11 = "shopping_lightbox"
            X.6W8 r1 = new X.6W8
            r6 = r1
            r7 = r2
            r8 = r3
            r9 = r5
            r6.<init>(r7, r8, r9, r10, r11)
            X.4DH r0 = r0.A07
            r1.A0D(r0, r4)
            return
        L_0x00ce:
            r18 = r21
        L_0x00d0:
            r19 = r21
            if (r2 != 0) goto L_0x0080
            r20 = r21
            goto L_0x0084
        L_0x00d7:
            r6 = r21
            goto L_0x005f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16239Ur2.A02(X.Vjd, java.lang.String):void");
    }

    public final void A7o(C18588Vuf vuf, C16276Urd urd) {
        C17469VWw vWw = this.A0C;
        String str = urd.A02;
        C229932oe r2 = vWw.A01;
        C13989Tnp.A1Q(vWw.A02, AnonymousClass30Y.A00(urd, vuf, str), r2, str);
    }

    public final void DEz(C18001Vjd vjd, String str) {
        Context context = this.A05;
        C46498Dg1 dg1 = new C46498Dg1(context, this.A00);
        dg1.A02(new WB5((Object) vjd, (Object) this, str, 11), 2131962241);
        C13988Tno.A0r(context, dg1);
    }

    public final void DF0(C18001Vjd vjd, String str) {
        A00(FeaturedProductPermissionStatus.PENDING, this, vjd, str);
    }

    public final void DIx(C18001Vjd vjd) {
        1Xj r4;
        C18065Vkr vkr = this.A01;
        vkr.A03("scroll");
        if (vjd == null) {
            X9C x9c = this.A03;
            C18588Vuf Bz5 = x9c.Bz5();
            W2j w2j = new W2j(Bz5);
            W2j.A01((1Xj) null, Uw7.A02, w2j, new C18570VuM(Bz5.A04));
            C18588Vuf.A00(x9c, w2j);
            return;
        }
        if (vjd instanceof C16272UrZ) {
            r4 = ((C16272UrZ) vjd).A00;
        } else if (vjd instanceof C16271UrY) {
            r4 = ((C16271UrY) vjd).A00;
        } else if (vjd instanceof C16274Urb) {
            r4 = ((C16274Urb) vjd).A00;
        } else {
            return;
        }
        X9C x9c2 = this.A03;
        C18588Vuf Bz52 = x9c2.Bz5();
        W2j w2j2 = new W2j(Bz52);
        W2j.A01(r4, Uw7.PREPARING, w2j2, new C18570VuM(Bz52.A04));
        C18588Vuf.A00(x9c2, w2j2);
        vkr.A00(r4);
    }
}

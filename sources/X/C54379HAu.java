package X;

import android.accounts.NetworkErrorException;
import android.app.Activity;
import android.graphics.RectF;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.ProductMediaType;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.reels.Reel;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductTileMedia;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HAu  reason: case insensitive filesystem */
public final class C54379HAu extends C324596za {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C54379HAu(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void onFail(C268654dm r6) {
        int i;
        int i2;
        C69248NiA niA;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A03(890906732);
                i2 = 506553626;
                break;
            case 1:
                i = AnonymousClass0fD.A03(-590643066);
                C45891D9u.A02((C46215DQt) this.A01, new NetworkErrorException());
                i2 = -1198480778;
                break;
            case 2:
                i = AnonymousClass0fD.A03(1855236334);
                ((C59621JQp) this.A02).DED();
                C56006HrC hrC = (C56006HrC) this.A01;
                if (hrC.A03) {
                    hrC.A00.A00.markerEnd(480321881, 3);
                }
                i2 = -522182149;
                break;
            case 3:
                i = AnonymousClass7TG.A0D(r6, 2101097971);
                r6.toString();
                i2 = -175621477;
                break;
            case 4:
                i = AnonymousClass0fD.A03(-134468791);
                i2 = 1705160315;
                break;
            case 5:
                i = AnonymousClass7TG.A0D(r6, -1697682501);
                1XQ r0 = (1XQ) r6.A00();
                int i3 = -1;
                if (r0 != null) {
                    i3 = r0.mStatusCode;
                } else {
                    Throwable A012 = r6.A01();
                    if ((A012 instanceof C69248NiA) && (niA = (C69248NiA) A012) != null) {
                        i3 = niA.A00;
                    }
                }
                C52767GcK gcK = (C52767GcK) this.A02;
                gcK.A0F.DeP(r6, (AnonymousClass1GU) this.A01, i3);
                gcK.A0D.DeI();
                i2 = 139187528;
                break;
            default:
                C54379HAu.super.onFail(r6);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final void onFailInBackground(C268654dm r4) {
        if (5 - this.A00 != 0) {
            C54379HAu.super.onFailInBackground(r4);
            return;
        }
        int A03 = AnonymousClass0fD.A03(-35130037);
        ((C52767GcK) this.A02).A0F.DeQ((AnonymousClass1GU) this.A01);
        AnonymousClass0fD.A0A(-1531939931, A03);
    }

    public final void onFinish() {
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A03(1942982652);
                i2 = 178804860;
                break;
            case 1:
                i = AnonymousClass0fD.A03(1203062558);
                i2 = -714846577;
                break;
            case 2:
                i = AnonymousClass0fD.A03(1271689728);
                i2 = -468306738;
                break;
            case 3:
                i = AnonymousClass0fD.A03(-683639768);
                i2 = 1339753604;
                break;
            case 4:
                i = AnonymousClass0fD.A03(1457638069);
                i2 = 1344104329;
                break;
            case 5:
                i = AnonymousClass0fD.A03(920100946);
                AnonymousClass1GU r2 = (AnonymousClass1GU) this.A01;
                if (r2.A00.A02()) {
                    ((C52767GcK) this.A02).A02 = C51968G9o.A0u();
                }
                C52767GcK gcK = (C52767GcK) this.A02;
                gcK.A0F.DeU(r2);
                gcK.A0D.DeS();
                i2 = -1810994341;
                break;
            default:
                C54379HAu.super.onFinish();
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final void onStart() {
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A03(-1037764176);
                i2 = -893452074;
                break;
            case 1:
                i = AnonymousClass0fD.A03(435443892);
                i2 = 954847116;
                break;
            case 2:
                i = AnonymousClass0fD.A03(815095105);
                ((C59621JQp) this.A02).onStart();
                C56006HrC hrC = (C56006HrC) this.A01;
                if (hrC.A03) {
                    02m r2 = hrC.A00.A00;
                    r2.markerStart(480321881);
                    r2.markerPoint(480321881, "RESPONSE_SENT");
                    r2.markerAnnotate(480321881, "FETCH_REASON", "LOAD_MORE");
                }
                i2 = -510867203;
                break;
            case 3:
                i = AnonymousClass0fD.A03(-1819057065);
                i2 = -747762654;
                break;
            case 4:
                i = AnonymousClass0fD.A03(-319175395);
                i2 = -733640888;
                break;
            case 5:
                i = AnonymousClass0fD.A03(513749897);
                C52767GcK gcK = (C52767GcK) this.A02;
                gcK.A0F.Dek((AnonymousClass1GU) this.A01);
                gcK.A0D.Dei();
                i2 = 2132473582;
                break;
            default:
                C54379HAu.super.onStart();
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int i2;
        Product A022;
        String A002;
        ProductImageContainer productImageContainer;
        String id;
        ImageInfo BGO;
        List AZL;
        AnonymousClass3PG r20;
        int i3;
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                i2 = AnonymousClass0fD.A03(-2067262748);
                1XO r4 = (1XO) obj2;
                int A0D = AnonymousClass7TG.A0D(r4, -900532627);
                List list = r4.A06;
                0qQ.A07(list);
                Object A0J = 00k.A0J(list);
                if (A0J != null) {
                    UserSession userSession = (UserSession) this.A02;
                    FV1.A01((Activity) this.A01, userSession, 1OP.A05(userSession).A0J(new 1Nr(DbT.A0j(userSession)), AnonymousClass7TF.A0b(), AnonymousClass7TE.A1I(A0J), true));
                }
                AnonymousClass0fD.A0A(1926783199, A0D);
                i = 1210231054;
                break;
            case 1:
                i2 = AnonymousClass0fD.A03(847832484);
                1XO r42 = (1XO) obj2;
                int A03 = AnonymousClass0fD.A03(1025491179);
                0qQ.A0B(r42, 0);
                1Xj A0T = DbZ.A0T(r42.A06, 0);
                1E8 A003 = 1E7.A00(((LOW) this.A02).A03);
                0qQ.A0A(A0T);
                A003.A03(A0T);
                C46215DQt dQt = (C46215DQt) this.A01;
                C45891D9u.A01(dQt, A0T);
                C45891D9u.A00(dQt);
                AnonymousClass0fD.A0A(65614127, A03);
                i = -120333099;
                break;
            case 2:
                i2 = AnonymousClass0fD.A03(-1513664333);
                AnonymousClass1XT r43 = (AnonymousClass1XT) obj2;
                int A032 = AnonymousClass0fD.A03(-612150321);
                C56006HrC hrC = (C56006HrC) this.A01;
                JQF jqf = hrC.A06;
                C59621JQp jQp = (C59621JQp) this.A02;
                C55863Hok E1u = jqf.E1u(r43, jQp.Atn());
                hrC.A02 = E1u.A06;
                UserSession userSession2 = hrC.A05;
                boolean A06 = 182.A06(0Tu.A05, userSession2, 36315700834340335L);
                if (hrC.A03) {
                    C55483HiR hiR = hrC.A00;
                    int size = E1u.A04.size();
                    02m r3 = hiR.A00;
                    r3.markerAnnotate(480321881, "MEDIA_COUNT", size);
                    r3.markerPoint(480321881, "RESPONSE_RECEIVED");
                    r3.markerEnd(480321881, 2);
                }
                for (1Xj r13 : E1u.A04) {
                    if (r13.CcK() && !A06) {
                        AnonymousClass4DU r14 = hrC.A08;
                        C271794jb r12 = new C271794jb(userSession2, r13);
                        int i4 = -1;
                        if (r13.A5D()) {
                            i4 = 0;
                        }
                        r12.A00 = i4;
                        C233822wX.A0N(userSession2, r12, r13, r14, (Integer) null, "delivery");
                    }
                }
                boolean isEmpty = E1u.A05.isEmpty();
                List list2 = E1u.A03;
                jQp.Dow(E1u.A00, ((AnonymousClass1XV) r43).getNextMaxId(), E1u.A02, E1u.A01, list2);
                AnonymousClass0fD.A0A(1794490766, A032);
                i = 1889004103;
                break;
            case 3:
                i2 = AnonymousClass0fD.A03(1405312758);
                1XO r44 = (1XO) obj2;
                int A033 = AnonymousClass0fD.A03(-1991315770);
                0qQ.A0B(r44, 0);
                C55769Hn4 hn4 = (C55769Hn4) this.A01;
                List list3 = r44.A06;
                0qQ.A07(list3);
                AnonymousClass3BQ r32 = (AnonymousClass3BQ) this.A02;
                if (!list3.isEmpty()) {
                    String id2 = DbZ.A0T(list3, 0).getId();
                    1Xj A0T2 = DbZ.A0T(list3, 0);
                    UserSession userSession3 = hn4.A02;
                    User A2A = A0T2.A2A(userSession3);
                    if (A2A != null) {
                        Reel A0J2 = 1OP.A05(userSession3).A0J(new 1Nr(A2A), id2, list3, false);
                        C273004lm A004 = C272994ll.A00(userSession3);
                        long parseLong = Long.parseLong(A2A.getId());
                        List list4 = hn4.A03;
                        0Aj A0e = AnonymousClass7TE.A0e(A004.A00, "fan_onboarding_view_exclusive_media");
                        Dbb.A1D(A0e, AnonymousClass000.A00(286), parseLong);
                        A0e.AAe("media_ids", list4);
                        A0e.Cgf();
                        RectF rectF = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
                        FragmentActivity fragmentActivity = hn4.A00;
                        AnonymousClass0iw A08 = C308206Td.A08(hn4.A01);
                        0qQ.A0B(fragmentActivity, 3);
                        AnonymousClass7TG.A1S(r32, A08);
                        AnonymousClass3K2 A07 = 1OP.A07(fragmentActivity, userSession3);
                        ArrayList A1C = AnonymousClass7TE.A1C();
                        A1C.add(A0J2.getId());
                        A07.A0T((RectF) null, rectF, A08, A0J2, r32, new FkT(rectF, fragmentActivity, userSession3, A0J2, r32, A07, A1C), 0);
                    }
                }
                AnonymousClass0fD.A0A(125023450, A033);
                i = -914341873;
                break;
            case 4:
                i2 = AnonymousClass0fD.A03(-196329223);
                C43825CEr cEr = (C43825CEr) obj2;
                int A034 = AnonymousClass0fD.A03(120736880);
                ArrayList A0q = AnonymousClass7TF.A0q(cEr, 0);
                C45203CsE A005 = cEr.FH3();
                UAP uap = (UAP) this.A02;
                User A006 = UAP.A00(uap);
                for (C59721JVf jVf : A005.A00) {
                    XA4 xa4 = (XA4) jVf.A00;
                    Object obj3 = jVf.A01;
                    if (xa4 != null) {
                        C53466Goy goy = (C53466Goy) xa4;
                        XA3 xa3 = goy.A00;
                        if (obj3 == ProductMediaType.IG_MEDIA) {
                            1Xj r1 = goy.A01;
                            if (r1 != null) {
                                id = r1.getId();
                                if (id != null) {
                                    BGO = r1.A1p();
                                    if (BGO == null) {
                                    }
                                }
                            }
                        } else if (!(obj3 != ProductMediaType.PRODUCT_IMAGE || xa3 == null || (productImageContainer = ((C42109BHn) xa3).A00) == null || productImageContainer.BGO() == null)) {
                            id = ((ProductFeedItem) this.A01).getId();
                            BGO = productImageContainer.BGO();
                        }
                        A0q.add(new ProductTileMedia(BGO, A006, id, (String) null));
                    }
                }
                if (A0q.size() < 2 && uap.A07 != null) {
                    ProductFeedItem productFeedItem = (ProductFeedItem) this.A01;
                    if (productFeedItem.A00() != null) {
                        A0q.clear();
                        A0q.add(new ProductTileMedia(productFeedItem.A00(), A006, productFeedItem.getId(), (String) null));
                        A0q.add(productFeedItem.A01(uap.A05));
                    }
                }
                List list5 = uap.A0F;
                if (!A0q.equals(list5)) {
                    list5.clear();
                    if (DbT.A1b(A0q)) {
                        list5.addAll(0u4.A01(A0q));
                    }
                    uap.notifyDataSetChanged();
                    1Xj r8 = uap.A07;
                    if (!(r8 == null || (A022 = ((ProductFeedItem) this.A01).A02()) == null)) {
                        AnonymousClass0iw r2 = uap.A04;
                        0qQ.A0C(r2, C66579MXk.A00(2));
                        UserSession userSession4 = uap.A05;
                        int size2 = list5.size();
                        String str = uap.A0C;
                        String A007 = AnonymousClass000.A00(801);
                        String str2 = uap.A0D;
                        User user = A022.A0B;
                        if (!(user == null || (A002 = AnonymousClass3ZA.A00(user)) == null)) {
                            0Aj A0e2 = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r2, userSession4), "instagram_shopping_bottomsheet_product_row_tile_impression");
                            if (A0e2.isSampled()) {
                                A0e2.AAE(C263944Ny.A00(userSession4.A06), "ig_user_id");
                                A0e2.AAE(C263944Ny.A00(A002), "merchant_id");
                                A0e2.A9F("product_id", DbV.A0q(A022.A0H));
                                String id3 = r8.getId();
                                if (id3 != null) {
                                    C51965G9l.A1I(A0e2, id3);
                                    0bb r22 = new 0bb();
                                    r22.A06("prior_module", str);
                                    r22.A06("submodule", A007);
                                    r22.A06(C273654mx.A00(365), str2);
                                    A0e2.AAK(r22, "navigation_info");
                                    A0e2.A9F(AnonymousClass000.A00(3679), DbS.A0j(size2));
                                    A0e2.Cgf();
                                } else {
                                    throw AnonymousClass7TE.A0y();
                                }
                            }
                        }
                    }
                }
                AnonymousClass0fD.A0A(-2100739961, A034);
                i = -953890070;
                break;
            case 5:
                i2 = AnonymousClass0fD.A03(-1625850294);
                1XM r45 = (1XM) obj2;
                int A035 = AnonymousClass0fD.A03(-1396041387);
                0qQ.A0B(r45, 0);
                C52767GcK gcK = (C52767GcK) this.A02;
                if (gcK.A09.getContext() == null) {
                    i3 = -89208284;
                } else {
                    AnonymousClass1GU r122 = (AnonymousClass1GU) this.A01;
                    1FS r142 = r122.A00;
                    gcK.A00 = r45.A00;
                    0tp r33 = gcK.A0E;
                    C62500to r23 = r142.A03;
                    List A008 = r45.A00();
                    boolean A023 = r142.A02();
                    r33.DeY(r23, A008, A023);
                    ArrayList A1D = AnonymousClass7TE.A1D(r45.A00());
                    JRI jri = gcK.A0D;
                    int size3 = jri.AZL().size();
                    if (A023) {
                        AZL = AnonymousClass7TE.A1C();
                    } else {
                        AZL = jri.AZL();
                        0qQ.A07(AZL);
                    }
                    HashMap A1E = AnonymousClass7TE.A1E();
                    int size4 = AZL.size();
                    int i5 = 0;
                    for (int i6 = 0; i6 < size4; i6++) {
                        A1E.put(((1Xg) AZL.get(i6)).A09, Integer.valueOf(i6));
                    }
                    UserSession userSession5 = gcK.A0C;
                    AnonymousClass3VW.A00(userSession5, r142.A09, DbU.A0K(AZL), DbU.A0K(A1D), false);
                    Iterator it = A1D.iterator();
                    while (it.hasNext()) {
                        1Xg r34 = (1Xg) it.next();
                        if (A1E.get(r34.A09) != null) {
                            C241323Ot.A04(C241323Ot.A00(r142), userSession5, r34, AZL.size() + i5);
                            it.remove();
                        }
                        i5++;
                    }
                    List A0a = 00k.A0a(A1D);
                    if (r45.A04 != null) {
                        0tS A0h = DbT.A0h();
                        if (!AnonymousClass7TG.A1a(A0h, A0h.A1D, 0tS.A4G, 203)) {
                            ArrayList A1D2 = AnonymousClass7TE.A1D(A0a);
                            C67251sV r15 = r45.A04;
                            if (r15 != null) {
                                A0a = I5U.A00(userSession5, r15, A0a, AZL, false);
                                C241323Ot.A07(C241323Ot.A00(r142), userSession5, A1D2, A0a);
                            } else {
                                throw AnonymousClass7TE.A0y();
                            }
                        }
                    }
                    ArrayList A0U = 00k.A0U(A0a);
                    ArrayList A1C2 = AnonymousClass7TE.A1C();
                    Iterator it2 = A0U.iterator();
                    while (true) {
                        boolean z = false;
                        if (it2.hasNext()) {
                            1Xg r24 = (1Xg) it2.next();
                            1Xj A0o = C51965G9l.A0o(r24);
                            if (A0o != null) {
                                if ("feed_timeline_older".equals(gcK.A0H)) {
                                    AnonymousClass3W1 BQs = jri.BQs(r24);
                                    0qQ.A07(BQs);
                                    if (r24.A06 == 1UQ.A0H) {
                                        z = true;
                                    }
                                    BQs.A2a = z;
                                }
                                A1C2.add(A0o);
                            }
                        } else {
                            00v.A10(A1C2);
                            Iterator it3 = A1C2.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    1Xj A0t = C51966G9m.A0t(it3);
                                    if (!A0t.A54()) {
                                        gcK.A04 = String.valueOf(A0t.A1A());
                                    }
                                }
                            }
                            AnonymousClass9J8 A009 = C241323Ot.A00(r142);
                            int size5 = AZL.size();
                            0qQ.A0B(userSession5, 1);
                            List<1Xg> A062 = 1Xg.A0A.A06(A1C2);
                            int i7 = size5;
                            0qQ.A0B(A062, 2);
                            for (1Xg A05 : A062) {
                                size5++;
                                C241323Ot.A05(A009, userSession5, A05, i7);
                                i7 = size5;
                            }
                            gcK.A0F.Des(r122, r45);
                            boolean z2 = false;
                            jri.Dex((String) null, (String) null, A0U, false, A023);
                            C228492ll A0010 = C228482lk.A00(userSession5);
                            if (r45.CPt()) {
                                r20 = AnonymousClass3PG.CACHED;
                            } else {
                                r20 = null;
                            }
                            int size6 = AZL.size() + A0U.size();
                            if (size3 != 0 && A023) {
                                z2 = true;
                            }
                            A0010.A0B(r142, r20, (Boolean) null, (0eP) null, size3, size6, z2, !A023);
                            i3 = 975856928;
                        }
                    }
                }
                AnonymousClass0fD.A0A(i3, A035);
                i = 1147309990;
                break;
            default:
                C54379HAu.super.onSuccess(obj2);
                return;
        }
        AnonymousClass0fD.A0A(i, i2);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A03(-2002833829);
                AnonymousClass0fD.A0A(381426338, AnonymousClass0fD.A03(-701447747));
                i2 = -773144313;
                break;
            case 1:
                i = AnonymousClass0fD.A03(1681745128);
                AnonymousClass0fD.A0A(-295410300, AnonymousClass0fD.A03(-1340274899));
                i2 = 1518819058;
                break;
            case 2:
                i = AnonymousClass0fD.A03(-1207652795);
                AnonymousClass0fD.A0A(1037095580, AnonymousClass0fD.A03(-10467671));
                i2 = -752240870;
                break;
            case 3:
                i = AnonymousClass0fD.A03(-938314290);
                AnonymousClass0fD.A0A(296363913, AnonymousClass0fD.A03(544236992));
                i2 = -568814097;
                break;
            case 4:
                i = AnonymousClass0fD.A03(-1686524151);
                AnonymousClass0fD.A0A(83102256, AnonymousClass0fD.A03(1757615448));
                i2 = -544983327;
                break;
            case 5:
                i = AnonymousClass0fD.A03(1119974932);
                1XM r5 = (1XM) obj;
                int A0D = AnonymousClass7TG.A0D(r5, 861626462);
                ((C52767GcK) this.A02).A0F.Dey((AnonymousClass1GU) this.A01, r5);
                AnonymousClass0fD.A0A(-119102060, A0D);
                i2 = 1903028235;
                break;
            default:
                C54379HAu.super.onSuccessInBackground(obj);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }
}

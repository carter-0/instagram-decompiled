package X;

import android.app.Activity;
import android.content.Context;
import com.facebook.pando.TreeJNI;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.shopping.ProductTagDictIntf;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class H4O extends 1P0 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public H4O(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A02 = obj3;
        this.A01 = obj;
        this.A03 = obj2;
        this.A04 = str;
    }

    public final void onFail(C268654dm r4) {
        int i;
        int i2;
        switch (this.A00) {
            case 1:
                i = AnonymousClass0fD.A03(2057549924);
                C59631JQz jQz = (C59631JQz) this.A02;
                if (jQz != null) {
                    jQz.Ddc();
                }
                i2 = -730318460;
                break;
            case 2:
                i = AnonymousClass0fD.A03(909451057);
                DbS.A1U(this.A02);
                C59689JTv.A0B((Context) this.A01, "clips_spins_like");
                i2 = -884325899;
                break;
            default:
                H4O.super.onFail(r4);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032;
        String str;
        int i;
        int i2;
        Object obj2;
        String str2;
        int i3;
        int i4;
        switch (this.A00) {
            case 0:
                A032 = AnonymousClass0fD.A03(1045159593);
                C43822CEo cEo = (C43822CEo) obj;
                int A0D = AnonymousClass7TG.A0D(cEo, 1005103023);
                List list = cEo.FH3().A01;
                if (list == null) {
                    i = 982302464;
                } else {
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        String A0k = C51975G9x.A0k(it);
                        if (A0k != null) {
                            A1C.add(A0k);
                        }
                    }
                    ArrayList A1D = AnonymousClass7TE.A1D(A1C);
                    if (list.isEmpty()) {
                        ((1Xj) this.A02).A3s();
                    } else {
                        Activity activity = (Activity) this.A01;
                        if (!activity.isFinishing() && !activity.isDestroyed()) {
                            I5X i5x = new I5X((UserSession) this.A03);
                            String str3 = this.A04;
                            ImageUrl A1Q = ((1Xj) this.A02).A1Q();
                            if (A1Q != null) {
                                str = A1Q.getUrl();
                            } else {
                                str = null;
                            }
                            I5X.A01(activity, i5x, str3, str, cEo.FH3().A00, A1D);
                        }
                    }
                    i = -1158159451;
                }
                AnonymousClass0fD.A0A(i, A0D);
                i2 = 1488449212;
                break;
            case 1:
                A032 = AnonymousClass0fD.A03(-1877783635);
                int A033 = AnonymousClass0fD.A03(-1108247132);
                C59631JQz jQz = (C59631JQz) this.A02;
                if (jQz != null) {
                    jQz.Ddd(this.A04);
                }
                1Xj r5 = (1Xj) this.A03;
                String str4 = this.A04;
                C275384q4 BgV = r5.A0C.BgV();
                if (BgV != null) {
                    1Xy r4 = r5.A0C;
                    BgV.CHj();
                    List CHj = BgV.CHj();
                    ArrayList<ProductTagDictIntf> arrayList = null;
                    if (CHj != null) {
                        ArrayList A1C2 = AnonymousClass7TE.A1C();
                        for (Object next : CHj) {
                            ProductDetailsProductItemDictIntf Bfu = ((ProductTagDictIntf) next).Bfu();
                            if (Bfu != null) {
                                str2 = Bfu.getProductId();
                            } else {
                                str2 = null;
                            }
                            DbY.A1T(str2, str4, next, A1C2);
                        }
                        arrayList = A1C2;
                    }
                    ArrayList arrayList2 = null;
                    new 1E9(new 1hu((UserSession) null), 6, false);
                    if (BgV instanceof CK7) {
                        if (arrayList != null) {
                            arrayList2 = AnonymousClass7TE.A1C();
                            for (ProductTagDictIntf productTagDictIntf : arrayList) {
                                if (productTagDictIntf != null) {
                                    arrayList2.add(productTagDictIntf.FHC());
                                }
                            }
                        }
                        TreeJNI treeJNI = (TreeJNI) BgV;
                        obj2 = C41845B3m.A0S(treeJNI, AnonymousClass7TF.A0w("in", arrayList2)).applyToTree(treeJNI);
                        0qQ.A07(obj2);
                    } else {
                        obj2 = C44142CXh.A00(arrayList);
                    }
                    r4.Egu((C275384q4) obj2);
                }
                if (r5.A5j() && r5.A5v()) {
                    C310336ap A0a = DbS.A0a();
                    DbS.A19((Context) this.A01, A0a, 2131973764);
                    DbY.A1N(A0a);
                }
                AnonymousClass0fD.A0A(-1574380667, A033);
                i2 = 1172849281;
                break;
            default:
                A032 = AnonymousClass0fD.A03(-798166786);
                int A034 = AnonymousClass0fD.A03(-1416413593);
                UserSession userSession = ((C55672HlV) this.A03).A00;
                1E8 A002 = 1E7.A00(userSession);
                String str5 = this.A04;
                1Xj A022 = A002.A02(str5);
                if (A022 == null) {
                    i4 = -1586325834;
                } else {
                    boolean A5d = A022.A5d();
                    int A0v = A022.A0v();
                    if (A5d) {
                        A022.A44(C243363Yl.NOT_LIKED);
                        i3 = A0v - 1;
                    } else {
                        A022.A44(C243363Yl.LIKED);
                        i3 = A0v + 1;
                    }
                    A022.A3u(i3);
                    C51967G9n.A1K(userSession, A022);
                    1Xj A0U = DbV.A0U(userSession, str5);
                    if (A0U != null) {
                        A0U.AE7(userSession);
                    }
                    i4 = 1527315981;
                }
                AnonymousClass0fD.A0A(i4, A034);
                i2 = -1556758817;
                break;
        }
        AnonymousClass0fD.A0A(i2, A032);
    }
}

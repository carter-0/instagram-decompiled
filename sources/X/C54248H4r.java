package X;

import android.content.Context;
import com.facebook.pando.TreeJNI;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductTagDictIntf;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.H4r  reason: case insensitive filesystem */
public final class C54248H4r extends 1P0 {
    public AnonymousClass6ST A00;
    public final 1P0 A01;
    public final 1Xj A02;
    public final boolean A03 = true;
    public final /* synthetic */ C55835HoI A04;

    public C54248H4r(1P0 r2, 1Xj r3, C55835HoI hoI) {
        this.A04 = hoI;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void onFail(C268654dm r5) {
        Object A002;
        int A032 = AnonymousClass0fD.A03(-1003183454);
        C59689JTv.A0D(this.A04.A00.requireContext(), AnonymousClass000.A00(1758));
        1P0 r2 = this.A01;
        if (!(r2 == null || (A002 = r5.A00()) == null)) {
            r2.onFail(new C268674do(A002));
        }
        AnonymousClass0fD.A0A(-1582258687, A032);
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(1005499666);
        AnonymousClass6ST r0 = this.A00;
        if (r0 != null) {
            r0.hide();
        }
        1P0 r02 = this.A01;
        if (r02 != null) {
            r02.onFinish();
        }
        AnonymousClass0fD.A0A(422988433, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(798968843);
        Context requireContext = this.A04.A00.requireContext();
        AnonymousClass6ST r1 = new AnonymousClass6ST(requireContext);
        this.A00 = r1;
        DbU.A18(requireContext, r1, 2131972142);
        AnonymousClass0fN.A00(this.A00);
        1P0 r0 = this.A01;
        if (r0 != null) {
            r0.onStart();
        }
        AnonymousClass0fD.A0A(1900112987, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Object obj2;
        String str;
        User BRo;
        int A032 = AnonymousClass0fD.A03(-490503288);
        int A033 = AnonymousClass0fD.A03(-2025112368);
        Object obj3 = obj;
        C54248H4r.super.onSuccess(obj3);
        1P0 r0 = this.A01;
        if (r0 != null) {
            r0.onSuccess(obj3);
        }
        1Xj r1 = this.A02;
        C55835HoI hoI = this.A04;
        UserSession userSession = hoI.A03;
        0eE r4 = AnonymousClass0t1.A01;
        r1.A40(userSession, r4.A01(userSession));
        if (this.A03) {
            User A012 = r4.A01(userSession);
            C275384q4 BgV = r1.A0C.BgV();
            if (BgV != null) {
                1Xy r7 = r1.A0C;
                BgV.CHj();
                List CHj = BgV.CHj();
                ArrayList<ProductTagDictIntf> arrayList = null;
                if (CHj != null) {
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    for (Object next : CHj) {
                        ProductDetailsProductItemDictIntf Bfu = ((ProductTagDictIntf) next).Bfu();
                        if (Bfu == null || (BRo = Bfu.BRo()) == null) {
                            str = null;
                        } else {
                            str = AnonymousClass3ZA.A00(BRo);
                        }
                        DbY.A1T(str, A012.getId(), next, A1C);
                    }
                    arrayList = A1C;
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
                r7.Egu((C275384q4) obj2);
            }
            C310336ap A0a = DbS.A0a();
            DbS.A19(hoI.A00.requireContext(), A0a, 2131971985);
            DbY.A1N(A0a);
        }
        AnonymousClass1pc.A00().Cnc(hoI.A00.requireContext(), hoI.A02, userSession, C54660HMr.SINGLE_UNTAG_CONFIRMATION_DIALOG, 1);
        r1.AE7(userSession);
        AnonymousClass0fD.A0A(-259545970, A033);
        AnonymousClass0fD.A0A(634746545, A032);
    }
}

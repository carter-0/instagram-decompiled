package X;

import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments;
import com.instagram.shopping.model.recon.ShoppingReconFeedEndpoint;
import go.Seq;
import java.util.ArrayList;
import org.webrtc.EglBase14Impl;

/* renamed from: X.WxL  reason: case insensitive filesystem */
public final class C20689WxL extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20689WxL(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static 0t0 A00(Object obj, int i) {
        return AnonymousClass0eN.A01(new C20689WxL(obj, i));
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [X.VwA, X.Uqk] */
    /* JADX WARNING: type inference failed for: r3v6, types: [X.4DU, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v7, types: [X.4DU, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object invoke() {
        String str;
        String str2;
        ArrayList arrayList;
        String str3;
        String str4;
        switch (this.A00) {
            case 0:
            case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
            case 25:
            case 32:
            case 44:
                return DbT.A0r(this.A01);
            case 2:
                int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                C15356Ub7 ub7 = (C15356Ub7) this.A01;
                Context requireContext = ub7.requireContext();
                String moduleName = ub7.getModuleName();
                AnonymousClass0eM r0 = ub7.A0F;
                UserSession A0l = AnonymousClass7TE.A0l(r0);
                r0.getValue();
                02m r6 = 02m.A0p;
                0qQ.A07(r6);
                return new C228312lJ(requireContext, r6, A0l, moduleName, 499007153);
            case 3:
                C15356Ub7 ub72 = (C15356Ub7) this.A01;
                return new C15727UhY(AnonymousClass7TE.A0l(ub72.A0F), (C228312lJ) ub72.A0H.getValue(), (C17900Vhr) ub72.A08.getValue(), ShoppingReconFeedEndpoint.ReconDestinationFeedEndpoint.A00, DbS.A0t(ub72.A09), DbS.A0t(ub72.A0G));
            case 4:
                C15356Ub7 ub73 = (C15356Ub7) this.A01;
                ub73.requireContext();
                return new C17470VWx(AnonymousClass7TE.A0l(ub73.A0F), (2el) AnonymousClass7TE.A14(ub73.A0K), (C18757Vzs) ub73.A05.getValue());
            case 5:
                throw new NullPointerException("requireActivity");
            case 6:
                throw new NullPointerException("session$delegate");
            case 7:
                throw new NullPointerException("session$delegate");
            case 8:
                throw new NullPointerException("requireArguments");
            case 9:
                throw new NullPointerException("requireArguments");
            case 10:
                throw new NullPointerException("requireArguments");
            case 11:
                throw new NullPointerException("requireArguments");
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                throw new NullPointerException("requireArguments");
            case 13:
                throw new NullPointerException("requireArguments");
            case 14:
                throw new NullPointerException("requireArguments");
            case 15:
                throw new NullPointerException("mArguments");
            case 16:
                throw new NullPointerException("requireContext");
            case 17:
            case 24:
            case 31:
            case 43:
                return this.A01;
            case 20:
                Fragment fragment = (C15334Uaj) this.A01;
                AnonymousClass0eM r5 = fragment.A0G;
                UserSession A0l2 = AnonymousClass7TE.A0l(r5);
                String str5 = fragment.A0D;
                if (str5 == null) {
                    str = "waterfallId";
                    break;
                } else {
                    String str6 = fragment.A0C;
                    if (str6 == null) {
                        str = "priorModule";
                        break;
                    } else {
                        0qQ.A0B(A0l2, 1);
                        return new C15717UhO(fragment.requireContext(), AnonymousClass07i.A00(fragment), AnonymousClass7TE.A0l(r5), new C18655VwA(A0l2, fragment, str5, str6));
                    }
                }
            case 21:
                C15333Uai uai = (C15333Uai) this.A01;
                C16222Uql uql = new C16222Uql(AnonymousClass7TE.A0l(uai.A09), uai, DbS.A0t(uai.A0B), DbS.A0t(uai.A07));
                uql.A01 = "products";
                return uql;
            case 22:
                return C320236s2.A01(DbS.A0B(this.A01), "prior_module");
            case 23:
                C15333Uai uai2 = (C15333Uai) this.A01;
                return new VTW(uai2.requireContext(), uai2, uai2.A03, uai2.A04, uai2.A00, uai2.A05);
            case 27:
                Fragment fragment2 = (C15333Uai) this.A01;
                return new C15718UhP(fragment2.requireContext(), AnonymousClass07i.A00(fragment2), AnonymousClass7TE.A0l(fragment2.A09), (C16222Uql) fragment2.A06.getValue());
            case 28:
                return C320236s2.A01(DbS.A0B(this.A01), "waterfall_id");
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                ? obj = new Object();
                C15266UYg uYg = (C15266UYg) this.A01;
                return new C321586uQ(AnonymousClass7TE.A0l(uYg.A03), uYg.A01, obj);
            case 30:
                return C228022kf.A00(((Fragment) this.A01).mArguments);
            case 34:
                C15266UYg uYg2 = (C15266UYg) this.A01;
                UserSession A0l3 = AnonymousClass7TE.A0l(uYg2.A03);
                Bundle bundle = uYg2.mArguments;
                String str7 = null;
                if (bundle != null) {
                    str2 = bundle.getString("displayed_user_id");
                } else {
                    str2 = null;
                }
                Bundle bundle2 = uYg2.mArguments;
                if (bundle2 != null) {
                    arrayList = bundle2.getParcelableArrayList("merchants");
                } else {
                    arrayList = null;
                }
                ? obj2 = new Object();
                String string = uYg2.requireArguments().getString("prior_module_name", "");
                0qQ.A07(string);
                String A0t = DbS.A0t(uYg2.A04);
                Bundle bundle3 = uYg2.mArguments;
                if (bundle3 != null) {
                    str3 = bundle3.getString("media_id");
                } else {
                    str3 = null;
                }
                Bundle bundle4 = uYg2.mArguments;
                if (bundle4 != null) {
                    str4 = bundle4.getString("tracking_token");
                } else {
                    str4 = null;
                }
                V4D v4d = uYg2.A00;
                if (v4d == null) {
                    str = "_delegate";
                    break;
                } else {
                    Bundle bundle5 = uYg2.mArguments;
                    if (bundle5 != null) {
                        str7 = bundle5.getString("prior_submodule_name");
                    }
                    return new C15730Uhb(A0l3, obj2, v4d, str2, string, A0t, str3, str4, str7, arrayList);
                }
            case 35:
                C15352Ub3 ub3 = (C15352Ub3) this.A01;
                AnonymousClass2tC A0S = DbV.A0S(ub3);
                A0S.A01(new C15773UiI(ub3.requireActivity(), AnonymousClass7TE.A0l(ub3.A08)));
                return DbU.A0U(A0S, new C15759Ui4(ub3.requireContext()));
            case 36:
                return DbS.A0B(this.A01);
            case 37:
                return ((BaseBundle) ((C15352Ub3) this.A01).A02.getValue()).getString("merchant_id");
            case 38:
                return ((BaseBundle) ((C15352Ub3) this.A01).A02.getValue()).getString("prior_module_name");
            case 39:
                return ((BaseBundle) ((C15352Ub3) this.A01).A02.getValue()).getString("prior_submodule_name");
            case 40:
                C15352Ub3 ub32 = (C15352Ub3) this.A01;
                C18626VvJ vvJ = new C18626VvJ(ub32, AnonymousClass7TE.A0l(ub32.A08), ub32, C16675UzB.SIMILAR_PRODUCTS, DbS.A0t(ub32.A09), DbS.A0t(ub32.A04), DbS.A0t(ub32.A05));
                vvJ.A00 = (2el) ub32.A0B.getValue();
                return vvJ.A02();
            case Seq.NULL_REFNUM /*41*/:
                return ((BaseBundle) ((C15352Ub3) this.A01).A02.getValue()).getString("product_id");
            case Seq.RefTracker.REF_OFFSET /*42*/:
                return C228022kf.A00((Bundle) ((C15352Ub3) this.A01).A02.getValue());
            case 46:
                C15352Ub3 ub33 = (C15352Ub3) this.A01;
                String A0t2 = DbS.A0t(ub33.A07);
                0qQ.A0A(A0t2);
                String A0t3 = DbS.A0t(ub33.A03);
                0qQ.A0A(A0t3);
                return new KET(ub33, AnonymousClass7TE.A0l(ub33.A08), ub33, A0t2, A0t3, DbS.A0t(ub33.A09));
            case 47:
                C15337Uam uam = (C15337Uam) this.A01;
                return new C17781Vfs(uam.requireContext(), uam, (C229382nI) uam.A08.getValue(), uam, AnonymousClass7TE.A0l(uam.A0C), uam.A04, uam.A05, (C17390VTr) uam.A0E.getValue());
            case 48:
                return C320236s2.A00(DbS.A0B(this.A01), ShoppingTaggingFeedArguments.class, C273654mx.A00(406));
            case 49:
                C15337Uam uam2 = (C15337Uam) this.A01;
                return C229382nI.A03(uam2, DbT.A0X(uam2.A0C), (2el) null);
            default:
                return DbY.A0I(this.A01);
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}

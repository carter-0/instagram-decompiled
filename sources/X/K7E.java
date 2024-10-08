package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.ui.bottomsheet.mixed.model.AvatarMixedAttributionModel;
import com.instagram.ui.bottomsheet.mixed.model.MixedAttributionModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public final class K7E extends AnonymousClass4DH implements G9c {
    public static final String __redex_internal_original_name = "MixedAttributionSheetFragment";
    public C312266e6 A00;
    public C331157Pu A01;
    public C66408MQo A02;
    public G6I A03;
    public C310216ac A04;
    public List A05;
    public AnonymousClass2t9 A06;
    public LB9 A07;
    public String A08;
    public boolean A09;
    public final AnonymousClass0eM A0A = C227642jf.A02(this);
    public final AnonymousClass0eM A0B;
    public final String A0C;

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        2eS.A01(view.requireViewById(R.id.attribution_title));
        RecyclerView A0c = JTR.A0c(view, R.id.attributions_recycler_view);
        Context context = getContext();
        if (context != null) {
            DbV.A1B(context, A0c);
            AnonymousClass2tC A002 = AnonymousClass2t9.A00(context);
            C331157Pu r4 = this.A01;
            String str2 = "bottomSheet";
            if (r4 != null) {
                LB9 lb9 = this.A07;
                String str3 = "delegate";
                if (lb9 != null) {
                    A002.A01(new C61643KFt(context, this, r4, lb9));
                    C331157Pu r42 = this.A01;
                    if (r42 != null) {
                        LB9 lb92 = this.A07;
                        if (lb92 != null) {
                            A002.A01(new C61642KFs(context, this, r42, lb92));
                            C331157Pu r43 = this.A01;
                            if (r43 != null) {
                                LB9 lb93 = this.A07;
                                if (lb93 != null) {
                                    A002.A01(new C61635KFl(context, r43, lb93));
                                    C331157Pu r12 = this.A01;
                                    if (r12 != null) {
                                        LB9 lb94 = this.A07;
                                        if (lb94 != null) {
                                            AnonymousClass0eM r5 = this.A0A;
                                            this.A06 = DbU.A0U(A002, new C61647KFx(context, this, AnonymousClass7TE.A0l(r5), r12, lb94));
                                            ViewModelListUpdate A0R = DbS.A0R();
                                            List list = this.A05;
                                            str2 = "mixedAttributionModels";
                                            if (list != null) {
                                                A0R.A01(list);
                                                AnonymousClass2t9 r0 = this.A06;
                                                str3 = "adapter";
                                                if (r0 != null) {
                                                    r0.A05(A0R);
                                                    AnonymousClass2t9 r02 = this.A06;
                                                    if (r02 != null) {
                                                        A0c.setAdapter(r02);
                                                        List<Object> list2 = this.A05;
                                                        if (list2 != null) {
                                                            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                                                for (Object obj : list2) {
                                                                    if (obj instanceof AvatarMixedAttributionModel) {
                                                                        if (182.A06(0Tu.A06, DbT.A0X(r5), 36324557056913560L)) {
                                                                            07U r44 = 07U.A05;
                                                                            AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
                                                                            AnonymousClass0xx A003 = AnonymousClass07a.A00(viewLifecycleOwner);
                                                                            C59845JaL jaL = new C59845JaL(viewLifecycleOwner, r44, this, (AnonymousClass4D7) null, 25);
                                                                            19B r45 = 19B.A00;
                                                                            1Eo.A05(r45, jaL, A003);
                                                                            List list3 = this.A05;
                                                                            if (list3 != null) {
                                                                                for (Object next : list3) {
                                                                                    if (next instanceof AvatarMixedAttributionModel) {
                                                                                        AvatarMixedAttributionModel avatarMixedAttributionModel = (AvatarMixedAttributionModel) next;
                                                                                        if (avatarMixedAttributionModel != null && (str = avatarMixedAttributionModel.A01) != null) {
                                                                                            2YL A0H = DbS.A0H(this.A0B);
                                                                                            Object obj2 = avatarMixedAttributionModel.A01;
                                                                                            if (obj2 != null) {
                                                                                                DbS.A1Y(obj2);
                                                                                                String str4 = (String) obj2;
                                                                                                1Eo.A05(r45, new MGN((Object) A0H, str, str4, (AnonymousClass4D7) null, 19), JTP.A0J(A0H, str4, 0));
                                                                                                return;
                                                                                            }
                                                                                            str2 = "attributionObject";
                                                                                        } else {
                                                                                            return;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                                                            }
                                                                            0qQ.A0F(str2);
                                                                            throw AnonymousClass00P.createAndThrow();
                                                                        }
                                                                    }
                                                                }
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                0qQ.A0F(str3);
                throw AnonymousClass00P.createAndThrow();
            }
            0qQ.A0F(str2);
            throw AnonymousClass00P.createAndThrow();
        }
        throw AnonymousClass7TE.A0y();
    }

    public final Integer BkZ() {
        return AnonymousClass05K.A07;
    }

    public final String getModuleName() {
        return this.A0C;
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0A);
    }

    public K7E() {
        C20698WxU wxU = new C20698WxU((Object) this, 14);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C20698WxU((Object) new C20698WxU((Object) this, 11), 12));
        this.A0B = DbS.A0I(new C20698WxU((Object) A002, 13), wxU, new C20614Wvv(21, (Object) null, A002), DbS.A0z(C60143JgO.class));
        this.A0C = "mixed_attribution_bottom_sheet";
    }

    public static final void A00(K7E k7e, Integer num, String str) {
        String str2;
        ViewModelListUpdate A0R = DbS.A0R();
        List list = k7e.A05;
        if (list == null) {
            str2 = "mixedAttributionModels";
        } else {
            ArrayList A0r = AnonymousClass7TG.A0r(list);
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    MixedAttributionModel mixedAttributionModel = (MixedAttributionModel) it.next();
                    if (mixedAttributionModel instanceof AvatarMixedAttributionModel) {
                        SimpleImageUrl A0V = DbS.A0V(str);
                        Object obj = mixedAttributionModel.A01;
                        if (obj == null) {
                            str2 = "attributionObject";
                            break;
                        } else {
                            mixedAttributionModel = new AvatarMixedAttributionModel(k7e.requireContext(), A0V, num, obj, ((AvatarMixedAttributionModel) mixedAttributionModel).A01);
                        }
                    }
                    A0r.add(mixedAttributionModel);
                } else {
                    A0R.A01(A0r);
                    AnonymousClass2t9 r0 = k7e.A06;
                    if (r0 == null) {
                        str2 = "adapter";
                    } else {
                        r0.A05(A0R);
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-517341316);
        K7E.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        ArrayList parcelableArrayList = requireArguments.getParcelableArrayList(C273654mx.A00(3040));
        if (parcelableArrayList != null) {
            this.A05 = parcelableArrayList;
            this.A08 = requireArguments.getString("source_media_id");
            this.A09 = requireArguments.getBoolean(C273654mx.A00(2946));
            UserSession A0l = AnonymousClass7TE.A0l(this.A0A);
            C310216ac r10 = this.A04;
            C312266e6 r6 = this.A00;
            if (r6 == null) {
                0qQ.A0F("effectSheetDelegate");
                throw AnonymousClass00P.createAndThrow();
            }
            this.A07 = new LB9(this, A0l, r6, this.A02, this.A03, this, r10, this.A08, this.A09);
            AnonymousClass0fD.A09(-537484245, A022);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(-1328911345, A022);
        throw A0y;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(626303318);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.mixed_attribution_sheet_fragment, viewGroup, false);
        AnonymousClass0fD.A09(1331224103, A022);
        return inflate;
    }
}

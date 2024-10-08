package X;

import android.content.Context;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Currency;

public final class UZL extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "DirectThreadOrderFragment";
    public ImmutableList A00;
    public AnonymousClass2t9 A01;
    public C17422VVb A02;
    public String A03;
    public RecyclerView A04;
    public final AnonymousClass0eM A05 = C227642jf.A02(this);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1C(r2, getString(2131959005));
    }

    public final String getModuleName() {
        return "direct_thread_order_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String A0R;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass2tC A0S = DbV.A0S(this);
        AnonymousClass0eM r4 = this.A05;
        String A0u = DbU.A0u(r4);
        String str2 = this.A03;
        if (str2 == null) {
            str = "consumerId";
        } else {
            this.A01 = DbU.A0U(A0S, new EG4(A0u, str2));
            RecyclerView A0K = DbX.A0K(view);
            this.A04 = A0K;
            if (A0K == null) {
                DbT.A1Q(0wj.A01, "DirectThreadOrderFragment - recycler view is null", 20134884);
            }
            RecyclerView recyclerView = this.A04;
            str = "recyclerView";
            if (recyclerView != null) {
                DbY.A16(this, recyclerView);
                RecyclerView recyclerView2 = this.A04;
                if (recyclerView2 != null) {
                    AnonymousClass2t9 r0 = this.A01;
                    if (r0 == null) {
                        str = "igRecyclerViewAdapter";
                    } else {
                        recyclerView2.setAdapter(r0);
                        Context A0S2 = AnonymousClass7TE.A0S(view);
                        String str3 = this.A03;
                        String str4 = "consumerId";
                        if (str3 != null) {
                            if (str3.length() > 0) {
                                C17422VVb vVb = this.A02;
                                if (vVb == null) {
                                    str4 = "logger";
                                } else {
                                    String A0u2 = DbU.A0u(r4);
                                    String str5 = this.A03;
                                    if (str5 != null) {
                                        0Aj A0e = AnonymousClass7TE.A0e(vVb.A01, "biig_order_management_all_orders_impression");
                                        if (A0e.isSampled()) {
                                            C13992Tns.A0i(A0e, A0u2, str5);
                                        }
                                    }
                                }
                            }
                            ArrayList arrayList = new ArrayList();
                            ViewModelListUpdate viewModelListUpdate = new ViewModelListUpdate();
                            ImmutableList immutableList = this.A00;
                            if (immutableList == null) {
                                str4 = "orders";
                            } else {
                                C249803kO A0J = C66580MXl.A0J(immutableList);
                                while (A0J.hasNext()) {
                                    C250663lr r10 = (C250663lr) AnonymousClass7TF.A0a(A0J);
                                    UserSession A0l = AnonymousClass7TE.A0l(r4);
                                    0qQ.A0B(r10, 1);
                                    String A0c = DbY.A0c(A0S2, String.valueOf(r10.A0C("order_id")), 2131959007);
                                    String optionalStringField = r10.getOptionalStringField(0, Pxd.A00(43));
                                    Currency A032 = C18792W1y.A03(A0l);
                                    0qQ.A07(A032);
                                    if (optionalStringField == null) {
                                        A0R = "";
                                    } else {
                                        A0R = 002.A0R(A032.getSymbol(), optionalStringField);
                                    }
                                    int coercedIntField = r10.getCoercedIntField(3, AnonymousClass000.A00(5335));
                                    Calendar instance = Calendar.getInstance();
                                    0qQ.A07(instance);
                                    instance.setTimeInMillis((((long) coercedIntField) & 4294967295L) * 1000);
                                    String A0c2 = DbY.A0c(A0S2, DateFormat.format(C273654mx.A00(220), instance).toString(), 2131959008);
                                    if (AnonymousClass000.A00(2135).equalsIgnoreCase(r10.getOptionalStringField(6, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS))) {
                                        A0c2 = 002.A0g(A0c2, A0S2.getString(2131961000), A0S2.getString(2131959006));
                                    }
                                    arrayList.add(new FY3(new C49539Exa(A0c, A0R, A0c2)));
                                }
                                viewModelListUpdate.A01(arrayList);
                                AnonymousClass2t9 r02 = this.A01;
                                if (r02 == null) {
                                    str4 = "igRecyclerViewAdapter";
                                } else {
                                    r02.A05(viewModelListUpdate);
                                    return;
                                }
                            }
                        }
                        0qQ.A0F(str4);
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        int A022 = AnonymousClass0fD.A02(235364373);
        UZL.super.onCreate(bundle);
        this.A02 = new C17422VVb(AnonymousClass7TE.A0l(this.A05), "direct_thread_order_fragment");
        Bundle bundle2 = this.mArguments;
        String str = null;
        if (bundle2 != null) {
            serializable = bundle2.getSerializable("order_list");
        } else {
            serializable = null;
        }
        0qQ.A0C(serializable, "null cannot be cast to non-null type com.google.common.collect.ImmutableList<com.instagram.direct.ordermanagement.graphql.IGP2MOrderManagementOrderListQueryResponse.XfbIgP2mGetOrders>");
        this.A00 = (ImmutableList) serializable;
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            str = bundle3.getString("consumer_id");
        }
        String valueOf = String.valueOf(str);
        if (valueOf == null) {
            valueOf = "";
        }
        this.A03 = valueOf;
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            bundle4.remove("order_list");
        }
        AnonymousClass0fD.A09(-1007858657, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1414469637);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.direct_thread_order_view, viewGroup, false);
        AnonymousClass0fD.A09(-620186841, A022);
        return inflate;
    }
}

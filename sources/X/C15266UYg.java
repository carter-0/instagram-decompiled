package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.UYg  reason: case insensitive filesystem */
public final class C15266UYg extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "ShopSelectorFragment";
    public V4D A00;
    public final 2el A01 = 2el.A00();
    public final AnonymousClass0eM A02 = C20689WxL.A00(this, 29);
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final AnonymousClass0eM A04 = C20689WxL.A00(this, 30);
    public final AnonymousClass0eM A05;
    public final AnonymousClass0iw A06;

    public final String getModuleName() {
        return "instagram_shopping_shop_selector";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public C15266UYg() {
        C20689WxL wxL = new C20689WxL(this, 34);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C20689WxL(new C20689WxL(this, 31), 32));
        this.A05 = new C227862kA(new C20689WxL(A002, 33), wxL, new C20613Wvu(37, A002, (Object) null), new 0Yh(C67735Mto.class));
        this.A06 = new 0xG("instagram_shopping_shop_selector");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        List<N3G> list;
        int A022 = AnonymousClass0fD.A02(458973640);
        0qQ.A0B(layoutInflater, 0);
        AnonymousClass2t9 A0U = DbU.A0U(new AnonymousClass2tC(layoutInflater), new NOS(this.A06, (C321586uQ) this.A02.getValue(), new C20785Wyw(this, 3)));
        C67735Mto mto = (C67735Mto) this.A05.getValue();
        if (!(mto == null || (list = mto.A08) == null)) {
            ArrayList A0r = AnonymousClass7TG.A0r(list);
            for (N3G oto : list) {
                A0r.add(new C71963Oto(oto));
            }
            ViewModelListUpdate viewModelListUpdate = new ViewModelListUpdate();
            viewModelListUpdate.A01(A0r);
            A0U.A05(viewModelListUpdate);
        }
        View inflate = layoutInflater.inflate(R.layout.layout_recyclerview, viewGroup, false);
        0qQ.A0C(inflate, C273654mx.A00(4));
        RecyclerView recyclerView = (RecyclerView) inflate;
        DbV.A1B(getContext(), recyclerView);
        recyclerView.setAdapter(A0U);
        Dba.A0z(recyclerView, this.A01, this);
        AnonymousClass0fD.A09(1254840068, A022);
        return recyclerView;
    }
}

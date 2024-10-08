package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;

/* renamed from: X.Lkz  reason: case insensitive filesystem */
public final class C64960Lkz implements MXG {
    public static final String __redex_internal_original_name = "FitnessStickerPickerController";
    public View A00;
    public RecyclerView A01;
    public C60387Jkg A02;
    public final ViewStub A03;
    public final AnonymousClass8MH A04;
    public final Set A05 = DbS.A0y();
    public final Context A06;
    public final Fragment A07;
    public final UserSession A08;
    public final C60113Jfu A09;

    public C64960Lkz(ViewStub viewStub, Fragment fragment, UserSession userSession, AnonymousClass8MH r6) {
        0qQ.A0B(viewStub, 1);
        this.A03 = viewStub;
        this.A08 = userSession;
        this.A07 = fragment;
        this.A04 = r6;
        this.A06 = viewStub.getContext();
        this.A09 = JTO.A0L(new KBE(), fragment.requireActivity()).A00(C60113Jfu.class);
    }

    public final /* synthetic */ void Cw3() {
    }

    public final /* synthetic */ void Dfq() {
    }

    public final Set Acf() {
        return this.A05;
    }

    public final /* synthetic */ boolean CII() {
        return false;
    }

    public final void E0h() {
        C60113Jfu jfu = this.A09;
        UserSession userSession = this.A08;
        2IS A042 = C41845B3m.A04();
        2IS A043 = C41845B3m.A04();
        Locale A022 = AnonymousClass1Q2.A02();
        boolean A1Z = C41848B3p.A1Z(A042, "locale", 002.A0T(A022.getLanguage(), A022.getCountry(), '_'));
        String id = TimeZone.getDefault().getID();
        0qQ.A07(id);
        A042.A04("timezone", AnonymousClass7TF.A0k(00p.A0g(id, "/", "_", false)));
        1vm.A01(userSession).ATL((2Kw) null, new C64397LbE(jfu, 11), new PandoGraphQLRequest(C41845B3m.A06(A1Z), "FitnessStickerFetchQuery", A042.getParamsCopy(), A043.getParamsCopy(), C42501Bdi.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "fitness_stickers", AnonymousClass7TE.A1C()));
        if (this.A00 == null) {
            View inflate = this.A03.inflate();
            Set set = this.A05;
            set.clear();
            0qQ.A0A(inflate);
            set.add(inflate);
            AOX.A00(inflate.requireViewById(R.id.back_button), 1, this);
            this.A01 = DbT.A0I(inflate, R.id.pencilheart_recycler_view);
            C60387Jkg jkg = new C60387Jkg(this.A04);
            this.A02 = jkg;
            RecyclerView recyclerView = this.A01;
            if (recyclerView != null) {
                recyclerView.setAdapter(jkg);
            }
            RecyclerView recyclerView2 = this.A01;
            if (recyclerView2 != null) {
                DbV.A1B(inflate.getContext(), recyclerView2);
            }
            this.A00 = inflate;
        }
        Dba.A16(this.A07, jfu.A00, new C58727Iwa(this, 37), 56);
        View view = this.A00;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public final void close() {
        AnonymousClass7TH.A0R(this.A00);
        this.A09.A00.A05(this.A07);
    }

    public final String getModuleName() {
        return "fitness_sticker";
    }

    public final /* synthetic */ boolean isScrolledToBottom() {
        return false;
    }

    public final /* synthetic */ boolean isScrolledToTop() {
        return false;
    }
}

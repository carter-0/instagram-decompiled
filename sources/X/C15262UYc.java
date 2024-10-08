package X;

import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* renamed from: X.UYc  reason: case insensitive filesystem */
public final class C15262UYc extends C240383Kr {
    public RecyclerView A00;
    public 0sP A01;
    public final AnonymousClass0eM A02;

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        RecyclerView A0I = DbT.A0I(view, R.id.country_recycler_view);
        this.A00 = A0I;
        if (A0I != null) {
            DbV.A1B(getActivity(), A0I);
        }
        AnonymousClass0eM r3 = this.A02;
        C67789Mut mut = new C67789Mut(new C20786Wyx(this, 5), ((U8V) r3.getValue()).A05);
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.setAdapter(mut);
        }
        DbV.A1F(getViewLifecycleOwner(), ((U8V) r3.getValue()).A00, new MPB(17, (Object) mut, (Object) this), 3);
        ((IgdsInlineSearchBox) AnonymousClass7TF.A0F(view, R.id.search_box)).A02 = new WY1(this, 1);
        AnonymousClass7TF.A0G(view, R.id.nav_buttons_and_title_container).setVisibility(DbW.A01(((U8V) r3.getValue()).A04 ? 1 : 0));
        if (((U8V) r3.getValue()).A04) {
            WB9.A00(AnonymousClass7TF.A0G(view, R.id.back_button_icon), 58, this);
        }
    }

    public C15262UYc() {
        C20696WxS wxS = new C20696WxS(this, 38);
        AnonymousClass0eM A002 = C20696WxS.A00(new C20696WxS(this, 35), 0eO.A02, 36);
        this.A02 = new C227862kA(new C20696WxS(A002, 37), wxS, new C73666Phf(47, (Object) null, A002), new 0Yh(U8V.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1891906798);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_lead_gen_country_picker, viewGroup, false);
        AnonymousClass0fD.A09(1343740376, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1291030140);
        C15262UYc.super.onDestroyView();
        this.A00 = null;
        AnonymousClass0fD.A09(1139877462, A022);
    }

    public final void onStart() {
        Window window;
        int A022 = AnonymousClass0fD.A02(-634709617);
        C15262UYc.super.onStart();
        if (((U8V) this.A02.getValue()).A04) {
            int i = Resources.getSystem().getDisplayMetrics().widthPixels;
            int i2 = Resources.getSystem().getDisplayMetrics().heightPixels;
            Dialog dialog = this.A01;
            if (!(dialog == null || (window = dialog.getWindow()) == null)) {
                window.setLayout((int) (((double) i) * 0.9d), (int) (((double) i2) * 0.9d));
            }
        }
        AnonymousClass0fD.A09(1545980879, A022);
    }
}

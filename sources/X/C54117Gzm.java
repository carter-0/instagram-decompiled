package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.Gzm  reason: case insensitive filesystem */
public final class C54117Gzm extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "PivotPageDefaultCtaFragment";
    public View A00;
    public IgdsButton A01;
    public H1A A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04 = C227642jf.A02(this);

    public final String getModuleName() {
        return "pivot_page_default_cta_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsButton igdsButton = (IgdsButton) view.requireViewById(R.id.cta_button);
        C56801ICy.A01(igdsButton, 21, this);
        this.A01 = igdsButton;
        C51969G9p.A15(getViewLifecycleOwner(), ((C52989Ggg) this.A03.getValue()).A01, C59097J6f.A01(this, 31), 21);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public C54117Gzm() {
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new MMH(new MMH(this, 42), 43));
        0Yh A0z = DbS.A0z(C52989Ggg.class);
        this.A03 = DbS.A0I(new MMH(A002, 44), C58690Ivz.A00(A002, this, 26), C58690Ivz.A00((Object) null, A002, 25), A0z);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-361055100);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_pivot_default_cta_fragment, viewGroup, false);
        this.A00 = inflate;
        if (inflate == null) {
            0qQ.A0F("rootView");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass0fD.A09(1893363603, A022);
        return inflate;
    }
}

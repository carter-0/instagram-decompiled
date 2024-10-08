package X;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.facebook.litho.LithoView;

public final class H0H extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "FollowUpBottomSheetFragment";
    public LithoView A00;
    public AnonymousClass1eD A01;
    public C246193eB A02;
    public C54696HPb A03;
    public JQH A04;
    public 1sy A05;
    public final AnonymousClass0eM A06 = C227642jf.A02(this);
    public final C55505Hin A07 = new C55505Hin(this);

    public final String getModuleName() {
        return "follow_up_bottom_sheet";
    }

    public final void onAttach(Context context) {
        0qQ.A0B(context, 0);
        H0H.super.onAttach(context);
        AnonymousClass37D A0g = DbV.A0g(this, AnonymousClass37D.A00);
        if (A0g != null) {
            ((AnonymousClass37F) A0g).A0H = new C57394IZz(this, 3);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        A00(this);
    }

    public static final void A00(H0H h0h) {
        AnonymousClass1eD r4 = h0h.A01;
        if (r4 != null) {
            LithoView lithoView = h0h.A00;
            if (lithoView == null) {
                0qQ.A0F("lithoView");
                throw AnonymousClass00P.createAndThrow();
            } else {
                lithoView.setComponent(new C53692Gsj(r4, AnonymousClass7TE.A0l(h0h.A06), h0h.A07));
            }
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        LithoView lithoView = this.A00;
        if (lithoView == null) {
            0qQ.A0F("lithoView");
            throw AnonymousClass00P.createAndThrow();
        }
        ViewTreeObserver viewTreeObserver = lithoView.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new C71444Okj(this, 2));
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1493003656);
        0qQ.A0B(layoutInflater, 0);
        LithoView lithoView = new LithoView(layoutInflater.getContext());
        this.A00 = lithoView;
        AnonymousClass0fD.A09(-624812751, A022);
        return lithoView;
    }
}

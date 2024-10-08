package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.android.R;

/* renamed from: X.K7s  reason: case insensitive filesystem */
public final class C61442K7s extends C227812jx implements CallerContextable {
    public static final String __redex_internal_original_name = "CtaSelectorFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);
    public final AnonymousClass0eM A01;

    public final String getModuleName() {
        return "cta_selector";
    }

    public final void onRecyclerViewCreated(RecyclerView recyclerView) {
        DbV.A1B(JTP.A0C(recyclerView, 0), recyclerView);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        getScrollingViewProxy().ENw(getAdapter());
        C60242Jhz jhz = (C60242Jhz) this.A01.getValue();
        Dba.A15(getViewLifecycleOwner(), jhz.A01, MP5.A00(this, 49), 7);
        DbZ.A1C(this, MGV.A01(this, (AnonymousClass4D7) null, 48), jhz.A05);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public C61442K7s() {
        MMQ A002 = MMQ.A00(this, 27);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(0eO.A02, MMQ.A00(MMQ.A00(this, 24), 25));
        this.A01 = DbS.A0I(MMQ.A00(A003, 26), A002, C66291MMa.A00((Object) null, A003, 38), DbS.A0z(C60242Jhz.class));
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-500988749);
        super.onCreate(bundle);
        requireArguments();
        setAdapter(new K96(AnonymousClass7TE.A0l(this.A00)));
        AnonymousClass0fD.A09(-576519206, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1503478136);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_cta_selector, viewGroup, false);
        AnonymousClass0fD.A09(1849842089, A02);
        return inflate;
    }
}

package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.instagram.android.R;

public final class E44 extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "EffectLicensingFragment";
    public EffectAttribution A00;
    public AnonymousClass0wW A01;

    public final String getModuleName() {
        return AnonymousClass000.A00(281);
    }

    public final AnonymousClass0wW getSession() {
        return this.A01;
    }

    public final void configureActionBar(2da r4) {
        r4.setTitle(DbV.A05(this).getString(2131964921));
        DbX.A1A(new FP6((Object) this, 5), DbV.A0K(), r4);
    }

    public final boolean onBackPressed() {
        DbT.A1K(this);
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1124765370);
        E44.super.onCreate(bundle);
        this.A01 = DbX.A0T(this);
        this.A00 = (EffectAttribution) requireArguments().getParcelable("ar_effect_licensing");
        AnonymousClass0fD.A09(-131714806, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-157361744);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.effect_licensing_fragment_layout);
        AnonymousClass0fD.A09(-1337295839, A02);
        return A0C;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        EffectAttribution effectAttribution = this.A00;
        if (effectAttribution != null) {
            Bundle requireArguments = requireArguments();
            RecyclerView recyclerView = (RecyclerView) DbU.A0B(view, R.id.recyclerview);
            Context context = view.getContext();
            DbU.A15(context, recyclerView, 1, false);
            C275824s0 r1 = new C275824s0(context, 1);
            r1.A01(context.getDrawable(R.drawable.effect_licensing_divider));
            recyclerView.A11(r1);
            recyclerView.setAdapter(new QEZ(requireArguments, effectAttribution, this));
        }
    }
}

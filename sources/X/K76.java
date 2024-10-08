package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.instagram.android.R;

public final class K76 extends AnonymousClass4DH implements MXF {
    public static final String __redex_internal_original_name = "MediaKitIntroFragment";
    public int A00;
    public View A01;
    public View A02;
    public ViewGroup A03;
    public 2dZ A04;
    public final AnonymousClass4DS A05 = new C64464LcR(this, 4);
    public final AnonymousClass0eM A06 = C227642jf.A02(this);
    public final AnonymousClass0eM A07 = DbS.A0I(new MMD(this, 23), new MMD(this, 24), MMW.A00((Object) null, this, 14), DbS.A0z(C60327JjW.class));
    public final AnonymousClass0eM A08 = MMD.A00(this, 22);

    public final String getModuleName() {
        return "MediaKitHomeFragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        LY6.A01(view.requireViewById(R.id.mk_intro_bottom_button), 59, this);
        this.A00 = 2db.A01(getActivity());
        ViewGroup A0C = DbU.A0C(view, R.id.mk_action_bar);
        this.A03 = A0C;
        String str = "actionBar";
        if (A0C != null) {
            this.A04 = new 2dZ(C64271LXx.A00, A0C);
            ViewGroup viewGroup = this.A03;
            if (viewGroup != null) {
                this.A04 = new 2dZ(LY6.A00(this, 60), viewGroup);
                View requireViewById = view.requireViewById(R.id.mk_status_bar_background);
                this.A02 = requireViewById;
                str = "statusBarLayout";
                if (requireViewById != null) {
                    requireViewById.setBackgroundColor(2db.A00(requireActivity()));
                    View view2 = this.A02;
                    if (view2 != null) {
                        JTP.A14(view2, -1, this.A00);
                        2dZ r1 = this.A04;
                        if (r1 != null) {
                            r1.A0X(this.A05);
                        }
                        Window A0G = DbV.A0G(this);
                        0qQ.A07(A0G);
                        2db.A08(A0G, true);
                        2db.A02(requireActivity(), 0);
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final LDW BO3() {
        return (LDW) this.A08.getValue();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-2090988823);
        K76.super.onCreate(bundle);
        C64127LPb.A01(this, AnonymousClass05K.A01);
        AnonymousClass0fD.A09(1186114282, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1454041883);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.media_kit_intro_fragment, false);
        AnonymousClass0fD.A09(-612072475, A022);
        return A0D;
    }
}

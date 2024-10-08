package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.immersivecatchup.repository.ImmersiveCatchUpRepository;
import com.instagram.model.reels.Reel;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class K4T extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "ImmersiveCatchUpFragment";
    public AnonymousClass2t9 A00;
    public ImmersiveCatchUpRepository A01;
    public RecyclerView A02;
    public final AnonymousClass3PN A03 = new C65588LwO(this, 1);
    public final List A04 = AnonymousClass7TE.A1C();
    public final AnonymousClass0eM A05 = C227642jf.A02(this);
    public final C63654L1q A06 = new C63654L1q(this);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.2tL, java.lang.Object] */
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C61167JyJ jyJ = new C61167JyJ();
        ? obj = new Object();
        List list = this.A04;
        list.add(jyJ);
        list.add(obj);
        ViewModelListUpdate A0R = DbS.A0R();
        A0R.A00(jyJ);
        A0R.A00(obj);
        AnonymousClass2t9 r0 = this.A00;
        if (r0 == null) {
            str = "immersiveItemAdapter";
        } else {
            r0.A05(A0R);
            AnonymousClass0xx A0E = DbW.A0E(this);
            MG8 mg8 = new MG8(this, (AnonymousClass4D7) null, 49);
            19B r3 = 19B.A00;
            1Eo.A05(r3, mg8, A0E);
            ImmersiveCatchUpRepository immersiveCatchUpRepository = this.A01;
            if (immersiveCatchUpRepository == null) {
                str = "repository";
            } else {
                Iterator A1H = C51966G9m.A1H(immersiveCatchUpRepository.A00().A00);
                while (A1H.hasNext()) {
                    String id = ((Reel) A1H.next()).getId();
                    if (id != null) {
                        AnonymousClass0eM r2 = this.A05;
                        AnonymousClass3PO.A00(AnonymousClass7TE.A0l(r2)).A05(this.A03, id, (String) null, false);
                        AnonymousClass3PO.A00(AnonymousClass7TE.A0l(r2)).A02(AnonymousClass3BU.ON_TAP, id, __redex_internal_original_name, (Map) null);
                    }
                }
                1Eo.A05(r3, new MFT(this, (AnonymousClass4D7) null, 0), DbW.A0E(this));
                super.onViewCreated(view, bundle);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A00(K4T k4t, C16512UwG uwG) {
        int i;
        K4G k4g = new K4G();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putSerializable(AnonymousClass000.A00(1452), uwG);
        k4g.setArguments(A0a);
        C331127Pr A0f = DbX.A0f(k4t.A05);
        A0f.A03 = 0.9f;
        DbS.A1S(A0f, true);
        int ordinal = uwG.ordinal();
        Context requireContext = k4t.requireContext();
        if (ordinal != 0) {
            i = 2131964157;
        } else {
            i = 2131964154;
        }
        A0f.A0d = AnonymousClass7TE.A16(requireContext, i);
        DbY.A13(k4t, k4g, A0f);
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1557822633);
        K4T.super.onCreate(bundle);
        this.A01 = C63303Kum.A00(AnonymousClass7TE.A0l(this.A05));
        AnonymousClass0fD.A09(1388651732, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-435251937);
        0qQ.A0B(layoutInflater, 0);
        DbV.A0G(this).getDecorView().setSystemUiVisibility(5126);
        View inflate = layoutInflater.inflate(R.layout.immersive_catch_up_fragment_layout, viewGroup, false);
        this.A02 = DbZ.A0F(inflate, R.id.catch_up_recycler_view);
        View A0b = AnonymousClass7TE.A0b(inflate, R.id.exit_button);
        int width = A0b.getWidth() + AnonymousClass7TG.A06(requireActivity()) + JTR.A07(requireActivity());
        LY6.A01(A0b, 36, this);
        AnonymousClass2tC A0S = DbV.A0S(this);
        A0S.A01(new C61658KGi(requireContext(), this.A06));
        Context requireContext = requireContext();
        AnonymousClass0eM r5 = this.A05;
        A0S.A01(new NQB(requireContext, AnonymousClass7TE.A0l(r5)));
        A0S.A01(new C15824Uj7(requireActivity(), AnonymousClass7TE.A0l(r5), width));
        FragmentActivity requireActivity = requireActivity();
        r5.getValue();
        this.A00 = DbU.A0U(A0S, new KGX(requireActivity));
        RecyclerView recyclerView = this.A02;
        String str = "recyclerView";
        if (recyclerView != null) {
            DbV.A1B(recyclerView.getContext(), recyclerView);
            AnonymousClass2t9 r0 = this.A00;
            if (r0 == null) {
                str = "immersiveItemAdapter";
            } else {
                recyclerView.setAdapter(r0);
                C228422le r1 = new C228422le();
                RecyclerView recyclerView2 = this.A02;
                if (recyclerView2 != null) {
                    r1.A07(recyclerView2);
                    AnonymousClass0fD.A09(905833473, A022);
                    return inflate;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}

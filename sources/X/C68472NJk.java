package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;

/* renamed from: X.NJk  reason: case insensitive filesystem */
public final class C68472NJk extends AnonymousClass4DH implements JPL, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "ThreadDetailsChatControlsFragment";
    public int A00 = -1;
    public NL6 A01;
    public C74449Pv4 A02;
    public C71464Ol6 A03;
    public N4P A04;
    public AnonymousClass4kA A05;
    public boolean A06;
    public boolean A07;
    public RecyclerView A08;
    public Capabilities A09;
    public C254793t3 A0A;
    public final C358618bC A0B = new C72739PHt(this, 3);
    public final AnonymousClass0eM A0C = C227642jf.A02(this);
    public final Ot0 A0D = new Ot0(this, 2);
    public final 1a8 A0E = C66580MXl.A0O();

    public final void AHB() {
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A08 = DbZ.A0F(view, R.id.recycler_view);
        NL6 nl6 = new NL6(requireContext());
        this.A01 = nl6;
        RecyclerView recyclerView = this.A08;
        String str = "recyclerView";
        if (recyclerView != null) {
            recyclerView.setAdapter(nl6);
            RecyclerView recyclerView2 = this.A08;
            if (recyclerView2 != null) {
                DbU.A15(getContext(), recyclerView2, 1, false);
                1a8 r2 = this.A0E;
                C74449Pv4 pv4 = this.A02;
                if (pv4 != null) {
                    PU8.A00(pv4.BNa().APA(), r2, this, 28);
                    C74449Pv4 pv42 = this.A02;
                    if (pv42 != null) {
                        C74550Pwj.A00(pv42);
                        return;
                    }
                }
                str = "clientInfra";
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0C);
    }

    public final void Cfo() {
        FragmentActivity requireActivity = requireActivity();
        if (!C69959Nuz.A00(requireActivity)) {
            this.A0E.A01();
            requireActivity.finish();
        }
    }

    public final void configureActionBar(2da r2) {
        Dbb.A1I(r2);
        r2.Eom(2131958962);
    }

    public final void onCreate(Bundle bundle) {
        IllegalArgumentException illegalArgumentException;
        int i;
        String str;
        int A022 = AnonymousClass0fD.A02(-237986753);
        C68472NJk.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        Capabilities capabilities = (Capabilities) requireArguments.getParcelable("DirectFragment.DIRECT_FRAGMENT_THREAD_CAPABILITIES");
        if (capabilities != null) {
            this.A09 = capabilities;
            C254793t3 A002 = OXL.A00(requireArguments, "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID");
            if (A002 != null) {
                this.A0A = A002;
                this.A00 = requireArguments.getInt("DirectFragment.DIRECT_FRAGMENT_THREAD_POSITION", -1);
                this.A07 = requireArguments.getBoolean("DirectThreadDetailFragment.TRANSLATION_FROM_BANNER", false);
                AnonymousClass0eM r7 = this.A0C;
                this.A05 = AnonymousClass4k9.A00(AnonymousClass7TE.A0l(r7));
                Context requireContext = requireContext();
                UserSession A0l = AnonymousClass7TE.A0l(r7);
                C254793t3 r1 = this.A0A;
                if (r1 == null) {
                    str = "threadId";
                } else {
                    Capabilities capabilities2 = this.A09;
                    if (capabilities2 == null) {
                        str = "threadCapabilities";
                    } else {
                        C74449Pv4 A012 = C330397Mp.A01(requireContext, A0l, capabilities2, r1);
                        this.A02 = A012;
                        1a8 r3 = this.A0E;
                        str = "clientInfra";
                        if (A012 != null) {
                            AnonymousClass4kA r2 = this.A05;
                            if (r2 == null) {
                                str = "preferences";
                            } else {
                                this.A03 = new C71464Ol6(DbW.A0J(DbT.A0X(r7), __redex_internal_original_name), r3, A012, r2);
                                C74449Pv4 pv4 = this.A02;
                                if (pv4 != null) {
                                    C74550Pwj.A01(pv4);
                                    AnonymousClass0fD.A09(-1600964822, A022);
                                    return;
                                }
                            }
                        }
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            illegalArgumentException = C66580MXl.A0p();
            i = -897989294;
        } else {
            illegalArgumentException = AnonymousClass7TE.A0w("threadCapabilities can't be null");
            i = 566785506;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalArgumentException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1564747576);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.direct_thread_details_chat_controls_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-1253760941, A022);
        return inflate;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(262379311);
        C68472NJk.super.onPause();
        DbX.A0R(this.A0C).A02(this.A0D, 2Kb.class);
        AnonymousClass0fD.A09(-746005184, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-889786814);
        super.onResume();
        DbX.A0R(this.A0C).A01(this.A0D, 2Kb.class);
        AnonymousClass0fD.A09(1427009387, A022);
    }
}

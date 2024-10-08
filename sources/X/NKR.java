package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.user.model.User;

public final class NKR extends AnonymousClass4DH implements C229122ms, C74492Pvm, AnonymousClass4DS, G82 {
    public static final String __redex_internal_original_name = "ThreadDetailsNicknamesFragment";
    public Capabilities A00;
    public C74449Pv4 A01;
    public NLD A02;
    public N4P A03;
    public C254793t3 A04;
    public RecyclerView A05;
    public 1Ng A06;
    public final 1a8 A07 = C66581MXm.A0P();
    public final AnonymousClass0eM A08 = AnonymousClass1YB.A00(new C73899Pla(this, 6));
    public final AnonymousClass0eM A09 = C227642jf.A02(this);
    public final 1wn A0A = C71932OtG.A00(this, 20);
    public final 1wn A0B = C71932OtG.A00(this, 21);
    public final String A0C = __redex_internal_original_name;

    public final boolean CJz() {
        return false;
    }

    public final boolean CKB() {
        return false;
    }

    public final boolean CT5() {
        return true;
    }

    public final boolean CWV() {
        return false;
    }

    public final boolean CZf(User user) {
        return false;
    }

    public final boolean CbR(User user) {
        return false;
    }

    public final void CgO() {
    }

    public final void CtI(User user) {
    }

    public final void DRW(C68303N9q n9q) {
    }

    public final void DdO(C68303N9q n9q) {
    }

    public final void DiG(C68303N9q n9q) {
    }

    public final boolean Dw3(User user, boolean z) {
        return false;
    }

    public final void DwP(C68303N9q n9q) {
    }

    public final boolean isLoading() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        this.A05 = DbZ.A0F(view2, R.id.recycler_view);
        NLD nld = new NLD(requireContext(), this, AnonymousClass7TE.A0l(this.A09), this, PRB.A00, PRD.A00, this, this, false, true);
        this.A02 = nld;
        RecyclerView recyclerView = this.A05;
        String str = "recyclerView";
        if (recyclerView != null) {
            recyclerView.setAdapter(nld);
            RecyclerView recyclerView2 = this.A05;
            if (recyclerView2 != null) {
                DbU.A15(getContext(), recyclerView2, 1, false);
                AnonymousClass19S A0r = DbY.A0r(AnonymousClass12T.A00, 632454757);
                C66162MFz mFz = new C66162MFz(this, (AnonymousClass4D7) null, 43);
                19B r0 = 19B.A00;
                Integer num = AnonymousClass05K.A00;
                1Eo.A03(num, r0, mFz, A0r);
                C74449Pv4 pv4 = this.A01;
                if (pv4 == null) {
                    str = "clientInfra";
                } else {
                    C74550Pwj.A00(pv4);
                    A01(num, (String) null);
                    1Ng r2 = this.A06;
                    str = "igEventBus";
                    if (r2 != null) {
                        r2.A01(this.A0B, C71912Osu.class);
                        1Ng r22 = this.A06;
                        if (r22 != null) {
                            r22.A01(this.A0A, C71906Oso.class);
                            return;
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    private final void A00(C68303N9q n9q) {
        String str;
        User user = n9q.A00;
        String B8Q = user.B8Q();
        AnonymousClass0eM r4 = this.A09;
        UserSession A0l = AnonymousClass7TE.A0l(r4);
        String str2 = n9q.A01;
        C254793t3 r10 = this.A04;
        if (r10 == null) {
            str = "threadId";
        } else {
            String id = user.getId();
            Capabilities capabilities = this.A00;
            if (capabilities == null) {
                str = "threadCapabilities";
            } else {
                0qQ.A0B(A0l, 0);
                C68481NJy nJy = new C68481NJy();
                Bundle A0A2 = DbV.A0A(A0l);
                A0A2.putString("username_hint", B8Q);
                A0A2.putString(C66654MaN.A01(0, 8, 88), str2);
                OXL.A02(A0A2, r10, ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
                A0A2.putString(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, id);
                A0A2.putString("nickname_change_entry_point", "thread_details");
                A0A2.putParcelable("thread_capabilities", capabilities);
                nJy.setArguments(A0A2);
                String id2 = user.getId();
                DbU.A1I(this, nJy, C69940Nug.A00(requireActivity(), AnonymousClass7TE.A0l(r4), new C73665Phe(44, this, n9q), new C73673Phm(nJy, this, id2, 7)));
                A01(AnonymousClass05K.A01, user.getId());
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    private final void A01(Integer num, String str) {
        String str2;
        0lg A0X = DbT.A0X(this.A09);
        C254793t3 r0 = this.A04;
        if (r0 == null) {
            C66580MXl.A18();
            throw AnonymousClass00P.createAndThrow();
        }
        String str3 = ((C254763t0) r0).A00;
        0Aj A0e = AnonymousClass7TE.A0e(DbX.A0Q(A0X), "direct_nickname_sheet");
        if (A0e.isSampled()) {
            if (num.intValue() != 0) {
                str2 = "tap";
            } else {
                str2 = "impression";
            }
            DbS.A1J(A0e, str2);
            DbS.A1N(A0e, "thread_details");
            A0e.A9F("target_user_id", DbZ.A0d(str));
            C66580MXl.A1K(A0e, str3);
            A0e.Cgf();
        }
    }

    public final void Cvz(C68303N9q n9q) {
        if (n9q.A06) {
            A00(n9q);
        }
    }

    public final void DwU(C68303N9q n9q) {
        if (n9q.A06) {
            A00(n9q);
        }
    }

    public final String getModuleName() {
        return this.A0C;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A09);
    }

    public final void configureActionBar(2da r2) {
        Dbb.A1I(r2);
        r2.Eom(2131959004);
    }

    public final void onCreate(Bundle bundle) {
        IllegalArgumentException illegalArgumentException;
        int i;
        String str;
        int A022 = AnonymousClass0fD.A02(69423658);
        NKR.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        Capabilities capabilities = (Capabilities) requireArguments.getParcelable("DirectFragment.DIRECT_FRAGMENT_THREAD_CAPABILITIES");
        if (capabilities != null) {
            this.A00 = capabilities;
            C254793t3 A002 = OXL.A00(requireArguments, "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID");
            if (A002 != null) {
                this.A04 = A002;
                Context requireContext = requireContext();
                AnonymousClass0eM r3 = this.A09;
                UserSession A0l = AnonymousClass7TE.A0l(r3);
                C254793t3 r1 = this.A04;
                if (r1 == null) {
                    str = "threadId";
                } else {
                    Capabilities capabilities2 = this.A00;
                    if (capabilities2 == null) {
                        str = "threadCapabilities";
                    } else {
                        C74449Pv4 A012 = C330397Mp.A01(requireContext, A0l, capabilities2, r1);
                        this.A01 = A012;
                        if (A012 == null) {
                            str = "clientInfra";
                        } else {
                            C74550Pwj.A01(A012);
                            this.A06 = DbX.A0R(r3);
                            AnonymousClass0fD.A09(-1298043770, A022);
                            return;
                        }
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            illegalArgumentException = C66580MXl.A0p();
            i = 1217311296;
        } else {
            illegalArgumentException = AnonymousClass7TE.A0w("threadCapabilities can't be null");
            i = 1206301562;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalArgumentException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-2137901701);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.direct_thread_details_people_fragment, viewGroup, false);
        AnonymousClass0fD.A09(711445958, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-507912239);
        super.onDestroyView();
        this.A07.A01();
        1Ng r2 = this.A06;
        if (r2 != null) {
            r2.A02(this.A0B, C71912Osu.class);
            1Ng r22 = this.A06;
            if (r22 != null) {
                r22.A02(this.A0A, C71906Oso.class);
                AnonymousClass0fD.A09(-1072141674, A022);
                return;
            }
        }
        0qQ.A0F("igEventBus");
        throw AnonymousClass00P.createAndThrow();
    }
}

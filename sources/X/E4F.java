package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.api.schemas.IGRevShareProductType;
import com.instagram.common.ui.widget.recyclerview.FastScrollingLinearLayoutManager;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

public final class E4F extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "PublisherControlBlockedAccountsFragment";
    public RecyclerView A00;
    public IgdsInlineSearchBox A01;
    public C15475UdQ A02;
    public C14200Trf A03;
    public final AnonymousClass0eM A04 = C227642jf.A02(this);
    public final AnonymousClass0eM A05;
    public final X4Z A06 = new C14503TxP(this, 1);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131963670);
    }

    public final String getModuleName() {
        return AnonymousClass000.A00(3821);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        int i2;
        Object[] objArr;
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) AnonymousClass7TF.A0G(view, R.id.description);
        C46763Dkq dkq = (C46763Dkq) this.A05.getValue();
        if (dkq.A08 == null && dkq.A01 == IGRevShareProductType.PROFILE_ADS) {
            i2 = 2131963684;
            if (AnonymousClass7TF.A1Z(dkq.A09)) {
                i2 = 2131963666;
            }
            objArr = AnonymousClass7TF.A1b(DbS.A04(0Tu.A05, dkq.A02, 36597304662166291L));
        } else {
            if (dkq.A01 == IGRevShareProductType.PROFILE_ADS) {
                i = 2131963685;
                if (AnonymousClass7TF.A1Z(dkq.A09)) {
                    i = 2131963667;
                }
            } else {
                i = 2131963621;
            }
            objArr = new Object[0];
        }
        DbZ.A13(textView, this, DbS.A0Q(objArr, i2));
        View A0G = AnonymousClass7TF.A0G(view, R.id.loading_indicator);
        IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) view.requireViewById(R.id.search_box);
        this.A01 = igdsInlineSearchBox;
        if (igdsInlineSearchBox == null) {
            str = "inlineSearchBox";
        } else {
            igdsInlineSearchBox.A02 = new Fd1(this, 8);
            RecyclerView A0K = DbX.A0K(view);
            this.A00 = A0K;
            str = "recyclerView";
            if (A0K != null) {
                A0K.setLayoutManager(new FastScrollingLinearLayoutManager(requireContext()));
                RecyclerView recyclerView = this.A00;
                if (recyclerView != null) {
                    C15475UdQ udQ = this.A02;
                    if (udQ == null) {
                        str = "adapter";
                    } else {
                        recyclerView.setAdapter(udQ);
                        07U r9 = 07U.A05;
                        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
                        AnonymousClass7TE.A1Z(new C59703JUk((Object) textView, (Object) this, (Object) viewLifecycleOwner, (Object) A0G, (Object) r9, (AnonymousClass4D7) null, 47), AnonymousClass07a.A00(viewLifecycleOwner));
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public final boolean onBackPressed() {
        if (DbX.A1b(((C46763Dkq) this.A05.getValue()).A0C)) {
            getParentFragmentManager().A0z("BLOCKLIST_FRAGMENT_REQUEST_KEY", DbY.A0B("ARGUMENT_BLOCKLIST_CHANGED_KEY", true));
        }
        DbT.A1I(this);
        return true;
    }

    public E4F() {
        C51791G2a g2a = new C51791G2a(this, 35);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C51791G2a(new C51791G2a(this, 32), 33));
        this.A05 = DbS.A0I(new C51791G2a(A002, 34), g2a, new MJ4(2, (Object) null, A002), DbS.A0z(C46763Dkq.class));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1282598557);
        E4F.super.onCreate(bundle);
        C14156Tqs tqs = new C14156Tqs(this, 1);
        Context requireContext = requireContext();
        AnonymousClass0eM r3 = this.A04;
        VWN vwn = new VWN(requireContext, (FragmentActivity) null, this, AnonymousClass7TE.A0l(r3), new C19553Wbd(0), new KXN(this, 4), (Integer) null, (String) null, false, false, false);
        AnonymousClass0eM r7 = this.A05;
        C337287g2 r6 = ((C46763Dkq) r7.getValue()).A07;
        X4Z x4z = this.A06;
        this.A03 = new C14200Trf(C18405Vr7.A00, x4z, tqs, ((C46763Dkq) r7.getValue()).A04, r6, 0, false);
        Context requireContext2 = requireContext();
        C14200Trf trf = this.A03;
        if (trf == null) {
            0qQ.A0F("dataSource");
            throw AnonymousClass00P.createAndThrow();
        }
        r3.getValue();
        this.A02 = new C15475UdQ(requireContext2, trf, x4z, tqs, vwn, C50993Fmg.A00);
        AnonymousClass0fD.A09(-497393419, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1324429052);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.creator_blocked_accounts, false);
        AnonymousClass0fD.A09(1268094305, A022);
        return A0D;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(2089884193);
        super.onDestroyView();
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.setLayoutManager((C252553pI) null);
            recyclerView.setAdapter((2Rw) null);
        }
        AnonymousClass0fD.A09(-135794073, A022);
    }

    public final void onPause() {
        IBinder windowToken;
        int A022 = AnonymousClass0fD.A02(1385727410);
        E4F.super.onPause();
        View view = this.mView;
        if (!(view == null || (windowToken = view.getWindowToken()) == null)) {
            Object systemService = requireContext().getSystemService("input_method");
            0qQ.A0C(systemService, AnonymousClass000.A00(11));
            ((InputMethodManager) systemService).hideSoftInputFromWindow(windowToken, 0);
        }
        AnonymousClass0fD.A09(909044905, A022);
    }
}

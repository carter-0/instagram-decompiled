package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import java.util.Iterator;

/* renamed from: X.UcE  reason: case insensitive filesystem */
public final class C15403UcE extends C273374mT implements X9G, 1wn, AnonymousClass4DS, XBy {
    public static final String __redex_internal_original_name = "ReelQuestionResponsesListFragment";
    public UAH A00;
    public RecyclerView A01;
    public C255773uh A02;
    public C14177TrG A03;
    public C17836Vgp A04;

    public final /* synthetic */ void Db9(C17801VgE vgE, int i) {
    }

    public final void EKs() {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = DbZ.A0F(view, R.id.question_responses_list);
        int dimensionPixelSize = DbV.A05(this).getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material);
        C17836Vgp vgp = this.A04;
        if (vgp == null) {
            str = "questionResponsesListHelper";
        } else {
            RecyclerView recyclerView = this.A01;
            if (recyclerView == null) {
                str = "recyclerView";
            } else {
                vgp.A00(recyclerView, dimensionPixelSize, dimensionPixelSize);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final C255773uh AuN() {
        return this.A02;
    }

    public final VTJ Big(int i) {
        UAH uah = this.A00;
        0qQ.A0A(uah);
        C17801VgE vgE = (C17801VgE) uah.A01.get(i);
        0qQ.A07(vgE);
        return C17045VFt.A00(vgE);
    }

    public final int Bih() {
        UAH uah = this.A00;
        0qQ.A0A(uah);
        return uah.A01.size();
    }

    public final void CHw(int i) {
        RecyclerView recyclerView = this.A01;
        if (recyclerView == null) {
            C66580MXl.A19();
            throw AnonymousClass00P.createAndThrow();
        } else {
            C18239Vo6.A01(recyclerView, i);
        }
    }

    public final void DbA() {
        RecyclerView recyclerView = this.A01;
        if (recyclerView == null) {
            C66580MXl.A19();
            throw AnonymousClass00P.createAndThrow();
        } else {
            C18239Vo6.A00(recyclerView);
        }
    }

    public final void DbB(C17801VgE vgE, int i) {
        C14177TrG trG = this.A03;
        if (trG == null) {
            0qQ.A0F("questionResponseReshareController");
            throw AnonymousClass00P.createAndThrow();
        } else {
            trG.A00(i);
        }
    }

    public final void DfG() {
        UAH uah = this.A00;
        0qQ.A0A(uah);
        uah.notifyDataSetChanged();
    }

    public final String getModuleName() {
        return "reel_question_responses_list";
    }

    public final void configureActionBar(2da r3) {
        DbW.A1C(r3, JTT.A0B(this, r3).getString(2131971595));
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [X.07Z, androidx.fragment.app.Fragment, X.4mT, X.UcE, X.4DH] */
    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(1015000473);
        C15403UcE.super.onCreate(bundle);
        String string = requireArguments().getString("ReelQuestionResponsesListFragment.REEL_ID");
        String string2 = requireArguments().getString("ReelQuestionResponsesListFragment.REEL_ITEM_ID");
        Reel A0M = ReelStore.A03(getSession()).A0M(string);
        if (A0M != null) {
            Iterator it = A0M.A0O(getSession()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C255773uh r2 = (C255773uh) it.next();
                if (0qQ.A0K(r2.A0j, string2)) {
                    this.A02 = r2;
                    break;
                }
            }
        }
        C255773uh r0 = this.A02;
        String str2 = null;
        if (r0 != null) {
            str = C51969G9p.A0u(r0.A0b);
            C255773uh r02 = this.A02;
            0qQ.A0A(r02);
            C19477WaP A032 = AnonymousClass6YG.A03(r02);
            if (A032 != null) {
                str2 = A032.A00.A08;
            }
        } else {
            str = null;
        }
        C17836Vgp vgp = new C17836Vgp(this, getSession(), this, AnonymousClass05K.A00, str, str2);
        this.A04 = vgp;
        UAH uah = vgp.A01;
        this.A00 = uah;
        0qQ.A0A(uah);
        uah.setHasStableIds(true);
        C14177TrG trG = new C14177TrG(requireActivity(), AnonymousClass07i.A00(this), this, getSession(), this);
        this.A03 = trG;
        registerLifecycleListener(trG);
        if (this.A02 != null) {
            C17836Vgp vgp2 = this.A04;
            if (vgp2 == null) {
                0qQ.A0F("questionResponsesListHelper");
                throw AnonymousClass00P.createAndThrow();
            }
            vgp2.A02.A00(true);
        }
        AnonymousClass0fD.A09(-969722994, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1896978945);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_question_responses_list, viewGroup, false);
        AnonymousClass0fD.A09(896345604, A022);
        return inflate;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A032 = AnonymousClass0fD.A03(728386421);
        WQF wqf = (WQF) obj;
        int A0D = AnonymousClass7TG.A0D(wqf, -1044720452);
        UAH uah = this.A00;
        0qQ.A0A(uah);
        if (uah.A01.remove(wqf.A00)) {
            UAH.A00(uah);
        }
        AnonymousClass0fD.A0A(1781565774, A0D);
        AnonymousClass0fD.A0A(1230467488, A032);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1085454506);
        C15403UcE.super.onPause();
        AnonymousClass1Nd.A00(getSession()).A02(this, WQF.class);
        AnonymousClass0fD.A09(1004739565, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1255202675);
        super.onResume();
        if (!AnonymousClass06S.A00(DbV.A0I(this)) && this.A02 == null) {
            DbT.A1J(this);
        }
        AnonymousClass1Nd.A00(getSession()).A01(this, WQF.class);
        AnonymousClass0fD.A09(-1997301121, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(1821395823);
        C15403UcE.super.onStart();
        Dbc.A0q(this, 8);
        AnonymousClass0fD.A09(308646868, A022);
    }
}

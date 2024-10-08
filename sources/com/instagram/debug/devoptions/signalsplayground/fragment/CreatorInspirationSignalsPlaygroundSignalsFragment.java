package com.instagram.debug.devoptions.signalsplayground.fragment;

import X.07U;
import X.0eO;
import X.0qQ;
import X.2da;
import X.AnonymousClass00P;
import X.AnonymousClass07Z;
import X.AnonymousClass07a;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass0fD;
import X.AnonymousClass4D7;
import X.AnonymousClass4DH;
import X.AnonymousClass4DS;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C227642jf;
import X.C62320sa;
import X.DbS;
import X.DbU;
import X.Dbb;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.adapter.CreatorInspirationSignalsPlaygroundSignalsAdapter;
import com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundSignalsViewModel;

public final class CreatorInspirationSignalsPlaygroundSignalsFragment extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final int $stable = 8;
    public final String moduleName = "creator_inspiration_signals_playground_list";
    public final AnonymousClass0eM session$delegate = C227642jf.A02(this);
    public final CreatorInspirationSignalsPlaygroundSignalsFragment$signalDelegate$1 signalDelegate = new CreatorInspirationSignalsPlaygroundSignalsFragment$signalDelegate$1(this);
    public CreatorInspirationSignalsPlaygroundSignalsAdapter signalsAdapter;
    public final AnonymousClass0eM viewModel$delegate;

    public void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View A0G = AnonymousClass7TF.A0G(view, R.id.loading_spinner);
        RecyclerView recyclerView = (RecyclerView) AnonymousClass7TF.A0G(view, R.id.signals_recycler_view);
        setupRecyclerView(recyclerView);
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new CreatorInspirationSignalsPlaygroundSignalsFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1(viewLifecycleOwner, r3, (AnonymousClass4D7) null, this, AnonymousClass7TF.A0G(view, R.id.error_message), AnonymousClass7TF.A0G(view, R.id.header_text), recyclerView, A0G), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    /* access modifiers changed from: private */
    public final CreatorInspirationSignalsPlaygroundSignalsViewModel getViewModel() {
        return (CreatorInspirationSignalsPlaygroundSignalsViewModel) this.viewModel$delegate.getValue();
    }

    public String getModuleName() {
        return this.moduleName;
    }

    public CreatorInspirationSignalsPlaygroundSignalsFragment() {
        CreatorInspirationSignalsPlaygroundSignalsFragment$viewModel$2 creatorInspirationSignalsPlaygroundSignalsFragment$viewModel$2 = new CreatorInspirationSignalsPlaygroundSignalsFragment$viewModel$2(this);
        AnonymousClass0eM A00 = AnonymousClass0eN.A00(0eO.A02, new CreatorInspirationSignalsPlaygroundSignalsFragment$special$$inlined$viewModels$default$2(new CreatorInspirationSignalsPlaygroundSignalsFragment$special$$inlined$viewModels$default$1(this)));
        this.viewModel$delegate = DbS.A0I(new CreatorInspirationSignalsPlaygroundSignalsFragment$special$$inlined$viewModels$default$3(A00), creatorInspirationSignalsPlaygroundSignalsFragment$viewModel$2, new CreatorInspirationSignalsPlaygroundSignalsFragment$special$$inlined$viewModels$default$4((C62320sa) null, A00), DbS.A0z(CreatorInspirationSignalsPlaygroundSignalsViewModel.class));
    }

    private final void setupRecyclerView(RecyclerView recyclerView) {
        DbU.A15(requireContext(), recyclerView, 1, false);
        CreatorInspirationSignalsPlaygroundSignalsAdapter creatorInspirationSignalsPlaygroundSignalsAdapter = this.signalsAdapter;
        if (creatorInspirationSignalsPlaygroundSignalsAdapter == null) {
            0qQ.A0F("signalsAdapter");
            throw AnonymousClass00P.createAndThrow();
        } else {
            recyclerView.setAdapter(creatorInspirationSignalsPlaygroundSignalsAdapter);
        }
    }

    public void configureActionBar(2da r2) {
        Dbb.A1I(r2);
        r2.Eom(2131957827);
    }

    public void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(2123746323);
        CreatorInspirationSignalsPlaygroundSignalsFragment.super.onCreate(bundle);
        this.signalsAdapter = new CreatorInspirationSignalsPlaygroundSignalsAdapter(this.signalDelegate);
        getViewModel().fetchSignalsList();
        AnonymousClass0fD.A09(10381852, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1029671205);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.creator_inspiration_signals_playground_signals_fragment, viewGroup, false);
        AnonymousClass0fD.A09(1529511287, A02);
        return inflate;
    }

    public UserSession getSession() {
        return AnonymousClass7TE.A0l(this.session$delegate);
    }
}

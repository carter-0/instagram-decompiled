package com.instagram.debug.devoptions.signalsplayground.fragment;

import X.07U;
import X.0eO;
import X.0qQ;
import X.17h;
import X.2da;
import X.AnonymousClass00P;
import X.AnonymousClass07Z;
import X.AnonymousClass07a;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass0fD;
import X.AnonymousClass3ZA;
import X.AnonymousClass4D7;
import X.AnonymousClass4DH;
import X.AnonymousClass4DS;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C227642jf;
import X.C273654mx;
import X.C309516Yo;
import X.C46447Df9;
import X.C46548Dgp;
import X.C49261Es4;
import X.C62320sa;
import X.DbS;
import X.DbU;
import X.DbY;
import X.Dbb;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.adapter.CreatorInspirationSignalsPlaygroundTestUsersAdapter;
import com.instagram.debug.devoptions.signalsplayground.fragment.plugins.CreatorInspirationSignalsPlaygroundRecommendationsFragmentPluginKt;
import com.instagram.debug.devoptions.signalsplayground.view.CreatorInspirationSignalsPlaygroundTestUserRowViewHolder;
import com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundSignalDetailsViewModel;
import com.instagram.modal.ModalActivity;
import com.instagram.user.model.User;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CreatorInspirationSignalsPlaygroundTestUsersFragment extends AnonymousClass4DH implements AnonymousClass4DS, CreatorInspirationSignalsPlaygroundTestUserRowViewHolder.Delegate {
    public static final int $stable = 8;
    public static final String ARGS_SIGNAL_DISPLAY_NAME = "signal_display_name";
    public static final String ARGS_SIGNAL_ENTITY = "signal_entity";
    public static final String ARGS_SIGNAL_IDENTIFIER = "signal_identifier";
    public static final Companion Companion = new Object();
    public static final String INTENT_EXTRA_USER_ID = "user_id";
    public static final int REQUEST_CODE_VIEW_RECOMMENDATIONS = 0;
    public final String moduleName = "creator_inspiration_signals_playground_creators";
    public final AnonymousClass0eM session$delegate = C227642jf.A02(this);
    public final AnonymousClass0eM signalEntity$delegate;
    public final AnonymousClass0eM signalId$delegate;
    public final AnonymousClass0eM signalTitle$delegate;
    public CreatorInspirationSignalsPlaygroundTestUsersAdapter testUsersAdapter;
    public final AnonymousClass0eM viewModel$delegate;

    public void onUserRowClick(User user) {
        0qQ.A0B(user, 0);
        17h.A00(AnonymousClass7TE.A0l(this.session$delegate)).A01(user, true, false);
        if (!0qQ.A0K(17h.A00(AnonymousClass7TE.A0l(this.session$delegate)).A02(AnonymousClass7TE.A0l(this.session$delegate).A06), user)) {
            Bundle A01 = C46447Df9.A02().A01(AnonymousClass7TE.A0l(this.session$delegate), C46548Dgp.A01(AnonymousClass7TE.A0l(this.session$delegate), AnonymousClass3ZA.A00(user), C273654mx.A00(2217), this.moduleName).A04());
            DbS.A0b(requireActivity(), A01, AnonymousClass7TE.A0l(this.session$delegate), ModalActivity.class, "profile").A0D(this, 0);
            return;
        }
        viewSignalRecommendationsForUser(user.getId());
    }

    public void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View A0G = AnonymousClass7TF.A0G(view, R.id.loading_spinner);
        RecyclerView recyclerView = (RecyclerView) AnonymousClass7TF.A0G(view, R.id.test_users_recycler_view);
        setupRecyclerView(recyclerView);
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new CreatorInspirationSignalsPlaygroundTestUsersFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1(viewLifecycleOwner, r3, (AnonymousClass4D7) null, this, AnonymousClass7TF.A0G(view, R.id.error_message), AnonymousClass7TF.A0G(view, R.id.header_text), recyclerView, A0G), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final class Companion {
        public final CreatorInspirationSignalsPlaygroundTestUsersFragment newInstance(String str, String str2, String str3) {
            AnonymousClass7TG.A1T(str, str2, str3);
            CreatorInspirationSignalsPlaygroundTestUsersFragment creatorInspirationSignalsPlaygroundTestUsersFragment = new CreatorInspirationSignalsPlaygroundTestUsersFragment();
            creatorInspirationSignalsPlaygroundTestUsersFragment.setArguments(DbY.A0C(CreatorInspirationSignalsPlaygroundTestUsersFragment.ARGS_SIGNAL_ENTITY, str3, AnonymousClass7TE.A1L(CreatorInspirationSignalsPlaygroundTestUsersFragment.ARGS_SIGNAL_IDENTIFIER, str), AnonymousClass7TE.A1L(CreatorInspirationSignalsPlaygroundTestUsersFragment.ARGS_SIGNAL_DISPLAY_NAME, str2)));
            return creatorInspirationSignalsPlaygroundTestUsersFragment;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    private final String getSignalEntity() {
        return DbS.A0t(this.signalEntity$delegate);
    }

    private final String getSignalId() {
        return DbS.A0t(this.signalId$delegate);
    }

    private final String getSignalTitle() {
        return DbS.A0t(this.signalTitle$delegate);
    }

    /* access modifiers changed from: private */
    public final CreatorInspirationSignalsPlaygroundSignalDetailsViewModel getViewModel() {
        return (CreatorInspirationSignalsPlaygroundSignalDetailsViewModel) this.viewModel$delegate.getValue();
    }

    public String getModuleName() {
        return this.moduleName;
    }

    public CreatorInspirationSignalsPlaygroundTestUsersFragment() {
        0eO r2 = 0eO.A02;
        this.signalId$delegate = AnonymousClass0eN.A00(r2, new CreatorInspirationSignalsPlaygroundTestUsersFragment$special$$inlined$requiredArgument$default$1(this, ARGS_SIGNAL_IDENTIFIER, ARGS_SIGNAL_IDENTIFIER));
        this.signalTitle$delegate = AnonymousClass0eN.A00(r2, new CreatorInspirationSignalsPlaygroundTestUsersFragment$special$$inlined$requiredArgument$default$2(this, ARGS_SIGNAL_DISPLAY_NAME, ARGS_SIGNAL_DISPLAY_NAME));
        this.signalEntity$delegate = AnonymousClass0eN.A00(r2, new CreatorInspirationSignalsPlaygroundTestUsersFragment$special$$inlined$requiredArgument$default$3(this, ARGS_SIGNAL_ENTITY, ARGS_SIGNAL_ENTITY));
        CreatorInspirationSignalsPlaygroundTestUsersFragment$viewModel$2 creatorInspirationSignalsPlaygroundTestUsersFragment$viewModel$2 = new CreatorInspirationSignalsPlaygroundTestUsersFragment$viewModel$2(this);
        AnonymousClass0eM A00 = AnonymousClass0eN.A00(r2, new CreatorInspirationSignalsPlaygroundTestUsersFragment$special$$inlined$viewModels$default$2(new CreatorInspirationSignalsPlaygroundTestUsersFragment$special$$inlined$viewModels$default$1(this)));
        this.viewModel$delegate = DbS.A0I(new CreatorInspirationSignalsPlaygroundTestUsersFragment$special$$inlined$viewModels$default$3(A00), creatorInspirationSignalsPlaygroundTestUsersFragment$viewModel$2, new CreatorInspirationSignalsPlaygroundTestUsersFragment$special$$inlined$viewModels$default$4((C62320sa) null, A00), DbS.A0z(CreatorInspirationSignalsPlaygroundSignalDetailsViewModel.class));
    }

    private final void setupRecyclerView(RecyclerView recyclerView) {
        DbU.A15(requireContext(), recyclerView, 1, false);
        CreatorInspirationSignalsPlaygroundTestUsersAdapter creatorInspirationSignalsPlaygroundTestUsersAdapter = this.testUsersAdapter;
        if (creatorInspirationSignalsPlaygroundTestUsersAdapter == null) {
            0qQ.A0F("testUsersAdapter");
            throw AnonymousClass00P.createAndThrow();
        } else {
            recyclerView.setAdapter(creatorInspirationSignalsPlaygroundTestUsersAdapter);
        }
    }

    private final void viewSignalRecommendationsForUser(String str) {
        C309516Yo A0M = DbS.A0M(requireActivity(), AnonymousClass7TE.A0l(this.session$delegate));
        A0M.A0D(C49261Es4.A00(DbS.A0t(this.signalId$delegate), DbS.A0t(this.signalTitle$delegate), DbS.A0t(this.signalEntity$delegate), str));
        A0M.A0A = CreatorInspirationSignalsPlaygroundRecommendationsFragmentPluginKt.RECOMMENDATION_FRAGMENT_TAG;
        A0M.A0F = true;
        A0M.A04();
    }

    public void configureActionBar(2da r2) {
        Dbb.A1I(r2);
        r2.setTitle(DbS.A0t(this.signalTitle$delegate));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String stringExtra;
        super.onActivityResult(i, i2, intent);
        if (i == 0 && i2 == -1 && intent != null && (stringExtra = intent.getStringExtra(INTENT_EXTRA_USER_ID)) != null) {
            viewSignalRecommendationsForUser(stringExtra);
        }
    }

    public void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1132337245);
        CreatorInspirationSignalsPlaygroundTestUsersFragment.super.onCreate(bundle);
        this.testUsersAdapter = new CreatorInspirationSignalsPlaygroundTestUsersAdapter(this, this);
        getViewModel().fetchSignalDetails(DbS.A0t(this.signalId$delegate));
        AnonymousClass0fD.A09(686757988, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-2052874350);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.creator_inspiration_signals_playground_creators_fragment, viewGroup, false);
        AnonymousClass0fD.A09(1274216160, A02);
        return inflate;
    }

    public UserSession getSession() {
        return AnonymousClass7TE.A0l(this.session$delegate);
    }
}

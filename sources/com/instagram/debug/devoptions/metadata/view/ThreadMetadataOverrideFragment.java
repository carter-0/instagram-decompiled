package com.instagram.debug.devoptions.metadata.view;

import X.0eO;
import X.0qQ;
import X.2da;
import X.AnonymousClass0Dg;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass4DH;
import X.AnonymousClass4DR;
import X.AnonymousClass4DS;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.AnonymousClass9H0;
import X.C227642jf;
import X.C254783t2;
import X.C358248ab;
import X.C62320sa;
import X.DbS;
import X.DbT;
import X.DbW;
import X.MYR;
import X.OID;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideViewHolder;
import com.instagram.debug.devoptions.metadata.viewmodel.ThreadMetadataOverrideViewModel;
import java.util.Collection;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ThreadMetadataOverrideFragment extends MYR implements AnonymousClass4DR, AnonymousClass4DS, ThreadMetadataOverrideViewHolder.Delegate {
    public static final String BUNDLE_THREAD_ID = "thread_id";
    public static final Companion Companion = new Object();
    public final AnonymousClass0eM session$delegate = C227642jf.A02(this);
    public final AnonymousClass0eM viewModel$delegate;

    public static final Bundle createArgs(UserSession userSession, C254783t2 r2) {
        return Companion.createArgs(userSession, r2);
    }

    public static final AnonymousClass4DH newInstance(Bundle bundle) {
        return Companion.newInstance(bundle);
    }

    public void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        r3.Eu5(new ThreadMetadataOverrideFragment$configureActionBar$1(this), true);
        r3.setTitle("Thread Metadata Overrider");
    }

    public String getModuleName() {
        return "direct_thread_metadata_override_fragment";
    }

    public void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        getViewModel().viewState.A06(getViewLifecycleOwner(), new ThreadMetadataOverrideFragment$sam$androidx_lifecycle_Observer$0(new ThreadMetadataOverrideFragment$onViewCreated$1(this)));
        getViewModel().fetch();
    }

    public final class Companion {
        public final AnonymousClass4DH newInstance(Bundle bundle) {
            0qQ.A0B(bundle, 0);
            ThreadMetadataOverrideFragment threadMetadataOverrideFragment = new ThreadMetadataOverrideFragment();
            threadMetadataOverrideFragment.setArguments(bundle);
            return threadMetadataOverrideFragment;
        }

        public final Bundle createArgs(UserSession userSession, C254783t2 r4) {
            AnonymousClass7TG.A1N(userSession, r4);
            Bundle A0a = AnonymousClass7TE.A0a();
            AnonymousClass9H0.A02(A0a, r4, ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
            AnonymousClass0Dg.A00(A0a, userSession);
            return A0a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    /* access modifiers changed from: private */
    public final ThreadMetadataOverrideViewModel getViewModel() {
        return (ThreadMetadataOverrideViewModel) this.viewModel$delegate.getValue();
    }

    public Collection getDefinitions() {
        return AnonymousClass7TE.A1I(new ThreadMetadataOverrideItemDefinition(this));
    }

    public OID getRecyclerConfigBuilder() {
        return configBuilder(ThreadMetadataOverrideFragment$getRecyclerConfigBuilder$1.INSTANCE);
    }

    public ThreadMetadataOverrideFragment() {
        ThreadMetadataOverrideFragment$viewModel$2 threadMetadataOverrideFragment$viewModel$2 = new ThreadMetadataOverrideFragment$viewModel$2(this);
        AnonymousClass0eM A00 = AnonymousClass0eN.A00(0eO.A02, new ThreadMetadataOverrideFragment$special$$inlined$viewModels$default$2(new ThreadMetadataOverrideFragment$special$$inlined$viewModels$default$1(this)));
        this.viewModel$delegate = DbS.A0I(new ThreadMetadataOverrideFragment$special$$inlined$viewModels$default$3(A00), threadMetadataOverrideFragment$viewModel$2, new ThreadMetadataOverrideFragment$special$$inlined$viewModels$default$4((C62320sa) null, A00), DbS.A0z(ThreadMetadataOverrideViewModel.class));
    }

    /* access modifiers changed from: private */
    public final void showConfirmationDialog() {
        C358248ab A0U = DbW.A0U(this);
        A0U.A05 = "Override Metadata";
        A0U.A0c(new ThreadMetadataOverrideFragment$showConfirmationDialog$1(this), "Save");
        A0U.A0a(new ThreadMetadataOverrideFragment$showConfirmationDialog$2(this), "Reset");
        DbT.A1V(A0U);
    }

    public boolean onBackPressed() {
        showConfirmationDialog();
        return true;
    }

    public void onMetadataOverrideValueChanged() {
        getViewModel().update();
    }

    public UserSession getSession() {
        return AnonymousClass7TE.A0l(this.session$delegate);
    }
}

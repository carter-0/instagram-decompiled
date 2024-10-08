package com.instagram.debug.devoptions.modernarchitecture;

import X.0eO;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass0fD;
import X.AnonymousClass4DH;
import X.AnonymousClass7TE;
import X.C227642jf;
import X.C62320sa;
import X.DbS;
import X.DbV;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.common.session.UserSession;

public final class RepositoryInfoFragment extends AnonymousClass4DH {
    public static final int $stable = 8;
    public final AnonymousClass0eM session$delegate = C227642jf.A02(this);
    public final AnonymousClass0eM viewModel$delegate;

    public String getModuleName() {
        return "repository_info";
    }

    /* access modifiers changed from: private */
    public final RepositoryInfoViewModel getViewModel() {
        return (RepositoryInfoViewModel) this.viewModel$delegate.getValue();
    }

    public RepositoryInfoFragment() {
        RepositoryInfoFragment$viewModel$2 repositoryInfoFragment$viewModel$2 = new RepositoryInfoFragment$viewModel$2(this);
        AnonymousClass0eM A00 = AnonymousClass0eN.A00(0eO.A02, new RepositoryInfoFragment$special$$inlined$viewModels$default$2(new RepositoryInfoFragment$special$$inlined$viewModels$default$1(this)));
        this.viewModel$delegate = DbS.A0I(new RepositoryInfoFragment$special$$inlined$viewModels$default$3(A00), repositoryInfoFragment$viewModel$2, new RepositoryInfoFragment$special$$inlined$viewModels$default$4((C62320sa) null, A00), DbS.A0z(RepositoryInfoViewModel.class));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1550472876);
        ComposeView A0H = DbV.A0H(this, new RepositoryInfoFragment$onCreateView$1(this), -1271490811);
        AnonymousClass0fD.A09(-901738958, A02);
        return A0H;
    }

    public UserSession getSession() {
        return AnonymousClass7TE.A0l(this.session$delegate);
    }
}

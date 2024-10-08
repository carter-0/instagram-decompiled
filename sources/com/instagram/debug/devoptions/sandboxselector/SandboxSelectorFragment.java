package com.instagram.debug.devoptions.sandboxselector;

import X.0eO;
import X.0qQ;
import X.0tS;
import X.2da;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass0fD;
import X.AnonymousClass0fN;
import X.AnonymousClass4D7;
import X.AnonymousClass4DS;
import X.AnonymousClass7TE;
import X.C17742VdB;
import X.C18080Vl9;
import X.C227642jf;
import X.C249473jq;
import X.C46329Dbx;
import X.C47518E6c;
import X.C62320sa;
import X.C68504NKx;
import X.C71342cb;
import X.DbS;
import X.DbT;
import X.DbW;
import X.DbZ;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.debug.sandbox.SandboxUtil;
import java.util.List;

public final class SandboxSelectorFragment extends C47518E6c implements AnonymousClass4DS {
    public final 0tS devPreferences = DbT.A0h();
    public C46329Dbx navigationPerfLogger;
    public final AnonymousClass0eM session$delegate = C227642jf.A02(this);
    public final AnonymousClass0eM viewModel$delegate;

    public void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131958231);
    }

    public String getModuleName() {
        return "sandbox_selector";
    }

    public void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C68504NKx nKx = new C68504NKx(requireContext(), AnonymousClass7TE.A0l(this.session$delegate), this);
        getScrollingViewProxy().ENw(nKx);
        SandboxSelectorViewModel viewModel = getViewModel();
        viewModel.viewState.A06(getViewLifecycleOwner(), new SandboxSelectorFragment$sam$androidx_lifecycle_Observer$0(new SandboxSelectorFragment$onViewCreated$1$1(nKx, this)));
        DbZ.A1C(this, new SandboxSelectorFragment$onViewCreated$1$2(this, (AnonymousClass4D7) null), viewModel.toasts);
    }

    /* access modifiers changed from: private */
    public final SandboxSelectorViewModel getViewModel() {
        return (SandboxSelectorViewModel) this.viewModel$delegate.getValue();
    }

    public SandboxSelectorFragment() {
        SandboxSelectorFragment$viewModel$2 sandboxSelectorFragment$viewModel$2 = new SandboxSelectorFragment$viewModel$2(this);
        AnonymousClass0eM A00 = AnonymousClass0eN.A00(0eO.A02, new SandboxSelectorFragment$special$$inlined$viewModels$default$2(new SandboxSelectorFragment$special$$inlined$viewModels$default$1(this)));
        this.viewModel$delegate = DbS.A0I(new SandboxSelectorFragment$special$$inlined$viewModels$default$3(A00), sandboxSelectorFragment$viewModel$2, new SandboxSelectorFragment$special$$inlined$viewModels$default$4((C62320sa) null, A00), DbS.A0z(SandboxSelectorViewModel.class));
    }

    /* access modifiers changed from: private */
    public final void showErrorDialog(String str, String str2) {
        C18080Vl9 vl9 = new C18080Vl9(requireContext());
        vl9.A08(str);
        C17742VdB vdB = vl9.A01;
        vdB.A0C = str2;
        vl9.A04(SandboxSelectorFragment$showErrorDialog$1.INSTANCE, 2131968772);
        vdB.A05 = new SandboxSelectorFragment$showErrorDialog$2(this);
        AnonymousClass0fN.A00(vl9.A00());
    }

    /* access modifiers changed from: private */
    public final void showManualEntryDialog() {
        Dialog sandboxDialog = SandboxUtil.getSandboxDialog(requireContext(), AnonymousClass7TE.A0l(this.session$delegate), (List) null, (DialogInterface.OnDismissListener) null);
        sandboxDialog.setOnDismissListener(new SandboxSelectorFragment$showManualEntryDialog$1$1(this));
        AnonymousClass0fN.A00(sandboxDialog);
    }

    /* access modifiers changed from: private */
    public final void updateOverlayIndicator() {
        C249473jq r1;
        Context context = getContext();
        if ((context instanceof C249473jq) && (r1 = (C249473jq) context) != null) {
            r1.D8a(this.devPreferences);
        }
    }

    public void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-2088573534);
        super.onCreate(bundle);
        C46329Dbx dbx = new C46329Dbx(AnonymousClass7TE.A0l(this.session$delegate), "sandbox", 31799736);
        this.navigationPerfLogger = dbx;
        dbx.A0R(requireContext(), C71342cb.A00(AnonymousClass7TE.A0l(this.session$delegate)), this);
        AnonymousClass0fD.A09(1281457185, A02);
    }

    public UserSession getSession() {
        return AnonymousClass7TE.A0l(this.session$delegate);
    }
}

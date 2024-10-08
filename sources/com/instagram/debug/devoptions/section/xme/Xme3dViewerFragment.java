package com.instagram.debug.devoptions.section.xme;

import X.0eO;
import X.0qQ;
import X.2da;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass0fD;
import X.AnonymousClass4D7;
import X.AnonymousClass4DH;
import X.AnonymousClass4DS;
import X.AnonymousClass7TE;
import X.C227642jf;
import X.C62320sa;
import X.DbS;
import X.DbW;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.xme.threed.view.IgGltfSceneLayoutView;

public final class Xme3dViewerFragment extends AnonymousClass4DH implements AnonymousClass4DS {
    public final String moduleName = "Xme3dViewerFragment";
    public IgGltfSceneLayoutView scene;
    public final AnonymousClass0eM session$delegate = C227642jf.A02(this);
    public final AnonymousClass0eM viewModel$delegate;

    public void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1C(r2, "XME 3D Viewer");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.07Z, com.instagram.debug.devoptions.section.xme.Xme3dViewerFragment, androidx.fragment.app.Fragment, X.4DH] */
    public void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass7TE.A1Z(new Xme3dViewerFragment$onViewCreated$1(this, (AnonymousClass4D7) null), DbW.A0E(this));
        IgGltfSceneLayoutView igGltfSceneLayoutView = this.scene;
        if (igGltfSceneLayoutView != null) {
            igGltfSceneLayoutView.setRenderingEnabled(true);
        }
        getViewModel().maybeFetchSampleFile(requireContext());
    }

    /* access modifiers changed from: private */
    public final Xme3dViewModel getViewModel() {
        return (Xme3dViewModel) this.viewModel$delegate.getValue();
    }

    public String getModuleName() {
        return this.moduleName;
    }

    public Xme3dViewerFragment() {
        Xme3dViewerFragment$viewModel$2 xme3dViewerFragment$viewModel$2 = new Xme3dViewerFragment$viewModel$2(this);
        AnonymousClass0eM A00 = AnonymousClass0eN.A00(0eO.A02, new Xme3dViewerFragment$special$$inlined$viewModels$default$2(new Xme3dViewerFragment$special$$inlined$viewModels$default$1(this)));
        this.viewModel$delegate = DbS.A0I(new Xme3dViewerFragment$special$$inlined$viewModels$default$3(A00), xme3dViewerFragment$viewModel$2, new Xme3dViewerFragment$special$$inlined$viewModels$default$4((C62320sa) null, A00), DbS.A0z(Xme3dViewModel.class));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1481843041);
        0qQ.A0B(layoutInflater, 0);
        Xme3dViewerFragment.super.onCreateView(layoutInflater, viewGroup, bundle);
        IgGltfSceneLayoutView igGltfSceneLayoutView = new IgGltfSceneLayoutView(requireContext());
        this.scene = igGltfSceneLayoutView;
        AnonymousClass0fD.A09(-39843744, A02);
        return igGltfSceneLayoutView;
    }

    public void onDestroyView() {
        int A02 = AnonymousClass0fD.A02(-1279282563);
        super.onDestroyView();
        this.scene = null;
        AnonymousClass0fD.A09(-618497263, A02);
    }

    public void onPause() {
        int A02 = AnonymousClass0fD.A02(-901921255);
        Xme3dViewerFragment.super.onPause();
        IgGltfSceneLayoutView igGltfSceneLayoutView = this.scene;
        if (igGltfSceneLayoutView != null) {
            igGltfSceneLayoutView.setRenderingEnabled(false);
        }
        AnonymousClass0fD.A09(1274930081, A02);
    }

    public void onResume() {
        int A02 = AnonymousClass0fD.A02(-1026484148);
        super.onResume();
        IgGltfSceneLayoutView igGltfSceneLayoutView = this.scene;
        if (igGltfSceneLayoutView != null) {
            igGltfSceneLayoutView.setRenderingEnabled(true);
        }
        AnonymousClass0fD.A09(2082783137, A02);
    }

    public UserSession getSession() {
        return AnonymousClass7TE.A0l(this.session$delegate);
    }
}

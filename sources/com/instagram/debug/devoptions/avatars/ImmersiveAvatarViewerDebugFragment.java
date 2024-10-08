package com.instagram.debug.devoptions.avatars;

import X.02m;
import X.07U;
import X.0eO;
import X.0h9;
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
import X.C51968G9o;
import X.C61042Jvg;
import X.C62320sa;
import X.C64301LZb;
import X.DbS;
import X.DbV;
import X.DbW;
import X.LGB;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.instagram.common.session.UserSession;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ImmersiveAvatarViewerDebugFragment extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final Companion Companion = new Object();
    public static final String QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY = "entry_point";
    public static final String QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_VALUE = "ig_settings";
    public final AnonymousClass0eM qplLogger$delegate = AnonymousClass0eN.A01(new ImmersiveAvatarViewerDebugFragment$qplLogger$2(this));
    public C64301LZb richAvatarViewHandler;
    public final AnonymousClass0eM session$delegate;
    public final AnonymousClass0eM viewModel$delegate;

    public void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        r2.Eom(2131957721);
        r2.Eu4(AnonymousClass7TF.A1R(getParentFragmentManager().A0M()));
    }

    public String getModuleName() {
        return "immersive_avatar_viewer_debug";
    }

    /* access modifiers changed from: private */
    public final 02m getQplLogger() {
        return (02m) this.qplLogger$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final ImmersiveAvatarViewerEffectConfigViewModel getViewModel() {
        return (ImmersiveAvatarViewerEffectConfigViewModel) this.viewModel$delegate.getValue();
    }

    private final void observeEffectConfigChanges() {
        07U r4 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new ImmersiveAvatarViewerDebugFragment$observeEffectConfigChanges$$inlined$launchAndRepeatWithViewLifecycle$default$1(viewLifecycleOwner, r4, (AnonymousClass4D7) null, this), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public ImmersiveAvatarViewerDebugFragment() {
        ImmersiveAvatarViewerDebugFragment$viewModel$2 immersiveAvatarViewerDebugFragment$viewModel$2 = new ImmersiveAvatarViewerDebugFragment$viewModel$2(this);
        AnonymousClass0eM A00 = AnonymousClass0eN.A00(0eO.A02, new ImmersiveAvatarViewerDebugFragment$special$$inlined$viewModels$default$2(new ImmersiveAvatarViewerDebugFragment$special$$inlined$viewModels$default$1(this)));
        this.viewModel$delegate = DbS.A0I(new ImmersiveAvatarViewerDebugFragment$special$$inlined$viewModels$default$3(A00), immersiveAvatarViewerDebugFragment$viewModel$2, new ImmersiveAvatarViewerDebugFragment$special$$inlined$viewModels$default$4((C62320sa) null, A00), DbS.A0z(ImmersiveAvatarViewerEffectConfigViewModel.class));
        this.session$delegate = C227642jf.A02(this);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.07Z, com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment] */
    private final void observeAvatarViewStateChanges() {
        AnonymousClass7TE.A1Z(new ImmersiveAvatarViewerDebugFragment$observeAvatarViewStateChanges$1(this, (AnonymousClass4D7) null), DbW.A0E(this));
    }

    public void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1010781734);
        ImmersiveAvatarViewerDebugFragment.super.onCreate(bundle);
        getQplLogger().markerStart(116928509);
        getQplLogger().markerAnnotate(116928509, QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_VALUE);
        AnonymousClass0fD.A09(288552095, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-139409442);
        this.richAvatarViewHandler = new C64301LZb((LGB) null, AnonymousClass7TE.A0l(this.session$delegate));
        FrameLayout frameLayout = new FrameLayout(requireContext());
        C51968G9o.A1D(frameLayout, -1);
        0h9 r2 = this.mLifecycleRegistry;
        C64301LZb lZb = this.richAvatarViewHandler;
        if (lZb != null) {
            r2.A09(lZb);
            C64301LZb lZb2 = this.richAvatarViewHandler;
            if (lZb2 != null) {
                lZb2.A00(requireContext(), frameLayout, new C61042Jvg(3, 0, false), "", DbV.A0J(this));
                observeEffectConfigChanges();
                observeAvatarViewStateChanges();
                AnonymousClass0fD.A09(639032289, A02);
                return frameLayout;
            }
        }
        0qQ.A0F("richAvatarViewHandler");
        throw AnonymousClass00P.createAndThrow();
    }

    public void onDestroyView() {
        int A02 = AnonymousClass0fD.A02(769755710);
        super.onDestroyView();
        0h9 r1 = this.mLifecycleRegistry;
        C64301LZb lZb = this.richAvatarViewHandler;
        if (lZb == null) {
            0qQ.A0F("richAvatarViewHandler");
            throw AnonymousClass00P.createAndThrow();
        }
        r1.A0A(lZb);
        AnonymousClass0fD.A09(-1522443780, A02);
    }

    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public UserSession getSession() {
        return AnonymousClass7TE.A0l(this.session$delegate);
    }
}

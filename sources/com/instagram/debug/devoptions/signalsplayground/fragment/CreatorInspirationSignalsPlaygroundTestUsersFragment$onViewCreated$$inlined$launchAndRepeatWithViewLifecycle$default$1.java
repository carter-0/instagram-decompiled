package com.instagram.debug.devoptions.signalsplayground.fragment;

import X.07U;
import X.0eS;
import X.0sL;
import X.1Hj;
import X.AnonymousClass07V;
import X.AnonymousClass07Z;
import X.AnonymousClass0Ud;
import X.AnonymousClass1Ek;
import X.AnonymousClass3DM;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C262224Cq;
import X.C60340gF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.ui.base.IgTextView;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1", f = "CreatorInspirationSignalsPlaygroundTestUsersFragment.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
public final class CreatorInspirationSignalsPlaygroundTestUsersFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1 extends AnonymousClass1Ek implements 0sL {
    public final /* synthetic */ IgTextView $errorText$inlined;
    public final /* synthetic */ IgTextView $headerText$inlined;
    public final /* synthetic */ View $loadingSpinner$inlined;
    public final /* synthetic */ 07U $minActiveState;
    public final /* synthetic */ RecyclerView $testUsersRecyclerView$inlined;
    public final /* synthetic */ AnonymousClass07Z $this_launchAndRepeatWithLifecycle;
    public int label;
    public final /* synthetic */ CreatorInspirationSignalsPlaygroundTestUsersFragment this$0;

    @DebugMetadata(c = "com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1", f = "CreatorInspirationSignalsPlaygroundTestUsersFragment.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass1Ek implements 0sL {
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1, X.4D7] */
        public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r9) {
            ? r0 = new AnonymousClass1(r9, creatorInspirationSignalsPlaygroundTestUsersFragment, igTextView, igTextView2, recyclerView, view);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(C262224Cq r3, AnonymousClass4D7 r4) {
            return ((AnonymousClass1) create(r3, r4)).invokeSuspend(C60340gF.A00);
        }

        /* JADX WARNING: type inference failed for: r9v0, types: [com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1, X.4D7] */
        public final Object invokeSuspend(Object obj) {
            1Hj r2 = 1Hj.A02;
            int i = this.label;
            if (i == 0) {
                0eS.A00(obj);
                AnonymousClass0Ud r0 = creatorInspirationSignalsPlaygroundTestUsersFragment.getViewModel().uiState;
                CreatorInspirationSignalsPlaygroundTestUsersFragment$onViewCreated$1$1 creatorInspirationSignalsPlaygroundTestUsersFragment$onViewCreated$1$1 = new CreatorInspirationSignalsPlaygroundTestUsersFragment$onViewCreated$1$1(igTextView, igTextView2, recyclerView, view, creatorInspirationSignalsPlaygroundTestUsersFragment);
                this.label = 1;
                if (r0.collect(creatorInspirationSignalsPlaygroundTestUsersFragment$onViewCreated$1$1, this) == r2) {
                    return r2;
                }
            } else if (i != 1) {
                throw AnonymousClass7TE.A0x();
            } else {
                0eS.A00(obj);
            }
            throw new RuntimeException();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreatorInspirationSignalsPlaygroundTestUsersFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1(AnonymousClass07Z r2, 07U r3, AnonymousClass4D7 r4, CreatorInspirationSignalsPlaygroundTestUsersFragment creatorInspirationSignalsPlaygroundTestUsersFragment, IgTextView igTextView, IgTextView igTextView2, RecyclerView recyclerView, View view) {
        super(2, r4);
        this.$this_launchAndRepeatWithLifecycle = r2;
        this.$minActiveState = r3;
        this.this$0 = creatorInspirationSignalsPlaygroundTestUsersFragment;
        this.$errorText$inlined = igTextView;
        this.$headerText$inlined = igTextView2;
        this.$testUsersRecyclerView$inlined = recyclerView;
        this.$loadingSpinner$inlined = view;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r11) {
        return new CreatorInspirationSignalsPlaygroundTestUsersFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1(this.$this_launchAndRepeatWithLifecycle, this.$minActiveState, r11, this.this$0, this.$errorText$inlined, this.$headerText$inlined, this.$testUsersRecyclerView$inlined, this.$loadingSpinner$inlined);
    }

    public final Object invoke(C262224Cq r3, AnonymousClass4D7 r4) {
        return ((CreatorInspirationSignalsPlaygroundTestUsersFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1) create(r3, r4)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        1Hj r3 = 1Hj.A02;
        int i = this.label;
        if (i == 0) {
            0eS.A00(obj);
            AnonymousClass07V lifecycle = this.$this_launchAndRepeatWithLifecycle.getLifecycle();
            07U r0 = this.$minActiveState;
            final CreatorInspirationSignalsPlaygroundTestUsersFragment creatorInspirationSignalsPlaygroundTestUsersFragment = this.this$0;
            final IgTextView igTextView = this.$errorText$inlined;
            final IgTextView igTextView2 = this.$headerText$inlined;
            final RecyclerView recyclerView = this.$testUsersRecyclerView$inlined;
            final View view = this.$loadingSpinner$inlined;
            AnonymousClass1 r4 = new AnonymousClass1((AnonymousClass4D7) null);
            this.label = 1;
            if (AnonymousClass3DM.A00(r0, lifecycle, this, r4) == r3) {
                return r3;
            }
        } else if (i == 1) {
            0eS.A00(obj);
        } else {
            throw AnonymousClass7TE.A0x();
        }
        return C60340gF.A00;
    }
}

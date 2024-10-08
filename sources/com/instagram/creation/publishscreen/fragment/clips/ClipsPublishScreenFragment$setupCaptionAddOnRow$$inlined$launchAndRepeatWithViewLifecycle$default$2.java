package com.instagram.creation.publishscreen.fragment.clips;

import X.07U;
import X.0eS;
import X.0sL;
import X.1Hj;
import X.AnonymousClass07V;
import X.AnonymousClass07Z;
import X.AnonymousClass0r6;
import X.AnonymousClass1Ek;
import X.AnonymousClass3DM;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60340gF;
import X.K66;
import X.LCg;
import X.MCX;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.publishscreen.fragment.clips.ClipsPublishScreenFragment$setupCaptionAddOnRow$$inlined$launchAndRepeatWithViewLifecycle$default$2", f = "ClipsPublishScreenFragment.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
public final class ClipsPublishScreenFragment$setupCaptionAddOnRow$$inlined$launchAndRepeatWithViewLifecycle$default$2 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ 07U A01;
    public final /* synthetic */ AnonymousClass07Z A02;
    public final /* synthetic */ LCg A03;
    public final /* synthetic */ K66 A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    @DebugMetadata(c = "com.instagram.creation.publishscreen.fragment.clips.ClipsPublishScreenFragment$setupCaptionAddOnRow$$inlined$launchAndRepeatWithViewLifecycle$default$2$1", f = "ClipsPublishScreenFragment.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.instagram.creation.publishscreen.fragment.clips.ClipsPublishScreenFragment$setupCaptionAddOnRow$$inlined$launchAndRepeatWithViewLifecycle$default$2$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass1Ek implements 0sL {
        public int A00;
        public /* synthetic */ Object A01;

        /* JADX WARNING: type inference failed for: r0v0, types: [X.4D7, com.instagram.creation.publishscreen.fragment.clips.ClipsPublishScreenFragment$setupCaptionAddOnRow$$inlined$launchAndRepeatWithViewLifecycle$default$2$1] */
        public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r10) {
            ? r0 = new AnonymousClass1(lCg, k66, list, r10, z, z2, z3);
            r0.A01 = obj;
            return r0;
        }

        /* JADX WARNING: type inference failed for: r10v0, types: [X.4D7, com.instagram.creation.publishscreen.fragment.clips.ClipsPublishScreenFragment$setupCaptionAddOnRow$$inlined$launchAndRepeatWithViewLifecycle$default$2$1] */
        public final Object invokeSuspend(Object obj) {
            1Hj r2 = 1Hj.A02;
            if (this.A00 != 0) {
                0eS.A00(obj);
            } else {
                0eS.A00(obj);
                K66 k66 = k66;
                AnonymousClass0r6 r0 = K66.A06(k66).A0J.A01;
                MCX mcx = new MCX(lCg, k66, list, z, z2, z3);
                this.A00 = 1;
                if (r0.collect(mcx, this) == r2) {
                    return r2;
                }
            }
            return C60340gF.A00;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClipsPublishScreenFragment$setupCaptionAddOnRow$$inlined$launchAndRepeatWithViewLifecycle$default$2(07U r2, AnonymousClass07Z r3, LCg lCg, K66 k66, List list, AnonymousClass4D7 r7, boolean z, boolean z2, boolean z3) {
        super(2, r7);
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = k66;
        this.A05 = list;
        this.A03 = lCg;
        this.A08 = z;
        this.A07 = z2;
        this.A06 = z3;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.creation.publishscreen.fragment.clips.ClipsPublishScreenFragment$setupCaptionAddOnRow$$inlined$launchAndRepeatWithViewLifecycle$default$2, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r12) {
        AnonymousClass07Z r2 = this.A02;
        return new ClipsPublishScreenFragment$setupCaptionAddOnRow$$inlined$launchAndRepeatWithViewLifecycle$default$2(this.A01, r2, this.A03, this.A04, this.A05, r12, this.A08, this.A07, this.A06);
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [com.instagram.creation.publishscreen.fragment.clips.ClipsPublishScreenFragment$setupCaptionAddOnRow$$inlined$launchAndRepeatWithViewLifecycle$default$2, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        1Hj r3 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            AnonymousClass07V lifecycle = this.A02.getLifecycle();
            07U r0 = this.A01;
            final K66 k66 = this.A04;
            final List list = this.A05;
            final LCg lCg = this.A03;
            final boolean z = this.A08;
            final boolean z2 = this.A07;
            final boolean z3 = this.A06;
            AnonymousClass1 r4 = new AnonymousClass1((AnonymousClass4D7) null);
            this.A00 = 1;
            if (AnonymousClass3DM.A00(r0, lifecycle, this, r4) == r3) {
                return r3;
            }
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ClipsPublishScreenFragment$setupCaptionAddOnRow$$inlined$launchAndRepeatWithViewLifecycle$default$2) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}

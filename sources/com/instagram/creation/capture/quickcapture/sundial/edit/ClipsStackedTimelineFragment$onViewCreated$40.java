package com.instagram.creation.capture.quickcapture.sundial.edit;

import X.0eS;
import X.0qQ;
import X.0sK;
import X.AnonymousClass00P;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass8RF;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment$onViewCreated$40", f = "ClipsStackedTimelineFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ClipsStackedTimelineFragment$onViewCreated$40 extends AnonymousClass1Ek implements 0sK {
    public /* synthetic */ int A00;
    public /* synthetic */ int A01;
    public final /* synthetic */ ClipsStackedTimelineFragment A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClipsStackedTimelineFragment$onViewCreated$40(ClipsStackedTimelineFragment clipsStackedTimelineFragment, AnonymousClass4D7 r3) {
        super(3, r3);
        this.A02 = clipsStackedTimelineFragment;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int A0M = AnonymousClass7TE.A0M(obj);
        int A0M2 = AnonymousClass7TE.A0M(obj2);
        ClipsStackedTimelineFragment$onViewCreated$40 clipsStackedTimelineFragment$onViewCreated$40 = new ClipsStackedTimelineFragment$onViewCreated$40(this.A02, (AnonymousClass4D7) obj3);
        clipsStackedTimelineFragment$onViewCreated$40.A00 = A0M;
        clipsStackedTimelineFragment$onViewCreated$40.A01 = A0M2;
        return clipsStackedTimelineFragment$onViewCreated$40.invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        0eS.A00(obj);
        int i = this.A00;
        int i2 = this.A01;
        ClipsStackedTimelineFragment clipsStackedTimelineFragment = this.A02;
        ClipsStackedTimelineViewController clipsStackedTimelineViewController = clipsStackedTimelineFragment.A0F;
        if (clipsStackedTimelineViewController == null) {
            str = "viewController";
        } else {
            boolean z = true;
            boolean A1R = AnonymousClass7TF.A1R(i);
            if (i2 <= 0) {
                z = false;
            }
            AnonymousClass8RF r0 = clipsStackedTimelineFragment.A0d;
            if (r0 == null) {
                str = "clipsTimelineEditorViewModel";
            } else {
                clipsStackedTimelineViewController.A0W(r0.A0E(), A1R, z);
                return C60340gF.A00;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}

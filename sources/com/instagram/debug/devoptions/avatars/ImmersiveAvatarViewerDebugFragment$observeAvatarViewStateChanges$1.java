package com.instagram.debug.devoptions.avatars;

import X.02o;
import X.0eS;
import X.0qQ;
import X.0sL;
import X.1Hj;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass0r6;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C262224Cq;
import X.C60340gF;
import X.C60811Jrg;
import X.C62977KpT;
import X.C64301LZb;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment$observeAvatarViewStateChanges$1", f = "ImmersiveAvatarViewerDebugFragment.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, s = {})
public final class ImmersiveAvatarViewerDebugFragment$observeAvatarViewStateChanges$1 extends AnonymousClass1Ek implements 0sL {
    public int label;
    public final /* synthetic */ ImmersiveAvatarViewerDebugFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImmersiveAvatarViewerDebugFragment$observeAvatarViewStateChanges$1(ImmersiveAvatarViewerDebugFragment immersiveAvatarViewerDebugFragment, AnonymousClass4D7 r3) {
        super(2, r3);
        this.this$0 = immersiveAvatarViewerDebugFragment;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4D7, com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment$observeAvatarViewStateChanges$1] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r4) {
        return new ImmersiveAvatarViewerDebugFragment$observeAvatarViewStateChanges$1(this.this$0, r4);
    }

    public final Object invoke(C262224Cq r3, AnonymousClass4D7 r4) {
        return new ImmersiveAvatarViewerDebugFragment$observeAvatarViewStateChanges$1(this.this$0, r4).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.4D7, com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment$observeAvatarViewStateChanges$1] */
    public final Object invokeSuspend(Object obj) {
        1Hj r4 = 1Hj.A02;
        int i = this.label;
        if (i == 0) {
            0eS.A00(obj);
            final ImmersiveAvatarViewerDebugFragment immersiveAvatarViewerDebugFragment = this.this$0;
            C64301LZb lZb = immersiveAvatarViewerDebugFragment.richAvatarViewHandler;
            if (lZb == null) {
                0qQ.A0F("richAvatarViewHandler");
                throw AnonymousClass00P.createAndThrow();
            }
            AnonymousClass0r6 r1 = lZb.A05;
            AnonymousClass1 r0 = new 02o() {

                /* renamed from: com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment$observeAvatarViewStateChanges$1$1$WhenMappings */
                public abstract /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[AnonymousClass05K.A00(17).length];
                        try {
                            iArr[4] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[7] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                public final Object emit(C62977KpT kpT, AnonymousClass4D7 r7) {
                    if (kpT instanceof C60811Jrg) {
                        int intValue = ((C60811Jrg) kpT).A00.intValue();
                        if (intValue == 4) {
                            ImmersiveAvatarViewerDebugFragment.this.getQplLogger().markerEnd(116928509, 2);
                        } else if (intValue == 7) {
                            ImmersiveAvatarViewerDebugFragment.this.getQplLogger().markerEnd(116928509, 3);
                        }
                    }
                    return C60340gF.A00;
                }
            };
            this.label = 1;
            if (r1.collect(r0, this) == r4) {
                return r4;
            }
        } else if (i == 1) {
            0eS.A00(obj);
        } else {
            throw AnonymousClass7TE.A0x();
        }
        return C60340gF.A00;
    }
}

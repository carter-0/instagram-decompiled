package com.instagram.debug.devoptions.section.xme;

import X.02o;
import X.05G;
import X.0eS;
import X.0sL;
import X.1Hj;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C262224Cq;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.section.xme.Xme3dViewerFragment$onViewCreated$1", f = "Xme3dViewerFragment.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
public final class Xme3dViewerFragment$onViewCreated$1 extends AnonymousClass1Ek implements 0sL {
    public int label;
    public final /* synthetic */ Xme3dViewerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Xme3dViewerFragment$onViewCreated$1(Xme3dViewerFragment xme3dViewerFragment, AnonymousClass4D7 r3) {
        super(2, r3);
        this.this$0 = xme3dViewerFragment;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.debug.devoptions.section.xme.Xme3dViewerFragment$onViewCreated$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r4) {
        return new Xme3dViewerFragment$onViewCreated$1(this.this$0, r4);
    }

    public final Object invoke(C262224Cq r3, AnonymousClass4D7 r4) {
        return new Xme3dViewerFragment$onViewCreated$1(this.this$0, r4).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.instagram.debug.devoptions.section.xme.Xme3dViewerFragment$onViewCreated$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        1Hj r4 = 1Hj.A02;
        int i = this.label;
        if (i == 0) {
            0eS.A00(obj);
            05G r2 = this.this$0.getViewModel()._sampleUrl;
            final Xme3dViewerFragment xme3dViewerFragment = this.this$0;
            AnonymousClass1 r0 = new 02o() {
                /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
                    r0 = r1;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(java.lang.String r4, X.AnonymousClass4D7 r5) {
                    /*
                        r3 = this;
                        if (r4 == 0) goto L_0x0013
                        com.instagram.debug.devoptions.section.xme.Xme3dViewerFragment r0 = com.instagram.debug.devoptions.section.xme.Xme3dViewerFragment.this
                        com.instagram.xme.threed.view.IgGltfSceneLayoutView r2 = r0.scene
                        if (r2 == 0) goto L_0x0013
                        X.0eM r0 = r0.session$delegate
                        com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
                        X.6WO r0 = X.AnonymousClass6WO.OTHER
                        r2.setUrl(r4, r1, r0)
                    L_0x0013:
                        X.0gF r0 = X.C60340gF.A00
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.section.xme.Xme3dViewerFragment$onViewCreated$1.AnonymousClass1.emit(java.lang.String, X.4D7):java.lang.Object");
                }
            };
            this.label = 1;
            if (r2.collect(r0, this) == r4) {
                return r4;
            }
        } else if (i != 1) {
            throw AnonymousClass7TE.A0x();
        } else {
            0eS.A00(obj);
        }
        throw new RuntimeException();
    }
}

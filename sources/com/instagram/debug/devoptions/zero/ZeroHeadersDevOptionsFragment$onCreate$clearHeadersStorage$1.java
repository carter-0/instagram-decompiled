package com.instagram.debug.devoptions.zero;

import X.0eS;
import X.0qQ;
import X.0sL;
import X.1Eo;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.AnonymousClass12T;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.C262224Cq;
import X.C60340gF;
import android.view.View;
import kotlin.coroutines.jvm.internal.DebugMetadata;

public final class ZeroHeadersDevOptionsFragment$onCreate$clearHeadersStorage$1 implements View.OnClickListener {
    public final /* synthetic */ ZeroHeadersDevOptionsFragment this$0;

    @DebugMetadata(c = "com.instagram.debug.devoptions.zero.ZeroHeadersDevOptionsFragment$onCreate$clearHeadersStorage$1$1", f = "ZeroHeadersDevOptionsFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.instagram.debug.devoptions.zero.ZeroHeadersDevOptionsFragment$onCreate$clearHeadersStorage$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass1Ek implements 0sL {
        public int label;

        /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.debug.devoptions.zero.ZeroHeadersDevOptionsFragment$onCreate$clearHeadersStorage$1$1, X.4D7] */
        public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r4) {
            return new AnonymousClass1(r4);
        }

        public final Object invoke(C262224Cq r3, AnonymousClass4D7 r4) {
            return new AnonymousClass1(r4).invokeSuspend(C60340gF.A00);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                0eS.A00(obj);
                final ZeroHeadersDevOptionsFragment zeroHeadersDevOptionsFragment = ZeroHeadersDevOptionsFragment.this;
                C262224Cq r3 = zeroHeadersDevOptionsFragment.scope;
                if (r3 == null) {
                    0qQ.A0F("scope");
                    throw AnonymousClass00P.createAndThrow();
                }
                AnonymousClass1 r2 = new 0sL((AnonymousClass4D7) null) {
                    public int label;

                    /* JADX WARNING: type inference failed for: r0v0, types: [X.4D7, com.instagram.debug.devoptions.zero.ZeroHeadersDevOptionsFragment$onCreate$clearHeadersStorage$1$1$1] */
                    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r4) {
                        return 

                        public ZeroHeadersDevOptionsFragment$onCreate$clearHeadersStorage$1(ZeroHeadersDevOptionsFragment zeroHeadersDevOptionsFragment) {
                            this.this$0 = zeroHeadersDevOptionsFragment;
                        }

                        public final void onClick(View view) {
                            int A05 = AnonymousClass0fD.A05(580325226);
                            final ZeroHeadersDevOptionsFragment zeroHeadersDevOptionsFragment = this.this$0;
                            C262224Cq r3 = zeroHeadersDevOptionsFragment.scope;
                            if (r3 == null) {
                                0qQ.A0F("scope");
                                throw AnonymousClass00P.createAndThrow();
                            }
                            1Eo.A05(AnonymousClass12T.A00.A04, new AnonymousClass1((AnonymousClass4D7) null), r3);
                            AnonymousClass0fD.A0C(-665879604, A05);
                        }
                    }

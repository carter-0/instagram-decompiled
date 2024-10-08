package com.instagram.debug.devoptions.zero;

import X.0eS;
import X.0qQ;
import X.0sL;
import X.19B;
import X.1Eo;
import X.1Hj;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass0fN;
import X.AnonymousClass12T;
import X.AnonymousClass1Ek;
import X.AnonymousClass2Q8;
import X.AnonymousClass2Q9;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C18080Vl9;
import X.C262214Cp;
import X.C262224Cq;
import X.C60340gF;
import android.content.DialogInterface;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import libraries.zero.headers.ZeroHeadersEntry;

public final class ZeroHeadersDevOptionsFragment$onLoadLatestEntry$1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ String[] $usages;
    public final /* synthetic */ ZeroHeadersDevOptionsFragment this$0;

    @DebugMetadata(c = "com.instagram.debug.devoptions.zero.ZeroHeadersDevOptionsFragment$onLoadLatestEntry$1$1", f = "ZeroHeadersDevOptionsFragment.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.instagram.debug.devoptions.zero.ZeroHeadersDevOptionsFragment$onLoadLatestEntry$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass1Ek implements 0sL {
        public int label;

        /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.debug.devoptions.zero.ZeroHeadersDevOptionsFragment$onLoadLatestEntry$1$1, X.4D7] */
        public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r5) {
            return new AnonymousClass1(zeroHeadersDevOptionsFragment2, r5);
        }

        public final Object invoke(C262224Cq r3, AnonymousClass4D7 r4) {
            return ((AnonymousClass1) create(r3, r4)).invokeSuspend(C60340gF.A00);
        }

        /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.debug.devoptions.zero.ZeroHeadersDevOptionsFragment$onLoadLatestEntry$1$1, X.4D7] */
        public final Object invokeSuspend(Object obj) {
            1Hj r2 = 1Hj.A02;
            int i = this.label;
            if (i == 0) {
                0eS.A00(obj);
                AnonymousClass2Q9 r0 = AnonymousClass2Q9.this;
                this.label = 1;
                obj = ((C262214Cp) r0).A0E(this);
                if (obj == r2) {
                    return r2;
                }
            } else if (i == 1) {
                0eS.A00(obj);
            } else {
                throw AnonymousClass7TE.A0x();
            }
            C18080Vl9 vl9 = new C18080Vl9(zeroHeadersDevOptionsFragment2.requireContext());
            vl9.A01.A0C = zeroHeadersDevOptionsFragment2.turnEntryToString((ZeroHeadersEntry) obj);
            AnonymousClass0fN.A00(vl9.A00());
            return C60340gF.A00;
        }
    }

    public ZeroHeadersDevOptionsFragment$onLoadLatestEntry$1(ZeroHeadersDevOptionsFragment zeroHeadersDevOptionsFragment, String[] strArr) {
        this.this$0 = zeroHeadersDevOptionsFragment;
        this.$usages = strArr;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        ZeroHeadersDevOptionsFragment zeroHeadersDevOptionsFragment = this.this$0;
        C262224Cq r2 = zeroHeadersDevOptionsFragment.scope;
        if (r2 != null) {
            ZeroHeadersDevOptionsFragment$onLoadLatestEntry$1$deferredEntry$1 zeroHeadersDevOptionsFragment$onLoadLatestEntry$1$deferredEntry$1 = new ZeroHeadersDevOptionsFragment$onLoadLatestEntry$1$deferredEntry$1(zeroHeadersDevOptionsFragment, this.$usages, i, (AnonymousClass4D7) null);
            19B r0 = 19B.A00;
            Integer num = AnonymousClass05K.A00;
            final AnonymousClass2Q8 A01 = 1Eo.A01(num, r0, zeroHeadersDevOptionsFragment$onLoadLatestEntry$1$deferredEntry$1, r2);
            final ZeroHeadersDevOptionsFragment zeroHeadersDevOptionsFragment2 = this.this$0;
            C262224Cq r22 = zeroHeadersDevOptionsFragment2.scope;
            if (r22 != null) {
                1Eo.A03(num, AnonymousClass12T.A00.A04, new AnonymousClass1((AnonymousClass4D7) null), r22);
                return;
            }
        }
        0qQ.A0F("scope");
        throw AnonymousClass00P.createAndThrow();
    }
}

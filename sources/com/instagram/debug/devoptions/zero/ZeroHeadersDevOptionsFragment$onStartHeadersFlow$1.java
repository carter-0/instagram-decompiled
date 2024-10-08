package com.instagram.debug.devoptions.zero;

import X.002;
import X.0eS;
import X.0sL;
import X.1Hj;
import X.AnonymousClass0fN;
import X.AnonymousClass1Ek;
import X.AnonymousClass2Q9;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C18080Vl9;
import X.C262214Cp;
import X.C262224Cq;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import libraries.zero.headers.ZeroHeadersEntry;

@DebugMetadata(c = "com.instagram.debug.devoptions.zero.ZeroHeadersDevOptionsFragment$onStartHeadersFlow$1", f = "ZeroHeadersDevOptionsFragment.kt", i = {}, l = {81}, m = "invokeSuspend", n = {}, s = {})
public final class ZeroHeadersDevOptionsFragment$onStartHeadersFlow$1 extends AnonymousClass1Ek implements 0sL {
    public final /* synthetic */ AnonymousClass2Q9 $deferredEntry;
    public int label;
    public final /* synthetic */ ZeroHeadersDevOptionsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ZeroHeadersDevOptionsFragment$onStartHeadersFlow$1(AnonymousClass2Q9 r2, ZeroHeadersDevOptionsFragment zeroHeadersDevOptionsFragment, AnonymousClass4D7 r4) {
        super(2, r4);
        this.$deferredEntry = r2;
        this.this$0 = zeroHeadersDevOptionsFragment;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4D7, com.instagram.debug.devoptions.zero.ZeroHeadersDevOptionsFragment$onStartHeadersFlow$1] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r5) {
        return new ZeroHeadersDevOptionsFragment$onStartHeadersFlow$1(this.$deferredEntry, this.this$0, r5);
    }

    public final Object invoke(C262224Cq r3, AnonymousClass4D7 r4) {
        return ((ZeroHeadersDevOptionsFragment$onStartHeadersFlow$1) create(r3, r4)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.4D7, com.instagram.debug.devoptions.zero.ZeroHeadersDevOptionsFragment$onStartHeadersFlow$1] */
    public final Object invokeSuspend(Object obj) {
        String str;
        1Hj r2 = 1Hj.A02;
        int i = this.label;
        if (i == 0) {
            0eS.A00(obj);
            AnonymousClass2Q9 r0 = this.$deferredEntry;
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
        ZeroHeadersEntry zeroHeadersEntry = (ZeroHeadersEntry) obj;
        C18080Vl9 vl9 = new C18080Vl9(this.this$0.requireContext());
        if (zeroHeadersEntry == null || (str = zeroHeadersEntry.A04) == null) {
            str = "null";
        }
        vl9.A01.A0C = 002.A0S("Headers Flow Triggered - Entry Fetched: {", str, '}');
        AnonymousClass0fN.A00(vl9.A00());
        return C60340gF.A00;
    }
}

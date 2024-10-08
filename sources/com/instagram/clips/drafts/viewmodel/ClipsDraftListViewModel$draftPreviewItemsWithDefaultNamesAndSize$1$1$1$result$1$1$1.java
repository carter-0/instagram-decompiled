package com.instagram.clips.drafts.viewmodel;

import X.0eS;
import X.0qQ;
import X.0sL;
import X.1Hj;
import X.2Nn;
import X.AnonymousClass05K;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass51R;
import X.AnonymousClass72N;
import X.AnonymousClass7TE;
import X.AnonymousClass9P8;
import X.C22444Y4b;
import X.C242173Sx;
import X.C2801950r;
import X.C369968vc;
import X.C41719AzA;
import X.C41720AzB;
import X.C60340gF;
import java.io.File;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.clips.drafts.viewmodel.ClipsDraftListViewModel$draftPreviewItemsWithDefaultNamesAndSize$1$1$1$result$1$1$1", f = "ClipsDraftListViewModel.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
public final class ClipsDraftListViewModel$draftPreviewItemsWithDefaultNamesAndSize$1$1$1$result$1$1$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public final /* synthetic */ C369968vc A02;
    public final /* synthetic */ AnonymousClass72N A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClipsDraftListViewModel$draftPreviewItemsWithDefaultNamesAndSize$1$1$1$result$1$1$1(C369968vc r2, AnonymousClass72N r3, AnonymousClass4D7 r4) {
        super(2, r4);
        this.A02 = r2;
        this.A03 = r3;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.clips.drafts.viewmodel.ClipsDraftListViewModel$draftPreviewItemsWithDefaultNamesAndSize$1$1$1$result$1$1$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r5) {
        return new ClipsDraftListViewModel$draftPreviewItemsWithDefaultNamesAndSize$1$1$1$result$1$1$1(this.A02, this.A03, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C369968vc r4;
        long j;
        Long l = obj;
        Long l2 = 1Hj.A02;
        if (this.A00 != 0) {
            r4 = (C369968vc) this.A01;
            0eS.A00(l);
        } else {
            0eS.A00(l);
            r4 = this.A02;
            2Nn r0 = this.A03.A09;
            String str = r4.A09;
            this.A01 = r4;
            this.A00 = 1;
            File file = new File(r0.A01(), str);
            if (file.exists()) {
                Iterator it = C242173Sx.A0E(C41720AzB.A00, C242173Sx.A09(C41719AzA.A00, new C22444Y4b(file, AnonymousClass05K.A00))).iterator();
                j = 0;
                while (it.hasNext()) {
                    j += AnonymousClass7TE.A0R(it.next());
                }
            } else {
                j = 0;
            }
            l = new Long(j);
            if (l == l2) {
                return l2;
            }
        }
        String str2 = r4.A09;
        C2801950r r3 = r4.A04;
        long j2 = r4.A02;
        String str3 = r4.A0C;
        String str4 = r4.A07;
        String str5 = r4.A08;
        String str6 = r4.A0A;
        AnonymousClass51R r16 = r4.A05;
        int i = r4.A00;
        AnonymousClass9P8 r14 = r4.A03;
        boolean z = r4.A0E;
        long j3 = r4.A01;
        String str7 = r4.A0B;
        boolean z2 = r4.A0G;
        boolean z3 = r4.A0F;
        0qQ.A0B(str2, 0);
        0qQ.A0B(r3, 1);
        return new C369968vc(r14, r3, r16, l, str2, str3, str4, str5, str6, str7, i, j2, j3, z, z2, z3);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ClipsDraftListViewModel$draftPreviewItemsWithDefaultNamesAndSize$1$1$1$result$1$1$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}

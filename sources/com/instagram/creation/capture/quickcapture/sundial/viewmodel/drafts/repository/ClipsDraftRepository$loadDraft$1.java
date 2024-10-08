package com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository;

import X.0sL;
import X.0sP;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60340gF;
import X.C62320sa;
import X.LO6;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository$loadDraft$1", f = "ClipsDraftRepository.kt", i = {1, 2}, l = {178, 190, 196}, m = "invokeSuspend", n = {"draft", "clipsDraft"}, s = {"L$1", "L$1"})
public final class ClipsDraftRepository$loadDraft$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public final /* synthetic */ ClipsDraftRepository A03;
    public final /* synthetic */ LO6 A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ C62320sa A06;
    public final /* synthetic */ 0sP A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClipsDraftRepository$loadDraft$1(ClipsDraftRepository clipsDraftRepository, LO6 lo6, String str, AnonymousClass4D7 r5, C62320sa r6, 0sP r7) {
        super(2, r5);
        this.A03 = clipsDraftRepository;
        this.A05 = str;
        this.A04 = lo6;
        this.A07 = r7;
        this.A06 = r6;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository$loadDraft$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r9) {
        ClipsDraftRepository clipsDraftRepository = this.A03;
        String str = this.A05;
        return new ClipsDraftRepository$loadDraft$1(clipsDraftRepository, this.A04, str, r9, this.A06, this.A07);
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository$loadDraft$1, X.4D7] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0096  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.1Hj r4 = X.1Hj.A02
            int r0 = r8.A00
            r5 = 3
            r6 = 2
            r7 = 1
            if (r0 == 0) goto L_0x001e
            if (r0 == r7) goto L_0x0030
            java.lang.Object r2 = r8.A02
            X.5kq r2 = (X.C293505kq) r2
            java.lang.Object r3 = r8.A01
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r3 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository) r3
            if (r0 == r6) goto L_0x006d
            X.0eS.A00(r9)
        L_0x0018:
            r3.A0O(r2)
        L_0x001b:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x001e:
            X.0eS.A00(r9)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r2 = r8.A03
            java.lang.String r1 = r8.A05
            X.LO6 r0 = r8.A04
            r8.A00 = r7
            java.lang.Object r9 = r2.A0H(r0, r1, r8)
            if (r9 != r4) goto L_0x0033
            return r4
        L_0x0030:
            X.0eS.A00(r9)
        L_0x0033:
            X.3Ii r9 = (X.C239803Ii) r9
            X.0sP r1 = r8.A07
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r3 = r8.A03
            boolean r0 = r9 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0077
            boolean r0 = r9 instanceof X.C297815sO
            if (r0 == 0) goto L_0x009f
            X.5sO r9 = (X.C297815sO) r9
            java.lang.Object r0 = r9.A00
            X.L42 r0 = (X.L42) r0
            r1.invoke(r0)
            X.5kq r2 = r0.A00
            java.lang.Integer r1 = r0.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 == r0) goto L_0x0057
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x0057
            r7 = 0
        L_0x0057:
            if (r2 == 0) goto L_0x0073
            java.lang.String r0 = r2.A0i
            if (r0 == 0) goto L_0x0073
            if (r7 == 0) goto L_0x0073
            r0 = 0
            r8.A01 = r3
            r8.A02 = r2
            r8.A00 = r6
            java.lang.Object r0 = r3.A0A(r0, r2, r8)
            if (r0 != r4) goto L_0x0070
            return r4
        L_0x006d:
            X.0eS.A00(r9)
        L_0x0070:
            r3.A0O(r2)
        L_0x0073:
            X.5sO r9 = X.DbU.A0f()
        L_0x0077:
            X.0sa r1 = r8.A06
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r3 = r8.A03
            boolean r0 = r9 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0096
            X.3Ih r9 = (X.C239793Ih) r9
            java.lang.Object r2 = r9.A00
            X.5kq r2 = (X.C293505kq) r2
            r1.invoke()
            r0 = 0
            r8.A01 = r3
            r8.A02 = r2
            r8.A00 = r5
            java.lang.Object r0 = r3.A0A(r0, r2, r8)
            if (r0 != r4) goto L_0x0018
            return r4
        L_0x0096:
            boolean r0 = r9 instanceof X.C297815sO
            if (r0 != 0) goto L_0x001b
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x009f:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository$loadDraft$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ClipsDraftRepository$loadDraft$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}

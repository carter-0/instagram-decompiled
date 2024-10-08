package com.instagram.comments.mvvm.data;

import X.0sP;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.C53401GnY;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.comments.mvvm.data.MediaCommentListRepository$fetchOrJoinChildCommentPage$2", f = "MediaCommentListRepository.kt", i = {}, l = {928, 938}, m = "invokeSuspend", n = {}, s = {})
public final class MediaCommentListRepository$fetchOrJoinChildCommentPage$2 extends AnonymousClass1Ek implements 0sP {
    public int A00;
    public final /* synthetic */ C53401GnY A01;
    public final /* synthetic */ MediaCommentListRepository A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaCommentListRepository$fetchOrJoinChildCommentPage$2(C53401GnY gnY, MediaCommentListRepository mediaCommentListRepository, AnonymousClass4D7 r4) {
        super(1, r4);
        this.A02 = mediaCommentListRepository;
        this.A01 = gnY;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.comments.mvvm.data.MediaCommentListRepository$fetchOrJoinChildCommentPage$2, X.4D7] */
    public final AnonymousClass4D7 create(AnonymousClass4D7 r4) {
        return new MediaCommentListRepository$fetchOrJoinChildCommentPage$2(this.A01, this.A02, r4);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((MediaCommentListRepository$fetchOrJoinChildCommentPage$2) create((AnonymousClass4D7) obj)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [com.instagram.comments.mvvm.data.MediaCommentListRepository$fetchOrJoinChildCommentPage$2, X.4D7] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0079  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r5 = r16
            X.1Hj r4 = X.1Hj.A02
            r12 = r15
            int r0 = r15.A00
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0013
            if (r0 == r2) goto L_0x004e
            X.0eS.A00(r5)
        L_0x0010:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x0013:
            X.0eS.A00(r5)
            com.instagram.comments.mvvm.data.MediaCommentListRepository r6 = r15.A02
            X.4Cq r7 = r6.A01
            r5 = 0
            X.GnY r8 = r15.A01
            r3 = 18
            X.MGz r0 = new X.MGz
            r0.<init>((java.lang.Object) r8, (java.lang.Object) r6, (X.AnonymousClass4D7) r5, (int) r3)
            X.AnonymousClass7TE.A1Z(r0, r7)
            com.instagram.common.session.UserSession r9 = r6.A0B
            X.GmL r0 = r6.A04
            boolean r13 = r0.A0e
            java.lang.String r10 = r0.A0E
            X.0Ud r0 = r6.A0M
            java.lang.Object r0 = r0.getValue()
            X.7aJ r0 = (X.C333887aJ) r0
            boolean r14 = r0.A03
            X.05G r0 = r6.A0H
            java.lang.Object r0 = r0.getValue()
            X.7aH r0 = (X.C333867aH) r0
            X.7aC r0 = r0.A03
            java.util.Set r11 = r0.A02
            r15.A00 = r2
            java.lang.Object r5 = com.instagram.comments.mvvm.data.network.MediaChildCommentNetworkFetcherKt.A00(r8, r9, r10, r11, r12, r13, r14)
            if (r5 != r4) goto L_0x0051
            return r4
        L_0x004e:
            X.0eS.A00(r5)
        L_0x0051:
            X.ACP r0 = X.ACP.A00
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 != 0) goto L_0x0010
            X.ACO r0 = X.ACO.A00
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 != 0) goto L_0x0010
            boolean r0 = r5 instanceof X.C381409bi
            if (r0 == 0) goto L_0x0079
            com.instagram.comments.mvvm.data.MediaCommentListRepository r3 = r15.A02
            X.GnY r2 = r15.A01
            r15.A00 = r1
            r1 = 33
            X.9Ly r0 = new X.9Ly
            r0.<init>((int) r1, (java.lang.Object) r5, (java.lang.Object) r2)
            java.lang.Object r0 = com.instagram.comments.mvvm.data.MediaCommentListRepository.A09(r3, r15, r0)
            if (r0 != r4) goto L_0x0010
            return r4
        L_0x0079:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.data.MediaCommentListRepository$fetchOrJoinChildCommentPage$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

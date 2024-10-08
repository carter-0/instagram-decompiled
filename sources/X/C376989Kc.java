package X;

import com.instagram.comments.mvvm.data.MediaCommentListRepository;
import com.instagram.common.session.UserSession;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync.ContentFilterDictionarySyncManager;

/* renamed from: X.9Kc  reason: invalid class name and case insensitive filesystem */
public final class C376989Kc extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public final int A02 = 0;
    public final Object A03;
    public final String A04;
    public final String A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C376989Kc(UserSession userSession, ContentFilterDictionarySyncManager contentFilterDictionarySyncManager, String str, String str2, AnonymousClass4D7 r6) {
        super(2, r6);
        this.A03 = contentFilterDictionarySyncManager;
        this.A01 = userSession;
        this.A04 = str;
        this.A05 = str2;
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [X.9Kc, X.4D7] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            r7 = r14
            int r0 = r14.A02
            if (r0 == 0) goto L_0x0037
            X.1Hj r0 = X.1Hj.A02
            int r1 = r14.A00
            r2 = 1
            if (r1 == 0) goto L_0x0012
            if (r1 != r2) goto L_0x002f
            X.0eS.A00(r15)
        L_0x0011:
            return r15
        L_0x0012:
            X.0eS.A00(r15)
            java.lang.Object r1 = r14.A03
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync.ContentFilterDictionarySyncManager r1 = (com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync.ContentFilterDictionarySyncManager) r1
            com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync.ContentFilterDictionaryPatternsLoader r3 = r1.A02
            java.lang.Object r4 = r14.A01
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.String r5 = r14.A04
            java.lang.String r6 = r14.A05
            r8 = 1880389522(0x70147792, float:1.8379333E29)
            r14.A00 = r2
            java.lang.Object r15 = r3.A00(r4, r5, r6, r7, r8)
            if (r15 != r0) goto L_0x0011
            return r0
        L_0x002f:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0037:
            X.1Hj r0 = X.1Hj.A02
            int r3 = r14.A00
            r1 = 3
            r2 = 2
            r5 = 1
            if (r3 == 0) goto L_0x004a
            if (r3 == r5) goto L_0x0082
            if (r3 == r2) goto L_0x00ab
            X.0eS.A00(r15)
        L_0x0047:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x004a:
            X.0eS.A00(r15)
            java.lang.Object r4 = r14.A01
            X.4Cq r4 = (X.C262224Cq) r4
            java.lang.Object r9 = r14.A03
            com.instagram.comments.mvvm.data.MediaCommentListRepository r9 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r9
            X.0Ud r3 = r9.A0L
            java.lang.Object r3 = r3.getValue()
            X.7aH r3 = (X.C333867aH) r3
            java.lang.String r10 = r14.A05
            java.lang.String r11 = r14.A04
            X.7dj r6 = X.C335067cK.A01(r3, r10, r11)
            r12 = 0
            r13 = 0
            X.9Kb r8 = new X.9Kb
            r8.<init>(r9, r10, r11, r12, r13)
            X.19B r3 = X.19B.A00
            X.1Eo.A05(r3, r8, r4)
            if (r6 == 0) goto L_0x0047
            com.instagram.common.session.UserSession r4 = r9.A0B
            X.GmL r3 = r9.A04
            java.lang.String r3 = r3.A0E
            r14.A00 = r5
            java.lang.Object r15 = com.instagram.comments.mvvm.data.network.HideActionNetworkRequestsKt.A00(r6, r4, r3, r14)
            if (r15 != r0) goto L_0x0085
            return r0
        L_0x0082:
            X.0eS.A00(r15)
        L_0x0085:
            if (r15 == 0) goto L_0x0047
            java.lang.Object r8 = r14.A03
            com.instagram.comments.mvvm.data.MediaCommentListRepository r8 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r8
            java.lang.String r11 = r14.A05
            java.lang.String r12 = r14.A04
            boolean r3 = r15 instanceof X.C239793Ih
            if (r3 == 0) goto L_0x00a1
            java.lang.Integer r10 = X.AnonymousClass05K.A00
            X.7de r9 = X.C335857de.HIDDEN_COMMENT
            r14.A00 = r2
            r13 = r14
            java.lang.Object r2 = com.instagram.comments.mvvm.data.MediaCommentListRepository.A03(r8, r9, r10, r11, r12, r13)
            if (r2 != r0) goto L_0x00ae
            return r0
        L_0x00a1:
            boolean r2 = r15 instanceof X.C297815sO
            if (r2 != 0) goto L_0x00b5
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00ab:
            X.0eS.A00(r15)
        L_0x00ae:
            X.0gF r2 = X.C60340gF.A00
            X.3Ih r15 = new X.3Ih
            r15.<init>(r2)
        L_0x00b5:
            java.lang.Object r8 = r14.A03
            com.instagram.comments.mvvm.data.MediaCommentListRepository r8 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r8
            java.lang.String r11 = r14.A05
            java.lang.String r12 = r14.A04
            boolean r2 = r15 instanceof X.C239793Ih
            if (r2 != 0) goto L_0x0047
            boolean r2 = r15 instanceof X.C297815sO
            if (r2 == 0) goto L_0x00d3
            java.lang.Integer r10 = X.AnonymousClass05K.A00
            X.7de r9 = X.C335857de.A04
            r14.A00 = r1
            r13 = r14
            java.lang.Object r1 = com.instagram.comments.mvvm.data.MediaCommentListRepository.A03(r8, r9, r10, r11, r12, r13)
            if (r1 != r0) goto L_0x0047
            return r0
        L_0x00d3:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C376989Kc.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.9Kc, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.9Kc, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r11) {
        AnonymousClass4D7 r8 = r11;
        if (this.A02 != 0) {
            return new C376989Kc((UserSession) this.A01, (ContentFilterDictionarySyncManager) this.A03, this.A04, this.A05, r8);
        }
        ? r3 = new C376989Kc((MediaCommentListRepository) this.A03, this.A05, this.A04, r11);
        r3.A01 = obj;
        return r3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C376989Kc) create(obj, (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C376989Kc(MediaCommentListRepository mediaCommentListRepository, String str, String str2, AnonymousClass4D7 r5) {
        super(2, r5);
        this.A03 = mediaCommentListRepository;
        this.A05 = str;
        this.A04 = str2;
    }
}

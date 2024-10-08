package X;

public final class JUG extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX WARNING: type inference failed for: r15v0, types: [X.JUG, java.lang.Object, X.4D7] */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0037  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r6 = r15
            int r0 = r15.A03
            r1 = r16
            switch(r0) {
                case 0: goto L_0x0069;
                case 1: goto L_0x0075;
                case 2: goto L_0x0082;
                case 3: goto L_0x008f;
                case 4: goto L_0x009c;
                case 5: goto L_0x00a9;
                case 6: goto L_0x00b6;
                case 7: goto L_0x00c8;
                case 8: goto L_0x00d5;
                case 9: goto L_0x00e2;
                case 10: goto L_0x00f0;
                case 11: goto L_0x0236;
                case 12: goto L_0x00d5;
                case 13: goto L_0x00d5;
                case 14: goto L_0x00fd;
                case 15: goto L_0x0107;
                case 16: goto L_0x00d5;
                case 17: goto L_0x0114;
                case 18: goto L_0x0122;
                case 19: goto L_0x012f;
                case 20: goto L_0x0015;
                case 21: goto L_0x013c;
                case 22: goto L_0x0149;
                case 23: goto L_0x0156;
                case 24: goto L_0x0163;
                case 25: goto L_0x0170;
                case 26: goto L_0x017d;
                case 27: goto L_0x018b;
                case 28: goto L_0x0198;
                case 29: goto L_0x00d5;
                case 30: goto L_0x01a5;
                case 31: goto L_0x00fd;
                case 32: goto L_0x01b2;
                case 33: goto L_0x01c5;
                case 34: goto L_0x01d6;
                case 35: goto L_0x01e2;
                case 36: goto L_0x01eb;
                case 37: goto L_0x01f8;
                case 38: goto L_0x00d5;
                case 39: goto L_0x00d5;
                case 40: goto L_0x00d5;
                case 41: goto L_0x0205;
                case 42: goto L_0x00d5;
                case 43: goto L_0x00d5;
                case 44: goto L_0x00d5;
                case 45: goto L_0x020e;
                case 46: goto L_0x00d5;
                case 47: goto L_0x021c;
                case 48: goto L_0x0229;
                default: goto L_0x0008;
            }
        L_0x0008:
            A02(r1, r15)
            java.lang.Object r1 = r15.A01
            X.IkS r1 = (X.C58034IkS) r1
            r0 = 0
            java.lang.Object r2 = r1.emit(r0, r15)
        L_0x0014:
            return r2
        L_0x0015:
            r15.A01 = r1
            int r5 = r15.A00
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r5 | r4
            r15.A00 = r5
            java.lang.Object r3 = r15.A02
            r2 = 20
            boolean r0 = A03(r2, r15)
            if (r0 == 0) goto L_0x005b
            r1 = r15
            r0 = r5 & r4
            if (r0 == 0) goto L_0x005b
            int r5 = r5 - r4
            r15.A00 = r5
        L_0x0030:
            java.lang.Object r2 = r1.A01
            int r1 = r1.A00
            r0 = 1
            if (r1 == 0) goto L_0x024a
            if (r1 != r0) goto L_0x0245
            X.0eS.A00(r2)
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x004a
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0240
            X.5sO r2 = X.DbU.A0f()
        L_0x004a:
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0060
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r0 = r2.A00
            X.CGK r0 = (X.CGK) r0
            java.util.List r0 = r0.A00
            X.3Ih r2 = X.C41845B3m.A0d(r0)
            return r2
        L_0x005b:
            X.JUG r1 = A00(r3, r15, r2)
            goto L_0x0030
        L_0x0060:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0014
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0069:
            A01(r1, r15)
            java.lang.Object r0 = r15.A02
            com.instagram.brandedcontent.repository.BrandedContentApi r0 = (com.instagram.brandedcontent.repository.BrandedContentApi) r0
            java.lang.Object r2 = r0.A0C(r15)
            return r2
        L_0x0075:
            A01(r1, r15)
            java.lang.Object r1 = r15.A02
            com.instagram.brandedcontent.repository.BrandedContentApi r1 = (com.instagram.brandedcontent.repository.BrandedContentApi) r1
            r0 = 0
            java.lang.Object r2 = r1.A06(r0, r15)
            return r2
        L_0x0082:
            A01(r1, r15)
            java.lang.Object r1 = r15.A02
            com.instagram.brandedcontent.repository.BrandedContentApi r1 = (com.instagram.brandedcontent.repository.BrandedContentApi) r1
            r0 = 0
            java.lang.Object r2 = r1.A07(r0, r15)
            return r2
        L_0x008f:
            A01(r1, r15)
            java.lang.Object r1 = r15.A02
            com.instagram.brandedcontent.repository.BrandedContentApi r1 = (com.instagram.brandedcontent.repository.BrandedContentApi) r1
            r0 = 0
            java.lang.Object r2 = r1.A00(r0, r0, r15)
            return r2
        L_0x009c:
            A01(r1, r15)
            java.lang.Object r1 = r15.A02
            com.instagram.brandedcontent.repository.BrandedContentApi r1 = (com.instagram.brandedcontent.repository.BrandedContentApi) r1
            r0 = 0
            java.lang.Object r2 = r1.A03(r0, r0, r15)
            return r2
        L_0x00a9:
            A01(r1, r15)
            java.lang.Object r1 = r15.A02
            com.instagram.brandedcontent.repository.BrandedContentApi r1 = (com.instagram.brandedcontent.repository.BrandedContentApi) r1
            r0 = 0
            java.lang.Object r2 = r1.A04(r0, r0, r0, r15)
            return r2
        L_0x00b6:
            A01(r1, r15)
            java.lang.Object r0 = r15.A02
            com.instagram.brandedcontent.repository.BrandedContentApi r0 = (com.instagram.brandedcontent.repository.BrandedContentApi) r0
            r1 = 0
            r7 = 0
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            java.lang.Object r2 = r0.A01(r1, r2, r3, r4, r5, r6, r7)
            return r2
        L_0x00c8:
            A01(r1, r15)
            java.lang.Object r1 = r15.A02
            com.instagram.brandedcontent.repository.BrandedContentApi r1 = (com.instagram.brandedcontent.repository.BrandedContentApi) r1
            r0 = 0
            java.lang.Object r2 = r1.A08(r0, r15)
            return r2
        L_0x00d5:
            A02(r1, r15)
            java.lang.Object r1 = r15.A01
            X.MCj r1 = (X.C66119MCj) r1
            r0 = 0
            java.lang.Object r2 = r1.emit(r0, r15)
            return r2
        L_0x00e2:
            A01(r1, r15)
            java.lang.Object r2 = r15.A02
            com.instagram.brandedcontent.repository.BrandedContentSettingsRepository r2 = (com.instagram.brandedcontent.repository.BrandedContentSettingsRepository) r2
            r1 = 0
            r0 = 0
            java.lang.Object r2 = r2.A00(r1, r15, r0)
            return r2
        L_0x00f0:
            A01(r1, r15)
            java.lang.Object r1 = r15.A02
            com.instagram.brandedcontent.repository.BrandedContentSettingsRepository r1 = (com.instagram.brandedcontent.repository.BrandedContentSettingsRepository) r1
            r0 = 0
            java.lang.Object r2 = r1.A03(r15, r0)
            return r2
        L_0x00fd:
            A02(r1, r15)
            java.lang.Object r0 = r15.A01
            java.lang.Object r2 = X.MCn.A00(r0, r15)
            return r2
        L_0x0107:
            A02(r1, r15)
            java.lang.Object r1 = r15.A01
            X.PeM r1 = (X.C73530PeM) r1
            r0 = 0
            java.lang.Object r2 = r1.emit(r0, r15)
            return r2
        L_0x0114:
            A01(r1, r15)
            java.lang.Object r2 = r15.A02
            com.instagram.clips.audio.rename.api.RenameOriginalAudioApiHandler r2 = (com.instagram.clips.audio.rename.api.RenameOriginalAudioApiHandler) r2
            r1 = 0
            r0 = 0
            java.lang.Object r2 = r2.A01(r1, r1, r15, r0)
            return r2
        L_0x0122:
            A01(r1, r15)
            java.lang.Object r1 = r15.A02
            com.instagram.clips.audio.rename.api.RenameOriginalAudioApiHandler r1 = (com.instagram.clips.audio.rename.api.RenameOriginalAudioApiHandler) r1
            r0 = 0
            java.lang.Object r2 = r1.A00(r0, r0, r15)
            return r2
        L_0x012f:
            A01(r1, r15)
            java.lang.Object r1 = r15.A02
            com.instagram.clips.audio.soundsync.repository.ClipsSoundSyncMediaImportRepository r1 = (com.instagram.clips.audio.soundsync.repository.ClipsSoundSyncMediaImportRepository) r1
            r0 = 0
            java.lang.Object r2 = r1.A00(r0, r15)
            return r2
        L_0x013c:
            A02(r1, r15)
            java.lang.Object r1 = r15.A01
            com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository$special$$inlined$map$2$2 r1 = (com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository$special$$inlined$map$2$2) r1
            r0 = 0
            java.lang.Object r2 = r1.emit(r0, r15)
            return r2
        L_0x0149:
            A01(r1, r15)
            java.lang.Object r1 = r15.A02
            X.2NP r1 = (X.2NP) r1
            r0 = 0
            java.lang.Object r2 = r1.A0A(r0, r15)
            return r2
        L_0x0156:
            A01(r1, r15)
            java.lang.Object r1 = r15.A02
            X.2NP r1 = (X.2NP) r1
            r0 = 0
            java.lang.Object r2 = r1.A0K(r0, r15)
            return r2
        L_0x0163:
            A01(r1, r15)
            java.lang.Object r1 = r15.A02
            X.2NP r1 = (X.2NP) r1
            r0 = 0
            java.lang.Object r2 = r1.A0E(r0, r15)
            return r2
        L_0x0170:
            A01(r1, r15)
            java.lang.Object r1 = r15.A02
            X.2NP r1 = (X.2NP) r1
            r0 = 0
            java.lang.Object r2 = r1.A07(r0, r0, r15)
            return r2
        L_0x017d:
            A01(r1, r15)
            java.lang.Object r2 = r15.A02
            X.2NP r2 = (X.2NP) r2
            r1 = 0
            r0 = 0
            java.lang.Object r2 = r2.A0J(r1, r15, r0)
            return r2
        L_0x018b:
            A01(r1, r15)
            java.lang.Object r1 = r15.A02
            X.2NP r1 = (X.2NP) r1
            r0 = 0
            java.lang.Object r2 = r1.A0L(r0, r15)
            return r2
        L_0x0198:
            A02(r1, r15)
            java.lang.Object r1 = r15.A01
            com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource$getAllDraftPreviewItems$$inlined$map$1$2 r1 = (com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource$getAllDraftPreviewItems$$inlined$map$1$2) r1
            r0 = 0
            java.lang.Object r2 = r1.emit(r0, r15)
            return r2
        L_0x01a5:
            A01(r1, r15)
            java.lang.Object r1 = r15.A02
            X.Av1 r1 = (X.C41500Av1) r1
            r0 = 0
            java.lang.Object r2 = r1.emit(r0, r15)
            return r2
        L_0x01b2:
            A01(r1, r15)
            java.lang.Object r7 = r15.A02
            com.instagram.closefriends.audiencelists.api.AudienceListsApiUtil r7 = (com.instagram.closefriends.audiencelists.api.AudienceListsApiUtil) r7
            r8 = 0
            r9 = r8
            r10 = r8
            r11 = r8
            r12 = r8
            r13 = r8
            r14 = r15
            java.lang.Object r2 = r7.A06(r8, r9, r10, r11, r12, r13, r14)
            return r2
        L_0x01c5:
            A01(r1, r15)
            java.lang.Object r1 = r15.A02
            com.instagram.closefriends.audiencelists.api.AudienceListsApiUtil r1 = (com.instagram.closefriends.audiencelists.api.AudienceListsApiUtil) r1
            r2 = 0
            r7 = 0
            r3 = r2
            r4 = r2
            r5 = r2
            java.lang.Object r2 = r1.A04(r2, r3, r4, r5, r6, r7)
            return r2
        L_0x01d6:
            A01(r1, r15)
            java.lang.Object r0 = r15.A02
            com.instagram.comments.mvvm.data.MediaCommentListRepository r0 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r0
            java.lang.Object r2 = r0.A0C(r15)
            return r2
        L_0x01e2:
            A02(r1, r15)
            r0 = 0
            java.lang.Object r2 = com.instagram.comments.mvvm.data.network.CommentPostingRequestExtensionsKt.A03(r0, r0, r0, r0, r15)
            return r2
        L_0x01eb:
            A01(r1, r15)
            java.lang.Object r1 = r15.A02
            com.instagram.comments.mvvm.data.network.CommentTranslationFetcher r1 = (com.instagram.comments.mvvm.data.network.CommentTranslationFetcher) r1
            r0 = 0
            java.lang.Object r2 = r1.A01(r0, r0, r15)
            return r2
        L_0x01f8:
            A01(r1, r15)
            java.lang.Object r1 = r15.A02
            com.instagram.comments.mvvm.data.network.CommentTranslationFetcher r1 = (com.instagram.comments.mvvm.data.network.CommentTranslationFetcher) r1
            r0 = 0
            java.lang.Object r2 = r1.A00(r0, r0, r15)
            return r2
        L_0x0205:
            A02(r1, r15)
            r0 = 0
            java.lang.Object r2 = com.instagram.compose.core.ui.IgClickableTextKt.A00(r0, r15)
            return r2
        L_0x020e:
            A01(r1, r15)
            java.lang.Object r2 = r15.A02
            com.instagram.compose.ui.pulltorefresh.PullRefreshNestedScrollConnection r2 = (com.instagram.compose.ui.pulltorefresh.PullRefreshNestedScrollConnection) r2
            r0 = 0
            java.lang.Object r2 = r2.DYa(r15, r0)
            return r2
        L_0x021c:
            A02(r1, r15)
            java.lang.Object r1 = r15.A01
            X.IkW r1 = (X.C58038IkW) r1
            r0 = 0
            java.lang.Object r2 = r1.emit(r0, r15)
            return r2
        L_0x0229:
            A02(r1, r15)
            java.lang.Object r1 = r15.A01
            X.IkV r1 = (X.C58037IkV) r1
            r0 = 0
            java.lang.Object r2 = r1.emit(r0, r15)
            return r2
        L_0x0236:
            A02(r1, r15)
            java.lang.String r0 = "emit"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x0240:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0245:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x024a:
            X.0eS.A00(r2)
            java.lang.String r0 = "getMaxItems"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JUG.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JUG(Object obj, AnonymousClass4D7 r2, int i, int i2) {
        super(r2);
        this.A03 = i;
        this.A02 = obj;
    }

    public static JUG A00(Object obj, AnonymousClass4D7 r3, int i) {
        return new JUG(obj, r3, i, 42);
    }

    public static void A01(Object obj, JUG jug) {
        jug.A01 = obj;
        jug.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public static void A02(Object obj, JUG jug) {
        jug.A02 = obj;
        jug.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public static boolean A03(int i, Object obj) {
        if (!(obj instanceof JUG) || ((JUG) obj).A03 != i) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JUG(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A03 = i;
        this.A01 = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JUG(int i, AnonymousClass4D7 r2) {
        super(r2);
        this.A03 = i;
    }
}

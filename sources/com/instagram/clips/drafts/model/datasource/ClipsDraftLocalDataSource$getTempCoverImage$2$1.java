package com.instagram.clips.drafts.model.datasource;

import X.0eS;
import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.C39908AIz;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource$getTempCoverImage$2$1", f = "ClipsDraftLocalDataSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ClipsDraftLocalDataSource$getTempCoverImage$2$1 extends AnonymousClass1Ek implements 0sL {
    public final /* synthetic */ String A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClipsDraftLocalDataSource$getTempCoverImage$2$1(String str, AnonymousClass4D7 r3) {
        super(2, r3);
        this.A00 = str;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4D7, com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource$getTempCoverImage$2$1] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r4) {
        return new ClipsDraftLocalDataSource$getTempCoverImage$2$1(this.A00, r4);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ClipsDraftLocalDataSource$getTempCoverImage$2$1(this.A00, (AnonymousClass4D7) obj2).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0eS.A00(obj);
        return C39908AIz.A01(this.A00, 0);
    }
}

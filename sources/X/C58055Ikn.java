package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "instagram.features.clips.drafts.model.migrations.mediadraft.impl.MediaDraftMigrator", f = "MediaDraftMigrator.kt", i = {0, 0, 1}, l = {31, 49}, m = "migrateMediaDrafts", n = {"this", "targetVersion", "this"}, s = {"L$0", "I$0", "L$0"})
/* renamed from: X.Ikn  reason: case insensitive filesystem */
public final class C58055Ikn extends C64101El {
    public int A00;
    public int A01;
    public Object A02;
    public /* synthetic */ Object A03;
    public final /* synthetic */ AnonymousClass2N1 A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58055Ikn(AnonymousClass2N1 r1, AnonymousClass4D7 r2) {
        super(r2);
        this.A04 = r1;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Ikn, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        this.A03 = obj;
        this.A01 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        return this.A04.A00(this);
    }
}

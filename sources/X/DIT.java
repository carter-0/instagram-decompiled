package X;

import com.instagram.creator.agent.settings.repository.CreatorAiSettingsRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creator.agent.settings.repository.CreatorAiSettingsRepository", f = "CreatorAiSettingsRepository.kt", i = {0}, l = {85}, m = "setAutoRepliesEnabled", n = {"enabled"}, s = {"Z$0"})
public final class DIT extends C64101El {
    public int A00;
    public boolean A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ CreatorAiSettingsRepository A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DIT(CreatorAiSettingsRepository creatorAiSettingsRepository, AnonymousClass4D7 r2) {
        super(r2);
        this.A03 = creatorAiSettingsRepository;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.DIT, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        this.A02 = obj;
        this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        return this.A03.A01((String) null, this, false);
    }
}

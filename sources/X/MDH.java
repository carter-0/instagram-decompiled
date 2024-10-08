package X;

import com.instagram.avatars.suggestions.ContextualSuggestionsPerIntentRepository;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.avatars.suggestions.ContextualSuggestionsPerIntentRepository", f = "ContextualSuggestionsPerIntentRepository.kt", i = {0, 0, 0, 0, 1, 1}, l = {213, 231}, m = "tryFetchStickersInternal", n = {"this", "intents", "isPrefetch", "forceNetwork", "this", "instanceKey"}, s = {"L$0", "L$1", "Z$0", "Z$1", "L$0", "I$0"})
public final class MDH extends C64101El {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public boolean A04;
    public boolean A05;
    public /* synthetic */ Object A06;
    public final /* synthetic */ ContextualSuggestionsPerIntentRepository A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MDH(ContextualSuggestionsPerIntentRepository contextualSuggestionsPerIntentRepository, AnonymousClass4D7 r2) {
        super(r2);
        this.A07 = contextualSuggestionsPerIntentRepository;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.MDH, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        this.A06 = obj;
        this.A01 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        return ContextualSuggestionsPerIntentRepository.A03(this.A07, (List) null, this, false, false);
    }
}

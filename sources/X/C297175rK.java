package X;

import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar", f = "ContentFilterDictionaryRegistrar.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {505}, m = "updateRegistrationMaps", n = {"this", "updatedDictionariesMap", "clientsToNotify", "dictionary", "dictionaryClients", "addedClients", "$this$withLock_u24default$iv", "removedClients"}, s = {"L$0", "L$1", "L$2", "L$4", "L$5", "L$6", "L$7", "L$8"})
/* renamed from: X.5rK  reason: invalid class name and case insensitive filesystem */
public final class C297175rK extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public /* synthetic */ Object A0A;
    public final /* synthetic */ ContentFilterDictionaryRegistrar A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C297175rK(ContentFilterDictionaryRegistrar contentFilterDictionaryRegistrar, AnonymousClass4D7 r2) {
        super(r2);
        this.A0B = contentFilterDictionaryRegistrar;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.5rK, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        this.A0A = obj;
        this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        return ContentFilterDictionaryRegistrar.A02(this.A0B, (Map) null, this);
    }
}

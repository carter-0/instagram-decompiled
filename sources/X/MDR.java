package X;

import com.instagram.settings2.core.session.SettingsSession;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.settings2.core.session.SettingsSession", f = "SettingsSession.kt", i = {0, 0, 0, 0}, l = {80}, m = "resolveUnsafe", n = {"this", "abstractValueResolver", "destination$iv$iv", "initialCacheSize"}, s = {"L$0", "L$3", "L$4", "I$1"})
public final class MDR extends C64101El {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public /* synthetic */ Object A0A;
    public final /* synthetic */ SettingsSession A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MDR(SettingsSession settingsSession, AnonymousClass4D7 r2) {
        super(r2);
        this.A0B = settingsSession;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.MDR, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        this.A0A = obj;
        this.A02 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        return this.A0B.A02((List) null, this);
    }
}

package androidx.compose.animation.core;

import X.0eS;
import X.0sP;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass5b4;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.animation.core.Animatable$snapTo$2", f = "Animatable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class Animatable$snapTo$2 extends AnonymousClass1Ek implements 0sP {
    public final /* synthetic */ AnonymousClass5b4 A00;
    public final /* synthetic */ Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Animatable$snapTo$2(AnonymousClass5b4 r2, Object obj, AnonymousClass4D7 r4) {
        super(1, r4);
        this.A00 = r2;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [androidx.compose.animation.core.Animatable$snapTo$2, X.4D7] */
    public final AnonymousClass4D7 create(AnonymousClass4D7 r4) {
        return new Animatable$snapTo$2(this.A00, this.A01, r4);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((Animatable$snapTo$2) create((AnonymousClass4D7) obj)).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0eS.A00(obj);
        AnonymousClass5b4 r2 = this.A00;
        AnonymousClass5b4.A01(r2);
        Object A002 = AnonymousClass5b4.A00(r2, this.A01);
        r2.A04.A05.Epw(A002);
        r2.A09.Epw(A002);
        return C60340gF.A00;
    }
}

package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "instagram.features.clips.audio.soundsync.viewmodel.ClipsSoundSyncViewModel$3", f = "ClipsSoundSyncViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.ImV  reason: case insensitive filesystem */
public final class C58108ImV extends AnonymousClass1Ek implements 0sK {
    public /* synthetic */ double A00;
    public /* synthetic */ double A01;
    public final /* synthetic */ C52974GgR A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58108ImV(C52974GgR ggR, AnonymousClass4D7 r3) {
        super(3, r3);
        this.A02 = ggR;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        double doubleValue = ((Number) obj).doubleValue();
        double doubleValue2 = ((Number) obj2).doubleValue();
        C58108ImV imV = new C58108ImV(this.A02, (AnonymousClass4D7) obj3);
        imV.A00 = doubleValue;
        imV.A01 = doubleValue2;
        return imV.invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0eS.A00(obj);
        double d = this.A00;
        double d2 = this.A01;
        if (this.A02.A0H.A01) {
            d2 = (d2 * 0.2d) + (d * 0.8d);
        }
        return new Double(d2);
    }
}

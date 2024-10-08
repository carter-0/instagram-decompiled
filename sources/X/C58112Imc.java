package X;

import android.graphics.Bitmap;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "instagram.features.clips.audio.soundsync.viewmodel.ClipsSoundSyncViewModel$4", f = "ClipsSoundSyncViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.Imc  reason: case insensitive filesystem */
public final class C58112Imc extends AnonymousClass1Ek implements 0sI {
    public /* synthetic */ double A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public /* synthetic */ boolean A03;
    public final /* synthetic */ C52974GgR A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58112Imc(C52974GgR ggR, AnonymousClass4D7 r3) {
        super(5, r3);
        this.A04 = ggR;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        double doubleValue = ((Number) obj3).doubleValue();
        boolean A1a = AnonymousClass7TE.A1a(obj4);
        C58112Imc imc = new C58112Imc(this.A04, (AnonymousClass4D7) obj5);
        imc.A01 = obj;
        imc.A02 = obj2;
        imc.A00 = doubleValue;
        imc.A03 = A1a;
        return imc.invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z;
        0eS.A00(obj);
        C54607HKq hKq = (C54607HKq) this.A01;
        Bitmap bitmap = (Bitmap) this.A02;
        double d = this.A00;
        if (!this.A03) {
            switch (C55365HgX.A00[hKq.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    break;
                case 7:
                    z = false;
                    break;
                default:
                    throw AnonymousClass7TE.A1K();
            }
        }
        z = true;
        return new C53340GmQ(bitmap, hKq, d, z);
    }
}

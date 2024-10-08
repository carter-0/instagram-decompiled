package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "instagram.features.clips.audio.soundsync.viewmodel.ClipsSoundSyncViewModel$2", f = "ClipsSoundSyncViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.Imi  reason: case insensitive filesystem */
public final class C58116Imi extends AnonymousClass1Ek implements 0sG {
    public /* synthetic */ boolean A00;
    public /* synthetic */ boolean A01;
    public /* synthetic */ boolean A02;
    public /* synthetic */ boolean A03;
    public /* synthetic */ boolean A04;
    public /* synthetic */ boolean A05;
    public final /* synthetic */ C52974GgR A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58116Imi(C52974GgR ggR, AnonymousClass4D7 r3) {
        super(7, r3);
        this.A06 = ggR;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        boolean A1a = AnonymousClass7TE.A1a(obj);
        boolean A1a2 = AnonymousClass7TE.A1a(obj2);
        boolean A1a3 = AnonymousClass7TE.A1a(obj3);
        boolean A1a4 = AnonymousClass7TE.A1a(obj4);
        boolean A1a5 = AnonymousClass7TE.A1a(obj5);
        boolean A1a6 = AnonymousClass7TE.A1a(obj6);
        C58116Imi imi = new C58116Imi(this.A06, (AnonymousClass4D7) obj7);
        imi.A00 = A1a;
        imi.A01 = A1a2;
        imi.A02 = A1a3;
        imi.A03 = A1a4;
        imi.A04 = A1a5;
        imi.A05 = A1a6;
        return imi.invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0eS.A00(obj);
        boolean z = this.A00;
        boolean z2 = this.A01;
        boolean z3 = this.A02;
        boolean z4 = this.A03;
        boolean z5 = this.A04;
        boolean z6 = this.A05;
        if (!z5 && !this.A06.A0E.A08) {
            return C54607HKq.A08;
        }
        if (z6) {
            return C54607HKq.A06;
        }
        if (z) {
            return C54607HKq.A07;
        }
        if (z4) {
            return C54607HKq.A03;
        }
        if (z2) {
            return C54607HKq.A04;
        }
        if (z3) {
            return C54607HKq.A05;
        }
        AnonymousClass8A2 r0 = this.A06.A0D;
        1QP r3 = r0.A0J;
        long j = r0.A09;
        AE4 ae4 = new AE4(r3);
        ae4.A01 = j;
        ae4.A02();
        return C54607HKq.A02;
    }
}

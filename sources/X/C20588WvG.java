package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", f = "JsonTreeReader.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.WvG  reason: case insensitive filesystem */
public final class C20588WvG extends C267894cP implements 0sK {
    public int A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ W1J A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20588WvG(AnonymousClass4D7 r2, W1J w1j) {
        super(3, r2);
        this.A02 = w1j;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C20588WvG wvG = new C20588WvG((AnonymousClass4D7) obj3, this.A02);
        wvG.A01 = obj;
        return wvG.invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.WvG, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        1Hj r6 = 1Hj.A02;
        boolean z = true;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            C20407Wqr wqr = (C20407Wqr) this.A01;
            W1J w1j = this.A02;
            AnonymousClass40W r3 = w1j.A01;
            byte A04 = r3.A04();
            if (A04 != 1) {
                if (A04 == 0) {
                    z = false;
                } else if (A04 == 6) {
                    this.A00 = 1;
                    obj = W1J.A00(wqr, this, w1j);
                    if (obj == r6) {
                        return r6;
                    }
                } else if (A04 == 8) {
                    return W1J.A01(w1j);
                } else {
                    r3.A0F("Can't begin reading element, unexpected token", "", r3.A00);
                    throw AnonymousClass00P.createAndThrow();
                }
            }
            return W1J.A02(w1j, z);
        }
        return obj;
    }
}

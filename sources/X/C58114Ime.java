package X;

import com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceState;

/* renamed from: X.Ime  reason: case insensitive filesystem */
public final class C58114Ime extends AnonymousClass1Ek implements 0sI {
    public Object A00;
    public Object A01;
    public boolean A02;
    public boolean A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58114Ime(int i, AnonymousClass4D7 r3) {
        super(5, r3);
        this.A04 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        C58114Ime ime;
        if (this.A04 != 0) {
            boolean A1a = AnonymousClass7TE.A1a(obj3);
            boolean A1a2 = AnonymousClass7TE.A1a(obj4);
            ime = new C58114Ime(1, (AnonymousClass4D7) obj5);
            ime.A00 = obj;
            ime.A01 = obj2;
            ime.A02 = A1a;
            ime.A03 = A1a2;
        } else {
            boolean A1a3 = AnonymousClass7TE.A1a(obj);
            boolean A1a4 = AnonymousClass7TE.A1a(obj2);
            ime = new C58114Ime(0, (AnonymousClass4D7) obj5);
            ime.A02 = A1a3;
            ime.A03 = A1a4;
            ime.A00 = obj3;
            ime.A01 = obj4;
        }
        return ime.invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z;
        if (this.A04 != 0) {
            0eS.A00(obj);
            return new C56122HtA((C74224PrD) this.A00, (MetaAiVoiceState) this.A01, this.A02, this.A03);
        }
        0eS.A00(obj);
        boolean z2 = this.A02;
        boolean z3 = this.A03;
        Object obj2 = this.A00;
        C61042Jvg jvg = (C61042Jvg) this.A01;
        if (jvg.A00 || jvg.A01 || (z2 && z3)) {
            z = false;
        } else {
            z = true;
        }
        return new C61082JwK(46, obj2, z);
    }
}

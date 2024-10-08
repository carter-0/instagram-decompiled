package X;

import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Pfz  reason: case insensitive filesystem */
public final class C73571Pfz extends AnonymousClass1Ek implements 0sI {
    public Object A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73571Pfz(int i, AnonymousClass4D7 r3) {
        super(5, r3);
        this.A04 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        int i2 = this.A04;
        boolean A1a = AnonymousClass7TE.A1a(obj);
        boolean A1a2 = AnonymousClass7TE.A1a(obj2);
        boolean A1a3 = AnonymousClass7TE.A1a(obj4);
        AnonymousClass4D7 r10 = (AnonymousClass4D7) obj5;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        C73571Pfz pfz = new C73571Pfz(i, r10);
        pfz.A01 = A1a;
        pfz.A02 = A1a2;
        pfz.A00 = obj3;
        pfz.A03 = A1a3;
        return pfz.invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        CameraAREffect A002;
        int i = this.A04;
        0eS.A00(obj);
        if (i != 0) {
            boolean z = this.A01;
            boolean z2 = this.A02;
            AnonymousClass87G r0 = (AnonymousClass87G) this.A00;
            boolean z3 = this.A03;
            boolean z4 = true;
            if (!z || z2 || r0 == null || (A002 = r0.A00()) == null || A002.A0Z.get("nativeUIControlPicker") == null || !z3) {
                z4 = false;
            }
            return Boolean.valueOf(z4);
        }
        return new C61060Jvy((ImageUrl) this.A00, this.A01, this.A02, this.A03);
    }
}

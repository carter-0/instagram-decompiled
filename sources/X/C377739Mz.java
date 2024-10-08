package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.9Mz  reason: invalid class name and case insensitive filesystem */
public final class C377739Mz extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object obj3 = obj;
        if (this.A00 != 0) {
            ((Number) obj2).intValue();
            String str = this.A07;
            C288175bU.A00((C286575Wy) obj3, (Modifier) this.A05, (AnonymousClass2DO) this.A06, (C288095bM) this.A04, str, C301445zH.A00(this.A01 | 1), this.A02, this.A03);
        } else {
            ((Number) obj2).intValue();
            String str2 = this.A07;
            C288165bT.A06((C286575Wy) obj3, (Modifier) this.A05, (AnonymousClass2DO) this.A06, (C288095bM) this.A04, str2, C301445zH.A00(this.A01 | 1), this.A02, this.A03);
        }
        return C60340gF.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377739Mz(Modifier modifier, AnonymousClass2DO r3, C288095bM r4, String str, int i, int i2, int i3, long j) {
        super(2);
        this.A00 = i3;
        this.A06 = r3;
        this.A07 = str;
        this.A05 = modifier;
        this.A03 = j;
        this.A04 = r4;
        this.A01 = i;
        this.A02 = i2;
    }
}

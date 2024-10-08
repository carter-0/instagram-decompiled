package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Iob  reason: case insensitive filesystem */
public final class C58233Iob extends 0Yg implements C62320sa {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C13997Tnz A03;
    public final /* synthetic */ 0fA A04;
    public final /* synthetic */ H7z A05;
    public final /* synthetic */ C2813957l A06;
    public final /* synthetic */ C242643Vh A07;
    public final /* synthetic */ C242643Vh A08;
    public final /* synthetic */ Iterable A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58233Iob(C13997Tnz tnz, 0fA r3, H7z h7z, C2813957l r5, C242643Vh r6, C242643Vh r7, Iterable iterable, int i, int i2, int i3) {
        super(0);
        this.A09 = iterable;
        this.A05 = h7z;
        this.A06 = r5;
        this.A03 = tnz;
        this.A04 = r3;
        this.A08 = r6;
        this.A02 = i;
        this.A01 = i2;
        this.A07 = r7;
        this.A00 = i3;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        Iterable iterable = this.A09;
        H7z h7z = this.A05;
        ArrayList<Object> A0p = AnonymousClass7TF.A0p(iterable);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            A0p.add(((0eP) h7z.A02.get(AnonymousClass7TG.A0F(it))).A01);
        }
        C2813957l r9 = this.A06;
        ArrayList A0p2 = AnonymousClass7TF.A0p(A0p);
        for (Object invoke : A0p) {
            A0p2.add(r9.A03.invoke(invoke, C51967G9n.A0k(), "DynamicAdsNodeInjector"));
        }
        List A0a = 00k.A0a(A0p2);
        C13997Tnz tnz = this.A03;
        0fA r7 = this.A04;
        C242643Vh r10 = this.A08;
        int i = this.A02;
        int i2 = this.A01;
        return new IP3(tnz, r7, h7z, r9, r10, this.A07, A0a, r9.A02, 0, AnonymousClass7TE.A0M(00k.A09(iterable)), i, i2, this.A00);
    }
}

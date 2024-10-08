package X;

import com.instagram.user.model.Product;

/* renamed from: X.UfQ  reason: case insensitive filesystem */
public final class C15598UfQ extends 1P0 {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032;
        int i;
        Object obj2 = obj;
        if (this.A00 != 0) {
            A032 = AnonymousClass0fD.A03(-1242675345);
            AnonymousClass1XT r4 = (AnonymousClass1XT) obj2;
            int A0D = AnonymousClass7TG.A0D(r4, -1892019503);
            ((C17867VhK) this.A04).A01.Dor(r4, (C18043VkR) this.A02, (Product) this.A03, this.A01, System.currentTimeMillis());
            AnonymousClass0fD.A0A(1780297630, A0D);
            i = -106672361;
        } else {
            A032 = AnonymousClass0fD.A03(-1589926703);
            AnonymousClass1XT r42 = (AnonymousClass1XT) obj2;
            int A0D2 = AnonymousClass7TG.A0D(r42, 1821917899);
            ((C17866VhJ) this.A04).A01.Dor(r42, (C18043VkR) this.A02, (Product) this.A03, this.A01, System.currentTimeMillis());
            AnonymousClass0fD.A0A(168952883, A0D2);
            i = 298787439;
        }
        AnonymousClass0fD.A0A(i, A032);
    }

    public C15598UfQ(int i, long j, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A04 = obj;
        this.A03 = obj3;
        this.A02 = obj2;
        this.A01 = j;
    }

    public final void onFail(C268654dm r10) {
        int A0D;
        int i;
        if (this.A00 != 0) {
            A0D = AnonymousClass7TG.A0D(r10, -1154421074);
            ((C17867VhK) this.A04).A01.DEL((C18043VkR) this.A02, (Product) this.A03, r10.A01(), this.A01, System.currentTimeMillis());
            i = -620595446;
        } else {
            A0D = AnonymousClass7TG.A0D(r10, 1479100464);
            ((C17866VhJ) this.A04).A01.DEL((C18043VkR) this.A02, (Product) this.A03, r10.A01(), this.A01, System.currentTimeMillis());
            i = -2022691489;
        }
        AnonymousClass0fD.A0A(i, A0D);
    }
}

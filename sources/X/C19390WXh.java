package X;

import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.WXh  reason: case insensitive filesystem */
public final class C19390WXh implements C20953X6g {
    public final /* synthetic */ UEQ A00;
    public final /* synthetic */ UAK A01;
    public final /* synthetic */ C17674Vc5 A02;

    public C19390WXh(UEQ ueq, UAK uak, C17674Vc5 vc5) {
        this.A01 = uak;
        this.A00 = ueq;
        this.A02 = vc5;
    }

    public final void D2V(Hashtag hashtag) {
        if (this.A00.getBindingAdapterPosition() != -1) {
            UAK uak = this.A01;
            AnonymousClass2p0 r2 = uak.A02;
            r2.getClass();
            C17674Vc5 vc5 = this.A02;
            int A002 = UAK.A00(uak, vc5);
            AnonymousClass3UH r0 = uak.A01;
            r0.getClass();
            int i = r0.A01;
            AnonymousClass3UH r02 = uak.A01;
            r02.getClass();
            String str = r02.A0C;
            AnonymousClass3UH r03 = uak.A01;
            r03.getClass();
            r2.DLF(vc5, str, "preview", r03.getId(), A002, i);
            uak.A0A.run();
        }
    }

    public final void D3G(Hashtag hashtag) {
        if (this.A00.getBindingAdapterPosition() != -1) {
            UAK uak = this.A01;
            AnonymousClass2p0 r4 = uak.A02;
            r4.getClass();
            C17674Vc5 vc5 = this.A02;
            int A002 = UAK.A00(uak, vc5);
            AnonymousClass3UH r0 = uak.A01;
            r0.getClass();
            r4.DLI(vc5, A002, r0.A01, uak.A00);
        }
    }
}

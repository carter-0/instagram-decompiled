package X;

import com.instagram.music.common.model.ARAudioEffectData;

/* renamed from: X.9SX  reason: invalid class name */
public final class AnonymousClass9SX extends 1P0 {
    public final /* synthetic */ C357998aC A00;

    public AnonymousClass9SX(C357998aC r1) {
        this.A00 = r1;
    }

    public final void onFail(C268654dm r6) {
        int A03 = AnonymousClass0fD.A03(1899106132);
        C357998aC r3 = this.A00;
        int i = r3.A00 + 1;
        r3.A00 = i;
        ARAudioEffectData aRAudioEffectData = r3.A01;
        if (aRAudioEffectData != null && i == 2) {
            C357998aC.A00(r3, aRAudioEffectData);
        }
        AnonymousClass0fD.A0A(-1891165353, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(509632955);
        C379119So r7 = (C379119So) obj;
        int A0D = AnonymousClass7TG.A0D(r7, 1602828552);
        C357998aC r3 = this.A00;
        ARAudioEffectData aRAudioEffectData = r3.A01;
        if (aRAudioEffectData != null) {
            aRAudioEffectData.A00 = r7.A00;
            int i = r3.A00 + 1;
            r3.A00 = i;
            if (i == 2) {
                C357998aC.A00(r3, aRAudioEffectData);
            }
        }
        AnonymousClass0fD.A0A(308718300, A0D);
        AnonymousClass0fD.A0A(126978853, A03);
    }
}

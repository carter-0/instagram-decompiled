package X;

import com.instagram.music.common.model.ARAudioEffectData;
import java.util.List;

/* renamed from: X.9SW  reason: invalid class name */
public final class AnonymousClass9SW extends 1P0 {
    public final /* synthetic */ C357998aC A00;

    public AnonymousClass9SW(C357998aC r1) {
        this.A00 = r1;
    }

    public final void onFail(C268654dm r6) {
        int A03 = AnonymousClass0fD.A03(387020680);
        C357998aC r3 = this.A00;
        int i = r3.A00 + 1;
        r3.A00 = i;
        ARAudioEffectData aRAudioEffectData = r3.A01;
        if (aRAudioEffectData != null && i == 2) {
            C357998aC.A00(r3, aRAudioEffectData);
        }
        AnonymousClass0fD.A0A(-1415035022, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        List list;
        int A03 = AnonymousClass0fD.A03(1981284413);
        C384569hX r7 = (C384569hX) obj;
        int A0D = AnonymousClass7TG.A0D(r7, 238995945);
        C357998aC r3 = this.A00;
        ARAudioEffectData aRAudioEffectData = r3.A01;
        if (aRAudioEffectData != null) {
            AnonymousClass9SE r0 = r7.A00;
            if (r0 != null) {
                list = r0.A00;
            } else {
                list = null;
            }
            aRAudioEffectData.A01 = list;
            int i = r3.A00 + 1;
            r3.A00 = i;
            if (i == 2) {
                C357998aC.A00(r3, aRAudioEffectData);
            }
        }
        AnonymousClass0fD.A0A(1159612646, A0D);
        AnonymousClass0fD.A0A(436851392, A03);
    }
}

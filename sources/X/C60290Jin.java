package X;

import com.instagram.creation.capture.quickcapture.sundial.sfx.repository.SfxAudioRepository;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore;
import java.util.List;
import java.util.Map;

/* renamed from: X.Jin  reason: case insensitive filesystem */
public final class C60290Jin extends 2YL {
    public final LR9 A00;
    public final SfxAudioRepository A01;
    public final ClipsAudioStore A02;
    public final 01W A03 = new 01W();
    public final C249513ju A04;
    public final AnonymousClass0r6 A05;
    public final AnonymousClass0r6 A06;
    public final 05G A07;
    public final 05G A08;
    public final L0X A09;
    public final AnonymousClass0r6 A0A;

    public C60290Jin(SfxAudioRepository sfxAudioRepository, ClipsAudioStore clipsAudioStore) {
        0qQ.A0B(clipsAudioStore, 2);
        this.A01 = sfxAudioRepository;
        this.A02 = clipsAudioStore;
        L0X l0x = new L0X(this);
        this.A09 = l0x;
        this.A00 = new LR9(l0x);
        02z A10 = DbS.A10(false);
        this.A08 = A10;
        02z A102 = DbS.A10(false);
        this.A07 = A102;
        1HR A0w = G9w.A0w();
        this.A04 = A0w;
        this.A05 = 0u9.A04(A0w);
        DbY.A19(this, MGV.A01(this, (AnonymousClass4D7) null, 38), 10b.A03(sfxAudioRepository.A06));
        DbY.A19(this, new MG0(this, (AnonymousClass4D7) null, 25), 10b.A03(sfxAudioRepository.A05));
        C61820pm A032 = AnonymousClass10H.A03(new JTX(0, (AnonymousClass4D7) null), A10, A102);
        this.A0A = A032;
        SfxAudioRepository sfxAudioRepository2 = this.A01;
        0pt A002 = AnonymousClass10H.A00(new C73570Pfy(0, (AnonymousClass4D7) null), A032, 10b.A03(sfxAudioRepository2.A05), 10b.A03(sfxAudioRepository2.A06));
        this.A06 = 10b.A02(C61004Jv1.A04, C318116oQ.A00(this), A002, AnonymousClass10A.A01);
    }

    public final void A02(C61079JwH jwH, int i) {
        0qQ.A0B(jwH, 0);
        LR9 lr9 = this.A00;
        String str = ((C381809cM) jwH.A00).A04;
        0qQ.A0B(str, 0);
        Map map = lr9.A04;
        Number A14 = C51966G9m.A14(str, map);
        if (A14 == null) {
            A14 = Integer.valueOf(LR9.A00(lr9).load(str, 1));
            map.put(str, A14);
        }
        L6L l6l = lr9.A03;
        int intValue = A14.intValue();
        Integer valueOf = Integer.valueOf(i);
        l6l.A02.put(valueOf, Integer.valueOf(intValue));
        this.A03.addLast(AnonymousClass7TE.A1L(valueOf, jwH));
        A00(this, C61803KMr.A00);
    }

    public final void A01() {
        List<C61079JwH> list;
        JV7 jv7 = (JV7) this.A01.A06.getValue();
        if (jv7 != null && (list = (List) jv7.A00) != null) {
            for (C61079JwH jwH : list) {
                LR9 lr9 = this.A00;
                String str = ((C381809cM) jwH.A00).A04;
                0qQ.A0B(str, 0);
                lr9.A04.put(str, Integer.valueOf(LR9.A00(lr9).load(str, 1)));
            }
        }
    }

    public final void onCleared() {
        LR9 lr9 = this.A00;
        lr9.A01();
        lr9.A03.A02.clear();
        this.A03.clear();
    }

    public static final void A00(C60290Jin jin, C62764Km2 km2) {
        MHN.A03(km2, jin, C318116oQ.A00(jin), 0);
    }
}

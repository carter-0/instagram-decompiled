package X;

import android.media.AudioAttributes;
import android.media.SoundPool;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class LR9 {
    public float A00;
    public L0X A01;
    public SoundPool A02;
    public final L6L A03;
    public final Map A04;
    public final Set A05;

    public static final SoundPool A00(LR9 lr9) {
        SoundPool soundPool = lr9.A02;
        if (soundPool == null) {
            soundPool = new SoundPool.Builder().setMaxStreams(8).setAudioAttributes(new AudioAttributes.Builder().setContentType(2).setUsage(1).build()).build();
        }
        lr9.A02 = soundPool;
        if (soundPool != null) {
            return soundPool;
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final void A01() {
        this.A05.clear();
        Map map = this.A04;
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            int A0M = AnonymousClass7TE.A0M(C51971G9r.A0p(A0u));
            SoundPool soundPool = this.A02;
            if (soundPool != null) {
                soundPool.unload(A0M);
            }
        }
        map.clear();
        SoundPool soundPool2 = this.A02;
        if (soundPool2 != null) {
            soundPool2.release();
        }
        this.A02 = null;
    }

    public LR9(L0X l0x) {
        this.A01 = l0x;
        this.A04 = AnonymousClass7TE.A1H();
        this.A03 = new L6L(this);
        this.A05 = DbS.A0y();
        this.A00 = 1.0f;
    }

    public LR9() {
        this((L0X) null);
    }
}

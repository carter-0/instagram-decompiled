package X;

import com.instagram.direct.armadilloexpress.transportpayload.Voice;
import java.util.Arrays;

/* renamed from: X.NFn  reason: case insensitive filesystem */
public final class C68406NFn extends R4O implements C13662TeT {
    public C68406NFn() {
        super(Voice.DEFAULT_INSTANCE);
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [X.R2z, X.TRv, X.TmR] */
    public final void A06(float f) {
        Voice voice = (Voice) C66580MXl.A0L(this);
        int i = Voice.DURATION_FIELD_NUMBER;
        C13964TmR tmR = voice.waveforms_;
        boolean z = ((C13255TRv) tmR).A00;
        C13964TmR tmR2 = tmR;
        if (!z) {
            int size = tmR.size();
            int i2 = size * 2;
            if (size == 0) {
                i2 = 10;
            }
            R2z r2z = (R2z) tmR;
            if (i2 >= r2z.A00) {
                float[] copyOf = Arrays.copyOf(r2z.A01, i2);
                int i3 = r2z.A00;
                ? tRv = new C13255TRv();
                tRv.A01 = copyOf;
                tRv.A00 = i3;
                voice.waveforms_ = tRv;
                tmR2 = tRv;
            } else {
                throw new IllegalArgumentException();
            }
        }
        tmR2.A8W(f);
    }
}

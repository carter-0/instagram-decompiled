package X;

import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: X.SrJ  reason: case insensitive filesystem */
public final class C12316SrJ implements C13950TmB {
    public static final int A05 = ((int) Math.pow(2.0d, 15.0d));
    public static final int A06 = ((int) Math.pow(2.0d, 16.0d));
    public int A00;
    public ByteBuffer A01;
    public List[] A02 = new List[0];
    public boolean[] A03 = new boolean[0];
    public final List A04 = AnonymousClass7TE.A1C();

    public final ByteBuffer[] applyEffects(ByteBuffer[] byteBufferArr, long j) {
        int length = byteBufferArr.length;
        ByteBuffer[] byteBufferArr2 = new ByteBuffer[length];
        for (int i = 0; i < length; i++) {
            boolean z = this.A03[i];
            ByteBuffer byteBuffer = byteBufferArr[i];
            if (z) {
                byteBuffer = C9599Rdd.A00(C9599Rdd.A00(byteBuffer, this.A02[i]), this.A04);
            }
            byteBufferArr2[i] = byteBuffer;
        }
        return byteBufferArr2;
    }

    public final void warmup(ByteBuffer[] byteBufferArr, long j) {
    }

    public final void configure(C10568RuN ruN) {
        int i = ruN.A00;
        this.A03 = new boolean[i];
        List[] listArr = new List[i];
        this.A02 = listArr;
        for (int i2 = 0; i2 < i; i2++) {
            listArr[i2] = AnonymousClass7TE.A1C();
        }
        this.A00 = ruN.A02.A00 * 1024 * 2;
    }

    public final void disableTrack(int i) {
        this.A03[i] = false;
    }

    public final void enableTrack(int i) {
        this.A03[i] = true;
    }

    public final /* synthetic */ int getWarmupDurationInSec() {
        return 0;
    }

    public final boolean isEffectSupported(MediaEffect mediaEffect) {
        return C51970G9q.A1U(mediaEffect instanceof C12333Srf ? 1 : 0);
    }

    public final ByteBuffer process(ByteBuffer[] byteBufferArr, long j) {
        int i;
        ByteBuffer byteBuffer = this.A01;
        if (byteBuffer == null) {
            byteBuffer = Pxg.A13(this.A00);
            this.A01 = byteBuffer;
        }
        byteBuffer.clear();
        ByteBuffer[] applyEffects = applyEffects(byteBufferArr, j);
        for (int i2 = 0; i2 < this.A00; i2 += 2) {
            short s = 0;
            for (int i3 = 0; i3 < applyEffects.length; i3++) {
                if (this.A03[i3]) {
                    short s2 = applyEffects[i3].getShort(i2);
                    int i4 = A05;
                    int i5 = s + i4;
                    int i6 = s2 + i4;
                    if (i5 >= i4 || i6 >= i4) {
                        i = (((i5 + i6) * 2) - ((i5 * i6) / i4)) - A06;
                    } else {
                        i = (i5 * i6) / i4;
                    }
                    int i7 = A06;
                    if (i == i7) {
                        i = i7 - 1;
                    }
                    s = (short) (i - i4);
                }
            }
            this.A01.putShort(s);
        }
        this.A01.flip();
        return this.A01;
    }

    public final void addEffect(Integer num, MediaEffect mediaEffect) {
        int intValue = num.intValue();
        if (intValue < 0 || !(mediaEffect instanceof C12333Srf)) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Track Index: ");
            A1A.append(num);
            throw AnonymousClass7TE.A1B(AnonymousClass7TG.A0m(mediaEffect, ", MediaEffect: ", A1A));
        }
        this.A02[intValue].add(mediaEffect);
    }

    public final void removeEffect(Integer num, MediaEffect mediaEffect) {
        int intValue = num.intValue();
        if (intValue < 0 || !(mediaEffect instanceof C12333Srf)) {
            throw C66580MXl.A11();
        }
        this.A02[intValue].remove(mediaEffect);
    }

    public final void addEffect(MediaEffect mediaEffect) {
        if (!(mediaEffect instanceof C12333Srf)) {
            throw AnonymousClass7TE.A1B(AnonymousClass7TG.A0m(mediaEffect, "MediaEffect: ", AnonymousClass7TE.A1A()));
        }
        this.A04.add(mediaEffect);
    }

    public final void removeEffect(MediaEffect mediaEffect) {
        if (!(mediaEffect instanceof C12333Srf)) {
            throw C66580MXl.A11();
        }
        this.A04.remove(mediaEffect);
    }
}

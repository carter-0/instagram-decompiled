package X;

import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.SrD  reason: case insensitive filesystem */
public final class C12310SrD implements C13852TiV {
    public ByteBuffer A00;
    public final C13852TiV A01;
    public final List A02;

    public static Iterator A00(C12310SrD srD, Object obj) {
        0qQ.A0B(obj, 0);
        return srD.A02.iterator();
    }

    public final ByteBuffer process(ByteBuffer[] byteBufferArr, long j) {
        0qQ.A0B(byteBufferArr, 0);
        ByteBuffer byteBuffer = this.A00;
        if (byteBuffer != null) {
            byteBuffer.clear();
            for (C13950TmB applyEffects : this.A02) {
                byteBufferArr = applyEffects.applyEffects(byteBufferArr, j);
            }
            ByteBuffer process = this.A01.process(byteBufferArr, j);
            this.A00 = process;
            0qQ.A0C(process, "null cannot be cast to non-null type java.nio.ByteBuffer");
            return process;
        }
        throw AnonymousClass7TE.A0z("This method should not be called without having called configure()");
    }

    public final void disableTrack(int i) {
        for (C13852TiV disableTrack : this.A02) {
            disableTrack.disableTrack(i);
        }
        this.A01.disableTrack(i);
    }

    public final void enableTrack(int i) {
        for (C13852TiV enableTrack : this.A02) {
            enableTrack.enableTrack(i);
        }
        this.A01.enableTrack(i);
    }

    public final int getWarmupDurationInSec() {
        Object next;
        Iterator it = this.A02.iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                int warmupDurationInSec = ((C13852TiV) next).getWarmupDurationInSec();
                do {
                    Object next2 = it.next();
                    int warmupDurationInSec2 = ((C13852TiV) next2).getWarmupDurationInSec();
                    if (warmupDurationInSec < warmupDurationInSec2) {
                        next = next2;
                        warmupDurationInSec = warmupDurationInSec2;
                    }
                } while (it.hasNext());
            }
        }
        C13852TiV tiV = (C13852TiV) next;
        if (tiV != null) {
            return tiV.getWarmupDurationInSec();
        }
        return 0;
    }

    public C12310SrD(C13852TiV tiV, List list) {
        this.A02 = list;
        this.A01 = tiV;
    }

    public final /* bridge */ /* synthetic */ void addEffect(Integer num, MediaEffect mediaEffect) {
        int intValue = num.intValue();
        0qQ.A0B(mediaEffect, 1);
        for (C13852TiV tiV : this.A02) {
            if (tiV.isEffectSupported(mediaEffect)) {
                tiV.addEffect(Integer.valueOf(intValue), mediaEffect);
            }
        }
        C13852TiV tiV2 = this.A01;
        if (tiV2.isEffectSupported(mediaEffect)) {
            tiV2.addEffect(Integer.valueOf(intValue), mediaEffect);
        }
    }

    public final void configure(C10568RuN ruN) {
        Iterator A002 = A00(this, ruN);
        while (A002.hasNext()) {
            ((C13852TiV) A002.next()).configure(ruN);
        }
        this.A01.configure(ruN);
        int i = ruN.A02.A00 * 1024 * 2;
        if (this.A00 == null) {
            this.A00 = Pxg.A13(i);
        }
    }

    public final boolean isEffectSupported(MediaEffect mediaEffect) {
        boolean z;
        Iterator A002 = A00(this, mediaEffect);
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!A002.hasNext()) {
                    break loop0;
                }
                C13852TiV tiV = (C13852TiV) A002.next();
                if (z || tiV.isEffectSupported(mediaEffect)) {
                    z = true;
                }
            }
        }
        if (z || this.A01.isEffectSupported(mediaEffect)) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ void removeEffect(Integer num, MediaEffect mediaEffect) {
        int intValue = num.intValue();
        0qQ.A0B(mediaEffect, 1);
        for (C13852TiV tiV : this.A02) {
            if (tiV.isEffectSupported(mediaEffect)) {
                tiV.removeEffect(Integer.valueOf(intValue), mediaEffect);
            }
        }
        C13852TiV tiV2 = this.A01;
        if (tiV2.isEffectSupported(mediaEffect)) {
            tiV2.removeEffect(Integer.valueOf(intValue), mediaEffect);
        }
    }

    public final void warmup(ByteBuffer[] byteBufferArr, long j) {
        Iterator A002 = A00(this, byteBufferArr);
        while (A002.hasNext()) {
            ((C13852TiV) A002.next()).warmup(byteBufferArr, j);
        }
        this.A01.warmup(byteBufferArr, j);
    }

    public final void addEffect(MediaEffect mediaEffect) {
        Iterator A002 = A00(this, mediaEffect);
        while (A002.hasNext()) {
            C13852TiV tiV = (C13852TiV) A002.next();
            if (tiV.isEffectSupported(mediaEffect)) {
                tiV.addEffect(mediaEffect);
            }
        }
        C13852TiV tiV2 = this.A01;
        if (tiV2.isEffectSupported(mediaEffect)) {
            tiV2.addEffect(mediaEffect);
        }
    }

    public final void removeEffect(MediaEffect mediaEffect) {
        Iterator A002 = A00(this, mediaEffect);
        while (A002.hasNext()) {
            C13852TiV tiV = (C13852TiV) A002.next();
            if (tiV.isEffectSupported(mediaEffect)) {
                tiV.removeEffect(mediaEffect);
            }
        }
        C13852TiV tiV2 = this.A01;
        if (tiV2.isEffectSupported(mediaEffect)) {
            tiV2.removeEffect(mediaEffect);
        }
    }
}

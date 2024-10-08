package X;

import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.SrC  reason: case insensitive filesystem */
public final class C12309SrC implements C13852TiV {
    public int A00 = -1;
    public int A01 = -1;
    public C13706TfQ A02;
    public C10730Rx9 A03;
    public SEV A04;
    public ByteBuffer A05;
    public boolean A06 = false;
    public final HashMap A07 = AnonymousClass7TE.A1E();
    public final HashMap A08 = AnonymousClass7TE.A1E();
    public final HashMap A09 = AnonymousClass7TE.A1E();
    public final HashMap A0A = AnonymousClass7TE.A1E();
    public final List A0B = AnonymousClass7TE.A1C();
    public final List A0C = AnonymousClass7TE.A1C();
    public final HashSet A0D = AnonymousClass7TE.A1F();

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.nio.ByteBuffer process(java.nio.ByteBuffer[] r13, long r14) {
        /*
            r12 = this;
            r2 = 1
            r3 = 0
            r7 = 0
            r11 = 1
        L_0x0004:
            int r0 = r13.length
            if (r7 >= r0) goto L_0x00a7
            java.util.HashSet r1 = r12.A0D
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0074
            java.util.HashMap r10 = r12.A08
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            boolean r0 = r10.containsKey(r0)
            if (r0 == 0) goto L_0x0074
            java.lang.Object r0 = X.C51968G9o.A0z(r10, r7)
            if (r0 == 0) goto L_0x0074
            r0 = r13[r7]
            if (r0 == 0) goto L_0x0074
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            java.lang.Object r0 = r10.get(r9)
            long r0 = X.AnonymousClass7TE.A0R(r0)
            java.util.HashMap r4 = r12.A0A
            java.util.List r4 = X.Pxe.A1B(r9, r4)
            float r8 = X.S9U.A00(r4)
            java.util.List r4 = r12.A0C
            float r4 = X.S9U.A00(r4)
            float r8 = r8 * r4
            java.util.HashMap r5 = r12.A09
            java.lang.Object r4 = r5.get(r9)
            java.lang.Number r4 = (java.lang.Number) r4
            if (r4 == 0) goto L_0x008f
            float r4 = r4.floatValue()
            boolean r4 = X.RV5.A00(r4, r8)
            if (r4 == 0) goto L_0x008f
        L_0x005a:
            java.lang.Object r0 = r10.get(r9)
            long r0 = X.AnonymousClass7TE.A0R(r0)
            r9 = r13[r7]
            X.Rx9 r8 = r12.A03
            int r6 = r9.remaining()
            boolean r4 = r8.A04
            if (r4 != 0) goto L_0x0077
            r0 = 1003(0x3eb, float:1.406E-42)
        L_0x0070:
            r12.A01 = r0
            r0 = 0
        L_0x0073:
            r11 = r11 & r0
        L_0x0074:
            int r7 = r7 + 1
            goto L_0x0004
        L_0x0077:
            int r5 = r8.A01
            r4 = 3
            if (r5 == r4) goto L_0x007f
            r0 = 1002(0x3ea, float:1.404E-42)
            goto L_0x0070
        L_0x007f:
            com.facebook.cameracore.audio.fbaaudiopostprocessing.AudioPostProcessor r4 = r8.A03
            int r1 = r4.pushToQueue(r0, r9, r6)
            if (r1 == 0) goto L_0x008d
            r0 = 4
            if (r1 == r0) goto L_0x008d
            r0 = 1004(0x3ec, float:1.407E-42)
            goto L_0x0070
        L_0x008d:
            r0 = 1
            goto L_0x0073
        L_0x008f:
            java.lang.Float r4 = java.lang.Float.valueOf(r8)
            r5.put(r9, r4)
            X.Rx9 r6 = r12.A03
            boolean r4 = r6.A04
            if (r4 == 0) goto L_0x005a
            int r5 = r6.A01
            r4 = 3
            if (r5 != r4) goto L_0x005a
            com.facebook.cameracore.audio.fbaaudiopostprocessing.AudioPostProcessor r4 = r6.A03
            r4.setSourceGain(r0, r8)
            goto L_0x005a
        L_0x00a7:
            X.Rx9 r1 = r12.A03
            boolean r0 = r1.A04
            if (r0 != 0) goto L_0x00d1
            r0 = 1003(0x3eb, float:1.406E-42)
        L_0x00af:
            r12.A00 = r0
            r0 = 0
        L_0x00b2:
            r0 = r0 & r11
            if (r0 == 0) goto L_0x00e5
            java.nio.ByteBuffer r1 = r12.A05
            if (r1 == 0) goto L_0x00e5
            boolean r0 = r12.A06
            if (r0 != 0) goto L_0x00e0
            r1.clear()
            java.nio.ByteBuffer r1 = r12.A05
            int r0 = r1.capacity()
            r1.position(r3)
        L_0x00c9:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x00db
            r1.put(r3)
            goto L_0x00c9
        L_0x00d1:
            com.facebook.cameracore.audio.fbaaudiopostprocessing.AudioPostProcessor r0 = r1.A03
            int r0 = r0.processNext()
            if (r0 != 0) goto L_0x00af
            r0 = 1
            goto L_0x00b2
        L_0x00db:
            java.nio.ByteBuffer r0 = r12.A05
            r0.flip()
        L_0x00e0:
            r12.A06 = r3
            java.nio.ByteBuffer r0 = r12.A05
            return r0
        L_0x00e5:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "FBA encountered an error while processing audio. lastProcessResult "
            r1.append(r0)
            int r0 = r12.A00
            r1.append(r0)
            java.lang.String r0 = " lastPushToQueueResult "
            r1.append(r0)
            int r0 = r12.A01
            r1.append(r0)
            java.lang.String r0 = " isOutputBufferNull "
            r1.append(r0)
            java.nio.ByteBuffer r0 = r12.A05
            if (r0 == 0) goto L_0x0107
            r2 = 0
        L_0x0107:
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12309SrC.process(java.nio.ByteBuffer[], long):java.nio.ByteBuffer");
    }

    public final void warmup(ByteBuffer[] byteBufferArr, long j) {
    }

    public final void configure(C10568RuN ruN) {
        this.A04 = ruN.A01;
        SEV sev = ruN.A02;
        int i = sev.A00;
        boolean z = true;
        if (!(i == 2 || i == 1)) {
            z = false;
        }
        C266784aL.A06(z, "FBA only supports mono or stereo audio output");
        int i2 = i * 1024 * 2;
        this.A03 = new C10730Rx9((float) sev.A01, 3, i2, i);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i2);
        this.A05 = allocateDirect;
        this.A02 = new C12059Slm(this, allocateDirect);
        int i3 = ruN.A00;
        float[] fArr = new float[i3];
        long[] jArr = new long[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            HashMap hashMap = this.A07;
            Integer valueOf = Integer.valueOf(i4);
            hashMap.put(valueOf, AnonymousClass7TE.A1E());
            this.A0A.put(valueOf, AnonymousClass7TE.A1C());
            fArr[i4] = 1.0f;
        }
        boolean z2 = false;
        int i5 = this.A04.A00;
        C10730Rx9 rx9 = this.A03;
        C13706TfQ tfQ = this.A02;
        if (rx9.A01 == 3) {
            rx9.A00 = tfQ;
            int createPushPCMMixingGraph = rx9.A03.createPushPCMMixingGraph(i3, 3, i5, fArr, new C12058Sll(rx9), jArr);
            if (createPushPCMMixingGraph == 0 || createPushPCMMixingGraph == 4) {
                z2 = true;
                rx9.A04 = true;
            } else {
                rx9.A04 = false;
            }
        }
        for (int i6 = 0; i6 < i3; i6++) {
            Pxe.A1X(Integer.valueOf(i6), this.A08, jArr[i6]);
        }
        if (!z2) {
            throw AnonymousClass7TE.A0w("One or more FBA arguments were invalid.");
        }
    }

    public final void disableTrack(int i) {
        HashSet hashSet = this.A0D;
        Integer valueOf = Integer.valueOf(i);
        if (hashSet.contains(valueOf)) {
            Object obj = this.A08.get(valueOf);
            obj.getClass();
            C10730Rx9 rx9 = this.A03;
            long longValue = ((Number) obj).longValue();
            if (rx9.A04 && rx9.A01 == 3) {
                rx9.A03.disconnectSource(longValue);
            }
            hashSet.remove(valueOf);
        }
    }

    public final void enableTrack(int i) {
        long createQueueSource;
        HashSet hashSet = this.A0D;
        Integer valueOf = Integer.valueOf(i);
        if (!hashSet.contains(valueOf)) {
            HashMap hashMap = this.A08;
            if (!hashMap.containsKey(valueOf)) {
                C10730Rx9 rx9 = this.A03;
                String A0O = 002.A0O("Queue", i);
                int i2 = this.A04.A00;
                if (!rx9.A04) {
                    createQueueSource = 1003;
                } else if (rx9.A01 != 3) {
                    createQueueSource = 1002;
                } else {
                    createQueueSource = rx9.A03.createQueueSource(A0O, 3, i2);
                }
                Pxe.A1X(valueOf, hashMap, createQueueSource);
                for (MediaEffect addEffect : this.A0B) {
                    addEffect(valueOf, addEffect);
                }
                this.A07.put(valueOf, AnonymousClass7TE.A1E());
                this.A0A.put(valueOf, AnonymousClass7TE.A1C());
            }
            Object obj = hashMap.get(valueOf);
            obj.getClass();
            C10730Rx9 rx92 = this.A03;
            long longValue = ((Number) obj).longValue();
            if (rx92.A04 && rx92.A01 == 3) {
                rx92.A03.connectSource(longValue);
            }
            hashSet.add(valueOf);
        }
    }

    public final /* synthetic */ int getWarmupDurationInSec() {
        return 0;
    }

    public final boolean isEffectSupported(MediaEffect mediaEffect) {
        if ((mediaEffect instanceof C12331Srd) || (mediaEffect instanceof C12333Srf)) {
            return true;
        }
        return false;
    }

    public final void addEffect(Integer num, MediaEffect mediaEffect) {
        long loadEffect;
        if (num.intValue() == -1) {
            return;
        }
        if (mediaEffect instanceof C12331Srd) {
            String str = ((C12331Srd) mediaEffect).A00;
            C10730Rx9 rx9 = this.A03;
            if (!rx9.A04) {
                loadEffect = 1003;
            } else if (rx9.A01 != 3) {
                loadEffect = 1002;
            } else {
                loadEffect = rx9.A03.loadEffect(str);
            }
            Pxe.A1X(str, (AbstractMap) this.A07.get(num), loadEffect);
            Object obj = this.A08.get(num);
            obj.getClass();
            C10730Rx9 rx92 = this.A03;
            long longValue = ((Number) obj).longValue();
            if (rx92.A04 && rx92.A01 == 3) {
                rx92.A03.addEffect(longValue, loadEffect);
            }
        } else if (mediaEffect instanceof C12333Srf) {
            Pxe.A1B(num, this.A0A).add(mediaEffect);
        }
    }

    public final void removeEffect(Integer num, MediaEffect mediaEffect) {
        int intValue = num.intValue();
        if (intValue != -1 && (mediaEffect instanceof C12331Srd)) {
            String str = ((C12331Srd) mediaEffect).A00;
            str.getClass();
            Object obj = this.A08.get(num);
            obj.getClass();
            HashMap hashMap = this.A07;
            Object obj2 = hashMap.get(num);
            obj2.getClass();
            Object obj3 = ((AbstractMap) obj2).get(str);
            obj3.getClass();
            C10730Rx9 rx9 = this.A03;
            long longValue = ((Number) obj).longValue();
            long longValue2 = ((Number) obj3).longValue();
            if (rx9.A04 && rx9.A01 == 3) {
                rx9.A03.removeEffect(longValue, longValue2);
            }
            ((AbstractMap) hashMap.get(num)).remove(str);
        } else if (mediaEffect instanceof C12333Srf) {
            HashMap hashMap2 = this.A0A;
            if (intValue == -1) {
                Iterator A0s = AnonymousClass7TF.A0s(hashMap2);
                while (A0s.hasNext()) {
                    ((List) C51971G9r.A0p(A0s)).remove(mediaEffect);
                }
                return;
            }
            Pxe.A1B(num, hashMap2).remove(mediaEffect);
        }
    }

    public final void addEffect(MediaEffect mediaEffect) {
        if (mediaEffect instanceof C12333Srf) {
            this.A0C.add(mediaEffect);
        } else if (mediaEffect instanceof C12331Srd) {
            this.A0B.add(mediaEffect);
            Iterator A0u = Pxf.A0u(this.A08);
            while (A0u.hasNext()) {
                addEffect((Integer) A0u.next(), mediaEffect);
            }
        }
    }

    public final void removeEffect(MediaEffect mediaEffect) {
        if (mediaEffect instanceof C12333Srf) {
            this.A0C.remove(mediaEffect);
        } else if (mediaEffect instanceof C12331Srd) {
            this.A0B.remove(mediaEffect);
            Iterator A0u = Pxf.A0u(this.A08);
            while (A0u.hasNext()) {
                removeEffect((Integer) A0u.next(), mediaEffect);
            }
        }
    }
}

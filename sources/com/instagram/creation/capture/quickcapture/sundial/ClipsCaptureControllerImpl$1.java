package com.instagram.creation.capture.quickcapture.sundial;

import X.0sK;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.C353498Hw;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.sundial.ClipsCaptureControllerImpl$1", f = "ClipsCaptureControllerImpl.kt", i = {0, 0}, l = {759}, m = "invokeSuspend", n = {"cutoutStickerMap", "cutoutStickerAudio"}, s = {"L$0", "L$1"})
public final class ClipsCaptureControllerImpl$1 extends AnonymousClass1Ek implements 0sK {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public /* synthetic */ Object A04;
    public /* synthetic */ Object A05;
    public final /* synthetic */ C353498Hw A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClipsCaptureControllerImpl$1(C353498Hw r2, AnonymousClass4D7 r3) {
        super(3, r3);
        this.A06 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        ClipsCaptureControllerImpl$1 clipsCaptureControllerImpl$1 = new ClipsCaptureControllerImpl$1(this.A06, (AnonymousClass4D7) obj3);
        clipsCaptureControllerImpl$1.A04 = obj;
        clipsCaptureControllerImpl$1.A05 = obj2;
        return clipsCaptureControllerImpl$1.invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r20v0, types: [X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
        r1 = r13.A00 - r13.A01;
        r15 = r7.A1n;
        r16 = X.C390749rm.A02;
        r14 = new java.io.File(r4);
        r4 = (int) r2;
        r2 = r13.A01;
        r19 = r7.Ao9();
        r12.A04 = r0;
        r12.A05 = r6;
        r12.A01 = r7;
        r12.A02 = r8;
        r12.A03 = r6;
        r12.A00 = 1;
        r17 = r14;
        r1 = r15.A0J(r16, r17, r5, r19, r12, r4, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009b, code lost:
        if (r1 != r11) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009d, code lost:
        return r11;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d1 A[LOOP:1: B:32:0x00cb->B:34:0x00d1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            r24 = this;
            r1 = r25
            X.1Hj r11 = X.1Hj.A02
            r12 = r24
            int r0 = r12.A00
            r10 = 1
            if (r0 == 0) goto L_0x009e
            java.lang.Object r9 = r12.A03
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r8 = r12.A02
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r7 = r12.A01
            X.8Hw r7 = (X.C353498Hw) r7
            java.lang.Object r6 = r12.A05
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r0 = r12.A04
            java.util.Map r0 = (java.util.Map) r0
            X.0eS.A00(r1)
        L_0x0022:
            java.util.Collection r1 = (java.util.Collection) r1
            r9.addAll(r1)
        L_0x0027:
            r9 = r6
        L_0x0028:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x00bc
            java.lang.Object r13 = r8.next()
            X.5MI r13 = (X.AnonymousClass5MI) r13
            boolean r1 = r13 instanceof X.AnonymousClass5MH
            if (r1 == 0) goto L_0x0028
            X.5MH r13 = (X.AnonymousClass5MH) r13
            if (r13 == 0) goto L_0x0028
            java.lang.String r5 = X.LRr.A00(r13)
            if (r5 == 0) goto L_0x0028
            java.lang.Object r1 = r0.get(r5)
            X.9Iu r1 = (X.C376649Iu) r1
            if (r1 == 0) goto L_0x0028
            java.lang.String r4 = r1.A01
            if (r4 == 0) goto L_0x0028
            java.lang.Object r1 = r0.get(r5)
            X.9Iu r1 = (X.C376649Iu) r1
            if (r1 == 0) goto L_0x0028
            java.lang.Object r1 = r1.A00
            X.6nz r1 = (X.C317876nz) r1
            if (r1 == 0) goto L_0x0028
            java.lang.Long r1 = r1.A0G
            if (r1 == 0) goto L_0x0028
            long r2 = r1.longValue()
            r14 = 0
            int r1 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r1 == 0) goto L_0x0028
            int r1 = r13.A00
            int r14 = r13.A01
            int r1 = r1 - r14
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r15 = r7.A1n
            X.9rm r16 = X.C390749rm.CUTOUT_STICKER_AUDIO
            java.io.File r14 = new java.io.File
            r14.<init>(r4)
            int r4 = (int) r2
            int r2 = r13.A01
            java.lang.String r19 = r7.Ao9()
            r12.A04 = r0
            r12.A05 = r6
            r12.A01 = r7
            r12.A02 = r8
            r12.A03 = r6
            r12.A00 = r10
            r20 = r12
            r21 = r4
            r22 = r2
            r23 = r1
            r18 = r5
            r17 = r14
            java.lang.Object r1 = r15.A0J(r16, r17, r18, r19, r20, r21, r22, r23)
            if (r1 != r11) goto L_0x0022
            return r11
        L_0x009e:
            X.0eS.A00(r1)
            java.lang.Object r0 = r12.A04
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r2 = r12.A05
            java.util.List r2 = (java.util.List) r2
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x00f0
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            X.8Hw r7 = r12.A06
            java.util.Iterator r8 = r2.iterator()
            goto L_0x0027
        L_0x00bc:
            X.8Hw r0 = r12.A06
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r0.A1n
            X.9rm r7 = X.C390749rm.CUTOUT_STICKER_AUDIO
            X.0qQ.A0B(r6, r10)
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r3 = r0.A0K
            java.util.Iterator r2 = r6.iterator()
        L_0x00cb:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00f3
            java.lang.Object r1 = r2.next()
            X.9cC r1 = (X.C381709cC) r1
            X.0Ud r0 = r3.A0i
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            r1.A00 = r0
            goto L_0x00cb
        L_0x00e6:
            java.util.ArrayList r0 = X.00k.A0S(r6, r3)
            boolean r0 = r5.AIY(r4, r0)
            if (r0 == 0) goto L_0x00f5
        L_0x00f0:
            X.0gF r11 = X.C60340gF.A00
            return r11
        L_0x00f3:
            X.05G r5 = r3.A0P
        L_0x00f5:
            java.lang.Object r4 = r5.getValue()
            r0 = r4
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L_0x0105:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00e6
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.9cC r0 = (X.C381709cC) r0
            X.9rm r0 = r0.A03
            if (r0 == r7) goto L_0x0105
            r3.add(r1)
            goto L_0x0105
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.ClipsCaptureControllerImpl$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

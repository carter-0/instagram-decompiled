package com.instagram.compose.perf.scroll;

import X.0eS;
import X.0rl;
import X.0sL;
import X.AnonymousClass05K;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass6Gj;
import X.C52516GVt;
import X.C59716JUz;
import X.C60340gF;
import X.MVZ;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.compose.perf.scroll.DropFrameWatcherKt$DropFrameWatcher$5$1$2", f = "DropFrameWatcher.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DropFrameWatcherKt$DropFrameWatcher$5$1$2 extends AnonymousClass1Ek implements 0sL {
    public /* synthetic */ long A00;
    public final /* synthetic */ MVZ A01;
    public final /* synthetic */ C52516GVt A02;
    public final /* synthetic */ 0rl A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DropFrameWatcherKt$DropFrameWatcher$5$1$2(MVZ mvz, C52516GVt gVt, AnonymousClass4D7 r4, 0rl r5) {
        super(2, r4);
        this.A03 = r5;
        this.A01 = mvz;
        this.A02 = gVt;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.4D7, com.instagram.compose.perf.scroll.DropFrameWatcherKt$DropFrameWatcher$5$1$2] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r6) {
        ? dropFrameWatcherKt$DropFrameWatcher$5$1$2 = new DropFrameWatcherKt$DropFrameWatcher$5$1$2(this.A01, this.A02, r6, this.A03);
        dropFrameWatcherKt$DropFrameWatcher$5$1$2.A00 = ((C59716JUz) obj).A00;
        return dropFrameWatcherKt$DropFrameWatcher$5$1$2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((DropFrameWatcherKt$DropFrameWatcher$5$1$2) create(new C59716JUz(((C59716JUz) obj).A00), (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Integer num;
        0eS.A00(obj);
        long j = this.A00;
        0rl r8 = this.A03;
        long j2 = r8.A00;
        AnonymousClass6Gj BYs = this.A01.BYs();
        int i = (int) (j2 & 4294967295L);
        int i2 = (int) (j & 4294967295L);
        if (i == i2) {
            i2 = (int) (j >> 32);
            i = (int) (j2 >> 32);
        }
        int i3 = i2 - i;
        if (i3 != 0) {
            if (BYs == AnonymousClass6Gj.Vertical) {
                if (i3 > 0) {
                    num = AnonymousClass05K.A01;
                } else {
                    num = AnonymousClass05K.A00;
                }
            } else if (i3 > 0) {
                num = AnonymousClass05K.A0N;
            } else {
                num = AnonymousClass05K.A0C;
            }
            this.A02.A00.A01.A0G.A09 = num;
        }
        r8.A00 = j;
        return C60340gF.A00;
    }
}

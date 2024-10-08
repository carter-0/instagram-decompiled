package com.instagram.clips.drafts.viewmodel;

import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass72N;
import X.AnonymousClass7TE;
import X.C60340gF;
import java.io.File;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.clips.drafts.viewmodel.ClipsDraftListViewModel$calculateFolderSize$2", f = "ClipsDraftListViewModel.kt", i = {0, 0}, l = {289}, m = "invokeSuspend", n = {"size", "$this$forEach$iv"}, s = {"L$0", "L$1"})
public final class ClipsDraftListViewModel$calculateFolderSize$2 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public final /* synthetic */ AnonymousClass72N A0A;
    public final /* synthetic */ File A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClipsDraftListViewModel$calculateFolderSize$2(AnonymousClass72N r2, File file, AnonymousClass4D7 r4) {
        super(2, r4);
        this.A0B = file;
        this.A0A = r2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.clips.drafts.viewmodel.ClipsDraftListViewModel$calculateFolderSize$2, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r5) {
        return new ClipsDraftListViewModel$calculateFolderSize$2(this.A0A, this.A0B, r5);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [com.instagram.clips.drafts.viewmodel.ClipsDraftListViewModel$calculateFolderSize$2, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v5, types: [X.0rl, java.lang.Object] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r14 = r18
            X.1Hj r10 = X.1Hj.A02
            r11 = r17
            int r0 = r11.A02
            r9 = 1
            if (r0 == 0) goto L_0x002d
            long r0 = r11.A04
            long r4 = r11.A03
            int r2 = r11.A01
            int r8 = r11.A00
            java.lang.Object r13 = r11.A09
            X.0rl r13 = (X.0rl) r13
            java.lang.Object r12 = r11.A08
            X.0rl r12 = (X.0rl) r12
            java.lang.Object r7 = r11.A07
            X.72N r7 = (X.AnonymousClass72N) r7
            java.lang.Object r6 = r11.A06
            java.io.File[] r6 = (java.io.File[]) r6
            java.lang.Object r3 = r11.A05
            X.0rl r3 = (X.0rl) r3
            X.0eS.A00(r14)     // Catch:{ Exception -> 0x0092 }
            r15 = r4
            r4 = r0
            goto L_0x008a
        L_0x002d:
            X.0eS.A00(r14)
            java.io.File r1 = r11.A0B
            boolean r0 = r1.exists()
            if (r0 != 0) goto L_0x0040
            r0 = 0
        L_0x003a:
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r0)
        L_0x003f:
            return r10
        L_0x0040:
            X.0rl r3 = new X.0rl
            r3.<init>()
            boolean r0 = r1.isDirectory()
            if (r0 == 0) goto L_0x009b
            java.io.File[] r6 = r1.listFiles()
            if (r6 == 0) goto L_0x00a1
            X.72N r7 = r11.A0A
            int r2 = r6.length
            r8 = 0
        L_0x0055:
            if (r8 >= r2) goto L_0x00a1
            r13 = r6[r8]
            long r4 = r3.A00
            X.0qQ.A0A(r13)     // Catch:{ Exception -> 0x008f }
            r11.A05 = r3     // Catch:{ Exception -> 0x008f }
            r11.A06 = r6     // Catch:{ Exception -> 0x008f }
            r11.A07 = r7     // Catch:{ Exception -> 0x008f }
            r11.A08 = r3     // Catch:{ Exception -> 0x008f }
            r11.A09 = r3     // Catch:{ Exception -> 0x008f }
            r11.A00 = r8     // Catch:{ Exception -> 0x008f }
            r11.A01 = r2     // Catch:{ Exception -> 0x008f }
            r11.A03 = r4     // Catch:{ Exception -> 0x008f }
            r11.A04 = r4     // Catch:{ Exception -> 0x008f }
            r11.A02 = r9     // Catch:{ Exception -> 0x008f }
            X.12T r14 = X.AnonymousClass12T.A00     // Catch:{ Exception -> 0x008f }
            r12 = 0
            r1 = -18
            r0 = 3
            X.0nV r1 = r14.AOJ(r1, r0)     // Catch:{ Exception -> 0x008f }
            com.instagram.clips.drafts.viewmodel.ClipsDraftListViewModel$calculateFolderSize$2 r0 = new com.instagram.clips.drafts.viewmodel.ClipsDraftListViewModel$calculateFolderSize$2     // Catch:{ Exception -> 0x008f }
            r0.<init>(r7, r13, r12)     // Catch:{ Exception -> 0x008f }
            java.lang.Object r14 = X.1Eo.A00(r11, r1, r0)     // Catch:{ Exception -> 0x008f }
            if (r14 == r10) goto L_0x003f
            r13 = r3
            r12 = r3
            r15 = r4
        L_0x008a:
            long r0 = X.AnonymousClass7TE.A0R(r14)     // Catch:{ Exception -> 0x0091 }
            goto L_0x0095
        L_0x008f:
            r12 = r3
            goto L_0x0092
        L_0x0091:
            r4 = r15
        L_0x0092:
            r13 = r12
            r0 = 0
        L_0x0095:
            long r4 = r4 + r0
            r13.A00 = r4
            int r8 = r8 + 1
            goto L_0x0055
        L_0x009b:
            long r0 = r1.length()
            r3.A00 = r0
        L_0x00a1:
            long r0 = r3.A00
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.clips.drafts.viewmodel.ClipsDraftListViewModel$calculateFolderSize$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ClipsDraftListViewModel$calculateFolderSize$2) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}

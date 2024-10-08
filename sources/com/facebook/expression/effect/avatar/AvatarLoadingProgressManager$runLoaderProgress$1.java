package com.facebook.expression.effect.avatar;

import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60340gF;
import X.OYo;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.expression.effect.avatar.AvatarLoadingProgressManager$runLoaderProgress$1", f = "AvatarLoadingProgressManager.kt", i = {0}, l = {104}, m = "invokeSuspend", n = {"$this$async"}, s = {"L$0"})
public final class AvatarLoadingProgressManager$runLoaderProgress$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public Object A04;
    public /* synthetic */ Object A05;
    public final /* synthetic */ int A06;
    public final /* synthetic */ long A07;
    public final /* synthetic */ OYo A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarLoadingProgressManager$runLoaderProgress$1(OYo oYo, AnonymousClass4D7 r3, int i, long j) {
        super(2, r3);
        this.A06 = i;
        this.A08 = oYo;
        this.A07 = j;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.expression.effect.avatar.AvatarLoadingProgressManager$runLoaderProgress$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r8) {
        AnonymousClass4D7 r2 = r8;
        ? avatarLoadingProgressManager$runLoaderProgress$1 = new AvatarLoadingProgressManager$runLoaderProgress$1(this.A08, r2, this.A06, this.A07);
        avatarLoadingProgressManager$runLoaderProgress$1.A05 = obj;
        return avatarLoadingProgressManager$runLoaderProgress$1;
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [com.facebook.expression.effect.avatar.AvatarLoadingProgressManager$runLoaderProgress$1, X.4D7] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.1Hj r8 = X.1Hj.A02
            int r0 = r9.A02
            r7 = 1
            if (r0 == 0) goto L_0x0044
            int r6 = r9.A01
            long r3 = r9.A03
            int r0 = r9.A00
            java.lang.Object r5 = r9.A04
            X.OYo r5 = (X.OYo) r5
            java.lang.Object r1 = r9.A05
            X.4Cq r1 = (X.C262224Cq) r1
            X.0eS.A00(r10)
        L_0x0018:
            java.lang.Integer r2 = r5.A01
            int r2 = X.AnonymousClass7TG.A0A(r2)
            int r2 = r2 + 1
            java.lang.Integer r2 = X.JTO.A0w(r2)
            X.OYo.A01(r5, r2)
            int r6 = r6 + 1
        L_0x0029:
            if (r6 >= r0) goto L_0x0053
            boolean r2 = X.19E.A07(r1)
            if (r2 == 0) goto L_0x0059
            r9.A05 = r1
            r9.A04 = r5
            r9.A00 = r0
            r9.A03 = r3
            r9.A01 = r6
            r9.A02 = r7
            java.lang.Object r2 = X.C241603Pv.A01(r9, r3)
            if (r2 != r8) goto L_0x0018
            return r8
        L_0x0044:
            X.0eS.A00(r10)
            java.lang.Object r1 = r9.A05
            X.4Cq r1 = (X.C262224Cq) r1
            int r0 = r9.A06
            long r3 = r9.A07
            X.OYo r5 = r9.A08
            r6 = 0
            goto L_0x0029
        L_0x0053:
            X.OYo r1 = r9.A08
            r0 = 0
            X.OYo.A01(r1, r0)
        L_0x0059:
            X.0gF r8 = X.C60340gF.A00
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.expression.effect.avatar.AvatarLoadingProgressManager$runLoaderProgress$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarLoadingProgressManager$runLoaderProgress$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}

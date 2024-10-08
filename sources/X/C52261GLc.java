package X;

import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "instagram.features.clips.viewer.data.ClipsViewerRepository$fetchNextPage$2", f = "ClipsViewerRepository.kt", i = {}, l = {171, 181}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.GLc  reason: case insensitive filesystem */
public final class C52261GLc extends AnonymousClass1Ek implements 0sP {
    public int A00;
    public final /* synthetic */ C52259GLa A01;
    public final /* synthetic */ GLR A02;
    public final /* synthetic */ Boolean A03;
    public final /* synthetic */ Long A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52261GLc(C52259GLa gLa, GLR glr, Boolean bool, Long l, String str, List list, AnonymousClass4D7 r8, boolean z, boolean z2) {
        super(1, r8);
        this.A02 = glr;
        this.A01 = gLa;
        this.A07 = z;
        this.A06 = list;
        this.A08 = z2;
        this.A04 = l;
        this.A05 = str;
        this.A03 = bool;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.GLc, X.4D7] */
    public final AnonymousClass4D7 create(AnonymousClass4D7 r11) {
        GLR glr = this.A02;
        C52259GLa gLa = this.A01;
        boolean z = this.A07;
        List list = this.A06;
        boolean z2 = this.A08;
        return new C52261GLc(gLa, glr, this.A03, this.A04, this.A05, list, r11, z, z2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((C52261GLc) create((AnonymousClass4D7) obj)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [X.GLc, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, X.0rk] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0046, code lost:
        if (((X.C270744hE) r8).AJJ(r5, new X.C52271GLm(r9, r10, r7, r2), r10.A07) != X.AnonymousClass05K.A0C) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r18
            X.1Hj r3 = X.1Hj.A02
            r14 = r17
            int r1 = r14.A00
            r4 = 2
            r6 = 1
            if (r1 == 0) goto L_0x0019
            if (r1 == r6) goto L_0x0066
            X.0eS.A00(r0)
        L_0x0011:
            X.GLR r1 = r14.A02
            r0 = 0
            r1.A02 = r0
        L_0x0016:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x0019:
            X.0eS.A00(r0)
            X.GLR r10 = r14.A02
            r10.A02 = r6
            X.GLa r9 = r14.A01
            boolean r0 = r9.A04
            if (r0 == 0) goto L_0x0049
            X.4hF r8 = r10.A04
            boolean r0 = r8 instanceof X.C270744hE
            if (r0 == 0) goto L_0x0049
            X.0rk r7 = new X.0rk
            r7.<init>()
            com.instagram.common.session.UserSession r5 = r10.A06
            boolean r2 = X.1KU.A0B(r5)
            X.4hE r8 = (X.C270744hE) r8
            X.6z9 r1 = r10.A07
            X.GLm r0 = new X.GLm
            r0.<init>(r9, r10, r7, r2)
            java.lang.Integer r1 = r8.AJJ(r5, r0, r1)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x0049
            goto L_0x0016
        L_0x0049:
            boolean r15 = r14.A07
            if (r15 != 0) goto L_0x0053
            boolean r0 = X.GLR.A0A(r9, r10)
            if (r0 == 0) goto L_0x0011
        L_0x0053:
            java.util.List r13 = r14.A06
            boolean r0 = r14.A08
            java.lang.Long r11 = r14.A04
            java.lang.String r12 = r14.A05
            r14.A00 = r6
            r16 = r0
            java.lang.Object r0 = X.GLR.A03(r9, r10, r11, r12, r13, r14, r15, r16)
            if (r0 != r3) goto L_0x0069
            return r3
        L_0x0066:
            X.0eS.A00(r0)
        L_0x0069:
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 != 0) goto L_0x0011
            X.GLR r2 = r14.A02
            X.GLa r1 = r14.A01
            java.lang.Boolean r0 = r14.A03
            r14.A00 = r4
            java.lang.Object r0 = X.GLR.A02(r1, r2, r0, r14)
            if (r0 != r3) goto L_0x0011
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52261GLc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

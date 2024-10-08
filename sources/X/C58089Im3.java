package X;

import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "instagram.features.clips.viewer.feature.midcard.ui.ClipsMidCardMegacardVideoPlayerViewModel$initializeVirtualVideoPlayerMetadata$1", f = "ClipsMidCardMegacardVideoPlayerViewModel.kt", i = {0, 0, 0}, l = {137}, m = "invokeSuspend", n = {"destination$iv$iv", "index$iv$iv", "index"}, s = {"L$2", "I$1", "I$2"})
/* renamed from: X.Im3  reason: case insensitive filesystem */
public final class C58089Im3 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public final /* synthetic */ int A09;
    public final /* synthetic */ C52079GDz A0A;
    public final /* synthetic */ GDR A0B;
    public final /* synthetic */ List A0C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58089Im3(C52079GDz gDz, GDR gdr, List list, AnonymousClass4D7 r5, int i) {
        super(2, r5);
        this.A0C = list;
        this.A0B = gdr;
        this.A09 = i;
        this.A0A = gDz;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Im3, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r8) {
        List list = this.A0C;
        return new C58089Im3(this.A0A, this.A0B, list, r8, this.A09);
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [X.Im3, X.4D7] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            X.1Hj r9 = X.1Hj.A02
            int r0 = r14.A03
            r8 = 1
            if (r0 == 0) goto L_0x0051
            int r11 = r14.A02
            int r2 = r14.A01
            int r7 = r14.A00
            java.lang.Object r12 = r14.A08
            java.util.Collection r12 = (java.util.Collection) r12
            java.lang.Object r10 = r14.A07
            java.util.Iterator r10 = (java.util.Iterator) r10
            java.lang.Object r6 = r14.A06
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.Object r5 = r14.A05
            X.GDz r5 = (X.C52079GDz) r5
            java.lang.Object r4 = r14.A04
            X.GDR r4 = (X.GDR) r4
            X.0eS.A00(r15)
        L_0x0024:
            X.5kq r15 = (X.C293505kq) r15
            if (r15 != 0) goto L_0x0035
            X.0wj r2 = X.0wj.A01
            r1 = 817892914(0x30c00e32, float:1.3973873E-9)
            java.lang.String r0 = "ClipsMidCardMegacardVideoPlayerViewModel: unable to get ClipsDraft"
            X.DbT.A1Q(r2, r0, r1)
        L_0x0032:
            X.0gF r9 = X.C60340gF.A00
        L_0x0034:
            return r9
        L_0x0035:
            X.07i r13 = r4.A05
            android.app.Application r3 = r4.A0D()
            com.instagram.common.session.UserSession r0 = r4.A06
            X.LO6 r1 = new X.LO6
            r1.<init>(r3, r13, r0)
            X.IQX r0 = new X.IQX
            r0.<init>(r5, r4, r11, r7)
            r1.A01(r15, r0)
            X.0gF r0 = X.C60340gF.A00
            r12.add(r0)
            r11 = r2
            goto L_0x0065
        L_0x0051:
            X.0eS.A00(r15)
            java.util.List r0 = r14.A0C
            X.GDR r4 = r14.A0B
            int r7 = r14.A09
            X.GDz r5 = r14.A0A
            java.util.ArrayList r6 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r10 = r0.iterator()
            r11 = 0
        L_0x0065:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0032
            java.lang.Object r3 = r10.next()
            int r2 = r11 + 1
            if (r11 >= 0) goto L_0x007b
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x007b:
            java.lang.String r3 = (java.lang.String) r3
            android.app.Application r1 = r4.A0D()
            com.instagram.common.session.UserSession r0 = r4.A06
            com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource r0 = X.2MV.A00(r1, r0)
            r14.A04 = r4
            r14.A05 = r5
            r14.A06 = r6
            r14.A07 = r10
            r14.A08 = r6
            r14.A00 = r7
            r14.A01 = r2
            r14.A02 = r11
            r14.A03 = r8
            java.lang.Object r15 = r0.A07(r3, r14)
            if (r15 == r9) goto L_0x0034
            r12 = r6
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58089Im3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C58089Im3) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}

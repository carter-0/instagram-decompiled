package X;

import instagram.features.clips.viewer.video.ClipsMidcardVirtualVideoPlayerController;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "instagram.features.clips.viewer.video.ClipsMidcardVirtualVideoPlayerController$prepareAndPlayVideoOnDraftMidcard$1", f = "ClipsMidcardVirtualVideoPlayerController.kt", i = {0, 0, 0, 0, 0}, l = {147}, m = "invokeSuspend", n = {"mediaCompositions", "mediaCompositionDurations", "destination$iv$iv", "index$iv$iv", "index"}, s = {"L$0", "L$1", "L$4", "I$0", "I$1"})
/* renamed from: X.Im4  reason: case insensitive filesystem */
public final class C58090Im4 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public final /* synthetic */ C52079GDz A0A;
    public final /* synthetic */ ClipsMidcardVirtualVideoPlayerController A0B;
    public final /* synthetic */ List A0C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58090Im4(C52079GDz gDz, ClipsMidcardVirtualVideoPlayerController clipsMidcardVirtualVideoPlayerController, List list, AnonymousClass4D7 r5) {
        super(2, r5);
        this.A0C = list;
        this.A0B = clipsMidcardVirtualVideoPlayerController;
        this.A0A = gDz;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Im4, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r6) {
        List list = this.A0C;
        return new C58090Im4(this.A0A, this.A0B, list, r6);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [X.Im4, X.4D7] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0086  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r14 = r22
            X.1Hj r10 = X.1Hj.A02
            r11 = r21
            int r0 = r11.A02
            r9 = 1
            if (r0 == 0) goto L_0x0066
            int r0 = r11.A01
            r16 = r0
            int r13 = r11.A00
            java.lang.Object r12 = r11.A09
            java.util.Collection r12 = (java.util.Collection) r12
            java.lang.Object r8 = r11.A08
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r3 = r11.A07
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.Object r7 = r11.A06
            X.GDz r7 = (X.C52079GDz) r7
            java.lang.Object r6 = r11.A05
            instagram.features.clips.viewer.video.ClipsMidcardVirtualVideoPlayerController r6 = (instagram.features.clips.viewer.video.ClipsMidcardVirtualVideoPlayerController) r6
            java.lang.Object r5 = r11.A04
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r4 = r11.A03
            java.util.Map r4 = (java.util.Map) r4
            X.0eS.A00(r14)
        L_0x0030:
            X.5kq r14 = (X.C293505kq) r14
            if (r14 != 0) goto L_0x0041
            X.0wj r2 = X.0wj.A01
            r1 = 817892914(0x30c00e32, float:1.3973873E-9)
            java.lang.String r0 = "ClipsMidcardVirtualVideoPlayerController: unable to get ClipsDraft"
            X.DbT.A1Q(r2, r0, r1)
        L_0x003e:
            X.0gF r10 = X.C60340gF.A00
        L_0x0040:
            return r10
        L_0x0041:
            X.07i r15 = r6.A04
            android.content.Context r2 = r6.A02
            com.instagram.common.session.UserSession r0 = r6.A05
            X.LO6 r1 = new X.LO6
            r1.<init>(r2, r15, r0)
            X.IQY r0 = new X.IQY
            r19 = r5
            r20 = r16
            r17 = r6
            r18 = r4
            r15 = r0
            r16 = r7
            r15.<init>(r16, r17, r18, r19, r20)
            r1.A01(r14, r0)
            X.0gF r0 = X.C60340gF.A00
            r12.add(r0)
            r12 = r3
            goto L_0x0080
        L_0x0066:
            X.0eS.A00(r14)
            java.util.LinkedHashMap r4 = X.AnonymousClass7TE.A1H()
            java.util.LinkedHashMap r5 = X.AnonymousClass7TE.A1H()
            java.util.List r0 = r11.A0C
            instagram.features.clips.viewer.video.ClipsMidcardVirtualVideoPlayerController r6 = r11.A0B
            X.GDz r7 = r11.A0A
            java.util.ArrayList r12 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r8 = r0.iterator()
            r13 = 0
        L_0x0080:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x003e
            java.lang.Object r3 = r8.next()
            int r2 = r13 + 1
            if (r13 >= 0) goto L_0x0096
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0096:
            java.lang.String r3 = (java.lang.String) r3
            android.content.Context r1 = r6.A02
            com.instagram.common.session.UserSession r0 = r6.A05
            com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource r0 = X.2MV.A00(r1, r0)
            r11.A03 = r4
            r11.A04 = r5
            r11.A05 = r6
            r11.A06 = r7
            r11.A07 = r12
            r11.A08 = r8
            r11.A09 = r12
            r11.A00 = r2
            r11.A01 = r13
            r11.A02 = r9
            java.lang.Object r14 = r0.A07(r3, r11)
            if (r14 == r10) goto L_0x0040
            r16 = r13
            r3 = r12
            r13 = r2
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58090Im4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C58090Im4) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}

package X;

import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "instagram.features.clips.viewer.overflowmenu.ClipsMashupInfoApiUtil$createRetriableMashupInfoForClipJob$1", f = "ClipsMashupInfoApiUtil.kt", i = {0}, l = {52}, m = "invokeSuspend", n = {"retryCount"}, s = {"I$0"})
/* renamed from: X.IlZ  reason: case insensitive filesystem */
public final class C58083IlZ extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public int A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58083IlZ(UserSession userSession, String str, String str2, AnonymousClass4D7 r5) {
        super(2, r5);
        this.A02 = userSession;
        this.A03 = str;
        this.A04 = str2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4D7, X.IlZ] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r6) {
        return new C58083IlZ(this.A02, this.A03, this.A04, r6);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.4D7, X.IlZ] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A01
            r5 = 1
            if (r0 == 0) goto L_0x0014
            int r4 = r7.A00
            X.0eS.A00(r8)
        L_0x000c:
            boolean r0 = r8 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0013
            r0 = 3
            if (r4 < r0) goto L_0x0018
        L_0x0013:
            return r8
        L_0x0014:
            X.0eS.A00(r8)
            r4 = 0
        L_0x0018:
            int r4 = r4 + 1
            X.I66 r3 = X.I66.A00
            com.instagram.common.session.UserSession r2 = r7.A02
            java.lang.String r1 = r7.A03
            java.lang.String r0 = r7.A04
            r7.A00 = r4
            r7.A01 = r5
            java.lang.Object r8 = X.I66.A00(r2, r3, r1, r0, r7)
            if (r8 != r6) goto L_0x000c
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58083IlZ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C58083IlZ) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}

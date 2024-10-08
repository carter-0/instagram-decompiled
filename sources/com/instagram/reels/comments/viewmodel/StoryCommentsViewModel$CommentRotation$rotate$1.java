package com.instagram.reels.comments.viewmodel;

import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.C309496Ym;
import X.C60340gF;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.reels.comments.viewmodel.StoryCommentsViewModel$CommentRotation$rotate$1", f = "StoryCommentsViewModel.kt", i = {1, 1, 1, 2, 2, 2}, l = {606, 613, 622}, m = "invokeSuspend", n = {"index", "currentRotation", "maxRotations", "index", "currentRotation", "maxRotations"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "I$0"})
public final class StoryCommentsViewModel$CommentRotation$rotate$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final /* synthetic */ C309496Ym A06;
    public final /* synthetic */ List A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoryCommentsViewModel$CommentRotation$rotate$1(C309496Ym r2, List list, AnonymousClass4D7 r4) {
        super(2, r4);
        this.A06 = r2;
        this.A07 = list;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.reels.comments.viewmodel.StoryCommentsViewModel$CommentRotation$rotate$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r5) {
        return new StoryCommentsViewModel$CommentRotation$rotate$1(this.A06, this.A07, r5);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StoryCommentsViewModel$CommentRotation$rotate$1) create(obj, (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: X.0rk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: X.0rk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: X.0rk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: X.0rk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: X.0rk} */
    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.Object, X.0rk] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            X.1Hj r7 = X.1Hj.A02
            int r0 = r14.A02
            r6 = 0
            r5 = 3
            r4 = 2
            r2 = 1
            if (r0 == 0) goto L_0x00a7
            if (r0 == r2) goto L_0x00b5
            int r11 = r14.A01
            int r1 = r14.A00
            java.lang.Object r10 = r14.A05
            X.6Ym r10 = (X.C309496Ym) r10
            java.lang.Object r9 = r14.A04
            X.0rk r9 = (X.0rk) r9
            java.lang.Object r8 = r14.A03
            X.0rk r8 = (X.0rk) r8
            if (r0 == r4) goto L_0x0053
            X.0eS.A00(r15)
        L_0x0021:
            int r0 = r9.A00
            int r0 = r0 + 1
            r9.A00 = r0
            int r11 = r11 + 1
        L_0x0029:
            if (r11 >= r1) goto L_0x00de
            X.05G r0 = r10.A03
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0056
            X.05G r2 = r10.A03
            com.instagram.reels.comments.viewmodel.StoryCommentsViewModel$CommentRotation$rotate$1$1$1 r0 = new com.instagram.reels.comments.viewmodel.StoryCommentsViewModel$CommentRotation$rotate$1$1$1
            r0.<init>(r6)
            r14.A03 = r8
            r14.A04 = r9
            r14.A05 = r10
            r14.A00 = r1
            r14.A01 = r11
            r14.A02 = r4
            java.lang.Object r0 = X.AnonymousClass10c.A00(r14, r0, r2)
            if (r0 != r7) goto L_0x0056
            return r7
        L_0x0053:
            X.0eS.A00(r15)
        L_0x0056:
            int r2 = r8.A00
            r10.A00 = r2
            java.util.List r0 = r10.A01
            java.lang.Object r13 = X.00k.A0O(r0, r2)
            if (r13 == 0) goto L_0x0075
            X.0sK r12 = r10.A05
            int r0 = r9.A00
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r0)
            int r2 = r8.A00
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r2)
            r12.invoke(r3, r0, r13)
        L_0x0075:
            int r0 = r8.A00
            int r2 = r0 + 1
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r2)
            int r3 = r0.intValue()
            java.util.List r0 = r10.A01
            int r0 = r0.size()
            r2 = 0
            if (r3 >= r0) goto L_0x008c
            r2 = r3
        L_0x008c:
            int r0 = r8.A00
            if (r2 == r0) goto L_0x0092
            r8.A00 = r2
        L_0x0092:
            r2 = 1700(0x6a4, double:8.4E-321)
            r14.A03 = r8
            r14.A04 = r9
            r14.A05 = r10
            r14.A00 = r1
            r14.A01 = r11
            r14.A02 = r5
            java.lang.Object r0 = X.C241603Pv.A01(r14, r2)
            if (r0 != r7) goto L_0x0021
            return r7
        L_0x00a7:
            X.0eS.A00(r15)
            r0 = 500(0x1f4, double:2.47E-321)
            r14.A02 = r2
            java.lang.Object r0 = X.C241603Pv.A01(r14, r0)
            if (r0 != r7) goto L_0x00b8
            return r7
        L_0x00b5:
            X.0eS.A00(r15)
        L_0x00b8:
            X.0rk r8 = new X.0rk
            r8.<init>()
            X.0rk r9 = new X.0rk
            r9.<init>()
            r9.A00 = r2
            java.util.List r1 = r14.A07
            int r0 = r1.size()
            if (r0 <= r2) goto L_0x00dc
            int r0 = r1.size()
            int r1 = r0 * 2
        L_0x00d2:
            X.6Ym r10 = r14.A06
            X.0sa r0 = r10.A04
            r0.invoke()
            r11 = 0
            goto L_0x0029
        L_0x00dc:
            r1 = 1
            goto L_0x00d2
        L_0x00de:
            X.0gF r7 = X.C60340gF.A00
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.reels.comments.viewmodel.StoryCommentsViewModel$CommentRotation$rotate$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

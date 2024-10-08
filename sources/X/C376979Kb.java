package X;

/* renamed from: X.9Kb  reason: invalid class name and case insensitive filesystem */
public final class C376979Kb extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final int A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C376979Kb(Object obj, String str, String str2, AnonymousClass4D7 r5, int i) {
        super(2, r5);
        this.A01 = i;
        this.A02 = obj;
        this.A04 = str;
        this.A03 = str2;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.9Kb, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r8) {
        Object obj2;
        String str;
        String str2;
        int i;
        AnonymousClass4D7 r4 = r8;
        if (this.A01 != 0) {
            str = this.A04;
            obj2 = this.A02;
            str2 = this.A03;
            i = 1;
        } else {
            obj2 = this.A02;
            str = this.A04;
            str2 = this.A03;
            i = 0;
        }
        return new C376979Kb(obj2, str, str2, r4, i);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C376979Kb) create(obj, (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: X.4zZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: X.4zZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: X.4zZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: X.4zZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: X.4zZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: X.4zZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: X.4zZ} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.A01
            X.1Hj r2 = X.1Hj.A02
            if (r0 == 0) goto L_0x0096
            int r0 = r9.A00
            r6 = 2
            r5 = 1
            if (r0 != 0) goto L_0x00bb
            X.0eS.A00(r10)
            java.lang.String r1 = r9.A04
            r7 = 0
            java.lang.Object r8 = r9.A02
            com.instagram.direct.inbox.notes.NotesRepository r8 = (com.instagram.direct.inbox.notes.NotesRepository) r8
            if (r1 == 0) goto L_0x0060
            X.05G r0 = r8.A0Z
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r0 = r0.get(r1)
            X.4zc r0 = (X.C279894zc) r0
            if (r0 == 0) goto L_0x00be
            java.util.List r0 = r0.A05
            if (r0 == 0) goto L_0x00be
            java.lang.String r4 = r9.A03
            java.util.Iterator r3 = r0.iterator()
        L_0x0032:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0048
            java.lang.Object r1 = r3.next()
            r0 = r1
            X.4zZ r0 = (X.C279864zZ) r0
            java.lang.String r0 = r0.A0H
            boolean r0 = X.0qQ.A0K(r0, r4)
            if (r0 == 0) goto L_0x0032
            r7 = r1
        L_0x0048:
            X.4zZ r7 = (X.C279864zZ) r7
            if (r7 == 0) goto L_0x00be
            X.0V2 r4 = r8.A0L
            java.lang.String r1 = r7.A0H
            r0 = 10
            X.Jvk r3 = new X.Jvk
            r3.<init>((java.lang.String) r1, (boolean) r5, (int) r0)
            r9.A00 = r5
        L_0x0059:
            java.lang.Object r0 = r4.emit(r3, r9)
        L_0x005d:
            if (r0 != r2) goto L_0x00be
            return r2
        L_0x0060:
            X.05G r0 = r8.A0X
            java.lang.Object r0 = r0.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.String r4 = r9.A03
            java.util.Iterator r3 = r0.iterator()
        L_0x006e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0084
            java.lang.Object r1 = r3.next()
            r0 = r1
            X.4zZ r0 = (X.C279864zZ) r0
            java.lang.String r0 = r0.A0H
            boolean r0 = X.0qQ.A0K(r0, r4)
            if (r0 == 0) goto L_0x006e
            r7 = r1
        L_0x0084:
            X.4zZ r7 = (X.C279864zZ) r7
            if (r7 == 0) goto L_0x00be
            X.0V2 r4 = r8.A0L
            java.lang.String r1 = r7.A0H
            r0 = 10
            X.Jvk r3 = new X.Jvk
            r3.<init>((java.lang.String) r1, (boolean) r5, (int) r0)
            r9.A00 = r6
            goto L_0x0059
        L_0x0096:
            int r1 = r9.A00
            r0 = 1
            if (r1 == 0) goto L_0x00a5
            if (r1 == r0) goto L_0x00bb
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00a5:
            X.0eS.A00(r10)
            java.lang.Object r4 = r9.A02
            com.instagram.comments.mvvm.data.MediaCommentListRepository r4 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r4
            java.lang.String r7 = r9.A04
            java.lang.String r8 = r9.A03
            java.lang.Integer r6 = X.AnonymousClass05K.A0N
            X.7de r5 = X.C335857de.HIDDEN_COMMENT
            r9.A00 = r0
            java.lang.Object r0 = com.instagram.comments.mvvm.data.MediaCommentListRepository.A03(r4, r5, r6, r7, r8, r9)
            goto L_0x005d
        L_0x00bb:
            X.0eS.A00(r10)
        L_0x00be:
            X.0gF r2 = X.C60340gF.A00
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C376979Kb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

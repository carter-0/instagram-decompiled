package X;

/* renamed from: X.MEc  reason: case insensitive filesystem */
public final class C66149MEc extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final int A01;
    public final long A02;
    public final Object A03;
    public final String A04;
    public final String A05;

    /* JADX WARNING: type inference failed for: r12v0, types: [X.MEc, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c8, code lost:
        if (r0 != r1) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ca, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00cb, code lost:
        X.0eS.A00(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f2, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            r9 = r12
            int r0 = r12.A01
            X.1Hj r1 = X.1Hj.A02
            switch(r0) {
                case 0: goto L_0x0089;
                case 1: goto L_0x00a9;
                default: goto L_0x0008;
            }
        L_0x0008:
            int r0 = r12.A00
            r5 = 1
            if (r0 == 0) goto L_0x0064
            X.0eS.A00(r13)
        L_0x0010:
            X.3Ii r13 = (X.C239803Ii) r13
            boolean r0 = r13 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0080
            java.lang.Object r6 = r12.A03
            X.KWm r6 = (X.C62034KWm) r6
            X.05G r3 = r6.A06
            java.lang.String r4 = r12.A05
        L_0x001e:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            boolean r0 = X.JTU.A1Z(r4, r0, r2, r1, r3)
            if (r0 == 0) goto L_0x001e
            java.util.HashMap r0 = r6.A03
            java.util.AbstractCollection r5 = X.JTS.A0m(r4, r0)
            java.lang.String r0 = r12.A04
            if (r0 != 0) goto L_0x003c
            r5.clear()
        L_0x003c:
            X.3Ih r13 = (X.C239793Ih) r13
            java.lang.Object r7 = r13.A00
            X.CEm r7 = (X.C43820CEm) r7
            X.5y4 r0 = r7.FH3()
            java.util.List r0 = r0.A01
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0050:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00cf
            java.lang.Object r0 = r1.next()
            com.instagram.api.schemas.NoteEmojiReactionInfoIntf r0 = (com.instagram.api.schemas.NoteEmojiReactionInfoIntf) r0
            com.instagram.api.schemas.NoteEmojiReactionInfo r0 = X.AnonymousClass69P.A00(r0)
            r2.add(r0)
            goto L_0x0050
        L_0x0064:
            X.0eS.A00(r13)
            java.lang.Object r0 = r12.A03
            X.KWm r0 = (X.C62034KWm) r0
            X.0eM r0 = r0.A04
            java.lang.Object r4 = r0.getValue()
            com.instagram.direct.inbox.notes.NotesApi r4 = (com.instagram.direct.inbox.notes.NotesApi) r4
            long r2 = r12.A02
            java.lang.String r0 = r12.A04
            r12.A00 = r5
            java.lang.Object r13 = r4.A06(r0, r12, r2)
            if (r13 != r1) goto L_0x0010
            return r1
        L_0x0080:
            boolean r0 = r13 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00f0
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0089:
            int r0 = r12.A00
            r3 = 1
            if (r0 != 0) goto L_0x00cb
            X.0eS.A00(r13)
            java.lang.Object r2 = r12.A03
            X.JfV r2 = (X.C60089JfV) r2
            com.instagram.ml.hashtag.IgContextualHashtagsProcessor r6 = r2.A00
            java.lang.String r8 = r12.A05
            long r10 = r12.A02
            java.lang.String r0 = r12.A04
            X.Ltz r7 = new X.Ltz
            r7.<init>(r2, r0)
            r12.A00 = r3
            java.lang.Object r0 = r6.A01(r7, r8, r9, r10)
            goto L_0x00c8
        L_0x00a9:
            int r2 = r12.A00
            r0 = 1
            if (r2 != 0) goto L_0x00cb
            X.0eS.A00(r13)
            java.lang.Object r4 = r12.A03
            com.instagram.direct.inbox.notes.NotesRepository r4 = (com.instagram.direct.inbox.notes.NotesRepository) r4
            com.instagram.direct.inbox.notes.NotesApi r3 = r4.A0C
            long r7 = r12.A02
            java.lang.String r5 = r12.A04
            java.lang.String r6 = r12.A05
            X.NWO r2 = new X.NWO
            r2.<init>(r3, r4, r5, r6, r7)
            r12.A00 = r0
            java.lang.Object r0 = r2.A05(r12)
        L_0x00c8:
            if (r0 != r1) goto L_0x00f0
            return r1
        L_0x00cb:
            X.0eS.A00(r13)
            goto L_0x00f0
        L_0x00cf:
            r5.addAll(r2)
            X.05G r3 = r6.A05
        L_0x00d4:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            java.util.Map r1 = (java.util.Map) r1
            java.util.List r0 = X.00k.A0a(r5)
            boolean r0 = X.JTU.A1Z(r4, r0, r2, r1, r3)
            if (r0 == 0) goto L_0x00d4
            java.util.HashMap r1 = r6.A02
            X.5y4 r0 = r7.FH3()
            X.4sZ r0 = r0.A00
            r1.put(r4, r0)
        L_0x00f0:
            X.0gF r1 = X.C60340gF.A00
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66149MEc.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66149MEc(Object obj, String str, String str2, AnonymousClass4D7 r5, int i, long j) {
        super(2, r5);
        this.A01 = i;
        this.A03 = obj;
        this.A05 = str;
        this.A02 = j;
        this.A04 = str2;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.MEc, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r10) {
        long j;
        String str;
        String str2;
        int i;
        int i2 = this.A01;
        Object obj2 = this.A03;
        AnonymousClass4D7 r4 = r10;
        switch (i2) {
            case 0:
                str2 = this.A05;
                j = this.A02;
                str = this.A04;
                i = 0;
                break;
            case 1:
                j = this.A02;
                str = this.A04;
                str2 = this.A05;
                i = 1;
                break;
            default:
                j = this.A02;
                str = this.A04;
                str2 = this.A05;
                i = 2;
                break;
        }
        return new C66149MEc(obj2, str2, str, r4, i, j);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C66149MEc) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}

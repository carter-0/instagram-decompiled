package com.instagram.direct.inbox.notes;

import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.inbox.notes.NotesRepository$fetchNotes$1", f = "NotesRepository.kt", i = {}, l = {299, 301}, m = "invokeSuspend", n = {}, s = {})
public final class NotesRepository$fetchNotes$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ NotesRepository A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotesRepository$fetchNotes$1(NotesRepository notesRepository, Integer num, AnonymousClass4D7 r4, boolean z, boolean z2) {
        super(2, r4);
        this.A04 = z;
        this.A03 = z2;
        this.A01 = notesRepository;
        this.A02 = num;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.direct.inbox.notes.NotesRepository$fetchNotes$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r8) {
        return new NotesRepository$fetchNotes$1(this.A01, this.A02, r8, this.A04, this.A03);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((NotesRepository$fetchNotes$1) create(obj, (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.instagram.direct.inbox.notes.NotesRepository$fetchNotes$1, X.4D7] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0056 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.1Hj r5 = X.1Hj.A02
            int r0 = r7.A00
            r6 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0010
            if (r0 == r2) goto L_0x0024
            X.0eS.A00(r8)
        L_0x000d:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x0010:
            X.0eS.A00(r8)
            com.instagram.direct.inbox.notes.NotesRepository r0 = r7.A01
            X.0V2 r1 = r0.A0N
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r7.A00 = r2
            java.lang.Object r0 = r1.emit(r0, r7)
            if (r0 != r5) goto L_0x0027
            return r5
        L_0x0024:
            X.0eS.A00(r8)
        L_0x0027:
            com.instagram.direct.inbox.notes.NotesRepository r4 = r7.A01
            X.43E r2 = r4.A0D
            java.lang.Integer r1 = r7.A02
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.02m r3 = r2.A00
            r2 = 275915771(0x107223fb, float:4.7753803E-29)
            r3.markerStart(r2)
            java.lang.String r0 = "notes_fetch_server_attempt"
            r3.markerPoint(r2, r0)
            int r0 = r1.intValue()
            switch(r0) {
                case 1: goto L_0x0057;
                case 2: goto L_0x005a;
                case 3: goto L_0x005d;
                case 4: goto L_0x0060;
                case 5: goto L_0x0063;
                case 6: goto L_0x0066;
                case 7: goto L_0x0069;
                case 8: goto L_0x006c;
                case 9: goto L_0x006f;
                case 10: goto L_0x0072;
                case 11: goto L_0x0075;
                default: goto L_0x0045;
            }
        L_0x0045:
            java.lang.String r1 = "inbox_rendered"
        L_0x0047:
            java.lang.String r0 = "fetch_reason"
            r3.markerAnnotate(r2, r0, r1)
            boolean r0 = r7.A04
            r7.A00 = r6
            java.lang.Object r0 = r4.A0A(r7, r0)
            if (r0 != r5) goto L_0x000d
            return r5
        L_0x0057:
            java.lang.String r1 = "note_deleted"
            goto L_0x0047
        L_0x005a:
            java.lang.String r1 = "note_muted"
            goto L_0x0047
        L_0x005d:
            java.lang.String r1 = "user_restricted"
            goto L_0x0047
        L_0x0060:
            java.lang.String r1 = "ptr"
            goto L_0x0047
        L_0x0063:
            java.lang.String r1 = "inbox_foreground"
            goto L_0x0047
        L_0x0066:
            java.lang.String r1 = "cold_start"
            goto L_0x0047
        L_0x0069:
            java.lang.String r1 = "prompts_sheet"
            goto L_0x0047
        L_0x006c:
            java.lang.String r1 = "quick_reply_sheet"
            goto L_0x0047
        L_0x006f:
            java.lang.String r1 = "self_note_sheet"
            goto L_0x0047
        L_0x0072:
            java.lang.String r1 = "other"
            goto L_0x0047
        L_0x0075:
            java.lang.String r1 = "mc_updated_value_to_true"
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.inbox.notes.NotesRepository$fetchNotes$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

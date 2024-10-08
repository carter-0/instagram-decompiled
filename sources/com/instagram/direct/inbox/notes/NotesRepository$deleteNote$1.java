package com.instagram.direct.inbox.notes;

import X.0eS;
import X.0sL;
import X.1Hj;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60340gF;
import X.NWP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.inbox.notes.NotesRepository$deleteNote$1", f = "NotesRepository.kt", i = {}, l = {581}, m = "invokeSuspend", n = {}, s = {})
public final class NotesRepository$deleteNote$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ NotesRepository A02;
    public final /* synthetic */ String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotesRepository$deleteNote$1(NotesRepository notesRepository, String str, AnonymousClass4D7 r4, long j) {
        super(2, r4);
        this.A02 = notesRepository;
        this.A01 = j;
        this.A03 = str;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.direct.inbox.notes.NotesRepository$deleteNote$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r8) {
        return new NotesRepository$deleteNote$1(this.A02, this.A03, r8, this.A01);
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [com.instagram.direct.inbox.notes.NotesRepository$deleteNote$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        1Hj r2 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            NotesRepository notesRepository = this.A02;
            NotesApi notesApi = notesRepository.A0C;
            NWP nwp = new NWP(notesRepository.A0B, notesApi, notesRepository, this.A03, this.A01);
            this.A00 = 1;
            if (nwp.A05(this) == r2) {
                return r2;
            }
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((NotesRepository$deleteNote$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}

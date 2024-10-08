package com.instagram.direct.inbox.notes;

import X.002;
import X.0eS;
import X.0sL;
import X.17i;
import X.1Hj;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C262224Cq;
import X.C60340gF;
import X.C68176N3r;
import X.JV7;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import com.instagram.direct.inbox.notes.models.NoteCreationSource;
import com.instagram.direct.inbox.notes.models.NoteStyle;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.inbox.notes.NotesRepository$postNote$1", f = "NotesRepository.kt", i = {}, l = {892}, m = "invokeSuspend", n = {}, s = {})
public final class NotesRepository$postNote$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ NotesRepository A03;
    public final /* synthetic */ NoteAudience A04;
    public final /* synthetic */ C68176N3r A05;
    public final /* synthetic */ NoteCreationSource A06;
    public final /* synthetic */ NoteStyle A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ List A09;
    public final /* synthetic */ boolean A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotesRepository$postNote$1(NotesRepository notesRepository, NoteAudience noteAudience, C68176N3r n3r, NoteCreationSource noteCreationSource, NoteStyle noteStyle, String str, List list, AnonymousClass4D7 r9, int i, boolean z) {
        super(2, r9);
        this.A02 = i;
        this.A03 = notesRepository;
        this.A08 = str;
        this.A04 = noteAudience;
        this.A07 = noteStyle;
        this.A06 = noteCreationSource;
        this.A05 = n3r;
        this.A09 = list;
        this.A0A = z;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.direct.inbox.notes.NotesRepository$postNote$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r13) {
        int i = this.A02;
        NotesRepository notesRepository = this.A03;
        String str = this.A08;
        NoteAudience noteAudience = this.A04;
        NoteStyle noteStyle = this.A07;
        ? notesRepository$postNote$1 = new NotesRepository$postNote$1(notesRepository, noteAudience, this.A05, this.A06, noteStyle, str, this.A09, r13, i, this.A0A);
        notesRepository$postNote$1.A01 = obj;
        return notesRepository$postNote$1;
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [com.instagram.direct.inbox.notes.NotesRepository$postNote$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        JV7 jv7;
        Object obj2 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            C262224Cq r8 = (C262224Cq) this.A01;
            int i = this.A02;
            NotesRepository notesRepository = this.A03;
            NotesApi notesApi = notesRepository.A0C;
            17i r16 = notesRepository.A0G;
            UserSession userSession = notesRepository.A0B;
            Context context = notesRepository.A0A;
            String str = this.A08;
            NoteAudience noteAudience = this.A04;
            NoteStyle noteStyle = this.A07;
            NoteCreationSource noteCreationSource = this.A06;
            C68176N3r n3r = this.A05;
            String str2 = null;
            if (!(n3r == null || (jv7 = n3r.A07) == null || (str2 = jv7.A01) != null)) {
                int i2 = notesRepository.A00;
                notesRepository.A00 = i2 + 1;
                str2 = 002.A0O("1_", i2);
            }
            NoteStyle noteStyle2 = noteStyle;
            17i r21 = r16;
            String str3 = str;
            NoteAudience noteAudience2 = noteAudience;
            C68176N3r n3r2 = n3r;
            NoteCreationSource noteCreationSource2 = noteCreationSource;
            NotesApi notesApi2 = notesApi;
            NotesRepository notesRepository2 = notesRepository;
            GraphqlOptimisticPostOperation graphqlOptimisticPostOperation = new GraphqlOptimisticPostOperation(context, userSession, notesApi2, notesRepository2, noteAudience2, n3r2, noteCreationSource2, noteStyle2, r21, str3, str2, this.A09, r8, i, this.A0A);
            this.A00 = 1;
            if (graphqlOptimisticPostOperation.A05(this) == obj2) {
                return obj2;
            }
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((NotesRepository$postNote$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}

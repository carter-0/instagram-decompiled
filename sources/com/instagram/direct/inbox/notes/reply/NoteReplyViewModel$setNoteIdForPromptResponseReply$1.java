package com.instagram.direct.inbox.notes.reply;

import X.0eS;
import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C279864zZ;
import X.C279894zc;
import X.C318116oQ;
import X.C60340gF;
import X.C66167MGe;
import X.C66582MXn;
import X.C67755MuA;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.inbox.notes.reply.NoteReplyViewModel$setNoteIdForPromptResponseReply$1", f = "NoteReplyViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class NoteReplyViewModel$setNoteIdForPromptResponseReply$1 extends AnonymousClass1Ek implements 0sL {
    public /* synthetic */ Object A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C67755MuA A02;
    public final /* synthetic */ String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NoteReplyViewModel$setNoteIdForPromptResponseReply$1(C67755MuA muA, String str, AnonymousClass4D7 r4, long j) {
        super(2, r4);
        this.A03 = str;
        this.A02 = muA;
        this.A01 = j;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.direct.inbox.notes.reply.NoteReplyViewModel$setNoteIdForPromptResponseReply$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r8) {
        ? noteReplyViewModel$setNoteIdForPromptResponseReply$1 = new NoteReplyViewModel$setNoteIdForPromptResponseReply$1(this.A02, this.A03, r8, this.A01);
        noteReplyViewModel$setNoteIdForPromptResponseReply$1.A00 = obj;
        return noteReplyViewModel$setNoteIdForPromptResponseReply$1;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((NoteReplyViewModel$setNoteIdForPromptResponseReply$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        List list;
        Object obj2;
        0eS.A00(obj);
        C279894zc r0 = (C279894zc) ((Map) this.A00).get(this.A03);
        if (!(r0 == null || (list = r0.A05) == null)) {
            long j = this.A01;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (C66582MXn.A1U(obj2, j)) {
                    break;
                }
            }
            C279864zZ r1 = (C279864zZ) obj2;
            if (r1 != null) {
                C67755MuA.A02(r1, this.A02);
                return C60340gF.A00;
            }
        }
        C67755MuA muA = this.A02;
        if (muA.A01) {
            AnonymousClass7TE.A1Z(new C66167MGe(muA, (AnonymousClass4D7) null, 15), C318116oQ.A00(muA));
        }
        return C60340gF.A00;
    }
}

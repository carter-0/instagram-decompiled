package X;

import android.view.View;
import com.instagram.api.schemas.NoteCustomTheme;
import com.instagram.api.schemas.NotePogImageDict;
import com.instagram.api.schemas.NotePogVideoDict;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.direct.inbox.notes.NotesRepository$deleteNote$1;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import com.instagram.direct.inbox.notes.reply.NoteReplyViewModel$setNoteIdForPromptResponseReply$1;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.P3k  reason: case insensitive filesystem */
public final class C72371P3k implements AnonymousClass4AD {
    public final int A00;
    public final Object A01;

    public C72371P3k(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void AMU(long j, String str) {
        String str2;
        switch (this.A00) {
            case 0:
                0qQ.A0B("❤️", 1);
                C66580MXl.A0X((AnonymousClass0eM) this.A01).A02(j);
                return;
            case 1:
                0qQ.A0B("❤️", 1);
                return;
            default:
                0qQ.A0B("❤️", 1);
                if (j != 0) {
                    NKE nke = (NKE) this.A01;
                    NotesRepository notesRepository = nke.A0B;
                    if (notesRepository == null) {
                        str2 = "notesRepository";
                    } else {
                        String str3 = nke.A0H;
                        if (str3 == null) {
                            str2 = "promptId";
                        } else {
                            notesRepository.A0D(j, str3);
                            return;
                        }
                    }
                    0qQ.A0F(str2);
                    throw AnonymousClass00P.createAndThrow();
                }
                return;
        }
    }

    public final void AOX(long j) {
        String str;
        long j2 = j;
        switch (this.A00) {
            case 0:
                C66580MXl.A0X((AnonymousClass0eM) this.A01).A03(j);
                return;
            case 1:
                ((C72369P3i) this.A01).A05.D8J(j);
                return;
            default:
                if (j != 0) {
                    NKE nke = (NKE) this.A01;
                    ((C67756MuB) nke.A0S.getValue()).A07 = true;
                    NotesRepository notesRepository = nke.A0B;
                    if (notesRepository == null) {
                        str = "notesRepository";
                    } else {
                        String str2 = nke.A0H;
                        if (str2 == null) {
                            str = "promptId";
                        } else {
                            AnonymousClass7TE.A1Z(new NotesRepository$deleteNote$1(notesRepository, str2, (AnonymousClass4D7) null, j2), notesRepository.A01);
                            return;
                        }
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                return;
        }
    }

    public final int BWZ() {
        NotesRepository notesRepository;
        UserSession userSession;
        switch (this.A00) {
            case 0:
                C2614949u A0X = C66580MXl.A0X((AnonymousClass0eM) this.A01);
                notesRepository = A0X.A03;
                userSession = A0X.A01;
                break;
            case 1:
                return 0;
            default:
                C67756MuB muB = (C67756MuB) ((NKE) this.A01).A0S.getValue();
                notesRepository = muB.A09;
                userSession = muB.A08;
                break;
        }
        return notesRepository.A05(userSession.A06);
    }

    public final void Cls(String str) {
        if (this.A00 == 0) {
            C66580MXl.A0X((AnonymousClass0eM) this.A01).A03.A0M(str);
        }
    }

    public final void Clt(String str, String str2) {
        NotesRepository notesRepository;
        switch (this.A00) {
            case 0:
                AnonymousClass7TG.A1N(str, str2);
                notesRepository = C66580MXl.A0X((AnonymousClass0eM) this.A01).A03;
                break;
            case 1:
                return;
            default:
                AnonymousClass7TG.A1N(str, str2);
                notesRepository = ((NKE) this.A01).A0B;
                if (notesRepository == null) {
                    0qQ.A0F("notesRepository");
                    throw AnonymousClass00P.createAndThrow();
                }
                break;
        }
        notesRepository.A0O(str, str2);
    }

    public final void Dah() {
        if (2 - this.A00 == 0) {
            NKE nke = (NKE) this.A01;
            if (AnonymousClass7TF.A1Z(nke.A0O)) {
                AnonymousClass0eM r1 = nke.A0P;
                if (C67755MuA.A01(r1) instanceof C68770NWf) {
                    C69985NvP.A00(r1);
                    ((C67756MuB) nke.A0S.getValue()).A03();
                }
                IgLinearLayout igLinearLayout = nke.A05;
                if (igLinearLayout == null) {
                    0qQ.A0F("promptContextView");
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    igLinearLayout.setVisibility(8);
                }
            }
        }
    }

    public final void Dai(long j) {
        String str;
        if (2 - this.A00 == 0) {
            NKE nke = (NKE) this.A01;
            View view = nke.A01;
            if (view == null) {
                str = "separatorLine";
            } else {
                view.setVisibility(0);
                C67755MuA muA = (C67755MuA) nke.A0P.getValue();
                String str2 = nke.A0H;
                if (str2 == null) {
                    str = "promptId";
                } else {
                    long j2 = j;
                    muA.A00 = j2;
                    DbY.A19(muA, new NoteReplyViewModel$setNoteIdForPromptResponseReply$1(muA, str2, (AnonymousClass4D7) null, j2), muA.A04.A0r);
                    C67756MuB muB = (C67756MuB) nke.A0S.getValue();
                    String valueOf = String.valueOf(j2);
                    boolean A1X = AnonymousClass7TG.A1X((Boolean) muB.A04.get(valueOf));
                    LinkedHashMap A03 = 0Yt.A03(muB.A04);
                    if (!182.A06(0Tu.A05, muB.A08, 36329028118068986L)) {
                        for (Object A1R : A03.keySet()) {
                            JTP.A1R(A1R, A03, false);
                        }
                        muB.A04();
                    }
                    JTP.A1R(valueOf, A03, !A1X);
                    muB.A00 = C66581MXm.A06();
                    Iterator it = AnonymousClass7TE.A1D(muB.A03).iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        int i2 = i + 1;
                        AnonymousClass4AB r4 = (AnonymousClass4AB) it.next();
                        List list = r4.A0J;
                        String str3 = ((AnonymousClass913) list.get(0)).BWY().A0H;
                        boolean A1X2 = AnonymousClass7TG.A1X((Boolean) muB.A04.get(str3));
                        boolean A1X3 = AnonymousClass7TG.A1X((Boolean) A03.get(str3));
                        if (A1X2 != A1X3) {
                            User user = r4.A0A;
                            boolean z = r4.A0P;
                            Integer num = r4.A02;
                            String str4 = r4.A03;
                            Integer num2 = r4.A01;
                            boolean z2 = r4.A0W;
                            boolean z3 = r4.A04;
                            boolean z4 = r4.A0S;
                            boolean z5 = r4.A0O;
                            boolean z6 = r4.A0T;
                            String str5 = r4.A0G;
                            Integer num3 = r4.A0D;
                            Integer num4 = r4.A0C;
                            List list2 = r4.A0M;
                            String str6 = r4.A0H;
                            boolean z7 = r4.A0R;
                            int i3 = r4.A05;
                            NotePogVideoDict notePogVideoDict = r4.A08;
                            NotePogImageDict notePogImageDict = r4.A07;
                            String str7 = r4.A0E;
                            NoteAudience noteAudience = r4.A09;
                            boolean z8 = r4.A0X;
                            boolean z9 = r4.A0Q;
                            List list3 = r4.A0L;
                            Boolean bool = r4.A0B;
                            List list4 = r4.A0N;
                            boolean z10 = r4.A0Y;
                            boolean z11 = r4.A0V;
                            NoteCustomTheme noteCustomTheme = r4.A06;
                            List list5 = r4.A0I;
                            List list6 = r4.A0K;
                            0qQ.A0B(user, 0);
                            AnonymousClass4AB r18 = new AnonymousClass4AB(noteCustomTheme, notePogImageDict, notePogVideoDict, noteAudience, user, bool, num, num2, num3, num4, str4, str5, str6, str7, list, list2, list3, list4, list5, list6, i3, z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, A1X3);
                            ArrayList arrayList = muB.A03;
                            if (arrayList != null) {
                                arrayList.set(i, r18);
                            }
                        }
                        i = i2;
                    }
                    C71126OdL odL = muB.A0C;
                    if (odL != null) {
                        odL.A0K = false;
                        odL.A0E = null;
                    }
                    muB.A04 = A03;
                    C67756MuB.A02(muB);
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void EBA(Integer num) {
        switch (this.A00) {
            case 0:
                0qQ.A0B(num, 0);
                C66580MXl.A0X((AnonymousClass0eM) this.A01).A06(num, (Runnable) null, true);
                return;
            case 1:
                C72369P3i.A00((C72369P3i) this.A01);
                return;
            default:
                0qQ.A0B(num, 0);
                ((C67756MuB) ((NKE) this.A01).A0S.getValue()).A0A.A02(num, (Runnable) null, true);
                return;
        }
    }

    public final void DUV(String str, String str2) {
    }
}

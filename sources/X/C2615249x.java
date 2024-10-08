package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.49x  reason: invalid class name and case insensitive filesystem */
public final class C2615249x extends C252733pa {
    public String A00;
    public Map A01;
    public C262204Co A02;
    public final 1a8 A03;
    public final UserSession A04;
    public final C252743pb A05;
    public final NotesRepository A06;
    public final C251033mS A07;
    public final AnonymousClass4A0 A08;
    public final 17i A09;
    public final Set A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0r6 A0E;
    public final AnonymousClass0r6 A0F;
    public final AnonymousClass0r6 A0G;
    public final 05G A0H;
    public final 05G A0I;
    public final 05G A0J;
    public final C250993mO A0K;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2615249x(UserSession userSession, C252743pb r13, NotesRepository notesRepository) {
        super("Direct", AnonymousClass43D.A01(1889994548, 182.A06(0Tu.A05, userSession, 36323242797116440L) ? 2 : 3));
        UserSession userSession2 = userSession;
        this.A04 = userSession;
        this.A06 = notesRepository;
        this.A05 = r13;
        this.A01 = 0Yt.A0E();
        this.A0A = new LinkedHashSet();
        this.A09 = 17h.A00(userSession);
        this.A07 = C251033mS.A00(userSession);
        C250993mO A012 = C250993mO.A01(userSession);
        0qQ.A07(A012);
        this.A0K = A012;
        this.A08 = C2615449z.A00(userSession);
        this.A0B = AnonymousClass0eN.A01(new AnonymousClass9LO(this, 17));
        this.A03 = new 1a8((C269794fh) null);
        this.A0G = AnonymousClass0Zq.A00(new AnonymousClass9K1(this, (AnonymousClass4D7) null, 3));
        this.A0H = 106.A01(0sn.A00);
        this.A0J = 106.A01((Object) null);
        this.A0C = AnonymousClass0eN.A01(new AnonymousClass9LO(this, 18));
        this.A0E = notesRepository.A0e;
        this.A0F = notesRepository.A0g;
        this.A0I = 106.A01(AnonymousClass4A2.A03(userSession.A03.A06(), userSession2, false, false, false, false, false));
        this.A0D = AnonymousClass0eN.A01(new AnonymousClass9LO(this, 19));
        A00();
        notesRepository.A0C();
        AnonymousClass11O.A03(this.A01, new C61860pz(new C376959Jz(this, (AnonymousClass4D7) null, 43), notesRepository.A0k));
    }

    private final void A00() {
        UserSession userSession = this.A04;
        if (AnonymousClass4AJ.A01(userSession) && !182.A06(0Tu.A05, userSession, 36327576419711514L)) {
            C262204Co r0 = this.A02;
            if (r0 == null || !r0.isActive()) {
                C262224Cq r3 = this.A01;
                C376879Jr r2 = new C376879Jr(this, (AnonymousClass4D7) null, 21);
                this.A02 = 1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, r3);
            }
        }
    }

    public static final void A01(C290645fe r3, C2615249x r4) {
        List list = r3.A01("direct_inbox_active_now").A02;
        ArrayList<DirectShareTarget> arrayList = new ArrayList<>();
        for (Object next : list) {
            List unmodifiableList = Collections.unmodifiableList(((DirectShareTarget) next).A0Q);
            if (unmodifiableList != null && !unmodifiableList.isEmpty()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(0Yv.A1E(arrayList, 10));
        for (DirectShareTarget directShareTarget : arrayList) {
            List unmodifiableList2 = Collections.unmodifiableList(directShareTarget.A0Q);
            0qQ.A07(unmodifiableList2);
            String str = ((PendingRecipient) 00k.A0I(unmodifiableList2)).A0B;
            if (str == null) {
                str = "";
            }
            arrayList2.add(str);
        }
        05G r1 = r4.A0H;
        if (!0qQ.A0K(r1.getValue(), arrayList2)) {
            r1.Epw(arrayList2);
        }
    }

    public final void A02(Integer num, Runnable runnable, boolean z) {
        A00();
        this.A06.A0K(num, runnable, z, false);
        if (182.A06(0Tu.A06, this.A04, 36324329423843335L)) {
            C252743pb r4 = this.A05;
            C262204Co r0 = r4.A01;
            if (r0 != null && r0.isActive()) {
                return;
            }
            if (z || r4.A00 + C252743pb.A07 < System.currentTimeMillis()) {
                C262224Cq r3 = r4.A01;
                C376909Ju r2 = new C376909Ju(r4, (AnonymousClass4D7) null, 8);
                r4.A01 = 1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, r3);
            }
        }
    }
}

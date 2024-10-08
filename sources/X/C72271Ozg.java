package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.direct.inbox.notes.ui.NoteAvatarView;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Ozg  reason: case insensitive filesystem */
public final class C72271Ozg implements C250603lj {
    public AnonymousClass4AB A00;
    public final UserSession A01;
    public final NotesRepository A02;
    public final WeakReference A03;
    public final float A04;
    public final long A05;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: X.4zZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: X.4zZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: X.4zZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: X.4zZ} */
    /* JADX WARNING: type inference failed for: r2v2, types: [X.0r1, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ATF(X.AnonymousClass30Y r27, X.C252093oY r28) {
        /*
            r26 = this;
            r4 = 0
            r11 = r27
            r10 = r28
            boolean r9 = X.AnonymousClass7TF.A1U(r4, r11, r10)
            int r0 = X.C51968G9o.A0A(r11, r10)
            if (r0 == r4) goto L_0x0038
            r8 = 0
            r12 = r26
            if (r0 == r9) goto L_0x0043
            X.4AB r7 = r12.A00
            if (r7 == 0) goto L_0x0038
            com.instagram.common.session.UserSession r0 = r12.A01
            X.60k r6 = X.C3018660j.A01(r0)
            long r2 = r10.B0M(r11)
            com.instagram.common.session.UserSession r5 = r6.A06
            X.0Tu r4 = X.DbS.A0J(r5, r4)
            r0 = 36327739627813531(0x810fe300023a9b, double:3.0371470484709477E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x0039
            r6.A0M(r7, r2)
        L_0x0036:
            r12.A00 = r8
        L_0x0038:
            return
        L_0x0039:
            java.util.List r1 = r6.A0C
            X.0eP r0 = X.AnonymousClass7TF.A0y(r7, r2)
            r1.add(r0)
            goto L_0x0036
        L_0x0043:
            java.lang.ref.WeakReference r0 = r12.A03
            r21 = r0
            java.lang.Object r0 = r21.get()
            if (r0 == 0) goto L_0x0153
            java.lang.Object r1 = r11.A03
            X.4AB r1 = (X.AnonymousClass4AB) r1
            java.util.List r5 = r1.A0J
            boolean r0 = X.AnonymousClass7TE.A1b(r5)
            if (r0 == 0) goto L_0x0153
            com.instagram.common.session.UserSession r15 = r12.A01
            X.0xa r0 = X.AnonymousClass7TE.A0q(r15)
            java.lang.String r7 = "has_seen_prompt_note_flywheel_animation"
            boolean r0 = r0.getBoolean(r7, r4)
            if (r0 != 0) goto L_0x0153
            long r13 = r10.B0M(r11)
            r2 = 2500(0x9c4, double:1.235E-320)
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x0153
            float r0 = r10.CFe(r11)
            r6 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0153
            java.lang.Object r5 = r5.get(r4)
            X.913 r5 = (X.AnonymousClass913) r5
            X.4zZ r0 = r5.BWY()
            X.5y2 r0 = r0.A0A
            if (r0 == 0) goto L_0x0179
            X.60F r0 = r0.A0B
            if (r0 == 0) goto L_0x0179
            java.lang.String r4 = r0.A03
        L_0x008f:
            java.lang.String r24 = ""
            if (r4 != 0) goto L_0x0095
            r4 = r24
        L_0x0095:
            java.lang.String r1 = r1.A0G
            com.instagram.direct.inbox.notes.NotesRepository r0 = r12.A02
            X.0Ud r0 = r0.A0r
            java.lang.Object r0 = X.JTR.A0z(r1, r0)
            X.4zc r0 = (X.C279894zc) r0
            if (r0 == 0) goto L_0x0153
            java.util.List r0 = r0.A05
            if (r0 == 0) goto L_0x0153
            java.util.Iterator r3 = r0.iterator()
        L_0x00ab:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00c3
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.4zZ r0 = (X.C279864zZ) r0
            java.lang.String r0 = r0.A0K
            boolean r0 = X.C51966G9m.A1W(r15, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00ab
            r8 = r2
        L_0x00c3:
            X.4zZ r8 = (X.C279864zZ) r8
            if (r8 == 0) goto L_0x0153
            int r3 = r8.A01
            com.instagram.direct.inbox.notes.models.NoteStyle r0 = com.instagram.direct.inbox.notes.models.NoteStyle.MUSIC
            int r0 = r0.A00
            if (r3 == r0) goto L_0x00d5
            com.instagram.direct.inbox.notes.models.NoteStyle r0 = com.instagram.direct.inbox.notes.models.NoteStyle.TEXT
            int r0 = r0.A00
            if (r3 != r0) goto L_0x0153
        L_0x00d5:
            java.util.List r19 = X.AnonymousClass7TE.A1I(r8)
            r16 = r1
            if (r1 != 0) goto L_0x00df
            r16 = r24
        L_0x00df:
            r18 = 0
            r17 = r4
            r20 = r18
            java.util.List r0 = X.AnonymousClass911.A03(r15, r16, r17, r18, r19, r20)
            java.lang.Object r0 = X.00k.A0J(r0)
            X.4AB r0 = (X.AnonymousClass4AB) r0
            r12.A00 = r0
            if (r1 == 0) goto L_0x00f5
            r24 = r1
        L_0x00f5:
            r14 = 0
            android.view.animation.AlphaAnimation r13 = new android.view.animation.AlphaAnimation
            r13.<init>(r14, r6)
            r1 = 250(0xfa, double:1.235E-321)
            r13.setDuration(r1)
            android.view.animation.AlphaAnimation r0 = new android.view.animation.AlphaAnimation
            r0.<init>(r6, r14)
            r0.setDuration(r1)
            java.lang.Object r1 = r21.get()
            com.instagram.direct.inbox.notes.ui.NoteAvatarView r1 = (com.instagram.direct.inbox.notes.ui.NoteAvatarView) r1
            if (r1 == 0) goto L_0x011b
            com.instagram.direct.inbox.notes.ui.NoteBubbleView r1 = r1.getNoteBubbleView()
            com.instagram.common.ui.base.IgTextView r1 = r1.getTextView()
            r1.startAnimation(r0)
        L_0x011b:
            X.0r1 r2 = new X.0r1
            r2.<init>()
            r2.A00 = r9
            X.Okw r1 = new X.Okw
            r22 = r2
            r23 = r3
            r18 = r8
            r19 = r5
            r20 = r12
            r21 = r4
            r17 = r13
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            r0.setAnimationListener(r1)
            X.Okv r1 = new X.Okv
            r20 = r1
            r21 = r0
            r22 = r8
            r23 = r12
            r25 = r2
            r20.<init>(r21, r22, r23, r24, r25)
            r13.setAnimationListener(r1)
            X.0xa r0 = X.AnonymousClass7TE.A0q(r15)
            X.DbX.A1V(r0, r7, r9)
        L_0x0153:
            X.4AB r5 = r12.A00
            if (r5 == 0) goto L_0x0038
            long r3 = r10.B0M(r11)
            long r1 = r12.A05
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0038
            float r1 = r10.CFe(r11)
            float r0 = r12.A04
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0038
            com.instagram.common.session.UserSession r0 = r12.A01
            X.60k r2 = X.C3018660j.A01(r0)
            long r0 = r10.B0M(r11)
            r2.A0N(r5, r0)
            return
        L_0x0179:
            r4 = r8
            goto L_0x008f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72271Ozg.ATF(X.30Y, X.3oY):void");
    }

    public C72271Ozg(UserSession userSession, NotesRepository notesRepository, NoteAvatarView noteAvatarView) {
        AnonymousClass7TG.A1U(userSession, notesRepository, noteAvatarView);
        this.A01 = userSession;
        this.A02 = notesRepository;
        this.A03 = C51965G9l.A0v(noteAvatarView);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        0Tu r4 = 0Tu.A05;
        this.A05 = timeUnit.toMillis((long) 182.A00(r4, userSession, 37166980532404669L));
        this.A04 = (float) 182.A00(r4, userSession, 37166980532339132L);
    }
}

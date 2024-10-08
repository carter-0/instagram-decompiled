package X;

import android.media.MediaPlayer;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.bottomsheet.BottomSheetViewController;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import java.util.Locale;

/* renamed from: X.LQi  reason: case insensitive filesystem */
public final class C64145LQi {
    public MediaPlayer A00;
    public BottomSheetViewController A01;
    public AnonymousClass5MI A02;
    public String A03;
    public String A04;
    public final ViewGroup A05;
    public final AnonymousClass4DH A06;
    public final UserSession A07;
    public final A9J A08 = new Object();
    public final ClipsCreationViewModel A09;
    public final L0Z A0A;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C64145LQi r3, java.lang.String r4) {
        /*
            android.media.MediaPlayer r1 = r3.A00
            if (r1 == 0) goto L_0x002b
            boolean r0 = r1.isPlaying()     // Catch:{ FileNotFoundException -> 0x0018, IllegalStateException -> 0x001c, IOException -> 0x0014 }
            if (r0 != 0) goto L_0x002b
            r1.setDataSource(r4)     // Catch:{ FileNotFoundException -> 0x0018, IllegalStateException -> 0x001c, IOException -> 0x0014 }
            r1.prepare()     // Catch:{ FileNotFoundException -> 0x0018, IllegalStateException -> 0x001c, IOException -> 0x0014 }
            r1.start()     // Catch:{ FileNotFoundException -> 0x0018, IllegalStateException -> 0x001c, IOException -> 0x0014 }
            return
        L_0x0014:
            r2 = move-exception
            java.lang.String r1 = "playTtsAudio-> IOException"
            goto L_0x001f
        L_0x0018:
            r2 = move-exception
            java.lang.String r1 = "playTtsAudio-> FileNotFoundException"
            goto L_0x001f
        L_0x001c:
            r2 = move-exception
            java.lang.String r1 = "playTtsAudio-> IllegalStateException"
        L_0x001f:
            android.media.MediaPlayer r0 = r3.A00
            if (r0 == 0) goto L_0x0026
            r0.reset()
        L_0x0026:
            java.lang.String r0 = "TextToSpeechController"
            X.0kD.A07(r0, r1, r2)
        L_0x002b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64145LQi.A00(X.LQi, java.lang.String):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: X.8IM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: X.8IM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: X.8IM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: X.8IM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: X.8IM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: X.8IM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: X.8IM} */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0098: MOVE  (r1v2 X.Jkb) = (r1v0 X.Jkb)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    public static final void A01(X.C64145LQi r13, java.lang.String r14) {
        /*
            X.A9J r6 = r13.A08
            java.util.List r0 = r6.A00()
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r4 = r0.iterator()
            r3 = 0
        L_0x000f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x004e
            java.lang.Object r2 = r4.next()
            int r1 = r3 + 1
            if (r3 >= 0) goto L_0x0025
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0025:
            com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption r2 = (com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption) r2
            java.lang.String r8 = r2.A00
            java.util.Map r0 = r6.A01()
            java.lang.String r9 = X.DbT.A11(r2, r0)
            if (r3 != 0) goto L_0x0049
            if (r14 == 0) goto L_0x003c
            int r0 = r14.length()
            r11 = 0
            if (r0 != 0) goto L_0x003d
        L_0x003c:
            r11 = 1
        L_0x003d:
            r10 = 0
            X.Jyd r7 = new X.Jyd
            r12 = r10
            r7.<init>(r8, r9, r10, r11, r12)
            r5.add(r7)
            r3 = r1
            goto L_0x000f
        L_0x0049:
            boolean r11 = X.0qQ.A0K(r14, r8)
            goto L_0x003d
        L_0x004e:
            com.instagram.creation.capture.quickcapture.sundial.bottomsheet.BottomSheetViewController r0 = r13.A01
            if (r0 == 0) goto L_0x00e2
            X.MXJ r4 = r0.A03
            boolean r0 = r4 instanceof X.C65059Lmd
            if (r0 == 0) goto L_0x00e0
            X.Lmd r4 = (X.C65059Lmd) r4
            if (r4 == 0) goto L_0x00e0
            r6 = 0
            X.8IM r0 = r4.A01
            r3 = 0
            r9 = 0
            if (r0 != 0) goto L_0x0088
            java.util.Iterator r8 = r5.iterator()
            r7 = r9
            r2 = 0
        L_0x0069:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0081
            java.lang.Object r1 = r8.next()
            r0 = r1
            X.8IM r0 = (X.AnonymousClass8IM) r0
            boolean r0 = r0.CbS()
            if (r0 == 0) goto L_0x0069
            if (r2 != 0) goto L_0x0083
            r7 = r1
            r2 = 1
            goto L_0x0069
        L_0x0081:
            if (r2 != 0) goto L_0x0084
        L_0x0083:
            r7 = r9
        L_0x0084:
            X.8IM r7 = (X.AnonymousClass8IM) r7
            r4.A01 = r7
        L_0x0088:
            boolean r0 = X.DbT.A1b(r5)
            if (r0 == 0) goto L_0x00e0
            androidx.recyclerview.widget.RecyclerView r0 = r4.A00()
            X.2Rw r1 = r0.A0A
            boolean r0 = r1 instanceof X.C60382Jkb
            if (r0 == 0) goto L_0x009f
            X.Jkb r1 = (X.C60382Jkb) r1
            if (r1 == 0) goto L_0x009f
            r1.A00(r5)
        L_0x009f:
            androidx.recyclerview.widget.RecyclerView r0 = r4.A00()
            r0.setVisibility(r6)
            androidx.recyclerview.widget.RecyclerView r0 = r4.A00()
            X.3pI r2 = r0.A0D
            java.lang.String r0 = "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"
            X.0qQ.A0C(r2, r0)
            androidx.recyclerview.widget.LinearLayoutManager r2 = (androidx.recyclerview.widget.LinearLayoutManager) r2
            java.util.Iterator r1 = r5.iterator()
        L_0x00b7:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00cc
            java.lang.Object r0 = r1.next()
            X.8IM r0 = (X.AnonymousClass8IM) r0
            boolean r0 = r0.CbS()
            if (r0 != 0) goto L_0x00cd
            int r3 = r3 + 1
            goto L_0x00b7
        L_0x00cc:
            r3 = -1
        L_0x00cd:
            int r0 = r2.A1a()
            if (r3 < r0) goto L_0x00d9
            int r0 = r2.A1b()
            if (r3 <= r0) goto L_0x00e0
        L_0x00d9:
            androidx.recyclerview.widget.RecyclerView r0 = r4.A00()
            r0.A0o(r3)
        L_0x00e0:
            r13.A04 = r14
        L_0x00e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64145LQi.A01(X.LQi, java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.A9J, java.lang.Object] */
    public C64145LQi(ViewGroup viewGroup, AnonymousClass4DH r5, UserSession userSession, ClipsCreationViewModel clipsCreationViewModel, L0Z l0z) {
        2Fk r2;
        this.A06 = r5;
        this.A0A = l0z;
        this.A09 = clipsCreationViewModel;
        this.A05 = viewGroup;
        this.A07 = userSession;
        0qQ.A08(Locale.US);
        if (clipsCreationViewModel != null && (r2 = clipsCreationViewModel.A0E) != null) {
            Dba.A15(r5, r2, JTO.A1C(this, 47), 6);
        }
    }
}

package X;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

/* renamed from: X.Okw  reason: case insensitive filesystem */
public final class C71457Okw implements Animation.AnimationListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AlphaAnimation A01;
    public final /* synthetic */ C279864zZ A02;
    public final /* synthetic */ AnonymousClass913 A03;
    public final /* synthetic */ C72271Ozg A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ 0r1 A06;

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public C71457Okw(AlphaAnimation alphaAnimation, C279864zZ r2, AnonymousClass913 r3, C72271Ozg ozg, String str, 0r1 r6, int i) {
        this.A06 = r6;
        this.A04 = ozg;
        this.A05 = str;
        this.A03 = r3;
        this.A00 = i;
        this.A02 = r2;
        this.A01 = alphaAnimation;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002a, code lost:
        if (X.0mp.A00(r0) > 3) goto L_0x002c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAnimationEnd(android.view.animation.Animation r12) {
        /*
            r11 = this;
            X.0r1 r0 = r11.A06
            boolean r0 = r0.A00
            r4 = 3
            if (r0 != 0) goto L_0x0049
            X.Ozg r2 = r11.A04
            java.lang.ref.WeakReference r0 = r2.A03
            java.lang.Object r1 = r0.get()
            com.instagram.direct.inbox.notes.ui.NoteAvatarView r1 = (com.instagram.direct.inbox.notes.ui.NoteAvatarView) r1
            if (r1 == 0) goto L_0x0033
            java.lang.String r0 = r11.A05
        L_0x0015:
            com.instagram.common.session.UserSession r2 = r2.A01
            java.lang.CharSequence r5 = X.C66889MeU.A04(r2, r0)
            X.913 r2 = r11.A03
            X.4zZ r2 = r2.BWY()
            boolean r2 = r2.A0Q
            if (r2 == 0) goto L_0x002c
            int r0 = X.0mp.A00(r0)
            r3 = 1
            if (r0 <= r4) goto L_0x002d
        L_0x002c:
            r3 = 0
        L_0x002d:
            r2 = 0
            java.lang.String r0 = ""
            r1.setPromptBubbleContent(r5, r3, r0, r2)
        L_0x0033:
            X.Ozg r0 = r11.A04
            java.lang.ref.WeakReference r0 = r0.A03
            java.lang.Object r0 = r0.get()
            com.instagram.direct.inbox.notes.ui.NoteAvatarView r0 = (com.instagram.direct.inbox.notes.ui.NoteAvatarView) r0
            if (r0 == 0) goto L_0x0048
            com.instagram.direct.inbox.notes.ui.NoteBubbleView r1 = r0.getNoteBubbleView()
            android.view.animation.AlphaAnimation r0 = r11.A01
            r1.startAnimation(r0)
        L_0x0048:
            return
        L_0x0049:
            int r1 = r11.A00
            com.instagram.direct.inbox.notes.models.NoteStyle r0 = com.instagram.direct.inbox.notes.models.NoteStyle.MUSIC
            int r0 = r0.A00
            if (r1 != r0) goto L_0x0098
            X.4zZ r4 = r11.A02
            X.5y2 r0 = r4.A0A
            if (r0 == 0) goto L_0x0033
            com.instagram.api.schemas.MusicNoteResponseInfo r0 = r0.A07
            if (r0 == 0) goto L_0x0033
            com.instagram.api.schemas.MusicInfo r3 = r0.A00
            if (r3 == 0) goto L_0x0033
            X.Ozg r2 = r11.A04
            java.lang.ref.WeakReference r0 = r2.A03
            java.lang.Object r5 = r0.get()
            com.instagram.direct.inbox.notes.ui.NoteAvatarView r5 = (com.instagram.direct.inbox.notes.ui.NoteAvatarView) r5
            if (r5 == 0) goto L_0x0033
            com.instagram.api.schemas.TrackData r0 = r3.BUk()
            java.lang.String r6 = r0.getDisplayArtist()
            java.lang.String r1 = ""
            if (r6 != 0) goto L_0x0078
            r6 = r1
        L_0x0078:
            com.instagram.api.schemas.TrackData r0 = r3.BUk()
            java.lang.String r7 = r0.getTitle()
            if (r7 != 0) goto L_0x0083
            r7 = r1
        L_0x0083:
            java.lang.String r1 = r4.A0J
            com.instagram.common.session.UserSession r0 = r2.A01
            java.lang.CharSequence r8 = X.C66889MeU.A04(r0, r1)
            com.instagram.api.schemas.TrackData r0 = r3.BUk()
            boolean r9 = r0.isExplicit()
            r10 = 0
            r5.setMusicBubbleContent(r6, r7, r8, r9, r10)
            goto L_0x0033
        L_0x0098:
            com.instagram.direct.inbox.notes.models.NoteStyle r0 = com.instagram.direct.inbox.notes.models.NoteStyle.TEXT
            int r0 = r0.A00
            if (r1 != r0) goto L_0x0033
            X.Ozg r2 = r11.A04
            java.lang.ref.WeakReference r0 = r2.A03
            java.lang.Object r1 = r0.get()
            com.instagram.direct.inbox.notes.ui.NoteAvatarView r1 = (com.instagram.direct.inbox.notes.ui.NoteAvatarView) r1
            if (r1 == 0) goto L_0x0033
            X.4zZ r0 = r11.A02
            java.lang.String r0 = r0.A0J
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71457Okw.onAnimationEnd(android.view.animation.Animation):void");
    }
}

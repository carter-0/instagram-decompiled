package X;

import com.instagram.direct.inbox.notes.ui.NoteAvatarView;

/* renamed from: X.PVw  reason: case insensitive filesystem */
public final class C73089PVw implements Runnable {
    public final /* synthetic */ NoteAvatarView A00;

    public C73089PVw(NoteAvatarView noteAvatarView) {
        this.A00 = noteAvatarView;
    }

    public final void run() {
        int[] iArr = new int[2];
        NoteAvatarView noteAvatarView = this.A00;
        noteAvatarView.A0H.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        noteAvatarView.A07.getLocationInWindow(iArr2);
        if (iArr[0] > -1 && iArr[1] > -1) {
            int i = ((-((noteAvatarView.A07.getWidth() + iArr2[0]) - noteAvatarView.A0H.getWidth())) / 2) + iArr[0];
            int i2 = ((-noteAvatarView.A07.getHeight()) - iArr2[1]) + iArr[1];
            noteAvatarView.A07.setTranslationX((float) i);
            noteAvatarView.A07.setTranslationY((float) i2);
            AnonymousClass61R r1 = noteAvatarView.A03;
            if (r1 != null) {
                r1.A8s(new C69202Nh0(noteAvatarView, 1));
            }
            AnonymousClass61R r0 = noteAvatarView.A03;
            if (r0 != null) {
                r0.E2p();
            }
        }
    }
}

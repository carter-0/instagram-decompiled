package X;

import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.Tqu  reason: case insensitive filesystem */
public final class C14158Tqu implements Runnable {
    public final /* synthetic */ C279864zZ A00;
    public final /* synthetic */ NotesRepository A01;
    public final /* synthetic */ UserDetailFragment A02;
    public final /* synthetic */ String A03;

    public C14158Tqu(C279864zZ r1, NotesRepository notesRepository, UserDetailFragment userDetailFragment, String str) {
        this.A02 = userDetailFragment;
        this.A00 = r1;
        this.A01 = notesRepository;
        this.A03 = str;
    }

    public final void run() {
        UserDetailFragment userDetailFragment = this.A02;
        C279864zZ r1 = this.A00;
        UserDetailFragment.A0O(r1, userDetailFragment);
        if (C322606w6.A01(userDetailFragment.A0I)) {
            NotesRepository notesRepository = this.A01;
            String str = this.A03;
            notesRepository.A0I(r1, str);
            Pxe.A1X(str, C3252571r.A00(userDetailFragment.A0I).A01, System.currentTimeMillis());
        }
    }
}

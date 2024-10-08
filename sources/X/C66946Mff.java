package X;

import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.Mff  reason: case insensitive filesystem */
public final /* synthetic */ class C66946Mff implements 0sP {
    public final /* synthetic */ NotesRepository A00;
    public final /* synthetic */ UserDetailFragment A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ C66946Mff(NotesRepository notesRepository, UserDetailFragment userDetailFragment, String str) {
        this.A01 = userDetailFragment;
        this.A00 = notesRepository;
        this.A02 = str;
    }

    public final Object invoke(Object obj) {
        UserDetailFragment userDetailFragment = this.A01;
        NotesRepository notesRepository = this.A00;
        C61046Jvk jvk = (C61046Jvk) obj;
        C279864zZ r2 = (C279864zZ) notesRepository.A0I.get(this.A02);
        if (r2 != null && r2.A0H.equals(jvk.A00)) {
            UserDetailFragment.A0O(r2, userDetailFragment);
        }
        return C60340gF.A00;
    }
}

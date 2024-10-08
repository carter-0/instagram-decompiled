package X;

import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.Tqt  reason: case insensitive filesystem */
public final class C14157Tqt extends 1P0 {
    public final /* synthetic */ NotesRepository A00;
    public final /* synthetic */ UserDetailFragment A01;
    public final /* synthetic */ String A02;

    public C14157Tqt(NotesRepository notesRepository, UserDetailFragment userDetailFragment, String str) {
        this.A01 = userDetailFragment;
        this.A00 = notesRepository;
        this.A02 = str;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(2019383494);
        C324616zc r7 = (C324616zc) obj;
        int A032 = AnonymousClass0fD.A03(-716900640);
        C14157Tqt.super.onSuccess(r7);
        UserDetailFragment userDetailFragment = this.A01;
        UserDetailFragment.A0O(r7.A00, userDetailFragment);
        if (C322606w6.A01(userDetailFragment.A0I)) {
            NotesRepository notesRepository = this.A00;
            String str = this.A02;
            notesRepository.A0I(r7.A00, str);
            Pxe.A1X(str, C3252571r.A00(userDetailFragment.A0I).A01, System.currentTimeMillis());
        }
        AnonymousClass0fD.A0A(-1986295805, A032);
        AnonymousClass0fD.A0A(979793977, A03);
    }
}

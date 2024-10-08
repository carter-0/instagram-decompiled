package X;

import com.instagram.direct.inbox.notes.NotesApi;
import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.direct.inbox.notes.OptimisticNetworkOperation;

public final class NWO extends OptimisticNetworkOperation {
    public int A00;
    public C279864zZ A01;
    public final long A02;
    public final String A03;
    public final String A04;
    public final NotesApi A05;
    public final /* synthetic */ NotesRepository A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NWO(NotesApi notesApi, NotesRepository notesRepository, String str, String str2, long j) {
        super(notesApi);
        C51972G9s.A1C(notesApi, str);
        this.A06 = notesRepository;
        this.A05 = notesApi;
        this.A02 = j;
        this.A03 = str;
        this.A04 = str2;
    }
}

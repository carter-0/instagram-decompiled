package X;

import com.instagram.direct.inbox.notes.NotesApi;
import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.direct.inbox.notes.OptimisticNetworkOperation;

public final class NWL extends OptimisticNetworkOperation {
    public int A00;
    public C279864zZ A01;
    public final long A02;
    public final NotesRepository A03;
    public final String A04;
    public final NotesApi A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NWL(NotesApi notesApi, NotesRepository notesRepository, String str, long j) {
        super(notesApi);
        0qQ.A0B(notesApi, 1);
        this.A05 = notesApi;
        this.A03 = notesRepository;
        this.A02 = j;
        this.A04 = str;
    }
}

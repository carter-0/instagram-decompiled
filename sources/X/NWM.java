package X;

import com.instagram.direct.inbox.notes.NotesApi;
import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.direct.inbox.notes.OptimisticNetworkOperation;

public final class NWM extends OptimisticNetworkOperation {
    public int A00;
    public C279864zZ A01;
    public final long A02;
    public final String A03;
    public final NotesApi A04;
    public final /* synthetic */ NotesRepository A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NWM(NotesApi notesApi, NotesRepository notesRepository, String str, long j) {
        super(notesApi);
        0qQ.A0B(notesApi, 2);
        this.A05 = notesRepository;
        this.A04 = notesApi;
        this.A02 = j;
        this.A03 = str;
    }
}

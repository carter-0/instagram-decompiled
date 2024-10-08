package X;

import com.instagram.direct.inbox.notes.NotesApi;
import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.direct.inbox.notes.OptimisticNetworkOperation;

public final class NWN extends OptimisticNetworkOperation {
    public int A00;
    public C279864zZ A01;
    public final long A02;
    public final NotesRepository A03;
    public final String A04;
    public final String A05;
    public final NotesApi A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NWN(NotesApi notesApi, NotesRepository notesRepository, String str, String str2, long j) {
        super(notesApi);
        C51972G9s.A1B(notesApi, str);
        this.A06 = notesApi;
        this.A03 = notesRepository;
        this.A02 = j;
        this.A04 = str;
        this.A05 = str2;
    }
}

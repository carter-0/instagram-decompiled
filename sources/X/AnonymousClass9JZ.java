package X;

import com.instagram.avatars.store.AvatarStore;
import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.mainfeed.network.flashfeed.FlashFeedCache;

/* renamed from: X.9JZ  reason: invalid class name */
public final class AnonymousClass9JZ extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public boolean A03;
    public final int A04;
    public final Object A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9JZ(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A04 = i;
        this.A05 = obj;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.4D7, X.9JZ] */
    public final Object invokeSuspend(Object obj) {
        int i = this.A04;
        this.A02 = obj;
        this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        Object obj2 = this.A05;
        switch (i) {
            case 0:
                return ((AvatarStore) obj2).A02(this, false, false);
            case 1:
                return ((NotesRepository) obj2).A0A(this, false);
            default:
                return FlashFeedCache.A01((FlashFeedCache) obj2, this, false, false);
        }
    }
}

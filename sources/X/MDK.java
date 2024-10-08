package X;

import com.instagram.user.model.UpcomingEvent;
import com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository", f = "IgLiveExploreRepository.kt", i = {0, 0, 0, 0, 0}, l = {116}, m = "locallyUpdateUpcomingEventReminderStatus", n = {"this", "upcomingEvent", "eventList", "reminderOn", "index$iv"}, s = {"L$0", "L$1", "L$2", "Z$0", "I$0"})
public final class MDK extends C64101El {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public boolean A06;
    public /* synthetic */ Object A07;
    public final /* synthetic */ IgLiveExploreRepository A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MDK(IgLiveExploreRepository igLiveExploreRepository, AnonymousClass4D7 r2) {
        super(r2);
        this.A08 = igLiveExploreRepository;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.MDK, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        this.A07 = obj;
        this.A01 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        return IgLiveExploreRepository.A00((UpcomingEvent) null, this.A08, this, false);
    }
}

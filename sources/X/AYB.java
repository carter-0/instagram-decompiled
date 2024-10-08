package X;

import com.instagram.video.live.mvvm.model.repository.IgLiveQuestionSubmissionsRepository;

public final class AYB implements 1wn {
    public final /* synthetic */ IgLiveQuestionSubmissionsRepository A00;

    public AYB(IgLiveQuestionSubmissionsRepository igLiveQuestionSubmissionsRepository) {
        this.A00 = igLiveQuestionSubmissionsRepository;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1808405857);
        C390099qj r9 = (C390099qj) obj;
        int A032 = AnonymousClass0fD.A03(461400673);
        0qQ.A0B(r9, 0);
        IgLiveQuestionSubmissionsRepository igLiveQuestionSubmissionsRepository = this.A00;
        int i = r9.A00;
        05G r4 = igLiveQuestionSubmissionsRepository.A05;
        igLiveQuestionSubmissionsRepository.A00 = i;
        r4.Epw(new AnonymousClass9I5(r9.A01, ((AnonymousClass9I5) r4.getValue()).A00 + Math.max(0, i - igLiveQuestionSubmissionsRepository.A00), 2));
        AnonymousClass0fD.A0A(-1061779587, A032);
        AnonymousClass0fD.A0A(1217591722, A03);
    }
}

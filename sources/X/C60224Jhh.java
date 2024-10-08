package X;

import com.instagram.closefriends.audiencelists.model.AudienceListViewModel;
import com.instagram.closefriends.audiencelists.repository.AudienceListsListRepository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.Jhh  reason: case insensitive filesystem */
public final class C60224Jhh extends 2YL {
    public final 2Fk A00;
    public final AudienceListsListRepository A01;

    public final void A00(AudienceListViewModel audienceListViewModel, boolean z) {
        05G r2 = this.A01.A01;
        List<AudienceListViewModel> A16 = JTO.A16(r2);
        if (!(A16 instanceof Collection) || !A16.isEmpty()) {
            for (AudienceListViewModel audienceListViewModel2 : A16) {
                String str = audienceListViewModel2.A01;
                String str2 = audienceListViewModel.A01;
                if (0qQ.A0K(str, str2)) {
                    ArrayList A0r = AnonymousClass7TG.A0r(A16);
                    for (AudienceListViewModel audienceListViewModel3 : A16) {
                        if (0qQ.A0K(audienceListViewModel3.A01, str2)) {
                            if (z) {
                                audienceListViewModel3 = audienceListViewModel;
                            } else {
                                audienceListViewModel3 = new AudienceListViewModel(str2, audienceListViewModel.A02, audienceListViewModel.A03, audienceListViewModel.A00, audienceListViewModel.A05, audienceListViewModel.A06, audienceListViewModel3.A04);
                            }
                        }
                        A0r.add(audienceListViewModel3);
                    }
                    r2.Epw(A0r);
                    return;
                }
            }
        }
    }

    public C60224Jhh(AudienceListsListRepository audienceListsListRepository) {
        this.A01 = audienceListsListRepository;
        this.A00 = DbT.A0G(C66193MHj.A01(audienceListsListRepository.A02, audienceListsListRepository.A03, 5));
    }
}

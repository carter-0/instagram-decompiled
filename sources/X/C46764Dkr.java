package X;

import com.instagram.hallpass.model.HallPassViewModel;
import com.instagram.hallpass.repository.HallPassRepository;
import java.util.ArrayList;

/* renamed from: X.Dkr  reason: case insensitive filesystem */
public final class C46764Dkr extends 2YL {
    public final 2Fk A00;
    public final HallPassRepository A01;

    public final void A00(String str) {
        0qQ.A0B(str, 0);
        05G r3 = this.A01.A00;
        Iterable<HallPassViewModel> iterable = (Iterable) r3.getValue();
        ArrayList A0r = AnonymousClass7TG.A0r(iterable);
        for (HallPassViewModel hallPassViewModel : iterable) {
            String str2 = hallPassViewModel.A04;
            A0r.add(new HallPassViewModel(str2, hallPassViewModel.A05, hallPassViewModel.A03, hallPassViewModel.A06, hallPassViewModel.A01, hallPassViewModel.A02, 0qQ.A0K(str2, str)));
        }
        r3.Epw(A0r);
    }

    public C46764Dkr(HallPassRepository hallPassRepository) {
        this.A01 = hallPassRepository;
        this.A00 = DbT.A0G(AnonymousClass10H.A03(new C66193MHj(26, (AnonymousClass4D7) null), hallPassRepository.A02, hallPassRepository.A01));
    }
}

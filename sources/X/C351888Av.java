package X;

import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository;
import java.util.ArrayList;

/* renamed from: X.8Av  reason: invalid class name and case insensitive filesystem */
public final class C351888Av {
    public final /* synthetic */ ClipsCreationDraftViewModel A00;

    public C351888Av(ClipsCreationDraftViewModel clipsCreationDraftViewModel) {
        this.A00 = clipsCreationDraftViewModel;
    }

    public final C359548d5 A00() {
        ArrayList arrayList = this.A00.A0H.A05.A01;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (C359548d5) ((0eP) 00k.A0K(arrayList)).A00;
    }

    public final 0eP A01(boolean z) {
        0eP r2;
        ClipsCreationDraftViewModel clipsCreationDraftViewModel = this.A00;
        ClipsDraftRepository clipsDraftRepository = clipsCreationDraftViewModel.A0H;
        C361348g5 r6 = clipsDraftRepository.A05;
        ArrayList arrayList = r6.A01;
        if (arrayList.isEmpty()) {
            r2 = null;
        } else {
            r2 = (0eP) 018.A15(arrayList);
            05G r1 = r6.A03;
            r1.Epw(Integer.valueOf(((Number) r1.getValue()).intValue() - 1));
        }
        if (r2 == null) {
            return null;
        }
        if (z) {
            C293505kq A01 = ClipsCreationDraftViewModel.A01(clipsCreationDraftViewModel);
            if (A01 == null) {
                0kD.A07("ClipsCreationDraftViewModel", "Draft Snapshot is null when undo triggers redo snapshot", (Throwable) null);
                return null;
            }
            Object obj = r2.A00;
            0qQ.A0B(obj, 0);
            ArrayList arrayList2 = r6.A00;
            if (arrayList2.size() >= 20) {
                018.A13(arrayList2);
                05G r12 = r6.A02;
                r12.Epw(Integer.valueOf(((Number) r12.getValue()).intValue() - 1));
            }
            arrayList2.add(new 0eP(obj, A01));
            05G r13 = r6.A02;
            r13.Epw(Integer.valueOf(((Number) r13.getValue()).intValue() + 1));
        }
        clipsDraftRepository.A0N((C293505kq) r2.A01);
        return r2;
    }
}

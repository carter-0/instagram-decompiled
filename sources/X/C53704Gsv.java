package X;

import com.meta.metaai.promptsheet.creation.impl.viewmodel.PromptSheetAIViewModel;
import java.util.ArrayList;

/* renamed from: X.Gsv  reason: case insensitive filesystem */
public final class C53704Gsv extends C251343mx {
    public final PromptSheetAIViewModel A00;
    public final C62320sa A01;
    public final 0sP A02;

    public final C251263mp A0X(AnonymousClass3Y5 r9) {
        Object gvs;
        0qQ.A0B(r9, 0);
        HQ6 hq6 = (HQ6) GMJ.A00(r9, this.A00.A06);
        if (hq6 instanceof C54549HIk) {
            gvs = new C251343mx();
        } else if (hq6 instanceof C54547HIi) {
            gvs = new C53638Grr(this.A01);
        } else if (hq6 instanceof C54548HIj) {
            gvs = new C53887Gvs(this.A02, ((C54548HIj) hq6).A00);
        } else {
            throw AnonymousClass7TE.A1K();
        }
        2V1 r2 = r9.A05;
        ArrayList A1C = AnonymousClass7TE.A1C();
        0qQ.A0B(r2, 1);
        A1C.add(gvs);
        return new 2Tl((C243573Zh) null, (C243573Zh) null, (C243583Zi) null, A1C, false);
    }

    public C53704Gsv(PromptSheetAIViewModel promptSheetAIViewModel, C62320sa r2, 0sP r3) {
        this.A00 = promptSheetAIViewModel;
        this.A01 = r2;
        this.A02 = r3;
    }
}

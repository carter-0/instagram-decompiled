package X;

import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Lmq  reason: case insensitive filesystem */
public final class C65070Lmq implements C66508MUm {
    public final /* synthetic */ KMS A00;

    public C65070Lmq(KMS kms) {
        this.A00 = kms;
    }

    public final void Coh(int i, int i2) {
        C60428JlL jlL = this.A00.A0D;
        ArrayList A0U = 00k.A0U(jlL.A02);
        A0U.add(i2, A0U.remove(i));
        jlL.A02 = A0U;
        jlL.notifyItemMoved(i, i2);
    }

    public final void DSS(int i, int i2) {
        C60108Jfo jfo = this.A00.A0K;
        if (i >= 0 && i2 >= 0 && i != i2) {
            int i3 = (i2 / 2) - 1;
            int i4 = (i / 2) - 1;
            C318136oS A002 = C318116oQ.A00(jfo);
            MFY mfy = new MFY(jfo, (AnonymousClass4D7) null, i4, i3, 1);
            19B r2 = 19B.A00;
            1Eo.A05(r2, mfy, A002);
            ClipsCreationViewModel clipsCreationViewModel = jfo.A0E;
            clipsCreationViewModel.A0S(i4, i3);
            1Eo.A05(r2, new MFY(jfo, (AnonymousClass4D7) null, i4, i3, 2), C318116oQ.A00(jfo));
            AnonymousClass831 A0K = JTQ.A0K(clipsCreationViewModel);
            if (A0K != null) {
                jfo.A0K.A06(A0K.A01(i3));
            }
            27p.A01(jfo.A0C).A0q((long) i4, (long) i3);
        }
        JTT.A1L(jfo.A0F, false);
    }

    public final void DST(int i) {
        C60108Jfo jfo = this.A00.A0K;
        JTT.A1L(jfo.A0F, true);
        List list = jfo.A0M;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2) instanceof KMH) {
                Object obj = list.get(i2);
                0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.sundial.edit.model.ClipsStackedTimelineVideoTrackItemModel.ReorderThumbnailItem");
                list.set(i2, new KMH(((KMH) obj).A00, AnonymousClass7TF.A1S(i, i2), false));
            }
        }
        C51971G9r.A1Q(jfo, C318116oQ.A00(jfo), 2);
    }
}

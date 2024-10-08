package X;

import android.view.View;
import java.util.List;

public final class KIB extends AnonymousClass4HF {
    public final /* synthetic */ L8D A00;
    public final /* synthetic */ C64095LMp A01;
    public final /* synthetic */ 1Xj A02;
    public final /* synthetic */ AnonymousClass3W1 A03;
    public final /* synthetic */ List A04;

    public final void DhS(AnonymousClass3TF r2, AnonymousClass3TF r3) {
        AnonymousClass4UR r0;
        0qQ.A0B(r2, 0);
        if (r2 == AnonymousClass3TF.DRAGGING && (r0 = this.A03.A0s) != null) {
            r0.A01();
        }
    }

    public KIB(L8D l8d, C64095LMp lMp, 1Xj r3, AnonymousClass3W1 r4, List list) {
        this.A03 = r4;
        this.A00 = l8d;
        this.A04 = list;
        this.A01 = lMp;
        this.A02 = r3;
    }

    public final void DVx(int i, int i2) {
        Object obj;
        View view;
        this.A03.A0A(i);
        View view2 = this.A00.A02.A0F;
        if (view2 != null) {
            obj = view2.getTag();
        } else {
            obj = null;
        }
        if (obj instanceof C262804Gb) {
            view = ((C262804Gb) obj).A0F;
        } else if (obj instanceof C279064y1) {
            view = ((C279064y1) obj).A0E;
        } else if (obj instanceof C55778HnD) {
            view = ((C55778HnD) obj).A03;
            0qQ.A06(view);
        } else {
            throw AnonymousClass7TE.A0w(AnonymousClass000.A00(2533));
        }
        2eQ.A07(view, (CharSequence) null);
    }

    public final void DW9(int i, int i2, boolean z) {
        1Xj A0T = DbZ.A0T(this.A04, i);
        AnonymousClass3W1 r3 = this.A03;
        r3.A0B(i);
        if (A0T.CeS()) {
            C64095LMp.A00(this.A00, this.A01, this.A02, r3);
        }
    }
}

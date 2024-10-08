package X;

import androidx.recyclerview.widget.RecyclerView;

public final class PVC implements Runnable {
    public final /* synthetic */ NVX A00;

    public PVC(NVX nvx) {
        this.A00 = nvx;
    }

    public final void run() {
        String str;
        NVX nvx = this.A00;
        C67739Mts mts = nvx.A03;
        if (mts == null) {
            str = "promptNamingSuggestionsViewModel";
        } else {
            int A05 = DbS.A05(mts.A09.getValue());
            if (A05 > 0) {
                C252063oV r0 = nvx.A01;
                if (r0 == null) {
                    str = "suggestionRecyclerView";
                } else {
                    ((RecyclerView) r0.getView()).A0p(A05 - 1);
                    return;
                }
            } else {
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}

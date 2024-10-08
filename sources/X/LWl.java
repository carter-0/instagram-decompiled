package X;

import android.view.View;

public final class LWl implements View.OnClickListener {
    public final /* synthetic */ C361998hA A00;

    public LWl(C361998hA r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        String str;
        int A05 = AnonymousClass0fD.A05(-1130136733);
        C361998hA r5 = this.A00;
        C362048hG r0 = r5.A05;
        if (r0 == null) {
            str = "delegate";
        } else if (r0.A08 == AnonymousClass05K.A01) {
            C362358hl r02 = r5.A06;
            if (r02 == null) {
                str = "storyDraftsAdapter";
            } else {
                C54908HXq.A00(r5.A09, new C65053LmX(new MM9(r5, 7)), r02.A0A.size());
                AnonymousClass0fD.A0C(-819731732, A05);
                return;
            }
        } else {
            UnsupportedOperationException A1B = AnonymousClass7TE.A1B("Unhandled tab mode.");
            AnonymousClass0fD.A0C(1003217074, A05);
            throw A1B;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}

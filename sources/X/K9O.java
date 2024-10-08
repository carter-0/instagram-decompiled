package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class K9O extends C231632rz {
    public final C65634LxB A00;

    public final int getViewTypeCount() {
        return 1;
    }

    public K9O(C65634LxB lxB) {
        this.A00 = lxB;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(2030224100);
        0qQ.A0B(view, 1);
        Object tag = view.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.recipientpicker.SaveStoryToHighlightsViewBinder.Holder");
        L6H l6h = (L6H) tag;
        C65634LxB lxB = this.A00;
        Dba.A0j(1, l6h, lxB);
        DbU.A13(l6h.A00, l6h.A02, R.drawable.instagram_story_highlight_pano_outline_24);
        LY4.A01(l6h.A01, 1, lxB);
        AnonymousClass0fD.A0A(-1611178061, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, 1898228838);
        Context context = viewGroup.getContext();
        View A0A = DbU.A0A(LayoutInflater.from(context), viewGroup, R.layout.recipient_picker_save_story_to_highlights, false);
        0qQ.A07(context);
        A0A.setTag(new L6H(A0A, context));
        AnonymousClass0fD.A0A(-1122529421, A04);
        return A0A;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}

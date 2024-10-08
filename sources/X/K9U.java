package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.api.schemas.StickerTraySectionCTAType;

public final class K9U extends C231632rz {
    public final Context A00;
    public final AnonymousClass8MM A01;

    public final int getViewTypeCount() {
        return 2;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r4, Object obj, Object obj2) {
        C61081JwJ jwJ = (C61081JwJ) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, r4, jwJ);
        if (jwJ.A00 != null) {
            r4.A7U(A1U ? 1 : 0);
        } else {
            r4.A7U(0);
        }
    }

    public K9U(Context context, AnonymousClass8MM r2) {
        this.A00 = context;
        this.A01 = r2;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-902858661);
        AnonymousClass7TF.A1B(view, 1, obj);
        if (i == 0) {
            Object tag = view.getTag();
            0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.SectionTitleViewBinder.Holder");
            L03 l03 = (L03) tag;
            C61081JwJ jwJ = (C61081JwJ) obj;
            Dba.A0j(1, l03, jwJ);
            TextView textView = l03.A00;
            textView.setText(jwJ.A01);
            03v.A0B(textView, new U7M(l03, 5));
        } else if (i == 1) {
            Object tag2 = view.getTag();
            0qQ.A0C(tag2, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.SectionTitleWithCTAViewBinder.Holder");
            L67 l67 = (L67) tag2;
            C61081JwJ jwJ2 = (C61081JwJ) obj;
            AnonymousClass8MM r5 = this.A01;
            Dba.A0j(1, l67, jwJ2);
            l67.A02.setText(jwJ2.A01);
            if (r5 != null) {
                C61081JwJ jwJ3 = (C61081JwJ) jwJ2.A00;
                0qQ.A0A(jwJ3);
                TextView textView2 = l67.A01;
                textView2.setText(jwJ3.A01);
                LY8.A00(l67.A00, 46, jwJ3, r5);
                r5.CnL(textView2, (StickerTraySectionCTAType) jwJ3.A00);
            }
        } else {
            UnsupportedOperationException A1B = AnonymousClass7TE.A1B(AnonymousClass000.A00(1046));
            AnonymousClass0fD.A0A(-1292575543, A03);
            throw A1B;
        }
        AnonymousClass0fD.A0A(-333270273, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        View inflate;
        Object l03;
        int A03 = AnonymousClass0fD.A03(867721477);
        0qQ.A0B(viewGroup, 1);
        if (i == 0) {
            inflate = DbT.A0B(this.A00).inflate(R.layout.layout_asset_picker_section_title, viewGroup, false);
            0qQ.A0C(inflate, "null cannot be cast to non-null type android.widget.TextView");
            l03 = new L03((TextView) inflate);
        } else if (i == 1) {
            inflate = DbU.A0A(DbT.A0B(this.A00), viewGroup, R.layout.layout_asset_picker_section_title_with_cta, false);
            l03 = new L67(inflate);
        } else {
            UnsupportedOperationException A1B = AnonymousClass7TE.A1B(AnonymousClass000.A00(1046));
            AnonymousClass0fD.A0A(316012470, A03);
            throw A1B;
        }
        inflate.setTag(l03);
        AnonymousClass0fD.A0A(851976581, A03);
        return inflate;
    }
}

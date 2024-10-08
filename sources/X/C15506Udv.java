package X;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.Udv  reason: case insensitive filesystem */
public final class C15506Udv extends C231632rz {
    public final Context A00;

    public final int getViewTypeCount() {
        return AnonymousClass05K.A00(4).length;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        C17570VaO vaO = (C17570VaO) obj;
        AnonymousClass7TG.A1N(r2, vaO);
        r2.A7U(vaO.A00.intValue());
    }

    public C15506Udv(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        View view2;
        int A03 = AnonymousClass0fD.A03(-2073517744);
        int A02 = DbW.A02(1, view, obj);
        int A08 = C13989Tnp.A08(4, i);
        if (A08 != 0) {
            if (A08 == 1) {
                Object tag = view.getTag();
                0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.business.promote.binder.PromoteTemplateSelectionScreenDescriptionRowViewBinder.Holder");
                UCV ucv = (UCV) tag;
                C17570VaO vaO = (C17570VaO) obj;
                0qQ.A0B(ucv, 0);
                0qQ.A0B(vaO, 1);
                TextView textView = ucv.A00;
                textView.setText(vaO.A04);
                view2 = textView;
            } else if (A08 == A02) {
                Object tag2 = view.getTag();
                0qQ.A0C(tag2, "null cannot be cast to non-null type com.instagram.business.promote.binder.PromoteTemplateSelectionScreenThumbnailRowViewBinder.Holder");
                UDL udl = (UDL) tag2;
                C17570VaO vaO2 = (C17570VaO) obj;
                0qQ.A0B(udl, 0);
                0qQ.A0B(vaO2, 1);
                udl.A02.setText(vaO2.A04);
                CharSequence charSequence = vaO2.A05;
                if (charSequence != null) {
                    TextView textView2 = udl.A01;
                    textView2.setVisibility(0);
                    textView2.setText(charSequence);
                }
                RoundedCornerImageView roundedCornerImageView = udl.A03;
                ImageUrl imageUrl = vaO2.A03;
                if (imageUrl != null) {
                    roundedCornerImageView.setUrl(imageUrl, vaO2.A02);
                    AnonymousClass0fU.A00(vaO2.A01, udl.A00);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else if (A08 == 3) {
                Object tag3 = view.getTag();
                0qQ.A0C(tag3, "null cannot be cast to non-null type com.instagram.business.promote.binder.PromoteTemplateSelectionScreenTemplateRowViewBinder.Holder");
                UDK udk = (UDK) tag3;
                C17570VaO vaO3 = (C17570VaO) obj;
                0qQ.A0B(udk, 0);
                0qQ.A0B(vaO3, 1);
                TextView textView3 = udk.A02;
                textView3.setText(vaO3.A04);
                textView3.setVisibility(0);
                CharSequence charSequence2 = vaO3.A05;
                if (charSequence2 != null) {
                    TextView textView4 = udk.A03;
                    textView4.setText(charSequence2);
                    textView4.setVisibility(0);
                }
                AnonymousClass0fU.A00(vaO3.A01, udk.A00);
                view2 = udk.A01;
            } else {
                RuntimeException runtimeException = new RuntimeException();
                AnonymousClass0fD.A0A(-1522822216, A03);
                throw runtimeException;
            }
            view2.setVisibility(0);
        } else {
            Object tag4 = view.getTag();
            0qQ.A0C(tag4, "null cannot be cast to non-null type com.instagram.business.promote.binder.PromoteTemplateSelectionScreenHeaderRowViewBinder.Holder");
            UCW ucw = (UCW) tag4;
            C17570VaO vaO4 = (C17570VaO) obj;
            0qQ.A0B(ucw, 0);
            0qQ.A0B(vaO4, 1);
            TextView textView5 = ucw.A00;
            textView5.setText(vaO4.A04);
            textView5.setVisibility(0);
            if (vaO4.A00 == AnonymousClass05K.A00) {
                textView5.setTypeface((Typeface) null, 1);
            }
        }
        AnonymousClass0fD.A0A(1538260973, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        Object ucw;
        int A03 = AnonymousClass0fD.A03(1818130572);
        0qQ.A0B(viewGroup, 1);
        int A08 = C13989Tnp.A08(4, i);
        if (A08 == 0) {
            viewGroup2 = (ViewGroup) DbW.A09(DbT.A0B(this.A00), viewGroup, R.layout.promote_preview_header_row, false);
            ucw = new UCW(viewGroup2);
        } else if (A08 == 1) {
            viewGroup2 = (ViewGroup) DbW.A09(DbT.A0B(this.A00), viewGroup, R.layout.promote_preview_description_row, false);
            ucw = new UCV(viewGroup2);
        } else if (A08 == 2) {
            viewGroup2 = (ViewGroup) DbW.A09(DbT.A0B(this.A00), viewGroup, R.layout.promote_preview_thumbnail_text_row, false);
            ucw = new UDL(viewGroup2);
        } else if (A08 == 3) {
            viewGroup2 = (ViewGroup) DbW.A09(DbT.A0B(this.A00), viewGroup, R.layout.promote_row_with_chevron, false);
            ucw = new UDK(viewGroup2);
        } else {
            RuntimeException runtimeException = new RuntimeException();
            AnonymousClass0fD.A0A(-1443349362, A03);
            throw runtimeException;
        }
        viewGroup2.setTag(ucw);
        AnonymousClass0fD.A0A(872195921, A03);
        return viewGroup2;
    }
}

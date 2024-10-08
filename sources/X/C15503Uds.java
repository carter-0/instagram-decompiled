package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Uds  reason: case insensitive filesystem */
public final class C15503Uds extends C231632rz {
    public final Context A00;

    public final int getViewTypeCount() {
        return AnonymousClass05K.A00(2).length;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        VZL vzl = (VZL) obj;
        AnonymousClass7TG.A1N(r2, vzl);
        r2.A7U(vzl.A03.intValue());
    }

    public C15503Uds(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        VZL vzl;
        ViewGroup viewGroup;
        int A03 = AnonymousClass0fD.A03(-910713603);
        int A08 = C13989Tnp.A08(DbW.A02(1, view, obj), i);
        if (A08 == 0) {
            Object tag = view.getTag();
            0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.business.promote.binder.PromoteAdPreviewViewBinder.Holder");
            C14826UBf uBf = (C14826UBf) tag;
            vzl = (VZL) obj;
            0qQ.A0B(uBf, 0);
            0qQ.A0B(vzl, 1);
            viewGroup = uBf.A00;
            IgImageView A0Y = JTO.A0Y(viewGroup, R.id.image_thumbnail);
            if (A0Y != null) {
                A0Y.setVisibility(0);
                ImageUrl imageUrl = vzl.A02;
                if (imageUrl != null) {
                    A0Y.setUrl(imageUrl, vzl.A01);
                }
            }
        } else if (A08 == 1) {
            Object tag2 = view.getTag();
            0qQ.A0C(tag2, "null cannot be cast to non-null type com.instagram.business.promote.binder.PromoteTextWithChevronViewBinder.Holder");
            C14828UBh uBh = (C14828UBh) tag2;
            vzl = (VZL) obj;
            0qQ.A0B(uBh, 0);
            0qQ.A0B(vzl, 1);
            viewGroup = uBh.A00;
        } else {
            RuntimeException runtimeException = new RuntimeException();
            AnonymousClass0fD.A0A(1981164836, A03);
            throw runtimeException;
        }
        TextView A0d = AnonymousClass7TE.A0d(viewGroup, R.id.primary_text);
        if (A0d != null) {
            A0d.setVisibility(8);
            String str = vzl.A04;
            if (str != null) {
                A0d.setText(str);
                A0d.setVisibility(0);
            }
        }
        DbX.A1D(viewGroup, R.id.secondary_text, 8);
        AnonymousClass0fU.A00(vzl.A00, viewGroup);
        AnonymousClass0fD.A0A(-1510669950, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        Object uBf;
        int A03 = AnonymousClass0fD.A03(-1618884395);
        0qQ.A0B(viewGroup, 1);
        int A08 = C13989Tnp.A08(2, i);
        if (A08 == 0) {
            viewGroup2 = (ViewGroup) DbW.A09(DbT.A0B(this.A00), viewGroup, R.layout.boost_ad_preview_row, false);
            uBf = new C14826UBf(viewGroup2);
        } else if (A08 == 1) {
            viewGroup2 = (ViewGroup) DbW.A09(DbT.A0B(this.A00), viewGroup, R.layout.boost_text_with_chevron_row, false);
            uBf = new C14828UBh(viewGroup2);
        } else {
            RuntimeException runtimeException = new RuntimeException();
            AnonymousClass0fD.A0A(-1732583883, A03);
            throw runtimeException;
        }
        viewGroup2.setTag(uBf);
        AnonymousClass0fD.A0A(1140060582, A03);
        return viewGroup2;
    }
}

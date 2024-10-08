package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.UeF  reason: case insensitive filesystem */
public final class C15526UeF extends C231632rz {
    public final Context A00;
    public final C15328Uac A01;
    public final AnonymousClass0iw A02;

    public final int getViewTypeCount() {
        return 1;
    }

    public C15526UeF(Context context, C15328Uac uac, AnonymousClass0iw r3) {
        this.A00 = context;
        this.A02 = r3;
        this.A01 = uac;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A04 = DbX.A04(view, -1913136905);
        0qQ.A0B(obj, 2);
        VZI vzi = (VZI) view.getTag();
        if (vzi != null) {
            AnonymousClass0iw r5 = this.A02;
            C15328Uac uac = this.A01;
            V42 v42 = (V42) obj;
            boolean A1X = DbW.A1X(r5);
            AnonymousClass7TF.A1C(uac, 2, v42);
            String str = v42.A06;
            if (str != null) {
                TextView textView = vzi.A02;
                textView.setVisibility(A1X);
                textView.setText(str);
            }
            String str2 = v42.A04;
            if (str2 != null) {
                TextView textView2 = vzi.A01;
                textView2.setVisibility(A1X);
                textView2.setText(str2);
            }
            ImageUrl imageUrl = v42.A00;
            if (imageUrl != null) {
                IgImageView igImageView = vzi.A04;
                igImageView.setVisibility(A1X);
                igImageView.setUrl(imageUrl, r5);
            }
            String str3 = v42.A01;
            if (str3 != null) {
                TextView textView3 = vzi.A00;
                textView3.setVisibility(A1X ? 1 : 0);
                textView3.setText(str3);
                WBH.A01(textView3, 26, uac, v42);
            }
            WBH.A01(vzi.A03, 27, uac, v42);
            AnonymousClass0fD.A0A(1981367981, A04);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0A(-1509614939, A04);
        throw A0y;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, 1324981064);
        View A09 = DbW.A09(LayoutInflater.from(this.A00), viewGroup, R.layout.aymt_megaphone, false);
        A09.setTag(new VZI(C13991Tnr.A08(A09, R.id.title), C13991Tnr.A08(A09, R.id.message), C13991Tnr.A08(A09, R.id.primary_button), (ColorFilterAlphaImageView) AnonymousClass7TF.A0G(A09, R.id.dismiss_button), AnonymousClass7TF.A0G(A09, R.id.megaphone_icon)));
        AnonymousClass0fD.A0A(-2099923993, A04);
        return A09;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}

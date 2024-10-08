package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import java.util.List;
import java.util.Set;

/* renamed from: X.Uex  reason: case insensitive filesystem */
public final class C15569Uex extends C336937fQ {
    public final int A00 = 3;
    public final Context A01;
    public final X3C A02;
    public final C15386Ubl A03;
    public final AnonymousClass0iw A04;
    public final UserSession A05;

    public C15569Uex(Context context, X3C x3c, C15386Ubl ubl, AnonymousClass0iw r5, UserSession userSession) {
        this.A01 = context;
        this.A04 = r5;
        this.A03 = ubl;
        this.A02 = x3c;
        this.A05 = userSession;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        VRI vri;
        Object obj3 = obj2;
        Object obj4 = obj;
        LinearLayout linearLayout = view;
        int A032 = AnonymousClass0fD.A03(1427200249);
        if (view == null) {
            int A033 = AnonymousClass0fD.A03(-1458442190);
            Context context = this.A01;
            int i2 = this.A00;
            0qQ.A0B(context, 0);
            int A0B = C13989Tnp.A0B(context);
            int i3 = i2 - 1;
            int i4 = (0nA.A0H(context).widthPixels - (A0B * i3)) / i2;
            LinearLayout linearLayout2 = new LinearLayout(context);
            VRJ vrj = new VRJ(linearLayout2);
            for (int i5 = 0; i5 < i2; i5++) {
                View inflate = LayoutInflater.from(context).inflate(R.layout.layout_highlights_media_item, linearLayout2, false);
                0qQ.A0C(inflate, C273654mx.A00(172));
                MediaFrameLayout mediaFrameLayout = (MediaFrameLayout) inflate;
                mediaFrameLayout.A00 = 0.5625f;
                C17563VaH vaH = new C17563VaH(AnonymousClass7TF.A0G(mediaFrameLayout, R.id.selected_item_overlay), (CheckBox) AnonymousClass7TF.A0F(mediaFrameLayout, R.id.media_toggle), DbX.A0b(mediaFrameLayout, R.id.media_image), mediaFrameLayout);
                mediaFrameLayout.setTag(vaH);
                vrj.A01.add(vaH);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i4, -2);
                int i6 = A0B;
                if (i5 == i3) {
                    i6 = 0;
                }
                layoutParams.rightMargin = i6;
                linearLayout2.addView(vaH.A05, layoutParams);
            }
            linearLayout2.setTag(vrj);
            AnonymousClass0fD.A0A(-399935966, A033);
            linearLayout = linearLayout2;
        }
        C3251571g r11 = (C3251571g) obj4;
        AnonymousClass6u8 r3 = (AnonymousClass6u8) obj3;
        int A034 = AnonymousClass0fD.A03(-1528826987);
        VRJ vrj2 = (VRJ) DbT.A0o(linearLayout);
        AnonymousClass0iw r12 = this.A04;
        C15386Ubl ubl = this.A03;
        Set Brl = this.A02.Brl();
        UserSession userSession = this.A05;
        AnonymousClass7TG.A1N(vrj2, r11);
        C51974G9v.A1S(r12, ubl, r3, Brl, userSession);
        View view2 = vrj2.A00;
        0nA.A0X(view2, C13990Tnq.A08(view2, r3.A04 ? 1 : 0));
        List list = vrj2.A01;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            C17563VaH vaH2 = (C17563VaH) list.get(i7);
            if (i7 < r11.A01()) {
                1Xj r1 = (1Xj) r11.A02(i7);
                boolean A0u = 00k.A0u(Brl, r1.getId());
                0qQ.A0B(vaH2, 0);
                vaH2.A03.A02();
                MediaFrameLayout mediaFrameLayout2 = vaH2.A05;
                mediaFrameLayout2.setVisibility(0);
                CheckBox checkBox = vaH2.A02;
                checkBox.setVisibility(0);
                checkBox.setChecked(A0u);
                vaH2.A01.setVisibility(DbW.A01(A0u ? 1 : 0));
                IgImageView igImageView = vaH2.A04;
                igImageView.setVisibility(0);
                ExtendedImageUrl A1m = r1.A1m(mediaFrameLayout2.getMeasuredWidth());
                if (r1.A6b(userSession)) {
                    Context context2 = mediaFrameLayout2.getContext();
                    igImageView.setImageDrawable(context2.getResources().getDrawable(R.drawable.deleted_media_error_warning_archive_drawable, context2.getTheme()));
                } else if (A1m != null && !C253833rU.A02(A1m)) {
                    igImageView.setUrl(A1m, r12);
                }
                vri = new VRI(ubl, r1);
            } else {
                0qQ.A0B(vaH2, 0);
                vaH2.A05.setVisibility(8);
                vaH2.A04.setVisibility(8);
                vaH2.A02.setVisibility(8);
                vaH2.A01.setVisibility(8);
                vaH2.A03.A02();
                vri = null;
            }
            vaH2.A00 = vri;
        }
        AnonymousClass0fD.A0A(-1672234637, A034);
        AnonymousClass0fD.A0A(1722911341, A032);
        return linearLayout;
    }
}

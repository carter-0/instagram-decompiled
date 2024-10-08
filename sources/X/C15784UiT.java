package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.shopping.fragment.cart.ShoppingCartFragment;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.UiT  reason: case insensitive filesystem */
public final class C15784UiT extends C232222tE {
    public final AnonymousClass0iw A00;
    public final ShoppingCartFragment A01;
    public final UserSession A02;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r18, C249703kE r19) {
        ExtendedImageUrl A03;
        View view;
        C15079UNw uNw = (C15079UNw) r18;
        UEK uek = (UEK) r19;
        boolean A1U = AnonymousClass7TF.A1U(0, uNw, uek);
        AnonymousClass0iw r9 = this.A00;
        ShoppingCartFragment shoppingCartFragment = this.A01;
        0qQ.A0B(r9, 3);
        0qQ.A0B(shoppingCartFragment, 4);
        View view2 = uek.A00;
        WBD.A00(view2, 39, uNw, shoppingCartFragment);
        User user = uNw.A01;
        ImageUrl Bh3 = user.Bh3();
        AnonymousClass0eM r5 = uek.A03;
        ((IgImageView) AnonymousClass7TE.A14(r5)).setUrl(Bh3, r9);
        AnonymousClass0eM r16 = uek.A04;
        DbU.A1H(JTQ.A0A(r16), user);
        C13988Tno.A16(JTQ.A0A(r16), A1U);
        AnonymousClass0eM r12 = uek.A07;
        TextView A0A = JTQ.A0A(r12);
        String str = uNw.A02;
        A0A.setText(str);
        WBD.A00(AnonymousClass7TH.A06(r5), 40, uNw, shoppingCartFragment);
        WBD.A00(AnonymousClass7TH.A06(r16), 41, uNw, shoppingCartFragment);
        WBD.A00(AnonymousClass7TH.A06(r12), 42, uNw, shoppingCartFragment);
        view2.setContentDescription(C66580MXl.A10(user.getUsername(), str));
        AnonymousClass0eM r14 = uek.A09;
        WBD.A00(AnonymousClass7TH.A06(r14), 43, uNw, shoppingCartFragment);
        TextView A0A2 = JTQ.A0A(r14);
        Context context = view2.getContext();
        DbT.A18(context, A0A2, 2131973841);
        AnonymousClass0eM r13 = uek.A08;
        WBD.A00(AnonymousClass7TH.A06(r13), 44, uNw, shoppingCartFragment);
        AnonymousClass0eM r15 = uek.A01;
        JTS.A1W(r15, 0);
        View A06 = AnonymousClass7TH.A06(r15);
        C18622VvF vvF = uNw.A00;
        List<W0O> list = vvF.A09;
        0qQ.A07(list);
        A06.setEnabled(AnonymousClass7TE.A1b(list));
        WBD.A00(AnonymousClass7TH.A06(r15), 45, uNw, shoppingCartFragment);
        JTS.A1W(r13, 0);
        AnonymousClass7TH.A06(r14).setVisibility(8);
        ConstraintLayout constraintLayout = (ConstraintLayout) view2;
        C270354gb A0C = JTQ.A0C(constraintLayout);
        A0C.A09(R.id.thumbnail_image_container_0, 4);
        A0C.A09(R.id.divider, 3);
        A0C.A0C(R.id.thumbnail_image_container_0, 4, R.id.view_cart_button_bottom, 3);
        A0C.A0C(R.id.divider, 3, R.id.view_cart_button_bottom, 4);
        C270354gb.A02(A0C, R.id.divider).A03.A0p = context.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material);
        A0C.A0G(constraintLayout);
        AnonymousClass7TH.A06(uek.A02).setVisibility(DbW.A00(uNw.A03 ? 1 : 0));
        ArrayList arrayList = new ArrayList();
        if (vvF.A00 > 0) {
            for (W0O w0o : list) {
                Product A032 = w0o.A03();
                if (A032 != null && !AnonymousClass4KJ.A00(A032.A0N)) {
                    Iterator it = w0o.A03().A0N.iterator();
                    while (it.hasNext()) {
                        JTT.A1U(arrayList, it);
                    }
                }
            }
        }
        boolean A1b = DbT.A1b(arrayList);
        AnonymousClass0eM r2 = uek.A05;
        TextView textView = (TextView) r2.getValue();
        if (A1b) {
            DbT.A18(context, textView, 2131968763);
            DbW.A1R(r2, 0);
            ViewGroup.MarginLayoutParams A0D = DbS.A0D(AnonymousClass7TH.A06(r16));
            if (A0D != null) {
                A0D.topMargin = AnonymousClass7TG.A07(context);
            }
            AnonymousClass7TH.A06(r16).setLayoutParams(A0D);
        } else {
            textView.setVisibility(8);
        }
        List subList = Collections.unmodifiableList(vvF.A06).subList(0, Math.min(Collections.unmodifiableList(vvF.A06).size(), 3));
        AnonymousClass0eM r52 = uek.A06;
        int size = JTO.A15(r52).size();
        for (int i = 0; i < size; i++) {
            VYO vyo = (VYO) C13989Tnp.A0h(r52, i);
            if (i > C51966G9m.A06(subList)) {
                view = vyo.A02;
            } else {
                ViewGroup viewGroup = vyo.A02;
                viewGroup.setVisibility(0);
                WBD.A00(viewGroup, 38, uNw, shoppingCartFragment);
                IgImageView igImageView = vyo.A03;
                View view3 = vyo.A00;
                AnonymousClass7TG.A1N(igImageView, view3);
                igImageView.A0E = new C57108IOw(view3, 0);
                Product A033 = ((W0O) subList.get(i)).A03();
                if (A033 == null) {
                    Drawable A012 = AnonymousClass4Ed.A01(context, R.drawable.instagram_no_photo_pano_outline_24, 2Yu.A0H(context, R.attr.igds_color_creation_tools_grey_05));
                    IgImageView igImageView2 = vyo.A03;
                    igImageView2.setImageDrawable(A012);
                    igImageView2.setScaleType(ImageView.ScaleType.CENTER);
                    vyo.A00.setVisibility(0);
                    view = vyo.A01;
                } else {
                    IgImageView igImageView3 = vyo.A03;
                    igImageView3.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    ImageInfo imageInfo = A033.A08;
                    if (imageInfo == null || (A03 = 1iI.A03(imageInfo)) == null) {
                        igImageView3.A09();
                    } else {
                        igImageView3.setUrl(A03, r9);
                    }
                    View view4 = vyo.A01;
                    int i2 = 0;
                    if (A033.A0P) {
                        i2 = 4;
                    }
                    view4.setVisibility(i2);
                }
            }
            view.setVisibility(8);
        }
    }

    public final Class modelClass() {
        return C15079UNw.class;
    }

    public C15784UiT(AnonymousClass0iw r1, UserSession userSession, ShoppingCartFragment shoppingCartFragment) {
        this.A02 = userSession;
        this.A00 = r1;
        this.A01 = shoppingCartFragment;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        UEK uek = new UEK(DbT.A0D(layoutInflater, viewGroup, R.layout.global_cart_merchant_row, false));
        Resources A05 = DbU.A05(viewGroup);
        float A0B = ((((float) A05.getDisplayMetrics().widthPixels) - (((float) AnonymousClass7TE.A0B(A05)) * 2.0f)) - (((float) A05.getDimensionPixelSize(R.dimen.accent_edge_thickness)) * 2.0f)) / 3.0f;
        C14682U1d u1d = new C14682U1d(AnonymousClass7TE.A0S(uek.A00));
        AnonymousClass0eM r3 = uek.A06;
        int size = JTO.A15(r3).size();
        for (int i2 = 0; i2 < size; i2++) {
            int i3 = (int) A0B;
            0nA.A0f(((VYO) C13989Tnp.A0h(r3, i2)).A03, i3);
            0nA.A0V(((VYO) C13989Tnp.A0h(r3, i2)).A03, i3);
            0nA.A0f(((VYO) C13989Tnp.A0h(r3, i2)).A02, i3);
            0nA.A0V(((VYO) C13989Tnp.A0h(r3, i2)).A02, i3);
            ((VYO) C13989Tnp.A0h(r3, i2)).A01.setBackground(u1d);
        }
        return uek;
    }
}

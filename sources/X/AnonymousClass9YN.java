package X;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import java.util.List;

/* renamed from: X.9YN  reason: invalid class name */
public final class AnonymousClass9YN extends 2Rw {
    public final C384959iA A00;
    public final GradientDrawable A01;
    public final AnonymousClass0iw A02;
    public final List A03;

    public final void onBindViewHolder(C249703kE r8, int i) {
        0qQ.A0B(r8, 0);
        C380559Yq r82 = (C380559Yq) r8;
        DUJ duj = (DUJ) this.A03.get(i);
        GradientDrawable gradientDrawable = this.A01;
        AnonymousClass0iw r4 = this.A02;
        C40017ANz aNz = new C40017ANz(this, i, 1);
        0qQ.A0B(duj, 0);
        IgImageView igImageView = r82.A02;
        igImageView.setUrl(new SimpleImageUrl(duj.BGL()), r4);
        igImageView.setOnTouchListener(new AP3(r82, 7));
        AnonymousClass0fU.A00(aNz, igImageView);
        RoundedCornerFrameLayout roundedCornerFrameLayout = r82.A03;
        RectF rectF = 0nA.A01;
        0qQ.A0B(roundedCornerFrameLayout, 0);
        roundedCornerFrameLayout.setBackground(gradientDrawable);
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        Context context = viewGroup.getContext();
        View inflate = LayoutInflater.from(context).inflate(i, viewGroup, false);
        int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        0qQ.A0A(inflate);
        0qQ.A07(context);
        return new C380559Yq(inflate, context);
    }

    public AnonymousClass9YN(GradientDrawable gradientDrawable, AnonymousClass0iw r2, C384959iA r3, List list) {
        AnonymousClass7TG.A1O(list, gradientDrawable);
        this.A03 = list;
        this.A01 = gradientDrawable;
        this.A02 = r2;
        this.A00 = r3;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(760365014);
        int size = this.A03.size();
        AnonymousClass0fD.A0A(-562089439, A032);
        return size;
    }

    public final int getItemViewType(int i) {
        AnonymousClass0fD.A0A(1376367841, AnonymousClass0fD.A03(1743571661));
        return R.layout.canvas_templates_item;
    }
}

package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.MzV  reason: case insensitive filesystem */
public final class C68064MzV extends C249703kE implements C328007Db {
    public final Drawable A00 = C328037De.A00();
    public final ViewGroup A01;
    public final ViewGroup A02;
    public final ViewGroup A03;
    public final TextView A04;
    public final IgImageView A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68064MzV(ViewGroup viewGroup, ViewGroup viewGroup2, ViewGroup viewGroup3, TextView textView, IgImageView igImageView) {
        super(viewGroup);
        C51973G9u.A0r(3, viewGroup2, viewGroup3, igImageView);
        this.A04 = textView;
        this.A03 = viewGroup;
        this.A01 = viewGroup2;
        this.A02 = viewGroup3;
        this.A05 = igImageView;
    }

    public final View BJd() {
        return this.A03;
    }
}

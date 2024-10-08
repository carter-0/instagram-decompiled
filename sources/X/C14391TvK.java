package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.TvK  reason: case insensitive filesystem */
public final class C14391TvK extends 2Rw {
    public final Context A00;
    public final Drawable A01;
    public final UserSession A02;
    public final GXB A03;

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r2, int i) {
        0qQ.A0B(r2, 0);
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        TextView textView;
        0qQ.A0B(viewGroup, 0);
        Context context = this.A00;
        View inflate = LayoutInflater.from(context).inflate(R.layout.refinement_item, viewGroup, false);
        if ((inflate instanceof TextView) && (textView = (TextView) inflate) != null) {
            int A012 = DbY.A01(context);
            0nA.A0i(textView, A012, A012);
            textView.setCompoundDrawablePadding(JTR.A05(context));
            WBG.A01(textView, 27, this, new C14843UBx(textView));
        }
        int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C14843UBx(new TextView(viewGroup.getContext()));
    }

    public C14391TvK(Context context, UserSession userSession, GXB gxb) {
        this.A00 = context;
        this.A02 = userSession;
        this.A03 = gxb;
        Drawable drawable = context.getDrawable(R.drawable.instagram_star_pano_filled_12);
        if (drawable != null) {
            drawable.setTint(AnonymousClass7TF.A03(context, 16842806));
        }
        this.A01 = drawable;
    }

    public final int getItemCount() {
        AnonymousClass0fD.A0A(-788337711, AnonymousClass0fD.A03(-2135305497));
        return 0;
    }
}

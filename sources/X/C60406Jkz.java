package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import java.util.List;

/* renamed from: X.Jkz  reason: case insensitive filesystem */
public final class C60406Jkz extends 2Rw {
    public int A00;
    public String A01;
    public final Context A02;
    public final UserSession A03;
    public final L0G A04;
    public final List A05 = AnonymousClass7TE.A1C();
    public final List A06 = AnonymousClass7TE.A1C();

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r24, int i) {
        LYV lyv;
        C60516Jmn jmn = (C60516Jmn) r24;
        int i2 = i;
        C317966o8 r7 = (C317966o8) ((C317876nz) this.A06.get(i2)).A0O.get(0);
        String str = jmn.A04;
        if (str == null || !str.equals(r7.A0H.getUrl())) {
            List list = this.A05;
            C317876nz BzU = ((C317466nJ) list.get(i2)).BzU();
            BzU.getClass();
            C317966o8 r6 = (C317966o8) BzU.A0O.get(0);
            boolean A1S = AnonymousClass7TF.A1S(this.A00, i2);
            RoundedCornerFrameLayout roundedCornerFrameLayout = jmn.A03;
            roundedCornerFrameLayout.getClass();
            if (A1S) {
                roundedCornerFrameLayout.setStrokeWidth((float) AnonymousClass7TG.A04(this.A02));
                roundedCornerFrameLayout.setStrokeColor(-1);
            } else {
                roundedCornerFrameLayout.setStrokeWidth(0.0f);
                roundedCornerFrameLayout.setStrokeColor(0);
            }
            jmn.A01 = BzU;
            jmn.A02 = r6;
            jmn.A05 = ((KK9) list.get(i2)).A00;
            jmn.A04 = r7.A0H.getUrl();
            ImageView imageView = jmn.A00;
            imageView.getClass();
            float f = r7.A01 / r7.A00;
            Context context = this.A02;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.canvas_gifs_tile_height);
            UserSession userSession = this.A03;
            ImageUrl imageUrl = r7.A0H;
            String str2 = r7.A0S;
            imageView.setImageDrawable(new C321016tR(context, userSession, imageUrl, (ImageUrl) null, (C41815B1v) null, C321066tW.A00(r7.A01 / r7.A00, (int) (((float) dimensionPixelSize) * f), dimensionPixelSize, -1), AnonymousClass05K.A00, str2, (float) JTR.A08(context), context.getColor(R.color.cds_white_a20), context.getColor(R.color.fds_white_alpha60), false));
            ImageView imageView2 = jmn.A00;
            imageView2.getClass();
            LY9.A00(imageView2, this, jmn, i2, 3);
            String str3 = jmn.A05;
            ImageView imageView3 = jmn.A00;
            if (str3 == null) {
                imageView3.getClass();
                lyv = null;
            } else {
                imageView3.getClass();
                lyv = new LYV(2, this, jmn);
            }
            imageView3.setOnLongClickListener(lyv);
        }
    }

    public C60406Jkz(Context context, UserSession userSession, L0G l0g) {
        this.A02 = context;
        this.A03 = userSession;
        this.A04 = l0g;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-1646101233);
        int size = this.A05.size();
        AnonymousClass0fD.A0A(2076523627, A032);
        return size;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.3kE, X.Jmn] */
    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        View A0C = DbT.A0C(DbV.A0D(viewGroup), viewGroup, R.layout.canvas_gifs_tile);
        ? r1 = new C249703kE(A0C);
        r1.A03 = (RoundedCornerFrameLayout) A0C.findViewById(R.id.canvas_gifs_tile_container);
        r1.A00 = DbS.A0G(A0C, R.id.canvas_gifs_tile_image_view);
        return r1;
    }
}

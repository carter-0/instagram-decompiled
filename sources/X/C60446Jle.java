package X;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Jle  reason: case insensitive filesystem */
public final class C60446Jle extends 2Rw implements AnonymousClass8XX {
    public final float A00;
    public final int A01;
    public final C355618Qr A02;
    public final UserSession A03;
    public final C61424K6y A04;
    public final List A05 = AnonymousClass7TE.A1C();

    public C60446Jle(C355618Qr r2, UserSession userSession, C61424K6y k6y, float f, int i) {
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        this.A04 = k6y;
        this.A02 = r2;
        this.A01 = i;
        this.A00 = f;
    }

    public final void Ecr(Integer num, String str, List list) {
        0qQ.A0B(list, 0);
        DbW.A0z(this, list, this.A05);
    }

    public final void Ejh(GalleryItem galleryItem, boolean z, boolean z2) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.widget.ImageView, com.instagram.igds.components.imagebutton.IgImageButton, android.view.View] */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r14, int i) {
        C60701Jpm jpm = (C60701Jpm) r14;
        0qQ.A0B(jpm, 0);
        Medium medium = (Medium) this.A05.get(i);
        C355618Qr r5 = this.A02;
        0qQ.A0B(medium, 0);
        TextView textView = jpm.A02;
        textView.setVisibility(8);
        textView.setAlpha(1.0f);
        ? r2 = jpm.A03;
        r2.setImageBitmap((Bitmap) null);
        r2.setOnClickListener((View.OnClickListener) null);
        r2.setImageAlpha(255);
        r2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        jpm.A01 = medium;
        jpm.A00 = r5.AGH((C348297yD) null, jpm.A00, medium, jpm, (Integer) null, (Integer) null, (Integer) null);
        if (medium.CeS()) {
            int i2 = medium.A03;
            if (i2 < 0 || i2 > 900500) {
                textView.setAlpha(0.3f);
                r2.setImageAlpha(77);
            }
        }
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        View A0D = DbT.A0D(DbX.A0F(viewGroup, 0), viewGroup, R.layout.upload_gallery_item, false);
        0nA.A0V(A0D, this.A01);
        return new C60701Jpm(A0D, this.A03, this.A04, this.A00);
    }

    public final List AN0() {
        return 0sn.A00;
    }

    public final /* synthetic */ List BPh() {
        return 0sn.A00;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(860768584);
        int size = this.A05.size();
        AnonymousClass0fD.A0A(458504446, A032);
        return size;
    }

    public final int getItemViewType(int i) {
        AnonymousClass0fD.A0A(-1133650971, AnonymousClass0fD.A03(-890483635));
        return 1;
    }
}

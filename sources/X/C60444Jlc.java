package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import java.util.List;

/* renamed from: X.Jlc  reason: case insensitive filesystem */
public final class C60444Jlc extends 2Rw implements AnonymousClass8XX {
    public final float A00;
    public final int A01;
    public final int A02;
    public final C355618Qr A03;
    public final KB9 A04;
    public final List A05 = AnonymousClass7TE.A1C();

    public final void Ecr(Integer num, String str, List list) {
        0qQ.A0B(list, 0);
        DbW.A0z(this, list, this.A05);
    }

    public final void Ejh(GalleryItem galleryItem, boolean z, boolean z2) {
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.widget.ImageView, com.instagram.igds.components.imagebutton.IgImageButton, android.view.View] */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r13, int i) {
        C60700Jpl jpl = (C60700Jpl) r13;
        0qQ.A0B(jpl, 0);
        Medium medium = (Medium) this.A05.get(i);
        0qQ.A0B(medium, 0);
        ? r3 = jpl.A02;
        r3.setImageBitmap((Bitmap) null);
        jpl.A01 = medium;
        jpl.A00 = jpl.A03.AGH((C348297yD) null, jpl.A00, medium, jpl, (Integer) null, (Integer) null, (Integer) null);
        Context context = r3.getContext();
        StringBuilder sb = new StringBuilder(context.getString(2131962961));
        Medium medium2 = jpl.A01;
        if (medium2 != null) {
            2eQ.A09(DbW.A0h(context, 1G0.A03(context, (double) ((int) medium2.A0C)), 2131957423), sb, true);
        }
        r3.setContentDescription(sb);
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        View A0A = DbU.A0A(DbX.A0F(viewGroup, 0), viewGroup, R.layout.layout_gallery_photo_item, false);
        0nA.A0g(A0A, this.A02, this.A01);
        return new C60700Jpl(A0A, this.A03, this, this.A00);
    }

    public final List BPh() {
        return this.A05;
    }

    public C60444Jlc(C355618Qr r3, KB9 kb9, int i, int i2) {
        this.A02 = i;
        this.A01 = i2;
        this.A03 = r3;
        this.A04 = kb9;
        this.A00 = ((float) i) / ((float) i2);
    }

    public final List AN0() {
        return AnonymousClass7TE.A1C();
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-24162446);
        int size = this.A05.size();
        AnonymousClass0fD.A0A(-299452108, A032);
        return size;
    }
}

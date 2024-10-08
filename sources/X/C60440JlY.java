package X;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.creation.photo.crop.LayoutImageView;
import java.util.ArrayList;

/* renamed from: X.JlY  reason: case insensitive filesystem */
public final class C60440JlY extends 2Rw implements MS3 {
    public LD3 A00;
    public final int A01;
    public final int A02;
    public final C355608Qq A03;
    public final MV4 A04;
    public final ArrayList A05 = AnonymousClass7TE.A1C();

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater A0F = DbX.A0F(viewGroup, 0);
        0qQ.A07(A0F);
        int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C60703Jpo(DbT.A0D(A0F, viewGroup, R.layout.layout_thumbnail_image_preview, false));
    }

    public final boolean DM9(int i, int i2) {
        ArrayList arrayList = this.A05;
        Object remove = arrayList.remove(i);
        0qQ.A07(remove);
        arrayList.add(i2, remove);
        notifyItemMoved(i, i2);
        return true;
    }

    /* JADX WARNING: type inference failed for: r6v3, types: [com.instagram.creation.photo.crop.LayoutImageView, X.JVz, android.view.View] */
    /* JADX WARNING: type inference failed for: r1v7, types: [X.JbJ, java.lang.Object] */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r14, int i) {
        1OO r1;
        String str;
        C60703Jpo jpo = (C60703Jpo) r14;
        0qQ.A0B(jpo, 0);
        C63810L7q l7q = (C63810L7q) DbZ.A0g(this.A05, i);
        int i2 = this.A02;
        int i3 = this.A01;
        C355608Qq r7 = this.A03;
        MV4 mv4 = this.A04;
        LD3 ld3 = this.A00;
        0qQ.A0B(l7q, 1);
        C252063oV r9 = jpo.A05;
        r9.setVisibility(8);
        C252063oV r12 = jpo.A04;
        r12.setVisibility(8);
        jpo.A03.setLayoutParams(l7q.A00);
        jpo.A01 = l7q;
        Medium medium = l7q.A03;
        if (mv4 == null || !mv4.CRJ()) {
            r9.setVisibility(0);
        } else {
            r12.setVisibility(0);
            ? r6 = (LayoutImageView) r12.getView();
            r6.setLayoutParams(l7q.A00);
            r6.A00 = new C65151LoG(mv4, jpo);
            Bitmap bitmap = l7q.A02;
            if (bitmap != null) {
                int i4 = medium.A07;
                bitmap.getHeight();
                bitmap.getWidth();
                r6.A0P(bitmap, i4);
                r6.A0N();
                ? obj = new Object();
                obj.A01 = bitmap;
                obj.A00 = i4 % 360;
                r6.setImageRotateBitmapResetBase(obj, (float[]) null, l7q.A00);
            }
        }
        jpo.A00 = ld3;
        boolean z = medium.A0G.A0B;
        if (z && medium.A08 == 3) {
            r1 = 1NK.A00().A0J(DbS.A0V(medium.A0a), "LayoutThumbnailViewBinder");
            str = medium.A0a;
            if (str == null) {
                throw AnonymousClass7TE.A0y();
            }
        } else if (z || r7 == null) {
            r1 = 1NK.A00().A0J(JTQ.A0G(medium.A0X), "LayoutThumbnailViewBinder");
            str = medium.A0X;
        } else if (medium.A0a == null) {
            r7.A05(medium, jpo);
            return;
        } else {
            r7.A04(medium, jpo);
            return;
        }
        r1.A01 = 1MF.A01(str, i2, i3);
        r1.A02(jpo);
        r1.A01();
    }

    public C60440JlY(C355608Qq r2, MV4 mv4, int i, int i2) {
        this.A02 = i;
        this.A01 = i2;
        this.A03 = r2;
        this.A04 = mv4;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-153348640);
        int size = this.A05.size();
        AnonymousClass0fD.A0A(-1328989256, A032);
        return size;
    }
}

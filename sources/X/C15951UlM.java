package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.discovery.related.model.RelatedItem;
import org.webrtc.CameraCapturer;

/* renamed from: X.UlM  reason: case insensitive filesystem */
public final class C15951UlM extends U9j {
    public final AnonymousClass0iw A00;

    /* JADX WARNING: type inference failed for: r2v1, types: [X.UBa, X.3kE] */
    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        View A0D = DbT.A0D(DbX.A0E(viewGroup), viewGroup, R.layout.related_item_visual_item_view, false);
        ? r2 = new C249703kE(A0D);
        r2.A00 = A0D;
        r2.A04 = JTR.A0i(A0D, R.id.related_item_image);
        r2.A01 = AnonymousClass7TE.A0b(r2.A00, R.id.related_item_image_placeholder);
        TextView A0R = AnonymousClass7TG.A0R(r2.A00, R.id.related_item_name);
        r2.A03 = A0R;
        C13988Tno.A16(A0R, true);
        r2.A02 = AnonymousClass7TE.A0d(r2.A00, R.id.related_item_media_count);
        return r2;
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r10, int i) {
        C14821UBa uBa = (C14821UBa) r10;
        0qQ.A0B(uBa, 0);
        RelatedItem relatedItem = (RelatedItem) 00k.A0O(this.A04, i);
        if (relatedItem != null) {
            View view = uBa.A00;
            Resources resources = view.getResources();
            if (!C253833rU.A02(relatedItem.A01)) {
                uBa.A01.setVisibility(8);
                IgImageView igImageView = uBa.A04;
                igImageView.setVisibility(0);
                ImageUrl imageUrl = relatedItem.A01;
                if (imageUrl != null) {
                    igImageView.setUrl(imageUrl, this.A00);
                }
            } else {
                uBa.A04.setVisibility(8);
                uBa.A01.setVisibility(0);
            }
            uBa.A03.setText(relatedItem.A01());
            TextView textView = uBa.A02;
            int i2 = relatedItem.A00;
            Integer valueOf = Integer.valueOf(i2);
            0qQ.A0A(resources);
            textView.setText(DbV.A0v(resources, C253673rC.A04(resources, valueOf, CameraCapturer.OPEN_CAMERA_TIMEOUT, false, false), R.plurals.number_of_posts, i2));
            WBG.A01(view, 26, this, relatedItem);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15951UlM(AnonymousClass0iw r1, 0xF r2, UserSession userSession, C17829Vgi vgi) {
        super(r1, r2, userSession, vgi);
        C51972G9s.A1B(vgi, r2);
        this.A00 = r1;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(-901507609);
        int size = this.A04.size();
        AnonymousClass0fD.A0A(1258261453, A03);
        return size;
    }

    public final int getItemViewType(int i) {
        AnonymousClass0fD.A0A(-1826725207, AnonymousClass0fD.A03(-1090238173));
        return 0;
    }
}

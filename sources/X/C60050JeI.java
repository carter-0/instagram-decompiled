package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.instagram.android.R;
import com.instagram.creation.base.MediaSession;
import java.util.List;

/* renamed from: X.JeI  reason: case insensitive filesystem */
public final class C60050JeI extends BaseAdapter {
    public final AnonymousClass0iw A00;
    public final C3499582p A01;
    public final C267834cI A02;

    public final View getView(int i, View view, ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 2);
        C3499582p r4 = this.A01;
        List Co4 = r4.A00().Co4();
        if (view == null) {
            if (((MediaSession) Co4.get(i)).Bsu().intValue() != 0) {
                view = DbV.A0D(viewGroup).inflate(R.layout.layout_video_preview, viewGroup, false);
                view.setTag(new C63803L7j(view));
            } else {
                view = LHr.A00(viewGroup);
            }
        }
        AnonymousClass3Q2 A0N = JTQ.A0N((MediaSession) Co4.get(i), this.A02);
        if (getItemViewType(i) == 0 && A0N != null) {
            Object tag = view.getTag();
            0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.album.MediaPreviewPhotoViewBinder.Holder");
            float AAx = r4.A00().AAx();
            LHr.A01(this.A00, (C62932Kok) tag, A0N, AAx);
        }
        return view;
    }

    public final int getCount() {
        return this.A01.A00().Co4().size();
    }

    public final Object getItem(int i) {
        return this.A01.A00().Co4().get(i);
    }

    public final long getItemId(int i) {
        String A0X = JTU.A0X(this.A01.A00(), i);
        if (A0X != null) {
            return Long.parseLong(A0X);
        }
        throw AnonymousClass7TE.A0y();
    }

    public final int getItemViewType(int i) {
        if (((MediaSession) this.A01.A00().Co4().get(i)).Bsu().intValue() == 0) {
            return 0;
        }
        return 1;
    }

    public C60050JeI(AnonymousClass0iw r1, C3499582p r2, C267834cI r3) {
        AnonymousClass7TG.A1U(r2, r3, r1);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}

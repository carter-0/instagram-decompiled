package X;

import android.view.View;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.7oD  reason: invalid class name and case insensitive filesystem */
public final class C342207oD implements C342217oE {
    public final View A00;
    public final C3499582p A01;
    public final C3508086k A02;
    public final AnonymousClass80U A03;
    public final C3495780x A04;

    public C342207oD(View view, C3499582p r3, C3508086k r4, AnonymousClass80U r5, C3495780x r6) {
        0qQ.A0B(view, 1);
        0qQ.A0B(r4, 2);
        0qQ.A0B(r5, 3);
        0qQ.A0B(r3, 4);
        0qQ.A0B(r6, 5);
        this.A00 = view;
        this.A02 = r4;
        this.A03 = r5;
        this.A01 = r3;
        this.A04 = r6;
    }

    public final void Dx2(int i, int i2, float f, float f2) {
        C3495780x r4 = this.A04;
        r4.A0B.Epw(new AnonymousClass34S(Integer.valueOf(i), Float.valueOf(f)));
        AnonymousClass2Fj r1 = r4.A04;
        boolean z = false;
        if (i == 0) {
            z = true;
        }
        r1.A0B(Boolean.valueOf(z));
        View view = this.A00;
        ArrayList A1M = 0sr.A1M(new View[]{view.requireViewById(R.id.clips_video_remix_camera_background)});
        float height = ((float) i) - ((((float) view.getHeight()) / 2.0f) * (1.0f - f));
        AnonymousClass80U r42 = this.A03;
        if (r42.CZe()) {
            C3508086k r3 = this.A02;
            r3.A00().EUq(f2);
            r3.A00().EUs(i2);
        } else if (r42.CZU() && !r42.CQ0(AnonymousClass80V.CLIPS_EDITOR) && !r42.CQ0(AnonymousClass80V.CLIPS_SHARESHEET)) {
            View requireViewById = view.requireViewById(R.id.post_capture_interactive_contents_container);
            0qQ.A07(requireViewById);
            A1M.add(requireViewById);
            View requireViewById2 = view.requireViewById(R.id.post_capture_texture_view_container);
            0qQ.A07(requireViewById2);
            A1M.add(requireViewById2);
        }
        Iterator it = A1M.iterator();
        while (it.hasNext()) {
            View view2 = (View) it.next();
            view2.setTranslationY(-height);
            view2.setScaleX(f);
            view2.setScaleY(f);
        }
    }
}

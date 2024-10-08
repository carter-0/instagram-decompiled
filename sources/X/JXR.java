package X;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.mediapicker.view.GalleryPickerMediaOverlayView;

public final class JXR extends C232232tF {
    public final C376529Ii A00;
    public final C355608Qq A01;
    public final UserSession A02;
    public final 0sP A03;
    public final 0sP A04;

    public JXR(C376529Ii r2, C355608Qq r3, UserSession userSession, 0sP r5, 0sP r6) {
        0qQ.A0B(r2, 2);
        this.A01 = r3;
        this.A00 = r2;
        this.A04 = r5;
        this.A03 = r6;
        this.A02 = userSession;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        C376529Ii r5 = this.A00;
        0qQ.A0B(r5, 1);
        Context context = viewGroup.getContext();
        View inflate = LayoutInflater.from(context).inflate(R.layout.gallery_picker_grid_item, viewGroup, false);
        0qQ.A0C(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        IgImageView findViewById = constraintLayout.findViewById(R.id.gallery_picker_grid_item_background);
        0qQ.A07(findViewById);
        View findViewById2 = constraintLayout.findViewById(R.id.gallery_picker_item_overlay);
        0qQ.A07(findViewById2);
        0qQ.A0A(context);
        C59738JVw A002 = JXQ.A00(findViewById);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        C59739JVx jVx = new C59739JVx(constraintLayout, new C59851JaS((GalleryPickerMediaOverlayView) findViewById2), A002);
        String A042 = AnonymousClass8XE.A04((Integer) r5.A05);
        ViewGroup.LayoutParams layoutParams = jVx.A03.A07.getLayoutParams();
        0qQ.A0C(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((C71492dQ) layoutParams).A0z = A042;
        return jVx;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r34, C249703kE r35) {
        String str;
        ColorFilter colorFilter;
        C59898JbN jbN;
        String str2;
        C361718gg r3 = (C361718gg) r34;
        C59739JVx jVx = (C59739JVx) r35;
        0qQ.A0B(r3, 0);
        0qQ.A0B(jVx, 1);
        C59852JaT jaT = new C59852JaT(this, r3);
        C376529Ii r11 = this.A00;
        C355608Qq r22 = this.A01;
        UserSession userSession = this.A02;
        0qQ.A0B(r11, 2);
        0qQ.A0B(r22, 3);
        0qQ.A0B(userSession, 5);
        MQB mqb = jVx.A02;
        if (mqb instanceof C59851JaS) {
            C59851JaS jaS = (C59851JaS) mqb;
            ConstraintLayout constraintLayout = jVx.A01;
            Context context = constraintLayout.getContext();
            GalleryItem.LocalGalleryMedium localGalleryMedium = r3.A01;
            AnonymousClass9I9 r7 = r3.A00;
            C362958in r32 = r3.A02;
            AnonymousClass0fU.A00(new C64253LXf(1, context, r7, r32, jaT, localGalleryMedium), constraintLayout);
            constraintLayout.setOnLongClickListener(new LYX(0, context, localGalleryMedium, jaT, jVx));
            Medium medium = jVx.A00;
            if (medium != null) {
                str = String.valueOf(medium.A05);
            } else {
                str = null;
            }
            Medium medium2 = localGalleryMedium.A00;
            boolean z = true;
            boolean z2 = !0qQ.A0K(str, String.valueOf(medium2.A05));
            jVx.A00 = medium2;
            0Tu r2 = 0Tu.A05;
            if (182.A06(r2, userSession, 36319493290728899L)) {
                z = r7.A02;
            }
            boolean z3 = r7.A04;
            boolean z4 = z3;
            if (!z3 || !z) {
                colorFilter = null;
            } else {
                colorFilter = jVx.A03.A00;
            }
            boolean z5 = r7.A02;
            int i = r7.A00;
            boolean z6 = r32.A06;
            boolean z7 = r32.A03;
            boolean z8 = r32.A04;
            C59738JVw jVw = jVx.A03;
            jVw.A07.setColorFilter(colorFilter);
            if (z2) {
                JXQ.A02(r11, jVw);
                if (C59853JaU.A00) {
                    2el A002 = AnonymousClass2hM.A00(constraintLayout);
                    if (A002 != null) {
                        A002.A04(constraintLayout);
                    }
                    C59853JaU.A00 = false;
                }
            }
            String str3 = medium2.A0G.A03;
            if (str3 != null) {
                if (C59737JVv.A06(userSession, str3)) {
                    jbN = C59898JbN.GLASSES_CAPTURE;
                }
                jbN = C59898JbN.A06;
            } else {
                if (z8 && 182.A06(r2, userSession, 36329285816041433L)) {
                    C59737JVv.A05(medium2, userSession, new J6W(18, medium2, userSession, jVx));
                }
                jbN = C59898JbN.A06;
            }
            GalleryPickerMediaOverlayView galleryPickerMediaOverlayView = jaS.A00;
            C59853JaU.A00(jbN, galleryPickerMediaOverlayView);
            if (!C59853JaU.A00) {
                C59853JaU.A00 = true;
                2el A003 = AnonymousClass2hM.A00(constraintLayout);
                if (A003 != null) {
                    C2354830a A004 = AnonymousClass30Y.A00(new C59860Jac(medium2), new C59671JTb(2), String.valueOf(medium2.A05));
                    A004.A00(new C59926Jbp(0, userSession, jaS));
                    A003.A05(constraintLayout, A004.A01());
                }
            }
            galleryPickerMediaOverlayView.A09 = z6;
            if (!medium2.CeS() || medium2.A03 <= 0) {
                str2 = null;
            } else {
                str2 = medium2.B8E();
            }
            galleryPickerMediaOverlayView.A04 = str2;
            galleryPickerMediaOverlayView.A06 = z5;
            C321486uG r1 = galleryPickerMediaOverlayView.A0C.A00;
            r1.A04 = z5;
            r1.invalidateSelf();
            r1.A00(i + 1);
            galleryPickerMediaOverlayView.A07 = z4;
            galleryPickerMediaOverlayView.A05 = z7;
            boolean z9 = false;
            if (z2) {
                galleryPickerMediaOverlayView.A0B = false;
                galleryPickerMediaOverlayView.invalidate();
            }
            if (jbN == C59898JbN.GLASSES_CAPTURE) {
                z9 = true;
            }
            galleryPickerMediaOverlayView.A08 = z9;
            galleryPickerMediaOverlayView.A02 = jbN;
            constraintLayout.setEnabled(true);
            C59896JbL jbL = new C59896JbL(1, r11, jaS, jVx);
            jVw.A05 = jbL;
            jVw.A04 = r22.AGH((C348297yD) null, jVw.A04, medium2, jbL, (Integer) null, (Integer) null, (Integer) null);
            0qQ.A0A(context);
            constraintLayout.setContentDescription(C59848JaO.A00(context, medium2, r7.A00, r7.A01, false, localGalleryMedium.A06(), z6));
        }
    }

    public final Class modelClass() {
        return C361718gg.class;
    }
}

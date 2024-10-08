package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.gallery.Draft;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.mediapicker.view.GalleryPickerMediaOverlayView;

/* renamed from: X.JWs  reason: case insensitive filesystem */
public final class C59755JWs extends C232232tF {
    public final C376529Ii A00;
    public final AnonymousClass8XV A01;
    public final UserSession A02;
    public final 0sP A03;
    public final 0sP A04;

    public C59755JWs(C376529Ii r2, AnonymousClass8XV r3, UserSession userSession, 0sP r5, 0sP r6) {
        0qQ.A0B(r2, 2);
        this.A02 = userSession;
        this.A00 = r2;
        this.A01 = r3;
        this.A04 = r5;
        this.A03 = r6;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View inflate = DbX.A0F(viewGroup, 0).inflate(R.layout.gallery_picker_grid_item, viewGroup, false);
        0qQ.A0C(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        IgImageView A0i = JTR.A0i(constraintLayout, R.id.gallery_picker_grid_item_background);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C60656Jp3(constraintLayout, new C59851JaS((GalleryPickerMediaOverlayView) AnonymousClass7TE.A0b(constraintLayout, R.id.gallery_picker_item_overlay)), JXQ.A00(A0i));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r26, C249703kE r27) {
        String str;
        Bitmap bitmap;
        int i;
        C64793LiD liD = (C64793LiD) r26;
        C60656Jp3 jp3 = (C60656Jp3) r27;
        AnonymousClass7TG.A1N(liD, jp3);
        C63697L3h l3h = new C63697L3h(this, liD);
        C376529Ii r11 = this.A00;
        AnonymousClass8XV r4 = this.A01;
        if (r4 != null) {
            UserSession userSession = this.A02;
            DbW.A1N(r11, 2, userSession);
            ConstraintLayout constraintLayout = jp3.A03;
            GalleryItem galleryItem = liD.A01;
            Draft draft = galleryItem.A02;
            if (draft != null) {
                Draft draft2 = jp3.A01;
                if (draft2 != null) {
                    str = draft2.A04;
                } else {
                    str = null;
                }
                boolean A0K = 0qQ.A0K(str, draft.A04);
                boolean z = true;
                boolean z2 = !A0K;
                jp3.A01 = draft;
                AnonymousClass0fU.A00(new C64255LXh(0, constraintLayout, jp3, galleryItem, userSession, l3h, liD), constraintLayout);
                constraintLayout.setOnLongClickListener(new LYW(1, jp3, constraintLayout, l3h));
                AnonymousClass9I9 r10 = liD.A00;
                boolean z3 = liD.A02.A06;
                LNL lnl = LNL.A00;
                C59738JVw jVw = jp3.A05;
                C59851JaS jaS = jp3.A04;
                String str2 = null;
                if (draft.A05) {
                    bitmap = jp3.A00;
                    if (bitmap == null) {
                        bitmap = BitmapFactory.decodeResource(jaS.A00.getResources(), R.drawable.filled_grid_album_icon);
                        if (bitmap != null) {
                            jp3.A00 = bitmap;
                        } else {
                            throw AnonymousClass7TE.A0y();
                        }
                    }
                } else {
                    bitmap = null;
                }
                if (draft.A06 && (i = draft.A00) > 0) {
                    str2 = C347917xa.A01(i);
                }
                lnl.A00(bitmap, constraintLayout, r10, r11, galleryItem, jaS, jVw, str2, z2, z3);
                C64713Lgm lgm = new C64713Lgm(r11, jp3);
                jp3.A02 = lgm;
                r4.A02.ATE(new C61702KIs(draft, r4, C51965G9l.A0v(lgm)));
                jaS.A00.invalidate();
                constraintLayout.invalidate();
                if (z3 && !draft.A08) {
                    z = false;
                }
                constraintLayout.setEnabled(z);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
        throw AnonymousClass7TE.A0y();
    }

    public final Class modelClass() {
        return C64793LiD.class;
    }
}

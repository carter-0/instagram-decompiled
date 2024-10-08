package X;

import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceDataSource;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.8AT  reason: invalid class name */
public final class AnonymousClass8AT extends 2Rw implements AnonymousClass8AN {
    public int A00 = -1;
    public boolean A01;
    public final Handler A02 = new Handler(Looper.getMainLooper());
    public final GalleryPickerServiceDataSource A03;
    public final UserSession A04;
    public final AnonymousClass8AH A05;
    public final AnonymousClass8AN A06;
    public final AnonymousClass825 A07;
    public final AnonymousClass2S0 A08 = AnonymousClass2S0.A01;

    public final void DBT(View view) {
        0nA.A0q(view, new C41029AnD(view, this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r9 != 0) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(X.C249703kE r8, int r9) {
        /*
            r7 = this;
            X.9YT r8 = (X.AnonymousClass9YT) r8
            boolean r0 = r7.A01
            if (r0 == 0) goto L_0x000a
            r0 = 0
            r6 = 1
            if (r9 == r0) goto L_0x000b
        L_0x000a:
            r6 = 0
        L_0x000b:
            r5 = 2131099778(0x7f060082, float:1.7811919E38)
            r4 = 2131237391(0x7f081a0f, float:1.8091031E38)
            com.instagram.common.session.UserSession r3 = r8.A01
            r0 = 0
            X.0qQ.A0B(r3, r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327627958663752(0x810fc900023a48, double:3.037076428450972E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x002a
            r5 = 2131100036(0x7f060184, float:1.7812442E38)
            r4 = 2131237392(0x7f081a10, float:1.8091033E38)
        L_0x002a:
            com.instagram.common.ui.base.IgTextView r2 = r8.A02
            android.view.View r0 = r8.A00
            android.content.Context r1 = r0.getContext()
            if (r6 != 0) goto L_0x0037
            r4 = 2131237393(0x7f081a11, float:1.8091035E38)
        L_0x0037:
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r4)
            r2.setBackground(r0)
            if (r6 != 0) goto L_0x0043
            r5 = 2131100036(0x7f060184, float:1.7812442E38)
        L_0x0043:
            int r0 = r1.getColor(r5)
            r2.setTextColor(r0)
            android.view.View r2 = r8.A00
            int r1 = r2.getWidth()
            int r0 = r7.A00
            if (r1 == r0) goto L_0x005d
            int r0 = r2.getWidth()
            r7.A00 = r0
            r7.DBT(r2)
        L_0x005d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8AT.onBindViewHolder(X.3kE, int):void");
    }

    public AnonymousClass8AT(GalleryPickerServiceDataSource galleryPickerServiceDataSource, UserSession userSession, AnonymousClass8AH r5, AnonymousClass8AN r6, AnonymousClass825 r7) {
        this.A07 = r7;
        this.A05 = r5;
        this.A06 = r6;
        this.A03 = galleryPickerServiceDataSource;
        this.A04 = userSession;
    }

    public final int getItemCount() {
        AnonymousClass0fD.A0A(888802640, AnonymousClass0fD.A03(-835443584));
        return 1;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.9YT, X.3kE] */
    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.generic_effect_picker_text_tile, viewGroup, false);
        if (this.A00 == -1 && inflate != null) {
            0nA.A0p(inflate, new C41028AnC(inflate, this));
        }
        AnonymousClass825 r1 = this.A07;
        AnonymousClass8AH r3 = this.A05;
        UserSession userSession = this.A04;
        ? r2 = new C249703kE(inflate);
        r2.A01 = userSession;
        r2.A00 = inflate;
        IgTextView requireViewById = inflate.requireViewById(R.id.effect_picker_button_text_view);
        r2.A02 = requireViewById;
        r2.A04 = r1;
        r2.A03 = this;
        View view = r2.A00;
        if (!(view == null || requireViewById == null || r3 == null)) {
            AnonymousClass0fU.A00(new ANN(r3, r2), view);
        }
        GalleryPickerServiceDataSource galleryPickerServiceDataSource = this.A03;
        if (galleryPickerServiceDataSource != null) {
            galleryPickerServiceDataSource.setGalleryPickerServiceListener(r2);
        }
        return r2;
    }
}

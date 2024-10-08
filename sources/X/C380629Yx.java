package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.9Yx  reason: invalid class name and case insensitive filesystem */
public final class C380629Yx extends C249703kE implements B2Y {
    public C369988ve A00;
    public final ColorDrawable A01;
    public final View A02;
    public final ImageView A03;
    public final ImageView A04;
    public final TextView A05;
    public final TextView A06;
    public final UserSession A07;
    public final C362018hC A08;
    public final C362358hl A09;
    public final C59740JVy A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C380629Yx(View view, UserSession userSession, C362018hC r10, C362358hl r11) {
        super(view);
        AnonymousClass7TG.A0w(2, userSession, r11, r10);
        this.A07 = userSession;
        this.A09 = r11;
        this.A08 = r10;
        View findViewById = view.findViewById(R.id.gallery_drafts_item_imageview);
        ImageView imageView = (ImageView) findViewById;
        AnonymousClass0fU.A00(new AOW(8, imageView, this), imageView);
        0qQ.A07(findViewById);
        this.A03 = imageView;
        Context A0S = AnonymousClass7TE.A0S(view);
        C59740JVy jVy = new C59740JVy(A0S);
        jVy.A00 = 1;
        this.A0A = jVy;
        View findViewById2 = view.findViewById(R.id.gallery_drafts_item_selection_circle);
        ImageView imageView2 = (ImageView) findViewById2;
        if (182.A06(0Tu.A05, userSession, 36320253499678855L)) {
            imageView2.setImageDrawable(jVy);
        }
        0qQ.A07(findViewById2);
        this.A04 = imageView2;
        this.A06 = (TextView) AnonymousClass7TE.A0b(view, R.id.gallery_drafts_expiration_time);
        this.A05 = (TextView) AnonymousClass7TE.A0b(view, R.id.gallery_grid_item_duration);
        this.A01 = new ColorDrawable(AnonymousClass7TF.A03(A0S, R.attr.igds_color_creation_tools_grey_09));
        this.A02 = AnonymousClass7TE.A0b(view, R.id.gallery_drafts_item_selection_overlay);
    }

    public final /* bridge */ /* synthetic */ boolean CWQ(Object obj) {
        return obj.equals(this.A00);
    }

    public final void DrP(C254673sr r4) {
        String str;
        if (r4 != null) {
            str = r4.A02;
        } else {
            str = null;
        }
        0kD.A0F("StoryDraftViewHolder", 002.A0R("Draft cover thumbnail path load failed in StoryDraftViewHolder#onThumbnailLoadFailed. info: ", str), (Throwable) null);
    }

    public final /* bridge */ /* synthetic */ void DrS(Bitmap bitmap, Object obj) {
        C369988ve r11 = (C369988ve) obj;
        0qQ.A0B(r11, 0);
        String str = r11.A06;
        if (str == null) {
            0kD.A0F("StoryDraftViewHolder", "draft cover thumbnail path is null", (Throwable) null);
            return;
        }
        Context context = this.itemView.getContext();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        0qQ.A0A(context);
        int A022 = AnonymousClass8XE.A02(context);
        0qQ.A0B(context, 0);
        int A012 = AnonymousClass1GB.A01(((float) AnonymousClass8XE.A02(context)) / 0.5625f);
        int A013 = C364678lo.A01(str);
        boolean z = 1MF.A02;
        Matrix A0U = AnonymousClass7TE.A0U();
        1MF.A0J(A0U, width, height, A022, A012, A013, false);
        ImageView imageView = this.A03;
        imageView.setImageMatrix(A0U);
        imageView.setImageBitmap(bitmap);
    }
}

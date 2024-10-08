package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import java.io.File;

/* renamed from: X.Aqi  reason: case insensitive filesystem */
public final class C41246Aqi implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ Medium A02;
    public final /* synthetic */ AnonymousClass8ME A03;
    public final /* synthetic */ File A04;
    public final /* synthetic */ boolean A05;

    public C41246Aqi(Medium medium, AnonymousClass8ME r2, File file, long j, long j2, boolean z) {
        this.A05 = z;
        this.A02 = medium;
        this.A04 = file;
        this.A00 = j;
        this.A01 = j2;
        this.A03 = r2;
    }

    public final void run() {
        if (this.A05) {
            Medium A012 = C282665Eg.A01(this.A02);
            String absolutePath = this.A04.getAbsolutePath();
            0qQ.A0B(absolutePath, 0);
            A012.A0X = absolutePath;
            A012.A03 = (int) (this.A00 - this.A01);
            AnonymousClass8ME r2 = this.A03;
            C317876nz r0 = C317876nz.A0a;
            C317876nz A002 = C317886o0.A00();
            C39890ADo aDo = new C39890ADo();
            aDo.A0F = true;
            aDo.A0C = "StickerOverlayController";
            aDo.A0B = 0;
            aDo.A09 = Integer.valueOf(AnonymousClass8ME.A02(r2));
            try {
                UserSession userSession = r2.A0r;
                C391149sQ r9 = C391149sQ.GALLERY_STICKER;
                Context context = r2.A0f;
                r2.A1H(new AnonymousClass9X8(new C376429Hy((float) AnonymousClass7TG.A05(context)), A012, userSession, r9, C391099sL.NOT_CLIPS, "gallery_story_video_sticker", 0.0f, context.getResources().getDimensionPixelSize(R.dimen.asset_picker_video_sticker_width), context.getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width), -1, AnonymousClass972.MUTABLE_FLAG_MASK, false), A002, aDo);
            } catch (IllegalArgumentException unused) {
                C59689JTv.A0B(r2.A0f, "select_gallery_video_failed");
            }
        } else {
            C59689JTv.A0B(this.A03.A0f, "gallery_video_creation_failed");
        }
    }
}

package X;

import android.view.View;
import com.instagram.music.search.MusicOverlayResultsListController;

/* renamed from: X.Kas  reason: case insensitive filesystem */
public final class C62139Kas extends AnonymousClass7AK {
    public final int A00 = 0;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62139Kas(C63693L3d l3d, int i) {
        super(Integer.valueOf(i));
        this.A01 = l3d;
    }

    public final void onClick(View view) {
        if (this.A00 != 0) {
            MusicOverlayResultsListController musicOverlayResultsListController = (MusicOverlayResultsListController) this.A01;
            FH7.A08(musicOverlayResultsListController.A0A.requireActivity(), musicOverlayResultsListController.A0B, 2EG.A2Z, "https://www.facebook.com/help/instagram/402084904469945?ref=audio_browser", musicOverlayResultsListController.A0K);
            return;
        }
        C63693L3d l3d = (C63693L3d) this.A01;
        l3d.A01.A00(l3d.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62139Kas(MusicOverlayResultsListController musicOverlayResultsListController, int i) {
        super(Integer.valueOf(i));
        this.A01 = musicOverlayResultsListController;
    }
}

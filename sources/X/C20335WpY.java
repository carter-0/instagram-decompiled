package X;

import android.graphics.RectF;
import android.view.View;
import android.widget.ListView;
import com.instagram.archive.fragment.ArchiveReelFragment;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.WpY  reason: case insensitive filesystem */
public final /* synthetic */ class C20335WpY implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ ListView A02;
    public final /* synthetic */ ArchiveReelFragment A03;
    public final /* synthetic */ String A04;

    public /* synthetic */ C20335WpY(ListView listView, ArchiveReelFragment archiveReelFragment, String str, int i, int i2) {
        this.A03 = archiveReelFragment;
        this.A02 = listView;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = str;
    }

    public final void run() {
        ArchiveReelFragment archiveReelFragment = this.A03;
        ListView listView = this.A02;
        int i = this.A00;
        int i2 = this.A01;
        String str = this.A04;
        ArchiveReelFragment.A02(archiveReelFragment);
        View A0O = C13989Tnp.A0O(listView, i);
        if (A0O != null && A0O.getTag() != null && (A0O.getTag() instanceof C17795Vg7)) {
            MediaFrameLayout A002 = ((C17795Vg7) A0O.getTag()).A00(i2);
            archiveReelFragment.mContextualNavigationAnimationTargetView = A002;
            RectF rectF = 0nA.A01;
            RectF rectF2 = new RectF();
            0nA.A0L(rectF2, listView);
            RectF A0F = 0nA.A0F(A002);
            A0F.offset(-rectF2.left, 0.0f);
            archiveReelFragment.A01.A02.put(str, A0F);
        }
    }
}

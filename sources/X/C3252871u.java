package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.repository.storyhighlights.StoryHighlightsTrayManager$Instance;

/* renamed from: X.71u  reason: invalid class name and case insensitive filesystem */
public final class C3252871u extends 0Yg implements 0sP {
    public final /* synthetic */ C322936we A00;
    public final /* synthetic */ C62320sa A01;
    public final /* synthetic */ boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3252871u(C322936we r2, C62320sa r3, boolean z) {
        super(1);
        this.A02 = z;
        this.A00 = r2;
        this.A01 = r3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View view;
        RecyclerView recyclerView;
        View view2;
        RecyclerView recyclerView2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (this.A02) {
            if (!(!booleanValue || (view2 = this.A00.A0C.mView) == null || (recyclerView2 = (RecyclerView) view2.findViewById(R.id.highlights_reel_tray_recycler_view)) == null)) {
                recyclerView2.A0o(0);
            }
            C322936we r4 = this.A00;
            StoryHighlightsTrayManager$Instance storyHighlightsTrayManager$Instance = r4.A0D;
            if (!(!storyHighlightsTrayManager$Instance.CKZ() || (view = r4.A0C.mView) == null || (recyclerView = (RecyclerView) view.findViewById(R.id.highlights_reel_tray_recycler_view)) == null)) {
                recyclerView.A15(new C238323Bk(r4.A0A, storyHighlightsTrayManager$Instance));
            }
        }
        this.A01.invoke();
        return C60340gF.A00;
    }
}

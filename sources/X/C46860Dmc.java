package X;

import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.Dmc  reason: case insensitive filesystem */
public final class C46860Dmc extends C249403jg {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Reel A01;
    public final /* synthetic */ C230212pD A02;
    public final /* synthetic */ C2365834h A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public C46860Dmc(Reel reel, C230212pD r2, C2365834h r3, Integer num, String str, String str2, int i, boolean z) {
        this.A00 = i;
        this.A02 = r2;
        this.A01 = reel;
        this.A03 = r3;
        this.A05 = str;
        this.A04 = num;
        this.A07 = z;
        this.A06 = str2;
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A032 = AnonymousClass0fD.A03(1908071985);
        RecyclerView recyclerView2 = recyclerView;
        0qQ.A0B(recyclerView2, 0);
        int i3 = this.A00;
        AnonymousClass3N2 r4 = (AnonymousClass3N2) recyclerView2.A0W(i3);
        if (r4 != null) {
            Rect rect = new Rect();
            recyclerView2.getDrawingRect(rect);
            float x = r4.BkN().getX();
            if (((float) rect.left) <= x && ((float) rect.right) >= x + ((float) r4.BkN().getWidth())) {
                recyclerView2.A16(this);
                C230212pD r42 = this.A02;
                Reel reel = this.A01;
                List list = this.A03.A03;
                0qQ.A07(list);
                String str = this.A05;
                r42.A04(recyclerView2, reel, this.A04, str, this.A06, list, 0.0f, i3, 0, this.A07);
            }
        }
        AnonymousClass0fD.A0A(650488959, A032);
    }
}

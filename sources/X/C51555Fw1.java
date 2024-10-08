package X;

import androidx.recyclerview.widget.RecyclerView;
import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.Fw1  reason: case insensitive filesystem */
public final class C51555Fw1 implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ RecyclerView A03;
    public final /* synthetic */ Reel A04;
    public final /* synthetic */ C230212pD A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ List A09;
    public final /* synthetic */ boolean A0A;

    public C51555Fw1(RecyclerView recyclerView, Reel reel, C230212pD r3, Integer num, String str, String str2, List list, float f, int i, int i2, boolean z) {
        this.A03 = recyclerView;
        this.A01 = i;
        this.A05 = r3;
        this.A04 = reel;
        this.A09 = list;
        this.A07 = str;
        this.A06 = num;
        this.A0A = z;
        this.A02 = i2;
        this.A00 = f;
        this.A08 = str2;
    }

    public final void run() {
        RecyclerView recyclerView = this.A03;
        AnonymousClass3N2 r4 = (AnonymousClass3N2) recyclerView.A0W(this.A01);
        if (r4 != null) {
            C230212pD r3 = this.A05;
            Reel reel = this.A04;
            List list = this.A09;
            String str = this.A07;
            Integer num = this.A06;
            boolean z = this.A0A;
            int i = this.A02;
            C230212pD.A02(recyclerView, reel, r3, r4, num, str, this.A08, list, this.A00, i, z);
        }
    }
}

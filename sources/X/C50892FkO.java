package X;

import android.graphics.RectF;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.FkO  reason: case insensitive filesystem */
public final class C50892FkO implements AnonymousClass6VG {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ RecyclerView A02;
    public final /* synthetic */ Reel A03;
    public final /* synthetic */ C230212pD A04;
    public final /* synthetic */ AnonymousClass3N2 A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ List A09;
    public final /* synthetic */ boolean A0A;

    public C50892FkO(RecyclerView recyclerView, Reel reel, C230212pD r3, AnonymousClass3N2 r4, Integer num, String str, String str2, List list, float f, int i, boolean z) {
        this.A04 = r3;
        this.A03 = reel;
        this.A09 = list;
        this.A05 = r4;
        this.A02 = recyclerView;
        this.A07 = str;
        this.A06 = num;
        this.A0A = z;
        this.A01 = i;
        this.A00 = f;
        this.A08 = str2;
    }

    public final void CfR(long j, boolean z) {
        C230212pD r10 = this.A04;
        Reel reel = this.A03;
        ArrayList A002 = C230212pD.A00(r10, this.A09);
        AnonymousClass3N2 r12 = this.A05;
        RecyclerView recyclerView = this.A02;
        String str = this.A07;
        if (str == null) {
            str = "";
        }
        Integer num = this.A06;
        boolean z2 = this.A0A;
        int i = this.A01;
        float f = this.A00;
        String str2 = this.A08;
        AnonymousClass3BQ r9 = AnonymousClass3BQ.IN_FEED_HIGHLIGHTS_TRAY;
        if (!0qQ.A0K(str2, "highlights_in_feed")) {
            r9 = AnonymousClass3BQ.IN_FEED_STORIES_TRAY;
        }
        r12.CLE();
        RectF AeG = r12.AeG();
        RectF BG0 = ((C241103Nw) r12).BG0();
        C227812jx r0 = r10.A03;
        AnonymousClass3K2 A072 = 1OP.A07(r0.requireActivity(), r10.A04);
        float f2 = f;
        A072.A0V(AeG, BG0, r0, reel, r9, new FkX(recyclerView, r9, r10, A072, r12, num, str, str2, A002, f2, i, j, z, z2), (String) null, (List) null, Collections.emptySet(), f, i, false);
    }
}

package X;

import android.graphics.RectF;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.FkM  reason: case insensitive filesystem */
public final class C50891FkM implements AnonymousClass6VG {
    public final /* synthetic */ Reel A00;
    public final /* synthetic */ C230212pD A01;
    public final /* synthetic */ C47008Dp0 A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;

    public C50891FkM(Reel reel, C230212pD r2, C47008Dp0 dp0, Integer num, String str, String str2, List list) {
        this.A01 = r2;
        this.A00 = reel;
        this.A06 = list;
        this.A02 = dp0;
        this.A05 = str;
        this.A04 = str2;
        this.A03 = num;
    }

    public final void CfR(long j, boolean z) {
        C230212pD r6 = this.A01;
        Reel reel = this.A00;
        ArrayList A002 = C230212pD.A00(r6, this.A06);
        C47008Dp0 dp0 = this.A02;
        String str = this.A05;
        AnonymousClass3BQ r5 = AnonymousClass3BQ.IN_FEED_HIGHLIGHTS_TRAY;
        if (!0qQ.A0K(str, "highlights_in_feed")) {
            r5 = AnonymousClass3BQ.IN_FEED_STORIES_TRAY;
        }
        String str2 = this.A04;
        if (str2 == null) {
            str2 = "";
        }
        Integer num = this.A03;
        RectF A0F = 0nA.A0F(dp0.A00);
        C227812jx r14 = r6.A03;
        AnonymousClass3K2 A07 = 1OP.A07(r14.requireActivity(), r6.A04);
        A07.A0T((RectF) null, A0F, r14, reel, r5, new FkW(A0F, r5, r6, A07, num, str2, A002, j, z), -1);
    }
}

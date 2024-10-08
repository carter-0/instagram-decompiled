package X;

import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.adapter.CreatorInspirationSignalsPlaygroundAudioRecommendationsAdapter;

/* renamed from: X.Hp4  reason: case insensitive filesystem */
public final class C55883Hp4 {
    public final Context A00;
    public final FragmentActivity A01;
    public final AnonymousClass3B3 A02;
    public final C249403jg A03;
    public final UserSession A04;
    public final CreatorInspirationSignalsPlaygroundAudioRecommendationsAdapter A05;
    public final C53061Ght A06;
    public final C52967GgK A07;
    public final String A08;
    public final C57158IQx A09;
    public final C57614Idf A0A;

    public C55883Hp4(Context context, FragmentActivity fragmentActivity, AnonymousClass3B3 r20, C249403jg r21, AnonymousClass0iw r22, UserSession userSession, C234502xy r24, C52967GgK ggK, String str, String str2, int i, int i2) {
        UserSession userSession2 = userSession;
        String str3 = str;
        C51972G9s.A1B(str3, userSession2);
        C52967GgK ggK2 = ggK;
        0qQ.A0B(ggK2, 6);
        AnonymousClass3B3 r4 = r20;
        C249403jg r0 = r21;
        C51972G9s.A1F(r0, r4);
        this.A08 = str3;
        Context context2 = context;
        this.A00 = context2;
        this.A01 = fragmentActivity;
        this.A04 = userSession2;
        this.A07 = ggK2;
        this.A03 = r0;
        this.A02 = r4;
        C57614Idf idf = new C57614Idf(this, str2);
        this.A0A = idf;
        Integer num = null;
        C55673HlW hlW = new C55673HlW("signals_playground", (String) null);
        Resources resources = context2.getResources();
        int i3 = i;
        int i4 = i2;
        this.A06 = new C53061Ght(userSession2, idf, hlW, resources != null ? Integer.valueOf(AnonymousClass7TE.A0B(resources)) : num, Integer.valueOf(AnonymousClass7TF.A03(context2, R.attr.igds_color_loading_shimmer_dark)), i3, i4, false, false, false, false);
        C57158IQx iQx = new C57158IQx(this);
        this.A09 = iQx;
        this.A05 = new CreatorInspirationSignalsPlaygroundAudioRecommendationsAdapter(i3, i4, r24, r22, iQx);
    }
}

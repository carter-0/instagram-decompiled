package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.ui.primer.ColorTint;
import com.instagram.ui.primer.IconConfig;
import com.instagram.ui.primer.InfoItem;
import com.instagram.ui.primer.PrimerBottomSheetConfig;
import com.instagram.ui.primer.TitleIcon;

/* renamed from: X.IWf  reason: case insensitive filesystem */
public final class C57296IWf implements G6H {
    public final AnonymousClass4DH A00;
    public final UserSession A01;
    public final Context A02;

    public C57296IWf(AnonymousClass4DH r2, UserSession userSession) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
        this.A01 = userSession;
        this.A02 = r2.requireContext();
    }

    public final void CI0(Uri uri, Bundle bundle) {
        Uri uri2 = uri;
        0qQ.A0B(uri2, 0);
        UserSession userSession = this.A01;
        TitleIcon titleIcon = new TitleIcon((ColorTint) null, R.drawable.reels_content_studio_ig_reels_pride_icon);
        Context context = this.A02;
        String string = context.getString(2131955972);
        IconConfig.IconWithTextConfig iconWithTextConfig = new IconConfig.IconWithTextConfig(R.drawable.instagram_circle_outline_44, RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        String A16 = AnonymousClass7TE.A16(context, 2131955976);
        Integer valueOf = Integer.valueOf(R.color.igds_primary_text);
        LOZ loz = new LOZ(userSession, new PrimerBottomSheetConfig(titleIcon, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, "ClipsCameraWithTrendNuxActionHandler", AnonymousClass7TE.A16(context, 2131955980), AnonymousClass7TE.A16(context, 2131960862), (String) null, 0sr.A1P(new InfoItem[]{new InfoItem(iconWithTextConfig, valueOf, A16, string), new InfoItem(new IconConfig.IconWithTextConfig(R.drawable.instagram_circle_outline_44, "2"), valueOf, AnonymousClass7TE.A16(context, 2131955977), context.getString(2131955973)), new InfoItem(new IconConfig.IconWithTextConfig(R.drawable.instagram_circle_outline_44, "3"), valueOf, AnonymousClass7TE.A16(context, 2131955978), context.getString(2131955974)), new InfoItem(new IconConfig.IconWithTextConfig(R.drawable.instagram_circle_outline_44, "4"), valueOf, AnonymousClass7TE.A16(context, 2131955979), context.getString(2131955975))}), 2131955981, false, false, false), (CharSequence) null, true, true, false);
        loz.A00 = new ID0(23, (Object) loz, (Object) uri2, (Object) this);
        loz.A01 = C56802ICz.A00(loz, 25);
        loz.A02(context);
    }
}

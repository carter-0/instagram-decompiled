package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.List;

/* renamed from: X.8Nh  reason: invalid class name and case insensitive filesystem */
public final class C354768Nh implements AnonymousClass0eK {
    public final /* synthetic */ AnonymousClass07i A00;
    public final /* synthetic */ AnonymousClass8BQ A01;
    public final /* synthetic */ AnonymousClass8AL A02;
    public final /* synthetic */ AnonymousClass8ME A03;
    public final /* synthetic */ C337257fy A04;

    public C354768Nh(AnonymousClass07i r1, AnonymousClass8BQ r2, AnonymousClass8AL r3, AnonymousClass8ME r4, C337257fy r5) {
        this.A03 = r4;
        this.A04 = r5;
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        AnonymousClass8ME r11 = this.A03;
        Context context = r11.A0f;
        C3499582p r19 = r11.A13;
        AnonymousClass80U r17 = r11.A1B;
        AnonymousClass4DH r18 = r11.A0l;
        UserSession userSession = r11.A0r;
        View view = r11.A0h;
        AnonymousClass3E6 r15 = r11.A0s;
        C337257fy r13 = this.A04;
        InteractiveDrawableContainer interactiveDrawableContainer = r11.A1m;
        AnonymousClass8AL r9 = this.A02;
        TargetViewSizeProvider targetViewSizeProvider = r11.A10;
        C354538Mk r6 = r11.A0z;
        AnonymousClass8BQ r5 = this.A01;
        List list = r11.A1r;
        28D r3 = r11.A0k;
        C314446iH r2 = r11.A19;
        boolean A06 = 182.A06(0Tu.A06, userSession, 36324028775935676L);
        boolean z = r11.A1w;
        boolean z2 = r11.A1x;
        C3499582p r23 = r19;
        AnonymousClass80U r27 = r17;
        AnonymousClass3E6 r20 = r15;
        return new C358368an(context, view, r3, r18, userSession, r20, r6, targetViewSizeProvider, r23, r5, r9, r2, r27, r11, (C358358am) userSession.A01(C358358am.class, new C66297MMg(userSession, 43)), r13, interactiveDrawableContainer, Integer.valueOf(r11.A0e), "StickerOverlayController", list, A06, z, z2);
    }
}

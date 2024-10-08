package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import com.instagram.mainactivity.InstagramMainActivity;

/* renamed from: X.383  reason: invalid class name */
public final class AnonymousClass383 extends 0vM {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ InstagramMainActivity A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass383(UserSession userSession, InstagramMainActivity instagramMainActivity) {
        super("preloadJetpackCompose", 1277844480);
        this.A01 = instagramMainActivity;
        this.A00 = userSession;
    }

    public final void loggedRun() {
        View findViewById = this.A01.findViewById(16908290);
        0qQ.A07(findViewById);
        if (findViewById instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) findViewById;
            UserSession userSession = this.A00;
            0qQ.A0B(viewGroup, 0);
            0Tu r2 = 0Tu.A05;
            if (!182.A06(r2, userSession, 36328774714801746L) && !182.A06(r2, userSession, 36326339468474068L) && !182.A06(r2, userSession, 36325205597172447L) && !182.A06(r2, userSession, 36322796120648108L)) {
                return;
            }
            if (182.A06(r2, userSession, 36326339468605142L)) {
                if (Systrace.A0E(1)) {
                    0fS.A01("TifuUnitPrewarmer.prewarmWithTifuUnit", -789136494);
                }
                try {
                    Context context = viewGroup.getContext();
                    0qQ.A07(context);
                    ComposeView composeView = new ComposeView(context, (AttributeSet) null, 0);
                    viewGroup.addView(composeView);
                    composeView.setContent(AnonymousClass5PI.A03(new J73(7, userSession, false), 1915700969));
                    viewGroup.removeView(composeView);
                    composeView.A04();
                } finally {
                    if (Systrace.A0E(1)) {
                        0fS.A00(-326399560);
                    }
                }
            } else {
                Context context2 = viewGroup.getContext();
                0qQ.A07(context2);
                ComposeView composeView2 = new ComposeView(context2, (AttributeSet) null, 0);
                viewGroup.addView(composeView2);
                composeView2.A03();
                viewGroup.removeView(composeView2);
            }
        }
    }
}

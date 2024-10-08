package X;

import android.content.Context;
import android.view.View;
import com.instagram.api.schemas.StoryJoinChatStatus;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgProgressBar;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.6nR  reason: invalid class name and case insensitive filesystem */
public final class C317546nR implements C317556nS {
    public View A00;
    public View A01;
    public IgProgressBar A02;
    public IgSimpleImageView A03;
    public C369668v8 A04;
    public C19469WaH A05;
    public final C252063oV A06;

    public final void FJq(UserSession userSession) {
        StoryJoinChatStatus storyJoinChatStatus;
        String str;
        C19469WaH waH = this.A05;
        if (waH == null) {
            str = "model";
        } else {
            String A022 = waH.A02();
            View view = this.A00;
            if (view == null) {
                str = "buttonView";
            } else {
                Context context = view.getContext();
                C57090IOe A002 = C54951HZh.A00(userSession);
                0qQ.A0B(A022, 0);
                if (A002.A00.contains(A022)) {
                    storyJoinChatStatus = StoryJoinChatStatus.ACCEPTED;
                } else {
                    storyJoinChatStatus = StoryJoinChatStatus.DEFAULT;
                }
                C369668v8 r0 = this.A04;
                if (r0 == null) {
                    str = "stickerDrawable";
                } else {
                    0qQ.A0A(context);
                    r0.A0B(context, storyJoinChatStatus, userSession);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001b, code lost:
        if (r1 == null) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EcX(boolean r5) {
        /*
            r4 = this;
            java.lang.String r3 = "loadingSpinner"
            java.lang.String r0 = "stickerDrawable"
            X.8v8 r2 = r4.A04
            if (r5 == 0) goto L_0x0025
            if (r2 == 0) goto L_0x0040
            X.9pl r0 = r2.A02
            X.6Ly r0 = r0.A04
            android.graphics.drawable.Drawable r1 = r0.mutate()
            r0 = 0
            r1.setAlpha(r0)
            r2.invalidateSelf()
            com.instagram.common.ui.base.IgProgressBar r1 = r4.A02
            if (r1 != 0) goto L_0x003c
        L_0x001d:
            X.0qQ.A0F(r3)
        L_0x0020:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0025:
            if (r2 == 0) goto L_0x0040
            X.9pl r0 = r2.A02
            X.6Ly r0 = r0.A04
            android.graphics.drawable.Drawable r1 = r0.mutate()
            r0 = 255(0xff, float:3.57E-43)
            r1.setAlpha(r0)
            r2.invalidateSelf()
            com.instagram.common.ui.base.IgProgressBar r1 = r4.A02
            if (r1 == 0) goto L_0x001d
            r0 = 4
        L_0x003c:
            r1.setVisibility(r0)
            return
        L_0x0040:
            X.0qQ.A0F(r0)
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C317546nR.EcX(boolean):void");
    }

    public C317546nR(C252063oV r1) {
        this.A06 = r1;
    }
}

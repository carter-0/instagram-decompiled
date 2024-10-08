package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.37h  reason: invalid class name and case insensitive filesystem */
public final class C2373537h extends 0vM {
    public final /* synthetic */ 0xG A00;
    public final /* synthetic */ UserSession A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2373537h(0xG r7, UserSession userSession) {
        super("UpdatePinnedShortcut", 1598769207, 5, false, false);
        this.A01 = userSession;
        this.A00 = r7;
    }

    public final void loggedRun() {
        Icon icon;
        UserSession userSession = this.A01;
        0xG r5 = this.A00;
        List<User> BO0 = AnonymousClass0BO.A00(userSession).BO0();
        0qQ.A0B(BO0, 0);
        if (182.A06(0Tu.A05, userSession, 36320734536016678L) || 1Se.A00(userSession).A0B) {
            for (User user : BO0) {
                C49406Ev8 ev8 = new C49406Ev8(user);
                C393899xD.A00(new FVY(ev8), user.Bh3(), r5.getModuleName());
            }
            return;
        }
        for (User user2 : BO0) {
            String id = user2.getId();
            String username = user2.getUsername();
            Context context = C60960kU.A00;
            0qQ.A07(context);
            IgImageView igImageView = new IgImageView(context);
            igImageView.setUrl(user2.Bh3(), r5);
            if (igImageView.getDrawable() != null && (igImageView.getDrawable() instanceof BitmapDrawable)) {
                Drawable drawable = igImageView.getDrawable();
                0qQ.A0C(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                if (bitmap != null) {
                    icon = Icon.createWithAdaptiveBitmap(bitmap);
                    AnonymousClass90S.A01(icon, id, username);
                }
            }
            icon = null;
            AnonymousClass90S.A01(icon, id, username);
        }
    }
}

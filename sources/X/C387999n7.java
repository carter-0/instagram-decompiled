package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel;
import java.util.Map;

/* renamed from: X.9n7  reason: invalid class name and case insensitive filesystem */
public final class C387999n7 extends AnonymousClass8D8 {
    public final AnonymousClass57C A00;
    public final Map A01;
    public final Drawable A02;

    public C387999n7(Context context, UserSession userSession, AnonymousClass8BA r12, ReelsVisualRepliesModel reelsVisualRepliesModel) {
        super(r12, (AnonymousClass8BH) null, (Integer) null, 103, true, false);
        String name = getClass().getName();
        0qQ.A07(name);
        C314676if r0 = r12.A1g;
        if (r0 != null) {
            r0.get();
        }
        Drawable A012 = C39900AIi.A01(context, userSession, reelsVisualRepliesModel, name);
        this.A02 = A012;
        this.A00 = AnonymousClass57C.CLIPS_COMMENTS;
        this.A01 = AnonymousClass8D8.A00(C317876nz.A1L, A012);
    }
}

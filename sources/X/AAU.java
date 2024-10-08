package X;

import android.content.Context;
import com.instagram.api.schemas.StoryLinkInfoDict;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

public abstract class AAU {
    /* JADX WARNING: type inference failed for: r13v1, types: [java.lang.Object, X.6MT] */
    public static final C347017w8 A00(Context context, UserSession userSession, String str, String str2, int i) {
        Context context2 = context;
        AnonymousClass7TF.A1B(context, 0, str);
        StoryLinkInfoDict storyLinkInfoDict = new StoryLinkInfoDict((Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Integer) null, (String) null, str2, (String) null, (String) null, "web", str);
        ? obj = new Object();
        obj.A00 = storyLinkInfoDict;
        ArrayList A1C = AnonymousClass7TE.A1C();
        C59093J6a j6a = new C59093J6a(i, 5, (Object) context2, (Object) obj, (Object) userSession);
        A1C.add(j6a.invoke("link_sticker_default"));
        A1C.add(j6a.invoke("link_sticker_subtle"));
        A1C.add(j6a.invoke("link_sticker_black_white"));
        A1C.add(j6a.invoke("link_sticker_hero"));
        C347017w8 r0 = new C347017w8(context2, userSession, A1C);
        r0.A03 = obj;
        return r0;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, X.6MT] */
    public static final C347017w8 A01(Context context, UserSession userSession, String str, String str2, int i, boolean z, boolean z2) {
        Context context2 = context;
        ArrayList A0q = AnonymousClass7TF.A0q(context2, 0);
        StoryLinkInfoDict storyLinkInfoDict = new StoryLinkInfoDict((Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Integer) null, (String) null, str2, (String) null, (String) null, "web", str);
        ? obj = new Object();
        obj.A00 = storyLinkInfoDict;
        UserSession userSession2 = userSession;
        int i2 = i;
        boolean z3 = z;
        boolean z4 = z2;
        A0q.add(new C300635xX(context2, userSession2, obj, false, (Integer) null, (Integer) null, "link_sticker_redesign_default", (String) null, (String) null, i2, z3, z4, false));
        A0q.add(new C300635xX(context2, userSession2, obj, false, (Integer) null, (Integer) null, "link_sticker_redesign_subtle", (String) null, (String) null, i2, z3, z4, false));
        A0q.add(new C300635xX(context2, userSession2, obj, false, (Integer) null, (Integer) null, "link_sticker_redesign_rainbow", (String) null, (String) null, i2, z3, z4, false));
        A0q.add(new C300635xX(context2, userSession2, obj, false, (Integer) null, (Integer) null, "link_sticker_redesign_hero", (String) null, (String) null, i2, z3, z4, false));
        A0q.add(new C300635xX(context2, userSession2, obj, false, (Integer) null, (Integer) null, "link_sticker_redesign_vibrant", (String) null, (String) null, i2, z3, z4, false));
        A0q.add(new C300635xX(context2, userSession2, obj, false, (Integer) null, (Integer) null, "link_sticker_redesign_monotone", (String) null, (String) null, i2, z3, z4, false));
        C347017w8 r1 = new C347017w8(context2, userSession2, A0q);
        r1.A03 = obj;
        return r1;
    }
}

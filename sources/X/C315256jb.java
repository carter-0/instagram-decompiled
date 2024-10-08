package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import com.instagram.avatars.store.AvatarStore;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.6jb  reason: invalid class name and case insensitive filesystem */
public final class C315256jb implements C315036jF {
    public final Rect A00 = new Rect();

    public final View C8E(C255773uh r2, C316026kz r3) {
        return null;
    }

    public final AnonymousClass9UE C8F(UserSession userSession, C255773uh r8, C316026kz r9) {
        0qQ.A0B(r8, 1);
        0qQ.A0B(r9, 2);
        C255783ui A002 = C289745e8.A00(AnonymousClass3WT.AVATAR, r8.A0b());
        FrameLayout Bkk = r9.Bkk();
        if (A002 == null || Bkk == null) {
            return null;
        }
        int width = Bkk.getWidth();
        int height = Bkk.getHeight();
        float A003 = r8.A00();
        Rect rect = this.A00;
        C306746Ni.A00(rect, A002, A003, width, height);
        return new AnonymousClass9UE(Bkk, rect.centerX(), rect.top, false);
    }

    public final AnonymousClass5Gs C8I(Context context, UserSession userSession, C255773uh r7, C250973mM r8) {
        String str;
        String str2;
        int i;
        int i2;
        C14015ToH toH;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(context, 1);
        0qQ.A0B(r7, 2);
        C255783ui A002 = C289745e8.A00(AnonymousClass3WT.AVATAR, r7.A0b());
        Integer num = null;
        if (A002 == null || (toH = A002.A0C) == null) {
            str = null;
        } else {
            str = toH.A05;
        }
        if (0qQ.A0K(str, C293115kA.STYLE_2.toString())) {
            AnonymousClass27E r2 = 25x.A00(userSession).A01;
            if (r2 instanceof C293135kC) {
                Integer num2 = ((C293135kC) r2).A00.A00;
                if (num2 == AnonymousClass05K.A01) {
                    i2 = 2131956738;
                } else if (num2 == AnonymousClass05K.A0C) {
                    i2 = 2131956725;
                }
                num = Integer.valueOf(i2);
            }
            if (r2 instanceof C297395rg) {
                i2 = 2131975014;
                num = Integer.valueOf(i2);
            }
        }
        if ((A01(userSession, r7) || A00(userSession, r7)) && num != null) {
            i = num.intValue();
        } else if (A02(userSession, r7)) {
            i = 2131953471;
        } else {
            User user = r7.A0i;
            if (user != null) {
                str2 = user.getId();
            } else {
                str2 = null;
            }
            if (2R8.A05(userSession, str2)) {
                i = 2131953496;
            } else {
                i = 2131975014;
                if (0qQ.A0K(25x.A00(userSession).A01.A00, C299715vi.A00)) {
                    i = 2131953478;
                }
            }
        }
        String string = context.getString(i);
        0qQ.A07(string);
        return new C315476jx((CharSequence) string);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DsI(android.content.Context r7, X.AnonymousClass0iw r8, com.instagram.common.session.UserSession r9, X.C255773uh r10, X.C250973mM r11) {
        /*
            r6 = this;
            r0 = 0
            X.0qQ.A0B(r9, r0)
            r0 = 3
            X.0qQ.A0B(r10, r0)
            X.26t r5 = X.26G.A00(r9)
            boolean r0 = A01(r9, r10)
            if (r0 == 0) goto L_0x0052
            X.0xa r0 = r5.A00
            X.0xY r2 = r0.AR4()
            java.lang.String r1 = "key_has_seen_avatar_convergence_stories_mimicry_tooltip"
            r0 = 1
            r2.E5T(r1, r0)
            r2.apply()
            java.lang.Integer r4 = X.AnonymousClass05K.A00
        L_0x0023:
            X.6ix r3 = new X.6ix
            r3.<init>(r9)
            com.instagram.avatars.store.AvatarStore r0 = X.25x.A00(r9)
            X.27E r0 = r0.A01
            boolean r2 = r0 instanceof X.C293135kC
            java.lang.String r1 = "ig_stories_consumption"
            java.lang.String r0 = "mux_tooltip"
            r3.A01(r4, r1, r0, r2)
        L_0x0037:
            boolean r0 = A02(r9, r10)
            if (r0 == 0) goto L_0x006a
            X.0xa r0 = r5.A00
            X.0xY r2 = r0.AR4()
            java.lang.String r1 = "key_has_seen_avatar_mention_sticker_tooltip_v4"
            r0 = 1
            r2.E5T(r1, r0)
            r2.apply()
            java.lang.String r0 = "Tap to see avatars in this story."
            X.LHS.A00(r9, r0)
            return
        L_0x0052:
            boolean r0 = A00(r9, r10)
            if (r0 == 0) goto L_0x0037
            X.0xa r0 = r5.A00
            X.0xY r2 = r0.AR4()
            java.lang.String r1 = "key_has_seen_avatar_convergence_auto_migration_stories_mimicry_tooltip"
            r0 = 1
            r2.E5T(r1, r0)
            r2.apply()
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            goto L_0x0023
        L_0x006a:
            X.0xa r3 = r5.A00
            X.0xY r2 = r3.AR4()
            java.lang.String r1 = "story_viewer_avatar_sticker_tooltip_view_count_v2"
            r0 = 0
            int r0 = r3.getInt(r1, r0)
            int r0 = r0 + 1
            r2.E5Z(r1, r0)
            r2.apply()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C315256jb.DsI(android.content.Context, X.0iw, com.instagram.common.session.UserSession, X.3uh, X.3mM):void");
    }

    public final boolean EtQ(UserSession userSession, C255773uh r5, C250973mM r6, C316026kz r7) {
        String str;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r5, 1);
        if (!182.A06(0Tu.A05, userSession, 36319858362752697L)) {
            if (A01(userSession, r5) || A00(userSession, r5) || A02(userSession, r5)) {
                return true;
            }
            User user = r5.A0i;
            if (user != null) {
                str = user.getId();
            } else {
                str = null;
            }
            if ((!2R8.A05(userSession, str) || !0qQ.A0K(25x.A00(userSession).A01.A00, C297385rf.A00)) && 26G.A00(userSession).A00.getInt("story_viewer_avatar_sticker_tooltip_view_count_v2", 0) < 3) {
                if (C289745e8.A00(AnonymousClass3WT.AVATAR, r5.A0b()) != null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final C226262fy C8G() {
        return C226262fy.ABOVE_ANCHOR;
    }

    public static final boolean A00(UserSession userSession, C255773uh r5) {
        C14015ToH toH;
        C255783ui A002 = C289745e8.A00(AnonymousClass3WT.AVATAR, r5.A0b());
        if (!(A002 == null || (toH = A002.A0C) == null)) {
            C317936o5 r2 = new C317936o5(userSession);
            AvatarStore avatarStore = r2.A01;
            if (!C317936o5.A02(avatarStore) || !C317936o5.A01(avatarStore) || !C314866iy.A00(r2.A02) || !0qQ.A0K(toH.A05, C293115kA.STYLE_2.toString()) || r2.A00.A00.A00.getBoolean("key_has_seen_avatar_convergence_auto_migration_stories_mimicry_tooltip", false)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean A01(UserSession userSession, C255773uh r5) {
        C14015ToH toH;
        C255783ui A002 = C289745e8.A00(AnonymousClass3WT.AVATAR, r5.A0b());
        if (A002 == null || (toH = A002.A0C) == null) {
            return false;
        }
        C317936o5 r2 = new C317936o5(userSession);
        AvatarStore avatarStore = r2.A01;
        if (C317936o5.A02(avatarStore)) {
            return false;
        }
        UserSession userSession2 = r2.A02;
        if (C314866iy.A00(userSession2) || !0qQ.A0K(toH.A05, C293115kA.STYLE_2.toString()) || r2.A00.A00.A00.getBoolean("key_has_seen_avatar_convergence_stories_mimicry_tooltip", false) || C317936o5.A00(r2)) {
            return false;
        }
        if (avatarStore.A01 instanceof C293135kC) {
            0qQ.A0B(userSession2, 0);
            if (182.A06(0Tu.A05, userSession2, 36325351626453913L)) {
                return true;
            }
        }
        if (avatarStore.A01 instanceof C293135kC) {
            return false;
        }
        0qQ.A0B(userSession2, 0);
        if (182.A06(0Tu.A05, userSession2, 36325351626781598L)) {
            return true;
        }
        return false;
    }

    public static final boolean A02(UserSession userSession, C255773uh r2) {
        if (!AnonymousClass6UA.A00(userSession, r2) || 26G.A00(userSession).A00.getBoolean("key_has_seen_avatar_mention_sticker_tooltip_v4", false)) {
            return false;
        }
        return true;
    }
}

package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.igds.components.banner.IgdsBanner;
import com.instagram.user.model.User;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.EAq  reason: case insensitive filesystem */
public final class C47630EAq extends C231632rz {
    public 1Xj A00;
    public final Context A01;
    public final UserSession A02;
    public final AnonymousClass0iw A03;

    public C47630EAq(Context context, AnonymousClass0iw r3, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A01 = context;
        this.A02 = userSession;
        this.A03 = r3;
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        0qQ.A0B(obj, 1);
        return obj.hashCode();
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        0qQ.A0B(obj, 1);
        return ((C49610EzT) obj).A00;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0021, code lost:
        if (r1 != true) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r11, android.view.View r12, java.lang.Object r13, java.lang.Object r14) {
        /*
            r10 = this;
            r0 = 1645688389(0x62173645, float:6.973422E20)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r2 = 1
            X.AnonymousClass7TF.A1B(r12, r2, r13)
            X.EzT r13 = (X.C49610EzT) r13
            int r8 = r13.A00
            java.lang.Object r7 = X.DbT.A0o(r12)
            X.EyW r7 = (X.EyW) r7
            X.1Xj r0 = r10.A00
            r6 = 0
            if (r0 == 0) goto L_0x0023
            boolean r1 = r0.A4S()
            r0 = 2131238273(0x7f081d81, float:1.809282E38)
            if (r1 == r2) goto L_0x0026
        L_0x0023:
            r0 = 2131238651(0x7f081efb, float:1.8093587E38)
        L_0x0026:
            android.widget.TextView r4 = r7.A02
            r4.setCompoundDrawablesRelativeWithIntrinsicBounds(r0, r6, r6, r6)
            X.1Xj r0 = r10.A00
            if (r0 == 0) goto L_0x0070
            boolean r0 = r0.A4S()
            if (r0 != r2) goto L_0x0070
            r5 = 2131968488(0x7f1341e8, float:1.9573872E38)
            android.content.Context r2 = r10.A01
            android.content.res.Resources r1 = X.AnonymousClass7TF.A0A(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            java.lang.String r0 = X.AnonymousClass3f0.A03(r1, r0, r5)
        L_0x0046:
            r4.setText(r0)
            int r1 = X.2Yu.A07(r2)
            android.util.TypedValue r0 = X.AnonymousClass4Ed.A00
            android.content.Context r0 = r4.getContext()
            int r9 = r0.getColor(r1)
            android.graphics.drawable.Drawable[] r8 = r4.getCompoundDrawablesRelative()
            int r5 = r8.length
            r4 = 0
        L_0x005d:
            if (r4 >= r5) goto L_0x007f
            r2 = r8[r4]
            if (r2 == 0) goto L_0x006d
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuffColorFilter r0 = new android.graphics.PorterDuffColorFilter
            r0.<init>(r9, r1)
            r2.setColorFilter(r0)
        L_0x006d:
            int r4 = r4 + 1
            goto L_0x005d
        L_0x0070:
            android.content.Context r2 = r10.A01
            android.content.res.Resources r1 = X.AnonymousClass7TF.A0A(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            java.lang.String r0 = X.AnonymousClass3f0.A02(r1, r0)
            goto L_0x0046
        L_0x007f:
            android.widget.ImageView r0 = r7.A00
            r2 = 8
            r0.setVisibility(r2)
            boolean r0 = r13.A02
            if (r0 == 0) goto L_0x009d
            java.lang.CharSequence r1 = r13.A01
            if (r1 == 0) goto L_0x009d
            android.widget.TextView r0 = r7.A01
            r0.setText(r1)
            r0.setVisibility(r6)
        L_0x0096:
            r0 = -1091008572(0xffffffffbef887c4, float:-0.4854108)
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        L_0x009d:
            android.widget.TextView r0 = r7.A01
            r0.setVisibility(r2)
            goto L_0x0096
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47630EAq.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public final View createView(int i, ViewGroup viewGroup) {
        User user;
        int A032 = AnonymousClass0fD.A03(1154235552);
        ViewGroup viewGroup2 = viewGroup;
        0qQ.A0B(viewGroup2, 1);
        Context context = this.A01;
        View inflate = LayoutInflater.from(context).inflate(R.layout.play_count_header_row, viewGroup2, false);
        UserSession userSession = this.A02;
        0Tu r14 = 0Tu.A05;
        if (182.A06(r14, userSession, 36321773918299918L) && this.A00 != null) {
            User A0j = DbT.A0j(userSession);
            1Xj r0 = this.A00;
            if (r0 != null) {
                user = r0.A2A(userSession);
            } else {
                user = null;
            }
            if (A0j.equals(user)) {
                1Am A012 = 1Al.A01(userSession);
                1An r7 = 1An.A1t;
                if (!A012.A03(r7).getBoolean("PLAYCOUNT_WITH_REPLAY_BANNER_DISMISSED_BY_USER", false) && 1Al.A01(userSession).A03(r7).getInt("PLAYCOUNT_WITH_REPLAY_BANNER_IMPRESSION_COUNT", 0) < 3) {
                    IgLinearLayout igLinearLayout = new IgLinearLayout(context);
                    igLinearLayout.setOrientation(1);
                    igLinearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                    IgdsBanner igdsBanner = new IgdsBanner(context, (AttributeSet) null, 0);
                    igdsBanner.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                    Locale locale = Locale.getDefault();
                    0qQ.A07(locale);
                    C49724F3n f3n = new C49724F3n(context, locale);
                    ThreadLocal threadLocal = f3n.A08;
                    DateFormat dateFormat = (DateFormat) threadLocal.get();
                    SimpleDateFormat simpleDateFormat = dateFormat;
                    if (dateFormat == null) {
                        Object clone = f3n.A00().clone();
                        0qQ.A0C(clone, "null cannot be cast to non-null type java.text.SimpleDateFormat");
                        SimpleDateFormat simpleDateFormat2 = (SimpleDateFormat) clone;
                        simpleDateFormat2.applyPattern(android.text.format.DateFormat.getBestDateTimePattern(f3n.A0J, "MMMd"));
                        threadLocal.set(simpleDateFormat2);
                        simpleDateFormat = simpleDateFormat2;
                    }
                    String A0e = AnonymousClass7TF.A0e(context.getResources(), simpleDateFormat.format(new Date(182.A01(r14, userSession, 36603248894874514L) * 1000)), 2131969503);
                    0qQ.A07(A0e);
                    String A0d = AnonymousClass7TF.A0d(context.getResources(), 2131969504);
                    DbT.A1U(igdsBanner, A0e, false);
                    igdsBanner.setAction((CharSequence) A0d);
                    igdsBanner.setDismissible(true);
                    igdsBanner.A00 = new C50468FcG(this, 14);
                    igLinearLayout.addView(igdsBanner, 0);
                    0qQ.A0A(inflate);
                    igLinearLayout.setTag(new EyW(inflate));
                    igLinearLayout.addView(inflate, 1);
                    AnonymousClass7TG.A0g(1Al.A01(userSession).A03(r7), "PLAYCOUNT_WITH_REPLAY_BANNER_IMPRESSION_COUNT").apply();
                    1Xj r3 = this.A00;
                    if (r3 != null) {
                        AnonymousClass0iw r6 = this.A03;
                        0qQ.A0B(userSession, 0);
                        0qQ.A0B(r6, 1);
                        0Aj A0e2 = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r6, userSession), "instagram_clips_play_count_banner_impression");
                        if (A0e2.isSampled()) {
                            DbW.A16(A0e2, r6);
                            String A30 = r3.A30();
                            if (A30 != null) {
                                A0e2.A9F("media_id", DbV.A0q(A30));
                                User A2A = r3.A2A(userSession);
                                if (A2A != null) {
                                    A0e2.A9F("media_author_id", DbV.A0q(A2A.getId()));
                                    A0e2.A8k("media_index", 0);
                                    A0e2.AAJ("viewer_session_id", "");
                                    A0e2.AAJ("ranking_info_token", DbT.A0x(r3));
                                    A0e2.AAJ(C273654mx.A00(249), (String) null);
                                    A0e2.AAJ("nav_chain", (String) null);
                                    A0e2.Cgf();
                                } else {
                                    throw AnonymousClass7TE.A0z("Required value was null.");
                                }
                            } else {
                                throw AnonymousClass7TE.A0z("Required value was null.");
                            }
                        }
                    }
                    inflate = igLinearLayout;
                    AnonymousClass0fD.A0A(2133981600, A032);
                    return inflate;
                }
            }
        }
        0qQ.A0A(inflate);
        inflate.setTag(new EyW(inflate));
        AnonymousClass0fD.A0A(2133981600, A032);
        return inflate;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}

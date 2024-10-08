package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.checkbox.IgdsCheckBox;
import com.instagram.settings2.core.session.SettingsSession;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;

/* renamed from: X.KXc  reason: case insensitive filesystem */
public final class C62040KXc extends K6S {
    public static final String __redex_internal_original_name = "PrivateStoryAudiencePickerFragment";
    public C62574Ki7 A00;
    public C63766L5y A01;
    public C46434Dew A02;
    public String A03 = "not_eligible";
    public C363008it A04;
    public boolean A05;
    public final AnonymousClass0eM A06 = C227642jf.A02(this);
    public final AnonymousClass0eM A07 = C227642jf.A02(this);

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        DbX.A1A(new LY1(this, 46), K6S.A01(r4, getString(2131956191)), r4);
    }

    public final String getModuleName() {
        return "audience_selection";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0028, code lost:
        if (r7 == X.C62574Ki7.STORY_SHARE_SHORTCUT) goto L_0x002a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r14, android.os.Bundle r15) {
        /*
            r13 = this;
            r12 = 0
            X.0qQ.A0B(r14, r12)
            super.onViewCreated(r14, r15)
            android.content.Context r8 = r13.requireContext()
            r0 = 2131439344(0x7f0b2ef0, float:1.850064E38)
            androidx.recyclerview.widget.RecyclerView r5 = X.JTR.A0c(r14, r0)
            r0 = 2131428239(0x7f0b038f, float:1.8478117E38)
            android.widget.TextView r6 = X.AnonymousClass7TG.A0R(r14, r0)
            X.0eM r4 = r13.A06
            r4.getValue()
            X.Ki7 r7 = r13.A00
            X.Ki7 r0 = X.C62574Ki7.STORY_SHARE_SHEET
            r3 = 1
            if (r7 == r0) goto L_0x002a
            X.Ki7 r0 = X.C62574Ki7.STORY_SHARE_SHORTCUT
            r2 = 0
            if (r7 != r0) goto L_0x002b
        L_0x002a:
            r2 = 1
        L_0x002b:
            X.Ki7 r0 = X.C62574Ki7.STATUS_SHARE_SHEET
            boolean r1 = X.AnonymousClass7TF.A1W(r7, r0)
            X.Ki7 r0 = X.C62574Ki7.REELS_AUDIENCE_CONTROL
            if (r7 == r0) goto L_0x0036
            r3 = 0
        L_0x0036:
            if (r2 == 0) goto L_0x00bb
            r0 = 2131969775(0x7f1346ef, float:1.9576482E38)
        L_0x003b:
            r6.setText(r0)
        L_0x003e:
            r6.setVisibility(r12)
            r0 = 2131432000(0x7f0b1240, float:1.8485745E38)
            com.instagram.igds.components.button.IgdsButton r1 = X.JTR.A0n(r14, r0)
            r0 = 2131960992(0x7f1324a0, float:1.9558668E38)
            r1.setText((int) r0)
            r0 = 1
            r1.setEnabled(r0)
            r0 = 47
            X.LY1.A00(r1, r0, r13)
            r1.setVisibility(r12)
            r0 = 2131956191(0x7f1311df, float:1.954893E38)
            java.lang.String r9 = X.AnonymousClass7TE.A16(r8, r0)
            r0 = 2131969776(0x7f1346f0, float:1.9576484E38)
            java.lang.String r10 = X.AnonymousClass7TE.A16(r8, r0)
            X.Dew r0 = r13.A02
            java.lang.String r6 = "suggestedUsersPaginationHelper"
            r3 = 0
            if (r0 == 0) goto L_0x0124
            r5.A15(r0)
            X.K9H r0 = r13.A09()
            r11 = 2131238838(0x7f081fb6, float:1.8093966E38)
            X.L9z r7 = new X.L9z
            r7.<init>(r8, r9, r10, r11, r12)
            r0.A00 = r7
            X.Lwp r1 = r13.A0A()
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r0 = X.DbX.A0l(r0, r4)
            X.K6S.A04(r1, r0)
            X.8it r1 = r13.A04
            java.lang.String r2 = "storyShareToFBController"
            if (r1 == 0) goto L_0x0128
            boolean r0 = r13.A05
            r1.A04(r0)
            X.K9H r1 = r13.A09()
            X.8it r0 = r13.A04
            if (r0 == 0) goto L_0x0128
            r1.A01 = r0
            X.K9H r1 = r13.A09()
            X.Dew r0 = r13.A02
            if (r0 == 0) goto L_0x0124
            r1.A02 = r0
            r13.A0D()
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r4)
            java.lang.String r1 = "close_friend_member_list_impression"
            java.lang.String r0 = "cf_members_list"
            X.C64029LJs.A01(r2, r1, r0, r3)
            return
        L_0x00bb:
            if (r1 == 0) goto L_0x00c2
            r0 = 2131974195(0x7f135833, float:1.9585447E38)
            goto L_0x003b
        L_0x00c2:
            if (r3 == 0) goto L_0x00f6
            r1 = 2131953235(0x7f130653, float:1.9542935E38)
            r0 = 2131963501(0x7f132e6d, float:1.9563757E38)
            android.text.SpannableStringBuilder r3 = X.C51965G9l.A0E()
            java.lang.String r2 = X.DbU.A0m(r13, r0)
            android.content.Context r1 = X.K6S.A00(r3, r13, r2, r1)
            r0 = 2130971404(0x7f040b0c, float:1.7551545E38)
            int r0 = X.AnonymousClass7TF.A03(r1, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.7AK r0 = new X.7AK
            r0.<init>(r1)
            X.AnonymousClass7AV.A05(r3, r0, r2)
            X.DbX.A1G(r6, r3)
            r6.setHighlightColor(r12)
            r0 = 48
        L_0x00f1:
            X.LY1.A00(r6, r0, r13)
            goto L_0x003e
        L_0x00f6:
            r1 = 2131956194(0x7f1311e2, float:1.9548937E38)
            r0 = 2131963501(0x7f132e6d, float:1.9563757E38)
            android.text.SpannableStringBuilder r3 = X.C51965G9l.A0E()
            java.lang.String r2 = X.DbU.A0m(r13, r0)
            android.content.Context r1 = X.K6S.A00(r3, r13, r2, r1)
            r0 = 2130971404(0x7f040b0c, float:1.7551545E38)
            int r0 = X.AnonymousClass7TF.A03(r1, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.7AK r0 = new X.7AK
            r0.<init>(r1)
            X.AnonymousClass7AV.A05(r3, r0, r2)
            X.DbX.A1G(r6, r3)
            r6.setHighlightColor(r12)
            r0 = 49
            goto L_0x00f1
        L_0x0124:
            X.0qQ.A0F(r6)
            goto L_0x012b
        L_0x0128:
            X.0qQ.A0F(r2)
        L_0x012b:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62040KXc.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A05(C62040KXc kXc) {
        AnonymousClass0eM r4 = kXc.A06;
        UserSession A0l = AnonymousClass7TE.A0l(r4);
        LRl lRl = kXc.A03;
        Set set = lRl.A03;
        int size = set.size();
        0qQ.A0B(A0l, 0);
        DbX.A0m(A0l).EPa(Integer.valueOf(size));
        SettingsSession settingsSession = C49905FEd.A00(AnonymousClass7TE.A0l(r4)).A00;
        if (settingsSession != null) {
            settingsSession.A03();
        }
        L72 l72 = lRl.A01;
        if (kXc.A01 == null) {
            0qQ.A0F("waterfall");
            throw AnonymousClass00P.createAndThrow();
        }
        l72.A02.size();
        l72.A00.size();
        l72.A01.size();
        Intent A09 = DbS.A09();
        A09.putExtra("private_story_audience_member_count", set.size());
        1OC A002 = C49868FAl.A00(AnonymousClass7TE.A0l(r4));
        A002.A00 = new CH5(0);
        kXc.schedule(A002);
        DbX.A17(A09, kXc);
        DbT.A1K(kXc);
    }

    public final void CtJ(C46448DfA dfA) {
        C63766L5y l5y = this.A01;
        String str = "waterfall";
        if (l5y != null) {
            C62574Ki7 ki7 = l5y.A00;
            if (ki7 != null) {
                0lg A0X = DbT.A0X(this.A06);
                String str2 = ki7.A00;
                0qQ.A07(str2);
                LRl lRl = this.A03;
                ImmutableList A0K = DbU.A0K(lRl.A03);
                0qQ.A0B(A0X, 0);
                JSONArray jSONArray = new JSONArray();
                Iterator it = A0K.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((C61036Jva) it.next()).A02.getId());
                }
                1NY A0a = AnonymousClass7TG.A0a(A0X);
                A0a.A0A("stories/private_stories/bulk_update_members/");
                A0a.A9m(AnonymousClass000.A00(1078), (String) null);
                A0a.A9m(AnonymousClass000.A00(1759), jSONArray.toString());
                A0a.A9m("module", "audience_selection");
                1ES.A03(JTU.A0H(A0a, "source", str2, false));
                lRl.A04();
                C363008it r0 = this.A04;
                if (r0 == null) {
                    str = "storyShareToFBController";
                } else {
                    r0.A04(false);
                    LRl.A00(this, lRl);
                    LRl.A01(this, lRl);
                    if (this.A01 != null) {
                        return;
                    }
                }
            } else {
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    public final void A0C(IgdsCheckBox igdsCheckBox, C61036Jva jva) {
        AnonymousClass7TG.A1N(jva, igdsCheckBox);
        C63766L5y l5y = this.A01;
        if (l5y == null) {
            0qQ.A0F("waterfall");
            throw AnonymousClass00P.createAndThrow();
        }
        C62574Ki7 ki7 = l5y.A00;
        if (ki7 != null) {
            boolean z = !igdsCheckBox.isChecked();
            igdsCheckBox.setChecked(z);
            boolean z2 = A0A().A01;
            LRl lRl = this.A03;
            lRl.A05(jva, JTP.A0j(z2 ? 1 : 0), z, z2);
            A09().A05(DbU.A0K(lRl.A03), DbU.A0K(lRl.A00));
            LRl.A01(this, lRl);
            UserSession A0l = AnonymousClass7TE.A0l(this.A06);
            String str = ki7.A00;
            0qQ.A07(str);
            LHo.A01(A0l, "audience_selection", str, jva.A02.getId(), z);
        }
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [X.07Z, androidx.fragment.app.Fragment, java.lang.Object, X.K6S, X.KXc] */
    public final void A0D() {
        A09().A04(requireContext(), (View.OnClickListener) null, C320156rr.LOADING);
        C46434Dew dew = this.A02;
        if (dew == null) {
            0qQ.A0F("suggestedUsersPaginationHelper");
            throw AnonymousClass00P.createAndThrow();
        }
        dew.A02 = true;
        Context requireContext = requireContext();
        0gy A002 = AnonymousClass07i.A00(this);
        AnonymousClass0eM r1 = this.A06;
        1OC A003 = LHo.A00(AnonymousClass7TE.A0l(r1), 40, (String) null, false, 182.A06(0Tu.A05, DbT.A0X(r1), 36322126105421784L));
        C61500KAf.A00(A003, this, 7);
        1ES.A00(requireContext, A002, A003);
    }

    public final boolean onBackPressed() {
        A05(this);
        return true;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.07Z, X.0iw, androidx.fragment.app.Fragment, java.lang.Object, X.KXc] */
    public final void onCreate(Bundle bundle) {
        C62574Ki7 ki7;
        int A022 = AnonymousClass0fD.A02(460586478);
        C62040KXc.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        AnonymousClass0eM r4 = this.A06;
        this.A01 = new C63766L5y(this, AnonymousClass7TE.A0l(r4));
        Serializable serializable = requireArguments.getSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        if (serializable instanceof C62574Ki7) {
            ki7 = (C62574Ki7) serializable;
        } else {
            ki7 = null;
        }
        this.A00 = ki7;
        C63766L5y l5y = this.A01;
        if (l5y == null) {
            0qQ.A0F("waterfall");
            throw AnonymousClass00P.createAndThrow();
        }
        if (ki7 == null) {
            ki7 = C62574Ki7.UNKNOWN;
        }
        l5y.A00 = ki7;
        this.A03 = requireArguments.getString(AnonymousClass000.A00(350), "not_eligible");
        this.A05 = requireArguments.getBoolean(AnonymousClass000.A00(183), false);
        this.A04 = LJr.A01(AnonymousClass7TE.A0l(r4), new C65631Lx8());
        int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        this.A02 = new C46434Dew(this, AnonymousClass7TE.A0l(this.A07), new M0A(this, 1));
        AnonymousClass0fD.A09(1287198291, A022);
    }
}

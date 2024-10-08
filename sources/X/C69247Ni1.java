package X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import com.instagram.android.R;
import com.instagram.api.schemas.SocialContextType;
import com.instagram.clips.model.ClipsSpotlightData;
import com.instagram.clips.model.ClipsSpotlightModel;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;
import java.util.List;

/* renamed from: X.Ni1  reason: case insensitive filesystem */
public final class C69247Ni1 extends GME implements C252213ok {
    public OI5 A00;
    public boolean A01;
    public AnonymousClass3E6 A02;
    public final Activity A03;
    public final UserSession A04;
    public final C66912Mew A05;
    public final C66907Meq A06;
    public final ClipsSpotlightData A07;
    public final C52009GBg A08;
    public final GD6 A09;

    public final void A0I(String str, String str2, String str3, String str4) {
        1Xj r2;
        C267324bN A002 = A00(this);
        if (A002 != null) {
            r2 = A002.A02;
        } else {
            r2 = null;
        }
        ClipsSpotlightModel A012 = A01(this);
        if (r2 == null || A012 == null) {
            C59689JTv.A07(this.A03, 2131961740);
            return;
        }
        DirectShareTarget directShareTarget = new DirectShareTarget(A012.A01);
        this.A05.A00(directShareTarget).ELU(SocialContextType.SPOTLIGHT, r2, directShareTarget, (String) null, "clips_viewer_spotlight_reply", str, false);
        C59689JTv.A01(this.A03, (String) null, 2131955717, 0);
        A0D();
    }

    public final boolean A0J() {
        return false;
    }

    public static final C267324bN A00(C69247Ni1 ni1) {
        int A062;
        C52012GBj gBj = ni1.A02;
        if (gBj == null || (A062 = gBj.A06()) < 0) {
            return null;
        }
        C52009GBg gBg = ni1.A09.A0A;
        if (A062 < gBg.A0A()) {
            return gBg.A0E(A062);
        }
        return null;
    }

    public static final void A02(C69247Ni1 ni1) {
        IgTextView igTextView;
        Editable editable;
        boolean z = ni1.A01;
        OI5 oi5 = ni1.A00;
        if (z) {
            if (oi5 != null) {
                AnonymousClass7TF.A16(oi5.A05);
            }
            OI5 oi52 = ni1.A00;
            if (oi52 != null && (igTextView = oi52.A05) != null) {
                ComposerAutoCompleteTextView composerAutoCompleteTextView = oi52.A08;
                if (composerAutoCompleteTextView != null) {
                    editable = composerAutoCompleteTextView.getText();
                } else {
                    editable = null;
                }
                igTextView.setEnabled(C51966G9m.A1X(String.valueOf(editable)));
            }
        } else if (oi5 != null) {
            AnonymousClass7TH.A0R(oi5.A05);
        }
    }

    public final View A0C() {
        OI5 oi5 = this.A00;
        if (oi5 != null) {
            return oi5.A03;
        }
        return null;
    }

    public final void A0D() {
        this.A06.A0C((List) null, true);
        OI5 oi5 = this.A00;
        if (oi5 != null && oi5.A00.getVisibility() == 4) {
            OI5 oi52 = this.A00;
            if (oi52 != null) {
                oi52.A00.setVisibility(0);
            }
            OI5 oi53 = this.A00;
            if (oi53 != null) {
                oi53.A03.setOnTouchListener((View.OnTouchListener) null);
            }
        }
        OI5 oi54 = this.A00;
        if (oi54 != null) {
            IgImageView igImageView = oi54.A07;
            Activity activity = this.A03;
            DbU.A13(activity, igImageView, R.drawable.instagram_reaction_add_pano_outline_24);
            DbU.A14(activity, igImageView, 2Yu.A09(activity));
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void A0E() {
        0nA.A0J(this.A03);
        this.A01 = false;
        A02(this);
    }

    public final void A0F() {
        OI5 oi5 = this.A00;
        if (oi5 != null) {
            oi5.A03.setVisibility(8);
        }
        A0E();
    }

    public final void A0G() {
        C66907Meq meq = this.A06;
        if (meq != null) {
            C66907Meq.A00(meq);
            OZT ozt = meq.A03;
            if (ozt != null) {
                ozt.A02(false);
            }
        }
    }

    public final void A0H() {
        OI5 oi5 = this.A00;
        if (oi5 != null) {
            oi5.A03.setVisibility(0);
        }
    }

    public final boolean A0K() {
        OI5 oi5 = this.A00;
        if (oi5 == null || oi5.A03.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public final void DMr(int i, boolean z) {
        Drawable background;
        int i2;
        OI5 oi5 = this.A00;
        if (oi5 != null) {
            this.A01 = C51970G9q.A1W(i, AnonymousClass2uJ.A01);
            oi5.A03.setTranslationY(-((float) i));
            boolean z2 = this.A01;
            C52009GBg gBg = this.A08;
            if (z2) {
                gBg.A0X(true);
                A0D();
                oi5.A07.setVisibility(8);
                oi5.A01.setAlpha(1.0f);
                background = oi5.A00.getBackground();
                i2 = 255;
            } else {
                gBg.A0X(false);
                oi5.A07.setVisibility(0);
                oi5.A01.setAlpha(0.0f);
                background = oi5.A00.getBackground();
                if (background != null) {
                    i2 = 204;
                }
                A02(this);
            }
            background.setAlpha(i2);
            A02(this);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        if (view != null) {
            OI5 oi5 = new OI5(view, C66580MXl.A15(this, 67), C66580MXl.A14(this, 45));
            this.A00 = oi5;
            IgImageView igImageView = oi5.A07;
            igImageView.setVisibility(0);
            Activity activity = this.A03;
            DbT.A1A(activity.getResources(), igImageView, 2131955709);
            C71406Ok5.A00(igImageView, 22, this);
            IgTextView igTextView = oi5.A05;
            igTextView.setVisibility(8);
            C71406Ok5.A00(igTextView, 23, this);
            oi5.A06.setVisibility(8);
            C71406Ok5.A00(oi5.A04, 24, this);
            AnonymousClass3E5 A012 = AnonymousClass3E4.A01(this, false, false);
            this.A02 = A012;
            A012.A9Y(this);
            AnonymousClass3E6 r1 = this.A02;
            if (r1 == null) {
                0qQ.A0F("keyboardHeightChangeDetector");
                throw AnonymousClass00P.createAndThrow();
            }
            r1.EkY(true);
            r1.DmJ(activity);
        }
    }

    public C69247Ni1(Activity activity, ClipsSpotlightData clipsSpotlightData, UserSession userSession, C52009GBg gBg, GD6 gd6, C66907Meq meq) {
        C51974G9v.A1M(gd6, userSession, activity);
        0qQ.A0B(gBg, 5);
        this.A07 = clipsSpotlightData;
        this.A09 = gd6;
        this.A04 = userSession;
        this.A03 = activity;
        this.A08 = gBg;
        this.A06 = meq;
        this.A05 = AnonymousClass1pH.A00().E52(userSession);
    }

    public static final ClipsSpotlightModel A01(C69247Ni1 ni1) {
        1Xj r0;
        String id;
        C267324bN A002 = A00(ni1);
        if (A002 == null || (r0 = A002.A02) == null || (id = r0.getId()) == null) {
            return null;
        }
        return (ClipsSpotlightModel) ni1.A07.A00.get(id);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DW8(int r6, int r7) {
        /*
            r5 = this;
            com.instagram.clips.model.ClipsSpotlightModel r0 = A01(r5)
            if (r0 == 0) goto L_0x005e
            com.instagram.user.model.User r4 = r0.A01
            r3 = 0
            if (r4 == 0) goto L_0x005c
            android.app.Activity r0 = r5.A03
            android.content.res.Resources r2 = r0.getResources()
            r1 = 2131955712(0x7f131000, float:1.954796E38)
            java.lang.String r0 = r4.B8Q()
            java.lang.String r1 = X.AnonymousClass7TF.A0e(r2, r0, r1)
        L_0x001c:
            X.OI5 r0 = r5.A00
            if (r0 == 0) goto L_0x0027
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r0 = r0.A08
            if (r0 == 0) goto L_0x0027
            r0.setHint(r1)
        L_0x0027:
            X.OI5 r0 = r5.A00
            if (r0 == 0) goto L_0x0030
            android.view.View r0 = r0.A02
        L_0x002d:
            r0.setVisibility(r3)
        L_0x0030:
            A02(r5)
            r5.A0D()
            com.instagram.clips.model.ClipsSpotlightModel r1 = A01(r5)
            X.OI5 r0 = r5.A00
            if (r1 == 0) goto L_0x0046
            if (r0 == 0) goto L_0x0045
            com.instagram.common.ui.base.IgTextView r0 = r0.A04
            X.AnonymousClass7TH.A0R(r0)
        L_0x0045:
            return
        L_0x0046:
            if (r0 == 0) goto L_0x004d
            com.instagram.common.ui.base.IgTextView r0 = r0.A04
            X.AnonymousClass7TF.A16(r0)
        L_0x004d:
            X.OI5 r0 = r5.A00
            if (r0 == 0) goto L_0x0045
            com.instagram.common.ui.base.IgTextView r1 = r0.A04
            if (r1 == 0) goto L_0x0045
            r0 = 2131955827(0x7f131073, float:1.9548192E38)
            r1.setText(r0)
            return
        L_0x005c:
            r1 = 0
            goto L_0x001c
        L_0x005e:
            X.OI5 r0 = r5.A00
            if (r0 == 0) goto L_0x0030
            android.view.View r0 = r0.A02
            r3 = 8
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69247Ni1.DW8(int, int):void");
    }

    public final void onDestroyView() {
        super.onDestroyView();
        A0D();
        this.A00 = null;
        AnonymousClass3E6 r0 = this.A02;
        if (r0 != null) {
            r0.onStop();
            AnonymousClass3E6 r02 = this.A02;
            if (r02 != null) {
                r02.EEH(this);
                return;
            }
        }
        0qQ.A0F("keyboardHeightChangeDetector");
        throw AnonymousClass00P.createAndThrow();
    }
}

package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.api.schemas.SocialContextType;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.clips.model.ClipsReplyBarData;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;
import com.instagram.user.model.User;
import instagram.features.clips.viewer.controller.EmojiReactionTrayView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Mep  reason: case insensitive filesystem */
public final class C66906Mep extends GME implements C252213ok {
    public View A00;
    public View A01;
    public ViewGroup A02;
    public IgImageView A03;
    public 2Dm A04;
    public ComposerAutoCompleteTextView A05;
    public OLV A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public TextWatcher A0A;
    public View A0B;
    public ImmutableList A0C;
    public GMD A0D;
    public IgTextView A0E;
    public IgTextView A0F;
    public final FragmentActivity A0G;
    public final ClipsViewerSource A0H;
    public final ClipsReplyBarData A0I;
    public final UserSession A0J;
    public final C66912Mew A0K;
    public final AnonymousClass4DU A0L;
    public final C66907Meq A0M;
    public final List A0N = AnonymousClass7TE.A1C();
    public final AnonymousClass0eM A0O;
    public final AnonymousClass0eM A0P;
    public final AnonymousClass0eM A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final AnonymousClass3E6 A0T;
    public final C52009GBg A0U;
    public final GD6 A0V;
    public final GCB A0W;
    public final GNH A0X;
    public final boolean A0Y;

    public C66906Mep(FragmentActivity fragmentActivity, ClipsViewerSource clipsViewerSource, ClipsReplyBarData clipsReplyBarData, UserSession userSession, AnonymousClass4DU r11, C52009GBg gBg, GD6 gd6, GCB gcb, GNH gnh, C66907Meq meq, boolean z) {
        boolean z2;
        int A032 = DbW.A03(2, gd6, userSession);
        0qQ.A0B(r11, 4);
        AnonymousClass7TG.A1S(fragmentActivity, gBg);
        0qQ.A0B(clipsViewerSource, 10);
        this.A0I = clipsReplyBarData;
        this.A0V = gd6;
        this.A0J = userSession;
        this.A0L = r11;
        this.A0G = fragmentActivity;
        this.A0U = gBg;
        this.A0M = meq;
        this.A0X = gnh;
        this.A0Y = z;
        this.A0H = clipsViewerSource;
        this.A0W = gcb;
        this.A0K = AnonymousClass1pH.A00().E52(userSession);
        boolean z3 = true;
        this.A0T = AnonymousClass3E4.A01(this, false, true);
        ImmutableList of = ImmutableList.of();
        0qQ.A07(of);
        this.A0C = of;
        ClipsViewerSource clipsViewerSource2 = ClipsViewerSource.BLEND;
        if (clipsViewerSource == clipsViewerSource2 || clipsReplyBarData.A0F || (!C328447Ev.A01(userSession) && !C328447Ev.A00(userSession) && !C328447Ev.A02(userSession))) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.A0S = z2;
        this.A0R = clipsViewerSource != clipsViewerSource2 ? false : z3;
        this.A0O = AnonymousClass0eN.A01(new C58674Ivj(this, 2));
        0eO r1 = 0eO.A02;
        this.A0P = AnonymousClass0eN.A00(r1, new C58674Ivj(this, A032));
        this.A0Q = AnonymousClass0eN.A00(r1, new C58674Ivj(this, 4));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e3, code lost:
        if (r2 != false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A04(int r8) {
        /*
            r7 = this;
            r5 = 0
            r7.A09 = r5
            boolean r0 = r7.A0R
            r3 = 1
            if (r0 == 0) goto L_0x0025
            com.instagram.clips.model.ClipsReplyBarData r0 = r7.A0I
            java.lang.String r6 = r0.A0C
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r4 = r7.A05
            if (r4 == 0) goto L_0x0024
            androidx.fragment.app.FragmentActivity r0 = r7.A0G
            android.content.res.Resources r5 = r0.getResources()
            r1 = 2131955300(0x7f130e64, float:1.9547124E38)
        L_0x0019:
            java.lang.Object[] r0 = new java.lang.Object[]{r6}
        L_0x001d:
            java.lang.String r0 = r5.getString(r1, r0)
        L_0x0021:
            r4.setHint(r0)
        L_0x0024:
            return
        L_0x0025:
            boolean r0 = r7.A0S
            if (r0 == 0) goto L_0x0037
            X.GMD r1 = r7.A0D
            java.lang.String r0 = "reshareInfoStore"
            if (r1 != 0) goto L_0x00e7
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0037:
            com.instagram.clips.model.ClipsReplyBarData r1 = r7.A0I
            boolean r0 = r1.A0F
            if (r0 == 0) goto L_0x0063
            if (r8 != 0) goto L_0x0168
            r7.A0H()
            com.instagram.model.direct.DirectShareTarget r0 = r1.A02
            java.lang.String r6 = r0.A0J
            if (r6 != 0) goto L_0x004a
            java.lang.String r6 = ""
        L_0x004a:
            java.lang.String r1 = r0.A0A()
            int r0 = r6.length()
            if (r0 != 0) goto L_0x0055
            r6 = r1
        L_0x0055:
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r4 = r7.A05
            if (r4 == 0) goto L_0x0024
            androidx.fragment.app.FragmentActivity r0 = r7.A0G
            android.content.res.Resources r5 = r0.getResources()
            r1 = 2131955712(0x7f131000, float:1.954796E38)
            goto L_0x0019
        L_0x0063:
            boolean r0 = r1.A0G
            if (r0 == 0) goto L_0x0075
            if (r8 != 0) goto L_0x014c
            r7.A0H()
            X.GNH r0 = r7.A0X
            if (r0 == 0) goto L_0x0075
            android.view.View r0 = r0.A02
            X.AnonymousClass7TH.A0R(r0)
        L_0x0075:
            boolean r0 = r1.A0K
            if (r0 == 0) goto L_0x008d
            if (r8 != 0) goto L_0x008d
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r4 = r7.A05
            if (r4 == 0) goto L_0x0024
            androidx.fragment.app.FragmentActivity r0 = r7.A0G
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131955715(0x7f131003, float:1.9547965E38)
        L_0x0088:
            java.lang.String r0 = r1.getString(r0)
            goto L_0x0021
        L_0x008d:
            java.lang.String r6 = r1.A0C
            if (r6 != 0) goto L_0x00a3
            java.lang.String r0 = r1.A09
            if (r0 != 0) goto L_0x00a3
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r4 = r7.A05
            if (r4 == 0) goto L_0x0024
            androidx.fragment.app.FragmentActivity r0 = r7.A0G
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131955711(0x7f130fff, float:1.9547957E38)
            goto L_0x0088
        L_0x00a3:
            java.lang.String r3 = r1.A09
            if (r3 != 0) goto L_0x00a8
            r3 = r6
        L_0x00a8:
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r4 = r7.A05
            if (r4 == 0) goto L_0x0024
            boolean r2 = r1.A0H
            if (r8 != 0) goto L_0x00da
            if (r2 == 0) goto L_0x00cb
            com.instagram.common.session.UserSession r1 = r7.A0J
            X.0Tu r0 = X.0Tu.A05
            boolean r0 = X.182.A05(r0, r1)
            if (r0 == 0) goto L_0x00cb
            androidx.fragment.app.FragmentActivity r0 = r7.A0G
            android.content.res.Resources r5 = r0.getResources()
            r1 = 2131955713(0x7f131001, float:1.9547961E38)
        L_0x00c5:
            java.lang.Object[] r0 = new java.lang.Object[]{r3}
            goto L_0x001d
        L_0x00cb:
            androidx.fragment.app.FragmentActivity r0 = r7.A0G
            android.content.res.Resources r5 = r0.getResources()
            r1 = 2131955712(0x7f131000, float:1.954796E38)
            if (r2 == 0) goto L_0x00c5
            r1 = 2131955714(0x7f131002, float:1.9547963E38)
            goto L_0x00c5
        L_0x00da:
            androidx.fragment.app.FragmentActivity r0 = r7.A0G
            android.content.res.Resources r5 = r0.getResources()
            r1 = 2131955716(0x7f131004, float:1.9547967E38)
            if (r2 == 0) goto L_0x00c5
            goto L_0x0019
        L_0x00e7:
            boolean r0 = r7.A0Y
            if (r0 == 0) goto L_0x0147
            if (r8 < 0) goto L_0x0168
            com.google.common.collect.ImmutableList r0 = r7.A0C
            int r0 = r0.size()
            if (r8 >= r0) goto L_0x0168
            com.google.common.collect.ImmutableList r0 = r7.A0C
            java.lang.Object r0 = r0.get(r8)
            X.9JD r0 = (X.AnonymousClass9JD) r0
        L_0x00fd:
            if (r0 == 0) goto L_0x0168
            java.lang.Object r0 = r0.A01
            X.9IL r0 = (X.AnonymousClass9IL) r0
            if (r0 == 0) goto L_0x0168
            java.lang.Object r1 = r0.A02
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            if (r1 == 0) goto L_0x0168
            boolean r0 = r1.A1X()
            if (r0 == 0) goto L_0x0117
            r7.A0F()
        L_0x0114:
            r7.A09 = r5
            return
        L_0x0117:
            r7.A0H()
            java.lang.String r4 = r1.B8Q()
            java.lang.String r1 = r1.getId()
            com.instagram.common.session.UserSession r0 = r7.A0J
            boolean r3 = X.C51966G9m.A1W(r0, r1)
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r2 = r7.A05
            if (r2 == 0) goto L_0x0114
            androidx.fragment.app.FragmentActivity r0 = r7.A0G
            android.content.res.Resources r1 = r0.getResources()
            if (r3 == 0) goto L_0x013f
            r0 = 2131955715(0x7f131003, float:1.9547965E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x013b:
            r2.setHint(r0)
            goto L_0x0114
        L_0x013f:
            r0 = 2131955712(0x7f131000, float:1.954796E38)
            java.lang.String r0 = X.AnonymousClass7TF.A0e(r1, r4, r0)
            goto L_0x013b
        L_0x0147:
            X.9JD r0 = r1.A01(r8)
            goto L_0x00fd
        L_0x014c:
            r7.A0F()
            X.GNH r2 = r7.A0X
            if (r2 == 0) goto L_0x015a
            android.view.View r0 = r2.A02
            if (r0 == 0) goto L_0x015a
            r0.setVisibility(r5)
        L_0x015a:
            X.4bN r1 = A02(r7)
            if (r2 == 0) goto L_0x016b
            boolean r0 = X.GNH.A01(r1)
            r2.A0E(r1, r0)
            goto L_0x016b
        L_0x0168:
            r7.A0F()
        L_0x016b:
            r7.A09 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66906Mep.A04(int):void");
    }

    private final ImmutableList A01() {
        ImmutableList immutableList;
        2Dm r0;
        AnonymousClass3U9 C60;
        UserSession userSession = this.A0J;
        17i A002 = 17h.A00(userSession);
        String str = this.A0I.A0B;
        if (str == null || (r0 = this.A04) == null || (C60 = r0.C60(str)) == null) {
            immutableList = ImmutableList.of();
        } else {
            DirectThreadKey BJy = C60.BJz();
            2Dm r02 = this.A04;
            ArrayList arrayList = null;
            if (r02 != null) {
                ArrayList CBx = r02.CBx(BJy);
                arrayList = AnonymousClass7TG.A0r(CBx);
                Iterator it = CBx.iterator();
                while (it.hasNext()) {
                    C254703su A0a = C66580MXl.A0a(it);
                    User A022 = A002.A02(A0a.A1u);
                    User A023 = A002.A02(userSession.A06);
                    if (A023 != null) {
                        AnonymousClass9IL r4 = new AnonymousClass9IL(A0a.C7c(), A022, 1);
                        String A0g = A0a.A0g();
                        String str2 = "";
                        if (A0g == null) {
                            A0g = str2;
                        }
                        String A0f = A0a.A0f();
                        if (A0f != null) {
                            str2 = A0f;
                        }
                        arrayList.add(new AnonymousClass9JD(r4, A0g, str2, (List) A0a.A0r(A023)));
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                }
            }
            immutableList = ImmutableList.copyOf((Collection) arrayList);
        }
        0qQ.A07(immutableList);
        return immutableList;
    }

    public static final C267324bN A02(C66906Mep mep) {
        int A062;
        C52012GBj gBj = mep.A02;
        if (gBj == null || (A062 = gBj.A06()) < 0) {
            return null;
        }
        C52009GBg gBg = mep.A0V.A0A;
        if (A062 < gBg.A0A()) {
            return gBg.A0E(A062);
        }
        return null;
    }

    private final void A03() {
        IgImageView igImageView;
        if (AnonymousClass7TF.A1Z(this.A0P)) {
            ComposerAutoCompleteTextView composerAutoCompleteTextView = this.A05;
            if (composerAutoCompleteTextView != null) {
                composerAutoCompleteTextView.setHintTextColor(this.A0G.getApplicationContext().getColor(R.color.design_dark_default_color_on_background));
            }
            ViewGroup viewGroup = this.A02;
            if (viewGroup != null) {
                DbU.A11(this.A0G.getApplicationContext(), viewGroup, R.drawable.clips_reply_message_composer_background_v2);
            }
        }
        if (AnonymousClass7TF.A1Z(this.A0Q) && (igImageView = this.A03) != null) {
            DbU.A14(this.A0G.getApplicationContext(), igImageView, R.color.design_dark_default_color_on_background);
        }
    }

    public static final void A05(C66906Mep mep) {
        Editable editable;
        int i;
        ComposerAutoCompleteTextView composerAutoCompleteTextView = mep.A05;
        if (composerAutoCompleteTextView != null) {
            editable = composerAutoCompleteTextView.getText();
        } else {
            editable = null;
        }
        String valueOf = String.valueOf(editable);
        C52012GBj gBj = mep.A02;
        if (gBj != null) {
            i = gBj.A06();
        } else {
            i = 0;
        }
        if (mep.A08 || (i != 0 && !mep.A0R && (!mep.A0S || mep.A09))) {
            IgTextView igTextView = mep.A0E;
            if (igTextView != null) {
                igTextView.setVisibility(0);
            }
            IgTextView igTextView2 = mep.A0E;
            if (igTextView2 != null) {
                igTextView2.setEnabled(C51966G9m.A1X(valueOf));
                return;
            }
            return;
        }
        AnonymousClass7TH.A0R(mep.A0E);
    }

    public final View A0C() {
        return this.A01;
    }

    public final void A0D() {
        C66907Meq meq = this.A0M;
        if (meq != null) {
            meq.A0C((List) null, true);
        }
        ViewGroup viewGroup = this.A02;
        if (viewGroup != null && viewGroup.getVisibility() == 4) {
            ViewGroup viewGroup2 = this.A02;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(0);
            }
            View view = this.A01;
            if (view != null) {
                view.setOnTouchListener((View.OnTouchListener) null);
            }
        }
        FragmentActivity fragmentActivity = this.A0G;
        Drawable drawable = fragmentActivity.getApplicationContext().getDrawable(R.drawable.instagram_reaction_add_pano_outline_24);
        int color = fragmentActivity.getApplicationContext().getColor(2Yu.A09(fragmentActivity.getApplicationContext()));
        IgImageView igImageView = this.A03;
        if (igImageView != null) {
            igImageView.setImageDrawable(drawable);
        }
        IgImageView igImageView2 = this.A03;
        if (igImageView2 != null) {
            igImageView2.setColorFilter(color);
        }
    }

    public final void A0E() {
        0nA.A0J(this.A0G);
        this.A08 = false;
        A05(this);
    }

    public final void A0F() {
        AnonymousClass7TH.A0R(this.A01);
        A0E();
    }

    public final void A0H() {
        AnonymousClass7TF.A16(this.A01);
    }

    public final void A0I(String str, String str2, String str3, String str4) {
        long j;
        Object obj;
        C254703su A062;
        C254703su A063;
        List list;
        Long l;
        GCB gcb;
        1Xj r9;
        ClipsReplyBarData clipsReplyBarData = this.A0I;
        DirectShareTarget directShareTarget = clipsReplyBarData.A02;
        C254743sy A064 = AnonymousClass6W3.A06(DbS.A0c(directShareTarget));
        if (A064 != null) {
            boolean z = true;
            Editable editable = null;
            String str5 = str;
            if (this.A0H == ClipsViewerSource.BLEND) {
                C267324bN A022 = A02(this);
                if (A022 != null && (r9 = A022.A02) != null) {
                    ComposerAutoCompleteTextView composerAutoCompleteTextView = this.A05;
                    if (composerAutoCompleteTextView != null) {
                        editable = composerAutoCompleteTextView.getText();
                    }
                    this.A0K.A00(directShareTarget).ELU(SocialContextType.BLEND_MEDIA_SUGGESTED_BY, r9, directShareTarget, 002.A0R(String.valueOf(editable), str5), clipsReplyBarData.A0A, "", clipsReplyBarData.A0I);
                } else {
                    return;
                }
            } else {
                AnonymousClass9JD A002 = A00(this);
                if (A002 != null) {
                    if (A002.A00 == null) {
                        A002.A00 = AnonymousClass7TE.A1C();
                    }
                    UserSession userSession = this.A0J;
                    if (C328447Ev.A05(userSession) && ((list = (List) A002.A00) == null || list.contains(str5))) {
                        z = false;
                    }
                    if (!this.A0Y) {
                        if (z) {
                            0Tu r5 = 0Tu.A06;
                            if (!182.A06(r5, userSession, 36320266384580745L) || !182.A06(r5, userSession, 36320266384842892L) || 182.A06(r5, userSession, 36322409573263504L)) {
                                if (C328447Ev.A00(userSession) && (A063 = ((AnonymousClass7YU) this.A0O.getValue()).A06(A002.A03)) != null) {
                                    String str6 = userSession.A06;
                                    A063.A0y(userSession, new C2607246u((ExtendedImageUrl) null, (Long) null, str6, str5, (String) null), str6, (String) null);
                                }
                                obj = AnonymousClass7TE.A1I(str5);
                            } else {
                                Collection collection = (Collection) A002.A00;
                                if (collection != null) {
                                    obj = 00k.A0T(str5, collection);
                                }
                                obj = null;
                            }
                        } else {
                            if (C328447Ev.A00(userSession) && (A062 = ((AnonymousClass7YU) this.A0O.getValue()).A06(A002.A03)) != null) {
                                String str7 = userSession.A06;
                                A062.A0z(userSession, new C2607246u((ExtendedImageUrl) null, (Long) null, str7, str5, (String) null), str7, (String) null);
                            }
                            Iterable iterable = (Iterable) A002.A00;
                            if (iterable != null) {
                                obj = 00k.A0f(iterable, str5);
                            }
                            obj = null;
                        }
                        A002.A00 = obj;
                        GMD gmd = this.A0D;
                        if (gmd == null) {
                            0qQ.A0F("reshareInfoStore");
                            throw AnonymousClass00P.createAndThrow();
                        }
                        String str8 = A002.A03;
                        0qQ.A0B(str8, 0);
                        gmd.A04.put(str8, obj);
                        GMD.A00(gmd);
                    }
                    C333547Zj A003 = C70172NyQ.A00(userSession, DbS.A0c(directShareTarget));
                    String str9 = A002.A03;
                    String str10 = A002.A02;
                    AnonymousClass9IL r2 = (AnonymousClass9IL) A002.A01;
                    if (r2 != null) {
                        j = r2.A01;
                    } else {
                        j = 0;
                    }
                    A003.ELt((C60957JuF) null, (C70621ODs) null, 2FW.A0m, A064, str9, str10, str5, NetInfoModule.CONNECTION_TYPE_NONE, str3, (String) null, (String) null, j, z, clipsReplyBarData.A0I, false, false);
                } else {
                    return;
                }
            }
            ViewGroup viewGroup = this.A02;
            if (viewGroup == null || (gcb = this.A0W) == null || !this.A0R || this.A07) {
                Context applicationContext = this.A0G.getApplicationContext();
                int i = 2131955718;
                if (z) {
                    i = 2131955717;
                }
                C59689JTv.A07(applicationContext, i);
            } else {
                this.A07 = true;
                gcb.A0C(viewGroup, str5, 50);
            }
            UserSession userSession2 = this.A0J;
            C66908Mer.A00(userSession2);
            AnonymousClass4DU r22 = this.A0L;
            0wc A012 = AnonymousClass0kN.A01(r22, userSession2);
            String moduleName = r22.getModuleName();
            String str11 = clipsReplyBarData.A0A;
            String str12 = clipsReplyBarData.A0B;
            String str13 = clipsReplyBarData.A05;
            0qQ.A0B(moduleName, 1);
            0Aj A0e = AnonymousClass7TE.A0e(A012, "direct_reply_bar_emoji_reaction_send");
            if (A0e.isSampled()) {
                A0e.AAJ("containermodule", moduleName);
                DbS.A1N(A0e, str11);
                C66580MXl.A1J(A0e, str12);
                if (str13 != null) {
                    l = DbV.A0q(str13);
                } else {
                    l = null;
                }
                A0e.A9F("blend_id", l);
                A0e.Cgf();
            }
            A0D();
            if (this.A0R) {
                A0E();
            }
        }
    }

    public final boolean A0J() {
        Integer num;
        C52012GBj gBj = this.A02;
        if (gBj != null) {
            num = Integer.valueOf(gBj.A06());
        } else {
            num = null;
        }
        if (!this.A0I.A0J || num == null || num.intValue() != 0) {
            return false;
        }
        return true;
    }

    public final boolean A0K() {
        View view = this.A01;
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r13v1, types: [android.view.View, java.lang.Object, com.instagram.common.ui.widget.imageview.ConstrainedImageView] */
    public final void DMr(int i, boolean z) {
        View view;
        IgTextView igTextView;
        Drawable background;
        String str;
        1Xj r0;
        float f;
        Context context;
        IgTextView igTextView2;
        Drawable background2;
        View view2;
        boolean z2 = this.A08;
        int i2 = i;
        this.A08 = C51970G9q.A1W(i2, AnonymousClass2uJ.A01);
        ClipsReplyBarData clipsReplyBarData = this.A0I;
        boolean z3 = clipsReplyBarData.A0F;
        if (!z3 && (view2 = this.A01) != null) {
            view2.setTranslationY(-((float) i2));
        }
        UserSession userSession = this.A0J;
        AnonymousClass4DU r3 = this.A0L;
        0wc A012 = AnonymousClass0kN.A01(r3, userSession);
        C66908Mer.A00(userSession);
        boolean z4 = this.A08;
        C52009GBg gBg = this.A0U;
        if (z4) {
            gBg.A0X(true);
            A0D();
            IgImageView igImageView = this.A03;
            if (igImageView != null) {
                igImageView.setVisibility(8);
            }
            View view3 = this.A0B;
            if (view3 != null) {
                view3.setVisibility(8);
            }
            for (View visibility : this.A0N) {
                visibility.setVisibility(8);
            }
            View view4 = this.A00;
            if (view4 != null) {
                view4.setAlpha(1.0f);
            }
            ViewGroup viewGroup = this.A02;
            if (!(viewGroup == null || (background2 = viewGroup.getBackground()) == null)) {
                background2.setAlpha(255);
            }
            if ((clipsReplyBarData.A0G || this.A0S) && clipsReplyBarData.A0H && (igTextView2 = this.A0F) != null) {
                igTextView2.setVisibility(0);
            }
            OLV olv = this.A06;
            if (olv != null) {
                olv.A00(true);
            }
            OLV olv2 = this.A06;
            if (olv2 != null) {
                0qQ.A0B(r3, 0);
                OD8 od8 = olv2.A03;
                od8.A00 = r3;
                List<String> A022 = C71100Oca.A02(olv2.A02);
                ArrayList A0r = AnonymousClass7TG.A0r(A022);
                for (String A013 : A022) {
                    A0r.add(C336957fS.A01(A013));
                }
                EmojiReactionTrayView emojiReactionTrayView = olv2.A01;
                if (emojiReactionTrayView != null) {
                    emojiReactionTrayView.A00 = od8;
                    List list = emojiReactionTrayView.A02;
                    if (list.isEmpty()) {
                        int i3 = 0;
                        do {
                            context = emojiReactionTrayView.getContext();
                            0qQ.A07(context);
                            ? constrainedImageView = new ConstrainedImageView(context);
                            emojiReactionTrayView.addView(constrainedImageView);
                            ViewGroup.LayoutParams layoutParams = constrainedImageView.getLayoutParams();
                            Context context2 = constrainedImageView.getContext();
                            layoutParams.width = context2.getResources().getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
                            constrainedImageView.getLayoutParams().height = context2.getResources().getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
                            list.add(constrainedImageView);
                            i3++;
                        } while (i3 < 5);
                        View inflate = LayoutInflater.from(context).inflate(R.layout.emoji_reaction_see_more_button, emojiReactionTrayView, false);
                        0qQ.A0C(inflate, "null cannot be cast to non-null type com.instagram.common.ui.base.IgSimpleImageView");
                        ImageView imageView = (ImageView) inflate;
                        Drawable mutate = imageView.getDrawable().mutate();
                        0qQ.A07(mutate);
                        DbX.A11(context, mutate, 2Yu.A0H(context, R.attr.igdsSecondaryIcon));
                        imageView.setImageDrawable(mutate);
                        AnonymousClass3NG A0m = AnonymousClass7TE.A0m(imageView);
                        A0m.A07 = true;
                        A0m.A0C = true;
                        A0m.A06 = false;
                        A0m.A04 = new NQy(od8, 2);
                        A0m.A00();
                        emojiReactionTrayView.addView(imageView);
                    }
                    List list2 = emojiReactionTrayView.A03;
                    list2.clear();
                    list2.addAll(00k.A0d(A0r, 5));
                    if (list2.size() == list.size()) {
                        int measuredWidth = emojiReactionTrayView.getMeasuredWidth();
                        int i4 = (measuredWidth - ((int) (((float) measuredWidth) * 0.4f))) / 2;
                        float f2 = emojiReactionTrayView.A01;
                        int size = list2.size() + 1;
                        for (int i5 = 0; i5 < size; i5++) {
                            int i6 = i5 % 3;
                            if (0mk.A02(emojiReactionTrayView.getContext())) {
                                float f3 = ((float) i6) * f2;
                                f = ((((float) (measuredWidth - i4)) - f2) - f3) - f3;
                            } else {
                                float f4 = ((float) i6) * f2;
                                f = ((float) i4) + f4 + f4;
                            }
                            float f5 = ((float) (i5 / 3)) * f2;
                            emojiReactionTrayView.getChildAt(i5).setX(f);
                            emojiReactionTrayView.getChildAt(i5).setY(f5 + f5);
                        }
                        int size2 = list2.size();
                        for (int i7 = 0; i7 < size2; i7++) {
                            C317486nL r10 = (C317486nL) list2.get(i7);
                            IgImageView igImageView2 = (IgImageView) list.get(i7);
                            if (!0qQ.A0K(r10, igImageView2.getTag())) {
                                C336957fS r02 = C317486nL.A04;
                                String str2 = r10.A02;
                                igImageView2.setUrl(r02.A04(str2), r3);
                                igImageView2.setTag(r10);
                                igImageView2.setContentDescription(str2);
                                AnonymousClass3NG r2 = new AnonymousClass3NG(igImageView2);
                                r2.A07 = true;
                                r2.A0C = true;
                                r2.A04 = new NR0(r10, od8);
                                r2.A00();
                            }
                        }
                    } else {
                        throw DbT.A0m();
                    }
                }
            }
            String moduleName = r3.getModuleName();
            String str3 = clipsReplyBarData.A0A;
            C267324bN A023 = A02(this);
            if (A023 == null || (r0 = A023.A02) == null || (str = r0.getId()) == null) {
                str = "";
            }
            C71040OaD.A02(A012, moduleName, str3, str, clipsReplyBarData.A05);
        } else {
            gBg.A0X(false);
            if (this.A0R) {
                view = this.A0B;
            } else {
                view = this.A03;
            }
            if (view != null) {
                int i8 = 8;
                if (!z3) {
                    i8 = 0;
                }
                view.setVisibility(i8);
            }
            for (View view5 : this.A0N) {
                int i9 = 8;
                if (!z3) {
                    i9 = 0;
                }
                view5.setVisibility(i9);
            }
            View view6 = this.A00;
            if (view6 != null) {
                view6.setAlpha(0.0f);
            }
            ViewGroup viewGroup2 = this.A02;
            if (!(viewGroup2 == null || (background = viewGroup2.getBackground()) == null)) {
                background.setAlpha(204);
            }
            if ((clipsReplyBarData.A0G || this.A0S) && clipsReplyBarData.A0H && (igTextView = this.A0F) != null) {
                igTextView.setVisibility(8);
            }
            OLV olv3 = this.A06;
            if (olv3 != null) {
                olv3.A00(false);
            }
            if (z2) {
                C71040OaD.A01(A012, r3.getModuleName(), clipsReplyBarData.A0A, "direct_reply_bar_tap");
            }
        }
        A05(this);
    }

    public final void onPause() {
        ComposerAutoCompleteTextView composerAutoCompleteTextView = this.A05;
        if (composerAutoCompleteTextView != null) {
            composerAutoCompleteTextView.removeTextChangedListener(this.A0A);
        }
        this.A0A = null;
    }

    public final void onResume() {
        C71273OhE ohE = new C71273OhE(this, 26);
        this.A0A = ohE;
        ComposerAutoCompleteTextView composerAutoCompleteTextView = this.A05;
        if (composerAutoCompleteTextView != null) {
            composerAutoCompleteTextView.addTextChangedListener(ohE);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009c, code lost:
        if (r8.A0G != false) goto L_0x009e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r25, android.os.Bundle r26) {
        /*
            r24 = this;
            r10 = r25
            if (r25 == 0) goto L_0x0300
            r0 = 2131430045(0x7f0b0a9d, float:1.848178E38)
            android.view.View r1 = X.DbY.A0F(r10, r0)
            r11 = r24
            if (r1 == 0) goto L_0x001f
            r0 = 2131428545(0x7f0b04c1, float:1.8478738E38)
            android.view.View r1 = r1.requireViewById(r0)
            r11.A00 = r1
            if (r1 == 0) goto L_0x001f
            r0 = 19
            X.C71439Oke.A01(r1, r0, r11)
        L_0x001f:
            r0 = 2131430206(0x7f0b0b3e, float:1.8482106E38)
            android.view.View r1 = X.DbY.A0F(r10, r0)
            r14 = 0
            if (r1 == 0) goto L_0x0107
            r0 = 2131439856(0x7f0b30f0, float:1.8501679E38)
            com.instagram.common.ui.base.IgTextView r0 = X.DbT.A0a(r1, r0)
            r11.A0F = r0
            r0 = 2131439668(0x7f0b3034, float:1.8501298E38)
            android.view.ViewGroup r0 = X.DbU.A0C(r1, r0)
            r11.A02 = r0
            r0 = 2131439850(0x7f0b30ea, float:1.8501667E38)
            android.view.View r0 = r1.requireViewById(r0)
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r0 = (com.instagram.ui.widget.textview.ComposerAutoCompleteTextView) r0
            r11.A05 = r0
            r0 = 2131439854(0x7f0b30ee, float:1.8501675E38)
            com.instagram.common.ui.base.IgTextView r0 = X.DbT.A0a(r1, r0)
            r11.A0E = r0
            r0 = 2131439851(0x7f0b30eb, float:1.8501669E38)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = X.DbT.A0b(r1, r0)
            r11.A03 = r0
            r0 = 2131439853(0x7f0b30ed, float:1.8501673E38)
            android.view.View r0 = r1.requireViewById(r0)
            r11.A0B = r0
        L_0x0061:
            r11.A01 = r1
            boolean r13 = r11.A0S
            r9 = 0
            if (r13 == 0) goto L_0x00f5
            com.instagram.common.session.UserSession r1 = r11.A0J
            X.GMD r0 = X.GNS.A00(r1)
            r11.A0D = r0
            boolean r0 = r11.A0Y
            java.lang.String r2 = "reshareInfoStore"
            if (r0 == 0) goto L_0x008d
            X.2Dm r0 = X.1bJ.A00(r1)
            r11.A04 = r0
            com.google.common.collect.ImmutableList r0 = r11.A01()
            r11.A0C = r0
            X.GMD r1 = r11.A0D
            if (r1 == 0) goto L_0x02f8
            com.google.common.collect.ImmutableList r0 = r11.A01()
            r1.A05(r0)
        L_0x008d:
            X.GMD r0 = r11.A0D
            if (r0 == 0) goto L_0x02f8
            int r0 = r0.A00
            r11.A04(r0)
        L_0x0096:
            if (r13 != 0) goto L_0x009e
            com.instagram.clips.model.ClipsReplyBarData r8 = r11.A0I
            boolean r0 = r8.A0G
            if (r0 == 0) goto L_0x00c4
        L_0x009e:
            com.instagram.clips.model.ClipsReplyBarData r8 = r11.A0I
            boolean r0 = r8.A0F
            if (r0 != 0) goto L_0x00c4
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r11.A03
            if (r0 == 0) goto L_0x00ab
            r0.setVisibility(r9)
        L_0x00ab:
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r11.A03
            if (r2 == 0) goto L_0x00bb
            androidx.fragment.app.FragmentActivity r0 = r11.A0G
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131955709(0x7f130ffd, float:1.9547953E38)
            X.DbT.A1A(r1, r2, r0)
        L_0x00bb:
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r11.A03
            if (r1 == 0) goto L_0x00c4
            r0 = 19
            X.C71406Ok5.A00(r1, r0, r11)
        L_0x00c4:
            android.view.ViewGroup r12 = r11.A02
            boolean r0 = r11.A0R
            r7 = 8
            if (r0 == 0) goto L_0x01c3
            if (r12 == 0) goto L_0x01c3
            com.instagram.common.session.UserSession r6 = r11.A0J
            java.util.List r0 = X.C71100Oca.A02(r6)
            r5 = 3
            java.util.List r0 = X.00k.A0d(r0, r5)
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x00e1:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x010a
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            X.6nL r0 = X.C336957fS.A01(r0)
            r2.add(r0)
            goto L_0x00e1
        L_0x00f5:
            com.instagram.clips.model.ClipsReplyBarData r0 = r11.A0I
            boolean r0 = r0.A0G
            if (r0 == 0) goto L_0x0103
            com.instagram.common.session.UserSession r0 = r11.A0J
            X.GMD r0 = X.GNS.A00(r0)
            r11.A0D = r0
        L_0x0103:
            r11.A04(r9)
            goto L_0x0096
        L_0x0107:
            r1 = r14
            goto L_0x0061
        L_0x010a:
            java.util.Iterator r16 = r2.iterator()
        L_0x010e:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x018a
            java.lang.Object r4 = r16.next()
            X.6nL r4 = (X.C317486nL) r4
            android.content.Context r3 = r12.getContext()
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131165213(0x7f07001d, float:1.7944637E38)
            r2 = 2131165213(0x7f07001d, float:1.7944637E38)
            int r1 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r0 = r3.getResources()
            int r0 = r0.getDimensionPixelSize(r2)
            com.instagram.common.ui.base.IgFrameLayout r2 = X.C337077fe.A00(r3, r1, r0)
            java.lang.Object r1 = r2.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.ui.widget.emojigrid.EmojiGridRowItemViewBinder.Holder"
            X.0qQ.A0C(r1, r0)
            X.7fc r1 = (X.C337057fc) r1
            X.4DU r15 = r11.A0L
            X.PRI r0 = new X.PRI
            r0.<init>(r11, r5)
            r23 = 1
            r22 = 1065353216(0x3f800000, float:1.0)
            r19 = r4
            r20 = r0
            r21 = r1
            r18 = r6
            r17 = r15
            X.C337077fe.A03(r17, r18, r19, r20, r21, r22, r23)
            android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
            r0 = 6
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r4, r0)
            android.widget.LinearLayout$LayoutParams r4 = (android.widget.LinearLayout.LayoutParams) r4
            r0 = 16
            r4.gravity = r0
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r4.setMarginEnd(r0)
            int r0 = r12.getChildCount()
            int r0 = r0 + -1
            r12.addView(r2, r0)
            java.util.List r0 = r11.A0N
            r0.add(r2)
            goto L_0x010e
        L_0x018a:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r11.A03
            if (r0 == 0) goto L_0x0191
            r0.setVisibility(r7)
        L_0x0191:
            android.view.View r0 = r11.A0B
            if (r0 == 0) goto L_0x0198
            r0.setVisibility(r9)
        L_0x0198:
            android.view.View r1 = r11.A0B
            if (r1 == 0) goto L_0x01a1
            r0 = 20
            X.C71406Ok5.A00(r1, r0, r11)
        L_0x01a1:
            X.OLV r2 = new X.OLV
            r2.<init>(r6, r11)
            r11.A06 = r2
            r0 = 2131432325(0x7f0b1385, float:1.8486404E38)
            android.view.View r1 = X.DbY.A0F(r10, r0)
            r0 = 2131430191(0x7f0b0b2f, float:1.8482076E38)
            android.view.View r0 = r1.requireViewById(r0)
            r2.A00 = r0
            r0 = 2131432324(0x7f0b1384, float:1.8486402E38)
            android.view.View r0 = r1.requireViewById(r0)
            instagram.features.clips.viewer.controller.EmojiReactionTrayView r0 = (instagram.features.clips.viewer.controller.EmojiReactionTrayView) r0
            r2.A01 = r0
        L_0x01c3:
            r11.A03()
            boolean r0 = r8.A0I
            if (r0 == 0) goto L_0x01da
            android.view.ViewGroup r2 = r11.A02
            if (r2 == 0) goto L_0x01da
            androidx.fragment.app.FragmentActivity r0 = r11.A0G
            android.content.Context r1 = r0.getApplicationContext()
            r0 = 2131231377(0x7f080291, float:1.8078833E38)
            X.DbU.A11(r1, r2, r0)
        L_0x01da:
            boolean r0 = r8.A0G
            r2 = 1
            if (r0 != 0) goto L_0x01e1
            if (r13 == 0) goto L_0x01fb
        L_0x01e1:
            boolean r0 = r8.A0H
            if (r0 == 0) goto L_0x01fb
            com.instagram.common.ui.base.IgTextView r4 = r11.A0F
            if (r4 == 0) goto L_0x01fb
            androidx.fragment.app.FragmentActivity r0 = r11.A0G
            android.content.res.Resources r3 = r0.getResources()
            r1 = 2131955710(0x7f130ffe, float:1.9547955E38)
            java.lang.String r0 = r8.A0C
            if (r0 != 0) goto L_0x01f8
            java.lang.String r0 = r8.A09
        L_0x01f8:
            X.DbY.A0y(r3, r4, r0, r1)
        L_0x01fb:
            com.instagram.common.ui.base.IgTextView r0 = r11.A0F
            if (r0 == 0) goto L_0x0202
            r0.setVisibility(r7)
        L_0x0202:
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r3 = r11.A05
            if (r3 == 0) goto L_0x02c9
            boolean r0 = r8.A0E
            if (r0 == 0) goto L_0x02c9
            r0 = 2131431798(0x7f0b1176, float:1.8485335E38)
            android.view.View r6 = X.DbY.A0F(r10, r0)
            X.0qQ.A07(r6)
            r0 = 2131431555(0x7f0b1083, float:1.8484843E38)
            android.view.View r5 = X.AnonymousClass7TF.A0F(r10, r0)
            r0 = 2131430466(0x7f0b0c42, float:1.8482634E38)
            androidx.recyclerview.widget.RecyclerView r0 = X.JTR.A0c(r10, r0)
            X.4DU r4 = r11.A0L
            X.7Gq r1 = new X.7Gq
            r1.<init>(r6, r5, r0, r4)
            X.2Dm r0 = r11.A04
            if (r0 != 0) goto L_0x0233
            com.instagram.common.session.UserSession r0 = r11.A0J
            X.2Dm r0 = X.1bJ.A00(r0)
        L_0x0233:
            r11.A04 = r0
            androidx.fragment.app.FragmentActivity r5 = r11.A0G
            com.instagram.common.session.UserSession r6 = r11.A0J
            X.7Gz r0 = new X.7Gz
            r0.<init>(r4, r6)
            X.0qQ.A0B(r5, r9)
            X.AnonymousClass7TF.A1D(r6, r2, r4)
            X.7H0 r15 = new X.7H0
            r20 = r1
            r21 = r14
            r17 = r4
            r18 = r6
            r19 = r0
            r16 = r5
            r15.<init>(r16, r17, r18, r19, r20, r21)
            java.lang.String r4 = r8.A0B
            if (r4 == 0) goto L_0x02f4
            X.2Dm r0 = r11.A04
            if (r0 == 0) goto L_0x02f4
            X.3U9 r18 = X.C66580MXl.A0d(r0, r4)
            if (r18 == 0) goto L_0x026a
            java.util.List r0 = r18.BRZ()
            r15.A0C(r0, r14)
        L_0x026a:
            r15.A08 = r2
            r15.A07 = r2
            X.7H4 r4 = r15.A0E
            java.util.List r0 = r15.A0F
            r16 = r4
            r17 = r14
            r19 = r0
            r20 = r9
            r21 = r9
            r16.A00(r17, r18, r19, r20, r21)
            X.7Qp r4 = new X.7Qp
            r4.<init>(r6)
            X.PEm r0 = new X.PEm
            r0.<init>(r3)
            r4.A01 = r0
            int r0 = X.0nA.A09(r5)
            r3.setDropDownWidth(r0)
            r0 = 2131427570(0x7f0b00f2, float:1.847676E38)
            r3.setDropDownAnchor(r0)
            r3.A02 = r2
            X.5mQ r0 = X.C294425mQ.ALL
            r3.setSupportedLinks(r0)
            r3.A01 = r2
            r3.addTextChangedListener(r4)
            r3.setAdapter(r15)
            X.PEl r5 = new X.PEl
            r5.<init>(r10, r3, r11)
            android.content.res.Resources r4 = X.DbU.A05(r10)
            r0 = 2131165251(0x7f070043, float:1.7944714E38)
            int r0 = r4.getDimensionPixelSize(r0)
            int r0 = r0 * 4
            r1.A00(r0)
            r1.A02 = r5
            X.OMu r0 = r1.A01
            if (r0 == 0) goto L_0x02c4
            r0.A01 = r5
        L_0x02c4:
            r0 = 17
            X.C71439Oke.A01(r3, r0, r1)
        L_0x02c9:
            boolean r0 = r8.A0D
            if (r0 == 0) goto L_0x02d6
            X.GNH r0 = r11.A0X
            if (r0 == 0) goto L_0x02d6
            android.view.View r0 = r0.A02
            X.AnonymousClass7TH.A0R(r0)
        L_0x02d6:
            X.3E6 r1 = r11.A0T
            r1.A9Y(r11)
            r1.EkY(r2)
            androidx.fragment.app.FragmentActivity r0 = r11.A0G
            r1.DmJ(r0)
            com.instagram.common.ui.base.IgTextView r0 = r11.A0E
            if (r0 == 0) goto L_0x02ea
            r0.setVisibility(r7)
        L_0x02ea:
            com.instagram.common.ui.base.IgTextView r1 = r11.A0E
            if (r1 == 0) goto L_0x0300
            r0 = 21
            X.C71406Ok5.A00(r1, r0, r11)
            return
        L_0x02f4:
            r18 = r14
            goto L_0x026a
        L_0x02f8:
            X.0qQ.A0F(r2)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0300:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66906Mep.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass9JD A00(X.C66906Mep r8) {
        /*
            X.4bN r7 = A02(r8)
            r2 = 0
            if (r7 == 0) goto L_0x0091
            com.instagram.clips.intf.ClipsViewerSource r1 = r8.A0H
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.BLEND
            if (r1 == r0) goto L_0x0091
            boolean r6 = r8.A0Y
            r5 = 1
            r4 = 0
            java.lang.String r3 = "reshareInfoStore"
            if (r6 != 0) goto L_0x0047
            X.GMD r1 = r8.A0D
            if (r1 == 0) goto L_0x0089
            int r0 = r1.A00
            if (r0 != 0) goto L_0x0047
            com.google.common.collect.ImmutableList r0 = r1.A03()
            int r0 = r0.size()
            if (r0 != r5) goto L_0x0047
            X.GMD r0 = r8.A0D
            if (r0 == 0) goto L_0x0089
            X.9JD r3 = r0.A01(r4)
        L_0x002f:
            if (r3 != 0) goto L_0x0046
            X.0wj r2 = X.0wj.A01
            r1 = 817902720(0x30c03480, float:1.398476E-9)
            java.lang.String r0 = "ClipsViewerReplyBarController"
            X.0f9 r2 = r2.AEf(r0, r1)
            java.lang.String r1 = "message"
            java.lang.String r0 = "ClipsReshareInfo was null"
            r2.ABQ(r1, r0)
            r2.report()
        L_0x0046:
            return r3
        L_0x0047:
            java.lang.String r2 = "Required value was null."
            if (r6 == 0) goto L_0x007b
            com.google.common.collect.ImmutableList r0 = r8.A0C
            int r0 = r0.size()
            if (r0 != r5) goto L_0x0060
            com.google.common.collect.ImmutableList r0 = r8.A0C
            java.lang.Object r3 = r0.get(r4)
            if (r3 != 0) goto L_0x0078
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x0060:
            com.google.common.collect.ImmutableList r1 = r8.A0C
            X.GBj r0 = r8.A02
            if (r0 == 0) goto L_0x0084
            int r0 = r0.A06()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x0084
            int r0 = r0.intValue()
            java.lang.Object r3 = r1.get(r0)
        L_0x0078:
            X.9JD r3 = (X.AnonymousClass9JD) r3
            goto L_0x002f
        L_0x007b:
            X.GMD r0 = r8.A0D
            if (r0 == 0) goto L_0x0089
            X.9JD r3 = r0.A02(r7)
            goto L_0x002f
        L_0x0084:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x0089:
            X.0qQ.A0F(r3)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0091:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66906Mep.A00(X.Mep):X.9JD");
    }

    public final void A0G() {
        A0E();
        C66907Meq meq = this.A0M;
        if (meq != null) {
            C66907Meq.A00(meq);
            OZT ozt = meq.A03;
            if (ozt != null) {
                ozt.A02(false);
            }
        }
    }

    public final void DW8(int i, int i2) {
        A04(i);
        A05(this);
        A0D();
        A03();
    }

    public final void onDestroyView() {
        super.onDestroyView();
        A0D();
        this.A05 = null;
        this.A0E = null;
        this.A03 = null;
        this.A01 = null;
        this.A00 = null;
        this.A0F = null;
        if (this.A08) {
            UserSession userSession = this.A0J;
            AnonymousClass4DU r0 = this.A0L;
            0wc A012 = AnonymousClass0kN.A01(r0, userSession);
            C66908Mer.A00(userSession);
            C71040OaD.A01(A012, r0.getModuleName(), this.A0I.A0A, "direct_reply_bar_tap");
        }
        AnonymousClass3E6 r02 = this.A0T;
        r02.onStop();
        r02.EEH(this);
    }
}

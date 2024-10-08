package X;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.Shape;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.perf.constants.ThreadFetchReason;
import com.instagram.direct.request.response.GroupLinkPreviewResponse$Success;
import com.instagram.reels.interactive.view.AvatarView;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.io.Serializable;

public final class NKN extends AnonymousClass4DH implements C273414mX {
    public static final String __redex_internal_original_name = "GroupPreviewFragment";
    public ViewGroup A00;
    public IgTextView A01;
    public IgTextView A02;
    public IgTextView A03;
    public IgTextView A04;
    public IgTextView A05;
    public IgTextView A06;
    public IgTextView A07;
    public IgTextView A08;
    public IgImageView A09;
    public IgImageView A0A;
    public C69318NjJ A0B = C69318NjJ.UNSPECIFIED;
    public C74469PvP A0C;
    public GroupLinkPreviewResponse$Success A0D;
    public AvatarView A0E;
    public AvatarView A0F;
    public ProgressButton A0G;
    public SpinnerImageView A0H;
    public boolean A0I;
    public boolean A0J;
    public IgFrameLayout A0K;
    public C62320sa A0L;
    public final AnonymousClass0eM A0M = C73899Pla.A00(this, 30);
    public final AnonymousClass0eM A0N = C227642jf.A02(this);
    public final AnonymousClass0eM A0O = DbS.A0I(new C73899Pla(this, 32), new C73899Pla(this, 33), new C73916Plr(1, (Object) null, this), DbS.A0z(C67749Mu2.class));

    public final String getModuleName() {
        return "GroupLinkPreview";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        AnonymousClass2uJ.A04(requireActivity(), DbV.A05(this).getColor(R.color.igds_transparent_navigation_bar, requireActivity().getTheme()));
        super.onViewCreated(view, bundle);
        this.A0J = AnonymousClass7TF.A1V(requireArguments().getString("GroupPreviewFragment.STORY_ID_KEY"));
        IgFrameLayout igFrameLayout = (IgFrameLayout) view;
        this.A0K = igFrameLayout;
        String str = "rootViewGroup";
        if (igFrameLayout != null) {
            this.A00 = (ViewGroup) DbV.A0T(igFrameLayout, R.id.group_preview_sheet_content_stub, false).getView();
            IgFrameLayout igFrameLayout2 = this.A0K;
            if (igFrameLayout2 != null) {
                this.A0H = (SpinnerImageView) igFrameLayout2.requireViewById(R.id.group_preview_spinner);
                ViewGroup viewGroup = this.A00;
                str = "contentViewGroup";
                if (viewGroup != null) {
                    this.A0F = (AvatarView) viewGroup.requireViewById(R.id.profile_photos);
                    ViewGroup viewGroup2 = this.A00;
                    if (viewGroup2 != null) {
                        this.A09 = DbT.A0b(viewGroup2, R.id.custom_profile_photo);
                        ViewGroup viewGroup3 = this.A00;
                        if (viewGroup3 != null) {
                            IgImageView A0b = DbT.A0b(viewGroup3, R.id.subscriber_badge);
                            DbU.A13(requireContext(), A0b, R.drawable.instagram_icons_exceptions_illo_subscriber_crown2_filled_68);
                            this.A0A = A0b;
                            ViewGroup viewGroup4 = this.A00;
                            if (viewGroup4 != null) {
                                this.A0E = (AvatarView) viewGroup4.requireViewById(R.id.avatar);
                                ViewGroup viewGroup5 = this.A00;
                                if (viewGroup5 != null) {
                                    this.A08 = DbT.A0a(viewGroup5, R.id.title);
                                    ViewGroup viewGroup6 = this.A00;
                                    if (viewGroup6 != null) {
                                        this.A07 = DbT.A0a(viewGroup6, R.id.member_count);
                                        ViewGroup viewGroup7 = this.A00;
                                        if (viewGroup7 != null) {
                                            IgTextView A0a = DbT.A0a(viewGroup7, R.id.connected_text);
                                            A0a.setVisibility(0);
                                            this.A02 = A0a;
                                            ViewGroup viewGroup8 = this.A00;
                                            if (viewGroup8 != null) {
                                                this.A05 = DbT.A0a(viewGroup8, R.id.group_author_disclaimer);
                                                ViewGroup viewGroup9 = this.A00;
                                                if (viewGroup9 != null) {
                                                    this.A01 = DbT.A0a(viewGroup9, R.id.conected_text_enhanced);
                                                    ViewGroup viewGroup10 = this.A00;
                                                    if (viewGroup10 != null) {
                                                        IgTextView A0a2 = DbT.A0a(viewGroup10, R.id.join_explainer_text);
                                                        A0a2.setVisibility(0);
                                                        this.A04 = A0a2;
                                                        ViewGroup viewGroup11 = this.A00;
                                                        if (viewGroup11 != null) {
                                                            this.A06 = DbT.A0a(viewGroup11, R.id.linkified_join_explainer_text);
                                                            ViewGroup viewGroup12 = this.A00;
                                                            if (viewGroup12 != null) {
                                                                ProgressButton progressButton = (ProgressButton) viewGroup12.requireViewById(R.id.join_chat_button);
                                                                C242553Us r1 = new C242553Us();
                                                                r1.A06(0nA.A04(requireContext(), 8));
                                                                C328047Df r10 = new C328047Df(r1, 126);
                                                                ShapeDrawable shapeDrawable = new ShapeDrawable(r10);
                                                                Resources.Theme theme = requireActivity().getTheme();
                                                                int color = DbV.A05(this).getColor(2Yu.A0D(getContext()), theme);
                                                                Shape shape = shapeDrawable.getShape();
                                                                Paint.Style style = Paint.Style.FILL;
                                                                C308486Ul.A02(style, shapeDrawable, shape, 0.0f, color);
                                                                ShapeDrawable shapeDrawable2 = new ShapeDrawable(r10);
                                                                C308486Ul.A02(style, shapeDrawable2, shapeDrawable2.getShape(), 0.0f, DbV.A05(this).getColor(R.color.blue_5_30_transparent, theme));
                                                                StateListDrawable stateListDrawable = new StateListDrawable();
                                                                stateListDrawable.addState(new int[]{-16842910}, shapeDrawable2);
                                                                stateListDrawable.addState(new int[0], shapeDrawable);
                                                                progressButton.setBackground(stateListDrawable);
                                                                progressButton.setEnabled(false);
                                                                C71395Oju.A00(progressButton, 31, this);
                                                                this.A0G = progressButton;
                                                                ViewGroup viewGroup13 = this.A00;
                                                                if (viewGroup13 != null) {
                                                                    IgTextView A0a3 = DbT.A0a(viewGroup13, R.id.decline_invite_button);
                                                                    A0a3.setVisibility(8);
                                                                    C71395Oju.A00(A0a3, 32, this);
                                                                    this.A03 = A0a3;
                                                                    if (this.A0B == C69318NjJ.NOTE_CHAT) {
                                                                        C66582MXn.A0S(this.A0N).A0A(C69467NmB.SEEN, "");
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A00(Activity activity, NKN nkn, ThreadFetchReason threadFetchReason, String str) {
        if (activity != null && str != null) {
            C71129OdS.A04(AnonymousClass7TE.A0l(nkn.A0N), threadFetchReason, new C72667PEx(activity, nkn, str), str, false);
        }
    }

    public final void Cyc() {
        C74469PvP pvP = this.A0C;
        if (pvP != null) {
            pvP.Cye(this.A0I);
        }
        C69318NjJ njJ = this.A0B;
        if (njJ != C69318NjJ.DIRECT_SEARCH && njJ != C69318NjJ.NOTIFICATION && njJ != C69318NjJ.NOTE_CHAT && !C69318NjJ.A00.A00(njJ)) {
            C62320sa r0 = this.A0L;
            if (r0 != null) {
                r0.invoke();
            }
            this.A0L = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        if (r9 != false) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Cyf() {
        /*
            r10 = this;
            X.0eM r0 = r10.A0O
            java.lang.Object r0 = r0.getValue()
            X.Mu2 r0 = (X.C67749Mu2) r0
            X.OLv r2 = r0.A04
            if (r2 == 0) goto L_0x0096
            boolean r0 = r2 instanceof X.C68750NVk
            if (r0 != 0) goto L_0x0096
            boolean r0 = r2 instanceof X.C68749NVj
            if (r0 != 0) goto L_0x0096
            boolean r0 = r2 instanceof X.C68748NVi
            if (r0 != 0) goto L_0x0096
            X.NVl r2 = (X.C68751NVl) r2
            boolean r0 = r2.A0A
            if (r0 == 0) goto L_0x00bc
            com.instagram.common.session.UserSession r0 = r2.A00
            X.17i r1 = X.17h.A00(r0)
            com.instagram.direct.request.response.GroupLinkPreviewResponse$Success r4 = r2.A05
            java.lang.Long r3 = r4.A04
            java.lang.String r0 = java.lang.String.valueOf(r3)
            com.instagram.user.model.User r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x00b9
            X.17M r1 = r0.A02
        L_0x0034:
            X.17M r0 = X.17M.A06
            boolean r9 = X.AnonymousClass7TF.A1W(r1, r0)
            X.0eM r0 = r2.A07
            X.6gx r8 = X.DbZ.A0R(r0)
            com.instagram.direct.request.response.GroupLinkPreviewResponse$BroadcastThreadGroupLinkPreviewInfo r0 = r2.A04
            if (r0 == 0) goto L_0x00b7
            int r6 = r0.A00
        L_0x0046:
            X.NjJ r7 = r2.A01
            java.lang.String r5 = r4.A0A
            java.lang.String r4 = java.lang.String.valueOf(r3)
            r0 = 3
            X.0qQ.A0B(r4, r0)
            X.1Ln r3 = X.DbT.A0J(r8)
            r0 = 2
            if (r6 != r0) goto L_0x005c
            r1 = 1
            if (r9 == 0) goto L_0x005d
        L_0x005c:
            r1 = 0
        L_0x005d:
            boolean r0 = X.DbT.A1Y(r3)
            if (r0 == 0) goto L_0x0096
            if (r1 == 0) goto L_0x0096
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()
            java.lang.String r0 = "creator_igid"
            r2.put(r0, r4)
            java.lang.String r1 = X.C313756gx.A01(r7)
            if (r1 == 0) goto L_0x0079
            java.lang.String r0 = "entrypoint"
            r2.put(r0, r1)
        L_0x0079:
            X.DbW.A17(r3, r8)
            java.lang.String r0 = "not_subscribe_to_creator"
            X.DbV.A1M(r3, r0)
            java.lang.String r0 = "subscribe_to_join_chat_sheet"
            r3.A0p(r0)
            java.lang.String r0 = X.C313756gx.A02(r7)
            X.DbZ.A1L(r3, r0, r6)
            r3.A0s(r5)
            r3.A0w(r2)
            r3.Cgf()
        L_0x0096:
            X.NjJ r1 = r10.A0B
            X.NjJ r0 = X.C69318NjJ.DIRECT_SEARCH
            if (r1 != r0) goto L_0x00a7
            boolean r0 = r10.A0I
            if (r0 == 0) goto L_0x00a7
            X.PvP r0 = r10.A0C
            if (r0 == 0) goto L_0x00a7
            r0.DTc()
        L_0x00a7:
            androidx.fragment.app.FragmentActivity r2 = r10.getActivity()
            if (r2 == 0) goto L_0x00b6
            r1 = 31
            X.Pla r0 = new X.Pla
            r0.<init>(r2, r1)
            r10.A0L = r0
        L_0x00b6:
            return
        L_0x00b7:
            r6 = 1
            goto L_0x0046
        L_0x00b9:
            r1 = 0
            goto L_0x0034
        L_0x00bc:
            com.instagram.direct.request.response.GroupLinkPreviewResponse$Success r7 = r2.A05
            boolean r0 = r7.A0D
            if (r0 != 0) goto L_0x0096
            com.instagram.common.session.UserSession r6 = r2.A00
            X.17i r1 = X.17h.A00(r6)
            java.lang.Long r0 = r7.A04
            java.lang.String r0 = java.lang.String.valueOf(r0)
            com.instagram.user.model.User r5 = r1.A02(r0)
            if (r5 == 0) goto L_0x0096
            X.0eM r0 = r2.A07
            X.6gx r4 = X.DbZ.A0R(r0)
            com.instagram.direct.request.response.GroupLinkPreviewResponse$BroadcastThreadGroupLinkPreviewInfo r0 = r2.A04
            if (r0 == 0) goto L_0x00f0
            int r3 = r0.A00
        L_0x00e0:
            X.NjJ r2 = r2.A01
            java.lang.String r1 = r7.A0A
            X.2f1 r0 = X.AnonymousClass2f1.A00(r6)
            boolean r0 = r0.A0Q(r5)
            r4.A0G(r2, r1, r3, r0)
            goto L_0x0096
        L_0x00f0:
            r3 = 1
            goto L_0x00e0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NKN.Cyf():void");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0N);
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [X.07Z, X.NKN, androidx.fragment.app.Fragment, java.lang.Object] */
    public final void afterOnViewCreated() {
        N49 n49;
        N49 n492;
        N49 n493;
        DbW.A0E(this).A00(new C73568Pfp(this, (AnonymousClass4D7) null, 25));
        DbW.A0E(this).A00(new C73565Pfm(this, (AnonymousClass4D7) null, 15));
        DbW.A0E(this).A00(new C73565Pfm(this, (AnonymousClass4D7) null, 16));
        C67749Mu2 mu2 = (C67749Mu2) this.A0O.getValue();
        Bundle requireArguments = requireArguments();
        GroupLinkPreviewResponse$Success groupLinkPreviewResponse$Success = this.A0D;
        Serializable serializable = requireArguments.getSerializable("GroupPreviewFragment.JOINING_SURFACE");
        0qQ.A0C(serializable, "null cannot be cast to non-null type com.instagram.direct.channels.joinsurface.JoiningSurface");
        mu2.A03 = (C69318NjJ) serializable;
        mu2.A05 = requireArguments.getString("GroupPreviewFragment.INVITE_LINK_SOURCE_KEY");
        String string = requireArguments.getString("GroupPreviewFragment.GROUP_LINK_HASH");
        if (string != null) {
            n49 = new N49(string, mu2.A05, 32);
        } else {
            n49 = null;
        }
        mu2.A00 = n49;
        String string2 = requireArguments.getString("GroupPreviewFragment.STORY_ID_KEY");
        if (string2 != null) {
            n492 = new N49(string2, requireArguments.getString("GroupPreviewFragment.CHAT_STICKER_CHANNEL_TYPE"), 34);
        } else {
            n492 = null;
        }
        mu2.A02 = n492;
        mu2.A06 = requireArguments.getString("GroupPreviewFragment.NOTE_ID");
        String string3 = requireArguments.getString("GroupPreviewFragment.PINNED_SSC_THREAD_ID");
        if (string3 != null) {
            n493 = new N49(string3, JTP.A0m(requireArguments, "GroupPreviewFragment.FAN_CLUB_ID"), 33);
        } else {
            n493 = null;
        }
        mu2.A01 = n493;
        C69064Ne1 ne1 = mu2.A09;
        N49 n494 = mu2.A00;
        N49 n495 = mu2.A02;
        String str = mu2.A06;
        ne1.A01.FIG(C68757NVs.A00);
        AnonymousClass7TE.A1Z(new MGR(n494, n495, n493, ne1, groupLinkPreviewResponse$Success, str, (AnonymousClass4D7) null), ne1.A01);
        mu2.A07 = requireArguments.getString("GroupPreviewFragment.SC_INVITE_ID");
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-95147176);
        NKN.super.onCreate(bundle);
        Serializable serializable = requireArguments().getSerializable("GroupPreviewFragment.JOINING_SURFACE");
        0qQ.A0C(serializable, "null cannot be cast to non-null type com.instagram.direct.channels.joinsurface.JoiningSurface");
        this.A0B = (C69318NjJ) serializable;
        AnonymousClass0fD.A09(-2022830603, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(712673213);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.group_preview_sheet, viewGroup, false);
        0qQ.A0C(inflate, C273654mx.A00(25));
        AnonymousClass0fD.A09(1839829510, A022);
        return inflate;
    }
}

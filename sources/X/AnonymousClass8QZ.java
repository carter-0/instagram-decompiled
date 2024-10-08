package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Adapter;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.ui.widget.stackedavatar.StackedAvatarView;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;

/* renamed from: X.8QZ  reason: invalid class name */
public final class AnonymousClass8QZ implements AnonymousClass8QO, C252203oj, C355448Qa {
    public int A00;
    public int A01;
    public int A02;
    public View A03;
    public View A04;
    public SwitchCompat A05;
    public C355488Qe A06;
    public IgdsMediaButton A07;
    public AnonymousClass5Gv A08;
    public ComposerAutoCompleteTextView A09;
    public Integer A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final int A0E;
    public final int A0F;
    public final Context A0G;
    public final PaintDrawable A0H;
    public final View A0I;
    public final View A0J;
    public final C355568Qm A0K;
    public final RecyclerView A0L;
    public final AnonymousClass3AR A0M;
    public final AnonymousClass0iw A0N;
    public final UserSession A0O;
    public final TouchInterceptorFrameLayout A0P;
    public final C252063oV A0Q;
    public final C328787Gf A0R;
    public final C355598Qp A0S;
    public final AnonymousClass8QW A0T;
    public final AnonymousClass7SL A0U;
    public final AnonymousClass0eM A0V;
    public final AnonymousClass0eM A0W;
    public final AnonymousClass0eM A0X;
    public final AnonymousClass0eM A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final int A0c;
    public final View A0d;
    public final LinearLayoutManager A0e;
    public final C252063oV A0f;
    public final C355458Qb A0g;
    public final C355528Qi A0h;
    public final C355468Qc A0i;
    public final C62320sa A0j;
    public final C62320sa A0k;
    public final boolean A0l;
    public final boolean A0m;

    public final void DM7(C380599Yu r6) {
        AnonymousClass5Gv r2 = this.A08;
        if (r2 != null && r2.A09()) {
            r2.A08(false);
        }
        int i = this.A00;
        if (i == 2 || i == 3 || i == 5) {
            if (!this.A0D) {
                A05(this, r6.getLayoutPosition());
                int layoutPosition = r6.getLayoutPosition();
                this.A01 = layoutPosition;
                this.A02 = layoutPosition;
                this.A0K.A07(r6);
                29Z r3 = 27p.A01(this.A0O).A0F;
                0wc r22 = r3.A01;
                0Aj A002 = r22.A00(r22.A00, "ig_camera_ui_tool_click");
                if (A002.isSampled()) {
                    A002.A8M(AnonymousClass80P.SELECT_SEGMENT, "tool_type");
                    A002.AAJ("legacy_falco_event_name", "IG_CAMERA_CLIPS_EDIT_SELECT_SEGMENT_TAP");
                    AnonymousClass283 r4 = r3.A04;
                    String str = r4.A0L;
                    if (str == null) {
                        str = "";
                    }
                    A002.AAJ("camera_session_id", str);
                    A002.A8M(r4.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                    A002.A8k("event_type", 2);
                    A002.A8M(r4.A0C, "surface");
                    A002.A8M(28t.A06, "media_type");
                    A002.AAJ("module", 27x.A09.getModuleName());
                    A002.A8M(r3.A0J(), "camera_destination");
                    A002.A8M(r3.A0I(), "capture_type");
                    A002.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
                    A002.AAK(2AL.A07(r3.A00, r3.A03), "system_info");
                    A002.Cgf();
                }
            }
            A07(r6, r6.getLayoutPosition());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0079 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:3:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DMZ(java.util.List r9) {
        /*
            r8 = this;
            r6 = 0
            X.0qQ.A0B(r9, r6)
            X.8Qp r0 = r8.A0S
            r0.notifyDataSetChanged()
            int r0 = r9.size()
            java.util.ListIterator r2 = r9.listIterator(r0)
        L_0x0011:
            boolean r0 = r2.hasPrevious()
            r3 = -1
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r2.previous()
            X.9SZ r0 = (X.AnonymousClass9SZ) r0
            com.instagram.common.gallery.model.GalleryItem r1 = r0.A01
            boolean r0 = r1.A06()
            if (r0 != 0) goto L_0x0030
            boolean r0 = r1.A03()
            if (r0 != 0) goto L_0x0030
            com.instagram.common.typedurl.ImageUrl r0 = r1.A06
            if (r0 == 0) goto L_0x0011
        L_0x0030:
            int r2 = r2.nextIndex()
        L_0x0034:
            r7 = 0
            androidx.recyclerview.widget.RecyclerView r0 = r8.A0L
            if (r2 != r3) goto L_0x0075
            r0.A0o(r6)
        L_0x003c:
            X.8QW r1 = r8.A0T
            boolean r0 = r1.getCanHaveEmptySegments()
            r5 = 1
            if (r0 == 0) goto L_0x007b
            if (r2 == r3) goto L_0x0048
            r7 = 1
        L_0x0048:
            X.0eM r4 = r8.A0Y
            java.lang.Object r0 = r4.getValue()
            X.2cs r0 = (X.2cs) r0
            double r2 = r0.A01
            boolean r0 = r1.Cdb()
            if (r0 == 0) goto L_0x0084
            if (r7 == 0) goto L_0x0071
            r8.A08(r6)
        L_0x005d:
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r0 = r8.A0P
            android.view.View[] r1 = new android.view.View[]{r0}
            r0 = 0
            X.C294975nL.A04(r0, r1, r6)
            java.lang.Object r0 = r4.getValue()
            X.2cs r0 = (X.2cs) r0
            r0.A08(r2, r5)
            return
        L_0x0071:
            r8.A08(r5)
            goto L_0x005d
        L_0x0075:
            r0.A0p(r2)
            goto L_0x003c
        L_0x0079:
            r2 = -1
            goto L_0x0034
        L_0x007b:
            boolean r0 = r9.isEmpty()
            r7 = r0 ^ 1
            boolean r6 = r8.A0l
            goto L_0x0087
        L_0x0084:
            r8.A08(r6)
        L_0x0087:
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r0 = r8.A0P
            android.view.View[] r1 = new android.view.View[]{r0}
            if (r7 == 0) goto L_0x0094
            r0 = 0
            X.C294975nL.A04(r0, r1, r6)
            return
        L_0x0094:
            X.C294975nL.A05(r1, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8QZ.DMZ(java.util.List):void");
    }

    public final void DmB(2cs r1) {
    }

    public final void DmC(2cs r1) {
    }

    public final void DmD(2cs r1) {
    }

    public final void DmE(2cs r5) {
        0qQ.A0B(r5, 0);
        float f = (float) r5.A09.A00;
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A0P;
        touchInterceptorFrameLayout.setTranslationY((1.0f - f) * ((float) touchInterceptorFrameLayout.getHeight()));
        touchInterceptorFrameLayout.setAlpha(f);
    }

    private final void A00() {
        Integer num;
        String str;
        C355598Qp r7 = this.A0S;
        boolean z = true;
        if (r7.getItemCount() > 1 && ((this.A0A != (num = AnonymousClass05K.A00) || r7.getItemCount() <= this.A0F) && this.A0T.EtH())) {
            UserSession userSession = this.A0O;
            0Tu r9 = 0Tu.A05;
            if (182.A06(r9, userSession, 36328233548921954L)) {
                if (this.A05 == null) {
                    C252063oV r2 = this.A0Q;
                    this.A05 = (SwitchCompat) r2.getView().requireViewById(R.id.destination_switch);
                    IgTextView requireViewById = r2.getView().requireViewById(R.id.carousel_switch_selection);
                    0qQ.A07(requireViewById);
                    IgTextView igTextView = requireViewById;
                    IgTextView requireViewById2 = r2.getView().requireViewById(R.id.reel_switch_selection);
                    0qQ.A07(requireViewById2);
                    IgTextView igTextView2 = requireViewById2;
                    if (182.A06(r9, userSession, 36328233548987491L)) {
                        Context context = this.A0G;
                        igTextView.setText(context.getString(2131962979));
                        igTextView2.setText(context.getString(2131962981));
                    }
                    igTextView2.setActivated(true);
                    igTextView.setActivated(false);
                    SwitchCompat switchCompat = this.A05;
                    str = "typeSelectorSwitch";
                    if (switchCompat != null) {
                        switchCompat.setTextOn(igTextView.getText());
                        SwitchCompat switchCompat2 = this.A05;
                        if (switchCompat2 != null) {
                            switchCompat2.setTextOff(igTextView2.getText());
                            SwitchCompat switchCompat3 = this.A05;
                            if (switchCompat3 != null) {
                                AnonymousClass0fU.A00(new AMZ(this), switchCompat3);
                                SwitchCompat switchCompat4 = this.A05;
                                if (switchCompat4 != null) {
                                    switchCompat4.setOnCheckedChangeListener(new APJ(igTextView, igTextView2, this));
                                }
                            }
                        }
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                SwitchCompat switchCompat5 = this.A05;
                str = "typeSelectorSwitch";
                if (switchCompat5 != null) {
                    if (r7.getItemCount() > this.A0F && this.A0A == num) {
                        z = false;
                    }
                    switchCompat5.setEnabled(z);
                    C252063oV r3 = this.A0Q;
                    if (r3.CFV() != 0) {
                        C697329a r5 = 27p.A01(userSession).A0G;
                        0wc r22 = r5.A01;
                        0Aj A002 = r22.A00(r22.A00, "ig_camera_ui_tool_impression");
                        if (A002.isSampled()) {
                            A002.A8M(AnonymousClass80P.CAROUSEL_CLIPS_FORMAT_SWITCHER, "tool_type");
                            String str2 = r5.A04.A0L;
                            if (str2 == null) {
                                str2 = "";
                            }
                            A002.AAJ("camera_session_id", str2);
                            A002.A8M(C279294yP.CLIPS, "camera_destination");
                            A002.A8M(C59725JVj.GALLERY, "surface");
                            A002.AAJ("module", 27x.A08.getModuleName());
                            A002.Cgf();
                        }
                    }
                    r3.setVisibility(0);
                    C355528Qi r32 = this.A0h;
                    SwitchCompat switchCompat6 = this.A05;
                    if (switchCompat6 != null) {
                        r32.A00 = switchCompat6.getHeight() + (this.A0G.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding) * 2);
                        return;
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
        }
        if (this.A05 != null) {
            this.A0Q.setVisibility(8);
            SwitchCompat switchCompat7 = this.A05;
            if (switchCompat7 != null) {
                switchCompat7.setChecked(false);
            }
            this.A0h.A00 = 0;
        }
    }

    public static final void A01(AnonymousClass8QZ r4) {
        C355488Qe r3 = r4.A06;
        if (r3 instanceof C355478Qd) {
            0qQ.A0C(r3, "null cannot be cast to non-null type com.instagram.creation.common.ui.thumbnailtray.MediaThumbnailItemDeletionAndDuplicationMenu");
            C355478Qd r32 = (C355478Qd) r3;
            boolean z = false;
            if (r4.A0R.getCount() < 10) {
                z = true;
            }
            FrameLayout frameLayout = r32.A00;
            if (frameLayout != null) {
                float f = 0.4f;
                if (z) {
                    f = 1.0f;
                }
                frameLayout.setAlpha(f);
            }
        }
    }

    public static final void A02(AnonymousClass8QZ r4) {
        boolean z;
        View view = r4.A07;
        if (view == null || !r4.A0b) {
            view = r4.A0J;
        }
        int width = view.getWidth();
        if (r4.A0T.Cdb()) {
            boolean z2 = r4.A0Z;
            AnonymousClass0eM r1 = r4.A0V;
            int visibility = ((View) r1.getValue()).getVisibility();
            if (z2) {
                if (visibility == 0) {
                    0nA.A0Y((View) r1.getValue(), width);
                }
            } else if (visibility == 0) {
                0nA.A0a((View) r1.getValue(), width);
            }
            z = true;
        } else {
            z = false;
        }
        r4.A08(z);
    }

    public static final void A03(AnonymousClass8QZ r9) {
        Context context;
        boolean booleanValue = ((Boolean) r9.A0k.invoke()).booleanValue();
        View view = r9.A0J;
        if (booleanValue) {
            Context context2 = r9.A0G;
            view.setPadding(context2.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material), 0, context2.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material), 0);
            TextView textView = (TextView) view.findViewById(R.id.media_thumbnail_tray_button_text);
            textView.setText("");
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.instagram_arrow_right_pano_filled_24, 0);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            0qQ.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(context2.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
            return;
        }
        TextView textView2 = (TextView) view.findViewById(R.id.media_thumbnail_tray_button_text);
        textView2.setText(r9.A0c);
        view.setContentDescription(textView2.getText().toString());
        textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.chevron_right, 0);
        Drawable[] compoundDrawablesRelative = textView2.getCompoundDrawablesRelative();
        Drawable drawable = compoundDrawablesRelative[0];
        if (drawable != null) {
            drawable.setAutoMirrored(true);
        }
        Drawable drawable2 = compoundDrawablesRelative[2];
        if (drawable2 != null) {
            drawable2.setAutoMirrored(true);
        }
        C355458Qb r7 = r9.A0g;
        if (r7 != null) {
            ViewStub viewStub = (ViewStub) r9.A0P.findViewById(R.id.media_thumbnail_tray_avatar_view_stub);
            0qQ.A0A(viewStub);
            View view2 = r9.A0f.getView();
            0qQ.A0B(viewStub, 0);
            ImageUrl imageUrl = null;
            textView2.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            if (view2 != null) {
                0nA.A0b(view2, view2.getPaddingStart());
            }
            viewStub.setLayoutResource(R.layout.direct_multi_media_tray_button_stacked_avatar);
            View inflate = viewStub.inflate();
            0qQ.A0C(inflate, "null cannot be cast to non-null type com.instagram.ui.widget.stackedavatar.StackedAvatarView");
            StackedAvatarView stackedAvatarView = (StackedAvatarView) inflate;
            DirectCameraViewModel directCameraViewModel = r7.A01;
            boolean z = directCameraViewModel.A07;
            if (!z || directCameraViewModel.A01 == null) {
                context = stackedAvatarView.getContext();
                stackedAvatarView.A04(context, R.dimen.abc_dialog_padding_material);
            } else {
                context = stackedAvatarView.getContext();
                stackedAvatarView.A04(context, R.dimen.abc_dialog_padding_top_material);
                stackedAvatarView.setPadding(0, 6, 0, 0);
            }
            ImageUrl imageUrl2 = directCameraViewModel.A02;
            if (z) {
                imageUrl = directCameraViewModel.A01;
            }
            stackedAvatarView.setUrls(imageUrl2, imageUrl, r7.A00);
            stackedAvatarView.setRingColor(context.getColor(2Yu.A0H(context, R.attr.igds_color_primary_button_on_media)));
        }
    }

    public static final void A04(AnonymousClass8QZ r5, int i) {
        View view = r5.A0J;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
        View view2 = r5.A07;
        if (view2 == null || !r5.A0b) {
            view2 = view;
        }
        int width = view2.getWidth();
        if (r5.A0T.getCanHaveEmptySegments()) {
            int i2 = width + dimensionPixelSize;
            View view3 = r5.A04;
            view3.setBackgroundColor(view.getContext().getColor(i));
            0nA.A0f(view3, i2);
            RecyclerView recyclerView = r5.A0L;
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            0qQ.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (r5.A0Z) {
                marginLayoutParams.setMargins(i2, 0, 0, 0);
            } else {
                marginLayoutParams.setMargins(0, 0, i2, 0);
            }
            recyclerView.setLayoutParams(marginLayoutParams);
            return;
        }
        AnonymousClass9XP r1 = new AnonymousClass9XP(r5, view.getContext().getColor(R.color.black_25_transparent));
        PaintDrawable paintDrawable = r5.A0H;
        paintDrawable.setShaderFactory(r1);
        View view4 = r5.A04;
        view4.setBackground(paintDrawable);
        0nA.A0f(view4, width + dimensionPixelSize + r5.A0E);
    }

    public static final void A05(AnonymousClass8QZ r4, int i) {
        int Brp;
        int i2 = r4.A00;
        if ((i2 == 1 || i2 == 3 || i2 == 4 || i2 == 5) && i >= 0) {
            C328787Gf r3 = r4.A0R;
            if (i < r3.getCount() && i != (Brp = r3.Brp())) {
                C355598Qp r2 = r4.A0S;
                r2.notifyItemChanged(Brp);
                LinearLayoutManager linearLayoutManager = r4.A0e;
                if (i < linearLayoutManager.A1a() || i > linearLayoutManager.A1b()) {
                    r2.notifyItemChanged(i);
                } else {
                    C380599Yu r0 = (C380599Yu) r4.A0L.A0X(i, false);
                    if (r0 != null) {
                        boolean z = r4.A0m;
                        r0.A06 = z;
                        r0.A0A.setStrokeEnabled(z);
                    }
                }
                r3.Eje(i);
            }
        }
    }

    public static final void A06(AnonymousClass8QZ r5, String str, C62320sa r7) {
        View childAt = r5.A0L.getChildAt(0);
        if (childAt != null) {
            Context context = r5.A0G;
            0qQ.A0C(context, Pxd.A00(0));
            AnonymousClass5Gt r1 = new AnonymousClass5Gt((Activity) context, new C315476jx((CharSequence) str));
            r1.A06(C226262fy.ABOVE_ANCHOR);
            r1.A03(childAt);
            r1.A0A = false;
            r1.A04 = new C389289pC(r5, r7);
            AnonymousClass5Gv A002 = r1.A00();
            r5.A08 = A002;
            A002.A07(r5.A0O);
        }
    }

    private final void A07(C380599Yu r5, int i) {
        B26 ac7;
        boolean z = false;
        if (this.A00 == 5) {
            z = true;
        }
        if (this.A0R.getCount() > 1 || z) {
            if (!this.A0D) {
                ac7 = new C40435Ac6(this, z);
            } else {
                ac7 = new C40436Ac7(this, i);
            }
            A01(this);
            C355488Qe r1 = this.A06;
            View view = r5.itemView;
            0qQ.A06(view);
            r1.Etp(view, ac7, i, true);
        }
    }

    private final void A08(boolean z) {
        boolean canHaveEmptySegments = this.A0T.getCanHaveEmptySegments();
        boolean z2 = false;
        int i = 8;
        View view = (View) this.A0V.getValue();
        if (!canHaveEmptySegments && z) {
            i = 0;
        }
        view.setVisibility(i);
        View view2 = this.A0J;
        if (!z && this.A0C) {
            z2 = true;
        }
        view2.setEnabled(z2);
    }

    public final void A09(int i) {
        C355598Qp r2 = this.A0S;
        C328787Gf r1 = this.A0R;
        r2.notifyItemChanged(r1.Brp());
        r1.Eje(i);
        r2.notifyItemChanged(i);
    }

    public final void A0A(boolean z) {
        2cs r1 = (2cs) this.A0Y.getValue();
        if (z) {
            r1.A06(0.0d);
        } else {
            r1.A08(0.0d, true);
        }
    }

    public final void A0C(boolean z, boolean z2) {
        View[] viewArr = {this.A0P};
        if (z) {
            C294975nL.A04((C295005nO) null, viewArr, z2);
        } else {
            C294975nL.A05(viewArr, z2);
        }
    }

    public final void DLn(AnonymousClass9SZ r4, int i) {
        if (((View) this.A0V.getValue()).getVisibility() == 0) {
            A08(false);
        }
        C355598Qp r2 = this.A0S;
        if (r2.getItemCount() == 1) {
            A0C(true, true);
            r2.notifyDataSetChanged();
        } else {
            r2.notifyItemInserted(i);
        }
        A00();
        this.A0B = true;
        this.A0L.postOnAnimation(new C40861AkV(this));
    }

    public final void DMA(int i, int i2) {
        C355598Qp r2 = this.A0S;
        r2.notifyItemMoved(i, i2);
        int i3 = i;
        if (i > i2) {
            i3 = i2;
        }
        r2.notifyItemRangeChanged(i3, Math.abs(i - i2) + 1);
        this.A02 = i2;
    }

    public final void DMJ(AnonymousClass9SZ r4, int i) {
        int Brp;
        C355598Qp r2 = this.A0S;
        if (r2.getItemCount() == 0) {
            if (this.A0T.Cdb()) {
                A08(true);
                r2.notifyItemRemoved(i);
            } else {
                C294975nL.A05(new View[]{this.A0P}, true);
            }
            r2.notifyItemRemoved(i);
            return;
        }
        r2.notifyItemRemoved(i);
        A00();
        RecyclerView recyclerView = this.A0L;
        if (recyclerView.computeHorizontalScrollRange() > recyclerView.computeHorizontalScrollExtent() && (Brp = this.A0R.Brp()) >= 0) {
            recyclerView.A0o(Brp);
        }
    }

    public final void DMM(AnonymousClass9SZ r4, int i) {
        RecyclerView recyclerView = this.A0L;
        if (recyclerView.computeHorizontalScrollRange() > recyclerView.computeHorizontalScrollExtent()) {
            recyclerView.A0o(i);
        }
    }

    public final void A0B(boolean z) {
        A00();
        this.A0J.setEnabled(true);
        IgdsMediaButton igdsMediaButton = this.A07;
        if (igdsMediaButton != null) {
            igdsMediaButton.setEnabled(true);
        }
        2cs r0 = (2cs) this.A0Y.getValue();
        if (z) {
            r0.A06(1.0d);
        } else {
            r0.A08(1.0d, true);
        }
        View view = this.A0d;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        if (r2 == r3.A0R.Brp()) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DMP(X.C380599Yu r4) {
        /*
            r3 = this;
            int r2 = r4.getLayoutPosition()
            int r1 = r3.A00
            r0 = 1
            if (r1 == r0) goto L_0x003e
            r0 = 2
            if (r1 == r0) goto L_0x002c
            r0 = 3
            if (r1 == r0) goto L_0x0024
            r0 = 4
            if (r1 != r0) goto L_0x0023
            X.7Gf r1 = r3.A0R
            int r0 = r1.Brp()
            if (r2 != r0) goto L_0x003e
            r0 = -1
            r1.Eje(r0)
            X.8Qp r0 = r3.A0S
            r0.notifyItemChanged(r2)
        L_0x0023:
            return
        L_0x0024:
            X.7Gf r0 = r3.A0R
            int r0 = r0.Brp()
            if (r2 != r0) goto L_0x003e
        L_0x002c:
            X.8Qe r0 = r3.A06
            boolean r0 = r0.Cc6()
            if (r0 == 0) goto L_0x003a
            X.8Qe r0 = r3.A06
            r0.CLA()
            return
        L_0x003a:
            r3.A07(r4, r2)
            return
        L_0x003e:
            A05(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8QZ.DMP(X.9Yu):void");
    }

    public final void DMW() {
        A00();
        if (this.A0T.Cdb()) {
            A02(this);
        } else {
            this.A0P.post(new C348957zM(this));
        }
        this.A0S.notifyDataSetChanged();
    }

    public AnonymousClass8QZ(Context context, View view, AnonymousClass0iw r48, UserSession userSession, TouchInterceptorFrameLayout touchInterceptorFrameLayout, C355458Qb r51, C328787Gf r52, AnonymousClass8QW r53, C355468Qc r54, AnonymousClass7SL r55, C62320sa r56, C62320sa r57, float f, int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        ViewStub viewStub;
        View inflate;
        2Er B33;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 2);
        AnonymousClass0iw r1 = r48;
        0qQ.A0B(r1, 3);
        TouchInterceptorFrameLayout touchInterceptorFrameLayout2 = touchInterceptorFrameLayout;
        0qQ.A0B(touchInterceptorFrameLayout2, 4);
        C328787Gf r33 = r52;
        0qQ.A0B(r33, 5);
        AnonymousClass8QW r2 = r53;
        0qQ.A0B(r2, 8);
        Context context2 = context;
        this.A0G = context2;
        this.A0O = userSession2;
        this.A0N = r1;
        this.A0P = touchInterceptorFrameLayout2;
        this.A0R = r33;
        this.A0c = i;
        this.A0T = r2;
        this.A0g = r51;
        boolean z7 = z2;
        this.A0m = z7;
        this.A0a = z3;
        this.A0b = z4;
        this.A0U = r55;
        this.A0I = view;
        this.A0k = r56;
        this.A0i = r54;
        this.A0l = z6;
        C62320sa r3 = r57;
        this.A0j = r3;
        C252063oV A012 = 2b1.A01(touchInterceptorFrameLayout2.findViewById(R.id.media_thumbnail_tray_text_button_stub), false, false);
        this.A0f = A012;
        View view2 = A012.getView();
        if (view2 == null) {
            view2 = touchInterceptorFrameLayout2.requireViewById(R.id.media_thumbnail_tray_button);
            0qQ.A07(view2);
        }
        this.A0J = view2;
        View findViewById = touchInterceptorFrameLayout2.findViewById(R.id.media_thumbnail_tray_save_button);
        this.A0d = findViewById;
        0t0 A013 = AnonymousClass0eN.A01(new AnonymousClass9L5(this, 8));
        this.A0W = A013;
        int i7 = i3;
        C355528Qi r14 = new C355528Qi(r1, r33, (C355478Qd) A013.getValue(), this, i7);
        this.A0h = r14;
        C355568Qm r142 = new C355568Qm(r14);
        this.A0K = r142;
        int i8 = i4;
        C355598Qp r27 = new C355598Qp(context2, (Adapter) null, r142, r1, userSession2, r33, this, this, (C329077Hm) null, (Integer) null, (Integer) null, r3, f, i7, i8, i8, z7);
        this.A0S = r27;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context2, 0, false);
        this.A0e = linearLayoutManager;
        AnonymousClass3AQ r10 = new AnonymousClass3AQ();
        r10.A00 = false;
        this.A0M = r10;
        View requireViewById = touchInterceptorFrameLayout2.requireViewById(R.id.media_thumbnail_tray);
        RecyclerView recyclerView = (RecyclerView) requireViewById;
        recyclerView.A0S = true;
        recyclerView.setAdapter(r27);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(r10);
        recyclerView.setNestedScrollingEnabled(false);
        0qQ.A07(requireViewById);
        this.A0L = recyclerView;
        this.A0Y = AnonymousClass0eN.A01(new AnonymousClass9L5(this, 12));
        PaintDrawable paintDrawable = new PaintDrawable();
        PaintDrawable paintDrawable2 = paintDrawable;
        paintDrawable2.setPadding(new Rect());
        paintDrawable2.setShape(new RectShape());
        this.A0H = paintDrawable2;
        this.A0Z = 0mk.A02(recyclerView.getContext());
        this.A0X = AnonymousClass0eN.A01(new AnonymousClass9L5(this, 9));
        this.A0V = AnonymousClass0eN.A01(new AnonymousClass9L5(this, 7));
        View view3 = null;
        this.A0Q = 2b1.A01(touchInterceptorFrameLayout2.findViewById(R.id.media_thumbnail_tray_select_destination_switch), false, false);
        this.A0A = AnonymousClass05K.A00;
        this.A0F = (int) 182.A01(0Tu.A05, userSession2, 36604563154801731L);
        this.A01 = -1;
        this.A02 = -1;
        this.A06 = (C355478Qd) this.A0W.getValue();
        this.A0C = true;
        Resources resources = context2.getResources();
        View findViewById2 = touchInterceptorFrameLayout2.findViewById(R.id.media_thumbnail_tray_constraintlayout);
        int i9 = i5;
        if (findViewById2 != null) {
            findViewById2.setBackgroundColor(findViewById2.getContext().getColor(i9));
        }
        if (11Z.A07()) {
            r142.A0A(recyclerView);
        } else {
            recyclerView.post(new AnonymousClass9PP(this));
        }
        this.A06 = (C355478Qd) this.A0W.getValue();
        0nA.A0V(recyclerView, i7);
        View findViewById3 = touchInterceptorFrameLayout2.findViewById(R.id.media_thumbnail_tray_button_shadow);
        this.A04 = findViewById3;
        0nA.A0V(findViewById3, i7);
        this.A00 = i2;
        r10.A00 = false;
        recyclerView.A0S = true;
        recyclerView.setAdapter(r27);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(r10);
        recyclerView.setNestedScrollingEnabled(false);
        this.A0E = resources.getDimensionPixelSize(R.dimen.avatar_reel_ring_size_extra_large);
        recyclerView.A11(new C355658Qv(resources, i6));
        recyclerView.A15(new C355668Qw(this));
        r33.A91(this);
        if (z5) {
            ViewStub viewStub2 = (ViewStub) touchInterceptorFrameLayout2.findViewById(R.id.media_gallery_composer_send_stub);
            if (viewStub2 != null) {
                View inflate2 = viewStub2.inflate();
                0qQ.A0C(inflate2, "null cannot be cast to non-null type com.instagram.igds.components.mediabutton.IgdsMediaButton");
                this.A07 = (IgdsMediaButton) inflate2;
            }
            View findViewById4 = touchInterceptorFrameLayout2.findViewById(R.id.media_gallery_composer_layout);
            Context context3 = context2;
            Drawable drawable = context3.getDrawable(2Yu.A0H(context3, R.attr.messageComposerRedesignBackground));
            0qQ.A0C(drawable, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            GradientDrawable gradientDrawable = (GradientDrawable) drawable;
            gradientDrawable.setColor(-1);
            findViewById4.setBackground(gradientDrawable);
            ViewStub viewStub3 = (ViewStub) touchInterceptorFrameLayout2.findViewById(R.id.media_gallery_composer_stub);
            view3 = viewStub3 != null ? viewStub3.inflate() : view3;
            0qQ.A0C(view3, "null cannot be cast to non-null type com.instagram.ui.widget.textview.ComposerAutoCompleteTextView");
            ComposerAutoCompleteTextView composerAutoCompleteTextView = (ComposerAutoCompleteTextView) view3;
            this.A09 = composerAutoCompleteTextView;
            if (composerAutoCompleteTextView != null) {
                composerAutoCompleteTextView.setTextAppearance(R.style.InGalleryComposerTextArea);
            }
            View view4 = this.A0I;
            if (!(view4 == null || (viewStub = (ViewStub) view4.findViewById(R.id.media_gallery_composer_command_picker_container)) == null || (inflate = viewStub.inflate()) == null)) {
                inflate.bringToFront();
                this.A03 = inflate;
                View findViewById5 = inflate.findViewById(R.id.direct_command_picker_constraint_layout);
                RecyclerView recyclerView2 = (RecyclerView) inflate.findViewById(R.id.commands_list);
                0qQ.A0A(findViewById5);
                0qQ.A0A(recyclerView2);
                AnonymousClass0iw r143 = this.A0N;
                C328887Gq r13 = new C328887Gq(inflate, findViewById5, recyclerView2, r143);
                Context context4 = this.A0G;
                r13.A00(context4.getResources().getDimensionPixelSize(R.dimen.achievements_list_container_height));
                if (composerAutoCompleteTextView != null) {
                    composerAutoCompleteTextView.A01(r13);
                }
                0qQ.A0C(context4, Pxd.A00(0));
                Activity activity = (Activity) context4;
                UserSession userSession3 = this.A0O;
                C328967Gz r15 = new C328967Gz(r143, userSession3);
                MMQ mmq = new MMQ(this, 19);
                0qQ.A0B(activity, 0);
                AnonymousClass7H0 r272 = new AnonymousClass7H0(activity, r143, userSession3, r15, r13, mmq);
                AnonymousClass7SL r12 = this.A0U;
                if (r12 != null) {
                    AnonymousClass9H7 r144 = r12.A00;
                    if (!(r144.A0b == null || (B33 = 2L2.A00(r144.A10).B33(C66647MaG.A03(r144.A0b))) == null)) {
                        if (B33.CUG()) {
                            r272.A0C(B33.BRZ(), B33.A01.A2D);
                        }
                        r272.A0E.A00(AnonymousClass9H7.A01(r144).A0I(true), B33, r272.A0F, false, false);
                    }
                }
                if (composerAutoCompleteTextView != null) {
                    composerAutoCompleteTextView.A02 = 1;
                    composerAutoCompleteTextView.setSupportedLinks(C294425mQ.ALL);
                    composerAutoCompleteTextView.setAdapter(r272);
                }
                C331337Qp r102 = new C331337Qp(userSession3);
                r102.A01 = new C40500Ad9(composerAutoCompleteTextView);
                if (composerAutoCompleteTextView != null) {
                    composerAutoCompleteTextView.addTextChangedListener(r102);
                    composerAutoCompleteTextView.A01 = true;
                }
                C40499Ad8 ad8 = new C40499Ad8(this, composerAutoCompleteTextView);
                r13.A02 = ad8;
                C70822OMu oMu = r13.A01;
                if (oMu != null) {
                    oMu.A01 = ad8;
                }
                if (composerAutoCompleteTextView != null) {
                    composerAutoCompleteTextView.setOnItemClickListener(new C50125FPp(ad8));
                }
            }
            IgdsMediaButton igdsMediaButton = this.A07;
            if (igdsMediaButton != null) {
                C355678Qx.A00(igdsMediaButton, new MMQ(this, 18));
            }
        } else {
            ViewStub viewStub4 = (ViewStub) touchInterceptorFrameLayout2.findViewById(R.id.media_thumbnail_tray_send_media_button_stub);
            if (viewStub4 != null) {
                View inflate3 = viewStub4.inflate();
                0qQ.A0C(inflate3, "null cannot be cast to non-null type com.instagram.igds.components.mediabutton.IgdsMediaButton");
                IgdsMediaButton igdsMediaButton2 = (IgdsMediaButton) inflate3;
                this.A07 = igdsMediaButton2;
                if (igdsMediaButton2 != null) {
                    C355678Qx.A00(igdsMediaButton2, new AnonymousClass9L5(this, 6));
                }
                ConstraintLayout constraintLayout = (ConstraintLayout) touchInterceptorFrameLayout2.findViewById(R.id.media_thumbnail_tray_constraintlayout);
                C270354gb r103 = new C270354gb();
                r103.A0I(constraintLayout);
                r103.A0E(R.id.media_thumbnail_tray, 7, R.id.barrier, 6, 0);
                r103.A0G(constraintLayout);
            }
        }
        A03(this);
        C355678Qx.A00(view2, new AnonymousClass9L5(this, 5));
        if (findViewById != null) {
            AnonymousClass3NG r22 = new AnonymousClass3NG(findViewById);
            r22.A04 = new AnonymousClass8R0(this);
            r22.A07 = true;
            r22.A00();
        }
        if (r54 != null) {
            View findViewById6 = view2.findViewById(R.id.media_thumbnail_tray_button_text);
            0qQ.A07(findViewById6);
            TextView textView = (TextView) findViewById6;
            0qQ.A0B(textView, 1);
            Context context5 = view2.getContext();
            0qQ.A0A(context5);
            view2.setBackgroundTintList(1QE.A0B(context5, (1QG) null));
            textView.setTextColor(1QE.A0C(context5, (1QG) null));
            textView.setCompoundDrawableTintList(1QE.A0C(context5, (1QG) null));
        }
        PaintDrawable paintDrawable3 = paintDrawable;
        paintDrawable3.setPadding(new Rect());
        paintDrawable3.setShape(new RectShape());
        touchInterceptorFrameLayout2.A00(new AnonymousClass8R1(this), new AnonymousClass8R2(this));
        AnonymousClass8R3 r23 = new AnonymousClass8R3(this, i9);
        if (view2.isLaidOut()) {
            r23.run();
        } else {
            0nA.A0q(view2, r23);
        }
        if (z) {
            view2.setVisibility(8);
            this.A04.setVisibility(8);
            recyclerView.getLayoutParams().width = -1;
        }
        if (z4) {
            IgdsMediaButton igdsMediaButton3 = this.A07;
            if (igdsMediaButton3 != null) {
                this.A0J.setVisibility(8);
                igdsMediaButton3.setVisibility(0);
                igdsMediaButton3.setContentDescription(igdsMediaButton3.getContext().getString(2131960296));
                this.A04.setVisibility(8);
            }
            A04(this, i9);
        }
    }
}

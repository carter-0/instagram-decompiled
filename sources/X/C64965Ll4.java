package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.creation.capture.assetpicker.cutout.CutoutStickerCreationController$genericCutoutAiProcessorExceptionHandler$$inlined$CoroutineExceptionHandler$1;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import java.util.Set;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.Ll4  reason: case insensitive filesystem */
public final class C64965Ll4 implements MXG {
    public static final String __redex_internal_original_name = "CutoutStickerCreationController";
    public C3018260f A00;
    public ComposeView A01;
    public IgTextView A02;
    public IgTextView A03;
    public L05 A04;
    public C63932LDr A05;
    public LE0 A06;
    public IgdsMediaButton A07;
    public IgdsMediaButton A08;
    public IgdsMediaButton A09;
    public IgdsMediaButton A0A;
    public IgdsMediaButton A0B;
    public IgdsMediaButton A0C;
    public Integer A0D;
    public boolean A0E;
    public View A0F;
    public final long A0G;
    public final long A0H;
    public final Activity A0I;
    public final View A0J;
    public final ViewStub A0K;
    public final ViewStub A0L;
    public final Fragment A0M;
    public final AnonymousClass0xx A0N;
    public final AnonymousClass0iw A0O;
    public final UserSession A0P;
    public final C53037GhT A0Q;
    public final AnonymousClass8MI A0R;
    public final AnonymousClass8N2 A0S;
    public final Integer A0T;
    public final String A0U;
    public final String A0V;
    public final Set A0W;
    public final AnonymousClass0eM A0X;
    public final AnonymousClass0eM A0Y = AnonymousClass1YB.A00(new MJ0(this, 46));
    public final AnonymousClass0eM A0Z;
    public final AnonymousClass0eM A0a;
    public final AnonymousClass07g A0b;

    /* JADX WARNING: type inference failed for: r2v20, types: [java.lang.Object, X.5n1] */
    /* JADX WARNING: type inference failed for: r2v21, types: [java.lang.Object, X.5n1] */
    public final void E0h() {
        Medium medium;
        AnonymousClass0xx r3;
        CutoutStickerCreationController$genericCutoutAiProcessorExceptionHandler$$inlined$CoroutineExceptionHandler$1 cutoutStickerCreationController$genericCutoutAiProcessorExceptionHandler$$inlined$CoroutineExceptionHandler$1;
        0sL jZr;
        View view;
        this.A0R.DVK();
        L05 l05 = this.A04;
        if (l05 != null) {
            if (l05 instanceof KK0) {
                medium = ((KK0) l05).A02;
            } else {
                medium = ((C61734KJz) l05).A00;
            }
            View view2 = this.A0F;
            if (view2 == null) {
                view2 = this.A0K.inflate();
                Set set = this.A0W;
                set.clear();
                if (this.A0D == AnonymousClass05K.A15) {
                    Context context = view2.getContext();
                    DbT.A16(context, view2, 2Yu.A0H(context, R.attr.igds_color_media_background));
                }
                0qQ.A0A(view2);
                set.add(view2);
                ViewStub viewStub = this.A0L;
                if (viewStub.getParent() != null) {
                    view = viewStub.inflate();
                } else {
                    view = this.A0J;
                }
                Context A0S2 = AnonymousClass7TE.A0S(view2);
                0qQ.A0A(view);
                this.A05 = new C63932LDr(A0S2, view, (ShimmerFrameLayout) view2.requireViewById(R.id.imageview_shimmer_container));
                UserSession userSession = this.A0P;
                this.A06 = new LE0(A0S2, view, userSession);
                LY0.A00(view2.requireViewById(R.id.cutout_sticker_creation_back_button), 4, this);
                TextView A0G2 = DbU.A0G(view2, R.id.cutout_sticker_creation_title_label);
                DbT.A18(A0G2.getContext(), A0G2, 2131957314);
                AnonymousClass8N2 r7 = this.A0S;
                C61860pz A1I = JTO.A1I(new MG9(this, (AnonymousClass4D7) null, 11), 10b.A03(r7.A09));
                Fragment fragment = this.A0M;
                AnonymousClass11O.A03(AnonymousClass07a.A00(fragment), A1I);
                JTS.A11(fragment, new C66163MGa(this, (AnonymousClass4D7) null, 10), 10b.A03(r7.A0A));
                ComposeView composeView = (ComposeView) view2.requireViewById(R.id.cutout_image_compose_view);
                composeView.setViewCompositionStrategy(GTZ.A00);
                C56265HvZ.A01(composeView, userSession, this.A0U, Cs0.A00);
                this.A01 = composeView;
                IgdsMediaButton igdsMediaButton = (IgdsMediaButton) view2.requireViewById(R.id.cutout_select_sticker_button);
                Context context2 = igdsMediaButton.getContext();
                int i = 2131957302;
                if (this.A0T == AnonymousClass05K.A01) {
                    i = 2131957303;
                }
                igdsMediaButton.setLabel(context2.getString(i));
                AnonymousClass0fU.A00(new KIQ(view2, this, igdsMediaButton), igdsMediaButton);
                this.A0C = igdsMediaButton;
                IgdsMediaButton igdsMediaButton2 = (IgdsMediaButton) view2.requireViewById(R.id.cutout_sticker_next_button);
                igdsMediaButton2.setLabel(igdsMediaButton2.getContext().getString(2131957297));
                LY0.A00(igdsMediaButton2, 7, this);
                this.A07 = igdsMediaButton2;
                IgdsMediaButton igdsMediaButton3 = (IgdsMediaButton) view2.requireViewById(R.id.cutout_sticker_save_button);
                igdsMediaButton3.setLabel(igdsMediaButton3.getContext().getString(2131957294));
                LY0.A00(igdsMediaButton3, 8, this);
                this.A0A = igdsMediaButton3;
                IgdsMediaButton igdsMediaButton4 = (IgdsMediaButton) view2.requireViewById(R.id.cutout_manual_refinement_button);
                igdsMediaButton4.setLabel(igdsMediaButton4.getContext().getString(2131957301));
                AnonymousClass0fU.A00(new KIR(this, 0, 42), igdsMediaButton4);
                this.A08 = igdsMediaButton4;
                IgTextView A0a2 = DbT.A0a(view2, R.id.cutout_manual_refinement_footer);
                DbT.A18(A0a2.getContext(), A0a2, 2131957338);
                this.A02 = A0a2;
                IgTextView A0a3 = DbT.A0a(view2, R.id.create_video_sticker_footer);
                DbT.A18(A0a3.getContext(), A0a3, 2131957335);
                this.A03 = A0a3;
                IgdsMediaButton igdsMediaButton5 = (IgdsMediaButton) view2.requireViewById(R.id.cutout_undo_selection_button);
                ? obj = new Object();
                obj.A00 = R.drawable.instagram_undo_pano_outline_24;
                igdsMediaButton5.setStartAddOn(obj, igdsMediaButton5.getContext().getString(2131952147));
                LY0.A00(igdsMediaButton5, 5, this);
                this.A0B = igdsMediaButton5;
                IgdsMediaButton igdsMediaButton6 = (IgdsMediaButton) view2.requireViewById(R.id.cutout_redo_selection_button);
                ? obj2 = new Object();
                obj2.A00 = R.drawable.instagram_redo_pano_outline_24;
                igdsMediaButton6.setStartAddOn(obj2, igdsMediaButton6.getContext().getString(2131952143));
                LY0.A00(igdsMediaButton6, 6, this);
                this.A09 = igdsMediaButton6;
                JTS.A11(fragment, new C59819JZr((AnonymousClass4D7) null, (Object) this, (Object) view2, 24), r7.A0I);
                this.A0F = view2;
            }
            view2.setVisibility(0);
            this.A0E = false;
            L05 l052 = this.A04;
            if (l052 instanceof C61734KJz) {
                r3 = this.A0N;
                cutoutStickerCreationController$genericCutoutAiProcessorExceptionHandler$$inlined$CoroutineExceptionHandler$1 = new CutoutStickerCreationController$genericCutoutAiProcessorExceptionHandler$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key, this, new MJ0(this, 47));
                jZr = new C66163MGa(medium, this, (AnonymousClass4D7) null, 13);
            } else if (l052 instanceof KK0) {
                r3 = this.A0N;
                MK3 mk3 = MK3.A00;
                0qQ.A0B(mk3, 0);
                cutoutStickerCreationController$genericCutoutAiProcessorExceptionHandler$$inlined$CoroutineExceptionHandler$1 = new CutoutStickerCreationController$genericCutoutAiProcessorExceptionHandler$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key, this, mk3);
                jZr = new C59819JZr(l052, medium, this, (AnonymousClass4D7) null, 25);
            } else {
                DbT.A1Q(0wj.A01, "CutoutStickerCreationController: error during image processing: cause Invalid state: Sticker mode not set", 245701013);
                return;
            }
            1Eo.A05(cutoutStickerCreationController$genericCutoutAiProcessorExceptionHandler$$inlined$CoroutineExceptionHandler$1, jZr, r3);
        }
    }

    public static final String A00(C64965Ll4 ll4) {
        Resources resources;
        int i;
        L05 l05 = ll4.A04;
        if (l05 instanceof C61734KJz) {
            resources = ll4.A0I.getResources();
            i = 2131957298;
        } else if (!(l05 instanceof KK0) || ll4.A0S.A0F() == AnonymousClass05K.A01) {
            return "";
        } else {
            resources = ll4.A0I.getResources();
            i = 2131957299;
        }
        String string = resources.getString(i);
        0qQ.A0A(string);
        return string;
    }

    public static void A01(C64965Ll4 ll4) {
        ShimmerFrameLayout shimmerFrameLayout;
        C63932LDr lDr = ll4.A05;
        if (lDr != null && (shimmerFrameLayout = lDr.A01) != null) {
            shimmerFrameLayout.A05();
            shimmerFrameLayout.setVisibility(8);
        }
    }

    public static void A02(C64965Ll4 ll4) {
        C63932LDr lDr = ll4.A05;
        if (lDr != null) {
            AnonymousClass61R r1 = (AnonymousClass61R) lDr.A05.getValue();
            r1.pause();
            r1.EL2(0.0f);
            IgSimpleImageView igSimpleImageView = lDr.A02;
            igSimpleImageView.setVisibility(8);
            lDr.A03.setVisibility(8);
            lDr.A04.setVisibility(8);
            igSimpleImageView.setImageDrawable((Drawable) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C64965Ll4 r13) {
        /*
            X.8N2 r3 = r13.A0S
            java.lang.Integer r1 = r3.A0F()
            if (r1 == 0) goto L_0x004b
            X.0eM r0 = r13.A0X
            java.lang.Object r4 = r0.getValue()
            X.8aR r4 = (X.C358148aR) r4
            java.lang.Integer r6 = X.AnonymousClass05K.A01
            boolean r2 = X.AnonymousClass7TF.A1W(r1, r6)
            java.lang.Integer r5 = r13.A0T
            java.lang.Integer r0 = r3.A0F()
            if (r0 != r6) goto L_0x004c
            X.LGc r0 = r3.A00
            if (r0 == 0) goto L_0x004c
            java.util.List r0 = r0.A02()
            if (r0 == 0) goto L_0x004c
            int r1 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x004c
            java.lang.Long r8 = X.DbS.A0j(r1)
        L_0x0036:
            X.L05 r0 = r13.A04
            boolean r0 = r0 instanceof X.C61734KJz
            if (r0 == 0) goto L_0x003e
            java.lang.Integer r6 = X.AnonymousClass05K.A00
        L_0x003e:
            java.lang.Integer r11 = r13.A0D
            X.AnonymousClass7TG.A1P(r5, r6)
            r7 = 0
            if (r2 == 0) goto L_0x004e
            java.lang.String r9 = "use_manual_seg_sticker_button_tapped"
            X.C358148aR.A00(r4, r5, r6, r7, r8, r9)
        L_0x004b:
            return
        L_0x004c:
            r8 = 0
            goto L_0x0036
        L_0x004e:
            java.lang.String r13 = "use_auto_seg_sticker_button_tapped"
            r8 = r4
            r9 = r5
            r10 = r6
            r12 = r7
            X.C358148aR.A00(r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64965Ll4.A03(X.Ll4):void");
    }

    public final Set Acf() {
        return this.A0W;
    }

    public final boolean CII() {
        IgdsMediaButton igdsMediaButton;
        AnonymousClass0Ud r4 = this.A0S.A0I;
        if (((AnonymousClass8N5) r4.getValue()).A05 != null && ((AnonymousClass8N5) r4.getValue()).A05 != AnonymousClass05K.A0C && ((AnonymousClass8N5) r4.getValue()).A05 != AnonymousClass05K.A0u && ((AnonymousClass8N5) r4.getValue()).A05 != AnonymousClass05K.A0N && !this.A0E) {
            boolean A062 = 182.A06(0Tu.A05, this.A0P, 36323547739598079L);
            Context context = this.A0I;
            if (A062) {
                context = 2Yn.A01(context);
            }
            C358248ab A0Y2 = DbS.A0Y(context);
            A0Y2.A09(2131957308);
            A0Y2.A08(2131957304);
            A0Y2.A0K(LV3.A00(this, 34), 2131957305);
            A0Y2.A0H((DialogInterface.OnClickListener) null, 2131957306);
            IgdsMediaButton igdsMediaButton2 = this.A0C;
            if ((igdsMediaButton2 != null && igdsMediaButton2.isEnabled()) || ((igdsMediaButton = this.A0A) != null && igdsMediaButton.isEnabled())) {
                A0Y2.A0G(LV3.A00(this, 33), 2131957307);
            }
            DbT.A1V(A0Y2);
            return true;
        } else if (this.A0D == AnonymousClass05K.A1F && ((AnonymousClass8N5) r4.getValue()).A05 == AnonymousClass05K.A0N) {
            this.A0R.D7c();
            return true;
        } else {
            if (this.A04 instanceof KK0) {
                this.A0R.DDX();
            }
            Integer num = this.A0T;
            Integer A0j = JTP.A0j(this.A04 instanceof C61734KJz ? 1 : 0);
            Integer num2 = this.A0D;
            0qQ.A0B(num, 0);
            0qQ.A0B(A0j, 1);
            C358148aR.A00((C358148aR) this.A0X.getValue(), num, A0j, num2, (Long) null, "sticker_creation_quitted");
            return false;
        }
    }

    public final void Cw3() {
        this.A0R.D4A();
    }

    public final void Dfq() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r2 = r4.A0S;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
            r4 = this;
            X.L05 r0 = r4.A04
            boolean r0 = r0 instanceof X.C61734KJz
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0020
            X.8N2 r2 = r4.A0S
            X.4Co r0 = r2.A03
            if (r0 == 0) goto L_0x0015
            r1 = 1
            boolean r0 = r0.CQL()
            if (r0 != r1) goto L_0x0020
        L_0x0015:
            X.0eM r0 = r2.A0F
            java.lang.Object r0 = r0.getValue()
            com.instagram.creation.capture.assetpicker.cutout.data.CutoutStickerRepository r0 = (com.instagram.creation.capture.assetpicker.cutout.data.CutoutStickerRepository) r0
            r0.A01()
        L_0x0020:
            r0 = 0
            r4.A04 = r0
            A02(r4)
            A01(r4)
            X.LE0 r0 = r4.A06
            if (r0 == 0) goto L_0x0030
            r0.A00()
        L_0x0030:
            android.view.View r0 = r4.A0F
            X.AnonymousClass7TH.A0R(r0)
            androidx.compose.ui.platform.ComposeView r3 = r4.A01
            if (r3 == 0) goto L_0x0042
            java.lang.String r2 = r4.A0U
            com.instagram.common.session.UserSession r1 = r4.A0P
            X.0sL r0 = X.Cs0.A01
            X.C56265HvZ.A01(r3, r1, r2, r0)
        L_0x0042:
            X.8N2 r0 = r4.A0S
            r0.A0G()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64965Ll4.close():void");
    }

    public final String getModuleName() {
        return this.A0U;
    }

    public final /* synthetic */ boolean isScrolledToBottom() {
        return false;
    }

    public final /* synthetic */ boolean isScrolledToTop() {
        return false;
    }

    public C64965Ll4(Activity activity, View view, ViewStub viewStub, ViewStub viewStub2, Fragment fragment, AnonymousClass07g r9, AnonymousClass0iw r10, UserSession userSession, AnonymousClass8MI r12, Integer num, Integer num2, String str) {
        AnonymousClass8N1 r0;
        2YN A0L2;
        C51972G9s.A1D(viewStub, viewStub2);
        C51969G9p.A1O(userSession, 6, num2);
        this.A0M = fragment;
        this.A0b = r9;
        this.A0K = viewStub;
        this.A0L = viewStub2;
        this.A0J = view;
        this.A0P = userSession;
        this.A0O = r10;
        this.A0R = r12;
        this.A0I = activity;
        this.A0V = str;
        this.A0T = num;
        this.A0D = num2;
        0h9 r02 = fragment.mLifecycleRegistry;
        0qQ.A07(r02);
        this.A0N = C71772f0.A00(r02);
        this.A0W = DbS.A0y();
        this.A0X = AnonymousClass0eN.A01(new MJ0(this, 43));
        boolean A1b = G9t.A1b(this.A0Y);
        Application A0A2 = JTP.A0A(activity);
        if (A1b) {
            A0L2 = JTO.A0L(r0, r9);
        } else {
            r0 = new AnonymousClass8N1(A0A2, userSession);
            A0L2 = JTO.A0L(r0, fragment);
        }
        this.A0S = A0L2.A00(AnonymousClass8N2.class);
        this.A0Q = JTO.A0L(new C61524KBd(C288015bE.A00(250.0f, 250.0f)), fragment).A00(C53037GhT.class);
        this.A0G = 360;
        this.A0H = 512;
        this.A0a = AnonymousClass1YB.A00(new MJ0(this, 49));
        this.A0Z = AnonymousClass1YB.A00(new MJ0(this, 48));
        this.A0U = "cutout_sticker_creation";
    }
}
